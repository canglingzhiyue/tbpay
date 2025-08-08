package tb;

import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.d;
import com.uploader.export.i;
import com.uploader.implement.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes9.dex */
public class rnw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicLong f33252a = new AtomicLong(1);

    public static Pair<rov, rnp> a(i iVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("7cf2802", new Object[]{iVar});
        }
        if (iVar != null) {
            try {
                if (!StringUtils.isEmpty(iVar.getFilePath()) && !StringUtils.isEmpty(iVar.getBizType())) {
                    rnp rnpVar = new rnp();
                    rnpVar.f33244a = iVar.getFilePath();
                    rnpVar.f = iVar.getBizType();
                    rnpVar.i = iVar.getMetaInfo();
                    rnpVar.c = iVar.getFileType();
                    File file = new File(rnpVar.f33244a);
                    if (!file.exists()) {
                        return new Pair<>(new rov("200", "3", "!file.exists()", false), null);
                    }
                    if (file.length() == 0) {
                        return new Pair<>(new rov("200", "9", "file.length() == 0", false), null);
                    }
                    rnpVar.b = file;
                    rnpVar.d = file.getName();
                    Pair<byte[], Pair<String, String>> a2 = a(file);
                    rnpVar.l = (byte[]) a2.first;
                    rnpVar.h = (String) ((Pair) a2.second).first;
                    rnpVar.m = (String) ((Pair) a2.second).second;
                    rnpVar.g = file.length();
                    rnpVar.k = file.lastModified();
                    rnpVar.n = c(file.getPath());
                    if (rnpVar.i != null) {
                        rnpVar.p = rnpVar.i.get("x-arup-track-id");
                        try {
                            String str = rnpVar.i.get("x-arup-page-background");
                            if (!StringUtils.isEmpty(str)) {
                                if (Integer.valueOf(str).intValue() != 1) {
                                    z = false;
                                }
                                rnpVar.r = z;
                            }
                        } catch (Exception e) {
                            if (a.a(16)) {
                                a.a(16, "ProtocolUtils", "pageBack format error", e);
                            }
                        }
                    }
                    return new Pair<>(null, rnpVar);
                }
            } catch (Exception e2) {
                if (a.a(16)) {
                    a.a(16, "ProtocolUtils", "createFileDescription", e2);
                }
                return new Pair<>(new rov("200", "4", e2.toString(), false), null);
            }
        }
        return new Pair<>(new rov("200", "4", "task getFilePath == null || getBizType == null", false), null);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    private static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr});
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', d.LEVEL_D, d.LEVEL_E, 'F'};
        char[] cArr2 = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    private static Pair<byte[], Pair<String, String>> a(File file) throws Exception {
        ByteBuffer allocate;
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("1966f869", new Object[]{file});
        }
        try {
            allocate = ByteBuffer.allocate(204800);
        } catch (OutOfMemoryError unused) {
            allocate = ByteBuffer.allocate(131072);
        }
        byte[] bArr = null;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                rnu rnuVar = new rnu();
                fileInputStream = new FileInputStream(file);
                while (true) {
                    try {
                        int read = fileInputStream.getChannel().read(allocate);
                        if (read <= 0) {
                            break;
                        }
                        messageDigest.update(allocate.array(), allocate.arrayOffset(), read);
                        rnuVar.update(allocate.array(), allocate.arrayOffset(), read);
                        allocate.clear();
                        i++;
                    } catch (NoSuchAlgorithmException e) {
                        throw e;
                    } catch (Exception e2) {
                        throw e2;
                    } catch (Throwable th) {
                        th = th;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        throw th;
                    }
                }
                String a2 = a(messageDigest.digest());
                String valueOf = String.valueOf(rnuVar.getValue());
                if (i == 1) {
                    bArr = allocate.array();
                }
                Pair<byte[], Pair<String, String>> pair = new Pair<>(bArr, new Pair(a2, valueOf));
                try {
                    fileInputStream.close();
                } catch (Exception unused3) {
                }
                return pair;
            } catch (NoSuchAlgorithmException e3) {
                throw e3;
            } catch (Exception e4) {
                throw e4;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    private static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (!StringUtils.isEmpty(str)) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
        }
        return null;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : Long.toString(f33252a.getAndIncrement() % 10000);
    }
}
