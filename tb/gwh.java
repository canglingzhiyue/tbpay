package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.v4.util.Pools;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class gwh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static HashMap<Context, Pools.SimplePool<TBVideoComponent.PlayerCoverView>> c;

    static {
        kge.a(-1116043219);
        c = new HashMap<>();
    }

    public static TBVideoComponent.PlayerCoverView a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBVideoComponent.PlayerCoverView) ipChange.ipc$dispatch("4d7056cf", new Object[]{context});
        }
        TBVideoComponent.PlayerCoverView playerCoverView = null;
        Pools.SimplePool<TBVideoComponent.PlayerCoverView> simplePool = c.get(context);
        if (simplePool != null) {
            playerCoverView = simplePool.acquire();
        }
        if (playerCoverView == null) {
            playerCoverView = new TBVideoComponent.PlayerCoverView(context);
        }
        playerCoverView.setInCachePool(false);
        return playerCoverView;
    }

    public static void a(TBVideoComponent.PlayerCoverView playerCoverView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac6fa917", new Object[]{playerCoverView});
        } else if (playerCoverView == null) {
        } else {
            playerCoverView.setPlayIcon(null, null, 0, 0);
            ogu.a((View) playerCoverView);
            if (Build.VERSION.SDK_INT >= 21) {
                playerCoverView.setElevation(0.0f);
            }
            Context context = playerCoverView.getContext();
            if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
                return;
            }
            Pools.SimplePool<TBVideoComponent.PlayerCoverView> simplePool = c.get(context);
            if (simplePool == null) {
                simplePool = new Pools.SynchronizedPool<>(32);
                c.put(playerCoverView.getContext(), simplePool);
            }
            simplePool.release(playerCoverView);
            playerCoverView.setInCachePool(true);
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else {
            c.remove(context);
        }
    }
}
