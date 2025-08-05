package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes6.dex */
public class jfe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jdy f29515a;

    public jfe(jdy jdyVar) {
        this.f29515a = jdyVar;
    }

    public File[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File[]) ipChange.ipc$dispatch("ef512a24", new Object[]{this}) : new jgd(this.f29515a.a(), this.f29515a.c()).a().listFiles($$Lambda$jfe$raFSZj1gqlY3BcPlBwgAcHoo.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue() : file.getName().endsWith("anr.log");
    }
}
