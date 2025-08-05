package tb;

import com.alibaba.security.ccrc.service.build.C1238p;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* loaded from: classes6.dex */
public class ikj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f29120a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (ikw.a((CharSequence) str) || ikw.a((CharSequence) str2)) {
            ikq.a("md5-utils.matchMd5", "md5 = " + str + ", filePath = " + str2);
            return false;
        }
        try {
            return ikw.a((CharSequence) str.toLowerCase(), (CharSequence) a(str2));
        } catch (Throwable th) {
            ikq.a("md5-utils.matchMd5", th);
            return false;
        }
    }

    public static String a(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : a(new File(str));
    }

    public static String a(File file) throws Throwable {
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36082ea1", new Object[]{file});
        }
        FileChannel fileChannel = null;
        if (!file.isFile()) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            fileInputStream = new FileInputStream(file);
            try {
                fileChannel = fileInputStream.getChannel();
                ByteBuffer allocate = ByteBuffer.allocate(C1238p.b);
                int i = 0;
                while (true) {
                    int read = fileChannel.read(allocate);
                    if (read != -1) {
                        messageDigest.update(allocate.array(), 0, read);
                        allocate.position(0);
                        i++;
                        if (i % 20 == 19) {
                            Thread.yield();
                        }
                    } else {
                        String a2 = a(messageDigest.digest());
                        ikv.a((Closeable) fileInputStream);
                        ikv.a(fileChannel);
                        return a2;
                    }
                }
            } catch (Throwable th) {
                th = th;
                ikv.a((Closeable) fileInputStream);
                ikv.a(fileChannel);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    private static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr});
        }
        char[] cArr = new char[32];
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            byte b = bArr[i2];
            int i3 = i + 1;
            char[] cArr2 = f29120a;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i = i3 + 1;
            cArr[i3] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
