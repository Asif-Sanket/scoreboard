# Cricket Scoreboard App
This app will allow the user to score a match through command line

Here is an existing Javascript project for the same
```
https://github.com/ryansmith94/Scorebook
```

## Player
A player must have the following fields
- Name
- Is Injured

## Batsman
This should extend the Player class
Batsman should have the following fields
- runs
- fours
- sixes
- singles
- doubles
- triples
- balls

This should have the following methods
- Add a ball
    - When the batsman plays the ball, the relevant actions should hapen in terms of tracking his score and balls
- Celebrate milestones
    - When the batsman hits 50, 100, 150, 200 etc, we should celebrate their acheivement


## Bowling
This should extend the Player class
Bowler should have the following fields
- runs
- wickets
- balls
- overs
- maidens
- extras

This should have the following methods
- Add a ball
- Celebrations milestones
    - Hatrick
    - 5 wicket hall
    - Maiden
    - Getting someone out

## Wicket
This class should contain information about the wicket
fields required
- Batsman
- Wicket Type (How Out)
- Bowler
- Fielder (if required)
- Fall Of Wicket


## Team
This class chould contain all information about the team
Fields required
- Name
- Players
- Home Venue
