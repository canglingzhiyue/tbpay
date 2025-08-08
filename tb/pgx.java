package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.b;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;

/* loaded from: classes8.dex */
public class pgx extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HANDLEDINAMICXPAGEEVENT = 1544903441687469454L;

    static {
        kge.a(1799525517);
    }

    public static /* synthetic */ Object ipc$super(pgx pgxVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr.length > 0 && (objArr[0] instanceof String) && b.a(dXRuntimeContext, (String) objArr[0]) != null) {
            new b().handleEvent(dXEvent, objArr, dXRuntimeContext);
        } else {
            a(dXEvent, objArr, dXRuntimeContext);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.taobao.android.dinamicx.expression.event.DXEvent r11, java.lang.Object[] r12, com.taobao.android.dinamicx.DXRuntimeContext r13) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.pgx.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L1b
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r10
            r2 = 1
            r1[r2] = r11
            r11 = 2
            r1[r11] = r12
            r11 = 3
            r1[r11] = r13
            java.lang.String r11 = "6dd72af8"
            r0.ipc$dispatch(r11, r1)
            return
        L1b:
            int r0 = r12.length
            if (r0 <= 0) goto Lb5
            r0 = r12[r2]
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto Lb5
            r0 = r12[r2]
            java.lang.String r0 = (java.lang.String) r0
            com.taobao.android.dinamicx.DXRootView r1 = r13.s()
            com.alibaba.fastjson.JSONArray r0 = r10.a(r1, r0)
            java.lang.Object r8 = r13.a()
            boolean r1 = r8 instanceof java.util.Map
            java.lang.String r3 = "DinamicXPageEventHandler"
            if (r1 != 0) goto L40
            java.lang.String r11 = "Dinamic context not instance of Map"
            android.taobao.windvane.util.m.e(r3, r11)
            return
        L40:
            r1 = r8
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r4 = "DXEvent"
            r1.put(r4, r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            android.view.View r4 = r13.v()
            if (r4 == 0) goto L61
            int r5 = tb.bpl.DINAMICX_3_CUSTOM_INPUT_KEY
            java.lang.Object r4 = r4.getTag(r5)
            boolean r5 = r4 instanceof java.util.ArrayList
            if (r5 == 0) goto L61
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r9 = r4
            goto L62
        L61:
            r9 = r11
        L62:
            java.lang.String r11 = "ViewEngine"
            java.lang.Object r11 = r1.get(r11)
            tb.bny r11 = (tb.bny) r11
            if (r11 != 0) goto L72
            java.lang.String r11 = "ViewEngine is null"
            android.taobao.windvane.util.m.e(r3, r11)
            return
        L72:
            java.util.HashMap r3 = new java.util.HashMap
            r4 = 5
            r3.<init>(r4)
            java.lang.Object r4 = r13.f()
            java.lang.String r5 = "dxSubdata"
            r3.put(r5, r4)
            com.alibaba.fastjson.JSONObject r4 = r13.e()
            java.lang.String r5 = "dxData"
            r3.put(r5, r4)
            java.lang.String r4 = "dxRuntimeContext"
            r3.put(r4, r13)
            android.view.View r4 = r13.v()
            java.lang.String r5 = "nativeView"
            r3.put(r5, r4)
            java.lang.String r4 = "bizParams"
            r1.put(r4, r3)
            java.lang.Class<tb.bol> r1 = tb.bol.class
            java.lang.Object r11 = r11.a(r1)
            r3 = r11
            tb.bol r3 = (tb.bol) r3
            if (r0 == 0) goto Laa
            r12[r2] = r0
        Laa:
            com.taobao.android.dinamicx.DXRootView r4 = r13.s()
            r7 = 0
            java.lang.String r5 = ""
            r6 = r12
            r3.a(r4, r5, r6, r7, r8, r9)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.pgx.a(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
    }

    private JSONArray a(DXRootView dXRootView, String str) {
        JSONObject tborderJson;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("4a02706b", new Object[]{this, dXRootView, str});
        }
        if (!StringUtils.isEmpty(str) && dXRootView != null && dXRootView.getExpandWidgetNode() != null && (tborderJson = dXRootView.getExpandWidgetNode().getTborderJson()) != null && tborderJson.getJSONArray(str) != null) {
            return hsz.a(tborderJson.getJSONArray(str));
        }
        return null;
    }
}
