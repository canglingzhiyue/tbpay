package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;

/* loaded from: classes8.dex */
public class oze extends ozc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final long f32506a;
    private final int b;

    static {
        kge.a(-1405231834);
    }

    public static /* synthetic */ Object ipc$super(oze ozeVar, String str, Object... objArr) {
        if (str.hashCode() == -1969774625) {
            super.a((File) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ozc, tb.oyy
    public /* bridge */ /* synthetic */ void a(File file) throws IOException {
        super.a(file);
    }

    public oze(long j, int i) {
        if (j > 0) {
            if (i <= 0) {
                throw new IllegalArgumentException("Max count must be positive number!");
            }
            this.f32506a = j;
            this.b = i;
            return;
        }
        throw new IllegalArgumentException("Max size must be positive number!");
    }

    @Override // tb.ozc
    public boolean a(File file, long j, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("433df8e2", new Object[]{this, file, new Long(j), new Integer(i)})).booleanValue() : j <= this.f32506a && i <= this.b;
    }
}
