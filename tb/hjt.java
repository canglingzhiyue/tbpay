package tb;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.bean.LiveExpressionTabItem;
import com.taobao.android.live.plugin.atype.flexalocal.input.view.LiveExpressionRecyclerView;
import com.taobao.android.live.plugin.atype.flexalocal.input.view.PagerSlidingTabStripAType;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.utils.b;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class hjt extends PagerAdapter implements PagerSlidingTabStripAType.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<LiveExpressionRecyclerView> f28703a;
    private Context b;
    private List<LiveExpressionTabItem> c;
    private List<View> d = new ArrayList();

    static {
        kge.a(-2046270074);
        kge.a(1345726390);
    }

    public static /* synthetic */ Object ipc$super(hjt hjtVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 50642664) {
            if (hashCode != 446347441) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.getPageTitle(((Number) objArr[0]).intValue());
        }
        return new Integer(super.getItemPosition(objArr[0]));
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : obj == view;
    }

    public hjt(List<LiveExpressionRecyclerView> list, List<LiveExpressionTabItem> list2, Context context) {
        this.f28703a = list;
        this.c = list2;
        this.b = context;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<LiveExpressionRecyclerView> list = this.f28703a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        LiveExpressionRecyclerView liveExpressionRecyclerView = this.f28703a.get(i);
        viewGroup.removeView(liveExpressionRecyclerView);
        viewGroup.addView(liveExpressionRecyclerView);
        return liveExpressionRecyclerView;
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
        if (obj instanceof RecyclerView) {
            int indexOf = this.f28703a.indexOf(obj);
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
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("1a9ab8b1", new Object[]{this, new Integer(i)}) : super.getPageTitle(i);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.input.view.PagerSlidingTabStripAType.b
    public View a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("46aa9b1d", new Object[]{this, new Integer(i)});
        }
        if (this.d.size() > i) {
            return this.d.get(i);
        }
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.taolive_expression_tab_custom_view_flexalocal, (ViewGroup) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.setMargins(0, 0, b.a(this.b, 12.0f), 0);
        layoutParams.width = b.a(this.b, 42.0f);
        layoutParams.height = b.a(this.b, 30.0f);
        inflate.setBackgroundResource(R.drawable.taolive_room_emoji_change_selector_flexalocal);
        inflate.setLayoutParams(layoutParams);
        List<LiveExpressionTabItem> list = this.c;
        if (list != null && list.size() > i) {
            LiveExpressionTabItem liveExpressionTabItem = this.c.get(i);
            TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.taolive_expression_tab_image);
            if (!StringUtils.isEmpty(liveExpressionTabItem.resUrl)) {
                tUrlImageView.setImageUrl(liveExpressionTabItem.resUrl);
            }
        }
        this.d.add(inflate);
        return inflate;
    }
}
