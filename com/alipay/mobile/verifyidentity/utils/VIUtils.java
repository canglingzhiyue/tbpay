package com.alipay.mobile.verifyidentity.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.alipay.mobile.verifyidentity.callback.ModuleListener;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.common.UserIdCache;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VITraceLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity;
import com.alipay.mobile.verifyidentity.ui.BaseVerifyFragmentActivity;
import com.alipay.mobile.verifyidentity.ui.helper.DialogHelper;
import com.alipay.mobile.verifyidentity.uitl.PlatformUtils;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.math.BigDecimal;

/* loaded from: classes3.dex */
public class VIUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f6102a = "VIUtils";

    public static Bundle toBundle(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("b6364850", new Object[]{jSONObject});
        }
        try {
            return toBundle(null, jSONObject);
        } catch (Throwable th) {
            VerifyLogCat.e(f6102a, "toBundle error", th);
            return new Bundle();
        }
    }

    public static Bundle toBundle(Bundle bundle, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("91724444", new Object[]{bundle, jSONObject});
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            for (String str : jSONObject.keySet()) {
                try {
                    Object obj = jSONObject.get(str);
                    if (obj instanceof Integer) {
                        bundle.putInt(str, ((Integer) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof String) {
                        bundle.putString(str, (String) obj);
                    } else if (obj instanceof Long) {
                        bundle.putLong(str, ((Long) obj).longValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str, ((Double) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putDouble(str, new BigDecimal(Float.toString(((Float) obj).floatValue())).doubleValue());
                    } else if (obj instanceof JSON) {
                        bundle.putString(str, ((JSON) obj).toJSONString());
                    }
                } catch (Exception e) {
                    VerifyLogCat.e(f6102a, "toBundle exception", e);
                }
            }
        }
        return bundle;
    }

    public static boolean hasOtherVerifyProduct(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("652723d5", new Object[]{str})).booleanValue() : hasOtherVerifyProduct(JSON.parseObject(str));
    }

    public static boolean hasOtherVerifyProduct(JSONObject jSONObject) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbd6120d", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null || (bool = jSONObject.getBoolean(BioDetector.EXT_KEY_HAS_OTHERS)) == null) {
            bool = false;
        }
        return bool.booleanValue();
    }

    public static void goOtherVerifyProduct(final MicroModuleContext microModuleContext, final Activity activity, final MicroModule microModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d325906", new Object[]{microModuleContext, activity, microModule});
            return;
        }
        final DialogHelper dialogHelper = null;
        if (activity instanceof BaseVerifyActivity) {
            dialogHelper = ((BaseVerifyActivity) activity).getDialogHelper();
        } else if (activity instanceof BaseVerifyFragmentActivity) {
            dialogHelper = ((BaseVerifyFragmentActivity) activity).getDialogHelper();
        }
        if (dialogHelper == null) {
            dialogHelper = new DialogHelper(activity);
        }
        if (TextUtils.isEmpty(microModule.getVerifyId())) {
            microModuleContext.notifyAndFinishModule(microModule.getVerifyId(), microModule.getToken(), microModule.getModuleName(), new DefaultModuleResult("1002"));
            return;
        }
        dialogHelper.showProgressDialog("");
        AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.utils.VIUtils.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    MICRpcRequest mICRpcRequest = new MICRpcRequest();
                    mICRpcRequest.verifyId = MicroModule.this.getVerifyId();
                    mICRpcRequest.token = MicroModule.this.getToken();
                    mICRpcRequest.module = ModuleConstants.VI_MODULE_MENU;
                    MICRpcResponse dispatch = new MICRpcServiceBiz().dispatch(mICRpcRequest);
                    dialogHelper.dismissProgressDialog();
                    if (dispatch == null || !dispatch.success) {
                        dialogHelper.toast(activity.getResources().getString(R.string.network_server_unavailable), 1);
                        return;
                    }
                    ModuleExecuteResult moduleExecuteResult = new ModuleExecuteResult();
                    dispatch.finishCode = "1002";
                    moduleExecuteResult.setMICRpcResponse(dispatch);
                    microModuleContext.notifyAndFinishModule(MicroModule.this.getVerifyId(), MicroModule.this.getToken(), MicroModule.this.getModuleName(), moduleExecuteResult);
                } catch (RpcException e) {
                    dialogHelper.dismissProgressDialog();
                    throw e;
                }
            }
        }, "goOtherVerifyProduct");
    }

    public static void goOtherVerifyProduct(final MicroModuleContext microModuleContext, final MicroModule microModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f5c998", new Object[]{microModuleContext, microModule});
        } else if (TextUtils.isEmpty(microModule.getVerifyId())) {
            microModuleContext.notifyAndFinishModule(microModule.getVerifyId(), microModule.getToken(), microModule.getModuleName(), new DefaultModuleResult("1002"));
        } else {
            microModuleContext.showProgressDialog("");
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.utils.VIUtils.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        MICRpcRequest mICRpcRequest = new MICRpcRequest();
                        mICRpcRequest.verifyId = MicroModule.this.getVerifyId();
                        mICRpcRequest.token = MicroModule.this.getToken();
                        mICRpcRequest.module = ModuleConstants.VI_MODULE_MENU;
                        MICRpcResponse dispatch = new MICRpcServiceBiz().dispatch(mICRpcRequest);
                        microModuleContext.dismissProgressDialog();
                        if (dispatch == null || !dispatch.success) {
                            microModuleContext.toast(microModuleContext.getContext().getResources().getString(R.string.network_server_unavailable), 1);
                            return;
                        }
                        ModuleExecuteResult moduleExecuteResult = new ModuleExecuteResult();
                        dispatch.finishCode = "1002";
                        moduleExecuteResult.setMICRpcResponse(dispatch);
                        microModuleContext.notifyAndFinishModule(MicroModule.this.getVerifyId(), MicroModule.this.getToken(), MicroModule.this.getModuleName(), moduleExecuteResult);
                    } catch (RpcException e) {
                        microModuleContext.dismissProgressDialog();
                        throw e;
                    }
                }
            }, "goOtherVerifyProduct");
        }
    }

    public static void goOtherVerifyProduct(final MicroModuleContext microModuleContext, final String str, final String str2, final String str3, final ModuleListener moduleListener, final VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f21bf6cf", new Object[]{microModuleContext, str, str2, str3, moduleListener, verifyIdentityTask});
        } else if (TextUtils.isEmpty(str)) {
            moduleListener.onModuleExecuteResult(str, str2, str3, new DefaultModuleResult("1002"), verifyIdentityTask);
        } else {
            microModuleContext.showProgressDialog("");
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.utils.VIUtils.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        MICRpcRequest mICRpcRequest = new MICRpcRequest();
                        mICRpcRequest.verifyId = str;
                        mICRpcRequest.token = str2;
                        mICRpcRequest.module = ModuleConstants.VI_MODULE_MENU;
                        MICRpcResponse dispatch = new MICRpcServiceBiz().dispatch(mICRpcRequest);
                        microModuleContext.dismissProgressDialog();
                        if (dispatch == null || !dispatch.success) {
                            microModuleContext.toast(microModuleContext.getContext().getString(R.string.network_server_unavailable), 1);
                            return;
                        }
                        ModuleExecuteResult moduleExecuteResult = new ModuleExecuteResult();
                        dispatch.finishCode = "1002";
                        moduleExecuteResult.setMICRpcResponse(dispatch);
                        moduleListener.onModuleExecuteResult(str, str2, str3, moduleExecuteResult, verifyIdentityTask);
                    } catch (RpcException e) {
                        microModuleContext.dismissProgressDialog();
                        throw e;
                    }
                }
            }, "goOtherVerifyProductByEngine");
        }
    }

    public static boolean isInExport() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77f80f8e", new Object[0])).booleanValue();
        }
        try {
            Object invokeStaticMethod = ReflectUtils.invokeStaticMethod("com.alipay.mobile.verifyidentity.common.ExportBeacon", "gotThis", null, null);
            if (invokeStaticMethod != null) {
                z = Boolean.valueOf(String.valueOf(invokeStaticMethod)).booleanValue();
            }
            String str = f6102a;
            VerifyLogCat.i(str, "isInExport: " + z);
        } catch (Throwable th) {
            VerifyLogCat.e(f6102a, "isInExport 判断时异常", th);
        }
        return z;
    }

    public static boolean isGoingToFace(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c3aef1d", new Object[]{str})).booleanValue() : ModuleConstants.VI_MODULE_SIGN_LOGIN_FACE.equalsIgnoreCase(str) || ModuleConstants.VI_MODULE_LOGIN_FACE.equalsIgnoreCase(str) || ModuleConstants.VI_MODULE_NAME_ACCOUNT_CERT_FACE.equalsIgnoreCase(str) || ModuleConstants.VI_MODULE_NAME_SYS_INPUT_CERT_FACE.equalsIgnoreCase(str) || ModuleConstants.VI_MODULE_NAME_X_ACCOUNT_CERT_FACE.equalsIgnoreCase(str) || ModuleConstants.VI_MODULE_NAME_ALILANG_FACE.equalsIgnoreCase(str) || ModuleConstants.VI_MODULE_NAME_FACEVERIFY.equalsIgnoreCase(str) || ModuleConstants.VI_MODULE_NAME_IDFACE.equalsIgnoreCase(str) || ModuleConstants.VI_MODULE_NAME_IDPAPERS.equalsIgnoreCase(str) || ModuleConstants.VI_MODULE_NAME_HAND_WRITING.equalsIgnoreCase(str) || ModuleConstants.VI_MODULE_NAME_PAPERS.equalsIgnoreCase(str);
    }

    public static String getString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("134d0c8b", new Object[]{new Integer(i)});
        }
        try {
            return MicroModuleContext.getInstance().getContext().getString(i);
        } catch (Throwable th) {
            VerifyLogCat.e(f6102a, "getString 出错！", th);
            return null;
        }
    }

    public static String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[0]);
        }
        String str = UserIdCache.uid;
        return !TextUtils.isEmpty(str) ? str : "";
    }

    public static String getTid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12a13f40", new Object[0]);
        }
        Object invokeStaticMethod = ReflectUtils.invokeStaticMethod("com.alipay.mobile.verifyidentity.alipay.util.TidHelper", "getTid");
        return invokeStaticMethod != null ? String.valueOf(invokeStaticMethod) : "";
    }

    public static void initLogger(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f211a61", new Object[]{context});
        } else {
            VITraceLogger.getInstance().setDebug(PlatformUtils.isDebug(context));
        }
    }

    public static MICRpcResponse getDefSucMICRpcResponse(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("b583f45a", new Object[]{str, str2});
        }
        MICRpcResponse mICRpcResponse = new MICRpcResponse();
        mICRpcResponse.verifyId = str;
        mICRpcResponse.token = str2;
        mICRpcResponse.success = true;
        mICRpcResponse.finish = true;
        mICRpcResponse.verifySuccess = true;
        mICRpcResponse.finishCode = "1000";
        return mICRpcResponse;
    }

    public static boolean isMultiTaskModeEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("45c2ab5", new Object[0])).booleanValue() : !"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.noMultiTask));
    }
}
