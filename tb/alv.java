package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;

/* loaded from: classes.dex */
public final class alv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final alv INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static alw f25436a;
    public static alw b;

    static {
        kge.a(2125558064);
        INSTANCE = new alv();
    }

    private alv() {
    }

    public static final alw a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (alw) ipChange.ipc$dispatch("f0260f2", new Object[0]);
        }
        alw alwVar = f25436a;
        if (alwVar == null) {
            q.b("abilityHub");
        }
        return alwVar;
    }

    public static final void a(alw alwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e04405ac", new Object[]{alwVar});
            return;
        }
        q.d(alwVar, "<set-?>");
        f25436a = alwVar;
    }

    public static final alw b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (alw) ipChange.ipc$dispatch("16b40651", new Object[0]);
        }
        alw alwVar = b;
        if (alwVar == null) {
            q.b("rocketAbilityHub");
        }
        return alwVar;
    }

    public static final void b(alw alwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec70c2d", new Object[]{alwVar});
            return;
        }
        q.d(alwVar, "<set-?>");
        b = alwVar;
    }
}
