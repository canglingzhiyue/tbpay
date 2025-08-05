package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.DetailOptNode;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class eim implements eio<String, DetailOptNode> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, DetailOptNode> f27325a = new ConcurrentHashMap<>();

    static {
        kge.a(805533261);
        kge.a(968905969);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.taobao.android.detail.datasdk.model.datamodel.node.DetailOptNode] */
    @Override // tb.eio
    public /* synthetic */ DetailOptNode a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("9798556e", new Object[]{this, str}) : b2(str);
    }

    @Override // tb.eio
    public /* synthetic */ void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, str});
        } else {
            a2(str);
        }
    }

    public eim() {
        emu.a("com.taobao.android.detail.core.performance.conifg.DetailOptMemoryManager");
    }

    @Override // tb.eio
    public void a(String str, DetailOptNode detailOptNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2526c8ca", new Object[]{this, str, detailOptNode});
        } else {
            this.f27325a.put(str, detailOptNode);
        }
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void a2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f27325a.remove(str);
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public DetailOptNode b2(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailOptNode) ipChange.ipc$dispatch("fe95075b", new Object[]{this, str}) : this.f27325a.get(str);
    }
}
