package com.lf.algorithm.unionfind;

import com.lf.algorithm.sort.BaseSort;
import org.junit.Test;

import java.util.Set;

/**
 * @author liufan
 * @description: TODO
 * @since 2025/07/02
 */
public class SortTest {
    public final static Set<String> methods = Set.of("selection", "insert", "shell");

    @Test
    public void testInsertSort() {
        BaseSort.testSort(10, "insert");
    }

    @Test
    public void testShellSort() {
        BaseSort.testSort(10, "shell");
    }

    @Test
    public void testTime() {
        for (String method: methods) {
            System.out.println(method + ": " + BaseSort.timeSort(100000, method) + "ms");
        }
    }
}
