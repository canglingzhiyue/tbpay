package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.datasource.bean.AuctionListTipBean;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class osh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TIP_TITLE = "title";

    static {
        kge.a(94391294);
    }

    public static AuctionListTipBean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuctionListTipBean) ipChange.ipc$dispatch("ddff2dd1", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        AuctionListTipBean auctionListTipBean = new AuctionListTipBean();
        String optString = jSONObject.optString("title");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        auctionListTipBean.title = optString;
        return auctionListTipBean;
    }
}
