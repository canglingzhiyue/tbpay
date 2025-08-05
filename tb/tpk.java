package tb;

import android.util.Printer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.h;

/* loaded from: classes5.dex */
public class tpk implements Printer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f34253a;

    public tpk(String str) {
        this.f34253a = str;
    }

    @Override // android.util.Printer
    public void println(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c611640", new Object[]{this, str});
        } else {
            h.b(this.f34253a, str);
        }
    }
}
