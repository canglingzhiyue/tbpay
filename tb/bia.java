package tb;

import android.content.Context;
import com.alibaba.android.split.k;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class bia {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static cap f25918a = new caq();

    public static File a(Context context, String str) throws Exception {
        File b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("90186323", new Object[]{context, str});
        }
        File file = new File(context.getApplicationInfo().nativeLibraryDir, a(str));
        if (file.exists()) {
            return file;
        }
        if (k.b()) {
            b = k.a().b().b(str);
        } else {
            b = new bgy(context).b(str);
        }
        return a(context, a(str), b);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : f25918a.a(str);
    }

    public static boolean b(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9b80d80d", new Object[]{context, str})).booleanValue() : f25918a.b(context, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
        a(r2.getInputStream(r1), r8);
     */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.zip.ZipEntry] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.io.File a(android.content.Context r6, java.lang.String r7, java.io.File r8) throws java.io.IOException {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.bia.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r6
            r6 = 1
            r1[r6] = r7
            r6 = 2
            r1[r6] = r8
            java.lang.String r6 = "21a1548c"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.io.File r6 = (java.io.File) r6
            return r6
        L1b:
            java.io.File r0 = new java.io.File
            android.content.pm.ApplicationInfo r1 = r6.getApplicationInfo()
            java.lang.String r1 = r1.sourceDir
            r0.<init>(r1)
            r1 = 0
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L71
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L71
            java.util.Enumeration r0 = r2.entries()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
        L30:
            boolean r1 = r0.hasMoreElements()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            if (r1 == 0) goto L65
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            java.util.zip.ZipEntry r1 = (java.util.zip.ZipEntry) r1     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r4.<init>()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            java.lang.String r5 = tb.bhy.a(r6)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r4.append(r5)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            java.lang.String r5 = "/"
            r4.append(r5)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r4.append(r7)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            boolean r3 = r3.endsWith(r4)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            if (r3 == 0) goto L30
            java.io.InputStream r6 = r2.getInputStream(r1)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            a(r6, r8)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
        L65:
            r2.close()
            goto L7a
        L69:
            r6 = move-exception
            goto L7b
        L6b:
            r6 = move-exception
            r1 = r2
            goto L72
        L6e:
            r6 = move-exception
            r2 = r1
            goto L7b
        L71:
            r6 = move-exception
        L72:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L7a
            r1.close()
        L7a:
            return r8
        L7b:
            if (r2 == 0) goto L80
            r2.close()
        L80:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bia.a(android.content.Context, java.lang.String, java.io.File):java.io.File");
    }

    private static void a(InputStream inputStream, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34da5162", new Object[]{inputStream, file});
            return;
        }
        byte[] bArr = new byte[1024];
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            fileOutputStream2.write(bArr, 0, read);
                        } else {
                            try {
                                fileOutputStream2.close();
                                return;
                            } catch (IOException e) {
                                e.printStackTrace();
                                return;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        e.printStackTrace();
                        if (fileOutputStream == null) {
                            return;
                        }
                        try {
                            fileOutputStream.close();
                            return;
                        } catch (IOException e3) {
                            e3.printStackTrace();
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    public static boolean c(Context context, String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d54b79ec", new Object[]{context, str})).booleanValue();
        }
        boolean z = !f25918a.c(context, str);
        cap capVar = f25918a;
        if (!z) {
            i = 1;
        }
        capVar.a(context, str, i);
        return z;
    }
}
