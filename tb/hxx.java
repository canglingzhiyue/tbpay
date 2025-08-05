package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.base.parallelbiz.a;
import com.taobao.android.order.bundle.helper.d;
import com.taobao.android.order.bundle.search.common.b;
import com.taobao.android.order.bundle.search.ui.pojo.RecommendShop;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class hxx extends b implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<ViewGroup> b;

    static {
        kge.a(-1259832028);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(hxx hxxVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public hxx(Activity activity) {
        super(activity);
    }

    @Override // com.taobao.android.order.bundle.search.common.a
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : R.layout.babel_search_recommend_shop_holder;
    }

    @Override // com.taobao.android.order.bundle.search.common.a
    public void a(View view) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null || !(view instanceof ViewGroup)) {
        } else {
            this.b = new ArrayList();
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    return;
                }
                if (viewGroup.getChildAt(i) instanceof LinearLayout) {
                    this.b.add((ViewGroup) viewGroup.getChildAt(i));
                }
                i++;
            }
        }
    }

    @Override // com.taobao.android.order.bundle.search.common.b
    public void a(hxl hxlVar) {
        List<RecommendShop> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecda0bfc", new Object[]{this, hxlVar});
        } else if (hxlVar != null && (hxlVar instanceof hxq) && (list = ((hxq) hxlVar).f28838a) != null) {
            for (int i = 0; i < hxk.b && i < list.size(); i++) {
                this.b.get(i).setVisibility(0);
                a(this.b.get(i), list.get(i));
            }
        }
    }

    private void a(ViewGroup viewGroup, RecommendShop recommendShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436faf02", new Object[]{this, viewGroup, recommendShop});
        } else if (viewGroup != null && recommendShop != null) {
            viewGroup.setTag(recommendShop);
            viewGroup.setOnClickListener(this);
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof TUrlImageView) {
                    TUrlImageView tUrlImageView = (TUrlImageView) childAt;
                    tUrlImageView.setStrategyConfig(hyb.a(false));
                    tUrlImageView.setPlaceHoldImageResId(R.drawable.babel_order_tb_icon_detail_shop);
                    if (!TextUtils.isEmpty(recommendShop.pictUrl)) {
                        tUrlImageView.setImageUrl(recommendShop.pictUrl);
                    } else {
                        tUrlImageView.setImageDrawable(this.f14568a.getResources().getDrawable(R.drawable.babel_order_tb_icon_detail_shop));
                    }
                } else if (childAt instanceof TextView) {
                    ((TextView) childAt).setText(recommendShop.shopName);
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view == null || (tag = view.getTag()) == null || !(tag instanceof RecommendShop)) {
        } else {
            d.a(this.f14568a, ((RecommendShop) tag).shopId);
            a.a("RepurchaseSeller", (Map<String, String>) null);
        }
    }
}
