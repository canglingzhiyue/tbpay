package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import tb.kge;

/* loaded from: classes4.dex */
public final class el {
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    public String f8844a;
    public String b;

    static {
        kge.a(-271578644);
        Companion = new a(null);
    }

    private el() {
        this.f8844a = "";
        this.b = "";
    }

    public /* synthetic */ el(kotlin.jvm.internal.o oVar) {
        this();
    }

    public el(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "bizID", (String) null);
        if (b == null) {
            throw new RuntimeException("bizID 参数必传！");
        }
        this.f8844a = b;
        String b2 = com.alibaba.ability.e.b(map, "key", (String) null);
        if (b2 == null) {
            throw new RuntimeException("key 参数必传！");
        }
        this.b = b2;
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(914193972);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        @JvmStatic
        public final el a(String bizID, String key) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (el) ipChange.ipc$dispatch("13028aa8", new Object[]{this, bizID, key});
            }
            kotlin.jvm.internal.q.d(bizID, "bizID");
            kotlin.jvm.internal.q.d(key, "key");
            el elVar = new el((kotlin.jvm.internal.o) null);
            elVar.f8844a = bizID;
            elVar.b = key;
            return elVar;
        }
    }
}
