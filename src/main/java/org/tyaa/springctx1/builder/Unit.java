package org.tyaa.springctx1.builder;

import org.tyaa.springctx1.interfaces.IPerson;
import org.tyaa.springctx1.interfaces.ITool;
import org.tyaa.springctx1.interfaces.IUnit;

public class Unit implements IUnit {

	private IPerson mPerson;
	private ITool mTool;
	
	private String mNationality;
	private int mLevel;
	
	public Unit() {
		super();
	}

	//Не использовать знак подчеркивания в именах аргументов конструкторов
	public Unit(IPerson person, ITool tool) {
		super();
		mPerson = person;
		mTool = tool;
	}
	
	public Unit(String nationality, int level) {
		super();
		mNationality = nationality;
		mLevel = level;
	}

	public void testActions() {
		
		mPerson.goTo(10, 25);
		mTool.doAction();
	}

	
	public void say(String _phrase) {
		
		System.out.println(_phrase);
	}

	public ITool getTool() {
		return mTool;
	}

	public void setTool(ITool _tool) {
		mTool = _tool;
	}

	public IPerson getPerson() {
		return mPerson;
	}

	public void setPerson(IPerson _person) {
		mPerson = _person;
	}

	public String getNationality() {
		return mNationality;
	}

	public void setNationality(String _nationality) {
		mNationality = _nationality;
	}

	public int getLevel() {
		return mLevel;
	}

	public void setLevel(int _level) {
		mLevel = _level;
	}

	public void show() {
		
		System.out.printf("Nationality: %s; level: %d\n", mNationality, mLevel);
	}
	
	public void onInit() {
		
		System.out.println("init " + this.toString());
	}
	
	public void onDestroy() {
		
		System.out.println("destroy " + this.toString());
	}
}
