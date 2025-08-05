package com.taobao.android.detail.sdk.event.basic;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.evl;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class m extends evl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<String> f10229a;

    static {
        kge.a(-1396569543);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 29913;
    }

    @Override // tb.evl, com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public m(JSONObject jSONObject) {
        this.f10229a = null;
        tpc.a("com.taobao.android.detail.sdk.event.basic.OpenPurchaseEvent");
        if (jSONObject == null || !jSONObject.containsKey("open_purchase_limit")) {
            return;
        }
        this.f10229a = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getJSONArray("open_purchase_limit"), new com.taobao.android.detail.sdk.utils.g<String>() { // from class: com.taobao.android.detail.sdk.event.basic.m.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ String b(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public String a(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : (String) obj;
            }
        });
    }
}
