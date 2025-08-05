package com.taobao.android.dinamicx.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.ao;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.bi;
import com.taobao.android.dinamicx.widget.m;
import java.util.ArrayList;
import tb.gbh;
import tb.ivh;
import tb.kge;

/* loaded from: classes.dex */
public class DXNativeFrameLayout extends FrameLayout implements ivh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a cLipRadiusHandler;
    private ao flattenHolder;
    private boolean isV2;
    public m layoutNode;

    static {
        kge.a(-957580139);
        kge.a(2007667529);
    }

    public static /* synthetic */ Object ipc$super(DXNativeFrameLayout dXNativeFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 650865254) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public DXNativeFrameLayout(Context context) {
        super(context);
        this.isV2 = false;
        this.flattenHolder = null;
    }

    public DXNativeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isV2 = false;
        this.flattenHolder = null;
    }

    public DXNativeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isV2 = false;
        this.flattenHolder = null;
    }

    @Override // tb.ivh
    public void setWidgetNode(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d421aa20", new Object[]{this, dXWidgetNode});
        } else {
            this.layoutNode = (m) dXWidgetNode;
        }
    }

    public DXWidgetNode getWidgetNode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("99cab402", new Object[]{this}) : this.layoutNode;
    }

    @Override // tb.ivh
    public ao getFlattenHolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ao) ipChange.ipc$dispatch("fe1901a3", new Object[]{this});
        }
        if (this.flattenHolder == null) {
            this.flattenHolder = new ao();
        }
        return this.flattenHolder;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            if (this.layoutNode != null) {
                this.layoutNode.dispatchMeasure(i, i2);
                setMeasuredDimension(this.layoutNode.getMeasuredWidthAndState(), this.layoutNode.getMeasuredHeightAndState());
            } else if (this.isV2) {
                super.onMeasure(i, i2);
            } else {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                setMeasuredDimension(layoutParams.width, layoutParams.height);
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams2.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824));
                }
            }
        } catch (Throwable th) {
            m mVar = this.layoutNode;
            if (mVar != null && (dXRuntimeContext = mVar.getDXRuntimeContext()) != null) {
                s sVar = new s(dXRuntimeContext.A());
                s.a aVar = new s.a("native", DXMonitorConstant.NATIVE_CRASH, s.DX_NATIVE_ONMEASURE_CRASH);
                if (sVar.c == null) {
                    sVar.c = new ArrayList();
                }
                sVar.c.add(aVar);
                aVar.e = com.taobao.android.dinamicx.exception.a.a(th);
                sVar.b = dXRuntimeContext.c();
                if (dXRuntimeContext.n() != null) {
                    sVar.a(dXRuntimeContext.n().a());
                }
                com.taobao.android.dinamicx.monitor.b.a(sVar);
                return;
            }
            s sVar2 = new s("DinamicX");
            s.a aVar2 = new s.a("native", DXMonitorConstant.NATIVE_CRASH, s.DX_NATIVE_ONMEASURE_CRASH_2);
            aVar2.e = com.taobao.android.dinamicx.exception.a.a(th);
            if (sVar2.c == null) {
                sVar2.c = new ArrayList();
            }
            sVar2.c.add(aVar2);
            com.taobao.android.dinamicx.monitor.b.a(sVar2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        m mVar = this.layoutNode;
        if (mVar != null) {
            mVar.dispatchLayout(z, 0, 0, i3 - i, i4 - i2);
        } else if (this.isV2) {
            super.onLayout(z, i, i2, i3, i4);
        } else if (DinamicXEngine.j()) {
            layoutChildForDX(i, i2, i3, i4, false);
        } else {
            try {
                layoutChildForDX(i, i2, i3, i4, false);
            } catch (Exception unused) {
            }
        }
    }

    private void layoutChildForDX(int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd2bc22", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
            return;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null && childAt.getVisibility() != 8) {
                bi flattenNode = getFlattenNode(childAt);
                if (flattenNode != null) {
                    childAt.layout(flattenNode.getLeft(), flattenNode.getTop(), flattenNode.getLeft() + flattenNode.getMeasuredWidth(), flattenNode.getTop() + flattenNode.getMeasuredHeight());
                } else if (DinamicXEngine.j()) {
                    throw new RuntimeException("layoutChildForDX error. 存在自定义View上没有对应node的情况！！");
                }
            }
        }
    }

    public bi getFlattenNode(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bi) ipChange.ipc$dispatch("93e297cd", new Object[]{this, view});
        }
        if (bx.p()) {
            return gbh.a(view);
        }
        return gbh.b(view);
    }

    public void setClipRadiusHandler(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32bf7192", new Object[]{this, aVar});
        } else {
            this.cLipRadiusHandler = aVar;
        }
    }

    public a getCLipRadiusHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("d24e3242", new Object[]{this}) : this.cLipRadiusHandler;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        try {
            if (this.cLipRadiusHandler == null) {
                super.dispatchDraw(canvas);
            } else if (this.cLipRadiusHandler.a()) {
                super.dispatchDraw(canvas);
            } else {
                this.cLipRadiusHandler.a(this, canvas);
                super.dispatchDraw(canvas);
                this.cLipRadiusHandler.b(this, canvas);
            }
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
            DXWidgetNode b = gbh.b(this);
            if (!(b instanceof DXWidgetNode) || (dXRuntimeContext = b.getDXRuntimeContext()) == null) {
                return;
            }
            s sVar = new s(dXRuntimeContext.A());
            s.a aVar = new s.a("native", DXMonitorConstant.NATIVE_CRASH, s.DX_NATIVE_CRASH_3);
            if (sVar.c == null) {
                sVar.c = new ArrayList();
            }
            sVar.c.add(aVar);
            aVar.e = com.taobao.android.dinamicx.exception.a.a(th);
            sVar.b = dXRuntimeContext.c();
            if (dXRuntimeContext.n() != null) {
                sVar.a(dXRuntimeContext.n().a());
            }
            com.taobao.android.dinamicx.monitor.b.a(sVar);
        }
    }

    public boolean isV2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f45ee6d1", new Object[]{this})).booleanValue() : this.isV2;
    }

    public void setV2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b4be76f", new Object[]{this, new Boolean(z)});
        } else {
            this.isV2 = z;
        }
    }
}
