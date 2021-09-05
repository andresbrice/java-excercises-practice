"use strict";

let song;
let longer = 0;
let totalHour = 0;
let longerDuration = [];
const list = [];
let authorRepeated = [];
let repeated = 0;

class Song {
  constructor(title, author, duration, genre) {
    this._title = title;
    this._author = author;
    this._duration = duration;
    this._genre = genre;
  }

  get title() {
    return this._title;
  }

  get author() {
    return this._author;
  }

  get duration() {
    return this._duration;
  }

  get genre() {
    return this._genre;
  }
}

createSong("Cancion 1", "Avicii", "120", "Electronica");
createSong("Cancion 2", "Dero", "65", "Electronica");
createSong("Cancion 3", "La Renga", "300", "Rock");
createSong("Cancion 4", "La Renga", "300", "Rock");
createSong("Cancion 5", "La Renga", "300", "Rock");
createSong("Cancion 4", "SOJA", "450", "Reggae");
createSong("Cancion 5", "SOJA", "350", "Reggae");
createSong("Cancion 3", "La Renga", "300", "Rock");
createSong("Cancion 4", "La Renga", "300", "Rock");
createSong("Cancion 5", "La Renga", "300", "Rock");

function createSong(title, author, duration, genre) {
  song = new Song(title, author, duration, genre);
  addSongToLibrary(song);
}

function addSongToLibrary(song) {
  list.push(song);
}

function longerSong(list) {
  for (let i = 0; i < list.length; i++) {
    if (parseInt(list[i].duration) > longer) {
      longer = parseInt(list[i].duration);
      longerDuration = list[i];
    }
  }
  return longerDuration;
}

function totalMusicHours(list) {
  for (let i = 0; i < list.length; i++) {
    totalHour += parseInt(list[i].duration);
  }
  return totalHour;
}

function mostSongsByAuthor(list) {
  for (let i = 0; i < list.length; i++) {
    if (list[i].author === list[i + 1].author) {
      authorRepeated[i];
    }
  }
  return `Usted posee más canciones del autor:${sameauthor}`;
}
