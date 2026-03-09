User
- user_id(pk) INT
- name VARCHAR(50) NOT NULL UNIQUE
- password varchar(25) NOT NULL
- role: DEFAULT CUSTOMER  NOT NULL
- create_time     DATETIME NOT NULL
- update_time     DATETIME NOT NULL

Order
- order_id(pk) bigint
- user_id(fk) int
- status varchar(20)
- total_price decimal(10,2)
- create_time DATETIME
- update_time DATETIME

Product
- product_id(pk) int
- price decimal(10,2) NOT NULL
- stock int NOT NULL
- status varchar(20) NOT NULL
- create_time     DATETIME NOT NULL
- update_time     DATETIME NOT NULL

Order_Item
- id bigint
- product_id(fk) int
- order_id(fk) bigint
- quantity int
- create_time DATETIME

Order.status
- PENDING
- CREATED
- CANCELED订单被取消
- COMPLETED订单完成
- FAILED

Product.status
- ON_SALE
- OFF_SHELF

User.role
- CUSTOMER
- OWNER

