create table if not exists user_list (
    name varchar not null,
    pass varchar not null,
    role varchar not null,
    primary key(name)
);

insert into user_list (name, pass, role) values
('admin', crypt('admin', gen_salt('bf')), 'ROLE_ADMIN'),
('user', crypt('user', gen_salt('bf')), 'ROLE_USER');