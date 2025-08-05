package com.taobao.android.dinamicx.widget.calander;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.main.IndicatorBar;
import com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.CollectionTabLayout;
import java.util.List;
import tb.fxo;
import tb.gbg;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class BaseView extends View implements View.OnClickListener, View.OnLongClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CALENDAR_INFO_TEXT_SIZE = 11;
    public static final int CURRENT_DAY_TEXT_SIZE = 16;
    public static final int TEXT_SIZE = 14;
    public boolean isClick;
    public Paint mCurMonthTextPaint;
    public Paint mCurrentDayUnSelectedBgPaint;
    public int mCurrentItem;
    public b mDelegate;
    public int mItemHeight;
    public int mItemWidth;
    public List<Calendar> mItems;
    public Paint mSelectTextPaint;
    public Paint mSelectedPaint;
    public float mTextBaseLine;
    public int mWeekStartWidth;
    public float mX;
    public float mY;
    private Typeface typeface;

    static {
        kge.a(-1232410313);
        kge.a(-1201612728);
        kge.a(1426707756);
    }

    public static /* synthetic */ Object ipc$super(BaseView baseView, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract void onDestroy();

    public void onPreviewHook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e5f8033", new Object[]{this});
        }
    }

    public abstract void updateCurrentDate();

    public BaseView(Context context) {
        this(context, null);
    }

    public BaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCurMonthTextPaint = new Paint();
        this.mSelectedPaint = new Paint();
        this.mCurrentDayUnSelectedBgPaint = new Paint();
        this.mSelectTextPaint = new Paint();
        this.isClick = true;
        this.mCurrentItem = -1;
    }

    public void initPaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b778ab5", new Object[]{this});
            return;
        }
        initCommonPaintWithTypeFace(this.mCurMonthTextPaint, CollectionTabLayout.SELECTED_TEXT_COLOR, 14);
        initCommonPaintWithTypeFace(this.mSelectTextPaint, -1, 14);
        initCommonPaintWithTypeFace(this.mCurrentDayUnSelectedBgPaint, IndicatorBar.DEFAULT_END_COLOR, 14);
        this.mSelectTextPaint.setStyle(Paint.Style.FILL);
        this.mSelectedPaint.setStyle(Paint.Style.FILL);
        this.mCurrentDayUnSelectedBgPaint.setStyle(Paint.Style.STROKE);
        this.mCurrentDayUnSelectedBgPaint.setStrokeWidth(gbg.b(getContext(), 0.75f));
        setOnClickListener(this);
        setOnLongClickListener(this);
    }

    public void initCommonPaint(Paint paint, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ee63bbf", new Object[]{this, paint, new Integer(i), new Integer(i2)});
            return;
        }
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setColor(i);
        paint.setFakeBoldText(true);
        paint.setTextSize(a.a(getContext(), i2));
    }

    public void initCommonPaintWithTypeFace(Paint paint, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c399b63c", new Object[]{this, paint, new Integer(i), new Integer(i2)});
            return;
        }
        initCommonPaint(paint, i, i2);
        try {
            if (this.typeface == null && this.mDelegate != null && !TextUtils.isEmpty(this.mDelegate.d())) {
                this.typeface = fxo.a().a(this.mDelegate.d(), 0);
            }
            if (this.typeface == null) {
                return;
            }
            paint.setFakeBoldText(false);
            paint.setTypeface(this.typeface);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setup(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d9723dc", new Object[]{this, bVar});
            return;
        }
        this.mDelegate = bVar;
        this.mWeekStartWidth = this.mDelegate.z();
        initPaint();
        updateStyle();
        updateItemHeight();
    }

    public void updateStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3631aef", new Object[]{this});
            return;
        }
        b bVar = this.mDelegate;
        if (bVar == null) {
            return;
        }
        this.mCurMonthTextPaint.setColor(bVar.k());
        this.mSelectTextPaint.setColor(this.mDelegate.l());
        this.mCurMonthTextPaint.setTextSize(this.mDelegate.s());
        this.mSelectTextPaint.setTextSize(this.mDelegate.s());
        this.mSelectedPaint.setStyle(Paint.Style.FILL);
    }

    public void updateItemHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942d76ca", new Object[]{this});
            return;
        }
        this.mItemHeight = this.mDelegate.u();
        Paint.FontMetrics fontMetrics = this.mCurMonthTextPaint.getFontMetrics();
        this.mTextBaseLine = ((this.mItemHeight / 2) - fontMetrics.descent) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mX = motionEvent.getX();
            this.mY = motionEvent.getY();
            this.isClick = true;
        } else if (action != 1) {
            if (action == 2 && this.isClick) {
                if (Math.abs(motionEvent.getY() - this.mY) <= 50.0f) {
                    z = true;
                }
                this.isClick = z;
            }
        } else {
            this.mX = motionEvent.getX();
            this.mY = motionEvent.getY();
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean isSelected(Calendar calendar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc6b5ea0", new Object[]{this, calendar})).booleanValue();
        }
        List<Calendar> list = this.mItems;
        return list != null && list.indexOf(calendar) == this.mCurrentItem;
    }

    public final void update() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
        } else {
            invalidate();
        }
    }

    public final boolean onCalendarIntercept(Calendar calendar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("39bff3c0", new Object[]{this, calendar})).booleanValue() : this.mDelegate.c != null && this.mDelegate.c.a(calendar);
    }

    public final boolean isInRange(Calendar calendar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5159e209", new Object[]{this, calendar})).booleanValue();
        }
        b bVar = this.mDelegate;
        return bVar != null && a.a(calendar, bVar);
    }
}
