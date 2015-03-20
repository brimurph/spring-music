-- =================================================================================================
--
-- Sample data set
--
-- =================================================================================================

insert into artist (name) values ('Led Zeppelin');

insert into album (name) values ('Led Zeppelin IV');

insert into album_artists (album_id, artists_id) values (1, 1);

insert into track (name, duration, album_id) values ('Black Dog', '294000', 1);
insert into track (name, duration, album_id) values ('Rock And Roll', '21900', 1);
insert into track (name, duration, album_id) values ('The Battle Of Evermore', '351000', 1);
insert into track (name, duration, album_id) values ('Stairway To Heaven', '478000', 1);
insert into track (name, duration, album_id) values ('Misty Mountain Hop', '278000', 1);
insert into track (name, duration, album_id) values ('Four Sticks', '284000', 1);
insert into track (name, duration, album_id) values ('Going To California', '211000', 1);
insert into track (name, duration, album_id) values ('When The Levee Breaks', '427000', 1);

insert into track_artists (track_id, artists_id) values (1, 1);
insert into track_artists (track_id, artists_id) values (2, 1);
insert into track_artists (track_id, artists_id) values (3, 1);
insert into track_artists (track_id, artists_id) values (4, 1);
insert into track_artists (track_id, artists_id) values (5, 1);
insert into track_artists (track_id, artists_id) values (6, 1);
insert into track_artists (track_id, artists_id) values (7, 1);

insert into member (name) values ('Brian Murphy');
insert into member (name) values ('Paul Fisher');

insert into playlist (name, member_id) values ('Classic Rock', 1);