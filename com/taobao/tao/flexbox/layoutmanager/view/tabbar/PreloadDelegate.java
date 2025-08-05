package com.taobao.tao.flexbox.layoutmanager.view.tabbar;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v4.util.LruCache;
import android.text.TextUtils;
import com.alibaba.ability.impl.user.UserAbility;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IFestival;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ILogin;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogh;
import tb.ogz;
import tb.ohk;

/* loaded from: classes8.dex */
public class PreloadDelegate {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static LruCache<String, ab> h;
    private static WeakHashMap<ab, String> i;
    private static Set<String> j;

    /* renamed from: a  reason: collision with root package name */
    public Context f20548a;
    public aa b;
    public a c;
    public String d;
    public ab e;
    private JSONObject f = new JSONObject();
    private boolean g;

    /* loaded from: classes8.dex */
    public enum PreloadHitResult {
        NONE("none"),
        REUSE(h.DSL_TYPE_REUSE),
        WAIT("wait");
        
        private String tip;

        PreloadHitResult(String str) {
            this.tip = str;
        }

        public String getTip() {
            return this.tip;
        }
    }

    /* loaded from: classes8.dex */
    public interface a {
        void a();

        void a(aa aaVar);
    }

    public static /* synthetic */ JSONObject a(PreloadDelegate preloadDelegate) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("82d9319", new Object[]{preloadDelegate}) : preloadDelegate.f;
    }

    public static /* synthetic */ void a(PreloadDelegate preloadDelegate, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81163e6c", new Object[]{preloadDelegate, map});
        } else {
            preloadDelegate.a(map);
        }
    }

    public static /* synthetic */ boolean b(PreloadDelegate preloadDelegate) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9b30bf3e", new Object[]{preloadDelegate})).booleanValue() : preloadDelegate.g;
    }

    public PreloadDelegate(Context context, ab abVar, String str, String str2, Map map, boolean z, int i2, a aVar) {
        this.f20548a = context;
        this.e = abVar;
        this.d = a(str, str2);
        this.c = aVar;
        this.g = z;
        this.f.put("url", (Object) str);
        this.f.put("query", (Object) map);
        if (i2 == 0) {
            this.f.put(ab.LAYOUT_STRATEGY_KEY, (Object) true);
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.d;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a(0, 0);
        }
    }

    public void a(final int i2, final int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else if (!oeb.F()) {
        } else {
            if (this.d == null) {
                ogg.b("preload Url is Null");
                return;
            }
            ogh.a("enginePreload");
            Runnable runnable = new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.view.tabbar.PreloadDelegate.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    boolean z = false;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ab.h.a aVar = new ab.h.a(PreloadDelegate.this.f20548a);
                    aVar.a(PreloadDelegate.this.d);
                    PreloadDelegate preloadDelegate = PreloadDelegate.this;
                    PreloadDelegate.a(preloadDelegate, PreloadDelegate.a(preloadDelegate));
                    aVar.a(PreloadDelegate.a(PreloadDelegate.this));
                    aVar.c(PreloadDelegate.b(PreloadDelegate.this));
                    aVar.b(i2);
                    aVar.a(i3);
                    final ab.h e = aVar.e();
                    if (e.a() == null || !e.a().g) {
                        return;
                    }
                    if (PreloadDelegate.this.e == null) {
                        PreloadDelegate preloadDelegate2 = PreloadDelegate.this;
                        preloadDelegate2.e = PreloadDelegate.a(preloadDelegate2.d);
                        StringBuilder sb = new StringBuilder();
                        sb.append("preload engine result:");
                        if (PreloadDelegate.this.e != null) {
                            z = true;
                        }
                        sb.append(z);
                        sb.append(",url:");
                        sb.append(PreloadDelegate.this.d);
                        ogg.a(sb.toString());
                        if (PreloadDelegate.this.e == null) {
                            if (PreloadDelegate.this.c == null) {
                                return;
                            }
                            PreloadDelegate.this.c.a();
                            return;
                        }
                    }
                    PreloadDelegate.this.e.a(PreloadDelegate.this.d);
                    final ab.j jVar = new ab.j() { // from class: com.taobao.tao.flexbox.layoutmanager.view.tabbar.PreloadDelegate.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.flexbox.layoutmanager.core.ab.j
                        public void b(aa aaVar) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("aca84e11", new Object[]{this, aaVar});
                            } else {
                                PreloadDelegate.this.b = aaVar;
                            }
                        }

                        @Override // com.taobao.tao.flexbox.layoutmanager.core.ab.g
                        public void a(aa aaVar) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("691d3050", new Object[]{this, aaVar});
                                return;
                            }
                            PreloadDelegate.this.b = aaVar;
                            if (PreloadDelegate.this.c == null) {
                                return;
                            }
                            if (aaVar == null) {
                                PreloadDelegate.this.c.a();
                            } else {
                                PreloadDelegate.this.c.a(aaVar);
                            }
                        }
                    };
                    PreloadDelegate.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.view.tabbar.PreloadDelegate.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                PreloadDelegate.this.e.a(e, jVar);
                            }
                        }
                    });
                }
            };
            if (oeb.aE()) {
                runnable.run();
            } else {
                oec.a(runnable, true);
            }
            ogh.b();
        }
    }

    private void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            HashMap hashMap = new HashMap();
            map.put("env", hashMap);
            ILogin g = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().g();
            if (g != null) {
                HashMap hashMap2 = new HashMap();
                hashMap.put("user", hashMap2);
                boolean b2 = g.b();
                hashMap2.put(UserAbility.API_IS_LOGIN, Boolean.valueOf(b2));
                if (b2) {
                    ILogin.a a2 = g.a();
                    hashMap2.put("uId", a2.f19967a);
                    hashMap2.put("nick", a2.b);
                    hashMap2.put("userLogo", a2.c);
                }
            }
            IFestival d = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().d();
            if (d == null) {
                return;
            }
            hashMap.put("festival", d.a().toMap());
        }
    }

    public aa c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("e04dfa94", new Object[]{this}) : this.b;
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(runnable);
        }
    }

    static {
        kge.a(-34272610);
        h = new LruCache<>(5);
        i = new WeakHashMap<>();
        j = new HashSet();
    }

    public static ab a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ab) ipChange.ipc$dispatch("d414eeeb", new Object[]{str});
        }
        String d = d(str);
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        synchronized (PreloadDelegate.class) {
            if (j.contains(d)) {
                return null;
            }
            ab abVar = new ab();
            abVar.a(str);
            h.put(d, abVar);
            i.put(abVar, d);
            return abVar;
        }
    }

    public static ab b(String str) {
        ab remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ab) ipChange.ipc$dispatch("7082eb4a", new Object[]{str});
        }
        String d = d(str);
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        synchronized (PreloadDelegate.class) {
            j.add(d);
            remove = h.remove(d);
        }
        return remove;
    }

    public static boolean a(ab abVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7cbaa0bd", new Object[]{abVar, str})).booleanValue() : oec.a((Object) i.get(abVar), (Object) d(str));
    }

    public static void a(ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691da4af", new Object[]{abVar});
        } else if (abVar == null) {
        } else {
            synchronized (PreloadDelegate.class) {
                String remove = i.remove(abVar);
                if (!TextUtils.isEmpty(remove)) {
                    h.remove(remove);
                    j.remove(remove);
                }
            }
        }
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        String d = d(str);
        if (TextUtils.isEmpty(d)) {
            return false;
        }
        synchronized (PreloadDelegate.class) {
            if (h.get(d) == null) {
                z = false;
            }
        }
        return z;
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String queryParameter = Uri.parse(str).getQueryParameter("tnode");
        String queryParameter2 = !TextUtils.isEmpty(queryParameter) ? Uri.parse(queryParameter).getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ENGINE_PRELOAD) : null;
        return TextUtils.isEmpty(queryParameter2) ? b(str, null) : queryParameter2;
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String b2 = b(str, str2);
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("tnode");
        if (!TextUtils.isEmpty(queryParameter)) {
            Uri parse2 = Uri.parse(queryParameter);
            if (TextUtils.isEmpty(parse2.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ENGINE_PRELOAD))) {
                parse2 = parse2.buildUpon().appendQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ENGINE_PRELOAD, b2).build();
            }
            parse = oec.a(parse, "tnode", parse2.toString());
        }
        return parse.toString();
    }

    private static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String c = ohk.c(str);
        if (!TextUtils.isEmpty(str2)) {
            c = c + str2;
        }
        return ogz.a(c);
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f20552a;
        private aa b;
        private a c;

        static {
            kge.a(1194832300);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f20552a;
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.f20552a = z;
            }
        }

        public aa b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("eea45475", new Object[]{this}) : this.b;
        }

        public void a(aa aaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("691d3050", new Object[]{this, aaVar});
            } else {
                this.b = aaVar;
            }
        }

        public a c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("75434460", new Object[]{this}) : this.c;
        }

        public void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9c6e9dc", new Object[]{this, aVar});
            } else {
                this.c = aVar;
            }
        }
    }
}
