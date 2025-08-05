package anet.channel.detect;

import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class NetworkDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.NetworkDetector";
    private static ExceptionDetector exceptionDetector;
    private static HorseRaceDetector horseRaceDetector;
    private static AtomicBoolean isInit;
    private static MTUDetector mtuDetector;
    private static RTTDetector rttDetector;

    /* loaded from: classes2.dex */
    public interface INetworkDiagnosisCallback {
        void onNetworkDiagnosisFinished(JSONObject jSONObject);
    }

    static {
        kge.a(-1939915289);
        horseRaceDetector = new HorseRaceDetector();
        exceptionDetector = new ExceptionDetector();
        mtuDetector = new MTUDetector();
        isInit = new AtomicBoolean(false);
        rttDetector = new RTTDetector();
    }

    public static void registerListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[0]);
            return;
        }
        try {
            if (!isInit.compareAndSet(false, true)) {
                return;
            }
            ALog.i(TAG, "registerListener", null, new Object[0]);
            horseRaceDetector.register();
            exceptionDetector.register();
            mtuDetector.register();
            rttDetector.register();
        } catch (Exception e) {
            ALog.e(TAG, "[registerListener]error", null, e, new Object[0]);
        }
    }

    public static void commitDetect(RequestStatistic requestStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f95087", new Object[]{requestStatistic});
        } else if (!isInit.get()) {
        } else {
            exceptionDetector.commitDetect(requestStatistic);
        }
    }

    public static void startNetworkDiagnosis(INetworkDiagnosisCallback iNetworkDiagnosisCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d8af661", new Object[]{iNetworkDiagnosisCallback});
        } else {
            exceptionDetector.startNetworkDiagnosis(iNetworkDiagnosisCallback);
        }
    }

    public static int getAvailableMTU() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27ce1195", new Object[0])).intValue();
        }
        int availableMTU = mtuDetector.getAvailableMTU();
        int availableMTU2 = exceptionDetector.getAvailableMTU();
        if (availableMTU > 0 && availableMTU2 > 0) {
            return Math.min(availableMTU, availableMTU2);
        }
        return availableMTU > 0 ? availableMTU : availableMTU2;
    }

    public static IRTTDetector getRTTDetector() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IRTTDetector) ipChange.ipc$dispatch("fe9c3dc0", new Object[0]) : rttDetector;
    }
}
