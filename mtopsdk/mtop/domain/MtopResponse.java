package mtopsdk.mtop.domain;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.taobao.mtop.wvplugin.a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.mtop.util.MtopStatistics;
import org.json.JSONObject;
import tb.kge;
import tb.riy;
import tb.ryq;

/* loaded from: classes.dex */
public class MtopResponse implements Serializable, IMTOPDataObject {
    private static final String SHARP = "::";
    private static final String TAG = "mtopsdk.MtopResponse";
    private static final long serialVersionUID = 1566423746968673499L;
    private String api;
    private byte[] bytedata;
    @Deprecated
    private byte[] data;
    private JSONObject dataJsonObject;
    private Map<String, List<String>> headerFields;
    public String mappingCode;
    public String mappingCodeSuffix;
    private MtopStatistics mtopStat;
    private com.alibaba.fastjson.JSONObject originJsonObject;
    private int responseCode;
    @Deprecated
    private String[] ret;
    private String retCode;
    private String retMsg;
    private ryq streamModeData;
    private boolean supportStreamJson;
    private String v;
    private volatile boolean bParsed = false;
    private volatile boolean allowParseJson = true;
    private ResponseSource responseSource = ResponseSource.NETWORK_REQUEST;

    /* loaded from: classes.dex */
    public enum ResponseSource {
        FRESH_CACHE,
        EXPIRED_CACHE,
        NETWORK_REQUEST
    }

    static {
        kge.a(1325994218);
        kge.a(1028243835);
        kge.a(-350052935);
    }

    public MtopResponse() {
    }

    public MtopResponse(String str, String str2) {
        this.retCode = str;
        this.retMsg = str2;
    }

    public MtopResponse(String str, String str2, String str3, String str4) {
        this.api = str;
        this.v = str2;
        this.retCode = str3;
        this.retMsg = str4;
    }

    public String getRetCode() {
        return this.retCode;
    }

    public void setRetCode(String str) {
        this.retCode = str;
    }

    public String getMappingCode() {
        return this.mappingCode;
    }

    public String getRetMsg() {
        if (this.retMsg == null && !this.bParsed && this.allowParseJson) {
            parseJsonByte();
        }
        return this.retMsg;
    }

    public void setRetMsg(String str) {
        this.retMsg = str;
    }

    public String getApi() {
        if (this.api == null && !this.bParsed && this.allowParseJson) {
            parseJsonByte();
        }
        return this.api;
    }

    public void setApi(String str) {
        this.api = str;
    }

    public String getV() {
        if (this.v == null && !this.bParsed && this.allowParseJson) {
            parseJsonByte();
        }
        return this.v;
    }

    public void setV(String str) {
        this.v = str;
    }

    @Deprecated
    public String[] getRet() {
        if (this.ret == null && !this.bParsed && this.allowParseJson) {
            parseJsonByte();
        }
        return this.ret;
    }

    @Deprecated
    public void setRet(String[] strArr) {
        this.ret = strArr;
    }

    @Deprecated
    public byte[] getData() {
        return this.data;
    }

    @Deprecated
    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public JSONObject getDataJsonObject() {
        if (this.dataJsonObject == null && !this.bParsed && this.allowParseJson && !this.supportStreamJson) {
            parseJsonByte();
        }
        return this.dataJsonObject;
    }

    public void setDataJsonObject(JSONObject jSONObject) {
        this.dataJsonObject = jSONObject;
    }

    public void setOriginFastJsonObject(com.alibaba.fastjson.JSONObject jSONObject) {
        this.originJsonObject = jSONObject;
    }

    public com.alibaba.fastjson.JSONObject getOriginFastJsonObject() {
        if (!this.supportStreamJson) {
            return null;
        }
        if (this.originJsonObject == null) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.originJsonObject = JSON.parseObject(new String(this.bytedata));
                String str = this.mtopStat.seqNo;
                TBSdkLog.e(TAG, str, "[getOriginFastJsonObject] parse json cost=" + (System.currentTimeMillis() - currentTimeMillis));
            } catch (Throwable th) {
                TBSdkLog.e(TAG, this.mtopStat.seqNo, "[getOriginFastJsonObject] parse json error.", th);
            }
        }
        return this.originJsonObject;
    }

    public byte[] getBytedata() {
        return this.bytedata;
    }

    public void setBytedata(byte[] bArr) {
        this.bytedata = bArr;
    }

    public Map<String, List<String>> getHeaderFields() {
        return this.headerFields;
    }

    public void setHeaderFields(Map<String, List<String>> map) {
        this.headerFields = map;
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public void setResponseCode(int i) {
        this.responseCode = i;
    }

    public MtopStatistics getMtopStat() {
        return this.mtopStat;
    }

    public void setMtopStat(MtopStatistics mtopStatistics) {
        this.mtopStat = mtopStatistics;
    }

    public void setStreamModeData(ryq ryqVar) {
        this.streamModeData = ryqVar;
    }

    public ryq getStreamModeData() {
        return this.streamModeData;
    }

    public void parseJsonByte() {
        String[] split;
        String[] split2;
        if (this.bParsed) {
            return;
        }
        synchronized (this) {
            if (this.bParsed) {
                return;
            }
            if (this.supportStreamJson && this.originJsonObject != null) {
                if (this.api == null) {
                    this.api = this.originJsonObject.getString("api");
                }
                if (this.v == null) {
                    this.v = this.originJsonObject.getString("v");
                }
                JSONArray jSONArray = this.originJsonObject.getJSONArray(a.RESULT_KEY);
                int size = jSONArray.size();
                this.ret = new String[size];
                for (int i = 0; i < size; i++) {
                    this.ret[i] = jSONArray.getString(i);
                }
                if (size > 0) {
                    String str = this.ret[0];
                    if (StringUtils.isNotBlank(str) && (split2 = str.split(SHARP)) != null && split2.length > 1) {
                        if (StringUtils.isBlank(this.retCode)) {
                            this.retCode = split2[0];
                        }
                        if (StringUtils.isBlank(this.retMsg)) {
                            this.retMsg = split2[1];
                        }
                    }
                }
                this.bParsed = true;
            } else if (this.bytedata == null || this.bytedata.length == 0) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    TBSdkLog.e(TAG, "[parseJsonByte]MtopResponse bytedata is blank,api=" + this.api + ",v=" + this.v);
                }
                if (StringUtils.isBlank(this.retCode)) {
                    this.retCode = ErrorConstant.ERRCODE_JSONDATA_BLANK;
                }
                if (StringUtils.isBlank(this.retMsg)) {
                    this.retMsg = ErrorConstant.ERRMSG_JSONDATA_BLANK;
                }
                this.bParsed = true;
            } else {
                String str2 = new String(this.bytedata);
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                    TBSdkLog.d(TAG, "[parseJsonByte]MtopResponse bytedata : " + str2);
                }
                JSONObject jSONObject = new JSONObject(str2);
                if (this.api == null) {
                    this.api = jSONObject.getString("api");
                }
                if (this.v == null) {
                    this.v = jSONObject.getString("v");
                }
                org.json.JSONArray jSONArray2 = jSONObject.getJSONArray(a.RESULT_KEY);
                int length = jSONArray2.length();
                this.ret = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    this.ret[i2] = jSONArray2.getString(i2);
                }
                if (length > 0) {
                    String str3 = this.ret[0];
                    if (StringUtils.isNotBlank(str3) && (split = str3.split(SHARP)) != null && split.length > 1) {
                        if (StringUtils.isBlank(this.retCode)) {
                            this.retCode = split[0];
                        }
                        if (StringUtils.isBlank(this.retMsg)) {
                            this.retMsg = split[1];
                        }
                    }
                }
                this.dataJsonObject = jSONObject.optJSONObject("data");
                this.bParsed = true;
            }
        }
    }

    public void setSource(ResponseSource responseSource) {
        this.responseSource = responseSource;
    }

    public ResponseSource getSource() {
        return this.responseSource;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        try {
            sb.append("MtopResponse[ api=");
            sb.append(this.api);
            sb.append(",v=");
            sb.append(this.v);
            sb.append(",retCode=");
            sb.append(this.retCode);
            sb.append(",retMsg=");
            sb.append(this.retMsg);
            sb.append(",mappingCode=");
            sb.append(this.mappingCode);
            sb.append(",mappingCodeSuffix=");
            sb.append(this.mappingCodeSuffix);
            sb.append(",ret=");
            sb.append(Arrays.toString(this.ret));
            sb.append(",data=");
            sb.append(this.dataJsonObject);
            sb.append(",responseCode=");
            sb.append(this.responseCode);
            sb.append(",headerFields=");
            sb.append(this.headerFields);
            sb.append(",bytedata=");
            sb.append(this.bytedata == null ? null : new String(this.bytedata));
            sb.append(riy.ARRAY_END_STR);
            return sb.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return super.toString();
        }
    }

    public String getResponseLog() {
        StringBuilder sb = new StringBuilder(128);
        try {
            sb.append("MtopResponse[ api=");
            sb.append(this.api);
            sb.append(",v=");
            sb.append(this.v);
            sb.append(",retCode=");
            sb.append(this.retCode);
            sb.append(",retMsg=");
            sb.append(this.retMsg);
            sb.append(",mappingCode=");
            sb.append(this.mappingCode);
            sb.append(",mappingCodeSuffix=");
            sb.append(this.mappingCodeSuffix);
            sb.append(",ret=");
            sb.append(Arrays.toString(this.ret));
            sb.append(",responseCode=");
            sb.append(this.responseCode);
            sb.append(",headerFields=");
            sb.append(this.headerFields);
            sb.append(riy.ARRAY_END_STR);
            return sb.toString();
        } catch (Throwable unused) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                TBSdkLog.e(TAG, "[getResponseLog]MtopResponse get log error, api=" + this.api + ",v=" + this.v);
            }
            return super.toString();
        }
    }

    public String getFullKey() {
        if (StringUtils.isBlank(this.api) || StringUtils.isBlank(this.v)) {
            return null;
        }
        return StringUtils.concatStr2LowerCase(this.api, this.v);
    }

    public boolean isApiSuccess() {
        return ErrorConstant.isSuccess(getRetCode()) && getBytedata() != null;
    }

    public boolean isExpiredRequest() {
        return ErrorConstant.isExpiredRequest(getRetCode());
    }

    @Deprecated
    public boolean isSystemError() {
        return ErrorConstant.isSystemError(getRetCode());
    }

    public boolean isNetworkError() {
        return ErrorConstant.isNetworkError(getRetCode());
    }

    public boolean isNoNetwork() {
        return ErrorConstant.isNoNetwork(getRetCode());
    }

    public boolean isSessionInvalid() {
        return ErrorConstant.isSessionInvalid(getRetCode());
    }

    public boolean isUnitProtect() {
        return ErrorConstant.isUnitProtect(getRetCode());
    }

    @Deprecated
    public boolean isIllegelSign() {
        return ErrorConstant.isIllegelSign(getRetCode());
    }

    public boolean is41XResult() {
        return ErrorConstant.is41XResult(getRetCode());
    }

    public boolean isApiLockedResult() {
        return 420 == this.responseCode || ErrorConstant.isApiLockedResult(getRetCode());
    }

    public boolean isApiLockedAndRequestQueued() {
        return 420 == this.responseCode && ErrorConstant.ERRCODE_FAIL_SYS_REQUEST_QUEUED.equalsIgnoreCase(getRetCode());
    }

    public boolean isMtopSdkError() {
        return ErrorConstant.isMtopSdkError(getRetCode());
    }

    public boolean isMtopServerError() {
        return ErrorConstant.isMtopServerError(getRetCode());
    }

    public void setAllowParseJson(boolean z) {
        this.allowParseJson = z;
    }

    public void setSupportStreamJson(boolean z) {
        this.supportStreamJson = z;
    }
}
