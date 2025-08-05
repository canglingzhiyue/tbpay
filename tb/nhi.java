package tb;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class nhi implements nfu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, nft> f31469a;

    static {
        kge.a(-845076925);
        kge.a(-440858611);
        f31469a = new ConcurrentHashMap();
    }

    private nft a(Uri uri) {
        nft nftVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nft) ipChange.ipc$dispatch("a11fd58b", new Object[]{this, uri});
        }
        String a2 = nhh.a(uri);
        if (f31469a.containsKey(a2)) {
            return f31469a.get(a2);
        }
        synchronized (nhi.class) {
            if (!f31469a.containsKey(a2)) {
                nhh nhhVar = new nhh(uri);
                f31469a.put(a2, nhhVar);
                nftVar = nhhVar;
            } else {
                nftVar = f31469a.get(a2);
            }
        }
        return nftVar;
    }

    @Override // tb.nfu
    public nft a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nft) ipChange.ipc$dispatch("7c72dbd8", new Object[]{this, str}) : a(Uri.parse(str));
    }
}
