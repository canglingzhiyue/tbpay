package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.eventchain.g;
import com.taobao.android.dinamicx.eventchain.j;

/* loaded from: classes6.dex */
public class esi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f27529a;

    static {
        kge.a(131552772);
        f27529a = "channelPage_native_notify_dx";
    }

    public static boolean a(DinamicXEngine dinamicXEngine, String str, DXRootView dXRootView, JSONObject jSONObject) {
        j a2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d12cf5d0", new Object[]{dinamicXEngine, str, dXRootView, jSONObject})).booleanValue() : (dinamicXEngine == null || (a2 = dinamicXEngine.a(str, dXRootView, jSONObject, (String) null, (g) null)) == null || a2.a() != 0) ? false : true;
    }
}
