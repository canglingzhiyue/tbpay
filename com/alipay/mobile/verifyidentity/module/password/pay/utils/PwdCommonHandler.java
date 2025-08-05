package com.alipay.mobile.verifyidentity.module.password.pay.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.NetworkServiceTracer;
import com.alipay.mobile.verifyidentity.bio.BioPreOpenHelper;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordInputUnifiedPlugin;
import com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew;
import com.alipay.mobile.verifyidentity.module.password.pay.model.VerifyRequestModel;
import com.alipay.mobile.verifyidentity.module.password.pay.model.VerifyResponseConstants;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class PwdCommonHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5934a = "PwdCommonHandler";
    private Context b;
    private Activity c;
    public boolean isPluginMode;
    public MicroModule mModule;
    public NotifyResultHandler mNotifyResultHandler;
    public BaseFBPlugin mPlugin;
    public String otherVerifyPayText;
    public String sourceToPwd;

    /* loaded from: classes3.dex */
    public interface NotifyMspResultHandler {
        void notifyResult(MICRpcResponse mICRpcResponse, String str);
    }

    /* loaded from: classes3.dex */
    public interface NotifyResultHandler {
        void notifyResult(ModuleExecuteResult moduleExecuteResult);
    }

    /* loaded from: classes3.dex */
    public interface OnMspDialogConfirm {
        void onConfirm();
    }

    public static /* synthetic */ void access$000(PwdCommonHandler pwdCommonHandler, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a5b51fa", new Object[]{pwdCommonHandler, str});
        } else {
            pwdCommonHandler.a(str);
        }
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]) : f5934a;
    }

    public PwdCommonHandler(Context context) {
        this.b = context;
    }

    public PwdCommonHandler(Context context, MicroModule microModule, BaseFBPlugin baseFBPlugin, NotifyResultHandler notifyResultHandler) {
        this.b = context;
        this.mModule = microModule;
        this.mPlugin = baseFBPlugin;
        if (this.mPlugin != null) {
            this.isPluginMode = true;
        } else {
            this.isPluginMode = false;
        }
        this.mNotifyResultHandler = notifyResultHandler;
    }

    public void bindAct(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d86836e", new Object[]{this, activity});
        } else {
            this.c = activity;
        }
    }

    public void goGetBackPPW() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc3b1a69", new Object[]{this});
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("alipays://platformapi/startapp?appId=20000013&preAuth=YES"));
            if (this.b == null) {
                this.b = MicroModuleContext.getInstance().getContext();
            }
            if (!(this.b instanceof Activity)) {
                intent.addFlags(268435456);
            }
            this.b.startActivity(intent);
        } catch (Exception unused) {
            if (this.b == null) {
                return;
            }
            MicroModuleContext.getInstance().toast(this.b.getResources().getString(R.string.pwd_install), 1);
        }
    }

    public void goGetMspPPW(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("924441cc", new Object[]{this, str});
            return;
        }
        try {
            String str2 = "";
            if (!TextUtils.isEmpty(str)) {
                str2 = "&loginId=" + str;
            }
            Uri parse = Uri.parse("alipays://platformapi/startApp?appId=20000013&pwdType=phonePassword" + str2 + "&bizScene=mobilecashier_sdk_pay");
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(parse);
            intent.addCategory("android.intent.category.BROWSABLE");
            if (this.b == null) {
                this.b = MicroModuleContext.getInstance().getContext();
            }
            if (!(this.b instanceof Activity)) {
                intent.addFlags(268435456);
            }
            this.b.startActivity(intent);
        } catch (Exception unused) {
            if (this.b == null) {
                return;
            }
            MicroModuleContext.getInstance().toast(this.b.getResources().getString(R.string.pwd_install), 1);
        }
    }

    public void processError(MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1602ede", new Object[]{this, mICRpcResponse});
        } else {
            processError(mICRpcResponse, false);
        }
    }

    public void processError(final MICRpcResponse mICRpcResponse, final boolean z) {
        BaseFBPlugin baseFBPlugin;
        String str;
        DialogInterface.OnClickListener onClickListener;
        String str2;
        DialogInterface.OnClickListener onClickListener2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa65fb6", new Object[]{this, mICRpcResponse, new Boolean(z)});
        } else if (VerifyResponseConstants.PPW_LOCK_FIND.equalsIgnoreCase(mICRpcResponse.verifyCode)) {
            VerifyLogCat.d(f5934a, "lock findable");
            MicroModuleContext.getInstance().alert("", mICRpcResponse.verifyMessage, this.b.getResources().getString(R.string.pwd_find_later), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    mICRpcResponse.verifyCode = "PPW_LOCK_USER_CANCEL";
                    PwdCommonHandler.this.writePWDErrorBehavorLog(VerifyResponseConstants.PPW_LOCK_FIND, "1");
                    if (!z || PwdCommonHandler.this.mPlugin == null) {
                        PwdCommonHandler.access$000(PwdCommonHandler.this, BaseFBPlugin.VERIFY_STATUS.abort);
                    } else {
                        PwdCommonHandler.this.mPlugin.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, VerifyResponseConstants.PPW_LOCK);
                    }
                    PwdCommonHandler.this.doNextStep(mICRpcResponse);
                }
            }, this.b.getResources().getString(R.string.pwd_find_now), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    PwdCommonHandler.this.writePWDErrorBehavorLog(VerifyResponseConstants.PPW_LOCK_FIND, "0");
                    if (!z || PwdCommonHandler.this.mPlugin == null) {
                        PwdCommonHandler.access$000(PwdCommonHandler.this, BaseFBPlugin.VERIFY_STATUS.abort);
                    } else {
                        PwdCommonHandler.this.mPlugin.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, "forgetPwd");
                    }
                    PwdCommonHandler.this.goGetBackPPW();
                }
            });
        } else if (VerifyResponseConstants.PPW_LOCK.equalsIgnoreCase(mICRpcResponse.verifyCode)) {
            String string = this.b.getResources().getString(R.string.i_know);
            DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    PwdCommonHandler.this.writePWDErrorBehavorLog(VerifyResponseConstants.PPW_LOCK, "0");
                    if (!z || PwdCommonHandler.this.mPlugin == null) {
                        PwdCommonHandler.access$000(PwdCommonHandler.this, BaseFBPlugin.VERIFY_STATUS.abort);
                    } else {
                        PwdCommonHandler.this.mPlugin.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, VerifyResponseConstants.PPW_LOCK);
                    }
                    PwdCommonHandler.this.doNextStep(mICRpcResponse);
                }
            };
            if (getOtherVerifyPayFlag(mICRpcResponse)) {
                VerifyLogCat.d(f5934a, "show others' way");
                String otherVerifyPayText = getOtherVerifyPayText();
                str = this.b.getResources().getString(R.string.pwd_find_later);
                onClickListener2 = new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        } else if (PwdCommonHandler.this.mPlugin instanceof PasswordUnifiedPluginNew) {
                            ((PasswordUnifiedPluginNew) PwdCommonHandler.this.mPlugin).hideKeyboard();
                            ((PasswordUnifiedPluginNew) PwdCommonHandler.this.mPlugin).sendMspRpc(null, "Y", "");
                        } else {
                            ((PasswordInputUnifiedPlugin) PwdCommonHandler.this.mPlugin).hideKeyboard();
                            ((PasswordInputUnifiedPlugin) PwdCommonHandler.this.mPlugin).doRpc(null, "Y", "");
                        }
                    }
                };
                onClickListener = new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        PwdCommonHandler.this.writePWDErrorBehavorLog(VerifyResponseConstants.PPW_LOCK, "0");
                        if (!z || PwdCommonHandler.this.mPlugin == null) {
                            PwdCommonHandler.access$000(PwdCommonHandler.this, BaseFBPlugin.VERIFY_STATUS.abort);
                        } else {
                            PwdCommonHandler.this.mPlugin.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, VerifyResponseConstants.PPW_LOCK);
                        }
                        PwdCommonHandler.this.notifyCancel();
                    }
                };
                str2 = otherVerifyPayText;
            } else {
                str = string;
                onClickListener = onClickListener3;
                str2 = null;
                onClickListener2 = null;
            }
            VerifyLogCat.d(f5934a, "lock notify");
            MicroModuleContext.getInstance().alert("", mICRpcResponse.verifyMessage, str, onClickListener, str2, onClickListener2);
        } else {
            VerifyLogCat.d(f5934a, "unhandled error " + mICRpcResponse.verifyCode);
            MicroModuleContext.getInstance().toast(TextUtils.isEmpty(mICRpcResponse.verifyMessage) ? this.b.getResources().getString(R.string.verifyidentity_wrong_data) : mICRpcResponse.verifyMessage, 0);
            if (z && (baseFBPlugin = this.mPlugin) != null) {
                baseFBPlugin.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, VerifyResponseConstants.PPW_LOCK);
            } else {
                a(BaseFBPlugin.VERIFY_STATUS.abort);
            }
            doNextStep(mICRpcResponse);
        }
    }

    public void processErrorForNew(BaseVerifyActivity baseVerifyActivity, final MICRpcResponse mICRpcResponse, final OnMspDialogConfirm onMspDialogConfirm, View view, String str) {
        String str2;
        DialogInterface.OnClickListener onClickListener;
        String str3;
        DialogInterface.OnClickListener onClickListener2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cc19b7a", new Object[]{this, baseVerifyActivity, mICRpcResponse, onMspDialogConfirm, view, str});
        } else if (VerifyResponseConstants.PPW_LOCK_FIND.equalsIgnoreCase(mICRpcResponse.verifyCode)) {
            VerifyLogCat.d(f5934a, "lock findable");
            view.setVisibility(4);
            baseVerifyActivity.alert("", mICRpcResponse.verifyMessage, this.b.getResources().getString(R.string.pwd_find_later), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    mICRpcResponse.verifyCode = "PPW_LOCK_USER_CANCEL";
                    PwdCommonHandler.this.writePWDErrorBehavorLog(VerifyResponseConstants.PPW_LOCK_FIND, "1");
                    if (PwdCommonHandler.this.mPlugin != null) {
                        PwdCommonHandler.this.mPlugin.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, VerifyResponseConstants.PPW_LOCK);
                    }
                    PwdCommonHandler.this.doNextStep(mICRpcResponse);
                }
            }, this.b.getResources().getString(R.string.pwd_find_now), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    PwdCommonHandler.this.writePWDErrorBehavorLog(VerifyResponseConstants.PPW_LOCK_FIND, "0");
                    if (PwdCommonHandler.this.mPlugin != null) {
                        PwdCommonHandler.this.mPlugin.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, "forgetPwd");
                    }
                    PwdCommonHandler.this.notifyCancel();
                    if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeGetPwdDelay))) {
                        PwdCommonHandler.this.goGetBackPPW();
                        return;
                    }
                    try {
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.7.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    PwdCommonHandler.this.goGetBackPPW();
                                }
                            }
                        }, 200L);
                    } catch (Throwable th) {
                        String access$100 = PwdCommonHandler.access$100();
                        VerifyLogCat.i(access$100, "quit error:" + th.getMessage());
                    }
                }
            });
        } else if (VerifyResponseConstants.PPW_LOCK.equalsIgnoreCase(mICRpcResponse.verifyCode)) {
            String string = this.b.getResources().getString(R.string.i_know);
            DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    PwdCommonHandler.this.writePWDErrorBehavorLog(VerifyResponseConstants.PPW_LOCK, "0");
                    if (PwdCommonHandler.this.mPlugin != null) {
                        PwdCommonHandler.this.mPlugin.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, VerifyResponseConstants.PPW_LOCK);
                    }
                    PwdCommonHandler.this.doNextStep(mICRpcResponse);
                }
            };
            if (!getOtherVerifyPayFlag(mICRpcResponse) || "Y".equalsIgnoreCase(str)) {
                str2 = string;
                onClickListener = onClickListener3;
                str3 = null;
                onClickListener2 = null;
            } else {
                VerifyLogCat.d(f5934a, "show others' way");
                String otherVerifyPayText = getOtherVerifyPayText();
                String string2 = this.b.getResources().getString(R.string.pwd_find_later);
                DialogInterface.OnClickListener onClickListener4 = new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        } else {
                            onMspDialogConfirm.onConfirm();
                        }
                    }
                };
                onClickListener = new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.10
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        PwdCommonHandler.this.writePWDErrorBehavorLog(VerifyResponseConstants.PPW_LOCK, "0");
                        if (PwdCommonHandler.this.mPlugin != null) {
                            PwdCommonHandler.this.mPlugin.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, VerifyResponseConstants.PPW_LOCK);
                        }
                        PwdCommonHandler.this.notifyCancel();
                    }
                };
                str3 = otherVerifyPayText;
                str2 = string2;
                onClickListener2 = onClickListener4;
            }
            VerifyLogCat.d(f5934a, "lock notify");
            view.setVisibility(4);
            baseVerifyActivity.alert("", mICRpcResponse.verifyMessage, str2, onClickListener, str3, onClickListener2);
        } else {
            VerifyLogCat.d(f5934a, "unhandled error " + mICRpcResponse.verifyCode);
            MicroModuleContext.getInstance().toast(TextUtils.isEmpty(mICRpcResponse.verifyMessage) ? this.b.getResources().getString(R.string.verifyidentity_wrong_data) : mICRpcResponse.verifyMessage, 0);
            BaseFBPlugin baseFBPlugin = this.mPlugin;
            if (baseFBPlugin != null) {
                baseFBPlugin.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, VerifyResponseConstants.PPW_LOCK);
            }
            doNextStep(mICRpcResponse);
        }
    }

    public boolean getOtherVerifyPayFlag(MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9f4487a", new Object[]{this, mICRpcResponse})).booleanValue();
        }
        if (mICRpcResponse == null || TextUtils.isEmpty(mICRpcResponse.data)) {
            return false;
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = JSON.parseObject(mICRpcResponse.data);
        } catch (JSONException e) {
            String str = f5934a;
            VerifyLogCat.e(str, "json fail " + mICRpcResponse.data, e);
        }
        if (jSONObject == null) {
            return false;
        }
        String string = jSONObject.getString("otherVerifyPaySwitch");
        this.otherVerifyPayText = jSONObject.getString("otherVerifyPayText");
        String str2 = f5934a;
        VerifyLogCat.i(str2, "otherVerifyPaySwitch: " + string);
        return "Y".equalsIgnoreCase(string);
    }

    public String getOtherVerifyPayText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("857c37", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.otherVerifyPayText)) {
            VerifyLogCat.i(f5934a, "getOtherVerifyPayText 用兜底文案");
            return this.b.getResources().getString(R.string.other_way_to_pay);
        }
        return this.otherVerifyPayText;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        BaseFBPlugin baseFBPlugin = this.mPlugin;
        if (baseFBPlugin == null) {
            return;
        }
        baseFBPlugin.updateVerifyStatus(str);
    }

    public void doNextStep(MICRpcResponse mICRpcResponse) {
        ModuleExecuteResult defaultModuleResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3432528d", new Object[]{this, mICRpcResponse});
            return;
        }
        VerifyLogCat.d(f5934a, "next step");
        if (mICRpcResponse != null) {
            defaultModuleResult = new ModuleExecuteResult();
            defaultModuleResult.setMICRpcResponse(mICRpcResponse);
        } else {
            defaultModuleResult = new DefaultModuleResult("1001");
        }
        notifyResult(defaultModuleResult);
    }

    public void doNextStep(MICRpcResponse mICRpcResponse, String str) {
        ModuleExecuteResult defaultModuleResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a89ed317", new Object[]{this, mICRpcResponse, str});
            return;
        }
        VerifyLogCat.d(f5934a, "next step");
        if (mICRpcResponse != null) {
            defaultModuleResult = new ModuleExecuteResult();
            defaultModuleResult.setMICRpcResponse(mICRpcResponse);
        } else {
            defaultModuleResult = new DefaultModuleResult("1001");
        }
        if ("forgotPwd".equalsIgnoreCase(str)) {
            defaultModuleResult.setFindAndPay(true);
        }
        notifyResult(defaultModuleResult);
    }

    public void notifyCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673f922a", new Object[]{this});
        } else {
            notifyCancel(null);
        }
    }

    public void notifyCancel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f84574", new Object[]{this, str});
            return;
        }
        String str2 = f5934a;
        VerifyLogCat.i(str2, "cancel [subcode]: " + str);
        DefaultModuleResult defaultModuleResult = new DefaultModuleResult("1003");
        if (!TextUtils.isEmpty(str)) {
            if (defaultModuleResult.getExtInfo() == null) {
                defaultModuleResult.setExtInfo(new HashMap<>());
            }
            defaultModuleResult.getExtInfo().put("subCode", str);
        }
        notifyResult(defaultModuleResult);
    }

    public void notifyResult(ModuleExecuteResult moduleExecuteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75cfa791", new Object[]{this, moduleExecuteResult});
            return;
        }
        NotifyResultHandler notifyResultHandler = this.mNotifyResultHandler;
        if (notifyResultHandler != null) {
            notifyResultHandler.notifyResult(moduleExecuteResult);
        }
        LocalBroadcastManager.getInstance(MicroModuleContext.getInstance().getContext()).sendBroadcast(new Intent("NEW_PWD_EXIT"));
        Activity activity = this.c;
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    public ModuleExecuteResult addLogicModuleName(ModuleExecuteResult moduleExecuteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ModuleExecuteResult) ipChange.ipc$dispatch("7a567211", new Object[]{this, moduleExecuteResult});
        }
        if (ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS.equalsIgnoreCase(this.sourceToPwd)) {
            moduleExecuteResult.setLogicModuleName(ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS);
        } else {
            VerifyIdentityTask task = this.mModule.getTask();
            if (task != null) {
                if (task.getExtParams() == null) {
                    task.setExtParams(new Bundle());
                }
                task.getExtParams().putString(CommonConstant.PRO_VERIFY_TYPE, "pwd");
            }
        }
        return moduleExecuteResult;
    }

    public String getLogicModuleName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fcbf817a", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.sourceToPwd)) {
            return this.mModule.getModuleName();
        }
        return this.sourceToPwd;
    }

    public void writeBehavorLog(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("214dc80b", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("module", getLogicModuleName());
        hashMap.put("code", str2);
        hashMap.put("binIndx", str3);
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, Constants.VI_ENGINE_APPID, "hsbmts", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
    }

    public void writePWDErrorBehavorLog(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a202b1ac", new Object[]{this, str, str2});
        } else {
            writeBehavorLog("UC-MobileIC-161201-2", str, str2);
        }
    }

    public void doRpc(final String str, final String str2, final String str3, final boolean z, final String str4, final boolean z2, final NotifyMspResultHandler notifyMspResultHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77ede5ae", new Object[]{this, str, str2, str3, new Boolean(z), str4, new Boolean(z2), notifyMspResultHandler});
        } else {
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    final MICRpcResponse mICRpcResponse = null;
                    try {
                        MICRpcRequest mICRpcRequest = new MICRpcRequest();
                        mICRpcRequest.verifyId = PwdCommonHandler.this.mModule.getVerifyId();
                        mICRpcRequest.module = PwdCommonHandler.this.mModule.getModuleName();
                        mICRpcRequest.token = PwdCommonHandler.this.mModule.getToken();
                        mICRpcRequest.action = "VERIFY_PPW";
                        VerifyRequestModel verifyRequestModel = new VerifyRequestModel();
                        verifyRequestModel.setIsSimplePPW(PwdCommonHandler.this.mModule.getVerifyId(), z);
                        verifyRequestModel.encryptPwd = str;
                        verifyRequestModel.needOtherVerifyPay = str2;
                        if (!TextUtils.isEmpty(str3)) {
                            verifyRequestModel.from = str3;
                        }
                        if (z2) {
                            verifyRequestModel.bioPayUsableStrategy = "false";
                        }
                        if (ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS.equalsIgnoreCase(PwdCommonHandler.this.sourceToPwd)) {
                            VerifyLogCat.d(PwdCommonHandler.access$100(), "This pwd check request is from fingerprint module.");
                            verifyRequestModel.predata = JSON.parseObject(str4);
                            mICRpcRequest.module = ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS;
                        }
                        VerifyLogCat.d("Verifyidentity", "预开通生物参数check");
                        if (BioPreOpenHelper.c().booleanValue()) {
                            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-240620-9", Constants.VI_ENGINE_APPID, "hsbmts", PwdCommonHandler.this.mModule.getToken(), PwdCommonHandler.this.mModule.getVerifyId(), null, new HashMap());
                            VerifyLogCat.d("Verifyidentity", "需要预开通生物");
                            verifyRequestModel.needOpenBioPay = true;
                            verifyRequestModel.mngRequest = BioPreOpenHelper.b();
                        }
                        mICRpcRequest.data = JSON.toJSONString(verifyRequestModel);
                        VerifyLogCat.d("Verifyidentity", "verify request info" + JSON.toJSONString(mICRpcRequest));
                        mICRpcResponse = PwdCommonHandler.this.mPlugin.sendRpcRequest(mICRpcRequest);
                    } catch (RpcException unused) {
                    }
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.11.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                notifyMspResultHandler.notifyResult(mICRpcResponse, str3);
                            }
                        }
                    });
                }
            }, NetworkServiceTracer.REPORT_SUB_NAME_RPC);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void changeToBack() {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.changeToBack():void");
    }
}
