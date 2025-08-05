package com.taobao.android.abilityidl.ability;

import com.taobao.avplayer.TBPlayerConst;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ej {
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    public String f8842a;
    public String b;
    public Map<String, ? extends Object> c;

    static {
        kge.a(1901040766);
        Companion = new a(null);
    }

    private ej() {
        this.f8842a = "";
        this.b = "";
    }

    public ej(Map<String, ? extends Object> map) {
        this();
        String a2 = TradeHybridStage.Companion.a(com.alibaba.ability.e.b(map, "stage", (String) null));
        if (a2 == null) {
            throw new RuntimeException("stage 参数必传！");
        }
        this.f8842a = a2;
        String b = com.alibaba.ability.e.b(map, TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName, (String) null);
        if (b == null) {
            throw new RuntimeException("sceneName 参数必传！");
        }
        this.b = b;
        this.c = com.alibaba.ability.e.c(map, "extParams");
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(1476819526);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
