package com.taobao.speech.util;

import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/taobao/speech/util/NlsVoiceContentBean;", "", "()V", "messageId", "", "getMessageId", "()Ljava/lang/String;", "setMessageId", "(Ljava/lang/String;)V", "namespace", "getNamespace", "setNamespace", "payload", "getPayload", "setPayload", "result", "getResult", MspEventTypes.ACTION_STRING_SETRESULT, "status", "", "getStatus", "()J", "setStatus", "(J)V", com.taobao.tao.powermsg.model.a.COL_TASK, "getTaskId", "setTaskId", "tbspeech_android_release"}, k = 1, mv = {1, 1, 11})
/* loaded from: classes8.dex */
public final class NlsVoiceContentBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long status;
    private String taskId = "";
    private String messageId = "";
    private String namespace = "";
    private String result = "";
    private String payload = "";

    public final String getTaskId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("54ada043", new Object[]{this}) : this.taskId;
    }

    public final void setTaskId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0b05593", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.taskId = str;
    }

    public final String getMessageId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ff27d1ad", new Object[]{this}) : this.messageId;
    }

    public final void setMessageId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68101fd1", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.messageId = str;
    }

    public final long getStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fcf6c363", new Object[]{this})).longValue() : this.status;
    }

    public final void setStatus(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384794a9", new Object[]{this, new Long(j)});
        } else {
            this.status = j;
        }
    }

    public final String getNamespace() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("79c37174", new Object[]{this}) : this.namespace;
    }

    public final void setNamespace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e878ea", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.namespace = str;
    }

    public final String getResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4ea3fdc6", new Object[]{this}) : this.result;
    }

    public final void setResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2585a870", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.result = str;
    }

    public final String getPayload() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a81e58a1", new Object[]{this}) : this.payload;
    }

    public final void setPayload(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62b0445d", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.payload = str;
    }
}
