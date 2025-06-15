package com.lf.algorithm.unionfind;

import com.lf.util.FileUtil;

import java.util.Scanner;

public class UnionFind {
    //节点数量
    private int n;
    //联通分量祖先
    private int[] index;
    //节点数量
    private int[] nodes;
    //分量数
    private int count;
    //访问节点次数
    private int visitCount;

    public UnionFind(int n) {
        this.n = n;
        this.count = n;
        this.index = new int[n];
        this.nodes = new int[n];
        this.visitCount = 0;

        for (int i = 0; i < n; i++) {
            index[i] = i;
            nodes[i] = 1;
        }
    }

    public int find(int p) {
        visitCount++;
        if (index[p] == p) {
            return p;
        }
        return find(index[p]);
    }

    public void union(int p, int q) {
        int pF = find(p), qF = find(q);
        if (pF == qF) return;
        index[pF] = qF;
        count--;
    }

    //加权合并，
    public void weightUnion(int p, int q) {
        int pF = find(p), qF = find(q);
        int pWeight = nodes[pF], qWeight = nodes[qF];
        if (pF == qF) return;
        if (pWeight == qWeight) {
            index[pF] = qF;
            nodes[qF]++;
        } else if (pWeight < qWeight) {
            index[pF] = qF;
        } else {
            index[qF] = pF;
        }
        count--;
    }


    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();
        String fileName = "data/unionfind/medium.txt";
        Scanner scanner = FileUtil.getScanner(fileName);
        int N = scanner.nextInt();
        UnionFind uf = new UnionFind(N);
        while (scanner.hasNext()) {
            int p = scanner.nextInt(), q = scanner.nextInt();
            uf.union(p, q);
            System.out.println(p + " " + q + " " + uf.find(p));
        }
        System.out.println(uf.count + " components, visitCount: " + uf.visitCount);
        System.out.println("times: " + (System.currentTimeMillis() - timeStart));

//        for (int i = 0; i < 10; i++) {
//            long timeStart = System.currentTimeMillis();
//            String fileName = "data/unionfind/medium.txt";
//            Scanner scanner = FileUtil.getScanner(fileName);
//            int N = scanner.nextInt();
//            UnionFind uf = new UnionFind(N);
//            while (scanner.hasNext()) {
//                int p = scanner.nextInt(), q = scanner.nextInt();
//                uf.union(p, q);
//                System.out.println(p + " " + q + " " + uf.find(p));
//            }
//            System.out.println(uf.count + " components");
//            System.out.println("times: " + (System.currentTimeMillis() - timeStart));
//
//        }


    }
}
