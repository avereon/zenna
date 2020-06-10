package com.avereon.rossa.icon;

import com.avereon.venza.color.Colors;
import com.avereon.venza.icon.RenderedIcon;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class ZinniaIcon extends RenderedIcon {

	private double centerRadius = 3;

	private int likeness = 5;

	private int layers = 2;

	public ZinniaIcon() {
		String pink = Colors.web( Color.HOTPINK );
		String pingd = Colors.web( Color.HOTPINK.darker() );
		// This just gets overridden
		setStyle( "-fx-primary: ladder( -fx-text-background-color, " + pingd + " 50%, " + pink + " 50% );" );
	}

	@Override
	protected void render() {
		double spacing = 360.0 / likeness;
		double offset = spacing / layers;

		for( int layer = 0; layer < layers; layer++ ) {
			// Lower layer
			for( int index = 0; index < likeness; index++ ) {
				drawPetal();
				spin( g( 16 ), g( 16 ), spacing );
			}
			// Upper layer
			spin( g( 16 ), g( 16 ), offset );
		}
		reset();

		drawCenter();
	}

	private void drawPetal() {
		double n = 5;

		startPath();
		moveTo( g( 15 ), g( 15 ) );
		curveTo( g( 14 ), g( 8 ), g( 16 - n ), g( 1 ), g( 16 ), g( 1 ) );
		curveTo( g( 16 + n ), g( 1 ), g( 18 ), g( 8 ), g( 17 ), g( 15 ) );
		closePath();

		fill( getPrimaryPaint() );
		//draw( Color.HOTPINK.darker() );
	}

	private void drawCenter() {
		Paint centerPaint = Color.SADDLEBROWN.darker();
		setDrawPaint( centerPaint );
		setFillPaint( centerPaint );
		startPath();
		addOval( g( 16 ), g( 16 ), g( centerRadius ), g( centerRadius ) );
		fill(getSecondaryPaint());

		drawStamen( 10 );
		drawStamen( 130 );
		drawStamen( 250 );
	}

	private void drawStamen( double angleInDegrees ) {
		double radius = 1.8;

		double x = radius * Math.cos( Math.toRadians( angleInDegrees ) );
		double y = radius * Math.sin( Math.toRadians( angleInDegrees ) );

		startPath();
		addOval( g( 16 + x ), g( 16 + y ), g(1), g(1) );
		fill( Color.YELLOW );
	}

	public static void main( String[] commands ) {
		//save( new ZinniaIcon(), "target/icons/zinnia.png" );
		proof( new ZinniaIcon() );
	}

}
