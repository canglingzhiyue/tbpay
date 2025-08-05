package com.taobao.linkmanager.afc.plugin;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.themis.kernel.i;
import java.net.URLEncoder;
import tb.kge;
import tb.knx;
import tb.koj;

/* loaded from: classes.dex */
public class a implements koj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-898933683);
        kge.a(-1094153819);
    }

    @Override // tb.koj
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return 1;
    }

    @Override // tb.koj
    public int a(com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc9b6d88", new Object[]{this, aVar})).intValue();
        }
        return 1;
    }

    @Override // tb.koj
    public void a(com.taobao.flowcustoms.afc.a aVar, String str, knx knxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c01b47fa", new Object[]{this, aVar, str, knxVar});
            return;
        }
        String a2 = TFCCommonUtils.a(str, i.KEY_AFC_LINK, "1");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(i.KEY_AFC_LINK, (Object) "1");
            a2 = TFCCommonUtils.a(a2, "utparamcnt", URLEncoder.encode(jSONObject.toJSONString()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (knxVar == null) {
            return;
        }
        knxVar.a(true, a2);
    }
}
