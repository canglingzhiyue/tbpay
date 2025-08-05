package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import tb.kge;

/* loaded from: classes4.dex */
public final class ei {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    public String f8841a;
    public double b;
    public Double c;
    public String d;
    public String e;

    static {
        kge.a(-1466428752);
        Companion = new a(null);
    }

    @JvmStatic
    public static final ei a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ei) ipChange.ipc$dispatch("6bb55055", new Object[]{str}) : Companion.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ei() {
        this.f8841a = "";
        this.b = 1500.0d;
    }

    public /* synthetic */ ei(kotlin.jvm.internal.o oVar) {
        this();
    }

    public ei(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "content", (String) null);
        if (b == null) {
            throw new RuntimeException("content 参数必传！");
        }
        this.f8841a = b;
        double d = 1500.0d;
        Double b2 = com.alibaba.ability.e.b(map, "duration", Double.valueOf(1500.0d));
        this.b = b2 != null ? b2.doubleValue() : d;
        this.c = com.alibaba.ability.e.b(map, "delay", (Double) null);
        this.d = com.alibaba.ability.e.b(map, "iconFont", (String) null);
        this.e = com.alibaba.ability.e.b(map, "iconURL", (String) null);
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1175166472);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        @JvmStatic
        public final ei a(String content) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ei) ipChange.ipc$dispatch("6bb55055", new Object[]{this, content});
            }
            kotlin.jvm.internal.q.d(content, "content");
            ei eiVar = new ei((kotlin.jvm.internal.o) null);
            eiVar.f8841a = content;
            return eiVar;
        }
    }
}
