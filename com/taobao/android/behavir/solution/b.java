package com.taobao.android.behavir.solution;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.event.BHRScrollEvent;
import com.taobao.android.behavir.solution.BHRSolution;
import com.taobao.android.behavir.util.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.dqi;
import tb.hjs;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class b implements BHRSolution<HashMap<String, Object>, Map<String, Object>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "rerank";

    /* renamed from: a  reason: collision with root package name */
    private long f9143a = 0;

    static {
        kge.a(1454018951);
        kge.a(1685160846);
    }

    public abstract List<JSONObject> a(dqi dqiVar);

    public void a(dqi dqiVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab834b1", new Object[]{this, dqiVar, new Integer(i), str});
        }
    }

    public abstract void a(dqi dqiVar, g gVar);

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public void a(dqi dqiVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ab0c5a", new Object[]{this, dqiVar, runnable});
        }
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public abstract void a2(dqi dqiVar, Map<String, Object> map);

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean a(dqi dqiVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a68140", new Object[]{this, dqiVar, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return true;
    }

    public boolean a(dqi dqiVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ceb2ca6c", new Object[]{this, dqiVar, new Long(j)})).booleanValue();
        }
        return true;
    }

    public boolean a(dqi dqiVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8588fe98", new Object[]{this, dqiVar, jSONObject})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[]{this});
        }
        return null;
    }

    public abstract List<JSONObject> b(dqi dqiVar);

    public boolean b(dqi dqiVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b090940b", new Object[]{this, dqiVar, new Long(j)})).booleanValue();
        }
        return true;
    }

    public abstract JSONObject c(dqi dqiVar);

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean d(dqi dqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b12bbb63", new Object[]{this, dqiVar})).booleanValue();
        }
        return true;
    }

    public boolean e(dqi dqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9faec1e4", new Object[]{this, dqiVar})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public Map<String, String> h(dqi dqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c3eb3e58", new Object[]{this, dqiVar});
        }
        return null;
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public /* synthetic */ void a(dqi dqiVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a96d8b8", new Object[]{this, dqiVar, map});
        } else {
            b(dqiVar, map);
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.HashMap<java.lang.String, java.lang.Object>] */
    @Override // com.taobao.android.behavir.solution.BHRSolution
    public /* synthetic */ HashMap<String, Object> i(dqi dqiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("465affce", new Object[]{this, dqiVar}) : g(dqiVar);
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public boolean f(dqi dqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e31c865", new Object[]{this, dqiVar})).booleanValue();
        }
        BHREvent d = dqiVar instanceof f ? ((f) dqiVar).d() : null;
        if (d == null) {
            return false;
        }
        if (!d(dqiVar)) {
            a(dqiVar, BHRSolution.Status.DEVICE_NOT_SUPPORT.getCode(), BHRSolution.Status.DEVICE_NOT_SUPPORT.getMsg());
            return false;
        } else if (!e(dqiVar)) {
            a(dqiVar, BHRSolution.Status.BUSINESS_DEGRADE.getCode(), BHRSolution.Status.BUSINESS_DEGRADE.getMsg());
            return false;
        } else if (!a(dqiVar, this.f9143a)) {
            a(dqiVar, BHRSolution.Status.CHECK_FATIGUE_FAILED.getCode(), BHRSolution.Status.CHECK_FATIGUE_FAILED.getMsg());
            return false;
        } else {
            if (d instanceof BHRScrollEvent) {
                JSONObject jSONObject = d.actionArgsJSON;
                if (!b(dqiVar, a(jSONObject))) {
                    a(dqiVar, BHRSolution.Status.SCROLL_DURATION_NOT_ENOUGH.getCode(), BHRSolution.Status.SCROLL_DURATION_NOT_ENOUGH.getMsg());
                    return false;
                }
                int[] b = b(jSONObject);
                if (!a(dqiVar, b[0], b[1])) {
                    a(dqiVar, BHRSolution.Status.SCROLL_INSTANCE_NOT_ENOUGH.getCode(), BHRSolution.Status.SCROLL_INSTANCE_NOT_ENOUGH.getMsg());
                    return false;
                }
            }
            if (!a(dqiVar, d.toJsonObject())) {
                a(dqiVar, BHRSolution.Status.CUSTOM_LOGIC_FAILED.getCode(), BHRSolution.Status.CUSTOM_LOGIC_FAILED.getMsg());
                return false;
            }
            d();
            return true;
        }
    }

    public final void b(dqi dqiVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c580788", new Object[]{this, dqiVar, map});
            return;
        }
        if (l.a(map) && (map.get("result") instanceof Map)) {
            a2(dqiVar, (Map) map.get("result"));
        } else {
            g gVar = new g();
            gVar.a(String.valueOf(l.b(map)));
            a(dqiVar, gVar);
        }
        d();
    }

    public HashMap<String, Object> g(dqi dqiVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3062cfc5", new Object[]{this, dqiVar});
        }
        HashMap<String, Object> hashMap = new HashMap<>(8);
        ArrayList arrayList = new ArrayList();
        List<JSONObject> b = b(dqiVar);
        List<JSONObject> a2 = a(dqiVar);
        if (b != null) {
            arrayList.addAll(b);
        }
        if (a2 != null) {
            arrayList.addAll(a2);
        }
        JSONObject c = c(dqiVar);
        if (c != null) {
            hashMap.putAll(c);
        }
        hashMap.put(hjs.UNDER_TAKE_GOODS_LIST, JSON.toJSONString(arrayList));
        if (a2 != null) {
            i = a2.size();
        }
        hashMap.put("unExposeCount", Integer.valueOf(i));
        return hashMap;
    }

    private long a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("266fb7c", new Object[]{this, jSONObject})).longValue();
        }
        if (jSONObject != null) {
            return jSONObject.getLongValue("scrollDuration");
        }
        return 0L;
    }

    private int[] b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("13796d9d", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return new int[]{0, 0};
        }
        int intValue = jSONObject.getIntValue("scrollStartOffsetX");
        return new int[]{jSONObject.getIntValue("scrollEndOffsetX") - intValue, jSONObject.getIntValue("scrollEndOffsetY") - jSONObject.getIntValue("scrollStartOffsetY")};
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.f9143a = System.currentTimeMillis();
        }
    }
}
