package com.taobao.pha.core;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import tb.kge;
import tb.nge;
import tb.ngp;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BRIDGE_JS = "pha-bridge.js";

    /* renamed from: a  reason: collision with root package name */
    private static volatile String f18707a;

    static {
        kge.a(-939320304);
    }

    public nge a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nge) ipChange.ipc$dispatch("7c72ddc8", new Object[]{this, str});
        }
        return null;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (f18707a == null) {
            synchronized (c.class) {
                f18707a = b(BRIDGE_JS);
            }
        }
        return f18707a;
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : ngp.a(str);
    }

    public InputStream c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InputStream) ipChange.ipc$dispatch("a48857b7", new Object[]{this, str}) : ngp.b(str);
    }
}
