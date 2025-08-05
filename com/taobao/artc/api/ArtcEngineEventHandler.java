package com.taobao.artc.api;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.AConstants;
import com.taobao.trtc.api.TrtcDefines;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class ArtcEngineEventHandler implements IArtcEngineEventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(286847331);
        kge.a(-250087702);
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    @Deprecated
    public void onAnswer(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777e0e6b", new Object[]{this, str, str2, new Integer(i)});
        }
    }

    public void onAnswer2(String str, String str2, int i, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4772627", new Object[]{this, str, str2, new Integer(i), str3, str4});
        }
    }

    public void onAnswerMutli(String str, int i, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b745d5a", new Object[]{this, str, new Integer(i), str2, str3});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    @Deprecated
    public void onAnswered(String str, String str2, String str3, int i, int i2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac294c21", new Object[]{this, str, str2, str3, new Integer(i), new Integer(i2)});
        }
    }

    public void onAnswered2(String str, String str2, String str3, int i, int i2, String str4, String str5) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6598af", new Object[]{this, str, str2, str3, new Integer(i), new Integer(i2), str4, str5});
        }
    }

    public void onAnsweredMutli(String str, int i, int i2, String str2, boolean z, String str3) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1fa2cd6", new Object[]{this, str, new Integer(i), new Integer(i2), str2, new Boolean(z), str3});
        }
    }

    public void onAttendeesInChannel(String str, ArtcAttendee[] artcAttendeeArr) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a824a4", new Object[]{this, str, artcAttendeeArr});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onAudioQuality(int i, short s, short s2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82536d34", new Object[]{this, new Integer(i), new Short(s), new Short(s2)});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onAudioRouteChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a6119a", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onBlueToothDeviceDisconnected() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c28207", new Object[]{this});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onBlueToothDeviceconnected() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e1748b", new Object[]{this});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    @Deprecated
    public void onCall(String str, String str2, String str3, int i) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a75b981", new Object[]{this, str, str2, str3, new Integer(i)});
        }
    }

    public void onCall2(String str, String str2, String str3, int i, String str4, String str5) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9757ccfd", new Object[]{this, str, str2, str3, new Integer(i), str4, str5});
        }
    }

    public void onCallMutli(ArrayList<TrtcDefines.c> arrayList, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("210ff3a1", new Object[]{this, arrayList, str});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onCallTimeout() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c61a304b", new Object[]{this});
        }
    }

    public void onCallTimeoutMutli(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("428f9fb6", new Object[]{this, str});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    @Deprecated
    public void onCalled(String str, String str2, String str3, int i, int i2, int i3) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae580a2", new Object[]{this, str, str2, str3, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    public void onCalled2(String str, String str2, String str3, int i, int i2, int i3, String str4, String str5) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e135e0bc", new Object[]{this, str, str2, str3, new Integer(i), new Integer(i2), new Integer(i3), str4, str5});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onCalledByPSTN(String str, String str2, String str3, String str4, String str5, String str6) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("216a2533", new Object[]{this, str, str2, str3, str4, str5, str6});
        }
    }

    public void onCalledMutli(String str, String str2, int i, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d78038ef", new Object[]{this, str, str2, new Integer(i), str3, new Boolean(z)});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onCameraSwitchDone(boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c85993", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onCancelCall(String str, String str2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88fd2e52", new Object[]{this, str, str2});
        }
    }

    @Deprecated
    public void onCanceledCall(String str, String str2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158dfe31", new Object[]{this, str, str2});
        }
    }

    public void onCanceledCall2(String str, String str2, int i, String str3, String str4) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5bf1200", new Object[]{this, str, str2, new Integer(i), str3, str4});
        }
    }

    public void onCaptureFreezed(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a0d0493", new Object[]{this, str, str2, new Boolean(z)});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    @Deprecated
    public void onChannelClosed(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c63d998", new Object[]{this, str, str2, new Integer(i)});
        }
    }

    public void onChannelClosed2(String str, String str2, int i, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4869c31a", new Object[]{this, str, str2, new Integer(i), str3, str4});
        }
    }

    public void onChannelIdUpdated(String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcf45eed", new Object[]{this, str});
        }
    }

    public void onChannelMsgBroadcast(String str, int i, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b3c42ec", new Object[]{this, str, new Integer(i), str2, str3, str4});
        }
    }

    public void onChannelMsgBroadcastNotify(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e4711c", new Object[]{this, str, str2, str3, str4});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onConnectionConnected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9132b3f3", new Object[]{this});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onConnectionInterrupted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d8fdec", new Object[]{this});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onConnectionLost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd46eee8", new Object[]{this});
        }
    }

    public void onCreateBackgroundView() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39526b15", new Object[]{this});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onCreateChannelSuccess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52bbc66c", new Object[]{this, str});
        }
    }

    public void onDegradeToTcp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89945196", new Object[]{this});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onError(AConstants.ArtcErrorEvent artcErrorEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("685e62c9", new Object[]{this, artcErrorEvent, new Integer(i)});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onError(AConstants.ArtcErrorEventNew artcErrorEventNew, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42116f7", new Object[]{this, artcErrorEventNew, new Integer(i), str});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onFirstLocalVideoFrame(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2be8553", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    public void onFirstRemoteAudioFrameMutli(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53d3d4ec", new Object[]{this, str});
        }
    }

    public void onFirstRemoteAudioFrameTimeoutMutli(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eddd80e7", new Object[]{this, str});
        }
    }

    public void onFirstRemoteMediaReported(String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c47cf1", new Object[]{this, str});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onFirstRemoteVideoFrame(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a3afa", new Object[]{this, new Integer(i), new Integer(i2), str});
        }
    }

    public void onFirstRemoteVideoFrameMutli(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c428ac31", new Object[]{this, new Integer(i), new Integer(i2), str});
        }
    }

    public void onFirstRemoteVideoFrameTimeoutMutli(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b048a2", new Object[]{this, str});
        }
    }

    public void onHideBackgroundView() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7458959b", new Object[]{this});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    @Deprecated
    public void onInvited(String str, String str2, int i) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dd9802c", new Object[]{this, str, str2, new Integer(i)});
        }
    }

    public void onInvited2(String str, String str2, int i, String str3, String str4) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11666906", new Object[]{this, str, str2, new Integer(i), str3, str4});
        }
    }

    public void onJoinCallMutli(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800f8304", new Object[]{this, new Integer(i), str});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onJoinChannelSuccess(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7642c373", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    @Deprecated
    public void onKicked(String str, String str2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e91af23f", new Object[]{this, str, str2});
        }
    }

    public void onKicked2(String str, String str2, String str3, String str4) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb91d13d", new Object[]{this, str, str2, str3, str4});
        }
    }

    public void onKickedMutli(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5661ef6a", new Object[]{this, str, str2, str3});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onLastmileQuality(int i) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("905fc987", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    @Deprecated
    public void onLeaveChannel(ArtcStats artcStats) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa59f1e1", new Object[]{this, artcStats});
        }
    }

    public void onLeaveChannel2(ArtcStats artcStats, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ac388f9", new Object[]{this, artcStats, str, str2});
        }
    }

    public void onLeaveChannelSuccess(int i) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e176aa4", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onLiveChannelIdUpdate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfb0de8d", new Object[]{this, str});
        }
    }

    public void onLocalSpeakingStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62a151f", new Object[]{this, new Boolean(z)});
        }
    }

    public void onLocalStreamUpdated(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3617597", new Object[]{this, new Integer(i), str});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onLocalVideoStats(LocalVideoStats localVideoStats) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b22c5ec", new Object[]{this, localVideoStats});
        }
    }

    public void onMessage(String str, String str2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49fb43", new Object[]{this, str, str2});
        }
    }

    public void onMuteRemoteAudio(boolean z, ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61f99e15", new Object[]{this, new Boolean(z), arrayList});
        }
    }

    public void onRecordFromFileEos() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810a14ba", new Object[]{this});
        }
    }

    public void onRemoteSpeakingStreams(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2744305", new Object[]{this, arrayList});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onRemoteVideoStats(RemoteVideoStats remoteVideoStats) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a816a4", new Object[]{this, remoteVideoStats});
        }
    }

    public void onRinging(String str, String str2, String str3, String str4, String str5) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68a374c", new Object[]{this, str, str2, str3, str4, str5});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onRtcStats(ArtcStats artcStats) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6bb70af", new Object[]{this, artcStats});
        }
    }

    public void onShowBackgroundView() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("996dba96", new Object[]{this});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onSignalChannelAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b87294", new Object[]{this});
        }
    }

    public void onSwitchMedia(String str, String str2, int i, boolean z, String str3) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4bed087", new Object[]{this, str, str2, new Integer(i), new Boolean(z), str3});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onTrtcLocalStats(TrtcDefines.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5effaae", new Object[]{this, iVar});
        }
    }

    public void onUnInitializeSuccess(int i) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f27827e1", new Object[]{this, new Integer(i)});
        }
    }

    public void onUpdateSubCaptureSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f94b796", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    public void onUserDisconnected(String str, String str2, String str3, String str4) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b17d4", new Object[]{this, str, str2, str3, str4});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    @Deprecated
    public void onUserJoinedChannel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c91e69e1", new Object[]{this, str});
        }
    }

    public void onUserJoinedChannel2(ArtcAttendee artcAttendee, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("886ee321", new Object[]{this, artcAttendee, str, str2});
        }
    }

    public void onUserJoinedChannelMutli(ArrayList<TrtcDefines.m> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35de6cca", new Object[]{this, arrayList});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    @Deprecated
    public void onUserLeftChannel(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98419000", new Object[]{this, str, new Integer(i)});
        }
    }

    public void onUserLeftChannel2(String str, int i, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51607e86", new Object[]{this, str, new Integer(i), str2, str3});
        }
    }

    public void onUserLeftChannelMutli(ArrayList<TrtcDefines.m> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2024304c", new Object[]{this, arrayList});
        }
    }

    public void onUserMutedLocal(String str, String str2, int i, boolean z, String str3) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c5bd200", new Object[]{this, str, str2, new Integer(i), new Boolean(z), str3});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onUserOffline(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435be239", new Object[]{this, str, new Integer(i)});
        }
    }

    @Override // com.taobao.artc.api.IArtcEngineEventHandler
    public void onUserPublishVideo(String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44b95a27", new Object[]{this, str});
        }
    }

    public void onUserSwitchedMedia(String str, String str2, int i, boolean z, String str3) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6930307d", new Object[]{this, str, str2, new Integer(i), new Boolean(z), str3});
        }
    }

    public void onUserUnpublishVideo(String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c08c3000", new Object[]{this, str});
        }
    }
}
