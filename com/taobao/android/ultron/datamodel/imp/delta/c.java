package com.taobao.android.ultron.datamodel.imp.delta;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import tb.jok;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, a> f15776a = new HashMap<>();

    static {
        kge.a(2124068216);
    }

    public c() {
        this.f15776a.put("delete", new b());
        this.f15776a.put("insert", new d());
        this.f15776a.put("reload", new g());
        this.f15776a.put("replace", new h());
        this.f15776a.put("modify", new f());
        this.f15776a.put("merge", new e());
    }

    public void a(String str, com.taobao.android.ultron.datamodel.imp.b bVar, JSONObject jSONObject, List<jok> list) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47fd2639", new Object[]{this, str, bVar, jSONObject, list});
        } else if (StringUtils.isEmpty(str) || this.f15776a.size() <= 0 || (aVar = this.f15776a.get(str)) == null) {
        } else {
            aVar.a(bVar, jSONObject, list);
        }
    }
}
