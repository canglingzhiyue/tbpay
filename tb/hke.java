package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.StateName;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.c;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.d;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* loaded from: classes6.dex */
public class hke extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(10448260);
    }

    public static /* synthetic */ Object ipc$super(hke hkeVar, String str, Object... objArr) {
        if (str.hashCode() == 53355505) {
            super.onFavoriteChange((pmn) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : StateName.UNFAVORITE;
    }

    public hke(c cVar, com.taobao.alilive.aliliveframework.frame.a aVar, TBLiveDataModel tBLiveDataModel, d dVar) {
        super(cVar, aVar, tBLiveDataModel, dVar);
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
        c(accountInfo.topFollow);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            a().showFavoriteLayer();
        }
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        b(z);
        if (z) {
            hkb hkbVar = new hkb(this.f14053a, this.c, this.b, this.h);
            this.f14053a.a(hkbVar);
            hkbVar.d();
            return;
        }
        a().showUnFavorite();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a, tb.pmo
    public void onFavoriteChange(pmn pmnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32e23f1", new Object[]{this, pmnVar});
            return;
        }
        super.onFavoriteChange(pmnVar);
        if (!this.d.equals(pmnVar.f32761a) || !pmnVar.b) {
            return;
        }
        c(true);
    }
}
