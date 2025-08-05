package com.taobao.tao.flexbox.layoutmanager.core;

import android.os.AsyncTask;
import android.text.TextUtils;
import anet.channel.session.dns.DnsNavConfigTask;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.flexa.compat.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.module.TrackerModule;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.oea;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ohe;

/* loaded from: classes8.dex */
public class w {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int RENDER_FAILD = 2;
    public static final int RENDER_SUCCESS = 3;
    public static final String TAG = "PerformanceTracker";

    /* renamed from: a  reason: collision with root package name */
    public static a f20366a;

    /* loaded from: classes8.dex */
    public interface a {
        void sendITraceLog(boolean z, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);
    }

    /* loaded from: classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f20376a;
        public long b;
        public boolean c;
        public String d;
        public Map e;
        public String f;
        public String g;

        static {
            kge.a(1235106612);
        }

        public b(String str, long j, boolean z, String str2, Map map, String str3, String str4) {
            this.f20376a = str;
            this.b = j;
            this.c = z;
            this.d = str2;
            this.e = map;
            this.f = str3;
            this.g = str4;
        }
    }

    static {
        kge.a(-2042669553);
    }

    public static void a(ab abVar, aa aaVar, long j, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96371fdd", new Object[]{abVar, aaVar, new Long(j), str, new Boolean(z)});
        }
    }

    public static /* synthetic */ void a(ab abVar, Map map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d8fb40", new Object[]{abVar, map, str});
        } else {
            b(abVar, map, str);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            a(false, 100, str, null, str2, null, null, null, null, null);
        }
    }

    public static void a(final boolean z, final int i, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea1e8767", new Object[]{new Boolean(z), new Integer(i), str, str2, str3, str4, str5, str6, str7, str8});
            return;
        }
        a aVar = f20366a;
        if (aVar == null) {
            a(false, "type", "EfsTracker");
            com.alibaba.flexa.compat.c.a("com.efs.sdk.base.EfsTracker", new c.a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.w.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassLoaded(Class<?> cls) {
                    try {
                        a aVar2 = (a) cls.newInstance();
                        w.f20366a = aVar2;
                        aVar2.sendITraceLog(z, i, str, str2, str3, str4, str5, str6, str7, str8);
                    } catch (Throwable th) {
                        th.printStackTrace();
                        ogg.a(w.TAG, "FlexaClass load error:Throwable: " + th.toString());
                        w.a(true, "type", "EfsTracker", "error", th.toString());
                    }
                }

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassNotFound() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad9dd2ef", new Object[]{this});
                        return;
                    }
                    ogg.a(w.TAG, "FlexaClass load error:onClassNotFound");
                    w.a(true, "type", "EfsTracker", "error", "ClassNotFound");
                }
            });
            return;
        }
        aVar.sendITraceLog(z, i, str, str2, str3, str4, str5, str6, str7, str8);
    }

    public static void a(final ab abVar, final Map map, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae1de5e", new Object[]{abVar, map, aaVar});
        } else if (abVar == null) {
        } else {
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.w.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        List<aa> I = ab.this.I();
                        ohe.a a2 = ohe.a();
                        for (aa aaVar2 : I) {
                            a2.a("url:");
                            a2.a(aaVar2.c().b);
                            a2.a(" md5:");
                            a2.a(ad.g(aaVar2));
                            a2.a("\n");
                        }
                        w.a(ab.this, map, a2.toString());
                    } catch (Throwable th) {
                        ogg.a("trackError", th.getMessage());
                    }
                }
            }, true);
        }
    }

    private static void b(final ab abVar, final Map map, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cd8599f", new Object[]{abVar, map, str});
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.w.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String str2;
                    String str3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ab.this == null) {
                    } else {
                        String a2 = oec.a(map.get("name"), (String) null);
                        Map a3 = oec.a(map.get("params"), (Map) new HashMap());
                        String jSONString = a3 != null ? JSON.toJSONString(a3) : null;
                        String a4 = oec.a(map.get("action"), (String) null);
                        boolean equals = a2.equals("js_error");
                        int a5 = oec.a(a3.get("category"), 0);
                        aa A = ab.this.A();
                        String str4 = "unknown dsl url";
                        String str5 = "unknown page url";
                        if (A != null) {
                            aa.b W = A.W();
                            if (!TextUtils.isEmpty(W.f20296a)) {
                                str4 = W.f20296a;
                            }
                            if (!TextUtils.isEmpty(W.b)) {
                                str5 = W.b;
                            }
                            String str6 = W.d;
                            str3 = A.k().F();
                            str2 = str6;
                        } else {
                            str2 = null;
                            str3 = null;
                        }
                        String str7 = str5;
                        String str8 = str4;
                        if (equals) {
                            ab.this.d().appendJSLog(6, jSONString, true);
                        }
                        if (!equals && a5 <= 0) {
                            return;
                        }
                        w.a(equals, a5, a2, a4, jSONString, str8, str7, str2, str3, str);
                    }
                }
            });
        }
    }

    public static void a(ab abVar, aa aaVar, long j, int i, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ed0169d", new Object[]{abVar, aaVar, new Long(j), new Integer(i), hashMap});
        } else {
            a(abVar, aaVar, null, j, i, hashMap);
        }
    }

    public static void a(final ab abVar, final aa aaVar, final String str, final long j, final int i, final HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef673ed3", new Object[]{abVar, aaVar, str, new Long(j), new Integer(i), hashMap});
            return;
        }
        if (!oeb.a("trackNormalPerformance" + i, true)) {
            return;
        }
        AsyncTask.execute(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.w.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r8 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.core.w.AnonymousClass2.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    r2 = 0
                    if (r1 == 0) goto L12
                    r1 = 1
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r1[r2] = r8
                    java.lang.String r2 = "5c510192"
                    r0.ipc$dispatch(r2, r1)
                    return
                L12:
                    com.taobao.tao.flexbox.layoutmanager.core.ab r0 = com.taobao.tao.flexbox.layoutmanager.core.ab.this
                    if (r0 != 0) goto L17
                    return
                L17:
                    com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject
                    r0.<init>()
                    com.alibaba.fastjson.JSONObject r1 = new com.alibaba.fastjson.JSONObject
                    r1.<init>()
                    java.lang.String r3 = "pageName"
                    java.lang.String r4 = "TNode"
                    r1.put(r3, r4)
                    r4 = 19999(0x4e1f, float:2.8025E-41)
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    java.lang.String r5 = "eventID"
                    r1.put(r5, r4)
                    int r4 = r2
                    r5 = 2
                    java.lang.String r6 = "arg1"
                    if (r4 == r5) goto L43
                    r5 = 3
                    if (r4 == r5) goto L3f
                    goto L49
                L3f:
                    java.lang.String r4 = "render"
                    goto L46
                L43:
                    java.lang.String r4 = "renderfailed"
                L46:
                    r1.put(r6, r4)
                L49:
                    long r4 = r3
                    r6 = 1000000(0xf4240, double:4.940656E-318)
                    long r4 = r4 / r6
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)
                    java.lang.String r5 = "time"
                    r0.put(r5, r4)
                    com.taobao.tao.flexbox.layoutmanager.core.aa r4 = r5
                    java.lang.String r5 = "url"
                    if (r4 == 0) goto L8c
                    com.taobao.tao.flexbox.layoutmanager.core.aa r4 = r4.M()
                    if (r4 == 0) goto L8c
                    com.taobao.tao.flexbox.layoutmanager.core.aa$b r6 = r4.W()
                    if (r6 == 0) goto L8c
                    com.taobao.tao.flexbox.layoutmanager.core.aa$b r6 = r4.W()
                    java.lang.String r6 = r6.f20296a
                    r0.put(r5, r6)
                    java.lang.Object r6 = r4.f(r3)
                    if (r6 == 0) goto L7e
                    r0.put(r3, r6)
                L7e:
                    java.lang.String r3 = "pageURL"
                    java.lang.Object r4 = r4.f(r3)
                    if (r4 == 0) goto L8c
                    java.lang.String r4 = (java.lang.String) r4
                    r0.put(r3, r4)
                L8c:
                    java.util.HashMap r3 = r6
                    if (r3 == 0) goto L93
                    r0.putAll(r3)
                L93:
                    java.lang.String r3 = r0.getString(r5)
                    boolean r3 = android.text.TextUtils.isEmpty(r3)
                    if (r3 == 0) goto Laa
                    java.lang.String r3 = r7
                    boolean r3 = android.text.TextUtils.isEmpty(r3)
                    if (r3 != 0) goto Laa
                    java.lang.String r3 = r7
                    r0.put(r5, r3)
                Laa:
                    java.lang.String r3 = "args"
                    r1.put(r3, r0)
                    com.taobao.tao.flexbox.layoutmanager.ac.g$c r0 = new com.taobao.tao.flexbox.layoutmanager.ac.g$c
                    com.taobao.tao.flexbox.layoutmanager.core.ab r3 = com.taobao.tao.flexbox.layoutmanager.core.ab.this
                    r4 = 0
                    r0.<init>(r3, r1, r4)
                    com.taobao.tao.flexbox.layoutmanager.module.TrackerModule.commit(r0, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.w.AnonymousClass2.run():void");
            }
        });
    }

    public static void a(final ab abVar, final b bVar, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92fc9bf0", new Object[]{abVar, bVar, new Boolean(z)});
        } else if (!oeb.d("tnode_tracker_enable_mtop_performance")) {
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.w.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (b.this == null) {
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("pageName", (Object) "TNode");
                        jSONObject.put(PopConst.POP_EVENT_ID_KEY, (Object) 19997);
                        jSONObject.put("arg1", (Object) "tnodemtop");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("time", (Object) Long.valueOf(b.this.b / 1000000));
                        jSONObject2.put("success", (Object) Boolean.valueOf(b.this.c));
                        jSONObject2.put("mtop", (Object) b.this.f20376a);
                        jSONObject2.put("v", (Object) b.this.d);
                        jSONObject2.put("query", b.this.e != null ? b.this.e : "");
                        jSONObject2.put("isPrefetch", (Object) Boolean.valueOf(z));
                        jSONObject2.put("traceId", (Object) b.this.f);
                        jSONObject2.put("eagleEyeTraceId", (Object) b.this.g);
                        if (oea.b() != null && oea.b().get("engine") != null) {
                            jSONObject2.put("version", (Object) oea.b().getJSONObject("engine").getString("version"));
                        }
                        ab abVar2 = abVar;
                        if (abVar2 != null && abVar2.h != null && abVar.h.getClass() != null) {
                            jSONObject2.put("target", (Object) abVar.h.getClass().getSimpleName());
                        }
                        jSONObject.put("args", (Object) jSONObject2);
                        TrackerModule.commit(new g.c(abVar, jSONObject, null), false);
                    }
                }
            });
        }
    }

    public static void a(final ab abVar, final String str, final Map map, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("102656a8", new Object[]{abVar, str, map, new Boolean(z)});
        } else if (!oeb.d("tnode_tracker_enable_mtop_start")) {
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.w.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("pageName", (Object) "TNode");
                    jSONObject.put(PopConst.POP_EVENT_ID_KEY, (Object) 19997);
                    jSONObject.put("arg1", (Object) "tnodemtopstart");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("mtop", (Object) str);
                    jSONObject2.put("isPrefetch", (Object) Boolean.valueOf(z));
                    Map map2 = map;
                    if (map2 != null) {
                        jSONObject2.put("query", (Object) map2);
                    }
                    jSONObject.put("args", (Object) jSONObject2);
                    TrackerModule.commit(new g.c(abVar, jSONObject, null), false);
                }
            });
        }
    }

    public static void a(final ab abVar, final String str, final String str2, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("159cbee2", new Object[]{abVar, str, str2, map});
        } else if (!oeb.d("tnode_tracker_enable_mtop_match")) {
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.w.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("pageName", (Object) "TNode");
                    jSONObject.put(PopConst.POP_EVENT_ID_KEY, (Object) 19997);
                    jSONObject.put("arg1", (Object) "mtopPrefetchMatch");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(DnsNavConfigTask.MatchType, (Object) str);
                    jSONObject2.put("mtop", (Object) str2);
                    Map map2 = map;
                    if (map2 != null) {
                        jSONObject2.put("query", (Object) map2);
                    }
                    jSONObject.put("args", (Object) jSONObject2);
                    TrackerModule.commit(new g.c(abVar, jSONObject, null), false);
                }
            });
        }
    }

    public static void a(final ab abVar, final boolean z, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b13ffa99", new Object[]{abVar, new Boolean(z), str, str2});
        } else if (!oeb.d("tnode_tracker_enable_pagecache")) {
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.w.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ab.this == null) {
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("pageName", (Object) "TNode");
                        jSONObject.put(PopConst.POP_EVENT_ID_KEY, (Object) 19997);
                        jSONObject.put("arg1", (Object) "cache");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("cache_hit", (Object) String.valueOf(z));
                        jSONObject2.put("cache_type", (Object) str2);
                        jSONObject2.put("url", (Object) str);
                        jSONObject.put("args", (Object) jSONObject2);
                        TrackerModule.commit(new g.c(ab.this, jSONObject, null), false);
                    }
                }
            });
        }
    }

    public static void a(ab abVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("766e62f6", new Object[]{abVar, map});
        } else if (oeb.W()) {
            b(abVar, "imageloader", map);
        } else {
            a(abVar, "imageloader", map);
        }
    }

    private static void b(final ab abVar, final String str, final Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56bf00b", new Object[]{abVar, str, map});
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.w.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ab.this == null) {
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("pageName", (Object) "TNode");
                        jSONObject.put(PopConst.POP_EVENT_ID_KEY, (Object) 19997);
                        jSONObject.put("arg1", (Object) str);
                        jSONObject.put("args", (Object) map);
                        TrackerModule.commit(new g.c(ab.this, jSONObject, null), false);
                    }
                }
            });
        }
    }

    public static void a(ab abVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6c91ac", new Object[]{abVar, str, map});
            return;
        }
        if (!oeb.d("tnode_tracker_enable_" + str)) {
            return;
        }
        b(abVar, str, map);
    }

    public static void a(boolean z, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ea50233", new Object[]{new Boolean(z), strArr});
        } else {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a("TNode", 19997, "gg_class_load", z ? "failed" : "load", "", strArr);
        }
    }

    public static void a(String str, ab abVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("754b72f9", new Object[]{str, abVar});
        } else if (!oeb.d("tnode_tracker_enable_container")) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pageName", (Object) "TNode");
            jSONObject.put(PopConst.POP_EVENT_ID_KEY, (Object) 19999);
            jSONObject.put("arg1", (Object) str);
            if (abVar != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("engineCreated", true);
                if (abVar.A() == null) {
                    z = false;
                }
                hashMap.put("rootNodeCreated", Boolean.valueOf(z));
                jSONObject.put("args", (Object) hashMap);
            }
            TrackerModule.commit(new g.c(abVar, jSONObject, null), false);
        }
    }
}
