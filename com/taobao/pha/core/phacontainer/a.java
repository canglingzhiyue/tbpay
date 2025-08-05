package com.taobao.pha.core.phacontainer;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.controller.FeatureStatistics;
import com.taobao.pha.core.error.PHAErrorType;
import com.taobao.pha.core.jsbridge.a;
import com.taobao.pha.core.model.ManifestModel;
import com.taobao.pha.core.model.PageModel;
import com.taobao.pha.core.p;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import tb.Cnew;
import tb.kge;
import tb.nfd;
import tb.nfe;
import tb.nff;
import tb.nfh;
import tb.ngn;
import tb.ngr;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Uri i;
    private final AppController j;
    private boolean l;
    private final ConcurrentMap<String, nfh> d = new ConcurrentHashMap();
    private final ConcurrentMap<String, JSONObject> e = new ConcurrentHashMap();
    private final ConcurrentMap<String, Long> f = new ConcurrentHashMap();
    private final Set<String> g = Collections.newSetFromMap(new ConcurrentHashMap());
    private final ConcurrentMap<String, List<a.InterfaceC0751a>> h = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public int f18772a = 0;
    public int b = 0;
    public int c = 0;
    private b k = p.b().g();

    static {
        kge.a(-1203572799);
    }

    public static /* synthetic */ ConcurrentMap a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentMap) ipChange.ipc$dispatch("5f78302", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ void a(a aVar, String str, PHAErrorType pHAErrorType, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5def9d62", new Object[]{aVar, str, pHAErrorType, str2});
        } else {
            aVar.a(str, pHAErrorType, str2);
        }
    }

    public static /* synthetic */ void a(a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3afd18a", new Object[]{aVar, str, str2});
        } else {
            aVar.a(str, str2);
        }
    }

    public static /* synthetic */ ConcurrentMap b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentMap) ipChange.ipc$dispatch("480eb061", new Object[]{aVar}) : aVar.f;
    }

    public static /* synthetic */ AppController c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppController) ipChange.ipc$dispatch("b73357ec", new Object[]{aVar}) : aVar.j;
    }

    public static /* synthetic */ Set d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("c26734a8", new Object[]{aVar}) : aVar.g;
    }

    public static /* synthetic */ ConcurrentMap e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentMap) ipChange.ipc$dispatch("e54387e", new Object[]{aVar}) : aVar.e;
    }

    public a(AppController appController) {
        this.j = appController;
        this.i = appController.t();
    }

    public void a() {
        PageModel pageModel;
        JSONArray realDataPrefetches;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.k == null) {
            ngr.b("PHADataPrefetch", "failed to set DataPrefetch Factory!");
        } else {
            ManifestModel u = this.j.u();
            if (u == null) {
                ngr.b("PHADataPrefetch", "manifest is null!");
            }
            JSONArray jSONArray = null;
            int i = u.tabBar.selectedIndex;
            if (i >= 0 && i < u.pages.size() && (pageModel = u.pages.get(i)) != null && (realDataPrefetches = pageModel.getRealDataPrefetches()) != null) {
                jSONArray = c(realDataPrefetches);
            }
            if (jSONArray == null && (u.dataPrefetch instanceof JSONArray)) {
                jSONArray = c((JSONArray) u.dataPrefetch);
                ngr.c("PHADataPrefetch", "dataPrefetch from manifest");
            }
            if (jSONArray == null) {
                return;
            }
            ngr.b("PHADataPrefetch", "get valid dataPrefetch");
            b(jSONArray);
        }
    }

    public void a(PageModel pageModel) {
        JSONArray c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("737dfcbc", new Object[]{this, pageModel});
        } else if (this.k == null) {
            ngr.b("PHADataPrefetch", "failed to set DataPrefetch Factory!");
        } else {
            JSONArray realDataPrefetches = pageModel.getRealDataPrefetches();
            if (realDataPrefetches == null || (c = c(realDataPrefetches)) == null) {
                return;
            }
            ngr.b("PHADataPrefetch", "get valid page dataPrefetch");
            b(c);
        }
    }

    public void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
            return;
        }
        JSONArray c = c(jSONArray);
        ngr.b("PHADataPrefetch", "get valid page dataPrefetch");
        b(c);
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (this.l && this.e.containsKey(str)) {
            return true;
        }
        return this.d.containsKey(str);
    }

    public JSONObject b(String str) {
        nfh remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d2c0493", new Object[]{this, str});
        }
        if (this.l && this.e.containsKey(str)) {
            ngr.c("PHADataPrefetch", "getData proxy hit,key:" + str);
            return this.e.remove(str);
        }
        JSONObject jSONObject = new JSONObject();
        if (a(str) && (remove = this.d.remove(str)) != null) {
            try {
                jSONObject = ngn.i(new String(remove.c(), "UTF-8"));
                ngr.c("PHADataPrefetch", "getData hit,key:" + str);
                return jSONObject;
            } catch (Exception e) {
                ngr.b("PHADataPrefetch", "getData hit error,key:" + str);
                e.printStackTrace();
            }
        }
        ngr.d("PHADataPrefetch", "getData miss,key" + str);
        return jSONObject;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.g.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.c = 0;
        this.b = 0;
        this.f18772a = 0;
    }

    private void b(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1467911", new Object[]{this, jSONArray});
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                String string = jSONObject.getString("prefetch_type");
                nfe a2 = this.k.a(this.j, string);
                this.j.h().a(FeatureStatistics.FeatureNames.DATA_PREFETCH);
                if (a2 != null) {
                    this.l = true;
                    a(jSONObject, a2);
                } else {
                    nfd a3 = this.k.a(string);
                    if (a3 != null) {
                        a(jSONObject, a3);
                    }
                }
            }
        }
    }

    private void a(final JSONObject jSONObject, final nfd nfdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b9f44cc", new Object[]{this, jSONObject, nfdVar});
            return;
        }
        this.c++;
        final String string = jSONObject.getString("key");
        if (this.j.i() && (this.g.contains(string) || this.d.containsKey(string) || this.e.containsKey(string))) {
            ngr.b("PHADataPrefetch", "data prefetch with key = " + string + " has been send.");
            return;
        }
        this.g.add(string);
        this.f.put(string, new Long(SystemClock.uptimeMillis()));
        Cnew.a(new Runnable() { // from class: com.taobao.pha.core.phacontainer.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                nfh a2 = nfdVar.a(jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                if (a2.a() == 200) {
                    a.a(a.this).put(string, a2);
                    a.this.f18772a++;
                    Long l = (Long) a.b(a.this).get(string);
                    if (l instanceof Long) {
                        long longValue = l.longValue();
                        long uptimeMillis = SystemClock.uptimeMillis();
                        if (a.c(a.this) != null) {
                            a.c(a.this).P().a(string, longValue, uptimeMillis);
                        }
                    }
                    String str = null;
                    if (Build.VERSION.SDK_INT >= 19) {
                        str = new String(a2.c(), StandardCharsets.UTF_8);
                    } else {
                        try {
                            str = new String(a2.c(), "UTF-8");
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        }
                    }
                    a.a(a.this, string, str);
                    jSONObject2.put("key", (Object) string);
                    jSONObject2.put("options", (Object) str);
                    if (a.c(a.this) != null) {
                        a.c(a.this).P().a("prefetchData", jSONObject2);
                    }
                    ngr.c("PHADataPrefetch", "fetchData success,key:" + string);
                } else {
                    a.this.b++;
                    a.a(a.this, string, PHAErrorType.NETWORK_ERROR, com.taobao.pha.core.error.a.ERR_MSG_DATA_PREFETCH_FAILED);
                    jSONObject2.put("key", (Object) string);
                    jSONObject2.put("statusCode", (Object) Integer.valueOf(a2.a()));
                    jSONObject2.put("statusMessage", (Object) a2.b());
                    com.taobao.pha.core.error.a aVar = new com.taobao.pha.core.error.a(PHAErrorType.NETWORK_ERROR, com.taobao.pha.core.error.a.ERR_MSG_DATA_PREFETCH_FAILED, jSONObject2);
                    if (a.c(a.this) != null) {
                        a.c(a.this).P().a("prefetchData", aVar);
                    }
                    ngr.b("PHADataPrefetch", "fetchData error,key:" + string + ",msg:" + a2.b());
                }
                a.d(a.this).remove(string);
            }
        });
    }

    private void a(final JSONObject jSONObject, final nfe nfeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b9fb92b", new Object[]{this, jSONObject, nfeVar});
        } else if (!this.l) {
            ngr.b("PHADataPrefetch", "Can't use data prefetch proxy");
        } else {
            this.c++;
            final String string = jSONObject.getString("key");
            if (this.j.i() && (this.g.contains(string) || this.d.containsKey(string) || this.e.containsKey(string))) {
                ngr.b("PHADataPrefetch", "data prefetch with key = " + string + " has been send.");
                return;
            }
            this.g.add(string);
            this.f.put(string, new Long(SystemClock.uptimeMillis()));
            Cnew.a(new Runnable() { // from class: com.taobao.pha.core.phacontainer.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        nfeVar.a(jSONObject, new nff<JSONObject, String>() { // from class: com.taobao.pha.core.phacontainer.a.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.nff
                            public /* synthetic */ void b(String str) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("f056ab85", new Object[]{this, str});
                                } else {
                                    a(str);
                                }
                            }

                            @Override // tb.nff
                            public void a(JSONObject jSONObject2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("266fb88", new Object[]{this, jSONObject2});
                                    return;
                                }
                                a.this.f18772a++;
                                a.d(a.this).remove(string);
                                a.e(a.this).put(string, jSONObject2);
                                Long l = (Long) a.b(a.this).get(string);
                                if (l instanceof Long) {
                                    long longValue = l.longValue();
                                    long uptimeMillis = SystemClock.uptimeMillis();
                                    if (a.c(a.this) != null) {
                                        a.c(a.this).P().a(string, longValue, uptimeMillis);
                                    }
                                }
                                a.a(a.this, string, jSONObject2.toJSONString());
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("key", (Object) string);
                                jSONObject3.put("options", (Object) jSONObject2);
                                a.c(a.this).P().a("prefetchData", jSONObject3);
                                ngr.c("PHADataPrefetch", "proxy fetchData success:key" + string);
                            }

                            public void a(String str) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("f3a64c32", new Object[]{this, str});
                                    return;
                                }
                                a.this.b++;
                                a.d(a.this).remove(string);
                                a.a(a.this, string, PHAErrorType.NETWORK_ERROR, com.taobao.pha.core.error.a.ERR_MSG_DATA_PREFETCH_FAILED);
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("key", (Object) string);
                                jSONObject2.put("statusCode", (Object) "ProxyPrefetchStatusCode");
                                jSONObject2.put("statusMessage", (Object) str);
                                a.c(a.this).P().a("prefetchData", new com.taobao.pha.core.error.a(PHAErrorType.NETWORK_ERROR, com.taobao.pha.core.error.a.ERR_MSG_DATA_PREFETCH_FAILED, jSONObject2));
                                ngr.b("PHADataPrefetch", "proxy fetchData error:key" + string + ",msg:" + str);
                            }
                        });
                    }
                }
            });
        }
    }

    private JSONArray c(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("ec4bbb6c", new Object[]{this, jSONArray}) : this.j.m().a(jSONArray);
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue() : this.g.contains(str);
    }

    public synchronized void a(String str, a.InterfaceC0751a interfaceC0751a) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64bdd49", new Object[]{this, str, interfaceC0751a});
            return;
        }
        List<a.InterfaceC0751a> list = this.h.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(interfaceC0751a);
        this.h.put(str, list);
        if (!c(str) && this.h.remove(str) != null) {
            JSONObject b = b(str);
            if (b == null) {
                z = false;
            }
            ngr.b("PHADataPrefetch", "call the unfired callbacks after data gotten");
            for (a.InterfaceC0751a interfaceC0751a2 : list) {
                if (interfaceC0751a2 != null) {
                    if (z) {
                        interfaceC0751a2.a(b);
                    } else {
                        interfaceC0751a2.a(PHAErrorType.NETWORK_ERROR, com.taobao.pha.core.error.a.ERR_MSG_DATA_PREFETCH_FAILED);
                    }
                }
            }
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        List<a.InterfaceC0751a> remove = this.h.remove(str);
        if (remove == null) {
            return;
        }
        JSONObject i = ngn.i(str2);
        for (a.InterfaceC0751a interfaceC0751a : remove) {
            if (interfaceC0751a != null) {
                interfaceC0751a.a(i);
            }
        }
    }

    private void a(String str, PHAErrorType pHAErrorType, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff48ff54", new Object[]{this, str, pHAErrorType, str2});
            return;
        }
        List<a.InterfaceC0751a> remove = this.h.remove(str);
        if (remove == null) {
            return;
        }
        for (a.InterfaceC0751a interfaceC0751a : remove) {
            if (interfaceC0751a != null) {
                interfaceC0751a.a(pHAErrorType, str2);
            }
        }
    }
}
