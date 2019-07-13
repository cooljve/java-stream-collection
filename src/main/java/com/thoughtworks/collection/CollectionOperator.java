package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionOperator {
  public List<Integer> getListByInterval(int left, int right) {
    if (left < right) {
      return IntStream.range(left, right + 1).mapToObj(x -> x).collect(Collectors.toList());
    } else {
      return IntStream.range(right, left + 1).mapToObj(x -> x).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
  }

  public List<Integer> getEvenListByIntervals(int left, int right) {
    if (left < right) {
      return IntStream.range(left, right + 1).filter(x -> x % 2 == 0).mapToObj(x -> x).collect(Collectors.toList());
    } else {
      return IntStream.range(right, left + 1).filter(x -> x % 2 == 0).mapToObj(x -> x).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
  }

  public List<Integer> popEvenElments(int[] array) {
    return Arrays.stream(array).filter(x -> x % 2 == 0).mapToObj(x -> x).collect(Collectors.toList());
  }

  public int popLastElment(int[] array) {
    return array[array.length - 1];
  }

  public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
    throw new NotImplementedException();
  }

  public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
    throw new NotImplementedException();
  }
}
