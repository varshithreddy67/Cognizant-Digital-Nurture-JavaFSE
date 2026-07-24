import React, { Component } from 'react';
import Cart from './Cart';

class OnlineShopping extends Component {

    items = [

        { itemName: "Laptop", price: 65000 },
        { itemName: "Mobile", price: 25000 },
        { itemName: "Headphones", price: 3000 },
        { itemName: "Keyboard", price: 1500 },
        { itemName: "Mouse", price: 800 }

    ];

    render() {

        return (

            <div>

                <h1>Online Shopping Cart</h1>

                {

                    this.items.map((item, index) => (

                        <Cart
                            key={index}
                            itemName={item.itemName}
                            price={item.price}
                        />

                    ))

                }

            </div>

        );

    }

}

export default OnlineShopping;