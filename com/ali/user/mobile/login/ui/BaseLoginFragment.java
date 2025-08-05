package com.ali.user.mobile.login.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.base.ui.BaseFragment;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.coordinator.Coordinator;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.CommonUICallback;
import com.ali.user.mobile.login.LoginApi;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.presenter.BaseLoginPresenter;
import com.ali.user.mobile.login.presenter.BioPresenter;
import com.ali.user.mobile.login.presenter.FaceLoginPresenter;
import com.ali.user.mobile.login.presenter.UserLoginPresenter;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.model.RegistParam;
import com.ali.user.mobile.model.TrackingModel;
import com.ali.user.mobile.register.ProtocolModel;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.FaceService;
import com.ali.user.mobile.service.FingerprintService;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.ui.WebConstant;
import com.ali.user.mobile.ui.widget.AliUserDialog;
import com.ali.user.mobile.ui.widget.BottomMenuFragment;
import com.ali.user.mobile.ui.widget.CircleImageView;
import com.ali.user.mobile.ui.widget.MenuItemOnClickListener;
import com.ali.user.mobile.utils.BundleUtil;
import com.ali.user.mobile.utils.DeviceUtils;
import com.ali.user.mobile.utils.ImageUtil;
import com.ali.user.mobile.utils.LanguageUtil;
import com.ali.user.mobile.utils.LoadImageTask;
import com.ali.user.mobile.utils.MD5Util;
import com.ali.user.mobile.utils.ProtocolHelper;
import com.ali.user.mobile.utils.SharedPreferencesUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.ali.user.mobile.webview.WebViewActivity;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.android.sns4android.c;
import com.taobao.android.weex_framework.util.a;
import com.taobao.login4android.activity.auth.AlipayAuth;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.ui.LoginCouponHelper;
import com.taobao.login4android.ui.TaobaoMobileHistoryFragment;
import com.taobao.login4android.ui.TaobaoRegProtocolDialogFragment;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class BaseLoginFragment extends BaseFragment implements View.OnClickListener, BaseLoginView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ui.BaseLoginFragment";
    public boolean alipayInstalled;
    public boolean fingerLoginEnable;
    public long historyHid;
    public AliUserDialog mAliUserDialog;
    public CircleImageView mAvatarIV;
    public BioPresenter mBioPresenter;
    public boolean mCheckBoxSwitch;
    public FaceLoginPresenter mFaceLoginPresenter;
    public BaseLoginPresenter mPresenter;
    public boolean mPreviousChecked;
    public CheckBox mProtocolCB;
    public View mProtocolContent;
    public TextView mProtocolTV;
    public String mProtocolTitle;
    public String mProtocolUrl;
    public String mSource;
    public UserLoginActivity mUserLoginActivity;
    public boolean onekeyHistoryEnable;
    public boolean whatsAppBusiness;
    public boolean isHistoryMode = false;
    public boolean resetToolbar = true;
    public boolean interact = false;
    public boolean whatsApp = false;

    static {
        kge.a(1527664827);
        kge.a(-1201612728);
        kge.a(-422013296);
    }

    public static /* synthetic */ Object ipc$super(BaseLoginFragment baseLoginFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1824869764:
                super.onPrepareOptionsMenu((Menu) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1010147231:
                super.dismissAlertDialog();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 29389573:
                super.alertList((String[]) objArr[0], (DialogInterface.OnClickListener) objArr[1], ((Boolean) objArr[2]).booleanValue());
                return null;
            case 382958558:
                super.onCreateOptionsMenu((Menu) objArr[0], (MenuInflater) objArr[1]);
                return null;
            case 385910615:
                super.alert((String) objArr[0], (String) objArr[1], (String) objArr[2], (DialogInterface.OnClickListener) objArr[3], (String) objArr[4], (DialogInterface.OnClickListener) objArr[5]);
                return null;
            case 1126824075:
                super.toast((String) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void addMoreMenus(BottomMenuFragment bottomMenuFragment, List<com.ali.user.mobile.ui.widget.MenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d59413", new Object[]{this, bottomMenuFragment, list});
        }
    }

    public void appendIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("118d209a", new Object[]{this, intent});
        }
    }

    public String getAccountName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("680b717", new Object[]{this}) : "";
    }

    public List<View> getAdapterDeviceViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2c4c6ba1", new Object[]{this});
        }
        return null;
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public abstract String getPageName();

    public void goTaobao() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f42725bd", new Object[]{this});
        }
    }

    public void onForgetPasswordAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf966a84", new Object[]{this});
        }
    }

    public void onGetRegion(List<RegionInfo> list, HashMap<String, Integer> hashMap, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edae3301", new Object[]{this, list, hashMap, list2});
        }
    }

    public void onLoginAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809ca427", new Object[]{this});
        }
    }

    public void onPwdError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe5f51", new Object[]{this});
        }
    }

    public void onSendSMSAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("704a1b2f", new Object[]{this});
        }
    }

    public void setLoginAccountInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53941165", new Object[]{this, str});
        }
    }

    public void switchMode(boolean z, HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9feb28ba", new Object[]{this, new Boolean(z), historyAccount});
        }
    }

    public static /* synthetic */ BaseActivity access$000(BaseLoginFragment baseLoginFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseActivity) ipChange.ipc$dispatch("36205fd5", new Object[]{baseLoginFragment}) : baseLoginFragment.mAttachedActivity;
    }

    public static /* synthetic */ BaseActivity access$100(BaseLoginFragment baseLoginFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseActivity) ipChange.ipc$dispatch("16a227b4", new Object[]{baseLoginFragment}) : baseLoginFragment.mAttachedActivity;
    }

    public static /* synthetic */ void access$1000(BaseLoginFragment baseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("febf0e04", new Object[]{baseLoginFragment, str});
        } else {
            baseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$1100(BaseLoginFragment baseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5caf505", new Object[]{baseLoginFragment, str});
        } else {
            baseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$1200(BaseLoginFragment baseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cd6dc06", new Object[]{baseLoginFragment, str});
        } else {
            baseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$1300(BaseLoginFragment baseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e2c307", new Object[]{baseLoginFragment, str});
        } else {
            baseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$1400(BaseLoginFragment baseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aeeaa08", new Object[]{baseLoginFragment, str});
        } else {
            baseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$1500(BaseLoginFragment baseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1fa9109", new Object[]{baseLoginFragment, str});
        } else {
            baseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$1600(BaseLoginFragment baseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a906780a", new Object[]{baseLoginFragment, str});
        } else {
            baseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$1700(BaseLoginFragment baseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70125f0b", new Object[]{baseLoginFragment, str});
        } else {
            baseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ BaseActivity access$1800(BaseLoginFragment baseLoginFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseActivity) ipChange.ipc$dispatch("2fae8c7e", new Object[]{baseLoginFragment}) : baseLoginFragment.mAttachedActivity;
    }

    public static /* synthetic */ void access$1900(BaseLoginFragment baseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe2a2d0d", new Object[]{baseLoginFragment, str});
        } else {
            baseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ BaseActivity access$200(BaseLoginFragment baseLoginFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseActivity) ipChange.ipc$dispatch("f723ef93", new Object[]{baseLoginFragment}) : baseLoginFragment.mAttachedActivity;
    }

    public static /* synthetic */ BaseActivity access$300(BaseLoginFragment baseLoginFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseActivity) ipChange.ipc$dispatch("d7a5b772", new Object[]{baseLoginFragment}) : baseLoginFragment.mAttachedActivity;
    }

    public static /* synthetic */ BaseActivity access$400(BaseLoginFragment baseLoginFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseActivity) ipChange.ipc$dispatch("b8277f51", new Object[]{baseLoginFragment}) : baseLoginFragment.mAttachedActivity;
    }

    public static /* synthetic */ BaseActivity access$500(BaseLoginFragment baseLoginFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseActivity) ipChange.ipc$dispatch("98a94730", new Object[]{baseLoginFragment}) : baseLoginFragment.mAttachedActivity;
    }

    public static /* synthetic */ void access$600(BaseLoginFragment baseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cdb129b", new Object[]{baseLoginFragment, str});
        } else {
            baseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$700(BaseLoginFragment baseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6f99c", new Object[]{baseLoginFragment, str});
        } else {
            baseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$800(BaseLoginFragment baseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf2e09d", new Object[]{baseLoginFragment, str});
        } else {
            baseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ BaseActivity access$900(BaseLoginFragment baseLoginFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseActivity) ipChange.ipc$dispatch("1ab066ac", new Object[]{baseLoginFragment}) : baseLoginFragment.mAttachedActivity;
    }

    public void setCheckBoxSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b1cf5c0", new Object[]{this});
        } else {
            this.mCheckBoxSwitch = true;
        }
    }

    public void whatApp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ef0ec4", new Object[]{this});
        } else if (LoginSwitch.getSwitch("stopWhatsApp", "false")) {
        } else {
            try {
                BundleUtil.installed("com.whatsapp", new CommonCallback() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.model.CommonCallback
                    public void onSuccess() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                        } else {
                            BaseLoginFragment.this.whatsApp = true;
                        }
                    }

                    @Override // com.ali.user.mobile.model.CommonCallback
                    public void onFail(int i, String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                        } else {
                            BaseLoginFragment.this.whatsApp = false;
                        }
                    }
                });
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                BundleUtil.installed("com.whatsapp.w4b", new CommonCallback() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.model.CommonCallback
                    public void onSuccess() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                        } else {
                            BaseLoginFragment.this.whatsAppBusiness = true;
                        }
                    }

                    @Override // com.ali.user.mobile.model.CommonCallback
                    public void onFail(int i, String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                        } else {
                            BaseLoginFragment.this.whatsAppBusiness = false;
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        this.mUserLoginActivity = (UserLoginActivity) getActivity();
        if (this instanceof TaobaoMobileHistoryFragment) {
            z = false;
        }
        LoginCouponHelper.handleCoupon(view, this.mUserLoginActivity, z);
        AlipayAuth.supportAlipay(getActivity(), new CommonCallback() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                } else {
                    BaseLoginFragment.this.alipayInstalled = true;
                }
            }

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onFail(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                } else {
                    BaseLoginFragment.this.alipayInstalled = false;
                }
            }
        });
        try {
            if (this.resetToolbar) {
                resetActionBar();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.mAvatarIV = (CircleImageView) view.findViewById(R.id.aliuser_login_avatar);
        CircleImageView circleImageView = this.mAvatarIV;
        if (circleImageView != null) {
            circleImageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view2})).booleanValue();
                    }
                    BaseLoginFragment.this.onDeleteAccount();
                    return false;
                }
            });
        }
        try {
            setCheckBoxSwitch();
            this.mProtocolCB = (CheckBox) view.findViewById(R.id.aliuser_reg_checkbox);
            ProtocolHelper.setCheckBox(this, this.mProtocolCB, getPageName(), this.mCheckBoxSwitch, this.mPreviousChecked);
            this.mProtocolContent = view.findViewById(R.id.aliuser_protocol_content);
            this.mProtocolTV = (TextView) view.findViewById(R.id.aliuser_protocol_tv);
            generateProtocol("", "");
            DeviceUtils.adapterLoginUIOnDevice(getAdapterDeviceViews());
        } catch (Throwable th2) {
            LoginTLogAdapter.e(TAG, "init view error", th2);
        }
    }

    public void resetActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf4faf5", new Object[]{this});
            return;
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().d();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getActivity().getWindow().setStatusBarColor(getResources().getColor(R.color.aliuser_default_bg));
        }
        if (!(getActivity() instanceof UserLoginActivity)) {
            return;
        }
        ((UserLoginActivity) getActivity()).setBackground(false);
    }

    public void generateProtocol(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("309e9448", new Object[]{this, str, str2});
            return;
        }
        ProtocolModel protocolModel = ProtocolHelper.getProtocolModel(getActivity(), str, str2, !this.isHistoryMode);
        boolean isChineseLanguage = LanguageUtil.isChineseLanguage();
        if (!isChineseLanguage) {
            protocolModel.protocolItemColor = R.color.aliuser_edittext_bg_color_activated;
        }
        ProtocolHelper.generateProtocol(protocolModel, this.mAttachedActivity, this.mProtocolTV, getPageName(), !isChineseLanguage);
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        UserTrackAdapter.updatePageName(getActivity(), getPageName(), getTraces());
        doInResume();
    }

    public void doInResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26ead564", new Object[]{this});
        } else if (!isInOneKeyABTestRegion()) {
        } else {
            if (this.interact) {
                UserTrackAdapter.sendUT(getPageName(), "has_interact");
            } else if (this.isHistoryMode) {
                UserLoginActivity userLoginActivity = this.mUserLoginActivity;
                if (userLoginActivity == null || userLoginActivity.mHistoryAccount == null) {
                    return;
                }
                if (!TextUtils.isEmpty(UserLoginActivity.getMaskMobile())) {
                    UserTrackAdapter.sendUT(getPageName(), "has_maskMobile");
                } else if (TextUtils.isEmpty(UserLoginActivity.getMobileFromHistory(this.mUserLoginActivity.mHistoryAccount)) || !checkSMSLoginEnable(this.mUserLoginActivity.mHistoryAccount)) {
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.5
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (ServiceFactory.getService(NumberAuthService.class) == null) {
                            } else {
                                ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getLoginMaskPhone(5000, BaseLoginFragment.this.getPageName(), new CommonDataCallback() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.5.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // com.ali.user.mobile.callback.CommonDataCallback
                                    public void onFail(int i, String str) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                                        }
                                    }

                                    @Override // com.ali.user.mobile.callback.CommonDataCallback
                                    public void onSuccess(Map<String, String> map) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("93e51c7a", new Object[]{this, map});
                                            return;
                                        }
                                        String pageName = BaseLoginFragment.this.getPageName();
                                        UserTrackAdapter.sendUT(pageName, "interact=" + BaseLoginFragment.this.interact);
                                        if (!BaseLoginFragment.this.isActive() || BaseLoginFragment.access$000(BaseLoginFragment.this) == null || !(BaseLoginFragment.access$100(BaseLoginFragment.this) instanceof UserLoginActivity) || BaseLoginFragment.this.interact || BaseLoginFragment.this.mUserLoginActivity == null || !BaseLoginFragment.this.isHistoryOnekeyEnable(BaseLoginFragment.this.mUserLoginActivity.mHistoryAccount)) {
                                            return;
                                        }
                                        UserTrackAdapter.sendUT(BaseLoginFragment.this.getPageName(), "gotoOnekey");
                                        Intent intent = new Intent();
                                        for (Map.Entry<String, String> entry : map.entrySet()) {
                                            intent.putExtra(entry.getKey(), entry.getValue());
                                        }
                                        ((UserLoginActivity) BaseLoginFragment.access$200(BaseLoginFragment.this)).gotoOneKeyHistoryLoginFragment(intent);
                                    }
                                });
                            }
                        }
                    }, 2000L);
                }
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (ServiceFactory.getService(NumberAuthService.class) == null) {
                        } else {
                            ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getLoginMaskPhone(5000, BaseLoginFragment.this.getPageName(), new CommonDataCallback() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.6.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.ali.user.mobile.callback.CommonDataCallback
                                public void onFail(int i, String str) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                                    }
                                }

                                @Override // com.ali.user.mobile.callback.CommonDataCallback
                                public void onSuccess(Map<String, String> map) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("93e51c7a", new Object[]{this, map});
                                        return;
                                    }
                                    String pageName = BaseLoginFragment.this.getPageName();
                                    UserTrackAdapter.sendUT(pageName, "interactFirst=" + BaseLoginFragment.this.interact);
                                    if (!BaseLoginFragment.this.isActive() || BaseLoginFragment.access$300(BaseLoginFragment.this) == null || !(BaseLoginFragment.access$400(BaseLoginFragment.this) instanceof UserLoginActivity) || BaseLoginFragment.this.interact) {
                                        return;
                                    }
                                    UserTrackAdapter.sendUT(BaseLoginFragment.this.getPageName(), "gotoOnekey");
                                    Intent intent = new Intent();
                                    for (Map.Entry<String, String> entry : map.entrySet()) {
                                        intent.putExtra(entry.getKey(), entry.getValue());
                                    }
                                    ((UserLoginActivity) BaseLoginFragment.access$500(BaseLoginFragment.this)).gotoOneKeyLoginFragment(intent);
                                }
                            });
                        }
                    }
                }, 2000L);
            }
        }
    }

    public boolean isInOneKeyABTestRegion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3cd611a", new Object[]{this})).booleanValue();
        }
        return LoginSwitch.isInABTestRegion("resumeToOnekey" + getPageName(), -1);
    }

    public static Map<String, String> getTraces() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bb935040", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("intervel", String.valueOf(System.currentTimeMillis() - LoginStatus.launchTimestamp));
            if (!TextUtils.isEmpty(LoginStatus.mtopApiReferer)) {
                JSONObject jSONObject = new JSONObject(LoginStatus.mtopApiReferer);
                hashMap.put("apiName", jSONObject.getString("apiName"));
                hashMap.put("v", jSONObject.getString("v"));
                hashMap.put("mtopEventName", jSONObject.optString("eventName"));
                hashMap.put("eventName", "mtop");
            } else if (!TextUtils.isEmpty(LoginStatus.jsbridgeRefUrl)) {
                hashMap.put("fromURL", LoginStatus.jsbridgeRefUrl);
                hashMap.put("eventName", "jsbridge");
            } else if (!TextUtils.isEmpty(LoginStatus.browserRefUrl)) {
                hashMap.put("fromURL", LoginStatus.browserRefUrl);
                hashMap.put("eventName", "container");
            } else if (!TextUtils.isEmpty(LoginStatus.source)) {
                hashMap.put("eventName", LoginStatus.source);
            } else {
                hashMap.put("eventName", "native");
                if (LoginSwitch.getSwitch("addTrace", "true")) {
                    hashMap.put(a.ATOM_stack, LoginStatus.dumpTrace);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginView
    public HistoryAccount getHistoryAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HistoryAccount) ipChange.ipc$dispatch("81832384", new Object[]{this});
        }
        UserLoginActivity userLoginActivity = this.mUserLoginActivity;
        if (userLoginActivity == null) {
            return null;
        }
        return userLoginActivity.mHistoryAccount;
    }

    public boolean isHistoryMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40491ad8", new Object[]{this})).booleanValue() : this.isHistoryMode;
    }

    public void showPushLogoutAlertIfHas() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f66ac9", new Object[]{this});
        } else if (getContext() == null) {
        } else {
            if (System.currentTimeMillis() - ((Long) SharedPreferencesUtil.getData(getContext().getApplicationContext(), "pushLogoutTime", 0L)).longValue() < 60000) {
                String str = (String) SharedPreferencesUtil.getData(getContext().getApplicationContext(), "pushLogoutContent", "");
                if (!TextUtils.isEmpty(str)) {
                    alert("", str, getString(R.string.aliuser_common_ok), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.7
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            } else {
                                BaseLoginFragment.this.dismissAlertDialog();
                            }
                        }
                    }, null, null);
                }
            }
            Coordinator.execute(new Runnable() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        SharedPreferencesUtil.saveData(BaseLoginFragment.this.getContext().getApplicationContext(), "pushLogoutContent", "");
                    }
                }
            });
        }
    }

    public void setOnClickListener(View... viewArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e43b81f", new Object[]{this, viewArr});
            return;
        }
        for (View view : viewArr) {
            if (view != null) {
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.base.BaseView
    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
        } else {
            showProgress("");
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.base.BaseView
    public void dismissLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
        } else if (getActivity() == null || getActivity().isFinishing()) {
        } else {
            dismissProgress();
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.base.BaseView
    public void toast(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4329f88b", new Object[]{this, str, new Integer(i)});
        } else {
            super.toast(str, i);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.base.BaseView
    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17008757", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2});
        } else {
            super.alert(str, str2, str3, onClickListener, str4, onClickListener2);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public void alertList(String[] strArr, final DialogInterface.OnClickListener onClickListener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c07305", new Object[]{this, strArr, onClickListener, new Boolean(z)});
        } else if (strArr != null && strArr.length != 0) {
            if (LoginSwitch.isInABTestRegion("alertListToBottom", 10000)) {
                BottomMenuFragment bottomMenuFragment = new BottomMenuFragment();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < strArr.length; i++) {
                    com.ali.user.mobile.ui.widget.MenuItem menuItem = new com.ali.user.mobile.ui.widget.MenuItem();
                    menuItem.setText(strArr[i]);
                    final int i2 = i;
                    menuItem.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem) { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.9
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                        public void onClickMenuItem(View view, com.ali.user.mobile.ui.widget.MenuItem menuItem2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem2});
                            } else if (!BaseLoginFragment.this.isActive()) {
                            } else {
                                onClickListener.onClick(null, i2);
                            }
                        }
                    });
                    arrayList.add(menuItem);
                }
                bottomMenuFragment.setMenuItems(arrayList);
                bottomMenuFragment.show(getFragmentManager(), getPageName());
                return;
            }
            super.alertList(strArr, onClickListener, z);
        }
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

    @Override // android.support.v4.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933ab27c", new Object[]{this, menu});
            return;
        }
        if (menu.findItem(R.id.aliuser_menu_item_help) != null && menu.findItem(R.id.aliuser_menu_item_more) != null) {
            if (this.isHistoryMode) {
                menu.findItem(R.id.aliuser_menu_item_help).setVisible(false);
                menu.findItem(R.id.aliuser_menu_item_more).setVisible(true);
            } else {
                menu.findItem(R.id.aliuser_menu_item_more).setVisible(false);
                menu.findItem(R.id.aliuser_menu_item_help).setVisible(true);
            }
        }
        super.onPrepareOptionsMenu(menu);
    }

    @Override // android.support.v4.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d37bde", new Object[]{this, menu, menuInflater});
            return;
        }
        menu.clear();
        menuInflater.inflate(R.menu.aliuser_menu, menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // android.support.v4.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.aliuser_menu_item_help) {
            openHelp();
        } else if (itemId == R.id.aliuser_menu_item_more) {
            addControl("Button-More");
            showBottomMenu();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public int getLoginSite() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae3eff14", new Object[]{this})).intValue() : DataProviderFactory.getDataProvider().getSite();
    }

    public void openHelp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("652b6bb2", new Object[]{this});
        } else if (!isActivityAvaiable()) {
        } else {
            addControl("help");
            String helpUrl = LoginConstant.getHelpUrl();
            UserLoginActivity userLoginActivity = this.mUserLoginActivity;
            if (userLoginActivity != null && userLoginActivity.displayOversea()) {
                helpUrl = LoginConstant.getHelpUrlOversea();
            }
            Intent intent = new Intent(this.mAttachedActivity, WebViewActivity.class);
            intent.putExtra(WebConstant.WEBURL, helpUrl);
            startActivity(intent);
        }
    }

    public void openFindAccountPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e90cb40", new Object[]{this});
        } else if (!isActivityAvaiable()) {
        } else {
            addControl("findnick");
            Intent intent = new Intent(this.mAttachedActivity, WebViewActivity.class);
            intent.putExtra(WebConstant.WEBURL, LoginConstant.FIND_ACCOUNT_URL);
            startActivity(intent);
        }
    }

    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else {
            this.interact = true;
        }
    }

    public void updateAvatar(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eeb3893", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Bitmap bitmapFromMemoryCache = ImageUtil.getBitmapFromMemoryCache(MD5Util.getMD5(str));
            CircleImageView circleImageView = this.mAvatarIV;
            if (circleImageView == null) {
                return;
            }
            if (bitmapFromMemoryCache != null) {
                circleImageView.setImageBitmap(bitmapFromMemoryCache);
                return;
            }
            new LoadImageTask(DataProviderFactory.getApplicationContext(), (ImageView) this.mAvatarIV, "HeadImages", 160).execute(str);
            this.mAvatarIV.setImageResource(R.drawable.aliuser_placeholder);
        }
    }

    public void onDeleteAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7b9756a", new Object[]{this});
        } else if (!isActivityAvaiable()) {
        } else {
            alert(getActivity().getString(R.string.aliuser_account_remove_title), getActivity().getString(R.string.aliuser_account_remove_info), getActivity().getString(R.string.aliuser_account_remove_delete), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    BaseLoginFragment.access$600(BaseLoginFragment.this, "Button-DeleteUser");
                    BaseLoginFragment baseLoginFragment = BaseLoginFragment.this;
                    baseLoginFragment.deleteAccount(baseLoginFragment.mUserLoginActivity.mHistoryAccount);
                }
            }, getActivity().getString(R.string.aliuser_cancel), null);
        }
    }

    public void deleteAccount(HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd64cad", new Object[]{this, historyAccount});
        } else {
            new CoordinatorWrapper().execute(new AsyncTask<Object, Void, Void>() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.AsyncTask
                public Void doInBackground(Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("6d120651", new Object[]{this, objArr});
                    }
                    SecurityGuardManagerWraper.removeAllHistoryAccount();
                    return null;
                }

                @Override // android.os.AsyncTask
                public void onPostExecute(Void r4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("213d104", new Object[]{this, r4});
                    } else if (!BaseLoginFragment.this.isActive()) {
                    } else {
                        BaseLoginFragment.this.mUserLoginActivity.mHistoryAccount = null;
                        BaseLoginFragment baseLoginFragment = BaseLoginFragment.this;
                        baseLoginFragment.isHistoryMode = false;
                        baseLoginFragment.historyHid = 0L;
                        baseLoginFragment.switchMode(baseLoginFragment.isHistoryMode, null);
                    }
                }
            }, new Object[0]);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        addControl("close");
        return false;
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mUserLoginActivity = null;
        super.onDestroy();
    }

    public BottomMenuFragment getBottomMenuFragment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BottomMenuFragment) ipChange.ipc$dispatch("61acff3c", new Object[]{this}) : new BottomMenuFragment();
    }

    public void showBottomMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cac9e0e", new Object[]{this});
        } else if (!isActive() || !isVisible()) {
        } else {
            BottomMenuFragment bottomMenuFragment = getBottomMenuFragment();
            ArrayList arrayList = new ArrayList();
            com.ali.user.mobile.ui.widget.MenuItem menuItem = new com.ali.user.mobile.ui.widget.MenuItem();
            menuItem.setText(getString(R.string.aliuser_other_account_login));
            menuItem.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem) { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, com.ali.user.mobile.ui.widget.MenuItem menuItem2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem2});
                    } else if (!BaseLoginFragment.this.isActive()) {
                    } else {
                        BaseLoginFragment.access$700(BaseLoginFragment.this, "Button-ChooseOtherAccountLogin");
                        BaseLoginFragment.this.switchAccount();
                    }
                }
            });
            if (this.isHistoryMode) {
                arrayList.add(menuItem);
            }
            com.ali.user.mobile.ui.widget.MenuItem menuItem2 = new com.ali.user.mobile.ui.widget.MenuItem();
            menuItem2.setText(getString(R.string.aliuser_reg));
            menuItem2.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem2) { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, com.ali.user.mobile.ui.widget.MenuItem menuItem3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem3});
                    } else if (!BaseLoginFragment.this.isActive()) {
                    } else {
                        BaseLoginFragment.access$800(BaseLoginFragment.this, "Button-Reg");
                        RegistParam registParam = new RegistParam();
                        registParam.registSite = BaseLoginFragment.this.getLoginSite();
                        registParam.regFrom = DataProviderFactory.getDataProvider().getRegFrom();
                        registParam.source = BaseLoginFragment.this.mSource;
                        try {
                            if (BaseLoginFragment.this.mUserLoginActivity.fireAppLaunchRes != null) {
                                registParam.externParams = new HashMap();
                                registParam.externParams.put(LoginConstant.APPLAUNCH_INFO, JSON.toJSONString(BaseLoginFragment.this.mUserLoginActivity.fireAppLaunchRes));
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openRegisterPage(BaseLoginFragment.access$900(BaseLoginFragment.this), registParam);
                    }
                }
            });
            if (AliUserLogin.getAppreanceExtentions() == null || AliUserLogin.getAppreanceExtentions().needRegister()) {
                arrayList.add(menuItem2);
            }
            com.ali.user.mobile.ui.widget.MenuItem menuItem3 = new com.ali.user.mobile.ui.widget.MenuItem();
            menuItem3.setText(getString(R.string.aliuser_menu_help));
            menuItem3.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem3) { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, com.ali.user.mobile.ui.widget.MenuItem menuItem4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem4});
                    } else if (!BaseLoginFragment.this.isActive()) {
                    } else {
                        BaseLoginFragment.this.openHelp();
                    }
                }
            });
            arrayList.add(menuItem3);
            addMoreMenus(bottomMenuFragment, arrayList);
            bottomMenuFragment.setMenuItems(arrayList);
            bottomMenuFragment.show(getFragmentManager(), getPageName());
        }
    }

    public void switchAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e695860", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(LoginConstant.FORCE_NORMAL_MODE, true);
        CheckBox checkBox = this.mProtocolCB;
        if (checkBox != null) {
            intent.putExtra("check", checkBox.isChecked());
        }
        appendIntent(intent);
        UserLoginActivity userLoginActivity = this.mUserLoginActivity;
        if (userLoginActivity == null) {
            return;
        }
        if (userLoginActivity.mHistoryAccount != null) {
            boolean historyMatchMask = this.mUserLoginActivity.historyMatchMask();
            if (!TextUtils.isEmpty(UserLoginActivity.getMaskMobile()) && !(this instanceof OneKeyLoginFragment) && !historyMatchMask && LoginSwitch.isInABTestRegion("rollback_history_to_first_onekey", 10000)) {
                Intent intent2 = new Intent();
                for (Map.Entry<String, String> entry : ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap().entrySet()) {
                    intent2.putExtra(entry.getKey(), entry.getValue());
                }
                ((UserLoginActivity) this.mAttachedActivity).gotoOneKeyLoginFragment(intent2);
                return;
            }
        }
        if ("sms".equals(this.mUserLoginActivity.otherLoginType)) {
            intent.putExtra(LoginConstant.CURRENT_LOGIN_MODE_STATE, LoginModeState.SMS_LOGIN.name());
        } else if ("pwd".equals(this.mUserLoginActivity.otherLoginType)) {
            intent.putExtra(LoginConstant.CURRENT_LOGIN_MODE_STATE, LoginModeState.PASSWORD.name());
        }
        this.mUserLoginActivity.switchToRecommendLogin(intent);
    }

    public TaobaoRegProtocolDialogFragment getRrotocolFragment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaobaoRegProtocolDialogFragment) ipChange.ipc$dispatch("3dde219b", new Object[]{this}) : new TaobaoRegProtocolDialogFragment();
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a830dc", new Object[]{this, new Integer(i)});
            return;
        }
        CheckBox checkBox = this.mProtocolCB;
        if (checkBox != null && !checkBox.isChecked()) {
            if (!isActive()) {
                return;
            }
            uiShown("checkAgreement_dialog");
            final TaobaoRegProtocolDialogFragment rrotocolFragment = getRrotocolFragment();
            if (!LanguageUtil.isChineseLanguage()) {
                rrotocolFragment.setUseOrangeColor(true);
                rrotocolFragment.setUseUnderLine(true);
            }
            rrotocolFragment.setNeedAdaptElder(this.needAdaptElder);
            rrotocolFragment.setPageNameSpm(getPageName());
            rrotocolFragment.needAutoReg(needAutoReg());
            rrotocolFragment.setPostiveBtnText(getString(R.string.aliuser_agree));
            rrotocolFragment.setNegativeBtnText(getString(R.string.aliuser_protocol_disagree));
            rrotocolFragment.setNagetive(new View.OnClickListener() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!BaseLoginFragment.this.isActive()) {
                    } else {
                        BaseLoginFragment.access$1000(BaseLoginFragment.this, "Agreement_Button_Cancel");
                        rrotocolFragment.dismissAllowingStateLoss();
                    }
                }
            });
            rrotocolFragment.setPositive(new View.OnClickListener() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!BaseLoginFragment.this.isActive()) {
                    } else {
                        BaseLoginFragment.access$1100(BaseLoginFragment.this, "Agreement_Button_Agree");
                        rrotocolFragment.dismissAllowingStateLoss();
                        BaseLoginFragment.this.mProtocolCB.setChecked(true);
                        BaseLoginFragment.this.doRealAction(i);
                    }
                }
            });
            rrotocolFragment.setOneKeyProtocol(this.mProtocolTitle);
            rrotocolFragment.setOneKeyProtocolUrl(this.mProtocolUrl);
            rrotocolFragment.show(getActivity().getSupportFragmentManager(), getPageName());
            return;
        }
        doRealAction(i);
    }

    public boolean needAutoReg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("24fe9ffa", new Object[]{this})).booleanValue() : !this.isHistoryMode;
    }

    public void doRealAction(int i) {
        UserLoginActivity userLoginActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f3d65d", new Object[]{this, new Integer(i)});
        } else if (i == LoginClickAction.ACTION_SEND_SMS) {
            onSendSMSAction();
        } else if (i == LoginClickAction.ACTION_LOGIN) {
            onLoginAction();
        } else if (i == LoginClickAction.ACTION_FACE) {
            onFaceLogin(true);
        } else if (i == LoginClickAction.ACTION_ALIPAY) {
            goAlipay();
        } else if (i == LoginClickAction.ACTION_TAOBAO) {
            goTaobao();
        } else if (i == LoginClickAction.ACTION_FIND_PWD) {
            UserTrackAdapter.sendControlUT(getPageName(), "Button-ForgetPwd");
            onForgetPasswordAction();
        } else if (i == LoginClickAction.ACTION_FINGER) {
            onFingerLogin();
        } else if (i == LoginClickAction.ACTION_GOOGLE_LOGIN) {
            goGoogle();
        } else if (i == LoginClickAction.ACTION_FACEBOOK_LOGIN) {
            goFacebook();
        } else if (i == LoginClickAction.ACTION_ALIPAYHK_LOGIN) {
            goAlipay(true);
        } else if (i != LoginClickAction.ACTION_ONEKEY_HISTORY || (userLoginActivity = this.mUserLoginActivity) == null || userLoginActivity.mHistoryAccount == null) {
        } else {
            simVerify(this.mUserLoginActivity.mHistoryAccount);
        }
    }

    public void onFaceLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5090d360", new Object[]{this, new Boolean(z)});
        } else if (ServiceFactory.getService(FaceService.class) == null) {
        } else {
            LoginParam loginParam = new LoginParam();
            loginParam.hid = this.mUserLoginActivity.mHistoryAccount.userId;
            loginParam.deviceTokenKey = this.mUserLoginActivity.mHistoryAccount.tokenKey;
            UserLoginActivity userLoginActivity = this.mUserLoginActivity;
            if (userLoginActivity != null) {
                loginParam.alipayInstalled = userLoginActivity.mAlipayInstall;
            }
            loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.SCAN_FACE_LOGIN, getPageName());
            loginParam.loginSourceType = LoginType.LocalLoginType.SCAN_FACE_LOGIN;
            loginParam.utPageName = getPageName();
            HashMap hashMap = new HashMap();
            hashMap.put("sdkTraceId", loginParam.sdkTraceId + "");
            UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.SCAN_FACE_LOGIN, hashMap);
            FaceLoginPresenter faceLoginPresenter = this.mFaceLoginPresenter;
            if (faceLoginPresenter == null) {
                return;
            }
            if (z) {
                faceLoginPresenter.activeFaceLogin(loginParam);
            } else {
                faceLoginPresenter.fetchScanToken(loginParam);
            }
        }
    }

    public CommonUICallback getUICallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CommonUICallback) ipChange.ipc$dispatch("c4196dd", new Object[]{this}) : new CommonUICallback() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.17
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.login.CommonUICallback
            public void onResult(int i, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
                }
            }
        };
    }

    public void onFingerLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e64a28", new Object[]{this});
        } else if (ServiceFactory.getService(FingerprintService.class) == null) {
        } else {
            try {
                if (this.mBioPresenter == null) {
                    return;
                }
                this.mBioPresenter.buildLoginParam();
                this.mBioPresenter.mLoginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.BIO_LOGIN, getPageName());
                this.mBioPresenter.mLoginParam.utPageName = LoginType.LocalLoginType.BIO_LOGIN;
                this.mBioPresenter.mLoginParam.utPageName = getPageName();
                HashMap hashMap = new HashMap();
                hashMap.put("sdkTraceId", this.mBioPresenter.mLoginParam.sdkTraceId + "");
                UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.BIO_LOGIN, hashMap);
                if (getHistoryAccount() != null) {
                    this.mBioPresenter.mLoginParam.biometricId = getHistoryAccount().biometricId;
                    this.mBioPresenter.mLoginParam.hid = this.historyHid;
                }
                this.mBioPresenter.login(this.mAttachedActivity, this.mBioPresenter.mLoginParam, getUICallback());
            } catch (Throwable th) {
                th.printStackTrace();
            }
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

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public void goAlipay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a781a0d9", new Object[]{this});
        } else {
            goAlipay(false);
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
        loginParam.source = this.mSource;
        loginParam.hid = this.historyHid;
        loginParam.alipayInstalled = true;
        HashMap hashMap = new HashMap();
        hashMap.put("sdkTraceId", loginParam.sdkTraceId + "");
        UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.ASO_LOGIN, hashMap);
        AlipayAuth.onAlipayLoginClick(this, z);
    }

    public boolean isFingerEnable(HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2e555d45", new Object[]{this, historyAccount})).booleanValue() : historyAccount != null && !TextUtils.isEmpty(historyAccount.biometricId) && ServiceFactory.getService(FingerprintService.class) != null && ((FingerprintService) ServiceFactory.getService(FingerprintService.class)).isFingerprintAvailable() && !TextUtils.isEmpty(this.mUserLoginActivity.mBiometricToken);
    }

    public void addFingeritem(BottomMenuFragment bottomMenuFragment, List<com.ali.user.mobile.ui.widget.MenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f6f5d52", new Object[]{this, bottomMenuFragment, list});
        } else if (!this.fingerLoginEnable || (this instanceof AliFingerLoginFragment)) {
        } else {
            com.ali.user.mobile.ui.widget.MenuItem menuItem = new com.ali.user.mobile.ui.widget.MenuItem();
            menuItem.setText(getString(R.string.aliuser_finger_button_text));
            menuItem.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem) { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.18
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, com.ali.user.mobile.ui.widget.MenuItem menuItem2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem2});
                    } else if (!BaseLoginFragment.this.isActive()) {
                    } else {
                        BaseLoginFragment.access$1200(BaseLoginFragment.this, UTConstans.Controls.UT_CHOOSE_OTHER_FINGER);
                        BaseLoginFragment.this.onCheckLogin(LoginClickAction.ACTION_FINGER);
                    }
                }
            });
            list.add(menuItem);
        }
    }

    public Map<String, String> getOnekeyEnableMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("752fe066", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("showOnekeyHistory", String.valueOf(this.onekeyHistoryEnable));
        return hashMap;
    }

    public boolean isHistoryOnekeyEnable(HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2ec12f5", new Object[]{this, historyAccount})).booleanValue();
        }
        if (checkSMSLoginEnable(historyAccount) && historyAccount != null) {
            String mobileFromHistory = UserLoginActivity.getMobileFromHistory(historyAccount);
            String maskMobile = UserLoginActivity.getMaskMobile();
            boolean isCompareSuccess = UserLoginActivity.isCompareSuccess(mobileFromHistory, maskMobile);
            if (!TextUtils.isEmpty(maskMobile) && !(this instanceof OneKeyLoginFragment) && isCompareSuccess && LoginSwitch.isInABTestRegion("rollback_history_to_onekey", 10000)) {
                UserTrackAdapter.sendUT(getPageName(), "canOnekeyHistory");
                return true;
            }
        }
        return false;
    }

    public void addOnekeyHistory(BottomMenuFragment bottomMenuFragment, List<com.ali.user.mobile.ui.widget.MenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3770730f", new Object[]{this, bottomMenuFragment, list});
        } else if (!this.onekeyHistoryEnable) {
        } else {
            com.ali.user.mobile.ui.widget.MenuItem menuItem = new com.ali.user.mobile.ui.widget.MenuItem();
            menuItem.setText(getString(R.string.aliuser_onekey_history_button_text));
            menuItem.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem) { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.19
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, com.ali.user.mobile.ui.widget.MenuItem menuItem2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem2});
                    } else if (!BaseLoginFragment.this.isActive()) {
                    } else {
                        BaseLoginFragment.access$1300(BaseLoginFragment.this, UTConstans.Controls.UT_CHOOSE_OTHER_SIM);
                        if (BaseLoginFragment.this.mUserLoginActivity == null || BaseLoginFragment.this.mUserLoginActivity.mHistoryAccount == null) {
                            return;
                        }
                        BaseLoginFragment.this.onCheckLogin(LoginClickAction.ACTION_ONEKEY_HISTORY);
                    }
                }
            });
            list.add(menuItem);
        }
    }

    public void simVerify(final HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcbb3ddb", new Object[]{this, historyAccount});
            return;
        }
        LoginParam loginParam = new LoginParam();
        loginParam.loginId = historyAccount.userInputName;
        loginParam.hid = historyAccount.userId;
        loginParam.isFromAccount = true;
        loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN, getPageName());
        loginParam.loginSourceType = LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN;
        loginParam.utPageName = getPageName();
        TrackingModel trackingModel = new TrackingModel();
        trackingModel.pageName = getPageName();
        trackingModel.loginType = LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN;
        trackingModel.traceId = ApiReferer.generateTraceId(trackingModel.loginType, trackingModel.pageName);
        showProgress("");
        LoginApi.mobileVerifyLogin(loginParam, trackingModel, null, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.20
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                } else {
                    BaseLoginFragment.this.dismissLoading();
                }
            }

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onFail(LoginException<LoginReturnData> loginException) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                    return;
                }
                BaseLoginFragment.this.dismissLoading();
                RpcResponse<LoginReturnData> orinResponse = loginException.getOrinResponse();
                if (LoginSwitch.isInABTestRegion("handleSimError", 10000) && (loginException.getCode() == 3013 || loginException.getCode() == 14076 || orinResponse.code == 3013 || orinResponse.code == 14076)) {
                    BaseLoginFragment.this.sendSms(historyAccount.userId, historyAccount.mobile);
                } else if (LoginSwitch.isInABTestRegion("handleSimError", 10000) && orinResponse.returnValue != null && (loginException.getCode() == 14044 || loginException.getCode() == 14163 || orinResponse.code == 14044 || orinResponse.code == 14163)) {
                    BaseLoginFragment.this.sendSms(historyAccount.userId, orinResponse.returnValue.mobile);
                } else {
                    BaseLoginFragment baseLoginFragment = BaseLoginFragment.this;
                    baseLoginFragment.toast(baseLoginFragment.getString(R.string.aliuser_onekey_login_fail_tip2), 1);
                }
            }

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onCancel() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                } else {
                    BaseLoginFragment.this.dismissLoading();
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void sendSms(long r11, java.lang.String r13) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.ali.user.mobile.login.ui.BaseLoginFragment.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1d
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r10
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r11)
            r1[r2] = r3
            r11 = 2
            r1[r11] = r13
            java.lang.String r11 = "3f3edfd6"
            r0.ipc$dispatch(r11, r1)
            return
        L1d:
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L24
            return
        L24:
            com.ali.user.mobile.model.LoginParam r0 = new com.ali.user.mobile.model.LoginParam
            r0.<init>()
            com.ali.user.mobile.login.presenter.UserMobileLoginPresenter r1 = new com.ali.user.mobile.login.presenter.UserMobileLoginPresenter
            r1.<init>(r10, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L4a
            java.lang.String r0 = "-"
            boolean r4 = r13.contains(r0)
            if (r4 == 0) goto L4a
            java.lang.String[] r0 = r13.split(r0)
            int r4 = r0.length
            if (r4 <= r2) goto L4a
            r13 = r0[r3]
            r0 = r0[r2]
            r9 = r13
            r5 = r0
            goto L4e
        L4a:
            java.lang.String r0 = "86"
            r5 = r13
            r9 = r0
        L4e:
            r6 = 0
            r7 = 0
            java.lang.String r8 = "CN"
            r4 = r1
            r4.buildSMSLoginParam(r5, r6, r7, r8, r9)
            com.ali.user.mobile.model.LoginParam r13 = r1.getLoginParam()
            java.lang.String r0 = r10.getPageName()
            r13.utPageName = r0
            com.ali.user.mobile.model.LoginParam r13 = r1.getLoginParam()
            java.lang.String r0 = "smsLogin"
            r13.loginSourceType = r0
            com.ali.user.mobile.model.LoginParam r13 = r1.getLoginParam()
            java.lang.String r2 = r10.getPageName()
            java.lang.String r2 = com.ali.user.mobile.log.ApiReferer.generateTraceId(r0, r2)
            r13.sdkTraceId = r2
            com.ali.user.mobile.model.LoginParam r13 = r1.getLoginParam()
            r13.resendAlert = r3
            com.ali.user.mobile.model.LoginParam r13 = r1.getLoginParam()
            r13.hid = r11
            com.ali.user.mobile.login.ui.UserLoginActivity r11 = r10.mUserLoginActivity
            if (r11 == 0) goto L91
            com.ali.user.mobile.model.LoginParam r11 = r1.getLoginParam()
            com.ali.user.mobile.login.ui.UserLoginActivity r12 = r10.mUserLoginActivity
            boolean r12 = r12.mAlipayInstall
            r11.alipayInstalled = r12
        L91:
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            com.ali.user.mobile.model.LoginParam r13 = r1.getLoginParam()
            java.lang.String r13 = r13.sdkTraceId
            r12.append(r13)
            java.lang.String r13 = ""
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.String r2 = "sdkTraceId"
            r11.put(r2, r12)
            java.lang.String r12 = r10.getPageName()
            java.lang.String r2 = "smsAction"
            com.ali.user.mobile.log.UserTrackAdapter.control(r12, r2, r13, r0, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "action=smsAction;biz=smsLogin;page="
            r11.append(r12)
            java.lang.String r12 = r10.getPageName()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "Page_Member_Login"
            java.lang.String r13 = "loginMonitorPoint"
            com.ali.user.mobile.log.AppMonitorAdapter.commitSuccess(r12, r13, r11)
            com.ali.user.mobile.base.ui.BaseActivity r11 = r10.mAttachedActivity
            com.ali.user.mobile.model.LoginParam r12 = r1.getLoginParam()
            com.ali.user.mobile.login.ui.BaseLoginFragment$21 r13 = new com.ali.user.mobile.login.ui.BaseLoginFragment$21
            r13.<init>()
            r1.sendSMS(r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.login.ui.BaseLoginFragment.sendSms(long, java.lang.String):void");
    }

    public void showFindPasswordAlert(final LoginParam loginParam, RpcResponse<LoginReturnData> rpcResponse, final UserLoginPresenter userLoginPresenter, final EditText editText, final ImageView imageView) {
        AliUserDialog.PositiveClickListener positiveClickListener;
        String str;
        String str2;
        String str3;
        String str4;
        UserLoginActivity userLoginActivity;
        IpChange ipChange = $ipChange;
        final boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1260baab", new Object[]{this, loginParam, rpcResponse, userLoginPresenter, editText, imageView});
            return;
        }
        String string = getResources().getString(R.string.aliuser_common_ok);
        if (rpcResponse != null && !TextUtils.isEmpty(rpcResponse.codeGroup) && loginParam != null && TextUtils.equals(ApiConstants.CodeGroup.PWD_CAN_SMS_ERROR, rpcResponse.codeGroup)) {
            if (rpcResponse.returnValue == null || rpcResponse.returnValue.extMap == null) {
                str = "";
                str2 = str;
            } else {
                str = rpcResponse.returnValue.extMap.get("dialogTitle");
                str2 = rpcResponse.returnValue.extMap.get("dialogContent");
            }
            str4 = getResources().getString(R.string.aliuser_login_sms_login2);
            str3 = getResources().getString(R.string.aliuser_cancel);
            positiveClickListener = new AliUserDialog.PositiveClickListener() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.22
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.AliUserDialog.PositiveClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (BaseLoginFragment.this.mAliUserDialog != null) {
                        BaseLoginFragment.this.mAliUserDialog.dismiss();
                    }
                    BaseLoginFragment.access$1400(BaseLoginFragment.this, "Button-Nick-Sms-Login");
                    BaseLoginFragment.this.pwdErrorToSMS();
                }
            };
        } else if (rpcResponse != null && !TextUtils.isEmpty(rpcResponse.codeGroup) && loginParam != null && TextUtils.equals(ApiConstants.CodeGroup.PWD_CAN_FACE_ERROR, rpcResponse.codeGroup) && ServiceFactory.getService(FaceService.class) != null) {
            if (rpcResponse.returnValue == null || rpcResponse.returnValue.extMap == null) {
                str = "";
                str2 = str;
            } else {
                str = rpcResponse.returnValue.extMap.get("dialogTitle");
                str2 = rpcResponse.returnValue.extMap.get("dialogContent");
            }
            str4 = getResources().getString(R.string.aliuser_scan_login_text);
            str3 = getResources().getString(R.string.aliuser_cancel);
            positiveClickListener = new AliUserDialog.PositiveClickListener() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.23
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.AliUserDialog.PositiveClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!BaseLoginFragment.this.isActive()) {
                    } else {
                        if (BaseLoginFragment.this.mAliUserDialog != null) {
                            BaseLoginFragment.this.mAliUserDialog.dismiss();
                        }
                        BaseLoginFragment.access$1500(BaseLoginFragment.this, "Button-Nick-Face-Login");
                        BaseLoginFragment.this.onFaceLogin(true);
                    }
                }
            };
        } else if (rpcResponse != null && !TextUtils.isEmpty(rpcResponse.codeGroup) && loginParam != null && (userLoginActivity = this.mUserLoginActivity) != null && userLoginActivity.mAlipayInstall && TextUtils.equals(ApiConstants.CodeGroup.PWD_CAN_ALIPAY, rpcResponse.codeGroup) && LoginSwitch.isInABTestRegion(LoginSwitch.PWD_ERROR_TO_ALIPAY, 10000)) {
            if (rpcResponse.returnValue == null || rpcResponse.returnValue.extMap == null) {
                str = "";
                str2 = str;
            } else {
                str = rpcResponse.returnValue.extMap.get("dialogTitle");
                str2 = rpcResponse.returnValue.extMap.get("dialogContent");
            }
            str4 = getResources().getString(R.string.ali_user_alipay_quick_login);
            str3 = getResources().getString(R.string.aliuser_re_enter);
            positiveClickListener = new AliUserDialog.PositiveClickListener() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.24
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.AliUserDialog.PositiveClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!BaseLoginFragment.this.isActive()) {
                    } else {
                        if (BaseLoginFragment.this.mAliUserDialog != null) {
                            BaseLoginFragment.this.mAliUserDialog.dismiss();
                        }
                        BaseLoginFragment.access$1600(BaseLoginFragment.this, "Button-Nick-Alipay-Login");
                        BaseLoginFragment.this.goAlipay();
                    }
                }
            };
            z = false;
        } else if (rpcResponse == null || TextUtils.isEmpty(rpcResponse.codeGroup) || loginParam == null || (!TextUtils.equals(ApiConstants.CodeGroup.PWD_ERROR, rpcResponse.codeGroup) && !TextUtils.equals("noRecord", rpcResponse.codeGroup))) {
            positiveClickListener = null;
            str = "";
            str2 = str;
            z = false;
            str3 = string;
            str4 = str2;
        } else {
            String string2 = getResources().getString(R.string.aliuser_alert_findpwd);
            positiveClickListener = new AliUserDialog.PositiveClickListener() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.25
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.AliUserDialog.PositiveClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!BaseLoginFragment.this.isActive()) {
                    } else {
                        BaseLoginFragment.access$1700(BaseLoginFragment.this, "Button-Alert-ResetPwd");
                        userLoginPresenter.fetchUrlAndToWebView(BaseLoginFragment.access$1800(BaseLoginFragment.this), loginParam.loginId, LoginType.LocalLoginType.RETRIVE_PWD_LOGIN, loginParam.source);
                        if (BaseLoginFragment.this.mAliUserDialog == null) {
                            return;
                        }
                        BaseLoginFragment.this.mAliUserDialog.dismiss();
                    }
                }
            };
            str = "";
            str2 = str;
            str3 = string;
            str4 = string2;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = rpcResponse == null ? "" : rpcResponse.message;
        }
        if (TextUtils.isEmpty(str)) {
            str = str2;
            str2 = "";
        }
        AliUserDialog.Builder onNegativeClickListener = AliUserDialog.Builder(getActivity()).setTitle(str).setMessage(str2).setOnNegativeClickListener(str3, new AliUserDialog.NegativeClickListener() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.26
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.ui.widget.AliUserDialog.NegativeClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (BaseLoginFragment.this.mAliUserDialog != null) {
                    BaseLoginFragment.this.mAliUserDialog.dismiss();
                }
                if (!z || !BaseLoginFragment.this.isActive()) {
                    return;
                }
                BaseLoginFragment.this.onPwdError();
                if (!BaseLoginFragment.this.isActive() || editText == null || imageView == null || !LoginSwitch.getSwitch("show_password_hint", "true")) {
                    return;
                }
                editText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                imageView.setImageResource(R.drawable.aliuser_ic_visibility);
                imageView.setContentDescription(BaseLoginFragment.this.getString(R.string.aliuser_assist_password_show));
                imageView.setTag(true);
                UserTrackAdapter.sendControlUT(BaseLoginFragment.this.getPageName(), "Button-ShowPwd");
            }
        });
        if (!TextUtils.isEmpty(str4)) {
            onNegativeClickListener.setOnPositiveClickListener(str4, positiveClickListener);
        }
        this.mAliUserDialog = onNegativeClickListener.build().shown();
        HashMap hashMap = new HashMap();
        if (rpcResponse != null) {
            hashMap.put("code", String.valueOf(rpcResponse.code));
        }
        if (rpcResponse != null && !TextUtils.isEmpty(rpcResponse.codeGroup)) {
            hashMap.put("codeGroup", rpcResponse.codeGroup);
        }
        UserTrackAdapter.sendUserTrack(getPageName(), "ShowPwdError", hashMap);
    }

    public void pwdErrorToSMS() {
        UserLoginActivity userLoginActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab6e9da", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        CheckBox checkBox = this.mProtocolCB;
        if (checkBox != null) {
            intent.putExtra("check", checkBox.isChecked());
        }
        intent.putExtra("autoSendSms", true);
        if (!isActive() || (userLoginActivity = this.mUserLoginActivity) == null) {
            return;
        }
        userLoginActivity.gotoMobileLoginFragment(intent);
    }

    public boolean checkSMSLoginEnable(HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec3c138a", new Object[]{this, historyAccount})).booleanValue();
        }
        if (historyAccount == null || historyAccount.alipayHid != 0) {
            return false;
        }
        boolean z = this.mAttachedActivity instanceof UserLoginActivity ? ((UserLoginActivity) this.mAttachedActivity).isMobileAvailable : true;
        if (!DataProviderFactory.getDataProvider().historySecurityMobileCanLogin()) {
            return !TextUtils.isEmpty(historyAccount.loginPhone);
        }
        return !TextUtils.isEmpty(historyAccount.mobile) && z;
    }

    public void showBottomMenuForFirstPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e264b44", new Object[]{this});
            return;
        }
        BottomMenuFragment bottomMenuFragment = getBottomMenuFragment();
        ArrayList arrayList = new ArrayList();
        com.ali.user.mobile.ui.widget.MenuItem menuItem = new com.ali.user.mobile.ui.widget.MenuItem();
        menuItem.setText(getString(R.string.aliuser_menu_help));
        menuItem.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem) { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.27
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
            public void onClickMenuItem(View view, com.ali.user.mobile.ui.widget.MenuItem menuItem2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem2});
                } else if (!BaseLoginFragment.this.isActive()) {
                } else {
                    BaseLoginFragment.this.openHelp();
                }
            }
        });
        com.ali.user.mobile.ui.widget.MenuItem menuItem2 = new com.ali.user.mobile.ui.widget.MenuItem();
        menuItem2.setText(getFindAccountText());
        menuItem2.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem2) { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.28
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
            public void onClickMenuItem(View view, com.ali.user.mobile.ui.widget.MenuItem menuItem3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem3});
                    return;
                }
                BaseLoginFragment.access$1900(BaseLoginFragment.this, "findnick");
                if (!BaseLoginFragment.this.isActive()) {
                    return;
                }
                BaseLoginFragment.this.openFindAccountPage();
            }
        });
        arrayList.add(menuItem);
        arrayList.add(menuItem2);
        addMoreMenus(bottomMenuFragment, arrayList);
        bottomMenuFragment.setMenuItems(arrayList);
        bottomMenuFragment.setMenuTitle(getString(R.string.aliuser_login_more_func));
        bottomMenuFragment.show(getFragmentManager(), getPageName());
    }

    public String getFindAccountText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2e44708e", new Object[]{this}) : getString(R.string.aliuser_find_account);
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        DeviceUtils.adapterLoginUIOnDevice(getAdapterDeviceViews());
    }
}
