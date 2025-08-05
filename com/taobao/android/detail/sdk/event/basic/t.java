package com.taobao.android.detail.sdk.event.basic;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import com.taobao.ju.track.server.JTrackParams;
import java.util.Map;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class t implements Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10238a;
    public String b;
    public Map<String, String> c;

    static {
        kge.a(-1886248912);
        kge.a(-1834561497);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue() : ewy.T_BOTTOM_BAR_RESERVE;
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this;
    }

    public t(JSONObject jSONObject, final JSONObject jSONObject2) {
        tpc.a("com.taobao.android.detail.sdk.event.basic.UserTrackEvent");
        if (jSONObject == null) {
            return;
        }
        this.f10238a = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getString("trackName"));
        this.b = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getString("trackNamePre"));
        this.c = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getJSONObject(JTrackParams.TRACK_PARAMS), new com.taobao.android.detail.sdk.utils.g<String>() { // from class: com.taobao.android.detail.sdk.event.basic.t.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ String b(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public String a(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : (String) com.taobao.android.detail.sdk.utils.h.a(jSONObject2, obj);
            }
        });
    }
}
