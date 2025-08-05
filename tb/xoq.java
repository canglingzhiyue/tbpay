package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import tb.acj;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/taobao/mytaobao/pagev2/diff/MtbDxDownloadDiffCallback;", "Landroid/support/v7/util/DiffUtil$Callback;", "oldList", "", "Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbComponentModel;", "updatedDxNameList", "", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xoq extends acj.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<xol> f34436a;
    private final List<String> b;

    static {
        kge.a(1704151129);
    }

    @Override // tb.acj.a
    public boolean areItemsTheSame(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("501767f6", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : i == i2;
    }

    public xoq(List<xol> oldList, List<String> updatedDxNameList) {
        DXTemplateItem e;
        String str;
        q.c(oldList, "oldList");
        q.c(updatedDxNameList, "updatedDxNameList");
        this.f34436a = oldList;
        this.b = updatedDxNameList;
        int i = 0;
        for (Object obj : this.f34436a) {
            int i2 = i + 1;
            if (i < 0) {
                p.b();
            }
            xol xolVar = (xol) obj;
            if (!(!q.a((Object) xolVar.c(), (Object) "dinamicx")) && (e = xolVar.e()) != null && (str = e.f11925a) != null && this.b.contains(str)) {
                xolVar.b(true);
            }
            i = i2;
        }
    }

    @Override // tb.acj.a
    public int getOldListSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cc12e44a", new Object[]{this})).intValue() : this.f34436a.size();
    }

    @Override // tb.acj.a
    public int getNewListSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f8e07243", new Object[]{this})).intValue() : this.f34436a.size();
    }

    @Override // tb.acj.a
    public boolean areContentsTheSame(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a1603f74", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : !this.f34436a.get(i).g();
    }
}
