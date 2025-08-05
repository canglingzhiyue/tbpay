package com.taobao.search.common.uikit;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.taobao.R;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class SummaryTipsView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int DEFAULT_TEXT_SIZE;
    private static final int DIVIDE_HEIGHT;
    private static final int DIVIDE_WIDTH;
    private static final int TIP_MARGIN;
    private int mHeight;
    private Paint mPaint;
    private StringBuilder mShowingIndexBuilder;
    private List<String> mSummaryTips;
    private int mWidth;

    public static /* synthetic */ Object ipc$super(SummaryTipsView summaryTipsView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode != 1389530587) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
    }

    static {
        kge.a(-965982682);
        TIP_MARGIN = j.a(5.0f);
        DIVIDE_WIDTH = j.a(1.0f);
        DIVIDE_HEIGHT = j.a(12.0f);
        DEFAULT_TEXT_SIZE = j.a(11.0f);
    }

    public SummaryTipsView(Context context) {
        this(context, null);
    }

    public SummaryTipsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPaint = new Paint();
        this.mWidth = 0;
        this.mHeight = 0;
        this.mShowingIndexBuilder = new StringBuilder();
        init(attributeSet);
    }

    private void init(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92cba817", new Object[]{this, attributeSet});
            return;
        }
        this.mPaint.setAntiAlias(true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.SummaryTipsView, 0, 0);
            this.mPaint.setTextSize(obtainStyledAttributes.getDimensionPixelSize(R.styleable.SummaryTipsView_text_size, DEFAULT_TEXT_SIZE));
            this.mPaint.setColor(obtainStyledAttributes.getColor(R.styleable.SummaryTipsView_text_color, Color.parseColor("#999999")));
            return;
        }
        this.mPaint.setTextSize(DEFAULT_TEXT_SIZE);
        this.mPaint.setColor(Color.parseColor("#999999"));
    }

    public void setSummaryTips(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01c93b4", new Object[]{this, list});
            return;
        }
        this.mSummaryTips = list;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        List<String> list = this.mSummaryTips;
        if (list == null || list.isEmpty() || this.mWidth == 0 || this.mHeight == 0) {
            return;
        }
        int calTextBaseline = calTextBaseline();
        int i = (this.mHeight - DIVIDE_HEIGHT) / 2;
        float f = 0.0f;
        for (int i2 = 0; i2 < this.mSummaryTips.size(); i2++) {
            String str = this.mSummaryTips.get(i2);
            float measureText = this.mPaint.measureText(str);
            int i3 = TIP_MARGIN;
            float f2 = f + measureText + i3;
            int i4 = DIVIDE_WIDTH;
            if (f2 + i4 + i3 > this.mWidth) {
                return;
            }
            if (f > 0.0f) {
                float f3 = f + i3;
                canvas.drawRect(f3, i, f3 + i4, DIVIDE_HEIGHT + i, this.mPaint);
                f = DIVIDE_WIDTH + TIP_MARGIN + f3;
            }
            canvas.drawText(str, f, calTextBaseline, this.mPaint);
            f += measureText;
            if (this.mShowingIndexBuilder.length() > 0) {
                this.mShowingIndexBuilder.append(",");
            }
            this.mShowingIndexBuilder.append(i2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        int i3 = getLayoutParams().width;
        StringBuilder sb = this.mShowingIndexBuilder;
        sb.delete(0, sb.length());
        List<String> list = this.mSummaryTips;
        if (list == null || list.isEmpty()) {
            return;
        }
        float f = 0.0f;
        for (int i4 = 0; i4 < this.mSummaryTips.size(); i4++) {
            float measureText = this.mPaint.measureText(this.mSummaryTips.get(i4));
            int i5 = TIP_MARGIN;
            float f2 = f + measureText + i5;
            int i6 = DIVIDE_WIDTH;
            if (f2 + i6 + i5 > i3) {
                return;
            }
            if (f > 0.0f) {
                f = f + i5 + i6 + i5;
            }
            f += measureText;
            if (this.mShowingIndexBuilder.length() > 0) {
                this.mShowingIndexBuilder.append(",");
            }
            this.mShowingIndexBuilder.append(i4);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.mWidth = i;
        this.mHeight = i2;
    }

    private int calTextBaseline() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5fd065fa", new Object[]{this})).intValue();
        }
        Paint.FontMetricsInt fontMetricsInt = this.mPaint.getFontMetricsInt();
        int i2 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int i3 = this.mHeight;
        if (i3 < i2) {
            i = fontMetricsInt.descent;
        } else {
            i3 -= (i3 - i2) / 2;
            i = fontMetricsInt.descent;
        }
        return i3 - i;
    }

    public void setColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666e7bdb", new Object[]{this, new Integer(i)});
            return;
        }
        this.mPaint.setColor(i);
        invalidate();
    }

    public String getShowingIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d82c1056", new Object[]{this}) : this.mShowingIndexBuilder.toString();
    }
}
