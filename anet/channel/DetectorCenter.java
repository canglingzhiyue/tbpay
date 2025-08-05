package anet.channel;

import anet.channel.detect.HttpStrategyDetector;
import anet.channel.detect.Ipv6Detector;
import anet.channel.quic.Http3ConnectionDetector;
import anet.channel.util.Inet64Util;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class DetectorCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static AtomicBoolean isInit;

    static {
        kge.a(-1075937222);
        isInit = new AtomicBoolean(false);
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (!isInit.compareAndSet(false, true)) {
        } else {
            if (GlobalAppRuntimeInfo.isTargetProcess()) {
                if (AwcnConfig.isDetectCenterEnable()) {
                    Http3ConnectionDetector.registerListener();
                }
                if (AwcnConfig.isHttpDetectEnable()) {
                    HttpStrategyDetector.init();
                }
            }
            Ipv6Detector.registerListener();
            Inet64Util.registerListener();
        }
    }
}
