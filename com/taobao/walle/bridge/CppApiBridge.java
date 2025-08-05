package com.taobao.walle.bridge;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class CppApiBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile CppApiBridge f23470a;

    static {
        kge.a(613122495);
    }

    public static native void nativeCall(String str, Map<String, String> map);

    public static CppApiBridge a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CppApiBridge) ipChange.ipc$dispatch("31614cbe", new Object[0]);
        }
        synchronized (CppApiBridge.class) {
            if (f23470a == null) {
                synchronized (CppApiBridge.class) {
                    if (f23470a == null) {
                        f23470a = new CppApiBridge();
                    }
                }
            }
        }
        return f23470a;
    }

    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            nativeCall(str, map);
        }
    }
}
