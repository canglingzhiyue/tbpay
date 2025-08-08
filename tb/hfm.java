package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.sdk.model.TBLiveDataModel;

/* loaded from: classes5.dex */
public class hfm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TBLIVE_REWARD_ORANGE_GROUP = "tblive-reward";

    static {
        kge.a(-237765861);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : "true".equalsIgnoreCase(pmd.a().d().a(TBLIVE_REWARD_ORANGE_GROUP, "enableHideShareButton", "true"));
    }

    public static boolean a(TBLiveDataModel tBLiveDataModel, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c2a5588", new Object[]{tBLiveDataModel, aVar})).booleanValue();
        }
        return hfl.a() && (StringUtils.equals(tBLiveDataModel.mVideoInfo.roomStatus, "1") && tBLiveDataModel.mVideoInfo.status != 1 && !tBLiveDataModel.mIsDiantaoTimeShift) && (tBLiveDataModel.mVideoInfo.admireInfo != null && tBLiveDataModel.mVideoInfo.admireInfo.contributionEnabled) && !aVar.b;
    }
}
