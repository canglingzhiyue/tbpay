package com.taobao.zcache;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public class Error implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int code;
    private final String message;

    static {
        kge.a(977279508);
        kge.a(1028243835);
    }

    public Error(int i, String str) {
        this.code = i;
        this.message = str;
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue() : this.code;
    }

    public String getMessage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this}) : this.message;
    }
}
