package com.taobao.android.detail2.core.framework.view.navbar;

import mtopsdk.common.util.StringUtils;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fmd;
import tb.kge;

/* loaded from: classes5.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MORE = "more";

    /* renamed from: a  reason: collision with root package name */
    private String[] f11637a = {"share", "normal", "more", "collect", "transmit"};
    private SparseArray<a> b = new SparseArray<>();

    static {
        kge.a(1466398997);
    }

    public e() {
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (String str : this.f11637a) {
            a aVar = new a(str);
            this.b.put(aVar.a(), aVar);
        }
    }

    public String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)});
        }
        a aVar = this.b.get(i);
        return aVar == null ? "" : aVar.b();
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return new a(str).a();
        }
        return 0;
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f11638a;

        static {
            kge.a(1242740733);
        }

        public a(String str) {
            this.f11638a = str;
        }

        public int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f11638a.hashCode();
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f11638a;
        }
    }

    public g a(int i, ViewGroup viewGroup, fmd fmdVar, com.taobao.android.detail2.core.framework.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("2faa2e71", new Object[]{this, new Integer(i), viewGroup, fmdVar, bVar});
        }
        String a2 = a(i);
        if ("share".equals(a2)) {
            return j.a(viewGroup, fmdVar, bVar);
        }
        if ("normal".equals(a2)) {
            return i.a(viewGroup, fmdVar, bVar);
        }
        if ("more".equals(a2)) {
            return h.a(viewGroup, fmdVar, bVar);
        }
        if ("collect".equals(a2)) {
            return d.a(viewGroup, fmdVar, bVar);
        }
        if (!"transmit".equals(a2)) {
            return null;
        }
        return k.a(viewGroup, fmdVar, bVar);
    }
}
