package com.taobao.tao.flexbox.layoutmanager.view.tabbar;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import com.alibaba.ability.impl.user.UserAbility;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IFestival;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ILogin;
import com.taobao.tao.flexbox.layoutmanager.container.m;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import tb.kge;
import tb.oeb;
import tb.ogg;
import tb.ogh;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f20553a;
    public JSONObject b;
    public aa c;
    public InterfaceC0858a d;
    public String e;
    public ab g;
    private Future i;
    private String j;
    private boolean k;
    private m.b l;
    private View m;
    private Map o;
    private ab.h.a p;
    private Object r;
    private TNodeView s;
    private JSONObject h = new JSONObject();
    public boolean f = false;
    private boolean n = false;
    private boolean q = false;

    /* renamed from: com.taobao.tao.flexbox.layoutmanager.view.tabbar.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0858a {
        void a(aa aaVar);
    }

    /* loaded from: classes8.dex */
    public interface b extends InterfaceC0858a {
        void a(ab.h hVar);
    }

    /* loaded from: classes8.dex */
    public interface c {
        void a(Object obj);
    }

    static {
        kge.a(1565772395);
    }

    public static /* synthetic */ void a(a aVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d7bf666", new Object[]{aVar, new Integer(i), new Integer(i2)});
        } else {
            aVar.b(i, i2);
        }
    }

    public static /* synthetic */ void a(a aVar, ab.h hVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c243751b", new Object[]{aVar, hVar, new Long(j)});
        } else {
            aVar.a(hVar, j);
        }
    }

    public static /* synthetic */ boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1c75f8a", new Object[]{aVar})).booleanValue() : aVar.n;
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67254412", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.n = z;
        return z;
    }

    public static /* synthetic */ View b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("4ba98d09", new Object[]{aVar}) : aVar.m;
    }

    public static /* synthetic */ ab.h b(a aVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ab.h) ipChange.ipc$dispatch("e2334b12", new Object[]{aVar, new Integer(i), new Integer(i2)}) : aVar.c(i, i2);
    }

    public static /* synthetic */ boolean b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4125b31", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.q = z;
        return z;
    }

    public static /* synthetic */ JSONObject c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("adc5fca8", new Object[]{aVar}) : aVar.f();
    }

    public static /* synthetic */ TNodeView d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TNodeView) ipChange.ipc$dispatch("6deb7c66", new Object[]{aVar}) : aVar.s;
    }

    public a(ab.h.a aVar, ab abVar, InterfaceC0858a interfaceC0858a) {
        this.p = aVar;
        this.g = abVar;
        this.d = interfaceC0858a;
        Map d = aVar.d();
        String c2 = aVar.c() != null ? aVar.c() : aVar.b();
        if (c2 != null) {
            if (d == null) {
                d = new HashMap();
                aVar.b(d);
            }
            d.put("url", c2);
        }
        this.e = c2 == null ? "" : c2;
        if (this.f20553a == null) {
            this.f20553a = aVar.a();
        }
    }

    public a(Context context, ab abVar, String str, JSONObject jSONObject, HashMap hashMap, InterfaceC0858a interfaceC0858a) {
        this.b = jSONObject;
        this.g = abVar;
        this.f20553a = context;
        this.d = interfaceC0858a;
        this.e = str;
        this.h.put("url", (Object) str);
        this.h.put("query", (Object) hashMap);
    }

    public a(Context context, View view, ab abVar, String str, String str2, JSONObject jSONObject, HashMap hashMap, int i, InterfaceC0858a interfaceC0858a) {
        str = str == null ? "" : str;
        this.b = jSONObject;
        a(this.b);
        this.m = view;
        this.g = abVar;
        this.f20553a = context;
        this.d = interfaceC0858a;
        this.e = str;
        this.j = str2;
        this.h.put("url", (Object) str);
        this.h.put("query", (Object) hashMap);
        if (i == 0) {
            this.h.put(ab.LAYOUT_STRATEGY_KEY, (Object) true);
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            Iterator<Map.Entry<String, Object>> it = jSONObject.entrySet().iterator();
            while (it.hasNext()) {
                Object value = it.next().getValue();
                if (value == null || ((value instanceof String) && TextUtils.isEmpty((CharSequence) value))) {
                    it.remove();
                }
            }
        }
    }

    public void a(Future future) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f9effe", new Object[]{this, future});
        } else {
            this.i = future;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public void a(m.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3ba8463", new Object[]{this, bVar});
        } else if (bVar == null || !bVar.g) {
        } else {
            this.l = bVar;
        }
    }

    public void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.o = map;
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.e;
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.r = obj;
        }
    }

    public void a(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29395e05", new Object[]{this, tNodeView});
        } else {
            this.s = tNodeView;
        }
    }

    public ab e() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (ab) ipChange.ipc$dispatch("c3a146f1", new Object[]{this});
        }
        if (this.g == null) {
            this.g = PreloadDelegate.b(this.e);
            StringBuilder sb = new StringBuilder();
            sb.append("peekEngine engine:");
            if (this.g != null) {
                z = true;
            }
            sb.append(z);
            sb.append(",url:");
            sb.append(this.e);
            ogg.a(sb.toString());
        }
        return this.g;
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.e == null) {
            ogg.b("url is Null");
        } else {
            ogh.a("setupLayout");
            ab.a(this.f20553a);
            if (this.q) {
                ogh.b();
                return;
            }
            this.q = true;
            if (this.g == null) {
                this.g = PreloadDelegate.b(this.e);
                StringBuilder sb = new StringBuilder();
                sb.append("setupLayout hit preload engine:");
                if (this.g != null) {
                    z = true;
                }
                sb.append(z);
                sb.append(",url:");
                sb.append(this.e);
                ogg.a(sb.toString());
                if (this.g == null) {
                    this.g = new ab(oeb.aW() ? this.f20553a : null);
                    this.g.a(this.e);
                }
            }
            if (i > 0 || i2 > 0) {
                b(i, i2);
            } else {
                View view = this.m;
                if (view != null) {
                    view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.taobao.tao.flexbox.layoutmanager.view.tabbar.a.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.ViewTreeObserver.OnPreDrawListener
                        public boolean onPreDraw() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
                            }
                            if (!a.a(a.this) && a.b(a.this).getMeasuredHeight() > 0) {
                                a aVar = a.this;
                                a.a(aVar, a.b(aVar).getMeasuredWidth(), a.b(a.this).getMeasuredHeight());
                                a.a(a.this, true);
                                a.b(a.this).getViewTreeObserver().removeOnPreDrawListener(this);
                            }
                            return true;
                        }
                    });
                }
            }
            ogh.b();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.n = false;
        }
    }

    private void b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
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
            if (d != null) {
                hashMap.put("festival", d.a().toMap());
            }
            if (!com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().a(this.e, this.f20553a)) {
                return;
            }
            map.put("scene", "launch");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.alibaba.fastjson.JSONObject f() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.view.tabbar.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r2 = "d2e6990d"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0
            return r0
        L15:
            r0 = 0
            java.util.concurrent.Future r1 = r4.i     // Catch: java.lang.InterruptedException -> L1d java.util.concurrent.ExecutionException -> L22
            java.lang.Object r1 = r1.get()     // Catch: java.lang.InterruptedException -> L1d java.util.concurrent.ExecutionException -> L22
            goto L27
        L1d:
            r1 = move-exception
            r1.printStackTrace()
            goto L26
        L22:
            r1 = move-exception
            r1.printStackTrace()
        L26:
            r1 = r0
        L27:
            boolean r2 = r1 instanceof com.alibaba.fastjson.JSONObject
            if (r2 == 0) goto L2f
            r0 = r1
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0
            goto L50
        L2f:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L50
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L3b
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.fastjson.JSON.parseObject(r2)     // Catch: java.lang.Exception -> L3b
            goto L50
        L3b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "initData is invalid json"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            tb.ogg.b(r1)
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.view.tabbar.a.f():com.alibaba.fastjson.JSONObject");
    }

    private void a(final c cVar) {
        Future future;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4376e7", new Object[]{this, cVar});
            return;
        }
        if (this.b == null && (future = this.i) != null) {
            if (future.isDone()) {
                this.b = f();
            } else {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.view.tabbar.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        a aVar = a.this;
                        aVar.b = a.c(aVar);
                        cVar.a(a.this.b);
                    }
                });
                return;
            }
        }
        cVar.a(this.b);
    }

    private ab.h c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ab.h) ipChange.ipc$dispatch("3386a68f", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        ab.h.a aVar = this.p;
        if (aVar != null) {
            aVar.b(i);
            this.p.a(i2);
            b(this.p.d());
            return this.p.e();
        }
        ab.h.a aVar2 = new ab.h.a(this.f20553a);
        aVar2.a(this.e);
        aVar2.b(this.k);
        if (!TextUtils.isEmpty(this.j)) {
            aVar2.d(this.j);
        }
        aVar2.a(this.h);
        aVar2.b(i);
        aVar2.a(i2);
        aVar2.a((Map) this.b);
        aVar2.c(this.o);
        aVar2.a(this.l);
        b(this.h);
        return aVar2.e();
    }

    private void a(final ab.h hVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ccc9079", new Object[]{this, hVar, new Long(j)});
            return;
        }
        Object obj = this.r;
        if (obj != null) {
            this.g.a(obj);
        }
        if (this.g.g() == null && (hVar.c() instanceof Activity)) {
            this.g.a((Object) hVar.c());
        }
        this.g.a(this.s);
        this.g.b(hVar, new ab.g() { // from class: com.taobao.tao.flexbox.layoutmanager.view.tabbar.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.ab.g
            public void a(aa aaVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("691d3050", new Object[]{this, aaVar});
                    return;
                }
                a.b(a.this, false);
                a aVar = a.this;
                aVar.c = aaVar;
                if (aaVar != null) {
                    aaVar.a(a.d(aVar));
                }
                if (a.this.d == null) {
                    return;
                }
                if (aaVar != null) {
                    a.this.d.a(aaVar);
                } else if (!(a.this.d instanceof b)) {
                } else {
                    ((b) a.this.d).a(hVar);
                }
            }
        });
    }

    private void b(final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ogh.a("delegate layout");
        final long nanoTime = System.nanoTime();
        a(new c() { // from class: com.taobao.tao.flexbox.layoutmanager.view.tabbar.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.a.c
            public void a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                } else {
                    a.a(a.this, a.b(a.this, i, i2), nanoTime);
                }
            }
        });
        ogh.b();
    }

    public ab c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ab) ipChange.ipc$dispatch("e04dfab3", new Object[]{this}) : this.g;
    }

    public aa d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("d1f7a0b3", new Object[]{this}) : this.c;
    }
}
