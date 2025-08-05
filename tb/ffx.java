package tb;

import com.alibaba.ability.g;
import com.alibaba.ability.h;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsBroadcastAbility;
import com.taobao.android.abilityidl.ability.p;
import com.taobao.tao.log.TLog;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes4.dex */
public final class ffx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final AbsBroadcastAbility f27913a;

    static {
        kge.a(1631470668);
        Companion = new a(null);
    }

    @JvmStatic
    public static final ffx a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ffx) ipChange.ipc$dispatch("f049066", new Object[0]) : Companion.a();
    }

    private ffx(AbsBroadcastAbility absBroadcastAbility) {
        this.f27913a = absBroadcastAbility;
    }

    public /* synthetic */ ffx(AbsBroadcastAbility absBroadcastAbility, o oVar) {
        this(absBroadcastAbility);
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-592559980);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public static final /* synthetic */ ErrorResult a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ErrorResult) ipChange.ipc$dispatch("dafa04e9", new Object[]{aVar}) : aVar.b();
        }

        @JvmStatic
        public final ffx a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ffx) ipChange.ipc$dispatch("f049066", new Object[]{this});
            }
            try {
                Object a2 = h.a(h.INSTANCE, "broadcast", null, 2, null);
                if (!(a2 instanceof AbsBroadcastAbility)) {
                    a2 = null;
                }
                return new ffx((AbsBroadcastAbility) a2, null);
            } catch (Throwable th) {
                TLog.loge("MegaNative", "MegaBroadcast", "create internal ability error: " + th.getMessage());
                return new ffx(null, null);
            }
        }

        private final ErrorResult b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("3c2aea83", new Object[]{this});
            }
            return new ErrorResult("500", "internal ability is null, please check if the class '" + h.b(h.INSTANCE, "broadcast", null, 2, null) + "' exists", (Map) null, 4, (o) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r4, tb.ffw r5) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ffx.$ipChange
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
            java.lang.String r4 = "2862298b"
            r0.ipc$dispatch(r4, r1)
            return
        L18:
            java.lang.String r0 = "eventName"
            kotlin.jvm.internal.q.d(r4, r0)
            com.taobao.android.abilityidl.ability.o$a r0 = com.taobao.android.abilityidl.ability.o.Companion
            com.taobao.android.abilityidl.ability.o r4 = r0.a(r4)
            if (r4 == 0) goto L53
            com.taobao.android.abilityidl.ability.AbsBroadcastAbility r0 = r3.f27913a
            if (r0 == 0) goto L42
            com.alibaba.ability.g$a r1 = com.alibaba.ability.g.Companion
            tb.alq r1 = r1.a()
            tb.als r1 = (tb.als) r1
            if (r5 != 0) goto L3b
            tb.fgn r2 = new tb.fgn
            r2.<init>()
            tb.ffw r2 = (tb.ffw) r2
            goto L3c
        L3b:
            r2 = r5
        L3c:
            com.taobao.android.abilityidl.ability.bg r2 = (com.taobao.android.abilityidl.ability.bg) r2
            r0.addEventListener(r1, r4, r2)
            goto L4d
        L42:
            if (r5 == 0) goto L50
            tb.ffx$a r4 = tb.ffx.Companion
            com.alibaba.ability.result.ErrorResult r4 = tb.ffx.a.a(r4)
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
        throw new UnsupportedOperationException("Method not decompiled: tb.ffx.a(java.lang.String, tb.ffw):void");
    }

    public final void a(com.taobao.android.abilityidl.ability.o params, ffw ffwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4520fd3d", new Object[]{this, params, ffwVar});
            return;
        }
        q.d(params, "params");
        AbsBroadcastAbility absBroadcastAbility = this.f27913a;
        if (absBroadcastAbility == null) {
            if (ffwVar == null) {
                return;
            }
            ffwVar.a(a.a(Companion));
            return;
        }
        alq a2 = g.Companion.a();
        if (ffwVar == null) {
            ffwVar = new fgn();
        }
        absBroadcastAbility.addEventListener(a2, params, ffwVar);
    }

    public final void a(p params, jzb jzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b64f61", new Object[]{this, params, jzbVar});
            return;
        }
        q.d(params, "params");
        AbsBroadcastAbility absBroadcastAbility = this.f27913a;
        if (absBroadcastAbility == null) {
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
        absBroadcastAbility.dispatchEvent(a2, params, jzbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r4, tb.jzb r5) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ffx.$ipChange
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
            java.lang.String r0 = "eventName"
            kotlin.jvm.internal.q.d(r4, r0)
            com.taobao.android.abilityidl.ability.q$a r0 = com.taobao.android.abilityidl.ability.q.Companion
            com.taobao.android.abilityidl.ability.q r4 = r0.a(r4)
            if (r4 == 0) goto L53
            com.taobao.android.abilityidl.ability.AbsBroadcastAbility r0 = r3.f27913a
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
            r0.removeEventListener(r1, r4, r2)
            goto L4d
        L42:
            if (r5 == 0) goto L50
            tb.ffx$a r4 = tb.ffx.Companion
            com.alibaba.ability.result.ErrorResult r4 = tb.ffx.a.a(r4)
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
        throw new UnsupportedOperationException("Method not decompiled: tb.ffx.a(java.lang.String, tb.jzb):void");
    }
}
