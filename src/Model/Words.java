package Model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Words {
	private String[] text;
	private String[] lines;
	private ArrayList <String> words;
	
	public Words () {
		words = new ArrayList<>();
	}
	
	public void wordsConverter(PApplet app) {
		
		text = app.loadStrings("TALE.txt");
		
		for (int i = 0; i < text.length; i++) {
			lines = PApplet.split(text[i], " ");
			
			for (int j = 0; j < lines.length; j++) {
				words.add(lines[j]);}}
	}
	
	public void newtext(PApplet app) {
		
			
		
		String[] newWords = new String[words.size()];
		for (int i = 0; i < words.size(); i++) {
			newWords[i] = words.get(i);}
		for (int i= 0;i<newWords.length;i++) {
		if (newWords[i].equalsIgnoreCase(" Caperucita")||
			newWords[i].equalsIgnoreCase("Caperucita")||
			newWords[i].equalsIgnoreCase("Caperucita,")||
			newWords[i].equalsIgnoreCase("Caperucita.")) {
			newWords[i]="CAPERUCITA";}
		if (newWords[i].equalsIgnoreCase("Caperucita?")) {newWords[i]="CAPERUCITA?";}

		if (newWords[i].equalsIgnoreCase(" puerta")||
				newWords[i].equalsIgnoreCase("puerta")||
				newWords[i].equalsIgnoreCase("puerta,")||
				newWords[i].equalsIgnoreCase("puerta.")) {
				newWords[i]="PUERTA";}
		
		if (newWords[i].equalsIgnoreCase("ojos")||
				newWords[i].equalsIgnoreCase("ojos,")||
				newWords[i].equalsIgnoreCase("ojos.")) {
				newWords[i]="OJOS";}

		if (newWords[i].equalsIgnoreCase("dientes")||
				newWords[i].equalsIgnoreCase("dientes,")||
				newWords[i].equalsIgnoreCase("dientes.")) {
				newWords[i]="DIENTES";}
		
		if (newWords[i].equalsIgnoreCase("orejas")||
				newWords[i].equalsIgnoreCase("orejas,")||
				newWords[i].equalsIgnoreCase("orejas.")) {
				newWords[i]="OREJAS";}
		 
		
		}
			
		
		app.saveStrings("Data/newWordsFile.txt", newWords);
	}
	
	public ArrayList<String> getWords() {
		return words;
	}
}
