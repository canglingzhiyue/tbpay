package com.taobao.login4android.qrcode.task;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.qrcode.callback.ICallback;
import com.taobao.login4android.qrcode.result.LoginResult;
import com.taobao.login4android.qrcode.util.ThreadPool;
import tb.kge;

/* loaded from: classes7.dex */
public class QrLoginTask2 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ICallback<LoginResult> mCallback;
    private long mQrCheckInterval;
    public volatile boolean mStop;
    private String mToken;

    static {
        kge.a(1887115276);
        kge.a(-1390502639);
    }

    public QrLoginTask2(String str, long j, ICallback<LoginResult> iCallback) {
        this.mQrCheckInterval = 3000L;
        this.mToken = str;
        this.mQrCheckInterval = j;
        this.mCallback = iCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.login4android.qrcode.task.QrLoginTask2.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r10
            java.lang.String r2 = "5c510192"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            com.taobao.login4android.qrcode.callback.ICallback<com.taobao.login4android.qrcode.result.LoginResult> r0 = r10.mCallback
            boolean r1 = r10.mStop
            if (r1 != 0) goto Lad
            java.lang.String r1 = r10.mToken
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L22
            goto Lad
        L22:
            com.taobao.login4android.qrcode.result.LoginResult r1 = new com.taobao.login4android.qrcode.result.LoginResult
            r1.<init>()
            r4 = 0
            java.lang.String r5 = r10.mToken     // Catch: java.lang.Throwable -> L2f
            com.ali.user.mobile.rpc.login.model.DefaultLoginResponseData r5 = com.taobao.login4android.UIHavanaComponent.qrLogin(r5)     // Catch: java.lang.Throwable -> L2f
            goto L34
        L2f:
            r5 = move-exception
            r5.printStackTrace()
            r5 = r4
        L34:
            r6 = 3000(0xbb8, float:4.204E-42)
            r7 = 14031(0x36cf, float:1.9662E-41)
            if (r5 == 0) goto L81
            int r8 = r5.code
            r9 = 14030(0x36ce, float:1.966E-41)
            if (r8 != r9) goto L41
            goto L82
        L41:
            int r8 = r5.code
            if (r8 != r7) goto L49
            r1.setResultCode(r7)
            goto L82
        L49:
            int r8 = r5.code
            if (r8 != r6) goto L5c
            T r8 = r5.returnValue
            if (r8 == 0) goto L5c
            T r4 = r5.returnValue
            com.ali.user.mobile.rpc.login.model.LoginReturnData r4 = (com.ali.user.mobile.rpc.login.model.LoginReturnData) r4
            com.ali.user.mobile.base.helper.LoginDataHelper.processLoginReturnData(r2, r4)
            r1.setResultCode(r6)
            goto L81
        L5c:
            int r2 = r5.code
            r1.setResultCode(r2)
            java.lang.String r2 = r5.actionType
            r1.setActionType(r2)
            T r2 = r5.returnValue
            if (r2 == 0) goto L7b
            T r2 = r5.returnValue
            com.ali.user.mobile.rpc.login.model.LoginReturnData r2 = (com.ali.user.mobile.rpc.login.model.LoginReturnData) r2
            java.lang.String r2 = r2.h5Url
            r1.setUrl(r2)
            T r2 = r5.returnValue
            com.ali.user.mobile.rpc.login.model.LoginReturnData r2 = (com.ali.user.mobile.rpc.login.model.LoginReturnData) r2
            r1.setLoginData(r2)
            goto L81
        L7b:
            r1.setUrl(r4)
            r1.setLoginData(r4)
        L81:
            r2 = 0
        L82:
            if (r2 == 0) goto L89
            boolean r4 = r10.mStop
            if (r4 == 0) goto L89
            r2 = 0
        L89:
            if (r2 == 0) goto L9a
            if (r0 == 0) goto L96
            int r2 = r1.getResultCode()
            if (r7 != r2) goto L96
            r0.onScaned(r1)
        L96:
            r10.execute()
            return
        L9a:
            r10.release()
            if (r0 == 0) goto Lac
            int r2 = r1.getResultCode()
            if (r6 != r2) goto La9
            r0.onSuccess(r1)
            return
        La9:
            r0.onFailure(r1)
        Lac:
            return
        Lad:
            r10.release()
            if (r0 == 0) goto Lbc
            com.taobao.login4android.qrcode.result.LoginResult r0 = new com.taobao.login4android.qrcode.result.LoginResult
            r0.<init>()
            r1 = -104(0xffffffffffffff98, float:NaN)
            r0.setResultCode(r1)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.login4android.qrcode.task.QrLoginTask2.run():void");
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.mStop = true;
        }
    }

    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        ThreadPool.getInstance().remove(this);
        ThreadPool.getInstance().postDelayed(this, this.mQrCheckInterval);
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        this.mStop = true;
        this.mToken = null;
        release();
        ThreadPool.getInstance().remove(this);
    }
}
