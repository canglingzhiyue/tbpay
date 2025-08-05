package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes7.dex */
public class kmt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f30172a;
    public int b;
    public kmq c;
    public kms d;
    public List<kmo> e;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TaskParam{param=" + this.c + ", taskId=" + this.b + ", status=" + this.f30172a + '}';
    }
}
