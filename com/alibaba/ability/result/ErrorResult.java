package com.alibaba.ability.result;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class ErrorResult extends ExecuteResult implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String b;
    private final String c;

    static {
        kge.a(953354265);
        kge.a(-723505464);
    }

    public ErrorResult(String str) {
        this(str, (String) null, (Map) null, 6, (o) null);
    }

    public ErrorResult(String str, int i) {
        this(str, null, null, i, 6, null);
    }

    public ErrorResult(String str, String str2) {
        this(str, str2, (Map) null, 4, (o) null);
    }

    public ErrorResult(String str, String str2, int i) {
        this(str, str2, null, i, 4, null);
    }

    public static /* synthetic */ Object ipc$super(ErrorResult errorResult, String str, Object... objArr) {
        if (str.hashCode() == 996764703) {
            return super.c();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
    }

    public /* synthetic */ ErrorResult(int i, String str, Map map, int i2, o oVar) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorResult(int i, String msg, Map<String, ? extends Object> map) {
        super(map, null, 2, null);
        q.d(msg, "msg");
        this.b = MegaStatusCode.Companion.a(i);
        this.c = msg;
        this.f1982a = i;
    }

    public /* synthetic */ ErrorResult(String str, String str2, Map map, int i, int i2, o oVar) {
        this(str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : map, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErrorResult(String code, String msg, Map<String, ? extends Object> map, int i) {
        this(code, msg, map);
        q.d(code, "code");
        q.d(msg, "msg");
        this.f1982a = 1000 + ((i < 0 || i > 2147482647) ? 0 : i);
    }

    public /* synthetic */ ErrorResult(String str, String str2, Map map, int i, o oVar) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorResult(String code, String msg, Map<String, ? extends Object> map) {
        super(map, null, 2, null);
        q.d(code, "code");
        q.d(msg, "msg");
        this.b = code;
        this.c = msg;
        this.f1982a = 1000;
    }

    @Override // com.alibaba.ability.result.ExecuteResult
    public Map<String, Object> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        Map<String, Object> c = ai.c(super.c());
        c.put("code", this.b);
        c.put("msg", this.c);
        return c;
    }
}
