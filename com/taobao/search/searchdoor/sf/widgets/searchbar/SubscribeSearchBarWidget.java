package com.taobao.search.searchdoor.sf.widgets.searchbar;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.sf.uikit.SearchInsetFrameLayout;
import com.taobao.taobao.R;
import tb.ium;
import tb.iur;
import tb.kge;

/* loaded from: classes7.dex */
public class SubscribeSearchBarWidget extends SearchBarWidget {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private PopupWindow changeStatusPop;
    private TextView popTextView;
    private boolean searchSubscribe;

    static {
        kge.a(137854624);
    }

    public static /* synthetic */ Object ipc$super(SubscribeSearchBarWidget subscribeSearchBarWidget, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1912803358) {
            super.onClick((View) objArr[0]);
            return null;
        } else if (hashCode != 492098584) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.bindListener();
            return null;
        }
    }

    public SubscribeSearchBarWidget(Activity activity, ium iumVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, searchDoorContext, viewGroup, iurVar);
        this.searchSubscribe = true;
        searchDoorContext.a("g_newSubscribe", "true");
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget, tb.ius
    public View onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        SearchInsetFrameLayout searchInsetFrameLayout = new SearchInsetFrameLayout(this.mActivity);
        searchInsetFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, l.a(48)));
        searchInsetFrameLayout.addView(LayoutInflater.from(this.mActivity).inflate(R.layout.tbsearchdoor_subscribe_searchbar, this.mContainer, false));
        return searchInsetFrameLayout;
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget
    public void setSearchBarLeftTxt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e65ca27", new Object[]{this});
            return;
        }
        this.mSearchBarLeftContainer.setVisibility(0);
        this.mSearchBarLeftTxtTv.setText(this.searchSubscribe ? b.a(R.string.app_follow_action) : "全站");
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget
    public void bindListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d54d418", new Object[]{this});
            return;
        }
        super.bindListener();
        this.mSearchBarLeftContainer.setOnClickListener(this);
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        super.onClick(view);
        if (view == this.mSearchBarLeftContainer) {
            showOrHidePopup();
        } else if (view != this.popTextView) {
        } else {
            this.searchSubscribe = !this.searchSubscribe;
            setSearchBarLeftTxt();
            this.changeStatusPop.dismiss();
            if (this.searchSubscribe) {
                getModel().a("g_mainChannel", "dingyue");
            } else {
                getModel().c("g_mainChannel");
            }
            getModel().c("tab");
        }
    }

    private void showOrHidePopup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c68ba31", new Object[]{this});
            return;
        }
        initPopup();
        if (this.changeStatusPop.isShowing()) {
            this.changeStatusPop.dismiss();
            return;
        }
        if (isDarkMode()) {
            this.mSearchBarLeftContainer.setBackgroundResource(R.drawable.tbsearch_bottom_top_left_radius_dp18_night);
        } else {
            this.mSearchBarLeftContainer.setBackgroundResource(R.drawable.tbsearch_bottom_top_left_radius_dp18);
        }
        this.popTextView.setText(this.searchSubscribe ? "全站" : b.a(R.string.app_follow_action));
        this.changeStatusPop.showAsDropDown(this.mSearchBarLeftContainer, -l.a(7), 0);
    }

    private void initPopup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37cd2c03", new Object[]{this});
        } else if (this.popTextView != null) {
        } else {
            View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_layout_change_subscribe, (ViewGroup) new FrameLayout(getActivity()), false);
            if (isDarkMode()) {
                inflate.findViewById(R.id.ll_pop).setBackgroundResource(R.drawable.tbsearch_bottom_radius_dp18_night);
            }
            this.popTextView = (TextView) inflate.findViewById(R.id.tv_change_subscribe);
            this.popTextView.setOnClickListener(this);
            this.changeStatusPop = new PopupWindow(inflate);
            this.changeStatusPop.setWidth(l.a(80));
            this.changeStatusPop.setHeight(l.a(50));
            this.changeStatusPop.setFocusable(true);
            this.changeStatusPop.setOutsideTouchable(true);
            this.changeStatusPop.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.taobao.search.searchdoor.sf.widgets.searchbar.SubscribeSearchBarWidget.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                    } else {
                        SubscribeSearchBarWidget.this.mSearchBarLeftContainer.setBackgroundDrawable(null);
                    }
                }
            });
        }
    }
}
