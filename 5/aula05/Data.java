package aula05;
import java.util.*;

public class Data{
	
	private int dia, mes, ano;
	private Calendar date=Calendar.getInstance();

public Data(String data) {
	
	assert dia>0 && dia<diasDoMes(mes, ano) : "invalid day";
	assert mes>0 && mes<=12 : "invalid month";
	assert ano>0 : "invalid year";
	String[] datas=data.split("/");
	this.dia=Integer.parseInt(datas[0]);
	this.mes=Integer.parseInt(datas[1]);
	this.ano=Integer.parseInt(datas[2]);
	
}

public int dia() { return dia; }
public int mes() { return mes; }
public int ano() { return ano; }

public static boolean bissexto(int ano) {
  return ano%4 == 0 && ano%100 != 0 || ano%400 == 0;
}

private static final int[] diasMesComum = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

public static int diasDoMes(int mes, int ano) {
  int result = diasMesComum[mes-1];
  if (mes == 2 && bissexto(ano))
    result++;
  return result;
}
public Data today(){
	int today_dia,today_mes,today_ano;

	today_dia=date.get(Calendar.DAY_OF_MONTH);
	today_mes=date.get(Calendar.MONTH);
	today_ano=date.get(Calendar.YEAR);

	String d=today_dia+"/"+today_mes+"/"+today_ano;
	return new Data(d);
}

public String toString(){
	return dia+"-"+mes+"-"+ano;
}
}












