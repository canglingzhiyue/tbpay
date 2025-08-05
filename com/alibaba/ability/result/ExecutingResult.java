package com.alibaba.ability.result;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class ExecutingResult extends ExecuteResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, Object> b;
    private final String c;

    static {
        kge.a(1143955331);
    }

    public ExecutingResult() {
        this(null, null, 3, null);
    }

    public ExecutingResult(Map<String, ? extends Object> map) {
        this(map, null, 2, null);
    }

    public /* synthetic */ ExecutingResult(Map map, String str, int i, o oVar) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? "result" : str);
    }

    @Override // com.alibaba.ability.result.ExecuteResult
    public Map<String, Object> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this}) : this.b;
    }

    @Override // com.alibaba.ability.result.ExecuteResult
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecutingResult(Map<String, ? extends Object> map, String type) {
        super(map, type, null);
        q.d(type, "type");
        this.b = map;
        this.c = type;
        this.f1982a = 1;
    }
}
