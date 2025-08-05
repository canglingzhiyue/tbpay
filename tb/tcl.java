package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;

/* loaded from: classes4.dex */
public class tcl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f34024a = "fast_kv";
    private final String b = "0.0.1";
    private final Date c;
    private final List<tck> d;

    static {
        kge.a(1572102320);
    }

    public tcl(Date date, List<tck> list) {
        this.c = date;
        this.d = list;
    }

    public void a(OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f4ac5a", new Object[]{this, outputStream});
            return;
        }
        tci tciVar = new tci(outputStream);
        try {
            tciVar.write("fast_kv".getBytes(StandardCharsets.UTF_8));
            tciVar.write(0);
            tciVar.write("0.0.1".getBytes(StandardCharsets.UTF_8));
            tciVar.write(0);
            long time = this.c.getTime();
            tciVar.a((int) (time >> 32));
            tciVar.a((int) time);
            for (tck tckVar : this.d) {
                tckVar.a(tciVar);
            }
            tciVar.flush();
            tciVar.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (th != null) {
                    try {
                        tciVar.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                } else {
                    tciVar.close();
                }
                throw th2;
            }
        }
    }
}
