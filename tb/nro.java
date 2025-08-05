package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.b;
import com.taobao.search.common.util.r;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.q;

/* loaded from: classes7.dex */
public final class nro extends nrl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(895565104);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nro(Activity activity, ium parent, SearchDoorContext searchDoorContext, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, searchDoorContext, viewGroup, iurVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
    }

    @Override // tb.nrl
    public Map<String, String> b() {
        String a2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (r.aK() && (a2 = b.Companion.a().a(b.INVOKE_ID_SEARCH_DOOR_SUGGEST, SearchDoorActivity.PAGE_NAME, Integer.valueOf(r.aM()))) != null) {
            if (a2.length() > 0) {
                z = true;
            }
            if (z) {
                hashMap.put("bxFeature", a2);
            }
        }
        return hashMap;
    }
}
