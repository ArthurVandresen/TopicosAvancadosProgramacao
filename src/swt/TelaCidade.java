package swt;

import org.eclipse.swt.widgets.Composite;

public class TelaCidade extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public TelaCidade(Composite parent, int style) {
		super(parent, style);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
