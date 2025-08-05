package com.taobao.homepage.pop.ucp;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.f;
import java.util.ArrayList;
import java.util.Collection;
import tb.kyu;
import tb.ldj;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Collection<IPopData> a(Collection<IPopData> collection) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("b0ba7a4e", new Object[]{collection});
        }
        if (collection != null) {
            i = collection.size();
        }
        if (i == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (IPopData iPopData : collection) {
            if (a(iPopData)) {
                arrayList.add(iPopData);
            }
        }
        return arrayList;
    }

    public static void a(b bVar, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cdc493", new Object[]{bVar, str, new Integer(i), str2});
            return;
        }
        if (bVar == null) {
            z = false;
        }
        f.a(str, str2, z, "");
        if (bVar == null) {
            return;
        }
        bVar.a(str, i, str2);
    }

    public static b a(kyu kyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("65374939", new Object[]{kyuVar});
        }
        if (kyuVar == null) {
            return null;
        }
        return kyuVar.i().c();
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[0])).longValue() : ldj.a("newUcpPopTimeoutMs", 3000);
    }

    public static boolean a(IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c6ae3edc", new Object[]{iPopData})).booleanValue() : iPopData != null && iPopData.getUCPConfig() != null && iPopData.getUCPConfig().enable() && a.a();
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : ldj.a("newHomePopUcpEnable", true);
    }
}
