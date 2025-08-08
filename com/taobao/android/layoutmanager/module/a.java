package com.taobao.android.layoutmanager.module;

import android.app.Activity;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.ag;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.ogv;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static LruCache<Object, C0513a> f13268a;

    static {
        kge.a(1497760218);
        f13268a = new LruCache<>(5);
    }

    public static C0513a a(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0513a) ipChange.ipc$dispatch("3ba5cea7", new Object[]{obj, new Boolean(z)});
        }
        C0513a c0513a = null;
        if (obj != null && oeb.bw() && f13268a.get(obj) == null) {
            Map<String, String> pageAllProperties = obj instanceof Activity ? UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties((Activity) obj) : null;
            if (ogv.a(pageAllProperties)) {
                pageAllProperties = UTAnalytics.getInstance().getDefaultTracker().getPageProperties(obj);
            }
            if (!ogv.a(pageAllProperties)) {
                String encode = Uri.encode(pageAllProperties.get(ag.KEY_UTPARAM_URL));
                String encode2 = Uri.encode(pageAllProperties.get("utparam-pre"));
                if (!StringUtils.isEmpty(encode) || !StringUtils.isEmpty(encode2)) {
                    c0513a = new C0513a(encode, encode2);
                    f13268a.put(obj, c0513a);
                    if (z) {
                        HashMap hashMap = new HashMap();
                        if (!StringUtils.isEmpty(encode)) {
                            hashMap.put("entryUtparam", encode);
                        }
                        if (!StringUtils.isEmpty(encode2)) {
                            hashMap.put("entryUtparamPre", encode2);
                        }
                        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(obj, hashMap);
                    }
                }
            }
        }
        return c0513a;
    }

    public static C0513a a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0513a) ipChange.ipc$dispatch("4c9af9db", new Object[]{obj});
        }
        if (obj != null && oeb.bw()) {
            return f13268a.get(obj);
        }
        return null;
    }

    public static void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{obj});
        } else if (obj == null || !oeb.bw()) {
        } else {
            f13268a.remove(obj);
        }
    }

    /* renamed from: com.taobao.android.layoutmanager.module.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0513a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f13269a;
        private String b;

        static {
            kge.a(-1251575637);
        }

        public C0513a(String str, String str2) {
            this.f13269a = str;
            this.b = str2;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f13269a;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }
    }
}
