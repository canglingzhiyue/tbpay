package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class ijh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final iju f29081a;
    private final ijv b;

    public ijh(iju ijuVar, ijv ijvVar) {
        this.f29081a = ijuVar;
        this.b = ijvVar;
    }

    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        try {
            boolean exists = new File(a(), str).exists();
            if (exists != z) {
                RSoLog.c("RSoResolver,  isPrefetchEnabled = " + exists + ", libName = " + str);
            }
            return exists;
        } catch (Throwable th) {
            ikq.a("isPrefetchEnabled", th);
            RSoLog.c("RSoResolver, caught exception, isPrefetchEnabled = false, libName = " + str);
            return false;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        try {
            File file = new File(a(), str);
            if (file.exists()) {
                RSoLog.c("RSoResolver, prefetch enabled by " + str);
                return;
            }
            iku.a(file, "1");
            RSoLog.c("RSoResolver, prefetch enabled, libName = " + str + ", " + file.exists());
        } catch (Throwable th) {
            ikq.a("enablePrefetch", th);
        }
    }

    private File a() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("a060c1a5", new Object[]{this});
        }
        File file = new File(this.b.a(), "prefetch_enabled");
        File file2 = new File(file, this.f29081a.f());
        if (!file2.isDirectory()) {
            iku.h(file);
            iku.b(file2);
            RSoLog.c("RSoResolver,  init appVerDir = " + file2);
        }
        return file2;
    }
}
