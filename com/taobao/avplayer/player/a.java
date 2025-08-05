package com.taobao.avplayer.player;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.media.AudioManager;
import android.view.Surface;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.aw;
import com.taobao.avplayer.ax;
import com.taobao.avplayer.ba;
import com.taobao.avplayer.bb;
import com.taobao.mediaplay.player.f;
import com.taobao.mediaplay.player.h;
import com.taobao.taobaoavsdk.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.ozn;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes6.dex */
public abstract class a implements IMediaPlayer.OnBufferingUpdateListener, IMediaPlayer.OnCompletionListener, IMediaPlayer.OnErrorListener, IMediaPlayer.OnInfoListener, IMediaPlayer.OnPreparedListener, IMediaPlayer.OnVideoSizeChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static float n;
    public long B;

    /* renamed from: a  reason: collision with root package name */
    public int f16552a;
    public h aC;
    public f aI;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f;
    public Surface g;
    public boolean h;
    public int i;
    public Rect j = new Rect();
    public com.taobao.taobaoavsdk.widget.media.b k;
    public Context l;
    public Context m;
    public ozn o;
    public Map<String, String> p;
    public DWContext q;
    public int r;
    public ArrayList<aw> s;
    public List<Object> t;
    public ArrayList<bb> u;
    public boolean v;
    public boolean w;
    private List<ba> x;
    private List<ax> y;

    public abstract boolean A();

    public Map<String, String> F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ef1c5942", new Object[]{this});
        }
        return null;
    }

    public List<com.taobao.taobaoavsdk.f> a(List<e> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        return null;
    }

    public abstract void a(float f);

    public void a(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25edca58", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    public abstract void a(int i, boolean z);

    public abstract void a(int i, boolean z, boolean z2);

    public abstract void a(DWVideoScreenType dWVideoScreenType);

    public abstract void a(String str);

    public abstract void a(boolean z);

    public abstract void b(float f);

    public abstract void b(boolean z);

    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue() : i == 3 || i == 0 || i == 6;
    }

    public abstract void c(float f);

    public abstract void c(int i);

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    public abstract void d(int i);

    public abstract int getCurrentPosition();

    public abstract View i();

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract boolean s();

    public abstract int t();

    public abstract void u();

    public abstract void v();

    public abstract float w();

    public abstract void x();

    public abstract boolean y();

    public abstract boolean z();

    static {
        kge.a(-688370969);
        kge.a(1345538278);
        kge.a(-111960633);
        kge.a(-121259976);
        kge.a(-1423519514);
        kge.a(-492382078);
        kge.a(539281001);
        n = 0.8f;
    }

    public float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue();
        }
        try {
            return ((AudioManager) this.l.getApplicationContext().getSystemService("audio")).getStreamVolume(3);
        } catch (Exception unused) {
            return 0.5f;
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.o.f32509a;
    }

    public a(DWContext dWContext) {
        this.l = dWContext.getActivity();
        this.m = dWContext.mApplicationontext;
        this.q = dWContext;
        o();
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f;
    }

    public void a(aw awVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1736eb1b", new Object[]{this, awVar});
        } else if (awVar == null) {
        } else {
            if (this.s == null) {
                this.s = new ArrayList<>();
            }
            if (this.s.contains(awVar)) {
                return;
            }
            this.s.add(awVar);
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.o.k;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.o.e;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.o.d;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.o.c;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.o.c = i;
        }
    }

    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.c;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : this.d;
    }

    public int l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue() : this.f16552a;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue() : this.b;
    }

    public Surface n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Surface) ipChange.ipc$dispatch("3b9dfccd", new Object[]{this}) : this.g;
    }

    public int B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3b793bc", new Object[]{this})).intValue() : this.i;
    }

    private void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
            return;
        }
        Intent intent = new Intent("com.taobao.avplayer.start");
        if (this.q.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(this.q.mConfigAdapter.getConfig(this.q.mPlayContext.mConfigGroup, "EnableVideoStartBroadcastMuteState", "true"))) {
            intent.putExtra("isMute", this.q.isMute());
        }
        Context context = this.l;
        if (context == null) {
            return;
        }
        context.sendBroadcast(intent);
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            J();
        }
        this.o.e = 1;
        ArrayList<aw> arrayList = this.s;
        if (arrayList == null) {
            return;
        }
        Iterator<aw> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onVideoStart();
        }
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        this.o.e = 1;
        ArrayList<aw> arrayList = this.s;
        if (arrayList == null) {
            return;
        }
        Iterator<aw> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onVideoPlay();
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        this.o.e = 2;
        ArrayList<aw> arrayList = this.s;
        if (arrayList == null) {
            return;
        }
        Iterator<aw> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onVideoPause(z);
        }
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
            return;
        }
        this.o.e = 4;
        ArrayList<aw> arrayList = this.s;
        if (arrayList == null) {
            return;
        }
        Iterator<aw> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onVideoComplete();
        }
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        this.o.e = 6;
        ArrayList<aw> arrayList = this.s;
        if (arrayList == null) {
            return;
        }
        Iterator<aw> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onVideoClose();
        }
    }

    public void a(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b137f1a4", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        this.o.e = 3;
        ArrayList<aw> arrayList = this.s;
        if (arrayList == null) {
            return;
        }
        Iterator<aw> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onVideoError(obj, i, i2);
        }
    }

    public void a(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8162d55c", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            return;
        }
        ArrayList<aw> arrayList = this.s;
        if (arrayList == null) {
            return;
        }
        Iterator<aw> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onVideoInfo(obj, j, j2, j3, obj2);
        }
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        this.o.e = 5;
        ArrayList<aw> arrayList = this.s;
        if (arrayList == null) {
            return;
        }
        Iterator<aw> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onVideoPrepared(obj);
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        ArrayList<aw> arrayList = this.s;
        if (arrayList == null) {
            return;
        }
        Iterator<aw> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onVideoSeekTo(i);
        }
    }

    public void b(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45121e70", new Object[]{this, dWVideoScreenType});
            return;
        }
        ArrayList<aw> arrayList = this.s;
        if (arrayList == null) {
            return;
        }
        Iterator<aw> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onVideoScreenChanged(dWVideoScreenType);
        }
    }

    public void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        ArrayList<aw> arrayList = this.s;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.s.get(i4).onVideoProgressChanged(i, i2, i3);
        }
    }

    public void a(bb bbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173b76d1", new Object[]{this, bbVar});
            return;
        }
        if (this.u == null) {
            this.u = new ArrayList<>();
        }
        if (this.u.contains(bbVar)) {
            return;
        }
        this.u.add(bbVar);
    }

    public void a(ba baVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173b0272", new Object[]{this, baVar});
            return;
        }
        if (this.x == null) {
            this.x = new ArrayList();
        }
        if (this.x.contains(baVar)) {
            return;
        }
        this.x.add(baVar);
    }

    public void a(ax axVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17375f7a", new Object[]{this, axVar});
            return;
        }
        if (this.y == null) {
            this.y = new ArrayList();
        }
        if (this.y.contains(axVar)) {
            return;
        }
        this.y.add(axVar);
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
            return;
        }
        ArrayList<bb> arrayList = this.u;
        if (arrayList == null) {
            return;
        }
        Iterator<bb> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        f fVar = this.aI;
        if (fVar == null) {
            return;
        }
        fVar.a();
    }

    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
            return;
        }
        List<ba> list = this.x;
        if (list == null) {
            return;
        }
        for (ba baVar : list) {
            baVar.cJ_();
        }
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
            return;
        }
        List<ax> list = this.y;
        if (list == null) {
            return;
        }
        for (ax axVar : list) {
            axVar.onLoopCompletion();
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else {
            this.o.b = i;
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.p = map;
        }
    }

    public boolean c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5ddc94e", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        h hVar = this.aC;
        if (hVar != null) {
            return hVar.a(i, i2);
        }
        return false;
    }

    public void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bba46d5", new Object[]{this, hVar});
        } else {
            this.aC = hVar;
        }
    }
}
