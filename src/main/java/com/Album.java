package com;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
class Album {
    int year;
    List<Song> songs;
    AlbumGenre genre;
    String name;
    Band band;
}