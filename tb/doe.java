package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.u;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class doe extends u {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final InputStream J;

    static {
        kge.a(-1760009854);
    }

    public static /* synthetic */ Object ipc$super(doe doeVar, String str, Object... objArr) {
        if (str.hashCode() == -483678593) {
            super.close();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.fastjson2.u
    public void aT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3b4f1a", new Object[]{this});
        } else if (this.G) {
        } else {
            try {
                InputStream inputStream = this.J;
                byte[] bArr = this.H;
                int i = this.F;
                int i2 = 4096;
                if (this.H.length - this.F < 4096) {
                    i2 = this.H.length - this.F;
                }
                int read = inputStream.read(bArr, i, i2);
                if (read == -1) {
                    this.G = true;
                    this.x = this.F;
                    this.z = this.x;
                    return;
                }
                this.F += read;
                if (this.F != this.H.length) {
                    return;
                }
                this.H = Arrays.copyOf(this.H, this.H.length + this.f2934a.h());
            } catch (IOException e) {
                throw new JSONException("read error", e);
            }
        }
    }

    @Override // com.alibaba.fastjson2.u, com.alibaba.fastjson2.JSONReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        super.close();
        InputStream inputStream = this.J;
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }
}
