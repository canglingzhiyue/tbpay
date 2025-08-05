package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.fansClub.FansClubResponse;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.StateName;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.c;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* loaded from: classes6.dex */
public class kpi extends a implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "FansClubState";
    private com.taobao.android.live.plugin.atype.flexalocal.good.business.fansClub.a e;
    private boolean f;
    private FansClubResponse.FansClubResponseData g;

    static {
        kge.a(468075235);
        kge.a(-797454141);
    }

    public static /* synthetic */ Object ipc$super(kpi kpiVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : StateName.FANS_CLUB;
    }

    public kpi(c cVar, com.taobao.alilive.aliliveframework.frame.a aVar, TBLiveDataModel tBLiveDataModel, com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.d dVar) {
        super(cVar, aVar, tBLiveDataModel, dVar);
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a
    public void d() {
        VideoInfo.AdmireInfo admireInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        VideoInfo videoInfo = this.b.mVideoInfo;
        if (videoInfo == null || (admireInfo = videoInfo.admireInfo) == null || !admireInfo.hasFansClub) {
            return;
        }
        g();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        VideoInfo videoInfo = this.b.mVideoInfo;
        if (videoInfo == null || videoInfo.broadCaster == null) {
            return;
        }
        if (this.e == null) {
            this.e = new com.taobao.android.live.plugin.atype.flexalocal.good.business.fansClub.a(this);
        }
        String str = videoInfo.broadCaster.encodeAccountId;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e.a(str);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        VideoInfo videoInfo = this.b.mVideoInfo;
        if (videoInfo == null || videoInfo.broadCaster == null || this.f14053a.a() == null) {
            return;
        }
        kyd.a(true, this.b, this.g);
        kpj.a(this.f14053a.a(), this.c, videoInfo.liveId, videoInfo.broadCaster.encodeAccountId);
    }

    private void a(FansClubResponse.FansClubResponseData fansClubResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe9c679", new Object[]{this, fansClubResponseData});
            return;
        }
        this.g = fansClubResponseData;
        if (a() == null) {
            return;
        }
        kyd.a(false, this.b, this.g);
        if (this.f) {
            a().setUnFavoriteFansClubData(fansClubResponseData);
        } else {
            a().setFansClubData(fansClubResponseData);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        try {
            if (!(netBaseOutDo instanceof FansClubResponse)) {
                return;
            }
            a(((FansClubResponse) netBaseOutDo).mo1437getData());
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        FansClubResponse.FansClubResponseData fansClubResponseData = new FansClubResponse.FansClubResponseData();
        fansClubResponseData.status = 0;
        fansClubResponseData.clubLevelWithFavorIcon = "https://gw.alicdn.com/imgextra/i1/O1CN01hfkHBl22rkKdUid9C_!!6000000007174-2-tps-114-78.png";
        fansClubResponseData.clubLevelIcon = "https://gw.alicdn.com/imgextra/i4/O1CN01RtDG5v1V4OKVEHdzH_!!6000000002599-2-tps-126-78.png";
        a(fansClubResponseData);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }
}
