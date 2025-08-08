package com.taobao.android.tab2liveroom.liveroom;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.adapter.impl.n;
import com.taobao.tao.flexbox.layoutmanager.container.p;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.taobao.R;
import com.taobao.taolive.room.afccoldlunch.SimpleVideoInfo;
import com.taobao.taolive.room.launch.TaoLiveLaunchInitializer;
import com.taobao.taolive.room.utils.m;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.ui.media.f;
import com.taobao.taolive.sdk.ui.media.g;
import com.taobao.taolive.sdk.ui.media.h;
import com.taobao.taolive.sdk.ui.media.r;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ohl;

/* loaded from: classes6.dex */
public abstract class c extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATE_REUSED = 100;

    /* renamed from: a */
    private boolean f15289a;
    private f e;
    private ViewGroup f;
    private ViewGroup g;
    private boolean h;

    static {
        kge.a(1051029978);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == -747638089) {
            super.a(((Number) objArr[0]).intValue(), objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void lambda$4nyQ8H8x77LjBqJN9ZNlxpHhg9E(c cVar, boolean[] zArr, View view, int i, Object obj) {
        cVar.a(zArr, view, i, obj);
    }

    /* renamed from: lambda$xM1n-IFFxkEK8rglXHWCbwdeJv0 */
    public static /* synthetic */ void m1021lambda$xM1nIFFxkEK8rglXHWCbwdeJv0(c cVar) {
        cVar.d();
    }

    public static /* synthetic */ TNodeView a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TNodeView) ipChange.ipc$dispatch("a2dfb141", new Object[]{cVar}) : cVar.c;
    }

    public static /* synthetic */ void a(c cVar, Context context, MediaData mediaData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22219796", new Object[]{cVar, context, mediaData, str});
        } else {
            cVar.a(context, mediaData, str);
        }
    }

    public static /* synthetic */ boolean a(c cVar, View view, int i, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("44f135f5", new Object[]{cVar, view, new Integer(i), obj})).booleanValue() : cVar.a(view, i, obj);
    }

    public static /* synthetic */ ViewGroup b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("d529b790", new Object[]{cVar}) : cVar.f;
    }

    public c(TNodeView tNodeView, Uri uri) {
        super(tNodeView, uri);
        this.h = false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.p
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (com.taobao.taolive.room.afccoldlunch.b.a().c() && n.b(this.c.getContext())) {
            ogg.c(a.TAG, "startRender");
            TaoLiveLaunchInitializer.init();
            a(1, null);
            com.taobao.taolive.room.afccoldlunch.b.a().a(new com.taobao.taolive.room.afccoldlunch.a() { // from class: com.taobao.android.tab2liveroom.liveroom.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    c.this = this;
                }

                @Override // com.taobao.taolive.room.afccoldlunch.a
                public void a(SimpleVideoInfo simpleVideoInfo) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0df487", new Object[]{this, simpleVideoInfo});
                        return;
                    }
                    ogg.c(a.TAG, "onGetVideoInfoSuccess");
                    MediaData b = com.taobao.taolive.room.afccoldlunch.b.b(simpleVideoInfo);
                    if (b != null && b.liveUrlList != null && !b.liveUrlList.isEmpty()) {
                        c cVar = c.this;
                        c.a(cVar, c.a(cVar).getContext(), b, (String) null);
                        return;
                    }
                    c.this.a(-1, null);
                }

                @Override // com.taobao.taolive.room.afccoldlunch.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    ogg.c(a.TAG, "onGetVideoInfoFail");
                    c.this.a(-1, null);
                }
            });
        } else {
            a(-1, null);
        }
    }

    private void a(Context context, MediaData mediaData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b9c921a", new Object[]{this, context, mediaData, str});
            return;
        }
        ogg.c(a.TAG, "createMediaPlayer");
        h hVar = new h();
        if (!StringUtils.isEmpty(str)) {
            hVar.f21934a = str;
        } else {
            hVar.b = r.a(mediaData, null);
            hVar.f21934a = g.e(hVar.b);
        }
        this.e = new f(hVar);
        this.e.s(true);
        this.e.a(context);
        if (mediaData != null) {
            this.e.a(mediaData, (String) null);
        }
        this.e.f(true);
        this.e.a(true);
        this.e.d("LiveRoom");
        ViewGroup G = this.e.G();
        if (G == null) {
            ogg.a(a.TAG, "mediaView is null");
            a(-1, null);
            return;
        }
        this.e.g();
        this.f = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.tab2_liveroom_layoutmanager_liveroom_root, (ViewGroup) null, false);
        this.g = (ViewGroup) this.f.findViewById(R.id.rootVideoFrameLayout);
        this.g.addView(G, 0);
        final View findViewById = this.f.findViewById(R.id.taolive_top_afc_loading);
        findViewById.setVisibility(0);
        a(2, this.f);
        ohl.a(this.f);
        ogg.a(a.TAG, "hasFirstFrame" + this.e.D());
        if (this.e.D()) {
            a(3, this.f);
        } else {
            oec.a(new Runnable() { // from class: com.taobao.android.tab2liveroom.liveroom.-$$Lambda$c$xM1n-IFFxkEK8rglXHWCbwdeJv0
                {
                    c.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.m1021lambda$xM1nIFFxkEK8rglXHWCbwdeJv0(c.this);
                }
            }, 5000L);
        }
        this.e.a(new IMediaPlayer.g() { // from class: com.taobao.android.tab2liveroom.liveroom.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                c.this = this;
            }

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.g
            public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue() : c.a(c.this, findViewById, (int) j, obj);
            }
        });
        this.e.a(new IMediaPlayer.e() { // from class: com.taobao.android.tab2liveroom.liveroom.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                c.this = this;
            }

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                }
                ogg.c(a.TAG, "onError code: " + i + " extra: " + i2);
                c cVar = c.this;
                cVar.a(4, c.b(cVar));
                return false;
            }
        });
    }

    public /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            a(4, this.f);
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : oeb.a("enableMediaInfoRunOnMainThreadUpdateUI", true);
    }

    private boolean a(final View view, final int i, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3a4c879", new Object[]{this, view, new Integer(i), obj})).booleanValue();
        }
        if (c()) {
            final boolean[] zArr = {false};
            oec.a(new Runnable() { // from class: com.taobao.android.tab2liveroom.liveroom.-$$Lambda$c$4nyQ8H8x77LjBqJN9ZNlxpHhg9E
                {
                    c.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.lambda$4nyQ8H8x77LjBqJN9ZNlxpHhg9E(c.this, zArr, view, i, obj);
                }
            });
            return zArr[0];
        }
        return b(view, i, obj);
    }

    public /* synthetic */ void a(boolean[] zArr, View view, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98a7e14", new Object[]{this, zArr, view, new Integer(i), obj});
        } else {
            zArr[0] = b(view, i, obj);
        }
    }

    private boolean b(View view, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98e6373a", new Object[]{this, view, new Integer(i), obj})).booleanValue();
        }
        if (view != null && view.getVisibility() == 0) {
            view.setVisibility(8);
        }
        if (g.MOCK_MEDIA_INFO_WHAT_RECYCLED.equals(obj)) {
            ogg.c(a.TAG, "receive MOCK_MEDIA_INFO_WHAT_RECYCLED");
            a(100, this.f);
            return false;
        }
        if (i == 12101) {
            ogg.c(a.TAG, "receive firstFrame");
            a(3, this.f);
        }
        return false;
    }

    private int a(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == -1 ? !(this.b == 0 || this.b == 1) : !(i == 0 || (i == 1 ? this.b == 0 : !(i == 2 ? this.b != 1 : i == 3 ? this.b != 2 : i == 4 ? !(this.b == 2 || this.b == 3) : !(i != 100 || this.b == 3))))) {
            z = false;
        }
        int i2 = z ? i : this.b;
        ogg.c(a.TAG, "checkState finalState:" + i2 + " oldState:" + this.b + " newState:" + i);
        return i2;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.p
    public void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
            return;
        }
        int a2 = a(i);
        if (a2 == 3 || a2 == 4 || a2 == -1) {
            a(this.f);
        }
        if (a2 == 100 || a2 == 4) {
            a(this.e, this.f, this.g);
        }
        if (a2 == 100) {
            this.c.removeUpperView(this.f);
        }
        super.a(a2, obj);
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (this.f15289a) {
        } else {
            ogg.c(a.TAG, "updateRootViewRenderFinish");
            m.h(null);
            ohl.b(view);
            this.f15289a = true;
        }
    }

    private void a(f fVar, ViewGroup viewGroup, ViewGroup viewGroup2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17524aee", new Object[]{this, fVar, viewGroup, viewGroup2});
        } else if (this.h) {
        } else {
            ogg.c(a.TAG, "releaseMediaPlay");
            if (fVar != null) {
                fVar.I();
            }
            if (viewGroup != null && viewGroup2 != null) {
                viewGroup.removeView(viewGroup2);
            }
            this.h = true;
        }
    }
}
