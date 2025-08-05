package com.taobao.android.searchbaseframe.roman;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.g;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.SymbolExpUtil;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, com.taobao.android.searchbaseframe.util.e<String, Integer>> f15005a = new HashMap();

    static {
        kge.a(-1514754921);
    }

    public d() {
        b();
    }

    public com.taobao.android.searchbaseframe.util.e<String, Integer> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.util.e) ipChange.ipc$dispatch("370be91d", new Object[]{this, str}) : this.f15005a.get(str);
    }

    public void a(Map<String, com.taobao.android.searchbaseframe.util.e<String, Integer>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, com.taobao.android.searchbaseframe.util.e<String, Integer>> entry : map.entrySet()) {
            String key = entry.getKey();
            com.taobao.android.searchbaseframe.util.e<String, Integer> value = entry.getValue();
            com.taobao.android.searchbaseframe.util.e<String, Integer> eVar = this.f15005a.get(key);
            if (eVar == null || value.b.intValue() > eVar.b.intValue()) {
                hashMap.put(key, value);
                this.f15005a.put(key, value);
            }
        }
        if (hashMap.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = a().edit();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            com.taobao.android.searchbaseframe.util.e eVar2 = (com.taobao.android.searchbaseframe.util.e) entry2.getValue();
            edit.putString((String) entry2.getKey(), ((String) eVar2.f15014a) + "|" + eVar2.b);
        }
        edit.apply();
    }

    private SharedPreferences a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("3f11033c", new Object[]{this}) : Globals.getApplication().getSharedPreferences("search_roman_page", 0);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (Map.Entry<String, ?> entry : a().getAll().entrySet()) {
            if (entry.getValue() != null) {
                String key = entry.getKey();
                String[] split = entry.getValue().toString().split(SymbolExpUtil.SYMBOL_VERTICALBAR);
                if (split.length >= 2) {
                    String str = split[0];
                    int b = g.b(split[1], -1);
                    if (b >= 0) {
                        this.f15005a.put(key, com.taobao.android.searchbaseframe.util.e.a(str, Integer.valueOf(b)));
                    }
                }
            }
        }
    }
}
