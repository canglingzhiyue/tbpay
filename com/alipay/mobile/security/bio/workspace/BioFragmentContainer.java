package com.alipay.mobile.security.bio.workspace;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.security.bio.api.BioResponse;
import com.alipay.mobile.security.bio.config.Constant;
import com.alipay.mobile.security.bio.constants.CodeConstants;
import com.alipay.mobile.security.bio.runtime.FrameworkDesc;
import com.alipay.mobile.security.bio.runtime.Runtime;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioAppManager;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.local.rpc.BioRPCService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.riy;

/* loaded from: classes3.dex */
public class BioFragmentContainer extends FragmentActivity implements BioFragmentCallBack {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public BioServiceManager f5828a;
    public LocalBroadcastManager b;
    public FragmentManager c;
    public BioFragment d;
    public BioAppDescription e;
    private final BroadcastReceiver f = new BroadcastReceiver() { // from class: com.alipay.mobile.security.bio.workspace.BioFragmentContainer.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!Constant.BIOLOGY_FLAG_AUTOCLOSE.equals(intent.getAction())) {
            } else {
                BioLog.i("verifyCallBackEvent rev");
                BioFragmentContainer.this.a();
            }
        }
    };

    public static /* synthetic */ Object ipc$super(BioFragmentContainer bioFragmentContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        if (!Runtime.isRunningOnQuinox(context)) {
            return;
        }
        Runtime.replaceResources(context, getClass().getName(), FrameworkDesc.BUNDLE_NAME_BIOMETRIC);
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.bio_framework_main);
        this.f5828a = BioServiceManager.getCurrentInstance();
        if (this.f5828a == null) {
            BioLog.w(new RuntimeException("null == BioServiceManager.getCurrentInstance()"));
            sendResponse(206);
            finish();
            return;
        }
        this.b = LocalBroadcastManager.getInstance(getApplicationContext());
        IntentFilter intentFilter = new IntentFilter(Constant.BIOLOGY_FLAG_AUTOCLOSE);
        IntentFilter intentFilter2 = new IntentFilter(Constant.BIOLOGY_FLAG_SERVER_SUCCESS);
        IntentFilter intentFilter3 = new IntentFilter(Constant.BIOLOGY_FLAG_SERVER_FAIL);
        IntentFilter intentFilter4 = new IntentFilter(Constant.BIOLOGY_FLAG_SERVER_RETRY);
        this.b.registerReceiver(this.f, intentFilter);
        this.b.registerReceiver(this.f, intentFilter2);
        this.b.registerReceiver(this.f, intentFilter3);
        this.b.registerReceiver(this.f, intentFilter4);
        this.c = getSupportFragmentManager();
        if (this.c == null) {
            BioLog.w(new RuntimeException("null == mFragmentManager"));
            sendResponse(206);
            finish();
            return;
        }
        try {
            this.e = ((BioAppManager) this.f5828a.getBioService(BioAppManager.class)).getBioAppDescription(getIntent().getStringExtra(Constant.BIOLOGY_INTENT_ACTION_INFO));
            StringBuilder sb = new StringBuilder();
            sb.append("BioFragmentContainer get mBioAppDescription ");
            sb.append(this.e == null ? "null" : this.e.toString());
            BioLog.d(sb.toString());
            String remoteURL = this.e.getRemoteURL();
            if (StringUtils.isEmpty(remoteURL)) {
                return;
            }
            ((BioRPCService) this.f5828a.getBioService(BioRPCService.class)).setRemoteUrl(remoteURL);
        } catch (Exception e) {
            BioLog.e(e);
        }
    }

    @Override // com.alipay.mobile.security.bio.workspace.BioFragmentCallBack
    public void backward(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c1f1aa", new Object[]{this, bundle});
        } else if (this.c.getBackStackEntryCount() <= 1) {
        } else {
            this.c.popBackStack();
            this.d = (BioFragment) this.c.getFragments().get(this.c.getBackStackEntryCount() - 1);
        }
    }

    @Override // com.alipay.mobile.security.bio.workspace.BioFragmentCallBack
    public void forward(Bundle bundle, BioFragment bioFragment) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e29259", new Object[]{this, bundle, bioFragment});
            return;
        }
        FragmentManager fragmentManager = this.c;
        if (fragmentManager == null) {
            BioLog.w(new RuntimeException("null == mFragmentManager in forward()"));
            sendResponse(206);
            finish();
            return;
        }
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.replace(R.id.bio_framework_container, bioFragment);
        this.d = bioFragment;
        if (bundle != null) {
            z = bundle.getBoolean("BACK_STACK", true);
        }
        if (z) {
            beginTransaction.addToBackStack(null);
        }
        if (isFinishing()) {
            return;
        }
        try {
            beginTransaction.commitAllowingStateLoss();
        } catch (Exception unused) {
        }
    }

    @Override // com.alipay.mobile.security.bio.workspace.BioFragmentCallBack
    public void finish(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fad6afa", new Object[]{this, bundle});
        } else {
            finish();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        LocalBroadcastManager localBroadcastManager = this.b;
        if (localBroadcastManager != null) {
            localBroadcastManager.unregisterReceiver(this.f);
        }
        super.onDestroy();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        BioLog.i("commandFinished");
        finishActivity(false);
    }

    public BioAppDescription getAppDescription() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BioAppDescription) ipChange.ipc$dispatch("e25f35c4", new Object[]{this}) : this.e;
    }

    public void finishActivity(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3c47ab", new Object[]{this, new Boolean(z)});
            return;
        }
        BioLog.i(getClass().getSimpleName() + ".finishActivity: auto=" + z);
        if (z) {
            BioAppDescription bioAppDescription = this.e;
            if (bioAppDescription != null && !bioAppDescription.isAutoClose()) {
                return;
            }
            BioLog.i("finishActivity end1");
            finish();
            return;
        }
        BioLog.i("finishActivity end2");
        finish();
    }

    public void sendResponse(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59dbee13", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        Intent intent = new Intent(Constant.BIOLOGY_CALLBACK_ACTION);
        BioResponse bioResponse = new BioResponse();
        bioResponse.setSuccess(false);
        bioResponse.setResult(i);
        if (i == 101 || i == 200) {
            bioResponse.subCode = CodeConstants.ERROR_CAMERA;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 100) {
            bioResponse.subCode = CodeConstants.ERROR_CAMERA;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 205) {
            bioResponse.subCode = CodeConstants.SERVER_PARAM_ERROR;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 209) {
            bioResponse.subCode = CodeConstants.OUT_TIME;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 102) {
            bioResponse.subCode = CodeConstants.USER_UNSURPPORT_CPU;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 105) {
            bioResponse.subCode = CodeConstants.ANDROID_VERSION_LOW;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 201) {
            bioResponse.subCode = CodeConstants.INVALID_ARGUMENT;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 202) {
            bioResponse.subCode = CodeConstants.USER_QUITE;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 203) {
            bioResponse.subCode = CodeConstants.OVER_TIME;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 207) {
            bioResponse.subCode = CodeConstants.NETWORK_TIMEOUT;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 208) {
            bioResponse.subCode = CodeConstants.SERVER_FAIL;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 3001) {
            bioResponse.subCode = CodeConstants.LIVENESS_ERROR;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 301) {
            bioResponse.subCode = CodeConstants.USER_BACK;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        }
        bioResponse.setResultMessage(str2);
        bioResponse.setTag(str);
        Bundle bundle = new Bundle();
        bundle.putString(Constant.BIOLOGY_INTENT_ACTION_REV, JSON.toJSONString(bioResponse));
        intent.putExtras(bundle);
        BioLog.w("sendResponse(uniqueID=" + str + ", error=" + i + ", other=" + str2 + riy.BRACKET_END_STR);
        this.b.sendBroadcast(intent);
    }

    public void sendResponse(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a280c913", new Object[]{this, new Integer(i)});
            return;
        }
        BioAppDescription bioAppDescription = this.e;
        if (bioAppDescription == null) {
            return;
        }
        sendResponse(bioAppDescription.getTag(), i, "");
    }

    public void sendResponseWithSubcode(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e91e5352", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        BioAppDescription bioAppDescription = this.e;
        if (bioAppDescription == null) {
            return;
        }
        String tag = bioAppDescription.getTag();
        Intent intent = new Intent(Constant.BIOLOGY_CALLBACK_ACTION);
        BioResponse bioResponse = new BioResponse();
        bioResponse.setSuccess(false);
        bioResponse.setResult(i);
        bioResponse.subCode = str;
        if (StringUtils.isEmpty(str2)) {
            str2 = CodeConstants.getMessage(bioResponse.subCode);
        }
        bioResponse.subMsg = str2;
        bioResponse.setResultMessage("");
        bioResponse.setTag(tag);
        Bundle bundle = new Bundle();
        bundle.putString(Constant.BIOLOGY_INTENT_ACTION_REV, JSON.toJSONString(bioResponse));
        intent.putExtras(bundle);
        BioLog.w("sendResponse(uniqueID=" + tag + ", error=" + i + ", subCode=" + str + riy.BRACKET_END_STR);
        this.b.sendBroadcast(intent);
    }

    public void sendResponse(BioFragmentResponse bioFragmentResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc68a6c0", new Object[]{this, bioFragmentResponse});
            return;
        }
        Intent intent = new Intent(Constant.BIOLOGY_CALLBACK_ACTION);
        BioResponse bioResponse = new BioResponse();
        bioResponse.setSuccess(bioFragmentResponse.isSucess);
        bioResponse.setToken(bioFragmentResponse.token);
        bioResponse.subCode = bioFragmentResponse.subCode;
        bioResponse.subMsg = bioFragmentResponse.subMsg;
        bioResponse.setResultMessage(bioFragmentResponse.resultMessage);
        bioResponse.setResult(bioFragmentResponse.errorCode);
        bioResponse.setTag(this.e.getTag());
        if (bioFragmentResponse.ext != null) {
            bioResponse.setExt(bioFragmentResponse.ext);
        }
        Bundle bundle = new Bundle();
        bundle.putString(Constant.BIOLOGY_INTENT_ACTION_REV, JSON.toJSONString(bioResponse));
        intent.putExtras(bundle);
        BioLog.w("sendResponse(BioFragmentResponse)");
        this.b.sendBroadcast(intent);
    }

    public void sendProgressResponse(BioFragmentResponse bioFragmentResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("145920cd", new Object[]{this, bioFragmentResponse});
            return;
        }
        Intent intent = new Intent(Constant.BIOLOGY_CALLBACK_PROGRESS_ACTION);
        BioResponse bioResponse = new BioResponse();
        bioResponse.setSuccess(bioFragmentResponse.isSucess);
        bioResponse.setToken(bioFragmentResponse.token);
        bioResponse.subCode = bioFragmentResponse.subCode;
        bioResponse.subMsg = bioFragmentResponse.subMsg;
        bioResponse.setResultMessage(bioFragmentResponse.resultMessage);
        bioResponse.setResult(bioFragmentResponse.errorCode);
        bioResponse.setTag(this.e.getTag());
        if (bioFragmentResponse.ext != null) {
            bioResponse.setExt(bioFragmentResponse.ext);
        }
        Bundle bundle = new Bundle();
        bundle.putString(Constant.BIOLOGY_INTENT_ACTION_REV, JSON.toJSONString(bioResponse));
        intent.putExtras(bundle);
        BioLog.w("sendProgressResponse(BioFragmentResponse)");
        this.b.sendBroadcast(intent);
    }

    public void sendAvatarResponse(BioFragmentResponse bioFragmentResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919e02f9", new Object[]{this, bioFragmentResponse});
            return;
        }
        Intent intent = new Intent(Constant.BIOLOGY_SEND_AVATAR_ACTION);
        BioResponse bioResponse = new BioResponse();
        bioResponse.setSuccess(bioFragmentResponse.isSucess);
        bioResponse.setToken(bioFragmentResponse.token);
        bioResponse.setResultMessage(bioFragmentResponse.resultMessage);
        bioResponse.setResult(bioFragmentResponse.errorCode);
        bioResponse.setTag(this.e.getTag());
        if (bioFragmentResponse.ext != null) {
            bioResponse.setExt(bioFragmentResponse.ext);
        }
        Bundle bundle = new Bundle();
        bundle.putString(Constant.BIOLOGY_INTENT_ACTION_REV, JSON.toJSONString(bioResponse));
        intent.putExtras(bundle);
        BioLog.w("sendAvatarResponse(BioFragmentResponse)");
        sendStickyBroadcast(intent);
    }
}
