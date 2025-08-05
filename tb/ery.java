package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.exception.a;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.bi;
import com.taobao.android.dinamicx.widget.bp;
import com.taobao.android.dinamicx.widget.z;

/* loaded from: classes5.dex */
public class ery extends erv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-744611655);
    }

    public static /* synthetic */ Object ipc$super(ery eryVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public bi a(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, boolean z) {
        z zVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bi) ipChange.ipc$dispatch("4e239fee", new Object[]{this, dXWidgetNode, dXRuntimeContext, new Boolean(z)});
        }
        if (dXWidgetNode == null) {
            return null;
        }
        try {
            bp bpVar = new bp();
            zVar = new z(bpVar);
            try {
                bpVar.setFlattenNode(zVar);
                bpVar.setDXRuntimeContext(dXRuntimeContext.a((DXWidgetNode) bpVar));
                if (dXWidgetNode.getVisibility() != 0) {
                    try {
                        bpVar.setMeasuredDimension(0, 0);
                        return zVar;
                    } catch (Exception e) {
                        e = e;
                    }
                } else {
                    bpVar.setLayoutWidth(dXWidgetNode.getLayoutWidth());
                    bpVar.setLayoutHeight(dXWidgetNode.getLayoutHeight());
                    bpVar.setMeasuredDimension(dXWidgetNode.getMeasuredWidthAndState(), dXWidgetNode.getMeasuredHeightAndState());
                    bpVar.setStatFlag(256);
                    try {
                        a(dXWidgetNode, 0, 0, dXWidgetNode.getMeasuredWidth(), dXWidgetNode.getMeasuredHeight(), zVar, zVar, false, false, z, 1, 1.0f, false);
                        return zVar;
                    } catch (Exception e2) {
                        e = e2;
                        zVar = zVar;
                    }
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e4) {
            e = e4;
            zVar = null;
        }
        if (DinamicXEngine.j()) {
            e.printStackTrace();
        }
        if (dXRuntimeContext == null || dXRuntimeContext.n() == null || dXRuntimeContext.n().c == null) {
            return zVar;
        }
        s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE_DETAIL, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PERFORM_FLATTEN, 80004);
        aVar.e = "DXLayoutManager#performFlatten " + a.a(e);
        dXRuntimeContext.n().c.add(aVar);
        return zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0226 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.taobao.android.dinamicx.widget.DXWidgetNode r30, int r31, int r32, int r33, int r34, com.taobao.android.dinamicx.widget.z r35, com.taobao.android.dinamicx.widget.z r36, boolean r37, boolean r38, boolean r39, int r40, float r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ery.a(com.taobao.android.dinamicx.widget.DXWidgetNode, int, int, int, int, com.taobao.android.dinamicx.widget.z, com.taobao.android.dinamicx.widget.z, boolean, boolean, boolean, int, float, boolean):void");
    }
}
