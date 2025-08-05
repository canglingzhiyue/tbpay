package com.taobao.android.upp;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.external.UCPManager;
import com.taobao.android.upp.e;
import com.taobao.tao.log.TLog;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class UppProtocolImpl implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "UppProtocolImpl";
    private static boolean sInitSwitch;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final UppProtocolImpl f15794a = new g();

        public static /* synthetic */ UppProtocolImpl a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (UppProtocolImpl) ipChange.ipc$dispatch("8a49221d", new Object[0]) : f15794a;
        }
    }

    @Override // com.taobao.android.upp.e
    public boolean isDisableWithSchemeIdAndBizIdString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d4241a1", new Object[]{this, str})).booleanValue();
        }
        return true;
    }

    static {
        kge.a(1239671808);
        kge.a(-236065344);
        sInitSwitch = false;
    }

    public static e getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("e2c92c1b", new Object[0]) : a.a();
    }

    public static UppProtocolImpl getInstanceImpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UppProtocolImpl) ipChange.ipc$dispatch("6210d973", new Object[0]) : a.a();
    }

    public UppProtocolImpl() {
        sInitSwitch = getUppEnabled();
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!b.a()) {
        } else {
            BehaviR.getInstance().registerSolution("UCP", com.taobao.android.ucp.a.d());
        }
    }

    @Override // com.taobao.android.upp.e
    @Deprecated
    public String registerResourceSpace(String str, JSONObject jSONObject, e.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("547160bc", new Object[]{this, str, jSONObject, aVar}) : registerResourceSpace((String) null, (Activity) null, str, jSONObject, aVar);
    }

    @Override // com.taobao.android.upp.e
    @Deprecated
    public String registerResourceSpace(String str, Activity activity, String str2, JSONObject jSONObject, e.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f85f7258", new Object[]{this, str, activity, str2, jSONObject, aVar}) : com.taobao.android.ucp.a.d().a(str, activity, str2, jSONObject, aVar, null);
    }

    @Override // com.taobao.android.upp.e
    @Deprecated
    public String registerResourceSpace(String str, Object obj, String str2, JSONObject jSONObject, e.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9defe5e2", new Object[]{this, str, obj, str2, jSONObject, aVar}) : com.taobao.android.ucp.a.d().a(str, obj, str2, jSONObject, aVar, null);
    }

    @Deprecated
    public String registerResourceScheme(String str, Object obj, String str2, JSONObject jSONObject, e.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("db82a784", new Object[]{this, str, obj, str2, jSONObject, bVar}) : com.taobao.android.ucp.a.d().a(str, obj, str2, jSONObject, null, new d(bVar));
    }

    @Deprecated
    public String registerResourceSpace(String str, Activity activity, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("19751dbe", new Object[]{this, str, activity, str2}) : com.taobao.android.ucp.a.d().a(str, activity, str2);
    }

    @Deprecated
    public void registerUPPCallbackWithScene(String str, Activity activity, e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ec5d0c", new Object[]{this, str, activity, aVar});
        } else {
            com.taobao.android.ucp.a.d().a(str, activity, aVar, null);
        }
    }

    @Override // com.taobao.android.upp.e
    public void registerUPPCallbackWithScene(String str, Object obj, e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97714296", new Object[]{this, str, obj, aVar});
        } else {
            com.taobao.android.ucp.a.d().a(str, obj, aVar, null);
        }
    }

    public void registerUPPCallbackWithScene(String str, Object obj, e.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97722b54", new Object[]{this, str, obj, cVar});
        } else {
            com.taobao.android.ucp.a.d().a(str, obj, null, cVar);
        }
    }

    public void unRegisterUPPCallbackWithScene(String str, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c0e598b", new Object[]{this, str, activity});
        } else {
            com.taobao.android.ucp.a.d().a(str, activity);
        }
    }

    @Override // com.taobao.android.upp.e
    public void unregisterResourceSpace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3035384d", new Object[]{this, str});
        } else {
            com.taobao.android.ucp.a.d().a(str);
        }
    }

    @Override // com.taobao.android.upp.e
    public boolean isUppEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6790ea1", new Object[]{this})).booleanValue();
        }
        if (!sInitSwitch) {
            UtUtils.a("UPP", "upp_not_available", "init_switch_close", null);
            return false;
        } else if (!getUppEnabled()) {
            UtUtils.a("UPP", "upp_not_available", "switch_close", null);
            return false;
        } else if (com.taobao.android.behavix.utils.c.a()) {
            return true;
        } else {
            UtUtils.a("UPP", "upp_not_available", "device_downgrade", null);
            return false;
        }
    }

    public String registerUCPResourceScheme(String str, JSONObject jSONObject, String str2, Object obj, e.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1741054", new Object[]{this, str, jSONObject, str2, obj, bVar}) : com.taobao.android.ucp.a.d().a(str2, obj, str, jSONObject, null, new c(bVar));
    }

    public String registerUCPResourceScheme(String str, JSONObject jSONObject, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8631894d", new Object[]{this, str, jSONObject, str2, obj}) : com.taobao.android.ucp.a.d().a(str2, obj, str, jSONObject, null, null);
    }

    private boolean getUppEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ee6553cd", new Object[]{this})).booleanValue() : b.a();
    }

    public void registerUCPPlans(JSONObject jSONObject, JSONObject jSONObject2, String str, Activity activity, e.b bVar, e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a002df21", new Object[]{this, jSONObject, jSONObject2, str, activity, bVar, aVar});
        } else if (com.taobao.android.behavix.d.e()) {
        } else {
            UtUtils.a("UCP", 19999, "behavixNull", "registerUCPPlans", "", "");
            printThreadName("registerUCPPlans");
        }
    }

    @Override // com.taobao.android.upp.e
    public void addBizFeatures(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc5b50b9", new Object[]{this, map, str});
        } else if (com.taobao.android.behavix.d.e()) {
        } else {
            UtUtils.a("UCP", 19999, "behavixNull", "addBizFeatures", "", "");
            printThreadName("addBizFeatures");
        }
    }

    @Override // com.taobao.android.upp.e
    public void sendUCPEventWithScene(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933376f", new Object[]{this, str, str2, jSONObject});
        } else {
            UCPManager.a(str, "internal", str2, jSONObject);
        }
    }

    public static void printThreadName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("502aff53", new Object[]{str});
        } else {
            TLog.loge(TAG, TAG, str, Thread.currentThread().getName());
        }
    }
}
