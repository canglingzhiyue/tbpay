package com.taobao.android.searchbaseframe.xsl.section.refact;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.xsl.refact.XslDataSource;
import com.taobao.android.searchbaseframe.xsl.section.SectionLayout;
import com.taobao.android.searchbaseframe.xsl.section.g;
import tb.inu;
import tb.iru;
import tb.itd;
import tb.kge;

/* loaded from: classes6.dex */
public class XSectionLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean attached;
    private a backgroundSetter;
    private final com.taobao.android.searchbaseframe.xsl.section.refact.a clipDecoration;
    private com.taobao.android.searchbaseframe.xsl.section.d heightChangeListener;
    private b lastStickyHolder;
    private int lastStickySectionIndex;
    private boolean observeSectionChange;
    private PartnerRecyclerView recyclerView;
    private SectionLayout.a sectionChangeListener;
    private final d sectionDecoration;

    /* loaded from: classes6.dex */
    public interface a {
    }

    static {
        kge.a(-1661423535);
        kge.a(989247868);
    }

    public static /* synthetic */ Object ipc$super(XSectionLayout xSectionLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void clearSectionCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2986f611", new Object[]{this});
        }
    }

    public void setBgStyle(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20cd37df", new Object[]{this, jSONObject});
        }
    }

    public void setCellGap(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876dbf4a", new Object[]{this, new Integer(i)});
        }
    }

    public void setHeightUpdateListener(com.taobao.android.searchbaseframe.xsl.section.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56cde9ce", new Object[]{this, dVar});
        }
    }

    public XSectionLayout(Context context) {
        super(context);
        this.sectionDecoration = new d();
        this.clipDecoration = new com.taobao.android.searchbaseframe.xsl.section.refact.a();
        this.lastStickySectionIndex = -1;
        this.attached = false;
    }

    public void setSectionStart(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc407cbd", new Object[]{this, new Integer(i)});
        } else {
            this.sectionDecoration.a(i);
        }
    }

    public void setItemBackgroundProvider(g.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8beb69dc", new Object[]{this, aVar});
        } else {
            this.sectionDecoration.a(aVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        PartnerRecyclerView partnerRecyclerView = this.recyclerView;
        if (partnerRecyclerView == null) {
            super.dispatchDraw(canvas);
            return;
        }
        Path clipPath = partnerRecyclerView.getClipPath();
        if (clipPath != null) {
            canvas.save();
            canvas.clipPath(clipPath);
        }
        super.dispatchDraw(canvas);
        if (clipPath == null) {
            return;
        }
        canvas.restore();
    }

    public void attach(RecyclerView recyclerView, com.taobao.android.searchbaseframe.xsl.section.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a1212fc", new Object[]{this, recyclerView, cVar});
            return;
        }
        if (!this.attached) {
            PartnerRecyclerView partnerRecyclerView = (PartnerRecyclerView) recyclerView;
            this.sectionDecoration.a(partnerRecyclerView, this, cVar);
            this.clipDecoration.a(partnerRecyclerView, cVar);
            this.attached = true;
        }
        this.recyclerView = (PartnerRecyclerView) recyclerView;
    }

    public void setStickyContainer(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cfc1455", new Object[]{this, view});
        } else {
            this.sectionDecoration.a(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        PartnerRecyclerView partnerRecyclerView = this.recyclerView;
        return partnerRecyclerView != null && partnerRecyclerView.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        PartnerRecyclerView partnerRecyclerView = this.recyclerView;
        return partnerRecyclerView != null && partnerRecyclerView.dispatchTouchEvent(motionEvent);
    }

    public void setHeightChangeListener(com.taobao.android.searchbaseframe.xsl.section.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2439a75", new Object[]{this, dVar});
        } else {
            this.heightChangeListener = dVar;
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.sectionDecoration.a();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        com.taobao.android.searchbaseframe.xsl.section.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int measuredHeight = childAt.getMeasuredHeight();
            measureChild(childAt);
            if (measuredHeight != childAt.getMeasuredHeight()) {
                z = true;
            }
        }
        if (!z || (dVar = this.heightChangeListener) == null) {
            return;
        }
        dVar.s();
    }

    public void sectionAttached(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("918c52dd", new Object[]{this, viewHolder});
        } else if (!(viewHolder instanceof com.taobao.android.xsearchplugin.muise.b)) {
        } else {
            com.taobao.android.xsearchplugin.muise.b bVar = (com.taobao.android.xsearchplugin.muise.b) viewHolder;
            bVar.C();
            bVar.a((inu) null);
        }
    }

    public void sectionDetached(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc92554f", new Object[]{this, viewHolder});
        } else if (!(viewHolder instanceof com.taobao.android.xsearchplugin.muise.b)) {
        } else {
            com.taobao.android.xsearchplugin.muise.b bVar = (com.taobao.android.xsearchplugin.muise.b) viewHolder;
            bVar.D();
            bVar.b((inu) null);
        }
    }

    public void measureChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b37eccd", new Object[]{this, view});
            return;
        }
        RecyclerView.LayoutManager layoutManager = this.recyclerView.getLayoutManager();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(getMeasuredWidth(), layoutManager.getWidthMode(), 0, layoutParams.width, true);
        int childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(getMeasuredHeight(), layoutManager.getHeightMode(), 0, layoutParams.height, true);
        if (!shouldMeasure(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
            return;
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setObserveStickySectionChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e140079b", new Object[]{this, new Boolean(z)});
        } else {
            this.observeSectionChange = z;
        }
    }

    public void setSectionChangeListener(SectionLayout.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb84c247", new Object[]{this, aVar});
        } else {
            this.sectionChangeListener = aVar;
        }
    }

    public void setBackgroundSetter(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("974ceaf7", new Object[]{this, aVar});
        } else {
            this.backgroundSetter = aVar;
        }
    }

    public void refreshSectionBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88500cdf", new Object[]{this});
        } else if (this.backgroundSetter != null) {
            for (int i = 0; i < getChildCount(); i++) {
                getChildAt(i).getTranslationY();
            }
        }
    }

    public void sectionTurnSticky(RecyclerView.ViewHolder viewHolder) {
        BaseCellBean baseCellBean;
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ff8babb", new Object[]{this, viewHolder});
        } else if (this.sectionChangeListener == null || !this.observeSectionChange) {
        } else {
            if (viewHolder instanceof b) {
                this.lastStickyHolder = (b) viewHolder;
            }
            if (!(viewHolder instanceof itd)) {
                return;
            }
            itd itdVar = (itd) viewHolder;
            iru iruVar = (iru) itdVar.j();
            if (itdVar.l() == null || this.lastStickySectionIndex == (i = (baseCellBean = (BaseCellBean) itdVar.l()).sectionPos)) {
                return;
            }
            com.taobao.android.searchbaseframe.datasource.impl.a d = iruVar.d();
            if (d instanceof XslDataSource) {
                i2 = ((XslDataSource) d).getCurrentTabIndex();
            } else if (d instanceof com.taobao.android.meta.data.b) {
                i2 = ((com.taobao.android.meta.data.b) d).getIndex();
            }
            this.lastStickySectionIndex = i;
            this.sectionChangeListener.a(i2, i, baseCellBean.id);
        }
    }

    private boolean shouldMeasure(View view, int i, int i2, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18f299e1", new Object[]{this, view, new Integer(i), new Integer(i2), layoutParams})).booleanValue() : view.isLayoutRequested() || isMeasurementNotUpToDate(view.getWidth(), i, layoutParams.width) || isMeasurementNotUpToDate(view.getHeight(), i2, layoutParams.height);
    }

    private static boolean isMeasurementNotUpToDate(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("228e657b", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return true;
        }
        return mode != Integer.MIN_VALUE ? (mode == 0 || (mode == 1073741824 && size == i)) ? false : true : size < i;
    }

    public void addSection(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ec24567", new Object[]{this, view});
        } else {
            addView(view, new ViewGroup.LayoutParams(-1, -2));
        }
    }
}
