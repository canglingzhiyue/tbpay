package com.taobao.android.detail.core.detail.ext.view.widget.main;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.h;
import com.taobao.taobao.R;
import java.util.Locale;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class CountdownView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DAY_IN_MILLIS = 86400000;
    public static final long HOUR_IN_MILLIS = 3600000;
    public static final long MINUTE_IN_MILLIS = 60000;
    public static final long SECOND_IN_MILLIS = 1000;
    private final String[] TIMES;
    private float baseLine;
    private boolean isStart;
    private StaticLayout layout;
    private long mEndTime;
    private long mStartTime;
    private String mText;
    private TextPaint mTextPaint;
    private boolean needMeasure;
    private boolean showDay;
    private float viewHeight;
    private float viewWidth;

    static {
        kge.a(-958580856);
    }

    public static /* synthetic */ Object ipc$super(CountdownView countdownView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 650865254) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public CountdownView(Context context) {
        super(context);
        this.needMeasure = true;
        this.TIMES = new String[]{"00", "00", "00", "00", "0"};
        init(context, null);
    }

    public CountdownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.needMeasure = true;
        this.TIMES = new String[]{"00", "00", "00", "00", "0"};
        init(context, attributeSet);
    }

    public CountdownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.needMeasure = true;
        this.TIMES = new String[]{"00", "00", "00", "00", "0"};
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        setWillNotDraw(false);
        emu.a("com.taobao.android.detail.core.detail.ext.view.widget.main.CountdownView");
        this.mTextPaint = new TextPaint(1);
        this.mTextPaint.density = context.getResources().getDisplayMetrics().density;
        this.mTextPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mTextPaint.setTypeface(Typeface.defaultFromStyle(1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CountdownView);
        setTextSize(obtainStyledAttributes.getDimension(R.styleable.CountdownView_txt_size, 14.0f));
        setTextColor(obtainStyledAttributes.getColor(R.styleable.CountdownView_txt_color, -16777216));
        obtainStyledAttributes.recycle();
    }

    public void setShowDay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4bb9cb0", new Object[]{this, new Boolean(z)});
        } else {
            this.showDay = z;
        }
    }

    public void setCountdown(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ddfeff6", new Object[]{this, new Long(j), new Long(j2)});
        } else if (j <= 0 || j2 <= 0) {
        } else {
            this.mStartTime = j;
            this.mEndTime = j2;
            this.needMeasure = true;
            if (h.a() > this.mEndTime) {
                setText(getContext().getResources().getString(R.string.detail_countdown_finish));
            } else {
                invalidate();
            }
        }
    }

    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
            return;
        }
        this.mText = str;
        if (this.layout == null) {
            return;
        }
        this.needMeasure = true;
        invalidate();
    }

    public void setTextSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5eecc9", new Object[]{this, new Float(f)});
            return;
        }
        this.mTextPaint.setTextSize(f);
        if (this.layout == null) {
            return;
        }
        this.needMeasure = true;
        invalidate();
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
            return;
        }
        this.mTextPaint.setColor(i);
        if (this.layout == null) {
            return;
        }
        invalidate();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (this.needMeasure || this.layout == null) {
            this.needMeasure = false;
            if (StringUtils.isEmpty(this.mText)) {
                Resources resources = getContext().getResources();
                int i3 = R.string.detail_countdown_start;
                String[] strArr = this.TIMES;
                str = resources.getString(i3, strArr[1], strArr[2], strArr[3], strArr[4]);
            } else {
                str = this.mText;
            }
            this.layout = new StaticLayout(str, this.mTextPaint, (size - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.viewWidth = this.layout.getLineWidth(0);
            this.viewHeight = this.layout.getLineBottom(0) - this.layout.getLineTop(0);
            this.baseLine = this.layout.getLineBaseline(0);
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec((int) this.viewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.viewHeight, 1073741824));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        String str = this.mText;
        boolean isEmpty = StringUtils.isEmpty(str);
        if (isEmpty) {
            if (!refreshTime()) {
                return;
            }
            Resources resources = getContext().getResources();
            int i = this.isStart ? R.string.detail_countdown_end : R.string.detail_countdown_start;
            String[] strArr = this.TIMES;
            str = resources.getString(i, strArr[1], strArr[2], strArr[3], strArr[4]);
        }
        canvas.drawText(str, 0.0f, this.baseLine + getPaddingTop(), this.mTextPaint);
        if (!isEmpty) {
            return;
        }
        invalidate();
    }

    private boolean refreshTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d48194d3", new Object[]{this})).booleanValue();
        }
        long a2 = h.a();
        if (a2 > this.mEndTime) {
            setText(getContext().getResources().getString(R.string.detail_countdown_finish));
            requestLayout();
            return false;
        }
        this.isStart = a2 > this.mStartTime;
        long j = (this.isStart ? this.mEndTime : this.mStartTime) - a2;
        long j2 = j / 86400000;
        long j3 = j % 86400000;
        long j4 = j3 / 3600000;
        long j5 = j3 % 3600000;
        long j6 = j5 / 60000;
        long j7 = j5 % 60000;
        long j8 = j7 / 1000;
        long j9 = j7 % 1000;
        this.TIMES[0] = addZero(j2);
        if (!this.showDay) {
            j4 += j2 * 24;
        }
        this.TIMES[1] = addZero(j4);
        this.TIMES[2] = addZero(j6);
        this.TIMES[3] = addZero(j8);
        this.TIMES[4] = String.valueOf(j9 / 100);
        return true;
    }

    public String addZero(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a97b1d4c", new Object[]{this, new Long(j)}) : String.format(Locale.getDefault(), "%02d", Long.valueOf(j));
    }
}
