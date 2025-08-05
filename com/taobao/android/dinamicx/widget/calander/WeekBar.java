package com.taobao.android.dinamicx.widget.calander;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes5.dex */
public class WeekBar extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b mDelegate;

    static {
        kge.a(688415550);
    }

    public static /* synthetic */ Object ipc$super(WeekBar weekBar, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void onDateSelected(Calendar calendar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bcb5350", new Object[]{this, calendar, new Integer(i), new Boolean(z)});
        }
    }

    public WeekBar(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.datepicker_week_bar, (ViewGroup) this, true);
    }

    public void setup(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d9723dc", new Object[]{this, bVar});
            return;
        }
        this.mDelegate = bVar;
        setTextSize(this.mDelegate.B());
        setTextColor(bVar.j());
        setBackgroundColor(bVar.m());
        setPadding(bVar.E(), 0, bVar.F(), 0);
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((TextView) getChildAt(i2)).setTextColor(i);
        }
    }

    public void setTextSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5ef80c", new Object[]{this, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((TextView) getChildAt(i2)).setTextSize(0, i);
        }
    }

    public void onWeekStartChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe0b047d", new Object[]{this, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((TextView) getChildAt(i2)).setText(getWeekString(i2, i));
        }
    }

    private String getWeekString(int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5109fcde", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        String[] stringArray = getContext().getResources().getStringArray(R.array.week_string_array);
        if (i2 == 1) {
            return stringArray[i];
        }
        int i4 = 6;
        if (i2 == 2) {
            if (i != 6) {
                i3 = i + 1;
            }
            return stringArray[i3];
        }
        if (i != 0) {
            i4 = i - 1;
        }
        return stringArray[i4];
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int makeMeasureSpec;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        b bVar = this.mDelegate;
        if (bVar != null) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(bVar.p(), 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(a.a(getContext(), 40.0f), 1073741824);
        }
        super.onMeasure(i, makeMeasureSpec);
    }
}
