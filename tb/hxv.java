package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.base.parallelbiz.a;
import com.taobao.android.order.bundle.search.common.b;
import com.taobao.android.order.bundle.search.ui.pojo.RecommendItem;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class hxv extends b implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<TUrlImageView> b;
    private List<ViewGroup> c;
    private List<TextView> d;
    private View e;

    static {
        kge.a(1563401216);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(hxv hxvVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public hxv(Activity activity) {
        super(activity);
    }

    @Override // com.taobao.android.order.bundle.search.common.a
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : R.layout.babel_search_recommend_holder;
    }

    @Override // com.taobao.android.order.bundle.search.common.a
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.e = view;
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            a((ViewGroup) view, this.b, this.c, this.d);
        }
    }

    @Override // com.taobao.android.order.bundle.search.common.b
    public void a(hxl hxlVar) {
        List<RecommendItem> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecda0bfc", new Object[]{this, hxlVar});
        } else if (hxlVar != null && (hxlVar instanceof hxo) && (list = ((hxo) hxlVar).f28836a) != null && !list.isEmpty()) {
            for (int i = 0; i < list.size() && i < hxk.f28833a; i++) {
                TextView textView = this.d.get(i);
                RecommendItem recommendItem = list.get(i);
                String str = recommendItem.promotionPrice;
                if (!TextUtils.isEmpty(str)) {
                    hyc.a(textView, "￥" + str, true);
                    textView.setVisibility(0);
                }
                String str2 = recommendItem.pic;
                if (!TextUtils.isEmpty(str2)) {
                    this.b.get(i).setImageUrl(str2);
                } else {
                    this.b.get(i).setImageUrl(null);
                    this.b.get(i).setImageDrawable(this.f14568a.getResources().getDrawable(R.drawable.babel_order_default_goods_bg));
                }
                if (!TextUtils.isEmpty(recommendItem.itemName)) {
                    this.e.setContentDescription(recommendItem.itemName);
                }
                this.c.get(i).setTag(recommendItem.url);
            }
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                if (i2 >= list.size()) {
                    this.c.get(i2).setVisibility(4);
                } else {
                    this.c.get(i2).setVisibility(0);
                }
            }
        }
    }

    private void a(ViewGroup viewGroup, List<TUrlImageView> list, List<ViewGroup> list2, List<TextView> list3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba1777a", new Object[]{this, viewGroup, list, list2, list3});
        } else if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof TUrlImageView) {
                    TUrlImageView tUrlImageView = (TUrlImageView) childAt;
                    tUrlImageView.setPlaceHoldImageResId(R.drawable.babel_order_default_goods_bg);
                    tUrlImageView.setStrategyConfig(hyb.a());
                    list.add(tUrlImageView);
                } else if (childAt instanceof TextView) {
                    list3.add((TextView) childAt);
                } else if (childAt instanceof RelativeLayout) {
                    list2.add((RelativeLayout) childAt);
                    childAt.setOnClickListener(this);
                    a((ViewGroup) childAt, list, list2, list3);
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (!(view instanceof RelativeLayout) || view.getTag() == null || !(view.getTag() instanceof String)) {
        } else {
            a.a("RepurchaseDetail", (Map<String, String>) null);
            Nav.from(this.f14568a).toUri((String) view.getTag());
        }
    }
}
