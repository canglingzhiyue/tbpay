package tb;

import android.app.Activity;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.q;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.e;
import com.taobao.search.searchdoor.sf.widgets.suggest.data.SuggestCellBean;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.itb;
import tb.nrw;

/* loaded from: classes7.dex */
public class nru extends nrq implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final itb.a CREATOR;

    /* renamed from: a  reason: collision with root package name */
    public int f31701a;
    public int e;
    public int f;
    public TextView g;
    public LinearLayout h;
    public View i;
    private TextView j;

    public static /* synthetic */ Object ipc$super(nru nruVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.nrq, tb.itd
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "SuggestItemCellWidget";
    }

    static {
        kge.a(-1781854403);
        kge.a(-1201612728);
        CREATOR = new itb.a() { // from class: tb.nru.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public itd a(itb.b bVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (itd) ipChange.ipc$dispatch("f42f608a", new Object[]{this, bVar}) : new nru(R.layout.tbsearchdoor_suggestion_item, bVar.f29303a, bVar.b, bVar.c, (e) bVar.f);
            }
        };
    }

    public nru(int i, Activity activity, ium iumVar, ViewGroup viewGroup, e eVar) {
        super(LayoutInflater.from(activity).inflate(i, viewGroup, false), activity, iumVar, eVar);
        Resources resources = Globals.getApplication().getResources();
        this.f31701a = ntx.a();
        this.e = resources.getColor(R.color.F_L);
        this.f = resources.getColor(R.color.tbsearch_suggest_grey);
        this.g = (TextView) this.itemView.findViewById(R.id.keyword);
        this.h = (LinearLayout) this.itemView.findViewById(R.id.magic_layout);
        this.i = this.itemView.findViewById(R.id.upArrow);
        this.j = (TextView) this.itemView.findViewById(R.id.tv_suggest_icon);
    }

    @Override // tb.nrq
    public void b(int i, ActivateTypedBean activateTypedBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb930ca1", new Object[]{this, new Integer(i), activateTypedBean});
            return;
        }
        SuggestCellBean suggestCellBean = (SuggestCellBean) activateTypedBean;
        this.itemView.setTag(suggestCellBean);
        this.itemView.setOnClickListener(this);
        a(suggestCellBean);
        this.i.setOnClickListener(this);
        this.i.setTag(suggestCellBean);
    }

    private void a(SuggestCellBean suggestCellBean) {
        List<int[]> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2f13324", new Object[]{this, suggestCellBean});
            return;
        }
        try {
            list = b(suggestCellBean.showText);
        } catch (Throwable unused) {
            q.b("SuggestItemCellWidget", "compute grey positions error");
            list = null;
        }
        if (list != null && list.size() > 0) {
            try {
                a(suggestCellBean.showText, list);
            } catch (Throwable unused2) {
                q.b("SuggestItemCellWidget", "renderSuggestGrey error");
            }
        } else if (!TextUtils.isEmpty(suggestCellBean.showText)) {
            this.g.setText(suggestCellBean.showText);
        }
        this.g.setTextColor(this.e);
        this.g.getPaint().setFakeBoldText(false);
        this.g.setMaxWidth(((this.f31701a - this.itemView.getPaddingLeft()) - this.itemView.getPaddingRight()) - DensityUtil.dip2px(this.g.getContext(), 53.0f));
        this.h.removeAllViews();
        if (!TextUtils.isEmpty(suggestCellBean.icon)) {
            this.j.setVisibility(0);
            this.j.setText(suggestCellBean.icon);
            return;
        }
        this.j.setVisibility(8);
    }

    private void a(String str, List<int[]> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, str, list});
        } else if (TextUtils.isEmpty(str)) {
            this.g.setText("");
            q.a("SuggestItemCellWidget", "renderSuggestGrey keyword is empty");
        } else {
            SpannableString spannableString = new SpannableString(str);
            for (int[] iArr : list) {
                int i = iArr[0];
                int i2 = iArr[1];
                if (i >= 0 && i2 >= 0) {
                    spannableString.setSpan(new ForegroundColorSpan(this.f), i, i2, 33);
                }
            }
            this.g.setText(spannableString);
        }
    }

    private List<int[]> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89cdf874", new Object[]{this, str});
        }
        SearchDoorContext a2 = j().a();
        ArrayList arrayList = null;
        if (a2 == null) {
            return null;
        }
        String b = a2.b();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(b)) {
            if (str.length() <= 50) {
                arrayList = new ArrayList();
                int i = 0;
                while (true) {
                    int indexOf = str.indexOf(b, i);
                    if (indexOf < 0) {
                        break;
                    }
                    int length = b.length() + indexOf;
                    arrayList.add(new int[]{indexOf, length});
                    i = length;
                }
            } else {
                return null;
            }
        }
        return arrayList;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        SuggestCellBean suggestCellBean = (SuggestCellBean) view.getTag();
        if (suggestCellBean == null) {
            return;
        }
        if (view.getId() == R.id.upArrow) {
            postEvent(nrw.a.a(suggestCellBean.showText));
        } else {
            postEvent(nrw.d.a(suggestCellBean.searchText, suggestCellBean.suggestRn, suggestCellBean.result != null ? suggestCellBean.result.h : "", suggestCellBean.params));
        }
    }
}
