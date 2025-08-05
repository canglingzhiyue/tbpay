package tb;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Looper;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class fxo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private LruCache<String, Typeface> f28194a;

    /* loaded from: classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final fxo f28196a;

        static {
            kge.a(-1324177826);
            f28196a = new fxo();
        }

        public static /* synthetic */ fxo a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (fxo) ipChange.ipc$dispatch("f04d2e1", new Object[0]) : f28196a;
        }
    }

    static {
        kge.a(-2054851701);
    }

    public static /* synthetic */ LruCache a(fxo fxoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LruCache) ipChange.ipc$dispatch("41a3a04c", new Object[]{fxoVar}) : fxoVar.f28194a;
    }

    private fxo() {
        this.f28194a = null;
        this.f28194a = new LruCache<>(5);
    }

    public static final fxo a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fxo) ipChange.ipc$dispatch("f04d2e1", new Object[0]) : b.a();
    }

    public Typeface a(String str, int i) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("490ec9c7", new Object[]{this, str, new Integer(i)});
        }
        String str2 = str + i;
        Typeface typeface = this.f28194a.get(str2);
        if (typeface != null) {
            return typeface;
        }
        if (Build.VERSION.SDK_INT > 28) {
            Typeface create = Typeface.create(Typeface.createFromAsset(DinamicXEngine.i().getAssets(), str), i);
            this.f28194a.put(str2, create);
            return create;
        } else if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
            Typeface create2 = Typeface.create(Typeface.createFromAsset(DinamicXEngine.i().getAssets(), str), i);
            this.f28194a.put(str2, create2);
            return create2;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            a aVar = new a(countDownLatch, str, i, str2);
            fxe.c(aVar);
            countDownLatch.await(2L, TimeUnit.SECONDS);
            return aVar.b;
        }
    }

    /* loaded from: classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public CountDownLatch f28195a;
        public Typeface b;
        public String c;
        public int d;
        public String f;

        static {
            kge.a(798927141);
            kge.a(-1390502639);
        }

        public a(CountDownLatch countDownLatch, String str, int i, String str2) {
            this.f28195a = countDownLatch;
            this.c = str;
            this.d = i;
            this.f = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.b = Typeface.create(Typeface.createFromAsset(DinamicXEngine.i().getAssets(), this.c), this.d);
                fxo.a(fxo.this).put(this.f, this.b);
            } catch (Throwable th) {
                try {
                    com.taobao.android.dinamicx.exception.a.b(th);
                } finally {
                    this.f28195a.countDown();
                }
            }
        }
    }

    public Typeface a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("1cc9554f", new Object[]{this, new Integer(i), new Boolean(z)});
        }
        String str = "default" + i + z;
        Typeface typeface = this.f28194a.get(str);
        if (typeface != null) {
            return typeface;
        }
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        Typeface create = Typeface.create(null, i, z);
        this.f28194a.put(str, create);
        return create;
    }
}
