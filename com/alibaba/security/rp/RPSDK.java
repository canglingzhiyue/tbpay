package com.alibaba.security.rp;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.realidentity.RPEnv;
import com.alibaba.security.realidentity.RPEventListener;
import com.alibaba.security.realidentity.RPResult;
import com.alibaba.security.realidentity.RPVerify;
import com.alibaba.security.rp.scanface.AuditResultCallback;
import com.android.alibaba.ip.runtime.IpChange;

@Deprecated
/* loaded from: classes3.dex */
public class RPSDK {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Context mCtx;

    @Deprecated
    /* loaded from: classes3.dex */
    public enum AUDIT {
        AUDIT_EXCEPTION(-2),
        AUDIT_NOT(-1),
        AUDIT_IN_AUDIT(0),
        AUDIT_PASS(1),
        AUDIT_FAIL(2);
        
        public int audit;

        AUDIT(int i) {
            this.audit = i;
        }

        public int getAudit() {
            return this.audit;
        }
    }

    @Deprecated
    /* loaded from: classes3.dex */
    public interface RPCompletedListener {
        void onAuditResult(AUDIT audit);
    }

    @Deprecated
    /* loaded from: classes3.dex */
    public enum RPSDKEnv {
        RPSDKEnv_ONLINE(0),
        RPSDKEnv_PRE(1),
        RPSDKEnv_DAILY(2);
        
        public int env;

        RPSDKEnv(int i) {
            this.env = i;
        }
    }

    public static /* synthetic */ AUDIT access$000(RPResult rPResult) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AUDIT) ipChange.ipc$dispatch("bb4c0ce7", new Object[]{rPResult}) : changeToAudit(rPResult);
    }

    public static AUDIT changeToAudit(RPResult rPResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AUDIT) ipChange.ipc$dispatch("2a159247", new Object[]{rPResult});
        }
        if (rPResult == RPResult.AUDIT_FAIL) {
            return AUDIT.AUDIT_FAIL;
        }
        if (rPResult == RPResult.AUDIT_PASS) {
            return AUDIT.AUDIT_PASS;
        }
        if (rPResult == RPResult.AUDIT_IN_AUDIT) {
            return AUDIT.AUDIT_IN_AUDIT;
        }
        if (rPResult == RPResult.AUDIT_NOT) {
            return AUDIT.AUDIT_NOT;
        }
        if (rPResult == RPResult.AUDIT_EXCEPTION) {
            return AUDIT.AUDIT_EXCEPTION;
        }
        return AUDIT.AUDIT_NOT;
    }

    @Deprecated
    public static Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[0]) : mCtx;
    }

    @Deprecated
    public static String getDeviceInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("10d90f1f", new Object[0]) : RPVerify.getDeviceInfo();
    }

    @Deprecated
    public static void initialize(RPSDKEnv rPSDKEnv, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2611d93e", new Object[]{rPSDKEnv, context});
            return;
        }
        mCtx = context.getApplicationContext();
        RPEnv rPEnv = RPEnv.ONLINE;
        if (rPSDKEnv == RPSDKEnv.RPSDKEnv_DAILY) {
            rPEnv = RPEnv.DAILY;
        } else if (rPSDKEnv == RPSDKEnv.RPSDKEnv_PRE) {
            rPEnv = RPEnv.PRE;
        } else if (rPSDKEnv == RPSDKEnv.RPSDKEnv_ONLINE) {
            rPEnv = RPEnv.ONLINE;
        }
        RPVerify.init(context, rPEnv);
    }

    @Deprecated
    public static void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{context});
        } else {
            mCtx = context;
        }
    }

    @Deprecated
    public static void start(String str, Context context, final RPCompletedListener rPCompletedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("796ce696", new Object[]{str, context, rPCompletedListener});
        } else {
            RPVerify.start(context, str, new RPEventListener() { // from class: com.alibaba.security.rp.RPSDK.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.security.realidentity.RPEventListener
                public void onFinish(RPResult rPResult, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("84fe467c", new Object[]{this, rPResult, str2, str3});
                        return;
                    }
                    RPCompletedListener rPCompletedListener2 = RPCompletedListener.this;
                    if (rPCompletedListener2 == null) {
                        return;
                    }
                    rPCompletedListener2.onAuditResult(RPSDK.access$000(rPResult));
                }
            });
        }
    }

    @Deprecated
    public static void startVerifyByNative(String str, final AuditResultCallback auditResultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa955e", new Object[]{str, auditResultCallback});
            return;
        }
        Context context = mCtx;
        if (context == null) {
            return;
        }
        RPVerify.startByNative(context, str, new RPEventListener() { // from class: com.alibaba.security.rp.RPSDK.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.security.realidentity.RPEventListener
            public void onFinish(RPResult rPResult, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("84fe467c", new Object[]{this, rPResult, str2, str3});
                    return;
                }
                AuditResultCallback auditResultCallback2 = AuditResultCallback.this;
                if (auditResultCallback2 == null) {
                    return;
                }
                auditResultCallback2.onAuditStatus(rPResult.code);
            }
        });
    }

    @Deprecated
    public static void startVerifyByUrl(String str, Context context, final RPCompletedListener rPCompletedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d285651", new Object[]{str, context, rPCompletedListener});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            RPVerify.startWithUrl(context, str, new RPEventListener() { // from class: com.alibaba.security.rp.RPSDK.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.security.realidentity.RPEventListener
                public void onFinish(RPResult rPResult, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("84fe467c", new Object[]{this, rPResult, str2, str3});
                        return;
                    }
                    RPCompletedListener rPCompletedListener2 = RPCompletedListener.this;
                    if (rPCompletedListener2 == null) {
                        return;
                    }
                    rPCompletedListener2.onAuditResult(RPSDK.access$000(rPResult));
                }
            });
        }
    }

    @Deprecated
    public static void initialize(RPSDKEnv rPSDKEnv, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b66f88", new Object[]{rPSDKEnv, context, str});
            return;
        }
        mCtx = context.getApplicationContext();
        RPEnv rPEnv = RPEnv.ONLINE;
        if (rPSDKEnv == RPSDKEnv.RPSDKEnv_DAILY) {
            rPEnv = RPEnv.DAILY;
        } else if (rPSDKEnv == RPSDKEnv.RPSDKEnv_PRE) {
            rPEnv = RPEnv.PRE;
        } else if (rPSDKEnv == RPSDKEnv.RPSDKEnv_ONLINE) {
            rPEnv = RPEnv.ONLINE;
        }
        RPVerify.init(context, rPEnv, str);
    }
}
