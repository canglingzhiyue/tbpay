package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class bpg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1021589943);
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1da50fb7", new Object[]{context, str}) : new String(c(context, str));
    }

    public static byte[] c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d423c3f5", new Object[]{context, str});
        }
        try {
            return fpj.a(new FileInputStream(str));
        } catch (Throwable th) {
            th.printStackTrace();
            return "".getBytes();
        }
    }

    public static String d(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b923ffb9", new Object[]{context, str}) : new String(e(context, str));
    }

    public static byte[] e(Context context, String str) {
        BufferedInputStream bufferedInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d336f7f7", new Object[]{context, str});
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
        } catch (IOException e) {
            e.printStackTrace();
            return "".getBytes();
        }
    }
}
