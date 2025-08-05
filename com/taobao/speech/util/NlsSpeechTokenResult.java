package com.taobao.speech.util;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/taobao/speech/util/NlsSpeechTokenResult;", "", "()V", "expire", "", "getExpire", "()J", "setExpire", "(J)V", "token", "", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "tbspeech_android_release"}, k = 1, mv = {1, 1, 11})
/* loaded from: classes8.dex */
public final class NlsSpeechTokenResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long expire;
    private String token = "";

    public final String getToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a592a696", new Object[]{this}) : this.token;
    }

    public final void setToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99ac208", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.token = str;
    }

    public final long getExpire() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bc6d9210", new Object[]{this})).longValue() : this.expire;
    }

    public final void setExpire(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67aa9b9c", new Object[]{this, new Long(j)});
        } else {
            this.expire = j;
        }
    }
}
