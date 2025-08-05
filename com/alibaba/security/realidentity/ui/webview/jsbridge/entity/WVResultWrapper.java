package com.alibaba.security.realidentity.ui.webview.jsbridge.entity;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mtop.wvplugin.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class WVResultWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLOSED = "HY_CLOSED";
    public static final String EXCEPTION = "HY_EXCEPTION";
    public static final String FAIL = "HY_FAILED";
    public static final String NO_METHOD = "HY_NO_HANDLER";
    public static final String NO_PERMISSION = "HY_NO_PERMISSION";
    public static final String PARAM_ERR = "HY_PARAM_ERR";
    public static final String SUCCESS = "HY_SUCCESS";
    public static final String USER_CANCELLED = "HY_USER_CANCELLED";
    public static final String USER_DENIED = "HY_USER_DENIED";
    public int success = 0;
    public JSONObject result = new JSONObject();

    public WVResultWrapper() {
    }

    public void addData(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34725f06", new Object[]{this, str, str2});
        } else if (str == null || str2 == null) {
        } else {
            try {
                this.result.put(str, str2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public String get(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2df0e14f", new Object[]{this, str, str2});
        }
        try {
            return this.result == null ? "HY_FAILED_NO_RESULT" : this.result.optString(str, str2);
        } catch (Throwable unused) {
            return "HY_FAILED_EXCEPTION";
        }
    }

    public JSONObject getResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ba6f0e08", new Object[]{this}) : this.result;
    }

    public int getSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8e2b51c7", new Object[]{this})).intValue() : this.success;
    }

    public void setData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f6fa1eb", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            this.result = jSONObject;
        }
    }

    public void setResult(String str) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2585a870", new Object[]{this, str});
            return;
        }
        try {
            this.result.put(a.RESULT_KEY, str);
            if (!"HY_SUCCESS".equals(str)) {
                i = -1;
            }
            this.success = i;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2490c548", new Object[]{this});
        } else {
            this.success = 1;
        }
    }

    public String toJsonString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d4e3785", new Object[]{this});
        }
        try {
            if (this.success == 1) {
                this.result.put(a.RESULT_KEY, "HY_SUCCESS");
            } else if (this.success == 0) {
                this.result.put(a.RESULT_KEY, "HY_FAILED");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this.result.toString();
    }

    public void addData(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6c92302", new Object[]{this, str, jSONObject});
        } else if (str == null || jSONObject == null) {
        } else {
            try {
                this.result.put(str, jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void addData(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fca6d6", new Object[]{this, str, jSONArray});
        } else if (str == null || jSONArray == null) {
        } else {
            try {
                this.result.put(str, jSONArray);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void addData(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6f12518", new Object[]{this, str, obj});
        } else if (str == null || obj == null) {
        } else {
            try {
                this.result.put(str, obj);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public WVResultWrapper(String str) {
        setResult(str);
    }
}
