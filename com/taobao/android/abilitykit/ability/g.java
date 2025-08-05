package com.taobao.android.abilitykit.ability;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import tb.dla;
import tb.dle;
import tb.dll;
import tb.iao;
import tb.kge;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ACTION = "action";

    /* renamed from: a  reason: collision with root package name */
    public Map<String, HashSet<a>> f8907a = new HashMap();

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public dll f8908a;
        public dle b;
        public boolean c;

        static {
            kge.a(-767465619);
        }

        public a(dll dllVar, dle dleVar, boolean z) {
            this.f8908a = dllVar;
            this.b = dleVar;
            this.c = z;
        }
    }

    static {
        kge.a(112739105);
    }

    public void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e7e2b40", new Object[]{this, str, aVar});
        } else if (str == null || aVar == null) {
        } else {
            HashSet<a> hashSet = this.f8907a.get(str);
            if (hashSet == null) {
                hashSet = new HashSet<>();
                this.f8907a.put(str, hashSet);
            }
            hashSet.add(aVar);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str == null) {
        } else {
            this.f8907a.remove(str);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (str == null || !this.f8907a.containsKey(str)) {
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet<a> hashSet = this.f8907a.get(str);
            if (hashSet != null && !hashSet.isEmpty()) {
                Iterator<a> it = hashSet.iterator();
                while (it.hasNext()) {
                    a next = it.next();
                    if (next.c) {
                        arrayList.add(next);
                    }
                    next.f8908a.callback(iao.NEXT_TAG_RECEIVER, new dla(jSONObject));
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                hashSet.remove((a) it2.next());
            }
        }
    }
}
