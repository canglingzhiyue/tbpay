package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.tbliveinteractive.e;

/* loaded from: classes8.dex */
public abstract class qmz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String sTokenTag = "token";

    static {
        kge.a(306678021);
    }

    public static DXRootView a(e eVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("3db50cf1", new Object[]{eVar, context, str});
        }
        if (eVar == null) {
            return null;
        }
        return eVar.p().a(context, str);
    }

    public static void a(e eVar, DXRootView dXRootView, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db78c2d", new Object[]{eVar, dXRootView, jSONObject, str});
        } else if (eVar == null) {
        } else {
            jSONObject.put("token", (Object) str);
            eVar.p().a(dXRootView, jSONObject, str);
        }
    }

    public static DXRootView a(qmn qmnVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("da1b4c4b", new Object[]{qmnVar, context, str});
        }
        if (qmnVar == null) {
            return null;
        }
        return qmnVar.a(context, str);
    }

    public static void a(qmn qmnVar, DXRootView dXRootView, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b9f213", new Object[]{qmnVar, dXRootView, jSONObject, str});
        } else if (qmnVar == null) {
        } else {
            jSONObject.put("token", (Object) str);
            qmnVar.a(dXRootView, jSONObject, str);
        }
    }
}
