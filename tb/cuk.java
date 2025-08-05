package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class cuk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile cuk f26539a;
    private final Handler b = new Handler(Looper.getMainLooper());

    static {
        kge.a(57191515);
    }

    public static /* synthetic */ void a(cuk cukVar, Context context, CharSequence charSequence, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0acd68d", new Object[]{cukVar, context, charSequence, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            cukVar.a(context, charSequence, i, i2, i3, i4);
        }
    }

    private cuk() {
    }

    public static cuk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cuk) ipChange.ipc$dispatch("f036a05", new Object[0]);
        }
        if (f26539a == null) {
            synchronized (cuk.class) {
                if (f26539a == null) {
                    f26539a = new cuk();
                }
            }
        }
        return f26539a;
    }

    public static void a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5110219", new Object[]{context, str, new Integer(i)});
        } else {
            a().a(context, str, i, 17, 0, 0);
        }
    }

    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else {
            a(context, str, 0, 17, 0, 0);
        }
    }

    public void b(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49a9c1a", new Object[]{this, context, str, new Integer(i)});
        } else {
            a(context, str, i, 17, 0, 0);
        }
    }

    private void a(final Context context, final CharSequence charSequence, final int i, final int i2, final int i3, final int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72582fc4", new Object[]{this, context, charSequence, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            Toast makeText = Toast.makeText(context, charSequence, i);
            makeText.setGravity(i2, i3, i4);
            makeText.show();
        } else {
            this.b.post(new Runnable() { // from class: tb.cuk.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        cuk.a(cuk.this, context, charSequence, i, i2, i3, i4);
                    }
                }
            });
        }
    }
}
