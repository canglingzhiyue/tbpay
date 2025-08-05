package com.taobao.android.icart.event;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bbz;
import tb.bca;
import tb.bmz;
import tb.jnv;
import tb.jny;
import tb.kge;

/* loaded from: classes5.dex */
public class e extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Handler c = new Handler(Looper.getMainLooper());

    static {
        kge.a(-970878126);
    }

    public static /* synthetic */ bbz a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("447f4ecc", new Object[]{eVar}) : eVar.f25791a;
    }

    public static /* synthetic */ bbz b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("fdf6dc6b", new Object[]{eVar}) : eVar.f25791a;
    }

    public static /* synthetic */ bbz c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("b76e6a0a", new Object[]{eVar}) : eVar.f25791a;
    }

    public static /* synthetic */ bbz d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("70e5f7a9", new Object[]{eVar}) : eVar.f25791a;
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(final bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
        } else {
            this.c.post(new Runnable() { // from class: com.taobao.android.icart.event.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        e.this.c(bmzVar);
                    }
                }
            });
        }
    }

    public void c(bmz bmzVar) {
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf0e5feb", new Object[]{this, bmzVar});
            return;
        }
        JSONObject c = c();
        String string = c.getString("filterItem");
        JSONObject jSONObject = c.getJSONObject(RequestConfig.CUSTOM_EXPARAMS);
        this.b.b(string);
        HashMap hashMap = new HashMap();
        hashMap.put(RequestConfig.IS_POP_LAYER_FIRST_PAGE, "true");
        hashMap.put(RequestConfig.IS_POP_LAYE_RQUERY, "true");
        if (jSONObject != null) {
            hashMap.put(RequestConfig.CUSTOM_EXPARAMS, jSONObject.toJSONString());
        }
        List<com.taobao.android.ultron.common.model.b> list = this.h.getEventMap().get(bmzVar.f());
        final com.taobao.android.ultron.common.model.b bVar = null;
        if (list != null) {
            for (com.taobao.android.ultron.common.model.b bVar2 : list) {
                if ("openPopupWindow".equals(bVar2.getType())) {
                    hashMap.put("_requestContext", bVar2.getFields().getString("nextRenderRoot"));
                    bVar = bVar2;
                }
            }
        }
        if ("cartTimePromotion".equals(this.h.getTag()) && (data = this.h.getData()) != null) {
            data.put("status", (Object) "hidden");
        }
        this.f25791a.x().b(4);
        this.f25791a.x().b(true);
        this.f25791a.b(false, hashMap, new jnv() { // from class: com.taobao.android.icart.event.e.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jnv
            public boolean a(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("1f4c7080", new Object[]{this, new Integer(i), mtopResponse, obj})).booleanValue() : !e.a(e.this).n().d();
            }

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                    return;
                }
                e.b(e.this).o().a(bVar);
                e.c(e.this).x().b(false);
            }

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                } else {
                    e.d(e.this).x().b(false);
                }
            }
        });
    }
}
