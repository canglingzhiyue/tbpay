package tb;

import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bpn;

/* loaded from: classes.dex */
public class bpp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final bpn<UMLinkLogInterface> f26037a = new bpn<>(UMLinkLogInterface.class);

    public static UMLinkLogInterface a() {
        IpChange ipChange = $ipChange;
        return (UMLinkLogInterface) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("8c51e28b", new Object[0]) : f26037a.a(new bpn.a<UMLinkLogInterface>() { // from class: tb.bpp.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [com.alibaba.android.umbrella.link.UMLinkLogInterface, java.lang.Object] */
            @Override // tb.bpn.a
            public /* synthetic */ UMLinkLogInterface a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("bd3407ca", new Object[]{this}) : b();
            }

            public UMLinkLogInterface b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (UMLinkLogInterface) ipChange2.ipc$dispatch("193ef9aa", new Object[]{this}) : new bpo();
            }
        }));
    }
}
