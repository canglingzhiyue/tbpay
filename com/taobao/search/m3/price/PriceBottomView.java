package com.taobao.search.m3.price;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.m3.BaseItemView;
import com.taobao.search.m3.i;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class PriceBottomView extends BaseItemView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final int defColor;
    private static final String suffix = "...";
    private static final float textSize;
    private static final int viewHeight;
    private String bottomText;
    private String breakText;
    private final TextPaint paint;

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(238435462);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public PriceBottomView(Context context) {
        super(context);
        this.paint = new TextPaint(1);
        this.paint.setTextSize(textSize);
    }

    static {
        kge.a(-241097026);
        Companion = new a(null);
        textSize = l.a(12.0f);
        viewHeight = l.a(12.0f);
        defColor = Color.parseColor("#999999");
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getFixedHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2531fe7f", new Object[]{this})).intValue() : viewHeight;
    }

    public final boolean update(String str, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("503209a1", new Object[]{this, str, num})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.bottomText = str;
        this.paint.setColor(num != null ? num.intValue() : defColor);
        return true;
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void onWidthChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee6394", new Object[]{this});
            return;
        }
        String str = this.bottomText;
        if (str == null) {
            return;
        }
        if (i.Companion.a(str, this.paint) <= getMeasuredWidth()) {
            this.breakText = str;
            return;
        }
        int breakText = this.paint.breakText(str, true, getMeasuredWidth() - i.Companion.a(suffix, this.paint), null);
        if (breakText <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = str.substring(0, breakText);
        q.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(suffix);
        this.breakText = sb.toString();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        String str = this.breakText;
        if (str == null) {
            return;
        }
        com.taobao.search.m3.a.a(canvas, this.paint, 0.0f, str, 0.0f, viewHeight);
    }
}
