package com.taobao.android.publisher.service.export.ayscpublish.core;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import java.io.File;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f93203", new Object[]{closeable});
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        try {
            File file = new File(str);
            if (!file.exists()) {
                return;
            }
            file.delete();
        } catch (Exception unused) {
        }
    }
}
