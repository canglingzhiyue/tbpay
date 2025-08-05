package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes6.dex */
public class jfd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f29514a;
    private final File[] b;

    /* loaded from: classes6.dex */
    public interface a {
        void accept(File file);
    }

    public static jfd a(File[] fileArr, a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jfd) ipChange.ipc$dispatch("d05b242f", new Object[]{fileArr, aVar}) : new jfd(fileArr, aVar);
    }

    private jfd(File[] fileArr, a aVar) {
        this.b = fileArr;
        this.f29514a = aVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        File[] fileArr = this.b;
        if (fileArr == null || this.f29514a == null) {
            return;
        }
        for (File file : fileArr) {
            this.f29514a.accept(file);
        }
    }
}
