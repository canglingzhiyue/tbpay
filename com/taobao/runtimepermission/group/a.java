package com.taobao.runtimepermission.group;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.f;
import com.taobao.runtimepermission.group.e;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import tb.nml;

/* loaded from: classes7.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)}) : i != -3 ? i != -2 ? i != -1 ? i != 0 ? "UNSUPPORTED" : "AUTHORIZED" : "DENIED" : "BIZ_DENIED" : "ROLLBACK";
    }

    public abstract d a(Context context, String str, String[] strArr);

    public abstract void a(c cVar, e.a aVar);

    public static d a(Context context, String str, String[] strArr, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("d2970f5c", new Object[]{context, str, strArr, map}) : a(f.a(context, str, a(map, strArr)), map, strArr);
    }

    public static void a(final c cVar, final e.a aVar, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34905ee", new Object[]{cVar, aVar, map});
        } else {
            f.a(cVar.f18992a, a(map, cVar.b)).a(cVar.e).b(cVar.f).a(cVar.d).b(cVar.c).a(cVar.g).a(new nml() { // from class: com.taobao.runtimepermission.group.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.nml
                public void a(com.taobao.runtimepermission.d dVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c1d4ff8e", new Object[]{this, dVar});
                    } else {
                        aVar.a(a.a(dVar, map, cVar.b));
                    }
                }
            }).a();
        }
    }

    public static String[] a(Map<String, String> map, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("1969b31", new Object[]{map, strArr});
        }
        LinkedList linkedList = new LinkedList();
        for (String str : strArr) {
            String str2 = map.get(str);
            if (!linkedList.contains(str2)) {
                linkedList.add(str2);
            }
        }
        return (String[]) linkedList.toArray(new String[0]);
    }

    public static d a(com.taobao.runtimepermission.d dVar, Map<String, String> map, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("3de88104", new Object[]{dVar, map, strArr});
        }
        HashMap hashMap = new HashMap();
        for (String str : strArr) {
            String str2 = map.get(str);
            if (str2 == null) {
                hashMap.put(str, "UNSUPPORTED");
            } else {
                int i = 0;
                while (true) {
                    if (i >= dVar.f18987a.length) {
                        break;
                    } else if (str2.equals(dVar.f18987a[i])) {
                        hashMap.put(str, a(dVar.b[i]));
                        break;
                    } else {
                        i++;
                    }
                }
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, "UNSUPPORTED");
                }
            }
        }
        return new d(true, hashMap, null, null);
    }
}
