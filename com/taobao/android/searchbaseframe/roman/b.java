package com.taobao.android.searchbaseframe.roman;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.roman.model.RomanPage;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.searchbaseframe.util.q;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.weex.j;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.dpl;
import tb.imn;
import tb.imo;
import tb.kge;

/* loaded from: classes6.dex */
public class b implements com.taobao.orange.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private volatile String b;

    /* renamed from: a  reason: collision with root package name */
    private volatile Map<String, List<RomanPage>> f14997a = new HashMap();
    private String c = null;

    static {
        kge.a(1051820228);
        kge.a(-1209827241);
    }

    public static /* synthetic */ void a(b bVar, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc00465a", new Object[]{bVar, str, str2, new Integer(i)});
        } else {
            bVar.a(str, str2, i);
        }
    }

    public b() {
        OrangeConfig.getInstance().registerListener(new String[]{"search_roman_page"}, this, true);
    }

    public com.taobao.android.searchbaseframe.util.e<String, Integer> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.searchbaseframe.util.e) ipChange.ipc$dispatch("7965ede7", new Object[]{this, str, str2});
        }
        if (this.f14997a.isEmpty()) {
            k.d("RomanOrangeMatcher", "config is empty, try to load config from cache", new Object[0]);
            a();
        }
        List<RomanPage> list = this.f14997a.get(str);
        if (list != null && !list.isEmpty()) {
            double parseDouble = Double.parseDouble(str2);
            for (RomanPage romanPage : list) {
                if (romanPage.getSversion() <= parseDouble) {
                    return com.taobao.android.searchbaseframe.util.e.a(romanPage.getPageUrl(), Integer.valueOf(romanPage.getVersion()));
                }
            }
        }
        return null;
    }

    @Override // com.taobao.orange.d
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        String str2 = map.get("configVersion");
        if (TextUtils.equals(str2, this.b)) {
            return;
        }
        String customConfig = OrangeConfig.getInstance().getCustomConfig("search_roman_page", "");
        k.a("RomanOrangeMatcher", "onConfigUpdate: config=" + customConfig);
        if (TextUtils.isEmpty(customConfig)) {
            return;
        }
        Map<String, List<RomanPage>> map2 = this.f14997a;
        try {
            this.f14997a = (Map) JSON.parseObject(customConfig, new TypeReference<Map<String, List<RomanPage>>>() { // from class: com.taobao.android.searchbaseframe.roman.b.1
            }, new Feature[0]);
            this.b = str2;
        } catch (Throwable unused) {
        }
        SharedPreferences b = b();
        if (this.c == null) {
            this.c = b.getString("cacheVersion", "");
        }
        if (!TextUtils.equals(this.b, this.c)) {
            b.edit().putString("cacheVersion", this.b).putString("cacheContent", customConfig).apply();
            this.c = this.b;
        }
        try {
            if (q.e()) {
                c();
            } else {
                a(this.f14997a, map2);
            }
        } catch (Exception unused2) {
        }
    }

    private void a(final Map<String, List<RomanPage>> map, final Map<String, List<RomanPage>> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0efabc8", new Object[]{this, map, map2});
            return;
        }
        final List<String> c = q.c();
        if (c.isEmpty()) {
            k.a("RomanOrangeMatcher", "preloadBizList is empty");
            return;
        }
        imn b = imo.b();
        if (b == null || b.a() == null) {
            return;
        }
        final double parseDouble = Double.parseDouble(b.a().e());
        VExecutors.defaultSharedThreadPool().submit(new Runnable() { // from class: com.taobao.android.searchbaseframe.roman.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (Map.Entry entry : map.entrySet()) {
                    List list = null;
                    Map map3 = map2;
                    if (map3 != null) {
                        list = (List) map3.get(entry.getKey());
                    }
                    if (c.contains(entry.getKey())) {
                        for (RomanPage romanPage : (List) entry.getValue()) {
                            if (romanPage != null && (list == null || !list.contains(romanPage))) {
                                if (parseDouble >= romanPage.getSversion() && !dpl.a().e(romanPage.getPageUrl())) {
                                    b.a(b.this, (String) entry.getKey(), romanPage.getPageUrl(), romanPage.getVersion());
                                }
                            }
                        }
                    }
                }
            }
        });
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        final List<String> c = q.c();
        if (c.isEmpty()) {
            k.a("RomanOrangeMatcher", "preloadBizList is empty");
            return;
        }
        imn b = imo.b();
        if (b == null || b.a() == null) {
            return;
        }
        final String e = b.a().e();
        VExecutors.defaultSharedThreadPool().submit(new Runnable() { // from class: com.taobao.android.searchbaseframe.roman.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (String str : c) {
                    try {
                        k.a("RomanOrangeMatcher", "preload: " + str);
                        com.taobao.android.searchbaseframe.util.e<String, Integer> a2 = b.this.a(str, e);
                        if (a2 != null) {
                            String str2 = a2.f15014a;
                            int intValue = a2.b.intValue();
                            if (!dpl.a().e(str2)) {
                                b.a(b.this, str, str2, intValue);
                            }
                        }
                    } catch (Exception e2) {
                        k.a("RomanOrangeMatcher", "preload exception: " + e2.getMessage());
                    }
                }
            }
        });
    }

    private void a(final String str, String str2, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba9507", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        k.a("RomanOrangeMatcher", "downloadTemplate: pageKey=" + str + ", pageUrl=" + str2 + ", templateVersion=" + i);
        com.taobao.android.weex.e.c().a(new j.b(str2), new j.a() { // from class: com.taobao.android.searchbaseframe.roman.b.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex.j.a
            public void a(j.c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c97ddeab", new Object[]{this, cVar});
                } else if (cVar == null) {
                } else {
                    k.a("RomanOrangeMatcher", "onSuccess: path=" + cVar.a());
                    e.a(str, i);
                }
            }

            @Override // com.taobao.android.weex.j.a
            public void a(String str3, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str3, str4});
                    return;
                }
                k.a("RomanOrangeMatcher", "onFailed: subCode=" + str3 + ", errorMsg=" + str4);
                e.a(str, i, str3, str4);
            }
        });
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        SharedPreferences b = b();
        this.c = b.getString("cacheVersion", "");
        if (TextUtils.isEmpty(this.c)) {
            return;
        }
        String string = b.getString("cacheContent", "");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            this.f14997a = (Map) JSON.parseObject(string, new TypeReference<Map<String, List<RomanPage>>>() { // from class: com.taobao.android.searchbaseframe.roman.b.5
            }, new Feature[0]);
        } catch (Throwable th) {
            k.f("RomanOrangeMatcher", "load orange cache failed, error msg is %s", th.getMessage());
        }
    }

    private SharedPreferences b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("811fa7d", new Object[]{this}) : Globals.getApplication().getSharedPreferences("roman_orange_cache", 0);
    }
}
