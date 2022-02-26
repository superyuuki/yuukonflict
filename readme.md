# YuuKonflict
> Gamemodes for superyuuki server

# Spec
Features define a gamemode

A phase is a list of features

A game is a volatile phase

* Game starts
  * Phase 1 starts
    1. Feature A
    2. Feature B
    
    Effects
      * Feature A and B receive GameStart, PhaseStart (1), ToggleOn
  * Phase 2 starts
    1. Feature A
    
    Effects
      * Feature A and B receive PhaseStop (1)
      * Feature A receives PhaseStart (2)
      * Feature B receives ToggleOff
  
  * Phase 3 starts
    1. Feature C
    
    Effects
      * Feature A and C receive PhaseStop (2)
      * Feature C receives PhaseStart (3)
      * Feature A receives ToggleOff
* Game ends
  
  Effects
  * Feature C receives PhaseStop (3), ToggleOff, GameStop

Features should be constructed per phase
    
# Questions

- Where do maps exist