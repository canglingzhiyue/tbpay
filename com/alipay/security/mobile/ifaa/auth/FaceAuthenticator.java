package com.alipay.security.mobile.ifaa.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Message;
import android.util.Base64;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.AuthenticatorResponseUtil;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.alipay.security.mobile.ifaa.adapter.IFAAManagerAdapter;
import com.alipay.security.mobile.ifaa.adapter.face.IFAAFaceManagerAdapter;
import com.alipay.security.mobile.ifaa.adapter.ta.TACommands;
import com.alipay.security.mobile.ifaa.adapter.ta.TAInterationV1;
import com.alipay.security.mobile.ifaa.auth.IAuthenticator;
import com.alipay.security.mobile.ifaa.message.Response;
import com.alipay.security.mobile.util.AsyncCall;
import com.alipay.security.mobile.util.CommonUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import org.ifaa.android.manager.face.IFAAFaceManager;
import org.ifaa.ifaf.OperationHeader;
import org.ifaa.ifaf.message.IFAFMessage;
import tb.riy;

/* loaded from: classes3.dex */
public class FaceAuthenticator implements IAuthenticator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String THREADNAME = "face_auth_thread";
    private IFAAFaceManagerAdapter ifaaFaceManager;
    private IFAAManagerAdapter ifaaManagerAdapter;
    private Context mContext;

    public static /* synthetic */ IFAAFaceManagerAdapter access$100(FaceAuthenticator faceAuthenticator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IFAAFaceManagerAdapter) ipChange.ipc$dispatch("eb8b859b", new Object[]{faceAuthenticator}) : faceAuthenticator.ifaaFaceManager;
    }

    public static /* synthetic */ AuthenticatorResponse access$200(FaceAuthenticator faceAuthenticator, AuthenticatorMessage authenticatorMessage, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AuthenticatorResponse) ipChange.ipc$dispatch("dfdf4814", new Object[]{faceAuthenticator, authenticatorMessage, new Integer(i), new Integer(i2)}) : faceAuthenticator.sendMessageToTee(authenticatorMessage, i, i2);
    }

    public static /* synthetic */ IFAAManagerAdapter access$400(FaceAuthenticator faceAuthenticator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IFAAManagerAdapter) ipChange.ipc$dispatch("40b8b86b", new Object[]{faceAuthenticator}) : faceAuthenticator.ifaaManagerAdapter;
    }

    @Override // com.alipay.security.mobile.ifaa.auth.IAuthenticator
    public int init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("609fd204", new Object[]{this, context})).intValue();
        }
        try {
            this.mContext = context;
            this.ifaaManagerAdapter = IFAAManagerAdapter.getInstance(context);
            this.ifaaFaceManager = IFAAFaceManagerAdapter.getInstance(context);
            if (!this.ifaaManagerAdapter.isSupportIFAAManager()) {
                return -1;
            }
            return this.ifaaFaceManager.isSupportIFAAFaceManager() ? 0 : -1;
        } catch (Throwable th) {
            AuthenticatorLOG.faceInfo(th);
            return -1;
        }
    }

    /* loaded from: classes3.dex */
    public class AuthFace {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int errCode;
        private int resultCode;

        private AuthFace() {
        }

        public static /* synthetic */ int access$002(AuthFace authFace, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b7f4290b", new Object[]{authFace, new Integer(i)})).intValue();
            }
            authFace.resultCode = i;
            return i;
        }

        public int process(final IAuthenticator.Callback callback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c29b29a3", new Object[]{this, callback})).intValue();
            }
            final ConditionVariable conditionVariable = new ConditionVariable();
            conditionVariable.close();
            this.resultCode = 101;
            this.errCode = 0;
            FaceAuthenticator.access$100(FaceAuthenticator.this).authenticate(new IFAAFaceManager.AuthenticatorCallback() { // from class: com.alipay.security.mobile.ifaa.auth.FaceAuthenticator.AuthFace.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    switch (str.hashCode()) {
                        case -1355127439:
                            super.onAuthenticationSucceeded();
                            return null;
                        case -500155405:
                            super.onAuthenticationStatus(((Number) objArr[0]).intValue());
                            return null;
                        case 355860459:
                            super.onAuthenticationError(((Number) objArr[0]).intValue());
                            return null;
                        case 742223496:
                            super.onAuthenticationFailed(((Number) objArr[0]).intValue());
                            return null;
                        default:
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }
                }

                @Override // org.ifaa.android.manager.face.IFAAFaceManager.AuthenticatorCallback
                public void onAuthenticationError(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1535ffeb", new Object[]{this, new Integer(i)});
                        return;
                    }
                    super.onAuthenticationError(i);
                    AuthenticatorLOG.faceInfo("auth onAuthenticationError: " + i);
                    if (i == 102 || i == 129) {
                        AuthFace.access$002(AuthFace.this, i);
                    } else {
                        AuthFace.access$002(AuthFace.this, 101);
                        AuthFace.this.errCode = i;
                    }
                    IAuthenticator.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.onAuthStatus(i);
                    }
                    conditionVariable.open();
                }

                @Override // org.ifaa.android.manager.face.IFAAFaceManager.AuthenticatorCallback
                public void onAuthenticationStatus(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e2303bf3", new Object[]{this, new Integer(i)});
                        return;
                    }
                    super.onAuthenticationStatus(i);
                    AuthenticatorLOG.faceInfo("auth onAuthenticationStatus: " + i);
                    IAuthenticator.Callback callback2 = callback;
                    if (callback2 == null || i != 414) {
                        return;
                    }
                    callback2.onAuthStatus(4);
                }

                @Override // org.ifaa.android.manager.face.IFAAFaceManager.AuthenticatorCallback
                public void onAuthenticationSucceeded() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("af3a6571", new Object[]{this});
                        return;
                    }
                    super.onAuthenticationSucceeded();
                    AuthenticatorLOG.faceInfo("auth onAuthenticationSucceeded ");
                    IAuthenticator.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.onAuthStatus(100);
                    }
                    AuthFace.access$002(AuthFace.this, 100);
                    conditionVariable.open();
                }

                @Override // org.ifaa.android.manager.face.IFAAFaceManager.AuthenticatorCallback
                public void onAuthenticationFailed(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2c3d6e88", new Object[]{this, new Integer(i)});
                        return;
                    }
                    super.onAuthenticationFailed(i);
                    AuthenticatorLOG.faceInfo("auth onAuthenticationFailed: " + i);
                    IAuthenticator.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.onAuthStatus(103);
                    }
                    AuthFace.access$002(AuthFace.this, 103);
                    conditionVariable.open();
                }
            });
            if (!conditionVariable.block(5000L)) {
                AuthenticatorLOG.faceInfo("auth timeout ");
                this.resultCode = 113;
                if (callback != null) {
                    callback.onAuthStatus(113);
                }
            }
            FaceAuthenticator.access$100(FaceAuthenticator.this).cancel();
            return this.resultCode;
        }
    }

    @Override // com.alipay.security.mobile.ifaa.auth.IAuthenticator
    public void register(final AuthenticatorMessage authenticatorMessage, final IAuthenticator.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("452a2a05", new Object[]{this, authenticatorMessage, callback});
        } else {
            new Thread(new Runnable() { // from class: com.alipay.security.mobile.ifaa.auth.FaceAuthenticator.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    AuthenticatorResponse access$200 = FaceAuthenticator.access$200(FaceAuthenticator.this, authenticatorMessage, TACommands.COMMAND_REG, 8);
                    AuthenticatorLOG.faceInfo("face register response onresult: " + access$200.getResult());
                    IAuthenticator.Callback callback2 = callback;
                    if (callback2 == null) {
                        return;
                    }
                    callback2.onResult(access$200);
                }
            }, THREADNAME).start();
        }
    }

    @Override // com.alipay.security.mobile.ifaa.auth.IAuthenticator
    public void authenticate(final AuthenticatorMessage authenticatorMessage, final IAuthenticator.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8af0237", new Object[]{this, authenticatorMessage, callback});
        } else {
            new Thread(new Runnable() { // from class: com.alipay.security.mobile.ifaa.auth.FaceAuthenticator.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    AuthFace authFace = new AuthFace();
                    AuthenticatorLOG.faceInfo("start to face authenticate");
                    int process = authFace.process(callback);
                    if (process == 100) {
                        AuthenticatorResponse access$200 = FaceAuthenticator.access$200(FaceAuthenticator.this, authenticatorMessage, TACommands.COMMAND_AUTH, 9);
                        AuthenticatorLOG.faceInfo("face auth response onresult: " + access$200.getResult());
                        IAuthenticator.Callback callback2 = callback;
                        if (callback2 == null) {
                            return;
                        }
                        callback2.onResult(access$200);
                        return;
                    }
                    Bundle constructResultBundle = Response.constructResultBundle(9, process);
                    Message message = new Message();
                    message.setData(constructResultBundle);
                    AuthenticatorResponse authenticatorResponse = AuthenticatorResponseUtil.getAuthenticatorResponse(message);
                    AuthenticatorLOG.faceInfo("face auth response onresult: " + authenticatorResponse.getResult());
                    IAuthenticator.Callback callback3 = callback;
                    if (callback3 == null) {
                        return;
                    }
                    callback3.onResult(authenticatorResponse);
                }
            }, THREADNAME).start();
        }
    }

    @Override // com.alipay.security.mobile.ifaa.auth.IAuthenticator
    public void deregister(final AuthenticatorMessage authenticatorMessage, final IAuthenticator.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39611586", new Object[]{this, authenticatorMessage, callback});
        } else {
            new Thread(new Runnable() { // from class: com.alipay.security.mobile.ifaa.auth.FaceAuthenticator.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    AuthenticatorResponse access$200 = FaceAuthenticator.access$200(FaceAuthenticator.this, authenticatorMessage, TACommands.COMMAND_DEREG, 10);
                    AuthenticatorLOG.faceInfo("face deregister response onresult: " + access$200.getResult());
                    IAuthenticator.Callback callback2 = callback;
                    if (callback2 == null) {
                        return;
                    }
                    callback2.onResult(access$200);
                }
            }, THREADNAME).start();
        }
    }

    public int getUserStatusWithToken(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94c5904", new Object[]{this, str})).intValue();
        }
        AuthenticatorLOG.faceInfo("ifaa getUserStatus enter []");
        long currentTimeMillis = System.currentTimeMillis();
        if (!CommonUtils.isBlank(str)) {
            FutureTask futureTask = new FutureTask(new Callable<Integer>() { // from class: com.alipay.security.mobile.ifaa.auth.FaceAuthenticator.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                /* renamed from: call */
                public Integer mo597call() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Integer) ipChange2.ipc$dispatch("5404efcc", new Object[]{this});
                    }
                    try {
                        AuthenticatorLOG.faceInfo("ifaaManagerAdapter getUserStatus async call " + str);
                        return Integer.valueOf(FaceAuthenticator.access$400(FaceAuthenticator.this).getUserStatus(str));
                    } catch (Throwable th) {
                        AuthenticatorLOG.faceInfo("ifaaManagerAdapter getUserStatus " + th.toString());
                        return null;
                    }
                }
            });
            AsyncCall asyncCall = new AsyncCall();
            Integer num = (Integer) asyncCall.callFunc(futureTask);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            asyncCall.getException();
            if (num == null) {
                return -1;
            }
            AuthenticatorLOG.faceInfo("ifaa getUserStatus exit [userstatus:" + num.intValue() + "] [timecost:" + currentTimeMillis2 + riy.ARRAY_END_STR);
            return num.intValue();
        }
        AuthenticatorLOG.faceInfo("ifaa checkUserStatus userID null");
        return 2;
    }

    @Override // com.alipay.security.mobile.ifaa.auth.IAuthenticator
    public int getUserStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c85f15d7", new Object[]{this, str})).intValue();
        }
        AuthenticatorLOG.faceInfo("ifaa getUserStatus enter []");
        if (!CommonUtils.isBlank(str)) {
            return getUserStatusWithToken(str + "_4");
        }
        AuthenticatorLOG.faceInfo("ifaa checkUserStatus userID null");
        return 2;
    }

    @Override // com.alipay.security.mobile.ifaa.auth.IAuthenticator
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        AuthenticatorLOG.faceInfo("ifaa face cancel");
        this.ifaaFaceManager.cancel();
    }

    @Override // com.alipay.security.mobile.ifaa.auth.IAuthenticator
    public int getEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84d1ce05", new Object[]{this})).intValue();
        }
        int enabled = this.ifaaManagerAdapter.getEnabled(Constants.TYPE_FACE);
        AuthenticatorLOG.faceInfo("ifaa getEnabled " + enabled);
        return enabled;
    }

    @Override // com.alipay.security.mobile.ifaa.auth.IAuthenticator
    public int[] getIDList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("facbd36e", new Object[]{this});
        }
        int[] iDList = this.ifaaManagerAdapter.getIDList(Constants.TYPE_FACE);
        AuthenticatorLOG.faceInfo("ifaa getIDList " + Arrays.toString(iDList));
        return iDList;
    }

    @Override // com.alipay.security.mobile.ifaa.auth.IAuthenticator
    public boolean hasEnroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fe6486b", new Object[]{this})).booleanValue();
        }
        AuthenticatorLOG.faceInfo("ifaa face hasenroll");
        int[] iDList = getIDList();
        return iDList != null && iDList.length > 0;
    }

    @Override // com.alipay.security.mobile.ifaa.auth.IAuthenticator
    public int startBIOManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("346dec81", new Object[]{this})).intValue();
        }
        AuthenticatorLOG.faceInfo("ifaa face startBioManager");
        this.ifaaManagerAdapter.startBIOManager(Constants.TYPE_FACE);
        return 0;
    }

    private AuthenticatorResponse sendMessageToTee(AuthenticatorMessage authenticatorMessage, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthenticatorResponse) ipChange.ipc$dispatch("15c50119", new Object[]{this, authenticatorMessage, new Integer(i), new Integer(i2)});
        }
        try {
            IFAFMessage parseIFAFMessage = IFAFMessage.parseIFAFMessage(authenticatorMessage.getData());
            Result sendCommandAndData = TAInterationV1.sendCommandAndData(this.mContext, i, Base64.decode(parseIFAFMessage.getSignedData().getIdentifyData(), 8));
            if (sendCommandAndData.getStatus() != 0) {
                AuthenticatorLOG.faceErr("TA auth type " + i + " onResult not 0, " + sendCommandAndData.getStatusStringIFAA2());
            }
            return buildResponse(sendCommandAndData, parseIFAFMessage.getHeader(), i2);
        } catch (Throwable th) {
            AuthenticatorLOG.faceInfo(th);
            return buildResponse(new Result(-1, null), null, i2);
        }
    }

    private AuthenticatorResponse buildResponse(Result result, OperationHeader operationHeader, int i) {
        Bundle constructResultBundle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthenticatorResponse) ipChange.ipc$dispatch("de312419", new Object[]{this, result, operationHeader, new Integer(i)});
        }
        if (result.getStatus() == 0) {
            constructResultBundle = Response.constructResultBundle(i, 100, Response.makeResponseData(this.ifaaManagerAdapter.getDeviceModel(), operationHeader, result));
        } else {
            constructResultBundle = Response.constructResultBundle(i, 101);
        }
        Message message = new Message();
        message.setData(constructResultBundle);
        return AuthenticatorResponseUtil.getAuthenticatorResponse(message);
    }
}
