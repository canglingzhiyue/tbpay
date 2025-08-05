package com.taobao.android.ultron.datamodel.imp.delta;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;
import tb.jnq;
import tb.jpv;
import tb.kge;

/* loaded from: classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CARD_GROUP_TAG = "CardGroupTag";
    public static final String POSITION_TAG = "PositionTag";
    public static final String TAG = "OperateUtils";

    static {
        kge.a(-5711713);
    }

    public static String[] a(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ad023781", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || (indexOf = str.indexOf("_")) <= 0 || indexOf >= str.length() - 1) {
            return null;
        }
        return new String[]{str.substring(0, indexOf), str.substring(indexOf + 1, str.length())};
    }

    public static String a(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c42d0ab8", new Object[]{iDMComponent, iDMComponent2});
        }
        String str = null;
        if (iDMComponent != null && iDMComponent.getFields() != null && iDMComponent.getPosition() != null) {
            str = iDMComponent.getPosition();
        }
        return (iDMComponent2 == null || iDMComponent2.getExtMap() == null || iDMComponent2.getExtMap().get("PositionTag") == null || TextUtils.isEmpty(String.valueOf(iDMComponent2.getExtMap().get("PositionTag")))) ? str : (String) iDMComponent2.getExtMap().get("PositionTag");
    }

    public static String b(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2bf9697", new Object[]{iDMComponent, iDMComponent2});
        }
        String str = null;
        if (iDMComponent != null && iDMComponent.getFields() != null && "true".equals(iDMComponent.getCardGroup())) {
            str = iDMComponent.getKey();
        }
        return (iDMComponent2 == null || iDMComponent2.getExtMap() == null || iDMComponent2.getExtMap().get("CardGroupTag") == null || TextUtils.isEmpty(String.valueOf(iDMComponent2.getExtMap().get("CardGroupTag")))) ? str : (String) iDMComponent2.getExtMap().get("CardGroupTag");
    }

    public static void a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{list});
        } else {
            a(list, (jnq<IDMComponent>) null);
        }
    }

    public static void a(List<IDMComponent> list, jnq<IDMComponent> jnqVar) {
        int i;
        String str;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4253fc", new Object[]{list, jnqVar});
            return;
        }
        List<IDMComponent> b = b(list);
        if (b == null) {
            return;
        }
        String str2 = "";
        IDMComponent iDMComponent = null;
        int i3 = 1;
        while (true) {
            i = 17;
            if (i2 >= b.size() - 1) {
                break;
            }
            iDMComponent = b.get(i2);
            if (jnqVar != null) {
                jnqVar.a(iDMComponent);
            }
            if (iDMComponent.getExtMap() != null && (str = (String) iDMComponent.getExtMap().get("CardGroupTag")) != null) {
                str2 = (String) b.get(i2 + 1).getExtMap().get("CardGroupTag");
                if (str.equals(str2)) {
                    if (1 == i3) {
                        iDMComponent.setCornerTypeFields(1);
                    }
                    i3++;
                } else {
                    if (1 != i3) {
                        i3 = 1;
                        i = 16;
                    }
                    iDMComponent.setCornerTypeFields(i);
                }
            }
            i2++;
        }
        if (1 != i3) {
            i = 16;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        iDMComponent.setCornerTypeFields(i);
    }

    public static List<IDMComponent> b(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2b5ee42d", new Object[]{list});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (IDMComponent iDMComponent : list) {
            if (iDMComponent != null && iDMComponent.isNormalComponent()) {
                arrayList.add(iDMComponent);
            }
        }
        return arrayList;
    }

    public static IDMComponent a(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("ab9f3461", new Object[]{iDMComponent, list});
        }
        if (list == null) {
            return null;
        }
        ArrayList<IDMComponent> arrayList = new ArrayList();
        arrayList.add(iDMComponent);
        List<IDMComponent> a2 = jpv.a(iDMComponent);
        if (a2 != null) {
            arrayList.addAll(a2);
        }
        for (IDMComponent iDMComponent2 : arrayList) {
            if (list.contains(iDMComponent2)) {
                return iDMComponent2;
            }
        }
        return null;
    }

    public static IDMComponent b(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("9ed12c00", new Object[]{iDMComponent, list});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(iDMComponent);
        List<IDMComponent> a2 = jpv.a(iDMComponent);
        if (a2 != null) {
            arrayList.addAll(a2);
        }
        for (int size = arrayList.size() - 1; size >= 0; size++) {
            IDMComponent iDMComponent2 = (IDMComponent) arrayList.get(size);
            if (list.contains(iDMComponent2)) {
                return iDMComponent2;
            }
        }
        return null;
    }
}
