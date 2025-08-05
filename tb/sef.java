package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class sef {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f33514a;
    public a b;
    public a c;

    /* loaded from: classes8.dex */
    public interface a {
        View getView();
    }

    static {
        kge.a(1575785383);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb56927", new Object[]{this, aVar});
        } else {
            this.f33514a = aVar;
        }
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f690d368", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("5818480c", new Object[]{this}) : this.b;
    }

    public void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("506c3da9", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    public a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("39f611ab", new Object[]{this}) : this.c;
    }
}
