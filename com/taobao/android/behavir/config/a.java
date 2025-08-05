package com.taobao.android.behavir.config;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.behavir.decision.BHRDecisionEngine;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.solution.BHRSolution;
import com.taobao.android.behavir.util.Utils;
import com.taobao.tao.log.TLog;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final a c;

    /* renamed from: a  reason: collision with root package name */
    private b f9133a = b.a();
    private Map<String, Map<String, BHRSolution>> b = new ConcurrentHashMap();

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("cbec4fe6", new Object[0]) : c;
    }

    private a() {
    }

    public static BHRSolution a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BHRSolution) ipChange.ipc$dispatch("37ddb5eb", new Object[]{jSONObject}) : a(jSONObject.getString("solutionName"));
    }

    public static BHRSolution a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BHRSolution) ipChange.ipc$dispatch("c09d4a95", new Object[]{str});
        }
        a configCenter = BehaviR.getInstance().getConfigCenter();
        BHRSolution b = configCenter.b(str);
        if (b != null) {
            return b;
        }
        BHREvent e = BHRDecisionEngine.a().e();
        if (e == null) {
            return null;
        }
        String str2 = e.sessionId;
        return configCenter.b(str, !TextUtils.isEmpty(str2) ? str2.substring(0, str2.indexOf(e.scene)) : "");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f9133a.b();
        }
    }

    public List<BHRTaskConfig> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.f9133a.f();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            this.f9133a.d();
        } catch (Throwable th) {
            TLog.loge("BHRConfigCenter", "updateUPPConfig", th);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            this.f9133a.e();
        } catch (Throwable th) {
            TLog.loge("BHRConfigCenter", "updateUPPPlanConfig", th);
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : com.taobao.android.behavix.behavixswitch.a.f();
    }

    public void a(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.f9133a.a(str, str2);
        }
    }

    public void a(String str, BHRSolution bHRSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7851f581", new Object[]{this, str, bHRSolution});
        } else if (TextUtils.isEmpty(str) || bHRSolution == null) {
        } else {
            if (bHRSolution.a() && !Utils.a()) {
                return;
            }
            String a2 = (!bHRSolution.a() || bHRSolution.b() == null) ? "undefined" : Utils.a(bHRSolution.b());
            Map<String, BHRSolution> map = this.b.get(str);
            if (map == null) {
                map = new ConcurrentHashMap<>(5);
            }
            map.put(a2, bHRSolution);
            this.b.put(str, map);
        }
    }

    public void b(String str, BHRSolution bHRSolution) {
        Map<String, BHRSolution> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa9caa60", new Object[]{this, str, bHRSolution});
        } else if (!Utils.a() || TextUtils.isEmpty(str) || bHRSolution == null || (map = this.b.get(str)) == null) {
        } else {
            map.remove((!bHRSolution.a() || bHRSolution.b() == null) ? "undefined" : Utils.a(bHRSolution.b()));
        }
    }

    public BHRSolution b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BHRSolution) ipChange.ipc$dispatch("a3c8fdd6", new Object[]{this, str}) : b(str, "undefined");
    }

    public BHRSolution b(String str, String str2) {
        Map<String, BHRSolution> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BHRSolution) ipChange.ipc$dispatch("9716d4e0", new Object[]{this, str, str2});
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (map = this.b.get(str)) != null) {
            return map.get(str2);
        }
        return null;
    }

    static {
        kge.a(1238642005);
        c = new a();
    }
}
