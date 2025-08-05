package com.taobao.android.weex_ability.page;

import android.view.Menu;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.p;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public interface a {
        void a(int i);
    }

    static {
        kge.a(-1910953143);
    }

    public abstract com.taobao.android.weex_ability.page.a a(p pVar);

    public abstract com.taobao.android.weex_ability.page.a a(p pVar, JSONObject jSONObject);

    public abstract com.taobao.android.weex_ability.page.a a(p pVar, JSONObject jSONObject, a aVar);

    public abstract boolean a(p pVar, Menu menu);

    public abstract com.taobao.android.weex_ability.page.a b(p pVar);

    public abstract com.taobao.android.weex_ability.page.a b(p pVar, JSONObject jSONObject);

    public abstract com.taobao.android.weex_ability.page.a b(p pVar, JSONObject jSONObject, a aVar);

    public abstract com.taobao.android.weex_ability.page.a c(p pVar, JSONObject jSONObject);

    public abstract com.taobao.android.weex_ability.page.a c(p pVar, JSONObject jSONObject, a aVar);

    public abstract com.taobao.android.weex_ability.page.a d(p pVar, JSONObject jSONObject);

    public abstract com.taobao.android.weex_ability.page.a e(p pVar, JSONObject jSONObject);

    public abstract com.taobao.android.weex_ability.page.a f(p pVar, JSONObject jSONObject);

    public abstract com.taobao.android.weex_ability.page.a g(p pVar, JSONObject jSONObject);

    public com.taobao.android.weex_ability.page.a h(p pVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_ability.page.a) ipChange.ipc$dispatch("71034002", new Object[]{this, pVar, jSONObject}) : new com.taobao.android.weex_ability.page.a("WX_NOT_SUPPORTED", "Only Taobao app support showMenu(), check implement in TBNavBarAdapter");
    }
}
