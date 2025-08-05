package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.fresco.common.internal.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class dil implements dij {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final File f26787a;

    static {
        kge.a(-96387313);
        kge.a(-1013970829);
    }

    private dil(File file) {
        this.f26787a = (File) c.a(file);
    }

    public File c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("298485e3", new Object[]{this}) : this.f26787a;
    }

    @Override // tb.dij
    public InputStream a() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InputStream) ipChange.ipc$dispatch("13bf636b", new Object[]{this}) : new FileInputStream(this.f26787a);
    }

    @Override // tb.dij
    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.f26787a.length();
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj != null && (obj instanceof dil)) {
            return this.f26787a.equals(((dil) obj).f26787a);
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : this.f26787a.hashCode();
    }

    public static dil a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dil) ipChange.ipc$dispatch("9914fa20", new Object[]{file});
        }
        if (file == null) {
            return null;
        }
        return new dil(file);
    }
}
