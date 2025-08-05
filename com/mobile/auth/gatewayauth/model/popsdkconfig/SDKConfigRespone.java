package com.mobile.auth.gatewayauth.model.popsdkconfig;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.nirvana.tools.jsoner.JsonerTag;
import com.nirvana.tools.jsoner.a;
import com.nirvana.tools.jsoner.d;
import com.nirvana.tools.jsoner.e;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class SDKConfigRespone implements e {
    @JsonerTag(keyName = "Code")
    private String Code;
    @JsonerTag(keyName = "Data")
    private SDKConfigData Data;
    @JsonerTag(keyName = "Message")
    private String Message;
    @JsonerTag(keyName = "RequestId")
    private String RequestId;

    @Override // com.nirvana.tools.jsoner.e
    public void fromJson(JSONObject jSONObject) {
        try {
            a.a(jSONObject, this, (List<Field>) null);
            if (jSONObject == null) {
                return;
            }
            setData((SDKConfigData) a.a(jSONObject.optJSONObject("Data"), (d<Object>) new d<SDKConfigData>() { // from class: com.mobile.auth.gatewayauth.model.popsdkconfig.SDKConfigRespone.1
            }, (List<Field>) null));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public String getCode() {
        try {
            return this.Code;
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

    public SDKConfigData getData() {
        try {
            return this.Data;
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

    public String getMessage() {
        try {
            return this.Message;
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

    public String getRequestId() {
        try {
            return this.RequestId;
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

    public void setCode(String str) {
        try {
            this.Code = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setData(SDKConfigData sDKConfigData) {
        try {
            this.Data = sDKConfigData;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setMessage(String str) {
        try {
            this.Message = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setRequestId(String str) {
        try {
            this.RequestId = str;
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
            return a.a(this, (List<Field>) null);
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
