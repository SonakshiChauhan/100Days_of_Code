package com.company;
/*
Runtime:0ms
Memory:41.5 MB
 */
public class Symbol_in_grammar_recursive {

        public int kthGrammar(int n, int k) {
            if(n == 1 || k == 1){
                return 0;
            }

            int mid = (int) Math.pow(2, n - 1) / 2;

            if(k <= mid){
                return kthGrammar(n - 1, k);
            }else{
                return kthGrammar(n - 1, k - mid) == 1 ? 0 : 1;
            }
        }
    }

