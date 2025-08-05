package com.taobao.themis.inside.Initializer.kernel;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.utils.t;
import com.taobao.themis.kernel.utils.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.kge;
import tb.qpt;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TMSInitializer:TMSInitTaskScheduler";

    /* renamed from: a  reason: collision with root package name */
    private List<a> f22420a = new ArrayList();
    private String b;

    /* renamed from: com.taobao.themis.inside.Initializer.kernel.b$3  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22423a = new int[TMSInitTaskExecutorType.values().length];

        static {
            try {
                f22423a[TMSInitTaskExecutorType.SYNC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22423a[TMSInitTaskExecutorType.IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        kge.a(82312692);
    }

    public b(String str) {
        this.b = str;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("297428e0", new Object[]{this, aVar});
        } else {
            this.f22420a.add(aVar);
        }
    }

    public void a(final Application application, final HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        TMSLogger.d(TAG, "\nInit task Scheduler start execute: " + this.b + "\n");
        v b = t.b(application.getApplicationContext(), "pauseAndRestartInitTask");
        for (final a aVar : this.f22420a) {
            if (aVar.e() && b.b()) {
                return;
            }
            int i = AnonymousClass3.f22423a[aVar.a().ordinal()];
            if (i == 1) {
                aVar.a(application, hashMap);
            } else if (i == 2) {
                ((IExecutorService) qpt.a(IExecutorService.class)).getExecutor(ExecutorType.IDLE).execute(new Runnable() { // from class: com.taobao.themis.inside.Initializer.kernel.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            aVar.a(application, hashMap);
                        }
                    }
                });
            } else {
                ((IExecutorService) qpt.a(IExecutorService.class)).getExecutor(ExecutorType.NORMAL).execute(new Runnable() { // from class: com.taobao.themis.inside.Initializer.kernel.b.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            aVar.a(application, hashMap);
                        }
                    }
                });
            }
        }
    }
}
