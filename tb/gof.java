package tb;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.android.ultron.vfw.viewholder.BundleLineComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* loaded from: classes5.dex */
public class gof {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-845304159);
    }

    public static boolean a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e66567f0", new Object[]{iDMComponent})).booleanValue() : "item".equals(iDMComponent.getTag());
    }

    public static boolean b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("73527f0f", new Object[]{iDMComponent})).booleanValue() : bei.j(iDMComponent);
    }

    public static boolean a(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1bc096ec", new Object[]{iDMComponent, iDMComponent2})).booleanValue() : (iDMComponent == null || iDMComponent2 == null || iDMComponent.getParent() == null || iDMComponent2.getParent() == null || !b(iDMComponent2) || !b(iDMComponent2) || iDMComponent.getParent().getKey() == null || !iDMComponent.getParent().getKey().equals(iDMComponent2.getParent().getKey())) ? false : true;
    }

    public static boolean c(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3f962e", new Object[]{iDMComponent})).booleanValue() : BundleLineComponent.COMPONENT_TAG.equals(iDMComponent.getTag());
    }

    public static boolean d(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8d2cad4d", new Object[]{iDMComponent})).booleanValue() : bei.r(iDMComponent);
    }

    public static boolean f(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a706db8b", new Object[]{iDMComponent})).booleanValue() : bei.m(iDMComponent);
    }

    public static boolean g(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("33f3f2aa", new Object[]{iDMComponent})).booleanValue() : bei.o(iDMComponent);
    }

    public static boolean h(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0e109c9", new Object[]{iDMComponent})).booleanValue() : bei.p(iDMComponent);
    }

    public static String i(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("df5d383c", new Object[]{iDMComponent}) : bei.g(iDMComponent);
    }

    public static String j(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("130b62fd", new Object[]{iDMComponent}) : bei.h(iDMComponent);
    }

    public static int a(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("85acc020", new Object[]{recyclerView, new Integer(i)})).intValue() : recyclerView.getAdapter() instanceof nkj ? i - ((nkj) recyclerView.getAdapter()).a() : i;
    }

    public static List<IDMComponent> k(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8cb51ae5", new Object[]{iDMComponent}) : bei.q(iDMComponent);
    }

    public static List<IDMComponent> l(IDMComponent iDMComponent) {
        IDMComponent parent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("53c101e6", new Object[]{iDMComponent});
        }
        if (iDMComponent != null && (parent = iDMComponent.getParent()) != null) {
            return parent.getChildren();
        }
        return null;
    }

    public static boolean a(List<IDMComponent> list, IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("89318e9d", new Object[]{list, iDMComponent, iDMComponent2})).booleanValue() : list.contains(iDMComponent2);
    }

    public static int a(List<IDMComponent> list, IDMComponent iDMComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ce006bb", new Object[]{list, iDMComponent, new Integer(i)})).intValue();
        }
        List<IDMComponent> k = k(iDMComponent);
        int i2 = -1;
        if (k != null) {
            for (int i3 = i + 1; i3 < list.size(); i3++) {
                IDMComponent iDMComponent2 = list.get(i3);
                if (a(k, iDMComponent, iDMComponent2) && a(iDMComponent2)) {
                    i2 = i3;
                }
            }
        }
        return i2;
    }

    public static Pair<Integer, Integer> b(List<IDMComponent> list, IDMComponent iDMComponent, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("e2603393", new Object[]{list, iDMComponent, new Integer(i)});
        }
        List<IDMComponent> l = l(iDMComponent);
        int i3 = -1;
        if (l != null) {
            int i4 = -1;
            for (int i5 = i - 1; i5 >= 0; i5--) {
                IDMComponent iDMComponent2 = list.get(i5);
                if (l.contains(iDMComponent2) && a(iDMComponent2)) {
                    i4 = i5;
                }
            }
            for (int i6 = i + 1; i6 < list.size(); i6++) {
                IDMComponent iDMComponent3 = list.get(i6);
                if (l.contains(iDMComponent3) && a(iDMComponent3)) {
                    i3 = i6;
                }
            }
            i2 = i3;
            i3 = i4;
        } else {
            i2 = -1;
        }
        return new Pair<>(Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public static int a(List<IDMComponent> list, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8ac5f8e", new Object[]{list, iDMComponent})).intValue();
        }
        for (int i = 0; i < list.size(); i++) {
            if (b(iDMComponent, list.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public static boolean b(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eaa8352d", new Object[]{iDMComponent, iDMComponent2})).booleanValue();
        }
        if (iDMComponent == iDMComponent2) {
            return true;
        }
        return (iDMComponent == null || iDMComponent2 == null || iDMComponent.getKey() == null || !iDMComponent.getKey().equals(iDMComponent2.getKey())) ? false : true;
    }

    public static IDMComponent a(List<IDMComponent> list, int i, int i2) {
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("e16a58fd", new Object[]{list, new Integer(i), new Integer(i2)});
        }
        IDMComponent iDMComponent = null;
        if (i2 > i && (i4 = i2 + 1) < list.size()) {
            iDMComponent = list.get(i4);
            i3 = i4;
        } else if (i2 >= i || (i3 = i2 - 1) < 0) {
            i3 = -1;
        } else {
            iDMComponent = list.get(i3);
        }
        return (iDMComponent == null || iDMComponent.getData() == null || !"hidden".equals(iDMComponent.getData().getString("status"))) ? iDMComponent : a(list, i, i3);
    }

    public static IDMComponent a(List<IDMComponent> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("b4e9dfce", new Object[]{list, new Integer(i)});
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            IDMComponent iDMComponent = list.get(i2);
            if (iDMComponent != null && (a(iDMComponent) || d(iDMComponent))) {
                return iDMComponent;
            }
        }
        return null;
    }

    public static boolean c(List<IDMComponent> list, IDMComponent iDMComponent, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c43c5c4e", new Object[]{list, iDMComponent, new Integer(i)})).booleanValue() : i == list.size() - 1 || b(a(list, list.size() - 1), iDMComponent);
    }

    public static boolean m(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81827d64", new Object[]{iDMComponent})).booleanValue();
        }
        List<IDMComponent> k = k(iDMComponent);
        return k != null && k.indexOf(iDMComponent) == k.size() - 1;
    }

    public static boolean c(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b98fd36e", new Object[]{iDMComponent, iDMComponent2})).booleanValue() : i(iDMComponent) != null && i(iDMComponent).equals(i(iDMComponent2));
    }

    public static List<IDMComponent> a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("2626cdf1", new Object[]{recyclerView}) : ((bnn) ((nkj) recyclerView.getAdapter()).c()).a();
    }

    public static void a(RecyclerView recyclerView, IDMComponent iDMComponent, IDMComponent iDMComponent2, List<IDMComponent> list, List<IDMComponent> list2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61a0678", new Object[]{recyclerView, iDMComponent, iDMComponent2, list, list2});
            return;
        }
        List<IDMComponent> a2 = a(recyclerView);
        IDMComponent iDMComponent3 = null;
        while (true) {
            if (i >= a2.size() - 1) {
                break;
            }
            int i2 = i + 1;
            IDMComponent iDMComponent4 = a2.get(i2);
            if (c(a2.get(i)) && c(iDMComponent4)) {
                iDMComponent3 = a2.remove(i);
                recyclerView.getAdapter().notifyItemRemoved(i);
                break;
            }
            i = i2;
        }
        if (iDMComponent3 == null) {
            return;
        }
        int a3 = a(a2, iDMComponent);
        int size = a3 - list.size();
        int size2 = a3 + list2.size();
        int i3 = size - 1;
        if (i3 >= 0) {
            IDMComponent iDMComponent5 = a2.get(i3);
            if (a(iDMComponent5) && !c(iDMComponent5, iDMComponent)) {
                a2.add(size, iDMComponent3);
                recyclerView.getAdapter().notifyItemInserted(size);
                return;
            }
        }
        int i4 = size2 + 1;
        if (i4 >= a2.size()) {
            return;
        }
        IDMComponent iDMComponent6 = a2.get(i4);
        if (!a(iDMComponent6) || c(iDMComponent6, iDMComponent2)) {
            return;
        }
        a2.add(i4, iDMComponent3);
        recyclerView.getAdapter().notifyItemInserted(i4);
    }

    public static boolean d(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("887771af", new Object[]{iDMComponent, iDMComponent2})).booleanValue();
        }
        if (iDMComponent != null && iDMComponent2 != null) {
            if (TextUtils.equals(i(iDMComponent), i(iDMComponent2))) {
                return true;
            }
            String n = n(iDMComponent);
            String n2 = n(iDMComponent2);
            if ((n != null && n.equals(i(iDMComponent2))) || (n2 != null && n2.equals(i(iDMComponent)))) {
                return true;
            }
        }
        return false;
    }

    public static String n(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1c40e01", new Object[]{iDMComponent}) : iDMComponent.getFields().getString("originalBundleId");
    }

    public static int b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e101280a", new Object[]{recyclerView})).intValue();
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (!(adapter instanceof nkj)) {
            return 0;
        }
        nkj nkjVar = (nkj) adapter;
        return (nkjVar.getItemCount() - nkjVar.a()) - nkjVar.b();
    }
}
