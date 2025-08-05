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
public class SDKConfigData implements e {
    @JsonerTag(keyName = "AuthToken")
    private ConfigData AuthToken;
    @JsonerTag(keyName = "DownGradeInfoList")
    private List<DownGradleConfig> DownGradeInfoList;
    @JsonerTag(keyName = "GetConfig")
    private ConfigData GetConfig;
    @JsonerTag(keyName = "GetVendorList")
    private ConfigData GetVendorList;
    @JsonerTag(keyName = "IsAuthDemoted")
    private String IsAuthDemoted;
    @JsonerTag(keyName = "IsCrashDemoted")
    private String IsCrashDemoted;
    @JsonerTag(keyName = "IsDemoted")
    private String IsDemoted;
    @JsonerTag(keyName = "IsLoginDemoted")
    private String IsLoginDemoted;
    @JsonerTag(keyName = "IsSLSDemoted")
    private String IsSLSDemoted;
    @JsonerTag(keyName = "LoginPage")
    private ConfigData LoginPage;
    @JsonerTag(keyName = "LoginPhone")
    private ConfigData LoginPhone;
    @JsonerTag(keyName = "LoginToken")
    private ConfigData LoginToken;
    @JsonerTag(keyName = "Sls")
    private ConfigData Sls;
    @JsonerTag(keyName = "UploadLog")
    private UploadLogData UploadLog;

    @Override // com.nirvana.tools.jsoner.e
    public void fromJson(JSONObject jSONObject) {
        try {
            a.a(jSONObject, this, (List<Field>) null);
            if (jSONObject == null) {
                return;
            }
            setGetVendorList((ConfigData) a.a(jSONObject.optJSONObject("GetVendorList"), (d<Object>) new d<ConfigData>() { // from class: com.mobile.auth.gatewayauth.model.popsdkconfig.SDKConfigData.1
            }, (List<Field>) null));
            setLoginPhone((ConfigData) a.a(jSONObject.optJSONObject("LoginPhone"), (d<Object>) new d<ConfigData>() { // from class: com.mobile.auth.gatewayauth.model.popsdkconfig.SDKConfigData.2
            }, (List<Field>) null));
            setLoginPage((ConfigData) a.a(jSONObject.optJSONObject("LoginPage"), (d<Object>) new d<ConfigData>() { // from class: com.mobile.auth.gatewayauth.model.popsdkconfig.SDKConfigData.3
            }, (List<Field>) null));
            setGetConfig((ConfigData) a.a(jSONObject.optJSONObject("GetConfig"), (d<Object>) new d<ConfigData>() { // from class: com.mobile.auth.gatewayauth.model.popsdkconfig.SDKConfigData.4
            }, (List<Field>) null));
            setAuthToken((ConfigData) a.a(jSONObject.optJSONObject("AuthToken"), (d<Object>) new d<ConfigData>() { // from class: com.mobile.auth.gatewayauth.model.popsdkconfig.SDKConfigData.5
            }, (List<Field>) null));
            setLoginToken((ConfigData) a.a(jSONObject.optJSONObject("LoginToken"), (d<Object>) new d<ConfigData>() { // from class: com.mobile.auth.gatewayauth.model.popsdkconfig.SDKConfigData.6
            }, (List<Field>) null));
            setSls((ConfigData) a.a(jSONObject.optJSONObject("Sls"), (d<Object>) new d<ConfigData>() { // from class: com.mobile.auth.gatewayauth.model.popsdkconfig.SDKConfigData.7
            }, (List<Field>) null));
            setUploadLog((UploadLogData) a.a(jSONObject.optJSONObject("UploadLog"), (d<Object>) new d<UploadLogData>() { // from class: com.mobile.auth.gatewayauth.model.popsdkconfig.SDKConfigData.8
            }, (List<Field>) null));
            if (jSONObject.optJSONObject("DownGradeInfoList") == null) {
                return;
            }
            setDownGradeInfoList(a.a(jSONObject.optJSONObject("DownGradeInfoList").optJSONArray("List"), new d<DownGradleConfig>() { // from class: com.mobile.auth.gatewayauth.model.popsdkconfig.SDKConfigData.9
            }));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public ConfigData getAuthToken() {
        try {
            return this.AuthToken;
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

    public List<DownGradleConfig> getDownGradeInfoList() {
        try {
            return this.DownGradeInfoList;
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

    public ConfigData getGetConfig() {
        try {
            return this.GetConfig;
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

    public ConfigData getGetVendorList() {
        try {
            return this.GetVendorList;
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

    public String getIsAuthDemoted() {
        try {
            return this.IsAuthDemoted;
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

    public String getIsCrashDemoted() {
        try {
            return this.IsCrashDemoted;
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

    public String getIsDemoted() {
        try {
            return this.IsDemoted;
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

    public String getIsLoginDemoted() {
        try {
            return this.IsLoginDemoted;
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

    public String getIsSLSDemoted() {
        try {
            return this.IsSLSDemoted;
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

    public ConfigData getLoginPage() {
        try {
            return this.LoginPage;
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

    public ConfigData getLoginPhone() {
        try {
            return this.LoginPhone;
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

    public ConfigData getLoginToken() {
        try {
            return this.LoginToken;
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

    public ConfigData getSls() {
        try {
            return this.Sls;
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

    public UploadLogData getUploadLog() {
        try {
            return this.UploadLog;
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

    public void setAuthToken(ConfigData configData) {
        try {
            this.AuthToken = configData;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setDownGradeInfoList(List<DownGradleConfig> list) {
        try {
            this.DownGradeInfoList = list;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setGetConfig(ConfigData configData) {
        try {
            this.GetConfig = configData;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setGetVendorList(ConfigData configData) {
        try {
            this.GetVendorList = configData;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setIsAuthDemoted(String str) {
        try {
            this.IsAuthDemoted = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setIsCrashDemoted(String str) {
        try {
            this.IsCrashDemoted = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setIsDemoted(String str) {
        try {
            this.IsDemoted = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setIsLoginDemoted(String str) {
        try {
            this.IsLoginDemoted = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setIsSLSDemoted(String str) {
        try {
            this.IsSLSDemoted = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setLoginPage(ConfigData configData) {
        try {
            this.LoginPage = configData;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setLoginPhone(ConfigData configData) {
        try {
            this.LoginPhone = configData;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setLoginToken(ConfigData configData) {
        try {
            this.LoginToken = configData;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setSls(ConfigData configData) {
        try {
            this.Sls = configData;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setUploadLog(UploadLogData uploadLogData) {
        try {
            this.UploadLog = uploadLogData;
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
