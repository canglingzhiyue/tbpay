package com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.commonnavigator.title_views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.ebo;
import tb.ebu;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class ClipableTitleView extends View implements ebo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mClipPercent;
    private String mClipText;
    private int mClipTextColor;
    private Context mContext;
    private Typeface mIconFont;
    private boolean mIsClip;
    private boolean mLeftToRight;
    private Paint mPaint;
    private String mText;
    private Rect mTextBounds;
    private int mTextColor;
    private int mTextSize;

    static {
        kge.a(1019747700);
        kge.a(861718447);
    }

    public static /* synthetic */ Object ipc$super(ClipableTitleView clipableTitleView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ClipableTitleView(Context context) {
        super(context);
        this.mTextBounds = new Rect();
        init(context);
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.commonnavigator.title_views.ClipableTitleView");
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mContext = context;
        int i = this.mTextSize;
        this.mPaint = new Paint(1);
        this.mPaint.setTextSize(i);
        Typeface typeface = this.mIconFont;
        if (typeface != null) {
            this.mPaint.setTypeface(typeface);
        }
        int i2 = i / 2;
        int i3 = i / 4;
        setPadding(i2, i3, i2, i3);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        measureTextBounds();
        setMeasuredDimension(measureWidth(i), measureHeight(i2));
    }

    private int measureWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c3fe147", new Object[]{this, new Integer(i)})).intValue();
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(this.mTextBounds.width() + getPaddingLeft() + getPaddingRight(), size);
        }
        return mode != 0 ? size : this.mTextBounds.width() + getPaddingLeft() + getPaddingRight();
    }

    private int measureHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7d02a4a", new Object[]{this, new Integer(i)})).intValue();
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(this.mTextBounds.height() + getPaddingTop() + getPaddingBottom(), size);
        }
        return mode != 0 ? size : this.mTextBounds.height() + getPaddingTop() + getPaddingBottom();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float width;
        float width2;
        float height;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        int width3 = ((getWidth() - this.mTextBounds.width()) / 2) - (this.mTextSize / 3);
        Paint.FontMetrics fontMetrics = this.mPaint.getFontMetrics();
        int height2 = (int) (((getHeight() - fontMetrics.bottom) - fontMetrics.top) / 2.0f);
        this.mPaint.setColor(this.mTextColor);
        this.mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        Typeface typeface = this.mIconFont;
        if (typeface != null) {
            this.mPaint.setTypeface(typeface);
        }
        if (this.mIsClip) {
            canvas.drawText(this.mClipText, width3, height2, this.mPaint);
        } else {
            canvas.drawText(this.mText, width3, height2, this.mPaint);
        }
        canvas.save();
        this.mPaint.setColor(this.mClipTextColor);
        if (this.mLeftToRight) {
            float width4 = getWidth() * this.mClipPercent;
            height = getHeight();
            width2 = width4;
            width = 0.0f;
        } else {
            width = getWidth() * (1.0f - this.mClipPercent);
            width2 = getWidth();
            height = getHeight();
        }
        canvas.clipRect(width, 0.0f, width2, height);
        if (this.mIsClip) {
            canvas.drawText(this.mClipText, width3, height2, this.mPaint);
        } else {
            canvas.drawText(this.mText, width3, height2, this.mPaint);
        }
        canvas.restore();
    }

    @Override // tb.ebq
    public void onSelected(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a50d941", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mIsClip = true;
        invalidate();
    }

    @Override // tb.ebq
    public void onDeselected(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e117c42", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mIsClip = false;
        requestLayout();
        invalidate();
    }

    @Override // tb.ebq
    public void onLeave(int i, int i2, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce148093", new Object[]{this, new Integer(i), new Integer(i2), new Float(f), new Boolean(z)});
            return;
        }
        this.mLeftToRight = !z;
        this.mClipPercent = 1.0f - f;
        invalidate();
    }

    @Override // tb.ebq
    public void onEnter(int i, int i2, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95087b4", new Object[]{this, new Integer(i), new Integer(i2), new Float(f), new Boolean(z)});
            return;
        }
        this.mLeftToRight = z;
        this.mClipPercent = f;
        invalidate();
    }

    private void measureTextBounds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33191ac7", new Object[]{this});
        } else if (this.mIsClip) {
            Paint paint = this.mPaint;
            String str = this.mClipText;
            paint.getTextBounds(str, 0, str == null ? 0 : str.length(), this.mTextBounds);
        } else {
            Paint paint2 = this.mPaint;
            String str2 = this.mText;
            paint2.getTextBounds(str2, 0, str2 == null ? 0 : str2.length(), this.mTextBounds);
        }
    }

    public void setClipText(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f35c70", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            try {
                str2 = getResources().getString(R.string.taodetail_iconfont_play_fill);
            } catch (Exception e) {
                e.printStackTrace();
                str2 = "";
            }
            this.mClipText = str2 + str;
            requestLayout();
        }
    }

    public void setText(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
            return;
        }
        try {
            str2 = getResources().getString(R.string.taodetail_iconfont_play_fill);
        } catch (Exception e) {
            e.printStackTrace();
            str2 = "";
        }
        this.mText = str2 + str;
        this.mClipText = str2 + str;
        requestLayout();
    }

    public void setTextSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5eecc9", new Object[]{this, new Float(f)});
            return;
        }
        int a2 = ebu.a(this.mContext, f);
        this.mTextSize = a2;
        this.mPaint.setTextSize(a2);
        double d = a2;
        int i = (int) (0.8d * d);
        int i2 = (int) (d * 0.7d);
        setPadding(i, i2, i, i2);
        requestLayout();
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
            return;
        }
        this.mTextColor = i;
        invalidate();
    }

    public void setClipTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95a80a58", new Object[]{this, new Integer(i)});
            return;
        }
        this.mClipTextColor = i;
        invalidate();
    }

    public void setIconFont(Typeface typeface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20c7db75", new Object[]{this, typeface});
            return;
        }
        this.mIconFont = typeface;
        if (this.mIconFont == null) {
            return;
        }
        this.mPaint.setTypeface(typeface);
    }

    @Override // tb.ebo
    public int getContentLeft() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("db32aa64", new Object[]{this})).intValue() : (getLeft() + (getWidth() / 2)) - (this.mTextBounds.width() / 2);
    }

    @Override // tb.ebo
    public int getContentTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfc1798c", new Object[]{this})).intValue();
        }
        Paint.FontMetrics fontMetrics = this.mPaint.getFontMetrics();
        return (int) ((getHeight() / 2) - ((fontMetrics.bottom - fontMetrics.top) / 2.0f));
    }

    @Override // tb.ebo
    public int getContentRight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c88b2393", new Object[]{this})).intValue() : getLeft() + (getWidth() / 2) + (this.mTextBounds.width() / 2);
    }

    @Override // tb.ebo
    public int getContentBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a0925c8", new Object[]{this})).intValue();
        }
        Paint.FontMetrics fontMetrics = this.mPaint.getFontMetrics();
        return (int) ((getHeight() / 2) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f));
    }
}
