package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;

/* loaded from: classes7.dex */
public class kzq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public kyu f30421a;
    public IPopData b;

    public kzq(kyu kyuVar, IPopData iPopData) {
        this.f30421a = kyuVar;
        this.b = iPopData;
    }

    public kyu a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kyu) ipChange.ipc$dispatch("f071d37", new Object[]{this}) : this.f30421a;
    }

    public IPopData b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPopData) ipChange.ipc$dispatch("166f8f59", new Object[]{this}) : this.b;
    }
}
