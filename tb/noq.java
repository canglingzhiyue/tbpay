package tb;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.o2o.ad.a;
import com.taobao.android.searchbaseframe.util.g;
import com.taobao.search.common.uikit.SearchUrlImageView;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.mmd.datasource.bean.ListStyle;
import com.taobao.taobao.R;

/* loaded from: classes7.dex */
public class noq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1480801203);
    }

    public static void a(SearchUrlImageView searchUrlImageView, AuctionBaseBean auctionBaseBean, ListStyle listStyle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3e9b74f", new Object[]{searchUrlImageView, auctionBaseBean, listStyle, new Integer(i)});
            return;
        }
        float f = 0.6666667f;
        if (!TextUtils.isEmpty(auctionBaseBean.uprightImgAspectRatio)) {
            f = g.a(auctionBaseBean.uprightImgAspectRatio, 0.6666667f);
        }
        a(searchUrlImageView, auctionBaseBean, listStyle, i, f);
    }

    public static void a(SearchUrlImageView searchUrlImageView, AuctionBaseBean auctionBaseBean, ListStyle listStyle, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894d9a51", new Object[]{searchUrlImageView, auctionBaseBean, listStyle, new Integer(i), new Float(f)});
            return;
        }
        if (f <= 0.0f) {
            f = 0.6666667f;
        }
        if (auctionBaseBean.isP4p) {
            searchUrlImageView.setStrategyConfig(SearchUrlImageView.STRATEGY_P4P_AUCTION);
        } else {
            searchUrlImageView.setStrategyConfig(SearchUrlImageView.STRATEGY_MAIN_SEARCH_AUCTION);
        }
        String str = auctionBaseBean.picUrl;
        int i2 = R.drawable.tbsearch_android_list_img_placeholder;
        if (listStyle == ListStyle.WATERFALL) {
            i2 = R.drawable.tbsearch_android_wf_img_placeholder;
            ViewGroup.LayoutParams layoutParams = searchUrlImageView.getLayoutParams();
            int a2 = a(layoutParams, i);
            layoutParams.width = a2;
            if (!TextUtils.isEmpty(auctionBaseBean.wfPicUrl)) {
                str = auctionBaseBean.wfPicUrl;
                layoutParams.height = (int) (a2 / f);
            } else {
                layoutParams.height = a2;
            }
            searchUrlImageView.setLayoutParams(layoutParams);
        }
        searchUrlImageView.setPlaceHoldImageResId(i2);
        searchUrlImageView.setImageUrl(str);
    }

    public static int a(ViewGroup.LayoutParams layoutParams, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2578e261", new Object[]{layoutParams, new Integer(i)})).intValue() : layoutParams.width > 0 ? layoutParams.width : (ntx.a() - i) / 2;
    }

    public static void a(ImageView imageView, AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31412dcf", new Object[]{imageView, auctionBaseBean});
        } else if (imageView == null || auctionBaseBean == null) {
        } else {
            imageView.setVisibility(0);
            if (auctionBaseBean.isContainsIcon("p4p")) {
                imageView.setImageResource(R.drawable.tbsearch_flag_p4p);
            } else if (auctionBaseBean.isContainsIcon("hblx")) {
                imageView.setImageResource(R.drawable.tbsearch_flag_flight);
            } else if (auctionBaseBean.isContainsIcon(a.O2O_URL)) {
                imageView.setImageResource(R.drawable.tbsearch_flag_o2o);
            } else {
                imageView.setVisibility(8);
            }
        }
    }
}
