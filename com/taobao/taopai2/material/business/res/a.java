package com.taobao.taopai2.material.business.res;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.MaterialDataServer;
import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import com.taobao.taopai2.material.exception.DownloadException;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.x;
import tb.kge;
import tb.qbz;
import tb.rsk;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private MaterialDataServer f22082a;
    private long b;

    static {
        kge.a(-1399501686);
    }

    public static /* synthetic */ void lambda$brqArqEQtg6sfdZSjNOxQl0tcAc(a aVar, w wVar, MaterialDetailBean materialDetailBean) {
        aVar.a(wVar, materialDetailBean);
    }

    public static /* synthetic */ void lambda$niEQa8Zscw_g6iOpGOWVSHBzryA(w wVar, Throwable th) {
        a(wVar, th);
    }

    public static /* synthetic */ void lambda$z7IP95r_SaoywCF5M7J9qkChDv8(a aVar, w wVar) {
        aVar.a(wVar);
    }

    public a(long j, MaterialDataServer materialDataServer) {
        this.b = j;
        this.f22082a = materialDataServer;
    }

    public v<Pair<Integer, MaterialResource>> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (v) ipChange.ipc$dispatch("8baec020", new Object[]{this}) : v.create(new x() { // from class: com.taobao.taopai2.material.business.res.-$$Lambda$a$z7IP95r_SaoywCF5M7J9qkChDv8
            {
                a.this = this;
            }

            public final void subscribe(w wVar) {
                a.lambda$z7IP95r_SaoywCF5M7J9qkChDv8(a.this, wVar);
            }
        });
    }

    public void a(final w<Pair<Integer, MaterialResource>> wVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84ed88b9", new Object[]{this, wVar});
        } else {
            this.f22082a.a(this.b).subscribe(new rsk() { // from class: com.taobao.taopai2.material.business.res.-$$Lambda$a$brqArqEQtg6sfdZSjNOxQl0tcAc
                public final void accept(Object obj) {
                    a.lambda$brqArqEQtg6sfdZSjNOxQl0tcAc(a.this, wVar, (MaterialDetailBean) obj);
                }
            }, new rsk() { // from class: com.taobao.taopai2.material.business.res.-$$Lambda$a$niEQa8Zscw_g6iOpGOWVSHBzryA
                public final void accept(Object obj) {
                    a.lambda$niEQa8Zscw_g6iOpGOWVSHBzryA(wVar, (Throwable) obj);
                }
            });
        }
    }

    public /* synthetic */ void a(final w wVar, final MaterialDetailBean materialDetailBean) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adaa92b6", new Object[]{this, wVar, materialDetailBean});
            return;
        }
        com.taobao.taopai.material.request.materialfile.b bVar = new com.taobao.taopai.material.request.materialfile.b(3, 0, String.valueOf(this.b), materialDetailBean.resourceUrl);
        this.f22082a.a(bVar);
        new d(bVar, new com.taobao.taopai.material.request.materialfile.a() { // from class: com.taobao.taopai2.material.business.res.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // com.taobao.taopai.material.request.materialfile.a
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    return;
                }
                MaterialResource materialResource = new MaterialResource();
                materialResource.id = materialDetailBean.id;
                materialResource.name = materialDetailBean.name;
                materialResource.lastModified = materialDetailBean.lastModified;
                materialResource.logoUrl = materialDetailBean.logoUrl;
                materialResource.resourceUrl = materialDetailBean.resourceUrl;
                materialResource.materialType = materialDetailBean.materialType;
                materialResource.version = materialDetailBean.version;
                materialResource.extend = materialDetailBean.extend;
                materialResource.setResourceExtUrl(materialDetailBean.getResourceExtUrl());
                materialResource.dirPath = str2;
                materialResource.materialJsonPath = qbz.a(str2);
                wVar.onNext(new Pair(100, materialResource));
                wVar.onComplete();
            }

            @Override // com.taobao.taopai.material.request.materialfile.a
            public void a(String str, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
                } else {
                    wVar.onNext(new Pair(Integer.valueOf(i), null));
                }
            }

            @Override // com.taobao.taopai.material.request.materialfile.a
            public void a(String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                } else {
                    wVar.onError(new DownloadException(str2, str3));
                }
            }
        }).a();
    }

    public static /* synthetic */ void a(w wVar, Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("177348dc", new Object[]{wVar, th});
        } else {
            wVar.onError(th);
        }
    }
}
