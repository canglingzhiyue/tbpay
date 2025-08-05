package com.etao.feimagesearch.album;

import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HandlerThread b;

    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final f f6495a;

        static {
            kge.a(-613513117);
            f6495a = new f();
        }

        public static /* synthetic */ f a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("544aac6", new Object[0]) : f6495a;
        }
    }

    static {
        kge.a(1418916333);
    }

    private f() {
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("544aac6", new Object[0]) : a.a();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        HandlerThread handlerThread = this.b;
        if (handlerThread == null) {
            return;
        }
        handlerThread.quitSafely();
        this.b = null;
    }
}
