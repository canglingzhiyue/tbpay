package com.alibaba.security.realidentity;

import com.alibaba.security.realidentity.biz.base.chain.BusinessType;
import com.alibaba.security.realidentity.biz.bucket.BucketParams;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class l1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String f = "l1";

    /* renamed from: a  reason: collision with root package name */
    public int f3456a;
    public s1 b;
    public l1 c;
    public final i1 d;
    public l1 e;

    public l1(i1 i1Var) {
        this.d = i1Var;
    }

    public static /* synthetic */ l1 a(l1 l1Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l1) ipChange.ipc$dispatch("79255fce", new Object[]{l1Var}) : l1Var.e;
    }

    public void b(l1 l1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("882bb52e", new Object[]{this, l1Var});
        } else {
            this.c = l1Var;
        }
    }

    public void c(l1 l1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d6d23ef", new Object[]{this, l1Var});
        } else {
            this.e = l1Var;
        }
    }

    public static /* synthetic */ void a(l1 l1Var, h1 h1Var, BucketParams bucketParams, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0c6b295", new Object[]{l1Var, h1Var, bucketParams, new Boolean(z)});
        } else {
            l1Var.b(h1Var, bucketParams, z);
        }
    }

    private void b(BusinessType businessType, h1 h1Var, BucketParams bucketParams, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6fb2efb", new Object[]{this, businessType, h1Var, bucketParams, new Boolean(z)});
            return;
        }
        i1 i1Var = this.d;
        if (i1Var != null) {
            i1Var.a(h1Var, this.e.d, bucketParams);
        }
        a(businessType, h1Var, bucketParams, z);
    }

    public l1(i1 i1Var, s1 s1Var) {
        this.d = i1Var;
        this.b = s1Var;
    }

    public static /* synthetic */ void a(l1 l1Var, BusinessType businessType, h1 h1Var, BucketParams bucketParams, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83910cf7", new Object[]{l1Var, businessType, h1Var, bucketParams, new Boolean(z)});
        } else {
            l1Var.a(businessType, h1Var, bucketParams, z);
        }
    }

    public static /* synthetic */ void a(l1 l1Var, BusinessType businessType, h1 h1Var, BucketParams bucketParams, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a19f9ad", new Object[]{l1Var, businessType, h1Var, bucketParams, str, new Boolean(z)});
        } else {
            l1Var.a(businessType, h1Var, bucketParams, str, z);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f3456a = i;
        }
    }

    private void b(BusinessType businessType, h1 h1Var, BucketParams bucketParams, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea922b1", new Object[]{this, businessType, h1Var, bucketParams, str, new Boolean(z)});
            return;
        }
        i1 i1Var = this.d;
        if (i1Var != null) {
            i1Var.a(h1Var, this.e.d, bucketParams, str);
        }
        a(businessType, h1Var, bucketParams, str, z);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f3456a;
    }

    public void a(h1 h1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2b1e869", new Object[]{this, h1Var});
        } else {
            this.d.a(h1Var, new a(h1Var));
        }
    }

    /* loaded from: classes3.dex */
    public class a implements j1 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h1 f3457a;

        public a(h1 h1Var) {
            this.f3457a = h1Var;
        }

        @Override // com.alibaba.security.realidentity.j1
        public void a(BusinessType businessType, BucketParams bucketParams, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("422feedb", new Object[]{this, businessType, bucketParams, new Boolean(z)});
            } else if (l1.a(l1.this) != null) {
                if (!this.f3457a.a()) {
                    return;
                }
                l1.a(l1.this).a(this.f3457a);
            } else {
                l1.a(l1.this, this.f3457a, bucketParams, z);
            }
        }

        @Override // com.alibaba.security.realidentity.j1
        public void b(BusinessType businessType, BucketParams bucketParams, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30c27aba", new Object[]{this, businessType, bucketParams, new Boolean(z)});
            } else {
                l1.a(l1.this, businessType, this.f3457a, bucketParams, z);
            }
        }

        @Override // com.alibaba.security.realidentity.j1
        public void a(BusinessType businessType, BucketParams bucketParams, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18e1aa91", new Object[]{this, businessType, bucketParams, str, new Boolean(z)});
            } else {
                l1.a(l1.this, businessType, this.f3457a, bucketParams, str, z);
            }
        }
    }

    private void a(h1 h1Var, BucketParams bucketParams, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6c41d0", new Object[]{this, h1Var, bucketParams, new Boolean(z)});
            return;
        }
        i1 i1Var = this.d;
        if (i1Var != null) {
            i1Var.b(h1Var, this.e.d, bucketParams);
        }
        b(h1Var, bucketParams, z);
    }

    private void b(h1 h1Var, BucketParams bucketParams, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50d2b111", new Object[]{this, h1Var, bucketParams, new Boolean(z)});
            return;
        }
        l1 l1Var = this.c;
        if (l1Var != null) {
            l1Var.a(h1Var, bucketParams, z);
            return;
        }
        s1 s1Var = this.b;
        if (s1Var == null || !z) {
            return;
        }
        s1Var.a(h1Var);
    }

    private void a(BusinessType businessType, h1 h1Var, BucketParams bucketParams, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d1825c", new Object[]{this, businessType, h1Var, bucketParams, new Boolean(z)});
            return;
        }
        l1 l1Var = this.c;
        if (l1Var != null) {
            l1Var.b(businessType, h1Var, bucketParams, z);
            return;
        }
        s1 s1Var = this.b;
        if (s1Var == null || !z) {
            return;
        }
        s1Var.a(businessType, h1Var);
    }

    private void a(BusinessType businessType, h1 h1Var, BucketParams bucketParams, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("213fbfd2", new Object[]{this, businessType, h1Var, bucketParams, str, new Boolean(z)});
            return;
        }
        l1 l1Var = this.c;
        if (l1Var != null) {
            l1Var.b(businessType, h1Var, bucketParams, str, z);
            return;
        }
        s1 s1Var = this.b;
        if (s1Var == null || !z) {
            return;
        }
        s1Var.a(businessType, h1Var, str);
    }
}
