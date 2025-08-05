package tb;

import android.net.Uri;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes.dex */
public class kac {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<Uri, kae> f29903a;
    private static final HashMap<IBinder, kad> b;

    static {
        kge.a(1482479329);
        f29903a = new HashMap<>();
        b = new HashMap<>();
    }

    public static synchronized kad a(IBinder iBinder) {
        synchronized (kac.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kad) ipChange.ipc$dispatch("c19938c9", new Object[]{iBinder});
            }
            kad kadVar = b.get(iBinder);
            if (kadVar == null) {
                kadVar = new kaf(iBinder);
                b.put(iBinder, kadVar);
            }
            return kadVar;
        }
    }

    public static synchronized kae a(Uri uri) {
        synchronized (kac.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kae) ipChange.ipc$dispatch("a11e63d8", new Object[]{uri});
            }
            kae kaeVar = f29903a.get(uri);
            if (kaeVar == null) {
                kaeVar = new kai(uri);
                f29903a.put(uri, kaeVar);
            }
            return kaeVar;
        }
    }
}
