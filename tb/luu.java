package tb;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.c;
import com.taobao.android.task.Coordinator;

/* loaded from: classes7.dex */
public class luu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f30929a;

    static {
        kge.a(-750901683);
    }

    public static /* synthetic */ String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        f30929a = str;
        return str;
    }

    public static /* synthetic */ String b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("31400281", new Object[]{context}) : c(context);
    }

    public static String a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (!TextUtils.isEmpty(f30929a)) {
            return f30929a;
        }
        String a2 = c.a.a("InfoFlow_OAID", "oaid", (String) null);
        if (!TextUtils.isEmpty(a2)) {
            f30929a = a2;
            return a2;
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            Coordinator.execute(new Runnable() { // from class: tb.luu.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        luu.a(luu.b(context));
                    }
                }
            });
        } else {
            f30929a = c(context);
        }
        return f30929a;
    }

    private static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context});
        }
        String a2 = bzj.a(context);
        c.a.b("InfoFlow_OAID", "oaid", a2);
        return a2;
    }
}
