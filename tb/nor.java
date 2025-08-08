package tb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.intf.event.a;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.common.util.aa;
import com.taobao.search.common.util.r;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.mmd.datasource.bean.IconBean;
import com.taobao.search.mmd.datasource.bean.ListStyle;
import com.taobao.search.sf.e;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;

/* loaded from: classes7.dex */
public class nor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f31611a;
    private static final int b;
    private static final int c;

    public static /* synthetic */ void a(TextView textView, AuctionBaseBean auctionBaseBean, Drawable drawable, ListStyle listStyle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("477db3eb", new Object[]{textView, auctionBaseBean, drawable, listStyle, new Boolean(z)});
        } else {
            b(textView, auctionBaseBean, drawable, listStyle, z);
        }
    }

    static {
        kge.a(1154956379);
        f31611a = nor.class.getSimpleName();
        Resources resources = Globals.getApplication().getResources();
        b = resources.getColor(R.color.tbsearch_auction_title);
        c = resources.getColor(R.color.list_item_click_title_color);
    }

    public static void a(TextView textView, AuctionBaseBean auctionBaseBean, ListStyle listStyle, boolean z, boolean z2) {
        IconBean iconBean;
        SearchDomBean searchDomBean;
        IconBean iconBean2;
        SearchDomBean searchDomBean2;
        int dip2px;
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e5cb36d", new Object[]{textView, auctionBaseBean, listStyle, new Boolean(z), new Boolean(z2)});
        } else if (auctionBaseBean == null) {
            Log.e(f31611a, "auction is null");
        } else {
            SearchDomBean searchDomBean3 = null;
            b(textView, auctionBaseBean, null, listStyle, z2);
            if (z) {
                iconBean = b(auctionBaseBean);
                searchDomBean = iconBean == null ? null : iconBean.searchDomBean;
            } else {
                iconBean = null;
                searchDomBean = null;
            }
            if (searchDomBean == null) {
                IconBean a2 = a(auctionBaseBean);
                if (a2 != null) {
                    searchDomBean3 = a2.searchDomBean;
                }
                iconBean2 = a2;
                searchDomBean2 = searchDomBean3;
                z3 = false;
            } else {
                iconBean2 = iconBean;
                searchDomBean2 = searchDomBean;
            }
            if (!a(iconBean2, searchDomBean2)) {
                return;
            }
            Context context = textView.getContext();
            if ((context instanceof e) && ((e) context).v()) {
                dip2px = DensityUtil.dip2px(context, 14.0f);
            } else {
                dip2px = DensityUtil.dip2px(context, 12.0f);
            }
            a(textView, auctionBaseBean, iconBean2, searchDomBean2, listStyle, z3 ? DensityUtil.dip2px(context, 16.0f) : dip2px, z2);
        }
    }

    public static void a(TextView textView, AuctionBaseBean auctionBaseBean, ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f1b02d", new Object[]{textView, auctionBaseBean, listStyle});
        } else {
            a(textView, auctionBaseBean, listStyle, false, r.R());
        }
    }

    private static boolean a(IconBean iconBean, SearchDomBean searchDomBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30c0bda0", new Object[]{iconBean, searchDomBean})).booleanValue();
        }
        if (searchDomBean != null && iconBean != null) {
            if (StringUtils.equals("text", iconBean.type)) {
                return true;
            }
            if (searchDomBean.width <= 0 || searchDomBean.height <= 0) {
                Log.e(f31611a, "icon size is invalid");
            } else if (!StringUtils.isEmpty(searchDomBean.image)) {
                return true;
            } else {
                Log.e(f31611a, "icon url is empty");
                return false;
            }
        }
        return false;
    }

    private static IconBean a(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IconBean) ipChange.ipc$dispatch("f16c2d3f", new Object[]{auctionBaseBean});
        }
        if (auctionBaseBean.titleIconList != null && auctionBaseBean.titleIconList.size() != 0) {
            return auctionBaseBean.titleIconList.get(0);
        }
        return null;
    }

    private static IconBean b(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IconBean) ipChange.ipc$dispatch("31971400", new Object[]{auctionBaseBean});
        }
        if (auctionBaseBean.videoIconList != null && !auctionBaseBean.videoIconList.isEmpty()) {
            return auctionBaseBean.videoIconList.get(0);
        }
        return null;
    }

    private static void a(final TextView textView, final AuctionBaseBean auctionBaseBean, IconBean iconBean, SearchDomBean searchDomBean, final ListStyle listStyle, final int i, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54ba0064", new Object[]{textView, auctionBaseBean, iconBean, searchDomBean, listStyle, new Integer(i), new Boolean(z)});
        } else if (searchDomBean == null) {
            Log.e(f31611a, "dom is null");
            textView.setVisibility(4);
        } else if (StringUtils.equals(iconBean.type, "text")) {
            nos nosVar = new nos(iconBean, searchDomBean);
            nosVar.setBounds(0, 0, nosVar.getIntrinsicWidth(), nosVar.getIntrinsicHeight());
            b(textView, auctionBaseBean, nosVar, listStyle, z);
        } else {
            final int i2 = (searchDomBean.width * i) / searchDomBean.height;
            b.h().a(searchDomBean.image).addLoaderExtra(esr.BUNDLE_BIZ_CODE, "8920").succListener(new a<SuccPhenixEvent>() { // from class: tb.nor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    BitmapDrawable drawable = succPhenixEvent.getDrawable();
                    if (drawable != null && !succPhenixEvent.isIntermediate()) {
                        drawable.setBounds(0, 0, i2, i);
                        nor.a(textView, auctionBaseBean, drawable, listStyle, z);
                    }
                    return true;
                }
            }).fetch();
        }
    }

    private static void b(TextView textView, AuctionBaseBean auctionBaseBean, Drawable drawable, ListStyle listStyle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dad212ac", new Object[]{textView, auctionBaseBean, drawable, listStyle, new Boolean(z)});
        } else if (auctionBaseBean == null) {
            Log.e(f31611a, "auction is null");
            textView.setVisibility(4);
        } else if (StringUtils.isEmpty(auctionBaseBean.title)) {
            Log.e(f31611a, "title is empty");
            textView.setVisibility(4);
        } else {
            textView.setVisibility(0);
            SpannableStringBuilder a2 = a(auctionBaseBean, listStyle);
            textView.setContentDescription(a2);
            if (a2 == null) {
                Log.e(f31611a, "span is null");
                String str = auctionBaseBean.title;
                if (listStyle == ListStyle.WATERFALL && !StringUtils.isEmpty(auctionBaseBean.wfTitle)) {
                    str = auctionBaseBean.wfTitle;
                }
                textView.setText(str);
                return;
            }
            a(a2, drawable);
            if (z) {
                a(textView, a2, drawable);
            }
            textView.setText(a2, TextView.BufferType.SPANNABLE);
            textView.setTextColor(auctionBaseBean.isClicked ? c : b);
        }
    }

    private static void a(TextView textView, SpannableStringBuilder spannableStringBuilder, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc249fb", new Object[]{textView, spannableStringBuilder, drawable});
            return;
        }
        for (int length = spannableStringBuilder.length() - 2; length > 0; length -= 2) {
            spannableStringBuilder.insert(length, "\u200b");
        }
    }

    private static SpannableStringBuilder a(AuctionBaseBean auctionBaseBean, ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("6a74a35c", new Object[]{auctionBaseBean, listStyle});
        }
        String str = auctionBaseBean.title;
        if (listStyle == ListStyle.WATERFALL && !StringUtils.isEmpty(auctionBaseBean.wfTitle)) {
            str = auctionBaseBean.wfTitle;
        }
        if (StringUtils.isEmpty(auctionBaseBean.preTitleText) || StringUtils.isEmpty(auctionBaseBean.preTitleColor)) {
            return new SpannableStringBuilder(str);
        }
        return aa.a(str, auctionBaseBean.preTitleText, auctionBaseBean.preTitleColor);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0f5f9ef", new Object[]{spannableStringBuilder, drawable});
        } else if (drawable == null) {
        } else {
            spannableStringBuilder.insert(0, "  ");
            spannableStringBuilder.setSpan(new com.taobao.search.mmd.uikit.b(drawable), 0, 1, 33);
        }
    }
}
