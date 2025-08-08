package com.taobao.tao.flexbox.layoutmanager.core;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.a;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import com.taobao.tao.flexbox.layoutmanager.container.g;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogh;
import tb.ohg;

/* loaded from: classes8.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BAD_DSL = "badDSL";
    public static final int DEFAULT_TNODE_VERSION = -1;
    public static final String DSL_PREFIX = "tnode_dsl_";
    public static final String DSL_TYPE_AWP = "awp";
    public static final String DSL_TYPE_CACHE = "cache";
    public static final String DSL_TYPE_LAST_AWP = "last_awp";
    public static final String DSL_TYPE_LOCAL = "local";
    public static final String DSL_TYPE_MAP = "map";
    public static final String DSL_TYPE_NETWORK = "network";
    public static final String DSL_TYPE_REUSE = "reuse";
    public static final String DSL_TYPE_UNKNOWN = "unknown";
    public static final int TNODE_SUPPORT_PAD_VERSION = 3;

    /* renamed from: a  reason: collision with root package name */
    private static LruCache<String, Map> f20348a;

    /* loaded from: classes8.dex */
    public interface a {
        void a(Map map, String str);
    }

    public static /* synthetic */ void a(ab.h hVar, Map map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("958f2a89", new Object[]{hVar, map, aVar});
        } else {
            b(hVar, map, aVar);
        }
    }

    public static /* synthetic */ void b(ab abVar, ab.h hVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dadd6830", new Object[]{abVar, hVar, aVar});
        } else {
            c(abVar, hVar, aVar);
        }
    }

    static {
        kge.a(-1723782282);
        f20348a = new LruCache<>(10);
    }

    public static void a(ab abVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9095ad4d", new Object[]{abVar, str, str2, str3});
        } else {
            a(abVar, str, str2, str3, null);
        }
    }

    public static void a(ab abVar, String str, String str2, String str3, final a aVar) {
        Uri parse;
        g.b b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fa23d56", new Object[]{abVar, str, str2, str3, aVar});
            return;
        }
        if (str != null && str.startsWith(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_PAGE_PREFIX)) {
            if (str.equals(com.taobao.tao.flexbox.layoutmanager.container.g.TAB2_VIDEO_LINK)) {
                b2 = com.taobao.tao.flexbox.layoutmanager.container.g.a((Uri) null, str, true);
            } else {
                b2 = com.taobao.tao.flexbox.layoutmanager.container.g.b(null, str, true);
            }
            if (str2 == null) {
                str2 = b2.b();
            }
            if (str3 == null) {
                str3 = b2.a();
            }
            str = b2.d;
        }
        boolean z = (str == null || (parse = Uri.parse(str)) == null || !StringUtils.equals("localFirst", parse.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_POLICY))) ? false : true;
        String d = oec.d(str);
        ab.h.a aVar2 = new ab.h.a(abVar != null ? abVar.l() : ab.a());
        aVar2.c(d);
        aVar2.d(str2);
        aVar2.e(str3);
        aVar2.d(true);
        if (z) {
            aVar2.c(0);
        }
        final ab.h e = aVar2.e();
        e.g = abVar;
        Map a2 = a((byte[]) null, e.b, e.f);
        if (a2 != null) {
            e.j = "cache";
            if (aVar == null) {
                return;
            }
            aVar.a(a2, e.j);
            return;
        }
        boolean a3 = a(e);
        byte[] a4 = a(e, a3);
        if (a4 == null || a4.length == 0) {
            if (a3 && !StringUtils.isEmpty(e.c)) {
                Map d2 = d(e);
                if (aVar == null) {
                    return;
                }
                aVar.a(d2, e.j);
                return;
            }
            e.j = "network";
            com.taobao.tao.flexbox.layoutmanager.ac.a.a().a(e.b, false, new a.b() { // from class: com.taobao.tao.flexbox.layoutmanager.core.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.ac.a.b
                public void a(byte[] bArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c19672f", new Object[]{this, bArr});
                        return;
                    }
                    Map map = null;
                    if (bArr != null && bArr.length > 0 && (map = h.a(bArr, ab.h.this.b, ab.h.this.f)) != null && oeb.bV()) {
                        h.a(ab.h.this, bArr);
                    }
                    a aVar3 = aVar;
                    if (aVar3 == null) {
                        return;
                    }
                    aVar3.a(map, ab.h.this.j);
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.ac.a.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    a aVar3 = aVar;
                    if (aVar3 == null) {
                        return;
                    }
                    aVar3.a(null, ab.h.this.j);
                }
            });
            return;
        }
        Map a5 = a(a4, e.b, e.f);
        if (aVar == null) {
            return;
        }
        aVar.a(a5, e.j);
    }

    public static boolean a(ab.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("971f5baf", new Object[]{hVar})).booleanValue();
        }
        if (a(hVar.b)) {
            return false;
        }
        int i = hVar.l;
        if (i != -1) {
            return i == 0;
        } else if (hVar.e == null) {
            return false;
        } else {
            return oec.a(hVar.e.get(ab.LAYOUT_STRATEGY_KEY), false);
        }
    }

    public static void a(ab.h hVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ccd91b2", new Object[]{hVar, bArr});
        } else if (!a(hVar.b, hVar.f)) {
        } else {
            IStorage q = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().q();
            String e = e(hVar);
            if (!StringUtils.isEmpty(e)) {
                q.a(IStorage.TYPE_DSL, DSL_PREFIX + e, hVar.b);
            }
            q.a(IStorage.TYPE_DSL, DSL_PREFIX + hVar.b, bArr);
        }
    }

    public static void b(ab.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245a0d2c", new Object[]{hVar});
            return;
        }
        IStorage q = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().q();
        String e = e(hVar);
        if (!StringUtils.isEmpty(e)) {
            Object a2 = q.a(IStorage.TYPE_DSL, DSL_PREFIX + e);
            if ((a2 instanceof String) && StringUtils.equals((CharSequence) a2, hVar.b)) {
                q.b(IStorage.TYPE_DSL, DSL_PREFIX + e);
            }
        }
        q.b(IStorage.TYPE_DSL, DSL_PREFIX + hVar.b);
    }

    private static String e(ab.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f86d1", new Object[]{hVar});
        }
        if (!StringUtils.isEmpty(hVar.c)) {
            return hVar.c + hVar.m;
        } else if (hVar.n != null && !StringUtils.isEmpty(hVar.n.i) && oeb.bq()) {
            return hVar.n.i;
        } else {
            return null;
        }
    }

    public static byte[] c(ab.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("810317d0", new Object[]{hVar});
        }
        String e = e(hVar);
        if (StringUtils.isEmpty(e)) {
            return null;
        }
        ogh.a("loadLatestDSLFromCache");
        Object c = c(DSL_PREFIX + e);
        if (c != null && (c instanceof String)) {
            Object c2 = c(DSL_PREFIX + c);
            if (c2 != null && (c2 instanceof byte[])) {
                byte[] bArr = (byte[]) c2;
                if (bArr.length > 0) {
                    hVar.j = DSL_TYPE_LAST_AWP;
                    ogh.b();
                    return bArr;
                }
            }
        }
        ogh.b();
        return null;
    }

    private static Object c(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c56c56fe", new Object[]{str});
        }
        final IStorage q = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().q();
        final Object a2 = q.a(IStorage.TYPE_DSL, str);
        if (a2 == null && (a2 = q.b(str)) != null) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.h.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    IStorage.this.a(IStorage.TYPE_DSL, str, a2);
                    IStorage.this.b("config", str);
                }
            });
        }
        return a2;
    }

    public static byte[] a(final ab.h hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("4cccc574", new Object[]{hVar, new Boolean(z)});
        }
        if (StringUtils.isEmpty(hVar.b)) {
            return null;
        }
        ogh.a("loadDSLFromCache");
        Object c = c(DSL_PREFIX + hVar.b);
        if (c != null && (c instanceof byte[])) {
            byte[] bArr = (byte[]) c;
            if (bArr.length > 0) {
                hVar.j = DSL_TYPE_AWP;
                ogh.b();
                return bArr;
            }
        }
        ogh.b();
        if (!z) {
            return null;
        }
        com.taobao.tao.flexbox.layoutmanager.ac.a.a().a(hVar.b, new a.b() { // from class: com.taobao.tao.flexbox.layoutmanager.core.h.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.ac.a.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.ac.a.b
            public void a(byte[] bArr2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c19672f", new Object[]{this, bArr2});
                } else if (bArr2 == null || bArr2.length <= 0) {
                } else {
                    h.a(ab.h.this, bArr2);
                }
            }
        });
        return c(hVar);
    }

    public static void a(final ab abVar, final ab.h hVar, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c7611", new Object[]{abVar, hVar, aVar});
            return;
        }
        Map a2 = a((byte[]) null, hVar.b, hVar.f);
        if (a2 != null) {
            hVar.j = "cache";
            b(hVar, a2, aVar);
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.h.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                boolean a3 = h.a(ab.h.this);
                byte[] a4 = h.a(ab.h.this, a3);
                if (a4 == null || a4.length == 0) {
                    if (!a3 || StringUtils.isEmpty(ab.h.this.c)) {
                        h.b(abVar, ab.h.this, aVar);
                        return;
                    } else {
                        h.a(ab.h.this, h.d(ab.h.this), aVar);
                        return;
                    }
                }
                Map a5 = h.a(a4, ab.h.this.b, ab.h.this.f);
                if (a5 == null && !StringUtils.isEmpty(ab.h.this.c)) {
                    a5 = h.d(ab.h.this);
                }
                if (a5 != null || !oeb.a("recoverDamagedDSL", true)) {
                    h.a(ab.h.this, a5, aVar);
                } else {
                    h.b(abVar, ab.h.this, aVar);
                }
            }
        };
        if (hVar.z) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(runnable);
        } else {
            runnable.run();
        }
    }

    private static void c(ab abVar, final ab.h hVar, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36e5a4f", new Object[]{abVar, hVar, aVar});
        } else {
            com.taobao.tao.flexbox.layoutmanager.ac.a.a().a(hVar.b, !abVar.a(hVar), new a.b() { // from class: com.taobao.tao.flexbox.layoutmanager.core.h.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.ac.a.b
                public void a(byte[] bArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c19672f", new Object[]{this, bArr});
                        return;
                    }
                    if (bArr == null || bArr.length == 0) {
                        bArr = h.c(ab.h.this);
                    } else {
                        h.a(ab.h.this, bArr);
                    }
                    if (bArr == null || bArr.length == 0) {
                        if (!StringUtils.isEmpty(ab.h.this.c)) {
                            h.a(ab.h.this, h.d(ab.h.this), aVar);
                            return;
                        } else {
                            h.a(ab.h.this, (Map) null, aVar);
                            return;
                        }
                    }
                    Map a2 = h.a(bArr, ab.h.this.b, ab.h.this.f);
                    if (a2 != null) {
                        ab.h.this.j = "network";
                    } else if (!StringUtils.isEmpty(ab.h.this.c)) {
                        a2 = h.d(ab.h.this);
                    }
                    h.a(ab.h.this, a2, aVar);
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.ac.a.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        a(null);
                    }
                }
            });
        }
    }

    private static void b(final ab.h hVar, final Map map, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0bc04a", new Object[]{hVar, map, aVar});
        } else if (aVar == null) {
        } else {
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.h.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ogg.c("DSL", "notifyDSLLoadFinish, url:" + ab.h.this.b + ", source:" + ab.h.this.j);
                    aVar.a(map, ab.h.this.j);
                }
            }, true);
        }
    }

    public static Map d(ab.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("422a99e3", new Object[]{hVar});
        }
        Map a2 = a((byte[]) null, hVar.c, hVar.f);
        if (a2 == null) {
            a2 = a(oec.b(hVar.c, hVar.f20321a), hVar.c, hVar.f);
            if (a2 != null) {
                hVar.j = "local";
            }
        } else {
            hVar.j = "cache";
        }
        return a2;
    }

    private static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue() : !a(str) && z;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : str != null && (str.endsWith("/tnode") || str.endsWith("/tnodeb") || str.contains("dev.g.alicdn.com"));
    }

    public static Map a(byte[] bArr, String str, boolean z) {
        Map map;
        Map map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f4885b0", new Object[]{bArr, str, new Boolean(z)});
        }
        if (str == null) {
            return null;
        }
        String c = oec.c(oec.d(str));
        synchronized (f20348a) {
            map = f20348a.get(c);
        }
        if (map != null || bArr == null || bArr.length <= 0) {
            return map;
        }
        try {
            ogh.a("parseDSL:" + c);
            map2 = (Map) i.a(bArr);
        } catch (Exception e) {
            e = e;
        }
        try {
            ogh.b();
            if (map2 == null || map2.isEmpty()) {
                return null;
            }
            if (a(c, z)) {
                synchronized (f20348a) {
                    f20348a.put(c, map2);
                }
            }
            return map2;
        } catch (Exception e2) {
            e = e2;
            map = map2;
            ogg.a("TNode", "" + c + " is invalid json " + e.getMessage());
            return map;
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        String a2 = ohg.a().a("weitao_switch", BAD_DSL, "");
        if (!StringUtils.isEmpty(a2)) {
            for (String str2 : a2.split(",")) {
                if (str2.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (Build.VERSION.SDK_INT < 12) {
        } else {
            synchronized (f20348a) {
                f20348a.evictAll();
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f20355a;
        public int b;
        public Map c;
        public List d;
        public Map e;
        public String f;
        public String g;
        public Map h;
        public Map i;
        public Map j;
        public Map k;
        public Map l;
        public Map m;
        public boolean n;
        public boolean o;
        public Boolean p;

        static {
            kge.a(859700880);
        }

        public static b a(b bVar, b bVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8c5424ba", new Object[]{bVar, bVar2});
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.f20355a = bVar2.f20355a;
            bVar.b = bVar2.b;
            bVar.c = bVar2.c;
            bVar.d = bVar2.d;
            bVar.e = bVar2.e;
            bVar.f = bVar2.f;
            bVar.g = bVar2.g;
            bVar.h = bVar2.h;
            bVar.i = bVar2.i;
            bVar.j = bVar2.j;
            bVar.k = bVar2.k;
            bVar.l = bVar2.l;
            bVar.m = bVar2.m;
            bVar.n = bVar2.n;
            bVar.o = bVar2.o;
            bVar.p = bVar2.p;
            return bVar;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static b a(Map<String, Object> map) {
            char c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("94775bef", new Object[]{map});
            }
            b bVar = new b();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                switch (key.hashCode()) {
                    case -928162171:
                        if (key.equals("bindattrs")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 115792:
                        if (key.equals("uid")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3373707:
                        if (key.equals("name")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3575610:
                        if (key.equals("type")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 90810505:
                        if (key.equals("_data")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 93152418:
                        if (key.equals("attrs")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 94742904:
                        if (key.equals("class")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1659526655:
                        if (key.equals("children")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1816696321:
                        if (key.equals("_styles")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        bVar.f20355a = (String) value;
                        break;
                    case 1:
                        bVar.b = ((Integer) value).intValue();
                        break;
                    case 2:
                        bVar.c = (Map) value;
                        break;
                    case 3:
                        bVar.d = (List) value;
                        break;
                    case 4:
                        bVar.e = (Map) value;
                        break;
                    case 5:
                        bVar.f = (String) value;
                        break;
                    case 6:
                        bVar.g = (String) value;
                        break;
                    case 7:
                        bVar.h = (Map) value;
                        break;
                    case '\b':
                        bVar.i = (Map) value;
                        break;
                }
            }
            return bVar;
        }
    }
}
