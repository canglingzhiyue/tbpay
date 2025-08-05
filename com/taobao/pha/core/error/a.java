package com.taobao.pha.core.error;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERR_MSG_CLIENT_CONTEXT_IS_NULL = "Client context is null";
    public static final String ERR_MSG_DATA_PREFETCH_FAILED = "DataPrefetch failed";
    public static final String ERR_MSG_EXECUTE_JSAPI_DOWNGRADE = "Execute JSAPI downgrade";
    public static final String ERR_MSG_FRAGMENT_ATTACH_FAILED = "Fragment attach failed";
    public static final String ERR_MSG_INVALID_DOMAIN = "Invalid domain";
    public static final String ERR_MSG_JSENGINE_INIT_FAILED = "JSEngine init failed";
    public static final String ERR_MSG_LOAD_SUBPAGE_FAILED = "Load subpage failed";
    public static final String ERR_MSG_MANIFEST_DATA_IS_NULL = "ManifestData is null";
    public static final String ERR_MSG_MANIFEST_DOWNLOAD_FAILED = "Manifest download failed";
    public static final String ERR_MSG_MANIFEST_PARSE_FAILED = "Manifest parse failed";
    public static final String ERR_MSG_MANIFEST_URL_IS_NULL = "ManifestUrl is null";
    public static final String ERR_MSG_RESOURCE_MD5_FAILED = "Resource md5 failed";
    public static final String ERR_MSG_RESOURCE_REQUEST_FAILED = "Resource request failed";
    public static final String ERR_MSG_RESOURCE_SAVE_FAILED = "Resource save failed";
    public static final String ERR_MSG_SUBPAGE_KEY_NOT_EXIST = "Subpage key not exist";
    public static final String ERR_MSG_THREAD_ALLOW_CORE_THREAD_TIMEOUT_EXCEPTION = "Thread allowCoreThreadTimeOut exception";
    public static final String ERR_MSG_THREAD_CREATE_TASK_FAILED = "Thread create task failed";
    public static final String ERR_MSG_THREAD_ENQUEUE_TASK_FAILED = "Thread enqueue task failed";
    public static final String ERR_MSG_THREAD_REJECTED_EXECUTION = "Thread rejected execution";
    public static final String ERR_MSG_THREAD_REJECTED_POLICY_INVOKED = "Thread rejected policy invoked";
    public static final String ERR_MSG_THREAD_UNCAUGHT_EXCEPTION = "Thread uncaught exception";
    public static final String ERR_MSG_WEBVIEW_NOT_READY = "WebView not ready";
    public static final String ERR_MSG_WORKER_DOWNLOAD_FAILED = "WorkerJS download failed";
    public static final String ERR_MSG_WORKER_EXECUTE_FAILED = "WorkerJS execute failed";
    public static final String ERR_MSG_WORKER_INIT_FAILED = "Worker init failed";

    /* renamed from: a  reason: collision with root package name */
    public String f18738a;
    public String b;
    public JSONObject c;

    static {
        kge.a(1369197981);
    }

    public a(PHAErrorType pHAErrorType, String str) {
        this(pHAErrorType.toString(), str);
    }

    public a(String str, String str2) {
        this.f18738a = str;
        this.b = str2;
        this.c = new JSONObject();
    }

    public a(PHAErrorType pHAErrorType, String str, JSONObject jSONObject) {
        this(pHAErrorType.toString(), str, jSONObject);
    }

    public a(String str, String str2, JSONObject jSONObject) {
        this.f18738a = str;
        this.b = str2;
        this.c = jSONObject;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) this.f18738a);
        jSONObject.put("message", (Object) this.b);
        if (!this.c.isEmpty()) {
            jSONObject.put("args", (Object) this.c);
        }
        return jSONObject.toJSONString();
    }
}
