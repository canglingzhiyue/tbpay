package com.alipay.mobile.security.bio.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class OutputStreamUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void close(OutputStream outputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a12b31", new Object[]{outputStream});
        } else if (outputStream == null) {
        } else {
            try {
                outputStream.close();
            } catch (IOException e) {
                BioLog.e(e.toString());
            }
        }
    }
}
