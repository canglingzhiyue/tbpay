package com.alibaba.ut.abtest.bucketing.expression;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class f implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f4172a = new d();

    static {
        kge.a(2000045162);
        kge.a(-1283124438);
    }

    @Override // com.alibaba.ut.abtest.bucketing.expression.e
    public boolean a(Expression expression, Map<String, Object> map, long j, long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fceacbdb", new Object[]{this, expression, map, new Long(j), new Long(j2)})).booleanValue() : expression == null || this.f4172a.a(expression, map, j, j2, false);
    }

    @Override // com.alibaba.ut.abtest.bucketing.expression.e
    public boolean a(Expression expression, long j, long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ef24b1b2", new Object[]{this, expression, new Long(j), new Long(j2)})).booleanValue() : expression == null || this.f4172a.a(expression, null, j, j2, true);
    }
}
