package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.openarchitecture.single.a;
import com.taobao.taolive.room.ui.model.TBLiveBizDataModel;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.aj;
import com.taobao.taolive.room.utils.at;
import com.taobao.taolive.sdk.controller.e;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.Map;

/* loaded from: classes8.dex */
public class pka implements pjp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f32710a;

    static {
        kge.a(-129621744);
        kge.a(2031626500);
    }

    public static /* synthetic */ a a(pka pkaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b53a2317", new Object[]{pkaVar}) : pkaVar.f32710a;
    }

    public static /* synthetic */ void a(pka pkaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ecffdc2", new Object[]{pkaVar, new Boolean(z)});
        } else {
            pkaVar.b(z);
        }
    }

    public static /* synthetic */ boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a72de6b1", new Object[]{aVar})).booleanValue() : b(aVar);
    }

    public pka(a aVar) {
        this.f32710a = aVar;
    }

    @Override // tb.pjp
    public void a(String str, String str2, String str3) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (StringUtils.isEmpty(str) || (aVar = this.f32710a) == null || aVar.getRecModel() == null || StringUtils.isEmpty(this.f32710a.getRecModel().accountId) || !str.equals(this.f32710a.getRecModel().accountId)) {
        } else {
            final pmt pmtVar = new pmt();
            pmtVar.f32764a = this.f32710a.getRecModel().accountId;
            pmtVar.c = this.f32710a.getRecModel().liveId;
            if (pmd.a().B() == null) {
                return;
            }
            pmd.a().B().a(pmtVar, new pmv() { // from class: tb.pka.1
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
                        return;
                    }
                    pka.a(pka.this, true);
                    ddw.a().a(xkw.EVENT_ACTION_FOLLOW, pmtVar.f32764a, pka.a(pka.this).getUniStr());
                    Context context = pka.a(pka.this).getContext();
                    if (pka.a(pka.a(pka.this))) {
                        aj.a(context, "关注成功", true);
                    } else {
                        aj.a(context, "关注成功");
                    }
                }
            });
        }
    }

    @Override // tb.pjp
    public void b(String str, String str2, String str3) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
        } else if (StringUtils.isEmpty(str) || (aVar = this.f32710a) == null || aVar.getRecModel() == null || StringUtils.isEmpty(this.f32710a.getRecModel().accountId) || !str.equals(this.f32710a.getRecModel().accountId)) {
        } else {
            final pmt pmtVar = new pmt();
            pmtVar.f32764a = this.f32710a.getRecModel().accountId;
            pmtVar.c = this.f32710a.getRecModel().liveId;
            pmd.a().B().b(pmtVar, new pmv() { // from class: tb.pka.2
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
                        return;
                    }
                    ddw.a().a(xkw.EVENT_ACTION_UNFOLLOW, pmtVar.f32764a, pka.a(pka.this).getUniStr());
                    Context context = pka.a(pka.this).getContext();
                    if (pka.a(pka.a(pka.this))) {
                        aj.a(context, "取消关注成功", false);
                    } else {
                        aj.a(context, "取消关注成功");
                    }
                }
            });
        }
    }

    private static boolean b(a aVar) {
        e globalContext;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8643990", new Object[]{aVar})).booleanValue() : (aVar == null || (globalContext = aVar.getGlobalContext()) == null || globalContext.f() == null || globalContext.f().abilityCompontent == null || !globalContext.f().abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedToast)) ? false : true;
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            a(z);
        }
    }

    public void a(boolean z) {
        TBLiveBizDataModel tBLiveBizDataModel;
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        a aVar = this.f32710a;
        if (aVar == null || (tBLiveBizDataModel = aVar.getTBLiveBizDataModel()) == null || tBLiveBizDataModel.mVideoInfo == null || tBLiveBizDataModel.mVideoInfo.isOfficialType() || (accountInfo = tBLiveBizDataModel.mVideoInfo.broadCaster) == null) {
            return;
        }
        accountInfo.follow = z;
        if (z) {
            return;
        }
        accountInfo.topFollow = false;
    }

    @Override // tb.pjp
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        a aVar = this.f32710a;
        if (aVar == null) {
            return;
        }
        aVar.reportRequest();
    }

    @Override // tb.pjp
    public Object b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("43b9c269", new Object[]{this});
        }
        a aVar = this.f32710a;
        if (aVar == null) {
            return null;
        }
        return aVar.getUtParams();
    }

    @Override // tb.pjp
    public void a(Map<String, String> map) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || (aVar = this.f32710a) == null) {
        } else {
            aVar.updateUserTrackData(map);
        }
    }

    @Override // tb.pjp
    public void b(Map<String, String> map) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (map == null || (aVar = this.f32710a) == null) {
        } else {
            aVar.needPresentAvatarPage(map);
        }
    }

    @Override // tb.pjp
    public void a(final sty styVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff6ce5a0", new Object[]{this, styVar});
            return;
        }
        a aVar = this.f32710a;
        if (aVar == null) {
            return;
        }
        if (styVar != null) {
            aVar.setSmallWindowClickListener(new ISmallWindowStrategy() { // from class: tb.pka.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy
                public void a(View view, String str, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6b9b1c8", new Object[]{this, view, str, str2, str3});
                        return;
                    }
                    sty styVar2 = styVar;
                    if (styVar2 == null) {
                        return;
                    }
                    styVar2.a(view, str, str2, str3);
                }
            });
        } else {
            aVar.setSmallWindowClickListener(null);
        }
    }

    @Override // tb.pjp
    public void a(JSONObject jSONObject) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        ab.a("OpenPlatformListener", "沉浸式设置，OpenPlatformListener收到setContainerOffset，offsetMap = " + jSONObject);
        if (at.a(jSONObject) || (aVar = this.f32710a) == null) {
            return;
        }
        aVar.setContainerOffset(jSONObject);
    }

    @Override // tb.pjp
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        a aVar = this.f32710a;
        if (aVar == null) {
            return;
        }
        aVar.mute(z);
    }

    @Override // tb.pjp
    public VideoInfo c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("5f098967", new Object[]{this});
        }
        a aVar = this.f32710a;
        if (aVar != null && aVar.getTBLiveBizDataModel() != null) {
            return this.f32710a.getTBLiveBizDataModel().mVideoInfo;
        }
        return null;
    }
}
