package com.uc.webview.internal.setup.component;

import mtopsdk.common.util.StringUtils;
import android.webkit.ValueCallback;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.uc.webview.base.EnvInfo;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.eau;
import tb.riy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    static final Class f23917a = a("com.uc.pars.api.Pars");
    static final Class b = a("com.uc.pars.api.IParsObserver");
    static final Class c = a("com.uc.pars.api.Pars$ParsPackageCallback");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public interface a {
        boolean a(d dVar, boolean z, boolean z2);

        boolean a(j jVar);

        boolean j();

        void k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class b {
        private static final Map<String, b> c = new HashMap();

        /* renamed from: a  reason: collision with root package name */
        int f23920a;
        int b = 90;
        private final String d;
        private a e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes9.dex */
        public class a implements ValueCallback<j> {

            /* renamed from: a  reason: collision with root package name */
            HashSet<a> f23922a;

            private a() {
                this.f23922a = new HashSet<>();
            }

            /* synthetic */ a(b bVar, byte b) {
                this();
            }

            final void a(a aVar) {
                synchronized (this.f23922a) {
                    this.f23922a.add(aVar);
                }
            }

            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(j jVar) {
                j jVar2 = jVar;
                synchronized (this.f23922a) {
                    if (this.f23922a.isEmpty()) {
                        return;
                    }
                    boolean z = false;
                    boolean z2 = false;
                    for (a aVar : (Set) this.f23922a.clone()) {
                        if (!aVar.a(jVar2)) {
                            z2 = aVar.j();
                        }
                    }
                    if (z2) {
                        final b bVar = b.this;
                        int i = bVar.f23920a + 1;
                        bVar.f23920a = i;
                        if (i < 3) {
                            long j = bVar.b * 1000;
                            l.a("u4pars", "checkUpgradeAgain, start on %s (delay %ds, count: %d)", x.a(j), Integer.valueOf(bVar.b), Integer.valueOf(bVar.f23920a));
                            com.uc.webview.base.task.c.a("u4pars", new Runnable() { // from class: com.uc.webview.internal.setup.component.n.b.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    b.this.b("u4pars");
                                }
                            }, null, j);
                            bVar.b *= 3;
                            z = true;
                        }
                        if (z) {
                            return;
                        }
                    }
                    l.a(2, "u4pars", "on checkUpgrade finished", (Throwable) null);
                    synchronized (this.f23922a) {
                        if (this.f23922a.isEmpty()) {
                            return;
                        }
                        Set<a> set = (Set) this.f23922a.clone();
                        this.f23922a.clear();
                        for (a aVar2 : set) {
                            aVar2.k();
                        }
                    }
                }
            }
        }

        private b(String str) {
            this.d = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static b a(String str) {
            b bVar;
            synchronized (c) {
                bVar = c.get(str);
                if (bVar == null) {
                    bVar = new b(str);
                    c.put(str, bVar);
                }
            }
            return bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            if (!StringUtils.isEmpty(this.d)) {
                hashMap.put("target_product", this.d);
            }
            hashMap.put("browser_arch", EnvInfo.is64Bit() ? "armv8" : "armv7-a");
            hashMap.put(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, "5.12.6.0");
            hashMap.put("child_ver", "240927172644");
            n.a(str, hashMap, arrayList, this.e);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(a aVar) {
            synchronized (b.class) {
                if (this.e != null) {
                    a aVar2 = this.e;
                    synchronized (aVar2.f23922a) {
                        aVar2.f23922a.remove(aVar);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(String str, a aVar) {
            boolean z = false;
            if (aVar != null) {
                synchronized (b.class) {
                    if (this.e == null) {
                        this.e = new a(this, (byte) 0);
                    }
                    z = this.e.f23922a.isEmpty();
                    this.e.a(aVar);
                }
            }
            if (z) {
                b(str);
            }
        }
    }

    /* loaded from: classes9.dex */
    static class c {

        /* renamed from: a  reason: collision with root package name */
        static Method f23923a = com.uc.webview.base.g.a(n.f23917a, "deleteBundleByVersions", String.class, String[].class, String[].class);
        static Method b = com.uc.webview.base.g.a(n.f23917a, "deleteBundleInfoList", String.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private final Object f23924a;

        d(Object obj) {
            this.f23924a = obj;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final String a() {
            return (String) com.uc.webview.base.g.a(this.f23924a, "getName");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final String b() {
            return (String) com.uc.webview.base.g.a(this.f23924a, "getBundleUrl");
        }

        public final String toString() {
            return riy.BLOCK_START_STR + "name: " + a() + ", path: " + l.a((String) com.uc.webview.base.g.a(this.f23924a, "getPath")) + ", url: " + l.a(b()) + riy.BLOCK_END_STR;
        }
    }

    /* loaded from: classes9.dex */
    interface e {
        void a(d dVar);
    }

    /* loaded from: classes9.dex */
    interface f {
        void a();

        void a(Object obj);
    }

    /* loaded from: classes9.dex */
    static class g implements InvocationHandler {
        private static List<String> d = new ArrayList();

        /* renamed from: a  reason: collision with root package name */
        private final String f23925a;
        private final String b;
        private final f c;

        g(String str, String str2, f fVar) {
            this.f23925a = str;
            this.b = str2;
            this.c = fVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name;
            char c;
            try {
                name = method.getName();
                c = 65535;
                switch (name.hashCode()) {
                    case -1776922004:
                        if (name.equals("toString")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1521319825:
                        if (name.equals("didPackageDownload")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1295482945:
                        if (name.equals(eau.PARSER_TAG)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1270820115:
                        if (name.equals("isFocused")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -741947051:
                        if (name.equals("didPackageUpgrade")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 147696667:
                        if (name.equals("hashCode")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1455453821:
                        if (name.equals("getFocusOnPackageTypeList")) {
                            c = 6;
                            break;
                        }
                        break;
                }
            } catch (Throwable th) {
                l.c(this.f23925a, "onParsCallback, method: %s, args: %s", method, x.a(objArr), th);
            }
            switch (c) {
                case 0:
                    return Boolean.valueOf(obj == objArr[0]);
                case 1:
                    return Integer.valueOf(hashCode());
                case 2:
                    return this.f23925a + ".ParsObserver" + hashCode();
                case 3:
                    return Boolean.valueOf(objArr != null && objArr.length > 0 && (objArr[0] instanceof String) && this.b.equals((String) objArr[0]));
                case 4:
                case 5:
                    l.a(2, this.f23925a, name, (Throwable) null);
                    this.c.a();
                    return Void.TYPE;
                case 6:
                    return d;
                default:
                    return Void.TYPE;
            }
        }
    }

    /* loaded from: classes9.dex */
    static class h implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final e f23926a;

        h(e eVar) {
            this.f23926a = eVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            char c;
            boolean z;
            try {
                String name = method.getName();
                c = 65535;
                z = true;
                switch (name.hashCode()) {
                    case -1776922004:
                        if (name.equals("toString")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1295482945:
                        if (name.equals(eau.PARSER_TAG)) {
                            c = 0;
                            break;
                        }
                        break;
                    case 147696667:
                        if (name.equals("hashCode")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1935774887:
                        if (name.equals("onGetBundleInfo")) {
                            c = 3;
                            break;
                        }
                        break;
                }
            } catch (Throwable unused) {
            }
            if (c == 0) {
                if (obj != objArr[0]) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else if (c == 1) {
                return Integer.valueOf(hashCode());
            } else {
                if (c == 2) {
                    return "u4pars.ParsPkgCB" + hashCode();
                } else if (c != 3) {
                    return Void.TYPE;
                } else {
                    if (objArr[0] != null) {
                        this.f23926a.a(new d(objArr[0]));
                    }
                    return Void.TYPE;
                }
            }
        }
    }

    /* loaded from: classes9.dex */
    static class i {

        /* renamed from: a  reason: collision with root package name */
        final String f23927a;
        final String b;

        i(Object obj) throws Exception {
            this.f23927a = a(obj, "getPath");
            this.b = a(a(obj, "getRawHeader"));
        }

        private static String a(Object obj) {
            String str;
            String[] split;
            if (obj != null && (obj instanceof String) && (str = (String) obj) != null && (split = str.split("\r\n")) != null && split.length != 0) {
                for (String str2 : split) {
                    if (str2.startsWith("x-pars-fname:")) {
                        return str2.substring(13).trim();
                    }
                }
            }
            return null;
        }

        private static String a(Object obj, String str) throws Exception {
            Object b = com.uc.webview.base.g.b(obj, str);
            return b instanceof String ? (String) b : "";
        }

        public final String toString() {
            return riy.BLOCK_START_STR + "filePath: " + l.a(this.f23927a) + ", fileName: " + this.b + riy.BLOCK_END_STR;
        }
    }

    /* loaded from: classes9.dex */
    static class j {

        /* renamed from: a  reason: collision with root package name */
        final List<d> f23928a;

        j(Object obj) {
            this.f23928a = a(obj);
        }

        private static List<d> a(Object obj) {
            if (obj == null) {
                return new ArrayList();
            }
            try {
                List list = (List) com.uc.webview.base.g.b(obj, "getPackageInfo");
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 != null) {
                            arrayList.add(new d(obj2));
                        }
                    }
                    return arrayList;
                }
            } catch (Exception e) {
                l.a(5, "u4pars", "getPackageInfo exception", e);
            }
            return new ArrayList();
        }

        public final String toString() {
            return x.a(this.f23928a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i a(String str, String str2, String str3) {
        try {
            Object a2 = com.uc.webview.base.g.a((Class<?>) f23917a, "getResource", new Class[]{String.class}, new Object[]{str3});
            if (a2 != null) {
                i iVar = new i(a2);
                l.a(str, "%s: %s", str2, iVar);
                return iVar;
            }
        } catch (Throwable unused) {
        }
        l.a(str, "%s res is null", str2);
        return null;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            l.b("u4pars", "class %s not found", str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, d> a() {
        try {
            Object a2 = com.uc.webview.base.g.a((Class<?>) f23917a, "getAllLoadedBundleInfos", new Class[0], new Object[0]);
            if (a2 instanceof Map) {
                Map map = (Map) a2;
                HashMap hashMap = new HashMap();
                for (String str : map.keySet()) {
                    hashMap.put(str, new d(map.get(str)));
                }
                return hashMap;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, Object obj) {
        try {
            com.uc.webview.base.g.a((Class<?>) f23917a, "removeObserver", new Class[]{b}, new Object[]{obj});
            l.a(2, str, "remove ParsObserver", (Throwable) null);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, String str2) {
        l.a(str, "removeBundle %s", str2);
        try {
            if (c.f23923a != null) {
                c.f23923a.invoke(null, str2, null, null);
            }
        } catch (Throwable unused) {
        }
        try {
            if (c.b == null) {
                return;
            }
            c.b.invoke(null, str2);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, String str2, f fVar) throws Exception {
        Object newProxyInstance = Proxy.newProxyInstance(b.getClassLoader(), new Class[]{b}, new g(str, str2, fVar));
        com.uc.webview.base.g.a((Class<?>) f23917a, "addObserver", new Class[]{b}, new Object[]{newProxyInstance});
        fVar.a(newProxyInstance);
        l.a(2, str, "add ParsObserver", (Throwable) null);
    }

    static void a(String str, Map<String, String> map, List<String> list, final ValueCallback<j> valueCallback) {
        ValueCallback<Object> valueCallback2;
        if (f23917a == null) {
            return;
        }
        l.a(str, "checkUpgrade, overrideInfo: %s", x.a(map));
        if (valueCallback == null) {
            valueCallback2 = null;
        } else {
            try {
                valueCallback2 = new ValueCallback<Object>() { // from class: com.uc.webview.internal.setup.component.n.1
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        valueCallback.onReceiveValue(new j(obj));
                    }
                };
            } catch (Exception e2) {
                l.a(5, str, "checkUpgrade exception", e2);
                return;
            }
        }
        com.uc.webview.base.g.a((Class<?>) f23917a, "checkUpgrade", new Class[]{Map.class, List.class, ValueCallback.class}, new Object[]{map, list, valueCallback2});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(final String str, String str2) {
        if (f23917a == null || c == null) {
            return;
        }
        try {
            l.a(str, "downloadBundle %s...", str2);
            com.uc.webview.base.g.a((Class<?>) f23917a, "downloadBundle", new Class[]{String.class, c}, new Object[]{str2, Proxy.newProxyInstance(c.getClassLoader(), new Class[]{c}, new h(new e() { // from class: com.uc.webview.internal.setup.component.n.2
                @Override // com.uc.webview.internal.setup.component.n.e
                public final void a(d dVar) {
                    l.a(str, "onGetBundleInfo: %s", dVar);
                }
            }))});
        } catch (Exception e2) {
            l.c(str, "downloadBundle(%s) exception", str2, e2);
        }
    }
}
