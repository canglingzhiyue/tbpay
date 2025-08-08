package com.taobao.android.live.plugin.atype.flexalocal.good.view.bean;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f13840a;
    private String b;
    private List<com.taobao.taolive.sdk.goodlist.a> c;
    private List<ItemIdentifier> d;
    private JSONObject e;

    static {
        kge.a(-2083721770);
    }

    private b() {
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f13840a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public List<com.taobao.taolive.sdk.goodlist.a> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.c;
    }

    public List<ItemIdentifier> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this}) : this.d;
    }

    public void a(List<ItemIdentifier> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.d = new ArrayList();
        this.d.addAll(list);
    }

    public void b(List<com.taobao.taolive.sdk.goodlist.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        this.c = new ArrayList();
        this.c.addAll(list);
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.e = new JSONObject();
        if (jSONObject == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (entry != null && StringUtils.equals(entry.getKey(), "customRulesSortDTOList")) {
                this.e.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this}) : this.e;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("mLiveId=");
        sb.append(this.f13840a);
        sb.append(" mItemId=");
        sb.append(this.b);
        sb.append(" mItemDataList.size()=");
        List<com.taobao.taolive.sdk.goodlist.a> list = this.c;
        if (list != null) {
            i = list.size();
        }
        sb.append(i);
        return sb.toString();
    }

    public static b a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("d9d3f22", new Object[]{str, str2});
        }
        b bVar = new b();
        bVar.f13840a = str;
        bVar.b = str2;
        return bVar;
    }
}
