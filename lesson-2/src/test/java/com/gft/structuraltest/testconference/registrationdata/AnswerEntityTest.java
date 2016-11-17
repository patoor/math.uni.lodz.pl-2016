package com.gft.structuraltest.testconference.registrationdata;

import static org.junit.Assert.*;
import org.junit.*;

public class AnswerEntityTest{

    @Test
    public void shouldReturnFalseWhenObjectIsNull(){
        AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = null;
        assertFalse(an1.equals(an2));
    }
    @Test
	public void shouldReturnTrueWhenTheSameObj()
	{
		AnswerEntity a1 = new AnswerEntity();
		AnswerEntity a2 = a1;
		assertTrue(a1.equals(a2));
	}
	@Test 
	public void shouldRetutnFalseWhenDiffClass()
	{
		AnswerEntity a1 = new AnswerEntity();
		QuestionEntity q1 =new QuestionEntity();
		assertFalse(a1.equals(q1));
	}
	@Test
	public void shhoudReturnFalseWhenAnserTextisNull()
	{
		AnswerEntity a1 = new AnswerEntity();
		AnswerEntity a2 = new AnswerEntity();
		a2.setAnswerText("aaa");
		assertFalse(a1.equals(a2));
	}
	
	@Test
	public void shouldReturnFlaseWhenTextiISDifferent()
	{
		AnswerEntity a1 = new AnswerEntity();
		AnswerEntity a2 = new AnswerEntity();
		a1.setAnswerText("aaa");
		a2.setAnswerText("bbb");
		assertFalse(a1.equals(a2));
	}
	@Test
	public void shouldReturnfalsewhenOtherIdIsNN()
	{
		AnswerEntity a1 = new AnswerEntity();
		AnswerEntity a2 = new AnswerEntity();
		a1.setAnswerText("aaa");
		a2.setAnswerText("bbb");
		a2.setId(new Long(3));
		assertFalse(a1.equals(a2));
	}
	
	@Test 
	public void shouldReturnFalseWhenIdIsDiffernt()
	{
		AnswerEntity a1 = new AnswerEntity();
		AnswerEntity a2 = new AnswerEntity();
		a1.setAnswerText("aaa");
		a2.setAnswerText("bbb");
		a1.setId(new Long(1));
		a2.setId(new Long(3));
		assertFalse(a1.equals(a2));			
	}
	
	@Test 
	public void shouldReturnFalseWhenQuestionIsNull()
	{
		AnswerEntity a1 = new AnswerEntity();
		AnswerEntity a2 = new AnswerEntity();
		a1.setAnswerText("aaa");
		a2.setAnswerText("bbb");
		a1.setId(new Long(3));
		a2.setId(new Long(3));
		a2.setQuestion(new QuestionEntity());
		assertFalse(a1.equals(a2));		
	}
	
	@Test
	public void shouldReturnFalseWhenQuestionIsDifferent()
	{
		AnswerEntity a1 = new AnswerEntity();
		AnswerEntity a2 = new AnswerEntity();
		a1.setAnswerText("aaa");
		a2.setAnswerText("bbb");
		a1.setId(new Long(3));
		a2.setId(new Long(3));
		a1.setQuestion(new QuestionEntity());
		a2.setQuestion(new QuestionEntity());
		assertFalse(a1.equals(a2));
	}
}
	