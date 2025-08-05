package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/taobao/mytaobao/pagev2/architecture/viewtype/ViewTypeHelper;", "", "()V", "dxViewTypeCounter", "", "identify2type", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "weexViewTypeCounter", "isDx", "", b.VIEW_TYPE, "isWeex", "processViewType", "mtbComponentModel", "Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbComponentModel;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xof {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int b;

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, Integer> f34424a = new HashMap<>(8);
    private int c = 10000;

    static {
        kge.a(2047936611);
    }

    public final boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : i >= 0 && 9999 >= i;
    }

    public final boolean b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue() : 10000 <= i && 19999 >= i;
    }

    public final int a(xol mtbComponentModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a8c256", new Object[]{this, mtbComponentModel})).intValue();
        }
        q.c(mtbComponentModel, "mtbComponentModel");
        String str = mtbComponentModel.c() + '_' + mtbComponentModel.b();
        if (this.f34424a.containsKey(str)) {
            Integer num = this.f34424a.get(str);
            if (num == null) {
                q.a();
            }
            q.a((Object) num, "identify2type[identify]!!");
            return num.intValue();
        } else if (q.a((Object) mtbComponentModel.c(), (Object) "weex")) {
            this.c++;
            this.f34424a.put(str, Integer.valueOf(this.c));
            return this.c;
        } else if (!q.a((Object) mtbComponentModel.c(), (Object) "dinamicx")) {
            return -1;
        } else {
            this.b++;
            this.f34424a.put(str, Integer.valueOf(this.b));
            return this.b;
        }
    }
}
