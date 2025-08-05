package com.taobao.tao.flexbox.layoutmanager.module;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import java.util.ArrayList;
import java.util.List;
import tb.gwb;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static List<a> f20447a;

    static {
        kge.a(1498895684);
        f20447a = new ArrayList();
        a();
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cccff72", new Object[]{aVar});
        } else {
            f20447a.add(aVar);
        }
    }

    public static boolean a(String str, String str2, g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57040487", new Object[]{str, str2, cVar})).booleanValue();
        }
        for (a aVar : f20447a) {
            if (aVar.a(str, str2, cVar)) {
                return true;
            }
        }
        return false;
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            a(new gwb());
        }
    }
}
