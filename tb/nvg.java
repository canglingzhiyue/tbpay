package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.c;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.j;
import com.taobao.android.remoteso.resolver2.l;
import java.io.File;

/* loaded from: classes.dex */
public class nvg implements ijk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ijk f31785a;
    private final iju b;
    private final c c;
    private String d;

    public nvg(ijk ijkVar, iju ijuVar, c cVar) {
        this.f31785a = ijkVar;
        this.b = ijuVar;
        this.c = cVar;
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.d = this.b.a().getApplicationInfo().nativeLibraryDir;
        }
    }

    private ijo c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijo) ipChange.ipc$dispatch("7dc9fba4", new Object[]{this, str});
        }
        SoIndexData.SoFileInfo a2 = this.c.a(str, this.c.c());
        if (a2 == null) {
            RSoLog.c("preferApk, fileInfo == null, fallback to preferApk, " + str);
            return d(str);
        } else if (ikw.a((CharSequence) "InApk", (CharSequence) a2.getFrom())) {
            RSoLog.c("preferApk, fileInfo from inapk, go to preferApk, " + str);
            return d(str);
        } else if (!ikx.a(".enablePreferApk")) {
            return null;
        } else {
            RSoLog.c("preferApk, localDevPrefer enabled, fallback to preferApk, " + str);
            return d(str);
        }
    }

    private ijo d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijo) ipChange.ipc$dispatch("7e76a743", new Object[]{this, str});
        }
        RSoLog.c("preferApk, enabled try apk lib = " + str);
        File file = new File(this.d, iky.b(str));
        if (file.isFile()) {
            RSoLog.c("preferApk, found lib in apk, file=" + file);
            j a2 = l.a(str);
            return new ijo(a2, l.a(a2, file.getPath(), "prefer-apk"));
        }
        String b = l.b(str);
        if (b == null) {
            return null;
        }
        j a3 = l.a(str);
        return new ijo(a3, l.a(a3, b, "prefer-apk"));
    }

    @Override // tb.ijk
    public ijo a(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijo) ipChange.ipc$dispatch("7c70a466", new Object[]{this, str});
        }
        ijo c = c(str);
        return c != null ? c : this.f31785a.a(str);
    }

    @Override // tb.ijk
    public ijo b(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijo) ipChange.ipc$dispatch("7d1d5005", new Object[]{this, str});
        }
        ijo c = c(str);
        return c != null ? c : this.f31785a.b(str);
    }

    @Override // tb.ijk
    public void a(String str, ijm ijmVar) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db485b6", new Object[]{this, str, ijmVar});
            return;
        }
        ijo c = c(str);
        if (c != null) {
            ijmVar.onFinish(c);
        } else {
            this.f31785a.a(str, ijmVar);
        }
    }
}
