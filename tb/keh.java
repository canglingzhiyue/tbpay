package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.bootimage.linked.h;
import java.util.Map;

/* loaded from: classes6.dex */
public class keh extends kee {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private SharedPreferences b;

    /* renamed from: a  reason: collision with root package name */
    private boolean f30006a = false;
    private final JvmUncaughtCrashListener c = new JvmUncaughtCrashListener() { // from class: tb.keh.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
        public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
            }
            try {
                keh.a(keh.this, th);
                return null;
            } catch (Throwable th2) {
                kej.a("StabilityService", "crashCaughtListener ERROR", th2);
                return null;
            }
        }
    };

    static {
        kge.a(1289538923);
    }

    public static /* synthetic */ Object ipc$super(keh kehVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(keh kehVar, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3697506b", new Object[]{kehVar, th});
        } else {
            kehVar.a(th);
        }
    }

    @Override // tb.kef
    public void d() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.b = kel.a();
        StringBuilder sb = new StringBuilder();
        sb.append("StabilityService init sp ");
        if (this.b != null) {
            z = true;
        }
        sb.append(z);
        kej.a("StabilityService", sb.toString());
        SharedPreferences sharedPreferences2 = this.b;
        long j = sharedPreferences2 != null ? sharedPreferences2.getLong("occupiedTime", 0L) : 0L;
        if (a(j)) {
            this.f30006a = true;
            kej.a("StabilityService", "StabilityService InCrashOccupiedState");
            return;
        }
        kej.a("StabilityService", "正常启动");
        if (j != 0 && (sharedPreferences = this.b) != null) {
            sharedPreferences.edit().putLong("occupiedTime", 0L).apply();
        }
        TCrashSDK.instance().addJvmUncaughtCrashListener(this.c);
    }

    @Override // tb.kef
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.f30006a;
    }

    private void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
            return;
        }
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (stackTraceElement.getClassName().startsWith("com.taobao.bootimage")) {
                f();
                c();
                return;
            }
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        h.a("").f().c();
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong("occupiedTime", System.currentTimeMillis());
        edit.apply();
    }
}
