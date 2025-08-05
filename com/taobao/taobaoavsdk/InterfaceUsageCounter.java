package com.taobao.taobaoavsdk;

import anet.channel.entity.EventType;
import com.alipay.mobile.security.bio.api.BioError;
import com.android.alibaba.ip.runtime.IpChange;
import com.heytap.mcssdk.constant.MessageConstant;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.trtc.api.TrtcConstants;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes8.dex */
public class InterfaceUsageCounter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static InterfaceUsageCounter f21313a;
    private Map<Integer, Integer> b = new HashMap();

    /* loaded from: classes8.dex */
    public enum InterfaceName {
        avproxy_setDeviceLevel(1000),
        avproxy_setRenderType(1001),
        avproxy_setBusinessType(1002),
        avproxy_setDefinition(1003),
        avproxy_getVideoToken(1004),
        avproxy_setVideoToken(1005),
        avproxy_setUseArtp(1006),
        avproxy_setUseBfrtc(1007),
        avproxy_setPropertyLong(1008),
        avproxy_setPropertyFloat(1009),
        avproxy_setCoverImg(1010),
        avproxy_setAccountId(1011),
        avproxy_setUserId(1012),
        avproxy_getDuration(1013),
        avproxy_getCurrentPosition(1014),
        avproxy_setPlayRate(1015),
        avproxy_setAudioFocusChangeListener(1016),
        avproxy_setConfigAdapter(1017),
        avproxy_setLogAdapter(1018),
        avproxy_setUseMiniBfrtc(1019),
        avproxy_audioOff(1020),
        avproxy_audioOn(1021),
        hp_getVideoState(2000),
        hp_getView(2001),
        hp_isFullScreen(2002),
        hp_getVideoToken(2003),
        hp_setIVideoPreCompleteListener(2004),
        hp_setIVideoLoopCompleteListener(2005),
        hp_unsetIVideoLoopCompleteListener(2006),
        hp_setPicImageView(BioError.RESULT_FAIL_EXIT),
        hp_setUTParams(2008),
        hp_getLogToken(2009),
        hp_getDuration(2010),
        hp_getVideoWidth(2011),
        hp_getVideoHeight(2012),
        hp_setFirstRenderAdapter(2013),
        hp_switchPlayerScene(2014),
        hp_callWithMsg(2015),
        hp_setAnchorErpList(BioError.RESULT_UNABLE_GET_IMAGE),
        hp_setFov(BioError.RESULT_CAMERA_INIT_ERROR),
        hp_getFov(2018),
        hp_commitEndForMultiplexing(2019),
        hp_setVolume(IMediaPlayer.MEDIA_INFO_PLAYER_INIT_FAILED_ERROR),
        hp_setOpenVolumeFadeIn(2021),
        hp_setVolumeFadeInParams(2022),
        hp_volumeFadeInWithCustomParams(2023),
        dwplus_setPicViewClickListener(3000),
        dwplus_setVideoLifecycleListener(3001),
        dw_orientationEnable(4000),
        dw_setFov(4001),
        dw_refreshScreen(4002),
        dw_hitTest(4003),
        dw_orientationDisable(4004),
        dw_toggleCompleted(4005),
        dw_bindWindow(4006),
        dw_unbindWindow(4007),
        dw_hideController(4008),
        dw_showController(TBPlayerConst.TBPlayerPropertyObjectIMediaPlayLifecycleListener),
        dw_showGoodsListView(4010),
        dw_setShowNotWifiHint(4011),
        dw_setShowPlayWithCacheHint(4012),
        dw_hideGoodsListView(TBPlayerConst.TBPlayerPropertyObjectCustomParams),
        dw_hideMiniProgressBar(TBPlayerConst.TBPlayerPropertyObjectInstanceType),
        dw_showMiniProgressBar(TBPlayerConst.TBPlayerPropertyObjectPicImageView),
        dw_setPlayRate(TBPlayerConst.TBPlayerPropertyObjectLowDeviceFirstRender),
        dw_setIDWHookVideoBackButtonListener(TBPlayerConst.TBPlayerPropertyObjectTBLiveMSGInfo),
        dw_setVideoUrl(TBPlayerConst.TBPlayerPropertyObjectVFPlugin),
        dw_setToastTopMargin(TBPlayerConst.TBPlayerPropertyObjectConfigAdapter),
        dw_getInstanceType(4020),
        dw_setInstanceType(4021),
        dw_setInteractiveID(TBPlayerConst.TBPlayerPropertyObjectIDWVideoLifecycleListener),
        dw_setVideoID(4023),
        dw_setVideoSource(4024),
        dw_setScene(TBPlayerConst.TBPlayerPropertyObjectIVideoPreCompleteListener),
        dw_setUserID(TBPlayerConst.TBPlayerPropertyObjectAudioFocusChangeListener),
        dw_forceSetUserId(TBPlayerConst.TBPlayerPropertyObjectIMediaSwitchListener),
        dw_setNeedCloseUT(4028),
        dw_setFrame(4029),
        dw_addWhiteWeexCmpList(4030),
        dw_addWeexAddViewCallback(RSoException.ERROR_LOAD_PREFER_SYSTEM_LOAD_FAILED),
        dw_addWeexShowViewCallback(RSoException.ERROR_LOAD_FALLBACK_SYSTEM_LOAD_FAILED),
        dw_addUpdateWeexCmpAnchorCallback(4033),
        dw_addIctTempCallback(4034),
        dw_needAD(4035),
        dw_setVideoBackgroundColor(4036),
        dw_setVideoBackgroundDrawable(4037),
        dw_addUtParams(4038),
        dw_addCustomParams(4039),
        dw_setConnectTimeout(4040),
        dw_setReadTimeout(4041),
        dw_setRetryTime(4042),
        dw_addPlayExpUtParams(4043),
        dw_initPlayExpUTParams(4044),
        dw_addControlParams(4045),
        dw_initControlParams(4046),
        dw_setCloseViewClickListener(4047),
        dw_setPicViewClickListener(4048),
        dw_setRootViewClickListener(4049),
        dw_setVideoRecycleListener(4050),
        dw_showTopEventView(4051),
        dw_hideTopEventView(4052),
        dw_setDWLifecycleType(4053),
        dw_setHookStartListener(4054),
        dw_setHookRootViewTouchListener(4055),
        dw_setHookSmallWindowClickListener(4056),
        dw_setIDWScreenSmallWindowListener(4057),
        dw_setNormalControllerListener(4058),
        dw_setVideoLifecycleListener(4059),
        dw_setVideoLifecycleListener2(4060),
        dw_setVideoPlayTimeListener(4061),
        dw_hideCloseView(4062),
        dw_showCloseView(4063),
        dw_setPicModeUrl(4064),
        dw_setPicModeScaleType(4065),
        dw_addCoverView(4066),
        dw_setNeedGesture(4067),
        dw_removeCoverView(4068),
        dw_toggleScreen(4069),
        dw_seekTo(4070),
        dw_seekTo2(4071),
        dw_seekTo3(4072),
        dw_preDownload(4073),
        dw_replay(4074),
        dw_toSmall(4075),
        dw_toNormal(4076),
        dw_setIDWMutedChangeListener(4077),
        dw_adIsPlaying(4078),
        dw_getNormalControllerHeight(4079),
        dw_showOrHideInteractive(4080),
        dw_getView(4081),
        dw_isFullScreen(4082),
        dw_onVideoScreenChanged(4083),
        dw_onLifecycleChanged(4084),
        dw_setInteractiveIdAndRefresh(4085),
        dw_onBackKeyDown(4086),
        dw_getVideoToken(4087),
        dw_addFullScreenCustomView(4088),
        dw_removeFullScreenCustomView(4089),
        dw_isSmallWindow(4090),
        dw_setUTParams(4091),
        dw_addWXCmpUtilsCallback(4092),
        dw_addWXCmpUtilsCallback2(4093),
        dw_setDanmaOpened(4094),
        dw_setLikeBtnShown(EventType.ALL),
        dw_setLikeBtnFullScreenShown(4096),
        dw_setReportFullScreenShown(4097),
        dw_setReportShown(4098),
        dw_setShowGoodsList(4099),
        dw_setPreLikeParams(4100),
        dw_setShowCustomIconOrNotList(4101),
        dw_setTaowaIsShare(4102),
        dw_showWXBackCoverOrNot(4103),
        dw_predisplayInteractiveRightBar(TrtcConstants.TRTC_ERROR_CODE_CALLEE_SDK_VERSION_IS_LOW),
        dw_fireGlobalEventToWXCmp(MessageConstant.MessageType.MESSAGE_CALL_BACK),
        dw_setFirstRenderAdapter(MessageConstant.MessageType.MESSAGE_SMS_DATA),
        dw_switchPlayerScene(4107),
        dw_callWithMsg(MessageConstant.MessageType.MESSAGE_REVOKE);
        
        private final int value;

        InterfaceName(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    static {
        kge.a(-2147049367);
    }

    private InterfaceUsageCounter() {
    }

    public static synchronized InterfaceUsageCounter a() {
        synchronized (InterfaceUsageCounter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InterfaceUsageCounter) ipChange.ipc$dispatch("e4868154", new Object[0]);
            }
            if (f21313a == null) {
                f21313a = new InterfaceUsageCounter();
            }
            return f21313a;
        }
    }

    public void a(InterfaceName interfaceName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faff73ae", new Object[]{this, interfaceName});
        } else if (this.b.containsKey(Integer.valueOf(interfaceName.getValue()))) {
            this.b.put(Integer.valueOf(interfaceName.getValue()), Integer.valueOf(this.b.get(Integer.valueOf(interfaceName.getValue())).intValue() + 1));
        } else {
            this.b.put(Integer.valueOf(interfaceName.getValue()), 1);
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
