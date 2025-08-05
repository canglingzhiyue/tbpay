package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.ultron.ext.vlayout.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class bll {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1738790689);
    }

    public static List<c> a(Context context, IDMComponent iDMComponent, List<IDMComponent> list, ble bleVar) {
        c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("671684ed", new Object[]{context, iDMComponent, list, bleVar});
        }
        if (list == null) {
            list = new ArrayList<>();
        } else {
            list.clear();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<IDMComponent> arrayList2 = new ArrayList();
        b(iDMComponent, arrayList2);
        for (IDMComponent iDMComponent2 : arrayList2) {
            ArrayList arrayList3 = new ArrayList();
            a(iDMComponent2, arrayList3);
            list.addAll(arrayList3);
            String layoutType = iDMComponent2.getLayoutType();
            if (a(iDMComponent2) == null) {
                a2 = bleVar.a(layoutType).a(context, iDMComponent2.getLayoutStyle());
                a(iDMComponent2, a2);
            } else {
                a2 = a(iDMComponent2);
            }
            a2.b_(arrayList3.size());
            arrayList.add(a2);
        }
        return arrayList;
    }

    public static c a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("eb39ceed", new Object[]{iDMComponent});
        }
        if (iDMComponent == null) {
            return null;
        }
        Object obj = iDMComponent.getExtMap().get("LayoutHelper");
        if (!(obj instanceof c)) {
            return null;
        }
        return (c) obj;
    }

    public static void a(IDMComponent iDMComponent, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aca822f", new Object[]{iDMComponent, cVar});
        } else if (iDMComponent == null) {
        } else {
            iDMComponent.getExtMap().put("LayoutHelper", cVar);
        }
    }

    public static void a(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc3e9cdd", new Object[]{iDMComponent, list});
        } else if (iDMComponent != null) {
            if ("tabcontent".equals(iDMComponent.getLayoutType())) {
                list.add(iDMComponent);
                return;
            }
            List<IDMComponent> children = iDMComponent.getChildren();
            if (children == null || children.isEmpty()) {
                return;
            }
            for (int i = 0; i < children.size(); i++) {
                IDMComponent iDMComponent2 = children.get(i);
                if (iDMComponent2.getChildren() == null || iDMComponent2.getChildren().isEmpty()) {
                    list.add(iDMComponent2);
                } else {
                    a(iDMComponent2, list);
                }
            }
        }
    }

    public static void b(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6af95fc", new Object[]{iDMComponent, list});
        } else if (iDMComponent != null) {
            if ("linear".equals(iDMComponent.getLayoutType())) {
                for (IDMComponent iDMComponent2 : iDMComponent.getChildren()) {
                    c(iDMComponent2, list);
                }
                return;
            }
            c(iDMComponent, list);
        }
    }

    public static void c(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11208f1b", new Object[]{iDMComponent, list});
        } else if (iDMComponent != null) {
            if (TextUtils.isEmpty(iDMComponent.getLayoutType())) {
                List<IDMComponent> children = iDMComponent.getChildren();
                if (children == null || children.isEmpty()) {
                    return;
                }
                if (a(children)) {
                    list.add(b(iDMComponent));
                }
                for (int i = 0; i < children.size(); i++) {
                    IDMComponent iDMComponent2 = children.get(i);
                    if (!TextUtils.isEmpty(iDMComponent2.getLayoutType())) {
                        list.add(iDMComponent2);
                    } else {
                        c(iDMComponent2, list);
                    }
                }
                return;
            }
            list.add(iDMComponent);
        }
    }

    public static IDMComponent b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("2071fb8f", new Object[]{iDMComponent});
        }
        if (iDMComponent == null) {
            return null;
        }
        iDMComponent.setLayoutType("linear");
        return iDMComponent;
    }

    public static boolean a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{list})).booleanValue();
        }
        if (list == null || list.size() <= 0) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            IDMComponent iDMComponent = list.get(i);
            if (iDMComponent.getChildren() != null && iDMComponent.getChildren().size() > 0) {
                return false;
            }
        }
        return true;
    }
}
