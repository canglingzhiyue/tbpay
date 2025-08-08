package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.officialLive.b;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.StateName;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.c;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.TBTVProgramMessage;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.tbliveinteractive.e;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class hkf extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean e;
    private d.a f;
    private a g;

    static {
        kge.a(169705551);
    }

    public static /* synthetic */ Object ipc$super(hkf hkfVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1473481251) {
            super.onFollowChange((pmw) objArr[0]);
            return null;
        } else if (hashCode == 91915241) {
            super.b();
            return null;
        } else if (hashCode != 92838762) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.c();
            return null;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : StateName.UNFOLLOW;
    }

    public static /* synthetic */ c a(hkf hkfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("4257893a", new Object[]{hkfVar}) : hkfVar.f14053a;
    }

    public static /* synthetic */ void a(hkf hkfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876386bf", new Object[]{hkfVar, str});
        } else {
            hkfVar.a(str);
        }
    }

    public static /* synthetic */ void a(hkf hkfVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64af4175", new Object[]{hkfVar, new Boolean(z), new Boolean(z2)});
        } else {
            hkfVar.a(z, z2);
        }
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a b(hkf hkfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("83b8f46b", new Object[]{hkfVar}) : hkfVar.c;
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a c(hkf hkfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("a94cfd6c", new Object[]{hkfVar}) : hkfVar.c;
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a d(hkf hkfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("cee1066d", new Object[]{hkfVar}) : hkfVar.c;
    }

    public static /* synthetic */ void e(hkf hkfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62c3a39", new Object[]{hkfVar});
        } else {
            hkfVar.g();
        }
    }

    public static /* synthetic */ c f(hkf hkfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("87c2c9ff", new Object[]{hkfVar}) : hkfVar.f14053a;
    }

    public static /* synthetic */ c g(hkf hkfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("2f3ea3c0", new Object[]{hkfVar}) : hkfVar.f14053a;
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a h(hkf hkfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("65312a71", new Object[]{hkfVar}) : hkfVar.c;
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a i(hkf hkfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("8ac53372", new Object[]{hkfVar}) : hkfVar.c;
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a j(hkf hkfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("b0593c73", new Object[]{hkfVar}) : hkfVar.c;
    }

    public hkf(c cVar, com.taobao.alilive.aliliveframework.frame.a aVar, TBLiveDataModel tBLiveDataModel, com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.d dVar) {
        super(cVar, aVar, tBLiveDataModel, dVar);
        this.f = new d.a() { // from class: tb.hkf.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.core.c
            public void onMessageReceived(int i, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
                } else if (i != 1039 || obj == null || !(obj instanceof TBTVProgramMessage)) {
                } else {
                    TBTVProgramMessage tBTVProgramMessage = (TBTVProgramMessage) obj;
                    if (tBTVProgramMessage.liveDO == null || tBTVProgramMessage.liveDO.accountDo == null) {
                        return;
                    }
                    hkf.a(hkf.this, tBTVProgramMessage.liveDO.accountDo.accountId);
                }
            }
        };
        this.c.f().registerMessageListener(this.f, new MessageTypeFilter() { // from class: tb.hkf.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1039;
            }
        });
        if (hkk.ar() || !hkk.V() || !kpj.b(this.c, this.b)) {
            return;
        }
        this.g = new teu(cVar, aVar, tBLiveDataModel, dVar);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a
    public void d() {
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        VideoInfo videoInfo = this.b.mVideoInfo;
        if (videoInfo == null || (accountInfo = videoInfo.broadCaster) == null) {
            return;
        }
        boolean d = b.a().b(videoInfo) ? l.d(videoInfo.officialLiveInfo.follow) : accountInfo.follow;
        if (!d) {
            a().postUserGrowthEvent();
        } else if (kpj.b(this.c, this.b)) {
            if (hkk.ar()) {
                new teu(this.f14053a, this.c, this.b, this.h).d();
            } else {
                a aVar = this.g;
                if (aVar != null) {
                    aVar.d();
                }
            }
        }
        a(d, false);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        VideoInfo videoInfo = this.b.mVideoInfo;
        if (videoInfo == null || videoInfo.broadCaster == null) {
            return;
        }
        String b = b(videoInfo);
        final String a2 = a(videoInfo);
        String str = videoInfo.broadCaster.type;
        String str2 = videoInfo.relatedAccountId;
        if (StringUtils.isEmpty(a2) || StringUtils.isEmpty(str)) {
            return;
        }
        if (!b.a().b(videoInfo)) {
            a(str2, a2, videoInfo.liveId);
        }
        pmt pmtVar = new pmt();
        pmtVar.c = b;
        pmtVar.b = str;
        pmtVar.f32764a = a2;
        pmtVar.p = pmt.FOLLOW_ANCHOR_AVATAR;
        pmd.a().B().a(phg.a().a(this.c, pmtVar), new pmv() { // from class: tb.hkf.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pmv
            public void a(pmz pmzVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f9ec2b9b", new Object[]{this, pmzVar});
                    return;
                }
                hkf.this.a().showToast(plz.a(hkf.a(hkf.this).a(), pmzVar));
                hkf.a(hkf.this, true, true);
                hkf.d(hkf.this).e().a(xkw.EVENT_FOLLOW_FROM_FOLLOWFRAME, a2, hkf.b(hkf.this) == null ? null : hkf.c(hkf.this).G());
                phg.e();
                hkf.e(hkf.this);
            }

            @Override // tb.pmv
            public void a(String str3, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str3, str4});
                } else if (hkf.f(hkf.this).a() == null) {
                } else {
                    String string = hkf.g(hkf.this).a().getString(R.string.taolive_topbar_user_follow_fail_flexalocal);
                    if (!StringUtils.isEmpty(str4)) {
                        string = str4;
                    }
                    hkf.this.a().showToast(string);
                }
            }
        });
        HashMap hashMap = new HashMap();
        hashMap.put("follow_location", "avatar");
        if (this.f14053a.a() != null) {
            phg.a().a(this.c, this.f14053a.a(), a2, hashMap);
        }
        jzn.a(this.c, "follow", 0L);
    }

    private String a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bdff51db", new Object[]{this, videoInfo});
        }
        if (b.a().b(videoInfo)) {
            return videoInfo.officialLiveInfo.accountId;
        }
        return videoInfo.broadCaster.accountId;
    }

    private String b(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af50e15c", new Object[]{this, videoInfo});
        }
        if (b.a().b(videoInfo)) {
            return videoInfo.officialLiveInfo.officialLiveId;
        }
        return videoInfo.liveId;
    }

    private void g() {
        e p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!(this.c instanceof phq) || (p = ((phq) this.c).p()) == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("name", "@ali/alivemodx-follow-guidepopup");
            p.a("invoke-message-component", hashMap);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        if (this.e) {
            return;
        }
        a(this.d);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        this.c.f().unRegisterMessageListener(this.f);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        pmt pmtVar = new pmt();
        pmtVar.f32764a = str;
        pmd.a().B().c(pmtVar, new pmv() { // from class: tb.hkf.4
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
                    hkf.a(hkf.this, z, false);
                    hkf.j(hkf.this).e().a(xkw.EVENT_GET_FOLLOW_STATUS, Boolean.valueOf(z), hkf.h(hkf.this) == null ? null : hkf.i(hkf.this).G());
                }
            }
        });
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (StringUtils.isEmpty(str) || "0".equals(str) || str.equals(str2)) {
        } else {
            pmt pmtVar = new pmt();
            pmtVar.c = str3;
            pmtVar.b = "shop";
            pmtVar.f32764a = str;
            pmd.a().B().a(pmtVar, new pmv() { // from class: tb.hkf.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pmv
                public void a(String str4, String str5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str4, str5});
                    }
                }

                @Override // tb.pmv
                public void a(pmz pmzVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f9ec2b9b", new Object[]{this, pmzVar});
                    }
                }
            });
        }
    }

    private void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.e = z;
        a(z);
        if (z) {
            c(z2);
        } else {
            a().showUnFollow();
        }
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        hkc hkcVar = new hkc(this.f14053a, this.c, this.b, this.h);
        hkcVar.c(z);
        if (hkk.V()) {
            if (kpj.b(this.c, this.b) && !h()) {
                if (hkk.ar()) {
                    this.f14053a.a(new teu(this.f14053a, this.c, this.b, this.h), z);
                } else if (this.g != null) {
                    this.f14053a.a(this.g, z);
                }
            } else {
                this.f14053a.a(hkcVar, z);
            }
        } else {
            this.f14053a.a(hkcVar);
        }
        hkcVar.d();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a, tb.pmx
    public void onFollowChange(pmw pmwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82c75dd", new Object[]{this, pmwVar});
            return;
        }
        super.onFollowChange(pmwVar);
        if (!this.d.equals(pmwVar.f32765a) || this.e == pmwVar.b) {
            return;
        }
        a(pmwVar.b, true);
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : (pmd.a().G() == null || this.b == null || this.b.mVideoInfo == null || this.b.mVideoInfo.broadCaster == null || this.b.mVideoInfo.broadCaster.widgetTip == null || !pmd.a().G().a("88") || !this.b.mVideoInfo.broadCaster.widgetTip.widgetAddition) ? false : true;
    }
}
