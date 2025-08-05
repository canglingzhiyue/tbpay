package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class cfu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static boolean a(Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2864fb53", new Object[]{intent, new Boolean(z)})).booleanValue();
        }
        return false;
    }

    public static void a(Context context, cft cftVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("756d4cbf", new Object[]{context, cftVar});
        } else {
            cfv.a().a(context, cftVar);
        }
    }

    public static synchronized void a(Context context, int i, cga cgaVar) {
        synchronized (cfu.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8380476", new Object[]{context, new Integer(i), cgaVar});
            } else if (context == null) {
            } else {
                cfv.a().a(cgaVar);
                a(context, cfx.a().b(), i);
            }
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            cfv.a().a(str);
        }
    }

    private static void a(Context context, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f702a86", new Object[]{context, intent, new Integer(i)});
        } else if (b(context, intent, i) || b(context, a(context), i) || b(context, a(), i) || cfv.a().b() == null) {
        } else {
            cga b = cfv.a().b();
            b.a(new Exception("cann't start activity with intent：" + a().toString()), a());
        }
    }

    private static Intent a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("41646cb3", new Object[]{context});
        }
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        return intent;
    }

    private static Intent a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("fdb8dbab", new Object[0]) : new Intent("android.settings.SETTINGS");
    }

    private static boolean b(Context context, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58c47fcb", new Object[]{context, intent, new Integer(i)})).booleanValue();
        }
        if (context == null || intent == null) {
            return false;
        }
        if (!cgb.a(intent)) {
            return a(intent, false);
        }
        try {
            cfv.a().c().a(context, intent, i);
            return a(intent);
        } catch (Exception e) {
            e.printStackTrace();
            return a(intent, true);
        }
    }

    private static boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{intent})).booleanValue();
        }
        if (cfv.a().b() != null) {
            cfv.a().b().a(intent);
        }
        return true;
    }
}
