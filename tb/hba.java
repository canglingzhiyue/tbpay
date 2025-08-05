package tb;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.animate.b;
import java.util.concurrent.Future;
import tb.hcp;

/* loaded from: classes5.dex */
public abstract class hba<T, S extends hcp> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Handler f28565a = new Handler(Looper.getMainLooper());
    private hba<T, S>.a b;
    private Future<?> c;

    static {
        kge.a(2119659544);
    }

    public abstract BitmapDrawable a(T t, Context context);

    public abstract String a(T t);

    public void a(T t, S s) {
        Future<?> future;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dac6f9bf", new Object[]{this, t, s});
            return;
        }
        if (this.b != null && (future = this.c) != null) {
            future.cancel(true);
            this.f28565a.removeCallbacksAndMessages(null);
            this.b = null;
            this.c = null;
        }
        if (b(t, s)) {
            return;
        }
        d(t, s);
    }

    public boolean b(T t, S s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efafc204", new Object[]{this, t, s})).booleanValue();
        }
        ImageView c = s.c();
        a(c);
        BitmapDrawable a2 = a(a((hba<T, S>) t));
        boolean z = (a2 == null || a2.getBitmap() == null || a2.getBitmap().isRecycled()) ? false : true;
        if (!(a2 instanceof b) && !z) {
            return false;
        }
        c.setImageDrawable(a2);
        return true;
    }

    public void a(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83f7c622", new Object[]{this, imageView});
        } else {
            imageView.setImageDrawable(new ColorDrawable(-16777216));
        }
    }

    public void a(String str, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc1cd0a7", new Object[]{this, str, bitmapDrawable});
        } else {
            hbd.sDrawableCache.put(str, bitmapDrawable);
        }
    }

    public BitmapDrawable a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BitmapDrawable) ipChange.ipc$dispatch("7ba0d799", new Object[]{this, str}) : hbd.sDrawableCache.get(str);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : hbd.a();
    }

    public void c(T t, final S s) {
        final BitmapDrawable a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4988a41", new Object[]{this, t, s});
            return;
        }
        BitmapDrawable a3 = a(a((hba<T, S>) t));
        if ((a3 != null && a3.getBitmap() != null && !a3.getBitmap().isRecycled()) || (a2 = a((hba<T, S>) t, s.c().getContext())) == null) {
            return;
        }
        if (a()) {
            a(a((hba<T, S>) t), a2);
        }
        this.f28565a.post(new Runnable() { // from class: tb.hba.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    s.c().setImageDrawable(a2);
                }
            }
        });
    }

    private void d(T t, S s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19815282", new Object[]{this, t, s});
            return;
        }
        this.b = new a(t, s);
        try {
            this.c = hbd.sThreadPool.submit(this.b);
        } catch (Throwable unused) {
        }
    }

    /* loaded from: classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private T b;
        private S c;

        static {
            kge.a(-499947424);
            kge.a(-1390502639);
        }

        public a(T t, S s) {
            this.b = t;
            this.c = s;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (Thread.interrupted()) {
            } else {
                hba.this.c(this.b, this.c);
            }
        }
    }
}
