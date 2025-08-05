package com.alibaba.triver.triver_shop.newShop.data;

import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import kotlin.jvm.internal.q;
import tb.ceg;
import tb.kge;

/* loaded from: classes3.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final e INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<Long, Bundle> f3830a;
    private static final HashMap<Long, Intent> b;

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3831a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f3831a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            throw new Exception(q.a(this.f3831a, (Object) this.b));
        }
    }

    private e() {
    }

    static {
        kge.a(-1037593183);
        INSTANCE = new e();
        f3830a = new HashMap<>();
        b = new HashMap<>();
    }

    public final HashMap<Long, Intent> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("52df8a4d", new Object[]{this}) : b;
    }

    public final void a(long j, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dfd77f8", new Object[]{this, new Long(j), bundle});
            return;
        }
        q.d(bundle, "bundle");
        b();
        f3830a.put(Long.valueOf(j), bundle);
        com.alibaba.triver.triver_shop.newShop.ext.b.a(new ShopStartActivityData$setBundleData$1(j, bundle), 10000L);
    }

    public final Bundle a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("b875520", new Object[]{this, new Long(j)});
        }
        b();
        return f3830a.get(Long.valueOf(j));
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!com.alibaba.triver.triver_shop.newShop.ext.b.a()) {
        } else {
            ceg.Companion.b("you should call ShopStartActivityData setBundleData in MainThread !!! \n");
            new Thread(new a("you should call ShopStartActivityData setBundleData in MainThread !!! \n", new Exception().getStackTrace().toString())).start();
        }
    }
}
