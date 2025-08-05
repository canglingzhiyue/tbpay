package com.taobao.speech.util;

import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/taobao/speech/util/NlsSpeechTokenBean;", "", "()V", aw.PARAM_PVID, "", "getPvid", "()Ljava/lang/String;", "setPvid", "(Ljava/lang/String;)V", "result", "", "Lcom/taobao/speech/util/NlsSpeechTokenResult;", "getResult", "()Ljava/util/List;", MspEventTypes.ACTION_STRING_SETRESULT, "(Ljava/util/List;)V", "scm", "getScm", "setScm", "tpp_trace", "getTpp_trace", "setTpp_trace", "version", "", "getVersion", "()J", "setVersion", "(J)V", "tbspeech_android_release"}, k = 1, mv = {1, 1, 11})
/* loaded from: classes8.dex */
public final class NlsSpeechTokenBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long version;
    private List<NlsSpeechTokenResult> result = p.a();
    private String scm = "";
    private String pvid = "";
    private String tpp_trace = "";

    public final List<NlsSpeechTokenResult> getResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("cf0beced", new Object[]{this}) : this.result;
    }

    public final void setResult(List<NlsSpeechTokenResult> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcea7d17", new Object[]{this, list});
            return;
        }
        q.c(list, "<set-?>");
        this.result = list;
    }

    public final String getScm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1429a872", new Object[]{this}) : this.scm;
    }

    public final void setScm(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9848ac", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.scm = str;
    }

    public final String getPvid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("813f1942", new Object[]{this}) : this.pvid;
    }

    public final void setPvid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b234f74", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.pvid = str;
    }

    public final long getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2d6bc1d", new Object[]{this})).longValue() : this.version;
    }

    public final void setVersion(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4a3ac7", new Object[]{this, new Long(j)});
        } else {
            this.version = j;
        }
    }

    public final String getTpp_trace() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6e447975", new Object[]{this}) : this.tpp_trace;
    }

    public final void setTpp_trace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc887109", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.tpp_trace = str;
    }
}
