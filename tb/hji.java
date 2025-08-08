package tb;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.SingleTabBaseView;
import com.taobao.android.live.plugin.atype.flexalocal.input.view.PagerSlidingTabStripAType;
import com.taobao.taobao.R;
import java.util.List;

/* loaded from: classes6.dex */
public class hji extends PagerAdapter implements PagerSlidingTabStripAType.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<SingleTabBaseView> f28699a;
    private Context b;
    private c c;

    static {
        kge.a(-373539385);
        kge.a(1345726390);
    }

    public static /* synthetic */ Object ipc$super(hji hjiVar, String str, Object... objArr) {
        if (str.hashCode() == 50642664) {
            return new Integer(super.getItemPosition(objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : obj == view;
    }

    public hji(c cVar, Context context, List<SingleTabBaseView> list) {
        this.f28699a = list;
        this.b = context;
        this.c = cVar;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.f28699a.size();
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        SingleTabBaseView singleTabBaseView = this.f28699a.get(i);
        viewGroup.removeView(singleTabBaseView);
        viewGroup.addView(singleTabBaseView);
        return singleTabBaseView;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
        } else {
            viewGroup.removeView((View) obj);
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getItemPosition(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
        }
        if (obj instanceof SingleTabBaseView) {
            int indexOf = this.f28699a.indexOf(obj);
            if (indexOf == -1) {
                return -2;
            }
            return indexOf;
        }
        return super.getItemPosition(obj);
    }

    @Override // android.support.v4.view.PagerAdapter
    public CharSequence getPageTitle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("1a9ab8b1", new Object[]{this, new Integer(i)});
        }
        List<SingleTabBaseView> list = this.f28699a;
        if (list != null && list.size() > i) {
            return this.f28699a.get(i).tabName;
        }
        return null;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.input.view.PagerSlidingTabStripAType.b
    public View a(int i) {
        View inflate;
        ItemCategory itemCategory;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("46aa9b1d", new Object[]{this, new Integer(i)});
        }
        if (a.a(this.c)) {
            if (this.c.c.x) {
                inflate = LayoutInflater.from(this.b).inflate(R.layout.taolive_goods_sort_custom_tab3_flexalocal, (ViewGroup) null);
            } else {
                inflate = LayoutInflater.from(this.b).inflate(R.layout.taolive_goods_sort_custom_tab2_flexalocal, (ViewGroup) null);
            }
        } else {
            inflate = LayoutInflater.from(this.b).inflate(R.layout.taolive_goods_sort_custom_tab_flexalocal, (ViewGroup) null);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (i == 0) {
            if (a.a(this.c)) {
                layoutParams.setMargins(hin.a(this.b, 8.0f), 0, 0, 0);
            } else {
                layoutParams.setMargins(hin.a(this.b, 15.0f), 0, 0, 0);
            }
        }
        inflate.setLayoutParams(layoutParams);
        List<SingleTabBaseView> list = this.f28699a;
        if (list != null && list.size() > i && (itemCategory = this.f28699a.get(i).getItemCategory()) != null) {
            TextView textView = (TextView) inflate.findViewById(R.id.taolive_goods_strip_text);
            textView.setText(itemCategory.name);
            AliUrlImageView aliUrlImageView = (AliUrlImageView) inflate.findViewById(R.id.taolive_goods_strip_image_icon);
            if (!StringUtils.isEmpty(itemCategory.iconUrl)) {
                aliUrlImageView.setImageUrl(itemCategory.iconUrl);
                aliUrlImageView.setVisibility(0);
                if (a.a(this.c)) {
                    hiq.a(this.b, aliUrlImageView, 17.5f);
                } else {
                    hiq.a(this.b, aliUrlImageView, 12.0f);
                }
            } else {
                aliUrlImageView.setVisibility(8);
            }
            if (a.a(this.c) && this.c.c.x) {
                return inflate;
            }
            AliUrlImageView aliUrlImageView2 = (AliUrlImageView) inflate.findViewById(R.id.taolive_goods_strip_image_selected);
            AliUrlImageView aliUrlImageView3 = (AliUrlImageView) inflate.findViewById(R.id.taolive_goods_strip_image_unselected);
            aliUrlImageView2.setScaleType(ImageView.ScaleType.FIT_START);
            aliUrlImageView3.setScaleType(ImageView.ScaleType.FIT_START);
            hiq.a(this.b, aliUrlImageView2, 14.0f);
            hiq.a(this.b, aliUrlImageView3, 14.0f);
            if (!StringUtils.isEmpty(itemCategory.selectedPic)) {
                aliUrlImageView2.setImageUrl(itemCategory.selectedPic);
                textView.setVisibility(8);
            }
            if (!StringUtils.isEmpty(itemCategory.unSelectedPic)) {
                aliUrlImageView3.setImageUrl(itemCategory.unSelectedPic);
                textView.setVisibility(8);
            }
        }
        return inflate;
    }
}
