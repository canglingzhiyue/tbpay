package com.alipay.security.mobile.silentop;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.security.mobile.api.IFAAManagerAdaptor;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.alipay.security.mobile.util.AsyncCall;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes3.dex */
public class SilentOpManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static void silentRegKM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c23a1a8", new Object[0]);
        }
    }

    private static void silentUpdateKM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2cedbe7", new Object[0]);
        }
    }

    public static /* synthetic */ void access$000(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c002b8c5", new Object[]{context, str, str2});
        } else {
            submitResponse(context, str, str2);
        }
    }

    public static void doSilentOp(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a246e00", new Object[]{context});
            return;
        }
        AuthenticatorLOG.fpInfo("doSilentOp:" + SilentOpDataHelper.getInstance().getOpCmd());
        String opCmd = SilentOpDataHelper.getInstance().getOpCmd();
        char c = 65535;
        int hashCode = opCmd.hashCode();
        if (hashCode != -1561676218) {
            if (hashCode != -690213213) {
                if (hashCode == 1440705988 && opCmd.equals(SilentOpDataHelper.CMD_SILENT_REG_IFAA)) {
                    c = 1;
                }
            } else if (opCmd.equals("register")) {
                c = 0;
            }
        } else if (opCmd.equals(SilentOpDataHelper.CMD_KM_FP_UPDATE)) {
            c = 2;
        }
        if (c == 0) {
            if (!SilentOpDataHelper.getInstance().isSuccess()) {
                return;
            }
            silentRegKM();
            return;
        }
        if (c != 1) {
            if (c != 2) {
                return;
            }
        } else if (SilentOpDataHelper.getInstance().isSuccess()) {
            silentRegIFAA(context);
        }
        if (!SilentOpDataHelper.getInstance().isSuccess()) {
            return;
        }
        silentUpdateKM();
    }

    private static void silentRegIFAA(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("269b4825", new Object[]{context});
        } else if (!IFAAManagerAdaptor.isIgnoreFpIndex(context)) {
        } else {
            AuthenticatorLOG.fpInfo("silentRegIFAA");
            AuthenticatorMessage authenticatorMessage = new AuthenticatorMessage(2, SilentOpDataHelper.getInstance().getRegInfo());
            authenticatorMessage.setAuthenticatorType(Constants.TYPE_FINGERPRINT);
            authenticatorMessage.setId(SilentOpDataHelper.getInstance().getBizID());
            AuthenticatorManager.getInstance(context).startAuth(context, authenticatorMessage, new AuthenticatorManager.Callback() { // from class: com.alipay.security.mobile.silentop.SilentOpManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.Callback
                public void onResult(AuthenticatorResponse authenticatorResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("688a9824", new Object[]{this, authenticatorResponse});
                    } else if (authenticatorResponse.getResult() != 100) {
                    } else {
                        SilentOpManager.access$000(context, authenticatorResponse.getData(), SilentOpDataHelper.CMD_SILENT_REG_IFAA);
                    }
                }
            }, null);
        }
    }

    private static void submitResponse(final Context context, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("696e8c5c", new Object[]{context, str, str2});
            return;
        }
        SilenceRpcResult silenceRpcResult = (SilenceRpcResult) new AsyncCall() { // from class: com.alipay.security.mobile.silentop.SilentOpManager.3
        }.callFunc(new FutureTask(new Callable<SilenceRpcResult>() { // from class: com.alipay.security.mobile.silentop.SilentOpManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
                if (r0.equals("register") != false) goto L15;
             */
            @Override // java.util.concurrent.Callable
            /* renamed from: call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.alipay.security.mobile.silentop.SilenceRpcResult mo598call() {
                /*
                    r6 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.security.mobile.silentop.SilentOpManager.AnonymousClass2.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L15
                    java.lang.Object[] r1 = new java.lang.Object[r3]
                    r1[r2] = r6
                    java.lang.String r2 = "c765b5fb"
                    java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
                    com.alipay.security.mobile.silentop.SilenceRpcResult r0 = (com.alipay.security.mobile.silentop.SilenceRpcResult) r0
                    return r0
                L15:
                    java.lang.String r0 = r1
                    r1 = -1
                    int r4 = r0.hashCode()
                    r5 = -1561676218(0xffffffffa2eab646, float:-6.3618817E-18)
                    if (r4 == r5) goto L41
                    r5 = -690213213(0xffffffffd6dc2ea3, float:-1.21046431E14)
                    if (r4 == r5) goto L37
                    r2 = 1440705988(0x55df6dc4, float:3.07078166E13)
                    if (r4 == r2) goto L2c
                    goto L4c
                L2c:
                    java.lang.String r2 = "ifaa_v2_register"
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L4c
                    r2 = 1
                    goto L4d
                L37:
                    java.lang.String r4 = "register"
                    boolean r0 = r0.equals(r4)
                    if (r0 == 0) goto L4c
                    goto L4d
                L41:
                    java.lang.String r2 = "km_update"
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L4c
                    r2 = 2
                    goto L4d
                L4c:
                    r2 = -1
                L4d:
                    if (r2 == 0) goto L53
                    if (r2 == r3) goto L53
                    r0 = 0
                    return r0
                L53:
                    com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl r0 = new com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl
                    android.content.Context r1 = r2
                    r0.<init>(r1)
                    java.lang.Class<com.alipay.security.mobile.silentop.MobileBiometricSilenceOpenClientApi> r1 = com.alipay.security.mobile.silentop.MobileBiometricSilenceOpenClientApi.class
                    java.lang.Object r1 = r0.getRpcProxy(r1)
                    com.alipay.security.mobile.silentop.MobileBiometricSilenceOpenClientApi r1 = (com.alipay.security.mobile.silentop.MobileBiometricSilenceOpenClientApi) r1
                    com.alipay.mobile.common.rpc.RpcInvokeContext r0 = r0.getRpcInvokeContext(r1)
                    com.alipay.security.mobile.rpc.ReadSettingServerUrl r2 = com.alipay.security.mobile.rpc.ReadSettingServerUrl.getInstance()
                    android.content.Context r3 = r2
                    java.lang.String r2 = r2.getGWFURL(r3)
                    r0.setGwUrl(r2)
                    com.alipay.security.mobile.silentop.BiometricSilenceOperationSubmitData r0 = new com.alipay.security.mobile.silentop.BiometricSilenceOperationSubmitData
                    r0.<init>()
                    java.lang.String r2 = r3
                    r0.bizData = r2
                    com.alipay.security.mobile.silentop.SilentOpDataHelper r2 = com.alipay.security.mobile.silentop.SilentOpDataHelper.getInstance()
                    java.lang.String r2 = r2.getBizID()
                    r0.bizId = r2
                    android.content.Context r2 = r2
                    java.lang.String r2 = com.alipay.security.mobile.cache.AuthenticatorModel.getTempUserId(r2)
                    r0.userId = r2
                    android.content.Context r2 = r2
                    com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager r2 = com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.getInstance(r2)
                    java.lang.String r3 = r0.userId
                    java.lang.String r2 = r2.getSecData(r3)
                    r0.secData = r2
                    com.alipay.security.mobile.silentop.SilentOpDataHelper r2 = com.alipay.security.mobile.silentop.SilentOpDataHelper.getInstance()
                    com.alipay.security.mobile.silentop.IfaaProductInfoData r2 = r2.getProductInfo()
                    r0.ifaaProductInfoData = r2
                    com.alipay.security.mobile.silentop.SilenceRpcResult r0 = r1.doSilenceRegisterWithResult(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alipay.security.mobile.silentop.SilentOpManager.AnonymousClass2.mo598call():com.alipay.security.mobile.silentop.SilenceRpcResult");
            }
        }), 10000);
        if (!SilentOpDataHelper.CMD_SILENT_REG_IFAA.equals(str2)) {
            return;
        }
        if (silenceRpcResult == null || !silenceRpcResult.isSuccess()) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("silent reg ifaa err: ");
                sb.append(silenceRpcResult);
                AuthenticatorLOG.debug(sb.toString() != null ? silenceRpcResult.getMessage() : "silenceRpcResult null");
                AuthenticatorLOG.fpInfo("DeReg IFAA");
                String deregInfo = SilentOpDataHelper.getInstance().getDeregInfo();
                if (TextUtils.isEmpty(deregInfo)) {
                    AuthenticatorLOG.fpInfo("DeReg IFAA err,dereinfo is null");
                    return;
                } else {
                    AuthenticatorManager.getInstance(context).startDeReg(context, deregInfo, Constants.TYPE_FINGERPRINT, new AuthenticatorCallback() { // from class: com.alipay.security.mobile.silentop.SilentOpManager.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
                        public void callback(AuthenticatorResponse authenticatorResponse) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse});
                            } else if (authenticatorResponse.getResult() == 100) {
                                AuthenticatorLOG.fpInfo("DeReg IFAA succ");
                            } else {
                                AuthenticatorLOG.fpInfo("DeReg IFAA failed,code " + authenticatorResponse.getResult());
                            }
                        }
                    });
                    return;
                }
            } catch (Exception e) {
                AuthenticatorLOG.fpInfo("silenceRpcResult is null. e = " + e.toString());
                return;
            }
        }
        AuthenticatorLOG.fpInfo("Silent reg IFAA succ");
    }
}
