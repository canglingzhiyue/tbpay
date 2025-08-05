package com.taobao.login4android.qrcode;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.presenter.BaseLoginPresenter;
import com.ali.user.mobile.login.ui.BaseLoginFragment;
import com.ali.user.mobile.login.ui.BaseLoginView;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.navigation.NavigatorManager;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.utils.ImageUtil;
import com.ali.user.mobile.utils.LoadImageTask;
import com.ali.user.mobile.utils.MD5Util;
import com.ali.user.mobile.utils.NetworkUtil;
import com.ali.user.mobile.utils.ResourceUtil;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.UIDataComponent;
import com.taobao.login4android.UIHavanaComponent;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.qrcode.callback.ICallback;
import com.taobao.login4android.qrcode.data.GenQrData;
import com.taobao.login4android.qrcode.data.GenQrResponse;
import com.taobao.login4android.qrcode.data.QrCodeData;
import com.taobao.login4android.qrcode.data.QrCodeParam2;
import com.taobao.login4android.qrcode.result.LoginResult;
import com.taobao.login4android.qrcode.view.QrCodeView;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class BaseQrLoginFragment extends BaseLoginFragment implements Handler.Callback, BaseLoginView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MESSAGE_GEN_QR_CODE_SUCCESS = 1103;
    public static final int MESSAGE_QR_CODE_INVALID = 1105;
    public static final int MESSAGE_QR_CODE_SCANED = 1106;
    public static final int MESSAGE_RE_GEN_QR_CODE = 1104;
    public static final String TAG = "Login.QrLogin";
    public BitmapDrawable mBitmapDrawable;
    public NoLeakHandler mHandler;
    public boolean mHasToasted;
    public BaseLoginPresenter mPresenter;
    public QrCodeData mQrCodeData;
    public int mQrCodeSize;
    public long mQrCodeStartTime;
    public QrCodeView mQrCodeView;
    public LoginParam loginParam = null;
    public HashMap<String, WeakReference<Bitmap>> mQrCodeImageCache = new HashMap<>(1);
    public int qrMargin = 1;

    static {
        kge.a(-1713587452);
        kge.a(-1043440182);
        kge.a(-422013296);
    }

    public static /* synthetic */ Object ipc$super(BaseQrLoginFragment baseQrLoginFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1912803358:
                super.onClick((View) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1180824595:
                super.initViews((View) objArr[0]);
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 382958558:
                super.onCreateOptionsMenu((Menu) objArr[0], (MenuInflater) objArr[1]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2127624665:
                super.onDetach();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : "Page_qr_login";
    }

    public void showDefaultQrCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f77de8d9", new Object[]{this});
        }
    }

    public void showScaned() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba83d40", new Object[]{this});
        }
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
            String str = (String) arguments.get(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM);
            arguments.putString(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, "");
            if (!TextUtils.isEmpty(str)) {
                this.loginParam = (LoginParam) JSON.parseObject(str, LoginParam.class);
            }
        }
        this.mPresenter = new BaseLoginPresenter(this, this.loginParam);
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
        this.mHandler = new NoLeakHandler(this);
        this.mAttachedActivity.supportTaobaoOrAlipay = true;
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_fragment_qrlogin_tb;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        super.initViews(view);
        this.mQrCodeView = (QrCodeView) view.findViewById(R.id.aliuser_login_qr_code);
        this.mQrCodeView.setOnClickListener(this);
        this.mPresenter.onStart();
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        NoLeakHandler noLeakHandler = this.mHandler;
        if (noLeakHandler != null) {
            noLeakHandler.setValid(true);
        }
        super.onResume();
        QrCodeData qrCodeData = this.mQrCodeData;
        if (qrCodeData != null && qrCodeData.isValid()) {
            showQrCodeEfficiently();
            qrCodeLogin(this.mQrCodeData);
            return;
        }
        genQrCode();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.mHasToasted = false;
        NoLeakHandler noLeakHandler = this.mHandler;
        if (noLeakHandler != null) {
            noLeakHandler.setValid(false);
        }
        UIDataComponent.getInstance().stopQrLogin();
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        super.onDetach();
        NoLeakHandler noLeakHandler = this.mHandler;
        if (noLeakHandler == null) {
            return;
        }
        noLeakHandler.setValid(false);
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler = null;
    }

    public void genQrCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd4bca5", new Object[]{this});
            return;
        }
        this.mQrCodeStartTime = SystemClock.elapsedRealtime();
        if (getActivity() == null || !NetworkUtil.isNetworkConnected()) {
            toast(getString(R.string.aliuser_network_error), 0);
            this.mQrCodeView.setEnabled(true);
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        UIHavanaComponent.genQrCode(genQrCodeParam(), new RpcRequestCallback() { // from class: com.taobao.login4android.qrcode.BaseQrLoginFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onSuccess(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                } else if (rpcResponse == null) {
                } else {
                    GenQrResponse genQrResponse = (GenQrResponse) rpcResponse;
                    if (genQrResponse != null && genQrResponse.returnValue != 0 && !TextUtils.isEmpty(((GenQrData) genQrResponse.returnValue).qrCodeImgUrl)) {
                        BaseQrLoginFragment.this.mQrCodeData = new QrCodeData();
                        BaseQrLoginFragment.this.mQrCodeData.qrCode = ((GenQrData) genQrResponse.returnValue).token;
                        BaseQrLoginFragment.this.mQrCodeData.qrCodeUrl = ((GenQrData) genQrResponse.returnValue).qrCodeUrl;
                        BaseQrLoginFragment.this.mQrCodeData.qrCodeImgUrl = ((GenQrData) genQrResponse.returnValue).qrCodeImgUrl;
                        BaseQrLoginFragment.this.mQrCodeData.cycleSecs = ((GenQrData) genQrResponse.returnValue).pollMilliseconds;
                        if (BaseQrLoginFragment.this.mHandler != null) {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            LoginTLogAdapter.e(BaseQrLoginFragment.TAG, "genQrcode=" + (currentTimeMillis2 - currentTimeMillis));
                            BaseQrLoginFragment.this.mHandler.sendEmptyMessage(1103);
                        }
                        UserTrackAdapter.sendUT(BaseQrLoginFragment.this.getPageName(), "renderSuccess");
                        return;
                    }
                    BaseQrLoginFragment.this.showDefaultQrCode();
                }
            }

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onError(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                    return;
                }
                LoginTLogAdapter.e(BaseQrLoginFragment.TAG, "reqFail" + rpcResponse.message);
                String stringById = ResourceUtil.getStringById("passport_sdk_network_error");
                if (!TextUtils.isEmpty(rpcResponse.message)) {
                    stringById = rpcResponse.message;
                }
                BaseQrLoginFragment.this.toast(stringById, 0);
                BaseQrLoginFragment.this.showDefaultQrCode();
            }
        });
    }

    public QrCodeParam2 genQrCodeParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QrCodeParam2) ipChange.ipc$dispatch("f091aab2", new Object[]{this});
        }
        QrCodeParam2 qrCodeParam2 = new QrCodeParam2();
        qrCodeParam2.qrCodeSize = this.mQrCodeSize;
        return qrCodeParam2;
    }

    public void showRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb52ea5", new Object[]{this});
            return;
        }
        QrCodeView qrCodeView = this.mQrCodeView;
        if (qrCodeView == null) {
            return;
        }
        qrCodeView.setIcon(getRefreshIcon());
        this.mQrCodeView.setText(R.string.passport_ott_refresh_qr_code);
        this.mQrCodeView.setSuccessVisible(8);
        this.mQrCodeView.showPrompt(true);
        this.mQrCodeView.setEnabled(true);
        this.mQrCodeView.requestFocus();
    }

    public void showReGenQrCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("437fac75", new Object[]{this});
            return;
        }
        QrCodeView qrCodeView = this.mQrCodeView;
        if (qrCodeView == null) {
            return;
        }
        qrCodeView.setIcon(getRefreshIcon());
        this.mQrCodeView.setText(R.string.passport_ott_re_gen_qr_code);
        this.mQrCodeView.setSuccessVisible(8);
        this.mQrCodeView.showPrompt(true);
        this.mQrCodeView.setEnabled(true);
    }

    public void showQrCodeEfficiently() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e78b66a", new Object[]{this});
            return;
        }
        final String str = this.mQrCodeData.qrCodeUrl;
        final String str2 = this.mQrCodeData.qrCodeImgUrl;
        WeakReference<Bitmap> weakReference = this.mQrCodeImageCache.get(str);
        Bitmap bitmap = null;
        if (weakReference != null) {
            bitmap = weakReference.get();
        }
        if (bitmap != null) {
            this.mQrCodeView.showPrompt(false);
            this.mQrCodeView.setSuccessVisible(8);
            this.mQrCodeView.setEnabled(false);
            this.mBitmapDrawable = new BitmapDrawable(bitmap);
            this.mQrCodeView.setQrCodeBitmapDrawable(this.mBitmapDrawable);
        } else if (this.mQrCodeSize > 0) {
            showQrCode(str, str2);
        } else {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                return;
            }
            activity.getWindow().getDecorView().post(new Runnable() { // from class: com.taobao.login4android.qrcode.BaseQrLoginFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        BaseQrLoginFragment.this.mQrCodeView.post(new Runnable() { // from class: com.taobao.login4android.qrcode.BaseQrLoginFragment.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                BaseQrLoginFragment.this.mQrCodeSize = BaseQrLoginFragment.this.mQrCodeView.getWidth();
                                BaseQrLoginFragment.this.showQrCode(str, str2);
                            }
                        });
                    }
                }
            });
        }
    }

    public void showQrCode(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeaa2826", new Object[]{this, str, str2});
        } else if (this.mQrCodeView == null) {
            LoginTLogAdapter.w(TAG, "showQrCode fail");
        } else if (TextUtils.isEmpty(str) || str.equals(this.mQrCodeView.getTag()) || TextUtils.isEmpty(str2)) {
            LoginTLogAdapter.e(TAG, "showQrCode failed, aQrCodeStr = " + str + ",tag=" + this.mQrCodeView.getTag() + ", qrCodeImgUrl= " + str2);
        } else {
            if (this.mQrCodeSize <= 0) {
                this.mQrCodeSize = this.mQrCodeView.getWidth();
            }
            LoginTLogAdapter.e(TAG, "QrWidth=" + this.mQrCodeData);
            this.mQrCodeView.post(new Runnable() { // from class: com.taobao.login4android.qrcode.BaseQrLoginFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    BaseQrLoginFragment.this.mQrCodeView.showPrompt(false);
                    BaseQrLoginFragment.this.mQrCodeView.setSuccessVisible(8);
                    BaseQrLoginFragment.this.mQrCodeView.setEnabled(false);
                    BaseQrLoginFragment.this.mQrCodeView.setTag(str);
                    Bitmap bitmapFromMemoryCache = ImageUtil.getBitmapFromMemoryCache(MD5Util.getMD5(str2));
                    if (bitmapFromMemoryCache != null) {
                        BaseQrLoginFragment.this.mQrCodeView.setQrCodeBitmap(bitmapFromMemoryCache);
                    } else {
                        new LoadImageTask(DataProviderFactory.getApplicationContext(), BaseQrLoginFragment.this.mQrCodeView, "HeadImages", 200).execute(str2);
                    }
                }
            });
            recycleBitmap();
        }
    }

    public void recycleBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48db929", new Object[]{this});
            return;
        }
        for (String str : this.mQrCodeImageCache.keySet()) {
            WeakReference<Bitmap> weakReference = this.mQrCodeImageCache.get(str);
            if (weakReference != null) {
                weakReference.clear();
            }
        }
        this.mQrCodeImageCache.clear();
    }

    public void qrCodeLogin(QrCodeData qrCodeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca84fc5", new Object[]{this, qrCodeData});
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing() || isDetached()) {
            return;
        }
        if (!NetworkUtil.isNetworkConnected() && !this.mHasToasted) {
            this.mHasToasted = true;
            toast(getString(R.string.aliuser_network_error), 0);
        } else if (this.mQrCodeView == null || qrCodeData == null) {
        } else {
            UIDataComponent.getInstance().qrLogin(qrCodeData.qrCode, this.mQrCodeData.cycleSecs >= 2000 ? this.mQrCodeData.cycleSecs : 3000L, new ICallback<LoginResult>() { // from class: com.taobao.login4android.qrcode.BaseQrLoginFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.login4android.qrcode.callback.ICallback
                public /* synthetic */ void onFailure(LoginResult loginResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b1122e63", new Object[]{this, loginResult});
                    } else {
                        b(loginResult);
                    }
                }

                @Override // com.taobao.login4android.qrcode.callback.ICallback
                public /* synthetic */ void onScaned(LoginResult loginResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3e9c3c73", new Object[]{this, loginResult});
                    } else {
                        c(loginResult);
                    }
                }

                @Override // com.taobao.login4android.qrcode.callback.ICallback
                public /* synthetic */ void onSuccess(LoginResult loginResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bacb574a", new Object[]{this, loginResult});
                    } else {
                        a(loginResult);
                    }
                }

                public void a(LoginResult loginResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1835600", new Object[]{this, loginResult});
                    } else {
                        UserTrackAdapter.sendUT(BaseQrLoginFragment.this.getPageName(), "qrLoginSuccess");
                    }
                }

                public void b(LoginResult loginResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("27175f01", new Object[]{this, loginResult});
                    } else {
                        BaseQrLoginFragment.this.handleQrLoginFail(loginResult);
                    }
                }

                public void c(LoginResult loginResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4cab6802", new Object[]{this, loginResult});
                        return;
                    }
                    BaseQrLoginFragment.this.handleQrScaned(loginResult);
                    UserTrackAdapter.sendUT(BaseQrLoginFragment.this.getPageName(), "qrCodeScaned");
                }
            });
        }
    }

    public void handleQrScaned(LoginResult loginResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("322b2944", new Object[]{this, loginResult});
            return;
        }
        NoLeakHandler noLeakHandler = this.mHandler;
        if (noLeakHandler == null) {
            return;
        }
        noLeakHandler.sendEmptyMessage(1106);
    }

    public void handleQrLoginFail(LoginResult loginResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9898b05d", new Object[]{this, loginResult});
            return;
        }
        int resultCode = loginResult.getResultCode();
        String actionType = loginResult.getActionType();
        if (-105 != resultCode) {
            this.mQrCodeData = null;
            if ("H5".equals(actionType)) {
                NavigatorManager.getInstance().navToWebViewPage(this.mAttachedActivity, loginResult.getUrl(), new LoginParam(), loginResult.getLoginData());
            } else {
                NoLeakHandler noLeakHandler = this.mHandler;
                if (noLeakHandler != null) {
                    noLeakHandler.sendEmptyMessage(1105);
                }
            }
        }
        LoginTLogAdapter.w(TAG, "QrCodeLogin fail resultCode" + resultCode + ",resultMsg=" + loginResult.getResultMsg());
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.mBitmapDrawable = null;
        this.mQrCodeData = null;
        recycleBitmap();
        UIDataComponent.getInstance().stopQrLogin();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        switch (message.what) {
            case 1103:
                QrCodeData qrCodeData = this.mQrCodeData;
                if (qrCodeData != null) {
                    showQrCode(qrCodeData.qrCodeUrl, this.mQrCodeData.qrCodeImgUrl);
                    qrCodeLogin(this.mQrCodeData);
                    break;
                }
                break;
            case 1104:
                genQrCode();
                break;
            case 1105:
                showRefresh();
                break;
            case 1106:
                showScaned();
                break;
        }
        return false;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        QrCodeView qrCodeView = this.mQrCodeView;
        if (qrCodeView == view) {
            qrCodeView.setEnabled(false);
            this.mQrCodeView.setIcon(getRefreshIcon());
            this.mQrCodeView.startAnimation();
            genQrCode();
            addControl("refresh");
            return;
        }
        super.onClick(view);
    }

    public int getRefreshIcon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8b99a38", new Object[]{this})).intValue() : R.drawable.aliuser_refresh_icon;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, android.support.v4.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d37bde", new Object[]{this, menu, menuInflater});
            return;
        }
        super.onCreateOptionsMenu(menu, menuInflater);
        menu.clear();
    }
}
