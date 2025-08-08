package com.taobao.search.m3.video;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.m3.d;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class CountDownView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final int bgColor;
    private static final int circleMargin;
    private static final float circleRadius;
    private static final int iconHeight;
    private static final int iconMargin;
    private static final int iconSize;
    private static final int pl;
    private static final int pr;
    private static final float radius;
    private static final int textColor = -1;
    private static final float textSize;
    private static final int timeMargin;
    private static final int viewHeight;
    private final Paint bgPaint;
    private final d icon;
    private String minuteStr;
    private float minuteWidth;
    private final TextPaint paint;
    private String secondStr;
    private boolean showCountDown;

    public static /* synthetic */ Object ipc$super(CountDownView countDownView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue();
        }
        return true;
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-702370379);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public CountDownView(Context context) {
        super(context);
        this.icon = new d(this, null, 2, null);
        this.paint = new TextPaint(1);
        this.bgPaint = new Paint(1);
        this.minuteStr = "";
        this.secondStr = "";
        this.bgPaint.setColor(bgColor);
        this.paint.setColor(-1);
        this.paint.setTextSize(textSize);
    }

    static {
        kge.a(887191213);
        Companion = new a(null);
        viewHeight = l.a(15.0f);
        textSize = l.a(11.0f);
        bgColor = Color.parseColor("#4c000000");
        radius = viewHeight / 2.0f;
        circleMargin = l.a(5.0f);
        circleRadius = l.a(1.0f);
        iconSize = l.a(6.0f);
        iconHeight = l.a(6.5f);
        iconMargin = l.a(2.0f);
        pl = l.a(5.0f);
        pr = l.a(3.0f);
        timeMargin = l.a(3.0f);
    }

    public final void update(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e540b64", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
            return;
        }
        if (this.showCountDown == z) {
            z2 = false;
        }
        this.showCountDown = z;
        this.showCountDown = z;
        if (z) {
            int i3 = (i - i2) / 1000;
            this.minuteStr = fillZero(i3 / 60);
            this.secondStr = fillZero(i3 % 60);
        }
        if (!z && !z2) {
            return;
        }
        requestLayout();
    }

    private final String fillZero(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2358d4f", new Object[]{this, new Integer(i)});
        }
        if (i < 10) {
            StringBuilder sb = new StringBuilder();
            sb.append('0');
            sb.append(i);
            return sb.toString();
        }
        return String.valueOf(i);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        float f = pl + pr + iconSize;
        if (this.showCountDown && !StringUtils.isEmpty(this.minuteStr) && !StringUtils.isEmpty(this.secondStr)) {
            this.minuteWidth = this.paint.measureText(this.minuteStr);
            f = f + iconMargin + this.minuteWidth + this.paint.measureText(this.secondStr) + timeMargin;
        }
        setMeasuredDimension((int) f, viewHeight);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.icon.a();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.icon.a("https://gw.alicdn.com/mt/TB1UosV7kY2gK0jSZFgXXc5OFXa-24-26.png", iconSize, iconHeight);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        float f = radius;
        canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), f, f, this.bgPaint);
        int i3 = pl;
        float f2 = i3;
        canvas.translate(i3, 0.0f);
        canvas.translate(0.0f, (getHeight() - iconHeight) / 2.0f);
        this.icon.a(canvas);
        canvas.translate(0.0f, (-(getHeight() - iconHeight)) / 2.0f);
        if (this.showCountDown) {
            float f3 = f2 + i + i2;
            canvas.translate(iconSize + iconMargin, 0.0f);
            com.taobao.search.m3.a.a(canvas, this.paint, 0.0f, this.minuteStr, 0.0f, getHeight());
            float f4 = this.minuteWidth;
            int i4 = timeMargin;
            float f5 = f3 + f4 + (i4 / 2.0f);
            canvas.translate((i4 / 2.0f) + f4, 0.0f);
            canvas.drawCircle(0.0f, (getHeight() - circleMargin) / 2.0f, circleRadius, this.paint);
            canvas.drawCircle(0.0f, (getHeight() + circleMargin) / 2.0f, circleRadius, this.paint);
            int i5 = timeMargin;
            f2 = f5 + (i5 / 2.0f);
            canvas.translate(i5 / 2.0f, 0.0f);
            com.taobao.search.m3.a.a(canvas, this.paint, 0.0f, this.secondStr, 0.0f, getHeight());
        }
        canvas.translate(-f2, 0.0f);
    }
}
