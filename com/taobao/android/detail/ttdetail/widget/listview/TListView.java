package com.taobao.android.detail.ttdetail.widget.listview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.o;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.android.detail.ttdetail.widget.listview.feature.features.FeatureList;
import com.taobao.android.detail.ttdetail.widget.listview.feature.features.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.kge;
import tb.tbk;
import tb.tbl;

/* loaded from: classes5.dex */
public class TListView extends ListView implements AbsListView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FeatureList<ListView> mFeatureList;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private float mLastMotionX;
    private float mLastMotionY;
    private List<AbsListView.OnScrollListener> mOnScrollListeners;
    private boolean unScroll;

    static {
        kge.a(2034343683);
        kge.a(1480088762);
        kge.a(1293523495);
        kge.a(-1282900208);
    }

    public static /* synthetic */ Object ipc$super(TListView tListView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1952076612:
                return new Boolean(super.drawChild((Canvas) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue()));
            case -1838743131:
                super.setMeasuredDimension(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1823422940:
                super.removeDetachedView((View) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1488275586:
                super.setOnScrollListener((AbsListView.OnScrollListener) objArr[0]);
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case -894236565:
                super.computeScroll();
                return null;
            case -429021187:
                super.setAdapter((ListAdapter) objArr[0]);
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 678958088:
                super.onFocusChanged(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), (Rect) objArr[2]);
                return null;
            case 1560169965:
                super.measureChild((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public TListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mFeatureList = new FeatureList<>(this);
        this.mOnScrollListeners = new ArrayList();
        this.unScroll = false;
        super.setOnScrollListener(this);
        setOverScrollMode(2);
        this.mFeatureList.init(context, attributeSet, i);
    }

    public TListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TListView(Context context) {
        this(context, null);
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a74ab77e", new Object[]{this, onScrollListener});
        } else {
            this.mOnScrollListeners.add(onScrollListener);
        }
    }

    public void removeOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee590f9c", new Object[]{this, onScrollListener});
        } else if (onScrollListener == null) {
        } else {
            this.mOnScrollListeners.remove(onScrollListener);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb0734b", new Object[]{this, absListView, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        for (AbsListView.OnScrollListener onScrollListener : this.mOnScrollListeners) {
            onScrollListener.onScroll(absListView, i, i2, i3);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532cfb08", new Object[]{this, absListView, new Integer(i)});
            return;
        }
        for (AbsListView.OnScrollListener onScrollListener : this.mOnScrollListeners) {
            if (onScrollListener != null) {
                onScrollListener.onScrollStateChanged(absListView, i);
            }
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.unScroll) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
        } else {
            Iterator<a<? super T>> it = this.mFeatureList.iterator();
            while (it.hasNext()) {
                it.next();
            }
            super.onMeasure(i, i2);
            for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
                this.mFeatureList.get(size);
            }
        }
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        long j = 0;
        if (o.a(y.a(this))) {
            j = System.currentTimeMillis();
            i.a("DetailTime", "onLayout start");
        }
        Iterator<a<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        super.onLayout(z, i, i2, i3, i4);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            this.mFeatureList.get(size);
        }
        if (!o.a(y.a(this))) {
            return;
        }
        i.a("DetailTime", "onLayout end:" + (System.currentTimeMillis() - j) + "ms");
    }

    @Override // android.widget.AbsListView, android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        Iterator<a<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        super.draw(canvas);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            this.mFeatureList.get(size);
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        Iterator<a<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        super.dispatchDraw(canvas);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            this.mFeatureList.get(size);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        Iterator<a<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        super.onDraw(canvas);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            this.mFeatureList.get(size);
        }
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        Iterator<a<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            this.mFeatureList.get(size);
        }
        return onTouchEvent;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        Iterator<a<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            this.mFeatureList.get(size);
        }
        return dispatchTouchEvent;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28781408", new Object[]{this, new Boolean(z), new Integer(i), rect});
            return;
        }
        Iterator<a<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        super.onFocusChanged(z, i, rect);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            this.mFeatureList.get(size);
        }
    }

    @Override // android.widget.AbsListView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        Iterator<a<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        super.onWindowFocusChanged(z);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            this.mFeatureList.get(size);
        }
    }

    public void setMeasuredDimension(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926779c5", new Object[]{this, new Long(j), new Long(j2)});
        } else {
            super.setMeasuredDimension((int) j, (int) j2);
        }
    }

    public void measureChild(View view, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42cbe2b6", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            super.measureChild(view, i, i2);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e9105d4f", new Object[]{this, canvas, view, new Long(j), new Integer(i)})).booleanValue() : super.drawChild(canvas, view, j);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        String str = y.a(this).hashCode() + "";
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            a aVar = this.mFeatureList.get(size);
            if (aVar instanceof tbl) {
                onInterceptTouchEvent |= ((tbl) aVar).a(motionEvent);
            }
        }
        return onInterceptTouchEvent;
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        Iterator<a<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        super.computeScroll();
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            this.mFeatureList.get(size);
        }
    }

    public boolean addFeature(a<? super ListView> aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d746dfcd", new Object[]{this, aVar})).booleanValue() : this.mFeatureList.addFeature(aVar);
    }

    public a<? super ListView> findFeature(Class<? extends a<? super ListView>> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("bb3eb00e", new Object[]{this, cls}) : this.mFeatureList.findFeature(cls);
    }

    public int getFeatureSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("34f0d6db", new Object[]{this})).intValue() : this.mFeatureList.size();
    }

    public boolean removeFeature(Class<? extends a<? super ListView>> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9158b08", new Object[]{this, cls})).booleanValue() : this.mFeatureList.removeFeature(cls);
    }

    public void clearFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed050131", new Object[]{this});
        } else {
            this.mFeatureList.clearFeatures();
        }
    }

    public void init(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa26a346", new Object[]{this, context, attributeSet, new Integer(i)});
        } else {
            this.mFeatureList.init(context, attributeSet, i);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66da7fd", new Object[]{this, listAdapter});
            return;
        }
        Iterator<a<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar instanceof tbk) {
                listAdapter = ((tbk) aVar).a(listAdapter);
            }
        }
        super.setAdapter(listAdapter);
    }

    public boolean isUnScroll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cbc76e9b", new Object[]{this})).booleanValue() : this.unScroll;
    }

    public void setUnScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1de2e5", new Object[]{this, new Boolean(z)});
        } else {
            this.unScroll = z;
        }
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9350c624", new Object[]{this, view, new Boolean(z)});
            return;
        }
        try {
            super.removeDetachedView(view, z);
        } catch (Throwable th) {
            i.a("TListView", "removeDetachedView", th);
        }
    }
}
