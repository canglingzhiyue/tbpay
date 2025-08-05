package com.taobao.taobaoavsdk.services;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.IAVObject;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import com.taobao.taobaoavsdk.widget.media.c;
import tb.kge;
import tb.pbe;
import tb.pbg;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes8.dex */
public class LivePlayServiceImp implements IAVObject, pbe, IMediaPlayer.OnCompletionListener, IMediaPlayer.OnErrorListener, IMediaPlayer.OnPreparedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private pbe.a mListener;
    private TaoLiveVideoView mVideoView;

    static {
        kge.a(1356426365);
        kge.a(-710275534);
        kge.a(1486300039);
        kge.a(1345538278);
        kge.a(-1423519514);
        kge.a(-111960633);
    }

    @Override // tb.pbe
    public void initConfig(Context context, pbg pbgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bfda48a", new Object[]{this, context, pbgVar});
            return;
        }
        if (this.mVideoView != null) {
            release();
        }
        this.mVideoView = new TaoLiveVideoView(context);
        this.mVideoView.registerOnCompletionListener(this);
        this.mVideoView.registerOnErrorListener(this);
        this.mVideoView.registerOnPreparedListener(this);
        if (pbgVar == null) {
            return;
        }
        c cVar = new c(pbgVar.f32543a, pbgVar.h);
        cVar.C = pbgVar.j;
        cVar.i = pbgVar.g;
        cVar.e = pbgVar.f;
        cVar.B = pbgVar.i;
        cVar.f21365a = pbgVar.b;
        cVar.d = pbgVar.e;
        cVar.c = pbgVar.d;
        cVar.b = pbgVar.c;
        this.mVideoView.initConfig(cVar);
    }

    @Override // tb.pbe
    public View getPlayView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8d911938", new Object[]{this}) : this.mVideoView;
    }

    @Override // tb.pbe
    public void setListener(pbe.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b775a23d", new Object[]{this, aVar});
        } else {
            this.mListener = aVar;
        }
    }

    @Override // tb.pbe
    public void setVideoPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f405b10f", new Object[]{this, str});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView == null) {
            return;
        }
        taoLiveVideoView.setVideoPath(str);
    }

    @Override // tb.pbe
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView == null) {
            return;
        }
        taoLiveVideoView.start();
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView == null) {
            return;
        }
        taoLiveVideoView.pause();
    }

    @Override // tb.pbe
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView == null) {
            return;
        }
        taoLiveVideoView.unregisterOnCompletionListener(this);
        this.mVideoView.unregisterOnErrorListener(this);
        this.mVideoView.unregisterOnPreparedListener(this);
        this.mVideoView.release();
        this.mVideoView = null;
    }

    public void seedTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("723c1e10", new Object[]{this, new Integer(i)});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView == null) {
            return;
        }
        taoLiveVideoView.seekTo(i);
    }

    public int getVideoWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe5511fb", new Object[]{this})).intValue();
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView == null) {
            return 0;
        }
        return taoLiveVideoView.getVideoWidth();
    }

    public int getVideoHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("867fcec6", new Object[]{this})).intValue();
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView == null) {
            return 0;
        }
        return taoLiveVideoView.getVideoHeight();
    }

    @Override // tb.pbe
    public int getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a84", new Object[]{this})).intValue();
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView == null) {
            return 0;
        }
        return taoLiveVideoView.getDuration();
    }

    @Override // tb.pbe
    public int getCurrentPoistion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f624ccda", new Object[]{this})).intValue();
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView == null) {
            return 0;
        }
        return taoLiveVideoView.getCurrentPosition();
    }

    @Override // tb.pbe
    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView == null) {
            return false;
        }
        return taoLiveVideoView.isPlaying();
    }

    @Override // tb.pbe
    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView == null) {
            return;
        }
        taoLiveVideoView.setMuted(z);
    }

    public void setVolume(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef12afe3", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView == null) {
            return;
        }
        taoLiveVideoView.setVolume(f, f2);
    }

    public void setScenarioType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8557a670", new Object[]{this, new Integer(i)});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView == null) {
            return;
        }
        taoLiveVideoView.setScenarioType(i);
    }

    public void setTimeout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a835f41d", new Object[]{this, new Integer(i)});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView == null) {
            return;
        }
        taoLiveVideoView.setTimeout(i);
    }

    public int getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView == null) {
            return 0;
        }
        return taoLiveVideoView.getCurrentState();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
    public void onCompletion(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
            return;
        }
        pbe.a aVar = this.mListener;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        pbe.a aVar = this.mListener;
        if (aVar != null) {
            aVar.a(i, i2);
        }
        return true;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05bf465", new Object[]{this, iMediaPlayer});
            return;
        }
        pbe.a aVar = this.mListener;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }
}
