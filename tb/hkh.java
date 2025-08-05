package tb;

import com.taobao.android.live.plugin.atype.flexalocal.good.business.fansClub.FansClubResponse;

/* loaded from: classes6.dex */
public interface hkh {
    void postUserGrowthEvent();

    void setFansClubData(FansClubResponse.FansClubResponseData fansClubResponseData);

    void setUnFavoriteFansClubData(FansClubResponse.FansClubResponseData fansClubResponseData);

    void showFavoriteLayer();

    void showToast(String str);

    void showUnFavorite();

    void showUnFollow();
}
