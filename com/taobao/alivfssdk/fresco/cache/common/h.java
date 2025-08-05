package com.taobao.alivfssdk.fresco.cache.common;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import tb.kge;

/* loaded from: classes4.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(213693408);
    }

    public static g a(final InputStream inputStream) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("a90bcc6e", new Object[]{inputStream}) : new g() { // from class: com.taobao.alivfssdk.fresco.cache.common.h.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.alivfssdk.fresco.cache.common.g
            public OutputStream a(OutputStream outputStream) throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (OutputStream) ipChange2.ipc$dispatch("b0cdf92e", new Object[]{this, outputStream});
                }
                com.taobao.alivfssdk.fresco.common.internal.a.a(inputStream, outputStream);
                return outputStream;
            }
        };
    }
}
