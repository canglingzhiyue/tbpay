package com.taobao.android.ultron.datamodel.imp;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.vfw.viewholder.BundleLineComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import tb.jqi;
import tb.kge;

/* loaded from: classes6.dex */
public final class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1154175778);
    }

    private static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return "top";
        }
        if (i == 16) {
            return "bottom";
        }
        if (i == 17) {
            return "both";
        }
        return null;
    }

    public static void a(IDMComponent iDMComponent, int i) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6480897", new Object[]{iDMComponent, new Integer(i)});
        } else if (iDMComponent == null || (a2 = a(i)) == null) {
        } else {
            iDMComponent.getFields().put("cornerType", (Object) a2);
        }
    }

    private static void a(b bVar, IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d9832c", new Object[]{bVar, iDMComponent, str});
        } else if (bVar == null || !(iDMComponent instanceof DMComponent)) {
        } else {
            DMComponent dMComponent = (DMComponent) iDMComponent;
            if (dMComponent.getDeltaOpType() != null) {
                return;
            }
            Object obj = null;
            if (iDMComponent.getOnceExtMap() != null) {
                obj = iDMComponent.getOnceExtMap().remove("cornerType");
            }
            if (Objects.equals(str, obj)) {
                return;
            }
            dMComponent.setDeltaOpType("replace");
            bVar.d(iDMComponent.getKey(), "replace");
        }
    }

    private static boolean a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e66567f0", new Object[]{iDMComponent})).booleanValue() : (iDMComponent == null || iDMComponent.getStatus() == 0 || iDMComponent.getFields() == null || iDMComponent.getFields().isEmpty() || BundleLineComponent.COMPONENT_TAG.equals(iDMComponent.getType())) ? false : true;
    }

    private static List<IDMComponent> a(List<IDMComponent> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d637f44c", new Object[]{list, new Boolean(z)});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (IDMComponent iDMComponent : list) {
            if (a(iDMComponent)) {
                arrayList.add(iDMComponent);
                if (z) {
                    Object remove = iDMComponent.getFields().remove("cornerType");
                    if (iDMComponent.getOnceExtMap() != null) {
                        if (remove == null) {
                            iDMComponent.getOnceExtMap().remove("cornerType");
                        } else {
                            iDMComponent.getOnceExtMap().put("cornerType", remove);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static void a(b bVar, List<IDMComponent> list, boolean z) {
        int i;
        String str;
        String a2;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832d5d91", new Object[]{bVar, list, new Boolean(z)});
            return;
        }
        List<IDMComponent> a3 = a(list, z);
        if (a3 == null) {
            return;
        }
        boolean z2 = bVar != null && jqi.a(bVar.h(), "enableUpdateOpTypeWhenCornerTypeChanged", false);
        IDMComponent iDMComponent = null;
        String str2 = "";
        int i3 = 1;
        while (true) {
            i = 17;
            if (i2 >= a3.size() - 1) {
                break;
            }
            IDMComponent iDMComponent2 = a3.get(i2);
            if (iDMComponent2.getExtMap() != null && (str = (String) iDMComponent2.getExtMap().get(f.c)) != null) {
                IDMComponent iDMComponent3 = a3.get(i2 + 1);
                String str3 = (String) iDMComponent3.getExtMap().get(f.c);
                if (str.equals(str3)) {
                    if (1 == i3) {
                        a(iDMComponent2, 1);
                    }
                    i3++;
                    a2 = null;
                } else {
                    if (1 != i3) {
                        i3 = 1;
                        i = 16;
                    }
                    a2 = a(i);
                    a(iDMComponent2, i);
                }
                if (z2) {
                    a(bVar, iDMComponent2, a2);
                }
                iDMComponent = iDMComponent3;
                str2 = str3;
            }
            i2++;
        }
        if (1 != i3) {
            i = 16;
        }
        if (StringUtils.isEmpty(str2)) {
            return;
        }
        a(iDMComponent, i);
    }
}
