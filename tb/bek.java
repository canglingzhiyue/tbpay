package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.ultron.datamodel.imp.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class bek {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-802908165);
    }

    public static List<String> a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{list});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (IDMComponent iDMComponent : list) {
            if (iDMComponent != null && !TextUtils.isEmpty(iDMComponent.getKey())) {
                arrayList.add(iDMComponent.getKey());
            }
        }
        return arrayList;
    }

    private static List<String> a(List<String> list, Map<String, DMComponent> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("32efe3bb", new Object[]{list, map});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (String str : list) {
            IDMComponent k = bei.k(map.get(str));
            if (k != null) {
                hashSet.add(k.getKey());
            }
        }
        return new ArrayList(hashSet);
    }

    public static ArrayList<String> a(List<String> list, b bVar, List<IDMComponent> list2) {
        List<String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("2a6fe8ec", new Object[]{list, bVar, list2});
        }
        HashSet hashSet = new HashSet();
        List<String> a3 = a(list2);
        if (a3 != null && !a3.isEmpty()) {
            hashSet.addAll(a3);
        }
        if (list == null || list.isEmpty()) {
            return new ArrayList<>(hashSet);
        }
        Map<String, DMComponent> u = bVar.u();
        List<String> a4 = a(list, u);
        if (a4 == null) {
            return new ArrayList<>(hashSet);
        }
        for (String str : a4) {
            if (!TextUtils.isEmpty(str) && (a2 = a(str, u)) != null) {
                hashSet.addAll(a2);
            }
        }
        hashSet.addAll(list);
        return new ArrayList<>(hashSet);
    }

    public static List<String> a(String str, Map<String, DMComponent> map) {
        List<IDMComponent> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f3bb44d4", new Object[]{str, map});
        }
        if (map == null || map.isEmpty() || (a2 = a(map.get(str))) == null || a2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (IDMComponent iDMComponent : a2) {
            if (iDMComponent != null && ("item".equals(iDMComponent.getTag()) || "invalidItem".equals(iDMComponent.getTag()) || "shop".equals(iDMComponent.getTag()) || "bundleHeader".equals(iDMComponent.getTag()))) {
                arrayList.add(iDMComponent.getKey());
            }
        }
        return arrayList;
    }

    public static List<IDMComponent> a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c63e14db", new Object[]{iDMComponent});
        }
        if (iDMComponent == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        List<IDMComponent> children = iDMComponent.getChildren();
        if (children == null || children.isEmpty()) {
            return null;
        }
        for (IDMComponent iDMComponent2 : children) {
            if (iDMComponent2 != null) {
                hashSet.add(iDMComponent2);
                List<IDMComponent> a2 = a(iDMComponent2);
                if (a2 != null) {
                    hashSet.addAll(a2);
                }
            }
        }
        return new ArrayList(hashSet);
    }

    public static DXRootView a(ViewGroup viewGroup, String str) {
        DXRootView dXRootView;
        JSONObject data;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("6d36e206", new Object[]{viewGroup, str});
        }
        if (viewGroup != null && !TextUtils.isEmpty(str)) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if ((childAt instanceof DXRootView) && (data = (dXRootView = (DXRootView) childAt).getData()) != null && (string = data.getString("tag")) != null && string.startsWith(str)) {
                    return dXRootView;
                }
            }
        }
        return null;
    }

    public static void a(bbz bbzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16d505e", new Object[]{bbzVar});
            return;
        }
        try {
            for (IDMComponent iDMComponent : bbzVar.n().x().c()) {
                if (iDMComponent != null && "submitPromotion".equals(iDMComponent.getTag())) {
                    bbzVar.x().a(iDMComponent);
                }
            }
        } catch (Exception e) {
            bed.a("refreshSubmitPromotionComponents", e.getMessage());
        }
    }
}
