package tb;

import android.util.TypedValue;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes7.dex */
public class njf implements nmq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_BYTE_ARRAY = 1;
    public static final int TYPE_INPUT_STREAM = 3;
    public final int k;
    public final int l;
    public final byte[] m;
    public final int n;
    public final InputStream o;
    public TypedValue p;

    static {
        kge.a(1253981131);
        kge.a(-1523452991);
    }

    public njf(byte[] bArr, int i, int i2) {
        this(1, bArr, i, null, i2, null);
    }

    public njf(InputStream inputStream, int i) {
        this(3, null, 0, inputStream, i, null);
    }

    public njf(InputStream inputStream, int i, TypedValue typedValue) {
        this(3, null, 0, inputStream, i, typedValue);
    }

    public njf(int i, byte[] bArr, int i2, InputStream inputStream, int i3, TypedValue typedValue) {
        this.k = i;
        this.m = bArr;
        this.n = i2;
        this.o = inputStream;
        this.l = i3;
        this.p = typedValue;
    }

    @Override // tb.nmq
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        InputStream inputStream = this.o;
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }
}
