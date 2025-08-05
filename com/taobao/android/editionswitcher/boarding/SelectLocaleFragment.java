package com.taobao.android.editionswitcher.boarding;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.boarding.LocaleModel;
import com.taobao.android.editionswitcher.boarding.g;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class SelectLocaleFragment extends Fragment implements View.OnClickListener, c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b boardingLife;
    public TextView bottomTips;
    public View confirmBtn;
    public View countryBtn;
    public View langBtn;
    public TextView langTx;
    public TextView localeTx;
    private e mPresenter;
    private View mRootView;
    public TextView selectTx;

    static {
        kge.a(-1292282730);
        kge.a(-1201612728);
        kge.a(-1194875389);
    }

    public static /* synthetic */ Object ipc$super(SelectLocaleFragment selectLocaleFragment, String str, Object... objArr) {
        if (str.hashCode() == -1589549411) {
            super.onAttach((Context) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ e access$000(SelectLocaleFragment selectLocaleFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("f4ba6dcc", new Object[]{selectLocaleFragment}) : selectLocaleFragment.mPresenter;
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        if (!(getActivity() instanceof b)) {
            return;
        }
        this.boardingLife = (b) getActivity();
    }

    @Override // com.taobao.android.editionswitcher.boarding.c
    public void onSetDone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8443e2c", new Object[]{this});
            return;
        }
        b bVar = this.boardingLife;
        if (bVar == null) {
            return;
        }
        bVar.onLocaleSetDone();
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (this.mRootView == null) {
            this.mRootView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ovs_layout_select_locale, viewGroup, false);
        }
        intiView();
        this.mPresenter = new h(this);
        return this.mRootView;
    }

    private void intiView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee89b526", new Object[]{this});
            return;
        }
        this.selectTx = (TextView) this.mRootView.findViewById(R.id.ovs_select_tips);
        this.bottomTips = (TextView) this.mRootView.findViewById(R.id.ovs_bottom_tips);
        this.countryBtn = this.mRootView.findViewById(R.id.ovs_country_btn);
        this.langBtn = this.mRootView.findViewById(R.id.ovs_lang_btn);
        this.localeTx = (TextView) this.mRootView.findViewById(R.id.ovs_locale_country_tx);
        this.langTx = (TextView) this.mRootView.findViewById(R.id.ovs_locale_lang_tx);
        this.confirmBtn = this.mRootView.findViewById(R.id.ovs_confirm_btn);
        this.countryBtn.setOnClickListener(this);
        this.langBtn.setOnClickListener(this);
        this.confirmBtn.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.ovs_country_btn) {
            showCountryPop();
        } else if (id == R.id.ovs_lang_btn) {
            showLangPop();
        } else if (id != R.id.ovs_confirm_btn) {
        } else {
            this.mPresenter.a();
        }
    }

    private void showCountryPop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8e47a3f", new Object[]{this});
            return;
        }
        LocaleModel.LocaleData b = this.mPresenter.b();
        StringBuilder sb = new StringBuilder();
        List<LocaleModel.LocaleData> d = this.mPresenter.d();
        sb.append("selectedEdition=");
        sb.append(b.key);
        sb.append(",supportEdition=");
        for (LocaleModel.LocaleData localeData : d) {
            sb.append(localeData.key);
            sb.append(",");
        }
        g a2 = g.a(getActivity(), this.mPresenter.d()).a(getString(R.string.ovs_locale_title_country));
        a2.b(getString(R.string.ovs_locale_chosen_country) + this.mPresenter.b().value).a(new g.a() { // from class: com.taobao.android.editionswitcher.boarding.SelectLocaleFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.editionswitcher.boarding.g.a
            public void a(LocaleModel.LocaleData localeData2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1151f12e", new Object[]{this, localeData2});
                    return;
                }
                SelectLocaleFragment.access$000(SelectLocaleFragment.this).b(localeData2);
                TBS.Ext.commitEvent("Page_LocalBoarding", 2101, "editionSelect", null, null, "selectedEdition=" + localeData2.key);
            }
        }).a(getActivity());
        TBS.Ext.commitEvent("Page_LocalBoarding", 2201, "editionPopShow", null, null, sb.toString());
    }

    private void showLangPop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae64414d", new Object[]{this});
            return;
        }
        LocaleModel.LocaleData c = this.mPresenter.c();
        StringBuilder sb = new StringBuilder();
        List<LocaleModel.LocaleData> e = this.mPresenter.e();
        if (e == null || e.isEmpty()) {
            e = new ArrayList<>();
            e.add(c);
        }
        sb.append("selectedLang=");
        sb.append(c.key);
        sb.append(",supportLang=");
        for (LocaleModel.LocaleData localeData : e) {
            sb.append(localeData.key);
            sb.append(",");
        }
        g a2 = g.a(getActivity(), e).a(getString(R.string.ovs_locale_title_lang));
        a2.b(getString(R.string.ovs_locale_chosen_lang) + c.value).a(new g.a() { // from class: com.taobao.android.editionswitcher.boarding.SelectLocaleFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.editionswitcher.boarding.g.a
            public void a(LocaleModel.LocaleData localeData2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1151f12e", new Object[]{this, localeData2});
                    return;
                }
                SelectLocaleFragment.access$000(SelectLocaleFragment.this).a(localeData2);
                TBS.Ext.commitEvent("Page_LocalBoarding", 2101, "langSelect", null, null, "selectedLang=" + localeData2.key);
            }
        }).a(getActivity());
        TBS.Ext.commitEvent("Page_LocalBoarding", 2201, "langPopShow", null, null, sb.toString());
    }

    @Override // com.taobao.android.editionswitcher.boarding.c
    public void setPromoteTx(LocaleModel.PromoteText promoteText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b06d330", new Object[]{this, promoteText});
        } else if (promoteText == null) {
        } else {
            this.selectTx.setText(promoteText.selectText);
            this.bottomTips.setText(promoteText.bottomTips);
        }
    }

    @Override // com.taobao.android.editionswitcher.boarding.c
    public void refresh(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc49df6", new Object[]{this, str, str2});
            return;
        }
        this.localeTx.setText(str);
        this.langTx.setText(str2);
    }
}
