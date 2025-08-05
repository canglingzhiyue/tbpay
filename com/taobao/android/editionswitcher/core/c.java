package com.taobao.android.editionswitcher.core;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.f;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.model.NavigationTabConstraints;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopParamType;
import mtopsdk.mtop.intf.MtopSetting;
import tb.ghk;
import tb.ghl;
import tb.ghp;
import tb.kge;
import tb.llu;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile HashMap<String, ghp> f12289a;
    private final CopyOnWriteArrayList<ghl> b;
    private final AtomicInteger c;
    private ghp d;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final c f12290a;

        static {
            kge.a(1105531437);
            f12290a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("6dd2d3e3", new Object[0]) : f12290a;
        }
    }

    static {
        kge.a(459898379);
    }

    private c() {
        this.f12289a = new HashMap<>();
        this.b = new CopyOnWriteArrayList<>();
        this.c = new AtomicInteger();
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("6dd2d3e3", new Object[0]) : a.a();
    }

    public void a(ghl ghlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea43bb4d", new Object[]{this, ghlVar});
            return;
        }
        this.b.add(ghlVar);
        TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevision.addEditionSwitcherListener");
    }

    public void b(ghl ghlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8c6c1ce", new Object[]{this, ghlVar});
            return;
        }
        this.b.remove(ghlVar);
        TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevision.removeEditionSwitcherListener");
    }

    public void a(ghk ghkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4346ee", new Object[]{this, ghkVar});
        } else if (!b(ghkVar)) {
            TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevisiononResponse 参数非法");
        } else {
            List<ghp> list = ghkVar.f;
            ghp b = b(list);
            if (c(b)) {
                TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevisiononResponse 当前versionCode 变化了");
                d(b);
                b(b);
            }
            this.d = b;
            a(list);
            TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevisiononResponse updateVersion，值是：" + this.d);
        }
    }

    public ghp b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ghp) ipChange.ipc$dispatch("16b6b0ae", new Object[]{this});
        }
        if (this.d == null) {
            this.d = c();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("com.taobao.android.editionswitcher.core.GlobalRevisionqueryCurrentVersionInfo，值是：");
        ghp ghpVar = this.d;
        sb.append(ghpVar == null ? "" : ghpVar.c);
        TLog.loge("edition_switch", sb.toString());
        return this.d;
    }

    public void a(List<ghp> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null && list.size() != 0) {
            try {
                this.f12289a.clear();
                JSONArray jSONArray = new JSONArray();
                for (ghp ghpVar : list) {
                    jSONArray.add(ghpVar.b());
                    this.f12289a.put(ghpVar.c, ghpVar);
                    TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevision.updateVersion; versionInfo:" + ghpVar.b());
                    a(ghpVar);
                }
                a(this.f12289a);
                com.taobao.android.editionswitcher.homepage.c.a("GlobalRevision_edition_switcher", jSONArray.toJSONString());
                if (this.c.get() > 0) {
                    return;
                }
                this.c.incrementAndGet();
            } catch (Exception e) {
                TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevisionupdateVersion", e);
            }
        }
    }

    private void a(HashMap<String, ghp> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
        } else if (com.taobao.android.editionswitcher.b.d()) {
            a(hashMap, com.taobao.android.editionswitcher.b.e());
        } else if (hashMap.containsKey("standard_version")) {
            MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-app-edition", "ST");
        } else if (hashMap.containsKey("new_user_minimalist_version")) {
            MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-app-edition", "NW");
        } else if (hashMap.containsKey("elder_version")) {
            MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-app-edition", "ED");
        } else if (hashMap.containsKey(llu.GOOD_PRICE_VERSION)) {
            MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-app-edition", "GP");
        } else {
            MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-app-edition", "UN");
        }
    }

    private static void a(HashMap<String, ghp> hashMap, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def87405", new Object[]{hashMap, jSONObject});
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (jSONObject == null) {
            MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-app-edition", "UN");
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            String str = (String) entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(str) && hashMap.containsKey(key)) {
                sb.append(str);
                sb.append("_");
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
            MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-app-edition", sb.toString());
            return;
        }
        MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-app-edition", "UN");
    }

    private void a(ghp ghpVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea458cc9", new Object[]{this, ghpVar});
        } else if (ghpVar == null || !ghpVar.e(NavigationTabConstraints.TAB_BIZ_HOMEPAGE) || (jSONObject = ghpVar.e) == null) {
        } else {
            TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevision.updateElderInfo; 兼容银发版逻辑; versionInfo:" + jSONObject.toString());
            f.a(Globals.getApplication(), jSONObject);
        }
    }

    private void b(ghp ghpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8c8934a", new Object[]{this, ghpVar});
            return;
        }
        SharedPreferences.Editor edit = com.taobao.android.editionswitcher.homepage.c.a().edit();
        edit.putString("currentVersionInfo", JSON.toJSONString(ghpVar));
        edit.apply();
    }

    private ghp c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ghp) ipChange.ipc$dispatch("1e68560d", new Object[]{this}) : (ghp) JSON.parseObject(com.taobao.android.editionswitcher.homepage.c.a().getString("currentVersionInfo", null), ghp.class);
    }

    private ghp b(List<ghp> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ghp) ipChange.ipc$dispatch("eb2d149d", new Object[]{this, list});
        }
        ghp ghpVar = null;
        for (ghp ghpVar2 : list) {
            if (NavigationTabConstraints.TAB_BIZ_HOMEPAGE.equals(ghpVar2.b)) {
                ghpVar = ghpVar2;
            }
        }
        return ghpVar;
    }

    private boolean c(ghp ghpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c74b99cf", new Object[]{this, ghpVar})).booleanValue();
        }
        ghp ghpVar2 = this.d;
        if (ghpVar2 != null) {
            return ghpVar != null && !ghpVar.c.equals(ghpVar2.c);
        }
        TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevisionmCurrentVersion == null");
        return true;
    }

    private boolean b(ghk ghkVar) {
        List<ghp> list;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8c64d73", new Object[]{this, ghkVar})).booleanValue() : ghkVar != null && ghkVar.b() && (list = ghkVar.f) != null && !list.isEmpty();
    }

    private void d(ghp ghpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5cea04c", new Object[]{this, ghpVar});
            return;
        }
        String jSONString = ghpVar == null ? "empty" : ghpVar.b().toJSONString();
        TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevision.notifySubscriber; updateVersionInfo: " + jSONString);
        if (this.b.isEmpty()) {
            TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevision.notifySubscriber;  listeners null");
            return;
        }
        Iterator<ghl> it = this.b.iterator();
        while (it.hasNext()) {
            ghl next = it.next();
            if (next != null) {
                next.a(ghpVar);
            }
        }
    }

    public ghp a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ghp) ipChange.ipc$dispatch("7c6fb445", new Object[]{this, str});
        }
        d();
        return this.f12289a.get(str);
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f12289a.containsKey(str)) {
            return true;
        }
        d();
        return this.f12289a.containsKey(str);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.c.get() > 0) {
        } else {
            this.c.incrementAndGet();
            e();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        String b = com.taobao.android.editionswitcher.homepage.c.b("GlobalRevision_edition_switcher");
        TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevisionupdateVersionFromDisk; disk info:" + b);
        if (TextUtils.isEmpty(b)) {
            return;
        }
        try {
            JSONArray parseArray = JSON.parseArray(b);
            if (parseArray != null && !parseArray.isEmpty()) {
                int size = parseArray.size();
                this.f12289a.clear();
                for (int i = 0; i < size; i++) {
                    ghp c = ghp.a().c(parseArray.getJSONObject(i));
                    if (!TextUtils.isEmpty(c.c)) {
                        this.f12289a.put(c.c, c);
                    }
                }
                a(this.f12289a);
            }
        } catch (Exception e) {
            TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevisionupdateVersionFromDisk. exception:", e);
        }
    }
}
