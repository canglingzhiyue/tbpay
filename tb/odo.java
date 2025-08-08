package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class odo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, JSONObject> f31954a;

    static {
        kge.a(-86044286);
        f31954a = new HashMap();
    }

    public static final JSONObject a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("92cfe54e", new Object[]{context});
        }
        String packageName = context.getPackageName();
        JSONObject jSONObject = f31954a.get(packageName);
        if (jSONObject == null) {
            synchronized (f31954a) {
                jSONObject = f31954a.get(packageName);
                if (jSONObject == null) {
                    try {
                        String a2 = a(context.getPackageManager().getPackageInfo(context.getPackageName(), 128).applicationInfo.sourceDir);
                        if (!StringUtils.isEmpty(a2)) {
                            jSONObject = new JSONObject(a2);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    f31954a.put(packageName, jSONObject);
                }
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.odo.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r8
            java.lang.String r8 = "9f352ae"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L15:
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            java.lang.String r2 = "r"
            r1.<init>(r8, r2)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            long r2 = r1.length()     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
            r4 = 22
            long r2 = r2 - r4
            r4 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 < 0) goto L86
            r6 = 65536(0x10000, double:3.2379E-319)
            long r6 = r2 - r6
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 >= 0) goto L34
            goto L35
        L34:
            r4 = r6
        L35:
            r1.seek(r2)     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
            int r8 = r1.readInt()     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
            int r8 = java.lang.Integer.reverseBytes(r8)     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
            r6 = 101010256(0x6054b50, float:2.506985E-35)
            if (r8 == r6) goto L55
            r6 = 1
            long r2 = r2 - r6
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 < 0) goto L4d
            goto L35
        L4d:
            java.util.zip.ZipException r8 = new java.util.zip.ZipException     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
            java.lang.String r2 = "EOCD not found; not a zip file?"
            r8.<init>(r2)     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
            throw r8     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
        L55:
            r8 = 18
            byte[] r8 = new byte[r8]     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
            r1.readFully(r8)     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
            r2 = 16
            r2 = r8[r2]     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 17
            r8 = r8[r3]     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            r8 = r8 | r2
            if (r8 <= 0) goto L82
            byte[] r8 = new byte[r8]     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
            r1.readFully(r8)     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
            java.lang.String r3 = "UTF-8"
            r2.<init>(r8, r3)     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
            r1.close()     // Catch: java.io.IOException -> L7d
            goto L81
        L7d:
            r8 = move-exception
            r8.printStackTrace()
        L81:
            return r2
        L82:
            r1.close()     // Catch: java.io.IOException -> Lb1
            goto Lb5
        L86:
            java.util.zip.ZipException r8 = new java.util.zip.ZipException     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
            r2.<init>()     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
            java.lang.String r3 = "File too short to be a zip file: "
            r2.append(r3)     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
            long r3 = r1.length()     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
            r2.append(r3)     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
            r8.<init>(r2)     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
            throw r8     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lb6
        La1:
            r8 = move-exception
            goto La8
        La3:
            r8 = move-exception
            r1 = r0
            goto Lb7
        La6:
            r8 = move-exception
            r1 = r0
        La8:
            r8.printStackTrace()     // Catch: java.lang.Throwable -> Lb6
            if (r1 == 0) goto Lb5
            r1.close()     // Catch: java.io.IOException -> Lb1
            goto Lb5
        Lb1:
            r8 = move-exception
            r8.printStackTrace()
        Lb5:
            return r0
        Lb6:
            r8 = move-exception
        Lb7:
            if (r1 == 0) goto Lc1
            r1.close()     // Catch: java.io.IOException -> Lbd
            goto Lc1
        Lbd:
            r0 = move-exception
            r0.printStackTrace()
        Lc1:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.odo.a(java.lang.String):java.lang.String");
    }
}
