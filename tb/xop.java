package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.acj;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/taobao/mytaobao/pagev2/diff/MtbDiffCallback;", "Landroid/support/v7/util/DiffUtil$Callback;", "oldList", "", "Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbComponentModel;", "newList", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xop extends acj.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<xol> f34435a;
    private final List<xol> b;

    static {
        kge.a(1831720125);
    }

    public xop(List<xol> oldList, List<xol> newList) {
        q.c(oldList, "oldList");
        q.c(newList, "newList");
        this.f34435a = oldList;
        this.b = newList;
    }

    @Override // tb.acj.a
    public boolean areItemsTheSame(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("501767f6", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : q.a((Object) q.a(this.f34435a.get(i).b(), (Object) this.f34435a.get(i).c()), (Object) q.a(this.b.get(i2).b(), (Object) this.b.get(i2).c()));
    }

    @Override // tb.acj.a
    public int getOldListSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cc12e44a", new Object[]{this})).intValue() : this.f34435a.size();
    }

    @Override // tb.acj.a
    public int getNewListSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f8e07243", new Object[]{this})).intValue() : this.b.size();
    }

    @Override // tb.acj.a
    public boolean areContentsTheSame(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a1603f74", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : q.a((Object) this.b.get(i2).d(), (Object) this.f34435a.get(i).d());
    }
}
