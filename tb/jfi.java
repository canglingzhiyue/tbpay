package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes6.dex */
public class jfi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jdy f29519a;

    public jfi(jdy jdyVar) {
        this.f29519a = jdyVar;
    }

    public File[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File[]) ipChange.ipc$dispatch("ef512a24", new Object[]{this});
        }
        File c = new jge(this.f29519a.a(), this.f29519a.c()).c();
        if (!c.exists()) {
            jfj.a("UcOtherFileFilter", "uc dir not exist");
            return new File[0];
        }
        return c.listFiles($$Lambda$jfi$o4nK9Yla3f0vdPody0wuRNA5QM.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue();
        }
        String name = file.getName();
        return !name.endsWith("jni.log") && !name.endsWith("anr.log");
    }
}
