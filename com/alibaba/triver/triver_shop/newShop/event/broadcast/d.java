package com.alibaba.triver.triver_shop.newShop.event.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.c;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.t;
import tb.ceg;
import tb.kge;
import tb.rir;
import tb.ris;
import tb.rul;

/* loaded from: classes3.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<Context, d> e;

    /* renamed from: a */
    private ris f3839a;
    private a b;
    private Context c;
    private Map<String, rul<JSONObject, t>> d = new ConcurrentHashMap();
    private final BroadcastReceiver f = new BroadcastReceiver() { // from class: com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController$2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String str = "followed";
            boolean equals = "true".equals(intent.getStringExtra(str));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(c.MSG_FOLLOW_ACTION, (Object) c.MSG_FOLLOW_ACTION_REFRESH);
            jSONObject.put("_msg_name", (Object) c.MSG_SHOP_FOLLOW_SETSTATUS);
            jSONObject.put("_msg_target", (Object) "*");
            jSONObject.put("_msg_source", (Object) c.MSG_SOURCE_PARENT);
            if (!equals) {
                str = c.MSG_UNFOLLOWED;
            }
            jSONObject.put("status", (Object) str);
            d.c(d.this).a(jSONObject.toJSONString());
            d.a(d.this, equals);
        }
    };

    /* loaded from: classes3.dex */
    public interface a {
        com.alibaba.triver.triver_shop.newShop.data.d a();

        void a(JSONArray jSONArray);

        void a(String str);

        void a(String str, String str2);

        void a(boolean z, JSONObject jSONObject);

        void b();

        void b_(JSONObject jSONObject);

        void b_(String str, JSONObject jSONObject);

        void c();

        void d();
    }

    public static /* synthetic */ a a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7739c0b1", new Object[]{dVar}) : dVar.b;
    }

    public static /* synthetic */ void a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("284182fd", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.a(z);
        }
    }

    public static /* synthetic */ Map b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("16970b2d", new Object[]{dVar}) : dVar.d;
    }

    public static /* synthetic */ ris c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ris) ipChange.ipc$dispatch("8692cf91", new Object[]{dVar}) : dVar.f3839a;
    }

    static {
        kge.a(795669123);
        e = new HashMap();
    }

    public static synchronized d a(Context context) {
        synchronized (d.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("32eafd05", new Object[]{context});
            } else if (context == null) {
                return null;
            } else {
                d dVar = e.get(context);
                if (dVar != null) {
                    return dVar;
                }
                d dVar2 = new d(context);
                e.put(context, dVar2);
                return dVar2;
            }
        }
    }

    private static synchronized void b(Context context) {
        synchronized (d.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            } else if (context == null) {
            } else {
                e.remove(context);
            }
        }
    }

    private d(final Context context) {
        this.c = context;
        this.f3839a = new ris(context, "mashop_broadcast", new rir() { // from class: com.alibaba.triver.triver_shop.newShop.event.broadcast.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                d.this = this;
            }

            @Override // tb.rir
            public void a(Object obj) {
                rul rulVar;
                JSONObject a2;
                JSONArray jSONArray;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
                    return;
                }
                c cVar = new c(obj);
                ceg.a(cVar.v().toString());
                if (cVar.o()) {
                    if (d.a(d.this) == null) {
                        return;
                    }
                    d.a(d.this).a(cVar.p(), cVar.a());
                } else if (cVar.q()) {
                    if (d.a(d.this) == null) {
                        return;
                    }
                    d.a(d.this).b_(cVar.a());
                } else {
                    if ("shop.markPerformance".equals(cVar.h()) && d.a(d.this) != null && (a2 = cVar.a()) != null && (jSONArray = a2.getJSONArray("data")) != null) {
                        d.a(d.this).a(jSONArray);
                    }
                    if ("shoptab.checkstatus".equals(cVar.h()) && d.a(d.this) != null) {
                        d.a(d.this).a(cVar.j());
                    }
                    if ("aplus.enter".equals(cVar.h()) && cVar.d() && d.a(d.this) != null) {
                        d.a(d.this).a(cVar.j());
                    }
                    if (cVar.e()) {
                        m.a(context, cVar.f(), cVar.g(), cVar.j());
                    }
                    if (cVar.l() && d.a(d.this) != null) {
                        d.a(d.this).c();
                    }
                    if (cVar.m() && d.a(d.this) != null) {
                        d.a(d.this).b();
                    }
                    if (cVar.n() && d.a(d.this) != null) {
                        d.a(d.this).d();
                    }
                    if ("shop.refreshDXWidget".equals(cVar.i()) && d.a(d.this) != null) {
                        d.a(d.this).b_(cVar.t(), cVar.u());
                    }
                    String r = cVar.r();
                    if (r != null && d.a(d.this) != null) {
                        d.a(d.this).a(r, cVar.s());
                    }
                    String i = cVar.i();
                    if (i == null || (rulVar = (rul) d.b(d.this).get(i)) == null) {
                        return;
                    }
                    rulVar.mo2421invoke(cVar.a());
                }
            }
        });
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("TBSubsrcibe_relation_widget_follow_status");
        LocalBroadcastManager.getInstance(this.c).registerReceiver(this.f, intentFilter);
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        a aVar = this.b;
        if (aVar == null || aVar.a() == null || this.b.a().bb().d() == null) {
            return;
        }
        this.b.a().bb().d().mo2421invoke(Boolean.valueOf(z));
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deae2d1a", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f3839a.a(new c.a().c("onShow").d(c.MSG_SOURCE_PARENT).e("*").a(str).b("onShow").a().v().toJSONString());
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.f3839a.a(new c.a().c("container.appear").d(c.MSG_SOURCE_PARENT).e("*").a(str).b("container.appear").a().v().toJSONString());
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.f3839a.a(new c.a().c("container.disappear").d(c.MSG_SOURCE_PARENT).e("*").a(str).b("container.disappear").a().v().toJSONString());
        }
    }

    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        JSONObject v = new c.a().c(c.MSG_SHOP_HEADER_UNCOLLAPSED).d(c.MSG_SOURCE_PARENT).e("*").a(str).b(c.MSG_SHOP_HEADER_UNCOLLAPSED).a().v();
        v.put("embedPageOffset", (Object) Integer.valueOf(i));
        v.put("isCollapsed", (Object) 0);
        this.f3839a.a(v.toJSONString());
    }

    public void b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253bf0", new Object[]{this, str, new Integer(i)});
            return;
        }
        JSONObject v = new c.a().c(c.MSG_SHOP_HEADER_COLLAPSED).d(c.MSG_SOURCE_PARENT).e("*").a(str).b(c.MSG_SHOP_HEADER_COLLAPSED).a().v();
        v.put("embedPageOffset", (Object) Integer.valueOf(i));
        v.put("isCollapsed", (Object) 1);
        this.f3839a.a(v.toJSONString());
    }

    public void a(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d025a92", new Object[]{this, new Integer(i), new Integer(i2), str});
        } else {
            this.f3839a.a(new c.a().c(c.MSG_SHOP_PAGE_APPEAR).d(c.MSG_SOURCE_PARENT).e(a(i, i2)).a(str).b(c.MSG_SHOP_PAGE_APPEAR).a().v().toJSONString());
        }
    }

    public void a(int i, int i2, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcfa9e", new Object[]{this, new Integer(i), new Integer(i2), str, jSONObject});
            return;
        }
        JSONObject v = new c.a().c(c.MSG_SHOP_PAGE_APPEAR).d(c.MSG_SOURCE_PARENT).e(a(i, i2)).a(str).b(c.MSG_SHOP_PAGE_APPEAR).a().v();
        if (jSONObject != null) {
            v.putAll(jSONObject);
        }
        String jSONString = v.toJSONString();
        this.f3839a.a(jSONString);
        ceg.a(jSONString);
    }

    public void b(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2132a793", new Object[]{this, new Integer(i), new Integer(i2), str});
            return;
        }
        String jSONString = new c.a().c(c.MSG_SHOP_PAGE_DISAPPEAR).d(c.MSG_SOURCE_PARENT).e(a(i, i2)).a(str).b(c.MSG_SHOP_PAGE_DISAPPEAR).a().v().toJSONString();
        this.f3839a.a(jSONString);
        ceg.a(jSONString);
    }

    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        JSONObject v = new c.a().c(c.MSG_SHOP_FOLLOW_SETSTATUS).d(c.MSG_SOURCE_PARENT).e("*").a(str).b(c.MSG_SHOP_FOLLOW_SETSTATUS).a().v();
        if (z) {
            v.put("status", (Object) "followed");
        } else {
            v.put("status", (Object) c.MSG_UNFOLLOWED);
        }
        this.f3839a.a(v.toJSONString());
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        c.a aVar = new c.a();
        aVar.b("homelive.liveroom.close");
        aVar.e(c.MSG_SOURCE_PARENT);
        aVar.a(str);
        aVar.d("0.0.0");
        JSONObject v = aVar.a().v();
        v.put("shopInstanceId", (Object) str2);
        this.f3839a.a(v.toJSONString());
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            this.f3839a.a(jSONObject.toJSONString());
        }
    }

    private String a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bdaf8ad8", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (i == 1) {
            return i + ".0." + i2;
        }
        return i + "." + i2 + ".0";
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        LocalBroadcastManager.getInstance(this.c).unregisterReceiver(this.f);
        ris risVar = this.f3839a;
        if (risVar != null) {
            risVar.b();
        }
        b(this.c);
    }
}
