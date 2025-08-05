package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.tao.Globals;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes7.dex */
public class mxk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(256223657);
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (context == null) {
            context = Globals.getApplication();
        }
        try {
            return new String(b(context, str), "utf-8");
        } catch (Exception unused) {
            return null;
        }
    }

    private static byte[] b(Context context, String str) {
        InputStream inputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d49a29f4", new Object[]{context, str});
        }
        try {
            inputStream = AssetsDelegate.proxy_open(context.getResources().getAssets(), str);
        } catch (Exception unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return bArr;
        } catch (Exception unused2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            throw th;
        }
    }
}
