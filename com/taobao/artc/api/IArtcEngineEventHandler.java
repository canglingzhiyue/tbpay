package com.taobao.artc.api;

import com.taobao.artc.api.AConstants;
import com.taobao.trtc.api.TrtcDefines;

@Deprecated
/* loaded from: classes6.dex */
public interface IArtcEngineEventHandler {
    void onAnswer(String str, String str2, int i);

    void onAnswered(String str, String str2, String str3, int i, int i2) throws ArtcException;

    void onAudioQuality(int i, short s, short s2);

    void onAudioRouteChanged(int i);

    void onBlueToothDeviceDisconnected() throws ArtcException;

    void onBlueToothDeviceconnected() throws ArtcException;

    void onCall(String str, String str2, String str3, int i) throws ArtcException;

    void onCallTimeout() throws ArtcException;

    void onCalled(String str, String str2, String str3, int i, int i2, int i3) throws ArtcException;

    void onCalledByPSTN(String str, String str2, String str3, String str4, String str5, String str6) throws ArtcException;

    void onCameraSwitchDone(boolean z) throws ArtcException;

    void onCancelCall(String str, String str2) throws ArtcException;

    void onChannelClosed(String str, String str2, int i);

    void onConnectionConnected();

    void onConnectionInterrupted();

    void onConnectionLost();

    void onCreateChannelSuccess(String str);

    void onError(AConstants.ArtcErrorEvent artcErrorEvent, int i);

    void onError(AConstants.ArtcErrorEventNew artcErrorEventNew, int i, String str);

    void onFirstLocalVideoFrame(int i, int i2);

    void onFirstRemoteVideoFrame(int i, int i2, String str);

    void onInvited(String str, String str2, int i) throws ArtcException;

    void onJoinChannelSuccess(int i);

    void onKicked(String str, String str2) throws ArtcException;

    void onLastmileQuality(int i) throws ArtcException;

    void onLeaveChannel(ArtcStats artcStats);

    void onLiveChannelIdUpdate(String str);

    void onLocalVideoStats(LocalVideoStats localVideoStats);

    void onRemoteVideoStats(RemoteVideoStats remoteVideoStats);

    void onRtcStats(ArtcStats artcStats);

    void onSignalChannelAvailable();

    void onTrtcLocalStats(TrtcDefines.i iVar);

    void onUserJoinedChannel(String str);

    void onUserLeftChannel(String str, int i);

    void onUserOffline(String str, int i);

    void onUserPublishVideo(String str) throws ArtcException;
}
