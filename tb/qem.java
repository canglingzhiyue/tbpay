package tb;

import android.app.Activity;
import com.alibaba.ability.g;
import com.alibaba.ability.h;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsLoadingAbility;
import com.taobao.android.abilityidl.ability.fv;
import com.taobao.tao.log.TLog;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes4.dex */
public final class qem {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final AbsLoadingAbility f32906a;

    static {
        kge.a(800367495);
        Companion = new a(null);
    }

    @JvmStatic
    public static final qem a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qem) ipChange.ipc$dispatch("f098b65", new Object[0]) : Companion.a();
    }

    private qem(AbsLoadingAbility absLoadingAbility) {
        this.f32906a = absLoadingAbility;
    }

    public /* synthetic */ qem(AbsLoadingAbility absLoadingAbility, o oVar) {
        this(absLoadingAbility);
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1095822833);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public static final /* synthetic */ ErrorResult a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ErrorResult) ipChange.ipc$dispatch("88d9c08a", new Object[]{aVar}) : aVar.b();
        }

        @JvmStatic
        public final qem a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qem) ipChange.ipc$dispatch("f098b65", new Object[]{this});
            }
            try {
                Object a2 = h.a(h.INSTANCE, "loading", null, 2, null);
                if (!(a2 instanceof AbsLoadingAbility)) {
                    a2 = null;
                }
                return new qem((AbsLoadingAbility) a2, null);
            } catch (Throwable th) {
                TLog.loge("MegaNative", "MegaLoading", "create internal ability error: " + th.getMessage());
                return new qem(null, null);
            }
        }

        private final ErrorResult b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("3c2aea83", new Object[]{this});
            }
            return new ErrorResult("500", "internal ability is null, please check if the class '" + h.b(h.INSTANCE, "loading", null, 2, null) + "' exists", (Map) null, 4, (o) null);
        }
    }

    public final void a(Activity activity, fv params, jzb jzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6dca75d", new Object[]{this, activity, params, jzbVar});
            return;
        }
        q.d(activity, "activity");
        q.d(params, "params");
        AbsLoadingAbility absLoadingAbility = this.f32906a;
        if (absLoadingAbility == null) {
            if (jzbVar == null) {
                return;
            }
            jzbVar.a(a.a(Companion));
            return;
        }
        alq a2 = g.Companion.a(activity);
        if (jzbVar == null) {
            jzbVar = new kei();
        }
        absLoadingAbility.show(a2, params, jzbVar);
    }

    public final void a(jzb jzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f05b6086", new Object[]{this, jzbVar});
            return;
        }
        AbsLoadingAbility absLoadingAbility = this.f32906a;
        if (absLoadingAbility == null) {
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
        absLoadingAbility.hide(a2, jzbVar);
    }
}
