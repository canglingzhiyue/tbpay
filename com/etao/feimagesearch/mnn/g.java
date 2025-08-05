package com.etao.feimagesearch.mnn;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.ExecutorService;
import tb.kge;

/* loaded from: classes3.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile ExecutorService f6779a;

    static {
        kge.a(801573932);
        f6779a = null;
    }

    private static ExecutorService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("13131fb3", new Object[0]);
        }
        if (f6779a == null) {
            synchronized (g.class) {
                if (f6779a == null) {
                    f6779a = VExecutors.newSingleThreadExecutor(new com.taobao.android.virtual_thread.face.h() { // from class: com.etao.feimagesearch.mnn.g.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.virtual_thread.face.h
                        public String newThreadName() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (String) ipChange2.ipc$dispatch("57dab4a4", new Object[]{this});
                            }
                            return "PltMnnThreadPool_" + hashCode();
                        }
                    });
                }
            }
        }
        return f6779a;
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            a().execute(runnable);
        }
    }
}
