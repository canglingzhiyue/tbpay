package com.taobao.tao.shop.rule;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import tb.kge;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private RemoteBusiness f21095a;
    private IRemoteBaseListener b;
    private MtopListener c;
    private final int d;

    static {
        kge.a(-2087178493);
    }

    public e(int i) {
        this.d = i;
    }

    public e() {
        this.d = -1;
    }

    public void a(Object obj, int i, Object obj2, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72fc3142", new Object[]{this, obj, new Integer(i), obj2, cls});
        } else if (obj2 == null || !(obj2 instanceof IMTOPDataObject)) {
        } else {
            this.f21095a = (RemoteBusiness) RemoteBusiness.build(com.taobao.tao.shop.e.b, (IMTOPDataObject) obj2, com.taobao.tao.shop.e.d).mo1338reqContext(obj);
            int i2 = this.d;
            if (-1 != i2) {
                this.f21095a.mo1326setSocketTimeoutMilliSecond(i2);
            }
            this.f21095a.mo1315setJsonType(JsonTypeEnum.ORIGINALJSON);
            MtopListener mtopListener = this.c;
            if (mtopListener != null) {
                this.f21095a.mo1337addListener(mtopListener);
                this.f21095a.registeListener(this.c);
            } else {
                IRemoteBaseListener iRemoteBaseListener = this.b;
                if (iRemoteBaseListener != null) {
                    this.f21095a.registeListener((MtopListener) iRemoteBaseListener);
                }
            }
            if (com.taobao.tao.shop.fetcher.adapter.b.a().x()) {
                this.f21095a.mo1305reqMethod(MethodEnum.POST);
            }
            this.f21095a.startRequest(i, cls);
        }
    }

    public void a(MtopListener mtopListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ae8c01", new Object[]{this, mtopListener});
        } else {
            this.c = mtopListener;
        }
    }
}
