package com.alipay.security.mobile.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.alipay.ma.util.StringEncodeUtils;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.X509EncodedKeySpec;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import tb.jhy;

/* loaded from: classes3.dex */
public class Utils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ANDROID_PREFIX = "android:apk-key-hash:";
    private static final String HMAC_SHA1 = "HmacSHA1";
    public static String TAG = "com.alipay.security.mobile.util.Utils";

    public static native byte[] getPackageNameAndSignature(Context context);

    static {
        System.loadLibrary("common_util");
    }

    public static String getApkKeyHash(Context context, String str) throws PackageManager.NameNotFoundException, CertificateException, NoSuchAlgorithmException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6de719c", new Object[]{context, str});
        }
        byte[] encoded = CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray())).getEncoded();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(encoded);
        return Base64.encodeToString(messageDigest.digest(), 8).replace("=", "");
    }

    public static byte[] getApkKeyHashBytes(Context context, String str) throws PackageManager.NameNotFoundException, CertificateException, NoSuchAlgorithmException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("49ef77f6", new Object[]{context, str});
        }
        byte[] encoded = CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray())).getEncoded();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(encoded);
        return messageDigest.digest();
    }

    public static synchronized String getDeviceMode(Context context) {
        synchronized (Utils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f263446e", new Object[]{context});
            }
            Cursor query = context.getContentResolver().query(Uri.parse("content://authentication.information"), null, null, null, null);
            if (query == null) {
                return Build.MODEL.replace(" ", "-");
            }
            if (query.moveToFirst()) {
                int columnIndex = query.getColumnIndex("model");
                if (columnIndex == -1) {
                    query.close();
                    return Build.MODEL.replace(" ", "-");
                }
                String string = query.getString(columnIndex);
                query.close();
                if (string != null) {
                    return string.replace("#", "-").replace(" ", "-");
                }
            }
            return Build.MODEL.replace(" ", "-");
        }
    }

    public static String readFromFile(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85c4a351", new Object[]{context, str});
        }
        try {
            FileInputStream openFileInput = context.openFileInput(str);
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = openFileInput.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    openFileInput.close();
                    return new String(byteArray);
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static String readFromRaw(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba9e036", new Object[]{context, new Integer(i)});
        }
        InputStream openRawResource = context.getResources().openRawResource(i);
        try {
            byte[] bArr = new byte[openRawResource.available()];
            openRawResource.read(bArr);
            openRawResource.close();
            return new String(bArr);
        } catch (IOException e) {
            AuthenticatorLOG.error(TAG, e);
            return null;
        }
    }

    public static boolean isVerify(byte[] bArr, String str, byte[] bArr2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42365126", new Object[]{bArr, str, bArr2})).booleanValue();
        }
        PublicKey generatePublic = KeyFactory.getInstance(jhy.KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        Signature signature = Signature.getInstance("SHA1withRSA");
        signature.initVerify(generatePublic);
        signature.update(bArr);
        return signature.verify(bArr2);
    }

    public static String getFileMD5(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a9320d6", new Object[]{file});
        }
        if (!file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    messageDigest.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return new BigInteger(1, messageDigest.digest()).toString(16);
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static File getRealFileName(String str, String str2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("27357157", new Object[]{str, str2});
        }
        String[] split = str2.split("/");
        File file = new File(str);
        String str3 = null;
        if (split.length > 1) {
            while (i < split.length - 1) {
                String str4 = split[i];
                try {
                    str4 = new String(str4.getBytes("8859_1"), StringEncodeUtils.GB2312);
                } catch (UnsupportedEncodingException unused) {
                    AuthenticatorLOG.error(TAG, "getRealFileName:不支持的文件名编码：");
                }
                i++;
                file = new File(file, str4);
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            String str5 = split[split.length - 1];
            try {
                str5 = new String(str5.getBytes("8859_1"), StringEncodeUtils.GB2312);
            } catch (UnsupportedEncodingException unused2) {
                AuthenticatorLOG.error(TAG, "getRealFileName:不支持的文件名编码：");
            }
            return new File(file, str5);
        } else if (split.length != 1) {
            return file;
        } else {
            try {
                str3 = new String(split[0].getBytes("8859_1"), StringEncodeUtils.GB2312);
            } catch (UnsupportedEncodingException unused3) {
                AuthenticatorLOG.error(TAG, "getRealFileName:不支持的文件名编码：");
            }
            return new File(file, str3);
        }
    }

    public static int upZipFile(File file, String str) throws ZipException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb4a601d", new Object[]{file, str})).intValue();
        }
        ZipFile zipFile = new ZipFile(file);
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        byte[] bArr = new byte[1024];
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            if (nextElement.isDirectory()) {
                String name = nextElement.getName();
                if (name.contains("../")) {
                    throw new IOException("may be attacked by '../' ");
                }
                File file2 = new File(new String((str + "/" + name).getBytes("8859_1"), StringEncodeUtils.GB2312));
                Runtime runtime = Runtime.getRuntime();
                runtime.exec("chmod 0777 " + file2.getAbsolutePath());
                file2.mkdir();
            } else {
                File realFileName = getRealFileName(str, nextElement.getName());
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(realFileName));
                BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(nextElement));
                while (true) {
                    int read = bufferedInputStream.read(bArr, 0, 1024);
                    if (read == -1) {
                        break;
                    }
                    bufferedOutputStream.write(bArr, 0, read);
                }
                bufferedInputStream.close();
                bufferedOutputStream.close();
                Runtime runtime2 = Runtime.getRuntime();
                runtime2.exec("chmod 0744 " + realFileName.getAbsolutePath());
            }
        }
        zipFile.close();
        return 0;
    }

    public static String getTime(Long l) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("efe4ed37", new Object[]{l}) : new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss.mmm").format(new Date(l.longValue()));
    }

    public static String getHmacSignature(byte[] bArr) throws InvalidKeyException, NoSuchAlgorithmException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("664a8b97", new Object[]{bArr});
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{42, -44, -121, -4, 35, -108, 114, -42, 105, 82, 114, 43, -122, -109, -88, 109, 117, 27, 125, 102}, HMAC_SHA1);
        Mac mac = Mac.getInstance(HMAC_SHA1);
        mac.init(secretKeySpec);
        return Base64.encodeToString(mac.doFinal(bArr), 0);
    }
}
