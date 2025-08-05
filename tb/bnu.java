package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ultron.common.model.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class bnu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1335567768);
    }

    public static DXTemplateItem a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("efb21227", new Object[]{aVar});
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        if (aVar == null) {
            return dXTemplateItem;
        }
        dXTemplateItem.f11925a = aVar.c;
        long j = -1;
        try {
            j = Long.parseLong(aVar.e);
        } catch (NumberFormatException unused) {
        }
        dXTemplateItem.b = j;
        dXTemplateItem.c = aVar.d;
        return dXTemplateItem;
    }

    public static a a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a525cc95", new Object[]{dXTemplateItem});
        }
        a aVar = new a();
        if (dXTemplateItem == null) {
            return aVar;
        }
        aVar.c = dXTemplateItem.f11925a;
        aVar.e = String.valueOf(dXTemplateItem.b);
        aVar.d = dXTemplateItem.c;
        return aVar;
    }

    public static ArrayList<a> a(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e0eee6b3", new Object[]{list});
        }
        ArrayList<a> arrayList = new ArrayList<>();
        if (list != null && list.size() != 0) {
            for (DXTemplateItem dXTemplateItem : list) {
                arrayList.add(a(dXTemplateItem));
            }
        }
        return arrayList;
    }
}
