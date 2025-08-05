package com.alibaba.android.spindle.stage;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.TraceLogEventType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.android.x;
import com.taobao.monitor.procedure.g;
import com.taobao.monitor.procedure.s;
import com.taobao.orange.OrangeConfig;
import com.taobao.taolive.room.utils.ag;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.bgc;
import tb.bge;
import tb.bpp;
import tb.gkl;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_PLACEHOLDER = "errorPlaceHolder";
    public static final String SCENE_FCP_ROOT = "fcp_root";

    /* renamed from: a  reason: collision with root package name */
    private static UMLinkLogInterface f2423a = bpp.a();
    private String b;
    private Long c;
    private Map<String, List<a>> d;
    private Map<String, String> e;
    private String g;
    private boolean h;
    private d j;
    private boolean f = false;
    private SimpleDateFormat i = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public b(String str) {
        this.h = false;
        this.b = TextUtils.isEmpty(str) ? "" : str;
        this.c = Long.valueOf(System.currentTimeMillis());
        this.d = new HashMap();
        this.e = new HashMap();
        this.j = new d(str);
        this.h = true;
        this.g = String.format("UTI%d", this.c);
    }

    public void a(String str, String str2, StageType stageType, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19ea3c45", new Object[]{this, str, str2, stageType, activity});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && stageType != null) {
            a(str, str2, stageType);
            if (stageType != StageType.STAGE_END) {
                return;
            }
            g b = s.f18233a.b(activity);
            List<a> list = this.d.get(str);
            if (list == null) {
                return;
            }
            for (a aVar : list) {
                if (aVar != null && str2.equals(aVar.f2422a)) {
                    if (b == null || !b.c()) {
                        return;
                    }
                    b.a(str2, aVar.b, aVar.c);
                    return;
                }
            }
        }
    }

    public void a(String str, String str2, StageType stageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d883fd33", new Object[]{this, str, str2, stageType});
        } else {
            a(str, str2, Long.valueOf(System.currentTimeMillis()), stageType);
        }
    }

    public void a(String str, String str2, Long l, StageType stageType) {
        List<a> c;
        a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9fa1754", new Object[]{this, str, str2, l, stageType});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || stageType == null || (c = c(str)) == null || (a2 = a(str, c, str2)) == null) {
        } else {
            if (StageType.STAGE_START.equals(stageType)) {
                a2.b = l.longValue();
                this.j.a(str, str2, l);
            } else if (!StageType.STAGE_END.equals(stageType)) {
            } else {
                a2.c = l.longValue();
                a2.a();
                if (!this.f && a2.d > 0) {
                    this.f = a(str, str2, a2.d);
                }
                this.j.a(str, str2, (int) a2.d, this.f);
            }
        }
    }

    public void a(String str, a aVar) {
        List<a> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349ce574", new Object[]{this, str, aVar});
        } else if (TextUtils.isEmpty(str) || aVar == null || (c = c(str)) == null) {
        } else {
            c.add(aVar);
            this.j.a(str, aVar.f2422a, Long.valueOf(aVar.b));
            this.j.a(str, aVar.f2422a, (int) aVar.d, this.f);
        }
    }

    @Deprecated
    public void a(String str, a aVar, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d7d0dc6", new Object[]{this, str, aVar, activity});
        } else if (aVar == null) {
        } else {
            a(str, aVar);
            g b = s.f18233a.b(activity);
            if (b == null || !b.c()) {
                return;
            }
            b.a(aVar.f2422a, aVar.b, aVar.c);
        }
    }

    public void a(String str, a aVar, g gVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afaa425", new Object[]{this, str, aVar, gVar, map});
        } else if (aVar != null) {
            a(str, aVar);
            if (gVar == null || !gVar.c()) {
                return;
            }
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    gVar.a(entry.getKey(), entry.getValue());
                }
            }
            gVar.a(aVar.f2422a, aVar.b, aVar.c);
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            this.e.put(str, str2);
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (str2 == null) {
                str2 = "";
            }
            this.e.put(str, str2);
            this.f = a(str);
        }
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
            return;
        }
        b(str, str2);
        this.h = true;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (!bge.a(OrangeConfig.getInstance().getConfig(com.alibaba.android.umbrella.trace.b.ORANGE_GROUP_NAME, "UmbrellaTraceResponseSwitch", "true"), true) || jSONObject == null || jSONObject.size() <= 0 || !this.h) {
        } else {
            Coordinator.getDefaultThreadPoolExecutor().execute(new c(this.g, bgc.UMBRELLA_SPINDLE_BIZ, this.b, jSONObject));
        }
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (!ERROR_PLACEHOLDER.equals(str)) {
            return true;
        }
        return a();
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        List<a> list = this.d.get(SCENE_FCP_ROOT);
        if (list != null && list.size() > 0) {
            long j = list.get(0).b;
            long f = f(this.b, ERROR_PLACEHOLDER);
            long currentTimeMillis = System.currentTimeMillis() - j;
            a("placeHolderTc", String.valueOf(currentTimeMillis));
            if (currentTimeMillis >= f) {
                return true;
            }
        }
        return false;
    }

    public Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d2e5f268", new Object[]{this, str}) : this.j.a(str);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            String str = "";
            String jSONString = !this.d.isEmpty() ? JSON.toJSONString(this.d) : str;
            if (!this.e.isEmpty()) {
                str = JSON.toJSONString(this.e);
            }
            if (!TextUtils.isEmpty(this.g)) {
                a("umbrellaTraceID", this.g);
            }
            if (this.f) {
                HashMap hashMap = new HashMap();
                hashMap.put("bizScenes", jSONString);
                hashMap.put(gkl.DP_BIZ_CONTEXT, str);
                hashMap.put("Umbrella_Diagnose_Type", "1");
                hashMap.put("Umbrella_Diagnose_ErrorCode", "UmbrellaTrace");
                x.a().a(this.b, hashMap);
            }
            d(jSONString, str);
            e(jSONString, str);
            c();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.e.clear();
        this.d.clear();
        this.f = false;
        this.j.a();
        this.h = false;
        this.g = String.format("UTI%d", Long.valueOf(System.currentTimeMillis()));
    }

    private List<a> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb209513", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<a> list = this.d.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.d.put(str, arrayList);
        this.j.a(this.b, str);
        return arrayList;
    }

    private a a(String str, List<a> list, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5dcbf343", new Object[]{this, str, list, str2});
        }
        a aVar = null;
        if (list == null || TextUtils.isEmpty(str2)) {
            return null;
        }
        Iterator<a> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            a next = it.next();
            if (str2.equals(next.f2422a)) {
                aVar = next;
                break;
            }
        }
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        aVar2.f2422a = str2;
        list.add(aVar2);
        this.d.put(str, list);
        return aVar2;
    }

    private void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("biz", (Object) this.b);
            jSONObject.put("time", (Object) this.i.format(this.c));
            jSONObject.put(ag.KEY_TAOKE_BIZSCENE, (Object) str);
            jSONObject.put(gkl.DP_BIZ_CONTEXT, (Object) str2);
            f2423a.trace(this.b, "UmbrellaTrace", "", "SceneStage", "", "", TraceLogEventType.ERROR, jSONObject.toJSONString());
        }
    }

    private void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
        } else if (!this.f) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("biz", this.b);
            hashMap.put("time", String.valueOf(this.c));
            hashMap.put(ag.KEY_TAOKE_BIZSCENE, str);
            hashMap.put(gkl.DP_BIZ_CONTEXT, str2);
            f2423a.commitFailure("AppErrorTrace", "", "", bgc.UMBRELLA_SPINDLE_BIZ, this.b, hashMap, "UmbrellaTrace", "场景诊断");
        }
    }

    private boolean a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dba98cc", new Object[]{this, str, str2, new Long(j)})).booleanValue();
        }
        try {
            return j >= Long.parseLong(OrangeConfig.getInstance().getConfig(com.alibaba.android.umbrella.trace.b.ORANGE_GROUP_NAME, String.format("%s_%s_%s", this.b, str, str2), "3000"));
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private long f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98586475", new Object[]{this, str, str2})).longValue();
        }
        try {
            return Long.parseLong(OrangeConfig.getInstance().getConfig(com.alibaba.android.umbrella.trace.b.ORANGE_GROUP_NAME, String.format("%s_Error_%s", str, str, str2), String.valueOf(2000L)));
        } catch (Throwable th) {
            th.printStackTrace();
            return 2000L;
        }
    }
}
