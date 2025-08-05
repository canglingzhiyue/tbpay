package com.alibaba.android.ultron.common.page;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.alibaba.android.ultron.common.page.provider.UltronCommonDataProviderDataSourceType;
import com.alibaba.android.ultron.common.page.provider.a;
import com.alibaba.android.ultron.common.page.provider.impl.b;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PtrBase;
import com.taobao.ptr.PullBase;
import java.util.HashMap;
import java.util.Map;
import tb.bik;
import tb.bil;
import tb.bim;
import tb.bip;
import tb.biq;
import tb.bir;
import tb.bix;
import tb.kge;

/* loaded from: classes2.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOAD_FINISH = "加载完成";

    /* renamed from: a  reason: collision with root package name */
    private PtrBase f2530a;
    private JSONObject b;
    private final Context c;
    private a d;
    private h e;
    private String f;
    private String g;
    private com.alibaba.android.ultron.common.page.provider.a h;
    private final com.alibaba.android.ultron.common.page.provider.a i = new com.alibaba.android.ultron.common.page.provider.impl.c();
    private final Map<String, Class<? extends com.alibaba.android.ultron.common.page.provider.a>> j = new HashMap();
    private RecyclerView k;
    private LinearLayout l;
    private LinearLayout m;

    /* loaded from: classes2.dex */
    public interface a {
        void a(int i, int i2, int i3);
    }

    static {
        kge.a(727748350);
    }

    public static /* synthetic */ h a(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("5a4e184f", new Object[]{iVar}) : iVar.e;
    }

    public static /* synthetic */ void a(i iVar, bil bilVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63d94acf", new Object[]{iVar, bilVar});
        } else {
            iVar.a(bilVar);
        }
    }

    public static /* synthetic */ a b(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("371a45b0", new Object[]{iVar}) : iVar.d;
    }

    public static /* synthetic */ PtrBase c(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PtrBase) ipChange.ipc$dispatch("e5d2ed94", new Object[]{iVar}) : iVar.f2530a;
    }

    public i(Context context) {
        this.c = context;
        g();
        this.e = new h(this);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.j.put("mtop", com.alibaba.android.ultron.common.page.provider.impl.d.class);
        this.j.put(UltronCommonDataProviderDataSourceType.clientEngine, b.class);
    }

    private com.alibaba.android.ultron.common.page.provider.a a(String str) {
        com.alibaba.android.ultron.common.page.provider.a aVar = this.h;
        if (aVar != null) {
            return aVar;
        }
        Class<? extends com.alibaba.android.ultron.common.page.provider.a> cls = this.j.get(str);
        if (cls == null) {
            return this.i;
        }
        try {
            this.h = cls.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e2) {
            e2.printStackTrace();
        }
        return this.h;
    }

    public com.alibaba.android.ultron.common.page.provider.a h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.common.page.provider.a) ipChange.ipc$dispatch("22578987", new Object[]{this}) : a(this.g);
    }

    public void a(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2, PtrBase ptrBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("535d3b9e", new Object[]{this, linearLayout, recyclerView, linearLayout2, ptrBase});
            return;
        }
        this.k = recyclerView;
        this.l = linearLayout;
        this.m = linearLayout2;
        String str = this.g;
        if (str != null) {
            a(str).a(linearLayout, recyclerView, linearLayout2);
        }
        com.alibaba.android.ultron.ext.event.util.c.a(new bir());
        com.alibaba.android.ultron.ext.event.util.c.a(new biq());
        this.f2530a = ptrBase;
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7fcb5a9", new Object[]{this, dVar});
        } else {
            this.e.a(dVar);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alibaba.android.ultron.common.page.i.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    i.this.a(1);
                    if (i.a(i.this) == null) {
                        return;
                    }
                    i.a(i.this).a(1);
                }
            });
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c30322a7", new Object[]{this, aVar});
        } else {
            this.d = aVar;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : a(this.g).c();
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : a(this.g).b();
    }

    public void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else {
            a(this.g).a(jSONArray);
        }
    }

    public void a(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.e.a(i);
        a(this.g).a(this.c, this.b, null, new a.InterfaceC0085a() { // from class: com.alibaba.android.ultron.common.page.i.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.common.page.provider.a.InterfaceC0085a
            public void a(String str, String str2, bim bimVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("223cd926", new Object[]{this, str, str2, bimVar});
                    return;
                }
                i.a(i.this, null);
                i.a(i.this).b(i);
                if (i.b(i.this) != null) {
                    i.b(i.this).a(0, 0, 2);
                }
                if (i.a(i.this) == null) {
                    return;
                }
                i.a(i.this).b(bimVar);
            }

            @Override // com.alibaba.android.ultron.common.page.provider.a.InterfaceC0085a
            public void a(bik bikVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e1c92354", new Object[]{this, bikVar});
                    return;
                }
                i.a(i.this, bikVar.a());
                i.a(i.this).b(i);
                if (i.b(i.this) != null) {
                    i.b(i.this).a(0, 0, 0);
                }
                if (i.a(i.this) == null) {
                    return;
                }
                i.a(i.this).a(bikVar.b());
            }
        });
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            a(this.g).a();
        }
    }

    public Context e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("1ad3a564", new Object[]{this}) : this.c;
    }

    private void a(bil bilVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1c997b3", new Object[]{this, bilVar});
            return;
        }
        PtrBase ptrBase = this.f2530a;
        if (ptrBase == null) {
            return;
        }
        try {
            if (bilVar != null) {
                boolean a2 = bilVar.a();
                boolean b = bilVar.b();
                if (a2 && b) {
                    d();
                } else if (!a2) {
                    this.f2530a.freezeEnd(true, "");
                }
            } else {
                ptrBase.freezeEnd(true, "");
            }
        } catch (Exception e) {
            String message = e.getMessage();
            bix.a(this.f, "dataProcess", "QUERY_END_EXCEPTION", message, (Map<UMDimKey, Object>) null, (com.alibaba.android.umbrella.link.export.a) null);
            bix.a(this.f, "dataProcess", "RESPONSE_GLOBAL_PROCESS", "QUERY_END_EXCEPTION", message, (Map<String, String>) null);
        }
        this.f2530a.refreshComplete(LOAD_FINISH);
    }

    public void a(JSONObject jSONObject, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d1339f3", new Object[]{this, jSONObject, str, map});
            return;
        }
        this.b = jSONObject;
        this.f = str;
        JSONObject jSONObject2 = this.b;
        if (jSONObject2 != null && jSONObject2.containsKey(bip.a.h)) {
            JSONObject jSONObject3 = this.b.getJSONObject(bip.a.h);
            if (jSONObject3 == null) {
                return;
            }
            this.g = jSONObject3.getString(bip.a.i);
            com.alibaba.android.ultron.common.page.provider.a a2 = a(this.g);
            a2.a(this.c, this.b.getString(bip.a.v), this.f, jSONObject3, map);
            a2.a(this.l, this.k, this.m);
            a2.a(new com.alibaba.android.ultron.common.page.provider.b() { // from class: com.alibaba.android.ultron.common.page.i.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.ultron.common.page.provider.b
                public void a(com.alibaba.android.ultron.event.base.e eVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93d93503", new Object[]{this, eVar});
                    } else {
                        i.this.a(2);
                    }
                }

                @Override // com.alibaba.android.ultron.common.page.provider.b
                public void a(JSONObject jSONObject4) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject4});
                        return;
                    }
                    i.c(i.this).refreshComplete(i.LOAD_FINISH);
                    JSONObject jSONObject5 = null;
                    if (jSONObject4 != null || jSONObject4.getJSONObject("data") != null) {
                        JSONObject jSONObject6 = jSONObject4.getJSONObject("data").getJSONObject("global");
                        if (jSONObject6 != null) {
                            jSONObject5 = jSONObject6.getJSONObject(bip.a.m);
                        }
                        boolean z2 = jSONObject5 != null && TextUtils.equals("true", jSONObject5.getString(bip.a.n));
                        if (jSONObject5 == null || !TextUtils.equals("true", jSONObject5.getString(bip.a.l))) {
                            z = false;
                        }
                        i.a(i.this, new bil(z2, z));
                        return;
                    }
                    i.a(i.this, null);
                }
            });
            boolean equals = TextUtils.equals("true", this.b.getString(bip.a.c));
            boolean equals2 = TextUtils.equals("true", this.b.getString(bip.a.d));
            if (equals && equals2) {
                this.f2530a.setMode(PullBase.Mode.BOTH);
                return;
            } else if (equals) {
                this.f2530a.setMode(PullBase.Mode.PULL_FROM_START);
                return;
            } else if (equals2) {
                this.f2530a.setMode(PullBase.Mode.PULL_FROM_END);
                return;
            } else {
                this.f2530a.setMode(PullBase.Mode.DISABLED);
                return;
            }
        }
        try {
            bix.a(this.f, "dataProcess", "PAGE_CONFIG_EMPTY", "get asset pageconfig error", (Map<UMDimKey, Object>) null, (com.alibaba.android.umbrella.link.export.a) null);
            bix.a(this.f, "dataProcess", "get_page_config", "PAGE_CONFIG_EMPTY", "get asset pageconfig error", (Map<String, String>) null);
        } catch (Exception unused) {
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            a(this.g).d();
        }
    }
}
