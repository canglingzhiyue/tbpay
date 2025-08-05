package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/* loaded from: classes6.dex */
public class jit {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Reader, java.io.InputStreamReader] */
    public static String a(Context context, String str) {
        BufferedReader bufferedReader;
        IpChange ipChange = $ipChange;
        ?? r1 = ipChange instanceof IpChange;
        if (r1 != 0) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        ?? r0 = 0;
        r0 = 0;
        try {
            try {
                r1 = new InputStreamReader(AssetsDelegate.proxy_open(context.getAssets(), str), StandardCharsets.UTF_8);
            } catch (Exception e) {
                e = e;
                bufferedReader = null;
                r1 = 0;
            } catch (Throwable th) {
                th = th;
                r1 = 0;
            }
            try {
                bufferedReader = new BufferedReader(r1);
            } catch (Exception e2) {
                e = e2;
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                if (r0 != 0) {
                    try {
                        r0.close();
                    } catch (IOException unused) {
                    }
                }
                if (r1 != 0) {
                    try {
                        r1.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                String sb2 = sb.toString();
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                try {
                    r1.close();
                } catch (IOException unused4) {
                }
                return sb2;
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused5) {
                    }
                }
                if (r1 != 0) {
                    try {
                        r1.close();
                    } catch (IOException unused6) {
                    }
                }
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            r0 = context;
        }
    }
}
