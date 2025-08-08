package com.ali.user.mobile.login.ui;

import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.login.presenter.BaseLoginPresenter;
import com.ali.user.mobile.login.presenter.BioPresenter;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.utils.ElderUtil;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class AliFingerLoginFragment extends BaseHistoryFragment implements BaseLoginView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public LoginParam loginParam = null;
    public TextView mAlipayLoginTV;
    public Button mainButton;

    static {
        kge.a(-478907873);
        kge.a(-422013296);
    }

    public static /* synthetic */ Object ipc$super(AliFingerLoginFragment aliFingerLoginFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2137218009:
                super.onLoginAction();
                return null;
            case -1912803358:
                super.onClick((View) objArr[0]);
                return null;
            case -1180824595:
                super.initViews((View) objArr[0]);
                return null;
            case -944147094:
                super.onDeleteAccount();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 230173107:
                super.switchToHistoryMode((HistoryAccount) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : "Page_BioLogin";
    }

    public void showAlipay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e81098ae", new Object[]{this});
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        initParams();
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_finger_fragment_tb;
    }

    public void initParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        Bundle arguments = getArguments();
        this.loginParam = null;
        if (arguments != null) {
            try {
                this.mPreviousChecked = arguments.getBoolean("check");
                String str = (String) arguments.get(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM);
                arguments.putString(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, "");
                if (!StringUtils.isEmpty(str)) {
                    this.loginParam = (LoginParam) JSON.parseObject(str, LoginParam.class);
                    if (this.loginParam != null) {
                        this.mSource = this.loginParam.source;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        this.mBioPresenter = new BioPresenter(this, this.loginParam);
        this.mPresenter = new BaseLoginPresenter(this, this.loginParam);
    }

    @Override // com.ali.user.mobile.login.ui.BaseHistoryFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        super.initViews(view);
        this.mainButton = (Button) view.findViewById(R.id.aliuser_login_btn);
        this.mAlipayLoginTV = (TextView) view.findViewById(R.id.ali_user_login_alipay_login_tv);
        TextView textView = this.mAlipayLoginTV;
        if (textView != null) {
            textView.setOnClickListener(this);
            showAlipay();
        }
        setOnClickListener(this.mainButton);
        this.mPresenter.onStart();
        if (!this.needAdaptElder) {
            return;
        }
        ElderUtil.scaleTextSize(this.mainButton);
    }

    @Override // com.ali.user.mobile.login.ui.BaseHistoryFragment
    public void switchToHistoryMode(HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db829b3", new Object[]{this, historyAccount});
        } else {
            super.switchToHistoryMode(historyAccount);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseHistoryFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, android.view.View.OnClickListener
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
        } else if (id == R.id.aliuser_login_btn) {
            addCheckAction(LoginClickAction.ACTION_FINGER);
        } else {
            super.onClick(view);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void onLoginAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809ca427", new Object[]{this});
        } else {
            super.onLoginAction();
        }
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
}
