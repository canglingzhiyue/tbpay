package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import tb.tcp;

/* loaded from: classes4.dex */
public class esl implements qmw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1308338003);
        kge.a(872656749);
    }

    @Override // tb.qmw
    public void a(final Map<String, ?> map, File file, final File file2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac4ab4b", new Object[]{this, map, file, file2});
            return;
        }
        new tcp.b() { // from class: tb.esl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.tcp.b
            public void run() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                try {
                    tct.a(map, bufferedOutputStream);
                    bufferedOutputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        if (th != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        } else {
                            bufferedOutputStream.close();
                        }
                        throw th2;
                    }
                }
            }
        }.run();
        tco.a("KvStoreFileAction", "write to", file2.getAbsolutePath());
    }

    @Override // tb.qmw
    public Map<String, ?> a(File file, File file2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3e7ceacb", new Object[]{this, file, file2});
        }
        if (file2.exists()) {
            tco.a("KvStoreFileAction", "read from", file2.getAbsolutePath());
            return tct.a(file2);
        } else if (file.exists()) {
            tco.a("KvStoreFileAction", "read from", file.getAbsolutePath());
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                HashMap<String, ?> a2 = tcu.a(bufferedInputStream);
                bufferedInputStream.close();
                return a2;
            } finally {
            }
        } else {
            return new HashMap();
        }
    }
}
