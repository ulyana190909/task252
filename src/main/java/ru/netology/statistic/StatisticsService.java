package ru.netology.statistic;

public class StatisticsService {
  /**
   * Calculate index of max income
   *
   * @param incomes - array of incomes
   * @return - index of first max value
   */

  public int findMax(long[] incomes) {
    int current_max_index = 0;
    for (int i = 1; i < incomes.length; i++)
      if (incomes[i] >= incomes[current_max_index])
        current_max_index = i;

    return current_max_index;
  }


  public long findMinimum(long[] incomes) {
    long current_min = incomes[0];
    for (long income : incomes)
      if (current_min > income)
        current_min = income;
    return current_min;
  }
}
