--A5のツールでこのクエリを全部流してくれ


--テーブル作成
create table m_user(
 user_id int not null AUTO_INCREMENT comment 'ID',
 name varchar not null comment '名前',
 mail_address varchar not null comment 'メアド',
 password varchar not null comment 'パスワード',
 delete_flag int comment '削除フラグ',
 constraint m_user_PKC primary key (user_id)
 );


create table t_post(
    post_id int not null AUTO_INCREMENT comment '投稿ID',
    user_id int not null comment '投稿ユーザID' ,
    post varchar(256) not null comment '投稿',
    delete_flag int comment '削除フラグ',
    constraint t_post_PKC primary key (post_id)
);


-- ダミーデータ
insert into
m_user(name, mail_address, delete_flag)
values
('野原しんのすけ', 'popopo@gmamama.dom', 0),
('桜田ネネ', 'popfdas@gmamama.dom', 0),
('佐藤マサオ', 'popgafgopo@gmamama.dom', 0),
('風間トオル', 'paaaopopo@gmamama.dom', 0),
('B', 'popogfgsdagpo@gmamama.dom', 0);

insert into
t_posts(user_id, post, delete_flag)
values
('1', '家系ラーメンとコーヒーで胃もたれした。', 0),
('5', 'オブジェクト指向マジわからん。', 0),
('3', '閃光のハサウェイおもしろかったです。', 0),
('1', 'ぴえんである', 0),
('4', 'イボコロリが隣の指についちゃって痛すぎる', null),
('3', '今日暑すぎてワキ汗がとまらん', 0),
('1', '夏は着替えが癖になるから、たまに外で脱ぎそうになる。', 0),
('2', 'プレモル売ってないとかスーパー失格だろ。', 0),
('3', 'イボコロリが隣の指についちゃって痛すぎる', null),
('4', 'デス・やきそば', null);






-- クエリ例：投稿取得
select name, post
from m_user
inner join t_posts using(user_id)
order by post_id
;