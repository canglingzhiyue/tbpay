package com.mobile.auth.gatewayauth.sdktools.upload.pns.model;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.nirvana.tools.jsoner.a;
import com.nirvana.tools.jsoner.d;
import com.nirvana.tools.jsoner.e;
import java.io.Serializable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class PnsUploadRequest implements e, Serializable {
    private static final long serialVersionUID = -7838291328068778271L;
    private List<UploadLogDTO> uploadLogDTOList;
    private List<UploadMonitorDTO> uploadMonitorDTOList;

    @Override // com.nirvana.tools.jsoner.e
    public void fromJson(JSONObject jSONObject) {
        try {
            setUploadLogDTOList(a.a(jSONObject.optJSONArray("uploadLogDTOList"), new d<UploadLogDTO>() { // from class: com.mobile.auth.gatewayauth.sdktools.upload.pns.model.PnsUploadRequest.1
            }));
            setUploadMonitorDTOList(a.a(jSONObject.optJSONArray("uploadMonitorDTOList"), new d<UploadMonitorDTO>() { // from class: com.mobile.auth.gatewayauth.sdktools.upload.pns.model.PnsUploadRequest.2
            }));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public List<UploadLogDTO> getUploadLogDTOList() {
        try {
            return this.uploadLogDTOList;
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

    public List<UploadMonitorDTO> getUploadMonitorDTOList() {
        try {
            return this.uploadMonitorDTOList;
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

    public PnsUploadRequest setUploadLogDTOList(List<UploadLogDTO> list) {
        try {
            this.uploadLogDTOList = list;
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

    public PnsUploadRequest setUploadMonitorDTOList(List<UploadMonitorDTO> list) {
        try {
            this.uploadMonitorDTOList = list;
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

    @Override // com.nirvana.tools.jsoner.e
    public JSONObject toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("uploadLogDTOList", a.a((List) this.uploadLogDTOList));
                jSONObject.put("uploadMonitorDTOList", a.a((List) this.uploadMonitorDTOList));
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

    public String toString() {
        try {
            return "PnsUploadRequest{uploadLogDTOList=" + this.uploadLogDTOList + ", uploadMonitorDTOList=" + this.uploadMonitorDTOList + '}';
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
