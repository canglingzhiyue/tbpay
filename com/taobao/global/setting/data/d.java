package com.taobao.global.setting.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.ksx;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f17213a = new HashMap();

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static d f17214a = new d();

        public static /* synthetic */ d a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("1a1cbb06", new Object[0]) : f17214a;
        }
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("1a1cbb06", new Object[0]) : a.a();
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        return "cycleSwitch_" + str;
    }

    public <T> T a(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, t});
        }
        T t2 = (T) this.f17213a.get(a(str));
        if (t2 != null) {
            return t2;
        }
        T t3 = (T) ksx.a(str, t);
        this.f17213a.put(a(str), t3);
        return t3;
    }

    public <T> void b(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18567e8f", new Object[]{this, str, t});
        } else {
            this.f17213a.put(a(str), t);
        }
    }
}
