package com.taobao.android.detail.sdk.event.basic;

import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import java.util.Map;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class r implements Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String b;

    /* renamed from: a  reason: collision with root package name */
    public String f10236a;

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 20001;
    }

    static {
        kge.a(-436002229);
        kge.a(-1834561497);
        b = r.class.getSimpleName();
    }

    public r(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f10236a = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getString("url"));
            JSONObject jSONObject2 = jSONObject.getJSONObject(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
            if (jSONObject2 != null) {
                Uri.Builder buildUpon = Uri.parse(this.f10236a).buildUpon();
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        buildUpon.appendQueryParameter(key, value.toString());
                    }
                }
                this.f10236a = buildUpon.toString();
            }
        }
        tpc.a("com.taobao.android.detail.sdk.event.basic.OpenUrlEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f10236a;
    }
}
