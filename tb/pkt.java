package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taolive.room.dx.a;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.utils.y;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class pkt extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile pkt d;

    static {
        kge.a(503402282);
    }

    public static /* synthetic */ Object ipc$super(pkt pktVar, String str, Object... objArr) {
        if (str.hashCode() == 91915241) {
            super.b();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static pkt c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pkt) ipChange.ipc$dispatch("1e6c7923", new Object[0]);
        }
        if (d == null) {
            synchronized (pkt.class) {
                if (d == null) {
                    d = new pkt();
                }
            }
        }
        return d;
    }

    @Override // com.taobao.taolive.room.dx.a
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.b = context;
        if (this.f21619a == null) {
            return;
        }
        DXEngineConfig b = this.f21619a.b();
        if (y.a() && y.b(this.b)) {
            b.a(true, true);
        }
        if (!y.a() || !y.c(this.b)) {
            return;
        }
        b.a(true);
    }

    @Override // com.taobao.taolive.room.dx.a, com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (netResponse == null || netResponse.getDataJsonObject() == null) {
        } else {
            String jSONObject = netResponse.getDataJsonObject().toString();
            JSONObject jSONObject2 = (JSONObject) pqj.a(jSONObject);
            if (jSONObject2 == null || jSONObject2.getJSONArray("result") == null || jSONObject2.getJSONArray("result").isEmpty()) {
                String b = b(this.b);
                if (TextUtils.isEmpty(b)) {
                    return;
                }
                a(b);
                return;
            }
            this.c = jSONObject;
            a(this.c);
        }
    }

    @Override // com.taobao.taolive.room.dx.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        d = null;
    }

    @Override // com.taobao.taolive.room.dx.a
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : f.r().getDXBizType();
    }

    public void a(DXRootView dXRootView, JSONObject jSONObject, DXRenderOptions dXRenderOptions) {
        DXResult<DXRootView> a2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c693c19", new Object[]{this, dXRootView, jSONObject, dXRenderOptions});
            return;
        }
        if (dXRenderOptions == null) {
            a2 = this.f21619a.a(dXRootView, jSONObject);
        } else {
            a2 = this.f21619a.a(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), jSONObject, -1, dXRenderOptions);
        }
        if (a2 != null) {
            z = a2.b();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", (dXRootView == null || dXRootView.getDxTemplateItem() == null) ? "" : dXRootView.getDxTemplateItem().f11925a);
        if (z) {
            pqi.a().a("DXManager_Render_Point", pqj.a(hashMap), a2.toString(), a2.toString());
        } else {
            pqi.a().a("DXManager_Render_Point", pqj.a(hashMap));
        }
    }
}
