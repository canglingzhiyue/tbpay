package com.taobao.message.notification.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import java.util.concurrent.ExecutorService;
import tb.kge;

/* loaded from: classes7.dex */
public class ThreadPoolUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final ExecutorService executor;

    static {
        kge.a(-1793198772);
        executor = VExecutors.newSingleThreadExecutor(new h() { // from class: com.taobao.message.notification.util.ThreadPoolUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.virtual_thread.face.h
            public String newThreadName() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this}) : "MSG-Notification";
            }
        });
    }

    public static void doAsyncTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b364515b", new Object[]{runnable});
        } else {
            executor.submit(runnable);
        }
    }
}
