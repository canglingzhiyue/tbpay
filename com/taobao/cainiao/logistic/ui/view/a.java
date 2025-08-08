package com.taobao.cainiao.logistic.ui.view;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.zip.GZIPOutputStream;
import tb.jhw;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(538325932);
    }

    public static String a(String str) {
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream2;
        byte[] bytes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return null;
            }
            try {
                bytes = str.getBytes(Charset.forName("UTF-8"));
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e) {
                e = e;
                byteArrayOutputStream = null;
                gZIPOutputStream2 = null;
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = null;
                gZIPOutputStream = null;
            }
            try {
                gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
            } catch (Exception e2) {
                e = e2;
                gZIPOutputStream2 = null;
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = null;
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused) {
                        throw th;
                    }
                }
                if (gZIPOutputStream != null) {
                    gZIPOutputStream.close();
                }
                throw th;
            }
            try {
                gZIPOutputStream2.write(bytes);
                gZIPOutputStream2.finish();
                String c = jhw.c(byteArrayOutputStream.toByteArray());
                try {
                    byteArrayOutputStream.close();
                    gZIPOutputStream2.close();
                } catch (Exception unused2) {
                }
                return c;
            } catch (Exception e3) {
                e = e3;
                TLog.loge("compress fail, src = " + str + " e = " + e.toString(), new String[0]);
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused3) {
                        return null;
                    }
                }
                if (gZIPOutputStream2 != null) {
                    gZIPOutputStream2.close();
                }
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
