package com.taobao.mytaobao.ultron.event;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.ultron.e;
import tb.dkx;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;
import tb.kge;

/* loaded from: classes7.dex */
public class m implements dln {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long AKMTBEventChainForUltonEventAbilityAbilityHashType = -5402166632315831338L;

    /* renamed from: a  reason: collision with root package name */
    private e f18512a;

    static {
        kge.a(1586600000);
        kge.a(-1749066050);
    }

    public m(e eVar) {
        this.f18512a = eVar;
    }

    /* loaded from: classes7.dex */
    public static class a extends dlg {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private e f18513a;

        static {
            kge.a(1332839236);
        }

        public a(e eVar) {
            this.f18513a = eVar;
        }

        @Override // tb.dlg
        public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
            }
            JSONObject c = dlhVar.c();
            if (c == null) {
                return null;
            }
            String string = c.getString("componentKey");
            JSONArray jSONArray = c.getJSONArray("events");
            if (jSONArray == null || StringUtils.isEmpty(string)) {
                return null;
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null && jSONObject.containsKey("type")) {
                    this.f18513a.a(string, jSONObject.getString("type"), jSONObject);
                }
            }
            return null;
        }
    }

    @Override // tb.dln
    public dlg b(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : new a(this.f18512a);
    }
}
