package tb;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.muise.f;
import com.taobao.search.common.util.l;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.r;
import com.taobao.search.mmd.recommendtip.FlowLayout;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;
import com.taobao.search.searchdoor.sf.widgets.e;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.itb;
import tb.nqw;

/* loaded from: classes7.dex */
public class nql extends nqj<HistoryCellBean, e> implements View.OnClickListener, View.OnLongClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final itb.a COMBINE_CREATOR;
    public static final itb.a CREATOR;
    private static final int g;
    private static final int i;
    private static final int j;
    private static final int k;
    private static final int l;
    private static final int m;
    private static final int r;
    private static final int s;

    /* renamed from: a  reason: collision with root package name */
    public TextView f31669a;
    public TIconFontTextView e;
    public FlowLayout f;
    private View n;
    private int o;
    private int p;
    private boolean q;
    private boolean t;

    public static /* synthetic */ Object ipc$super(nql nqlVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.nqj, tb.itd
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "HistoryActivateCell";
    }

    static {
        kge.a(1119741380);
        kge.a(-1201612728);
        kge.a(1426707756);
        r = l.a(4);
        g = l.a(7);
        s = l.a(4);
        i = l.a(6);
        j = l.a(16);
        k = l.a(5);
        l = l.a(12);
        m = l.a(5);
        CREATOR = new itb.a() { // from class: tb.nql.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public itd a(itb.b bVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (itd) ipChange.ipc$dispatch("f42f608a", new Object[]{this, bVar}) : new nql(R.layout.tbsearch_sf_activate_group, bVar.f29303a, bVar.b, bVar.c, (e) bVar.f);
            }
        };
        COMBINE_CREATOR = new itb.a() { // from class: tb.nql.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public itd a(itb.b bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (itd) ipChange.ipc$dispatch("f42f608a", new Object[]{this, bVar});
                }
                if (poq.a(bVar.f29303a)) {
                    return new nqk(LayoutInflater.from(bVar.f29303a).inflate(R.layout.tbsearch_sf_combine_history_new, bVar.c, false), bVar.f29303a, bVar.b, (e) bVar.f);
                }
                return new nqk(LayoutInflater.from(bVar.f29303a).inflate(R.layout.tbsearch_sf_combine_history, bVar.c, false), bVar.f29303a, bVar.b, (e) bVar.f);
            }
        };
    }

    public nql(int i2, Activity activity, ium iumVar, ViewGroup viewGroup, e eVar) {
        super(LayoutInflater.from(activity).inflate(i2, viewGroup, false), activity, iumVar, eVar);
        this.o = 2;
        this.p = 10;
        this.q = false;
        this.t = poq.a(activity);
        this.f31669a = (TextView) this.itemView.findViewById(R.id.group_title);
        if ((activity instanceof f) && ((f) activity).g()) {
            this.f31669a.setTextColor(-1);
        }
        this.e = (TIconFontTextView) this.itemView.findViewById(R.id.delete_btn);
        this.e.setOnClickListener(this);
        this.f = (FlowLayout) this.itemView.findViewById(R.id.activate_item_container);
        this.n = this.itemView.findViewById(R.id.unfold_arrow_btn);
        this.n.setOnClickListener(this);
        this.p = r.d(10);
        c(this);
        if (b()) {
            this.n.setBackgroundResource(R.drawable.tbsearch_history_tag_background_night);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.t) {
            this.e.setText(getActivity().getResources().getString(R.string.uik_icon_tb_DeleteOutlined));
        } else {
            this.e.setText(getActivity().getResources().getString(R.string.uik_icon_delete));
        }
    }

    @Override // tb.nqj
    public void a(int i2, HistoryCellBean historyCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c14824c3", new Object[]{this, new Integer(i2), historyCellBean});
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        HashMap hashMap = new HashMap();
        if (historyCellBean == null) {
            layoutParams.width = 0;
            layoutParams.height = 0;
            this.itemView.setLayoutParams(layoutParams);
            hashMap.put("errCode", "-1");
            hashMap.put("errMsg", "activateGroup is null");
            TLogTracker.a("History", "DataConvert", hashMap);
            return;
        }
        nqh c = ((e) j()).c();
        if (c == null) {
            hashMap.put("searchHistoryManager", "searchHistoryManager is null");
        }
        boolean d = ((e) j()).a().d();
        hashMap.put("isOpenHistory", String.valueOf(d));
        if (c != null && d) {
            q.a("HistoryActivateCell", "need not to synchronize history, use local history ");
            HistoryCellBean b = c.b();
            if (b != null) {
                historyCellBean.activateItems = b.activateItems;
            }
        }
        if (historyCellBean.activateItems == null || historyCellBean.activateItems.size() == 0) {
            layoutParams.width = 0;
            layoutParams.height = 0;
            this.itemView.setLayoutParams(layoutParams);
            hashMap.put("historyCount", "0");
            TLogTracker.b("History", "DataConvert", hashMap);
            return;
        }
        hashMap.put("historyCount", String.valueOf(historyCellBean.activateItems.size()));
        TLogTracker.b("History", "DataConvert", hashMap);
        this.f31669a.setText(historyCellBean.name);
        c();
        if (r.bj()) {
            this.q = "true".equals(((e) j()).a().a(noa.KEY_SEARCH_ELDER_HOME_OPEN));
            if (this.q) {
                this.e.setText(b.a(R.string.taobao_app_1005_1_16686));
                this.e.setTextSize(1, 19.0f);
                this.f31669a.setTextSize(1, 21.0f);
            } else {
                d();
                float f = 16.0f;
                this.e.setTextSize(1, ((HistoryCellBean) this.h).newStyle ? 16.0f : 20.0f);
                TextView textView = this.f31669a;
                if (((HistoryCellBean) this.h).newStyle) {
                    f = 13.5f;
                }
                textView.setTextSize(1, f);
            }
        }
        a(historyCellBean.activateItems, historyCellBean.rownnum);
        this.f.setTailView(this.n);
        layoutParams.width = -1;
        layoutParams.height = -2;
        this.itemView.setLayoutParams(layoutParams);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!((HistoryCellBean) this.h).newStyle) {
        } else {
            this.f31669a.setTextColor(Color.parseColor("#333333"));
            this.f31669a.setTextSize(1, 13.5f);
            this.e.setTextColor(Color.parseColor("#999999"));
            this.n.setBackgroundResource(b() ? R.drawable.tbsearch_history_tag_background_night_new_style : R.drawable.tbsearch_history_tag_background_new_style);
        }
    }

    private void a(List<ActivateBean> list, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a074ca", new Object[]{this, list, new Integer(i2)});
            return;
        }
        this.f.removeAllViews();
        if (list == null) {
            return;
        }
        if (i2 <= 0) {
            i2 = 2;
        }
        this.o = i2;
        this.f.setMaxLines(this.o);
        Map<String, String> c = ((e) j()).a().c();
        int i3 = 0;
        for (ActivateBean activateBean : list) {
            if (activateBean != null) {
                i3++;
                if (i3 > this.p) {
                    return;
                }
                View a2 = a(this.t, activateBean, this.b, b(), this.q, ((HistoryCellBean) this.h).newStyle, c);
                a2.setOnClickListener(this);
                a2.setOnLongClickListener(this);
                this.f.addView(a2);
            }
        }
        this.f.setVisibility(0);
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : (getActivity() instanceof f) && ((f) getActivity()).g();
    }

    public static View a(boolean z, ActivateBean activateBean, Activity activity, boolean z2, boolean z3, boolean z4, Map<String, String> map) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        boolean z5 = false;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d8a8d6c9", new Object[]{new Boolean(z), activateBean, activity, new Boolean(z2), new Boolean(z3), new Boolean(z4), map});
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(new ViewGroup.LayoutParams(-2, l.a(29)));
        if (z) {
            marginLayoutParams.height = l.a(27);
        }
        frameLayout.setLayoutParams(marginLayoutParams);
        if (z) {
            marginLayoutParams.setMargins(0, r, s, 0);
        } else {
            marginLayoutParams.setMargins(0, g, i, 0);
        }
        frameLayout.setTag(activateBean);
        TUrlImageView tUrlImageView = new TUrlImageView(activity);
        int i2 = j;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 53;
        tUrlImageView.setLayoutParams(layoutParams);
        if (!TextUtils.isEmpty(activateBean.iconUrl)) {
            tUrlImageView.setImageUrl(activateBean.iconUrl);
        }
        TextView textView = new TextView(activity);
        Resources resources = activity.getResources();
        if (map != null && "cart_search".equals(map.get(nde.G_CHANNELSRP))) {
            z5 = true;
        }
        if (z5) {
            drawable = resources.getDrawable(R.drawable.tbsearch_history_tag_background_cart);
        } else if (z4) {
            if (z2) {
                drawable = resources.getDrawable(R.drawable.tbsearch_history_tag_background_night_new_style);
            } else {
                drawable = resources.getDrawable(R.drawable.tbsearch_history_tag_background_new_style);
            }
            if (z) {
                if (z2) {
                    drawable = resources.getDrawable(R.drawable.tbsearch_history_tag_background_night_new_style);
                } else {
                    drawable = resources.getDrawable(R.drawable.tbsearch_history_tag_background_new_style_new);
                }
            }
        } else if (z2) {
            drawable = resources.getDrawable(R.drawable.tbsearch_history_tag_background_night);
        } else {
            drawable = resources.getDrawable(R.drawable.tbsearch_history_tag_background);
        }
        textView.setBackgroundDrawable(drawable);
        int i3 = l;
        int i4 = k;
        textView.setPadding(i3, i4, i3, i4);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        if (z2) {
            textView.setTextColor(resources.getColor(R.color.gray_aa));
        } else {
            textView.setTextColor(resources.getColor(R.color.gray_66));
        }
        if (z) {
            if (z2) {
                textView.setTextColor(resources.getColor(R.color.gray_aa));
            } else {
                textView.setTextColor(Color.parseColor("#11192d"));
            }
        }
        textView.setText(activateBean.keyword);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        if (r.bj() && z3) {
            textView.setTextSize(1, 21.0f);
            marginLayoutParams.height = l.a(39);
        }
        frameLayout.addView(textView);
        frameLayout.addView(tUrlImageView);
        return frameLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == this.e.getId()) {
            postEvent(nqw.e.a());
        } else {
            View view2 = this.n;
            if (view == view2) {
                view2.setVisibility(8);
                this.f.setMaxLines(60);
                this.f.requestLayout();
                HashMap hashMap = new HashMap();
                hashMap.put("channelSrp", ((e) j()).a().f());
                com.taobao.search.mmd.util.e.a("SearchHistory_expand", hashMap);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                i2 = viewGroup.indexOfChild(view);
            }
            Object tag = view.getTag();
            if (!(tag instanceof ActivateBean)) {
                return;
            }
            postEvent(nqw.a.a((ActivateBean) tag, i2, ((HistoryCellBean) this.h).suggestRn));
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
        }
        ActivateBean activateBean = (ActivateBean) view.getTag();
        if (activateBean != null) {
            postEvent(nqw.b.a(activateBean));
        }
        return true;
    }

    private void a(HistoryCellBean historyCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faa4a10", new Object[]{this, historyCellBean});
            return;
        }
        HistoryCellBean historyCellBean2 = (HistoryCellBean) l();
        if (historyCellBean2 == null || historyCellBean == null) {
            q.b("HistoryActivateCell", "history group or new history group is null ");
            return;
        }
        historyCellBean2.activateItems = historyCellBean.activateItems;
        a(m(), historyCellBean2);
    }

    public void onEventMainThread(nqw.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95c789f", new Object[]{this, fVar});
        } else {
            a(fVar.f31673a);
        }
    }
}
