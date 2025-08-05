package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.c;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.d;
import com.taobao.android.task.Coordinator;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.utils.VideoStatus;

/* loaded from: classes6.dex */
public class teu extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean e;

    static {
        kge.a(1930528757);
    }

    public static /* synthetic */ Object ipc$super(teu teuVar, String str, Object... objArr) {
        if (str.hashCode() == 91915241) {
            super.b();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : "widget";
    }

    public static /* synthetic */ boolean a(teu teuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c8c38", new Object[]{teuVar})).booleanValue() : teuVar.e;
    }

    public static /* synthetic */ boolean a(teu teuVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("945ad24", new Object[]{teuVar, new Boolean(z)})).booleanValue();
        }
        teuVar.e = z;
        return z;
    }

    public static /* synthetic */ TBLiveDataModel b(teu teuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLiveDataModel) ipChange.ipc$dispatch("41891dfa", new Object[]{teuVar}) : teuVar.b;
    }

    public static /* synthetic */ c c(teu teuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("eef57b", new Object[]{teuVar}) : teuVar.f14053a;
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a d(teu teuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("887aafec", new Object[]{teuVar}) : teuVar.c;
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a e(teu teuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("ae0eb8ed", new Object[]{teuVar}) : teuVar.c;
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a f(teu teuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("d3a2c1ee", new Object[]{teuVar}) : teuVar.c;
    }

    public teu(c cVar, com.taobao.alilive.aliliveframework.frame.a aVar, TBLiveDataModel tBLiveDataModel, d dVar) {
        super(cVar, aVar, tBLiveDataModel, dVar);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!hkk.V() || g()) {
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.teu.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    teu.a(teu.this, pmd.a().G().a("88"));
                    if (teu.a(teu.this) && teu.b(teu.this).mVideoInfo.broadCaster.widgetTip.widgetAddition) {
                        return;
                    }
                    b.a(new Runnable() { // from class: tb.teu.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                teu.c(teu.this).a(teu.this);
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.b == null || this.b.mVideoInfo == null || this.b.mVideoInfo.broadCaster == null || this.b.mVideoInfo.broadCaster.widgetTip == null) {
        } else {
            h();
            kpj.a(this.b.mVideoInfo.broadCaster.widgetTip.widgetJumpUrl, this.c, this.b.mVideoInfo.broadCaster.widgetTip.jumpType, this.b.mVideoInfo.broadCaster.widgetTip.componentData);
        }
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : com.taobao.taolive.sdk.playcontrol.c.i(this.c) == VideoStatus.VIDEO_TIMESHIFT_STATUS || pmd.a().G() == null || this.b == null || this.b.mVideoInfo == null || this.b.mVideoInfo.admireInfo == null || this.b.mVideoInfo.admireInfo.contributionEnabled || this.b.mVideoInfo.broadCaster == null || this.b.mVideoInfo.broadCaster.widgetTip == null || com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().a(this.b);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("avatar_anchorDesktop", null);
        }
    }

    private void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        pmt pmtVar = new pmt();
        pmtVar.f32764a = str;
        if (pmd.a().B() == null) {
            return;
        }
        pmd.a().B().c(pmtVar, new pmv() { // from class: tb.teu.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pmv
            public void a(String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                }
            }

            @Override // tb.pmv
            public void a(pmz pmzVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f9ec2b9b", new Object[]{this, pmzVar});
                } else if (!(pmzVar instanceof pna)) {
                } else {
                    boolean z = ((pna) pmzVar).f32767a;
                    pmw pmwVar = new pmw();
                    pmwVar.f32765a = str;
                    pmwVar.b = z;
                    teu.this.onFollowChange(pmwVar);
                    teu.f(teu.this).e().a(xkw.EVENT_GET_FOLLOW_STATUS, Boolean.valueOf(z), teu.d(teu.this) == null ? null : teu.e(teu.this).G());
                }
            }
        });
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        if (!hkk.ax()) {
            return;
        }
        a(this.d);
    }
}
