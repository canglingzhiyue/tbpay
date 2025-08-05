package android.taobao.windvane.packageapp.zipapp.utils;

import android.taobao.windvane.util.m;
import android.taobao.windvane.util.p;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.model.ZCacheResourceResponse;
import com.taobao.zcache.o;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1641812244);
    }

    @Deprecated
    public static String getLocPathByUrl(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e6df5f26", new Object[]{str, new Boolean(z)}) : "";
    }

    @Deprecated
    public static String getStreamByUrl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9528cd63", new Object[]{str, str2});
        }
        return null;
    }

    @Deprecated
    public static String getStreamByUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53ae132d", new Object[]{str});
        }
        InputStream inputStreamByUrl = getInputStreamByUrl(str);
        if (inputStreamByUrl == null) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStreamByUrl.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toString("UTF-8");
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static InputStream getInputStreamByUrl(String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("c225c158", new Object[]{str});
        }
        String c = p.c(p.d(str));
        o.a().b();
        ZCacheResourceResponse a2 = com.taobao.zcache.p.a().a(c);
        StringBuilder sb = new StringBuilder();
        sb.append("getInputStreamByUrl，url=[");
        sb.append(c);
        sb.append("], with response=[");
        if (a2 != null && a2.isSuccess) {
            z = true;
        }
        sb.append(z);
        sb.append(riy.ARRAY_END_STR);
        m.c("ZCache", sb.toString());
        if (a2 != null && a2.isSuccess) {
            return a2.inputStream;
        }
        return null;
    }
}
