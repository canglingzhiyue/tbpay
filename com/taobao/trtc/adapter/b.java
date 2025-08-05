package com.taobao.trtc.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.AConstants;
import com.taobao.artc.api.ArtcAttendee;
import com.taobao.artc.api.ArtcEngineEventHandler;
import com.taobao.artc.api.IAudioRecordEventHandler;
import com.taobao.artc.internal.ArtcEngineEventProxy;
import com.taobao.trtc.api.ITrtcObserver;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.utils.TrtcLog;
import java.util.ArrayList;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes9.dex */
public class b implements ITrtcObserver.a, ITrtcObserver.b, ITrtcObserver.c, ITrtcObserver.d, ITrtcObserver.e, ITrtcObserver.f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f23029a;
    private final ArtcEngineEventProxy b = new ArtcEngineEventProxy();
    private IAudioRecordEventHandler c;

    static {
        kge.a(770167847);
        kge.a(1847903687);
        kge.a(855594913);
        kge.a(1589133634);
        kge.a(-1729817147);
        kge.a(2116383423);
        kge.a(509415034);
    }

    private int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 2000) {
            return -300;
        }
        if (i == 2001) {
            return -301;
        }
        return i != 2100 ? i != 2200 ? i != 4001 ? i != 2300 ? i != 2301 ? i : AConstants.ArtcErrorVideoDeviceError : AConstants.ArtcErrorAudioDeviceError : AConstants.ArtcErrorJoinChannelError : AConstants.ArtcErrorMediaConnectionLost : AConstants.ArtcErrorJoinChannelErrorTimeOut;
    }

    private int d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad401d6b", new Object[]{this, new Integer(i)})).intValue();
        }
        return -1;
    }

    private int e(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aef4f60a", new Object[]{this, new Integer(i)})).intValue() : i == 0 ? 0 : -1;
    }

    public b(a aVar) {
        this.f23029a = aVar;
    }

    public void a(ArtcEngineEventHandler artcEngineEventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c3c854", new Object[]{this, artcEngineEventHandler});
            return;
        }
        TrtcLog.d("AdapterEvent", "set artc event handler to adapter event proxy, " + artcEngineEventHandler);
        this.b.setArtcEngineEventHandler(artcEngineEventHandler);
    }

    public void a(IAudioRecordEventHandler iAudioRecordEventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea026678", new Object[]{this, iAudioRecordEventHandler});
            return;
        }
        TrtcLog.d("AdapterEvent", "set artc audio record event handler, " + iAudioRecordEventHandler);
        this.c = iAudioRecordEventHandler;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f66767", new Object[]{this, aVar});
            return;
        }
        TrtcLog.d("AdapterEvent", "set cached info handler, " + aVar);
        this.f23029a = aVar;
    }

    private AConstants.ArtcErrorEventNew a(TrtcDefines.TrtcErrorEvent trtcErrorEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AConstants.ArtcErrorEventNew) ipChange.ipc$dispatch("78270f41", new Object[]{this, trtcErrorEvent});
        }
        AConstants.ArtcErrorEventNew artcErrorEventNew = AConstants.ArtcErrorEventNew.ARTC_ERROR_EVENT_INIT_ERROR;
        switch (trtcErrorEvent) {
            case E_ERROR_EVENT_INITIALIZE:
                return AConstants.ArtcErrorEventNew.ARTC_ERROR_EVENT_INIT_ERROR;
            case E_ERROR_EVENT_LIVE:
                return AConstants.ArtcErrorEventNew.ARTC_ERROR_EVENT_JOINCHANNEL;
            case E_ERROR_EVENT_MEDIA_CONNECTION:
            case E_ERROR_EVENT_NEED_RETRY:
            case E_ERROR_EVENT_NEED_STOP:
                return AConstants.ArtcErrorEventNew.ARTC_ERROR_EVENT_MEDIA_CONNECTION_ERROR;
            case E_ERROR_EVENT_DNS_FAILD:
                return AConstants.ArtcErrorEventNew.ARTC_ERROR_EVENT_CREATE_V4_ERROR;
            case E_ERROR_EVENT_LINK_LIVE:
                return AConstants.ArtcErrorEventNew.ARTC_ERROR_EVENT_LINKLIVE_ERROR;
            case E_ERROR_EVENT_LINKLIVE_MEDIA_CONNECTION:
                return AConstants.ArtcErrorEventNew.ARTC_ERROR_EVENT_MAX;
            case E_ERROR_EVENT_MEDIA_DEVICE:
                return AConstants.ArtcErrorEventNew.ARTC_ERROR_EVENT_MEDIA_DEVICE_ERROR;
            default:
                return artcErrorEventNew;
        }
    }

    private AConstants.ArtcErrorEvent b(TrtcDefines.TrtcErrorEvent trtcErrorEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AConstants.ArtcErrorEvent) ipChange.ipc$dispatch("a8276536", new Object[]{this, trtcErrorEvent});
        }
        int i = AnonymousClass1.f23030a[trtcErrorEvent.ordinal()];
        if (i == 2) {
            return AConstants.ArtcErrorEvent.ARTC_EVENT_SIGNALING_JOININGCHANNEL;
        }
        if (i == 3) {
            return AConstants.ArtcErrorEvent.ARTC_EVENT_SIGNALING_CONNECTION;
        }
        if (i == 9) {
            AConstants.ArtcErrorEvent artcErrorEvent = AConstants.ArtcErrorEvent.ARTC_EVENT_INIT_MEDIA_RESOURCE;
        }
        return AConstants.ArtcErrorEvent.ARTC_EVENT_SERVER_ERROR;
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b.onSignalChannelAvailable();
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        TrtcLog.d("AdapterEvent", "onJoinChannelSuccess");
        this.b.onJoinChannelSuccess(i);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        TrtcLog.d("AdapterEvent", "onLiveChannelIdUpdate");
        this.b.onLiveChannelIdUpdate(str);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void a(TrtcDefines.TrtcNetWorkQuality trtcNetWorkQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17a39c", new Object[]{this, trtcNetWorkQuality});
            return;
        }
        TrtcLog.d("AdapterEvent", "onTrtcNetworkQuality: " + trtcNetWorkQuality);
        this.b.onLastmileQuality(trtcNetWorkQuality.ordinal());
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        TrtcLog.d("AdapterEvent", "onDegradeToTcp()");
        this.b.onDegradeToTcp();
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.b.onLocalSpeakingStatus(z);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void c(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3622480", new Object[]{this, arrayList});
        } else {
            this.b.onRemoteSpeakingStreams(arrayList);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void a(String str, int i, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0e582f", new Object[]{this, str, new Integer(i), str2, str3, str4});
        } else {
            this.b.onChannelMsgBroadcastRsp(str, i, str2, str3, str4);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
        } else {
            this.b.onChannelMsgBroadcastNotify(str, str2, str3, str4);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void a(TrtcDefines.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ace7ceb", new Object[]{this, kVar});
        } else {
            TrtcLog.d("AdapterEvent", "onNetworkStats");
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void a(TrtcDefines.TrtcMediaConnectionState trtcMediaConnectionState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8803561e", new Object[]{this, trtcMediaConnectionState});
            return;
        }
        TrtcLog.d("AdapterEvent", "onMediaConnectionChange: " + trtcMediaConnectionState);
        if (trtcMediaConnectionState == TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_TIMEOUT) {
            this.b.onConnectionInterrupted();
        } else if (trtcMediaConnectionState == TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_DISCONNECTED) {
            this.b.onConnectionLost();
        } else if (trtcMediaConnectionState != TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_CONNECTED) {
        } else {
            this.b.onConnectionConnected();
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        TrtcLog.d("AdapterEvent", "onLinkLiveNeedMix, stream id:" + str + ", needMix: " + z);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void a(TrtcDefines.TrtcErrorEvent trtcErrorEvent, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78ecc652", new Object[]{this, trtcErrorEvent, new Integer(i), str});
            return;
        }
        AConstants.ArtcErrorEvent b = b(trtcErrorEvent);
        int d = d(i);
        TrtcLog.a("AdapterEvent", "onError event:" + trtcErrorEvent + ", code:" + i + " -> artc event:" + b + ", code:" + d);
        this.b.onError(b, d);
        AConstants.ArtcErrorEventNew a2 = a(trtcErrorEvent);
        int c = c(i);
        TrtcLog.a("AdapterEvent", "onError event:" + trtcErrorEvent + ", code:" + i + " -> artc event:" + b + ", code:" + d);
        if (b.ordinal() >= AConstants.ArtcErrorEventNew.ARTC_ERROR_EVENT_MAX.ordinal()) {
            return;
        }
        this.b.onError(a2, c, str);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void a(ArrayList<TrtcDefines.c> arrayList, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56be5b8c", new Object[]{this, arrayList, str});
            return;
        }
        TrtcLog.d("AdapterEvent", "onMakeCallRsp");
        int e = e(arrayList.get(0).b);
        if (this.f23029a.x.x()) {
            this.b.onCallMutli(arrayList, str);
        } else {
            this.b.onCall2(this.f23029a.b(), "", arrayList.get(0).f23035a, e, "", "");
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void a(TrtcDefines.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aca6594", new Object[]{this, bVar});
            return;
        }
        TrtcLog.d("AdapterEvent", "onRecvNewCall, remote id: " + bVar.f23034a + ", role: " + bVar.b);
        if (bVar.f) {
            this.b.onCalledMutli("default_call_id", bVar.f23034a, bVar.b.ordinal(), bVar.e, true);
        } else {
            this.b.onCalled2(this.f23029a.b(), "default_call_id", bVar.f23034a, bVar.b.ordinal(), 1, bVar.d.ordinal(), bVar.e, bVar.e);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void a(TrtcDefines.b bVar, TrtcDefines.TrtcAnswerType trtcAnswerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34bee8a1", new Object[]{this, bVar, trtcAnswerType});
            return;
        }
        TrtcLog.d("AdapterEvent", "onRemoteAnswered");
        if (bVar.f) {
            this.b.onAnsweredMutli(bVar.f23034a, bVar.b.ordinal(), trtcAnswerType.ordinal(), bVar.e, true, bVar.g);
        } else {
            this.b.onAnswered2(this.f23029a.b(), "default_call_id", bVar.f23034a, bVar.b.ordinal(), trtcAnswerType.ordinal(), "", bVar.e);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void a(TrtcDefines.c cVar, TrtcDefines.TrtcAnswerType trtcAnswerType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3da1ecca", new Object[]{this, cVar, trtcAnswerType, str});
            return;
        }
        TrtcLog.d("AdapterEvent", "onAnswerRsp");
        if (this.f23029a.x.x()) {
            this.b.onAnswerMutli(cVar.f23035a, trtcAnswerType.ordinal(), str, cVar.d);
            if (this.f23029a.x.l() || trtcAnswerType != TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_REJECT) {
                return;
            }
            this.f23029a.x.f(false);
            return;
        }
        this.b.onAnswer2(this.f23029a.b(), "", trtcAnswerType.ordinal(), "", "");
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.d("AdapterEvent", "onRemoteCanceled");
        this.b.onCanceledCall2(this.f23029a.b(), str, 2, "", str2);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.d("AdapterEvent", "onRemoteHangup");
        a aVar = this.f23029a;
        aVar.C = null;
        if (aVar.x.x()) {
            this.b.onKickedMutli(str, "", str2);
            this.f23029a.x.f(false);
            return;
        }
        this.b.onKicked2(this.f23029a.b(), str, "", str2);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.d("AdapterEvent", "onRemoteJoinedChannel");
        this.b.onUserJoinedChannel2(new ArtcAttendee(str, this.f23029a.o, this.f23029a.n), "", str2);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void a(ArrayList<TrtcDefines.m> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            return;
        }
        TrtcLog.d("AdapterEvent", "onRemoteJoinedChannel");
        if (this.f23029a.x.x()) {
            this.b.onUserJoinedChannelMutli(arrayList);
        } else if (arrayList == null || arrayList.size() <= 0) {
        } else {
            Iterator<TrtcDefines.m> it = arrayList.iterator();
            while (it.hasNext()) {
                TrtcDefines.m next = it.next();
                this.b.onUserJoinedChannel2(new ArtcAttendee(next.f23045a, this.f23029a.o, this.f23029a.n), "", next.c);
            }
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.d("AdapterEvent", "onRemoteLeftChannel");
        this.b.onUserLeftChannel2(str, 1, "", str2);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void b(ArrayList<TrtcDefines.m> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e188d161", new Object[]{this, arrayList});
            return;
        }
        TrtcLog.d("AdapterEvent", "onRemoteLeftChannel");
        if (this.f23029a.x.x()) {
            this.b.onUserLeftChannelMutli(arrayList);
        } else if (arrayList == null || arrayList.size() <= 0) {
        } else {
            Iterator<TrtcDefines.m> it = arrayList.iterator();
            while (it.hasNext()) {
                TrtcDefines.m next = it.next();
                this.b.onUserLeftChannel2(next.f23045a, 1, "", next.c);
            }
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void a(TrtcDefines.TrtcChannelAction trtcChannelAction, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83919388", new Object[]{this, trtcChannelAction, str, str2, str3});
            return;
        }
        TrtcLog.d("AdapterEvent", "onRemoteNotifyChannel");
        if (trtcChannelAction != TrtcDefines.TrtcChannelAction.E_CHANNEL_NOTIFY_INVITE) {
            return;
        }
        this.b.onCalled2(str2, "default_call_id", str, 2, 1, 2, "", "");
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        TrtcLog.d("AdapterEvent", "onCallTimeout");
        if (this.f23029a.x.x()) {
            this.b.onCallTimeoutMutli(str);
        } else {
            this.b.onCallTimeout();
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void a(TrtcDefines.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1acbc2b1", new Object[]{this, eVar});
            return;
        }
        TrtcLog.d("AdapterEvent", "onJoinChannelRsp, channelRspInfo: " + eVar.toString());
        if (eVar.e && eVar.d.equals("TrtcLocalStream")) {
            this.f23029a.x.c(true);
            this.b.onJoinCallMutli(eVar.b, eVar.c);
        } else if (eVar.b == 0) {
            this.b.onJoinChannelSuccess(0);
        } else {
            this.b.onError(AConstants.ArtcErrorEvent.ARTC_EVENT_SIGNALING_JOININGCHANNEL, eVar.b);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void a(String str, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fb0d31", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        TrtcLog.d("AdapterEvent", "onFirstVideoFrame userId:" + str + " w:" + i + " h:" + i2 + " ,isMutliChatMode: " + this.f23029a.x.x());
        if (this.f23029a.x.x()) {
            this.b.onFirstRemoteVideoFrameMutli(i, i2, str, i3);
        } else {
            this.b.onFirstRemoteVideoFrame(i, i2, str, i3);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        TrtcLog.d("AdapterEvent", "onFirstAudioFrame remoteUserId:" + str + " elapsedMs:" + i + " ,isMutliChatMode: " + this.f23029a.x.x());
        if (!this.f23029a.x.x()) {
            return;
        }
        this.b.onFirstRemoteAudioFrameMutli(str);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        TrtcLog.d("AdapterEvent", "onFirstVideoFrameTimeout remoteUserId:" + str + " ,isMutliChatMode: " + this.f23029a.x.x());
        if (!this.f23029a.x.x()) {
            return;
        }
        this.b.onFirstRemoteVideoFrameTimeoutMutli(str);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        TrtcLog.d("AdapterEvent", "onFirstAudioFrameTimeout remoteUserId:" + str + " ,isMutliChatMode: " + this.f23029a.x.x());
        if (!this.f23029a.x.x()) {
            return;
        }
        this.b.onFirstRemoteAudioFrameTimeoutMutli(str);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        TrtcLog.d("AdapterEvent", "onLocalStreamUpdated, errorCode: " + i + " ,errorMsg: " + str);
        this.b.onLocalStreamUpdated(i, str);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TrtcLog.d("AdapterEvent", "onBlueToothDeviceConnected");
        this.b.onBlueToothDeviceconnected();
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        TrtcLog.d("AdapterEvent", "onBlueToothDeviceDisconnected");
        this.b.onBlueToothDeviceDisconnected();
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.a
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        TrtcLog.d("AdapterEvent", "onAudioRouteChanged");
        this.b.onAudioRouteChanged(i);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.a
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        TrtcLog.a("AdapterEvent", "onAudioRecordStartError:" + str);
        IAudioRecordEventHandler iAudioRecordEventHandler = this.c;
        if (iAudioRecordEventHandler == null) {
            return;
        }
        iAudioRecordEventHandler.onStartError(str);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.a
    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        TrtcLog.a("AdapterEvent", "onAudioRecordInitError:" + str);
        IAudioRecordEventHandler iAudioRecordEventHandler = this.c;
        if (iAudioRecordEventHandler == null) {
            return;
        }
        iAudioRecordEventHandler.onInitError(str);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.a
    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        TrtcLog.a("AdapterEvent", "onAudioRecordReadError:" + str);
        IAudioRecordEventHandler iAudioRecordEventHandler = this.c;
        if (iAudioRecordEventHandler == null) {
            return;
        }
        iAudioRecordEventHandler.onReadError(str);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.f
    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.a("AdapterEvent", "onCameraFreeze: " + str + " ,captureType: " + str2);
        this.b.onCaptureFreezed(str, str2, this.f23029a.x.x());
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.f
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        TrtcLog.d("AdapterEvent", "onCameraSwitchDone: " + z);
        this.b.onCameraSwitchDone(z);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.f
    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else {
            this.b.onUserPublishVideo(str);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.d
    public void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98586481", new Object[]{this, str, str2});
        } else {
            this.b.onMessage(str2, str);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void a(boolean z, ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584761be", new Object[]{this, new Boolean(z), arrayList});
            return;
        }
        TrtcLog.d("AdapterEvent", "onMuteRemoteAudio mute:" + z + " remoteStreamIds: " + arrayList);
        this.b.onMuteRemoteAudio(z, arrayList);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.b
    public void a(boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1883b7", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        TrtcLog.d("AdapterEvent", "onLocalStreamStatusUpdate isAdd:" + z + " ,width: " + i + " ,height: " + i2 + " ,fps: " + i3);
        this.b.onLocalStreamStatusUpdate(z, i, i2, i3);
    }
}
