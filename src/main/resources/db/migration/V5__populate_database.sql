INSERT INTO categories (name)
VALUES ('Fruits'),
       ('Vegetables'),
       ('Dairy'),
       ('Bakery'),
       ('Meat'),
       ('Beverages'),
       ('Snacks'),
       ('Frozen Foods');

INSERT INTO products (name, price, description, category_id)
VALUES ('Banana', 1.20, 'Fresh Cavendish bananas, sold per pound.', 1),
       ('Apple', 2.50, 'Crisp Fuji apples, rich in flavor and vitamins.', 1),
       ('Carrot', 1.80, 'Organic orange carrots, crunchy and sweet.', 2),
       ('Broccoli', 2.20, 'Fresh green broccoli, great for steaming.', 2),
       ('Whole Milk', 3.50, '1 gallon of whole milk, vitamin D enriched.', 3),
       ('Cheddar Cheese', 4.99, 'Sharp cheddar cheese block, 8oz.', 3),
       ('Sourdough Bread', 3.99, 'Artisan sourdough loaf, baked fresh daily.', 4),
       ('Chicken Breast', 7.99, 'Boneless skinless chicken breasts, 1lb pack.', 5),
       ('Orange Juice', 5.49, '100% pure squeezed orange juice, 1L carton.', 6),
       ('Potato Chips', 2.99, 'Classic salted potato chips, family size bag.', 7);
