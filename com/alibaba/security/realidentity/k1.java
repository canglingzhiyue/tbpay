package com.alibaba.security.realidentity;

import android.content.Context;
import com.alibaba.security.realidentity.biz.base.chain.BusinessHeadParams;
import com.alibaba.security.realidentity.biz.base.chain.BusinessType;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class k1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public l1 f3454a;
    public l1 b;
    public final List<BusinessType> c = new ArrayList();
    public h1 d;

    public k1 a(i1 i1Var, s1 s1Var) throws IllegalAccessException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k1) ipChange.ipc$dispatch("84896724", new Object[]{this, i1Var, s1Var});
        }
        if (a()) {
            l1 l1Var = new l1(i1Var, s1Var);
            a(i1Var.a());
            a(l1Var);
            return this;
        }
        throw new IllegalAccessException("Please addBeginBusinessWorker First");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        h1 h1Var = this.d;
        if (h1Var == null) {
            return;
        }
        h1Var.c();
    }

    public k1 a(i1 i1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k1) ipChange.ipc$dispatch("62f5bcb0", new Object[]{this, i1Var});
        }
        l1 l1Var = new l1(i1Var);
        a(i1Var.a());
        a(l1Var);
        return this;
    }

    private void a(BusinessType businessType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e133eff4", new Object[]{this, businessType});
        } else {
            this.c.add(businessType);
        }
    }

    private k1 a(l1 l1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k1) ipChange.ipc$dispatch("79255c0d", new Object[]{this, l1Var});
        }
        if (a()) {
            l1Var.a(0);
            this.b = l1Var;
            this.f3454a = l1Var;
            return this;
        }
        l1Var.b(this.f3454a);
        l1Var.a(this.f3454a.a() + 1);
        this.f3454a.c(l1Var);
        this.f3454a = l1Var;
        return this;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f3454a == null;
    }

    public void a(Context context, RPBizConfig rPBizConfig, BusinessHeadParams businessHeadParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ea8d94c", new Object[]{this, context, rPBizConfig, businessHeadParams});
        } else if (this.b == null) {
        } else {
            h1 h1Var = new h1(context, rPBizConfig, businessHeadParams);
            this.d = h1Var;
            h1Var.a(this.c);
            this.d.a();
            this.b.a(this.d);
        }
    }
}
