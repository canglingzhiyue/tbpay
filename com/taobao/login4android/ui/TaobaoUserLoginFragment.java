package com.taobao.login4android.ui;

import android.view.View;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.ui.AliUserLoginFragment;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.ui.widget.BottomMenuFragment;
import com.ali.user.mobile.ui.widget.MenuItem;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.activity.auth.AlipayAuth;
import com.taobao.login4android.activity.auth.QrScan;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.uti.PrivacyUtil;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class TaobaoUserLoginFragment extends AliUserLoginFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView mAlipayLoginTV;
    public View mQrDividerView;
    public TextView mQrLoginTV;

    static {
        kge.a(-1770266973);
    }

    public static /* synthetic */ Object ipc$super(TaobaoUserLoginFragment taobaoUserLoginFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1912803358) {
            super.onClick((View) objArr[0]);
            return null;
        } else if (hashCode == -1180824595) {
            super.initViews((View) objArr[0]);
            return null;
        } else if (hashCode != -944147094) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDeleteAccount();
            return null;
        }
    }

    @Override // com.ali.user.mobile.login.ui.AliUserLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_fragment_user_login_tb;
    }

    @Override // com.ali.user.mobile.login.ui.AliUserLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        super.initViews(view);
        this.mAlipayLoginTV = (TextView) view.findViewById(R.id.ali_user_login_alipay_login_tv);
        TextView textView = this.mAlipayLoginTV;
        if (textView != null) {
            textView.setOnClickListener(this);
            showAlipay();
        }
        this.mQrLoginTV = (TextView) view.findViewById(R.id.aliuser_qrlogin_tv);
        this.mQrDividerView = view.findViewById(R.id.aliuser_qrlogin_divider);
        TextView textView2 = this.mQrLoginTV;
        if (textView2 != null) {
            setOnClickListener(textView2);
            QrScan.showQrScan(this.mUserLoginActivity, this.mQrLoginTV, this.mQrDividerView);
        }
        if (!this.fromOversea) {
            return;
        }
        this.mSwitchSmsLoginBtn.setText(R.string.aliuser_login_sms_login_oversea);
    }

    public void showAlipay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e81098ae", new Object[]{this});
        } else {
            AlipayAuth.showAlipay(this, this.mAlipayLoginTV, null);
        }
    }

    @Override // com.ali.user.mobile.login.ui.AliUserLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        this.interact = true;
        int id = view.getId();
        if (id == R.id.ali_user_login_alipay_login_tv) {
            addCheckAction(LoginClickAction.ACTION_ALIPAY);
        } else if (id == R.id.aliuser_login_login_btn) {
            addCheckAction(LoginClickAction.ACTION_LOGIN);
        } else {
            super.onClick(view);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void goAlipay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a781a0d9", new Object[]{this});
            return;
        }
        LoginParam loginParam = new LoginParam();
        loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.ASO_LOGIN, getPageName());
        loginParam.utPageName = getPageName();
        loginParam.loginSourceType = LoginType.LocalLoginType.ASO_LOGIN;
        loginParam.source = this.mSource;
        HashMap hashMap = new HashMap();
        hashMap.put("sdkTraceId", loginParam.sdkTraceId + "");
        UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.ASO_LOGIN, hashMap);
        AlipayAuth.onAlipayLoginClick(this);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void onDeleteAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7b9756a", new Object[]{this});
        } else if (isMultiAccountPageEnable()) {
        } else {
            super.onDeleteAccount();
        }
    }

    public static boolean isMultiAccountPageEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("59209d1b", new Object[0])).booleanValue() : LoginSwitch.isInABTestRegion("enable_multi_account_new", 10000);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void addMoreMenus(BottomMenuFragment bottomMenuFragment, List<MenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d59413", new Object[]{this, bottomMenuFragment, list});
        } else {
            PrivacyUtil.addMoreMenus(bottomMenuFragment, list, this);
        }
    }
}
