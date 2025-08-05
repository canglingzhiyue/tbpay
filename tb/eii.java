package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.DetailClientDataNode;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class eii implements eio<String, DetailClientDataNode.DetailClientOpt> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, DetailClientDataNode.DetailClientOpt> f27320a = new ConcurrentHashMap<>();

    static {
        kge.a(-183023304);
        kge.a(968905969);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.android.detail.datasdk.model.datamodel.node.DetailClientDataNode$DetailClientOpt, java.lang.Object] */
    @Override // tb.eio
    public /* synthetic */ DetailClientDataNode.DetailClientOpt a(String str) {
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

    public eii() {
        emu.a("com.taobao.android.detail.core.performance.conifg.DetailClientOptMemoryManager");
    }

    @Override // tb.eio
    public void a(String str, DetailClientDataNode.DetailClientOpt detailClientOpt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea1e2a7", new Object[]{this, str, detailClientOpt});
        } else {
            this.f27320a.put(str, detailClientOpt);
        }
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void a2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f27320a.remove(str);
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public DetailClientDataNode.DetailClientOpt b2(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailClientDataNode.DetailClientOpt) ipChange.ipc$dispatch("a81117c", new Object[]{this, str}) : this.f27320a.get(str);
    }
}
