package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.fansClub.FansClubResponse;
import com.taobao.taolive.sdk.goodlist.l;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class kyd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-827851476);
    }

    public static void a(boolean z, TBLiveDataModel tBLiveDataModel, FansClubResponse.FansClubResponseData fansClubResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec02dc36", new Object[]{new Boolean(z), tBLiveDataModel, fansClubResponseData});
            return;
        }
        l j = a.a().j();
        if (j == null) {
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null && tBLiveDataModel.mVideoInfo.broadCaster != null) {
            hashMap.put("account_id", tBLiveDataModel.mVideoInfo.broadCaster.accountId);
        }
        if (fansClubResponseData != null) {
            hashMap.put("stateType", String.valueOf(fansClubResponseData.status));
        }
        if (z) {
            j.a("FanClub", hashMap);
        } else {
            j.b("Show-FanClub", hashMap);
        }
    }
}
