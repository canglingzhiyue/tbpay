package com.taobao.tao.flexbox.layoutmanager.container;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.g;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogy;
import tb.riy;

/* loaded from: classes8.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-614328273);
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f20266a;
        public Uri b;
        public String c;
        public Uri d;
        public Map<String, Object> e;
        public String f;
        public boolean g;
        public String h;
        public String i;

        static {
            kge.a(1437250467);
        }

        public b(String str, Uri uri, Uri uri2, Map<String, Object> map, String str2, boolean z, String str3, String str4) {
            this.f20266a = str;
            this.b = uri;
            this.d = uri2;
            if (uri2 != null) {
                this.c = uri2.toString();
            }
            this.e = map;
            this.f = str2;
            this.g = z;
            this.h = str3;
            this.i = str4;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
            }
            Uri uri = this.b;
            if (uri == null) {
                return null;
            }
            return oec.d(uri.toString());
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : oec.a(this.e.get(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_ENTRY), (String) null);
        }

        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : oec.a(this.e.get(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_PATH), (String) null);
        }

        public String d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : oec.a(this.e.get(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_VERSION), (String) null);
        }

        public String e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : oec.a(this.e.get(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_POLICY), (String) null);
        }

        public boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
            }
            if (this.d != null && oeb.bU()) {
                return oec.a((Object) this.d.getQueryParameter("tnodeInterceptBack"), false);
            }
            return false;
        }
    }

    public static b a(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a2867a12", new Object[]{uri}) : a(uri, false);
    }

    public static b a(Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("67372f5c", new Object[]{uri, new Boolean(z)}) : (b) b(uri, z).second;
    }

    public static String b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("645552ff", new Object[]{str, new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder("https://h5.m.taobao.com/tnode/index.htm?tnode=");
        sb.append(Uri.encode(str));
        if (z) {
            String query = Uri.parse(str).getQuery();
            if (!TextUtils.isEmpty(query)) {
                sb.append("&");
                sb.append(query);
            }
        }
        return sb.toString();
    }

    private static b c(Uri uri, boolean z) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        boolean z3 = false;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("9c19219a", new Object[]{uri, new Boolean(z)});
        }
        String str3 = null;
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        String queryParameter = uri.getQueryParameter("tnode");
        if (TextUtils.isEmpty(queryParameter)) {
            uri = Uri.parse(b(uri2, false));
            queryParameter = uri.getQueryParameter("tnode");
        }
        Uri uri3 = uri;
        if (queryParameter.startsWith(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_PAGE_PREFIX)) {
            g.b b2 = g.b(uri3, queryParameter, z);
            str = b2.b;
            str2 = b2.f20261a;
            queryParameter = b2.c;
            if (!b2.e) {
                Uri parse = Uri.parse(queryParameter);
                HashMap hashMap = new HashMap();
                if (parse != null) {
                    str3 = parse.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_INIT_DATA_KEY);
                    for (String str4 : parse.getQueryParameterNames()) {
                        hashMap.put(str4, parse.getQueryParameter(str4));
                    }
                }
                return new b(uri2, parse, uri3, hashMap, str3, false, str, str2);
            }
            z3 = true;
        } else {
            str = null;
            str2 = null;
        }
        String a2 = ogy.a(queryParameter);
        if (TextUtils.equals(a2, queryParameter)) {
            z2 = z3;
        }
        Uri parse2 = Uri.parse(a2);
        if (z2) {
            uri3 = oec.a(uri3, "tnode", parse2.toString());
        }
        HashMap hashMap2 = new HashMap();
        if (parse2 != null) {
            str3 = parse2.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_INIT_DATA_KEY);
            for (String str5 : parse2.getQueryParameterNames()) {
                hashMap2.put(str5, parse2.getQueryParameter(str5));
            }
        }
        return new b(uri2, parse2, uri3, hashMap2, str3, true, str, str2);
    }

    public static b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("544300df", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        return a(Uri.parse(str));
    }

    public static b a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("ed0b822f", new Object[]{str, new Boolean(z)});
        }
        if (str == null) {
            return null;
        }
        return a(Uri.parse(str), z);
    }

    public static Pair<Uri, b> b(Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("f3965ae0", new Object[]{uri, new Boolean(z)});
        }
        if (uri == null) {
            return null;
        }
        b a2 = a.a(uri, z);
        if (a2 == null && (a2 = c(uri, z)) != null) {
            uri = a.a(uri, z, a2);
        }
        return new Pair<>(uri, a2);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            a.a(Uri.parse(str));
        }
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final LruCache<String, b> f20265a;

        public static /* synthetic */ Uri a(Uri uri, boolean z, b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("bba3bd87", new Object[]{uri, new Boolean(z), bVar}) : b(uri, z, bVar);
        }

        public static /* synthetic */ b a(Uri uri) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a2867a12", new Object[]{uri}) : b(uri);
        }

        public static /* synthetic */ b a(Uri uri, boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("67372f5c", new Object[]{uri, new Boolean(z)}) : b(uri, z);
        }

        static {
            kge.a(1774532285);
            f20265a = new LruCache<>(10);
        }

        private static Uri b(Uri uri, boolean z, b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("81ce4648", new Object[]{uri, new Boolean(z), bVar});
            }
            String c = c(uri, z);
            f20265a.put(c, bVar);
            return uri.buildUpon().appendQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_URL_CONFIG_CACHE_KEY, c).build();
        }

        private static b b(Uri uri, boolean z) {
            String queryParameter;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("81a8287b", new Object[]{uri, new Boolean(z)});
            }
            if (uri != null && (queryParameter = uri.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_URL_CONFIG_CACHE_KEY)) != null && queryParameter.startsWith(String.valueOf(z))) {
                return f20265a.get(queryParameter);
            }
            return null;
        }

        private static b b(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("69926113", new Object[]{uri});
            }
            if (uri == null) {
                return null;
            }
            String queryParameter = uri.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_URL_CONFIG_CACHE_KEY);
            if (TextUtils.isEmpty(queryParameter)) {
                return null;
            }
            return f20265a.remove(queryParameter);
        }

        private static String c(Uri uri, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("28d51229", new Object[]{uri, new Boolean(z)});
            }
            return z + riy.PLUS + String.valueOf(System.currentTimeMillis());
        }
    }
}
