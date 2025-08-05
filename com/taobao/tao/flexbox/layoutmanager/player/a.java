package com.taobao.tao.flexbox.layoutmanager.player;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.bl;
import com.taobao.avplayer.common.z;
import com.taobao.avplayer.s;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import java.util.ArrayList;
import org.json.JSONObject;
import tb.kge;
import tb.ogg;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes8.dex */
public class a extends IPlayBack implements TaoLiveVideoView.a, TaoLiveVideoView.b, IMediaPlayer.OnCompletionListener, IMediaPlayer.OnErrorListener, IMediaPlayer.OnInfoListener, IMediaPlayer.OnPreparedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public s i;

    static {
        kge.a(755089388);
        kge.a(-121259976);
        kge.a(-111960633);
        kge.a(1345538278);
        kge.a(-1423519514);
        kge.a(-1773133372);
        kge.a(233018416);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a(TBVideoComponent tBVideoComponent) {
        super(tBVideoComponent);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        s sVar = this.i;
        if (sVar == null) {
            return;
        }
        sVar.a(z);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        s sVar = this.i;
        if (sVar == null) {
            return;
        }
        sVar.g();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        s sVar = this.i;
        if (sVar == null) {
            return;
        }
        sVar.a();
        this.b = System.currentTimeMillis();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public void a(boolean z, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff475e6", new Object[]{this, new Boolean(z), view});
            return;
        }
        s sVar = this.i;
        if (sVar == null) {
            return;
        }
        if (z) {
            sVar.b(true);
        }
        this.i.b((IMediaPlayer.OnPreparedListener) this);
        this.i.b((IMediaPlayer.OnCompletionListener) this);
        this.i.b((IMediaPlayer.OnErrorListener) this);
        this.i.b((IMediaPlayer.OnInfoListener) this);
        this.i.b((TaoLiveVideoView.a) this);
        this.i.b((TaoLiveVideoView.b) this);
        this.i.b((z) null);
        this.i.c();
        this.i.f();
        f();
        a((e) null);
        this.c = null;
        this.i = null;
        this.d = 0;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        if (this.i != null) {
            return this.d;
        }
        return -1;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.i != null) {
            return this.f;
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        s sVar = this.i;
        return sVar != null && sVar.j() == 1;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        s sVar = this.i;
        return sVar != null && sVar.j() == 2;
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        } else if (this.i == null) {
        } else {
            TBVideoComponent.c videoParams = this.c.getVideoParams();
            if (b(videoParams)) {
                this.i.a(this.c.isMute());
            } else {
                this.i.a(videoParams.q);
            }
            this.c.attachVideoView(e());
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public bl a(Context context, int i, int i2, boolean z, boolean z2, TBVideoComponent tBVideoComponent, boolean z3, boolean z4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bl) ipChange.ipc$dispatch("561ae53f", new Object[]{this, context, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2), tBVideoComponent, new Boolean(z3), new Boolean(z4)});
        }
        if (!(context instanceof Activity)) {
            return null;
        }
        TBVideoComponent.c viewParams = tBVideoComponent.getViewParams();
        s.a aVar = new s.a((Activity) context);
        aVar.a(0);
        if (i2 > 0) {
            aVar.c(i2);
        }
        if (i > 0) {
            aVar.b(i);
        }
        aVar.g(MediaConstant.LBLIVE_SOURCE);
        aVar.b(viewParams.i);
        aVar.d(viewParams.k);
        aVar.b(viewParams.l);
        if (a(viewParams)) {
            aVar.a(true);
        }
        aVar.g(false);
        aVar.c(viewParams.p);
        aVar.e(viewParams.b);
        aVar.e(true);
        aVar.f(viewParams.D);
        aVar.c(viewParams.f);
        if (!TextUtils.isEmpty(viewParams.E)) {
            try {
                aVar.a(new JSONObject(viewParams.E));
            } catch (Exception e) {
                ogg.a("LivePlayBack", e + "");
            }
        }
        if (!TextUtils.isEmpty(viewParams.r)) {
            if ("center_crop".equals(viewParams.r)) {
                aVar.a(DWAspectRatio.DW_CENTER_CROP);
            } else if ("fit_center".equals(viewParams.r)) {
                aVar.a(DWAspectRatio.DW_FIT_CENTER);
            } else if ("fit_xy".equals(viewParams.r)) {
                aVar.a(DWAspectRatio.DW_FIT_X_Y);
            }
        }
        if (z) {
            aVar.d(false);
        }
        s a2 = aVar.a();
        a2.a((TaoLiveVideoView.b) this);
        a2.a((TaoLiveVideoView.a) this);
        a2.a((IMediaPlayer.OnInfoListener) this);
        a2.a((IMediaPlayer.OnErrorListener) this);
        a2.a((IMediaPlayer.OnCompletionListener) this);
        a2.a((IMediaPlayer.OnPreparedListener) this);
        a2.a(c(viewParams), (String) null);
        a2.q();
        this.d = 0;
        this.c = new TBVideoComponent.VideoView(context);
        this.i = a2;
        this.c.setLiveDwInstance(this.i);
        this.c.setMuteInfo(tBVideoComponent);
        if (viewParams.j != -1) {
            this.i.a(viewParams.j);
        }
        this.g = viewParams.G;
        return null;
    }

    private MediaLiveInfo c(TBVideoComponent.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaLiveInfo) ipChange.ipc$dispatch("4855670a", new Object[]{this, cVar});
        }
        MediaLiveInfo mediaLiveInfo = new MediaLiveInfo();
        mediaLiveInfo.h265 = false;
        mediaLiveInfo.liveUrlList = new ArrayList<>();
        mediaLiveInfo.liveId = cVar.N;
        QualityLiveItem qualityLiveItem = new QualityLiveItem();
        qualityLiveItem.definition = MediaConstant.DEFINITION_MD;
        String str = cVar.P;
        String str2 = cVar.O;
        if ("flv".equalsIgnoreCase(str)) {
            qualityLiveItem.flvUrl = str2;
        } else if ("hls".equalsIgnoreCase(str)) {
            qualityLiveItem.hlsUrl = str2;
        } else if ("artp".equalsIgnoreCase(str)) {
            qualityLiveItem.artpUrl = str2;
        } else if (MediaConstant.BFRTC_URL_NAME.equals(str)) {
            qualityLiveItem.bfrtcUrl = str2;
        } else if (MediaConstant.RTCLIVE_URL_NAME.equals(str)) {
            qualityLiveItem.rtcLiveUrl = str2;
        }
        mediaLiveInfo.liveUrlList.add(qualityLiveItem);
        return mediaLiveInfo;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        onVideoInfo(iMediaPlayer, (int) j, (int) j2);
        return false;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05bf465", new Object[]{this, iMediaPlayer});
        } else {
            onVideoPrepared(iMediaPlayer);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
    public void onCompletion(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
        } else {
            onVideoComplete();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        onVideoError(iMediaPlayer, i, i2);
        return false;
    }

    @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.a
    public void onPause(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8faf4140", new Object[]{this, iMediaPlayer});
        } else {
            onVideoPause(false);
        }
    }

    @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.b
    public void onStart(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
            return;
        }
        onVideoStart();
        onVideoPlay();
    }
}
