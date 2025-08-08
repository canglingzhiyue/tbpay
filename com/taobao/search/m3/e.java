package com.taobao.search.m3;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.rir;
import tb.ris;

/* loaded from: classes7.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final HashMap<Activity, e> c;

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, h> f19079a;
    private ris b;
    private h d;
    private final ris e;

    /* loaded from: classes7.dex */
    public static final class b implements rir {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.rir
        public void a(Object obj) {
            JSONObject jSONObject;
            String string;
            JSONObject jSONObject2;
            h hVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            } else if (!(obj instanceof JSONObject) || (string = (jSONObject = (JSONObject) obj).getString("itemId")) == null || (jSONObject2 = jSONObject.getJSONObject("extDetailParams")) == null || (hVar = (h) e.a(e.this).get(string)) == null) {
            } else {
                hVar.a(jSONObject2);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class c implements rir {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.rir
        public final void a(Object obj) {
            h b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            } else if (!(obj instanceof JSONObject)) {
            } else {
                JSONObject jSONObject = (JSONObject) obj;
                String string = jSONObject.getString("info");
                String code = jSONObject.getString("code");
                if (StringUtils.isEmpty(code) || (b = e.b(e.this)) == null) {
                    return;
                }
                q.a((Object) code, "code");
                b.a(string, code);
            }
        }
    }

    public e(Activity activity) {
        q.c(activity, "activity");
        this.f19079a = new HashMap<>();
        Activity activity2 = activity;
        this.b = new ris(activity2, "coupon_poststate_jyb_pocketMoney", new b());
        this.e = new ris(activity2, "WIN", new c());
    }

    public static final /* synthetic */ HashMap a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("911c43ca", new Object[]{eVar}) : eVar.f19079a;
    }

    public static final /* synthetic */ void a(e eVar, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("773cb803", new Object[]{eVar, hVar});
        } else {
            eVar.d = hVar;
        }
    }

    public static final /* synthetic */ h b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("2617384a", new Object[]{eVar}) : eVar.d;
    }

    public static final /* synthetic */ HashMap b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("8adf10c", new Object[0]) : c;
    }

    public static final /* synthetic */ void c(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c27329", new Object[]{eVar});
        } else {
            eVar.a();
        }
    }

    public static final /* synthetic */ void d(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1257aa", new Object[]{eVar});
        } else {
            eVar.c();
        }
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b.b();
        this.e.b();
    }

    private final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.d = null;
        }
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(71688887);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final void a(Activity activity, String itemId, h listener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7699be0", new Object[]{this, activity, itemId, listener});
                return;
            }
            q.c(activity, "activity");
            q.c(itemId, "itemId");
            q.c(listener, "listener");
            e eVar = (e) e.b().get(activity);
            if (eVar == null) {
                eVar = new e(activity);
                e.b().put(activity, eVar);
            }
            q.a((Object) eVar, "managers[activity] ?: Jy…         it\n            }");
            e.a(eVar).put(itemId, listener);
        }

        public final void a(Activity activity, h listener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("475f6a96", new Object[]{this, activity, listener});
                return;
            }
            q.c(activity, "activity");
            q.c(listener, "listener");
            e eVar = (e) e.b().get(activity);
            if (eVar == null) {
                eVar = new e(activity);
                e.b().put(activity, eVar);
            }
            q.a((Object) eVar, "managers[activity] ?: Jy…         it\n            }");
            e.a(eVar, listener);
        }

        public final void a(Activity activity, String itemId) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c8bb1504", new Object[]{this, activity, itemId});
                return;
            }
            q.c(activity, "activity");
            q.c(itemId, "itemId");
            e eVar = (e) e.b().get(activity);
            if (eVar == null) {
                return;
            }
            q.a((Object) eVar, "managers[activity] ?: return");
            e.a(eVar).remove(itemId);
        }

        public final void a(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
                return;
            }
            q.c(activity, "activity");
            e eVar = (e) e.b().remove(activity);
            if (eVar == null) {
                return;
            }
            e.c(eVar);
        }

        public final void b(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
                return;
            }
            q.c(activity, "activity");
            e eVar = (e) e.b().get(activity);
            if (eVar == null) {
                return;
            }
            e.d(eVar);
        }
    }

    static {
        kge.a(-1462720977);
        Companion = new a(null);
        c = new HashMap<>();
    }
}
