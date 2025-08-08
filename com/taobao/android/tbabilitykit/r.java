package com.taobao.android.tbabilitykit;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.dkv;
import tb.dkw;
import tb.dkx;
import tb.dla;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dmo;
import tb.kge;

/* loaded from: classes6.dex */
public class r extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SENDBROADCAST = "-2419143124621388726";

    static {
        kge.a(-1900122611);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        if (dlhVar != null) {
            String a2 = dmo.a(dlhVar.c(), "action", "");
            if (!StringUtils.isEmpty(a2)) {
                Intent intent = new Intent(a2);
                JSONObject a3 = dmo.a(dlhVar.c(), "content", (JSONObject) null);
                if (a3 != null) {
                    intent.putExtra("content", a3.toJSONString());
                }
                JSONObject a4 = dmo.a(dlhVar.c(), "userInfo", (JSONObject) null);
                if (a4 != null) {
                    for (Map.Entry<String, Object> entry : a4.entrySet()) {
                        intent.putExtra(entry.getKey().toString(), entry.getValue().toString());
                    }
                }
                LocalBroadcastManager.getInstance(dleVar.a()).sendBroadcast(intent);
            } else {
                return new dkw(new dkv(-100001, "action is null"), false);
            }
        }
        return new dla();
    }
}
