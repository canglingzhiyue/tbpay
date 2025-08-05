package tb;

import com.alibaba.ability.g;
import com.alibaba.ability.h;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.a$a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsUserKVStorageAbility;
import com.taobao.android.abilityidl.ability.el;
import com.taobao.android.abilityidl.ability.em;
import com.taobao.tao.log.TLog;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes4.dex */
public final class jap {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final AbsUserKVStorageAbility f29438a;

    static {
        kge.a(-738838224);
        Companion = new a(null);
    }

    @JvmStatic
    public static final jap a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jap) ipChange.ipc$dispatch("f064e25", new Object[0]) : Companion.a();
    }

    private jap(AbsUserKVStorageAbility absUserKVStorageAbility) {
        this.f29438a = absUserKVStorageAbility;
    }

    public /* synthetic */ jap(AbsUserKVStorageAbility absUserKVStorageAbility, o oVar) {
        this(absUserKVStorageAbility);
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(750020728);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public static final /* synthetic */ ErrorResult a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ErrorResult) ipChange.ipc$dispatch("3c86c5ca", new Object[]{aVar}) : aVar.b();
        }

        @JvmStatic
        public final jap a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jap) ipChange.ipc$dispatch("f064e25", new Object[]{this});
            }
            try {
                Object a2 = h.a(h.INSTANCE, "userKVStorage", null, 2, null);
                if (!(a2 instanceof AbsUserKVStorageAbility)) {
                    a2 = null;
                }
                return new jap((AbsUserKVStorageAbility) a2, null);
            } catch (Throwable th) {
                TLog.loge("MegaNative", "MegaUserKVStorage", "create internal ability error: " + th.getMessage());
                return new jap(null, null);
            }
        }

        private final ErrorResult b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("3c2aea83", new Object[]{this});
            }
            return new ErrorResult("500", "internal ability is null, please check if the class '" + h.b(h.INSTANCE, "userKVStorage", null, 2, null) + "' exists", (Map) null, 4, (o) null);
        }
    }

    public final void a(String bizID, String key, String value) {
        AbsUserKVStorageAbility absUserKVStorageAbility;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, bizID, key, value});
            return;
        }
        q.d(bizID, "bizID");
        q.d(key, "key");
        q.d(value, "value");
        em a2 = em.Companion.a(bizID, key, value);
        if (a2 == null || (absUserKVStorageAbility = this.f29438a) == null) {
            return;
        }
        absUserKVStorageAbility.setItem(g.Companion.a(), a2);
    }

    public final com.alibaba.ability.result.g<String, ErrorResult> a(String bizID, String key) {
        com.alibaba.ability.result.g<String, ErrorResult> item;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.ability.result.g) ipChange.ipc$dispatch("27650a0e", new Object[]{this, bizID, key});
        }
        q.d(bizID, "bizID");
        q.d(key, "key");
        el a2 = el.Companion.a(bizID, key);
        if (a2 != null) {
            AbsUserKVStorageAbility absUserKVStorageAbility = this.f29438a;
            return (absUserKVStorageAbility == null || (item = absUserKVStorageAbility.getItem(g.Companion.a(), a2)) == null) ? new com.alibaba.ability.result.g<>(null, a.a(Companion)) : item;
        }
        return new com.alibaba.ability.result.g<>(null, a$a.Companion.b("params invalid"));
    }

    public final void b(String bizID, String key) {
        AbsUserKVStorageAbility absUserKVStorageAbility;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, bizID, key});
            return;
        }
        q.d(bizID, "bizID");
        q.d(key, "key");
        el a2 = el.Companion.a(bizID, key);
        if (a2 == null || (absUserKVStorageAbility = this.f29438a) == null) {
            return;
        }
        absUserKVStorageAbility.removeItem(g.Companion.a(), a2);
    }
}
