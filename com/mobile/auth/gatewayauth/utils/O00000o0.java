package com.mobile.auth.gatewayauth.utils;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.manager.FeatureManager;
import java.util.concurrent.ConcurrentHashMap;
import tb.riy;

/* loaded from: classes4.dex */
public class O00000o0 {
    private static O00000o0 O00000Oo;
    private ConcurrentHashMap<String, StringBuffer> O000000o = new ConcurrentHashMap<>();

    private O00000o0() {
    }

    public static O00000o0 O000000o() {
        try {
            if (O00000Oo == null) {
                synchronized (O00000o0.class) {
                    if (O00000Oo == null) {
                        O00000Oo = new O00000o0();
                    }
                }
            }
            return O00000Oo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public String O000000o(String str) {
        StringBuffer remove;
        try {
            if (FeatureManager.getInstance().get(FeatureManager.FEATURE_KEY_PERFORMANCE_TRACKER) != null || (remove = this.O000000o.remove(str)) == null) {
                return null;
            }
            return remove.toString();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public void O000000o(String str, String str2, long j) {
        try {
            O000000o(str, str2, O0000Oo.O000000o(j));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O000000o(String str, String str2, String str3) {
        try {
            if (FeatureManager.getInstance().get(FeatureManager.FEATURE_KEY_PERFORMANCE_TRACKER) != null) {
                return;
            }
            StringBuffer stringBuffer = null;
            if (!this.O000000o.containsKey(str)) {
                synchronized (this.O000000o) {
                    if (!this.O000000o.containsKey(str)) {
                        stringBuffer = new StringBuffer(str);
                        this.O000000o.put(str, stringBuffer);
                    }
                }
            } else {
                stringBuffer = this.O000000o.get(str);
            }
            stringBuffer.append(riy.ARRAY_START_STR + str2 + ":" + str3 + riy.ARRAY_END_STR);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
