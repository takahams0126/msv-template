-- テストデータをクリアするDELETE分を最初に必ず書くこと
DELETE FROM msv_user where id in (1, 2);

INSERT INTO msv_user (id, name, created_at, updated_at) VALUES(1, 'Bob', '2020-03-5 00:00:01', '2020-03-5 00:00:01');
INSERT INTO msv_user (id, name, created_at, updated_at) VALUES(2, 'Nancyi', '2020-03-6 00:00:01', '2020-03-6 00:00:01');

