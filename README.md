# SpringBoot

------------------------------
GET ALL USER + PAGING : DESIGN REST API
------------------------------
http://localhost:8080/users/1
GET /users

page=1
item_per_page=10

GET /users?page=2&item_per_page=10
GET /users?page=2
GET /users?item_per_page=10
[
	{
		"id": 1,
		"name": "User 1"
	}
]
