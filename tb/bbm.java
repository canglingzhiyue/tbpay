package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class bbm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static WeakReference<Handler> f25749a;

    static {
        kge.a(-1429533310);
    }

    public static void a(final Context context, final CharSequence charSequence, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156f6a7f", new Object[]{context, charSequence, new Integer(i)});
        } else if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            Toast.makeText(context, charSequence, i).show();
        } else {
            a().post(new Runnable() { // from class: tb.bbm.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(context, charSequence, i).show();
                    }
                }
            });
        }
    }

    private static Handler a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("b016d95e", new Object[0]);
        }
        WeakReference<Handler> weakReference = f25749a;
        if (weakReference == null) {
            return b();
        }
        Handler handler = weakReference.get();
        return handler == null ? b() : handler;
    }

    private static Handler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("ac18683d", new Object[0]);
        }
        Handler handler = new Handler(Looper.getMainLooper());
        f25749a = new WeakReference<>(handler);
        return handler;
    }
}
