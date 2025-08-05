package mtopsdk.network.domain;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.OutputStream;
import tb.kge;

/* loaded from: classes.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(201126948);
    }

    public long contentLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("905069ba", new Object[]{this})).longValue();
        }
        return -1L;
    }

    public abstract String contentType();

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    public static a create(final String str, final byte[] bArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3d52465d", new Object[]{str, bArr});
        }
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        return new a() { // from class: mtopsdk.network.domain.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // mtopsdk.network.domain.a
            public String contentType() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("f41a3d86", new Object[]{this}) : str;
            }

            @Override // mtopsdk.network.domain.a
            public long contentLength() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("905069ba", new Object[]{this})).longValue() : bArr.length;
            }

            @Override // mtopsdk.network.domain.a
            public void writeTo(OutputStream outputStream) throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90fbe573", new Object[]{this, outputStream});
                } else {
                    outputStream.write(bArr);
                }
            }
        };
    }
}
