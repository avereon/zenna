package com.avereon.zenna.icon;

import com.avereon.zarra.image.RenderedIcon;
import javafx.geometry.Point2D;

public class RefreshIcon extends RenderedIcon {

	private static final double CX = 16;

	private static final double CY = 16;

	@Override
	protected void render() {
		double radius = g( 12 );
		double angle = -10;
		double offset = 10;
		double extent = 180 - (2 * offset);

		// The angle back from the tip of the arrow head
		double alpha = 70;

		// The angle from the center of the arrow head to the edge
		double beta = 70;

		// The angle of the back edge of the arrow head
		double sweep = 20;

		double tailAngle = angle + offset;
		double tipAngle = tailAngle + extent;

		double theta = 180 - (alpha + (90 - beta));
		double arrowAngle = tipAngle - alpha;
		double arrowRadius = radius * (Math.sin( Math.toRadians( 90 - beta ) ) / Math.sin( Math.toRadians( theta ) ));
		double arrowX = CX + Math.cos( Math.toRadians( arrowAngle ) ) * arrowRadius;
		double arrowY = CY - Math.sin( Math.toRadians( arrowAngle ) ) * arrowRadius;

		double shaftRadius = radius + 0.5 * (arrowRadius - radius);
		double shaftX = CX + Math.cos( Math.toRadians( arrowAngle + sweep ) ) * shaftRadius;
		double shaftY = CY - Math.sin( Math.toRadians( arrowAngle + sweep ) ) * shaftRadius;

		double tailX = CX + Math.cos( Math.toRadians( tailAngle ) ) * radius;
		double tailY = CY - Math.sin( Math.toRadians( tailAngle ) ) * radius;

		double midpointX = 0.5 * (tailX + shaftX);
		double midpointY = 0.5 * (tailY + shaftY);

		Point2D tailVector = new Point2D( tailX - shaftX, tailY - shaftY );
		double tailMagnitude = Math.sqrt( tailVector.getX() * tailVector.getX() + tailVector.getY() * tailVector.getY() );
		Point2D centerVector = new Point2D( -tailVector.getY() / tailMagnitude, tailVector.getX() / tailMagnitude );

		double tailRadius = tailMagnitude / Math.sqrt( 3 );
		Point2D tailCenter = new Point2D( midpointX + centerVector.getX() * 0.5 * tailRadius, midpointY + centerVector.getY() * 0.5 * tailRadius );
		double tailStart = Math.toDegrees( Math.atan2( tailCenter.getY() - shaftY, shaftX - tailCenter.getX() ) );

		startPath();
		addArc( CX, CY, radius, radius, tailAngle, extent );
		lineTo( arrowX, arrowY );
		lineTo( shaftX, shaftY );
		addArc( tailCenter.getX(), tailCenter.getY(), tailRadius, tailRadius, tailStart, -120 );
		closePath();
		fill();

		startPath();
		addArc( CX, CY, radius, radius, tailAngle + 180, extent );
		lineTo( rotate( arrowX ), rotate( arrowY ) );
		lineTo( rotate( shaftX ), rotate( shaftY ) );
		addArc( rotate( tailCenter.getX() ), rotate( tailCenter.getY() ), tailRadius, tailRadius, tailStart + 180, -120 );
		closePath();
		fill();
	}

	private double rotate( double value ) {
		return -(value - 16) + 16;
	}

	public static void main( String[] commands ) {
		proof( new RefreshIcon() );
	}

}
