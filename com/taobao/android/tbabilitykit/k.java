package com.taobao.android.tbabilitykit;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.DynamicFeatureInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.ai;
import tb.aln;
import tb.als;
import tb.alu;
import tb.kge;

/* loaded from: classes6.dex */
public final class k implements com.alibaba.ability.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_DOWNLOAD = "download";
    public static final String API_ENABLE_ROCKET = "enableRocket";
    public static final String API_GET_CURRENT_INFO = "getCurrentInfo";
    public static final String CAN_NOT_OPEN_ROCKET_DES = "当前容器无法打开 Rocket 功能";
    public static final String CAN_NOT_OPEN_ROCKET_ERROR_CODE = "1001";
    public static final a Companion;
    public static final String DOWNLOAD_FAIL_DES = "当前 Rocket 下载失败";
    public static final String DOWNLOAD_FAIL_ERROR_CODE = "1002";
    public static final String PARAMS_DROID_NAME = "droidName";
    public static final String PARAMS_NAME = "name";

    static {
        kge.a(1951380306);
        kge.a(-948502777);
        Companion = new a(null);
    }

    public static final /* synthetic */ JSONObject a(k kVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("8f0560da", new Object[]{kVar, str}) : kVar.a(str);
    }

    /* loaded from: classes6.dex */
    public static final class a {
        static {
            kge.a(-1252188134);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        kotlin.jvm.internal.q.d(api, "api");
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(params, "params");
        kotlin.jvm.internal.q.d(callback, "callback");
        int hashCode = api.hashCode();
        if (hashCode != -1720849865) {
            if (hashCode == -39356271) {
                if (api.equals(API_GET_CURRENT_INFO)) {
                    String a2 = com.alibaba.ability.e.a(params, PARAMS_DROID_NAME, (String) null);
                    if (a2 == null) {
                        a2 = com.alibaba.ability.e.a(params, "name", (String) null);
                    }
                    if (a2 == null) {
                        return a$a.Companion.b("参数异常，请检查");
                    }
                    return new FinishResult(a(a2), null, 2, null);
                }
            } else if (hashCode == 1427818632 && api.equals("download")) {
                String a3 = com.alibaba.ability.e.a(params, PARAMS_DROID_NAME, (String) null);
                if (a3 == null) {
                    a3 = com.alibaba.ability.e.a(params, "name", (String) null);
                }
                if (a3 == null) {
                    callback.a((ExecuteResult) a$a.Companion.b("参数异常，请检查"));
                    return null;
                }
                JSONObject a4 = a(a3);
                if (a4.get("bundleInfo") != null) {
                    callback.a((ExecuteResult) new FinishResult(a4, null, 2, null));
                    return null;
                }
                com.alibaba.android.split.core.splitinstall.g c = com.taobao.appbundle.c.Companion.a().c();
                com.alibaba.android.split.core.splitinstall.j a5 = com.alibaba.android.split.core.splitinstall.j.a().a(a3).a();
                if (c != null) {
                    c.a(a5);
                }
                b bVar = new b(a3, c, callback);
                if (c != null) {
                    c.a(bVar);
                }
                return null;
            }
        } else if (api.equals(API_ENABLE_ROCKET)) {
            alu c2 = context.f().c();
            if (c2 == null) {
                return new ErrorResult("1001", CAN_NOT_OPEN_ROCKET_DES, (Map) null, 4, (kotlin.jvm.internal.o) null);
            }
            c2.a(true);
            return new FinishResult(new JSONObject(ai.b(kotlin.j.a("result", true))), null, 2, null);
        }
        a$a.a aVar = a$a.Companion;
        return aVar.a("api " + api + " not found");
    }

    /* loaded from: classes6.dex */
    public static final class b implements com.alibaba.android.split.core.splitinstall.o {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ com.alibaba.android.split.core.splitinstall.g c;
        public final /* synthetic */ aln d;

        public b(String str, com.alibaba.android.split.core.splitinstall.g gVar, aln alnVar) {
            this.b = str;
            this.c = gVar;
            this.d = alnVar;
        }

        @Override // com.alibaba.android.split.core.listener.b
        public /* synthetic */ void onStateUpdate(com.alibaba.android.split.core.splitinstall.m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd17bbbe", new Object[]{this, mVar});
            } else {
                a(mVar);
            }
        }

        public void a(com.alibaba.android.split.core.splitinstall.m mVar) {
            List<String> g;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("398f1780", new Object[]{this, mVar});
            } else if (mVar == null || (g = mVar.g()) == null || !g.contains(this.b)) {
            } else {
                int b = mVar.b();
                if (b == 5) {
                    com.alibaba.android.split.core.splitinstall.g gVar = this.c;
                    if (gVar != null) {
                        gVar.b(this);
                    }
                    this.d.a((ExecuteResult) new FinishResult(k.a(k.this, this.b), null, 2, null));
                } else if (b != 6) {
                } else {
                    com.alibaba.android.split.core.splitinstall.g gVar2 = this.c;
                    if (gVar2 != null) {
                        gVar2.b(this);
                    }
                    this.d.a(new ErrorResult("1002", k.DOWNLOAD_FAIL_DES, (Map) null, 4, (kotlin.jvm.internal.o) null));
                }
            }
        }
    }

    private final JSONObject a(String str) {
        Set<String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        DynamicFeatureInfo c = com.android.tools.bundleInfo.b.a().c(str);
        if (c != null) {
            com.alibaba.android.split.core.splitinstall.g c2 = com.taobao.appbundle.c.Companion.a().c();
            if (c2 != null && (a2 = c2.a()) != null && a2.contains(str)) {
                JSONObject jSONObject2 = jSONObject;
                Object json = JSONObject.toJSON(c);
                if (json == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
                jSONObject2.put((JSONObject) "bundleInfo", (String) ((JSONObject) json));
            }
            jSONObject.put((JSONObject) "appVersion", c.appVersion);
        } else {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put((JSONObject) "version", "999.999.999");
            JSONObject jSONObject4 = jSONObject;
            jSONObject4.put((JSONObject) "bundleInfo", (String) jSONObject3);
            jSONObject4.put((JSONObject) "appVersion", "999.999.999");
        }
        return jSONObject;
    }
}
