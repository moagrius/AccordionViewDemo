package com.qozix.accordiondemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;


public class AccordionDemoTitleView extends AccordionDemoTextView {

	private Paint outsetPaint = new Paint();
	private Paint insetPaint = new Paint();
	{
		outsetPaint.setColor( 0xFFFFFFFF );
		insetPaint.setColor( 0x22000000 );
	}
	
	public AccordionDemoTitleView( Context context ) {
		super( context );
		setBackgroundColor( 0xFFededed );
	} 
	
	@Override
	public void onDraw( Canvas canvas ) {
		super.onDraw( canvas );
		canvas.drawLine( 0, 0, canvas.getWidth(), 0, outsetPaint );
		canvas.drawLine( 0, canvas.getHeight() - 1, canvas.getWidth(), canvas.getHeight() - 1, insetPaint );
	}
	
}