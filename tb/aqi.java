package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public class aqi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f25516a;
    private static int b;
    private static HashMap<String, String> c;

    static {
        kge.a(-386686974);
        f25516a = 0;
        b = 0;
        c = new HashMap<>();
    }

    public static synchronized byte[] a(String str) throws IOException {
        synchronized (aqi.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{str});
            }
            return a(str, true);
        }
    }

    public static synchronized byte[] b(String str) throws IOException {
        synchronized (aqi.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("7d24c9ca", new Object[]{str});
            }
            return a(str, false);
        }
    }

    private static synchronized byte[] a(String str, boolean z) throws IOException {
        synchronized (aqi.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("a359b03b", new Object[]{str, new Boolean(z)});
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (b(str, z)) {
                int i = -1;
                try {
                    i = Integer.parseInt(c.get(str));
                } catch (Exception unused) {
                }
                if (i >= 0) {
                    byteArrayOutputStream.write(a(1, i));
                } else {
                    c(str);
                    byteArrayOutputStream.write(a(2, str.getBytes().length));
                    byteArrayOutputStream.write(str.getBytes());
                }
            } else if (StringUtils.isEmpty(str)) {
                byteArrayOutputStream.write(a(3, 0));
            } else {
                byteArrayOutputStream.write(a(3, str.getBytes().length));
                byteArrayOutputStream.write(str.getBytes());
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return byteArray;
        }
    }

    private static synchronized boolean b(String str, boolean z) {
        synchronized (aqi.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7d257bc5", new Object[]{str, new Boolean(z)})).booleanValue();
            } else if (StringUtils.isEmpty(str)) {
                return false;
            } else {
                if (z) {
                    if (str.length() > 1024) {
                        return false;
                    }
                } else if (str.length() > 256) {
                    return false;
                }
                return f25516a + str.length() <= 32768;
            }
        }
    }

    private static synchronized void c(String str) {
        synchronized (aqi.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{str});
                return;
            }
            HashMap<String, String> hashMap = c;
            hashMap.put(str, "" + b);
            f25516a = f25516a + str.length();
            b = b + 1;
        }
    }

    public static synchronized void a() {
        synchronized (aqi.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
                return;
            }
            c.clear();
            f25516a = 0;
            b = 0;
        }
    }

    public static byte[] a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("26190715", new Object[]{new Integer(i), new Integer(i2)});
        }
        int i3 = 1 << (8 - i);
        byte b2 = (byte) i3;
        int i4 = i3 - 1;
        if (i2 < i4) {
            return apj.a(i2 | b2);
        }
        byte[] bArr = new byte[5];
        bArr[0] = (byte) (b2 | i4);
        int i5 = i2 - i4;
        int i6 = 1;
        while (i5 >= 128) {
            bArr[i6] = (byte) (128 | (i5 % 128));
            i5 /= 128;
            i6++;
        }
        bArr[i6] = (byte) (i5 & 127);
        return apj.b(bArr, 0, i6 + 1);
    }

    public static byte[] a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("5c10e0a2", new Object[]{new Integer(i)}) : a(0, i);
    }
}
