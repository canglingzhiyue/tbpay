package com.taobao.android.detail.kit.view.widget.base.uikit;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.kit.view.widget.base.uikit.utils.FeatureList;
import java.util.Iterator;
import tb.etp;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class TTextView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FeatureList<TextView> mFeatureList;

    static {
        kge.a(1307956608);
        kge.a(522558395);
        kge.a(1678904047);
    }

    public static /* synthetic */ Object ipc$super(TTextView tTextView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1838743131:
                super.setMeasuredDimension(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case -894236565:
                super.computeScroll();
                return null;
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
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public TTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mFeatureList = new FeatureList<>(this);
        this.mFeatureList.init(context, attributeSet, i);
        tpc.a("com.taobao.android.detail.kit.view.widget.base.uikit.TTextView");
    }

    public TTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        Iterator<etp<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        super.onMeasure(i, i2);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            this.mFeatureList.get(size);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        Iterator<etp<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        super.onLayout(z, i, i2, i3, i4);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            this.mFeatureList.get(size);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        Iterator<etp<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        super.draw(canvas);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            this.mFeatureList.get(size);
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        Iterator<etp<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        super.dispatchDraw(canvas);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            this.mFeatureList.get(size);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        Iterator<etp<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        super.onDraw(canvas);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            this.mFeatureList.get(size);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        Iterator<etp<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            this.mFeatureList.get(size);
        }
        return onTouchEvent;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        Iterator<etp<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            this.mFeatureList.get(size);
        }
        return dispatchTouchEvent;
    }

    public void setMeasuredDimension(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926779c5", new Object[]{this, new Long(j), new Long(j2)});
        } else {
            super.setMeasuredDimension((int) j, (int) j2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28781408", new Object[]{this, new Boolean(z), new Integer(i), rect});
            return;
        }
        Iterator<etp<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        super.onFocusChanged(z, i, rect);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            this.mFeatureList.get(size);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        Iterator<etp<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        super.onWindowFocusChanged(z);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            this.mFeatureList.get(size);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        Iterator<etp<? super T>> it = this.mFeatureList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        super.computeScroll();
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            this.mFeatureList.get(size);
        }
    }

    public etp<? super TextView> findFeature(Class<? extends etp<? super TextView>> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (etp) ipChange.ipc$dispatch("251d582c", new Object[]{this, cls}) : this.mFeatureList.findFeature(cls);
    }

    public boolean removeFeature(Class<? extends etp<? super TextView>> cls) {
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

    public boolean addFeature(etp<? super TextView> etpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("37da5a4f", new Object[]{this, etpVar})).booleanValue() : this.mFeatureList.addFeature(etpVar);
    }
}
