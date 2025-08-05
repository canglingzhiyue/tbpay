package com.taobao.tao.flexbox.layoutmanager.player;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.av;
import com.taobao.avplayer.bl;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent;
import com.taobao.tao.flexbox.layoutmanager.event.f;
import com.taobao.tao.flexbox.layoutmanager.event.g;
import com.taobao.tao.flexbox.layoutmanager.event.h;
import com.taobao.tao.flexbox.layoutmanager.event.i;
import com.taobao.tao.flexbox.layoutmanager.event.j;
import com.taobao.tao.flexbox.layoutmanager.event.k;
import com.taobao.tao.flexbox.layoutmanager.event.l;
import com.taobao.tao.flexbox.layoutmanager.event.m;
import java.util.ArrayList;
import java.util.HashMap;
import tb.kge;
import tb.mto;
import tb.ogg;

/* loaded from: classes8.dex */
public abstract class IPlayBack implements av {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean i;

    /* renamed from: a  reason: collision with root package name */
    public TBVideoComponent f20463a;
    public long b;
    public TBVideoComponent.VideoView c;
    public int d;
    public int e;
    public boolean f;
    public String g;
    public e h;

    static {
        kge.a(1694954303);
        kge.a(688755897);
    }

    public abstract bl a(Context context, int i2, int i3, boolean z, boolean z2, TBVideoComponent tBVideoComponent, boolean z3, boolean z4);

    public void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
        }
    }

    public abstract void a(View view);

    public abstract void a(boolean z);

    public abstract void a(boolean z, View view);

    public abstract boolean a();

    public abstract int b();

    public abstract boolean c();

    public abstract boolean d();

    /* renamed from: h  reason: collision with other method in class */
    public abstract void m1270h();

    @Override // com.taobao.avplayer.av
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoSeekTo(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i2)});
        }
    }

    public IPlayBack(TBVideoComponent tBVideoComponent) {
        this.f20463a = tBVideoComponent;
        g();
    }

    public View e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("42261fae", new Object[]{this}) : this.c;
    }

    public IPlayBack a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPlayBack) ipChange.ipc$dispatch("cfe6b12b", new Object[]{this, eVar});
        }
        this.h = eVar;
        return this;
    }

    public boolean a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6838e3d1", new Object[]{this, hVar})).booleanValue();
        }
        e eVar = this.h;
        if (eVar == null) {
            return false;
        }
        return eVar.a(hVar);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        } else {
            a(new l(this));
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        } else {
            a(new j(this));
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        } else if (b.a().e(this.f20463a.a()) != null) {
        } else {
            a(new k(this));
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            a(new com.taobao.tao.flexbox.layoutmanager.event.e(this));
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoInfo(Object obj, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i2), new Integer(i3)});
        } else if (3 != i2) {
        } else {
            a(this.b);
            a(new i(this));
            ogg.d("AVSDK_IPlayBackSharePlayer", "onVideoInfo 首帧加载成功");
            this.c.hideCoverView();
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoError(Object obj, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i2), new Integer(i3)});
        } else {
            a(new g(this));
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        this.d = 0;
        a(new f(this, false));
    }

    @Override // com.taobao.avplayer.av
    public void onVideoProgressChanged(int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.d = i2;
        int i5 = this.e;
        if (i5 != 0 && i2 - i5 < 1000) {
            return;
        }
        a(new m(this));
        this.e = i2;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    private static void g() {
        com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.c y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
        } else if (i || (y = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().y()) == null) {
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add("time");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("phase");
            y.a("tnode", "player", arrayList, arrayList2, true);
            i = true;
        }
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.c y = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().y();
        if (y == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        double currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis < mto.a.GEO_NOT_SUPPORT) {
            currentTimeMillis = 0.0d;
        }
        hashMap.put("time", Double.valueOf(currentTimeMillis));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("phase", ImageLoader.Scene.FIRST_FRAME);
        y.a("tnode", "player", hashMap, hashMap2);
        a(String.valueOf(currentTimeMillis));
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a("TNode", 19999, h(), "", "", "time=" + str, "phase=firstframe", "pageName=" + this.g);
    }

    private String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this instanceof a ? "playerlive" : "player";
    }

    public boolean a(TBVideoComponent.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c70ba33", new Object[]{this, cVar})).booleanValue() : (cVar.C == null || ((cVar.C instanceof String) && TextUtils.isEmpty((String) cVar.C))) && (cVar.B == null || ((cVar.B instanceof String) && TextUtils.isEmpty((String) cVar.B)));
    }

    public boolean b(TBVideoComponent.c cVar) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ebb6f12", new Object[]{this, cVar})).booleanValue();
        }
        if (cVar.C == null || cVar.B == null) {
            z = false;
            z2 = false;
        } else {
            z2 = cVar.C instanceof String ? !TextUtils.isEmpty((String) cVar.C) : true;
            z = cVar.B instanceof String ? !TextUtils.isEmpty((String) cVar.B) : true;
        }
        return z2 && z;
    }
}
