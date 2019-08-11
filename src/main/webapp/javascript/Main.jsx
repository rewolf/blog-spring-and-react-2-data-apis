import React, { Component } from "react";
import ReactDOM from 'react-dom';
import FriendList from './FriendList';
import '../css/Main.css';

class Main extends Component {
    constructor(props) {
        super(props)
        this.state = {
            friends: []
        }
    }

    componentDidMount() {
        fetch("/api/friends")
            .then(res => res.json())
            .then(
                (response) => {
                    this.setState({
                        friends: response
                    });
                },
                (error) => {
                    alert(error);
                }
            )
    }

    render() {
        return (
            <div id="main">
                <h1>My Best Friends</h1>
                <FriendList friends={this.state.friends}/>
            </div>
        );
    }
}

ReactDOM.render(
    <Main />,
    document.getElementById('react-mountpoint')
);
