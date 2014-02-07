package com.qozix.accordiondemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.qozix.widgets.AccordionView;
import com.qozix.widgets.AccordionView.Item;

public class AccordionDemoActivity extends Activity {
	
	private static final String TAG = AccordionDemoActivity.class.getSimpleName();

	@Override
	protected void onCreate( Bundle savedInstanceState ) {
		
		super.onCreate( savedInstanceState );
		
		// get fake data - this is totally arbitrary
		AccordionDemoSampleDataSet dataSet = new AccordionDemoSampleDataSet();
		
		AccordionView accordionView = new AccordionView( this );
		accordionView.setOnAccordionEventListener( accordionEventListener );
		
		for( AccordionDemoQuestionAnswerSet faq : dataSet.getFaqs() ) {
			AccordionDemoTitleView questionView = new AccordionDemoTitleView( this );
			AccordionDemoTextView answerView = new AccordionDemoTextView( this );
			questionView.setText( faq.question );
			answerView.setText( faq.answer );
			accordionView.addItem( questionView, answerView );			
		}
		
		
		setContentView( accordionView );
		
		/*
		 * Try out some settings.  
		 * These samples are all intentionally different from default values.
		 */
		
		// accordionView.setScrollToTopOnItemOpen( false );
		 accordionView.setAllowMultipleItemsOpen( false );
		// accordionView.setOpenTransitionEnabled( false );
		// accordionView.setScrollAnimationEnabled( false );
		// accordionView.setScrollAnimationDuration( 1500 );
		// accordionView.setOpenTransitionDuration( 1500 );
		
	}
	
	private AccordionView.OnAccordionEventListener accordionEventListener = new AccordionView.OnAccordionEventListener() {
		
		@Override
		public void onItemStartOpen( Item item ) {
			Log.d( TAG, "item starting to open" );
		}
		
		@Override
		public void onItemStartClose( Item item ) {
			Log.d( TAG, "item starting to close" );
		}
		
		@Override
		public void onItemOpened( Item item ) {
			Log.d( TAG, "item is completely open" );
		}
		
		@Override
		public void onItemClosed( Item item ) {
			Log.d( TAG, "item is completely closed" );
		}
	};

}
