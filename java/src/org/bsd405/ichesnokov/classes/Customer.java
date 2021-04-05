package org.bsd405.ichesnokov.classes;

public class Customer {
    private String name;
    private int idNum;

    public Customer(String name, int idNum) {
        this.name = name;
        this.idNum = idNum;
    }

    public int compareTo(Customer other) {
        int result = name.compareTo(other.name);

        if (result != 0) {
            return result;
        }

        return idNum - other.idNum;
    }

    public static void prefixMerge(Customer[] arr1, Customer[] arr2, Customer[] result) {
        int a1 = 0;
        int a2 = 0;
        Customer last = null;
        Customer candidate = null;
        int i = 0;
        while (i < result.length) {
            if (arr1[a1].compareTo(arr2[a2]) < 0) {
                candidate = arr1[a1];
                a1++;
            } else if (arr1[a1].compareTo(arr2[a2]) > 0) {
                candidate = arr2[a2];
                a2++;
            } else {
                candidate = arr1[a1];
                a1++;
                a2++;
            }

            if (last != null &&  candidate.compareTo(last) == 0)
                continue;

            result[i] = candidate;
            last = candidate;
            i++;
        }
    }
}
