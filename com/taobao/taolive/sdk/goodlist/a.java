package com.taobao.taolive.sdk.goodlist;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f21830a;
    public JSONObject b;
    public int c;
    public long d;
    public String e;
    public String f;
    public Map<String, String> g;
    public boolean h;
    public boolean i;

    static {
        kge.a(1163886121);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : a();
    }

    public a(String str, int i, JSONObject jSONObject, int i2, long j) {
        this.f21830a = i;
        this.b = jSONObject;
        this.c = i2;
        this.d = j;
        this.e = str;
    }

    public void a(LiveItem liveItem, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51e3ca2", new Object[]{this, liveItem, map});
        } else if (liveItem == null) {
        } else {
            this.g = map;
            String str = "1";
            if (liveItem.personalityData != null) {
                z = TextUtils.equals(liveItem.personalityData.getString("subscribeStatus"), str);
            }
            Map<String, String> map2 = this.g;
            StringBuilder sb = new StringBuilder();
            sb.append("1_");
            if (!z) {
                str = "0";
            }
            sb.append(str);
            map2.put("subscribe", sb.toString());
            this.i = c.b(liveItem);
        }
    }

    public a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e758fa23", new Object[]{this});
        }
        a aVar = new a(this.e, this.f21830a, (JSONObject) this.b.clone(), this.c, this.d);
        aVar.f = this.f;
        return aVar;
    }
}
