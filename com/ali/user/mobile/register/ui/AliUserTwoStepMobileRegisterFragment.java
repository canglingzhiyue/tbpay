package com.ali.user.mobile.register.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.register.RegistConstants;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.LanguageUtil;
import com.ali.user.mobile.utils.ProtocolHelper;
import com.ali.user.mobile.utils.UTConstans;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.android.sns4android.c;
import com.taobao.login4android.activity.auth.AlipayAuth;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class AliUserTwoStepMobileRegisterFragment extends AliUserMobileRegisterFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.twoStepMobileReg";
    public TextView mAlipay;
    public TextView mAlipayHK;
    public View mAlipayHKLL;
    public View mAlipayLL;
    public TextView mFacebook;
    public LinearLayout mFbLL;
    public LinearLayout mGgLL;
    public TextView mGoogle;
    public String mMobileNum;
    public boolean mPreviousChecked;
    public LinearLayout mSnsLL;
    public TextView snsTextView;
    public TextView toEmailTV;

    static {
        kge.a(314046107);
    }

    public static /* synthetic */ Object ipc$super(AliUserTwoStepMobileRegisterFragment aliUserTwoStepMobileRegisterFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1912803358:
                super.onClick((View) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.ali.user.mobile.register.ui.AliUserMobileRegisterFragment, com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : UTConstans.PageName.UT_PAGE_SMS_REG;
    }

    @Override // com.ali.user.mobile.register.ui.AliUserMobileRegisterFragment, com.ali.user.mobile.register.ui.RegisterFormView
    public String getRegType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a0b2e441", new Object[]{this}) : UTConstant.Args.UT_MOBILE_REG;
    }

    @Override // com.ali.user.mobile.register.ui.AliUserMobileRegisterFragment, com.ali.user.mobile.base.ui.BaseFragment, android.support.v4.app.Fragment
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
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_fragment_two_step_mobile_register_tb;
    }

    private void initParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.mMobileNum = arguments.getString(RegistConstants.REGISTER_MOBILE_NUM);
        try {
            this.mRegionInfo = (RegionInfo) JSON.parseObject(arguments.getString("region"), RegionInfo.class);
            this.mSessionId = arguments.getString("session_id");
            this.mCodeLength = arguments.getString(RegistConstants.REGISTER_CODE_LENGTH);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.mobile.register.ui.AliUserMobileRegisterFragment, android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getActivity(), new HashMap());
        super.onResume();
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        try {
            ((BaseActivity) getActivity()).getSupportActionBar().a("");
            ((BaseActivity) getActivity()).setNavigationCloseIcon();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.toEmailTV = (TextView) view.findViewById(R.id.aliuser_to_email);
        this.mMobileET = (EditText) view.findViewById(R.id.aliuser_register_mobile_et);
        this.mMobileET.postDelayed(new Runnable() { // from class: com.ali.user.mobile.register.ui.AliUserTwoStepMobileRegisterFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (AliUserTwoStepMobileRegisterFragment.this.getContext() == null || !AliUserTwoStepMobileRegisterFragment.this.isActive() || AliUserTwoStepMobileRegisterFragment.this.mMobileET == null) {
                } else {
                    AliUserTwoStepMobileRegisterFragment.this.mMobileET.requestFocus();
                    AliUserTwoStepMobileRegisterFragment.this.mMobileET.requestFocusFromTouch();
                    InputMethodManager inputMethodManager = (InputMethodManager) AliUserTwoStepMobileRegisterFragment.this.getContext().getSystemService("input_method");
                    if (inputMethodManager == null) {
                        return;
                    }
                    inputMethodManager.showSoftInput(AliUserTwoStepMobileRegisterFragment.this.mMobileET, 1);
                }
            }
        }, 300L);
        this.mRegBtnLL = (LinearLayout) view.findViewById(R.id.aliuser_register_reg_btn_ll);
        this.mRegBtn = (Button) view.findViewById(R.id.aliuser_register_reg_btn);
        this.mRegBtn.setOnClickListener(this);
        this.mWelcomeTV = (TextView) view.findViewById(R.id.aliuser_register_tips_tv);
        this.mTitleTV = (TextView) view.findViewById(R.id.aliuser_register_tips_title);
        ((RelativeLayout) view.findViewById(R.id.aliuser_region_rl)).setOnClickListener(this);
        this.mRegionTV = (TextView) view.findViewById(R.id.aliuser_region_tv);
        this.mRegionTV.setOnClickListener(this);
        initRegionInfo();
        this.mProtocolTV = (TextView) view.findViewById(R.id.aliuser_protocol_tv);
        try {
            this.mCheckBoxSwitch = true;
            this.mProtocolCB = (CheckBox) view.findViewById(R.id.aliuser_reg_checkbox);
            ProtocolHelper.setCheckBox(this, this.mProtocolCB, getPageName(), this.mCheckBoxSwitch, this.mPreviousChecked);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        generateProtocol();
        this.mMobileClearBtn = view.findViewById(R.id.aliuser_login_mobile_clear_iv);
        if (this.mMobileClearBtn != null) {
            this.mMobileClearBtn.setOnClickListener(this);
        }
        if (!StringUtils.isEmpty(this.mMobileNum)) {
            this.mMobileET.setText(this.mMobileNum);
        }
        TextView textView = (TextView) view.findViewById(R.id.aliuser_reg_func_menu);
        if (LanguageUtil.isHK()) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        textView.setOnClickListener(this);
        if (!this.needAdaptElder) {
            return;
        }
        ElderUtil.scaleTextSize(this.mMobileET, this.mRegionTV, this.mProtocolTV, this.mRegBtn, this.mWelcomeTV, textView);
    }

    public void showAlipay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e81098ae", new Object[]{this});
        } else {
            AlipayAuth.showAlipay(this, this.mAlipay, null, false);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public void goAlipay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48b32d1b", new Object[]{this, new Boolean(z)});
            return;
        }
        LoginParam loginParam = new LoginParam();
        loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.ASO_LOGIN, getPageName());
        loginParam.utPageName = getPageName();
        loginParam.loginSourceType = LoginType.LocalLoginType.ASO_LOGIN;
        loginParam.alipayInstalled = true;
        HashMap hashMap = new HashMap();
        hashMap.put("sdkTraceId", loginParam.sdkTraceId + "");
        UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.ASO_LOGIN, hashMap);
        AlipayAuth.onAlipayLoginClick(this, z);
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public void goAlipay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a781a0d9", new Object[]{this});
        } else {
            goAlipay(false);
        }
    }

    @Override // com.ali.user.mobile.register.ui.AliUserMobileRegisterFragment, android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        this.mSessionId = null;
        super.onActivityResult(i, i2, intent);
        c.a(SNSPlatform.PLATFORM_GOOGLE, i, i2, intent);
        c.a(SNSPlatform.PLATFORM_FACEBOOK, i, i2, intent);
    }

    @Override // com.ali.user.mobile.register.ui.AliUserMobileRegisterFragment
    public void generateProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4a4e934", new Object[]{this});
        } else {
            ProtocolHelper.generateProtocol(getProtocolModel(), this.mAttachedActivity, this.mProtocolTV, getPageName(), false);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        alert(getString(R.string.aliuser_reg_retain_title), "", getString(R.string.aliuser_reg_continue), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.register.ui.AliUserTwoStepMobileRegisterFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                } else {
                    UserTrackAdapter.control(AliUserTwoStepMobileRegisterFragment.this.getPageName(), UTConstans.Controls.UT_REG_BACK_BUTTON_CANCEL, "", new HashMap());
                }
            }
        }, getString(R.string.aliuser_exit), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.register.ui.AliUserTwoStepMobileRegisterFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                UserTrackAdapter.control(AliUserTwoStepMobileRegisterFragment.this.getPageName(), UTConstans.Controls.UT_REG_BACK_BUTTON_CLICK, "", new HashMap());
                if (AliUserTwoStepMobileRegisterFragment.this.getActivity() == null) {
                    return;
                }
                AliUserTwoStepMobileRegisterFragment.this.getActivity().finish();
            }
        });
        return true;
    }

    @Override // com.ali.user.mobile.register.ui.AliUserMobileRegisterFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.aliuser_reg_func_menu) {
            addControl(UTConstans.Controls.UT_HELP);
            if (!(this.mAttachedActivity instanceof AliUserRegisterActivity)) {
                return;
            }
            ((AliUserRegisterActivity) this.mAttachedActivity).goHelp();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public void goFacebook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f179155", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UTConstant.PageName.UT_KEY_PAGE_NAME, getPageName());
        hashMap.put("alipayInstalled", String.valueOf(this.alipayInstalled));
        c.a(SNSPlatform.PLATFORM_FACEBOOK, (String) null, (String) null);
        c.a(SNSPlatform.PLATFORM_FACEBOOK, this.mAttachedActivity, hashMap);
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public void goGoogle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e20548", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UTConstant.PageName.UT_KEY_PAGE_NAME, getPageName());
        hashMap.put("alipayInstalled", String.valueOf(this.alipayInstalled));
        c.a(SNSPlatform.PLATFORM_GOOGLE, DataProviderFactory.getDataProvider().getClientId(SNSPlatform.PLATFORM_GOOGLE.getPlatform()), (String) null);
        c.a(SNSPlatform.PLATFORM_GOOGLE, this.mAttachedActivity, hashMap);
    }
}
