package com.taobao.search.m3.interactive;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
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
public final class InteractiveView extends BaseItemView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final int itemMargin;
    private static final int viewHeight;
    private static final int viewHeight2024;
    private int currentHeight;
    private b currentInfo;
    private e currentTarget;
    private final ArrayList<com.taobao.search.m3.interactive.a> drawList;
    private d tagListener;
    private final ArrayList<e> touchList;

    public static /* synthetic */ Object ipc$super(InteractiveView interactiveView, String str, Object... objArr) {
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
            kge.a(164641325);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public InteractiveView(Context context) {
        super(context);
        this.drawList = new ArrayList<>();
        this.touchList = new ArrayList<>();
        this.currentHeight = viewHeight;
    }

    static {
        kge.a(-1807369947);
        Companion = new a(null);
        viewHeight = l.a(21.0f);
        viewHeight2024 = l.a(20.0f);
        itemMargin = l.a(4.0f);
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getFixedHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2531fe7f", new Object[]{this})).intValue() : this.currentHeight;
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void onWidthChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee6394", new Object[]{this});
            return;
        }
        int measuredWidth = getMeasuredWidth();
        this.touchList.clear();
        Iterator<com.taobao.search.m3.interactive.a> it = this.drawList.iterator();
        int i = 0;
        while (it.hasNext()) {
            com.taobao.search.m3.interactive.a next = it.next();
            if (next.c() <= measuredWidth) {
                next.d();
                next.a(true);
                this.touchList.add(new e(next.e(), i, next.c() + i));
                measuredWidth = (measuredWidth - next.c()) - itemMargin;
                i += next.c() + itemMargin;
            } else {
                next.b();
                next.a(false);
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        Iterator<com.taobao.search.m3.interactive.a> it = this.drawList.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            com.taobao.search.m3.interactive.a next = it.next();
            if (next.a()) {
                next.a(canvas);
                float c = next.c() + itemMargin;
                canvas.translate(c, 0.0f);
                f += c;
            }
        }
        if (f <= 0) {
            return;
        }
        canvas.translate(-f, 0.0f);
    }

    public final void update(b info, d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("194886e8", new Object[]{this, info, dVar, new Boolean(z)});
            return;
        }
        q.c(info, "info");
        this.tagListener = dVar;
        if (this.currentInfo == info) {
            return;
        }
        this.currentHeight = z ? viewHeight2024 : viewHeight;
        reset();
        this.currentInfo = info;
        release();
        this.drawList.clear();
        for (c cVar : info.a()) {
            this.drawList.add(new com.taobao.search.m3.interactive.a(cVar, this, z, info.c()));
        }
        if (!info.b()) {
            info.a(true);
            if (dVar != null) {
                dVar.a(info);
            }
        }
        requestLayout();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (getMeasuredWidth() <= 0) {
            return;
        }
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
        Iterator<com.taobao.search.m3.interactive.a> it = this.drawList.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        d dVar;
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, event})).booleanValue();
        }
        q.c(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.currentTarget = findTag(event);
            if (this.currentTarget == null) {
                return false;
            }
        } else if (actionMasked != 1) {
            if (actionMasked == 2 && (eVar = this.currentTarget) != null && (event.getX() < eVar.b() || event.getX() > eVar.c())) {
                this.currentTarget = null;
                return false;
            }
        } else {
            e eVar2 = this.currentTarget;
            if (eVar2 != null && (dVar = this.tagListener) != null) {
                c a2 = eVar2.a();
                b bVar = this.currentInfo;
                if (bVar == null) {
                    q.a();
                }
                dVar.a(a2, bVar);
            }
        }
        return true;
    }

    private final e findTag(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("a2cd4b05", new Object[]{this, motionEvent});
        }
        float x = motionEvent.getX();
        Iterator<e> it = this.touchList.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (x >= next.b() && x <= next.c()) {
                return next;
            }
        }
        return null;
    }

    private final void load() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def666d", new Object[]{this});
            return;
        }
        Iterator<com.taobao.search.m3.interactive.a> it = this.drawList.iterator();
        while (it.hasNext()) {
            com.taobao.search.m3.interactive.a next = it.next();
            if (next.a()) {
                next.d();
            }
        }
    }
}
