import React, { Component } from 'react';

class Cart extends Component {

    render() {

        return (

            <div>

                <h3>{this.props.itemName}</h3>

                <p>Price : ₹{this.props.price}</p>

                <hr />

            </div>

        );

    }

}

export default Cart;