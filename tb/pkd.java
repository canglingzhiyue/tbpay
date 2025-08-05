package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.listener.a;
import com.taobao.taolive.room.openarchitecture.listener.b;

/* loaded from: classes8.dex */
public abstract class pkd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f32715a;
    private b b;

    static {
        kge.a(-1649218331);
    }

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("822963c1", new Object[]{this}) : this.f32715a;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bfa6601", new Object[]{this, aVar});
        } else {
            this.f32715a = aVar;
        }
    }

    public b b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a7bd6ce1", new Object[]{this}) : this.b;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bfada60", new Object[]{this, bVar});
        } else {
            this.b = bVar;
        }
    }
}
