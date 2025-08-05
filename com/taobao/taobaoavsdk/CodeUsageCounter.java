package com.taobao.taobaoavsdk;

import com.alipay.mobile.security.bio.api.BioError;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes8.dex */
public class CodeUsageCounter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static CodeUsageCounter f21312a;
    private Map<Integer, Integer> b = new HashMap();

    /* loaded from: classes8.dex */
    public enum componentName {
        dw_adapter_DWInstancePlus(1000),
        dw_adapter_HivTBEventAdapter(1001),
        dw_adapter_DWEventAdapter(1002),
        dw_adapter_DWImageAdapter(1003),
        dw_adapter_DWImageLoaderAdapter(1004),
        dw_adapter_DWLauncher1(1006),
        dw_adapter_DWLauncher2(1007),
        dw_adapter_DWNetworkAdapter(1008),
        dw_adapter_DWNetworkFlowAdapter(1009),
        dw_adapter_DWStabilityAdapter(1010),
        dw_adapter_DWTBShareAdapter(1011),
        dw_adapter_DWUserInfoAdapter(1012),
        dw_adapter_DWUserLoginAdapter(1013),
        dw_adapter_DWUserTrackAdapter(1014),
        dw_adapter_TBDWGifInstance(1015),
        dw_adapter_DWNetworkUtilsAdapter(1016),
        dw_adapter_SplayerManager(1017),
        dw_adapter_WXInteractiveComponent(1018),
        dw_adapter_WXSplayerModule(1019),
        dw_adapter_DWVideoPlayerApiPlugin(1020),
        dw_adapter_DWVideoPreloadApiPlugin(1021),
        dw_sdk_DWGifInstance(2000),
        dw_sdk_DWPlayerController(2001),
        dw_sdk_HivPopGoodsController(2002),
        dw_sdk_HivTopBarController(2003),
        dw_sdk_DWScreenOrientationListenerImp(2004),
        dw_sdk_DWWXSDKInstance(2005),
        dw_sdk_DWBackCoverModel(2006),
        dw_sdk_DWInteractive(BioError.RESULT_FAIL_EXIT),
        dw_sdk_DWFrontCoverManager(2008),
        dw_sdk_HivVideoExtDataBarController(2009),
        dw_sdk_MenuWindow(2010),
        dw_sdk_OpenUrlSpecialForAlarmActivity(2011),
        dw_sdk_DWProgressImageView(2012),
        dw_sdk_NavSeekBar(2013),
        dw_sdk_DWFloatViewController(2014),
        dw_sdk_DWKeyBackController(2015),
        dw_sdk_DWMuteController(BioError.RESULT_UNABLE_GET_IMAGE),
        dw_sdk_DWNoticeViewController(BioError.RESULT_CAMERA_INIT_ERROR),
        dw_sdk_DWSmallBarViewController(2018),
        dw_sdk_DWToastContainer(2019),
        dw_sdk_DWTopBarController(IMediaPlayer.MEDIA_INFO_PLAYER_INIT_FAILED_ERROR),
        dw_sdk_DWDataManager(2021),
        dw_sdk_DWPlayerControlViewController(2022),
        dw_sdk_DWRootVideoContainer(2023),
        dw_sdk_DWTBVideoSourceAdapter(aw.MSG_AUTO_RECOMMEND),
        dw_sdk_DWVideoContainer(2025),
        dw_sdk_DWVideoController(2026),
        dw_sdk_DWVideoViewController(2027);
        
        private final int value;

        componentName(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    static {
        kge.a(-2064017645);
    }

    private CodeUsageCounter() {
    }

    public static synchronized CodeUsageCounter a() {
        synchronized (CodeUsageCounter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CodeUsageCounter) ipChange.ipc$dispatch("789981e6", new Object[0]);
            }
            if (f21312a == null) {
                f21312a = new CodeUsageCounter();
            }
            return f21312a;
        }
    }

    public void a(componentName componentname) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("553518e2", new Object[]{this, componentname});
        } else if (this.b.containsKey(Integer.valueOf(componentname.getValue()))) {
            this.b.put(Integer.valueOf(componentname.getValue()), Integer.valueOf(this.b.get(Integer.valueOf(componentname.getValue())).intValue() + 1));
        } else {
            this.b.put(Integer.valueOf(componentname.getValue()), 1);
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : this.b.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
            sb.append("_");
        }
        return sb.toString();
    }
}
