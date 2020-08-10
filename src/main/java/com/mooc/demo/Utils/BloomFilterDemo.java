package com.mooc.demo.Utils;

public class BloomFilterDemo {
   /* public static void main(String[] args) {
        BloomFilter<Integer> integerBloomFilter = BloomFilter.create(Funnels.integerFunnel(),
                1000000, 0.0001); //值：放入的类型，个数，错误率
        int count = 0;
        for (int i = 0; i < 1000000; i++) {
            integerBloomFilter.put(i);
        }
        for (int i = 1000000; i <2000000 ; i++) {
            if(integerBloomFilter.mightContain(i)){
                count++;
            }
        }
        System.out.println(count);
    }*/
}
