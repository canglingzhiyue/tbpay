package com.mobile.auth.gatewayauth.model.psc_info_upload;

import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.model.TopErrorResponse;
import com.nirvana.tools.jsoner.a;
import com.nirvana.tools.jsoner.d;
import com.nirvana.tools.jsoner.e;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AllRBInfo implements e {
    private static final String KEY_RESPONSE = "alibaba_aliqin_pns_vendor_querylist_response";
    private static final String KEY_TOP_ERROR_RESPONSE = "error_response";
    private TopErrorResponse errorResponse;
    private PnsVendorQueryResponse response;

    public static AllRBInfo fromJson(String str) {
        try {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return (AllRBInfo) a.a(new JSONObject(str), (d<Object>) new d<AllRBInfo>() { // from class: com.mobile.auth.gatewayauth.model.psc_info_upload.AllRBInfo.1
                    }, (List<Field>) null);
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
        if (jSONObject != null) {
            try {
                setResponse((PnsVendorQueryResponse) a.a(jSONObject.optJSONObject(KEY_RESPONSE), (d<Object>) new d<PnsVendorQueryResponse>() { // from class: com.mobile.auth.gatewayauth.model.psc_info_upload.AllRBInfo.2
                }, (List<Field>) null));
                setErrorResponse((TopErrorResponse) a.a(jSONObject.optJSONObject(KEY_TOP_ERROR_RESPONSE), (d<Object>) new d<TopErrorResponse>() { // from class: com.mobile.auth.gatewayauth.model.psc_info_upload.AllRBInfo.3
                }, (List<Field>) null));
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public TopErrorResponse getErrorResponse() {
        try {
            return this.errorResponse;
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

    public PnsVendorQueryResponse getResponse() {
        try {
            return this.response;
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

    public void setErrorResponse(TopErrorResponse topErrorResponse) {
        try {
            this.errorResponse = topErrorResponse;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setResponse(PnsVendorQueryResponse pnsVendorQueryResponse) {
        try {
            this.response = pnsVendorQueryResponse;
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
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(KEY_RESPONSE, this.response == null ? new JSONObject() : this.response.toJson());
                jSONObject.put(KEY_TOP_ERROR_RESPONSE, this.errorResponse == null ? new JSONObject() : this.errorResponse.toJson());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
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
