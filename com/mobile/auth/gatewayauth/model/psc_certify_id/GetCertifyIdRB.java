package com.mobile.auth.gatewayauth.model.psc_certify_id;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.model.TopErrorResponse;
import com.nirvana.tools.jsoner.JsonerTag;
import com.nirvana.tools.jsoner.a;
import com.nirvana.tools.jsoner.d;
import com.nirvana.tools.jsoner.e;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class GetCertifyIdRB implements e {
    private static final String KEY_RESPONSE = "alibaba_aliqin_ta_pns_living_create_response";
    private static final String KEY_TOP_ERROR_RESPONSE = "error_response";
    @JsonerTag(keyName = KEY_TOP_ERROR_RESPONSE)
    private TopErrorResponse errorResponse;
    @JsonerTag(keyName = KEY_RESPONSE)
    private GetCertifyIdTopResponse response;

    @Override // com.nirvana.tools.jsoner.e
    public void fromJson(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                setResponse((GetCertifyIdTopResponse) a.a(jSONObject.optJSONObject(KEY_RESPONSE), (d<Object>) new d<GetCertifyIdTopResponse>() { // from class: com.mobile.auth.gatewayauth.model.psc_certify_id.GetCertifyIdRB.1
                }, (List<Field>) null));
                setErrorResponse((TopErrorResponse) a.a(jSONObject.optJSONObject(KEY_TOP_ERROR_RESPONSE), (d<Object>) new d<TopErrorResponse>() { // from class: com.mobile.auth.gatewayauth.model.psc_certify_id.GetCertifyIdRB.2
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

    public GetCertifyIdTopResponse getResponse() {
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

    public void setResponse(GetCertifyIdTopResponse getCertifyIdTopResponse) {
        try {
            this.response = getCertifyIdTopResponse;
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
