package tb;

import com.alibaba.ariver.remoterpc.EncodingUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;

/* loaded from: classes6.dex */
public final class kdh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f29976a;

    static {
        kge.a(1161143954);
        f29976a = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, tof.LF_LINK, tof.LF_SYMLINK, tof.LF_CHR, tof.LF_BLK, tof.LF_DIR, tof.LF_FIFO, tof.LF_CONTIG, 56, 57, 43, gbx.OP_MINIFY_CALL_FUNC};
    }

    public static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr}) : a(bArr, f29976a);
    }

    private static String a(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56fe5b2a", new Object[]{bArr, bArr2});
        }
        byte[] bArr3 = new byte[((bArr.length + 2) << 2) / 3];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int i3 = i + 1;
            bArr3[i] = bArr2[(bArr[i2] & 255) >> 2];
            int i4 = i3 + 1;
            int i5 = i2 + 1;
            bArr3[i3] = bArr2[((bArr[i2] & 3) << 4) | ((bArr[i5] & 255) >> 4)];
            int i6 = i4 + 1;
            int i7 = i2 + 2;
            bArr3[i4] = bArr2[((bArr[i5] & 15) << 2) | ((bArr[i7] & 255) >> 6)];
            i = i6 + 1;
            bArr3[i6] = bArr2[bArr[i7] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            int i8 = i + 1;
            bArr3[i] = bArr2[(bArr[length] & 255) >> 2];
            int i9 = i8 + 1;
            bArr3[i8] = bArr2[(bArr[length] & 3) << 4];
            int i10 = i9 + 1;
            bArr3[i9] = 61;
            i = i10 + 1;
            bArr3[i10] = 61;
        } else if (length2 == 2) {
            int i11 = i + 1;
            bArr3[i] = bArr2[(bArr[length] & 255) >> 2];
            int i12 = i11 + 1;
            int i13 = length + 1;
            bArr3[i11] = bArr2[((bArr[i13] & 255) >> 4) | ((bArr[length] & 3) << 4)];
            int i14 = i12 + 1;
            bArr3[i12] = bArr2[(bArr[i13] & 15) << 2];
            i = i14 + 1;
            bArr3[i14] = 61;
        }
        try {
            return new String(bArr3, 0, i, EncodingUtils.US_ASCII);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
