package com.taobao.login4android.ui;

import android.view.View;
import android.widget.CheckBox;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.register.ui.AliUserTwoStepMobileRegisterFragment;
import com.ali.user.mobile.utils.ProtocolHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class TaobaoTwoStepMobileRegFragment extends AliUserTwoStepMobileRegisterFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public CheckBox mRegCB;

    static {
        kge.a(-1953553611);
    }

    public static /* synthetic */ Object ipc$super(TaobaoTwoStepMobileRegFragment taobaoTwoStepMobileRegFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1912803358:
                super.onClick((View) objArr[0]);
                return null;
            case -1829513635:
                super.doRealAction(((Number) objArr[0]).intValue());
                return null;
            case -1180824595:
                super.initViews((View) objArr[0]);
                return null;
            case -1095150912:
                super.registerAction();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void access$000(TaobaoTwoStepMobileRegFragment taobaoTwoStepMobileRegFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9144295b", new Object[]{taobaoTwoStepMobileRegFragment, str});
        } else {
            taobaoTwoStepMobileRegFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$100(TaobaoTwoStepMobileRegFragment taobaoTwoStepMobileRegFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("493096dc", new Object[]{taobaoTwoStepMobileRegFragment, str});
        } else {
            taobaoTwoStepMobileRegFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$201(TaobaoTwoStepMobileRegFragment taobaoTwoStepMobileRegFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1841e154", new Object[]{taobaoTwoStepMobileRegFragment});
        } else {
            super.registerAction();
        }
    }

    @Override // com.ali.user.mobile.register.ui.AliUserTwoStepMobileRegisterFragment, com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_fragment_two_step_mobile_register_tb;
    }

    @Override // com.ali.user.mobile.register.ui.AliUserTwoStepMobileRegisterFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        super.initViews(view);
        this.mRegCB = (CheckBox) view.findViewById(R.id.aliuser_reg_checkbox);
        ProtocolHelper.setCheckBox(this, this.mRegCB, getPageName(), true, this.mPreviousChecked);
    }

    @Override // com.ali.user.mobile.register.ui.AliUserTwoStepMobileRegisterFragment, com.ali.user.mobile.register.ui.AliUserMobileRegisterFragment, android.view.View.OnClickListener
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

    @Override // com.ali.user.mobile.register.ui.AliUserMobileRegisterFragment
    public void registerAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb952c0", new Object[]{this});
        } else if (!this.mRegCB.isChecked()) {
            UserTrackAdapter.sendUT(getPageName(), "RegAgreement");
            uiShown("checkAgreement_dialog");
            final TaobaoRegProtocolDialogFragment rrotocolFragment = getRrotocolFragment();
            rrotocolFragment.setNeedAdaptElder(this.needAdaptElder);
            rrotocolFragment.setNagetive(new View.OnClickListener() { // from class: com.taobao.login4android.ui.TaobaoTwoStepMobileRegFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!TaobaoTwoStepMobileRegFragment.this.isActive()) {
                    } else {
                        TaobaoTwoStepMobileRegFragment.access$000(TaobaoTwoStepMobileRegFragment.this, "notagreeAgreementClick");
                        UserTrackAdapter.sendControlUT(TaobaoTwoStepMobileRegFragment.this.getPageName(), "RegAgreement_Button_Agree");
                        rrotocolFragment.dismissAllowingStateLoss();
                    }
                }
            });
            rrotocolFragment.setPositive(new View.OnClickListener() { // from class: com.taobao.login4android.ui.TaobaoTwoStepMobileRegFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!TaobaoTwoStepMobileRegFragment.this.isActive()) {
                    } else {
                        TaobaoTwoStepMobileRegFragment.access$100(TaobaoTwoStepMobileRegFragment.this, "agreeAgreementClick");
                        TaobaoTwoStepMobileRegFragment.this.mRegCB.setChecked(true);
                        UserTrackAdapter.sendControlUT(TaobaoTwoStepMobileRegFragment.this.getPageName(), "RegAgreement_Button_Cancel");
                        rrotocolFragment.dismissAllowingStateLoss();
                        TaobaoTwoStepMobileRegFragment.access$201(TaobaoTwoStepMobileRegFragment.this);
                    }
                }
            });
            rrotocolFragment.show(getActivity().getSupportFragmentManager(), getPageName());
        } else {
            super.registerAction();
        }
    }

    @Override // com.ali.user.mobile.register.ui.AliUserMobileRegisterFragment
    public void addCheckAction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("129c9b7f", new Object[]{this, new Integer(i)});
        } else {
            onCheckLogin(i);
        }
    }

    @Override // com.ali.user.mobile.register.ui.AliUserMobileRegisterFragment
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
            rrotocolFragment.setNagetive(new View.OnClickListener() { // from class: com.taobao.login4android.ui.TaobaoTwoStepMobileRegFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!TaobaoTwoStepMobileRegFragment.this.isActive()) {
                    } else {
                        UserTrackAdapter.sendControlUT(TaobaoTwoStepMobileRegFragment.this.getPageName(), "Agreement_Button_Agree");
                        rrotocolFragment.dismissAllowingStateLoss();
                    }
                }
            });
            rrotocolFragment.setPositive(new View.OnClickListener() { // from class: com.taobao.login4android.ui.TaobaoTwoStepMobileRegFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!TaobaoTwoStepMobileRegFragment.this.isActive()) {
                    } else {
                        UserTrackAdapter.sendControlUT(TaobaoTwoStepMobileRegFragment.this.getPageName(), "Agreement_Button_Cancel");
                        rrotocolFragment.dismissAllowingStateLoss();
                        TaobaoTwoStepMobileRegFragment.this.mRegCB.setChecked(true);
                        TaobaoTwoStepMobileRegFragment.this.doRealAction(i);
                    }
                }
            });
            rrotocolFragment.show(getActivity().getSupportFragmentManager(), getPageName());
            return;
        }
        doRealAction(i);
    }

    @Override // com.ali.user.mobile.register.ui.AliUserMobileRegisterFragment
    public void doRealAction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f3d65d", new Object[]{this, new Integer(i)});
        } else if (i == LoginClickAction.ACTION_REG) {
            registerAction();
        } else if (i == LoginClickAction.ACTION_ALIPAY) {
            goAlipay();
        } else {
            super.doRealAction(i);
        }
    }
}
