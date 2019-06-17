package com.shubham.di.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shubham.di.confi.DIConfiguration;
import com.shubham.di.consumer.MyApplication;
import com.shubham.di.consumer.MyPrivateClas;
import com.shubham.di.services.MessageService;

public class DummyPracticeProgram {
	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		
		for(int i = 1; i <= 100; i++) {
			myList.add(i);
		}
		
		Stream<Integer> seqStream = myList.stream();
		
		Stream<Integer> parallelStream = myList.parallelStream();
		
		Stream<Integer> highNums = seqStream.filter(P -> P > 90);
		
		highNums.forEach(P -> System.out.println("Heigh Number Parallel "+P));
		
	}
}
