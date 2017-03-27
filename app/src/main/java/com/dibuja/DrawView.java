package com.dibuja;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.view.View;

public class DrawView extends View {
	Paint paint = new Paint();

	public DrawView(Context context) {
		super(context);
	}

	@Override
	public void onDraw(Canvas canvas) {
	   //.drawRect(left, top, right, bottom, paint)
        paint.setColor(Color.RED);
		canvas.drawRect(30, 30, 80, 80, paint);
	    paint.setColor(Color.CYAN);
		canvas.drawRect(33, 60, 77, 77, paint);
		paint.setColor(Color.YELLOW);
		canvas.drawRect(33, 33, 77, 60, paint);

		
		//.drawCircle(cx, cy, radius, paint);
		paint.setColor(Color.RED);
		canvas.drawCircle(100, 100, 20, paint);
		
		//.drawText(text, x, y, paint)
		canvas.drawText("Texto con CANVAS", 200, 30, paint);
		
		//.drawLine(startX, startY, stopX, stopY, paint)
        paint.setColor(Color.BLUE);
        canvas.drawLine(0, 0, 350, 100, paint);


        Path trazo = new Path();
        trazo.addCircle(150, 450, 100, Path.Direction.CCW);
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(8);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(trazo, paint);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(20);
        paint.setTypeface(Typeface.SANS_SERIF);
        canvas.drawTextOnPath("Cecyt 9 \"Juan de Dios Bátiz\" graficos en Android ", trazo, 150, 40, paint);


		//Dibujar Exagono
		paint.setColor(Color.GREEN);
		paint.setStrokeWidth(4);
		canvas.drawLine(300,300,350,300,paint);
		canvas.drawLine(350,300,375,343,paint);
		canvas.drawLine(375,343,350,386,paint);
		canvas.drawLine(350,386,300,386,paint);
		canvas.drawLine(300,386,275,343,paint);
		canvas.drawLine(275,343,300,300,paint);

		//Dibujar estrella
		paint.setColor(Color.MAGENTA);
		paint.setStrokeWidth(4);
		canvas.drawLine(450,500,500,500,paint);//2IZQ
		canvas.drawLine(500,535,450,500,paint);//2IZQ
		canvas.drawLine(500,500,525,467,paint);//1izq
		canvas.drawLine(525,467,550,500,paint);//1Der
		canvas.drawLine(550,500,600,500,paint);//2DER
		canvas.drawLine(600,500,550,535,paint);//2DER
		canvas.drawLine(550,535,575,590,paint);//3DER
		canvas.drawLine(575,590,525,560,paint);//3DER
		canvas.drawLine(525,560,475,590,paint);//3IZQ
		canvas.drawLine(475,590,500,535,paint);//3IZQ


	}

}
