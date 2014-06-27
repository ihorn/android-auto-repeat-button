package com.grassrootsmethodologies.android.widget.autorepeat;


class AutoRepeatDefault
{
	// Delay between initial ACTION_DOWN event and first onClickListener call.
	public static final int initialDelayInMilliseconds = 500;

	// Delay between each subsequent onClickListener call.
	public static final int repeatPeriodInMilliseconds = 50;

	private AutoRepeatDefault() {
	}
}
