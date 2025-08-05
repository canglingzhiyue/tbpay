package com.taobao.themis.widget.broadcast;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/taobao/themis/widget/broadcast/BroadcastMsg;", "Ljava/io/Serializable;", "token", "", "msg", "Lcom/alibaba/fastjson/JSONObject;", "timestamp", "", "(Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;J)V", "getMsg", "()Lcom/alibaba/fastjson/JSONObject;", "setMsg", "(Lcom/alibaba/fastjson/JSONObject;)V", "getTimestamp", "()J", "setTimestamp", "(J)V", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class BroadcastMsg implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject msg;
    private long timestamp;
    private String token;

    static {
        kge.a(-1872258429);
        kge.a(1028243835);
    }

    public BroadcastMsg(String token, JSONObject msg, long j) {
        q.d(token, "token");
        q.d(msg, "msg");
        this.token = token;
        this.msg = msg;
        this.timestamp = j;
    }

    public final JSONObject getMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("26fa272", new Object[]{this}) : this.msg;
    }

    public final long getTimestamp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3737eedb", new Object[]{this})).longValue() : this.timestamp;
    }

    public final String getToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a592a696", new Object[]{this}) : this.token;
    }

    public final void setMsg(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ad5eea", new Object[]{this, jSONObject});
            return;
        }
        q.d(jSONObject, "<set-?>");
        this.msg = jSONObject;
    }

    public final void setTimestamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77bcccc9", new Object[]{this, new Long(j)});
        } else {
            this.timestamp = j;
        }
    }

    public final void setToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99ac208", new Object[]{this, str});
            return;
        }
        q.d(str, "<set-?>");
        this.token = str;
    }
}
