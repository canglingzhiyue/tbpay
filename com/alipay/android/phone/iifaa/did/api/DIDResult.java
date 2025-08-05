package com.alipay.android.phone.iifaa.did.api;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.iifaa.did.model.VerifiableCredential;
import com.alipay.android.phone.iifaa.did.model.VerifiableCredentialBasicInfo;
import com.alipay.android.phone.iifaa.did.model.VerifiablePresentation;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes3.dex */
public class DIDResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String credentialEncData;
    public String data;
    public String did;
    public String didData;
    public List<String> didList;
    public String message;
    public String publicKey;
    public String requestBody;
    public String requestParams;
    public int resultCode;
    public String securityLevel;
    public String sign;
    public String traceInfoList;
    public VerifiableCredentialBasicInfo vcBasicInfo;
    public String vcDocument;
    public List<VerifiableCredentialBasicInfo> vcList;
    public VerifiableCredential vcModel;
    public String vmId;
    public VerifiablePresentation vp;

    /* loaded from: classes3.dex */
    public enum a {
        SUCCESS,
        WRONG_PARAMS,
        FAILED_PARSE_DATA,
        FAILED_READ_FILE,
        FAILED_WRITE_FILE,
        FAILED_OPT_CRYPTO,
        FAILED_AUTH,
        CANCEL_AUTH,
        FAILED_DELETE_FILE,
        FAILED_EXCP,
        NOT_SUPPORT,
        FUNC_DEMOTED
    }

    public DIDResult() {
    }

    public DIDResult(int i, String str) {
        this.resultCode = i;
        this.message = str;
    }

    public DIDResult(a aVar) {
        this.resultCode = aVar.ordinal();
        this.message = aVar.name();
    }

    public static JSONObject genResult(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ddb6db19", new Object[]{new Integer(i), str}) : new DIDResult(i, str).toJSONObject();
    }

    public static JSONObject genResult(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b5487110", new Object[]{aVar}) : new DIDResult(aVar).toJSONObject();
    }

    public String getCredentialEncData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9b6f9cc2", new Object[]{this}) : this.credentialEncData;
    }

    public String getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this}) : this.data;
    }

    public String getDid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("52885150", new Object[]{this}) : this.did;
    }

    public String getDidData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("80820c46", new Object[]{this}) : this.didData;
    }

    public List<String> getDidList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("30402df9", new Object[]{this}) : this.didList;
    }

    public String getMessage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this}) : this.message;
    }

    public String getPublicKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("93591e79", new Object[]{this}) : this.publicKey;
    }

    public String getRequestBody() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cae2863e", new Object[]{this}) : this.requestBody;
    }

    public String getRequestParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("eaa60f1a", new Object[]{this}) : this.requestParams;
    }

    public int getResultCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2c6a001a", new Object[]{this})).intValue() : this.resultCode;
    }

    public String getSecurityLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e67e74b", new Object[]{this}) : this.securityLevel;
    }

    public String getSign() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ee91d6a6", new Object[]{this}) : this.sign;
    }

    public String getTraceInfoList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ece0bebe", new Object[]{this}) : this.traceInfoList;
    }

    public VerifiableCredentialBasicInfo getVcBasicInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VerifiableCredentialBasicInfo) ipChange.ipc$dispatch("606f8dda", new Object[]{this}) : this.vcBasicInfo;
    }

    public String getVcDocument() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e5a4c6db", new Object[]{this}) : this.vcDocument;
    }

    public List<VerifiableCredentialBasicInfo> getVcList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("a425a15f", new Object[]{this}) : this.vcList;
    }

    public VerifiableCredential getVcModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VerifiableCredential) ipChange.ipc$dispatch("2b41fe4d", new Object[]{this}) : this.vcModel;
    }

    public String getVmId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("781fb951", new Object[]{this}) : this.vmId;
    }

    public VerifiablePresentation getVp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VerifiablePresentation) ipChange.ipc$dispatch("9c882d14", new Object[]{this}) : this.vp;
    }

    public DIDResult setCredentialEncData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DIDResult) ipChange.ipc$dispatch("bc719b33", new Object[]{this, str});
        }
        this.credentialEncData = str;
        return this;
    }

    public DIDResult setData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DIDResult) ipChange.ipc$dispatch("e9bebff2", new Object[]{this, str});
        }
        this.data = str;
        return this;
    }

    public DIDResult setDid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DIDResult) ipChange.ipc$dispatch("854f5541", new Object[]{this, str});
        }
        this.did = str;
        return this;
    }

    public DIDResult setDidData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DIDResult) ipChange.ipc$dispatch("da5740b7", new Object[]{this, str});
        }
        this.didData = str;
        return this;
    }

    public DIDResult setDidList(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DIDResult) ipChange.ipc$dispatch("9ffdc87c", new Object[]{this, list});
        }
        this.didList = list;
        return this;
    }

    public DIDResult setMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DIDResult) ipChange.ipc$dispatch("20ebfb9", new Object[]{this, str});
        }
        this.message = str;
        return this;
    }

    public DIDResult setPublicKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DIDResult) ipChange.ipc$dispatch("fa5aed2a", new Object[]{this, str});
        }
        this.publicKey = str;
        return this;
    }

    public DIDResult setRequestBody(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DIDResult) ipChange.ipc$dispatch("15f166af", new Object[]{this, str});
        }
        this.requestBody = str;
        return this;
    }

    public DIDResult setRequestParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DIDResult) ipChange.ipc$dispatch("a1902d8b", new Object[]{this, str});
        }
        this.requestParams = str;
        return this;
    }

    public DIDResult setResultCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DIDResult) ipChange.ipc$dispatch("e3f4bfdf", new Object[]{this, new Integer(i)});
        }
        this.resultCode = i;
        return this;
    }

    public DIDResult setSecurityLevel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DIDResult) ipChange.ipc$dispatch("d1ccb77c", new Object[]{this, str});
        }
        this.securityLevel = str;
        return this;
    }

    public DIDResult setSign(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DIDResult) ipChange.ipc$dispatch("46ab7e7f", new Object[]{this, str});
        }
        this.sign = str;
        return this;
    }

    public DIDResult setTraceInfoList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DIDResult) ipChange.ipc$dispatch("3fc02c2f", new Object[]{this, str});
        }
        this.traceInfoList = str;
        return this;
    }

    public DIDResult setVP(VerifiablePresentation verifiablePresentation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DIDResult) ipChange.ipc$dispatch("cdbce8a5", new Object[]{this, verifiablePresentation});
        }
        this.vp = verifiablePresentation;
        return this;
    }

    public DIDResult setVcBasicInfo(VerifiableCredentialBasicInfo verifiableCredentialBasicInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DIDResult) ipChange.ipc$dispatch("c282a297", new Object[]{this, verifiableCredentialBasicInfo});
        }
        this.vcBasicInfo = verifiableCredentialBasicInfo;
        return this;
    }

    public DIDResult setVcDocument(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DIDResult) ipChange.ipc$dispatch("30d83074", new Object[]{this, str});
        }
        this.vcDocument = str;
        return this;
    }

    public DIDResult setVcList(List<VerifiableCredentialBasicInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DIDResult) ipChange.ipc$dispatch("2e938eca", new Object[]{this, list});
        }
        this.vcList = list;
        return this;
    }

    public DIDResult setVcModel(VerifiableCredential verifiableCredential) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DIDResult) ipChange.ipc$dispatch("ccaee80", new Object[]{this, verifiableCredential});
        }
        this.vcModel = verifiableCredential;
        return this;
    }

    public DIDResult setVmId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DIDResult) ipChange.ipc$dispatch("e129c06a", new Object[]{this, str});
        }
        this.vmId = str;
        return this;
    }

    public JSONObject toJSONObject() {
        IpChange ipChange = $ipChange;
        return (JSONObject) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("e5b411a9", new Object[]{this}) : JSONObject.toJSON(this));
    }
}
