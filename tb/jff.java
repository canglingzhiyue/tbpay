package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class jff {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final jdy f29516a;
    private final List<String> b = new ArrayList();

    public static /* synthetic */ boolean lambda$EFAIKk7cZoYO3VXEJrTeTtxU3Ks(jff jffVar, File file) {
        return jffVar.a(file);
    }

    public jff(jdy jdyVar) {
        this.f29516a = jdyVar;
        this.b.add("java");
        this.b.add("native");
    }

    public File[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File[]) ipChange.ipc$dispatch("ef512a24", new Object[]{this}) : new jgd(this.f29516a.a(), this.f29516a.c()).a().listFiles(new FileFilter() { // from class: tb.-$$Lambda$jff$EFAIKk7cZoYO3VXEJrTeTtxU3Ks
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return jff.lambda$EFAIKk7cZoYO3VXEJrTeTtxU3Ks(jff.this, file);
            }
        });
    }

    public /* synthetic */ boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{this, file})).booleanValue();
        }
        String name = file.getName();
        Iterator<String> it = this.b.iterator();
        while (it.hasNext()) {
            if (name.endsWith(it.next() + ".log")) {
                return true;
            }
        }
        return false;
    }
}
