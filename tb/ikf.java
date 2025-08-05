package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;

/* loaded from: classes6.dex */
public class ikf implements ihx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ihx f29117a;
    private final iju b;
    private final ijh c;

    public ikf(ihx ihxVar, iju ijuVar, ijh ijhVar) {
        this.f29117a = ihxVar;
        this.b = ijuVar;
        this.c = ijhVar;
    }

    @Override // tb.ihx
    public ihw a(String str) {
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ihw) ipChange.ipc$dispatch("7c709ddc", new Object[]{this, str});
        }
        if (!str.endsWith(".prof")) {
            return this.f29117a.a(str);
        }
        if (!ikw.a((CharSequence) this.b.b(), (CharSequence) iju.ABI_ARM64)) {
            return ihw.a(str, 5050);
        }
        ihw a2 = this.f29117a.a(str);
        String b = a2.b();
        if (!a2.g() || ikw.a((CharSequence) b)) {
            this.c.b(str);
            return a2;
        }
        File file = new File(b);
        File file2 = new File(file.getParentFile(), str);
        if (file2.isFile() && file.length() == file2.length()) {
            RSoLog.c("prof-> fetch from exist file lib=" + str);
            return ihw.a(str, file2.getPath());
        }
        try {
            fileInputStream = new FileInputStream(b);
            iku.a(fileInputStream, file2);
        } catch (Throwable th) {
            ikq.a("fetch-primary.prof", th);
        }
        if (file.length() != file2.length()) {
            fileInputStream.close();
            return a2;
        }
        RSoLog.c("prof-> fetch from copy file lib=" + str);
        ihw a3 = ihw.a(str, file2.getPath());
        fileInputStream.close();
        return a3;
    }

    @Override // tb.ihx
    public iht a(List<String> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iht) ipChange.ipc$dispatch("fa5cf678", new Object[]{this, list}) : this.f29117a.a(list);
    }

    @Override // tb.ihx
    public ihw b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihw) ipChange.ipc$dispatch("7d1d497b", new Object[]{this, str}) : this.f29117a.b(str);
    }

    @Override // tb.ihx
    public void a(String str, ihu ihuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d9bf9ac", new Object[]{this, str, ihuVar});
        } else {
            this.f29117a.a(str, ihuVar);
        }
    }

    @Override // tb.ihx
    public void a(List<String> list, ihs ihsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d39d715", new Object[]{this, list, ihsVar});
        } else {
            this.f29117a.a(list, ihsVar);
        }
    }
}
