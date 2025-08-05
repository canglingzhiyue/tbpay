package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"deepClone", "Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "ultron-view-kit_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class adq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(492956088);
    }

    public static final DXTemplateItem a(DXTemplateItem deepClone) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("762f314e", new Object[]{deepClone});
        }
        q.d(deepClone, "$this$deepClone");
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f11925a = deepClone.f();
        dXTemplateItem.l = deepClone.i();
        dXTemplateItem.c = deepClone.c;
        dXTemplateItem.b = deepClone.g();
        dXTemplateItem.b(deepClone.d());
        dXTemplateItem.e = deepClone.e;
        dXTemplateItem.f = deepClone.f;
        dXTemplateItem.g = deepClone.g;
        dXTemplateItem.d = deepClone.d;
        return dXTemplateItem;
    }
}
