package com.taobao.android.tschedule.taskcontext;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class HttpTaskContext extends TaskContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public HttpParams params;

    static {
        kge.a(-1552388314);
    }

    public static /* synthetic */ Object ipc$super(HttpTaskContext httpTaskContext, String str, Object... objArr) {
        if (str.hashCode() == -2128160755) {
            return super.toString();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.tschedule.taskcontext.TaskContext
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", params=");
        HttpParams httpParams = this.params;
        sb.append(httpParams == null ? "{}" : httpParams.toString());
        return sb.toString();
    }

    /* loaded from: classes6.dex */
    public static class HttpParams implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public JSONObject apiParams;
        public boolean followRedirects;
        public Map<String, String> header;
        public List<String> queryBlackList;
        public String url;
        public String requestType = "GET";
        public int retryTime = 3;
        public String charset = "UTF-8";
        public long timeout = 10000;

        static {
            kge.a(-985652084);
            kge.a(1028243835);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            sb.append("url=");
            sb.append(this.url);
            sb.append("requestType=");
            sb.append(this.requestType);
            sb.append("followRedirects=");
            sb.append(this.followRedirects);
            sb.append("retryTime=");
            sb.append(this.retryTime);
            sb.append("charset=");
            sb.append(this.charset);
            sb.append("timeout=");
            sb.append(this.timeout);
            sb.append("header=");
            Map<String, String> map = this.header;
            String str = "{}";
            sb.append(map == null ? str : JSON.toJSONString(map));
            sb.append("apiParams=");
            JSONObject jSONObject = this.apiParams;
            if (jSONObject != null) {
                str = JSON.toJSONString(jSONObject);
            }
            sb.append(str);
            return sb.toString();
        }
    }
}
