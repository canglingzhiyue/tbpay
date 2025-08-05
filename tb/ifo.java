package tb;

import com.alibaba.ability.h;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.ability.result.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsGeneralSettingAbility;
import com.taobao.android.abilityidl.ability.aw;
import com.taobao.tao.log.TLog;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes4.dex */
public final class ifo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final AbsGeneralSettingAbility f28996a;

    static {
        kge.a(-743674979);
        Companion = new a(null);
    }

    @JvmStatic
    public static final ifo a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ifo) ipChange.ipc$dispatch("f05ec6c", new Object[0]) : Companion.a();
    }

    private ifo(AbsGeneralSettingAbility absGeneralSettingAbility) {
        this.f28996a = absGeneralSettingAbility;
    }

    public /* synthetic */ ifo(AbsGeneralSettingAbility absGeneralSettingAbility, o oVar) {
        this(absGeneralSettingAbility);
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1858849115);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public static final /* synthetic */ ErrorResult a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ErrorResult) ipChange.ipc$dispatch("cbc1a123", new Object[]{aVar}) : aVar.b();
        }

        @JvmStatic
        public final ifo a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ifo) ipChange.ipc$dispatch("f05ec6c", new Object[]{this});
            }
            try {
                Object a2 = h.a(h.INSTANCE, "GeneralSetting", null, 2, null);
                if (!(a2 instanceof AbsGeneralSettingAbility)) {
                    a2 = null;
                }
                return new ifo((AbsGeneralSettingAbility) a2, null);
            } catch (Throwable th) {
                TLog.loge("MegaNative", "MegaGeneralSetting", "create internal ability error: " + th.getMessage());
                return new ifo(null, null);
            }
        }

        private final ErrorResult b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("3c2aea83", new Object[]{this});
            }
            return new ErrorResult("500", "internal ability is null, please check if the class '" + h.b(h.INSTANCE, "GeneralSetting", null, 2, null) + "' exists", (Map) null, 4, (o) null);
        }
    }

    public final g<String, ErrorResult> a(String key) {
        g<String, ErrorResult> gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("add90f18", new Object[]{this, key});
        }
        q.d(key, "key");
        aw a2 = aw.Companion.a(key);
        if (a2 != null) {
            AbsGeneralSettingAbility absGeneralSettingAbility = this.f28996a;
            return (absGeneralSettingAbility == null || (gVar = absGeneralSettingAbility.get(com.alibaba.ability.g.Companion.a(), a2)) == null) ? new g<>(null, a.a(Companion)) : gVar;
        }
        return new g<>(null, a$a.Companion.b("params invalid"));
    }
}
