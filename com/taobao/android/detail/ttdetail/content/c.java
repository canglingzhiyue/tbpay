package com.taobao.android.detail.ttdetail.content;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.TBPlayerConst;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f10584a;
    private String b;
    private String c;
    private String d;
    private String e;
    private JSONObject f;

    static {
        kge.a(1399813765);
    }

    public c(String str, String str2, String str3) {
        this.f10584a = str;
        this.b = str2;
        this.e = str3;
        if (this.f10584a == null || this.b == null) {
            com.taobao.android.detail.ttdetail.utils.i.a("ContentRequestParams", "create ContentRequestParams error");
        }
        this.c = "all";
    }

    public HashMap<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("id", this.f10584a);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName, (Object) this.e);
        jSONObject.put("tab", (Object) this.c);
        jSONObject.put("pvUuid", (Object) this.b);
        String str = this.d;
        if (str == null) {
            str = "";
        }
        jSONObject.put("seeIds", (Object) str);
        JSONObject jSONObject2 = this.f;
        if (jSONObject2 != null) {
            jSONObject.put(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_PAGINATION, (Object) jSONObject2);
        }
        hashMap.put("exParams", JSONObject.toJSONString(jSONObject));
        return hashMap;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.f = jSONObject;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }
}
