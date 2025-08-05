package org.json.alipay;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class JSONException extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Throwable cause;

    public JSONException(String str) {
        super(str);
    }

    public JSONException(Throwable th) {
        super(th.getMessage());
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Throwable) ipChange.ipc$dispatch("fa19c19f", new Object[]{this}) : this.cause;
    }
}
