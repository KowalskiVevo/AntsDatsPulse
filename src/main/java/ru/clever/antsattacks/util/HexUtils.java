package ru.clever.antsattacks.util;

import org.springframework.stereotype.Component;

@Component
public class HexUtils {
  private static final double SIZE = 30; // радиус гекса

  // Возвращает координаты полигональных вершин гекса для SVG
  public static String getHexPoints(int q, int r) {
    double centerX = getHexCenterX(q, r);
    double centerY = getHexCenterY(q, r);

    StringBuilder points = new StringBuilder();
    for (int i = 0; i < 6; i++) {
      double angle = Math.PI / 3 * i; // 60 градусов
      double x = centerX + SIZE * Math.cos(angle);
      double y = centerY + SIZE * Math.sin(angle);
      points.append(x).append(",").append(y).append(" ");
    }
    return points.toString().trim();
  }

  // Центр гекса X по axial координатам
  public static double getHexCenterX(int q, int r) {
    return SIZE * Math.sqrt(3) * (q + r / 2.0);
  }

  // Центр гекса Y по axial координатам
  public static double getHexCenterY(int q, int r) {
    return SIZE * 3/2 * r;
  }
}
