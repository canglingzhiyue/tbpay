package com.taobao.android.detail.wrapper.ext.event.subscriber.sku;

import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class b implements j<com.taobao.android.detail.wrapper.ext.event.subscriber.sku.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f11293a;
    private volatile a b;
    private Handler c = new Handler(Looper.getMainLooper());

    static {
        kge.a(-840895118);
        kge.a(-1453870097);
    }

    public static /* synthetic */ a a(b bVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3e15ea92", new Object[]{bVar, aVar});
        }
        bVar.b = aVar;
        return aVar;
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(com.taobao.android.detail.wrapper.ext.event.subscriber.sku.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, aVar}) : a(aVar);
    }

    public b(DetailCoreActivity detailCoreActivity) {
        this.f11293a = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.sku.CheckSkuPvSubscriber");
    }

    public i a(com.taobao.android.detail.wrapper.ext.event.subscriber.sku.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("b37e9e4a", new Object[]{this, aVar});
        }
        if (aVar == null) {
            return i.FAILURE;
        }
        DetailCoreActivity detailCoreActivity = this.f11293a;
        if (!(detailCoreActivity instanceof DetailActivity)) {
            return i.FAILURE;
        }
        DetailActivity detailActivity = (DetailActivity) detailCoreActivity;
        if (detailActivity.v == null) {
            return i.FAILURE;
        }
        if (aVar.c()) {
            detailActivity.v.c();
            detailActivity.v.h();
        }
        String b = aVar.b();
        String a2 = aVar.a();
        if (this.b != null) {
            this.b.a();
        }
        this.f11293a.f(true);
        a aVar2 = new a(detailActivity.v);
        if (!StringUtils.isEmpty(b)) {
            aVar2.a(1, b);
        } else if (!StringUtils.isEmpty(a2)) {
            aVar2.a(2, a2);
        }
        this.b = aVar2;
        this.c.post(aVar2);
        return i.SUCCESS;
    }

    /* loaded from: classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private volatile boolean b;
        private volatile boolean c;
        private com.taobao.android.detail.wrapper.newsku.a d;
        private String e;
        private int f;

        static {
            kge.a(376407797);
            kge.a(-1390502639);
        }

        public a(com.taobao.android.detail.wrapper.newsku.a aVar) {
            this.d = aVar;
        }

        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                return;
            }
            this.f = i;
            this.e = str;
            if (StringUtils.isEmpty(str)) {
                return;
            }
            this.c = true;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.b = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            com.taobao.android.detail.wrapper.newsku.a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            b.a(b.this, null);
            if (this.b || !this.c) {
                return;
            }
            int i = this.f;
            if (i != 1) {
                if (i != 2 || (aVar = this.d) == null) {
                    return;
                }
                aVar.c(this.e);
                return;
            }
            com.taobao.android.detail.wrapper.newsku.a aVar2 = this.d;
            if (aVar2 == null) {
                return;
            }
            aVar2.d(this.e);
        }
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
