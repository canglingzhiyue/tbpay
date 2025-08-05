package com.taobao.android.searchbaseframe.net;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class ResultException extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ResultError mError;

    static {
        kge.a(-1453364622);
    }

    public ResultException(ResultError resultError) {
        this.mError = resultError;
    }

    public ResultError getError() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ResultError) ipChange.ipc$dispatch("9fbe2fc1", new Object[]{this}) : this.mError;
    }
}
