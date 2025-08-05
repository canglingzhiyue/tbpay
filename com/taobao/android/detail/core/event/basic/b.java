package com.taobao.android.detail.core.event.basic;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.emu;
import tb.enn;
import tb.epw;
import tb.epy;
import tb.kge;

/* loaded from: classes4.dex */
public class b extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, String> f9696a;

    static {
        kge.a(2071866679);
    }

    public b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.isEmpty()) {
            return;
        }
        this.f9696a = epw.a(jSONObject, new epy<String>() { // from class: com.taobao.android.detail.core.event.basic.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
            @Override // tb.epy
            public /* synthetic */ String b(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public String a(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : (String) obj;
            }
        });
        emu.a("com.taobao.android.detail.core.event.basic.DisappearTrackEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f9696a;
    }
}
