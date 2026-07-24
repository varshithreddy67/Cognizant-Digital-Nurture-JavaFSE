import React from 'react';

function IndianPlayers() {

    const team = [
        "Virat",
        "Rohit",
        "Gill",
        "KL Rahul",
        "Hardik",
        "Jadeja"
    ];

    // Destructuring
    const [odd1, even1, odd2, even2, odd3, even3] = team;

    // Two Arrays
    const T20Players = [
        "Virat",
        "Rohit",
        "Surya"
    ];

    const RanjiPlayers = [
        "Pujara",
        "Rahane",
        "Iyer"
    ];

    // Merge Arrays
    const mergedPlayers = [
        ...T20Players,
        ...RanjiPlayers
    ];

    return (

        <div>

            <h2>Indian Players</h2>

            <h3>Odd Team Players</h3>

            <ul>
                <li>{odd1}</li>
                <li>{odd2}</li>
                <li>{odd3}</li>
            </ul>

            <h3>Even Team Players</h3>

            <ul>
                <li>{even1}</li>
                <li>{even2}</li>
                <li>{even3}</li>
            </ul>

            <h3>Merged Players</h3>

            <ul>

                {
                    mergedPlayers.map((player, index) => (

                        <li key={index}>
                            {player}
                        </li>

                    ))
                }

            </ul>

        </div>

    );

}

export default IndianPlayers;