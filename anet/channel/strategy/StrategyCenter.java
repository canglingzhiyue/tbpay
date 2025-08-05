package anet.channel.strategy;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class StrategyCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile IStrategyInstance instance;

    static {
        kge.a(-684434843);
        instance = null;
    }

    public static IStrategyInstance getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IStrategyInstance) ipChange.ipc$dispatch("e1b855ef", new Object[0]);
        }
        if (instance == null) {
            synchronized (StrategyCenter.class) {
                if (instance == null) {
                    instance = new StrategyInstance();
                }
            }
        }
        return instance;
    }

    public static void setInstance(IStrategyInstance iStrategyInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7b1be0f", new Object[]{iStrategyInstance});
        } else {
            instance = iStrategyInstance;
        }
    }

    private StrategyCenter() {
    }
}
