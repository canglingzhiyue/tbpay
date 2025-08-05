package com.taobao.search.m3.flash;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.m3.BaseItemView;
import com.taobao.search.m3.i;
import com.taobao.tao.timestamp.TimeStampManager;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class FlashSaleView extends BaseItemView implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final int commonBgColor;
    private static final int commonColor;
    private static final float commonTextSize;
    private static final float dotMargin;
    private static final float dotSize;
    private static final int iconMarginRight;
    private static final int iconSize;
    private static final int textMargin;
    private static final int timeMargin;
    private static final float timeRectRadius;
    private static final int timeRectSize;
    private static final float timeTextSize;
    private static final int timeWidth;
    private static final int viewHeight;
    private final TextPaint commonPaint;
    private final d countDownTime;
    private boolean hasIcon;
    private final com.taobao.search.m3.d icon;
    private final Paint rectPaint;
    private b saleInfo;
    private final TextPaint timePaint;
    private int[] visibilityArray;

    public static /* synthetic */ Object ipc$super(FlashSaleView flashSaleView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else if (hashCode != 2022597206) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.reset();
            return null;
        }
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1454938544);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final float a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : FlashSaleView.access$getCommonTextSize$cp();
        }
    }

    public FlashSaleView(Context context) {
        super(context);
        this.commonPaint = new TextPaint(1);
        this.timePaint = new TextPaint(1);
        this.rectPaint = new Paint(1);
        this.countDownTime = new d(0, 0, 0);
        this.icon = new com.taobao.search.m3.d(this, null, 2, null);
        this.commonPaint.setColor(commonColor);
        this.commonPaint.setTextSize(commonTextSize);
        this.timePaint.setTextSize(timeTextSize);
    }

    public static final /* synthetic */ float access$getCommonTextSize$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f8dbad19", new Object[0])).floatValue() : commonTextSize;
    }

    static {
        kge.a(-1709961112);
        kge.a(1035587026);
        Companion = new a(null);
        iconSize = l.a(11.0f);
        float a2 = l.a(1.5f);
        dotSize = a2;
        dotMargin = a2;
        commonTextSize = l.a(12.0f);
        viewHeight = l.a(12.0f);
        commonColor = Color.parseColor("#FF5000");
        iconMarginRight = l.a(2.0f);
        timeRectSize = l.a(12.0f);
        timeRectRadius = l.a(2.0f);
        timeTextSize = l.a(10.0f);
        timeMargin = l.a(5.5f);
        timeWidth = l.a(74.0f);
        textMargin = l.a(5.0f);
        commonBgColor = Color.parseColor("#FFE5DA");
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        loadIcon();
        com.taobao.search.m3.flash.a.Companion.a(this);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        releaseIcon();
        com.taobao.search.m3.flash.a.Companion.b(this);
    }

    public final void update(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0034731", new Object[]{this, bVar});
        } else if (this.saleInfo == bVar) {
        } else {
            this.saleInfo = bVar;
            if (bVar == null) {
                q.a();
            }
            this.hasIcon = !TextUtils.isEmpty(bVar.e());
            reset();
            loadIcon();
            requestLayout();
        }
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        super.reset();
        releaseIcon();
        b bVar = this.saleInfo;
        if (bVar == null) {
            return;
        }
        this.visibilityArray = new int[bVar.a().size()];
        Paint paint = this.rectPaint;
        Integer f = bVar.f();
        paint.setColor(f != null ? f.intValue() : commonBgColor);
        TextPaint textPaint = this.timePaint;
        Integer d = bVar.d();
        textPaint.setColor(d != null ? d.intValue() : commonColor);
        TextPaint textPaint2 = this.commonPaint;
        Integer d2 = bVar.d();
        textPaint2.setColor(d2 != null ? d2.intValue() : commonColor);
        updateCountDownTime();
    }

    private final void updateCountDownTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b483887c", new Object[]{this});
            return;
        }
        b bVar = this.saleInfo;
        if (bVar == null) {
            q.a();
        }
        long b = bVar.b();
        TimeStampManager instance = TimeStampManager.instance();
        q.a((Object) instance, "TimeStampManager.instance()");
        long currentTimeStamp = b - instance.getCurrentTimeStamp();
        if (currentTimeStamp <= 0) {
            this.countDownTime.a(0);
            this.countDownTime.b(0);
            this.countDownTime.c(0);
            invalidate();
            return;
        }
        long j = 3600000;
        long j2 = currentTimeStamp / j;
        long j3 = currentTimeStamp - (j * j2);
        long j4 = 60000;
        long j5 = j3 / j4;
        this.countDownTime.a((int) j2);
        this.countDownTime.b((int) j5);
        this.countDownTime.c((int) ((j3 - (j4 * j5)) / 1000));
        invalidate();
    }

    private final void loadIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2076bf86", new Object[]{this});
            return;
        }
        b bVar = this.saleInfo;
        if (bVar == null || !this.hasIcon) {
            return;
        }
        com.taobao.search.m3.d dVar = this.icon;
        String e = bVar.e();
        int i = iconSize;
        dVar.a(e, i, i);
    }

    private final void releaseIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470471a7", new Object[]{this});
        } else {
            this.icon.a();
        }
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getFixedHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2531fe7f", new Object[]{this})).intValue() : viewHeight;
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void onWidthChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee6394", new Object[]{this});
            return;
        }
        b bVar = this.saleInfo;
        if (bVar == null) {
            return;
        }
        int measuredWidth = (getMeasuredWidth() - timeWidth) - (!this.hasIcon ? 0 : iconSize + iconMarginRight);
        if (bVar.b() <= 0) {
            measuredWidth += timeWidth;
        }
        int[] iArr = this.visibilityArray;
        if (iArr == null) {
            return;
        }
        for (int size = bVar.a().size() - 1; size >= 0; size--) {
            c cVar = bVar.a().get(size);
            if (cVar.b() + textMargin <= measuredWidth) {
                iArr[size] = 0;
            } else {
                iArr[size] = 8;
            }
            measuredWidth = (measuredWidth - cVar.b()) - textMargin;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        b bVar = this.saleInfo;
        if (bVar == null) {
            return;
        }
        TimeStampManager instance = TimeStampManager.instance();
        q.a((Object) instance, "TimeStampManager.instance()");
        long currentTimeStamp = instance.getCurrentTimeStamp();
        long b = bVar.b();
        boolean z = 1 <= b && currentTimeStamp >= b;
        boolean z2 = !TextUtils.isEmpty(bVar.c());
        if (!this.hasIcon || (z && !z2)) {
            f = 0.0f;
        } else {
            float f2 = (viewHeight - iconSize) >> 1;
            canvas.translate(0.0f, f2);
            this.icon.a(canvas);
            canvas.translate(0.0f, -f2);
            f = iconSize + iconMarginRight;
        }
        if (z) {
            String c = bVar.c();
            if (c == null) {
                return;
            }
            com.taobao.search.m3.a.a(canvas, this.commonPaint, f, c, 0.0f, getHeight());
            return;
        }
        int[] iArr = this.visibilityArray;
        if (iArr == null) {
            return;
        }
        int size = bVar.a().size();
        float f3 = f;
        for (int i = 0; i < size; i++) {
            if (iArr[i] != 8) {
                com.taobao.search.m3.a.a(canvas, this.commonPaint, f3, bVar.a().get(i).a(), 0.0f, getHeight());
                f3 += cVar.b() + textMargin;
            }
        }
        drawTime(canvas, f3);
    }

    private final void drawTime(Canvas canvas, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("464cbb33", new Object[]{this, canvas, new Float(f)});
        } else if (this.countDownTime.a() <= 0 && this.countDownTime.b() <= 0 && this.countDownTime.c() <= 0) {
        } else {
            float height = (getHeight() - timeRectSize) / 2.0f;
            drawTimeItem(canvas, f, height, this.countDownTime.a());
            drawDot(canvas, f);
            float f2 = f + timeRectSize + timeMargin;
            drawTimeItem(canvas, f2, height, this.countDownTime.b());
            drawDot(canvas, f2);
            drawTimeItem(canvas, f2 + timeRectSize + timeMargin, height, this.countDownTime.c());
        }
    }

    private final void drawDot(Canvas canvas, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("859a1f67", new Object[]{this, canvas, new Float(f)});
            return;
        }
        float f2 = f + timeRectSize + (timeMargin / 2.0f);
        float height = getHeight() + dotMargin;
        float f3 = dotSize;
        float f4 = f3 / 2.0f;
        canvas.drawCircle(f2, ((getHeight() - dotMargin) - dotSize) / 2.0f, f4, this.commonPaint);
        canvas.drawCircle(f2, (height + f3) / 2.0f, f4, this.commonPaint);
    }

    private final void drawTimeItem(Canvas canvas, float f, float f2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae4a069", new Object[]{this, canvas, new Float(f), new Float(f2), new Integer(i)});
            return;
        }
        int i2 = timeRectSize;
        float f3 = timeRectRadius;
        canvas.drawRoundRect(f, f2, f + i2, f2 + i2, f3, f3, this.rectPaint);
        String convert = convert(i);
        com.taobao.search.m3.a.a(canvas, this.timePaint, f + ((timeRectSize - i.Companion.a(convert, this.timePaint)) / 2.0f), convert, 0.0f, getHeight());
    }

    private final String convert(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("515c1e37", new Object[]{this, new Integer(i)});
        }
        if (i < 10) {
            StringBuilder sb = new StringBuilder();
            sb.append('0');
            sb.append(i);
            return sb.toString();
        }
        return String.valueOf(i);
    }

    @Override // com.taobao.search.m3.flash.e
    public void onCountDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51afa2b9", new Object[]{this});
        } else if (this.saleInfo == null) {
        } else {
            updateCountDownTime();
        }
    }
}
