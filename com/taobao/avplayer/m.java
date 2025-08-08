package com.taobao.avplayer;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.ado;
import tb.kge;

/* loaded from: classes6.dex */
public class m implements at {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.avplayer.player.c f16530a;
    private DWContext b;

    static {
        kge.a(-1248604079);
        kge.a(-1335059451);
    }

    @Override // com.taobao.avplayer.at
    public List<com.taobao.taobaoavsdk.f> a(List<com.taobao.taobaoavsdk.e> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        return null;
    }

    @Override // com.taobao.avplayer.at
    public void a(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25edca58", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        }
    }

    @Override // com.taobao.avplayer.at
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.at
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        }
    }

    public m(DWContext dWContext, boolean z) {
        this.b = dWContext;
        b(z);
        this.b.setVideo(this);
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f16530a = new com.taobao.avplayer.player.c(this.b, false);
        this.f16530a.a(z);
        if (!StringUtils.isEmpty(this.b.mPlayContext.getVideoUrl())) {
            a(this.b.mPlayContext.getVideoUrl());
        }
        f();
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        com.taobao.avplayer.player.c cVar = this.f16530a;
        return cVar != null && cVar.z();
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        com.taobao.avplayer.player.c cVar = this.f16530a;
        return cVar != null && cVar.A();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (str.startsWith(ado.URL_SEPARATOR)) {
            if (this.b.mConfigAdapter != null && !this.b.mConfigAdapter.b()) {
                str = "http:" + str;
            } else {
                str = com.taobao.vessel.utils.b.HTTPS_SCHEMA + str;
            }
        }
        this.f16530a.a(str);
    }

    public View d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f7f4866d", new Object[]{this}) : this.f16530a.i();
    }

    public void a(aw awVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1736eb1b", new Object[]{this, awVar});
            return;
        }
        com.taobao.avplayer.player.c cVar = this.f16530a;
        if (cVar == null) {
            return;
        }
        cVar.a(awVar);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : (this.f16530a.f() == 1 || this.f16530a.f() == 2) ? false : true;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        com.taobao.avplayer.player.c cVar = this.f16530a;
        if (cVar == null) {
            return;
        }
        cVar.a(0.0f);
    }

    @Override // com.taobao.avplayer.at
    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        com.taobao.avplayer.player.c cVar = this.f16530a;
        if (cVar == null) {
            return 0;
        }
        return cVar.j();
    }

    @Override // com.taobao.avplayer.at
    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue();
        }
        com.taobao.avplayer.player.c cVar = this.f16530a;
        if (cVar == null) {
            return 0;
        }
        return cVar.k();
    }

    @Override // com.taobao.avplayer.at
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.f16530a.f() == 4 || (this.f16530a.g() && this.f16530a.h() == 4)) {
            if (this.f16530a.g()) {
                this.f16530a.f(0);
            } else {
                this.f16530a.c(0);
            }
            j();
        } else {
            this.f16530a.p();
        }
    }

    @Override // com.taobao.avplayer.at
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        com.taobao.avplayer.player.c cVar = this.f16530a;
        if (cVar == null) {
            return;
        }
        cVar.q();
    }

    @Override // com.taobao.avplayer.at
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        com.taobao.avplayer.player.c cVar = this.f16530a;
        if (cVar == null) {
            return;
        }
        cVar.b(false);
    }

    @Override // com.taobao.avplayer.at
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.avplayer.player.c cVar = this.f16530a;
        if (cVar == null) {
            return;
        }
        cVar.e(z);
    }

    @Override // com.taobao.avplayer.at
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.avplayer.player.c cVar = this.f16530a;
        if (cVar == null) {
            return;
        }
        cVar.c(i);
    }

    @Override // com.taobao.avplayer.at
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.avplayer.player.c cVar = this.f16530a;
        if (cVar == null) {
            return;
        }
        cVar.d(i);
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        com.taobao.avplayer.player.c cVar = this.f16530a;
        if (cVar == null) {
            return;
        }
        cVar.x();
    }

    public void a(com.taobao.avplayer.common.ae aeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df620a97", new Object[]{this, aeVar});
            return;
        }
        com.taobao.avplayer.player.c cVar = this.f16530a;
        if (cVar == null) {
            return;
        }
        cVar.a(aeVar);
    }

    @Override // com.taobao.avplayer.at
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        com.taobao.avplayer.player.c cVar = this.f16530a;
        if (cVar == null) {
            return;
        }
        cVar.r();
    }

    @Override // com.taobao.avplayer.at
    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue();
        }
        com.taobao.avplayer.player.c cVar = this.f16530a;
        if (cVar == null) {
            return 0;
        }
        return cVar.t();
    }

    @Override // com.taobao.avplayer.at
    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue();
        }
        com.taobao.avplayer.player.c cVar = this.f16530a;
        if (cVar == null) {
            return 0;
        }
        return cVar.getCurrentPosition();
    }

    @Override // com.taobao.avplayer.at
    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue();
        }
        com.taobao.avplayer.player.c cVar = this.f16530a;
        if (cVar == null) {
            return 0;
        }
        return cVar.l();
    }

    @Override // com.taobao.avplayer.at
    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64de46b", new Object[]{this})).intValue();
        }
        com.taobao.avplayer.player.c cVar = this.f16530a;
        if (cVar == null) {
            return 0;
        }
        return cVar.m();
    }

    @Override // com.taobao.avplayer.at
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        com.taobao.avplayer.player.c cVar = this.f16530a;
        if (cVar == null) {
            return;
        }
        cVar.b(f);
    }

    @Override // com.taobao.avplayer.at
    public float r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65bfbe9", new Object[]{this})).floatValue();
        }
        com.taobao.avplayer.player.c cVar = this.f16530a;
        if (cVar == null) {
            return 0.0f;
        }
        cVar.a();
        return 0.0f;
    }

    @Override // com.taobao.avplayer.at
    public int t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aee", new Object[]{this})).intValue() : this.f16530a.f();
    }

    @Override // com.taobao.avplayer.at
    public int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("686426f", new Object[]{this})).intValue();
        }
        if (this.f16530a.g()) {
            return this.f16530a.h();
        }
        return this.f16530a.f();
    }

    @Override // com.taobao.avplayer.at
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
        } else if (this.f16530a.f() != 3 && (!this.f16530a.g() || this.f16530a.h() != 3)) {
        } else {
            this.f16530a.p();
        }
    }

    @Override // com.taobao.avplayer.at
    public void b(aw awVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4086cf9c", new Object[]{this, awVar});
        } else {
            this.f16530a.a(awVar);
        }
    }

    @Override // com.taobao.avplayer.at
    public void a(ba baVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173b0272", new Object[]{this, baVar});
        } else {
            this.f16530a.a(baVar);
        }
    }

    @Override // com.taobao.avplayer.at
    public void a(ax axVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17375f7a", new Object[]{this, axVar});
        } else {
            this.f16530a.a(axVar);
        }
    }
}
