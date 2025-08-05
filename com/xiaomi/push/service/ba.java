package com.xiaomi.push.service;

import android.util.Pair;
import com.xiaomi.push.ii;
import com.xiaomi.push.ij;
import com.xiaomi.push.il;
import com.xiaomi.push.in;
import com.xiaomi.push.iz;
import com.xiaomi.push.ja;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class ba {
    public static int a(az azVar, ii iiVar) {
        int i = 0;
        if (bb.f24658a[iiVar.ordinal()] == 1) {
            i = 1;
        }
        return azVar.a(iiVar, i);
    }

    private static List<Pair<Integer, Object>> a(List<in> list, boolean z) {
        if (com.xiaomi.push.ac.a(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (in inVar : list) {
            int a2 = inVar.a();
            ij a3 = ij.a(inVar.b());
            if (a3 != null) {
                if (!z || !inVar.f544a) {
                    int i = bb.b[a3.ordinal()];
                    arrayList.add(i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : new Pair(Integer.valueOf(a2), Boolean.valueOf(inVar.g())) : new Pair(Integer.valueOf(a2), inVar.m2054a()) : new Pair(Integer.valueOf(a2), Long.valueOf(inVar.m2053a())) : new Pair(Integer.valueOf(a2), Integer.valueOf(inVar.c())));
                } else {
                    arrayList.add(new Pair(Integer.valueOf(a2), null));
                }
            }
        }
        return arrayList;
    }

    public static void a(az azVar, iz izVar) {
        com.xiaomi.channel.commonutils.logger.b.b("OnlineConfigHelper", "-->updateCustomConfigs(): onlineConfig=", azVar, ", configMessage=", izVar);
        azVar.a(a(izVar.a(), true));
        azVar.b();
    }

    public static void a(az azVar, ja jaVar) {
        com.xiaomi.channel.commonutils.logger.b.b("OnlineConfigHelper", "-->updateNormalConfigs(): onlineConfig=", azVar, ", configMessage=", jaVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (il ilVar : jaVar.a()) {
            arrayList.add(new Pair<>(ilVar.m2049a(), Integer.valueOf(ilVar.a())));
            List<Pair<Integer, Object>> a2 = a(ilVar.f536a, false);
            if (!com.xiaomi.push.ac.a(a2)) {
                arrayList2.addAll(a2);
            }
        }
        azVar.a(arrayList, arrayList2);
        azVar.b();
    }
}
