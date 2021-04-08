# Java8 Streams Kata
- Albums have songs.
- Songs have name and durations.
- An album has a band - the band that created the album.
- A band has a name and keeps a reference to similar bands.

`class Album {
    int year;
    List<Song> songs;
    AlbumGenre genre;
    String name;
    Band band;
}`

`class Song {
    int minutes;
    int seconds;
    String name;
}`

`class Band {
    String name;
    List<Band> similarBands;
}`
