package com.taobao.search.searchdoor.sf.widgets.searchbar;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.sf.widgets.searchbar.g;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.ium;
import tb.iur;
import tb.kge;

/* loaded from: classes7.dex */
public class I18nSearchBarWidget extends SearchBarWidget {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2010603190);
    }

    public static /* synthetic */ Object ipc$super(I18nSearchBarWidget i18nSearchBarWidget, String str, Object... objArr) {
        if (str.hashCode() == -506257491) {
            super.findAllViews();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget
    public void loadHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f49aaa94", new Object[]{this});
        }
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget
    public void loadSearchHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66126fdc", new Object[]{this});
        }
    }

    public I18nSearchBarWidget(Activity activity, ium iumVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, searchDoorContext, viewGroup, iurVar);
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget, tb.ius, tb.iup
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        super.findAllViews();
        TUrlImageView tUrlImageView = (TUrlImageView) findView(R.id.imv_i18n_search_icon);
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN016LoLIZ1ckiFOWu84i_!!6000000003639-2-tps-24-24.png");
        }
        View findView = findView(R.id.i18n_search_btn);
        if (findView != null) {
            findView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.search.searchdoor.sf.widgets.searchbar.I18nSearchBarWidget.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        I18nSearchBarWidget.this.onSearchBtnClicked();
                    }
                }
            });
        }
        this.mPhotoSearchButtonFont.setImageUrl(g.PHOTO_SEARCH_ICON_I18N);
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget, tb.ius
    public View onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : LayoutInflater.from(this.mActivity).inflate(R.layout.tbsearchdoor_searchbar_i18n, this.mContainer, false);
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget
    public void setSearchBarBg(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56775e77", new Object[]{this, view, new Boolean(z)});
        } else {
            view.setBackgroundResource(R.drawable.tbsearch_searchdoor_bar_bg_i18n);
        }
    }
}
