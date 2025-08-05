package com.taobao.android.remoteso.tbadapter;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.File;
import tb.ihq;
import tb.ihw;
import tb.ijw;
import tb.ikw;

/* loaded from: classes6.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static synchronized String a(Context context) {
        synchronized (c.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
            } else if (context == null) {
                RSoLog.c("RSoTriverAdapter, obtainTriverJsiLibDir, return lib dir, context == null");
                return null;
            } else if (context.getApplicationContext() == null) {
                RSoLog.c("RSoTriverAdapter, obtainTriverJsiLibDir, return lib dir, app == null");
                return null;
            } else {
                File a2 = ijw.a(context, "swallows_triver");
                ihw b = ihq.b().b("mnn_jsi");
                ihw b2 = ihq.b().b("fcanvas_v8_jsi");
                String b3 = b.b();
                String b4 = b2.b();
                if (!b.g() || !b2.g() || !ikw.b((CharSequence) b3) || !ikw.b((CharSequence) b4)) {
                    RSoLog.c("RSoTriverAdapter, obtainTriverJsiLibDir failed, return null");
                    return null;
                }
                ijw.a(new File(b3), a2);
                ijw.a(new File(b4), a2);
                String path = a2.getPath();
                RSoLog.c("RSoTriverAdapter, obtainTriverJsiLibDir, path = " + path);
                return path;
            }
        }
    }
}
