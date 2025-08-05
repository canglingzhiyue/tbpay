package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.perf.MnnOnceDetectRecord;
import com.etao.feimagesearch.config.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class qgt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final qgt INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f32924a;
    private static volatile boolean b;
    private static volatile long c;
    private static volatile int d;
    private static volatile long e;
    private static volatile long f;
    private static volatile int g;
    private static volatile int h;
    private static volatile boolean i;
    private static volatile long j;
    private static volatile int k;
    private static volatile long l;
    private static volatile List<MnnOnceDetectRecord> n;
    private static volatile boolean o;

    static {
        kge.a(-437625478);
        INSTANCE = new qgt();
        n = new ArrayList();
    }

    private qgt() {
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : f32924a;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : b;
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : o;
    }

    public final long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : c;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : d;
    }

    public final long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue() : e;
    }

    public final long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue() : f;
    }

    public final int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : g;
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : h;
    }

    public final int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : k;
    }

    public final long j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe5", new Object[]{this})).longValue() : l;
    }

    public final List<MnnOnceDetectRecord> l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("566a3ef4", new Object[]{this}) : n;
    }

    private final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        f32924a = false;
        b = false;
        o = false;
        d = 0;
        c = 0L;
        e = 0L;
        f = 0L;
        g = 0;
        h = 0;
        i = false;
        j = 0L;
        l = 0L;
        k = 0;
        n = new ArrayList();
    }

    @JvmStatic
    public static final void a(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed6d4a7", new Object[]{l2});
        } else if (l2 == null) {
        } else {
            l2.longValue();
            INSTANCE.n();
            c = l2.longValue();
        }
    }

    @JvmStatic
    public static final void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{num});
        } else if (num == null) {
        } else {
            num.intValue();
            d = num.intValue();
        }
    }

    @JvmStatic
    public static final void a(boolean z, boolean z2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2710c6dc", new Object[]{new Boolean(z), new Boolean(z2), new Long(j2)});
            return;
        }
        if (z) {
            if (z2) {
                k = 0;
                l = 0L;
                j = j2;
            }
        } else if (z2 && !i) {
            l = j2 - c;
            j = j2;
        }
        i = z2;
        e = j2;
        g++;
        if (z2) {
            h++;
        } else {
            k++;
        }
    }

    public final void a(MnnOnceDetectRecord timeRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f419c5", new Object[]{this, timeRecord});
            return;
        }
        q.c(timeRecord, "timeRecord");
        if (timeRecord.a() >= 5000 || timeRecord.a() <= 0) {
            return;
        }
        n.add(timeRecord);
    }

    public final long m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158668", new Object[]{this})).longValue();
        }
        if (j <= 0) {
            return 0L;
        }
        long j2 = f - j;
        if (j2 > 0) {
            return j2;
        }
        return 0L;
    }

    @JvmStatic
    public static final void a(boolean z, boolean z2, boolean z3, long j2) {
        IpChange ipChange = $ipChange;
        boolean z4 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb0fd158", new Object[]{new Boolean(z), new Boolean(z2), new Boolean(z3), new Long(j2)});
        } else if (!b.cU()) {
        } else {
            f32924a = z;
            b = z2;
            o = z3;
            f = j2;
            if (c > 0 && f - c > 0) {
                z4 = true;
            }
            if (!z4) {
                INSTANCE.n();
                return;
            }
            qgu.INSTANCE.a(INSTANCE);
            qgu.INSTANCE.b(INSTANCE);
            INSTANCE.n();
        }
    }
}
