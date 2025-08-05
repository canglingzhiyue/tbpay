package com.unicom.online.account.shield;

import android.content.Context;
import android.text.TextUtils;
import com.mobile.auth.OO0O0o0;
import com.mobile.auth.OO0OOo0;
import com.mobile.auth.OOO;
import com.mobile.auth.OOO0O0O;
import com.mobile.auth.OOO0o0;
import com.mobile.auth.OOOO00O;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.oOo00;
import org.json.JSONObject;
import tb.dck;

/* loaded from: classes9.dex */
public class UniAccountHelper {
    public static final int CU_GET_TOKEN_IT = 2;
    private static final int SUCCESS = 100;
    private static volatile UniAccountHelper s_instance;
    private Context mContext = null;

    private UniAccountHelper() {
    }

    static /* synthetic */ boolean access$000(UniAccountHelper uniAccountHelper) {
        try {
            return uniAccountHelper.getUseCacheFlag();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return false;
        }
    }

    static /* synthetic */ Context access$100(UniAccountHelper uniAccountHelper) {
        try {
            return uniAccountHelper.mContext;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00df A[Catch: Throwable -> 0x0175, TRY_LEAVE, TryCatch #1 {Throwable -> 0x0175, blocks: (B:3:0x000c, B:6:0x0013, B:8:0x0017, B:11:0x0026, B:13:0x002c, B:15:0x0047, B:17:0x0067, B:19:0x006f, B:21:0x0073, B:23:0x007f, B:25:0x008a, B:27:0x0091, B:29:0x0097, B:33:0x00a1, B:35:0x00a8, B:37:0x00b6, B:39:0x00c0, B:42:0x00cb, B:45:0x00df, B:46:0x00f1, B:47:0x010a, B:49:0x0125, B:51:0x013d, B:53:0x0141, B:56:0x0147, B:58:0x014b, B:61:0x0153, B:64:0x0171, B:43:0x00d9, B:22:0x007c), top: B:72:0x000c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void cuPreGetToken(int r16, final int r17, final java.lang.String r18, final com.unicom.online.account.shield.ResultListener r19) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unicom.online.account.shield.UniAccountHelper.cuPreGetToken(int, int, java.lang.String, com.unicom.online.account.shield.ResultListener):void");
    }

    private String getHostName() {
        try {
            OO0OOo0.O000000o();
            return OO0OOo0.O00000o();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static UniAccountHelper getInstance() {
        try {
            if (s_instance == null) {
                synchronized (UniAccountHelper.class) {
                    if (s_instance == null) {
                        s_instance = new UniAccountHelper();
                    }
                }
            }
            return s_instance;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    private boolean getUseCacheFlag() {
        try {
            return OOO0O0O.O000000o;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return false;
        }
    }

    private void initFail(int i, ResultListener resultListener, String str) {
        try {
            OO0O0o0.O000000o("type:" + i + "\nmsg:" + str);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("resultCode", 410021);
                jSONObject.put("resultMsg", str);
                jSONObject.put("resultData", "");
                jSONObject.put(dck.COL_SEQ, "");
                if (resultListener == null) {
                    return;
                }
                resultListener.onResult(jSONObject.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    private UniAccountHelper setUseCacheFlag(boolean z) {
        try {
            OOO0O0O.O000000o = z;
            return s_instance;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public String cuDebugInfo(String str) {
        try {
            return this.mContext == null ? "sdk 未初始化, context 为空" : OO0OOo0.O000000o().O000000o(str);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public void cuGetToken(int i, ResultListener resultListener) {
        try {
            cuPreGetToken(i, 2, "cuPreGetToken", resultListener);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public String getSdkVersion() {
        try {
            OO0OOo0.O000000o();
            return OO0OOo0.O00000Oo();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public UniAccountHelper init(Context context, String str) {
        try {
            return init(context, str, false);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public UniAccountHelper init(Context context, String str, boolean z) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str)) {
                    if (this.mContext != null) {
                        OO0O0o0.O000000o("重复初始化");
                        return null;
                    }
                    this.mContext = context.getApplicationContext();
                    OO0OOo0 O000000o = OO0OOo0.O000000o();
                    OOOO00O.O00000Oo();
                    OOOO00O.O00000o0("cuPreGetToken");
                    OOOO00O.O00000o0();
                    if (context != null) {
                        try {
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str)) {
                            if (!TextUtils.isEmpty(OOO.O00000o0())) {
                                OOO0o0.O00000oO("不可重复初始化");
                            } else {
                                OOO0O0O.O000000o = false;
                                O000000o.O000000o = context.getApplicationContext();
                                OOO.O00000o0(str);
                                OOO.O00000o(str);
                                OOO.O0000O0o(OOOO00O.O00000o0(O000000o.O000000o));
                                OOO.O00000oO();
                                OOO0o0.O00000o0("backupIp=" + OOO.O000000o);
                                OO0OOo0.O00000Oo("ali.wosms.cn");
                                OO0OOo0.O00000oo();
                                OO0OOo0.O00000o0();
                            }
                            oOo00.O000000o = str;
                            return s_instance;
                        }
                    }
                    OOO0o0.O00000oO("初始化参数不能为空");
                    oOo00.O000000o = str;
                    return s_instance;
                }
            } catch (Throwable th) {
                ExceptionProcessor.processException(th);
                return null;
            }
        }
        OO0O0o0.O000000o("初始化参数不能为空");
        return null;
    }

    public UniAccountHelper initHostName(String str) {
        try {
            OO0OOo0.O000000o();
            if (OO0OOo0.O00000Oo(str)) {
                return s_instance;
            }
            OO0O0o0.O000000o("初始化参数错误");
            return null;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public void releaseNetwork() {
        try {
            OO0OOo0.O000000o();
            OO0OOo0.O0000O0o();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public UniAccountHelper setCertFingerType(String str) {
        try {
            if (!str.equalsIgnoreCase("MD5") && !str.equalsIgnoreCase("SHA1") && !str.equalsIgnoreCase("SHA256") && !str.equalsIgnoreCase("sm3")) {
                return null;
            }
            OOO0O0O.O00000Oo = str.toLowerCase();
            return s_instance;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public void setLogEnable(boolean z) {
        try {
            OO0O0o0.O000000o(z);
            OO0OOo0.O000000o();
            OO0OOo0.O000000o(z);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }
}
