package tb;

import android.graphics.Color;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.mmd.uikit.PriceView;
import com.taobao.search.mmd.util.d;
import com.taobao.tao.util.TaoHelper;

/* loaded from: classes7.dex */
public class nnx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(59067129);
    }

    public static void a(AuctionBaseBean auctionBaseBean, PriceView priceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8246736", new Object[]{auctionBaseBean, priceView});
        } else if (TextUtils.isEmpty(auctionBaseBean.price)) {
            a(priceView);
        } else {
            b(priceView);
            priceView.setPrefixText(auctionBaseBean.pricePrefix);
            priceView.setUnitText(auctionBaseBean.priceUnit);
            priceView.setLocalPrice(auctionBaseBean.localPrice);
            priceView.setPriceIconSuffix(auctionBaseBean.priceIconSuffixText);
            priceView.setIcon(auctionBaseBean.priceIconUrl, auctionBaseBean.priceIconWidth, auctionBaseBean.priceIconHeight);
            priceView.setPriceTextColor(d.a(auctionBaseBean.priceColor, Color.parseColor("#FF5000")));
            priceView.setIconSuffixColor(d.a(auctionBaseBean.priceIconSuffixColor, Color.parseColor("#FF5000")));
            a(auctionBaseBean.price, priceView);
        }
    }

    public static void a(String str, PriceView priceView) {
        char charAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c199f7ad", new Object[]{str, priceView});
            return;
        }
        String formatPriceStr = TaoHelper.formatPriceStr(str);
        int indexOf = formatPriceStr.indexOf(46);
        if (indexOf == -1) {
            indexOf = formatPriceStr.length();
        }
        priceView.setIntegerPriceText(formatPriceStr.substring(0, indexOf));
        if (indexOf >= formatPriceStr.length()) {
            priceView.setDecimalPriceText(null);
            return;
        }
        String substring = formatPriceStr.substring(indexOf + 1);
        if (!substring.equals("00")) {
            if (!TextUtils.isEmpty(substring) && substring.endsWith("0") && (charAt = substring.charAt(0)) != '0') {
                priceView.setDecimalPriceText("." + charAt);
                return;
            }
            priceView.setDecimalPriceText("." + substring);
            return;
        }
        priceView.setDecimalPriceText(null);
    }

    public static void a(PriceView priceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb80a6b7", new Object[]{priceView});
        } else {
            priceView.setVisibility(8);
        }
    }

    public static void b(PriceView priceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be6d1016", new Object[]{priceView});
        } else {
            priceView.setVisibility(0);
        }
    }
}
