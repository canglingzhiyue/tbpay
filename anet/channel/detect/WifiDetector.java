package anet.channel.detect;

import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class WifiDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FAILED = 0;
    public static final int SUCCESS = 1;
    private static final String TAG = "awcn.WifiDetector";
    public static final int UNKNOWN = -1;
    public static DetectHistoryRecord detectWifiFgHistoryRecord;

    static {
        kge.a(1187895560);
    }

    public static boolean isForceCell(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b64ac002", new Object[]{str, str2})).booleanValue();
        }
        if (!AwcnConfig.isWifiUnavailableUseCellOptOpened() || !AwcnConfig.isHostInWifiFgForceCellWhiteList(str) || GlobalAppRuntimeInfo.isAppBackground() || !NetworkStatusHelper.getStatus().isWifi() || NetworkStatusHelper.getCellularNetwork() == null || detectWifiFgStatus(str2) != 0) {
            return false;
        }
        ALog.e(TAG, "[wifi fg detect opt][DetectOpt] isForceCell true", str2, new Object[0]);
        return true;
    }

    public static int detectWifiFgStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c44fb0cf", new Object[]{str})).intValue();
        }
        if (detectWifiFgHistoryRecord == null) {
            return -1;
        }
        String uniqueId = NetworkStatusHelper.getUniqueId(NetworkStatusHelper.getStatus());
        int detectStatus = detectWifiFgHistoryRecord.detectStatus(uniqueId);
        if (detectStatus == 0) {
            ALog.e(TAG, "[wifi fg detect opt][DetectOpt] detectWifiFgStatus ", str, "uniqueId", uniqueId, "status", Integer.valueOf(detectStatus));
        }
        return detectStatus;
    }
}
