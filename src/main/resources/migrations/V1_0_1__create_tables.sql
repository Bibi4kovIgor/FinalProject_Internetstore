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

create table if not exists documents (
   id uuid default uuid_generate_v4(),
   tax_id bigint unique not null,
   passport varchar not null,
   additional_info varchar,
   primary key (id)
);

create table if not exists clients (
    id uuid default uuid_generate_v4 (),
    first_name varchar not null,
    last_name varchar not null,
    phone varchar not null,

--  timestamp means that date will be converted to milliseconds
--  it store milliseconds count from January 1, 1970 to given data
    birth_date timestamp with time zone,

    login varchar not null,
    email varchar not null,
    password varchar not null,
    document_id uuid,
    primary key (id),
    foreign key(document_id) references documents(id)
);

create table if not exists orders (
    client_id uuid not null,
    product_id uuid not null,
    quantity integer DEFAULT 1,
    order_date timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    primary key (client_id, product_id, order_date),
    foreign key(client_id) references clients(id),
    foreign key(product_id) references products(id)
);

