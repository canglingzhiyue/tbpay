package com.taobao.search.searchdoor.sf.widgets.searchbar;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.sf.k;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.ium;
import tb.iur;
import tb.kge;

/* loaded from: classes7.dex */
public final class PopupSearchBarWidget extends SearchBarWidget {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TUrlImageView imvClose;

    static {
        kge.a(849387646);
    }

    public static /* synthetic */ Object ipc$super(PopupSearchBarWidget popupSearchBarWidget, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -506257491) {
            super.findAllViews();
            return null;
        } else if (hashCode != -111204972) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onHitDarkMode();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupSearchBarWidget(Activity activity, ium parent, SearchDoorContext searchDoorContext, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, searchDoorContext, viewGroup, iurVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget, tb.ius
    public View onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        View inflate = LayoutInflater.from(this.mActivity).inflate(R.layout.tbsearchdoor_searchbar_popup, this.mContainer, false);
        q.a((Object) inflate, "LayoutInflater.from(mAct…popup, mContainer, false)");
        return inflate;
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget, tb.ius, tb.iup
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        super.findAllViews();
        View findView = findView(R.id.imv_close_popup);
        if (findView == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
        }
        this.imvClose = (TUrlImageView) findView;
        TUrlImageView tUrlImageView = this.imvClose;
        if (tUrlImageView == null) {
            q.b("imvClose");
        }
        tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN014MKXkw1bH6wJIYVF2_!!6000000003439-2-tps-72-72.png");
        TUrlImageView tUrlImageView2 = this.imvClose;
        if (tUrlImageView2 == null) {
            q.b("imvClose");
        }
        tUrlImageView2.setOnClickListener(a.INSTANCE);
        if (!isDarkMode()) {
            return;
        }
        onHitDarkMode();
    }

    /* loaded from: classes7.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                k.Companion.b();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View] */
    @Override // com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget, com.taobao.android.xsearchplugin.muise.e
    public void onHitDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95f2594", new Object[]{this});
            return;
        }
        super.onHitDarkMode();
        TUrlImageView tUrlImageView = this.imvClose;
        if (tUrlImageView == null) {
            q.b("imvClose");
        }
        tUrlImageView.setColorFilter(-1);
        ?? view = getView();
        if (view == 0) {
            q.a();
        }
        view.setBackgroundResource(R.drawable.tbsearch_mini_search_bar_background_night);
    }
}
