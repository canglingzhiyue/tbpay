package com.taobao.android.live.plugin.atype.flexalocal.good.view.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Hashtable;
import tb.hin;
import tb.kge;

/* loaded from: classes6.dex */
public class TBLiveAutoTagLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_MAX_DISPLAY_ROWS = 3;
    private static final String TAG;
    public int mBottom;
    public int mLeft;
    private int mMaxRows;
    public int mRight;
    private int mRows;
    public int mTop;
    public Hashtable map;

    static {
        kge.a(1620168760);
        TAG = TBLiveAutoTagLayout.class.getSimpleName();
    }

    public TBLiveAutoTagLayout(Context context) {
        this(context, null);
    }

    public TBLiveAutoTagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TBLiveAutoTagLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.map = new Hashtable();
        this.mMaxRows = 3;
        setOrientation(0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        this.mLeft = 0;
        this.mRight = 0;
        this.mTop = hin.a(12.0f);
        this.mBottom = 0;
        this.mRows = 1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < childCount) {
            View childAt = getChildAt(i3);
            childAt.measure(0, 0);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            i4 += (i3 > 0 ? hin.a(6.0f) : 0) + measuredWidth;
            a aVar = new a();
            this.mLeft = i4 - measuredWidth;
            this.mRight = this.mLeft + childAt.getMeasuredWidth();
            if (i4 >= size) {
                this.mLeft = 0;
                this.mRight = this.mLeft + childAt.getMeasuredWidth();
                this.mTop = i5 + measuredHeight + hin.a(7.0f);
                this.mRows++;
                i4 = measuredWidth;
            }
            if (this.mRows > this.mMaxRows) {
                break;
            }
            this.mBottom = this.mTop + childAt.getMeasuredHeight();
            i5 = this.mTop;
            aVar.f13885a = this.mLeft;
            aVar.b = i5;
            aVar.c = this.mRight;
            aVar.d = this.mBottom;
            aVar.e = this.mRows;
            this.map.put(childAt, aVar);
            i3++;
        }
        setMeasuredDimension(size, this.mBottom);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            a aVar = (a) this.map.get(childAt);
            if (aVar != null) {
                childAt.layout(aVar.f13885a, aVar.b, aVar.c, aVar.d);
            }
        }
    }

    /* loaded from: classes6.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f13885a;
        public int b;
        public int c;
        public int d;
        public int e;

        static {
            kge.a(-661288907);
        }

        private a() {
        }
    }
}
