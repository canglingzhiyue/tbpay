package mtopsdk.mtop.network;

import anet.channel.GlobalAppRuntimeInfo;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import tb.kge;

/* loaded from: classes.dex */
public class NetworkPropertyServiceImpl implements NetworkPropertyService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.NetworkPropertyServiceImpl";

    static {
        kge.a(2077950717);
        kge.a(1805521725);
    }

    @Override // mtopsdk.mtop.network.NetworkPropertyService
    public void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[setUserId] set NetworkProperty UserId =" + str);
        }
        GlobalAppRuntimeInfo.setUserId(str);
    }

    @Override // mtopsdk.mtop.network.NetworkPropertyService
    public void setTtid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a2801ee", new Object[]{this, str});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[setTtid] set NetworkProperty ttid =" + str);
        }
        GlobalAppRuntimeInfo.setTtid(str);
    }
}
