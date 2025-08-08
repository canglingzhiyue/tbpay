package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.mmd.uikit.PriceView;
import com.taobao.tao.Globals;
import com.taobao.tao.util.StringUtil;
import com.taobao.taobao.R;

/* loaded from: classes7.dex */
public class nny {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int daySoldTextColor;
    public static final int normalSoldTextColor;

    static {
        kge.a(1363182871);
        daySoldTextColor = Globals.getApplication().getResources().getColor(R.color.double11_text_color);
        normalSoldTextColor = Globals.getApplication().getResources().getColor(R.color.gray_99);
    }

    public static void a(PriceView priceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb80a6b7", new Object[]{priceView});
        } else {
            priceView.setSalesText(null);
        }
    }

    public static void a(PriceView priceView, AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dda899a", new Object[]{priceView, auctionBaseBean});
        } else if (priceView == null) {
        } else {
            if (!StringUtils.isEmpty(auctionBaseBean.daySold)) {
                priceView.setSalesText(auctionBaseBean.daySold);
                priceView.setSalesColor(daySoldTextColor);
            } else if (!StringUtils.isEmpty(auctionBaseBean.realSales)) {
                priceView.setSalesText(auctionBaseBean.realSales);
                priceView.setSalesColor(normalSoldTextColor);
            } else if (!StringUtils.isEmpty(auctionBaseBean.selled)) {
                String a2 = nol.a(auctionBaseBean.selled);
                if (!StringUtil.isEmpty(a2)) {
                    priceView.setSalesText(a2 + b.a(R.string.taobao_app_1005_1_16682));
                } else {
                    priceView.setSalesText(auctionBaseBean.selled + b.a(R.string.taobao_app_1005_1_16682));
                }
                priceView.setSalesColor(normalSoldTextColor);
            } else {
                priceView.setSalesText(null);
            }
        }
    }
}
