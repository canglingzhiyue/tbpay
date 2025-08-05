package com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.hke;
import tb.hkf;
import tb.hkh;
import tb.hkk;
import tb.kge;
import tb.kph;
import tb.kpj;
import tb.phg;
import tb.pmd;
import tb.pmn;
import tb.pmo;
import tb.pmw;
import tb.pmx;

/* loaded from: classes6.dex */
public abstract class a implements pmo, pmx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public c f14053a;
    public TBLiveDataModel b;
    public com.taobao.alilive.aliliveframework.frame.a c;
    public String d;
    public d h;

    static {
        kge.a(1955007286);
        kge.a(1413678939);
        kge.a(-1848285814);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public abstract void d();

    public abstract void e();

    public abstract String f();

    public a(c cVar, com.taobao.alilive.aliliveframework.frame.a aVar, TBLiveDataModel tBLiveDataModel, d dVar) {
        this.f14053a = cVar;
        this.b = tBLiveDataModel;
        this.c = aVar;
        this.h = dVar;
        if (hkk.an() && dVar != null) {
            dVar.a(this);
        }
        VideoInfo videoInfo = this.b.mVideoInfo;
        if (videoInfo != null && videoInfo.broadCaster != null) {
            this.d = videoInfo.broadCaster.accountId;
            if (com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().b(videoInfo)) {
                this.d = videoInfo.officialLiveInfo.accountId;
            }
        }
        pmd.a().B().a(this);
        pmd.a().C().a(this);
    }

    public hkh a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hkh) ipChange.ipc$dispatch("f0589f9", new Object[]{this}) : this.f14053a.c();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        pmd.a().B().b(this);
        pmd.a().C().b(this);
    }

    @Override // tb.pmx
    public void onFollowChange(pmw pmwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82c75dd", new Object[]{this, pmwVar});
        } else if (!this.d.equals(pmwVar.f32765a)) {
        } else {
            if (pmwVar.b) {
                phg.e();
                return;
            }
            a(false);
            this.f14053a.a(new hkf(this.f14053a, this.c, this.b, this.h));
        }
    }

    @Override // tb.pmo
    public void onFavoriteChange(pmn pmnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32e23f1", new Object[]{this, pmnVar});
        } else if (!this.d.equals(pmnVar.f32761a) || pmnVar.b) {
        } else {
            b(false);
            if (kpj.a(this.c, this.b)) {
                kph kphVar = new kph(this.f14053a, this.c, this.b, this.h);
                this.f14053a.a(kphVar);
                kphVar.d();
                return;
            }
            hke hkeVar = new hke(this.f14053a, this.c, this.b, this.h);
            this.f14053a.a(hkeVar);
            hkeVar.d();
        }
    }

    public void a(boolean z) {
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.b.mVideoInfo == null || com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().b(this.b) || (accountInfo = this.b.mVideoInfo.broadCaster) == null) {
        } else {
            accountInfo.follow = z;
            if (z) {
                return;
            }
            accountInfo.topFollow = false;
        }
    }

    public void b(boolean z) {
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (this.b.mVideoInfo == null || (accountInfo = this.b.mVideoInfo.broadCaster) == null) {
        } else {
            accountInfo.topFollow = z;
        }
    }
}
