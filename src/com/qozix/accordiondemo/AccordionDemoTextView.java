package com.qozix.accordiondemo;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.widget.TextView;

public class AccordionDemoTextView extends TextView {

	public AccordionDemoTextView( Context context ) {
		super( context );
		setBackgroundColor( 0xFFF0F0F );
		setTextColor( 0xFF151515 );
		setTypeface( Typeface.SANS_SERIF );
		setTextSize( TypedValue.COMPLEX_UNIT_SP, 16 );
		setPadding( 10, 10, 10, 10 );
	} 
	
}
