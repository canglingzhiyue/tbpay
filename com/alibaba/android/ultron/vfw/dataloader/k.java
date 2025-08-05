package com.alibaba.android.ultron.vfw.dataloader;

import android.text.TextUtils;
import com.alibaba.android.spindle.stage.StageType;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayList;
import tb.bpk;
import tb.kge;

/* loaded from: classes2.dex */
public class k implements o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.alibaba.android.ultron.vfw.instance.d f2701a;

    static {
        kge.a(1071598363);
        kge.a(277887253);
    }

    public k(com.alibaba.android.ultron.vfw.instance.d dVar) {
        this.f2701a = dVar;
    }

    @Override // com.alibaba.android.ultron.vfw.dataloader.o
    public void a(final d dVar, final i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b088e163", new Object[]{this, dVar, iVar});
            return;
        }
        JSONObject jSONObject = dVar.b.c;
        JSONObject jSONObject2 = dVar.b.f2693a;
        JSONObject jSONObject3 = dVar.b.d;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jSONObject2 != null) {
            jSONObject.put("initialState", (Object) jSONObject2);
        }
        if (jSONObject3 != null) {
            jSONObject.put("extInput", (Object) jSONObject3);
        }
        JSONObject jSONObject4 = dVar.b.b;
        final JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("platform", (Object) "Android");
        jSONObject5.put("storedState", (Object) jSONObject);
        jSONObject5.put("opState", (Object) jSONObject4);
        if (TextUtils.isEmpty("main")) {
            a();
            return;
        }
        com.alibaba.android.ultron.engine.a p = this.f2701a.p();
        if (p == null) {
            new UltronError("引擎init出错: UltronEngine is null").code = bpk.ERROR_ENGINE_INIT;
            iVar.a(null);
            a();
            return;
        }
        if (p.a()) {
            jSONObject5.put("platform", (Object) "AndroidOld");
        }
        a();
        p.a("main", new ArrayList<String>() { // from class: com.alibaba.android.ultron.vfw.dataloader.DataParserEngineImpl$1
            {
                add(jSONObject5.toJSONString());
            }
        }, new com.alibaba.android.ultron.engine.logic.d<JSONObject>() { // from class: com.alibaba.android.ultron.vfw.dataloader.k.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.engine.logic.d
            public void a(JSONObject jSONObject6) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject6});
                } else if (jSONObject6 == null) {
                    UnifyLog.a(k.this.f2701a.g(), "DataParserEngineImpl", "call method return null", new String[0]);
                } else {
                    JSONObject jSONObject7 = jSONObject6.getJSONObject("storedState");
                    JSONObject jSONObject8 = jSONObject6.getJSONObject("bizState");
                    dVar.b.c = jSONObject7;
                    JSONObject jSONObject9 = new JSONObject();
                    jSONObject9.put("sku_script", (Object) jSONObject8);
                    j jVar = new j();
                    jVar.a(jSONObject9);
                    iVar.a(jVar);
                }
            }
        });
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.a f = this.f2701a.y().f();
        if (f == null) {
            return;
        }
        f.a("Page_Ultron", com.taobao.analysis.v3.a.PRE_PROCESS, StageType.STAGE_END);
    }
}
