package com.avereon.rossa.icon.flat;

import com.avereon.venza.icon.RenderedIcon;
import com.avereon.venza.image.RenderedImage;

public class ToggleIcon extends RenderedIcon {

	private boolean enabled;

	public ToggleIcon() {
		this( false );
	}

	public ToggleIcon( Boolean enabled ) {
		this.enabled = enabled;
	}

	@Override
	protected void render() {
		double r = 8;
		double w = r;
		double e = 32 - r;
		double alpha = Math.toDegrees( Math.atan2( r + 2, r ) );

		if( enabled ) {
			startPath();
			addArc( g( e ), g( 16 ), g( r + 2 ), g( r + 2 ), 180+alpha, -2 * alpha );
			lineTo( g( w ), g( 16 - r ) );
			addArc( g( w ), g( 16 ), g( r ), g( r ), 90, 180 );
			closePath();
			fill();

			startPath();
			addArc( g( e ), g( 16 ), g( r ), g( r ), 0, 360 );
			fill();
		} else {
			startPath();
			addArc( g( w ), g( 16 ), g( r + 2 ), g( r + 2 ), alpha, -2 * alpha );
			lineTo( g( e ), g( 16 + r ) );
			addArc( g( e ), g( 16 ), g( r ), g( r ), 270, 180 );
			closePath();
			fill();

			startPath();
			addArc( g( w ), g( 16 ), g( r ), g( r ), 0, 360 );
			fill();
		}
	}

	@Override
	public <T extends RenderedImage> T copy() {
		T copy = super.copy();
		((ToggleIcon)copy).enabled = this.enabled;
		return copy;
	}

	public static void main( String[] commands ) {
		RenderedIcon.proof( new ToggleIcon( false ) );
	}

}
