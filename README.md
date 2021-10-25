# Hotel-management-system
The hotel management system is a software or platform that can improve the efficiency of hotel management. This system supports any browser for access.  This system contains 12 functions to serve customers and employees.  The functions are: search；log；login/ reg;admin managment;room managment;menu managment;order;cookie;order limite;orderdate;payment;historypayment.Because it is web development, we use a relatively stable MVC architecture for development. First, the data storage uses mysql, which encapsulates each entity, connects to the server, and reacts to the display through the servlet. We construct functions by acting as stakeholders and think of ways to achieve it.

search -haidi
log-haidi
login/ reg-zhenxin
admin managment-zhenxin
room managment-yixiao
menu managment-yixiao
order - tiancheng
cookie-tiancheng
order limite-junfeng
orderdate-junfeng
payment -ruihui
historypayment-ruihui





login/reg - Zhengxin Cheng - 


This function allows customers and employees to log in to the system, and can also create accounts in the system.  In creating an account, the system will ask for the account type as customer or employee.In the login page,each function has software verification. If there is no input, there will be a prompt, and if the input is repeated or wrong, there will be a prompt. This development uses a local database, so after each creation, it will be automatically stored in the local database
-----------------------------------

Payment/historypayment - Ruihui Lai - 


This function allows customers to pay in the selected order to complete the order.  In addition, customers can select payment types in the payment system.  After the customer completes the payment, the system will update the order status.On the payment page, I added the payment method and the number of payments. The payment method is cash or bank card. And there is also input verification here. If the card number or other value is not entered, the system will pop up a reminder. And there is an editing function that can delete and feedback orders.
-----------------------------------

Order/cookie - Tiancheng Fu - 


This function allows customers to manage the order status of this account, and the order system will allow customers to modify and delete orders.  At the same time, after the order is modified, the customer will receive an email notification.In the order page, I added an edit order, and the user can change the order information and delete the order. In addition, input verification is set. For example, if the user does not enter the quantity, the order will not be generated, and the system will automatically pop up a prompt page. And I also added an order history so that customers can see how many orders they have before.Of course, the cookie of the whole program is also added by me, so that in the input field, the previous record will automatically pop up
-----------------------------------

Logs/search - Haidi Huang - 


This function will record the login status and time of the account.I added the log function of the entire program, and added these log records on each management page. These records will record the user's login time each time. I also added a search function to the entire program so that as long as the data exists in the table, it can be searched for the first time.
-----------------------------------

room managment/ menu managment- Yixiao Zhang -


In this development, I developed a room management system and a menu management system. In the room management page, I added the editing function, and every time I add a room, the customer’s room page can also be updated in time, and I added the real-time synchronization function, the number of each room is limited, the customer Every time a hotel is booked, the number of rooms will be reduced by one. Of course, employees also have editing functions and can add the number of rooms at any time. Compared with room management, the function of restaurant management is mainly to record the daily menu. Employees can update the menu according to the quantity purchased on the day to ensure that the daily menu is different. Of course, I also set up data verification, if all the data is not available If it is full, the data will not be saved.
-----------------------------------

order limite/orderdate- Junfeng Chen - 


Here I set the order limit. For example, if the number of rooms is 0, I will not be able to book this room, and more, if the room is wrong, I will not be able to book. On the other hand, I added order time so that users can observe the time of the order at any time.
-----------------------------------


Configuration (jdk1.8; toncat8.5 for server; mysql)
