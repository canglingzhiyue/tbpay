package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class emi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1923069415);
        emu.a("com.taobao.android.detail.core.standard.utils.AliSDetailMainGalleryFrameUtil");
    }

    public static boolean a(AURARenderComponent aURARenderComponent) {
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

    public static boolean b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66ed2036", new Object[]{aURARenderComponent})).booleanValue() : (aURARenderComponent == null || aURARenderComponent.data == null || aURARenderComponent.data.layout == null || !"sticky".equalsIgnoreCase(aURARenderComponent.data.layout.type)) ? false : true;
    }

    public static int a(int i, List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52638a7f", new Object[]{new Integer(i), list})).intValue();
        }
        if (bau.a(list)) {
            return 0;
        }
        int size = list.size();
        if (i < 0 || i >= size) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < list.size() && i3 < i; i3++) {
            if (a(list.get(i3))) {
                i2++;
            }
        }
        return i2;
    }

    public static int b(int i, List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8e9451e", new Object[]{new Integer(i), list})).intValue();
        }
        if (bau.a(list)) {
            return 0;
        }
        int size = list.size();
        if (i >= 0 && i < size) {
            for (int i3 = size - 1; i3 >= 0 && i3 > i; i3--) {
                if (a(list.get(i3))) {
                    i2++;
                }
            }
        }
        return i2;
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

    public static AURARenderComponent a(AURARenderComponent aURARenderComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("f4c5410c", new Object[]{aURARenderComponent, new Boolean(z)});
        }
        List<AURARenderComponent> list = aURARenderComponent.children;
        if (bau.a(list)) {
            return null;
        }
        for (AURARenderComponent aURARenderComponent2 : list) {
            if (aURARenderComponent2.isRenderAbleLeaf() && ((z && !a(aURARenderComponent2)) || (!z && a(aURARenderComponent2)))) {
                return aURARenderComponent2;
            }
            AURARenderComponent a2 = a(aURARenderComponent2, z);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public static void a(List<AURARenderComponent> list, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e138cc2", new Object[]{list, aURARenderComponent});
        } else if (list != null && aURARenderComponent != null) {
            List<AURARenderComponent> list2 = aURARenderComponent.children;
            if (bau.a(list2)) {
                return;
            }
            for (AURARenderComponent aURARenderComponent2 : list2) {
                if (aURARenderComponent2.isRenderAbleLeaf()) {
                    list.add(aURARenderComponent2);
                } else if (!bau.a(aURARenderComponent2.children)) {
                    a(list, aURARenderComponent2);
                }
            }
        }
    }
}
