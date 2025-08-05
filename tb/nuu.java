package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public final class nuu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final nuu INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, ntg> f31777a;

    static {
        kge.a(1779532390);
        INSTANCE = new nuu();
        f31777a = new HashMap<>();
    }

    private nuu() {
    }

    public final void a(String channelSrp, ntg tabPromotionBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36c6f1a1", new Object[]{this, channelSrp, tabPromotionBean});
            return;
        }
        q.c(channelSrp, "channelSrp");
        q.c(tabPromotionBean, "tabPromotionBean");
        f31777a.put(channelSrp, tabPromotionBean);
    }

    public final ntg a(String channelSrp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntg) ipChange.ipc$dispatch("7c730ed3", new Object[]{this, channelSrp});
        }
        q.c(channelSrp, "channelSrp");
        return f31777a.get(channelSrp);
    }

    public final void b(String channelSrp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, channelSrp});
            return;
        }
        q.c(channelSrp, "channelSrp");
        f31777a.remove(channelSrp);
    }
}
