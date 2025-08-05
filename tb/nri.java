package tb;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.search.common.util.l;
import com.taobao.search.common.util.y;
import com.taobao.search.mmd.util.e;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.nqw;
import tb.nrj;
import tb.nrw;

/* loaded from: classes7.dex */
public final class nri extends ius<nrh, View, SearchDoorContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "ReviewWidget";

    /* renamed from: a  reason: collision with root package name */
    private LinearLayout f31686a;
    private TUrlImageView b;
    private TextView c;
    private nrh d;
    private SearchDoorContext e;

    /* loaded from: classes7.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ nrh b;

        public b(nrh nrhVar) {
            this.b = nrhVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            String b;
            SearchDoorContext model;
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            String c = this.b.c();
            String str4 = "";
            if (c == null) {
                c = str4;
            }
            if (c.length() <= 0) {
                z = false;
            }
            if (!z) {
                return;
            }
            SearchDoorContext model2 = nri.this.getModel();
            if (model2 == null || (str = model2.a("channelSrp")) == null) {
                str = str4;
            }
            if (TextUtils.isEmpty(str) && ((model = nri.this.getModel()) == null || (str = model.a(nde.G_CHANNELSRP)) == null)) {
                str = str4;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (this.b.a()) {
                SearchDoorContext model3 = nri.this.getModel();
                if (model3 == null || (str2 = String.valueOf(model3.hashCode())) == null) {
                    str2 = str4;
                }
                str3 = "searchSuggestPageId";
            } else {
                SearchDoorContext model4 = nri.this.getModel();
                if (model4 == null || (str2 = String.valueOf(model4.hashCode())) == null) {
                    str2 = str4;
                }
                str3 = "searchDoorPageId";
            }
            linkedHashMap.put(str3, str2);
            linkedHashMap.put("channel", str);
            linkedHashMap.put(noa.KEY_GRAY_HAIR, String.valueOf(q.a((Object) "true", (Object) nri.this.getModel().a(noa.KEY_SEARCH_ELDER_HOME_OPEN))));
            SearchDoorContext a2 = nri.this.a();
            if (a2 != null && (b = a2.b()) != null) {
                str4 = b;
            }
            linkedHashMap.put("query", str4);
            String a3 = y.a(c, linkedHashMap);
            q.a((Object) a3, "SearchUrlUtil.appendQueryParameter(url, params)");
            com.taobao.search.common.util.q.b("ReviewUrl", a3);
            HashMap hashMap = new HashMap();
            hashMap.put("scene", this.b.f());
            e.a("SearchSuggestReviewButton", hashMap);
            Nav.from(nri.this.getActivity()).toUri(a3);
        }
    }

    static {
        kge.a(-222217966);
        Companion = new a(null);
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : TAG;
    }

    @Override // tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((nrh) obj);
        }
    }

    public final SearchDoorContext a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SearchDoorContext) ipChange.ipc$dispatch("30396e97", new Object[]{this}) : this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nri(Activity activity, ium parent, SearchDoorContext searchDoorContext, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, searchDoorContext, viewGroup, iurVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
        this.e = searchDoorContext;
        subscribeEvent(this);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(384988634);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // tb.ius
    public View onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        LinearLayout linearLayout = new LinearLayout(getActivity());
        linearLayout.setClickable(true);
        Activity activity = getActivity();
        q.a((Object) activity, "activity");
        if (poq.a(activity)) {
            linearLayout.setBackgroundResource(R.drawable.tbsearch_searchdoor_review_bg);
        } else {
            linearLayout.setBackgroundResource(R.drawable.tbsearch_cor_30_solid_fafafa_stoke_1_e1dfe2);
        }
        linearLayout.setOrientation(0);
        linearLayout.setPadding(l.a(10), l.a(7), l.a(10), l.a(7));
        TUrlImageView tUrlImageView = new TUrlImageView(getActivity());
        tUrlImageView.setPlaceHoldImageResId(R.drawable.tbsearch_ic_review);
        tUrlImageView.setErrorImageResId(R.drawable.tbsearch_ic_review);
        this.b = tUrlImageView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(l.a(13), l.a(14));
        layoutParams.gravity = 16;
        layoutParams.setMargins(0, 0, l.a(5), 0);
        linearLayout.addView(this.b, layoutParams);
        TextView textView = new TextView(getActivity());
        textView.setTextSize(1, 13.0f);
        Activity activity2 = getActivity();
        q.a((Object) activity2, "activity");
        if (poq.a(activity2)) {
            textView.setTextColor(Color.parseColor("#50607a"));
        } else {
            textView.setTextColor(Color.parseColor("#666666"));
        }
        this.c = textView;
        linearLayout.addView(this.c);
        linearLayout.setVisibility(8);
        this.f31686a = linearLayout;
        return this.f31686a;
    }

    public void a(nrh nrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c0c134", new Object[]{this, nrhVar});
        } else if (nrhVar == null || q.a((Object) nrhVar.b(), (Object) false)) {
            LinearLayout linearLayout = this.f31686a;
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(8);
        } else {
            LinearLayout linearLayout2 = this.f31686a;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            LinearLayout linearLayout3 = this.f31686a;
            if (linearLayout3 != null) {
                linearLayout3.setOnClickListener(new b(nrhVar));
            }
            TUrlImageView tUrlImageView = this.b;
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl(nrhVar.d());
            }
            String e = nrhVar.e();
            if (e != null) {
                if (e.length() > 0) {
                    TextView textView = this.c;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    TextView textView2 = this.c;
                    if (textView2 == null) {
                        return;
                    }
                    textView2.setText(nrhVar.e());
                    return;
                }
            }
            TextView textView3 = this.c;
            if (textView3 == null) {
                return;
            }
            textView3.setVisibility(8);
        }
    }

    public final void onEventMainThread(nrj.b event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811e251", new Object[]{this, event});
            return;
        }
        q.c(event, "event");
        if (!event.a()) {
            return;
        }
        a(this.d);
    }

    public final void onEventMainThread(nrw.e event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e423f81", new Object[]{this, event});
            return;
        }
        q.c(event, "event");
        com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar = event.f31705a;
        a(bVar != null ? bVar.e : null);
    }

    public final void onEventMainThread(nqw.d event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95b8fe1", new Object[]{this, event});
            return;
        }
        q.c(event, "event");
        com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar = event.f31672a;
        nrh nrhVar = null;
        this.d = bVar != null ? bVar.e : null;
        com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar2 = event.f31672a;
        if (bVar2 != null) {
            nrhVar = bVar2.e;
        }
        a(nrhVar);
    }
}
