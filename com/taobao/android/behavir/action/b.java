package com.taobao.android.behavir.action;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final HashMap<String, a> sActions;

    static {
        kge.a(515358330);
        HashMap<String, a> hashMap = new HashMap<>();
        sActions = hashMap;
        hashMap.put(c.NAME, new c());
        sActions.put(f.NAME_OLD, new f());
        sActions.put(f.NAME, new f());
        sActions.put(e.NAME, new e());
    }

    public static a a(String str) {
        IpChange ipChange = $ipChange;
        return (a) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("c114433c", new Object[]{str}) : sActions.get(str));
    }
}
