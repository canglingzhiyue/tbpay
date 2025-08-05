package com.taobao.android.dinamicx;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.erv;
import tb.gbg;
import tb.kge;

/* loaded from: classes.dex */
public class x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(285924540);
    }

    public void a(DXWidgetNode dXWidgetNode, int i, int i2, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2634198", new Object[]{this, dXWidgetNode, new Integer(i), new Integer(i2), dXRuntimeContext});
            return;
        }
        if (dXWidgetNode != null) {
            try {
                if (dXWidgetNode instanceof com.taobao.android.dinamicx.widget.m) {
                    if (a(i)) {
                        i = gbg.a();
                    }
                    if (a(i2)) {
                        i2 = gbg.b();
                    }
                    int childMeasureSpec = com.taobao.android.dinamicx.widget.m.getChildMeasureSpec(i, 0, dXWidgetNode.getLayoutWidth());
                    int childMeasureSpec2 = com.taobao.android.dinamicx.widget.m.getChildMeasureSpec(i2, 0, dXWidgetNode.getLayoutHeight());
                    if (dXWidgetNode.getVisibility() != 0) {
                        return;
                    }
                    dXWidgetNode.measure(childMeasureSpec, childMeasureSpec2);
                    return;
                }
            } catch (Exception e) {
                if (DinamicXEngine.j()) {
                    e.printStackTrace();
                }
                if (dXRuntimeContext == null || dXRuntimeContext.n() == null || dXRuntimeContext.n().c == null) {
                    return;
                }
                s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE_DETAIL, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PERFORM_MEASURE, 80002);
                aVar.e = "DXLayoutManager#performMeasure" + com.taobao.android.dinamicx.exception.a.a(e);
                dXRuntimeContext.n().c.add(aVar);
                return;
            }
        }
        s.a aVar2 = new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE_DETAIL, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PERFORM_MEASURE, 80001);
        aVar2.e = "DXLayoutManager#performMeasure widgetNode == null || !(widgetNode instanceof DXLayout)";
        dXRuntimeContext.n().c.add(aVar2);
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return View.MeasureSpec.getMode(i) == 0 && View.MeasureSpec.getSize(i) == 0;
    }

    public void a(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("548c4ef8", new Object[]{this, dXWidgetNode, dXRuntimeContext});
        } else if (dXWidgetNode == null) {
        } else {
            try {
                if (dXWidgetNode.getVisibility() != 0) {
                    return;
                }
                dXWidgetNode.layout(0, 0, dXWidgetNode.getMeasuredWidth(), dXWidgetNode.getMeasuredHeight());
            } catch (Exception e) {
                if (DinamicXEngine.j()) {
                    e.printStackTrace();
                }
                if (dXRuntimeContext == null || dXRuntimeContext.n() == null || dXRuntimeContext.n().c == null) {
                    return;
                }
                s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE_DETAIL, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PERFORM_LAYOUT, 80003);
                aVar.e = "DXLayoutManager#performLayout " + com.taobao.android.dinamicx.exception.a.a(e);
                dXRuntimeContext.n().c.add(aVar);
            }
        }
    }

    public com.taobao.android.dinamicx.widget.j a(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, boolean z) {
        com.taobao.android.dinamicx.widget.j jVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.widget.j) ipChange.ipc$dispatch("6de01eb7", new Object[]{this, dXWidgetNode, dXRuntimeContext, new Boolean(z)});
        }
        if (dXWidgetNode == null) {
            return null;
        }
        try {
            jVar = new com.taobao.android.dinamicx.widget.j();
            try {
                jVar.setFlatten(true);
                jVar.setReferenceNode(jVar);
                jVar.setDXRuntimeContext(dXRuntimeContext.a((DXWidgetNode) jVar));
            } catch (Exception e) {
                e = e;
                if (DinamicXEngine.j()) {
                    e.printStackTrace();
                }
                if (dXRuntimeContext != 0 && dXRuntimeContext.n() != null && dXRuntimeContext.n().c != null) {
                    s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE_DETAIL, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PERFORM_FLATTEN, 80004);
                    aVar.e = "DXLayoutManager#performFlatten " + com.taobao.android.dinamicx.exception.a.a(e);
                    dXRuntimeContext.n().c.add(aVar);
                }
                return jVar;
            }
        } catch (Exception e2) {
            e = e2;
            jVar = null;
        }
        if (dXWidgetNode.getVisibility() != 0) {
            jVar.setMeasuredDimension(0, 0);
            return jVar;
        }
        jVar.setLayoutWidth(dXWidgetNode.getLayoutWidth());
        jVar.setLayoutHeight(dXWidgetNode.getLayoutHeight());
        jVar.setMeasuredDimension(dXWidgetNode.getMeasuredWidthAndState(), dXWidgetNode.getMeasuredHeightAndState());
        jVar.setStatFlag(256);
        new com.taobao.android.dinamicx.widget.z(jVar);
        a(dXWidgetNode, 0, 0, dXWidgetNode.getMeasuredWidth(), dXWidgetNode.getMeasuredHeight(), jVar, false, false, z, 1, 1.0f);
        return jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0212 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.taobao.android.dinamicx.widget.DXWidgetNode r28, int r29, int r30, int r31, int r32, com.taobao.android.dinamicx.widget.DXWidgetNode r33, boolean r34, boolean r35, boolean r36, int r37, float r38) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.x.a(com.taobao.android.dinamicx.widget.DXWidgetNode, int, int, int, int, com.taobao.android.dinamicx.widget.DXWidgetNode, boolean, boolean, boolean, int, float):void");
    }

    public boolean a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("613bf3cb", new Object[]{this, dXWidgetNode})).booleanValue() : erv.a(dXWidgetNode);
    }
}
