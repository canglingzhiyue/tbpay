package com.taobao.android.diagnose.scene.engine.reader;

import android.content.Context;
import android.text.TextUtils;
import com.ali.user.open.core.util.ParamsConstants;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.e;
import com.taobao.android.diagnose.func.ToolConfigManager;
import com.taobao.android.diagnose.model.AppInfo;
import com.taobao.android.diagnose.model.NetInfo;
import com.taobao.android.diagnose.v;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.Mtop;
import tb.bte;
import tb.fmx;
import tb.fmy;
import tb.fmz;
import tb.fna;
import tb.fnc;
import tb.fnh;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final Context f11722a;
    private fmz b;
    private c g = null;
    private final fna c = new fnc();
    private final File d = new File(com.taobao.android.diagnose.c.a().g(), "scene_rules_config.json");
    private final File e = new File(com.taobao.android.diagnose.c.a().g(), "scene_rules_channel_config.json");
    private Map<String, RuleDefine> f = null;

    static {
        kge.a(-829048458);
    }

    /* renamed from: lambda$ACGtrhP6SsfIk_9-_foHHQxIR8c */
    public static /* synthetic */ void m912lambda$ACGtrhP6SsfIk_9_foHHQxIR8c(d dVar, com.taobao.android.diagnose.scene.a aVar) {
        dVar.b(aVar);
    }

    public static /* synthetic */ void a(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd6245f", new Object[]{dVar, str});
        } else {
            dVar.d(str);
        }
    }

    public d(Context context) {
        this.f11722a = context;
    }

    public void a(final com.taobao.android.diagnose.scene.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc45ab9", new Object[]{this, aVar});
            return;
        }
        v.a("RulesManager", "RulesManager init");
        try {
            com.taobao.android.diagnose.scene.engine.config.a.a();
            ToolConfigManager.a();
            this.b = a();
            com.taobao.android.diagnose.common.c.a().a(new Runnable() { // from class: com.taobao.android.diagnose.scene.engine.reader.-$$Lambda$d$ACGtrhP6SsfIk_9-_foHHQxIR8c
                @Override // java.lang.Runnable
                public final void run() {
                    d.m912lambda$ACGtrhP6SsfIk_9_foHHQxIR8c(d.this, aVar);
                }
            }, 5L, TimeUnit.SECONDS);
        } catch (Exception e) {
            v.a("RulesManager", "init failed: ", e);
        }
    }

    public /* synthetic */ void b(final com.taobao.android.diagnose.scene.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7298fd8", new Object[]{this, aVar});
            return;
        }
        try {
            a(false, new Runnable() { // from class: com.taobao.android.diagnose.scene.engine.reader.-$$Lambda$d$2dv2wWKNvmmyE8dSd21PTBVzbtM
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.c(aVar);
                }
            });
        } catch (Exception e) {
            v.a("RulesManager", "init in runnable", e);
        }
    }

    public /* synthetic */ void c(com.taobao.android.diagnose.scene.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be8ec4f7", new Object[]{this, aVar});
            return;
        }
        v.a("RulesManager", "Trigger SCENE_LAUNCH & SCENE_CHANGE_CONFIG after launch!");
        aVar.a("scene_launch", (fmx) null);
        aVar.a("scene_change_config", (fmx) null);
        com.taobao.android.diagnose.common.b.a(this.f11722a, com.taobao.android.diagnose.c.a().d().i());
    }

    public int a(String str, fmx fmxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("28c54264", new Object[]{this, str, fmxVar})).intValue() : a(str, fmxVar, this.b);
    }

    private int a(fmy fmyVar, fmx fmxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac722338", new Object[]{this, fmyVar, fmxVar})).intValue();
        }
        if (com.taobao.android.diagnose.scene.a.a(fmyVar.c())) {
            return a(fmyVar.c(), fmxVar, new fmz(fmyVar));
        }
        return 0;
    }

    private int a(String str, fmx fmxVar, fmz fmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f667261", new Object[]{this, str, fmxVar, fmzVar})).intValue();
        }
        try {
            if (this.c != null && !TextUtils.isEmpty(str)) {
                return this.c.a(fmzVar, fmxVar, str);
            }
        } catch (Exception e) {
            v.a("RulesManager", "onFacts", e);
        }
        return 0;
    }

    private fmz a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fmz) ipChange.ipc$dispatch("f04aaeb", new Object[]{this});
        }
        v.a("RulesManager", "Load rules");
        HashMap hashMap = new HashMap();
        Map<String, fmy> a2 = a(this.d);
        Map<String, fmy> b = b();
        if (a2 != null) {
            for (fmy fmyVar : a2.values()) {
                if (fmyVar.f() == 1 || fmyVar.h()) {
                    v.a("RulesManager", String.format("The rule %s is out of data.", fmyVar.toString()));
                    ToolConfigManager.a(fmyVar);
                    if (b == null || !b.containsKey(fmyVar.a())) {
                        com.taobao.android.diagnose.scene.engine.config.a.a(fmyVar.a());
                    }
                } else {
                    v.a("RulesManager", "Load the rule: " + fmyVar.toString());
                    hashMap.put(fmyVar.a(), fmyVar);
                }
            }
        }
        if (b != null) {
            for (fmy fmyVar2 : b.values()) {
                if (fmyVar2.f() == 1 || fmyVar2.h()) {
                    v.a("RulesManager", String.format("The channel rule %s is out of data.", fmyVar2.toString()));
                    ToolConfigManager.a(fmyVar2);
                    a(fmyVar2.a(), fmyVar2.b());
                    if (!hashMap.containsKey(fmyVar2.a())) {
                        com.taobao.android.diagnose.scene.engine.config.a.a(fmyVar2.a());
                    }
                } else {
                    fmy fmyVar3 = (fmy) hashMap.get(fmyVar2.a());
                    if (fmyVar3 != null && fmyVar3.b() >= fmyVar2.b()) {
                        v.a("RulesManager", String.format("Use mtop rule %s, delete channel rule %s", fmyVar3.toString(), fmyVar2.toString()));
                        a(fmyVar2.a(), fmyVar2.b());
                        ToolConfigManager.a(fmyVar2);
                    } else {
                        hashMap.put(fmyVar2.a(), fmyVar2);
                        v.a("RulesManager", "Load the channel rule: " + fmyVar2.toString());
                    }
                }
            }
        }
        fmz fmzVar = new fmz(hashMap.values());
        v.a("RulesManager", "Register rule count " + fmzVar.b());
        return fmzVar;
    }

    private Map<String, fmy> a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b928ffd4", new Object[]{this, file});
        }
        if (file == null || !file.exists()) {
            v.a("RulesManager", "Do not have config file");
            return null;
        }
        List<RuleDefine> a2 = new a(file).a();
        if (a2 == null || a2.isEmpty()) {
            v.a("RulesManager", "Config RulesDefine is null");
            return null;
        }
        return a(a2);
    }

    private Map<String, fmy> b() {
        fmy a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        File file = this.e;
        if (file == null || !file.exists()) {
            v.a("RulesManager", "Do not have channel config file");
            return null;
        }
        try {
            String a3 = com.taobao.android.diagnose.common.d.a(this.e);
            if (TextUtils.isEmpty(a3)) {
                v.a("RulesManager", "Channel config file is empty");
                return null;
            }
            this.f = (Map) JSON.parseObject(a3, new TypeReference<ConcurrentHashMap<String, RuleDefine>>() { // from class: com.taobao.android.diagnose.scene.engine.reader.d.1
                {
                    d.this = this;
                }
            }, new Feature[0]);
            if (this.f != null && this.f.values() != null) {
                HashMap hashMap = new HashMap();
                for (RuleDefine ruleDefine : this.f.values()) {
                    if (ruleDefine != null && (a2 = a(ruleDefine)) != null) {
                        a2.a(true);
                        a2.a(ruleDefine.expireType);
                        a2.a(ruleDefine.expireTime);
                        a2.a(ruleDefine.bizName);
                        hashMap.put(a2.a(), a2);
                    }
                }
                return hashMap;
            }
            v.a("RulesManager", "Channel config RulesDefine is null");
            return null;
        } catch (Exception e) {
            v.a("RulesManager", "Filed to load channel config", e);
            return null;
        }
    }

    private Map<String, fmy> a(List<RuleDefine> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("71436bce", new Object[]{this, list});
        }
        HashMap hashMap = new HashMap();
        for (RuleDefine ruleDefine : list) {
            fmy a2 = a(ruleDefine);
            if (a2 != null) {
                a2.a(false);
                a2.a(ruleDefine.expireType);
                a2.a(ruleDefine.expireTime);
                a2.a(ruleDefine.bizName);
                hashMap.put(a2.a(), a2);
            }
        }
        return hashMap;
    }

    private fmy a(RuleDefine ruleDefine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fmy) ipChange.ipc$dispatch("82f9794", new Object[]{this, ruleDefine});
        }
        c c = c(ruleDefine.conditionVer);
        if (c == null) {
            TLog.loge("Diagnose", "RulesManager", "unsupported expression version: " + ruleDefine.conditionVer);
            return null;
        }
        return c.b(ruleDefine);
    }

    private c c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("79df4f02", new Object[]{this, str});
        }
        if (!"1".equals(str)) {
            return null;
        }
        if (this.g == null) {
            this.g = new fnh();
        }
        return this.g;
    }

    public void a(boolean z, Runnable runnable) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f0cfea", new Object[]{this, new Boolean(z), runnable});
        } else if (!z && !com.taobao.android.diagnose.scene.engine.config.a.b()) {
            v.a("RulesManager", "Limit to check the scene update!");
        } else {
            v.a("RulesManager", String.format("Check scene rule update!! isForce=%b", Boolean.valueOf(z)));
            try {
                MtopRequest mtopRequest = new MtopRequest();
                mtopRequest.setApiName("mtop.alibaba.emas.publish.update.resource.get");
                mtopRequest.setVersion("1.0");
                JSONObject jSONObject = new JSONObject();
                e e = com.taobao.android.diagnose.c.a().e();
                jSONObject.put("identifier", (Object) e.f11708a);
                jSONObject.put("resourceType", (Object) "scene");
                AppInfo i2 = com.taobao.android.diagnose.c.a().d().i();
                NetInfo e2 = com.taobao.android.diagnose.c.a().d().e();
                jSONObject.put("appVersion", (Object) i2.appVer);
                jSONObject.put("arch", (Object) i2.abi);
                jSONObject.put("uid", (Object) i2.uid);
                jSONObject.put("nk", (Object) i2.accountName);
                jSONObject.put("isInnerUser", (Object) Integer.valueOf(i2.isInner ? 1 : 0));
                jSONObject.put("networkType", (Object) Integer.valueOf(e2.getType()));
                jSONObject.put(bte.TAG_ACCESS, (Object) e2.getOperator());
                if (!i2.isDebug) {
                    i = 0;
                }
                jSONObject.put(com.taobao.tao.log.statistics.d.PARAM_IS_DEBUG, (Object) Integer.valueOf(i));
                jSONObject.put("brand", (Object) i2.brand);
                mtopRequest.setData(jSONObject.toJSONString());
                v.a("RulesManager", "mtop request: " + mtopRequest.toString());
                MtopBusiness.build(Mtop.instance(e.b, this.f11722a), mtopRequest).mo1305reqMethod(MethodEnum.POST).mo1339retryTime(2).registerListener((IRemoteListener) new RulesManager$2(this, runnable)).startRequest();
            } catch (Exception e3) {
                v.a("RulesManager", "checkUpdate failed: ", e3);
            }
        }
    }

    private synchronized void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            v.c("RulesManager", "The scene data is empty");
        } else {
            List<RuleDefine> a2 = new b(str).a();
            if (a2 == null) {
                v.d("RulesManager", "Failed to parse the json to RuleDefine");
                return;
            }
            if (com.taobao.android.diagnose.common.d.a(this.d, str)) {
                com.taobao.android.diagnose.scene.engine.config.a.c();
            }
            Map<String, fmy> a3 = a(a2);
            v.a("RulesManager", "Server rules count: " + a3.size());
            Iterator<fmy> it = this.b.iterator();
            while (it.hasNext()) {
                fmy next = it.next();
                fmy fmyVar = a3.get(next.a());
                if (next.e()) {
                    if (fmyVar != null && fmyVar.b() >= next.b()) {
                        v.a("RulesManager", String.format("Replace the local channel rule. %s-->%s", fmyVar.toString(), next.toString()));
                        a(next.a(), next.b());
                        ToolConfigManager.a(next);
                    } else {
                        a3.put(next.a(), next);
                        v.a("RulesManager", "Use local channel rule: " + next.toString());
                    }
                } else if (fmyVar == null) {
                    v.a("RulesManager", "The rule is offline: " + next.toString());
                    com.taobao.android.diagnose.scene.engine.config.a.a(next.a());
                    ToolConfigManager.a(next);
                } else if (fmyVar.b() != next.b()) {
                    v.a("RulesManager", String.format("The rule version changed. %s --> %s", next.toString(), fmyVar.toString()));
                    ToolConfigManager.a(next);
                }
            }
            this.b = new fmz(a3.values());
            v.a("RulesManager", "Total rules: " + this.b.b());
        }
    }

    public synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            v.c("RulesManager", "The channel content is empty");
        } else {
            v.a("RulesManager", "updateChannelRule: " + str);
            RuleDefine b = new b(str).b();
            if (b == null) {
                v.d("RulesManager", "Failed to parse the channel content to RuleDefine");
            } else if (b.isExpire()) {
                v.c("RulesManager", String.format("The channel rule %s_%d is out of date. %d", b.id, Long.valueOf(b.sceneVersion), Long.valueOf(b.expireTime)));
            } else if (b.expireType != 1 && b.expireType != 2) {
                v.c("RulesManager", "Invalid expireType: " + b.expireType);
            } else {
                fmy a2 = this.b.a(b.id);
                if (a2 != null && a2.b() >= b.sceneVersion) {
                    v.d("RulesManager", String.format("The new channel rule version %s_%d <= %s", b.id, Long.valueOf(b.sceneVersion), a2.toString()));
                    return;
                }
                fmy a3 = a(b);
                if (a3 == null) {
                    v.d("RulesManager", "Failed to convert Ruledefine to Rule");
                    return;
                }
                a3.a(true);
                a3.a(b.expireType);
                a3.a(b.expireTime);
                a3.a(b.bizName);
                if (a2 != null) {
                    this.b.b(a2);
                    v.a("RulesManager", "Unregister local rule: " + a2.toString());
                    ToolConfigManager.a(a2);
                }
                if (!b(b)) {
                    v.c("RulesManager", "Failed to save the channel rule");
                    return;
                }
                this.b.a(a3);
                v.a("RulesManager", "Register new channel rule: " + a3.toString());
                if ("scene_change_config".equals(a3.c())) {
                    v.a("RulesManager", "Trigger rule: " + a3.toString());
                    a(a3, (fmx) null);
                }
            }
        }
    }

    public synchronized void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            v.c("RulesManager", "The channel content is empty");
        } else {
            v.a("RulesManager", "deleteChannelRule: " + str);
            JSONObject parseObject = JSONObject.parseObject(str);
            String string = parseObject.getString(ParamsConstants.Key.PARAM_SCENE_CODE);
            String string2 = parseObject.getString("id");
            long longValue = parseObject.getLong("sceneVersion").longValue();
            a(string2, longValue);
            ToolConfigManager.a(string, string2, longValue);
            fmy a2 = this.b.a(string2);
            if (a2 != null && a2.e() && a2.b() == longValue) {
                this.b.b(a2);
                v.a("RulesManager", String.format("Unregister channel rule: %s_%d", string2, Long.valueOf(longValue)));
                com.taobao.android.diagnose.scene.engine.config.a.a(string2);
            }
        }
    }

    private boolean b(RuleDefine ruleDefine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("130a48a5", new Object[]{this, ruleDefine})).booleanValue();
        }
        v.a("RulesManager", String.format("Save the RuleDefine %s_%d to file!", ruleDefine.id, Long.valueOf(ruleDefine.sceneVersion)));
        if (this.f == null) {
            this.f = new ConcurrentHashMap();
        }
        this.f.put(ruleDefine.id, ruleDefine);
        return com.taobao.android.diagnose.common.d.a(this.e, JSON.toJSONString(this.f));
    }

    private boolean a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123b0d6", new Object[]{this, str, new Long(j)})).booleanValue();
        }
        Map<String, RuleDefine> map = this.f;
        if (map == null) {
            v.a("RulesManager", String.format("channelRulesDefine is null: %s_%d", str, Long.valueOf(j)));
            return false;
        }
        RuleDefine ruleDefine = map.get(str);
        if (ruleDefine == null || ruleDefine.sceneVersion != j) {
            v.a("RulesManager", String.format("Can't find the %s_%d from file!", str, Long.valueOf(j)));
            return false;
        }
        v.a("RulesManager", String.format("Remove the RuleDefine %s_%d from file!", str, Long.valueOf(j)));
        this.f.remove(str);
        return com.taobao.android.diagnose.common.d.a(this.e, JSON.toJSONString(this.f));
    }
}
