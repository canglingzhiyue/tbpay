package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* loaded from: classes7.dex */
public class ndy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAC_ADDRESS_LENGTH = 6;

    /* renamed from: a  reason: collision with root package name */
    private byte[] f31377a;

    static {
        kge.a(-1348372692);
    }

    public ndy(byte[] bArr) {
        this.f31377a = new byte[6];
        this.f31377a = Arrays.copyOf(bArr, 6);
    }

    public static ndy a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ndy) ipChange.ipc$dispatch("953d6c67", new Object[]{str, str2});
        }
        try {
            String[] split = str.split(str2);
            if (split != null && split.length != 0) {
                if (split.length != 6) {
                    return a("00:00:00:00:00:00", ":");
                }
                byte[] bArr = new byte[6];
                for (int i = 0; i < 6; i++) {
                    bArr[i] = (byte) Integer.parseInt(split[i], 16);
                }
                return new ndy(bArr);
            }
            return a("00:00:00:00:00:00", ":");
        } catch (Exception unused) {
            return a("00:00:00:00:00:00", ":");
        }
    }

    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue();
        }
        long j = 0;
        for (int i = 0; i < 6; i++) {
            j |= (this.f31377a[i] & 255) << ((5 - i) << 3);
        }
        return j;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof ndy) {
            return Arrays.equals(this.f31377a, ((ndy) obj).f31377a);
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Arrays.hashCode(this.f31377a);
    }

    public String toString() {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : this.f31377a) {
            if (sb.length() > 0) {
                sb.append(":");
            }
            sb.append(String.format("%02X", Integer.valueOf(b & 255)));
        }
        return sb.toString();
    }
}
