package com.taobao.tbliveweexvideo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaAdapteManager;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.taobaoavsdk.util.b;
import com.taobao.tbliveweexvideo.c;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.Constants;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXComponentProp;
import com.taobao.weex.ui.component.WXVContainer;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class TBLiveWeexVideoComponent extends WXComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long MEDIA_ERR_ABORTED = 1;
    private static final long MEDIA_ERR_DECODE = 3;
    private static final long MEDIA_ERR_NETWORK = 2;
    private static final long MEDIA_ERR_SRC_NOT_SUPPORTED = 4;
    private static final String ON_LIVE_START_ACTION = "com.taobao.taolive.start";
    private static final String ON_VIDEO_START_ACTION = "com.taobao.avplayer.start";
    private static final String TAG = "TBLiveWeexVideoComponent";
    private static final String WEEX_NATIVE_SHOP_NAME = "com.alibaba.triver.triver_shop.newShop.NativeShop";
    private static final String WEEX_SHOP_ACTIVITY_NAME = "com.alibaba.triver.triver_shop.newShop.ShopActivity";
    private static final String WEEX_VIDEO_EVENT_CANPLAYTHROUGH = "canplaythrough";
    private static final String WEEX_VIDEO_EVENT_COMPLETED = "ended";
    private static final String WEEX_VIDEO_EVENT_ERROR = "error";
    private static final String WEEX_VIDEO_EVENT_FAIL = "fail";
    private static final String WEEX_VIDEO_EVENT_FINISHED = "finish";
    private static final String WEEX_VIDEO_EVENT_FIRST_FRAME_RENDERED = "firstvideoframerendered";
    private static final String WEEX_VIDEO_EVENT_PAUSED = "pause";
    private static final String WEEX_VIDEO_EVENT_PLAYING = "playing";
    private static final String WEEX_VIDEO_EVENT_STALLED = "stalled";
    private static final String WEEX_VIDEO_EVENT_STARTED = "start";
    private static final String WEEX_VIDEO_EVENT_TIMEUPDATE = "timeupdate";
    private boolean hasRegistered;
    private BroadcastReceiver mExternReceiver;
    private boolean mIsPlayingBeforeActivityPause;
    private boolean mReceiveBroadcast;
    private boolean mSendBroadcast;
    private c mVideoView;

    private long covertErrCode(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ddecd9c", new Object[]{this, new Long(j)})).longValue();
        }
        if (j == -5 || j == -60) {
            return 2L;
        }
        if (j == -10000) {
            return 3L;
        }
        if (j != -1128613112 && j != -1296385272 && j != -1330794744) {
            return j;
        }
        return 4L;
    }

    public static /* synthetic */ Object ipc$super(TBLiveWeexVideoComponent tBLiveWeexVideoComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case 196973982:
                super.notifyAppearStateChange((String) objArr[0], (String) objArr[1]);
                return null;
            case 474982114:
                super.onActivityResume();
                return null;
            case 1692842255:
                super.onActivityPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @WXComponentProp(name = MusLiveVideo.ATTR_POSTER)
    public void setPoster(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846fd9a0", new Object[]{this, str});
        }
    }

    public static /* synthetic */ c access$000(TBLiveWeexVideoComponent tBLiveWeexVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("2371cf99", new Object[]{tBLiveWeexVideoComponent}) : tBLiveWeexVideoComponent.mVideoView;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]) : TAG;
    }

    public static /* synthetic */ long access$200(TBLiveWeexVideoComponent tBLiveWeexVideoComponent, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b8e85eef", new Object[]{tBLiveWeexVideoComponent, new Long(j)})).longValue() : tBLiveWeexVideoComponent.covertErrCode(j);
    }

    public static /* synthetic */ boolean access$300(TBLiveWeexVideoComponent tBLiveWeexVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eaf2804c", new Object[]{tBLiveWeexVideoComponent})).booleanValue() : tBLiveWeexVideoComponent.mSendBroadcast;
    }

    public static /* synthetic */ void access$400(TBLiveWeexVideoComponent tBLiveWeexVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f64ba7", new Object[]{tBLiveWeexVideoComponent});
        } else {
            tBLiveWeexVideoComponent.onLiveStartBroadcast();
        }
    }

    public TBLiveWeexVideoComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        this.mSendBroadcast = false;
        this.mReceiveBroadcast = false;
        this.hasRegistered = false;
        this.mExternReceiver = new BroadcastReceiver() { // from class: com.taobao.tbliveweexvideo.TBLiveWeexVideoComponent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String action = intent.getAction();
                if (StringUtils.isEmpty(action) || !action.equals("com.taobao.avplayer.start") || TBLiveWeexVideoComponent.access$000(TBLiveWeexVideoComponent.this) == null) {
                    return;
                }
                TBLiveWeexVideoComponent.access$000(TBLiveWeexVideoComponent.this).i();
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.taobao.weex.ui.component.WXComponent
    /* renamed from: initComponentHostView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View mo1592initComponentHostView(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbliveweexvideo.TBLiveWeexVideoComponent.mo1592initComponentHostView(android.content.Context):android.view.View");
    }

    private void initVideoView(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88ba049", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        String ak = getInstance() != null ? getInstance().ak() : "unknown";
        com.taobao.taobaoavsdk.widget.media.c cVar = null;
        String str6 = "video";
        if ("live".equals(str)) {
            if (!StringUtils.isEmpty(str2)) {
                cVar = new com.taobao.taobaoavsdk.widget.media.c(str2);
                cVar.y = str3;
                cVar.B = str4;
                cVar.q = "MediaLive";
                cVar.C = str5;
            }
            this.mVideoView = new e(getContext(), true, ak, cVar);
            str6 = "live";
        } else if (str6.equals(str)) {
            this.mVideoView = new e(getContext(), false, ak, null);
        } else if ("interact".equals(str)) {
            this.mVideoView = new d(getContext());
            str6 = "interact";
        } else {
            this.mVideoView = new e(getContext(), false, ak, null);
        }
        this.mVideoView.a(new c.a() { // from class: com.taobao.tbliveweexvideo.TBLiveWeexVideoComponent.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tbliveweexvideo.c.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                TBLiveWeexVideoComponent.access$100();
                if (TBLiveWeexVideoComponent.this.getEvents().contains(TBLiveWeexVideoComponent.WEEX_VIDEO_EVENT_COMPLETED)) {
                    WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), TBLiveWeexVideoComponent.WEEX_VIDEO_EVENT_COMPLETED);
                }
                if (!TBLiveWeexVideoComponent.this.getEvents().contains("finish")) {
                    return;
                }
                WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), "finish");
            }

            @Override // com.taobao.tbliveweexvideo.c.a
            public void a(long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
                    return;
                }
                TBLiveWeexVideoComponent.access$100();
                HashMap hashMap = new HashMap();
                hashMap.put("code", Long.valueOf(TBLiveWeexVideoComponent.access$200(TBLiveWeexVideoComponent.this, j)));
                if (TBLiveWeexVideoComponent.this.getEvents().contains("error")) {
                    WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), "error", hashMap);
                }
                if (!TBLiveWeexVideoComponent.this.getEvents().contains("fail")) {
                    return;
                }
                WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), "fail", hashMap);
            }

            @Override // com.taobao.tbliveweexvideo.c.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                TBLiveWeexVideoComponent.access$100();
                if (TBLiveWeexVideoComponent.access$300(TBLiveWeexVideoComponent.this)) {
                    TBLiveWeexVideoComponent.access$400(TBLiveWeexVideoComponent.this);
                }
                if (!TBLiveWeexVideoComponent.this.getEvents().contains("playing")) {
                    return;
                }
                WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), "playing");
            }

            @Override // com.taobao.tbliveweexvideo.c.a
            public void c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                    return;
                }
                TBLiveWeexVideoComponent.access$100();
                if (!TBLiveWeexVideoComponent.this.getEvents().contains("stalled")) {
                    return;
                }
                WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), "stalled");
            }

            @Override // com.taobao.tbliveweexvideo.c.a
            public void d() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("596b2eb", new Object[]{this});
                    return;
                }
                TBLiveWeexVideoComponent.access$100();
                if (!TBLiveWeexVideoComponent.this.getEvents().contains("pause")) {
                    return;
                }
                WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), "pause");
            }

            @Override // com.taobao.tbliveweexvideo.c.a
            public void e() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a4ca6c", new Object[]{this});
                    return;
                }
                TBLiveWeexVideoComponent.access$100();
                if (TBLiveWeexVideoComponent.this.getEvents().contains(TBLiveWeexVideoComponent.WEEX_VIDEO_EVENT_CANPLAYTHROUGH)) {
                    WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), TBLiveWeexVideoComponent.WEEX_VIDEO_EVENT_CANPLAYTHROUGH);
                }
                if (!TBLiveWeexVideoComponent.this.getEvents().contains("start")) {
                    return;
                }
                WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), "start");
            }

            @Override // com.taobao.tbliveweexvideo.c.a
            public void f() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5b2e1ed", new Object[]{this});
                    return;
                }
                TBLiveWeexVideoComponent.access$100();
                if (TBLiveWeexVideoComponent.this.getEvents().contains(TBLiveWeexVideoComponent.WEEX_VIDEO_EVENT_CANPLAYTHROUGH)) {
                    WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), TBLiveWeexVideoComponent.WEEX_VIDEO_EVENT_CANPLAYTHROUGH);
                }
                if (!TBLiveWeexVideoComponent.this.getEvents().contains("start")) {
                    return;
                }
                WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), "start");
            }

            @Override // com.taobao.tbliveweexvideo.c.a
            public void g() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c0f96e", new Object[]{this});
                    return;
                }
                TBLiveWeexVideoComponent.access$100();
                if (!TBLiveWeexVideoComponent.this.getEvents().contains(TBLiveWeexVideoComponent.WEEX_VIDEO_EVENT_FIRST_FRAME_RENDERED)) {
                    return;
                }
                WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), TBLiveWeexVideoComponent.WEEX_VIDEO_EVENT_FIRST_FRAME_RENDERED);
            }
        });
        HashMap hashMap = new HashMap();
        hashMap.put("url", ak);
        hashMap.put("type", str6);
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_WeexVideo", 2201, "Page_WeexVideo_Initialization", "", "0", hashMap).build());
    }

    @WXComponentProp(name = "src")
    public void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
            return;
        }
        String str2 = "setSrc-------src = " + str;
        c cVar = this.mVideoView;
        if (cVar == null) {
            return;
        }
        cVar.a(str);
    }

    @WXComponentProp(name = "autoplay")
    public void setAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
            return;
        }
        String str = "setAutoPlay-------autoPlay = " + z;
        c cVar = this.mVideoView;
        if (cVar == null) {
            return;
        }
        cVar.a(z);
    }

    @WXComponentProp(name = "controls")
    public void setControls(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b78a5cf5", new Object[]{this, new Boolean(z)});
            return;
        }
        String str = "setControls-------controls = " + z;
        c cVar = this.mVideoView;
        if (cVar == null) {
            return;
        }
        cVar.b(z);
    }

    @WXComponentProp(name = "loop")
    public void setLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d0b0c7", new Object[]{this, new Boolean(z)});
            return;
        }
        String str = "setLoop-------loop = " + z;
        c cVar = this.mVideoView;
        if (cVar == null) {
            return;
        }
        cVar.d(z);
    }

    @WXComponentProp(name = "size")
    public void setSize(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908775d4", new Object[]{this, str});
            return;
        }
        String str2 = "setSize-------size = " + str;
        c cVar = this.mVideoView;
        if (cVar == null) {
            return;
        }
        cVar.b(str);
    }

    @WXComponentProp(name = "landscape")
    public void setLandscape(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae57e54", new Object[]{this, new Boolean(z)});
            return;
        }
        String str = "setLandscape-------landscape = " + z;
    }

    @WXComponentProp(name = Constants.Name.PLAY_STATUS)
    public void setPlayStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db5ead9", new Object[]{this, str});
            return;
        }
        String str2 = "setPlayStatus-------playStatus = " + str;
        if (this.mVideoView == null) {
            return;
        }
        if ("pause".equals(str)) {
            this.mVideoView.g();
        } else if (!"play".equals(str)) {
        } else {
            this.mVideoView.h();
        }
    }

    @JSMethod
    public void setCurrentTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f105f79", new Object[]{this, new Long(j)});
            return;
        }
        long j2 = j * 1000;
        c cVar = this.mVideoView;
        if (cVar == null) {
            return;
        }
        cVar.a(j2);
    }

    @JSMethod
    public void getCurrentTime(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e755d9f1", new Object[]{this, jSCallback});
        } else if (this.mVideoView == null || jSCallback == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("result", Long.valueOf(this.mVideoView.c()));
            jSCallback.invoke(hashMap);
        }
    }

    @JSMethod
    public void setVolume(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942b681", new Object[]{this, new Long(j)});
            return;
        }
        c cVar = this.mVideoView;
        if (cVar == null) {
            return;
        }
        cVar.a((float) j);
    }

    private void onLiveStartBroadcast() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f4251", new Object[]{this});
            return;
        }
        Intent intent = new Intent("com.taobao.taolive.start");
        if (MediaAdapteManager.mConfigAdapter != null && b.a(MediaAdapteManager.mConfigAdapter.getConfig("MediaLive", "EnableVideoStartBroadcastMuteState", "true"))) {
            c cVar = this.mVideoView;
            if (cVar != null) {
                z = cVar.b();
            }
            intent.putExtra("isMute", z);
        }
        if (getContext() == null) {
            return;
        }
        getContext().sendBroadcast(intent);
    }

    @JSMethod
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        c cVar = this.mVideoView;
        if (cVar == null) {
            return;
        }
        cVar.h();
    }

    @JSMethod
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        c cVar = this.mVideoView;
        if (cVar == null) {
            return;
        }
        cVar.g();
    }

    @JSMethod
    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        c cVar = this.mVideoView;
        if (cVar == null) {
            return;
        }
        cVar.c(z);
    }

    @JSMethod
    public void getMuted(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1de3d4c", new Object[]{this, jSCallback});
        } else if (this.mVideoView == null || jSCallback == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("result", Boolean.valueOf(this.mVideoView.b()));
            jSCallback.invoke(hashMap);
        }
    }

    public void getVideoWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe551208", new Object[]{this});
            return;
        }
        c cVar = this.mVideoView;
        if (cVar == null) {
            return;
        }
        cVar.d();
    }

    public void getVideoHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("867fced3", new Object[]{this});
            return;
        }
        c cVar = this.mVideoView;
        if (cVar == null) {
            return;
        }
        cVar.e();
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void notifyAppearStateChange(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbd959e", new Object[]{this, str, str2});
            return;
        }
        super.notifyAppearStateChange(str, str2);
        String str3 = "notifyAppearStateChange --- wxEventType = " + str + " direction = " + str2;
    }

    @Override // com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        c cVar = this.mVideoView;
        if (cVar == null) {
            return;
        }
        this.mIsPlayingBeforeActivityPause = cVar.f();
        this.mVideoView.g();
    }

    @Override // com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityResume() {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.onActivityResume();
        if (!this.mIsPlayingBeforeActivityPause || (cVar = this.mVideoView) == null) {
            return;
        }
        cVar.h();
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        try {
            if (this.mExternReceiver != null && getContext() != null && this.hasRegistered) {
                getContext().unregisterReceiver(this.mExternReceiver);
                this.hasRegistered = false;
                this.mExternReceiver = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (this.mVideoView == null) {
                return;
            }
            this.mVideoView.i();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
