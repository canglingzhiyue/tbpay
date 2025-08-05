package com.taobao.android.trade.component.display;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.component.data.Component;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Integer> f15614a;

    static {
        kge.a(454539611);
    }

    public d(Set<String> set, Set<String> set2) {
        this.f15614a = new HashMap(set2.size() + set.size());
        Iterator<String> it = set.iterator();
        int i = 1;
        while (it.hasNext()) {
            this.f15614a.put(it.next() + "_basic", Integer.valueOf(i));
            i++;
        }
        Iterator<String> it2 = set2.iterator();
        while (it2.hasNext()) {
            this.f15614a.put("biz_" + it2.next(), Integer.valueOf(i));
            i++;
        }
    }

    public int a(Component component) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e9a7f24", new Object[]{this, component})).intValue();
        }
        String e = component.e();
        String f = component.f();
        if (!"biz".equals(e)) {
            Map<String, Integer> map = this.f15614a;
            num = map.get(e + "_basic");
        } else {
            Map<String, Integer> map2 = this.f15614a;
            num = map2.get("biz_" + f);
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f15614a.size();
    }
}
