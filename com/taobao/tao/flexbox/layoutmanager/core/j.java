package com.taobao.tao.flexbox.layoutmanager.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.af;
import com.taobao.tao.flexbox.layoutmanager.core.h;
import java.util.HashMap;
import java.util.List;
import tb.kge;
import tb.oec;

/* loaded from: classes8.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public af f20359a;
        public int b;

        static {
            kge.a(-89515456);
        }

        public b(af afVar, int i) {
            this.f20359a = afVar;
            this.b = i;
        }
    }

    static {
        kge.a(-1897621140);
    }

    public static boolean a(aa aaVar, List<v> list, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        boolean z3 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d052b85", new Object[]{aaVar, list, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        for (v vVar : list) {
            int i = vVar.f20365a;
            if (i == 1) {
                aaVar.a(((Integer) vVar.b).intValue(), (af) vVar.c, z2);
            } else if (i == 2) {
                aaVar.a(((Integer) vVar.b).intValue(), ((Integer) vVar.c).intValue(), z2);
            } else if (i == 4) {
                aaVar.b(((Integer) vVar.b).intValue(), ((Integer) vVar.c).intValue(), z2);
            } else if (i == 5) {
                aaVar.b((String) vVar.b, vVar.c, z2);
            }
            z3 = true;
        }
        if (!aaVar.n() && aaVar.I() != null) {
            aaVar.I().parseViewParams(aaVar.y());
        }
        return z3;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : str.equals("html-text") || str.equals("text") || str.contains("width") || str.contains("height") || str.startsWith("padding") || str.startsWith("margin") || str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_font_size) || str.equals("top") || str.equals("left") || str.equals("right") || str.equals("bottom") || str.equals("font") || str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_font_style) || str.equals("lines") || str.equals("attrs");
    }

    public static void a(List<af> list, List<ag> list2, af.d dVar, List<v> list3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f22b7e", new Object[]{list, list2, dVar, list3});
            return;
        }
        int size = list2.size() - 1;
        HashMap hashMap = null;
        int i = 0;
        int size2 = list.size() - 1;
        int i2 = 0;
        while (i2 <= size2 && i <= size) {
            af afVar = (i2 < 0 || i2 >= list.size()) ? null : list.get(i2);
            af afVar2 = (size2 < 0 || size2 >= list.size()) ? null : list.get(size2);
            ag agVar = (i < 0 || i >= list2.size()) ? null : list2.get(i);
            ag agVar2 = (size < 0 || size >= list2.size()) ? null : list2.get(size);
            if (a(dVar, afVar, agVar, false)) {
                a(dVar, list, i2, agVar, list3);
            } else {
                if (a(dVar, afVar2, agVar2, false)) {
                    a(dVar, list, size2, agVar2, list3);
                } else if (a(dVar, afVar, agVar2, false)) {
                    a(dVar, list, i2, agVar2, list3);
                    a(list, i2, size2 + 1, list3);
                } else if (a(dVar, afVar2, agVar, false)) {
                    a(dVar, list, size2, agVar, list3);
                    a(list, size2, i2, list3);
                } else {
                    Object a2 = a(dVar, null, agVar);
                    if (a2 != null && hashMap == null) {
                        hashMap = a(dVar, list, i2, size2);
                    }
                    b bVar = a2 != null ? (b) hashMap.remove(a2) : null;
                    if (bVar != null) {
                        int indexOf = bVar.f20359a == list.get(bVar.b) ? bVar.b : list.indexOf(bVar.f20359a);
                        a(dVar, list, indexOf, agVar, list3);
                        a(list, indexOf, i2, list3);
                        i++;
                        i2++;
                    } else {
                        a(dVar, list, agVar, i2, list3);
                        i2++;
                        size2++;
                        i++;
                    }
                }
                size2--;
                size--;
            }
            i2++;
            i++;
        }
        if (i2 > size2) {
            while (i <= size) {
                a(dVar, list, list2.get(i), i, list3);
                i++;
            }
        } else if (i <= size) {
        } else {
            b(list, i, (size2 - i2) + 1, list3);
        }
    }

    public static boolean a(af.d dVar, af afVar, ag agVar, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("caee4008", new Object[]{dVar, afVar, agVar, new Boolean(z)})).booleanValue();
        }
        if (dVar != null) {
            z2 = dVar.b(afVar, agVar);
        }
        return (z || !z2) ? z2 : oec.a(a(dVar, afVar, null), a(dVar, null, agVar));
    }

    private static Object a(af.d dVar, af afVar, ag agVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("56844462", new Object[]{dVar, afVar, agVar});
        }
        if (dVar == null) {
            return null;
        }
        return dVar.a(afVar, agVar);
    }

    public static void a(af.d dVar, List<af> list, int i, ag agVar, List<v> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1971f5ba", new Object[]{dVar, list, new Integer(i), agVar, list2});
        } else {
            dVar.c(list.get(i), agVar);
        }
    }

    public static void a(af.d dVar, List<af> list, ag agVar, int i, List<v> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afef66f6", new Object[]{dVar, list, agVar, new Integer(i), list2});
            return;
        }
        af a2 = dVar.a(agVar);
        list.add(i, a2);
        list2.add(new v(1, Integer.valueOf(i), a2));
    }

    public static void a(List<af> list, int i, int i2, List<v> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b99126a", new Object[]{list, new Integer(i), new Integer(i2), list2});
            return;
        }
        af remove = list.remove(i);
        if (i > i2) {
            list.add(i2, remove);
        } else if (i < i2) {
            list.add(i2 - 1, remove);
        }
        list2.add(new v(2, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void b(List<af> list, int i, int i2, List<v> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("449a09ab", new Object[]{list, new Integer(i), new Integer(i2), list2});
            return;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            af remove = list.remove(i + i3);
            if (remove != null) {
                remove.b = null;
            }
        }
        list2.add(new v(4, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static HashMap a(af.d dVar, List<af> list, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("52eb1b5f", new Object[]{dVar, list, new Integer(i), new Integer(i2)});
        }
        HashMap hashMap = new HashMap();
        while (i <= i2) {
            af afVar = list.get(i);
            Object a2 = a(dVar, afVar, null);
            if (a2 != null) {
                hashMap.put(a2, new b(afVar, i));
            }
            i++;
        }
        return hashMap;
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final h.b f20358a;
        private final Object b;

        static {
            kge.a(-286030073);
        }

        public a(h.b bVar, Object obj) {
            this.f20358a = bVar;
            this.b = obj;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f20358a != aVar.f20358a) {
                return false;
            }
            Object obj2 = this.b;
            if (!(obj2 instanceof Number) || !(aVar.b instanceof Number)) {
                return oec.a(this.b, aVar.b);
            }
            return ((Number) obj2).doubleValue() == ((Number) aVar.b).doubleValue();
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            h.b bVar = this.f20358a;
            int hashCode = (527 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Object obj = this.b;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode + i;
        }
    }
}
