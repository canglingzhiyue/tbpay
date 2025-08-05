package com.taobao.mediaplay.player;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaAdapteManager;
import com.taobao.mediaplay.MediaContext;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.player.g;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.ozn;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes7.dex */
public abstract class b implements IMediaPlayer.OnBufferingUpdateListener, IMediaPlayer.OnCompletionListener, IMediaPlayer.OnErrorListener, IMediaPlayer.OnInfoListener, IMediaPlayer.OnPreparedListener, IMediaPlayer.OnVFPluginListener, IMediaPlayer.OnVideoSizeChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static float l;
    private List<f> A;
    private List<d> B;

    /* renamed from: a  reason: collision with root package name */
    public int f18050a;
    public int b;
    public boolean bA;
    public Surface bB;
    public float bz;
    public int c;
    public int d;
    public int e;
    public String f;
    public int g;
    public g.b h;
    public Context j;
    public Context k;
    public ozn m;
    public Map<String, String> n;
    public MediaContext o;
    public String p;
    public SparseArray<Long> s;
    public SparseArray<Float> t;
    public int u;
    public ArrayList<e> v;
    public List<IMediaPlayer.OnVideoClickListener> w;
    public h x;
    public boolean y;
    public boolean z;
    public Rect i = new Rect();
    public boolean q = false;
    public boolean r = false;

    public abstract void A();

    public abstract float Q();

    public abstract void a(float f);

    public abstract void a(int i, float f);

    public abstract void a(int i, long j);

    public abstract void a(int i, boolean z);

    public abstract void a(int i, boolean z, boolean z2);

    public abstract void a(MediaPlayScreenType mediaPlayScreenType);

    public abstract void a(MediaAspectRatio mediaAspectRatio);

    public abstract void a(TaoLiveVideoView.d dVar);

    public abstract void a(String str);

    public abstract void a(boolean z);

    public abstract void b(float f);

    public abstract void b(String str);

    public abstract void b(boolean z);

    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue() : i == 3 || i == 0 || i == 6;
    }

    public abstract void c(int i);

    public abstract void c(String str);

    public abstract void d(String str);

    public abstract View g();

    public abstract int getCurrentPosition();

    public abstract Bitmap h();

    public abstract boolean isPlaying();

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public abstract boolean o();

    public abstract int p();

    public abstract float q();

    public abstract void r();

    public abstract void u();

    public Map<String, String> x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1a6370f4", new Object[]{this});
        }
        return null;
    }

    static {
        kge.a(-937364821);
        kge.a(1345538278);
        kge.a(-111960633);
        kge.a(-121259976);
        kge.a(-1423519514);
        kge.a(-492382078);
        kge.a(539281001);
        kge.a(1604993389);
        l = 0.8f;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.m.f32509a;
    }

    public b(Context context) {
        this.j = context;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f;
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb8e9b8", new Object[]{this, eVar});
        } else if (eVar == null) {
        } else {
            if (this.v == null) {
                this.v = new ArrayList<>();
            }
            if (this.v.contains(eVar)) {
                return;
            }
            this.v.add(eVar);
        }
    }

    public void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bba46d5", new Object[]{this, hVar});
        } else {
            this.x = hVar;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.m.k;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.m.e;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.m.d;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.m.c;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.m.c = i;
        }
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.f18050a;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.b;
    }

    public g.b k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g.b) ipChange.ipc$dispatch("3e51f482", new Object[]{this}) : this.h;
    }

    public Surface ak() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Surface) ipChange.ipc$dispatch("edc95c91", new Object[]{this}) : this.bB;
    }

    public int s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66a136d", new Object[]{this})).intValue() : this.g;
    }

    private void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        Intent intent = new Intent("com.taobao.avplayer.start");
        if (MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig(this.o.mMediaPlayContext.mConfigGroup, "EnableVideoStartBroadcastMuteState", "true"))) {
            intent.putExtra("isMute", this.o.mMediaPlayContext.isMute());
        }
        Context context = this.j;
        if (context == null) {
            return;
        }
        context.sendBroadcast(intent);
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        if (!this.o.mMediaPlayContext.mTBLive) {
            C();
        }
        this.m.e = 1;
        u();
        ArrayList<e> arrayList = this.v;
        if (arrayList == null) {
            return;
        }
        Iterator<e> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onMediaStart();
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        this.m.e = 1;
        u();
        ArrayList<e> arrayList = this.v;
        if (arrayList == null) {
            return;
        }
        Iterator<e> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onMediaPlay();
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        this.m.e = 2;
        ArrayList<e> arrayList = this.v;
        if (arrayList == null) {
            return;
        }
        Iterator<e> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onMediaPause(z);
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        this.m.e = 4;
        ArrayList<e> arrayList = this.v;
        if (arrayList == null) {
            return;
        }
        Iterator<e> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onMediaComplete();
        }
    }

    public void a(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50365aaa", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
            return;
        }
        this.m.e = 3;
        ArrayList<e> arrayList = this.v;
        if (arrayList == null) {
            return;
        }
        Iterator<e> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onMediaError(iMediaPlayer, i, i2);
        }
    }

    public void a(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a45cd296", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
            return;
        }
        ArrayList<e> arrayList = this.v;
        if (arrayList == null) {
            return;
        }
        Iterator<e> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onMediaInfo(iMediaPlayer, j, j2, j3, obj);
        }
    }

    public void a(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d9604ca", new Object[]{this, iMediaPlayer});
            return;
        }
        this.m.e = 5;
        ArrayList<e> arrayList = this.v;
        if (arrayList == null) {
            return;
        }
        Iterator<e> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onMediaPrepared(iMediaPlayer);
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        ArrayList<e> arrayList = this.v;
        if (arrayList == null) {
            return;
        }
        Iterator<e> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onMediaSeekTo(i);
        }
    }

    public void b(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("376659e4", new Object[]{this, mediaPlayScreenType});
            return;
        }
        ArrayList<e> arrayList = this.v;
        if (arrayList == null) {
            return;
        }
        Iterator<e> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onMediaScreenChanged(mediaPlayScreenType);
        }
    }

    public void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        ArrayList<e> arrayList = this.v;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.v.get(i4).onMediaProgressChanged(i, i2, i3);
        }
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb95e17", new Object[]{this, fVar});
            return;
        }
        if (this.A == null) {
            this.A = new ArrayList();
        }
        this.A.add(fVar);
    }

    public void b(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff89676", new Object[]{this, fVar});
            return;
        }
        List<f> list = this.A;
        if (list == null || fVar == null) {
            return;
        }
        list.remove(fVar);
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb87559", new Object[]{this, dVar});
            return;
        }
        if (this.B == null) {
            this.B = new ArrayList();
        }
        if (this.B.contains(dVar)) {
            return;
        }
        this.B.add(dVar);
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        List<f> list = this.A;
        if (list == null) {
            return;
        }
        for (f fVar : list) {
            fVar.a();
        }
    }

    public boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        h hVar = this.x;
        if (hVar != null) {
            return hVar.a(i, i2);
        }
        return false;
    }

    public boolean al() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8d8336", new Object[]{this})).booleanValue();
        }
        h hVar = this.x;
        if (hVar != null) {
            return hVar.dU_();
        }
        return false;
    }

    public void a(IMediaPlayer.OnVideoClickListener onVideoClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9d8762", new Object[]{this, onVideoClickListener});
            return;
        }
        if (this.w == null) {
            this.w = new LinkedList();
        }
        this.w.add(onVideoClickListener);
    }

    public void b(IMediaPlayer.OnVideoClickListener onVideoClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80b83c1", new Object[]{this, onVideoClickListener});
            return;
        }
        List<IMediaPlayer.OnVideoClickListener> list = this.w;
        if (list == null) {
            return;
        }
        list.remove(onVideoClickListener);
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        List<d> list = this.B;
        if (list == null) {
            return;
        }
        for (d dVar : list) {
            dVar.onLoopCompletion();
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else {
            this.m.b = i;
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.n = map;
        }
    }

    public String B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65c54bf7", new Object[]{this}) : this.p;
    }
}
