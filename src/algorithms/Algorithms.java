/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author barsa
 */
public class Algorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stream<Integer> integerArrStream=Stream.of(new Integer[]{1,2,3,1,2});
        Set<Integer> allItem=new HashSet<Integer>();
        Set<Integer> res=integerArrStream.filter(n->!allItem.add(n)).collect(Collectors.toSet());
        System.err.println(res);
        
        
        // findout middle index where sum of both end is equal
        Stream<Integer> s1=Stream.of(new Integer[]{1,2,3,2,1});
        s1.filter(n->)
    }
}
