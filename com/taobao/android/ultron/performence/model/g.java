package com.taobao.android.ultron.performence.model;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public final class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f15792a;
    private f b;
    private List<a> c;
    private Map<String, e> d;

    static {
        kge.a(-729678683);
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bce5d664", new Object[]{this, fVar});
        } else {
            this.b = fVar;
        }
    }

    public g a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("8266ae21", new Object[]{this, str, str2, str3});
        }
        if (this.c == null) {
            this.c = new ArrayList();
        }
        for (a aVar : this.c) {
            if (aVar.a().equals(str2)) {
                return this;
            }
        }
        if (StringUtils.isEmpty(str2)) {
            this.c.add(new a(str, str3));
        } else {
            List<a> list = this.c;
            list.add(new a(str, str2 + ":" + str3));
        }
        return this;
    }

    public g a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("10fe09a0", new Object[]{this, eVar});
        }
        if (this.d == null) {
            this.d = new HashMap();
        }
        if (this.d.containsKey(eVar.b())) {
            return this;
        }
        this.d.put(eVar.b(), eVar);
        return this;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        f fVar = this.b;
        if (fVar != null) {
            return fVar.a();
        }
        return null;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        f fVar = this.b;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue();
        }
        f fVar = this.b;
        if (fVar != null) {
            return fVar.c();
        }
        return 0.0f;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.f15792a;
    }

    public List<a> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[]{this}) : this.c;
    }

    public Map<String, e> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this}) : this.d;
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f15793a;
        private final String b;

        static {
            kge.a(-1893750777);
        }

        public a(String str, String str2) {
            this.f15793a = str;
            this.b = str2;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f15793a;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }
    }
}
