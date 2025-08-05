package tb;

import android.os.Bundle;
import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.AnrUncaughtListener;
import com.taobao.android.tcrash.OnFileCreatedListener;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.uc.crashsdk.export.LogType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public class jeh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final UncaughtCrashHeader f29500a;
    private final List<AnrUncaughtListener> b;
    private final List<OnFileCreatedListener> c;
    private final List<OnFileCreatedListener> d;
    private jej e;
    private jej f;
    private final jef g;

    /* renamed from: lambda$2vvNL1rqpN7Z-S033M34GSbbQdM */
    public static /* synthetic */ void m2446lambda$2vvNL1rqpN7ZS033M34GSbbQdM(jeh jehVar, Bundle bundle) {
        jehVar.a(bundle);
    }

    public static /* synthetic */ String lambda$Yg_9OCGYHD4avD44RY_PoNLjyUY(jeh jehVar) {
        return jehVar.d();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    public jeh(jdy jdyVar) {
        this(jdyVar, true);
    }

    public jeh(jdy jdyVar, boolean z) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.g = new jeg(jdyVar, z);
        this.f29500a = this.g.a();
        this.g.a(new Callable() { // from class: tb.-$$Lambda$jeh$Yg_9OCGYHD4avD44RY_PoNLjyUY
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return jeh.lambda$Yg_9OCGYHD4avD44RY_PoNLjyUY(jeh.this);
            }
        });
        this.g.a(new ValueCallback() { // from class: tb.-$$Lambda$jeh$2vvNL1rqpN7Z-S033M34GSbbQdM
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                jeh.m2446lambda$2vvNL1rqpN7ZS033M34GSbbQdM(jeh.this, (Bundle) obj);
            }
        });
    }

    public /* synthetic */ String d() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        jfj.b("NativeUncaughtCatcher", "dispatch anr");
        return b();
    }

    public /* synthetic */ void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
            return;
        }
        try {
            String string = bundle.getString("logType");
            String string2 = bundle.getString("filePathName");
            jfj.b("NativeUncaughtCatcher", "onCompleted", string2);
            if ("anr".equals(string)) {
                a(string2);
            } else if (LogType.NATIVE_TYPE.equals(string)) {
                b(string2);
            } else {
                jfj.a("NativeUncaughtCatcher", string2);
            }
        } catch (Throwable th) {
            jfj.b(th);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        synchronized (this.c) {
            for (OnFileCreatedListener onFileCreatedListener : this.c) {
                onFileCreatedListener.onFileCreated(str);
            }
        }
        jej jejVar = this.e;
        if (jejVar == null) {
            return;
        }
        jejVar.onCompleted(str);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        synchronized (this.d) {
            for (OnFileCreatedListener onFileCreatedListener : this.d) {
                onFileCreatedListener.onFileCreated(str);
            }
        }
        jej jejVar = this.f;
        if (jejVar == null) {
            return;
        }
        jejVar.onCompleted(str);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        synchronized (this.b) {
            for (AnrUncaughtListener anrUncaughtListener : this.b) {
                Map<String, Object> onAnrUncaught = anrUncaughtListener.onAnrUncaught();
                if (onAnrUncaught != null) {
                    hashMap.putAll(onAnrUncaught);
                    jfj.b("NativeUncaughtCatcher", onAnrUncaught.toString());
                }
            }
        }
        return hashMap.toString();
    }

    public jeh a(AnrUncaughtListener anrUncaughtListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jeh) ipChange.ipc$dispatch("4663af65", new Object[]{this, anrUncaughtListener});
        }
        if (anrUncaughtListener == null) {
            jfj.a(new IllegalArgumentException("listener is null"));
            return this;
        }
        synchronized (this.b) {
            if (this.b.contains(anrUncaughtListener)) {
                jfj.b("NativeUncaughtCatcher", anrUncaughtListener.getClass().getSimpleName(), "already added");
                return this;
            }
            this.b.add(anrUncaughtListener);
            return this;
        }
    }

    public jeh b(AnrUncaughtListener anrUncaughtListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jeh) ipChange.ipc$dispatch("57197c26", new Object[]{this, anrUncaughtListener});
        }
        if (anrUncaughtListener == null) {
            jfj.a(new IllegalArgumentException("listener is null"));
            return this;
        }
        synchronized (this.b) {
            this.b.remove(anrUncaughtListener);
        }
        return this;
    }

    public jeh a(OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jeh) ipChange.ipc$dispatch("306cc838", new Object[]{this, onFileCreatedListener});
        }
        if (onFileCreatedListener == null) {
            jfj.a(new IllegalArgumentException("listener is null"));
            return this;
        }
        synchronized (this.c) {
            if (this.c.contains(onFileCreatedListener)) {
                jfj.b("NativeUncaughtCatcher", onFileCreatedListener.getClass().getSimpleName(), "already added");
                return this;
            }
            this.c.add(onFileCreatedListener);
            return this;
        }
    }

    public jeh c(OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jeh) ipChange.ipc$dispatch("a558093a", new Object[]{this, onFileCreatedListener});
        }
        if (onFileCreatedListener == null) {
            jfj.a(new IllegalArgumentException("listener is null"));
            return this;
        }
        synchronized (this.c) {
            this.c.remove(onFileCreatedListener);
        }
        return this;
    }

    public jeh b(OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jeh) ipChange.ipc$dispatch("eae268b9", new Object[]{this, onFileCreatedListener});
        }
        if (onFileCreatedListener == null) {
            jfj.a(new IllegalArgumentException("listener is null"));
            return this;
        }
        synchronized (this.d) {
            if (this.d.contains(onFileCreatedListener)) {
                jfj.b("NativeUncaughtCatcher", onFileCreatedListener.getClass().getSimpleName(), "already added");
                return this;
            }
            this.d.add(onFileCreatedListener);
            return this;
        }
    }

    public jeh d(OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jeh) ipChange.ipc$dispatch("5fcda9bb", new Object[]{this, onFileCreatedListener});
        }
        if (onFileCreatedListener == null) {
            jfj.a(new IllegalArgumentException("listener is null"));
            return this;
        }
        synchronized (this.d) {
            this.d.remove(onFileCreatedListener);
        }
        return this;
    }

    public UncaughtCrashHeader c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UncaughtCrashHeader) ipChange.ipc$dispatch("d0470445", new Object[]{this}) : this.f29500a;
    }

    public jeh a(jej jejVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jeh) ipChange.ipc$dispatch("6d132f90", new Object[]{this, jejVar});
        }
        this.e = jejVar;
        return this;
    }

    public jeh b(jej jejVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jeh) ipChange.ipc$dispatch("54b505ef", new Object[]{this, jejVar});
        }
        this.f = jejVar;
        return this;
    }
}
