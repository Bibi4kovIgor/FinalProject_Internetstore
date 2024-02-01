create extension if not exists "uuid-ossp";

create table if not exists products (
    id uuid default uuid_generate_v4(),
    name varchar not null,
    vendor_code varchar unique not null,
    quantity double precision DEFAULT 1.0,
    availability boolean DEFAULT FALSE,
    price numeric not null,
    description varchar,
    primary key (id)
);

create table if not exists categories (
    id uuid default uuid_generate_v4(),
    name varchar not null,
    description varchar not null,
    primary key (id)
);

create table if not exists products_categories (
    category_id uuid not null,
    product_id uuid not null,
    primary key (category_id, product_id),
    foreign key(category_id) references categories(id),
    foreign key(product_id) references products(id)
);