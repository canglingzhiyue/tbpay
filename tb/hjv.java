package tb;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.core.g;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class hjv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1719009109);
    }

    public static void a(Context context, g gVar, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15dd045a", new Object[]{context, gVar, tBLiveDataModel});
        } else if (context == null || gVar == null || tBLiveDataModel == null || tBLiveDataModel.mInitParams == null || gVar.B) {
        } else {
            String str = tBLiveDataModel.mInitParams.get(aw.PARAM_INTENT_URL);
            String str2 = tBLiveDataModel.mInitParams.get(aw.PARAM_302_URL);
            String str3 = tBLiveDataModel.mInitParams.get(aw.PARAM_302_TYPE);
            if (StringUtils.isEmpty(str3) || StringUtils.isEmpty(str2)) {
                return;
            }
            gVar.B = true;
            char c = 65535;
            int hashCode = str3.hashCode();
            if (hashCode != -1582352494) {
                if (hashCode == -1039745817 && str3.equals("normal")) {
                    c = 1;
                }
            } else if (str3.equals("shareItem")) {
                c = 0;
            }
            if (c == 0) {
                a(context, str, str2, tBLiveDataModel);
            } else if (c != 1) {
            } else {
                Nav.from(context).toUri(str2);
            }
        }
    }

    private static void a(Context context, String str, String str2, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e6004ed", new Object[]{context, str, str2, tBLiveDataModel});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter(aw.PARAM_ITEM_IDS);
            String queryParameter2 = parse.getQueryParameter(aw.PARAM_ITEM_HOLD_TYPE);
            if (StringUtils.isEmpty(queryParameter) || StringUtils.isEmpty(queryParameter2)) {
                plx.b("Jump302Util", "[processShareItem]  holdItemIds or itemHoldType is empty");
                return;
            }
            boolean z2 = (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null || tBLiveDataModel.mVideoInfo.status != 0) ? false : true;
            boolean z3 = (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null || !StringUtils.equals("1", tBLiveDataModel.mVideoInfo.streamStatus)) ? false : true;
            plx.b("Jump302Util", "[processShareItem]  isLive: " + z2 + ", isStreamLive: " + z3);
            if (z2 && z3) {
                z = false;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("detail_back_action", z ? "to_detail" : "to_live");
            pmd.a().e().b("Page_TaobaoLiveWatch", "Detail_Back", hashMap);
            if (!z) {
                return;
            }
            Nav.from(context).toUri(str2);
        }
    }
}
