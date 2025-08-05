package tb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.common.PackageConstants;
import com.huawei.secure.android.common.ssl.g;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes4.dex */
public class cyp {

    /* renamed from: a  reason: collision with root package name */
    private static final Uri f26603a = Uri.parse("content://com.huawei.hwid");
    private static final String[] b = {"B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05", "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539"};

    private static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        File file = new File(str);
        if (file.exists()) {
            cyu.b("BksUtil", "The directory  has already exists");
            return 1;
        } else if (file.mkdirs()) {
            return 0;
        } else {
            cyu.c("BksUtil", "create directory  failed");
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.OutputStream] */
    public static synchronized InputStream a(Context context) {
        ByteArrayInputStream byteArrayInputStream;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        synchronized (cyp.class) {
            cyu.a("BksUtil", "get bks from tss begin");
            if (context != null) {
                cyr.a(context);
            }
            Context a2 = cyr.a();
            ByteArrayInputStream byteArrayInputStream2 = null;
            if (a2 == null) {
                cyu.c("BksUtil", "context is null");
                return null;
            } else if (!b(cyv.a("com.huawei.hwid")) && !b(cyv.a(PackageConstants.SERVICES_PACKAGE_ALL_SCENE))) {
                cyu.c("BksUtil", "hms version code is too low : " + cyv.a("com.huawei.hwid"));
                return null;
            } else {
                boolean a3 = a(a2, "com.huawei.hwid");
                boolean z = a3;
                if (!a3) {
                    boolean b2 = b(a2, PackageConstants.SERVICES_PACKAGE_ALL_SCENE);
                    z = b2;
                    if (!b2) {
                        cyu.c("BksUtil", "hms sign error");
                        return null;
                    }
                }
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        inputStream = a2.getContentResolver().openInputStream(Uri.withAppendedPath(f26603a, "files/hmsrootcas.bks"));
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read < 0) {
                                    break;
                                }
                                byteArrayOutputStream2.write(bArr, 0, read);
                            }
                            byteArrayOutputStream2.flush();
                            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream2.toByteArray());
                            try {
                                String b3 = cyw.b("bks_hash", "", a2);
                                String c = c(byteArrayOutputStream2.toByteArray());
                                if (!d(a2) || !b3.equals(c)) {
                                    cyu.a("BksUtil", "update bks and sp");
                                    a(byteArrayInputStream, a2);
                                    cyw.a("bks_hash", c, a2);
                                } else {
                                    cyu.a("BksUtil", "bks not update");
                                }
                                cyt.a(inputStream);
                                cyt.a((OutputStream) byteArrayOutputStream2);
                                cyt.a((InputStream) byteArrayInputStream);
                            } catch (Exception e) {
                                e = e;
                                byteArrayInputStream2 = byteArrayInputStream;
                                cyu.c("BksUtil", "Get bks from HMS_VERSION_CODE exception : No content provider" + e.getMessage());
                                cyt.a(inputStream);
                                cyt.a((OutputStream) byteArrayOutputStream2);
                                cyt.a((InputStream) byteArrayInputStream2);
                                return b(a2);
                            } catch (Throwable th) {
                                th = th;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                cyt.a(inputStream);
                                cyt.a((OutputStream) byteArrayOutputStream);
                                cyt.a((InputStream) byteArrayInputStream);
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        inputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = null;
                        byteArrayInputStream = null;
                        byteArrayOutputStream = byteArrayOutputStream2;
                    }
                    return b(a2);
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayInputStream = null;
                    byteArrayOutputStream = z;
                }
            }
        }
    }

    private static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            return b(MessageDigest.getInstance("SHA-256").digest(bArr));
        } catch (NoSuchAlgorithmException e) {
            Log.e("BksUtil", "NoSuchAlgorithmException" + e.getMessage());
            return "";
        }
    }

    private static void a(InputStream inputStream, Context context) {
        FileOutputStream fileOutputStream;
        if (inputStream == null || context == null) {
            return;
        }
        String c = c(context);
        if (!new File(c).exists()) {
            a(c);
        }
        File file = new File(c, g.d);
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                cyu.a("BksUtil", "write output stream ");
                fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = inputStream.read(bArr, 0, bArr.length);
                        if (read == -1) {
                            cyt.a((OutputStream) fileOutputStream);
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                } catch (IOException unused) {
                    fileOutputStream2 = fileOutputStream;
                    cyu.c("BksUtil", " IOException");
                    cyt.a((OutputStream) fileOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    cyt.a((OutputStream) fileOutputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    private static boolean a(Context context, String str) {
        byte[] c = c(context, str);
        for (String str2 : b) {
            if (str2.equalsIgnoreCase(a(c))) {
                return true;
            }
        }
        return false;
    }

    public static InputStream b(Context context) {
        if (d(context)) {
            cyu.a("BksUtil", "getFilesBksIS ");
            try {
                return new FileInputStream(e(context));
            } catch (FileNotFoundException unused) {
                cyu.c("BksUtil", "FileNotFoundExceptio: ");
                return null;
            }
        }
        return null;
    }

    private static String b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    private static boolean b(Context context, String str) {
        return "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539".equalsIgnoreCase(a(c(context, str)));
    }

    private static boolean b(String str) {
        int parseInt;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        cyu.a("BksUtil", "hms version code is : " + str);
        String[] split = str.split("\\.");
        String[] split2 = "4.0.2.300".split("\\.");
        int length = split.length;
        int length2 = split2.length;
        int max = Math.max(length, length2);
        int i = 0;
        while (i < max) {
            if (i < length) {
                try {
                    parseInt = Integer.parseInt(split[i]);
                } catch (Exception e) {
                    cyu.c("BksUtil", " exception : " + e.getMessage());
                    return i >= length2;
                }
            } else {
                parseInt = 0;
            }
            int parseInt2 = i < length2 ? Integer.parseInt(split2[i]) : 0;
            if (parseInt < parseInt2) {
                return false;
            }
            if (parseInt > parseInt2) {
                return true;
            }
            i++;
        }
        return true;
    }

    private static String c(Context context) {
        StringBuilder sb;
        Context applicationContext;
        if (Build.VERSION.SDK_INT >= 24) {
            sb = new StringBuilder();
            applicationContext = context.createDeviceProtectedStorageContext();
        } else {
            sb = new StringBuilder();
            applicationContext = context.getApplicationContext();
        }
        sb.append(applicationContext.getFilesDir());
        sb.append(File.separator);
        sb.append("aegis");
        return sb.toString();
    }

    private static String c(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return b(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            cyu.c("BksUtil", "inputstraem exception");
            return "";
        }
    }

    private static byte[] c(Context context, String str) {
        StringBuilder sb;
        String message;
        PackageInfo packageInfo;
        if (context == null || TextUtils.isEmpty(str)) {
            Log.e("BksUtil", "packageName is null or context is null");
            return new byte[0];
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str, 64)) != null) {
                return packageInfo.signatures[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException e) {
            sb = new StringBuilder();
            sb.append("PackageManager.NameNotFoundException : ");
            message = e.getMessage();
            sb.append(message);
            Log.e("BksUtil", sb.toString());
            return new byte[0];
        } catch (Exception e2) {
            sb = new StringBuilder();
            sb.append("get pm exception : ");
            message = e2.getMessage();
            sb.append(message);
            Log.e("BksUtil", sb.toString());
            return new byte[0];
        }
        return new byte[0];
    }

    private static boolean d(Context context) {
        return new File(c(context) + File.separator + g.d).exists();
    }

    private static String e(Context context) {
        return c(context) + File.separator + g.d;
    }
}
