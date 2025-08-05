package com.alibaba.android.ultron.vfw.dataloader;

import com.alibaba.android.ultron.engine.template.b;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayList;
import tb.bpk;
import tb.kge;

/* loaded from: classes2.dex */
public class e implements n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.alibaba.android.ultron.vfw.instance.d f2694a;

    static {
        kge.a(-1439703537);
        kge.a(616229206);
    }

    public e(com.alibaba.android.ultron.vfw.instance.d dVar) {
        this.f2694a = dVar;
    }

    @Override // com.alibaba.android.ultron.vfw.dataloader.n
    public void a(d dVar, b bVar) {
        UltronError ultronError;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b085b2ca", new Object[]{this, dVar, bVar});
        } else if (this.f2694a.p() == null) {
            UltronError ultronError2 = new UltronError("doRequest UltronEngine is null");
            ultronError2.code = bpk.ERROR_ENGINE_INIT;
            UnifyLog.a(this.f2694a.g(), "DataLoaderEngineImpl", "doRequest UltronEngine is null", new String[0]);
            ultronError2.domain = "ClientEngine";
            h hVar = new h();
            hVar.a(dVar);
            bVar.a(hVar, ultronError2);
        } else {
            if ("initial".equals(dVar.f2692a)) {
                this.f2694a.p().d();
            }
            j jVar = (j) dVar.b(a.KEY_DATA_PARSER_RESULT);
            com.alibaba.android.ultron.engine.template.b a2 = this.f2694a.p().a(jVar != null ? jVar.b() : null);
            h hVar2 = new h();
            hVar2.a(a2);
            hVar2.a(dVar);
            if (a2 == null || a2.f2568a) {
                if (a2 != null) {
                    b.a aVar = a2.b;
                    ultronError = new UltronError(aVar.b);
                    ultronError.code = bpk.ERROR_ENGINE_TEMPLATE_RENDER;
                    String g = this.f2694a.g();
                    StringBuilder sb = new StringBuilder();
                    sb.append("renderUserData error: ");
                    sb.append(aVar.b);
                    sb.append(aVar.c != null ? aVar.c : "");
                    UnifyLog.a(g, "DataLoaderEngineImpl", sb.toString(), new String[0]);
                } else {
                    ultronError = new UltronError("Template has generated error, result is empty!");
                    ultronError.code = bpk.ERROR_ENGINE_TEMPLATE_RENDER;
                    UnifyLog.a(this.f2694a.g(), "DataLoaderEngineImpl", "renderUserData error: TempRenderInfo is null", new String[0]);
                }
                ultronError.domain = "ClientEngine";
                bVar.a(hVar2, ultronError);
                return;
            }
            JSONObject jSONObject = a2.c;
            if (jSONObject != null && "true".equals(jSONObject.getString("noNeedRefresh"))) {
                bVar.a(null);
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("api", (Object) "api.newultron");
            jSONObject2.put("data", (Object) jSONObject);
            jSONObject2.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, (Object) new ArrayList<String>() { // from class: com.alibaba.android.ultron.vfw.dataloader.DataLoaderEngineImpl$1
                {
                    e.this = this;
                    add("SUCCESS::调用成功");
                }
            });
            jSONObject2.put("v", (Object) "1.0");
            a2.c = jSONObject2;
            bVar.a(hVar2);
        }
    }
}
