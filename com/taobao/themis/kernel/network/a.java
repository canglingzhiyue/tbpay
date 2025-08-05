package com.taobao.themis.kernel.network;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.network.IMtopInnerAdapter;
import com.taobao.themis.kernel.network.RequestParams;
import java.io.Serializable;
import tb.kge;
import tb.qpt;

/* loaded from: classes9.dex */
public abstract class a<E extends RequestParams, T extends Serializable, D> extends d<E, T, D> implements IMtopInnerAdapter.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public b<T, D> f22555a;
    private E c;

    static {
        kge.a(-51168133);
        kge.a(-1518855124);
    }

    public a(E e, b<T, D> bVar) {
        this.c = e;
        if (bVar != null) {
            this.f22555a = bVar;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            ((IMtopInnerAdapter) qpt.a(IMtopInnerAdapter.class)).requestAsync(this.c, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.themis.kernel.network.IMtopInnerAdapter.b
    public void a(IMtopInnerAdapter.Response response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5b82941", new Object[]{this, response});
        } else if (this.f22555a == null) {
        } else {
            c<T, D> buildResponse = buildResponse(response);
            if (buildResponse.f22556a) {
                this.f22555a.onSuccess(buildResponse.d);
            } else {
                this.f22555a.onFailure(buildResponse.b, buildResponse.c, buildResponse.e);
            }
        }
    }

    @Override // com.taobao.themis.kernel.network.IMtopInnerAdapter.b
    public void b(IMtopInnerAdapter.Response response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fe7b160", new Object[]{this, response});
        } else if (this.f22555a == null) {
        } else {
            c<T, D> buildResponse = buildResponse(response);
            this.f22555a.onFailure(buildResponse.b, buildResponse.c, buildResponse.e);
        }
    }
}
