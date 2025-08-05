package com.alibaba.ability.result;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.text.n;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class ExecuteResult implements IAbilityResult {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b$a Companion;
    public static final String DATA = "data";
    public static final String DEFAULT_TYPE = "result";
    public static final String ERR_CODE = "code";
    public static final String ERR_MSG = "msg";
    public static final String STATUS_CODE = "statusCode";
    public static final String TYPE = "type";

    /* renamed from: a  reason: collision with root package name */
    public int f1982a;
    private final Map<String, Object> b;
    private final String c;

    static {
        kge.a(-892075322);
        kge.a(1305549738);
        Companion = new b$a(null);
    }

    private ExecuteResult(Map<String, ? extends Object> map, String str) {
        this.b = map;
        this.c = str;
    }

    public /* synthetic */ ExecuteResult(Map map, String str, o oVar) {
        this(map, str);
    }

    public Map<String, Object> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this}) : this.b;
    }

    public /* synthetic */ ExecuteResult(Map map, String str, int i, o oVar) {
        this(map, (i & 2) != 0 ? "result" : str);
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.c;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.f1982a;
    }

    public Map<String, Object> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (e() != null) {
            hashMap.put("data", e());
        }
        if (this.f1982a <= 99) {
            HashMap hashMap2 = hashMap;
            String f = f();
            if (n.a((CharSequence) f)) {
                f = "result";
            }
            hashMap2.put("type", f);
        }
        HashMap hashMap3 = hashMap;
        hashMap3.put("statusCode", Integer.valueOf(this.f1982a));
        return hashMap3;
    }

    public final boolean isSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue() : this.f1982a < 99;
    }

    public final boolean isNone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("24a67f0d", new Object[]{this})).booleanValue() : this.f1982a == 2;
    }

    public final boolean isFinish() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c5fb8c68", new Object[]{this})).booleanValue() : this.f1982a == 99;
    }

    public final boolean isFailure() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("275e7d8b", new Object[]{this})).booleanValue() : this.f1982a > 99;
    }
}
