package com.taobao.mediaplay;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import mtopsdk.common.util.StringUtils;
import android.view.Surface;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.MediaPlayCenter;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import com.taobao.mediaplay.model.PlayerQualityItem;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.mediaplay.model.TBLiveMSGInfo;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.InterfaceUsageCounter;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.ddc;
import tb.dde;
import tb.ddh;
import tb.kge;
import tb.mjz;
import tb.mkb;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes7.dex */
public class k implements com.taobao.mediaplay.player.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f18039a;
    private TaoLiveVideoView b;
    private MediaPlayCenter c;
    private final boolean d;
    private com.taobao.taobaoavsdk.widget.media.c e;
    private List<IMediaPlayer.OnCompletionListener> f;
    private List<IMediaPlayer.OnPreparedListener> g;
    private List<IMediaPlayer.OnErrorListener> h;
    private List<IMediaPlayer.OnInfoListener> i;
    private List<TaoLiveVideoView.b> j;
    private List<TaoLiveVideoView.a> k;
    private String l;
    private com.taobao.mediaplay.player.e m;
    private boolean n = false;

    /* renamed from: com.taobao.mediaplay.k$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18040a = new int[MediaAspectRatio.values().length];

        static {
            try {
                f18040a[MediaAspectRatio.DW_FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18040a[MediaAspectRatio.DW_CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18040a[MediaAspectRatio.DW_FIT_X_Y.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        kge.a(-160942437);
        kge.a(-613305621);
    }

    public k(Context context, boolean z, String str) {
        this.d = z;
        if (z) {
            this.b = new TaoLiveVideoView(context);
            this.e = new com.taobao.taobaoavsdk.widget.media.c(str);
            this.b.initConfig(this.e);
            return;
        }
        this.c = new MediaPlayCenter(context);
        this.c.setMediaAspectRatio(MediaAspectRatio.DW_CENTER_CROP);
        this.c.setBusinessId(str);
        this.c.setNeedPlayControlView(false);
        this.c.setConfigGroup("MediaLive");
        this.c.hideController();
        this.c.setMediaLifecycleListener(this);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.d) {
            this.e.b = i;
        } else {
            this.c.setScenarioType(i);
        }
    }

    public void a(MediaAspectRatio mediaAspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58f44224", new Object[]{this, mediaAspectRatio});
        } else if (this.d) {
            int i = AnonymousClass1.f18040a[mediaAspectRatio.ordinal()];
            if (i == 1) {
                this.e.d = 0;
            } else if (i == 2) {
                this.e.d = 1;
            } else if (i != 3) {
            } else {
                this.e.d = 3;
            }
        } else {
            this.c.setMediaAspectRatio(mediaAspectRatio);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.avproxy_setDeviceLevel);
        if (!this.d) {
            return;
        }
        this.e.H = str;
    }

    public void a(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f8662c", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.avproxy_setRenderType);
        if (!this.d) {
            this.c.setRenderType(z, i2, i3, i4);
        } else if (z) {
            this.b.setRenderType(i, i2, i3, i4);
        } else {
            this.b.setRenderType(i);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.avproxy_setBusinessType);
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.setBusinessId(str);
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (this.d) {
            this.e.y = str;
        } else {
            this.c.setBizCode(str);
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.avproxy_setDefinition);
        if (!this.d) {
            return;
        }
        this.b.setVideoDefinition(str);
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else if (this.d) {
            this.b.setFeedId(str);
        } else {
            this.c.setMediaId(str);
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else if (this.d) {
            this.b.setMediaSourceType(str);
        } else {
            this.c.setMediaSourceType(str);
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.setMediaSource(str);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (this.d) {
            return this.f18039a;
        }
        return this.c.getMediaPlayUrl();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.avproxy_getVideoToken);
        MediaPlayCenter mediaPlayCenter = this.c;
        return mediaPlayCenter != null ? mediaPlayCenter.getVideoToken() : "";
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        return mediaPlayCenter != null ? mediaPlayCenter.getPlayToken() : "";
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.avproxy_setVideoToken);
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.setVideoToken(str);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.avproxy_setUseArtp);
        if (this.d) {
            return;
        }
        this.c.setUseArtp(z);
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.avproxy_setUseBfrtc);
        if (this.d) {
            return;
        }
        this.c.setUseBfrtc(z);
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (this.d) {
        } else {
            this.c.setUseRtcLive(z);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (this.d) {
            this.e.f21365a = i;
        } else {
            this.c.setPlayerType(i);
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (!this.d) {
            if (i != 1) {
                return;
            }
            this.c.setHardwareHevc(Boolean.TRUE.booleanValue());
        } else {
            com.taobao.taobaoavsdk.widget.media.c cVar = this.e;
            cVar.g = i;
            if (i != 0) {
                return;
            }
            cVar.aP = 3;
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else if (!this.d) {
            if (i != 1) {
                return;
            }
            this.c.setHardwareAvc(Boolean.TRUE.booleanValue());
        } else {
            com.taobao.taobaoavsdk.widget.media.c cVar = this.e;
            cVar.f = i;
            if (i != 0) {
                return;
            }
            cVar.aO = 3;
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else if (this.d) {
            this.e.n = z;
        } else {
            this.c.setShowNoWifiToast(z);
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (this.d) {
            return this.b.isPlaying();
        }
        return this.c.isPlaying();
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else if (this.d) {
            this.b.setMuted(z);
        } else {
            this.c.mute(z);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.d) {
            this.b.start();
        } else {
            this.c.start();
        }
    }

    public void a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.avproxy_setPropertyLong);
        if (this.d) {
            this.b.setPropertyLong(i, j);
        } else {
            this.c.setPropertyLong(i, j);
        }
    }

    public void a(TaoLiveVideoView.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a320bc1a", new Object[]{this, dVar});
        } else if (this.d) {
            this.b.setSurfaceListener(dVar);
        } else {
            this.c.setSurfaceListener(dVar);
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
        } else if (this.d) {
            this.b.setVideoPath(str);
        } else {
            this.c.setMediaUrl(str);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.d) {
            this.b.pause();
        } else {
            this.c.pause();
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else if (this.d) {
            this.b.seekTo(i);
        } else {
            this.c.seekTo(i);
        }
    }

    public void a(Drawable drawable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36ca8c8", new Object[]{this, drawable, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.avproxy_setCoverImg);
        if (this.d) {
            this.b.setCoverImg(drawable, z);
        } else {
            this.c.setCoverImg(drawable, z);
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.avproxy_setAccountId);
        if (!this.d) {
            this.c.setAccountId(str);
        } else {
            this.b.setAccountId(str);
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{this, str});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.avproxy_setUserId);
        if (!this.d) {
            this.c.setUserId(str);
        } else {
            this.e.A = str;
        }
    }

    public void a(MediaLiveInfo mediaLiveInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1a14b3", new Object[]{this, mediaLiveInfo, str});
        } else if (this.d) {
            this.f18039a = str;
            this.b.setVideoPath(str);
        } else if (mediaLiveInfo != null) {
            if (this.n) {
                mediaLiveInfo.updateLiveUrlList(mediaLiveInfo.liveUrlListJson);
            }
            this.c.updateLiveMediaInfoData(mediaLiveInfo);
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.c.updateLiveMediaInfoData(null);
            this.c.setMediaUrl(str);
        }
    }

    public void a(MediaLiveWarmupConfig mediaLiveWarmupConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d69515", new Object[]{this, mediaLiveWarmupConfig});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        if (mediaLiveWarmupConfig != null) {
            mediaPlayCenter.warmupLiveStream(mediaLiveWarmupConfig);
        } else {
            mediaPlayCenter.warmupLiveStream(new MediaLiveWarmupConfig());
        }
    }

    public void a(TBLiveMSGInfo tBLiveMSGInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cb9dd72", new Object[]{this, tBLiveMSGInfo});
        } else if (this.d || tBLiveMSGInfo == null) {
        } else {
            this.c.setTBLiveMSGInfo(tBLiveMSGInfo);
        }
    }

    public void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
        } else if (!this.d) {
            this.c.addPlayExpUtParams(hashMap);
        } else {
            this.e.aa = hashMap;
        }
    }

    public void b(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616d4b2a", new Object[]{this, hashMap});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.addCustomParams(hashMap);
    }

    public void c(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6eda09", new Object[]{this, hashMap});
        } else if (!this.d) {
            this.c.addControlParams(hashMap);
        } else {
            this.e.be = hashMap;
        }
    }

    public void a(IMediaPlayer.OnCompletionListener onCompletionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec6e9f3", new Object[]{this, onCompletionListener});
        } else if (this.d) {
            this.b.registerOnCompletionListener(onCompletionListener);
        } else {
            if (this.f == null) {
                this.f = new LinkedList();
            }
            this.f.add(onCompletionListener);
        }
    }

    public void b(IMediaPlayer.OnCompletionListener onCompletionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b34e652", new Object[]{this, onCompletionListener});
        } else if (this.d) {
            this.b.unregisterOnCompletionListener(onCompletionListener);
        } else {
            List<IMediaPlayer.OnCompletionListener> list = this.f;
            if (list == null) {
                return;
            }
            list.remove(onCompletionListener);
        }
    }

    public void a(TaoLiveVideoView.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a31fd35c", new Object[]{this, bVar});
        } else if (this.d) {
            this.b.registerOnStartListener(bVar);
        } else {
            if (this.j == null) {
                this.j = new LinkedList();
            }
            this.j.add(bVar);
        }
    }

    public void b(TaoLiveVideoView.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d9573dd", new Object[]{this, bVar});
        } else if (this.d) {
            this.b.unregisterOnStartListener(bVar);
        } else {
            List<TaoLiveVideoView.b> list = this.j;
            if (list == null) {
                return;
            }
            list.remove(bVar);
        }
    }

    public void a(TaoLiveVideoView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a31f5efd", new Object[]{this, aVar});
        } else if (this.d) {
            this.b.registerOnPauseListener(aVar);
        } else {
            if (this.k == null) {
                this.k = new LinkedList();
            }
            this.k.add(aVar);
        }
    }

    public void b(TaoLiveVideoView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d94ff7e", new Object[]{this, aVar});
        } else if (this.d) {
            this.b.unregisterOnPauseListener(aVar);
        } else {
            List<TaoLiveVideoView.a> list = this.k;
            if (list == null) {
                return;
            }
            list.remove(aVar);
        }
    }

    public void a(IMediaPlayer.OnPreparedListener onPreparedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb49db2", new Object[]{this, onPreparedListener});
        } else if (this.d) {
            this.b.registerOnPreparedListener(onPreparedListener);
        } else {
            if (this.g == null) {
                this.g = new LinkedList();
            }
            this.g.add(onPreparedListener);
        }
    }

    public void b(IMediaPlayer.OnPreparedListener onPreparedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15e425d1", new Object[]{this, onPreparedListener});
        } else if (this.d) {
            this.b.unregisterOnPreparedListener(onPreparedListener);
        } else {
            List<IMediaPlayer.OnPreparedListener> list = this.g;
            if (list == null) {
                return;
            }
            list.remove(onPreparedListener);
        }
    }

    public void a(IMediaPlayer.OnInfoListener onInfoListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c355221", new Object[]{this, onInfoListener});
        } else if (this.d) {
            this.b.registerOnInfoListener(onInfoListener);
        } else {
            if (this.i == null) {
                this.i = new LinkedList();
            }
            this.i.add(onInfoListener);
        }
    }

    public void b(IMediaPlayer.OnInfoListener onInfoListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1073c1c0", new Object[]{this, onInfoListener});
        } else if (this.d) {
            this.b.unregisterOnInfoListener(onInfoListener);
        } else {
            List<IMediaPlayer.OnInfoListener> list = this.i;
            if (list == null) {
                return;
            }
            list.remove(onInfoListener);
        }
    }

    public void a(IMediaPlayer.OnErrorListener onErrorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22b3fb1", new Object[]{this, onErrorListener});
        } else if (this.d) {
            this.b.registerOnErrorListener(onErrorListener);
        } else {
            if (this.h == null) {
                this.h = new LinkedList();
            }
            this.h.add(onErrorListener);
        }
    }

    public void b(IMediaPlayer.OnErrorListener onErrorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5bac3f2", new Object[]{this, onErrorListener});
        } else if (this.d) {
            this.b.unregisterOnErrorListener(onErrorListener);
        } else {
            List<IMediaPlayer.OnErrorListener> list = this.h;
            if (list == null) {
                return;
            }
            list.remove(onErrorListener);
        }
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue();
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.avproxy_getDuration);
        if (this.d) {
            return this.b.getDuration();
        }
        return this.c.getDuration();
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue();
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.avproxy_getCurrentPosition);
        if (this.d) {
            return this.b.getCurrentPosition();
        }
        return this.c.getCurrentPosition();
    }

    public float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue();
        }
        if (this.d) {
            return this.b.getVideoRenderPts();
        }
        return this.c.getVideoRenderPts();
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.avproxy_setPlayRate);
        if (this.d) {
            this.b.setPlayRate(f);
        } else {
            this.c.setPlayRate(f);
        }
    }

    public Bitmap z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c54153df", new Object[]{this});
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getCurrentFrame called at MediaPlayViewProxy");
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return null;
        }
        return mediaPlayCenter.getCurrentFrame();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (!this.d) {
        } else {
            this.b.setFirstRenderTime();
        }
    }

    public void a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca848472", new Object[]{this, onAudioFocusChangeListener});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.avproxy_setAudioFocusChangeListener);
        if (this.d) {
            return;
        }
        this.c.setAudioFocusChangeListener(onAudioFocusChangeListener);
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (this.d) {
            this.b.release();
        } else {
            this.c.release();
        }
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue();
        }
        if (this.d) {
            return this.b.getVideoWidth();
        }
        return this.c.getVideoWidth();
    }

    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue();
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return 0;
        }
        return mediaPlayCenter.getVideoState();
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else if (this.d) {
        } else {
            this.c.setTransH265(z);
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
        } else if (this.d) {
        } else {
            this.c.setH265Enable(z);
        }
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue();
        }
        if (this.d) {
            return this.b.getVideoHeight();
        }
        return this.c.getVideoHeight();
    }

    public void a(ddc ddcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e8bc15", new Object[]{this, ddcVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.avproxy_setConfigAdapter);
        if (!this.d) {
            return;
        }
        this.b.setConfigAdapter(ddcVar);
    }

    public void a(ddh ddhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4eb01f0", new Object[]{this, ddhVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.avproxy_setLogAdapter);
        if (this.d) {
            this.b.setLogAdapter(ddhVar);
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.setLogAdapter(ddhVar);
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (!this.d) {
            if (StringUtils.isEmpty(this.l)) {
                this.c.setUsingInterface("avproxy");
            } else {
                MediaPlayCenter mediaPlayCenter = this.c;
                mediaPlayCenter.setUsingInterface(this.l + ".avproxy");
            }
            this.c.setup();
        } else if (!StringUtils.isEmpty(this.l)) {
        } else {
            this.b.setUsingInterface(this.l);
        }
    }

    public View q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bc794eba", new Object[]{this});
        }
        if (this.d) {
            return this.b;
        }
        return this.c.getView();
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f694024", new Object[]{this});
            return;
        }
        List<TaoLiveVideoView.b> list = this.j;
        if (list != null) {
            for (TaoLiveVideoView.b bVar : list) {
                if (bVar != null) {
                    bVar.onStart(null);
                }
            }
        }
        com.taobao.mediaplay.player.e eVar = this.m;
        if (eVar == null) {
            return;
        }
        eVar.onMediaStart();
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
            return;
        }
        List<TaoLiveVideoView.a> list = this.k;
        if (list != null) {
            for (TaoLiveVideoView.a aVar : list) {
                if (aVar != null) {
                    aVar.onPause(null);
                }
            }
        }
        com.taobao.mediaplay.player.e eVar = this.m;
        if (eVar == null) {
            return;
        }
        eVar.onMediaPause(z);
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            return;
        }
        List<TaoLiveVideoView.b> list = this.j;
        if (list != null) {
            for (TaoLiveVideoView.b bVar : list) {
                if (bVar != null) {
                    bVar.onStart(null);
                }
            }
        }
        com.taobao.mediaplay.player.e eVar = this.m;
        if (eVar == null) {
            return;
        }
        eVar.onMediaPlay();
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.mediaplay.player.e eVar = this.m;
        if (eVar == null) {
            return;
        }
        eVar.onMediaSeekTo(i);
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
            return;
        }
        List<IMediaPlayer.OnPreparedListener> list = this.g;
        if (list != null) {
            for (IMediaPlayer.OnPreparedListener onPreparedListener : list) {
                if (onPreparedListener != null) {
                    onPreparedListener.onPrepared(iMediaPlayer);
                }
            }
        }
        com.taobao.mediaplay.player.e eVar = this.m;
        if (eVar == null) {
            return;
        }
        eVar.onMediaPrepared(iMediaPlayer);
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
            return;
        }
        List<IMediaPlayer.OnErrorListener> list = this.h;
        if (list != null) {
            for (IMediaPlayer.OnErrorListener onErrorListener : list) {
                onErrorListener.onError(iMediaPlayer, i, i2);
            }
        }
        com.taobao.mediaplay.player.e eVar = this.m;
        if (eVar == null) {
            return;
        }
        eVar.onMediaError(iMediaPlayer, i, i2);
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
            return;
        }
        List<IMediaPlayer.OnInfoListener> list = this.i;
        if (list != null) {
            for (IMediaPlayer.OnInfoListener onInfoListener : list) {
                if (onInfoListener != null) {
                    onInfoListener.onInfo(iMediaPlayer, j, j2, j3, obj);
                }
            }
        }
        com.taobao.mediaplay.player.e eVar = this.m;
        if (eVar == null) {
            return;
        }
        eVar.onMediaInfo(iMediaPlayer, j, j2, j3, obj);
    }

    public Map<String, String> r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4865266e", new Object[]{this});
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return null;
        }
        return mediaPlayCenter.getPlayerQos();
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
            return;
        }
        List<IMediaPlayer.OnCompletionListener> list = this.f;
        if (list != null) {
            for (IMediaPlayer.OnCompletionListener onCompletionListener : list) {
                if (onCompletionListener != null) {
                    onCompletionListener.onCompletion(null);
                }
            }
        }
        com.taobao.mediaplay.player.e eVar = this.m;
        if (eVar == null) {
            return;
        }
        eVar.onMediaComplete();
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71919eba", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.player.e eVar = this.m;
        if (eVar == null) {
            return;
        }
        eVar.onMediaClose();
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
            return;
        }
        com.taobao.mediaplay.player.e eVar = this.m;
        if (eVar == null) {
            return;
        }
        eVar.onMediaScreenChanged(mediaPlayScreenType);
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        com.taobao.mediaplay.player.e eVar = this.m;
        if (eVar == null) {
            return;
        }
        eVar.onMediaProgressChanged(i, i2, i3);
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else if (this.d) {
        } else {
            this.c.changeQuality(i);
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (this.d) {
        } else {
            this.c.destroy();
        }
    }

    public void a(dde ddeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e9a4d3", new Object[]{this, ddeVar});
        } else if (this.d) {
            TaoLiveVideoView taoLiveVideoView = this.b;
            if (taoLiveVideoView == null) {
                return;
            }
            taoLiveVideoView.setFirstRenderAdapter(ddeVar);
        } else {
            MediaPlayCenter mediaPlayCenter = this.c;
            if (mediaPlayCenter == null) {
                return;
            }
            mediaPlayCenter.setFirstRenderAdapter(ddeVar);
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.setVideoLoop(z);
    }

    public void a(mjz mjzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a35b3b", new Object[]{this, mjzVar});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.setTBVideoSourceAdapter(mjzVar);
    }

    public boolean a(mkb mkbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4a689d8", new Object[]{this, mkbVar})).booleanValue();
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return false;
        }
        return mediaPlayCenter.addVFPlugin(mkbVar);
    }

    public boolean b(mkb mkbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3299059", new Object[]{this, mkbVar})).booleanValue();
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return false;
        }
        return mediaPlayCenter.removeVFPlugin(mkbVar);
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.setStartPos(i);
    }

    public void a(Map<String, String> map) {
        MediaPlayCenter mediaPlayCenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || (mediaPlayCenter = this.c) == null) {
        } else {
            mediaPlayCenter.setRequestHeader(map);
        }
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.avproxy_setUseMiniBfrtc);
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.setUseMiniBfrtc(z);
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d7103", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.switchLower(z);
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93249a2", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.switchHigher(z);
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue();
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return false;
        }
        return mediaPlayCenter.canSwitchLower();
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue();
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return false;
        }
        return mediaPlayCenter.canSwitchHigher();
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.stopSwitch();
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c7e1fd", new Object[]{this, str});
            return;
        }
        this.l = str;
        if (!"TBPlayer".equals(str)) {
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "mediaPlayViewProxy using newTBPlayer interface.");
        this.n = true;
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.setUsingNewPlayerInstance(true);
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df97b3e", new Object[]{this, str});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.setPlayScenes(str);
        } else if (!this.d) {
        } else {
            this.e.W = str;
        }
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae72241", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.setAudioOnly(z);
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.avproxy_audioOff);
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.audioOff();
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.avproxy_audioOn);
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.audioOn();
    }

    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (this.c == null || map == null || map.isEmpty()) {
        } else {
            this.c.callWithMsg(map);
        }
    }

    public HashMap<String, String> c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("652f137e", new Object[]{this, map});
        }
        if (this.c != null && map != null && !map.isEmpty()) {
            return this.c.callWithMsgAndResult(map);
        }
        return null;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.reattach(context);
    }

    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bfae0", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.setAutoDegradedWhenError(z);
    }

    public void a(List<QualityLiveItem> list, MediaPlayCenter.UpdataUrlListMode updataUrlListMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8dcf49e", new Object[]{this, list, updataUrlListMode});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.updateUrlList(list, updataUrlListMode);
    }

    public List<PlayerQualityItem> n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3971b0e8", new Object[]{this, new Boolean(z)});
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return null;
        }
        return mediaPlayCenter.getDefinitionList(z);
    }

    public PlayerQualityItem y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayerQualityItem) ipChange.ipc$dispatch("9f8a9de4", new Object[]{this});
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return null;
        }
        return mediaPlayCenter.getCurrentDefinition();
    }

    public boolean a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20f12ca9", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return false;
        }
        return mediaPlayCenter.switchToNewDefinition(i, str);
    }

    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c005ac1e", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.setLiveDefinitionAutoSwitch(z);
    }

    public void a(com.taobao.mediaplay.player.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bbb2f93", new Object[]{this, jVar});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.setIMediaSwitchListener(jVar);
    }

    public void a(com.taobao.mediaplay.player.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb8e9b8", new Object[]{this, eVar});
        } else {
            this.m = eVar;
        }
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else if (this.d) {
            TaoLiveVideoView taoLiveVideoView = this.b;
            if (taoLiveVideoView == null) {
                return;
            }
            taoLiveVideoView.setVolume(f, f);
        } else {
            MediaPlayCenter mediaPlayCenter = this.c;
            if (mediaPlayCenter == null) {
                return;
            }
            mediaPlayCenter.setVolume(f);
        }
    }

    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ba84bd", new Object[]{this, new Boolean(z)});
        } else if (this.d) {
            TaoLiveVideoView taoLiveVideoView = this.b;
            if (taoLiveVideoView == null) {
                return;
            }
            taoLiveVideoView.setUseShortAudioFocus(z);
        } else {
            MediaPlayCenter mediaPlayCenter = this.c;
            if (mediaPlayCenter == null) {
                return;
            }
            mediaPlayCenter.setUseShortAudioFocus(z);
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.setFadeAnimationTime(j);
    }

    public void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36f5d5c", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.setForceUseSurfaceView(z);
    }

    public void a(Surface surface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("444ed434", new Object[]{this, surface});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.setExternSurface(surface);
    }
}
