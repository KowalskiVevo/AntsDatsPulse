package ru.clever.antsattacks.model;

import java.util.List;
import lombok.Data;

/**
 * type:
 *  0 - разведчик
 *  1 - воин
 *  2 - работяга
 */
@Data
public class MapDto {
  private List<Ants> ants;
  private List<Enemies> enemies;
  private List<Food> food;
  private List<Hex> home;
  private List<Map> map;
  private Integer nextTurnIn;
  private Integer score;
  private Hex spot;
  private Integer turnNo;

  @Data
  public static class Ants {
    private Food food;
    private Integer health;
    private String id;
    private Hex lastAttack;
    private String lastEnemyAnt;
    private List<Hex> lastMove;
    private List<Hex> move;
    private Integer q;
    private Integer r;
    private Integer type;
  }

  @Data
  public static class Enemies {
    private Integer attack;
    private Food food;
    private Integer health;
    private Integer q;
    private Integer r;
    private Integer type;
  }

  @Data
  public static class Food {
    private Integer amount;
    private Integer q;
    private Integer r;
    private Integer type;
  }

  @Data
  public static class Hex {
    private Integer q;
    private Integer r;
  }

  @Data
  public static class Map {
    private Integer cost;
    private Integer q;
    private Integer r;
    private Integer type;
  }
}
