package com.taobao.android.sku;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.android.ultron.engine.logic.b;
import com.alibaba.android.ultron.vfw.dataloader.d;
import com.alibaba.android.ultron.vfw.dataloader.h;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.c;
import com.taobao.android.sku.utils.o;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.ArrayList;
import java.util.HashMap;
import tb.bpp;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private f f15173a;
    private c b;
    private com.alibaba.android.ultron.vfw.instance.d c;
    private com.taobao.android.sku.data.a d;
    private ViewGroup e;
    private volatile a f;
    private volatile boolean g = f.f15177a;
    private volatile boolean h;

    static {
        kge.a(-276540211);
    }

    public static /* synthetic */ boolean a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5709a95b", new Object[]{eVar})).booleanValue() : eVar.h;
    }

    public static /* synthetic */ boolean a(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a2c3461", new Object[]{eVar, new Boolean(z)})).booleanValue();
        }
        eVar.h = z;
        return z;
    }

    public static /* synthetic */ com.alibaba.android.ultron.vfw.instance.d b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.instance.d) ipChange.ipc$dispatch("c4aa06bd", new Object[]{eVar}) : eVar.c;
    }

    public e(f fVar, c cVar, com.alibaba.android.ultron.vfw.instance.d dVar, com.taobao.android.sku.data.a aVar) {
        this.f15173a = fVar;
        this.b = cVar;
        this.c = dVar;
        this.d = aVar;
    }

    public void a(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920f557f", new Object[]{this, linearLayout});
        } else if (linearLayout == null) {
        } else {
            this.e = linearLayout;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(0);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : com.taobao.android.sku.data.a.b(this.d.e()) || com.taobao.android.sku.data.a.b(this.d.f());
    }

    public void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
            return;
        }
        this.f = new a(str, str2, str3, str4);
        this.g |= c();
        if (this.g) {
            return;
        }
        this.f.run();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.taobao.android.sku.JSCore$2] */
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            final String string = jSONObject.getString("action");
            final JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.putAll(jSONObject.getJSONObject("params"));
            } catch (Throwable unused) {
            }
            if ("pv_sku_update".equals(string)) {
                com.alibaba.android.ultron.event.base.e a2 = this.b.k().d().a();
                a2.a("adjustState");
                a2.a(new DMEvent("adjustState", new JSONObject() { // from class: com.taobao.android.sku.JSCore$1
                    {
                        put("subType", "change_prop");
                        put("payload", (Object) new JSONObject());
                    }
                }, null));
                a2.a("extraParams", new ArrayList<Object>() { // from class: com.taobao.android.sku.JSCore$2
                    {
                        add("propChangeFromBigImageView");
                        add(jSONObject2);
                    }
                }.toArray());
                this.b.k().d().a(a2);
                return;
            }
            com.alibaba.android.ultron.event.base.e a3 = this.b.k().d().a();
            a3.a("adjustState");
            a3.a(new DMEvent("adjustState", new JSONObject() { // from class: com.taobao.android.sku.JSCore$3
                {
                    put("subType", (Object) string);
                    put("payload", (Object) new JSONObject() { // from class: com.taobao.android.sku.JSCore$3.1
                        {
                            putAll(jSONObject2);
                        }
                    });
                }
            }, null));
            this.b.k().d().a(a3);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (!this.h) {
            if (this.f == null) {
                return;
            }
            this.f.run();
        }
        d.a aVar = new d.a();
        aVar.f2693a = this.d.h();
        aVar.d = this.d.g();
        this.c.a(str, com.alibaba.android.ultron.vfw.dataloader.d.a("initial", aVar), new com.alibaba.android.ultron.vfw.dataloader.f());
    }

    public void a(String str, String str2, d.c cVar, final c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb3310d", new Object[]{this, str, str2, cVar, bVar});
            return;
        }
        if (!this.h) {
            if (this.f == null) {
                return;
            }
            this.f.run();
        }
        JSONObject h = this.d.h();
        if (h == null) {
            if (bVar == null) {
                return;
            }
            bVar.a();
            return;
        }
        a();
        d.a aVar = new d.a();
        aVar.f2693a = h;
        aVar.d = this.d.g();
        com.alibaba.android.ultron.vfw.dataloader.d s = this.c.s();
        if (s != null) {
            aVar.a(s.d());
        }
        com.alibaba.android.ultron.vfw.dataloader.d a2 = com.alibaba.android.ultron.vfw.dataloader.d.a("initial", aVar);
        a2.a(str2);
        a2.a(cVar);
        this.c.a(str, a2, new com.alibaba.android.ultron.vfw.dataloader.f() { // from class: com.taobao.android.sku.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str3, Object... objArr) {
                if (str3.hashCode() == -1255022652) {
                    super.a((h) objArr[0], (UltronError) objArr[1]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str3));
            }

            @Override // com.alibaba.android.ultron.vfw.dataloader.f, com.alibaba.android.ultron.vfw.dataloader.b
            public void a(h hVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e5eca7a1", new Object[]{this, hVar});
                    return;
                }
                c.b bVar2 = bVar;
                if (bVar2 == null) {
                    return;
                }
                bVar2.a();
            }

            @Override // com.alibaba.android.ultron.vfw.dataloader.f, com.alibaba.android.ultron.vfw.dataloader.b
            public void a(h hVar, UltronError ultronError) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b531dfc4", new Object[]{this, hVar, ultronError});
                } else {
                    super.a(hVar, ultronError);
                }
            }
        });
    }

    /* loaded from: classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String b;
        private String c;
        private String d;
        private String e;

        static {
            kge.a(126050384);
            kge.a(-1390502639);
        }

        public a(String str, String str2, String str3, String str4) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (e.a(e.this)) {
            } else {
                com.alibaba.android.ultron.vfw.dataloader.c a2 = com.alibaba.android.ultron.vfw.dataloader.c.a();
                a2.a(com.alibaba.android.ultron.vfw.dataloader.c.DATA_LOADER_TYPE_CLIENT);
                a2.c(this.b);
                a2.d(this.d);
                a2.e(this.e);
                e.b(e.this).a(a2);
                e.b(e.this).a(com.taobao.android.sku.bizevent.f.EVENT_TYPE, "alarm001", new b() { // from class: com.taobao.android.sku.e.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.android.ultron.engine.logic.b
                    public void a(String str) {
                        UMLinkLogInterface a3;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        } else if (TextUtils.isEmpty(str) || (a3 = bpp.a()) == null) {
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("errorMsg", str);
                            try {
                                a3.commitFailure("Main", "", "", "New_Sku", "Main", hashMap, o.UM_DOWNGRADE_E, str);
                            } catch (Throwable th) {
                                o.b(th.toString());
                            }
                        }
                    }
                });
                e.a(e.this, true);
            }
        }
    }
}
