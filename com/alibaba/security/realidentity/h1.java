package com.alibaba.security.realidentity;

import android.content.Context;
import com.alibaba.security.realidentity.biz.base.chain.BusinessHeadParams;
import com.alibaba.security.realidentity.biz.base.chain.BusinessType;
import com.alibaba.security.realidentity.biz.biometrics.BiometricsBucketParams;
import com.alibaba.security.realidentity.biz.bucket.BucketParams;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.biz.uploadresult.UploadResultParams;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class h1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String k = "h1";

    /* renamed from: a  reason: collision with root package name */
    public final Context f3431a;
    public BusinessHeadParams b;
    public v1 c;
    public BiometricsBucketParams d;
    public a2 e;
    public UploadResultParams f;
    public x1 g;
    public RPBizConfig h;
    public int i = -1;
    public List<BusinessType> j = new ArrayList();

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3432a;

        static {
            int[] iArr = new int[BusinessType.values().length];
            f3432a = iArr;
            try {
                BusinessType businessType = BusinessType.START;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f3432a;
                BusinessType businessType2 = BusinessType.SUBMIT;
                iArr2[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f3432a;
                BusinessType businessType3 = BusinessType.UPLOADFILE;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f3432a;
                BusinessType businessType4 = BusinessType.UPLOADRESULT;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = f3432a;
                BusinessType businessType5 = BusinessType.ALBIOMETERICS;
                iArr5[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public h1(Context context, RPBizConfig rPBizConfig, BusinessHeadParams businessHeadParams) {
        this.b = businessHeadParams;
        this.f3431a = context;
        this.h = rPBizConfig;
    }

    public void a(List<BusinessType> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.j = list;
        this.i = -1;
    }

    public BucketParams.ErrorCode b(BusinessType businessType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BucketParams.ErrorCode) ipChange.ipc$dispatch("1f37fadf", new Object[]{this, businessType});
        }
        int ordinal = businessType.ordinal();
        if (ordinal == 0) {
            return this.c.b();
        }
        if (ordinal == 1) {
            return this.d.b();
        }
        if (ordinal == 2) {
            return this.e.b();
        }
        if (ordinal == 3) {
            return this.f.b();
        }
        if (ordinal == 4) {
            return this.g.b();
        }
        return null;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        List<BusinessType> list = this.j;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.i = this.j.size();
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        int i = this.i + 1;
        this.i = i;
        if (i >= this.j.size()) {
            return false;
        }
        BusinessType businessType = this.j.get(this.i);
        if (!a(businessType)) {
            String str = k;
            com.alibaba.security.realidentity.a.b(str, "isCreateSuccessful params error businessType:" + businessType.name());
            return false;
        }
        int ordinal = businessType.ordinal();
        if (ordinal == 0) {
            this.c.a(this);
        } else if (ordinal == 1) {
            this.d.a(this);
        } else if (ordinal == 2) {
            this.e.a(this);
        } else if (ordinal == 3) {
            this.f.a(this);
        } else if (ordinal == 4) {
            this.g.a(this);
        }
        return true;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        List<BusinessType> list = this.j;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.i = this.j.indexOf(BusinessType.ALBIOMETERICS);
    }

    private boolean a(BusinessType businessType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e133eff8", new Object[]{this, businessType})).booleanValue();
        }
        int ordinal = businessType.ordinal();
        if (ordinal == 0) {
            this.c = new v1(this.f3431a, this.h);
        } else if (ordinal == 1) {
            this.d = new BiometricsBucketParams(this.f3431a, this.h);
        } else if (ordinal == 2) {
            this.e = new a2(this.f3431a, this.h);
        } else if (ordinal == 3) {
            this.f = new UploadResultParams(this.f3431a, this.h);
        } else if (ordinal == 4) {
            this.g = new x1(this.f3431a, this.h);
        }
        return true;
    }
}
