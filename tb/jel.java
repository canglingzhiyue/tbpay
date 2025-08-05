package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.AnrUncaughtListener;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.OnFileCreatedListener;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.android.tcrash.UncaughtCrashManager;
import com.taobao.android.tcrash.UncaughtCrashType;

/* loaded from: classes6.dex */
public class jel implements UncaughtCrashManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jdy f29502a;
    private final jed b;
    private final jeh c;

    public jel(jdy jdyVar) {
        this.f29502a = jdyVar;
        this.b = new jed(jdyVar);
        this.c = Build.VERSION.SDK_INT > 23 ? new jeh(jdyVar) : new jei(jdyVar);
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else {
            this.f29502a.a(str, obj);
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void addJvmUncaughtCrashListener(JvmUncaughtCrashListener jvmUncaughtCrashListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7610fb6e", new Object[]{this, jvmUncaughtCrashListener});
        } else {
            this.b.a(jvmUncaughtCrashListener);
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void removeJvmUncaughtCrashListener(JvmUncaughtCrashListener jvmUncaughtCrashListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19bbd51", new Object[]{this, jvmUncaughtCrashListener});
        } else {
            this.b.b(jvmUncaughtCrashListener);
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void addAnrUncaughtListener(AnrUncaughtListener anrUncaughtListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("755eaec8", new Object[]{this, anrUncaughtListener});
        } else {
            this.c.a(anrUncaughtListener);
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void removeAnrUncaughtListener(AnrUncaughtListener anrUncaughtListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7894e06b", new Object[]{this, anrUncaughtListener});
        } else {
            this.c.b(anrUncaughtListener);
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void addOnFileCreatedListener(UncaughtCrashType uncaughtCrashType, OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e87f0572", new Object[]{this, uncaughtCrashType, onFileCreatedListener});
        } else if (uncaughtCrashType == UncaughtCrashType.JAVA_ONLY) {
            this.b.a(onFileCreatedListener);
        } else if (uncaughtCrashType == UncaughtCrashType.NATIVE_ONLY) {
            this.c.a(onFileCreatedListener);
        } else if (uncaughtCrashType == UncaughtCrashType.ANR_ONLY) {
            this.c.b(onFileCreatedListener);
        } else {
            this.b.a(onFileCreatedListener);
            this.c.a(onFileCreatedListener);
            this.c.b(onFileCreatedListener);
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void removeOnFileCreatedListener(UncaughtCrashType uncaughtCrashType, OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d9ba2f", new Object[]{this, uncaughtCrashType, onFileCreatedListener});
        } else if (uncaughtCrashType == UncaughtCrashType.JAVA_ONLY) {
            this.b.b(onFileCreatedListener);
        } else if (uncaughtCrashType == UncaughtCrashType.NATIVE_ONLY) {
            this.c.c(onFileCreatedListener);
        } else if (uncaughtCrashType == UncaughtCrashType.ANR_ONLY) {
            this.c.d(onFileCreatedListener);
        } else {
            this.b.b(onFileCreatedListener);
            this.c.c(onFileCreatedListener);
            this.c.d(onFileCreatedListener);
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public UncaughtCrashHeader getUncaughtCrashHeader() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UncaughtCrashHeader) ipChange.ipc$dispatch("d410a0ab", new Object[]{this}) : new jec(this.b.b(), this.c.c());
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public UncaughtCrashHeader getUncaughtCrashHeaderByType(UncaughtCrashType uncaughtCrashType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UncaughtCrashHeader) ipChange.ipc$dispatch("f8eaa438", new Object[]{this, uncaughtCrashType});
        }
        if (uncaughtCrashType == UncaughtCrashType.JAVA_ONLY) {
            return this.b.b();
        }
        if (uncaughtCrashType == UncaughtCrashType.NATIVE_ONLY) {
            return this.c.c();
        }
        if (uncaughtCrashType == UncaughtCrashType.ANR_ONLY) {
            return this.c.c();
        }
        return getUncaughtCrashHeader();
    }

    public jed b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jed) ipChange.ipc$dispatch("16b80114", new Object[]{this}) : this.b;
    }

    public jeh c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jeh) ipChange.ipc$dispatch("1e69a6ef", new Object[]{this}) : this.c;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b.a();
        this.c.a();
    }
}
