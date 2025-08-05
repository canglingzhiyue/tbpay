package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes6.dex */
public class jfg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jdy f29517a;

    public jfg(jdy jdyVar) {
        this.f29517a = jdyVar;
    }

    public File[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File[]) ipChange.ipc$dispatch("ef512a24", new Object[]{this});
        }
        File c = new jge(this.f29517a.a(), this.f29517a.c()).c();
        if (!c.exists()) {
            jfj.a("UcAnrFilesFilter", "uc dir not exist");
            return new File[0];
        }
        $$Lambda$jfg$D9nJ4HdHmYlyEAWDudmXpOAh98 __lambda_jfg_d9nj4hdhmylyeawdudmxpoah98 = $$Lambda$jfg$D9nJ4HdHmYlyEAWDudmXpOAh98.INSTANCE;
        jdp a2 = jdp.a(this.f29517a);
        try {
            File[] listFiles = c.listFiles(__lambda_jfg_d9nj4hdhmylyeawdudmxpoah98);
            if (listFiles != null && listFiles.length > 0) {
                if (!a2.a()) {
                    return listFiles;
                }
                jgl.a(listFiles);
                return new File[0];
            }
            a2.c();
            return new File[0];
        } finally {
            a2.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue() : file.getName().endsWith("anr.log");
    }
}
