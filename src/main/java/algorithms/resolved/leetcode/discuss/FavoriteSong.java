package algorithms.resolved.leetcode.discuss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * invert map: song -> genre groupby: user -> [genre, [song]] count: user ->
 * [genre, count] select having=max: user -> [genre]
 * 
 * 
 */
public class FavoriteSong {
    Map<String, List<String>> favoriteGenre(Map<String, List<String>> userSongs, Map<String, List<String>> songGenres) {
        Map<String, String> songToGenre = new HashMap<>();
        songGenres.forEach((genre, songs) -> songs.forEach(song -> songToGenre.put(song, genre)));
        Map<String, List<String>> favoriteGenre = new HashMap<>();
        userSongs.forEach((user, songs) -> favoriteGenre.put(user, calculateFavoriteGenre(songs, songToGenre)));
        return favoriteGenre;
    }

    private List<String> calculateFavoriteGenre(List<String> songs, Map<String, String> songToGenre) {
        Map<String, Integer> genreFrequency = new HashMap<>();
        List<String> favoriteGenre = new ArrayList<>();
        int maxFrequency = 0;
        for (String song : songs) {
            String genre = songToGenre.get(song);
            Integer frequency = genreFrequency.merge(genre, 1, (ov, nv) -> ov + 1);
            maxFrequency = Math.max(frequency, maxFrequency);
        }
        for (Map.Entry<String, Integer> entry : genreFrequency.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                favoriteGenre.add(entry.getKey());
            }
        }
        return favoriteGenre;
    }

    public static void main(String[] args) {
        Map<String, List<String>> userSongs = new HashMap<>();
        userSongs.put("David", Arrays.asList("song1", "song2", "song3", "song4", "song8"));
        userSongs.put("Ema", Arrays.asList("song5", "song6", "song7"));

        Map<String, List<String>> songGenres = new HashMap<>();
        songGenres.put("Rock", Arrays.asList("song1", "song3"));
        songGenres.put("Dubstep", Arrays.asList("song7"));
        songGenres.put("Techno", Arrays.asList("song2", "song4"));
        songGenres.put("Pop", Arrays.asList("song5", "song6"));
        songGenres.put("Jazz", Arrays.asList("song8", "song9"));

        Map<String, List<String>> result = new FavoriteSong().favoriteGenre(userSongs, songGenres);
        for (String key : result.keySet()) {
            System.out.print("##################################");
            System.out.println(key);
            result.get(key).forEach(System.out::print);
            System.out.println();

        }
    }

}