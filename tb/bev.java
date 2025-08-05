package tb;

import com.alibaba.android.icart.core.data.model.CartGlobal;
import com.alibaba.android.icart.core.groupcharge.GroupChargeType;
import com.alibaba.android.icart.core.groupcharge.a;
import com.alibaba.android.icart.core.groupcharge.b;
import com.alibaba.android.icart.core.groupcharge.c;
import com.alibaba.android.icart.core.groupcharge.d;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class bev {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2108215662);
    }

    public static boolean a(bcb bcbVar, List<IDMComponent> list) {
        List<String> list2;
        JSONObject jSONObject;
        JSONArray jSONArray;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b883dec", new Object[]{bcbVar, list})).booleanValue();
        }
        if (list != null && !list.isEmpty() && bcbVar != null && bcbVar.m() != null && list.size() > 1) {
            JSONArray includes = bcbVar.m().getIncludes();
            if (includes != null && includes.size() > 0) {
                for (int i = 0; i < includes.size(); i++) {
                    JSONArray jSONArray2 = includes.getJSONArray(i);
                    Iterator<IDMComponent> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!jSONArray2.contains(a(it.next()))) {
                                z = false;
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        return false;
                    }
                }
            }
            CartGlobal.Excludes excludes = bcbVar.m().getExcludes();
            List<String> list3 = null;
            if (excludes != null) {
                list3 = excludes.getGlobal();
                jSONObject = excludes.getInner();
                list2 = excludes.getInnerGlobal();
            } else {
                list2 = null;
                jSONObject = null;
            }
            if (list3 != null || jSONObject != 0 || list2 != null) {
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                for (IDMComponent iDMComponent : list) {
                    if (iDMComponent != null) {
                        String a2 = a(iDMComponent);
                        if (list3 != null && a2 != null) {
                            hashSet.add(a2);
                            if (list3.contains(a2)) {
                                z2 = true;
                            }
                        }
                        if (z2 && hashSet.size() > 1) {
                            return true;
                        }
                        String b = b(iDMComponent);
                        if (jSONObject != null && a2 != null && b != null && jSONObject.containsKey(a2) && (jSONArray = jSONObject.getJSONArray(a2)) != null && jSONArray.contains(b)) {
                            hashSet2.add(b);
                            z3 = true;
                        }
                        if (z3 && hashSet2.size() > 1) {
                            return true;
                        }
                        if (list2 != null && a2 != null && b != null && list2.contains(a2)) {
                            hashSet3.add(b);
                            z4 = true;
                        }
                        if (z4 && hashSet3.size() > 1) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static String a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("41ebe234", new Object[]{iDMComponent}) : iDMComponent != null ? iDMComponent.getFields().getString("exclude") : "";
    }

    private static String b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("759a0cf5", new Object[]{iDMComponent}) : iDMComponent != null ? iDMComponent.getFields().getString("mutex") : "";
    }

    public static b b(bcb bcbVar, List<IDMComponent> list) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("7e00d57f", new Object[]{bcbVar, list});
        }
        if (list == null || list.isEmpty() || bcbVar == null || bcbVar.m() == null) {
            return null;
        }
        b bVar = new b();
        CartGlobal.Excludes excludes = bcbVar.m().getExcludes();
        if (excludes != null && excludes.getTip() != null) {
            bVar.a(excludes.getTip().getString("DEFAULT"));
        }
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        for (IDMComponent iDMComponent : list) {
            String a2 = a(excludes, a(iDMComponent), b(iDMComponent));
            if (hashSet.add(a2)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iDMComponent);
                hashMap.put(a2, arrayList);
            } else {
                ((List) hashMap.get(a2)).add(iDMComponent);
            }
        }
        JSONArray includes = bcbVar.m().getIncludes();
        if (includes != null && includes.size() > 0) {
            HashMap hashMap2 = new HashMap();
            for (String str : hashMap.keySet()) {
                List list2 = (List) hashMap.get(str);
                if (list2 != null && list2.size() > 0) {
                    Iterator it = list2.iterator();
                    String str2 = null;
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        String a3 = a((IDMComponent) it.next());
                        if (str2 == null) {
                            str2 = a3;
                        } else if (!str2.equals(a3)) {
                            str2 = a3;
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        hashMap2.put(str, str2);
                    }
                }
            }
            if (hashMap2.size() > 0) {
                for (int i = 0; i < includes.size(); i++) {
                    JSONArray jSONArray = includes.getJSONArray(i);
                    HashSet<String> hashSet2 = new HashSet();
                    for (String str3 : hashMap2.keySet()) {
                        if (jSONArray.contains((String) hashMap2.get(str3))) {
                            hashSet2.add(str3);
                        }
                    }
                    if (hashSet2.size() > 0) {
                        String str4 = (String) hashSet2.iterator().next();
                        List list3 = (List) hashMap.get(str4);
                        if (list3 == null) {
                            list3 = new ArrayList();
                        }
                        for (String str5 : hashSet2) {
                            hashMap2.remove(str5);
                            if (!str4.equals(str5) && hashMap.get(str5) != null) {
                                list3.addAll((Collection) hashMap.get(str5));
                                hashSet.remove(str5);
                                hashMap.remove(str5);
                            }
                        }
                    }
                }
            }
        }
        bVar.a(a(bcbVar, hashSet, hashMap, excludes));
        return bVar;
    }

    private static String a(CartGlobal.Excludes excludes, String str, String str2) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1142494b", new Object[]{excludes, str, str2});
        }
        String code = GroupChargeType.BC.getCode();
        if (excludes != null) {
            List<String> global = excludes.getGlobal();
            JSONObject inner = excludes.getInner();
            List<String> innerGlobal = excludes.getInnerGlobal();
            if (global != null || inner != null || innerGlobal != null) {
                boolean z2 = (global == null || str == null || !global.contains(str)) ? false : true;
                boolean z3 = (inner == null || str == null || str2 == null || !inner.containsKey(str) || (jSONArray = inner.getJSONArray(str)) == null || !jSONArray.contains(str2)) ? false : true;
                if (innerGlobal == null || str == null || str2 == null || !innerGlobal.contains(str)) {
                    z = false;
                }
                if (z3 || z) {
                    return str + str2;
                } else if (z2) {
                    return str;
                }
            }
        }
        return code;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:42:0x00d7
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:82)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private static java.util.List<com.alibaba.android.icart.core.groupcharge.a> a(tb.bcb r18, java.util.HashSet<java.lang.String> r19, java.util.Map<java.lang.String, java.util.List<com.taobao.android.ultron.common.model.IDMComponent>> r20, com.alibaba.android.icart.core.data.model.CartGlobal.Excludes r21) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bev.a(tb.bcb, java.util.HashSet, java.util.Map, com.alibaba.android.icart.core.data.model.CartGlobal$Excludes):java.util.List");
    }

    private static String a(HashSet<String> hashSet) {
        String str;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c99f4fbb", new Object[]{hashSet});
        }
        if (hashSet == null || hashSet.isEmpty()) {
            str = null;
        } else {
            Iterator<String> it = hashSet.iterator();
            str = null;
            while (it.hasNext()) {
                String next = it.next();
                if (next.startsWith(GroupChargeType.SM.getCode())) {
                    i++;
                    str = next;
                }
            }
        }
        if (i != 1) {
            return null;
        }
        return str;
    }

    private static void a(String str, a aVar, CartGlobal.Excludes excludes) {
        GroupChargeType[] values;
        JSONArray groupSettlementTitleList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a087c0e4", new Object[]{str, aVar, excludes});
            return;
        }
        if (excludes != null && (groupSettlementTitleList = excludes.getGroupSettlementTitleList()) != null && groupSettlementTitleList.size() > 0) {
            for (int i = 0; i < groupSettlementTitleList.size(); i++) {
                d dVar = new d(groupSettlementTitleList.getJSONObject(i));
                if (str.startsWith(dVar.a())) {
                    aVar.a(new c(dVar.a(), dVar.b(), dVar.c()));
                    return;
                }
            }
        }
        for (GroupChargeType groupChargeType : GroupChargeType.values()) {
            if (str.startsWith(groupChargeType.getCode())) {
                aVar.a(new c(groupChargeType.getCode(), groupChargeType.getTitle(), groupChargeType.getPriority()));
                return;
            }
        }
    }
}
