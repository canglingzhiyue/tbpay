package com.taobao.search.m3.discount;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.m3.BaseItemView;
import com.taobao.search.m3.d;
import com.taobao.search.m3.i;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.rvm;

/* loaded from: classes7.dex */
public final class DiscountView extends BaseItemView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final int iconMargin;
    private static final String suffix = "...";
    private static final float textSize;
    private static final int viewHeight;
    private CharSequence breakText;
    private com.taobao.search.m3.discount.a discountInfo;
    private boolean hasIcon;
    private final d icon;
    private int iconWidth;
    private final TextPaint paint;

    public static /* synthetic */ Object ipc$super(DiscountView discountView, String str, Object... objArr) {
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

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-1227966393);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public DiscountView(Context context) {
        super(context);
        this.icon = new d(this, null, 2, null);
        this.paint = new TextPaint(1);
        this.paint.setTextSize(textSize);
    }

    static {
        kge.a(-1261686849);
        Companion = new a(null);
        viewHeight = l.a(12.0f);
        textSize = l.a(12.0f);
        iconMargin = l.a(2.0f);
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getFixedHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2531fe7f", new Object[]{this})).intValue() : viewHeight;
    }

    public final void update(com.taobao.search.m3.discount.a info) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb6e209", new Object[]{this, info});
            return;
        }
        q.c(info, "info");
        if (this.discountInfo == info && !info.j()) {
            return;
        }
        reset();
        info.a(false);
        this.discountInfo = info;
        this.icon.a();
        loadIcon();
        updatePaint();
        invalidate();
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void onWidthChanged() {
        int i;
        com.taobao.search.m3.discount.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee6394", new Object[]{this});
            return;
        }
        this.breakText = null;
        com.taobao.search.m3.discount.a aVar2 = this.discountInfo;
        if (aVar2 == null) {
            return;
        }
        String i2 = aVar2.i();
        if (TextUtils.isEmpty(i2)) {
            i2 = aVar2.d();
            if (TextUtils.isEmpty(i2)) {
                return;
            }
        }
        float a2 = i.Companion.a(i2, this.paint);
        if (this.hasIcon) {
            com.taobao.search.m3.discount.a aVar3 = this.discountInfo;
            if (aVar3 == null) {
                q.a();
            }
            float a3 = aVar3.a();
            if (this.discountInfo == null) {
                q.a();
            }
            i = (int) ((a3 / aVar.b()) * viewHeight);
        } else {
            i = 0;
        }
        this.iconWidth = i;
        int measuredWidth = getMeasuredWidth();
        int i3 = this.iconWidth;
        int i4 = measuredWidth - i3;
        if (i3 > 0) {
            i4 -= iconMargin;
        }
        if (a2 > i4) {
            if (a2 < i.Companion.a(suffix, this.paint)) {
                this.breakText = "";
                return;
            }
            if (i2 == null) {
                q.a();
            }
            int length = i2.length() / 2;
            int i5 = 0;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                StringBuilder sb = new StringBuilder();
                int i6 = i5 + length;
                int i7 = i6 / 2;
                String substring = i2.substring(0, i7);
                q.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                sb.append(substring);
                sb.append(suffix);
                String sb2 = sb.toString();
                String substring2 = z ? i2.substring(i2.length() - rvm.a(i6 / 2.0f)) : i2.substring(i2.length() - i7);
                q.a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
                String str = sb2 + substring2;
                int a4 = (int) i.Companion.a(str, this.paint);
                if (a4 == i4) {
                    this.breakText = str;
                    return;
                }
                if (a4 > i4) {
                    if (z2) {
                        StringBuilder sb3 = new StringBuilder();
                        int i8 = (i5 + (length - 1)) / 2;
                        String substring3 = i2.substring(0, i8);
                        q.a((Object) substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb3.append(substring3);
                        sb3.append(suffix);
                        String substring4 = i2.substring(i2.length() - i8);
                        q.a((Object) substring4, "(this as java.lang.String).substring(startIndex)");
                        sb3.append(substring4);
                        this.breakText = sb3.toString();
                        return;
                    }
                    length = i7;
                } else if (z) {
                    this.breakText = str;
                    return;
                } else if (z2) {
                    z = true;
                } else {
                    i5 = i7;
                }
                if (i5 >= length) {
                    this.breakText = str;
                    return;
                } else if (i5 == length - 1) {
                    z2 = true;
                }
            }
        } else {
            this.breakText = i2;
        }
    }

    private final void updatePaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b8d71c", new Object[]{this});
            return;
        }
        com.taobao.search.m3.discount.a aVar = this.discountInfo;
        if (aVar == null) {
            return;
        }
        TextPaint textPaint = this.paint;
        if (aVar == null) {
            q.a();
        }
        Integer e = aVar.e();
        textPaint.setColor(e != null ? e.intValue() : -16777216);
    }

    private final void loadIcon() {
        com.taobao.search.m3.discount.a aVar;
        com.taobao.search.m3.discount.a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2076bf86", new Object[]{this});
            return;
        }
        this.hasIcon = false;
        com.taobao.search.m3.discount.a aVar3 = this.discountInfo;
        if (aVar3 == null) {
            return;
        }
        if (aVar3 == null) {
            q.a();
        }
        if (aVar3.a() == 0) {
            return;
        }
        com.taobao.search.m3.discount.a aVar4 = this.discountInfo;
        if (aVar4 == null) {
            q.a();
        }
        if (aVar4.b() == 0) {
            return;
        }
        if (this.discountInfo == null) {
            q.a();
        }
        this.hasIcon = !TextUtils.isEmpty(aVar.c());
        d dVar = this.icon;
        com.taobao.search.m3.discount.a aVar5 = this.discountInfo;
        if (aVar5 == null) {
            q.a();
        }
        String c = aVar5.c();
        com.taobao.search.m3.discount.a aVar6 = this.discountInfo;
        if (aVar6 == null) {
            q.a();
        }
        float a2 = aVar6.a();
        if (this.discountInfo == null) {
            q.a();
        }
        float b = a2 / aVar2.b();
        int i = viewHeight;
        dVar.a(c, (int) (b * i), i);
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
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        this.icon.a(canvas);
        CharSequence charSequence = this.breakText;
        if (charSequence == null) {
            return;
        }
        com.taobao.search.m3.a.a(canvas, this.paint, this.iconWidth + iconMargin, charSequence.toString(), 0.0f, getHeight());
    }
}
