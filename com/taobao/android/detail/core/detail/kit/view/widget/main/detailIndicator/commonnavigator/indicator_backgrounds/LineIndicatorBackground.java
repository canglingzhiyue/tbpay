package com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.commonnavigator.indicator_backgrounds;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Handler;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;
import tb.ebn;
import tb.ebs;
import tb.ebv;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class LineIndicatorBackground extends View implements ebn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ANIMATED_SCROLL_GAP = 250;
    public static final int DEFAULT_SCROLL_INTERVAL = 6;
    public static final int MODE_EXACTLY = 2;
    public static final int MODE_MATCH_EDGE = 0;
    public static final int MODE_WRAP_CONTENT = 1;
    private int mAlpha;
    private List<Integer> mColors;
    private RectF mContainerRect;
    private Interpolator mEndInterpolator;
    private Handler mHandler;
    private float mLeftRightPadding;
    private float mLineHeight;
    private RectF mLineRect;
    private float mLineWidth;
    private LinearGradient mLinearGradient;
    private int mLinearGradient_endColor;
    private int mLinearGradient_startColor;
    private int mMode;
    private Paint mPaint;
    private List<ebv> mPositionDataList;
    private float mRoundRadius;
    private Interpolator mStartInterpolator;
    private float mTopBottomPadding;
    private Path path;
    private float[] radiusArray;

    static {
        kge.a(105070840);
        kge.a(170815741);
    }

    @Override // tb.ebn
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.ebn
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        }
    }

    public LineIndicatorBackground(Context context) {
        super(context);
        this.mStartInterpolator = new LinearInterpolator();
        this.mEndInterpolator = new LinearInterpolator();
        this.mAlpha = 255;
        this.radiusArray = new float[]{12.0f, 12.0f, 12.0f, 12.0f, 12.0f, 12.0f, 12.0f, 12.0f};
        this.mContainerRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.mLineRect = new RectF();
        this.path = new Path();
        init(context);
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.commonnavigator.indicator_backgrounds.LineIndicatorBackground");
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mPaint = new Paint(1);
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mLinearGradient_startColor = 0;
        this.mLinearGradient_endColor = 0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        this.mPaint.setAntiAlias(true);
        if (this.mContainerRect.bottom - this.mContainerRect.top != 0.0f && this.mContainerRect.right - this.mContainerRect.left != 0.0f) {
            if (this.path.isEmpty()) {
                this.path.addRoundRect(this.mContainerRect, this.radiusArray, Path.Direction.CW);
            }
            canvas.clipPath(this.path);
        }
        this.mPaint.setShader(this.mLinearGradient);
        this.mPaint.setAlpha(this.mAlpha);
        RectF rectF = this.mLineRect;
        float f = this.mRoundRadius;
        canvas.drawRoundRect(rectF, f, f, this.mPaint);
    }

    @Override // tb.ebn
    public void onPageScrolled(int i, int i2, float f, int i3) {
        float a2;
        float a3;
        float a4;
        float a5;
        float f2;
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a38f8204", new Object[]{this, new Integer(i), new Integer(i2), new Float(f), new Integer(i3)});
            return;
        }
        List<ebv> list = this.mPositionDataList;
        if (list == null || list.isEmpty()) {
            return;
        }
        ebv a6 = ebs.a(this.mPositionDataList, i);
        ebv a7 = ebs.a(this.mPositionDataList, i2);
        int i4 = this.mMode;
        if (i4 == 0) {
            a2 = a6.f27179a + this.mLeftRightPadding;
            a3 = a7.f27179a + this.mLeftRightPadding;
            a4 = a6.c - this.mLeftRightPadding;
            f2 = a7.c;
            f3 = this.mLeftRightPadding;
        } else if (i4 == 1) {
            a2 = a6.e + this.mLeftRightPadding;
            a3 = a7.e + this.mLeftRightPadding;
            a4 = a6.g - this.mLeftRightPadding;
            f2 = a7.g;
            f3 = this.mLeftRightPadding;
        } else {
            a2 = a6.f27179a + ((a6.a() - this.mLineWidth) / 2.0f);
            a3 = a7.f27179a + ((a7.a() - this.mLineWidth) / 2.0f);
            a4 = ((a6.a() + this.mLineWidth) / 2.0f) + a6.f27179a;
            a5 = ((a7.a() + this.mLineWidth) / 2.0f) + a7.f27179a;
            this.mLineRect.left = a2 + ((a3 - a2) * this.mStartInterpolator.getInterpolation(f)) + this.mLeftRightPadding;
            this.mLineRect.right = (a4 + ((a5 - a4) * this.mEndInterpolator.getInterpolation(f))) - this.mLeftRightPadding;
            RectF rectF = this.mLineRect;
            rectF.top = this.mTopBottomPadding;
            rectF.bottom = getHeight() - this.mTopBottomPadding;
            this.mContainerRect.left = this.mPositionDataList.get(0).f27179a + this.mLeftRightPadding;
            RectF rectF2 = this.mContainerRect;
            List<ebv> list2 = this.mPositionDataList;
            rectF2.right = list2.get(list2.size() - 1).c - this.mLeftRightPadding;
            this.mContainerRect.top = this.mLineRect.top;
            this.mContainerRect.bottom = this.mLineRect.bottom;
            float f4 = this.mLineRect.left;
            this.mLinearGradient = new LinearGradient(f4, this.mLineRect.top, f4 + this.mLineRect.width(), this.mLineRect.bottom, this.mLinearGradient_startColor, this.mLinearGradient_endColor, Shader.TileMode.CLAMP);
            invalidate();
        }
        a5 = f2 - f3;
        this.mLineRect.left = a2 + ((a3 - a2) * this.mStartInterpolator.getInterpolation(f)) + this.mLeftRightPadding;
        this.mLineRect.right = (a4 + ((a5 - a4) * this.mEndInterpolator.getInterpolation(f))) - this.mLeftRightPadding;
        RectF rectF3 = this.mLineRect;
        rectF3.top = this.mTopBottomPadding;
        rectF3.bottom = getHeight() - this.mTopBottomPadding;
        this.mContainerRect.left = this.mPositionDataList.get(0).f27179a + this.mLeftRightPadding;
        RectF rectF22 = this.mContainerRect;
        List<ebv> list22 = this.mPositionDataList;
        rectF22.right = list22.get(list22.size() - 1).c - this.mLeftRightPadding;
        this.mContainerRect.top = this.mLineRect.top;
        this.mContainerRect.bottom = this.mLineRect.bottom;
        float f42 = this.mLineRect.left;
        this.mLinearGradient = new LinearGradient(f42, this.mLineRect.top, f42 + this.mLineRect.width(), this.mLineRect.bottom, this.mLinearGradient_startColor, this.mLinearGradient_endColor, Shader.TileMode.CLAMP);
        invalidate();
    }

    @Override // tb.ebn
    public void onPageScrolled(int i, float f, int i2) {
        float a2;
        float a3;
        float a4;
        float a5;
        float f2;
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            return;
        }
        List<ebv> list = this.mPositionDataList;
        if (list == null || list.isEmpty()) {
            return;
        }
        ebv a6 = ebs.a(this.mPositionDataList, i);
        ebv a7 = ebs.a(this.mPositionDataList, i + 1);
        int i3 = this.mMode;
        if (i3 == 0) {
            a2 = a6.f27179a + this.mLeftRightPadding;
            a3 = a7.f27179a + this.mLeftRightPadding;
            a4 = a6.c - this.mLeftRightPadding;
            f2 = a7.c;
            f3 = this.mLeftRightPadding;
        } else if (i3 == 1) {
            a2 = a6.e + this.mLeftRightPadding;
            a3 = a7.e + this.mLeftRightPadding;
            a4 = a6.g - this.mLeftRightPadding;
            f2 = a7.g;
            f3 = this.mLeftRightPadding;
        } else {
            a2 = a6.f27179a + ((a6.a() - this.mLineWidth) / 2.0f);
            a3 = a7.f27179a + ((a7.a() - this.mLineWidth) / 2.0f);
            a4 = ((a6.a() + this.mLineWidth) / 2.0f) + a6.f27179a;
            a5 = ((a7.a() + this.mLineWidth) / 2.0f) + a7.f27179a;
            this.mLineRect.left = a2 + ((a3 - a2) * this.mStartInterpolator.getInterpolation(f)) + this.mLeftRightPadding;
            this.mLineRect.right = (a4 + ((a5 - a4) * this.mEndInterpolator.getInterpolation(f))) - this.mLeftRightPadding;
            RectF rectF = this.mLineRect;
            rectF.top = this.mTopBottomPadding;
            rectF.bottom = getHeight() - this.mTopBottomPadding;
            float f4 = this.mLineRect.left;
            this.mLinearGradient = new LinearGradient(f4, this.mLineRect.top, f4 + this.mLineRect.width(), this.mLineRect.bottom, this.mLinearGradient_startColor, this.mLinearGradient_endColor, Shader.TileMode.CLAMP);
            invalidate();
        }
        a5 = f2 - f3;
        this.mLineRect.left = a2 + ((a3 - a2) * this.mStartInterpolator.getInterpolation(f)) + this.mLeftRightPadding;
        this.mLineRect.right = (a4 + ((a5 - a4) * this.mEndInterpolator.getInterpolation(f))) - this.mLeftRightPadding;
        RectF rectF2 = this.mLineRect;
        rectF2.top = this.mTopBottomPadding;
        rectF2.bottom = getHeight() - this.mTopBottomPadding;
        float f42 = this.mLineRect.left;
        this.mLinearGradient = new LinearGradient(f42, this.mLineRect.top, f42 + this.mLineRect.width(), this.mLineRect.bottom, this.mLinearGradient_startColor, this.mLinearGradient_endColor, Shader.TileMode.CLAMP);
        invalidate();
    }

    @Override // tb.ebn
    public void onPositionDataProvide(List<ebv> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb28c47", new Object[]{this, list});
            return;
        }
        this.mPositionDataList = list;
        if (list == null) {
            return;
        }
        this.mContainerRect.left = this.mPositionDataList.get(0).f27179a + this.mLeftRightPadding;
        RectF rectF = this.mContainerRect;
        List<ebv> list2 = this.mPositionDataList;
        rectF.right = list2.get(list2.size() - 1).c - this.mLeftRightPadding;
        RectF rectF2 = this.mContainerRect;
        rectF2.top = this.mTopBottomPadding;
        rectF2.bottom = this.mPositionDataList.get(0).d - this.mTopBottomPadding;
    }

    public float getTopBottomPadding() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("351e547e", new Object[]{this})).floatValue() : this.mTopBottomPadding;
    }

    public void setTopBottomPadding(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebf5766", new Object[]{this, new Float(f)});
            return;
        }
        this.mTopBottomPadding = f;
        invalidate();
    }

    public float getLeftRightPadding() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d0f1bee9", new Object[]{this})).floatValue() : this.mLeftRightPadding;
    }

    public void setLeftRightPadding(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d593a5b", new Object[]{this, new Float(f)});
            return;
        }
        this.mLeftRightPadding = f;
        invalidate();
    }

    public float getLineHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e80b2228", new Object[]{this})).floatValue() : this.mLineHeight;
    }

    public void setLineHeight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("503025fc", new Object[]{this, new Float(f)});
        } else {
            this.mLineHeight = f;
        }
    }

    public float getLineWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("540f3df3", new Object[]{this})).floatValue() : this.mLineWidth;
    }

    public void setLineWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cf5229", new Object[]{this, new Float(f)});
        } else {
            this.mLineWidth = f;
        }
    }

    public float getRoundRadius() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d2b79e01", new Object[]{this})).floatValue() : this.mRoundRadius;
    }

    public void setRoundRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("283920db", new Object[]{this, new Float(f)});
            return;
        }
        this.mRoundRadius = f;
        setContainerRectRadius(f, f, f, f);
    }

    public int getMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56d77213", new Object[]{this})).intValue() : this.mMode;
    }

    public void setMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06b0557", new Object[]{this, new Integer(i)});
        } else if (i != 2 && i != 0 && i != 1) {
        } else {
            this.mMode = i;
        }
    }

    public Paint getPaint() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Paint) ipChange.ipc$dispatch("daa8bf5c", new Object[]{this}) : this.mPaint;
    }

    public List<Integer> getColors() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("1dbd58ba", new Object[]{this}) : this.mColors;
    }

    public void setColors(Integer... numArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21b433b", new Object[]{this, numArr});
        } else {
            this.mColors = Arrays.asList(numArr);
        }
    }

    public Interpolator getStartInterpolator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Interpolator) ipChange.ipc$dispatch("b4be87af", new Object[]{this}) : this.mStartInterpolator;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c96266d7", new Object[]{this, interpolator});
            return;
        }
        this.mStartInterpolator = interpolator;
        if (this.mStartInterpolator != null) {
            return;
        }
        this.mStartInterpolator = new LinearInterpolator();
    }

    public Interpolator getEndInterpolator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Interpolator) ipChange.ipc$dispatch("6c89fc28", new Object[]{this}) : this.mEndInterpolator;
    }

    public void setEndInterpolator(Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1607947e", new Object[]{this, interpolator});
            return;
        }
        this.mEndInterpolator = interpolator;
        if (this.mEndInterpolator != null) {
            return;
        }
        this.mEndInterpolator = new LinearInterpolator();
    }

    public void setLinearGradientColors(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dbc4cae", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mLinearGradient_endColor = i2;
        this.mLinearGradient_startColor = i;
    }

    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        } else if (i < 0 || i > 255) {
        } else {
            this.mAlpha = i;
            invalidate();
        }
    }

    public void setContainerRectRadius(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("626f633c", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        float[] fArr = this.radiusArray;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f2;
        fArr[3] = f2;
        fArr[4] = f3;
        fArr[5] = f3;
        fArr[6] = f4;
        fArr[7] = f4;
        invalidate();
    }
}
