package com.taobao.tbliveweexvideo;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaAdapteManager;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import com.taobao.taobaoavsdk.widget.media.a;
import com.taobao.tbliveweexvideo.c;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes8.dex */
public class e extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TaoLiveVideoView f22188a;
    private Context c;
    private com.taobao.taobaoavsdk.widget.media.c d;
    private boolean e;
    private boolean f;
    private boolean g = true;
    private boolean h = false;
    private c.a i;

    public static /* synthetic */ boolean a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1a2e19b8", new Object[]{eVar})).booleanValue() : eVar.f;
    }

    public static /* synthetic */ boolean a(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b95cfa4", new Object[]{eVar, new Boolean(z)})).booleanValue();
        }
        eVar.g = z;
        return z;
    }

    public static /* synthetic */ boolean b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8106d979", new Object[]{eVar})).booleanValue() : eVar.g;
    }

    public static /* synthetic */ TaoLiveVideoView c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveVideoView) ipChange.ipc$dispatch("c2bf82d2", new Object[]{eVar}) : eVar.f22188a;
    }

    public static /* synthetic */ c.a d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c.a) ipChange.ipc$dispatch("93366eb0", new Object[]{eVar}) : eVar.i;
    }

    public e(Context context, boolean z, String str, com.taobao.taobaoavsdk.widget.media.c cVar) {
        this.c = context;
        this.e = z;
        if (cVar != null) {
            this.d = cVar;
            this.d.f21365a = 3;
        } else {
            this.d = new com.taobao.taobaoavsdk.widget.media.c("AliWeexVideo");
            this.d.B = str;
        }
        com.taobao.taobaoavsdk.widget.media.c cVar2 = this.d;
        int i = 2;
        cVar2.c = 2;
        cVar2.b = this.e ? 0 : i;
        this.f22188a = new TaoLiveVideoView(context);
        if (cVar != null) {
            this.f22188a.setConfigAdapter(MediaAdapteManager.mConfigAdapter);
        }
        this.f22188a.initConfig(this.d);
        this.f22188a.setSurfaceListener(new TaoLiveVideoView.d() { // from class: com.taobao.tbliveweexvideo.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.d
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                }
            }

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.d
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (!e.a(e.this) || !e.b(e.this)) {
                } else {
                    e.c(e.this).start();
                    e.a(e.this, false);
                }
            }
        });
        this.f22188a.registerOnCompletionListener(new IMediaPlayer.OnCompletionListener() { // from class: com.taobao.tbliveweexvideo.e.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
                } else if (e.d(e.this) == null) {
                } else {
                    e.d(e.this).a();
                }
            }
        });
        this.f22188a.registerOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: com.taobao.tbliveweexvideo.e.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i2), new Integer(i3)})).booleanValue();
                }
                if (e.d(e.this) != null) {
                    e.d(e.this).a(i3);
                }
                return false;
            }
        });
        this.f22188a.registerOnStartListener(new TaoLiveVideoView.b() { // from class: com.taobao.tbliveweexvideo.e.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.b
            public void onStart(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
                } else if (e.d(e.this) == null) {
                } else {
                    e.d(e.this).b();
                }
            }
        });
        this.f22188a.registerOnPauseListener(new TaoLiveVideoView.a() { // from class: com.taobao.tbliveweexvideo.e.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.a
            public void onPause(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8faf4140", new Object[]{this, iMediaPlayer});
                } else if (e.d(e.this) == null) {
                } else {
                    e.d(e.this).d();
                }
            }
        });
        this.f22188a.registerOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: com.taobao.tbliveweexvideo.e.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
                }
                int i2 = (int) j;
                if (i2 != 3) {
                    if (i2 != 701) {
                        if (i2 == 702 && e.d(e.this) != null) {
                            e.d(e.this).e();
                        }
                    } else if (e.d(e.this) != null) {
                        e.d(e.this).c();
                    }
                } else if (e.d(e.this) != null) {
                    e.d(e.this).g();
                }
                return true;
            }
        });
        this.f22188a.registerOnPreparedListener(new IMediaPlayer.OnPreparedListener() { // from class: com.taobao.tbliveweexvideo.e.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
            public void onPrepared(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e05bf465", new Object[]{this, iMediaPlayer});
                } else if (e.d(e.this) == null) {
                } else {
                    e.d(e.this).f();
                }
            }
        });
    }

    @Override // com.taobao.tbliveweexvideo.c
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.f22188a;
    }

    @Override // com.taobao.tbliveweexvideo.c
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f22188a.setVideoPath(str);
        }
    }

    @Override // com.taobao.tbliveweexvideo.c
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    @Override // com.taobao.tbliveweexvideo.c
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            if (this.e) {
            }
        }
    }

    @Override // com.taobao.tbliveweexvideo.c
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        this.h = z;
        this.f22188a.setMuted(z);
    }

    @Override // com.taobao.tbliveweexvideo.c
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.h;
    }

    @Override // com.taobao.tbliveweexvideo.c
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else if (this.e) {
        } else {
            this.f22188a.setLooping(z);
        }
    }

    @Override // com.taobao.tbliveweexvideo.c
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        a renderView = this.f22188a.getRenderView();
        if (renderView == null) {
            return;
        }
        if ("contain".equals(str)) {
            renderView.setAspectRatio(0);
        } else if (!"cover".equals(str)) {
        } else {
            renderView.setAspectRatio(1);
        }
    }

    @Override // com.taobao.tbliveweexvideo.c
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.f22188a.setVolume(f, f);
        }
    }

    @Override // com.taobao.tbliveweexvideo.c
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (this.e) {
        } else {
            this.f22188a.seekTo((int) j);
        }
    }

    @Override // com.taobao.tbliveweexvideo.c
    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
        }
        if (!this.e) {
            return this.f22188a.getCurrentPosition() / 1000;
        }
        return 0L;
    }

    @Override // com.taobao.tbliveweexvideo.c
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.f22188a.getVideoWidth();
    }

    @Override // com.taobao.tbliveweexvideo.c
    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.f22188a.getVideoHeight();
    }

    @Override // com.taobao.tbliveweexvideo.c
    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.f22188a.isPlaying();
    }

    @Override // com.taobao.tbliveweexvideo.c
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.f22188a.pause();
        }
    }

    @Override // com.taobao.tbliveweexvideo.c
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.f22188a.start();
        }
    }

    @Override // com.taobao.tbliveweexvideo.c
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            this.f22188a.release();
        }
    }

    @Override // com.taobao.tbliveweexvideo.c
    public void a(c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4279c399", new Object[]{this, aVar});
        } else {
            this.i = aVar;
        }
    }
}
