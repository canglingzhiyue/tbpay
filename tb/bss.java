package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class bss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1657212993);
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str}) : TextUtils.isEmpty(str) ? "" : new String(b(context, str));
    }

    public static byte[] b(Context context, String str) {
        BufferedInputStream bufferedInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d49a29f4", new Object[]{context, str});
        }
        try {
            InputStream proxy_open = AssetsDelegate.proxy_open(context.getAssets(), str);
            if (proxy_open == null) {
                return "".getBytes();
            }
            BufferedInputStream bufferedInputStream2 = null;
            try {
                bufferedInputStream = new BufferedInputStream(proxy_open);
                try {
                    byte[] bArr = new byte[bufferedInputStream.available()];
                    bufferedInputStream.read(bArr);
                    try {
                        bufferedInputStream.close();
                    } catch (Exception unused) {
                    }
                    return bArr;
                } catch (IOException unused2) {
                    bufferedInputStream2 = bufferedInputStream;
                    if (bufferedInputStream2 != null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (Exception unused3) {
                        }
                    }
                    return "".getBytes();
                } catch (Throwable th) {
                    th = th;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Exception unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused5) {
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = null;
            }
        } catch (Exception e) {
            arc.a().c("UMFFileUtil", "getAssetsFile", "fileName=" + str + "|error=" + e.getMessage());
            baw.a(e);
            return "".getBytes();
        }
    }
}
