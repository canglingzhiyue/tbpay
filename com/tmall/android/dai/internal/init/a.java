package com.tmall.android.dai.internal.init;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.util.b;
import java.util.concurrent.ExecutorService;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f23695a;

    /* renamed from: com.tmall.android.dai.internal.init.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C1030a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final a f23696a;

        static {
            kge.a(346895598);
            f23696a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("622de91d", new Object[0]) : f23696a;
        }
    }

    static {
        kge.a(-1375939236);
    }

    private a() {
        this.f23695a = b.b().a();
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("622de91d", new Object[0]) : C1030a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            WalleInitBridgeJava.a().nativeInitWalle();
        }
    }

    public synchronized boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        this.f23695a.execute($$Lambda$a$GtJaqKAsAjFv_qzG87H172OZzwo.INSTANCE);
        return true;
    }
}
