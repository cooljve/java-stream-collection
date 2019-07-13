package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Reduce {

  List<Integer> arrayList;

  public Reduce(List<Integer> arrayList) {
    this.arrayList = arrayList;
  }

  public int getMaximum() {
    return arrayList.stream().mapToInt(x -> x).max().getAsInt();
  }

  public double getMinimum() {
    return arrayList.stream().mapToInt(x -> x).min().getAsInt();
  }

  public double getAverage() {
    return arrayList.stream().mapToDouble(x -> x).average().getAsDouble();
  }

  public double getOrderedMedian() {
    arrayList = arrayList.stream().sorted().collect(Collectors.toList());
    int size = arrayList.size();
    if (size % 2 == 0) {
      return (double) (arrayList.get(size / 2) + arrayList.get(size / 2 - 1)) / 2;
    } else {
      return arrayList.get(arrayList.size() / 2);
    }
  }

  public int getFirstEven() {
    throw new NotImplementedException();
  }

  public int getIndexOfFirstEven() {
    throw new NotImplementedException();
  }

  public boolean isEqual(List<Integer> arrayList) {
    throw new NotImplementedException();
  }

  public Double getMedianInLinkList(SingleLink singleLink) {
    throw new NotImplementedException();
  }

  public int getLastOdd() {
    throw new NotImplementedException();
  }

  public int getIndexOfLastOdd() {
    throw new NotImplementedException();
  }
}
