package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes2.dex */
public class fkg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-750861588);
    }

    public static void a(String str, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54aaa423", new Object[]{str, dXRuntimeContext});
        } else {
            a.a().a(UltronTradeHybridStage.ON_EVENT_CHAIN_AFTER, a(dXRuntimeContext), b(str, dXRuntimeContext));
        }
    }

    private static String a(DXRuntimeContext dXRuntimeContext) {
        String c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("890a6be7", new Object[]{dXRuntimeContext});
        }
        try {
            c = dXRuntimeContext.C().a().c();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return TextUtils.isEmpty(c) ? "" : c.equalsIgnoreCase(alz.BizKeyOrderList) ? alz.BizKeyOrderList : c.equalsIgnoreCase(alz.BizKeyOrderDetail) ? alz.BizKeyOrderDetail : "";
    }

    private static JSONObject b(String str, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e6e34ec4", new Object[]{str, dXRuntimeContext});
        }
        JSONObject jSONObject = new JSONObject();
        if (dXRuntimeContext != null && dXRuntimeContext.m() != null) {
            jSONObject.put("context", (Object) dXRuntimeContext.m());
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            jSONObject.put("bizName", (Object) str);
        }
        return jSONObject;
    }
}
