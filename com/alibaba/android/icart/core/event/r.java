package com.alibaba.android.icart.core.event;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bca;
import tb.bcf;
import tb.bcg;
import tb.bei;
import tb.bmz;
import tb.jnv;
import tb.jny;
import tb.kge;

/* loaded from: classes2.dex */
public class r extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(298109046);
    }

    public static /* synthetic */ JSONObject a(r rVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("32561823", new Object[]{rVar}) : rVar.c();
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        bei.d(this.h);
        this.f25791a.x().b(4);
        final String string = this.h.getFields().getString("jumpTargetKey");
        if (StringUtils.isEmpty(string)) {
            return;
        }
        final bcf bcfVar = new bcf(this.f25791a);
        if (bcfVar.b(string, c())) {
            return;
        }
        new bcg(this.f25791a).a(this.h, c(), new jnv() { // from class: com.alibaba.android.icart.core.event.r.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                }
            }

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                } else {
                    bcfVar.b(string, r.a(r.this));
                }
            }
        });
    }
}
