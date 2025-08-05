package com.taobao.login4android.ui;

import android.view.View;
import android.widget.TextView;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.login.ui.RecommendLoginFragment;
import com.ali.user.mobile.ui.widget.BottomMenuFragment;
import com.ali.user.mobile.ui.widget.MenuItem;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.activity.auth.AlipayAuth;
import com.taobao.login4android.activity.auth.QrScan;
import com.taobao.login4android.uti.PrivacyUtil;
import com.taobao.taobao.R;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class TaobaoRecommendLoginFragment extends RecommendLoginFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View dividerView;
    public TextView mAlipayLoginTV;
    public View mQrDividerView;
    public TextView mQrLoginTV;
    public boolean needSetAlipayText = true;

    static {
        kge.a(740355784);
    }

    public static /* synthetic */ Object ipc$super(TaobaoRecommendLoginFragment taobaoRecommendLoginFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1912803358) {
            super.onClick((View) objArr[0]);
            return null;
        } else if (hashCode != -1180824595) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.initViews((View) objArr[0]);
            return null;
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        super.initViews(view);
        LoginCouponHelper.handleCoupon(view, this.mUserLoginActivity);
        this.mAlipayLoginTV = (TextView) view.findViewById(R.id.ali_user_login_alipay_login_tv);
        this.dividerView = view.findViewById(R.id.aliuser_login_alipay_login_divider);
        this.mQrLoginTV = (TextView) view.findViewById(R.id.aliuser_qrlogin_tv);
        this.mQrDividerView = view.findViewById(R.id.aliuser_qrlogin_divider);
        TextView textView = this.mQrLoginTV;
        if (textView != null) {
            setOnClickListener(textView);
            QrScan.showQrScan(this.mUserLoginActivity, this.mQrLoginTV, this.mQrDividerView, false);
        }
        TextView textView2 = this.mAlipayLoginTV;
        if (textView2 == null) {
            return;
        }
        textView2.setOnClickListener(this);
        showAlipay();
    }

    public void showAlipay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e81098ae", new Object[]{this});
        } else {
            AlipayAuth.showAlipay(this, this.mAlipayLoginTV, this.dividerView, this.needSetAlipayText);
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.ali_user_login_alipay_login_tv) {
            addCheckAction(LoginClickAction.ACTION_ALIPAY);
        } else {
            super.onClick(view);
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment
    public void addMoreMenus(BottomMenuFragment bottomMenuFragment, List<MenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d59413", new Object[]{this, bottomMenuFragment, list});
        } else {
            PrivacyUtil.addMoreMenus(bottomMenuFragment, list, this);
        }
    }
}
