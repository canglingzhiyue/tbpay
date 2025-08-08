package com.mobile.auth.gatewayauth.model.psc_sdk_config;

import mtopsdk.common.util.StringUtils;
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
public class ConfigRB implements e {
    private static final String KEY_RESPONSE = "alibaba_aliqin_psc_query_config_response";
    private static final String KEY_TOP_ERROR_RESPONSE = "error_response";
    private TopErrorResponse errorResponse;
    private PscQueryConfigResponse response;

    public static ConfigRB fromJson(String str) {
        try {
            ConfigRB configRB = new ConfigRB();
            try {
                if (!StringUtils.isEmpty(str)) {
                    return (ConfigRB) a.a(new JSONObject(str), (d<Object>) new d<ConfigRB>() { // from class: com.mobile.auth.gatewayauth.model.psc_sdk_config.ConfigRB.1
                    }, (List<Field>) null);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return configRB;
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
                setResponse((PscQueryConfigResponse) a.a(jSONObject.optJSONObject(KEY_RESPONSE), (d<Object>) new d<PscQueryConfigResponse>() { // from class: com.mobile.auth.gatewayauth.model.psc_sdk_config.ConfigRB.2
                }, (List<Field>) null));
                setErrorResponse((TopErrorResponse) a.a(jSONObject.optJSONObject(KEY_TOP_ERROR_RESPONSE), (d<Object>) new d<TopErrorResponse>() { // from class: com.mobile.auth.gatewayauth.model.psc_sdk_config.ConfigRB.3
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

    public PscQueryConfigResponse getResponse() {
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

    public void setResponse(PscQueryConfigResponse pscQueryConfigResponse) {
        try {
            this.response = pscQueryConfigResponse;
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

    public JSONObject toJsonControlPop() {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(KEY_RESPONSE, this.response == null ? new JSONObject() : this.response.toJsonControlPop());
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
