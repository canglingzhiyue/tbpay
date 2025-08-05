package com.taobao.taobaoavsdk.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ExecutorService f21342a;

    static {
        kge.a(-1262365934);
        f21342a = null;
    }

    public static ExecutorService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("13131fb3", new Object[0]);
        }
        ExecutorService executorService = f21342a;
        return executorService == null ? b() : executorService;
    }

    public static ExecutorService b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("1a7854d2", new Object[0]);
        }
        ExecutorService a2 = a(16, new com.taobao.android.virtual_thread.face.h() { // from class: com.taobao.taobaoavsdk.util.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.virtual_thread.face.h
            public String newThreadName() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("57dab4a4", new Object[]{this}) : "avsdk_common_thread_pool";
            }
        });
        f21342a = a2;
        return a2;
    }

    public static ExecutorService a(int i, com.taobao.android.virtual_thread.face.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("6b787f45", new Object[]{new Integer(i), hVar});
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) VExecutors.newFixedThreadPool(i, hVar);
        threadPoolExecutor.setKeepAliveTime(3L, TimeUnit.SECONDS);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static ExecutorService a(com.taobao.android.virtual_thread.face.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("facb3ad8", new Object[]{hVar});
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) VExecutors.newSingleThreadExecutor(hVar);
        threadPoolExecutor.setKeepAliveTime(3L, TimeUnit.SECONDS);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
