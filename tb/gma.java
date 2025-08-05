package tb;

import android.content.Context;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.util.a;
import java.io.File;

/* loaded from: classes.dex */
public class gma extends gmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Thread f28374a;
    private Context b;
    private File c;

    public static /* synthetic */ Object ipc$super(gma gmaVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-686317);
        f28374a = Looper.getMainLooper().getThread();
    }

    public gma(Context context) {
        this.b = context;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        File file = this.c;
        if (file != null && !file.canWrite()) {
            this.c = null;
        }
        if (this.c == null) {
            File filesDir = this.b.getFilesDir();
            if (filesDir != null && !filesDir.canWrite()) {
                filesDir = null;
            }
            if (filesDir == null && (filesDir = this.b.getCacheDir()) != null && !filesDir.canWrite()) {
                filesDir = null;
            }
            if (filesDir == null) {
                try {
                    filesDir = this.b.getExternalFilesDir(null);
                } catch (Exception e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    a.b("FileStore", "AndroidFileSystemInitDirError", message);
                    filesDir = null;
                }
                if (filesDir != null && !filesDir.canWrite()) {
                    filesDir = null;
                }
                if (filesDir == null && (filesDir = this.b.getExternalCacheDir()) != null && !filesDir.canWrite()) {
                    filesDir = null;
                }
            }
            if (filesDir == null) {
                return;
            }
            this.c = new File(filesDir, "fast_store");
        }
        if (this.c.exists() || this.c.mkdirs()) {
            return;
        }
        this.c.mkdirs();
    }

    @Override // tb.gmb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        b();
        return this.c.getAbsolutePath();
    }
}
