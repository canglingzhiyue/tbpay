package com.taobao.search.m3.property;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.m3.BaseItemView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class PropertyView extends BaseItemView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final int capsuleHeight;
    private static final int lineColor;
    private static final int lineDarkColor;
    private static final float lineMarginWhenTwoLines;
    private static final int lineWidth;
    private static final int singleLineItemMargin;
    private static final int singleLineItemMarginCapsule;
    private static final int twoLineItemMargin;
    private com.taobao.search.m3.property.a currentInfo;
    private final ArrayList<com.taobao.search.m3.b> drawList;
    private int itemMargin;
    private float lineMargin;
    private final Paint linePaint;
    private boolean priceMode;
    private final boolean singleLine;
    private boolean singleLineMode;
    private boolean summaryTips;
    private boolean useCapsule;

    public static /* synthetic */ Object ipc$super(PropertyView propertyView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(224640711);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyView(Context context, boolean z) {
        super(context);
        q.c(context, "context");
        this.singleLine = z;
        this.drawList = new ArrayList<>(3);
        this.linePaint = new Paint(1);
        this.linePaint.setColor(lineColor);
    }

    static {
        kge.a(-1707125185);
        Companion = new a(null);
        singleLineItemMargin = l.a(6.0f);
        singleLineItemMarginCapsule = l.a(4.0f);
        twoLineItemMargin = l.a(13.0f);
        lineWidth = l.a(1.0f);
        lineMarginWhenTwoLines = l.a(5.0f);
        lineColor = Color.parseColor("#dddddd");
        lineDarkColor = Color.parseColor("#999999");
        capsuleHeight = l.a(21.0f);
    }

    public final void update(com.taobao.search.m3.property.a info, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06735", new Object[]{this, info, new Boolean(z), new Boolean(z2)});
            return;
        }
        q.c(info, "info");
        if (this.currentInfo == info) {
            return;
        }
        this.summaryTips = z2;
        this.useCapsule = z;
        reset();
        this.currentInfo = info;
        updateDrawList(info, z);
        this.itemMargin = this.singleLineMode ? z ? singleLineItemMarginCapsule : singleLineItemMargin : twoLineItemMargin;
        this.lineMargin = this.singleLineMode ? 0.0f : lineMarginWhenTwoLines;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        Iterator<com.taobao.search.m3.b> it = this.drawList.iterator();
        float f = 0.0f;
        boolean z = true;
        while (it.hasNext()) {
            com.taobao.search.m3.b next = it.next();
            if (next.a()) {
                if (!z && !this.useCapsule) {
                    float f2 = ((-this.itemMargin) - i) / 2.0f;
                    canvas.drawRect(f2, this.lineMargin, f2 + lineWidth, getHeight() - this.lineMargin, this.linePaint);
                }
                next.a(canvas);
                float c = next.c() + this.itemMargin;
                canvas.translate(c, 0.0f);
                f += c;
                z = false;
            }
        }
        canvas.translate(-f, 0.0f);
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void onWidthChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee6394", new Object[]{this});
            return;
        }
        int measuredWidth = getMeasuredWidth();
        Iterator<com.taobao.search.m3.b> it = this.drawList.iterator();
        int i = measuredWidth;
        boolean z = true;
        while (it.hasNext()) {
            com.taobao.search.m3.b next = it.next();
            if (this.priceMode && this.singleLineMode && !z) {
                next.a(false);
            } else if (next.c() <= i) {
                next.a(true);
                i = (i - next.c()) - this.itemMargin;
                z = false;
            } else {
                next.a(false);
            }
        }
    }

    private final void updateDrawList(com.taobao.search.m3.property.a aVar, boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d27ced21", new Object[]{this, aVar, new Boolean(z)});
            return;
        }
        this.drawList.clear();
        this.priceMode = false;
        if (z || this.singleLine || this.summaryTips) {
            for (b bVar : aVar.a()) {
                this.priceMode = bVar.c();
                this.drawList.add(new c(bVar, aVar.b(), z, this));
            }
            z2 = true;
        } else {
            z2 = true;
            for (b bVar2 : aVar.a()) {
                this.priceMode = bVar2.c();
                z2 = z2 && bVar2.d();
                if (bVar2.d()) {
                    this.drawList.add(new c(bVar2, aVar.b(), z, this));
                } else {
                    this.drawList.add(new d(bVar2, this));
                }
            }
        }
        this.singleLineMode = z2;
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getFixedHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2531fe7f", new Object[]{this})).intValue();
        }
        if (this.useCapsule) {
            return capsuleHeight;
        }
        if (this.singleLineMode) {
            return c.Companion.a();
        }
        if (this.priceMode) {
            return d.Companion.a();
        }
        return d.Companion.b();
    }
}
