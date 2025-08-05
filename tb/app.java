package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class app {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1280961142);
    }

    public static byte[] a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("5c10e0a2", new Object[]{new Integer(i)});
        }
        byte[] bArr = {(byte) ((r5 >> 8) % 256), (byte) (r5 % 256), (byte) (r5 % 256), (byte) (i % 256)};
        int i2 = i >> 8;
        int i3 = i2 >> 8;
        return bArr;
    }
}
