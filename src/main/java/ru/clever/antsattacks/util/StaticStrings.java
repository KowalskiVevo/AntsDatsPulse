package ru.clever.antsattacks.util;

public class StaticStrings {
  //            "q": -53,
  //            "r": -102,
  public static final String JSON_TEST = """
      {
        "ants": [
          {
            "q": -53,
            "r": -102,
            "type": 2,
            "health": 80,
            "id": "54a0644d-bc16-466b-ad4b-b5030725f096",
            "food": {
              "type": 1,
              "amount": 10
            }
          },
          {
            "q": -50,
            "r": -100,
            "type": 2,
            "health": 80,
            "id": "43a0644d-bc16-466b-ad4b-b5030725f096",
            "food": {
              "type": 0,
              "amount": 0
            }
          },
          {
            "q": -50,
            "r": -100,
            "type": 0,
            "health": 130,
            "id": "8b768213-ed53-46ed-af6d-bc5659b66282",
            "food": {
              "type": 0,
              "amount": 0
            }
          },
          {
            "q": -50,
            "r": -100,
            "type": 1,
            "health": 180,
            "id": "aba21bff-c585-4458-8d9a-c782672ddf45",
            "food": {
              "type": 0,
              "amount": 0
            }
          }
        ],
        "enemies": [
          {
            "q": -50,
            "r": -103,
            "type": 2,
            "health": 60,
            "food": {
              "type": 0,
              "amount": 0
            }
          }
        ],
        "map": [
          {
            "q": -53,
            "r": -96,
            "cost": 1,
            "type": 5
          },
          {
            "q": -36,
            "r": -90,
            "cost": 1,
            "type": 3
          },
          {
            "q": -50,
            "r": -102,
            "cost": 1,
            "type": 2
          },
          {
            "q": -52,
            "r": -101,
            "cost": 1,
            "type": 2
          },
          {
            "q": -47,
            "r": -99,
            "cost": 1,
            "type": 3
          },
          {
            "q": -52,
            "r": -103,
            "cost": 1,
            "type": 2
          },
          {
            "q": -48,
            "r": -100,
            "cost": 1,
            "type": 2
          },
          {
            "q": -48,
            "r": -102,
            "cost": 1,
            "type": 2
          },
          {
            "q": -50,
            "r": -104,
            "cost": 1,
            "type": 2
          },
          {
            "q": -51,
            "r": -100,
            "cost": 1,
            "type": 2
          },
          {
            "q": -53,
            "r": -97,
            "cost": 1,
            "type": 2
          },
          {
            "q": -48,
            "r": -97,
            "cost": 1,
            "type": 3
          },
          {
            "q": -50,
            "r": -100,
            "cost": 1,
            "type": 1
          },
          {
            "q": -50,
            "r": -99,
            "cost": 1,
            "type": 2
          },
          {
            "q": -51,
            "r": -97,
            "cost": 1,
            "type": 2
          },
          {
            "q": -53,
            "r": -102,
            "cost": 1,
            "type": 3
          },
          {
            "q": -46,
            "r": -100,
            "cost": 1,
            "type": 2
          },
          {
            "q": -51,
            "r": -104,
            "cost": 1,
            "type": 2
          },
          {
            "q": -51,
            "r": -98,
            "cost": 1,
            "type": 2
          },
          {
            "q": -49,
            "r": -101,
            "cost": 1,
            "type": 2
          },
          {
            "q": -49,
            "r": -96,
            "cost": 1,
            "type": 2
          },
          {
            "q": -51,
            "r": -102,
            "cost": 1,
            "type": 2
          },
          {
            "q": -54,
            "r": -100,
            "cost": 1,
            "type": 2
          },
          {
            "q": -51,
            "r": -99,
            "cost": 1,
            "type": 2
          },
          {
            "q": -50,
            "r": -101,
            "cost": 1,
            "type": 1
          },
          {
            "q": -50,
            "r": -98,
            "cost": 1,
            "type": 2
          },
          {
            "q": -54,
            "r": -101,
            "cost": 1,
            "type": 2
          },
          {
            "q": -51,
            "r": -101,
            "cost": 1,
            "type": 1
          },
          {
            "q": -49,
            "r": -102,
            "cost": 1,
            "type": 2
          },
          {
            "q": -49,
            "r": -97,
            "cost": 1,
            "type": 2
          },
          {
            "q": -47,
            "r": -102,
            "cost": 1,
            "type": 2
          },
          {
            "q": -49,
            "r": -104,
            "cost": 1,
            "type": 2
          },
          {
            "q": -48,
            "r": -103,
            "cost": 1,
            "type": 2
          },
          {
            "q": -52,
            "r": -100,
            "cost": 1,
            "type": 2
          },
          {
            "q": -49,
            "r": -99,
            "cost": 1,
            "type": 2
          },
          {
            "q": -51,
            "r": -103,
            "cost": 1,
            "type": 2
          },
          {
            "q": -51,
            "r": -96,
            "cost": 1,
            "type": 2
          },
          {
            "q": -52,
            "r": -96,
            "cost": 1,
            "type": 2
          },
          {
            "q": -50,
            "r": -103,
            "cost": 1,
            "type": 2
          },
          {
            "q": -53,
            "r": -98,
            "cost": 1,
            "type": 2
          },
          {
            "q": -50,
            "r": -97,
            "cost": 1,
            "type": 2
          },
          {
            "q": -48,
            "r": -98,
            "cost": 1,
            "type": 2
          },
          {
            "q": -50,
            "r": -96,
            "cost": 1,
            "type": 2
          },
          {
            "q": -48,
            "r": -99,
            "cost": 1,
            "type": 2
          },
          {
            "q": -49,
            "r": -100,
            "cost": 1,
            "type": 2
          },
          {
            "q": -48,
            "r": -96,
            "cost": 1,
            "type": 2
          },
          {
            "q": -53,
            "r": -99,
            "cost": 1,
            "type": 2
          },
          {
            "q": -53,
            "r": -100,
            "cost": 1,
            "type": 2
          },
          {
            "q": -48,
            "r": -101,
            "cost": 1,
            "type": 2
          },
          {
            "q": -52,
            "r": -99,
            "cost": 1,
            "type": 2
          },
          {
            "q": -52,
            "r": -104,
            "cost": 1,
            "type": 2
          },
          {
            "q": -52,
            "r": -102,
            "cost": 1,
            "type": 2
          },
          {
            "q": -48,
            "r": -104,
            "cost": 1,
            "type": 2
          },
          {
            "q": -53,
            "r": -101,
            "cost": 1,
            "type": 2
          },
          {
            "q": -52,
            "r": -97,
            "cost": 1,
            "type": 2
          },
          {
            "q": -54,
            "r": -99,
            "cost": 1,
            "type": 2
          },
          {
            "q": -49,
            "r": -98,
            "cost": 1,
            "type": 2
          },
          {
            "q": -49,
            "r": -103,
            "cost": 1,
            "type": 2
          },
          {
            "q": -47,
            "r": -98,
            "cost": 1,
            "type": 3
          },
          {
            "q": -47,
            "r": -100,
            "cost": 1,
            "type": 2
          },
          {
            "q": -47,
            "r": -101,
            "cost": 1,
            "type": 2
          },
          {
            "q": -52,
            "r": -98,
            "cost": 1,
            "type": 2
          },
          {
            "q": -53,
            "r": -103,
            "cost": 1,
            "type": 2
          }
        ],
        "food": [
          {
            "q": -53,
            "r": -102,
            "type": 2,
            "amount": 15
          },
          {
            "q": -51,
            "r": -104,
            "type": 1,
            "amount": 3
          },
          {
            "q": -49,
            "r": -96,
            "type": 2,
            "amount": 10
          },
          {
            "q": -49,
            "r": -102,
            "type": 1,
            "amount": 7
          },
          {
            "q": -52,
            "r": -100,
            "type": 2,
            "amount": 12
          },
          {
            "q": -49,
            "r": -99,
            "type": 2,
            "amount": 15
          },
          {
            "q": -48,
            "r": -96,
            "type": 1,
            "amount": 2
          },
          {
            "q": -48,
            "r": -101,
            "type": 1,
            "amount": 5
          },
          {
            "q": -52,
            "r": -104,
            "type": 1,
            "amount": 12
          },
          {
            "q": -49,
            "r": -103,
            "type": 2,
            "amount": 3
          }
        ],
        "turnNo": 37,
        "nextTurnIn": 1.689,
        "home": [
          {
            "q": -50,
            "r": -100
          },
          {
            "q": -50,
            "r": -101
          },
          {
            "q": -51,
            "r": -101
          }
        ],
        "score": 0,
        "spot": {
          "q": -50,
          "r": -100
        }
      }
      """;
}
