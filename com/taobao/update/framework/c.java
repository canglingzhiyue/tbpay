package com.taobao.update.framework;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context context;
    public int errorCode;
    public String errorMsg;
    public boolean success = true;

    static {
        kge.a(750475430);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TaskContext{success=" + this.success + ", errorCode=" + this.errorCode + ", errorMsg='" + this.errorMsg + "', context=" + this.context + '}';
    }
}
