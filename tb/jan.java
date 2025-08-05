package tb;

import com.alibaba.ability.g;
import com.alibaba.ability.h;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.a$a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsMEMKVStorageAbility;
import com.taobao.android.abilityidl.ability.dc;
import com.taobao.android.abilityidl.ability.dd;
import com.taobao.tao.log.TLog;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes4.dex */
public final class jan {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final AbsMEMKVStorageAbility f29436a;

    static {
        kge.a(1767507184);
        Companion = new a(null);
    }

    @JvmStatic
    public static final jan a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jan) ipChange.ipc$dispatch("f064de7", new Object[0]) : Companion.a();
    }

    private jan(AbsMEMKVStorageAbility absMEMKVStorageAbility) {
        this.f29436a = absMEMKVStorageAbility;
    }

    public /* synthetic */ jan(AbsMEMKVStorageAbility absMEMKVStorageAbility, o oVar) {
        this(absMEMKVStorageAbility);
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1482914760);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public static final /* synthetic */ ErrorResult a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ErrorResult) ipChange.ipc$dispatch("74540c8", new Object[]{aVar}) : aVar.b();
        }

        @JvmStatic
        public final jan a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jan) ipChange.ipc$dispatch("f064de7", new Object[]{this});
            }
            try {
                Object a2 = h.a(h.INSTANCE, "MEMKVStorage", null, 2, null);
                if (!(a2 instanceof AbsMEMKVStorageAbility)) {
                    a2 = null;
                }
                return new jan((AbsMEMKVStorageAbility) a2, null);
            } catch (Throwable th) {
                TLog.loge("MegaNative", "MegaMEMKVStorage", "create internal ability error: " + th.getMessage());
                return new jan(null, null);
            }
        }

        private final ErrorResult b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("3c2aea83", new Object[]{this});
            }
            return new ErrorResult("500", "internal ability is null, please check if the class '" + h.b(h.INSTANCE, "MEMKVStorage", null, 2, null) + "' exists", (Map) null, 4, (o) null);
        }
    }

    public final void a(dd params, jzb jzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146bf8db", new Object[]{this, params, jzbVar});
            return;
        }
        q.d(params, "params");
        AbsMEMKVStorageAbility absMEMKVStorageAbility = this.f29436a;
        if (absMEMKVStorageAbility == null) {
            if (jzbVar == null) {
                return;
            }
            jzbVar.a(a.a(Companion));
            return;
        }
        alq a2 = g.Companion.a();
        if (jzbVar == null) {
            jzbVar = new kei();
        }
        absMEMKVStorageAbility.setItem(a2, params, jzbVar);
    }

    public final com.alibaba.ability.result.g<String, ErrorResult> a(String key) {
        com.alibaba.ability.result.g<String, ErrorResult> item;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.ability.result.g) ipChange.ipc$dispatch("add90f18", new Object[]{this, key});
        }
        q.d(key, "key");
        dc a2 = dc.Companion.a(key);
        if (a2 != null) {
            AbsMEMKVStorageAbility absMEMKVStorageAbility = this.f29436a;
            return (absMEMKVStorageAbility == null || (item = absMEMKVStorageAbility.getItem(g.Companion.a(), a2)) == null) ? new com.alibaba.ability.result.g<>(null, a.a(Companion)) : item;
        }
        return new com.alibaba.ability.result.g<>(null, a$a.Companion.b("params invalid"));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r4, tb.jzb r5) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.jan.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r2 = 1
            r1[r2] = r4
            r4 = 2
            r1[r4] = r5
            java.lang.String r4 = "3045d650"
            r0.ipc$dispatch(r4, r1)
            return
        L18:
            java.lang.String r0 = "key"
            kotlin.jvm.internal.q.d(r4, r0)
            com.taobao.android.abilityidl.ability.dc$a r0 = com.taobao.android.abilityidl.ability.dc.Companion
            com.taobao.android.abilityidl.ability.dc r4 = r0.a(r4)
            if (r4 == 0) goto L53
            com.taobao.android.abilityidl.ability.AbsMEMKVStorageAbility r0 = r3.f29436a
            if (r0 == 0) goto L42
            com.alibaba.ability.g$a r1 = com.alibaba.ability.g.Companion
            tb.alq r1 = r1.a()
            tb.als r1 = (tb.als) r1
            if (r5 != 0) goto L3b
            tb.kei r2 = new tb.kei
            r2.<init>()
            tb.jzb r2 = (tb.jzb) r2
            goto L3c
        L3b:
            r2 = r5
        L3c:
            tb.gml r2 = (tb.gml) r2
            r0.removeItem(r1, r4, r2)
            goto L4d
        L42:
            if (r5 == 0) goto L50
            tb.jan$a r4 = tb.jan.Companion
            com.alibaba.ability.result.ErrorResult r4 = tb.jan.a.a(r4)
            r5.a(r4)
        L4d:
            kotlin.t r4 = kotlin.t.INSTANCE
            goto L51
        L50:
            r4 = 0
        L51:
            if (r4 != 0) goto L62
        L53:
            if (r5 == 0) goto L62
            com.alibaba.ability.result.a$a$a r4 = com.alibaba.ability.result.a$a.Companion
            java.lang.String r0 = "params invalid"
            com.alibaba.ability.result.ErrorResult r4 = r4.b(r0)
            r5.a(r4)
            kotlin.t r4 = kotlin.t.INSTANCE
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jan.a(java.lang.String, tb.jzb):void");
    }
}
