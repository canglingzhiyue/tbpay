package com.taobao.orange.sync;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.util.OLog;
import tb.kge;
import tb.mzx;
import tb.mzz;
import tb.naa;

/* loaded from: classes7.dex */
public abstract class b<T> extends c<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f18590a;
    private String b;

    static {
        kge.a(-703541127);
    }

    public abstract T b(String str);

    public b(String str, String str2) {
        this.f18590a = str;
        this.b = str2;
    }

    @Override // com.taobao.orange.sync.c
    public T c() {
        String str;
        if (OLog.isPrintLog(1)) {
            OLog.d("CdnRequest", "syncRequest start", "cdn url", this.f18590a);
        }
        try {
            naa newInstance = com.taobao.orange.a.f.newInstance();
            int i = newInstance instanceof mzx ? com.taobao.orange.a.q : 1;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    str = null;
                    break;
                }
                try {
                    newInstance.a(this.f18590a);
                    newInstance.b("GET");
                    if (newInstance instanceof mzz) {
                        newInstance.a("f-refer", "orange");
                    }
                    newInstance.d();
                    this.d = newInstance.b();
                } finally {
                    try {
                        newInstance.e();
                        i2++;
                    } finally {
                    }
                }
                if (this.d == 200) {
                    str = newInstance.c();
                    break;
                }
                this.f = this.d;
                newInstance.e();
                i2++;
            }
            if (StringUtils.isEmpty(str)) {
                this.d = -2;
                this.e = "content is empty";
                OLog.e("CdnRequest", "syncRequest fail", "code", Integer.valueOf(this.d), "msg", this.e);
                return null;
            } else if (!StringUtils.isEmpty(this.b) && !this.b.equals(com.taobao.orange.util.c.a(str))) {
                this.d = -3;
                this.e = "content is broken";
                OLog.e("CdnRequest", "syncRequest fail", "code", Integer.valueOf(this.d), "msg", this.e);
                return null;
            } else {
                try {
                    return b(str);
                } catch (Throwable th) {
                    this.d = -4;
                    this.e = th.getMessage();
                    OLog.e("CdnRequest", "syncRequest fail", th, new Object[0]);
                    return null;
                }
            }
        } catch (Throwable th2) {
            OLog.e("CdnRequest", "syncRequest", th2, new Object[0]);
            this.e = th2.getMessage();
            return null;
        }
    }
}
