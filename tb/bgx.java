package tb;

import android.content.Context;
import android.content.pm.PackageManager;
import com.alipay.android.msp.framework.statisticsv2.value.CountValue;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class bgx extends bgy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f25888a;

    static {
        kge.a(190011040);
    }

    public static /* synthetic */ Object ipc$super(bgx bgxVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 90991707) {
            if (hashCode != 96532850) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.g());
        }
        return new Integer(super.a());
    }

    public bgx(Context context, String str) throws PackageManager.NameNotFoundException {
        super(context);
        this.f25888a = str;
    }

    public bgx(Context context, boolean z, String str) throws PackageManager.NameNotFoundException {
        super(context, z);
        this.f25888a = str;
    }

    @Override // tb.bgy
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : super.a();
    }

    @Override // tb.bgy
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f25888a;
    }

    @Override // tb.bgy
    public final File c() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("298485e3", new Object[]{this}) : b(new File(d(), "native-libraries"));
    }

    @Override // tb.bgy
    public final File d() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("ee166802", new Object[]{this}) : b(new File(u(), this.f25888a));
    }

    private final File u() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("fbc66c11", new Object[]{this}) : b(new File(o(), "features-update"));
    }

    @Override // tb.bgy
    public final File a(String str) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("c26a5a1b", new Object[]{this, str}) : b(new File(e(), str));
    }

    public final File e() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("b2a84a21", new Object[]{this}) : b(new File(d(), "dex"));
    }

    @Override // tb.bgy
    public final File f() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("773a2c40", new Object[]{this}) : b(new File(d(), "status"));
    }

    @Override // tb.bgy
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        try {
            return new File(d(), CountValue.T_DEPRECATED).exists();
        } catch (Exception unused) {
            return super.g();
        }
    }
}
