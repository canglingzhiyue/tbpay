package com.taobao.android.nav.jump;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, JumpAbility> f14453a;

    /* renamed from: com.taobao.android.nav.jump.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0556a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final a f14454a;

        static {
            kge.a(-1736333021);
            f14454a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("9d713fba", new Object[0]) : f14454a;
        }
    }

    static {
        kge.a(638885968);
    }

    private a() {
        this.f14453a = new HashMap();
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("9d713fba", new Object[0]) : C0556a.a();
    }

    public void a(JumpAbility jumpAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aae51bf", new Object[]{this, jumpAbility});
        } else if (jumpAbility == null) {
        } else {
            this.f14453a.put(jumpAbility.a(), jumpAbility);
        }
    }

    public JumpAbility a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JumpAbility) ipChange.ipc$dispatch("fd18e049", new Object[]{this, str}) : this.f14453a.get(str);
    }
}
