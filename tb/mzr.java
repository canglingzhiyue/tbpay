package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class mzr implements mzs<myu> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f31339a;

    static {
        kge.a(-1599838099);
        kge.a(-591344146);
        f31339a = Charset.forName("UTF-8");
    }

    @Override // tb.mzs
    public void a(mzn mznVar, myu myuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae21895e", new Object[]{this, mznVar, myuVar});
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
        a(byteArrayOutputStream, mznVar.a());
        a(byteArrayOutputStream, mznVar.b());
        a(byteArrayOutputStream, mznVar.d());
        for (Map.Entry<String, String> entry : mznVar.c()) {
            a(byteArrayOutputStream, entry.getKey(), entry.getValue());
        }
        int size = byteArrayOutputStream.size();
        ByteBuffer a2 = myuVar.a(size);
        if (a2.order() != ByteOrder.BIG_ENDIAN) {
            throw new IllegalStateException("Carrier byte order must be big endian.");
        }
        a2.put(byteArrayOutputStream.toByteArray(), 0, size);
    }

    @Override // tb.mzs
    public mzn a(myu myuVar) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mzn) ipChange.ipc$dispatch("38528976", new Object[]{this, myuVar});
        }
        ByteBuffer a2 = myuVar.a();
        a2.rewind();
        if (a2.order() != ByteOrder.BIG_ENDIAN) {
            throw new IllegalStateException("Carrier byte order must be big endian.");
        }
        int i = a2.getInt();
        byte[] bArr = new byte[i];
        a2.get(bArr, 0, i);
        String str = new String(bArr, 0, i, f31339a);
        int i2 = a2.getInt();
        byte[] bArr2 = new byte[i2];
        a2.get(bArr2, 0, i2);
        String str2 = new String(bArr2, 0, i2, f31339a);
        int i3 = a2.getInt();
        if (i3 > 0) {
            hashMap = new HashMap(i3);
            byte[] bArr3 = new byte[32];
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = a2.getInt();
                byte[] a3 = a(i5, bArr3);
                a2.get(a3, 0, i5);
                String str3 = new String(a3, 0, i5, f31339a);
                int i6 = a2.getInt();
                bArr3 = a(i6, a3);
                a2.get(bArr3, 0, i6);
                hashMap.put(str3, new String(bArr3, 0, i6, f31339a));
            }
        } else {
            hashMap = null;
        }
        if (!StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str)) {
            return new mzn(str, str2, hashMap);
        }
        return null;
    }

    private byte[] a(int i, byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("9e10277b", new Object[]{this, new Integer(i), bArr}) : i <= bArr.length ? bArr : new byte[i];
    }

    private void a(ByteArrayOutputStream byteArrayOutputStream, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab4ade40", new Object[]{this, byteArrayOutputStream, new Integer(i)});
            return;
        }
        byteArrayOutputStream.write((byte) (i >> 24));
        byteArrayOutputStream.write((byte) (i >> 16));
        byteArrayOutputStream.write((byte) (i >> 8));
        byteArrayOutputStream.write((byte) i);
    }

    private void a(ByteArrayOutputStream byteArrayOutputStream, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("307958b7", new Object[]{this, byteArrayOutputStream, str, str2});
            return;
        }
        byte[] bytes = str.getBytes(f31339a);
        int length = bytes.length;
        a(byteArrayOutputStream, length);
        byteArrayOutputStream.write(bytes, 0, length);
        byte[] bytes2 = str2.getBytes(f31339a);
        int length2 = str2.length();
        a(byteArrayOutputStream, length2);
        byteArrayOutputStream.write(bytes2, 0, length2);
    }

    private void a(ByteArrayOutputStream byteArrayOutputStream, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6501002d", new Object[]{this, byteArrayOutputStream, str});
            return;
        }
        byte[] bytes = str.getBytes(f31339a);
        int length = bytes.length;
        a(byteArrayOutputStream, length);
        byteArrayOutputStream.write(bytes, 0, length);
    }
}
