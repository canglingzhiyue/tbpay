package com.taobao.android.live.plugin.atype.flexalocal.good.view.search;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(613725995);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("search_entry", f(str, str2));
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().b("Show-search_view", f(str, str2));
        }
    }

    public static void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{str, str2, new Boolean(z)});
        } else if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
        } else {
            HashMap<String, String> f = f(str, str2);
            f.put("from", z ? "searchpage" : "searchkeyboard");
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("search_confirm", f);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("search_back", f(str, str2));
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("search_cancel", f(str, str2));
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("search_delete", f(str, str2));
        }
    }

    public static void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{str, str2, jSONObject});
        } else if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() != null) {
            HashMap<String, String> f = f(str, str2);
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                f.put(entry.getKey(), entry.getValue() + "");
            }
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().b("Show-GoodListOpenUrl", f);
        }
    }

    private static HashMap<String, String> f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("b0fddba4", new Object[]{str, str2});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("feed_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("account_id", str2);
        }
        return hashMap;
    }
}
