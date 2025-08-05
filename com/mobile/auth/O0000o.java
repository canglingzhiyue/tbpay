package com.mobile.auth;

import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.sys.BizContext;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class O0000o {
    private String O0000Ooo;
    private long O0000o;
    private int O0000o0O;
    private long O0000oO0;
    private long O0000oo0;
    private StringBuffer O0000oOO = new StringBuffer();
    private String O00000o0 = "";
    private String O00000oO = "";
    private String O0000o0 = "";
    private String O0000o00 = "";
    private String O0000o0o = "";
    private String O000000o = "1.1";
    private long O0000oOo = System.currentTimeMillis();
    private String O00000Oo = O000000o(this.O0000oOo);
    private String O00000o = "";
    private String O00000oo = "";
    private String O0000O0o = Build.BRAND;
    private String O0000OOo = Build.MODEL;
    private String O0000Oo0 = "Android";
    private String O0000Oo = Build.VERSION.RELEASE;
    private String O0000OoO = "SDK-JJ-v3.7.4";
    private String O0000oO = "0";
    private String O0000oo = "";

    public O0000o(String str) {
        this.O0000Ooo = str;
    }

    public static String O000000o(long j) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.CHINA).format(new Date(j));
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                return "";
            } catch (Throwable th2) {
                try {
                    ExceptionProcessor.processException(th2);
                    return null;
                } catch (Throwable th3) {
                    ExceptionProcessor.processException(th3);
                    return null;
                }
            }
        }
    }

    public O0000o O000000o(int i) {
        try {
            this.O0000o0O = i;
            return this;
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

    public O0000o O000000o(String str) {
        try {
            this.O00000o = str;
            return this;
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

    public O0000o O00000Oo(long j) {
        try {
            this.O0000o = j;
            return this;
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

    public O0000o O00000Oo(String str) {
        try {
            this.O00000oO = str;
            return this;
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

    public O0000o O00000o(String str) {
        try {
            this.O0000o00 = str;
            return this;
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

    public O0000o O00000o0(String str) {
        try {
            this.O00000oo = str;
            return this;
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

    public O0000o O00000oO(String str) {
        try {
            this.O0000o0 = str;
            return this;
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

    public O0000o O00000oo(String str) {
        try {
            this.O0000o0o = str;
            return this;
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

    public O0000o O0000O0o(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.O0000oO = str;
            }
            return this;
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

    public O0000o O0000OOo(String str) {
        try {
            StringBuffer stringBuffer = this.O0000oOO;
            stringBuffer.append(str);
            stringBuffer.append("\n");
            return this;
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

    public O0000o O0000Oo0(String str) {
        try {
            this.O0000oo = str;
            return this;
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

    public String toString() {
        try {
            this.O0000oo0 = System.currentTimeMillis();
            this.O0000oO0 = this.O0000oo0 - this.O0000oOo;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", this.O000000o);
            jSONObject.put("t", this.O00000Oo);
            jSONObject.put("tag", this.O00000o0);
            jSONObject.put("ai", this.O00000o);
            jSONObject.put(AppIconSetting.DEFAULT_LARGE_ICON, this.O00000oO);
            jSONObject.put(NotificationStyle.NOTIFICATION_STYLE, this.O00000oo);
            jSONObject.put("br", this.O0000O0o);
            jSONObject.put("ml", this.O0000OOo);
            jSONObject.put("os", this.O0000Oo0);
            jSONObject.put("ov", this.O0000Oo);
            jSONObject.put(BizContext.KEY_SDK_VERSION, this.O0000OoO);
            jSONObject.put("ri", this.O0000Ooo);
            jSONObject.put("api", this.O0000o00);
            jSONObject.put("p", this.O0000o0);
            jSONObject.put("rt", this.O0000o0O);
            jSONObject.put("msg", this.O0000o0o);
            jSONObject.put("st", this.O0000o);
            jSONObject.put(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP, this.O0000oO0);
            jSONObject.put("ot", this.O0000oO);
            jSONObject.put("ep", this.O0000oOO.toString());
            jSONObject.put(AdvertisementOption.AD_INSTALL_PACKAGE, this.O0000oo);
            return jSONObject.toString();
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                return "";
            } catch (Throwable th2) {
                try {
                    ExceptionProcessor.processException(th2);
                    return null;
                } catch (Throwable th3) {
                    ExceptionProcessor.processException(th3);
                    return null;
                }
            }
        }
    }
}
