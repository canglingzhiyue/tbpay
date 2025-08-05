package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.sf.j;

/* loaded from: classes7.dex */
public class npz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static npz f31638a;
    private nqz<ActivateTypedBean> b = new nqz<>(j.f19452a);
    private nqz<ActivateTypedBean> c = new nqz<>(j.f19452a);
    private npy d = new npy(j.f19452a);

    static {
        kge.a(-1032222002);
        f31638a = new npz();
    }

    private npz() {
    }

    public static npz a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (npz) ipChange.ipc$dispatch("f085926", new Object[0]) : f31638a;
    }

    public nqz<ActivateTypedBean> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nqz) ipChange.ipc$dispatch("16ba0246", new Object[]{this}) : this.b;
    }

    public nqz<ActivateTypedBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nqz) ipChange.ipc$dispatch("1e6ba7a5", new Object[]{this}) : this.c;
    }

    public npy d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (npy) ipChange.ipc$dispatch("261d4924", new Object[]{this}) : this.d;
    }
}
