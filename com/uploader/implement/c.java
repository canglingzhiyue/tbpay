package com.uploader.implement;

import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.h;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile h f24067a;

    public static final void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8d13f59", new Object[]{hVar});
        } else {
            f24067a = hVar;
        }
    }

    public static void a(String str, String str2, Set<String> set, Set<String> set2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85aefb8", new Object[]{str, str2, set, set2, new Boolean(z)});
            return;
        }
        h hVar = f24067a;
        if (hVar == null) {
            return;
        }
        hVar.a(str, str2, set, set2, z);
    }

    public static void a(String str, String str2, Map<String, Double> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37ab1dc", new Object[]{str, str2, map, map2});
            return;
        }
        h hVar = f24067a;
        if (hVar == null) {
            return;
        }
        hVar.a(str, str2, map, map2);
    }
}
