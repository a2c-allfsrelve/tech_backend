
--�e�[�u���쐬
create table m_user(
 user_id int not null AUTO_INCREMENT comment 'ID', 
 name varchar not null comment '���O',
 mail_address varchar not null comment '���A�h',
 password varchar not null comment '�p�X���[�h',
 delete_flag int comment '�폜�t���O', 
 constraint m_user_PKC primary key (user_id)
 );


create table t_post(
    post_id int not null AUTO_INCREMENT comment '���eID', 
    user_id int not null comment '���e���[�UID' ,
    post varchar(256) not null comment '���e',
    delete_flag int comment '�폜�t���O',
    constraint t_post_PKC primary key (post_id)
);


-- �_�~�[�f�[�^
insert into 
m_user(name, mail_address, delete_flag)
values
('�쌴����̂���', 'popopo@gmamama.dom', 0),
('���c�l�l', 'popfdas@gmamama.dom', 0),
('�����}�T�I', 'popgafgopo@gmamama.dom', 0),
('���ԃg�I��', 'paaaopopo@gmamama.dom', 0),
('B', 'popogfgsdagpo@gmamama.dom', 0);

insert into
t_posts(user_id, post, delete_flag)
values
('1', '�f�X�E�₫����', 0),
('5', '��̒��ɐ΂�', 0),
('3', '�M���̃n�T�E�F�C�������납�����ł��B', 0),
('1', '�҂���ł���', 0),
('4', '�f�X�E�₫����', null),
('3', '�����������ă��L�����Ƃ܂��', 0),
('1', '�f�X�E�₫����', 0),
('2', '�f�X�E�₫����', 0),
('3', '�C�{�R�������ׂ̎w�ɂ�������Ēɂ�����', null),
('4', '�f�X�E�₫����', null);






-- �N�G����F���e�擾
select name, post 
from m_user
inner join t_posts using(user_id)
order by post_id
; 
