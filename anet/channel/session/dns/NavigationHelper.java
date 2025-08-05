package anet.channel.session.dns;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class NavigationHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public interface IBlockingResourceListener {
        void onBlockingScene(int i);
    }

    static {
        kge.a(-188586208);
    }

    public static void setup(IBlockingResourceListener iBlockingResourceListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b7955a1", new Object[]{iBlockingResourceListener});
            return;
        }
        DynamicComponentHandler.setupHomeTableMonitor();
        DynamicComponentHandler.registerBlockingResourceListener(iBlockingResourceListener);
    }
}
