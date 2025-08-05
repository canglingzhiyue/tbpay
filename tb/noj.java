package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.mmd.datasource.bean.InshopAuctionRadiusBean;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class noj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(67380948);
    }

    public static AuctionBaseBean a(JSONObject jSONObject, Map<String, SearchDomBean> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuctionBaseBean) ipChange.ipc$dispatch("32b82810", new Object[]{jSONObject, map});
        }
        if (jSONObject == null) {
            return null;
        }
        InshopAuctionRadiusBean inshopAuctionRadiusBean = new InshopAuctionRadiusBean();
        nog.a(jSONObject, inshopAuctionRadiusBean, map);
        inshopAuctionRadiusBean.recommendReason = jSONObject.optString("recommendReason");
        return inshopAuctionRadiusBean;
    }
}
