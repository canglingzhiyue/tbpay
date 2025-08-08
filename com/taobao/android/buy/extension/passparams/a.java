package com.taobao.android.buy.extension.passparams;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.android.buy.toggle.b;
import java.util.Map;
import tb.asf;
import tb.bau;
import tb.bba;
import tb.kge;

@AURAExtensionImpl(code = "alibuy.impl.nextrpc.passParams")
/* loaded from: classes4.dex */
public final class a extends asf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f9228a = "itemCount";
    private final String b = "feature";

    static {
        kge.a(-497295880);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 612531915) {
            super.a((AURANextRPCEndpoint) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.asf, tb.asg
    public void a(AURANextRPCEndpoint aURANextRPCEndpoint) {
        JSONObject g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24827ecb", new Object[]{this, aURANextRPCEndpoint});
            return;
        }
        super.a(aURANextRPCEndpoint);
        Map<String, String> dataParams = aURANextRPCEndpoint.getDataParams();
        if (bau.a(dataParams)) {
            return;
        }
        String str = dataParams.get("feature");
        if (StringUtils.isEmpty(str)) {
            return;
        }
        JSONObject a2 = bba.a(str);
        if (bau.a(a2) || (g = g()) == null) {
            return;
        }
        a2.putAll(g);
        dataParams.put("feature", a2.toJSONString());
    }

    private JSONObject g() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e68e6c8e", new Object[]{this});
        }
        JSONObject h = h();
        if (h == null || (jSONObject = h.getJSONObject("global")) == null || (jSONObject2 = jSONObject.getJSONObject("params")) == null) {
            return null;
        }
        final String string = jSONObject2.getString("itemCount");
        if (!StringUtils.isEmpty(string)) {
            return new JSONObject() { // from class: com.taobao.android.buy.extension.passparams.AliBuyPassParamsNextRPCExtension$1
                {
                    Map<String, Object> b;
                    put("itemCount", (Object) string);
                    Map<String, Object> aBTestParams = AliBuyPerfSwitcher.getABTestParams();
                    if (aBTestParams != null) {
                        putAll(aBTestParams);
                    }
                    if (!com.taobao.android.buy.toggle.a.a("uploadStyleParams", false) || (b = b.b()) == null) {
                        return;
                    }
                    putAll(b);
                }
            };
        }
        return null;
    }

    private JSONObject h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fa36400f", new Object[]{this});
        }
        AURAGlobalData e = e();
        if (e != null) {
            return (JSONObject) e.get("aura_data_protocol_json", JSONObject.class);
        }
        return null;
    }
}
