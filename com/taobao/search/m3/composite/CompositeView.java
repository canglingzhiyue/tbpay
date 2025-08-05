package com.taobao.search.m3.composite;

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
public final class CompositeView extends BaseItemView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final int bgColor;
    private static final int capsuleHeight;
    private static final int capsulePadding;
    private static final int itemMargin;
    private static final int noCapsuleHeight;
    private final Paint bgPaint;
    private int calculateWidth;
    private b currentInfo;
    private final ArrayList<com.taobao.search.m3.composite.a> drawList;
    private boolean useCapsule;

    public static /* synthetic */ Object ipc$super(CompositeView compositeView, String str, Object... objArr) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositeView(Context context) {
        super(context);
        q.c(context, "context");
        this.drawList = new ArrayList<>(2);
        this.bgPaint = new Paint(1);
        this.bgPaint.setColor(bgColor);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-1403110409);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(294358895);
        Companion = new a(null);
        itemMargin = l.a(4.0f);
        bgColor = Color.parseColor("#f7f7f7");
        capsuleHeight = l.a(21.0f);
        noCapsuleHeight = l.a(12.0f);
        capsulePadding = l.a(6.0f);
    }

    public final void update(b info, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22540d1a", new Object[]{this, info, new Boolean(z)});
            return;
        }
        q.c(info, "info");
        if (this.currentInfo == info) {
            return;
        }
        this.useCapsule = z;
        this.currentInfo = info;
        reset();
        release();
        this.drawList.clear();
        Iterator<c> it = info.a().iterator();
        while (it.hasNext()) {
            c item = it.next();
            ArrayList<com.taobao.search.m3.composite.a> arrayList = this.drawList;
            q.a((Object) item, "item");
            arrayList.add(new com.taobao.search.m3.composite.a(item, this));
        }
        requestLayout();
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getWrapContentWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fe693fa7", new Object[]{this})).intValue() : this.calculateWidth;
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getFixedHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2531fe7f", new Object[]{this})).intValue() : this.useCapsule ? capsuleHeight : noCapsuleHeight;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        if (this.useCapsule) {
            i = 0 + capsulePadding;
            canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), getHeight() / 2.0f, getHeight() / 2.0f, this.bgPaint);
        }
        if (i > 0) {
            canvas.translate(i, 0.0f);
        }
        Iterator<com.taobao.search.m3.composite.a> it = this.drawList.iterator();
        while (it.hasNext()) {
            com.taobao.search.m3.composite.a next = it.next();
            if (next.a()) {
                next.a(canvas);
                int c = next.c() + itemMargin;
                canvas.translate(c, 0.0f);
                i += c;
            }
        }
        if (i <= 0) {
            return;
        }
        canvas.translate(-i, 0.0f);
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void onWidthChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee6394", new Object[]{this});
            return;
        }
        int measuredWidth = getMeasuredWidth();
        float f = 0.0f;
        if (this.useCapsule) {
            int i = capsulePadding;
            measuredWidth -= i * 2;
            f = 0.0f + (i * 2);
        }
        Iterator<com.taobao.search.m3.composite.a> it = this.drawList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            com.taobao.search.m3.composite.a next = it.next();
            next.a(measuredWidth);
            if (next.c() <= measuredWidth) {
                next.a(true);
                measuredWidth = (measuredWidth - next.c()) - itemMargin;
                f += next.c();
                if (!z) {
                    f += itemMargin;
                } else {
                    z = false;
                }
                next.d();
            } else {
                next.b();
                next.a(false);
            }
        }
        this.calculateWidth = (int) f;
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

    private final void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        Iterator<com.taobao.search.m3.composite.a> it = this.drawList.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private final void load() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def666d", new Object[]{this});
            return;
        }
        Iterator<com.taobao.search.m3.composite.a> it = this.drawList.iterator();
        while (it.hasNext()) {
            com.taobao.search.m3.composite.a next = it.next();
            if (next.a()) {
                next.d();
            }
        }
    }
}
