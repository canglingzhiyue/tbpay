package com.taobao.artc.internal;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.AConstants;
import com.taobao.artc.api.ArtcAttendee;
import com.taobao.artc.api.ArtcEngineEventHandler;
import com.taobao.artc.api.ArtcException;
import com.taobao.artc.api.ArtcStats;
import com.taobao.artc.api.IArtcEngineEventHandler;
import com.taobao.artc.api.LocalVideoStats;
import com.taobao.artc.api.RemoteVideoStats;
import com.taobao.artc.utils.ArtcLog;
import com.taobao.artc.utils.a;
import com.taobao.artc.utils.b;
import com.taobao.trtc.api.TrtcDefines;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes6.dex */
public class ArtcEngineEventProxy extends ArtcEngineEventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public IArtcEngineEventHandler mIArtcEngineEventHandler = null;
    public ArtcEngineEventHandler mArtcEngineEventHandler = null;
    public final String TAG = "ArtcEngineEvent";

    static {
        kge.a(1034368140);
    }

    public static /* synthetic */ Object ipc$super(ArtcEngineEventProxy artcEngineEventProxy, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void setIArtcEngineEventHandler(IArtcEngineEventHandler iArtcEngineEventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e0f58d7", new Object[]{this, iArtcEngineEventHandler});
        } else {
            this.mIArtcEngineEventHandler = iArtcEngineEventHandler;
        }
    }

    public void setArtcEngineEventHandler(ArtcEngineEventHandler artcEngineEventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eddb627", new Object[]{this, artcEngineEventHandler});
        } else {
            this.mArtcEngineEventHandler = artcEngineEventHandler;
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onSignalChannelAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b87294", new Object[]{this});
            return;
        }
        b.a("onSignalChannelAvailable");
        ArtcLog.e("ArtcEngineEvent", "onSignalChannelAvailable", new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onSignalChannelAvailable();
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onSignalChannelAvailable();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onCreateChannelSuccess(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52bbc66c", new Object[]{this, str});
            return;
        }
        b.a("onCreateChannelSuccess, channelId: " + str);
        ArtcLog.e("ArtcEngineEvent", "onCreateChannelSuccess, channelId: " + str, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onCreateChannelSuccess(str);
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onCreateChannelSuccess(str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onChannelClosed2(final String str, final String str2, final int i, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4869c31a", new Object[]{this, str, str2, new Integer(i), str3, str4});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onChannelClosed, channelId: " + str + ", reason: " + str2, new Object[0]);
        b.a("onChannelClosed, channelId: " + str + ", reason: " + str2);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onChannelClosed2(str, str2, i, str3, str4);
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onChannelClosed(str, str2, i);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onChannelClosed(final String str, final String str2, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c63d998", new Object[]{this, str, str2, new Integer(i)});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                        ArtcEngineEventProxy.this.mArtcEngineEventHandler.onChannelClosed(str, str2, i);
                    } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                    } else {
                        ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onChannelClosed(str, str2, i);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onJoinChannelSuccess(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7642c373", new Object[]{this, new Integer(i)});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onJoinChannelSuccess, elapsed: " + i, new Object[0]);
        b.a("onJoinChannelSuccess, elapsed: " + i);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onJoinChannelSuccess(i);
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onJoinChannelSuccess(i);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onLocalSpeakingStatus(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62a151f", new Object[]{this, new Boolean(z)});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onLocalSpeakingStatus, enable: " + z, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onLocalSpeakingStatus(z);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onRemoteSpeakingStreams(final ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2744305", new Object[]{this, arrayList});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                    } else {
                        ArtcEngineEventProxy.this.mArtcEngineEventHandler.onRemoteSpeakingStreams(arrayList);
                    }
                }
            });
        }
    }

    public void onChannelMsgBroadcastRsp(final String str, final int i, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d7bba5", new Object[]{this, str, new Integer(i), str2, str3, str4});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onChannelMsgBroadcastRsp, channelId: " + str + " ,resultCode: " + i + " ,resultMessage: " + str2 + " ,message: " + str3 + " ,extension: " + str4, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onChannelMsgBroadcast(str, i, str2, str3, str4);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onChannelMsgBroadcastNotify(final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e4711c", new Object[]{this, str, str2, str3, str4});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onChannelMsgBroadcastNotify, channelId: " + str + " ,extension: " + str2 + " ,message: " + str3 + " ,promoterUserId: " + str4, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onChannelMsgBroadcastNotify(str, str2, str3, str4);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onLiveChannelIdUpdate(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfb0de8d", new Object[]{this, str});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onLiveChannelIdUpdate, channelId: " + str, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onLiveChannelIdUpdate(str);
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onLiveChannelIdUpdate(str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onUserJoinedChannel2(final ArtcAttendee artcAttendee, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("886ee321", new Object[]{this, artcAttendee, str, str2});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onUserJoinedChannel， remoteUserId： " + artcAttendee.uid, new Object[0]);
        b.a("onUserJoinedChannel, remoteUserId: " + artcAttendee.uid);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onUserJoinedChannel2(artcAttendee, str, str2);
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onUserJoinedChannel(artcAttendee.uid);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onUserLeftChannel2(final String str, final int i, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51607e86", new Object[]{this, str, new Integer(i), str2, str3});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onUserLeftChannel, remoteUserId: " + str + ", reason: " + i, new Object[0]);
        b.a("onUserLeftChannel, remoteUserId: " + str + ", reason: " + i);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onUserLeftChannel2(str, i, str2, str3);
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onUserLeftChannel(str, i);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onLeaveChannel2(final ArtcStats artcStats, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ac388f9", new Object[]{this, artcStats, str, str2});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onLeaveChannel ... ", new Object[0]);
        b.a("onLeaveChannel ... ");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onLeaveChannel2(artcStats, str, str2);
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onLeaveChannel(artcStats);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onUserOffline(final String str, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435be239", new Object[]{this, str, new Integer(i)});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onUserOffline, remoteUserId: " + str, new Object[0]);
        b.a("onUserOffline, remoteUserId: " + str);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onUserOffline(str, i);
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onUserOffline(str, i);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onError(final AConstants.ArtcErrorEvent artcErrorEvent, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("685e62c9", new Object[]{this, artcErrorEvent, new Integer(i)});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onError, errorEvent: " + artcErrorEvent.name() + ", errorCode: " + i, new Object[0]);
        b.a("onError, errorEvent: " + artcErrorEvent.name() + ", errorCode: " + i);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onError(artcErrorEvent, i);
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onError(artcErrorEvent, i);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onCaptureFreezed(final String str, final String str2, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a0d0493", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onCaptureFreezed, errorDescription: " + str + ",captureType: " + str2 + " ,isMultiCall: " + z, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onCaptureFreezed(str, str2, z);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onError(final AConstants.ArtcErrorEventNew artcErrorEventNew, final int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42116f7", new Object[]{this, artcErrorEventNew, new Integer(i), str});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onError, errorEventNew: " + artcErrorEventNew.name() + ", errorCode: " + i + ", errorMsg: " + str, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.17
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onError(artcErrorEventNew, i, str);
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onError(artcErrorEventNew, i, str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onAudioRouteChanged(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a6119a", new Object[]{this, new Integer(i)});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onAudioRouteChanged, routing: " + AConstants.ArtcAudioRouteDevice.values()[i].name(), new Object[0]);
        b.a("onAudioRouteChanged, routing: " + AConstants.ArtcAudioRouteDevice.values()[i].name());
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.18
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onAudioRouteChanged(i);
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onAudioRouteChanged(i);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onAudioQuality(final int i, final short s, final short s2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82536d34", new Object[]{this, new Integer(i), new Short(s), new Short(s2)});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.19
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                        ArtcEngineEventProxy.this.mArtcEngineEventHandler.onAudioQuality(i, s, s2);
                    } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                    } else {
                        ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onAudioQuality(i, s, s2);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onRtcStats(final ArtcStats artcStats) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6bb70af", new Object[]{this, artcStats});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.20
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                        ArtcEngineEventProxy.this.mArtcEngineEventHandler.onRtcStats(artcStats);
                    } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                    } else {
                        ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onRtcStats(artcStats);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onTrtcLocalStats(final TrtcDefines.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5effaae", new Object[]{this, iVar});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.21
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                        ArtcEngineEventProxy.this.mArtcEngineEventHandler.onTrtcLocalStats(iVar);
                    } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                    } else {
                        ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onTrtcLocalStats(iVar);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onLocalVideoStats(final LocalVideoStats localVideoStats) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b22c5ec", new Object[]{this, localVideoStats});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.22
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                        ArtcEngineEventProxy.this.mArtcEngineEventHandler.onLocalVideoStats(localVideoStats);
                    } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                    } else {
                        ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onLocalVideoStats(localVideoStats);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onRemoteVideoStats(final RemoteVideoStats remoteVideoStats) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a816a4", new Object[]{this, remoteVideoStats});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.23
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                        ArtcEngineEventProxy.this.mArtcEngineEventHandler.onRemoteVideoStats(remoteVideoStats);
                    } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                    } else {
                        ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onRemoteVideoStats(remoteVideoStats);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onConnectionInterrupted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d8fdec", new Object[]{this});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onConnectionInterrupted", new Object[0]);
        b.a("onConnectionInterrupted");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.24
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onConnectionInterrupted();
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onConnectionInterrupted();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onConnectionConnected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9132b3f3", new Object[]{this});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onConnectionConnected", new Object[0]);
        b.a("onConnectionConnected");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.25
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onConnectionConnected();
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onConnectionConnected();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onConnectionLost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd46eee8", new Object[]{this});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onConnectionLost", new Object[0]);
        b.a("onConnectionLost");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.26
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onConnectionLost();
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onConnectionLost();
                }
            }
        });
    }

    public void onFirstLocalVideoFrame(final int i, final int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75129810", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        b.a("onFirstLocalVideoFrame, width: " + i + ", height: " + i2 + ", elapsed:" + i3);
        ArtcLog.e("ArtcEngineEvent", "onFirstLocalVideoFrame, width: " + i + ", height: " + i2 + ", elapsed:" + i3, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.27
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onFirstLocalVideoFrame(i, i2);
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onFirstLocalVideoFrame(i, i2);
                }
            }
        });
    }

    public void onFirstRemoteVideoFrame(final int i, final int i2, final String str, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a01d9749", new Object[]{this, new Integer(i), new Integer(i2), str, new Integer(i3)});
            return;
        }
        b.a("onFirstRemoteVideoFrame, width: " + i + ", height: " + i2 + ", elapsed: " + i3 + ", userId: " + str);
        ArtcLog.e("ArtcEngineEvent", "onFirstRemoteVideoFrame, width: " + i + ", height: " + i2 + ", elapsed: " + i3 + ", userId: " + str, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.28
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onFirstRemoteVideoFrame(i, i2, str);
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onFirstRemoteVideoFrame(i, i2, str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onBlueToothDeviceDisconnected() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c28207", new Object[]{this});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onBlueToothDeviceDisconnected", new Object[0]);
        b.a("onBlueToothDeviceDisconnected");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.29
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onBlueToothDeviceDisconnected();
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onBlueToothDeviceDisconnected();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onBlueToothDeviceconnected() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e1748b", new Object[]{this});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onBlueToothDeviceconnected", new Object[0]);
        b.a("onBlueToothDeviceconnected");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.30
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onBlueToothDeviceconnected();
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onBlueToothDeviceconnected();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onCall2(final String str, final String str2, final String str3, final int i, final String str4, final String str5) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9757ccfd", new Object[]{this, str, str2, str3, new Integer(i), str4, str5});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onCall, channelId: " + str + ", callId: " + str2 + ", userId: " + str3 + ", result: " + i, new Object[0]);
        b.a("onCall, channelId: " + str + ", callId: " + str2 + ", userId: " + str3 + ", result:" + i);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.31
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onCall2(str, str2, str3, i, str4, str5);
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onCall(str, str2, str3, i);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onCalled2(final String str, final String str2, final String str3, final int i, final int i2, final int i3, final String str4, final String str5) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e135e0bc", new Object[]{this, str, str2, str3, new Integer(i), new Integer(i2), new Integer(i3), str4, str5});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onCalled, channelId: " + str + ", userId: " + str3 + ", isVideoCall: " + i2 + ", videoProfile: " + i3 + ", role: " + i, new Object[0]);
        b.a("onCalled, channelId: " + str + ", callId: " + str2 + ", userId: " + str3 + ", role: " + i + ", isVideoCall:" + i2);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.32
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onCalled2(str, str2, str3, i, i2, i3, str4, str5);
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onCalled(str, str2, str3, i, i2, i3);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onInvited2(final String str, final String str2, final int i, final String str3, final String str4) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11666906", new Object[]{this, str, str2, new Integer(i), str3, str4});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onInvited, channelId: " + str + ", userId: " + str2 + ", isVideoCall: " + i, new Object[0]);
        b.a("onInvited, channelId: " + str + ", userId: " + str2 + ", isVideoCall: " + i);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.33
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onInvited2(str, str2, i, str3, str4);
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onInvited(str, str2, i);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onAnswered2(final String str, final String str2, final String str3, final int i, final int i2, final String str4, final String str5) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6598af", new Object[]{this, str, str2, str3, new Integer(i), new Integer(i2), str4, str5});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onAnswered,  role: " + i + ", answer: " + i2, new Object[0]);
        b.a("onAnswered, channelId: " + str + ", callId: " + str2 + ", userId: " + str3 + ", role: " + i + ", answer:" + i2);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.34
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onAnswered2(str, str2, str3, i, i2, str4, str5);
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onAnswered(str, str2, str3, i, i2);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onAnswer2(final String str, final String str2, final int i, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4772627", new Object[]{this, str, str2, new Integer(i), str3, str4});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onAnswer ... ", new Object[0]);
        b.a("onAnswer, channelId: " + str + ", callId: " + str2 + ", answer: " + i);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.35
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onAnswer2(str, str2, i, str3, str4);
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onAnswer(str, str2, i);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onKicked2(final String str, final String str2, final String str3, final String str4) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb91d13d", new Object[]{this, str, str2, str3, str4});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onKicked,  channelId: " + str + ", remoteUserId: " + str2, new Object[0]);
        b.a("onKicked, channelId: " + str + ", remoteUserId:" + str2);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.36
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onKicked2(str, str2, str3, str4);
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onKicked(str, str2);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onCanceledCall2(final String str, final String str2, final int i, final String str3, final String str4) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5bf1200", new Object[]{this, str, str2, new Integer(i), str3, str4});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onCancelCall,  channelId: " + str + ", remoteUserId: " + str2, new Object[0]);
        b.a("onCancelCall,  channelId: " + str + ", remoteUserId: " + str2);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.37
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onCanceledCall2(str, str2, i, str3, str4);
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onCancelCall(str, str2);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onCallTimeout() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c61a304b", new Object[]{this});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onCallTimeout", new Object[0]);
        b.a("onCallTimeout");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.38
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onCallTimeout();
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onCallTimeout();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onLastmileQuality(final int i) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("905fc987", new Object[]{this, new Integer(i)});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.39
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                        ArtcEngineEventProxy.this.mArtcEngineEventHandler.onLastmileQuality(i);
                    } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                    } else {
                        ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onLastmileQuality(i);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onDegradeToTcp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89945196", new Object[]{this});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.40
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                    } else {
                        ArtcEngineEventProxy.this.mArtcEngineEventHandler.onDegradeToTcp();
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onCameraSwitchDone(final boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c85993", new Object[]{this, new Boolean(z)});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onCameraSwitchDone, isFrontCamera:" + z, new Object[0]);
        b.a("onCameraSwitchDone, isFrontCamera:" + z);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.41
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onCameraSwitchDone(z);
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onCameraSwitchDone(z);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onChannelIdUpdated(final String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcf45eed", new Object[]{this, str});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onChannelIdUpdated, channel_id:" + str, new Object[0]);
        b.a("onChannelIdUpdated, channel_id:" + str);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.42
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onChannelIdUpdated(str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler, com.taobao.artc.api.IArtcEngineEventHandler
    public void onUserPublishVideo(final String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44b95a27", new Object[]{this, str});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onUserPublishVideo, info:", str);
        b.a("onUserPublishVideo, info:" + str);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.43
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler != null) {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onUserPublishVideo(str);
                } else if (ArtcEngineEventProxy.this.mIArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mIArtcEngineEventHandler.onUserPublishVideo(str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onUserUnpublishVideo(final String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c08c3000", new Object[]{this, str});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onUserUnpublishVideo, uid:", str);
        b.a("onUserUnpublishVideo, uid:" + str);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.44
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onUserUnpublishVideo(str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onCreateBackgroundView() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39526b15", new Object[]{this});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onCreateBackgroundView", new Object[0]);
        b.a("onCreateBackgroundView");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.45
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onCreateBackgroundView();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onShowBackgroundView() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("996dba96", new Object[]{this});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onShowBackgroundView", new Object[0]);
        b.a("onShowBackgroundView");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.46
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onShowBackgroundView();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onHideBackgroundView() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7458959b", new Object[]{this});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onHideBackgroundView", new Object[0]);
        b.a("onHideBackgroundView");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.47
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onHideBackgroundView();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onRinging(final String str, final String str2, final String str3, final String str4, final String str5) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68a374c", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onPstnRinging, channelId: " + str + ", callId: " + str2 + ", userId: " + str2 + ", deviceId: " + str4, new Object[0]);
        b.a("onPstnRinging, channelId: " + str + ", callId: " + str2 + ", userId: " + str2 + ", deviceId: " + str4);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.48
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onRinging(str, str2, str3, str4, str5);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onUserMutedLocal(final String str, final String str2, final int i, final boolean z, final String str3) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c5bd200", new Object[]{this, str, str2, new Integer(i), new Boolean(z), str3});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onUserMutedLocal, channelId: " + str + ", userId: " + str2, new Object[0]);
        b.a("onUserMutedLocal, channelId: " + str + ", userId: " + str2);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.49
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onUserMutedLocal(str, str2, i, z, str3);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onUserSwitchedMedia(final String str, final String str2, final int i, final boolean z, final String str3) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6930307d", new Object[]{this, str, str2, new Integer(i), new Boolean(z), str3});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onUserSwitchedMedia, channelId: " + str + ", userId: " + str2, new Object[0]);
        b.a("onUserSwitchedMedia, channelId: " + str + ", userId: " + str2);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.50
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onUserSwitchedMedia(str, str2, i, z, str3);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onSwitchMedia(final String str, final String str2, final int i, final boolean z, final String str3) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4bed087", new Object[]{this, str, str2, new Integer(i), new Boolean(z), str3});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "OnUserSwitchMedia, channelId: " + str + ", userId: " + str2, new Object[0]);
        b.a("onUserSwitchMedia, channelId: " + str + ", userId: " + str2);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.51
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onSwitchMedia(str, str2, i, z, str3);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onLeaveChannelSuccess(final int i) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e176aa4", new Object[]{this, new Integer(i)});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onLeaveChannelSuccess, duration: " + i, new Object[0]);
        b.a("onLeaveChannelSuccess, duration: " + i);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.52
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onLeaveChannelSuccess(i);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onUnInitializeSuccess(final int i) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f27827e1", new Object[]{this, new Integer(i)});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onUnInitializeSuccess, duration: " + i, new Object[0]);
        b.a("onUnInitializeSuccess, duration: " + i);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.53
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onUnInitializeSuccess(i);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onUserDisconnected(final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b17d4", new Object[]{this, str, str2, str3, str4});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onUserDisconnected,  channelId: " + str + ", remoteUserId: " + str2, new Object[0]);
        b.a("onUserDisconnected,  channelId: " + str + ", remoteUserId: " + str2);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.54
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onUserDisconnected(str, str2, str3, str4);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onRecordFromFileEos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810a14ba", new Object[]{this});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onRecordFromFileEos", new Object[0]);
        b.a("onRecordFromFileEos");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.55
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onRecordFromFileEos();
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onFirstRemoteMediaReported(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c47cf1", new Object[]{this, str});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onFirstRemoteMediaReported, " + str, new Object[0]);
        b.a("onFirstRemoteMediaReported, " + str);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.56
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onFirstRemoteMediaReported(str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onAttendeesInChannel(final String str, final ArtcAttendee[] artcAttendeeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a824a4", new Object[]{this, str, artcAttendeeArr});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onAttendeesInChannel, " + str, new Object[0]);
        b.a("onAttendeesInChannel, " + str);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.57
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onAttendeesInChannel(str, artcAttendeeArr);
                }
            }
        });
    }

    private void executeEvent(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("348ef2aa", new Object[]{this, runnable});
        } else {
            a.a(runnable);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onJoinCallMutli(final int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800f8304", new Object[]{this, new Integer(i), str});
            return;
        }
        b.a("onJoinCallMutli, resultCode: " + i + ", resultMsg: " + str);
        ArtcLog.e("ArtcEngineEvent", "onJoinCallMutli, resultCode: " + i + ", resultMsg: " + str, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.58
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onJoinCallMutli(i, str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onUserJoinedChannelMutli(final ArrayList<TrtcDefines.m> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35de6cca", new Object[]{this, arrayList});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.59
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                    } else {
                        ArtcEngineEventProxy.this.mArtcEngineEventHandler.onUserJoinedChannelMutli(arrayList);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onUserLeftChannelMutli(final ArrayList<TrtcDefines.m> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2024304c", new Object[]{this, arrayList});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.60
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                    } else {
                        ArtcEngineEventProxy.this.mArtcEngineEventHandler.onUserLeftChannelMutli(arrayList);
                    }
                }
            });
        }
    }

    public void onFirstRemoteVideoFrameMutli(final int i, final int i2, final String str, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ed4cf2", new Object[]{this, new Integer(i), new Integer(i2), str, new Integer(i3)});
            return;
        }
        b.a("onFirstRemoteVideoFrameMutli, width: " + i + ", height: " + i2 + ", elapsed: " + i3 + ", userId: " + str);
        ArtcLog.e("ArtcEngineEvent", "onFirstRemoteVideoFrameMutli, width: " + i + ", height: " + i2 + ", elapsed: " + i3 + ", userId: " + str, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.61
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onFirstRemoteVideoFrameMutli(i, i2, str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onFirstRemoteAudioFrameMutli(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53d3d4ec", new Object[]{this, str});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onFirstRemoteAudioFrameMutli, uid: " + str, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.62
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onFirstRemoteAudioFrameMutli(str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onFirstRemoteVideoFrameTimeoutMutli(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b048a2", new Object[]{this, str});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onFirstRemoteVideoFrameTimeoutMutli, uid: " + str, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.63
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onFirstRemoteVideoFrameTimeoutMutli(str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onFirstRemoteAudioFrameTimeoutMutli(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eddd80e7", new Object[]{this, str});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onFirstRemoteAudioFrameTimeoutMutli, uid: " + str, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.64
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onFirstRemoteAudioFrameTimeoutMutli(str);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onCallMutli(final ArrayList<TrtcDefines.c> arrayList, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("210ff3a1", new Object[]{this, arrayList, str});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.65
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                    } else {
                        ArtcEngineEventProxy.this.mArtcEngineEventHandler.onCallMutli(arrayList, str);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onLocalStreamUpdated(final int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3617597", new Object[]{this, new Integer(i), str});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.66
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                    } else {
                        ArtcEngineEventProxy.this.mArtcEngineEventHandler.onLocalStreamUpdated(i, str);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onCalledMutli(final String str, final String str2, final int i, final String str3, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d78038ef", new Object[]{this, str, str2, new Integer(i), str3, new Boolean(z)});
            return;
        }
        String str4 = "onCalledMutli, callId: " + str + ", remoteUserId: " + str2 + ", remoteRole: " + i + ", extension: " + str3 + ", isMutliChatMode: " + z;
        ArtcLog.e("ArtcEngineEvent", str4, new Object[0]);
        b.a(str4);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.67
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onCalledMutli(str, str2, i, str3, z);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onMuteRemoteAudio(final boolean z, final ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61f99e15", new Object[]{this, new Boolean(z), arrayList});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.68
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                    } else {
                        ArtcEngineEventProxy.this.mArtcEngineEventHandler.onMuteRemoteAudio(z, arrayList);
                    }
                }
            });
        }
    }

    public void onLocalStreamStatusUpdate(boolean z, final int i, final int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98900e3d", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.69
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                    } else {
                        ArtcEngineEventProxy.this.mArtcEngineEventHandler.onUpdateSubCaptureSize(i, i2);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onAnsweredMutli(final String str, final int i, final int i2, final String str2, final boolean z, final String str3) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1fa2cd6", new Object[]{this, str, new Integer(i), new Integer(i2), str2, new Boolean(z), str3});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onAnsweredMutli,  remoteUserId: " + str + ", role: " + i + ", answer: " + i2 + ", extension: " + str2 + ", isMutliChatMode: " + z + ", chatChannelId: " + str3, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.70
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onAnsweredMutli(str, i, i2, str2, z, str3);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onAnswerMutli(final String str, final int i, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b745d5a", new Object[]{this, str, new Integer(i), str2, str3});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.71
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                    } else {
                        ArtcEngineEventProxy.this.mArtcEngineEventHandler.onAnswerMutli(str, i, str2, str3);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onKickedMutli(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5661ef6a", new Object[]{this, str, str2, str3});
        } else {
            executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.72
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                    } else {
                        ArtcEngineEventProxy.this.mArtcEngineEventHandler.onKickedMutli(str, str2, str3);
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onMessage(final String str, final String str2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49fb43", new Object[]{this, str, str2});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onMessage,  msg len: " + str.length() + ", remoteUserId: " + str2, new Object[0]);
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.73
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onMessage(str, str2);
                }
            }
        });
    }

    @Override // com.taobao.artc.api.ArtcEngineEventHandler
    public void onCallTimeoutMutli(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("428f9fb6", new Object[]{this, str});
            return;
        }
        ArtcLog.e("ArtcEngineEvent", "onCallTimeoutMutli", new Object[0]);
        b.a("onCallTimeoutMutli");
        executeEvent(new Runnable() { // from class: com.taobao.artc.internal.ArtcEngineEventProxy.74
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ArtcEngineEventProxy.this.mArtcEngineEventHandler == null) {
                } else {
                    ArtcEngineEventProxy.this.mArtcEngineEventHandler.onCallTimeoutMutli(str);
                }
            }
        });
    }
}
