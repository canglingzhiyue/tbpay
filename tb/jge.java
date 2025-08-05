package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes6.dex */
public class jge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f29534a;
    private final String b;

    public jge(Context context, String str) {
        this.f29534a = context;
        this.b = str;
    }

    public File a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("a060c1a5", new Object[]{this}) : jgl.d(new File(this.f29534a.getDir("tombstone", 0), this.b));
    }

    public File b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("64f2a3c4", new Object[]{this}) : jgl.d(new File(a(), "crashsdk"));
    }

    public File c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("298485e3", new Object[]{this}) : jgl.d(new File(b(), "logs"));
    }

    public File d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("ee166802", new Object[]{this}) : jgl.d(new File(b(), "backup"));
    }

    public File e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("b2a84a21", new Object[]{this}) : jgl.d(new File(b(), "java"));
    }
}
