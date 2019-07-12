package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Add {
  public int getSumOfEvens(int leftBorder, int rightBorder) {
    List<Integer> numberList = new ArrayList<>();
    int i = leftBorder < rightBorder ? leftBorder : rightBorder;
    int j = leftBorder < rightBorder ? rightBorder : leftBorder;
    for (; i <= j; i++) {
      numberList.add(i);
    }
    return numberList.stream().filter(num -> num % 2 == 0).mapToInt(x -> x).sum();
  }

  public int getSumOfOdds(int leftBorder, int rightBorder) {
    throw new NotImplementedException();
  }

  public int getSumTripleAndAddTwo(List<Integer> arrayList) {
    return arrayList.stream().map(x -> x * 3 + 2).mapToInt(x -> x).sum();
  }

  public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
    return arrayList.stream().map(x -> {
      if (x % 2 != 0) {
        return x * 3 + 2;
      }
      return x;
    }).collect(Collectors.toList());
  }

  public int getSumOfProcessedOdds(List<Integer> arrayList) {
    throw new NotImplementedException();
  }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

  public double getAverageOfEven(List<Integer> arrayList) {
    int sum = arrayList.stream().filter(x -> x % 2 == 0).mapToInt(x -> x).sum();
    int count = (int) arrayList.stream().filter(x -> x % 2 == 0).count();
    return sum/count;
  }

  public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
    throw new NotImplementedException();
  }

  public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
    return arrayList.stream().filter(x -> x % 2 == 0).distinct().collect(Collectors.toList());
  }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
