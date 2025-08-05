package com.taobao.login4android.ui;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.register.ui.AliUserOneKeyRegisterFragment;
import com.ali.user.mobile.utils.ProtocolHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.activity.auth.AlipayAuth;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class TaobaoOneKeyRegFragment extends AliUserOneKeyRegisterFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView mAlipayLoginTV;
    public CheckBox mRegCB;

    static {
        kge.a(1674723072);
    }

    public static /* synthetic */ Object ipc$super(TaobaoOneKeyRegFragment taobaoOneKeyRegFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1912803358) {
            super.onClick((View) objArr[0]);
            return null;
        } else if (hashCode == -1180824595) {
            super.initViews((View) objArr[0]);
            return null;
        } else if (hashCode != -1095150912) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.registerAction();
            return null;
        }
    }

    public static /* synthetic */ void access$000(TaobaoOneKeyRegFragment taobaoOneKeyRegFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a270a74", new Object[]{taobaoOneKeyRegFragment, str});
        } else {
            taobaoOneKeyRegFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$100(TaobaoOneKeyRegFragment taobaoOneKeyRegFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33285c13", new Object[]{taobaoOneKeyRegFragment, str});
        } else {
            taobaoOneKeyRegFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$201(TaobaoOneKeyRegFragment taobaoOneKeyRegFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49fa4507", new Object[]{taobaoOneKeyRegFragment});
        } else {
            super.registerAction();
        }
    }

    @Override // com.ali.user.mobile.register.ui.AliUserOneKeyRegisterFragment, com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_fragment_onekey_register_tb;
    }

    @Override // com.ali.user.mobile.register.ui.AliUserOneKeyRegisterFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        super.initViews(view);
        this.mRegCB = (CheckBox) view.findViewById(R.id.aliuser_reg_checkbox);
        ProtocolHelper.setCheckBox(this, this.mRegCB, getPageName(), true, this.mPreviousChecked);
        this.mAlipayLoginTV = (TextView) view.findViewById(R.id.ali_user_login_alipay_login_tv);
        if (this.mAlipayLoginTV == null || UserLoginActivity.displayOversea(this.mFireAppLaunchRes)) {
            return;
        }
        this.mAlipayLoginTV.setOnClickListener(this);
        showAlipay();
    }

    public void showAlipay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e81098ae", new Object[]{this});
        } else {
            AlipayAuth.showAlipay(this, this.mAlipayLoginTV, null);
        }
    }

    @Override // com.ali.user.mobile.register.ui.AliUserOneKeyRegisterFragment, android.view.View.OnClickListener
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

    @Override // com.ali.user.mobile.register.ui.AliUserOneKeyRegisterFragment
    public void registerAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb952c0", new Object[]{this});
        } else if (!this.mRegCB.isChecked()) {
            UserTrackAdapter.sendUT(getPageName(), "RegAgreement");
            uiShown("checkAgreement_dialog");
            final TaobaoRegProtocolDialogFragment rrotocolFragment = getRrotocolFragment();
            rrotocolFragment.setNeedAdaptElder(this.needAdaptElder);
            rrotocolFragment.setNagetive(new View.OnClickListener() { // from class: com.taobao.login4android.ui.TaobaoOneKeyRegFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!TaobaoOneKeyRegFragment.this.isActive()) {
                    } else {
                        TaobaoOneKeyRegFragment.access$000(TaobaoOneKeyRegFragment.this, "notagreeAgreementClick");
                        UserTrackAdapter.sendControlUT(TaobaoOneKeyRegFragment.this.getPageName(), "RegAgreement_Button_Agree");
                        rrotocolFragment.dismissAllowingStateLoss();
                    }
                }
            });
            rrotocolFragment.setPositive(new View.OnClickListener() { // from class: com.taobao.login4android.ui.TaobaoOneKeyRegFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!TaobaoOneKeyRegFragment.this.isActive()) {
                    } else {
                        TaobaoOneKeyRegFragment.access$100(TaobaoOneKeyRegFragment.this, "agreeAgreementClick");
                        TaobaoOneKeyRegFragment.this.mRegCB.setChecked(true);
                        UserTrackAdapter.sendControlUT(TaobaoOneKeyRegFragment.this.getPageName(), "RegAgreement_Button_Cancel");
                        rrotocolFragment.dismissAllowingStateLoss();
                        TaobaoOneKeyRegFragment.access$201(TaobaoOneKeyRegFragment.this);
                    }
                }
            });
            rrotocolFragment.setOneKeyProtocol(this.mOneKeyProtocolTitle);
            rrotocolFragment.setOneKeyProtocolUrl(this.mOneKeyProtocolUrl);
            rrotocolFragment.show(getActivity().getSupportFragmentManager(), getPageName());
        } else {
            super.registerAction();
        }
    }

    @Override // com.ali.user.mobile.register.ui.AliUserOneKeyRegisterFragment
    public void addCheckAction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("129c9b7f", new Object[]{this, new Integer(i)});
        } else {
            onCheckLogin(i);
        }
    }

    @Override // com.ali.user.mobile.register.ui.AliUserOneKeyRegisterFragment
    public void onCheckLogin(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a830dc", new Object[]{this, new Integer(i)});
            return;
        }
        CheckBox checkBox = this.mRegCB;
        if (checkBox != null && !checkBox.isChecked()) {
            UserTrackAdapter.sendUT(getPageName(), "RegAgreement");
            final TaobaoRegProtocolDialogFragment rrotocolFragment = getRrotocolFragment();
            rrotocolFragment.setNeedAdaptElder(this.needAdaptElder);
            rrotocolFragment.needAutoReg(false);
            rrotocolFragment.setPostiveBtnText(getString(R.string.aliuser_agree));
            rrotocolFragment.setNegativeBtnText(getString(R.string.aliuser_protocol_disagree));
            rrotocolFragment.setNagetive(new View.OnClickListener() { // from class: com.taobao.login4android.ui.TaobaoOneKeyRegFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!TaobaoOneKeyRegFragment.this.isActive()) {
                    } else {
                        UserTrackAdapter.sendControlUT(TaobaoOneKeyRegFragment.this.getPageName(), "Agreement_Button_Agree");
                        rrotocolFragment.dismissAllowingStateLoss();
                    }
                }
            });
            rrotocolFragment.setPositive(new View.OnClickListener() { // from class: com.taobao.login4android.ui.TaobaoOneKeyRegFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!TaobaoOneKeyRegFragment.this.isActive()) {
                    } else {
                        UserTrackAdapter.sendControlUT(TaobaoOneKeyRegFragment.this.getPageName(), "Agreement_Button_Cancel");
                        rrotocolFragment.dismissAllowingStateLoss();
                        TaobaoOneKeyRegFragment.this.mRegCB.setChecked(true);
                        TaobaoOneKeyRegFragment.this.doRealAction(i);
                    }
                }
            });
            rrotocolFragment.show(getActivity().getSupportFragmentManager(), getPageName());
            return;
        }
        doRealAction(i);
    }

    @Override // com.ali.user.mobile.register.ui.AliUserOneKeyRegisterFragment
    public void doRealAction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f3d65d", new Object[]{this, new Integer(i)});
        } else if (i == LoginClickAction.ACTION_REG) {
            registerAction();
        } else if (i != LoginClickAction.ACTION_ALIPAY) {
        } else {
            goAlipay();
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
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
        HashMap hashMap = new HashMap();
        hashMap.put("sdkTraceId", loginParam.sdkTraceId + "");
        UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.ASO_LOGIN, hashMap);
        AlipayAuth.onAlipayLoginClick(this);
    }
}
