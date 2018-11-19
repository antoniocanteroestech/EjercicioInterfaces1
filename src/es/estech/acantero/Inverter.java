package es.estech.acantero;

import java.util.Arrays;

public class Inverter implements CharSequence {

    private char[] word;

    public Inverter(String word) {
        this.word = word.toCharArray();
    }

    public char[] getWord() {
        return word;
    }

    public void setWord(char[] word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "Inverter{" +
                "word=" + Arrays.toString(word) +
                '}';
    }

    @Override
    public int length() {
        return this.word.length;
    }

    @Override
    public char charAt(int index) {
        return this.word[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String subsequence = "";
        for (int i = start; i <= end; i++ ){
            subsequence += this.word[i];
        }

        return subsequence;
    }

    public CharSequence invert(){
        String invertedWord = "";
        for (int i = this.word.length; i >= 0; i-- ){
            invertedWord += this.word[i];
        }

        return invertedWord;
    }
}
