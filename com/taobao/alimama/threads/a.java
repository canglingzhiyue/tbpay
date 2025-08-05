package com.taobao.alimama.threads;

import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes4.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, HandlerThread> f8451a;

    public static Looper a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Looper) ipChange.ipc$dispatch("d8782f3d", new Object[0]) : a("alimama_ads").getLooper();
    }

    static {
        kge.a(1870871414);
        f8451a = new HashMap<>();
    }

    private static HandlerThread a(String str) {
        HandlerThread handlerThread;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("578e15aa", new Object[]{str});
        }
        synchronized (f8451a) {
            handlerThread = f8451a.get(str);
            if (handlerThread != null && handlerThread.getLooper() == null) {
                f8451a.remove(str);
                handlerThread = null;
            }
            if (handlerThread == null) {
                handlerThread = new HandlerThread(str);
                handlerThread.start();
                f8451a.put(str, handlerThread);
            }
        }
        return handlerThread;
    }
}
