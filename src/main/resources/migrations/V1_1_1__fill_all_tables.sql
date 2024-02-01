-- categories
insert into categories(name, description) values
('electronics', 'radioelectronics equipment'),
('household', 'different household stuff'),
('food', 'food and drincs'),
('toys', 'All you need for children'),
('appliances', 'other stuffs');

-- products
insert into products(vendor_code, name, description, availability, price, quantity) values
('V157898556', 'Laptop', 'Some powerful laptop', true, 15547.15, 10),
('R178885426', 'Personal Computer', 'Some powerful PC', true, 10854.15, 12),
('SP58898556', 'Hoover', 'Some good hoover', true, 6547.0, 45),
('RR78954726', 'Fridge', 'Some cheap fridge', true, 12854.55, 11),
('TT85471169', 'Juice', 'Orange juice', true, 50.5, 4),
('BB98456638', 'Bread', 'wheat bread', true, 25.7, 77);

--create function for getting data from bounded tables
CREATE OR REPLACE FUNCTION get_id_from_table(element_number integer, table_name regclass)
RETURNS uuid AS $$
DECLARE result_id uuid;
BEGIN
    EXECUTE format('SELECT (SELECT id FROM %s LIMIT 1 OFFSET $1)::uuid', table_name)
      INTO result_id
      USING element_number;

    RETURN result_id;
END;
$$ LANGUAGE plpgsql IMMUTABLE;

-- products_categories
insert into products_categories(product_id, category_id) values
((SELECT * FROM get_id_from_table(0, 'products')), (SELECT * FROM get_id_from_table(0, 'categories'))),
((SELECT * FROM get_id_from_table(1, 'products')), (SELECT * FROM get_id_from_table(1, 'categories'))),
((SELECT * FROM get_id_from_table(2, 'products')), (SELECT * FROM get_id_from_table(2, 'categories'))),
((SELECT * FROM get_id_from_table(3, 'products')), (SELECT * FROM get_id_from_table(3, 'categories'))),
((SELECT * FROM get_id_from_table(4, 'products')), (SELECT * FROM get_id_from_table(4, 'categories'))),
((SELECT * FROM get_id_from_table(5, 'products')), (SELECT * FROM get_id_from_table(3, 'categories')));