package com.mobile.auth.gatewayauth.model.ctcctoken;

import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.nirvana.tools.jsoner.a;
import com.nirvana.tools.jsoner.d;
import com.nirvana.tools.jsoner.e;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class CTCCTokenRet implements e {
    private Data data;
    private String msg;
    private String reqId;
    private int result;

    public static CTCCTokenRet fromJson(String str) {
        try {
            try {
                if (!TextUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    CTCCTokenRet cTCCTokenRet = (CTCCTokenRet) a.a(jSONObject, (d<Object>) new d<CTCCTokenRet>() { // from class: com.mobile.auth.gatewayauth.model.ctcctoken.CTCCTokenRet.1
                    }, (List<Field>) null);
                    cTCCTokenRet.setData((Data) a.a(jSONObject.optJSONObject("data"), (d<Object>) new d<Data>() { // from class: com.mobile.auth.gatewayauth.model.ctcctoken.CTCCTokenRet.2
                    }, (List<Field>) null));
                    return cTCCTokenRet;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
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

    @Override // com.nirvana.tools.jsoner.e
    public void fromJson(JSONObject jSONObject) {
        try {
            a.a(jSONObject, this, (List<Field>) null);
            if (jSONObject == null) {
                return;
            }
            setData((Data) a.a(jSONObject.optJSONObject("data"), (d<Object>) new d<Data>() { // from class: com.mobile.auth.gatewayauth.model.ctcctoken.CTCCTokenRet.3
            }, (List<Field>) null));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public Data getData() {
        try {
            return this.data;
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

    public String getMsg() {
        try {
            return this.msg;
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

    public String getReqId() {
        try {
            return this.reqId;
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

    public int getResult() {
        try {
            return this.result;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return -1;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return -1;
            }
        }
    }

    public void setData(Data data) {
        try {
            this.data = data;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setMsg(String str) {
        try {
            this.msg = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setReqId(String str) {
        try {
            this.reqId = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setResult(int i) {
        try {
            this.result = i;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    @Override // com.nirvana.tools.jsoner.e
    public JSONObject toJson() {
        try {
            JSONObject a2 = a.a(this, (List<Field>) null);
            try {
                a2.put("data", this.data == null ? new JSONObject() : this.data.toJson());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return a2;
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
}
