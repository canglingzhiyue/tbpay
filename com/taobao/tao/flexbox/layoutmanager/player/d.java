package com.taobao.tao.flexbox.layoutmanager.player;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.av;
import com.taobao.avplayer.bl;
import com.taobao.avplayer.common.z;
import com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent;
import org.json.JSONObject;
import tb.kge;
import tb.oeb;

/* loaded from: classes8.dex */
public class d extends IPlayBack {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public bl i;
    public JSONObject j;

    static {
        kge.a(64069585);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1851217903) {
            super.onVideoProgressChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode != -1028467347) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onVideoStart();
            return null;
        }
    }

    public d(TBVideoComponent tBVideoComponent) {
        super(tBVideoComponent);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        bl blVar = this.i;
        if (blVar == null) {
            return;
        }
        blVar.e(z);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        bl blVar = this.i;
        if (blVar == null) {
            return;
        }
        blVar.f();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        bl blVar = this.i;
        if (blVar == null) {
            return;
        }
        blVar.e();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        bl blVar = this.i;
        if (blVar == null) {
            return;
        }
        blVar.a(DWInstanceType.VIDEO);
        this.i.c();
        this.b = System.currentTimeMillis();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public void a(boolean z, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff475e6", new Object[]{this, new Boolean(z), view});
            return;
        }
        bl blVar = this.i;
        if (blVar == null) {
            return;
        }
        if (z) {
            blVar.b(true);
        }
        this.i.a((av) null);
        this.i.b((z) null);
        this.i.m();
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
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        bl blVar = this.i;
        if (blVar == null) {
            return;
        }
        blVar.e(i);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        bl blVar = this.i;
        return blVar != null && blVar.i() == 1;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        bl blVar = this.i;
        return blVar != null && blVar.i() == 2;
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        } else if (this.i == null) {
        } else {
            this.c.attachVideoView(e());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01eb  */
    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.avplayer.bl a(android.content.Context r5, int r6, int r7, boolean r8, boolean r9, com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.player.d.a(android.content.Context, int, int, boolean, boolean, com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent, boolean, boolean):com.taobao.avplayer.bl");
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack, com.taobao.avplayer.av
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        super.onVideoProgressChanged(i, i2, i3);
        TBVideoComponent.c videoParams = this.c.getVideoParams();
        if (!oeb.ac() || videoParams == null || videoParams.S < 1000 || i < videoParams.S) {
            return;
        }
        a(0);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack, com.taobao.avplayer.av
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        super.onVideoStart();
        onVideoPlay();
    }

    private void c(TBVideoComponent.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("110623ed", new Object[]{this, cVar});
        } else if (b(cVar)) {
            this.i.e(this.c.isMute());
        } else {
            this.i.e(cVar.q);
        }
    }
}
