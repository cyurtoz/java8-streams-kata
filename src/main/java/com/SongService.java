package com;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class SongService {

    private final List<Album> albums;

    public SongService(List<Album> albums) {
        this.albums = albums;
    }

    public Optional<Album> findAlbumByName(String name) {
        return null;
    }

    public List<Album> findAlbumsByYear(int year) {
        return null;
    }

    public List<Album> findAlbumsByGenre(AlbumGenre genre) {
        return null;
    }

    public int totalNumberOfSongsInAlbum(String albumName) {
        return 0;
    }

    public Album findNewestAlbum() {
        return null;
    }

    public Album findOldestAlbum() {
        return null;
    }

    public int totalNumberOfBands() {
        return 0;
    }

    public Optional<Song> findSongByName(String name) {
        return null;
    }

    public Song longestSong() {
        return null;
    }

    public int totalNumberOfSongsByBand(String bandName) {
        return 0;
    }

    public List<Song> listAllSongsWrittenAfterYear(int year) {
        return null;
    }

    public Optional<Integer> totalSecondsOfASong(String songName) {
        return null;
    }

    public Optional<Integer> totalSecondsOfAlbum(String albumName) {
        return null;
    }

    public List<Song> allSongsLongerThan(int minutes, int seconds) {
        return null;
    }

    public Album albumWithMostNumberOfSongs() {
        return null;
    }

    public Band bandWithMostNumberOfSongs() {
        return null;
    }

    public List<Song> topNLongestMetalSongs(int n) {
        return null;
    }

    public Map<Band, List<Song>> songsByBands() {
        return null;
    }

    public List<Band> bandsWithAlbumsInDifferentGenres() {
        return null;
    }

    public List<Band> createRandomPlaylistWithNSongs(int n) {
        return null;
    }

    public List<Song> findCoveredSongs(List<String> likedSongs, int n) {
        return null;
    }

    public List<Song> recommend(List<String> likedSongs, int n) {
        return null;
    }
}
