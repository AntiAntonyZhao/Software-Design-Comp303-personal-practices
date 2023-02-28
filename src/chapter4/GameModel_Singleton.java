/*******************************************************************************
 * Companion code for the book "Introduction to Software Design with Java" 
 * by Martin P. Robillard.
 *
 * Copyright (C) 2019 by Martin P. Robillard
 *
 * This code is licensed under a Creative Commons 
 * Attribution-NonCommercial-NoDerivatives 4.0 International License.
 * 
 * See http://creativecommons.org/licenses/by-nc-nd/4.0/
 *******************************************************************************/
package chapter4;

/**
 * Stub for a GameModel class that is an application
 * of the Singleton design pattern.
 *
 */
public class GameModel_Singleton
{
	private static final GameModel_Singleton INSTANCE = new GameModel_Singleton();
	
	private GameModel_Singleton() {}
	
	public static GameModel_Singleton instance() 
	{ 
		return INSTANCE; 
	}
}