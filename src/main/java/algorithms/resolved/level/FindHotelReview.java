package algorithms.resolved.level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindHotelReview {

	public static void main(String[] args) {

	}

	/**
	 * Given a set of hotels and its guests reviews. Sort the hotels based on a list
	 * of words specified by a user. The criteria to sort the hotels should be how
	 * many times the words specified by the user is mentioned in the hotel reviews.
	 *
	 * Input
	 *
	 * - Set of words which we want to find in the hotel reviews - List of hotels
	 * each element contains list of reviews
	 *
	 * Output
	 *
	 * A list of hotel IDs sorted in the descending order by how many mentions they
	 * have of the words specified in the input
	 *
	 * Notes: - Words are always single words without spaces. Never like 'swimming
	 * pool' - HotelID is integer - Words match should be case insensitive - Dots
	 * and commas should be ignored - If the word appears in the review twice, it
	 * should be counted twice - If two hotels have the same number of words they
	 * should be sorted by ID asc otherwise Count desc - Consider revisiting time
	 * complexity
	 *
	 * Created by iurii.dziuban on 07/06/2017.
	 */
	public class SortHotelsList {

		public List<Integer> sort_hotels(String keywords, List<Integer> hotel_ids, List<String> reviews) {
			Set<String> keywordsSet = Arrays.stream(keywords.split(" ")).map(String::toLowerCase)
					.collect(Collectors.toSet());
			Map<Integer, Long> idsToCount = new HashMap<>();
			for (int i = 0; i < hotel_ids.size(); i++) {
				long count = Arrays.stream(reviews.get(i).split(" ")).map(word -> word.replaceAll("[.,]", ""))
						.map(String::toLowerCase).filter(keywordsSet::contains).count();
				idsToCount.put(hotel_ids.get(i), idsToCount.getOrDefault(hotel_ids.get(i), 0L) + count);
			}
			List<HotelRating> hotelRatings = new ArrayList<>();
			for (Map.Entry<Integer, Long> entry : idsToCount.entrySet()) {
				hotelRatings.add(new HotelRating(entry.getKey(), entry.getValue()));
			}
			Collections.sort(hotelRatings);
			return hotelRatings.stream().map((HotelRating::getId)).collect(Collectors.toList());
		}

		/**
		 * Implementation should be the most efficient. So couple insights: 1) There are
		 * no Tuples in java, so new Classes instead of Spark or Scala Tuples are a
		 * need. 2) Because Tuples are absent stream can not be done on a couple of
		 * values. That is why inside hotel stream there is a reviews stream. We can not
		 * do on both 3) in case of word matching it is better to do streaming on bigger
		 * collection: assuming that there will be much more reviews than words. (one
		 * stream operation is smaller). 4) Parallel Stream is used assuming that number
		 * of hotels and/or words in reviews are pretty big. Potentially, multithreading
		 * can be reused. 5) Methods to accumulate stream object into collection should
		 * be only in the end. Collecting stream object in the middle can drive to more
		 * CPU and memory overhead.
		 */
		public List<HotelRating> getSortedHotelIdNumberOfWords(Set<String> wordsLowercase, List<Hotel> hotelReviews) {
			return hotelReviews.stream().map(hotel -> {
				long wordsMatchedCount = hotel.getReviews().stream()
						.flatMap(review -> Arrays.stream(review.split(" "))).map(word -> word.replaceAll("[.,]", ""))
						.filter(word -> wordsLowercase.contains(word.toLowerCase())).count();
				return new HotelRating(hotel.getId(), wordsMatchedCount);
			}).sorted().collect(Collectors.toList());
		}

		// input data structure
		public class Hotel {
			private final int id;
			private final List<String> reviews;

			public Hotel(int id, List<String> reviews) {
				this.id = id;
				this.reviews = reviews;
			}

			public int getId() {
				return id;
			}

			public List<String> getReviews() {
				return reviews;
			}
		}

	}

	// output result class with sorting possibility
	public class HotelRating implements Comparable<HotelRating> {
		private final int id;
		private final long count;

		public HotelRating(int id, long count) {
			this.id = id;
			this.count = count;
		}

		public int getId() {
			return id;
		}

		public long getCount() {
			return count;
		}

		@Override
		public int compareTo(HotelRating o) {
			// assume null not possible
			if (o.count - count != 0) {
				return o.count - count > 0 ? 1 : -1;
			}
			return id - o.id;
		}
	}
}