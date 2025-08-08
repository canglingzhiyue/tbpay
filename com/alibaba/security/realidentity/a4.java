package com.alibaba.security.realidentity;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.initialize.IInitializeComponent;
import com.alibaba.wireless.security.open.securitybody.ISecurityBodyComponent;
import com.alibaba.wireless.security.open.staticdatastore.IStaticDataStoreComponent;
import com.alibaba.wireless.security.open.umid.IUMIDComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class a4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String f = "SecurityGuardManager";

    /* renamed from: a  reason: collision with root package name */
    public RPEnv f3358a = RPEnv.ONLINE;
    public Context b;
    public String c;
    public c4 d;
    public final ThreadPoolExecutor e;

    /* loaded from: classes3.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "rpsdk-sg-data-process");
        }
    }

    /* loaded from: classes3.dex */
    public class b implements IInitializeComponent.IInitFinishListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.alibaba.wireless.security.open.initialize.IInitializeComponent.IInitFinishListener
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
            } else {
                a4.this.a("", "security guard initialize error");
            }
        }

        @Override // com.alibaba.wireless.security.open.initialize.IInitializeComponent.IInitFinishListener
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3361a;
        public final /* synthetic */ CountDownLatch b;

        public c(String str, CountDownLatch countDownLatch) {
            this.f3361a = str;
            this.b = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                IUMIDComponent uMIDComp = a4.this.a(a4.this.b).getUMIDComp();
                if (uMIDComp == null) {
                    a4.this.a(this.f3361a, "getUmidToken umidComponent is null");
                    this.b.countDown();
                    return;
                }
                int a2 = a4.a(a4.this);
                uMIDComp.initUMIDSync(a2);
                a4.a(a4.this, uMIDComp.getSecurityToken(a2));
                this.b.countDown();
            } catch (Throwable th) {
                a4.a(a4.this, th);
                a4.this.a(this.f3361a, "getSgDataStoreComponent fail", th);
            }
        }
    }

    public a4(c4 c4Var) {
        this.d = c4Var;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a());
        this.e = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ int a(a4 a4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a250a0f2", new Object[]{a4Var})).intValue() : a4Var.c();
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public abstract String b();

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        this.b = context;
        try {
            if (!a()) {
                return;
            }
            IInitializeComponent initializer = SecurityGuardManager.getInitializer();
            initializer.registerInitFinishListener(new b());
            initializer.initializeAsync(context.getApplicationContext());
        } catch (Throwable th) {
            a("", "security guard initialize fail", th);
            a(th);
        }
    }

    public String c(String str) {
        IStaticDataStoreComponent staticDataStoreComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        try {
            if (!a() || (staticDataStoreComp = a(this.b).getStaticDataStoreComp()) == null) {
                return null;
            }
            return staticDataStoreComp.getAppKeyByIndex(0, b());
        } catch (Throwable th) {
            a(str, "getSgMd5AppKey fail", th);
            a(th);
            return null;
        }
    }

    public String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str});
        }
        try {
            if (a()) {
                return ((ISecurityBodyComponent) SecurityGuardManager.getInstance(this.b).getInterface(ISecurityBodyComponent.class)).getSecurityBodyDataEx(null, null, "", null, 4, 0);
            }
            return null;
        } catch (Throwable th) {
            a(th);
            a(str, "getWuaToken fail", th);
            return null;
        }
    }

    public String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{this, str});
        }
        if (!a()) {
            return null;
        }
        if (!StringUtils.isEmpty(this.c)) {
            return this.c;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.e.execute(new c(str, countDownLatch));
        try {
            countDownLatch.await(2L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            a(str, "Sg countDownLatch await failed", th);
        }
        return this.c;
    }

    public void f(String str) {
        SecurityGuardManager a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        try {
            if (!a() || (a2 = a(this.b)) == null) {
                return;
            }
            ((ISecurityBodyComponent) a2.getInterface(ISecurityBodyComponent.class)).leaveRiskScene(2);
        } catch (Throwable th) {
            a(str, "security guard leave fail", th);
            a(th);
        }
    }

    public static /* synthetic */ String a(a4 a4Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b4cdeb7", new Object[]{a4Var, str});
        }
        a4Var.c = str;
        return str;
    }

    public static /* synthetic */ void a(a4 a4Var, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98003856", new Object[]{a4Var, th});
        } else {
            a4Var.a(th);
        }
    }

    public Pair<Boolean, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c2e055fc", new Object[]{this, str});
        }
        try {
            if (!a()) {
                return new Pair<>(Boolean.FALSE, "v1 signature not found");
            }
            if (((ISecurityBodyComponent) a(this.b).getInterface(ISecurityBodyComponent.class)).enterRiskScene(2, null)) {
                return new Pair<>(Boolean.TRUE, "");
            }
            return new Pair<>(Boolean.FALSE, "SecurityGuard enter risk scene failed");
        } catch (Throwable th) {
            a(str, "security guard enter fail", th);
            a(th);
            if (th instanceof SecException) {
                Boolean bool = Boolean.FALSE;
                return new Pair<>(bool, "SecurityGuard enter risk scene exception, error code is: " + th.getErrorCode());
            }
            Boolean bool2 = Boolean.FALSE;
            return new Pair<>(bool2, "SecurityGuard enter risk scene exception, error code is: " + d.b(th));
        }
    }

    private int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        RPEnv rPEnv = this.f3358a;
        if (rPEnv == RPEnv.DAILY) {
            return 2;
        }
        if (rPEnv == RPEnv.PRE) {
            return 1;
        }
        RPEnv rPEnv2 = RPEnv.ONLINE;
        return 0;
    }

    private void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
            return;
        }
        com.alibaba.security.realidentity.a.a(f, "看到该日志，说明接入的图片yw_1222_" + b() + "存在问题。图片错误码：", th);
    }

    public SecurityGuardManager a(Context context) throws Throwable {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SecurityGuardManager) ipChange.ipc$dispatch("520a62a3", new Object[]{this, context}) : SecurityGuardManager.getInstance(context, b());
    }

    public void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{this, str, str2, th});
            return;
        }
        TrackLog createSdkExceptionLog = TrackLog.createSdkExceptionLog(str2, d.b(th), "");
        createSdkExceptionLog.setCode(-1);
        c4 c4Var = this.d;
        if (c4Var == null) {
            return;
        }
        c4Var.a(str, createSdkExceptionLog);
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        try {
            if (a()) {
                return ((ISecurityBodyComponent) a(this.b).getInterface(ISecurityBodyComponent.class)).getSecurityBodyDataEx(null, null, null, null, 8, 4);
            }
            return null;
        } catch (Throwable th) {
            a(th);
            a(str, "getMiniWuaToken fail", th);
            return null;
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        TrackLog createSdkExceptionLog = TrackLog.createSdkExceptionLog(str2, "", "");
        createSdkExceptionLog.setCode(-1);
        c4 c4Var = this.d;
        if (c4Var == null) {
            return;
        }
        c4Var.a(str, createSdkExceptionLog);
    }

    public void a(RPEnv rPEnv) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cc85f4f", new Object[]{this, rPEnv});
            return;
        }
        this.f3358a = rPEnv;
        this.c = null;
    }
}
