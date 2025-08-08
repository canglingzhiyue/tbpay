package com.ali.user.mobile.register.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.base.ui.BaseFragment;
import com.ali.user.mobile.data.model.SmsApplyResult;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.CommonUICallback;
import com.ali.user.mobile.login.model.AppLaunchInfoResponseData;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.presenter.OneKeyLoginPresenter;
import com.ali.user.mobile.login.ui.BaseLoginView;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.OceanRegisterParam;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.model.RegistParam;
import com.ali.user.mobile.register.ProtocolModel;
import com.ali.user.mobile.register.RegistConstants;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.ProtocolHelper;
import com.ali.user.mobile.utils.UTConstans;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.ui.TaobaoRegProtocolDialogFragment;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class AliUserOneKeyRegisterFragment extends BaseFragment implements View.OnClickListener, BaseLoginView, RegisterFormView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.numAuthReg";
    public String mAreaCode;
    public boolean mCheckBoxSwitch;
    public String mCountryCode;
    public AppLaunchInfoResponseData mFireAppLaunchRes;
    public String mMobileNum;
    public String mOneKeyMobileNum;
    public String mOneKeyProtocolTitle;
    public String mOneKeyProtocolUrl;
    public Button mOneKeyRegBtn;
    public boolean mPreviousChecked;
    public CheckBox mProtocolCB;
    public TextView mProtocolView;
    public RegistParam mRegistParam;
    public TextView mShowIdTextView;
    public TextView mSwitchMobileRegTV;
    public OneKeyLoginPresenter oneKeyLoginPresenter;
    public OceanRegisterParam mTraceParam = new OceanRegisterParam();
    private long lastClickRegisterBtnTime = 0;

    static {
        kge.a(1343393694);
        kge.a(-829929661);
        kge.a(-422013296);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(AliUserOneKeyRegisterFragment aliUserOneKeyRegisterFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1010147231:
                super.dismissAlertDialog();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginView
    public HistoryAccount getHistoryAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HistoryAccount) ipChange.ipc$dispatch("81832384", new Object[]{this});
        }
        return null;
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : UTConstans.PageName.UT_PAGE_ONEKEY_REG_NEW;
    }

    @Override // com.ali.user.mobile.register.ui.RegisterFormView
    public String getRegType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a0b2e441", new Object[]{this}) : "oneKeyRegister";
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginView
    public boolean isHistoryMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40491ad8", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.ali.user.mobile.base.BaseView
    public void onGetRegion(List<RegionInfo> list, HashMap<String, Integer> hashMap, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edae3301", new Object[]{this, list, hashMap, list2});
        }
    }

    @Override // com.ali.user.mobile.register.ui.RegisterFormView
    public void onSendSMSSuccess(long j, SmsApplyResult smsApplyResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e23b80", new Object[]{this, new Long(j), smsApplyResult});
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginView
    public void setLoginAccountInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53941165", new Object[]{this, str});
        }
    }

    public static /* synthetic */ void access$000(AliUserOneKeyRegisterFragment aliUserOneKeyRegisterFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61c23616", new Object[]{aliUserOneKeyRegisterFragment, str});
        } else {
            aliUserOneKeyRegisterFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$100(AliUserOneKeyRegisterFragment aliUserOneKeyRegisterFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c41d4cf5", new Object[]{aliUserOneKeyRegisterFragment, str});
        } else {
            aliUserOneKeyRegisterFragment.addControl(str);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        createPresenter();
        initParams();
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_fragment_onekey_register_tb;
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getActivity(), new HashMap());
        UserTrackAdapter.updatePageName(getActivity(), getPageName());
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        UserTrackAdapter.pageDisAppear(getActivity());
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
        try {
            this.mAreaCode = arguments.getString(RegistConstants.REGISTER_AREA_CODE);
            this.mMobileNum = arguments.getString(RegistConstants.REGISTER_MOBILE_NUM);
            this.mCountryCode = arguments.getString(RegistConstants.REGISTER_COUNTRY_CODE);
            this.mPreviousChecked = arguments.getBoolean("check");
            this.mOneKeyMobileNum = arguments.getString("number", "");
            this.mOneKeyProtocolTitle = arguments.getString("protocolName", "");
            this.mOneKeyProtocolUrl = arguments.getString("protocolURL", "");
            Serializable serializable = arguments.getSerializable(RegistConstants.REGISTPARAM);
            if (serializable instanceof RegistParam) {
                this.mRegistParam = (RegistParam) serializable;
            }
            if (this.mRegistParam == null || this.mRegistParam.externParams == null) {
                return;
            }
            String str = this.mRegistParam.externParams.get(LoginConstant.APPLAUNCH_INFO);
            if (StringUtils.isEmpty(str)) {
                return;
            }
            this.mFireAppLaunchRes = (AppLaunchInfoResponseData) JSON.parseObject(str, AppLaunchInfoResponseData.class);
        } catch (Throwable th) {
            th.printStackTrace();
        }
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
        try {
            this.mShowIdTextView = (TextView) view.findViewById(R.id.aliuser_onekey_reg_account_tv);
            if (this.mShowIdTextView != null && !StringUtils.isEmpty(this.mOneKeyMobileNum)) {
                this.mShowIdTextView.setText(this.mOneKeyMobileNum);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        this.mOneKeyRegBtn = (Button) view.findViewById(R.id.aliuser_onekey_reg_btn);
        this.mOneKeyRegBtn.setOnClickListener(this);
        this.mSwitchMobileRegTV = (TextView) view.findViewById(R.id.aliuser_switch_mobile_reg);
        this.mSwitchMobileRegTV.setOnClickListener(this);
        this.mProtocolView = (TextView) view.findViewById(R.id.aliuser_protocol_tv);
        try {
            this.mCheckBoxSwitch = true;
            this.mProtocolCB = (CheckBox) view.findViewById(R.id.aliuser_reg_checkbox);
            ProtocolHelper.setCheckBox(this, this.mProtocolCB, getPageName(), this.mCheckBoxSwitch, this.mPreviousChecked);
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        generateProtocol();
        TextView textView = (TextView) view.findViewById(R.id.aliuser_reg_func_menu);
        if (textView != null) {
            textView.setVisibility(0);
            textView.setOnClickListener(this);
        }
        if (!this.needAdaptElder) {
            return;
        }
        ElderUtil.scaleTextSize(this.mOneKeyRegBtn, this.mSwitchMobileRegTV, this.mShowIdTextView, this.mProtocolView, textView);
    }

    public void createPresenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f203b93", new Object[]{this});
        } else {
            this.oneKeyLoginPresenter = new OneKeyLoginPresenter(this, null);
        }
    }

    public void registerAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb952c0", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastClickRegisterBtnTime < 1000) {
            return;
        }
        this.lastClickRegisterBtnTime = currentTimeMillis;
        this.mTraceParam = new OceanRegisterParam();
        this.mTraceParam.loginSourcePage = getPageName();
        this.mTraceParam.loginSourceType = "oneKeyRegister";
        String generateTraceId = ApiReferer.generateTraceId("oneKeyRegister", getPageName());
        this.mTraceParam.traceId = generateTraceId;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sdkTraceId", generateTraceId);
            UserTrackAdapter.control(getPageName(), UTConstans.Controls.UT_REG_BTN, "", hashMap);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        LoginParam loginParam = new LoginParam();
        loginParam.ext = new HashMap();
        loginParam.ext.put(ApiConstants.ApiField.FROM_REGISTER_PAGE, "true");
        loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN, getPageName(), AppInfo.getInstance().getUtdid() + String.valueOf(System.currentTimeMillis() / 1000));
        loginParam.loginSourceType = LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN;
        loginParam.utPageName = getPageName();
        this.oneKeyLoginPresenter.login(this.mAttachedActivity, loginParam, getUICallback());
    }

    public CommonUICallback getUICallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CommonUICallback) ipChange.ipc$dispatch("c4196dd", new Object[]{this}) : new CommonUICallback() { // from class: com.ali.user.mobile.register.ui.AliUserOneKeyRegisterFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.login.CommonUICallback
            public void onResult(int i, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
                } else if (i != 6001) {
                    if (i != 6003) {
                        return;
                    }
                    AliUserOneKeyRegisterFragment.this.switchToMobileRegPage();
                } else if (map == null) {
                } else {
                    long longValue = ((Long) map.get("millSecond")).longValue();
                    SmsApplyResult smsApplyResult = null;
                    try {
                        smsApplyResult = (SmsApplyResult) map.get("result");
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    AliUserOneKeyRegisterFragment.this.onSendSMSSuccess(longValue, smsApplyResult);
                }
            }
        };
    }

    public void switchToMobileRegPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ddbe139", new Object[]{this});
        } else if (getActivity() == null) {
        } else {
            Intent intent = new Intent();
            CheckBox checkBox = this.mProtocolCB;
            if (checkBox != null) {
                intent.putExtra("check", checkBox.isChecked());
            }
            ((AliUserRegisterActivity) getActivity()).gotoTwoStepMobileRegFragment(intent);
        }
    }

    public void generateProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4a4e934", new Object[]{this});
        } else {
            ProtocolHelper.generateProtocol(getProtocolModel(), this.mAttachedActivity, this.mProtocolView, getPageName(), false);
        }
    }

    public ProtocolModel getProtocolModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProtocolModel) ipChange.ipc$dispatch("73065416", new Object[]{this}) : ProtocolHelper.getProtocolModel(getActivity(), this.mOneKeyProtocolTitle, this.mOneKeyProtocolUrl);
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        alert(getString(R.string.aliuser_onekey_reg_retain_title), "", getString(R.string.aliuser_reg_continue), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.register.ui.AliUserOneKeyRegisterFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                } else {
                    AliUserOneKeyRegisterFragment.access$000(AliUserOneKeyRegisterFragment.this, UTConstans.Controls.UT_REG_BACK_BUTTON_CANCEL);
                }
            }
        }, getString(R.string.aliuser_exit), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.register.ui.AliUserOneKeyRegisterFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                AliUserOneKeyRegisterFragment.access$100(AliUserOneKeyRegisterFragment.this, UTConstans.Controls.UT_REG_BACK_BUTTON_CLICK);
                if (AliUserOneKeyRegisterFragment.this.getActivity() == null) {
                    return;
                }
                AliUserOneKeyRegisterFragment.this.getActivity().finish();
            }
        });
        return true;
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public void dismissAlertDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ca6061", new Object[]{this});
        } else {
            super.dismissAlertDialog();
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginView
    public int getLoginSite() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae3eff14", new Object[]{this})).intValue() : DataProviderFactory.getDataProvider().getSite();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.aliuser_onekey_reg_btn) {
            addCheckAction(LoginClickAction.ACTION_REG);
        } else if (id == R.id.aliuser_switch_mobile_reg) {
            addControl(UTConstans.Controls.UT_OTHER_NUMBERS);
            switchToMobileRegPage();
        } else if (id != R.id.aliuser_reg_func_menu) {
        } else {
            addControl(UTConstans.Controls.UT_HELP);
            AliUserRegisterActivity.goRegHelp(getBaseActivity());
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.base.BaseView
    public boolean isActive() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fb2d0d5b", new Object[]{this})).booleanValue() : isActivityAvaiable();
    }

    public void addCheckAction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("129c9b7f", new Object[]{this, new Integer(i)});
        } else if (this.mCheckBoxSwitch) {
            onCheckLogin(i);
        } else {
            doRealAction(i);
        }
    }

    public void onCheckLogin(final int i) {
        CheckBox checkBox;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a830dc", new Object[]{this, new Integer(i)});
        } else if (this.mCheckBoxSwitch && (checkBox = this.mProtocolCB) != null && !checkBox.isChecked()) {
            UserTrackAdapter.sendUT(getPageName(), "RegAgreement");
            final TaobaoRegProtocolDialogFragment rrotocolFragment = getRrotocolFragment();
            rrotocolFragment.setNeedAdaptElder(true);
            rrotocolFragment.needAutoReg(false);
            rrotocolFragment.setPostiveBtnText(getString(R.string.aliuser_agree));
            rrotocolFragment.setNegativeBtnText(getString(R.string.aliuser_protocol_disagree));
            rrotocolFragment.setNagetive(new View.OnClickListener() { // from class: com.ali.user.mobile.register.ui.AliUserOneKeyRegisterFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!AliUserOneKeyRegisterFragment.this.isActive()) {
                    } else {
                        UserTrackAdapter.sendControlUT(AliUserOneKeyRegisterFragment.this.getPageName(), "Agreement_Button_Cancel");
                        rrotocolFragment.dismissAllowingStateLoss();
                    }
                }
            });
            rrotocolFragment.setPositive(new View.OnClickListener() { // from class: com.ali.user.mobile.register.ui.AliUserOneKeyRegisterFragment.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!AliUserOneKeyRegisterFragment.this.isActive()) {
                    } else {
                        UserTrackAdapter.sendControlUT(AliUserOneKeyRegisterFragment.this.getPageName(), "Agreement_Button_Agree");
                        rrotocolFragment.dismissAllowingStateLoss();
                        AliUserOneKeyRegisterFragment.this.mProtocolCB.setChecked(true);
                        AliUserOneKeyRegisterFragment.this.doRealAction(i);
                    }
                }
            });
            rrotocolFragment.show(getActivity().getSupportFragmentManager(), getPageName());
        } else {
            doRealAction(i);
        }
    }

    public void doRealAction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f3d65d", new Object[]{this, new Integer(i)});
        } else if (i != LoginClickAction.ACTION_REG) {
        } else {
            registerAction();
        }
    }

    public TaobaoRegProtocolDialogFragment getRrotocolFragment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaobaoRegProtocolDialogFragment) ipChange.ipc$dispatch("3dde219b", new Object[]{this}) : new TaobaoRegProtocolDialogFragment();
    }
}
