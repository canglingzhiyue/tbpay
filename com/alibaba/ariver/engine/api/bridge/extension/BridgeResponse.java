package com.alibaba.ariver.engine.api.bridge.extension;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.sp.framework.model.SimpleProfile;

/* loaded from: classes2.dex */
public class BridgeResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_CODE_FORBIDDEN_ERROR = 4;
    public static final int ERROR_CODE_INVALID_PARAM = 2;
    public static final int ERROR_CODE_JAVA_EXCEPTION = 6;
    public static final int ERROR_CODE_NATIVE_NODE_NULL = 30;
    public static final int ERROR_CODE_NOT_FOUND = 1;
    public static final int ERROR_CODE_SILENT_DENY = 2002;
    public static final int ERROR_CODE_SUCCESS = 0;
    public static final int ERROR_CODE_SYSTEM_ERROR = 5;
    public static final int ERROR_CODE_TIMEOUT = 9;
    public static final int ERROR_CODE_UNAUTHORIZED_USERINFO = 10;
    public static final int ERROR_CODE_UNKNOWN_ERROR = 3;
    public static final int ERROR_CODE_USER_NOT_GRANT = 2001;
    public static final String ERROR_MSG_FORBIDDEN_ERROR = "无权调用";
    public static final String ERROR_MSG_NOT_GRANT_ERROR = "用户不允许授权";

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f2898a;
    public static BridgeResponse SUCCESS = new BridgeResponse(null) { // from class: com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse
        public JSONObject get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2b0f6ffd", new Object[]{this});
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", (Object) true);
            return jSONObject;
        }
    };
    public static BridgeResponse NOT_FOUND = new Error(1, "not implemented!");
    public static BridgeResponse INVALID_PARAM = new Error(2, "invalid parameter!");
    public static BridgeResponse UNKNOWN_ERROR = new Error(3, "unknown error!");
    public static BridgeResponse FORBIDDEN_ERROR = new Error(4, "forbidden error!");
    public static BridgeResponse NATIVE_NODE_NULL = new Error(10, "native node is null");

    /* loaded from: classes2.dex */
    public static class NamedValue extends BridgeResponse {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public JSONObject response;

        public NamedValue(String str, Object obj) {
            super(null);
            this.response = new JSONObject();
            this.response.put(str, obj);
        }

        @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse
        public JSONObject get() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("2b0f6ffd", new Object[]{this}) : this.response;
        }
    }

    public static NamedValue newValue(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NamedValue) ipChange.ipc$dispatch("4185f58c", new Object[]{str, obj}) : new NamedValue(str, obj);
    }

    public static Error newError(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Error) ipChange.ipc$dispatch("cd26678a", new Object[]{new Integer(i), str}) : new Error(i, str);
    }

    /* loaded from: classes2.dex */
    public static class Error extends BridgeResponse {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int errorCode;
        public String errorMessage;
        public String signature;

        public Error(int i, String str) {
            super(null);
            this.errorCode = i;
            this.errorMessage = str;
        }

        public Error(int i, String str, String str2) {
            super(null);
            this.errorCode = i;
            this.errorMessage = str;
            this.signature = str2;
        }

        public int getErrorCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5461de59", new Object[]{this})).intValue() : this.errorCode;
        }

        public String getErrorMessage() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fedd06c4", new Object[]{this}) : this.errorMessage;
        }

        public String getSignature() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1f15da37", new Object[]{this}) : this.signature;
        }

        @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse
        public JSONObject get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2b0f6ffd", new Object[]{this});
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error", (Object) Integer.valueOf(this.errorCode));
            jSONObject.put("message", (Object) this.errorMessage);
            jSONObject.put("errorMessage", (Object) this.errorMessage);
            if (!TextUtils.isEmpty(this.signature)) {
                jSONObject.put(SimpleProfile.KEY_SIGNATURE, (Object) this.signature);
            }
            return jSONObject;
        }
    }

    public BridgeResponse() {
    }

    public BridgeResponse(JSONObject jSONObject) {
        this.f2898a = jSONObject;
    }

    public JSONObject get() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("2b0f6ffd", new Object[]{this}) : this.f2898a;
    }
}
