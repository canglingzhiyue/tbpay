package com.taobao.avplayer;

import tb.kge;

/* loaded from: classes6.dex */
public class TBPlayerConst {
    public static final int PlayWithPlayControlInfo = 0;
    public static final int PlayWithUrl = 2;
    public static final int PlayWithVideoId = 1;
    public static final String TBPlayerInstanceCommunication = "instanceCommunication";
    public static final String TBPlayerInstanceObj = "playerInstanceObj";
    public static final String TBPlayerMethodAudioOff = "audioOff";
    public static final String TBPlayerMethodAudioOn = "audioOn";
    public static final String TBPlayerMethodCallWithMsg = "callWithMsg";
    public static final String TBPlayerMethodCallWithMsgAndResult = "callWithMsgAndResult";
    public static final String TBPlayerMethodCallWithMsg_Params = "params";
    public static final String TBPlayerMethodChangeQuality = "changeQuality";
    public static final String TBPlayerMethodChangeQuality_Quality = "quality";
    public static final String TBPlayerMethodCommitEndForMultiplexing = "commitEndForMultiplexing";
    public static final String TBPlayerMethodDetach = "detach";
    public static final String TBPlayerMethodPrepareToFirstFrame = "prepareToFirstFrame";
    public static final String TBPlayerMethodReattach = "reattach";
    public static final String TBPlayerMethodReattach_Context = "context";
    public static final String TBPlayerMethodSetFirstRenderTime = "setFirstRenderTime";
    public static final String TBPlayerMethodSetup = "setup";
    public static final String TBPlayerMethodStopSwitch = "stopSwitch";
    public static final String TBPlayerMethodSwitchHigher = "switchHigher";
    public static final String TBPlayerMethodSwitchLower = "switchLower";
    public static final String TBPlayerMethodSwitchPlayerScene = "switchPlayerScene";
    public static final String TBPlayerMethodSwitchPlayerScene_ImmediatelyMarkStart = "immediatelyMarkStart";
    public static final String TBPlayerMethodSwitchPlayerScene_SceneName = "sceneName";
    public static final String TBPlayerMethodSwitchPlayerScene_utParams = "utParams";
    public static final String TBPlayerMethodSwitchToNewDefinition = "switchToNewDefinition";
    public static final String TBPlayerMethodSwitchToNewDefinition_NewDefinition = "switchNewDefinition";
    public static final String TBPlayerMethodSwitchToNewDefinition_Reason = "switchReason";
    public static final String TBPlayerMethodUnbindViewProxyFromDWLiveInstance = "unbindViewProxyFromDWLiveInstance";
    public static final String TBPlayerMethodUpdateUrlList = "updateUrlList";
    public static final String TBPlayerMethodUpdateUrlList_List = "list";
    public static final String TBPlayerMethodUpdateUrlList_Mode = "mode";
    public static final String TBPlayerMethodVolumeFadeInWithCustomParams = "volumeFadeInWithCustomParams";
    public static final String TBPlayerMethodVolumeFadeInWithCustomParams_BeginVol = "beginVol";
    public static final String TBPlayerMethodVolumeFadeInWithCustomParams_EndVol = "endVol";
    public static final String TBPlayerMethodVolumeFadeInWithCustomParams_FadeInInterval = "fadeInInterval";
    public static final String TBPlayerMethodVolumeFadeInWithCustomParams_FadeInTime = "fadeInTime";
    public static final String TBPlayerMethodWarmupLiveStream = "warmupLiveStream";
    public static final int TBPlayerPropertyFloatPlayRate = 2000;
    public static final int TBPlayerPropertyFloatReadOnlyBorder = 2500;
    public static final int TBPlayerPropertyFloatReadWriteBorder = 2000;
    public static final int TBPlayerPropertyFloatVolume = 2001;
    public static final int TBPlayerPropertyInstanceCommunication = 4502;
    public static final int TBPlayerPropertyLongBackgroundVideo = 1000;
    public static final int TBPlayerPropertyLongConnectTimeout = 1012;
    public static final int TBPlayerPropertyLongCurrentPosition = 1502;
    public static final int TBPlayerPropertyLongDuration = 1501;
    public static final int TBPlayerPropertyLongFadeAnimationTime = 1023;
    public static final int TBPlayerPropertyLongHeight = 1003;
    public static final int TBPlayerPropertyLongIsPlaying = 1036;
    public static final int TBPlayerPropertyLongLiveDefinitionAutoSwitch = 1022;
    public static final int TBPlayerPropertyLongLocalVideo = 1001;
    public static final int TBPlayerPropertyLongLoop = 1011;
    public static final int TBPlayerPropertyLongMute = 1007;
    public static final int TBPlayerPropertyLongOpenVolumeFadeIn = 1015;
    public static final int TBPlayerPropertyLongPauseInBackground = 1006;
    public static final int TBPlayerPropertyLongPlayerType = 1033;
    public static final int TBPlayerPropertyLongReadOnlyBorder = 1500;
    public static final int TBPlayerPropertyLongReadTimeout = 1013;
    public static final int TBPlayerPropertyLongReadWriteBorder = 1000;
    public static final int TBPlayerPropertyLongReleaseShortFocusWhenPause = 1009;
    public static final int TBPlayerPropertyLongRetryTime = 1014;
    public static final int TBPlayerPropertyLongScenarioType = 1010;
    public static final int TBPlayerPropertyLongSetDecoderTypeH264 = 1035;
    public static final int TBPlayerPropertyLongSetDecoderTypeH265 = 1034;
    public static final int TBPlayerPropertyLongSetRenderType = 1030;
    public static final int TBPlayerPropertyLongShowNoWifiToast = 1026;
    public static final int TBPlayerPropertyLongStartPos = 1020;
    public static final int TBPlayerPropertyLongSwitchHigher = 1029;
    public static final int TBPlayerPropertyLongSwitchLower = 1028;
    public static final int TBPlayerPropertyLongTransH265 = 1037;
    public static final int TBPlayerPropertyLongUseArtp = 1031;
    public static final int TBPlayerPropertyLongUseBfrtc = 1032;
    public static final int TBPlayerPropertyLongUseMiniBfrtc = 1027;
    public static final int TBPlayerPropertyLongUseRtcLive = 1017;
    public static final int TBPlayerPropertyLongUseShortAudioFocus = 1008;
    public static final int TBPlayerPropertyLongUseSurfaceView = 1004;
    public static final int TBPlayerPropertyLongVideoAspectRatio = 1005;
    public static final int TBPlayerPropertyLongVideoState = 1500;
    public static final int TBPlayerPropertyLongViewProxyUnbind = 1025;
    public static final int TBPlayerPropertyLongWidth = 1002;
    public static final int TBPlayerPropertyLongcontrolAudioFocus = 1016;
    public static final int TBPlayerPropertyObjectAudioFocusChangeListener = 4026;
    public static final int TBPlayerPropertyObjectConfigAdapter = 4019;
    public static final int TBPlayerPropertyObjectControlParams = 4003;
    public static final int TBPlayerPropertyObjectCurrentDefinition = 4005;
    public static final int TBPlayerPropertyObjectCustomParams = 4013;
    public static final int TBPlayerPropertyObjectDefinitionListNotSwitchable = 4012;
    public static final int TBPlayerPropertyObjectDefinitionListSwitchable = 4004;
    public static final int TBPlayerPropertyObjectFirstRenderAdapter = 4006;
    public static final int TBPlayerPropertyObjectIDWVideoLifecycleListener = 4022;
    public static final int TBPlayerPropertyObjectIMediaLoopCompleteListener = 4010;
    public static final int TBPlayerPropertyObjectIMediaPlayLifecycleListener = 4009;
    public static final int TBPlayerPropertyObjectIMediaRecycleListener = 4011;
    public static final int TBPlayerPropertyObjectIMediaSwitchListener = 4027;
    public static final int TBPlayerPropertyObjectIRootViewClickListener = 4023;
    public static final int TBPlayerPropertyObjectIVideoPreCompleteListener = 4025;
    public static final int TBPlayerPropertyObjectInstanceType = 4014;
    public static final int TBPlayerPropertyObjectLogAdapter = 4020;
    public static final int TBPlayerPropertyObjectLowDeviceFirstRender = 4016;
    public static final int TBPlayerPropertyObjectMediaInfoParams = 4002;
    public static final int TBPlayerPropertyObjectMediaPlayProxyInstance = 4500;
    public static final int TBPlayerPropertyObjectOnErrorListener = 4008;
    public static final int TBPlayerPropertyObjectPicImageView = 4015;
    public static final int TBPlayerPropertyObjectPlayExpUTParams = 4001;
    public static final int TBPlayerPropertyObjectPlayerQos = 4501;
    public static final int TBPlayerPropertyObjectReadOnlyBorder = 4500;
    public static final int TBPlayerPropertyObjectReadWriteBorder = 4000;
    public static final int TBPlayerPropertyObjectSwitchListener = 4007;
    public static final int TBPlayerPropertyObjectTBLiveMSGInfo = 4017;
    public static final int TBPlayerPropertyObjectTBVideoSourceAdapter = 4021;
    public static final int TBPlayerPropertyObjectUTParams = 4000;
    public static final int TBPlayerPropertyObjectVFPlugin = 4018;
    public static final int TBPlayerPropertyStringAccountId = 3010;
    public static final int TBPlayerPropertyStringBusinessType = 3005;
    public static final int TBPlayerPropertyStringMediaSourceType = 3009;
    public static final int TBPlayerPropertyStringPlayScenes = 3003;
    public static final int TBPlayerPropertyStringPlayToken = 3012;
    public static final int TBPlayerPropertyStringReadOnlyBorder = 3500;
    public static final int TBPlayerPropertyStringReadWriteBorder = 3000;
    public static final int TBPlayerPropertyStringSetDefinition = 3008;
    public static final int TBPlayerPropertyStringSubBusinessType = 3004;
    public static final int TBPlayerPropertyStringUserId = 3011;
    public static final int TBPlayerPropertyStringVideoId = 3000;
    public static final int TBPlayerPropertyStringVideoSource = 3001;
    public static final int TBPlayerPropertyStringVideoToken = 3006;
    public static final int TBPlayerPropertyStringVideoUrl = 3002;
    public static final String TBPlayerReuseState = "playerReuseState";
    public static final int TBPlayerReuseStateNewCreate = 0;
    public static final int TBPlayerReuseStateStarted = 2;
    public static final int TBPlayerReuseStateWarmUp = 1;

    /* loaded from: classes6.dex */
    public enum TBPlayerInvokeResult {
        TBPlayerInvokeResultSuccess,
        TBPlayerInvokeResultInvalidKey,
        TBPlayerInvokeResultInvalidParam,
        TBPlayerInvokeResultInvalidInvoke,
        TBPlayerInvokeResultRepeatUrl
    }

    static {
        kge.a(-129894226);
    }
}
