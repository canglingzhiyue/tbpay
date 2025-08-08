package com.taobao.search.m3.singlerow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.m3.BaseItemView;
import com.taobao.search.m3.d;
import com.taobao.search.m3.i;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.rwf;

/* loaded from: classes7.dex */
public final class SingleRowView extends BaseItemView implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final int bgColor;
    private static final int capsuleHeight;
    private static final int capsulePadding;
    private static final int defTextColor;
    private static final int iconMargin;
    private static final int iconSize;
    private static final int noCapsuleHeight;
    private static final String suffix = "...";
    private static final float textSize;
    private final Paint bgPaint;
    private int borderRadius;
    private String brokeText;
    private int calculateWidth;
    private c currentInfo;
    private boolean hasIcon;
    private boolean hasRightIcon;
    private boolean isBreak;
    private final d leftIcon;
    private com.taobao.search.m3.singlerow.a listener;
    private final d rightIcon;
    private final TextPaint textPaint;
    private float textWidth;
    private boolean useCapsule;

    public static /* synthetic */ Object ipc$super(SingleRowView singleRowView, String str, Object... objArr) {
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

    @Override // com.taobao.search.m3.BaseItemView
    public boolean isWrapContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("920aeb50", new Object[]{this})).booleanValue();
        }
        return true;
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-345450579);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public SingleRowView(Context context) {
        super(context);
        SingleRowView singleRowView = this;
        this.leftIcon = new d(singleRowView, null, 2, null);
        this.rightIcon = new d(singleRowView, null, 2, null);
        this.textPaint = new TextPaint(1);
        this.bgPaint = new Paint(1);
        this.textPaint.setTextSize(textSize);
    }

    static {
        kge.a(-1862453595);
        kge.a(-1201612728);
        Companion = new a(null);
        bgColor = Color.parseColor("#f7f7f7");
        capsuleHeight = l.a(21.0f);
        noCapsuleHeight = l.a(12.0f);
        defTextColor = Color.parseColor("#333333");
        capsulePadding = l.a(6.0f);
        textSize = l.a(12.0f);
        iconSize = l.a(12.0f);
        iconMargin = l.a(2.0f);
    }

    public final boolean isBreak() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d50a8800", new Object[]{this})).booleanValue() : this.isBreak;
    }

    public final void update(c info, boolean z, com.taobao.search.m3.singlerow.a listener) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c6ff986", new Object[]{this, info, new Boolean(z), listener});
            return;
        }
        q.c(info, "info");
        q.c(listener, "listener");
        this.listener = listener;
        if (this.currentInfo == info) {
            return;
        }
        this.hasIcon = !StringUtils.isEmpty(info.f());
        this.hasRightIcon = !StringUtils.isEmpty(info.c());
        reset();
        this.useCapsule = z;
        this.currentInfo = info;
        TextPaint textPaint = this.textPaint;
        Integer g = info.g();
        textPaint.setColor(g != null ? g.intValue() : defTextColor);
        Paint paint = this.bgPaint;
        Integer e = info.e();
        if (e != null) {
            i = e.intValue();
            if (i == 0) {
                i = bgColor;
            }
        } else {
            i = bgColor;
        }
        paint.setColor(i);
        this.borderRadius = info.b() >= 0 ? l.a(info.b()) : -1;
        load();
        if (StringUtils.isEmpty(info.a())) {
            setOnClickListener(null);
            setClickable(false);
            return;
        }
        setOnClickListener(this);
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getWrapContentWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fe693fa7", new Object[]{this})).intValue() : this.calculateWidth;
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void onWidthChanged() {
        int i;
        Integer e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee6394", new Object[]{this});
            return;
        }
        this.calculateWidth = 0;
        this.textWidth = 0.0f;
        this.brokeText = null;
        this.isBreak = false;
        c cVar = this.currentInfo;
        if (cVar == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        if (this.useCapsule || (cVar.e() != null && ((e = cVar.e()) == null || e.intValue() != 0))) {
            int i2 = capsulePadding;
            measuredWidth -= i2 << 1;
            i = (i2 << 1) + 0;
        } else {
            i = 0;
        }
        if (this.hasIcon) {
            int i3 = iconSize;
            int i4 = iconMargin;
            measuredWidth = (measuredWidth - i3) - i4;
            i += i3 + i4;
        }
        if (this.hasRightIcon) {
            int i5 = iconSize;
            measuredWidth -= i5;
            i += i5;
        }
        this.textWidth = i.Companion.a(cVar.d(), this.textPaint);
        float f = measuredWidth;
        if (this.textWidth <= f) {
            this.brokeText = cVar.d();
            this.isBreak = false;
            this.calculateWidth = (int) (i + this.textWidth);
            return;
        }
        this.isBreak = true;
        float a2 = i.Companion.a(suffix, this.textPaint);
        float[] fArr = new float[1];
        int breakText = this.textPaint.breakText(cVar.d(), true, f - a2, fArr);
        if (breakText > 0) {
            this.textWidth = fArr[0] + a2;
            StringBuilder sb = new StringBuilder();
            String d = cVar.d();
            if (d == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String substring = d.substring(0, breakText);
            q.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append(suffix);
            this.brokeText = sb.toString();
            this.calculateWidth = rwf.d((int) (i + this.textWidth), getMeasuredWidth());
            return;
        }
        this.calculateWidth = 0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        Integer e;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        c cVar = this.currentInfo;
        if (cVar == null) {
            return;
        }
        if (this.useCapsule || (cVar.e() != null && ((e = cVar.e()) == null || e.intValue() != 0))) {
            int i = this.borderRadius;
            if (i < 0 || this.useCapsule) {
                i = getHeight() / 2;
            }
            if (i > 0) {
                float f2 = i;
                canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), f2, f2, this.bgPaint);
            } else {
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.bgPaint);
            }
        } else {
            z = false;
        }
        if (z) {
            int i2 = capsulePadding;
            f = i2 + 0.0f;
            canvas.translate(i2, 0.0f);
        } else {
            f = 0.0f;
        }
        float height = (getHeight() - iconSize) / 2.0f;
        if (this.hasIcon) {
            canvas.translate(0.0f, height);
            this.leftIcon.a(canvas);
            canvas.translate(0.0f, -height);
            int i3 = iconSize;
            int i4 = iconMargin;
            f = f + i3 + i4;
            canvas.translate(i3 + i4, 0.0f);
        }
        float f3 = f;
        String str = this.brokeText;
        if (str != null) {
            com.taobao.search.m3.a.a(canvas, this.textPaint, 0.0f, str, 0.0f, getHeight());
            float f4 = this.textWidth;
            f3 += f4;
            canvas.translate(f4 + iconMargin, 0.0f);
        }
        if (this.hasRightIcon) {
            canvas.translate(0.0f, height);
            this.rightIcon.a(canvas);
            canvas.translate(0.0f, -height);
        }
        if (f3 <= 0) {
            return;
        }
        canvas.translate(-f3, 0.0f);
    }

    private final void load() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def666d", new Object[]{this});
            return;
        }
        c cVar = this.currentInfo;
        if (cVar == null) {
            return;
        }
        if (this.hasIcon) {
            d dVar = this.leftIcon;
            String f = cVar.f();
            int i = iconSize;
            dVar.a(f, i, i);
        }
        if (!this.hasRightIcon) {
            return;
        }
        d dVar2 = this.rightIcon;
        String c = cVar.c();
        int i2 = iconSize;
        dVar2.a(c, i2, i2);
    }

    private final void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        this.leftIcon.a();
        this.rightIcon.a();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        load();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        release();
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getFixedHeight() {
        Integer e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2531fe7f", new Object[]{this})).intValue();
        }
        c cVar = this.currentInfo;
        if (cVar == null) {
            return 0;
        }
        if (this.useCapsule || (cVar.e() != null && ((e = cVar.e()) == null || e.intValue() != 0))) {
            return capsuleHeight;
        }
        return noCapsuleHeight;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        com.taobao.search.m3.singlerow.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        c cVar = this.currentInfo;
        if (cVar == null || (aVar = this.listener) == null) {
            return;
        }
        aVar.a(cVar);
    }
}
