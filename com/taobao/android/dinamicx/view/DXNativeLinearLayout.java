package com.taobao.android.dinamicx.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
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
public class DXNativeLinearLayout extends LinearLayout implements ivh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a cLipRadiusHandler;
    private ao flattenHolder;
    public m layoutNode;

    static {
        kge.a(-471955247);
        kge.a(2007667529);
    }

    public static /* synthetic */ Object ipc$super(DXNativeLinearLayout dXNativeLinearLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 650865254) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public DXNativeLinearLayout(Context context) {
        super(context);
        this.flattenHolder = null;
    }

    public DXNativeLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.flattenHolder = null;
    }

    public DXNativeLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.flattenHolder = null;
    }

    @Override // android.widget.LinearLayout, android.view.View
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
                return;
            }
            super.onMeasure(i, i2);
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

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        m mVar = this.layoutNode;
        if (mVar != null) {
            mVar.dispatchLayout(z, 0, 0, i3 - i, i4 - i2);
        } else if (DinamicXEngine.j()) {
            layoutForDX(z, i, i2, i3, i4);
        } else {
            try {
                layoutForDX(z, i, i2, i3, i4);
            } catch (Throwable unused) {
            }
        }
    }

    private void layoutForDX(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713aa8ba", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            bi flattenNode = getFlattenNode(childAt);
            childAt.layout(flattenNode.getLeft(), flattenNode.getTop(), flattenNode.getLeft() + flattenNode.getMeasuredWidth(), flattenNode.getTop() + flattenNode.getMeasuredHeight());
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
        }
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
}
