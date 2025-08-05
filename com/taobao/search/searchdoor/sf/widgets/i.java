package com.taobao.search.searchdoor.sf.widgets;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.res.ResourcesCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.search.common.util.k;
import com.taobao.search.common.util.l;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintBean;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.crd;
import tb.fgl;
import tb.ium;
import tb.iur;
import tb.ius;
import tb.kge;
import tb.poq;

/* loaded from: classes7.dex */
public final class i extends ius<SearchBarHintBean, View, SearchDoorContext> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final int b;

    /* renamed from: a  reason: collision with root package name */
    private SearchBarHintBean f19394a;

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "MultiSearchHintWidget";
    }

    @Override // tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((SearchBarHintBean) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Activity activity, ium parent, SearchDoorContext searchDoorContext, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, searchDoorContext, viewGroup, iurVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-1353139011);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(1367682997);
        kge.a(-1201612728);
        Companion = new a(null);
        b = Color.parseColor("#1c1c1c");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ?? view = getView();
        if (view == 0) {
            return;
        }
        view.setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ?? view = getView();
        if (view == 0) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // tb.ius
    public View onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        LinearLayout linearLayout = new LinearLayout(getActivity());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        Activity activity = getActivity();
        q.a((Object) activity, "activity");
        if (poq.a(activity)) {
            marginLayoutParams.leftMargin = l.a(16);
        } else {
            marginLayoutParams.leftMargin = l.a(56);
            marginLayoutParams.bottomMargin = l.a(9);
        }
        marginLayoutParams.topMargin = l.a(3.5f);
        linearLayout.setLayoutParams(marginLayoutParams);
        linearLayout.setOrientation(0);
        return linearLayout;
    }

    public void a(SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e043b093", new Object[]{this, searchBarHintBean});
            return;
        }
        this.f19394a = searchBarHintBean;
        if ((searchBarHintBean != null ? searchBarHintBean.multiSearchText : null) == null || searchBarHintBean.multiDisplayText == null || searchBarHintBean.multiSearchText.length != searchBarHintBean.multiDisplayText.length) {
            return;
        }
        Activity activity = getActivity();
        q.a((Object) activity, "activity");
        boolean a2 = poq.a(activity);
        boolean a3 = a();
        boolean e = e();
        ROOT_VIEW view = getView();
        if (view == 0) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int length = searchBarHintBean.multiSearchText.length;
        for (int i = 0; i < length; i++) {
            String searchText = searchBarHintBean.multiSearchText[i];
            String displayText = searchBarHintBean.multiDisplayText[i];
            q.a((Object) searchText, "searchText");
            q.a((Object) displayText, "displayText");
            viewGroup.addView(a(searchText, displayText, a3, e, a2));
        }
        b(searchBarHintBean);
    }

    private final boolean e() {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (!FestivalMgr.a().a("global")) {
            return false;
        }
        String d = FestivalMgr.a().d("global", "actionBarBackgroundColor");
        return !TextUtils.isEmpty(d) && (a2 = com.taobao.android.searchbaseframe.util.g.a(d, 0)) != 0 && ((((double) Color.red(a2)) * 0.299d) + (((double) Color.green(a2)) * 0.587d)) + (((double) Color.blue(a2)) * 0.114d) < ((double) crd.DETECT_WIDTH);
    }

    private final void b(SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb1acf2", new Object[]{this, searchBarHintBean});
            return;
        }
        HashMap hashMap = new HashMap();
        com.taobao.search.common.util.g gVar = com.taobao.search.common.util.g.INSTANCE;
        String[] strArr = searchBarHintBean.multiSearchText;
        q.a((Object) strArr, "bean.multiSearchText");
        hashMap.put("display_text", gVar.a(kotlin.collections.g.i(strArr), ";"));
        com.taobao.search.common.util.g gVar2 = com.taobao.search.common.util.g.INSTANCE;
        String[] strArr2 = searchBarHintBean.multiDisplayText;
        q.a((Object) strArr2, "bean.multiDisplayText");
        hashMap.put("search_text", gVar2.a(kotlin.collections.g.i(strArr2), ";"));
        String str = searchBarHintBean.suggestRn;
        q.a((Object) str, "bean.suggestRn");
        hashMap.put(k.KEY_SUGGEST_RN, str);
        SearchDoorContext model = getModel();
        q.a((Object) model, "model");
        String f = model.f();
        q.a((Object) f, "model.channelParam");
        hashMap.put("channel_srp", f);
        String a2 = getModel().a(fgl.TARGETITEMID);
        q.a((Object) a2, "model.getParam(\"targetItemId\")");
        hashMap.put("item_id", a2);
        com.taobao.search.mmd.util.e.b("search_hintq_under_door", hashMap);
    }

    private final Drawable a(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("75f5df4e", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        }
        if (z) {
            Activity activity = getActivity();
            q.a((Object) activity, "activity");
            Drawable drawable = activity.getResources().getDrawable(R.drawable.tbsearch_history_tag_background_new_style_new);
            GradientDrawable gradientDrawable = (GradientDrawable) (!(drawable instanceof GradientDrawable) ? null : drawable);
            if (gradientDrawable != null && z2) {
                gradientDrawable.setColor(b);
            }
            q.a((Object) drawable, "activity.resources.getDr…}\n            }\n        }");
            return drawable;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(l.a(15));
        if (z2) {
            gradientDrawable2.setColor(b);
        } else if (z3) {
            gradientDrawable2.setColor(-1);
            gradientDrawable2.setAlpha((int) 63.75d);
        } else {
            gradientDrawable2.setColor(-1);
        }
        return gradientDrawable2;
    }

    private final View a(String str, String str2, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("43bb4b9a", new Object[]{this, str, str2, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        }
        Drawable a2 = a(z3, z, z2);
        TextView textView = new TextView(getActivity());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        if (z3) {
            Activity activity = getActivity();
            q.a((Object) activity, "activity");
            textView.setTextColor(ResourcesCompat.getColor(activity.getResources(), R.color.tbsearch_2024_common_text_color, null));
        } else if (z) {
            textView.setTextColor(Color.parseColor("#AAAAAA"));
        } else if (z2) {
            textView.setTextColor(-1);
        } else {
            textView.setTextColor(Color.parseColor("#666666"));
        }
        textView.setText(str2);
        FrameLayout frameLayout = new FrameLayout(getActivity());
        frameLayout.setBackground(a2);
        int a3 = l.a(12);
        frameLayout.setPadding(a3, 0, a3, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, l.a(z3 ? 27 : 30));
        if (z3) {
            marginLayoutParams.rightMargin = l.a(8);
        } else {
            marginLayoutParams.rightMargin = l.a(6);
        }
        frameLayout.setLayoutParams(marginLayoutParams);
        frameLayout.addView(textView);
        frameLayout.setTag(str);
        frameLayout.setOnClickListener(this);
        return frameLayout;
    }

    private final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (getActivity() instanceof com.taobao.android.xsearchplugin.muise.f) {
            Activity activity = getActivity();
            if (activity == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.xsearchplugin.muise.IDarkModeHolder");
            }
            if (((com.taobao.android.xsearchplugin.muise.f) activity).g()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, v});
            return;
        }
        q.c(v, "v");
        Object tag = v.getTag();
        if (!(tag instanceof String)) {
            tag = null;
        }
        String str = (String) tag;
        if (str == null) {
            return;
        }
        ROOT_VIEW view = getView();
        if (view == 0) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        int indexOfChild = ((ViewGroup) view).indexOfChild(v);
        HashMap hashMap = new HashMap();
        SearchBarHintBean searchBarHintBean = this.f19394a;
        if (searchBarHintBean == null) {
            q.a();
        }
        String[] strArr = searchBarHintBean.multiDisplayText;
        if (indexOfChild >= 0 && indexOfChild < strArr.length) {
            hashMap.put("display_text", strArr[indexOfChild]);
        }
        String[] strArr2 = searchBarHintBean.multiSearchText;
        if (indexOfChild >= 0 && indexOfChild < strArr2.length) {
            hashMap.put("search_text", strArr2[indexOfChild]);
        }
        HashMap hashMap2 = hashMap;
        hashMap2.put(k.KEY_SUGGEST_RN, searchBarHintBean.suggestRn);
        SearchDoorContext model = getModel();
        q.a((Object) model, "model");
        hashMap2.put("channel_srp", model.f());
        hashMap2.put(aw.PARAM_SEARCH_KEYWORD_POS, String.valueOf(indexOfChild));
        hashMap2.put("item_id", getModel().a(fgl.TARGETITEMID));
        com.taobao.search.mmd.util.e.a("hintq_under_door_click", hashMap2);
        postEvent(new h(str));
    }
}
