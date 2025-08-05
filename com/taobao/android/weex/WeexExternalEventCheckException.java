package com.taobao.android.weex;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class WeexExternalEventCheckException extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;

    static {
        kge.a(1194366458);
    }

    public WeexExternalEventCheckException() {
    }

    public WeexExternalEventCheckException(String str) {
        super(str);
    }

    public static WeexExternalEventCheckException fromState(boolean z, WeexExternalEventType weexExternalEventType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexExternalEventCheckException) ipChange.ipc$dispatch("74fde845", new Object[]{new Boolean(z), weexExternalEventType});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("weex external event check error, ");
        sb.append(z ? "start" : "!start");
        sb.append(" to ");
        sb.append(weexExternalEventType.name());
        return new WeexExternalEventCheckException(sb.toString());
    }
}
