package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes6.dex */
public class jfh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jdy f29518a;

    public jfh(jdy jdyVar) {
        this.f29518a = jdyVar;
    }

    public File[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File[]) ipChange.ipc$dispatch("ef512a24", new Object[]{this});
        }
        File c = new jge(this.f29518a.a(), this.f29518a.c()).c();
        if (!c.exists()) {
            jfj.a("UcCrashFilesFilter", "uc dir not exist");
            return new File[0];
        }
        File[] listFiles = c.listFiles($$Lambda$jfh$U688n3e3qPo9NLKqo1UM2Wl6gcA.INSTANCE);
        return (listFiles == null || listFiles.length <= 0) ? new File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue() : file.getName().endsWith("jni.log");
    }
}
