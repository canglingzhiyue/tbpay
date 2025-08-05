package tb;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class dup {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2086550756);
    }

    public static int a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46606589", new Object[]{recyclerView})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        return -1;
    }

    public static int a(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c705294c", new Object[]{list})).intValue();
        }
        if (bau.a(list)) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (a(list.get(i2))) {
                i++;
            }
        }
        return i;
    }

    private static boolean a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca7f23d7", new Object[]{aURARenderComponent})).booleanValue();
        }
        if (aURARenderComponent == null) {
            return false;
        }
        if (c(aURARenderComponent) || b(aURARenderComponent)) {
            return true;
        }
        AURARenderComponent aURARenderComponent2 = aURARenderComponent.parent;
        if (aURARenderComponent2 != null) {
            return a(aURARenderComponent2);
        }
        return false;
    }

    private static boolean b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66ed2036", new Object[]{aURARenderComponent})).booleanValue() : (aURARenderComponent == null || aURARenderComponent.data == null || aURARenderComponent.data.layout == null || !"sticky".equalsIgnoreCase(aURARenderComponent.data.layout.type)) ? false : true;
    }

    private static boolean c(AURARenderComponent aURARenderComponent) {
        Map<String, Object> map;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35b1c95", new Object[]{aURARenderComponent})).booleanValue();
        }
        if (aURARenderComponent == null || aURARenderComponent.data == null || (map = aURARenderComponent.data.fields) == null || (obj = map.get("isFloat")) == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            return Boolean.parseBoolean((String) obj);
        }
        return false;
    }
}
