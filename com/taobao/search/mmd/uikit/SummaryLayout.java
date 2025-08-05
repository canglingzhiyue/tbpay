package com.taobao.search.mmd.uikit;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.mmd.datasource.bean.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.rwf;

/* loaded from: classes7.dex */
public final class SummaryLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final int bottomTextColor;
    private static final int bottomTextMargin;
    private static final int dividerColor;
    private static final int dividerGap;
    private static final int dividerHeight;
    private static final int dividerWidth;
    private static final int topTextColor;
    private final ArrayList<Float> dividerPositions;
    private final Paint paint;
    private boolean reset;
    private final ArrayList<b> tipViewList;

    public static /* synthetic */ Object ipc$super(SummaryLayout summaryLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.c(context, "context");
        this.paint = new Paint(1);
        this.tipViewList = new ArrayList<>(3);
        this.dividerPositions = new ArrayList<>();
        this.paint.setColor(dividerColor);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(dividerWidth);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-1841022772);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(-1037393276);
        Companion = new a(null);
        dividerGap = l.a(6.5f);
        dividerWidth = l.a(0.6f);
        dividerHeight = l.a(22.0f);
        dividerColor = Color.parseColor("#cccccc");
        topTextColor = Color.parseColor("#333333");
        bottomTextColor = Color.parseColor("#999999");
        bottomTextMargin = l.a(3);
    }

    public final void setSummaryTips(List<? extends f> tipList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01c93b4", new Object[]{this, tipList});
            return;
        }
        q.c(tipList, "tipList");
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View view = getChildAt(i);
            q.a((Object) view, "view");
            if (view.getTag() instanceof b) {
                ArrayList<b> arrayList = this.tipViewList;
                Object tag = view.getTag();
                if (tag == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.mmd.uikit.SummaryLayout.Tip");
                }
                arrayList.add((b) tag);
            }
        }
        removeAllViews();
        for (f fVar : tipList) {
            b generateTip = generateTip();
            generateTip.a().setTag(generateTip);
            generateTip.b().setText(fVar.f());
            generateTip.c().setText(fVar.e());
            addView(generateTip.a(), new ViewGroup.LayoutParams(-2, -2));
        }
        requestLayout();
        this.tipViewList.clear();
        this.reset = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(10000, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(10000, Integer.MIN_VALUE);
        int childCount = getChildCount();
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            getChildAt(i4).measure(makeMeasureSpec, makeMeasureSpec2);
            View childAt = getChildAt(i4);
            q.a((Object) childAt, "getChildAt(i)");
            i3 = rwf.c(childAt.getMeasuredHeight(), i3);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), i3);
    }

    private final b generateTip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("2103ce1c", new Object[]{this});
        }
        if (!this.tipViewList.isEmpty()) {
            b remove = this.tipViewList.remove(0);
            q.a((Object) remove, "tipViewList.removeAt(0)");
            return remove;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(topTextColor);
        TextView textView2 = new TextView(getContext());
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(bottomTextColor);
        linearLayout.addView(textView, new ViewGroup.LayoutParams(-2, -2));
        linearLayout.addView(textView2, new ViewGroup.LayoutParams(-2, -2));
        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        ((LinearLayout.LayoutParams) layoutParams).topMargin = bottomTextMargin;
        return new b(this, linearLayout, textView, textView2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (z || this.reset) {
            this.reset = false;
            this.dividerPositions.clear();
            int measuredWidth = getMeasuredWidth();
            int childCount = getChildCount();
            int i5 = 0;
            float f = -1.0f;
            for (int i6 = 0; i6 < childCount; i6++) {
                View view = getChildAt(i6);
                int i7 = measuredWidth - i5;
                q.a((Object) view, "view");
                if (i7 < view.getMeasuredWidth()) {
                    view.layout(0, 0, 0, 0);
                } else {
                    if (f > 0) {
                        this.dividerPositions.add(Float.valueOf(f));
                    }
                    view.layout(i5, 0, view.getMeasuredWidth() + i5, view.getMeasuredHeight());
                    int right = view.getRight();
                    int i8 = dividerGap;
                    f = right + i8;
                    i5 += (i8 * 2) + view.getMeasuredWidth() + dividerWidth;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        super.dispatchDraw(canvas);
        float height = (getHeight() - dividerHeight) / 2.0f;
        Iterator<Float> it = this.dividerPositions.iterator();
        while (it.hasNext()) {
            Float position = it.next();
            if (canvas != null) {
                q.a((Object) position, "position");
                canvas.drawLine(position.floatValue(), height, position.floatValue(), height + dividerHeight, this.paint);
            }
        }
    }

    /* loaded from: classes7.dex */
    public final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SummaryLayout f19181a;
        private final View b;
        private final TextView c;
        private final TextView d;

        static {
            kge.a(-1889573285);
        }

        public b(SummaryLayout summaryLayout, View view, TextView topText, TextView bottomText) {
            q.c(view, "view");
            q.c(topText, "topText");
            q.c(bottomText, "bottomText");
            this.f19181a = summaryLayout;
            this.b = view;
            this.c = topText;
            this.d = bottomText;
        }

        public final View a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.b;
        }

        public final TextView b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("f7e0415d", new Object[]{this}) : this.c;
        }

        public final TextView c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("213025de", new Object[]{this}) : this.d;
        }
    }
}
