package com.taobao.android.dinamicx.widget.calander;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.main.IndicatorBar;
import com.taobao.android.dinamicx.widget.calander.Calendar;
import com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.CollectionTabLayout;
import com.taobao.taobao.R;
import tb.gbg;
import tb.kge;

/* loaded from: classes5.dex */
public class CustomMonthView extends MonthView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Drawable dateBookedDrawable;
    public Paint mBackgroundPaint;
    public Paint mCalendarInfoPaint;
    private Paint mCurDaySelectPaint;
    private Paint mCurDayUnSelectPaint;
    public float mCurrentDayTextBaseLine;
    public float mOutRangeTextBaseLine;
    public Paint mOutRangeTextPaint;
    private int mSelectedCircleRadius;

    static {
        kge.a(751745427);
    }

    public static /* synthetic */ Object ipc$super(CustomMonthView customMonthView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1808959798) {
            super.updateItemHeight();
            return null;
        } else if (hashCode == -1285350673) {
            super.updateStyle();
            return null;
        } else if (hashCode != 192383669) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.initPaint();
            return null;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.calander.BaseMonthView
    public void onLoopStart(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbf3b4e6", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    public CustomMonthView(Context context) {
        super(context);
    }

    @Override // com.taobao.android.dinamicx.widget.calander.BaseView
    public void initPaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b778ab5", new Object[]{this});
            return;
        }
        super.initPaint();
        this.mOutRangeTextPaint = new Paint();
        this.mCurDaySelectPaint = new Paint();
        this.mCurDayUnSelectPaint = new Paint();
        this.mCalendarInfoPaint = new Paint();
        initCommonPaintWithTypeFace(this.mOutRangeTextPaint, -3355444, 14);
        initCommonPaintWithTypeFace(this.mCurDaySelectPaint, -1, 16);
        initCommonPaintWithTypeFace(this.mCurDayUnSelectPaint, CollectionTabLayout.SELECTED_TEXT_COLOR, 16);
        initCommonPaint(this.mCalendarInfoPaint, IndicatorBar.DEFAULT_END_COLOR, 11);
        this.mBackgroundPaint = new Paint();
        this.mBackgroundPaint.setAntiAlias(true);
        this.mBackgroundPaint.setColor(-2062);
    }

    @Override // com.taobao.android.dinamicx.widget.calander.BaseView
    public void updateStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3631aef", new Object[]{this});
            return;
        }
        super.updateStyle();
        if (this.mDelegate == null) {
            return;
        }
        this.mOutRangeTextPaint.setTextSize(this.mDelegate.s());
        if (this.mDelegate.t() > 0) {
            this.mCurDaySelectPaint.setTextSize(this.mDelegate.t());
            this.mCurDayUnSelectPaint.setTextSize(this.mDelegate.t());
        }
        this.mSelectTextPaint.setColor(this.mDelegate.l());
        this.mCurDaySelectPaint.setColor(this.mDelegate.l());
        this.mCurDayUnSelectPaint.setColor(this.mDelegate.k());
    }

    @Override // com.taobao.android.dinamicx.widget.calander.BaseMonthView, com.taobao.android.dinamicx.widget.calander.BaseView
    public void onPreviewHook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e5f8033", new Object[]{this});
        } else if (this.mDelegate.c() == CalendarDateTextGravity.Top) {
            this.mSelectedCircleRadius = gbg.b(getContext(), 12.0f);
        } else {
            this.mSelectedCircleRadius = (Math.min(this.mItemWidth, this.mItemHeight) / 5) << 1;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.calander.BaseMonthView, com.taobao.android.dinamicx.widget.calander.BaseView
    public void updateItemHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942d76ca", new Object[]{this});
            return;
        }
        super.updateItemHeight();
        this.mTextBaseLine = getTextBaseLintByPaint(this.mCurMonthTextPaint);
        this.mOutRangeTextBaseLine = getTextBaseLintByPaint(this.mOutRangeTextPaint);
        this.mCurrentDayTextBaseLine = getTextBaseLintByPaint(this.mCurDaySelectPaint);
    }

    private float[] getRoundRectRadius(float f, boolean z, boolean z2, boolean z3, boolean z4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("ee4aa376", new Object[]{this, new Float(f), new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)});
        }
        float[] fArr = new float[8];
        if (z) {
            fArr[0] = f;
            fArr[1] = f;
        }
        if (z2) {
            fArr[2] = f;
            fArr[3] = f;
        }
        if (z3) {
            fArr[4] = f;
            fArr[5] = f;
        }
        if (z4) {
            fArr[6] = f;
            fArr[7] = f;
        }
        return fArr;
    }

    @Override // com.taobao.android.dinamicx.widget.calander.MonthView
    public void onDrawCalendarInfo(Canvas canvas, Calendar calendar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7805bfbf", new Object[]{this, canvas, calendar, new Integer(i), new Integer(i2)});
            return;
        }
        Calendar.a calendarInfo = calendar.getCalendarInfo();
        if (calendarInfo != null && !StringUtils.isEmpty(calendarInfo.f12088a)) {
            if (!StringUtils.isEmpty(calendarInfo.b)) {
                try {
                    this.mBackgroundPaint.setColor(Color.parseColor(calendar.getCalendarInfo().b));
                } catch (Throwable unused) {
                }
            }
            int b = gbg.b(getContext(), 6.0f);
            if (calendar.roundRectType == Calendar.RoundRectType.ALL) {
                float f = b;
                canvas.drawRoundRect(new RectF(i, i2, this.mItemWidth + i, this.mItemHeight + i2), f, f, this.mBackgroundPaint);
            } else {
                Path path = new Path();
                boolean z = calendar.roundRectType == Calendar.RoundRectType.LEFT;
                boolean z2 = calendar.roundRectType == Calendar.RoundRectType.RIGHT;
                path.addRoundRect(new RectF(i, i2, this.mItemWidth + i, this.mItemHeight + i2), getRoundRectRadius(b, z, z2, z2, z), Path.Direction.CW);
                canvas.drawPath(path, this.mBackgroundPaint);
            }
            canvas.drawText(calendarInfo.f12088a.length() > 4 ? calendarInfo.f12088a.substring(0, 4) : calendarInfo.f12088a, i + (this.mItemWidth / 2.0f), ((this.mItemHeight + i2) - this.mDelegate.g()) - (this.mCalendarInfoPaint.getFontMetrics().descent / 2.0f), this.mCalendarInfoPaint);
        }
        if (!calendar.isBooked()) {
            return;
        }
        if (this.dateBookedDrawable == null) {
            this.dateBookedDrawable = getResources().getDrawable(R.drawable.calendar_date_booked);
            this.dateBookedDrawable.setBounds(0, 0, gbg.b(getContext(), 11.0f), gbg.b(getContext(), 10.0f));
        }
        canvas.save();
        canvas.translate(((this.mItemWidth + i) - this.dateBookedDrawable.getBounds().width()) - gbg.b(getContext(), 3.0f), this.mDelegate.f() + i2 + gbg.b(getContext(), 1.0f));
        this.dateBookedDrawable.draw(canvas);
        canvas.restore();
    }

    @Override // com.taobao.android.dinamicx.widget.calander.MonthView
    public void onDrawSelected(Canvas canvas, Calendar calendar, int i, int i2, boolean z) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c906c4c4", new Object[]{this, canvas, calendar, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        int i4 = i + (this.mItemWidth / 2);
        if (this.mDelegate.c() == CalendarDateTextGravity.Top) {
            i2 += this.mSelectedCircleRadius;
            i3 = this.mDelegate.f();
        } else {
            i3 = this.mItemHeight / 2;
        }
        int i5 = this.mSelectedCircleRadius;
        float f = i2 + i3;
        this.mSelectedPaint.setShader(new LinearGradient(i4 - i5, f, i5 + i4, f, Color.parseColor("#FF8100"), Color.parseColor("#FE560A"), Shader.TileMode.REPEAT));
        canvas.drawCircle(i4, f, this.mSelectedCircleRadius, this.mSelectedPaint);
    }

    @Override // com.taobao.android.dinamicx.widget.calander.MonthView
    public void onDrawCurrentDayUnSelected(Canvas canvas, Calendar calendar, int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f78c94", new Object[]{this, canvas, calendar, new Integer(i), new Integer(i2)});
            return;
        }
        int i4 = i + (this.mItemWidth / 2);
        if (this.mDelegate.c() == CalendarDateTextGravity.Top) {
            i2 += this.mSelectedCircleRadius;
            i3 = this.mDelegate.f();
        } else {
            i3 = this.mItemHeight / 2;
        }
        canvas.drawCircle(i4, i2 + i3, this.mSelectedCircleRadius, this.mCurrentDayUnSelectedBgPaint);
    }

    @Override // com.taobao.android.dinamicx.widget.calander.MonthView
    public void onDrawText(Canvas canvas, Calendar calendar, int i, int i2, boolean z, boolean z2) {
        Paint paint;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b08663e", new Object[]{this, canvas, calendar, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2)});
            return;
        }
        float f = i + (this.mItemWidth / 2.0f);
        String valueOf = calendar.isCurrentDay() ? "今" : String.valueOf(calendar.getDay());
        if (calendar.isCurrentDay()) {
            canvas.drawText(valueOf, f, (!isInRange(calendar) ? this.mOutRangeTextBaseLine : this.mCurrentDayTextBaseLine) + i2, !isInRange(calendar) ? this.mOutRangeTextPaint : !z2 ? this.mCurDayUnSelectPaint : this.mCurDaySelectPaint);
            return;
        }
        float f2 = (!isInRange(calendar) ? this.mOutRangeTextBaseLine : this.mTextBaseLine) + i2;
        if (z2) {
            paint = this.mSelectTextPaint;
        } else {
            paint = !isInRange(calendar) ? this.mOutRangeTextPaint : this.mCurMonthTextPaint;
        }
        canvas.drawText(valueOf, f, f2, paint);
    }

    public float getTextBaseLintByPaint(Paint paint) {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5bc08c9c", new Object[]{this, paint})).floatValue();
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        if (this.mDelegate.c() == CalendarDateTextGravity.Top) {
            if (this.mSelectedCircleRadius == 0) {
                onPreviewHook();
            }
            f = this.mDelegate.f();
            f2 = ((this.mSelectedCircleRadius + ((fontMetrics.bottom - fontMetrics.top) / 2.0f)) - fontMetrics.descent) + ((fontMetrics.top - fontMetrics.ascent) / 2.0f);
        } else {
            f = ((this.mItemHeight / 2.0f) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f)) - fontMetrics.descent;
            f2 = (fontMetrics.top - fontMetrics.ascent) / 2.0f;
        }
        return f + f2;
    }
}
