package com.taobao.search.m3.singlerow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.v;
import com.taobao.search.common.util.l;
import java.util.ArrayList;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.rwf;

/* loaded from: classes7.dex */
public final class SingleRowMultiView extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final int itemMargin;
    private static final int lineColor;
    private static final int lineWidth;
    private b currentInfo;
    private final Paint linePaint;
    private final ArrayList<SingleRowView> views;

    public static /* synthetic */ Object ipc$super(SingleRowMultiView singleRowMultiView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-1255151290);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleRowMultiView(Context context) {
        super(context);
        q.c(context, "context");
        this.views = new ArrayList<>();
        this.linePaint = new Paint(1);
        generateViews(2);
        setClipChildren(false);
        setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
    }

    static {
        kge.a(-542653570);
        Companion = new a(null);
        itemMargin = l.a(8.0f);
        lineColor = Color.parseColor("#dddddd");
        lineWidth = l.a(1.0f);
    }

    public final void update(b info, boolean z, com.taobao.search.m3.singlerow.a listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36f0245", new Object[]{this, info, new Boolean(z), listener});
            return;
        }
        q.c(info, "info");
        q.c(listener, "listener");
        if (this.currentInfo == info) {
            return;
        }
        removeAllViews();
        this.currentInfo = info;
        int size = info.a().size() - this.views.size();
        if (size > 0) {
            generateViews(size);
        }
        int size2 = info.a().size();
        for (int i = 0; i < size2; i++) {
            this.views.get(i).update(info.a().get(i), z, listener);
            addView(this.views.get(i));
            SingleRowView singleRowView = this.views.get(i);
            q.a((Object) singleRowView, "views[index]");
            singleRowView.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View view = getChildAt(i);
            q.a((Object) view, "view");
            if (view.getVisibility() != 0) {
                return;
            }
            drawChild(canvas, view, getDrawingTime());
            if (i > 0) {
                float left = (view.getLeft() - (itemMargin / 2)) - (lineWidth / 2);
                b bVar = this.currentInfo;
                if (bVar == null) {
                    q.a();
                }
                Integer g = bVar.a().get(i).g();
                this.linePaint.setColor(g != null ? g.intValue() : lineColor);
                canvas.drawRect(left, 0.0f, left + lineWidth, getHeight(), this.linePaint);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int i3 = size;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            View view = getChildAt(i4);
            if (i4 > 0) {
                i3 -= itemMargin;
            }
            view.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i2);
            if (i4 > 0) {
                if (view != null) {
                    if (((SingleRowView) view).isBreak()) {
                        i3 += itemMargin;
                        break;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.m3.singlerow.SingleRowView");
                }
            }
            q.a((Object) view, "view");
            i3 -= view.getMeasuredWidth();
            SingleRowView singleRowView = this.views.get(i4);
            q.a((Object) singleRowView, "views[index]");
            singleRowView.setVisibility(0);
            i5 = rwf.c(i5, view.getMeasuredHeight());
            if (i3 <= itemMargin) {
                break;
            }
            i4++;
        }
        setMeasuredDimension(size - i3, i5);
    }

    private final void generateViews(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b38a1d03", new Object[]{this, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.views.add(new SingleRowView(getContext()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View view = getChildAt(i6);
            q.a((Object) view, "view");
            if (view.getVisibility() != 0) {
                return;
            }
            int measuredHeight = (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
            view.layout(i5, measuredHeight, view.getMeasuredWidth() + i5, view.getMeasuredHeight() + measuredHeight);
            i5 = i5 + view.getMeasuredWidth() + itemMargin;
        }
    }
}
