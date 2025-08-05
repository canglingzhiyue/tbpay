package com.taobao.android.remoteso.component;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ikw;
import tb.riy;

/* loaded from: classes6.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CODE_CANCELLED = 1003;
    public static final int CODE_FAILURE = 1002;
    public static final int CODE_KNOWN = 1000;
    public static final int CODE_SUCCESS = 1001;
    public static final int CODE_TIMEOUT = 1004;

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f14805a = new ArrayList();
    private int b = 1000;
    private String c = null;
    private final Map<String, String> d = new ConcurrentHashMap();

    private l() {
    }

    public static l a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("aeb9a8ca", new Object[]{list});
        }
        l lVar = new l();
        lVar.b = 1001;
        lVar.b().addAll(list);
        return lVar;
    }

    public static l a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("5fd53ea3", new Object[]{str});
        }
        l lVar = new l();
        lVar.b = 1002;
        lVar.c = str;
        return lVar;
    }

    public static l a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("62c470d9", new Object[0]);
        }
        l lVar = new l();
        lVar.b = 1003;
        lVar.c = "cancelled";
        return lVar;
    }

    public static l b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("5364c2e4", new Object[]{str});
        }
        l lVar = new l();
        lVar.b = 1004;
        lVar.c = str;
        return lVar;
    }

    public List<String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.f14805a;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.b;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.c;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.b == 1001 && ikw.a((CharSequence) this.c) && this.f14805a.size() > 0;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RemoResult@" + Integer.toHexString(hashCode()) + riy.BLOCK_START_STR + "installedModules=" + this.f14805a + ", code=" + this.b + ", errorMsg=" + this.c + ", sourceMap=" + this.d + riy.BLOCK_END_STR;
    }
}
