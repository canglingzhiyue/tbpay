package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Random;

/* loaded from: classes2.dex */
public class apx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-432387211);
    }

    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int nanoTime = (int) System.nanoTime();
        int nextInt = new Random().nextInt();
        int nextInt2 = new Random().nextInt();
        byte[] a2 = app.a(currentTimeMillis);
        byte[] a3 = app.a(nanoTime);
        byte[] a4 = app.a(nextInt);
        byte[] a5 = app.a(nextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(a2, 0, bArr, 0, 4);
        System.arraycopy(a3, 0, bArr, 4, 4);
        System.arraycopy(a4, 0, bArr, 8, 4);
        System.arraycopy(a5, 0, bArr, 12, 4);
        return api.c(bArr);
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        String c = apw.c(context);
        return aqc.e(c) ? a() : c;
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        String d = apw.d(context);
        return aqc.e(d) ? a() : d;
    }
}
