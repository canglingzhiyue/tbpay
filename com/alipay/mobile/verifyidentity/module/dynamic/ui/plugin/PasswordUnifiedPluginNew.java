package com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.text.Editable;
import mtopsdk.common.util.StringUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaybase.alikeyboard.AliKeyboardType;
import com.alipay.android.app.safepaybase.alikeyboard.AlipayKeyboard;
import com.alipay.android.app.safepaybase.alikeyboard.AlipayKeyboardActionListener;
import com.alipay.android.app.safepaybase.util.ResUtils;
import com.alipay.android.app.template.FBFocusable;
import com.alipay.android.app.template.FBPluginCtx;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.birdnest.util.UiUtil;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.ModuleDataModel;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.password.pay.PayPwdModule;
import com.alipay.mobile.verifyidentity.module.password.pay.PubKeyHelper;
import com.alipay.mobile.verifyidentity.module.password.pay.model.InitDataModel;
import com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler;
import com.alipay.mobile.verifyidentity.safepaybase.EncryptRandomType;
import com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener;
import com.alipay.mobile.verifyidentity.safepaybase.SafeInputContext;
import com.alipay.mobile.verifyidentity.safepaybase.TextWatcherListener;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.VIFBPluginManager;
import com.alipay.mobile.verifyidentity.utils.IDecisionHelper;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class PasswordUnifiedPluginNew extends BaseFBPlugin implements View.OnClickListener, View.OnFocusChangeListener, FBFocusable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String b = "PasswordUnifiedPluginNew";
    public String backToBioViType;
    private Context c;
    public TextView content_desc;
    public TextView content_title;
    private FBPluginCtx d;
    private int e;
    private InitDataModel f;
    public BroadcastReceiver findPwdBroadcastReceiver;
    public String findPwdTxt;
    private PwdCommonHandler g;
    public TextView goBackPwd;
    public String goOtherVerifyProduct;
    private String h;
    public boolean hasOthers;
    public String hind_other;
    private String i;
    public boolean isIntellDecison;
    public boolean isShowGetBackPwd;
    public boolean isSimplePwd;
    private boolean j;
    private View k;
    private View l;
    private EditText m;
    public AlipayKeyboard mAlipayKeyboard;
    public long mInputChangeCount;
    public String mPubKey;
    public LinearLayout mPwdInputLayout;
    public SafeInputContext mSafeInputContext;
    public long mShowInputTime;
    public String mTimestamp;
    private String n;
    private boolean o;
    public String otherProductForDialog;
    public String otherText;
    private String p;
    public BroadcastReceiver pageChangeBroadcastReceiver;
    public String predata;
    public String pwdTopTip;
    public String showFindPwd;
    public String top_to_product;

    /* loaded from: classes3.dex */
    public class DecorViewInfo {
        public View decorView;
        public boolean isDialog;

        public DecorViewInfo() {
        }
    }

    public static /* synthetic */ Object ipc$super(PasswordUnifiedPluginNew passwordUnifiedPluginNew, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2070326638) {
            super.addPlugin((String) objArr[0], (String) objArr[1], (ModuleDataModel) objArr[2], (Bundle) objArr[3]);
            return null;
        } else if (hashCode == -111775739) {
            super.onBNPageClose();
            return null;
        } else if (hashCode != 1244158585) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.updateAttr((String) objArr[0], (String) objArr[1]));
        }
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : b;
    }

    public static /* synthetic */ EditText access$1000(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditText) ipChange.ipc$dispatch("6cb0277c", new Object[]{passwordUnifiedPluginNew}) : passwordUnifiedPluginNew.m;
    }

    public static /* synthetic */ void access$1100(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8bbf0e", new Object[]{passwordUnifiedPluginNew});
        } else {
            passwordUnifiedPluginNew.a();
        }
    }

    public static /* synthetic */ MicroModule access$1200(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("fe524e11", new Object[]{passwordUnifiedPluginNew}) : passwordUnifiedPluginNew.mModule;
    }

    public static /* synthetic */ MicroModule access$1300(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("8b08a852", new Object[]{passwordUnifiedPluginNew}) : passwordUnifiedPluginNew.mModule;
    }

    public static /* synthetic */ MicroModule access$1400(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("17bf0293", new Object[]{passwordUnifiedPluginNew}) : passwordUnifiedPluginNew.mModule;
    }

    public static /* synthetic */ MicroModule access$1500(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("a4755cd4", new Object[]{passwordUnifiedPluginNew}) : passwordUnifiedPluginNew.mModule;
    }

    public static /* synthetic */ MicroModule access$1600(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("312bb715", new Object[]{passwordUnifiedPluginNew}) : passwordUnifiedPluginNew.mModule;
    }

    public static /* synthetic */ MicroModule access$1700(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("bde21156", new Object[]{passwordUnifiedPluginNew}) : passwordUnifiedPluginNew.mModule;
    }

    public static /* synthetic */ MicroModule access$1800(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("4a986b97", new Object[]{passwordUnifiedPluginNew}) : passwordUnifiedPluginNew.mModule;
    }

    public static /* synthetic */ MicroModule access$1900(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("d74ec5d8", new Object[]{passwordUnifiedPluginNew}) : passwordUnifiedPluginNew.mModule;
    }

    public static /* synthetic */ MicroModule access$2000(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("eefa876e", new Object[]{passwordUnifiedPluginNew}) : passwordUnifiedPluginNew.mModule;
    }

    public static /* synthetic */ MicroModule access$2100(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("7bb0e1af", new Object[]{passwordUnifiedPluginNew}) : passwordUnifiedPluginNew.mModule;
    }

    public static /* synthetic */ MicroModule access$2200(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("8673bf0", new Object[]{passwordUnifiedPluginNew}) : passwordUnifiedPluginNew.mModule;
    }

    public static /* synthetic */ boolean access$300(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b0448e5", new Object[]{passwordUnifiedPluginNew})).booleanValue() : passwordUnifiedPluginNew.j;
    }

    public static /* synthetic */ void access$400(PasswordUnifiedPluginNew passwordUnifiedPluginNew, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66715db6", new Object[]{passwordUnifiedPluginNew, str, str2});
        } else {
            passwordUnifiedPluginNew.viNativeExecuteJs(str, str2);
        }
    }

    public static /* synthetic */ PwdCommonHandler access$600(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PwdCommonHandler) ipChange.ipc$dispatch("ac95a9db", new Object[]{passwordUnifiedPluginNew}) : passwordUnifiedPluginNew.g;
    }

    public static /* synthetic */ Context access$700(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("191eabdd", new Object[]{passwordUnifiedPluginNew}) : passwordUnifiedPluginNew.c;
    }

    public int getBusinessId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("544634eb", new Object[]{this})).intValue() : this.e;
    }

    public PasswordUnifiedPluginNew(Context context, FBPluginCtx fBPluginCtx, int i) {
        super(context, fBPluginCtx);
        this.mTimestamp = "";
        this.isShowGetBackPwd = false;
        this.isSimplePwd = true;
        this.j = true;
        this.n = UiUtil.INPUT_TYPE_VALUE_PAYSPWD;
        this.o = false;
        this.p = "";
        this.c = context;
        this.d = fBPluginCtx;
        this.e = i;
        VerifyLogCat.i(b, "pwd plugin create");
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        this.k = ((LayoutInflater) this.c.getSystemService("layout_inflater")).inflate(R.layout.layout_plugin_vi_password_new, (ViewGroup) null);
        initPwdInput();
        this.pageChangeBroadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                VerifyLogCat.i(PasswordUnifiedPluginNew.access$000(), "收到广播：com.alipay.phonecashier.framechange");
                PasswordUnifiedPluginNew.this.getInnerView().setEnabled(false);
            }
        };
        this.findPwdBroadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                VerifyLogCat.i(PasswordUnifiedPluginNew.access$000(), "收到广播：kMQPFindPwdNotification | 收银台场景用户点找回密码");
                if (PasswordUnifiedPluginNew.access$1600(PasswordUnifiedPluginNew.this) == null || PasswordUnifiedPluginNew.access$1700(PasswordUnifiedPluginNew.this).getTask() == null) {
                    return;
                }
                VerifyIdentityTask task = PasswordUnifiedPluginNew.access$1800(PasswordUnifiedPluginNew.this).getTask();
                Bundle extParams = task.getExtParams();
                if (extParams == null) {
                    task.setExtParams(new Bundle());
                    extParams = task.getExtParams();
                }
                extParams.putString("subCode", "105");
            }
        };
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.c);
        localBroadcastManager.registerReceiver(this.pageChangeBroadcastReceiver, new IntentFilter(MspGlobalDefine.FRAME_CHANGE_ACTION));
        localBroadcastManager.registerReceiver(this.findPwdBroadcastReceiver, new IntentFilter("kMQPFindPwdNotification"));
        try {
            Intent intent = new Intent("com.alipay.mobile.verifyidentity.startPwd");
            intent.putExtra(Constants.VI_ENGINE_VERIFY_TYPE, "password");
            LocalBroadcastManager.getInstance(this.c).sendBroadcast(intent);
        } catch (Throwable th) {
            String str = b;
            VerifyLogCat.i(str, "sendPopBroadCast error:" + th.getMessage());
        }
        return this.k;
    }

    public View getInnerView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("3a4c32ae", new Object[]{this}) : this.k;
    }

    public void initPwdInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c01349c4", new Object[]{this});
            return;
        }
        String str = b;
        VerifyLogCat.i(str, "[initPwdInput] isSimplePwd: " + this.isSimplePwd + ", mType: " + this.n);
        this.mPwdInputLayout = (LinearLayout) this.k.findViewById(R.id.paypwd_layout);
        this.mSafeInputContext = new SafeInputContext((Activity) this.c, this.isSimplePwd);
        this.mShowInputTime = System.currentTimeMillis();
        SafeInputContext safeInputContext = this.mSafeInputContext;
        if (safeInputContext == null) {
            return;
        }
        safeInputContext.setOnConfirmListener(new OnConfirmListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener
            public void onUserConfirm(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d51cf727", new Object[]{this, str2});
                    return;
                }
                VerifyLogCat.i(PasswordUnifiedPluginNew.access$000(), "safeInputContext onUserConfirm");
                PasswordUnifiedPluginNew.this.hideKeyboard();
                HashMap hashMap = new HashMap();
                hashMap.put("inputCost", String.valueOf(System.currentTimeMillis() - PasswordUnifiedPluginNew.this.mShowInputTime));
                StringBuilder sb = new StringBuilder();
                sb.append(PasswordUnifiedPluginNew.this.mInputChangeCount);
                hashMap.put("inputChangeCount", sb.toString());
                hashMap.put("type", "user_confirm");
                PasswordUnifiedPluginNew.access$100(PasswordUnifiedPluginNew.this, "UC-MobileIC-20210326-4", hashMap);
                PasswordUnifiedPluginNew.this.mShowInputTime = System.currentTimeMillis();
                PasswordUnifiedPluginNew passwordUnifiedPluginNew = PasswordUnifiedPluginNew.this;
                passwordUnifiedPluginNew.mInputChangeCount = 0L;
                passwordUnifiedPluginNew.updateVerifyStatus("end");
                PasswordUnifiedPluginNew.access$200(PasswordUnifiedPluginNew.this, str2);
            }
        });
        this.mSafeInputContext.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                    return;
                }
                String access$000 = PasswordUnifiedPluginNew.access$000();
                VerifyLogCat.i(access$000, "safeInputContext onFocusChange: " + z);
                PasswordUnifiedPluginNew.this.onFocusChange(view, z);
            }
        });
        this.mSafeInputContext.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                VerifyLogCat.i(PasswordUnifiedPluginNew.access$000(), "safeInputContext onClick");
                PasswordUnifiedPluginNew.this.onClick(view);
            }
        });
        this.mSafeInputContext.setRsaPublicKey(this.mPubKey);
        this.mSafeInputContext.setEncryptRandomStringAndType(this.mTimestamp, EncryptRandomType.randomafter);
        this.mSafeInputContext.setTextWatcherListener(new TextWatcherListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.safepaybase.TextWatcherListener
            public void onTextChanged() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c9b011ef", new Object[]{this});
                    return;
                }
                PasswordUnifiedPluginNew.this.mInputChangeCount++;
                VerifyLogCat.i(PasswordUnifiedPluginNew.access$000(), "onTextChanged:" + PasswordUnifiedPluginNew.this.mInputChangeCount);
            }
        });
        setSafeKeyboardSoftInput(this.mSafeInputContext.getEditText());
        this.mPwdInputLayout.removeAllViews();
        this.mPwdInputLayout.addView(this.mSafeInputContext.getContentView());
        this.mSafeInputContext.getContentView().setVisibility(0);
        this.mPwdInputLayout.setVisibility(0);
        this.m = this.mSafeInputContext.getEditText();
        this.m.addTextChangedListener(new TextWatcher() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                } else if (!PasswordUnifiedPluginNew.access$300(PasswordUnifiedPluginNew.this)) {
                } else {
                    PasswordUnifiedPluginNew.access$400(PasswordUnifiedPluginNew.this, "onPwdChanged", String.valueOf(editable.length()));
                }
            }
        });
        String actConf = getActConf(BaseFBPlugin.ACT_CONF.pwdInputBtn);
        String actConf2 = getActConf(BaseFBPlugin.ACT_CONF.pwdPlaceHolder);
        if (!StringUtils.isEmpty(actConf)) {
            this.mSafeInputContext.setOkButtonText(actConf);
        }
        if (StringUtils.isEmpty(actConf2)) {
            return;
        }
        this.m.setHint(actConf2);
    }

    public void sendMspRpc(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f49c508", new Object[]{this, str, str2, str3});
            return;
        }
        writeBehavorWithPlus("UC-MobileIC-20190606-4", "START_VERIFY_PWD_RPC", "wallet_cn", "pluginNew");
        this.g.doRpc(str, str2, str3, this.isSimplePwd, this.predata, this.isIntellDecison, new PwdCommonHandler.NotifyMspResultHandler() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.NotifyMspResultHandler
            public void notifyResult(MICRpcResponse mICRpcResponse, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("52319fdb", new Object[]{this, mICRpcResponse, str4});
                    return;
                }
                PasswordUnifiedPluginNew.this.predata = null;
                if (mICRpcResponse == null) {
                    VerifyLogCat.d(PasswordUnifiedPluginNew.access$000(), "input pwd null result");
                    PasswordUnifiedPluginNew.this.onNetError();
                } else if (mICRpcResponse.verifySuccess) {
                    PasswordUnifiedPluginNew.access$500(PasswordUnifiedPluginNew.this, mICRpcResponse);
                    PasswordUnifiedPluginNew.access$600(PasswordUnifiedPluginNew.this).doNextStep(mICRpcResponse, str4);
                    PasswordUnifiedPluginNew.this.writeBehavorWithPlus("UC-MobileIC-20191030-2", "SUCCESS", "wallet_cn", "pluginNew");
                } else {
                    PasswordUnifiedPluginNew.this.updateVerifyStatusNew(BaseFBPlugin.VERIFY_STATUS.awaitUser);
                    PasswordUnifiedPluginNew.this.clearInputContent();
                    PasswordUnifiedPluginNew.access$800(PasswordUnifiedPluginNew.this, PubKeyHelper.updateLocalPubKey(PasswordUnifiedPluginNew.access$700(PasswordUnifiedPluginNew.this), mICRpcResponse));
                    if ("RETRY".equalsIgnoreCase(mICRpcResponse.verifyCode)) {
                        VerifyLogCat.d(PasswordUnifiedPluginNew.access$000(), "input pwd retry");
                        PasswordUnifiedPluginNew.access$900(PasswordUnifiedPluginNew.this, mICRpcResponse);
                    } else {
                        PasswordUnifiedPluginNew.this.writePwdBehavorLog("UC-MobileIC-20210326-3", "LOCK", "pay", "pluginNew");
                        PasswordUnifiedPluginNew.access$600(PasswordUnifiedPluginNew.this).processError(mICRpcResponse, true);
                    }
                    PasswordUnifiedPluginNew.this.writeBehavorWithPlus("UC-MobileIC-20191030-3", "FAIL", "wallet_cn", "pluginNew");
                }
            }
        });
    }

    public void writeBehavorWithPlus(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d003c84d", new Object[]{this, str, str2, str3, str4});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("module", this.mModule.getLogicModuleName());
            hashMap.put("code", str2);
            hashMap.put("source", str3);
            hashMap.put("ui_type", str4);
            if (!StringUtils.isEmpty(this.i)) {
                hashMap.put("plusPwdType", "pwd");
            } else {
                hashMap.put("plusPwdType", "plus_pwd");
            }
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, Constants.VI_ENGINE_APPID, "aavca", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
        } catch (Throwable th) {
            String str5 = b;
            VerifyLogCat.i(str5, "writeBehavorWithPlus error:" + th.getMessage());
        }
    }

    public void writePwdBehavorLog(String str, String str2, String str3, String str4, String str5, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d952af6", new Object[]{this, str, str2, str3, str4, str5, new Boolean(z)});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("code", str2);
            hashMap.put("source", str3);
            if (!StringUtils.isEmpty(str4)) {
                hashMap.put("from", str4);
            }
            if (!StringUtils.isEmpty(str5)) {
                hashMap.put("sourceToPwd", str5);
            }
            if (z) {
                hashMap.put("isNewMUI", "true");
            }
            if (this.f != null && !StringUtils.isEmpty(this.f.decisionToPwd)) {
                hashMap.put("plusPwdType", "pwd");
            } else {
                hashMap.put("plusPwdType", "plus_pwd");
            }
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, Constants.VI_ENGINE_APPID, "aksbhas", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
        } catch (Throwable th) {
            VerifyLogCat.e(b, th);
        }
    }

    public void writePwdBehavorLog(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a085ed4", new Object[]{this, str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("module", this.mModule.getLogicModuleName());
        hashMap.put("code", str2);
        hashMap.put("source", str3);
        hashMap.put("ui_type", str4);
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, Constants.VI_ENGINE_APPID, "aavca", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
    }

    public void clearInputContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0002c3", new Object[]{this});
            return;
        }
        SafeInputContext safeInputContext = this.mSafeInputContext;
        if (safeInputContext == null) {
            return;
        }
        safeInputContext.clearText();
    }

    public void onNetError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be1d94f1", new Object[]{this});
            return;
        }
        if (this.isSimplePwd) {
            clearInputContent();
        }
        a();
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin, com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateAttr(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a285a79", new Object[]{this, str, str2})).booleanValue();
        }
        if (a(str, str2)) {
            return true;
        }
        if (VIFBPluginManager.mBackPlugin == null) {
            return super.updateAttr(str, str2);
        }
        VIFBPluginManager.mBackPlugin.updateAttr(str, str2);
        return true;
    }

    private boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (StringUtils.equals(str, "src")) {
            JSONObject jSONObject = null;
            try {
                jSONObject = JSON.parseObject(str2);
            } catch (Throwable th) {
                VerifyLogCat.e(b, "onPwdBNAction exp: ", th);
            }
            if (jSONObject != null && "pageEvent".equalsIgnoreCase(jSONObject.getString("action"))) {
                VerifyLogCat.i(b, "receive pageEvent");
                if (!StringUtils.isEmpty(this.top_to_product)) {
                    updateVerifyStatusNew("end");
                    this.g.changeToBack();
                    clear();
                    IDecisionHelper iDecisionHelper = new IDecisionHelper();
                    iDecisionHelper.recordBehavior("BACK_TO_BIO_PAY", "", this.mModule.getVerifyId(), "");
                    iDecisionHelper.saveFeature(0L, "PWD_TO_BIO", "", "USER_ACTION", this.mModule.getVerifyId(), "", "", "");
                }
                return true;
            }
        }
        return false;
    }

    public static void setSafeKeyboardSoftInput(EditText editText) {
        if (Build.VERSION.SDK_INT > 10) {
            try {
                Method method = EditText.class.getMethod("setShowSoftInputOnFocus", Boolean.TYPE);
                method.setAccessible(true);
                method.invoke(editText, false);
            } catch (Exception e) {
                VerifyLogCat.printStackTraceAndMore(e);
            }
            try {
                Method method2 = EditText.class.getMethod("setSoftInputShownOnFocus", Boolean.TYPE);
                method2.setAccessible(true);
                method2.invoke(editText, false);
            } catch (Exception unused) {
                VerifyLogCat.w(b, "failed to invode setSoftInputShownOnFocus");
            }
        }
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean onLoadFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b23670e3", new Object[]{this})).booleanValue();
        }
        if (StringUtils.isEmpty(this.n)) {
            this.m.setSingleLine();
            this.m.setHorizontallyScrolling(true);
            setSafeKeyboardSoftInput(this.m);
            this.m.setOnFocusChangeListener(this);
            this.m.setOnClickListener(this);
        }
        if (this.o) {
            this.d.setAutoFocus(this);
            View view = (View) this.m.getParent();
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
        }
        Editable editableText = this.m.getEditableText();
        if (editableText != null) {
            String obj = editableText.toString();
            if (!StringUtils.isEmpty(obj)) {
                this.m.setSelection(obj.length());
            }
        }
        return false;
    }

    public boolean isDefaultKeyboard() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("87984449", new Object[]{this})).booleanValue() : this.d.getTemplateKeyboardService() == null || this.d.getDefaultKeyboardService().equals(this.d.getTemplateKeyboardService());
    }

    public void hideKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c20b50", new Object[]{this});
            return;
        }
        VerifyLogCat.d(b, "hideKeyboard()");
        AlipayKeyboard alipayKeyboard = this.mAlipayKeyboard;
        if (alipayKeyboard == null) {
            return;
        }
        alipayKeyboard.hideKeyboard();
    }

    private void a() {
        View findViewById;
        int resourceId;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        String str = b;
        VerifyLogCat.d(str, "showKeyboard isSimplePwd: " + this.isSimplePwd);
        try {
            if (this.mAlipayKeyboard == null) {
                DecorViewInfo b2 = b();
                View view = b2.decorView;
                if (!b2.isDialog && !this.d.isFullscreen()) {
                    z = true;
                }
                if (this.d.isFullscreen()) {
                    findViewById = getKeyboardParentView();
                } else {
                    findViewById = view.findViewById(16908290);
                }
                if (!z && findViewById == null) {
                    if (this.j) {
                        resourceId = R.id.keyboard_layout;
                    } else {
                        resourceId = ResUtils.getResourceId(this.c, "flybird_main_layout", "id", "com.alipay.android.app");
                    }
                    setKeyboardParentView(view.findViewById(resourceId));
                    findViewById = getKeyboardParentView();
                }
                initKeyBoard(findViewById);
            }
            if (this.isSimplePwd) {
                this.mSafeInputContext.getEditText().requestFocus();
                this.mAlipayKeyboard.showKeyboard(AliKeyboardType.num, this.mSafeInputContext.getEditText(), 0L);
                return;
            }
            this.mSafeInputContext.getEditText().requestFocus();
            this.mAlipayKeyboard.showKeyboard(AliKeyboardType.abc, this.mSafeInputContext.getEditText(), 0L);
        } catch (Throwable th) {
            VerifyLogCat.e(b, th);
        }
    }

    public void initKeyBoard(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae6de14", new Object[]{this, view});
            return;
        }
        this.mAlipayKeyboard = new AlipayKeyboard(this.c);
        this.mAlipayKeyboard.initializeKeyboard(null);
        this.mAlipayKeyboard.setSource(AlipayKeyboard.SourceType.vi);
        if (view instanceof LinearLayout) {
            view.setVisibility(0);
            this.mAlipayKeyboard.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            ((LinearLayout) view).addView(this.mAlipayKeyboard);
        } else if (view instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            this.mAlipayKeyboard.setLayoutParams(layoutParams);
            ((FrameLayout) view).addView(this.mAlipayKeyboard);
        }
        this.mAlipayKeyboard.setKeyboardActionListener(new AlipayKeyboardActionListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.app.safepaybase.alikeyboard.AlipayKeyboardActionListener
            public void onDel() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("abf60c33", new Object[]{this});
                }
            }

            @Override // com.alipay.android.app.safepaybase.alikeyboard.AlipayKeyboardActionListener
            public void onInput(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fe21657c", new Object[]{this, str});
                }
            }

            @Override // com.alipay.android.app.safepaybase.alikeyboard.AlipayKeyboardActionListener
            public void onOk() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("52581b22", new Object[]{this});
                }
            }
        });
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public String getPluginName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fd12a725", new Object[]{this}) : getClass().getSimpleName();
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void addPlugin(String str, String str2, ModuleDataModel moduleDataModel, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84995292", new Object[]{this, str, str2, moduleDataModel, bundle});
            return;
        }
        this.j = false;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("needFindExist", true);
        super.addPlugin(str, str2, moduleDataModel, bundle);
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void bindModule(MicroModule microModule, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c61b9cc", new Object[]{this, microModule, str});
            return;
        }
        this.mModule = microModule;
        this.moduleData = str;
        try {
            this.f = (InitDataModel) JSON.parseObject(str, InitDataModel.class);
        } catch (JSONException e) {
            String str2 = b;
            VerifyLogCat.e(str2, "json fail " + str, e);
        }
        if (this.f == null) {
            String str3 = b;
            VerifyLogCat.d(str3, "module data can't be converted to jsonobject: " + str);
            MicroModuleContext.getInstance().alert("", this.c.getResources().getString(R.string.verifyidentity_wrong_data), this.c.getResources().getString(R.string.verifyidentity_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        PasswordUnifiedPluginNew.this.updateVerifyStatus(BaseFBPlugin.VERIFY_STATUS.abort);
                    }
                }
            }, null, null);
            return;
        }
        VerifyLogCat.i(b, "create plugin");
        this.isSimplePwd = this.f.isSimplePPW;
        this.mPubKey = PubKeyHelper.generatePubKey(this.c, this.f.pubKey);
        this.mTimestamp = this.f.timestamp;
        this.g = new PwdCommonHandler(this.c, this.mModule, this, new PwdCommonHandler.NotifyResultHandler() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.NotifyResultHandler
            public void notifyResult(ModuleExecuteResult moduleExecuteResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("75cfa791", new Object[]{this, moduleExecuteResult});
                } else {
                    PasswordUnifiedPluginNew.this.notifyResult(moduleExecuteResult);
                }
            }
        });
        if (StringUtils.isEmpty(this.mTimestamp)) {
            this.mTimestamp = "";
        }
        this.predata = this.f.predata;
        this.pwdTopTip = this.f.pwdTopTip;
        this.isShowGetBackPwd = this.f.isFindPPW;
        this.i = this.f.decisionToPwd;
        this.goOtherVerifyProduct = this.f.forgot2Verify;
        this.otherText = this.f.forgot2VerifyText;
        String actConf = getActConf(BaseFBPlugin.ACT_CONF.pwdTip);
        if (StringUtils.isEmpty(actConf)) {
            actConf = getActConf(BaseFBPlugin.ACT_CONF.costTip);
            if (StringUtils.isEmpty(actConf)) {
                actConf = "";
            }
        }
        this.h = actConf;
        this.top_to_product = this.f.decisionToPwd_action;
        this.backToBioViType = this.f.decisionToPwd_backType;
        this.hind_other = getActConf(BaseFBPlugin.ACT_CONF.kVIDisableForgetPwdKey);
        this.showFindPwd = this.f.showFindPwd;
        this.findPwdTxt = this.f.findPwdTxt;
        this.hasOthers = VIUtils.hasOtherVerifyProduct(str);
        String str4 = b;
        VerifyLogCat.i(str4, "initSixPwd: " + this.isSimplePwd);
        String str5 = "pwd";
        if (this.isSimplePwd) {
            this.viType = "spwd";
            this.n = UiUtil.INPUT_TYPE_VALUE_PAYSPWD;
        } else {
            this.viType = str5;
            this.n = UiUtil.INPUT_TYPE_VALUE_PAYPWD;
        }
        initPwdInput();
        String str6 = this.f.keyHeadline;
        this.content_title = (TextView) this.k.findViewById(R.id.pwd_title);
        if (StringUtils.isEmpty(str6)) {
            str6 = this.c.getResources().getString(R.string.pwd_input_alert_please);
        }
        this.content_title.setText(str6);
        this.content_desc = (TextView) this.k.findViewById(R.id.pwd_desc);
        if (!StringUtils.isEmpty(this.pwdTopTip)) {
            this.content_desc.setTextColor(-65536);
            this.content_desc.setText(this.pwdTopTip);
            this.content_desc.setVisibility(0);
            this.content_title.setVisibility(8);
        } else if (!StringUtils.isEmpty(this.i) && !"Y".equalsIgnoreCase(this.f.hideDecisionTip) && !this.f.decisionToPwdFromUsePwd) {
            this.content_desc.setText(this.i);
            this.content_desc.setVisibility(0);
            this.content_desc.setTextColor(Color.parseColor("#999999"));
            this.content_title.setVisibility(8);
        } else {
            this.content_desc.setVisibility(8);
            this.content_title.setVisibility(0);
        }
        this.goBackPwd = (TextView) this.k.findViewById(R.id.getbackpwd);
        if ("Y".equalsIgnoreCase(getOtherPayConfig())) {
            if ("Y".equalsIgnoreCase(this.hind_other)) {
                this.goBackPwd.setVisibility(4);
            } else {
                this.goBackPwd.setVisibility(0);
                this.goBackPwd.setText(getOtherPayContent());
                this.goBackPwd.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.10
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        PasswordUnifiedPluginNew.this.hideKeyboard();
                        PasswordUnifiedPluginNew.this.sendMspRpc(null, "Y", "forgotPwd");
                        if (PasswordUnifiedPluginNew.access$1200(PasswordUnifiedPluginNew.this) == null) {
                            return;
                        }
                        PasswordUnifiedPluginNew.access$1300(PasswordUnifiedPluginNew.this).isFindAndPay = true;
                        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-190311-1", Constants.VI_ENGINE_APPID, "aprj", PasswordUnifiedPluginNew.access$1400(PasswordUnifiedPluginNew.this).getToken(), PasswordUnifiedPluginNew.access$1500(PasswordUnifiedPluginNew.this).getVerifyId(), null, null);
                    }
                });
            }
        } else if ("Y".equalsIgnoreCase(this.hind_other)) {
            this.goBackPwd.setVisibility(4);
        } else {
            if (StringUtils.isEmpty(this.showFindPwd) || "Y".equalsIgnoreCase(this.showFindPwd)) {
                this.goBackPwd.setVisibility(0);
                if (!StringUtils.isEmpty(this.findPwdTxt)) {
                    this.goBackPwd.setText(this.findPwdTxt);
                } else {
                    this.goBackPwd.setText(R.string.pwd_forget_in_layout);
                }
            } else {
                this.goBackPwd.setVisibility(4);
            }
            this.goBackPwd.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    PasswordUnifiedPluginNew.access$600(PasswordUnifiedPluginNew.this).goGetMspPPW(PasswordUnifiedPluginNew.this.getActConf(BaseFBPlugin.ACT_CONF.login_id));
                    LocalBroadcastManager.getInstance(MicroModuleContext.getInstance().getContext()).sendBroadcast(new Intent("kMQPFindPwdNotification"));
                    PasswordUnifiedPluginNew.this.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, "forgetPwd");
                    PasswordUnifiedPluginNew.access$600(PasswordUnifiedPluginNew.this).notifyCancel();
                }
            });
        }
        if (this.hasOthers) {
            if (!StringUtils.isEmpty(this.top_to_product)) {
                a("");
            } else {
                String str7 = this.f.switchOther;
                if (StringUtils.isEmpty(str7)) {
                    String str8 = this.f.other;
                    if (StringUtils.isEmpty(str8)) {
                        str8 = this.c.getResources().getString(R.string.pwd_other_way);
                    }
                    a(str8);
                } else {
                    a(str7);
                }
            }
            VerifyLogCat.i(b, "显示选择其它方式入口");
        } else {
            a("");
        }
        try {
            if ((this.c instanceof Activity) && ((Activity) this.c).getWindow() != null) {
                ((Activity) this.c).getWindow().addFlags(8192);
            }
        } catch (Throwable th) {
            VerifyLogCat.e(b, th);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", "start");
        String str9 = this.f.pwdTopTip;
        String actConf2 = getActConf(BaseFBPlugin.ACT_CONF.pwdInputTip);
        String actConf3 = getActConf(BaseFBPlugin.ACT_CONF.costTip);
        if (StringUtils.isEmpty(str9)) {
            if (!StringUtils.isEmpty(actConf2)) {
                str9 = actConf2;
            } else {
                str9 = !StringUtils.isEmpty(actConf3) ? actConf3 : "";
            }
        }
        jSONObject.put("tip", (Object) str9);
        updateVerifyStatus(jSONObject);
        sendModelChangeEvent("", "PWD", this.isSimplePwd ? BaseFBPlugin.VERIFY_TYPE.sp : BaseFBPlugin.VERIFY_TYPE.pp);
        this.g.sourceToPwd = this.f.sourceToPwd;
        String str10 = b;
        VerifyLogCat.i(str10, "mView.getVisibility(): " + this.k.getVisibility());
        this.mainHandler.postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    PasswordUnifiedPluginNew.access$1000(PasswordUnifiedPluginNew.this).requestFocus();
                    PasswordUnifiedPluginNew.access$1100(PasswordUnifiedPluginNew.this);
                } catch (Throwable th2) {
                    VerifyLogCat.w(PasswordUnifiedPluginNew.access$000(), th2);
                }
            }
        }, 500L);
        InitDataModel initDataModel = this.f;
        if (initDataModel != null && ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS.equalsIgnoreCase(initDataModel.sourceToPwd)) {
            str5 = "pwd_plus";
        }
        writePwdBehavorLog("UC-MobileIC-20191030-1", "START_PWD_VIEW", "wallet_cn", "pay", str5, true);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        String str2 = b;
        VerifyLogCat.i(str2, "initOtherProduct product: " + str);
        if (!StringUtils.isEmpty(str)) {
            this.isIntellDecison = false;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("actionText", (Object) str);
            jSONObject.put("callBackType", "1");
            jSONObject.put("hideIfClick", (Object) true);
            doCommonAction(BaseFBPlugin.PLUGIN_ACTION.viShowNavRightView, jSONObject);
        } else if (StringUtils.isEmpty(this.top_to_product)) {
        } else {
            this.isIntellDecison = true;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("actionText", (Object) this.top_to_product);
            jSONObject2.put("viType", (Object) this.backToBioViType);
            jSONObject2.put("callBackType", "1");
            jSONObject2.put("hideIfClick", (Object) true);
            doCommonAction(BaseFBPlugin.PLUGIN_ACTION.viShowNavRightView, jSONObject2);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        clearInputContent();
        hideKeyboard();
        try {
            if ((this.c instanceof Activity) && ((Activity) this.c).getWindow() != null) {
                ((Activity) this.c).getWindow().clearFlags(8192);
            }
        } catch (Throwable th) {
            VerifyLogCat.e(b, th);
        }
        View view = this.k;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void handleEngineCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b64b42b", new Object[]{this});
            return;
        }
        VerifyLogCat.i(b, "pwd plugin cancel");
        if (openDuplicatePayTaskFix()) {
            updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, BaseFBPlugin.ABORT_SCENE_CANCEL_BY_ENGINE);
        } else {
            updateVerifyStatusNew(BaseFBPlugin.VERIFY_STATUS.abort);
        }
    }

    private DecorViewInfo b() {
        View decorView;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (DecorViewInfo) ipChange.ipc$dispatch("c7c6ae80", new Object[]{this});
        }
        DecorViewInfo decorViewInfo = new DecorViewInfo();
        if (this.d.getShowingDialog() != null && this.d.getShowingDialog().isShowing()) {
            z = true;
        }
        if (!z) {
            decorView = ((Activity) this.c).getWindow().getDecorView();
        } else {
            decorView = this.d.getShowingDialog().getWindow().getDecorView();
        }
        decorViewInfo.decorView = decorView;
        decorViewInfo.isDialog = z;
        return decorViewInfo;
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        try {
            a();
        } catch (Exception e) {
            VerifyLogCat.printStackTraceAndMore(e);
        }
    }

    public float getBodyViewOpacity() {
        Object bodyView = this.d.getBodyView();
        if (bodyView == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(bodyView.getClass().getMethod("getOpacity", new Class[0]).invoke(bodyView, new Object[0]).toString());
        } catch (Throwable th) {
            VerifyLogCat.w(b, th);
            return 1.0f;
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin, android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
        } else if (this.d == null || this.c == null || getBodyViewOpacity() <= 0.1d || !this.d.isOnloadFinish()) {
        } else {
            if (z && view.isEnabled()) {
                if (StringUtils.equals(this.n, UiUtil.INPUT_TYPE_VALUE_PAYSPWD)) {
                    EditText editText = this.m;
                    editText.setSelection(editText.getEditableText().length());
                }
                if (this.d != null && !UiUtil.isUseDefaultKeyboard(this.n, this.p) && !isDefaultKeyboard()) {
                    this.d.getTemplateKeyboardService().hideKeyboard(b().decorView);
                }
                a();
            }
            if (z) {
                this.d.deliverOnFocus(getNode());
            } else {
                this.d.deliverOnBlur(getNode());
            }
        }
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateFunc(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9446144c", new Object[]{this, str, str2})).booleanValue();
        }
        if (str.equals(Constants.Event.FOCUS)) {
            this.o = true;
            this.d.setAutoFocus(this);
            if (this.d.isOnloadFinish()) {
                this.m.requestFocus();
                a();
            }
            return true;
        } else if (!str.equals(Constants.Event.BLUR)) {
            return false;
        } else {
            this.o = false;
            hiddenKeyboardService(b().decorView, true);
            return true;
        }
    }

    public View getKeyboardParentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("3e8befb5", new Object[]{this}) : this.l;
    }

    public void setKeyboardParentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38714033", new Object[]{this, view});
        } else {
            this.l = view;
        }
    }

    public boolean hiddenKeyboardService(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f78fdd11", new Object[]{this, view, new Boolean(z)})).booleanValue();
        }
        boolean hideKeyboard = (isDefaultKeyboard() || this.d.getDefaultKeyboardService() == null) ? false : this.d.getTemplateKeyboardService().hideKeyboard(view);
        return (!z || this.d.getDefaultKeyboardService() == null) ? hideKeyboard : hideKeyboard || this.d.getDefaultKeyboardService().hideKeyboard(view);
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin, com.alipay.android.app.template.FBFocusable
    public void requestFocus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10da4b90", new Object[]{this});
            return;
        }
        View view = this.k;
        if (view == null) {
            return;
        }
        view.requestFocus();
        try {
            a();
        } catch (Throwable th) {
            VerifyLogCat.printStackTraceAndMore(th);
        }
    }

    public void notifyResult(ModuleExecuteResult moduleExecuteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75cfa791", new Object[]{this, moduleExecuteResult});
            return;
        }
        ModuleExecuteResult addLogicModuleName = this.g.addLogicModuleName(moduleExecuteResult);
        onVerifyFinished(addLogicModuleName);
        this.mModule.getMicroModuleContext().notifyAndFinishModule(this.mModule.getVerifyId(), this.mModule.getToken(), this.mModule.getModuleName(), addLogicModuleName);
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void onBNPageClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9567005", new Object[]{this});
            return;
        }
        super.onBNPageClose();
        if (this.pageChangeBroadcastReceiver != null) {
            LocalBroadcastManager.getInstance(this.c).unregisterReceiver(this.pageChangeBroadcastReceiver);
        }
        if (this.findPwdBroadcastReceiver != null) {
            LocalBroadcastManager.getInstance(this.c).unregisterReceiver(this.findPwdBroadcastReceiver);
        }
        PwdCommonHandler pwdCommonHandler = this.g;
        if (pwdCommonHandler != null) {
            pwdCommonHandler.notifyCancel("106");
        }
        clear();
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void onHandleOtherPayWay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae78977", new Object[]{this});
            return;
        }
        hideKeyboard();
        sendMspRpc(null, "Y", "forgotPwd");
        if (this.mModule != null) {
            this.mModule.isFindAndPay = true;
        }
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-190311-1", com.alipay.mobile.verifyidentity.common.Constants.VI_ENGINE_APPID, "aprj", this.mModule.getToken(), this.mModule.getVerifyId(), null, null);
    }

    public Animation shakeAnimation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("888049d8", new Object[]{this, new Integer(i)});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 10.0f, 0.0f, 0.0f);
        translateAnimation.setInterpolator(new CycleInterpolator(i));
        translateAnimation.setDuration(500L);
        return translateAnimation;
    }

    public boolean showFindPwdByResponse(MICRpcResponse mICRpcResponse, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cba25bdf", new Object[]{this, mICRpcResponse, hashMap})).booleanValue();
        }
        if (mICRpcResponse == null || StringUtils.isEmpty(mICRpcResponse.data)) {
            return false;
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = JSON.parseObject(mICRpcResponse.data);
        } catch (JSONException e) {
            String str = b;
            VerifyLogCat.e(str, "json fail " + mICRpcResponse.data, e);
        }
        if (jSONObject == null) {
            return false;
        }
        String string = jSONObject.getString(PayPwdModule.SHOW_FIND_PWD);
        if (hashMap != null) {
            hashMap.put(PayPwdModule.FIND_PWD_TXT, jSONObject.getString(PayPwdModule.FIND_PWD_TXT));
        }
        String str2 = b;
        VerifyLogCat.i(str2, "showFindPwd: " + string);
        return StringUtils.isEmpty(string) || "Y".equalsIgnoreCase(string);
    }

    public String getOtherPayContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a421102e", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.otherText)) {
            return this.k.getResources().getString(R.string.other_way_to_pwd);
        }
        return this.otherText;
    }

    public String getOtherPayConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28030f29", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.goOtherVerifyProduct)) {
            this.goOtherVerifyProduct = "N";
        }
        return this.goOtherVerifyProduct;
    }

    public String getOtherVerifyPayText(MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97df53ab", new Object[]{this, mICRpcResponse});
        }
        if (mICRpcResponse == null || StringUtils.isEmpty(mICRpcResponse.data)) {
            return getOtherPayContent();
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = JSON.parseObject(mICRpcResponse.data);
        } catch (JSONException e) {
            String str = b;
            VerifyLogCat.e(str, "json fail " + mICRpcResponse.data, e);
        }
        if (jSONObject == null) {
            return getOtherPayContent();
        }
        this.otherProductForDialog = jSONObject.getString("otherVerifyPayText");
        if (!StringUtils.isEmpty(this.otherProductForDialog)) {
            return this.otherProductForDialog;
        }
        return getOtherPayContent();
    }

    public static /* synthetic */ void access$100(PasswordUnifiedPluginNew passwordUnifiedPluginNew, String str, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("804b37aa", new Object[]{passwordUnifiedPluginNew, str, hashMap});
            return;
        }
        try {
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, com.alipay.mobile.verifyidentity.common.Constants.VI_ENGINE_APPID, "hswjmm", passwordUnifiedPluginNew.mModule.getToken(), passwordUnifiedPluginNew.mModule.getVerifyId(), null, hashMap);
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void access$200(PasswordUnifiedPluginNew passwordUnifiedPluginNew, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71fb21ea", new Object[]{passwordUnifiedPluginNew, str});
            return;
        }
        passwordUnifiedPluginNew.writePwdBehavorLog("UC-MobileIC-20190606-4", "START_VERIFY_PWD_RPC", "wallet_cn", "pay", ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS.equalsIgnoreCase(passwordUnifiedPluginNew.f.sourceToPwd) ? "pwd_plus" : "pwd", true);
        passwordUnifiedPluginNew.sendMspRpc(str, null, "");
    }

    public static /* synthetic */ void access$500(PasswordUnifiedPluginNew passwordUnifiedPluginNew, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5306147b", new Object[]{passwordUnifiedPluginNew, mICRpcResponse});
        } else if (StringUtils.isEmpty(mICRpcResponse.data) || !mICRpcResponse.data.contains("bicAsyncData")) {
        } else {
            try {
                JSONObject parseObject = JSON.parseObject(mICRpcResponse.data);
                if (parseObject == null) {
                    return;
                }
                AuthenticatorManager.getInstance(passwordUnifiedPluginNew.c).processAfterAuth(parseObject.getString("bicAsyncData"));
            } catch (Throwable th) {
                String str = b;
                VerifyLogCat.i(str, "handle km error:" + th.getMessage());
            }
        }
    }

    public static /* synthetic */ void access$800(PasswordUnifiedPluginNew passwordUnifiedPluginNew, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b84480f0", new Object[]{passwordUnifiedPluginNew, str});
            return;
        }
        String str2 = b;
        VerifyLogCat.i(str2, "updatePubKey: " + str);
        if (StringUtils.isEmpty(str)) {
            VerifyLogCat.i(b, "服务端没有提供新的公钥，不更新");
            return;
        }
        passwordUnifiedPluginNew.mPubKey = PubKeyHelper.generatePubKey(passwordUnifiedPluginNew.c, str);
        SafeInputContext safeInputContext = passwordUnifiedPluginNew.mSafeInputContext;
        if (safeInputContext == null) {
            return;
        }
        safeInputContext.setRsaPublicKey(passwordUnifiedPluginNew.mPubKey);
    }

    public static /* synthetic */ void access$900(PasswordUnifiedPluginNew passwordUnifiedPluginNew, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12997af7", new Object[]{passwordUnifiedPluginNew, mICRpcResponse});
            return;
        }
        passwordUnifiedPluginNew.content_title.setVisibility(8);
        passwordUnifiedPluginNew.content_desc.setText(mICRpcResponse.verifyMessage);
        passwordUnifiedPluginNew.content_desc.setTextColor(-65536);
        passwordUnifiedPluginNew.content_desc.setVisibility(0);
        passwordUnifiedPluginNew.a();
        passwordUnifiedPluginNew.content_desc.setAnimation(passwordUnifiedPluginNew.shakeAnimation(6));
        if ("Y".equalsIgnoreCase(passwordUnifiedPluginNew.hind_other)) {
            passwordUnifiedPluginNew.goBackPwd.setVisibility(4);
        } else if (passwordUnifiedPluginNew.g.getOtherVerifyPayFlag(mICRpcResponse)) {
            passwordUnifiedPluginNew.goBackPwd.setVisibility(0);
            passwordUnifiedPluginNew.goBackPwd.setText(passwordUnifiedPluginNew.getOtherVerifyPayText(mICRpcResponse));
            passwordUnifiedPluginNew.goBackPwd.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    PasswordUnifiedPluginNew.this.hideKeyboard();
                    PasswordUnifiedPluginNew.this.sendMspRpc(null, "Y", "forgotPwd");
                    if (PasswordUnifiedPluginNew.access$1900(PasswordUnifiedPluginNew.this) == null) {
                        return;
                    }
                    PasswordUnifiedPluginNew.access$2000(PasswordUnifiedPluginNew.this).isFindAndPay = true;
                    VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-190311-1", com.alipay.mobile.verifyidentity.common.Constants.VI_ENGINE_APPID, "aprj", PasswordUnifiedPluginNew.access$2100(PasswordUnifiedPluginNew.this).getToken(), PasswordUnifiedPluginNew.access$2200(PasswordUnifiedPluginNew.this).getVerifyId(), null, null);
                }
            });
        } else {
            HashMap<String, String> hashMap = new HashMap<>();
            if (passwordUnifiedPluginNew.showFindPwdByResponse(mICRpcResponse, hashMap)) {
                String str = hashMap.get(PayPwdModule.FIND_PWD_TXT);
                passwordUnifiedPluginNew.goBackPwd.setVisibility(0);
                if (!StringUtils.isEmpty(str)) {
                    passwordUnifiedPluginNew.goBackPwd.setText(str);
                } else {
                    passwordUnifiedPluginNew.goBackPwd.setText(R.string.pwd_forget_in_layout);
                }
            } else {
                passwordUnifiedPluginNew.goBackPwd.setVisibility(4);
            }
            passwordUnifiedPluginNew.goBackPwd.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    PasswordUnifiedPluginNew.access$600(PasswordUnifiedPluginNew.this).goGetMspPPW(PasswordUnifiedPluginNew.this.getActConf(BaseFBPlugin.ACT_CONF.login_id));
                    LocalBroadcastManager.getInstance(MicroModuleContext.getInstance().getContext()).sendBroadcast(new Intent("kMQPFindPwdNotification"));
                    PasswordUnifiedPluginNew.this.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, "forgetPwd");
                    PasswordUnifiedPluginNew.access$600(PasswordUnifiedPluginNew.this).notifyCancel();
                }
            });
        }
    }
}
