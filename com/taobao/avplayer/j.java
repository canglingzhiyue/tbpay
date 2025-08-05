package com.taobao.avplayer;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConfigAdapter;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.io.IOException;
import tb.ddc;
import tb.kge;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.TaobaoAudioOnlyPlayer;

/* loaded from: classes6.dex */
public class j extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f16521a;
    private TaobaoAudioOnlyPlayer b;
    private ddc c = new MediaConfigAdapter();
    private v d;

    static {
        kge.a(-1251855746);
        f16521a = "DWAudioOnlyInstance";
    }

    public j(Context context) {
        this.b = new TaobaoAudioOnlyPlayer(context, this.c);
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b.registerOnAudioPreparedListener(this);
        this.b.registerOnAudioPreCompletionListener(this);
        this.b.registerOnAudioCompletionListener(this);
        this.b.registerOnAudioErrorListener(this);
        this.b.registerOnAudioInfoListener(this);
        this.b.registerOnAudioLoopCompletionListener(this);
        this.b.registerOnAudioSeekStartListener(this);
        this.b.registerOnAudioPauseListener(this);
        this.b.registerOnAudioStartListener(this);
        this.b.registerOnAudioSeekCompleteListener(this);
    }

    public String a(String str, String str2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.b;
        return taobaoAudioOnlyPlayer != null ? taobaoAudioOnlyPlayer.setDataSource(str, str2) : "";
    }

    public void a(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.b;
        if (taobaoAudioOnlyPlayer == null) {
            return;
        }
        taobaoAudioOnlyPlayer.prepareAsync(str);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.b;
        if (taobaoAudioOnlyPlayer == null) {
            return;
        }
        taobaoAudioOnlyPlayer.start(str);
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.b;
        if (taobaoAudioOnlyPlayer == null) {
            return;
        }
        taobaoAudioOnlyPlayer.pause(str);
    }

    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
            return;
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.b;
        if (taobaoAudioOnlyPlayer == null) {
            return;
        }
        taobaoAudioOnlyPlayer.seekTo(str, j);
    }

    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.b;
        if (taobaoAudioOnlyPlayer == null) {
            return;
        }
        taobaoAudioOnlyPlayer.setLooping(str, z);
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.b;
        if (taobaoAudioOnlyPlayer == null) {
            return;
        }
        taobaoAudioOnlyPlayer.stop(str);
    }

    public void b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253fb1", new Object[]{this, str, new Long(j)});
            return;
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.b;
        if (taobaoAudioOnlyPlayer == null) {
            return;
        }
        taobaoAudioOnlyPlayer.setStateChangeGap(str, j);
    }

    public long e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c6cb12a", new Object[]{this, str})).longValue();
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.b;
        if (taobaoAudioOnlyPlayer == null) {
            return -1L;
        }
        return taobaoAudioOnlyPlayer.getDuration(str);
    }

    public long f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("669e4a6b", new Object[]{this, str})).longValue();
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.b;
        if (taobaoAudioOnlyPlayer == null) {
            return -1L;
        }
        return taobaoAudioOnlyPlayer.getCurrentPosition(str);
    }

    public void a(String str, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a350ffb2", new Object[]{this, str, new Float(f), new Float(f2)});
            return;
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.b;
        if (taobaoAudioOnlyPlayer == null) {
            return;
        }
        taobaoAudioOnlyPlayer.setVolume(str, f, f2);
    }

    public void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{this, str, new Boolean(z)});
            return;
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.b;
        if (taobaoAudioOnlyPlayer == null) {
            return;
        }
        taobaoAudioOnlyPlayer.setMuted(str, z);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.b;
        if (taobaoAudioOnlyPlayer == null) {
            return;
        }
        taobaoAudioOnlyPlayer.setPauseInBackground(z);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b.unregisterOnAudioPreparedListener(this);
        this.b.unregisterOnAudioPreCompletionListener(this);
        this.b.unregisterOnAudioCompletionListener(this);
        this.b.unregisterOnAudioErrorListener(this);
        this.b.unregisterOnAudioInfoListener(this);
        this.b.unregisterOnAudioLoopCompletionListener(this);
        this.b.unregisterOnAudioSeekStartListener(this);
        this.b.unregisterOnAudioPauseListener(this);
        this.b.unregisterOnAudioStartListener(this);
        this.b.unregisterOnAudioSeekCompleteListener(this);
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.b;
        if (taobaoAudioOnlyPlayer == null) {
            return;
        }
        taobaoAudioOnlyPlayer.release();
    }

    public void a(v vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a96d129", new Object[]{this, vVar});
        } else {
            this.d = vVar;
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnAudioCompletionListener
    public void onCompletion(IMediaPlayer iMediaPlayer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bbc2ce", new Object[]{this, iMediaPlayer, str});
            return;
        }
        v vVar = this.d;
        if (vVar != null) {
            vVar.a(str);
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "Completion token " + str);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnAudioErrorListener
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5ceb300", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2), str})).booleanValue();
        }
        v vVar = this.d;
        if (vVar != null) {
            vVar.a(i, i2, str);
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "onError index " + str);
        return false;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnAudioInfoListener
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1313bb98", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj, str})).booleanValue();
        }
        v vVar = this.d;
        if (vVar != null) {
            vVar.a(j, j2, j3, obj, str);
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "onInfo index " + j);
        return false;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnAudioLoopCompletionListener
    public void onLoopCompletion(IMediaPlayer iMediaPlayer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f1f9112", new Object[]{this, iMediaPlayer, str});
            return;
        }
        v vVar = this.d;
        if (vVar != null) {
            vVar.b(str);
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "onLoopCompletion index " + str);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnAudioPreCompletionListener
    public void onPreCompletion(IMediaPlayer iMediaPlayer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10b47ef3", new Object[]{this, iMediaPlayer, str});
            return;
        }
        v vVar = this.d;
        if (vVar != null) {
            vVar.c(str);
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "onPreCompletion index " + str);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnAudioPreparedListener
    public void onPrepared(IMediaPlayer iMediaPlayer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc4aeef", new Object[]{this, iMediaPlayer, str});
            return;
        }
        v vVar = this.d;
        if (vVar != null) {
            vVar.d(str);
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "onPrepared index " + str);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnAudioSeekCompletionListener
    public void onSeekComplete(IMediaPlayer iMediaPlayer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e24f03", new Object[]{this, iMediaPlayer, str});
            return;
        }
        v vVar = this.d;
        if (vVar == null) {
            return;
        }
        vVar.e(str);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnAudioPauseListener
    public void onPause(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb560aa8", new Object[]{this, str});
            return;
        }
        v vVar = this.d;
        if (vVar == null) {
            return;
        }
        vVar.f(str);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnAudioSeekStartListener
    public void onSeekStart(IMediaPlayer iMediaPlayer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66368d5e", new Object[]{this, iMediaPlayer, str});
            return;
        }
        v vVar = this.d;
        if (vVar == null) {
            return;
        }
        vVar.g(str);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnAudioStartListener
    public void onStart(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
            return;
        }
        v vVar = this.d;
        if (vVar == null) {
            return;
        }
        vVar.h(str);
    }
}
