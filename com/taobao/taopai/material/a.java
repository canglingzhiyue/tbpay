package com.taobao.taopai.material;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.material.bean.MaterialCategoryBean;
import com.taobao.taopai.material.bean.MaterialDetail;
import com.taobao.taopai.material.bean.MaterialListBean;
import com.taobao.taopai.material.bean.MaterialResource;
import com.taobao.taopai.material.bean.MusicCategoryBean;
import com.taobao.taopai.material.bean.MusicListBean;
import com.taobao.taopai.material.jni.ResourceJniInteract;
import com.taobao.taopai.material.request.base.BaseMaterialBusiness;
import com.taobao.taopai.material.request.materialcategory.MaterialCategoryBusiness;
import com.taobao.taopai.material.request.materialcategory.b;
import com.taobao.taopai.material.request.materialdetail.MaterialDetailBusiness;
import com.taobao.taopai.material.request.materialfile.MaterialFileBusiness;
import com.taobao.taopai.material.request.materiallist.MaterialListBusiness;
import com.taobao.taopai.material.request.musicetype.MusicTypeListBusiness;
import com.taobao.taopai.material.request.musiclist.MusicListBusiness;
import com.taobao.taopai.material.request.musiclist.MusicSearchBusiness;
import com.taobao.taopai.material.request.musiclove.MusicLoveBusiness;
import com.taobao.taopai.material.request.musiclove.c;
import com.taobao.taopai.material.request.musiclovelist.MusicLoveListBusiness;
import com.taobao.taopai.material.request.musicunlove.MusicUnLoveBusiness;
import com.taobao.taopai2.material.MaterialDataServer;
import com.taobao.taopai2.material.base.MaterialRequestPolicy;
import com.taobao.taopai2.material.business.materialcategory.CategoryInfo;
import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import com.taobao.taopai2.material.business.materiallist.MaterialListResponse;
import com.taobao.taopai2.material.business.musicdetail.MusicItemBean;
import com.taobao.taopai2.material.business.musiclist.MusicListRequestParams;
import com.taobao.taopai2.material.business.musiclist.MusicListResponseModel;
import com.taobao.taopai2.material.business.musiclove.MusicLoveListRequestParams;
import com.taobao.taopai2.material.business.musictype.MusicTypeInfo;
import com.taobao.taopai2.material.business.res.MusicResource;
import com.taobao.taopai2.material.exception.MaterialException;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.pza;
import tb.pzb;
import tb.qbs;
import tb.qbt;
import tb.qbu;
import tb.qby;
import tb.qca;
import tb.qcc;
import tb.qcd;
import tb.qce;
import tb.qcf;
import tb.rse;
import tb.rsk;
import tb.rsy;
import tb.rta;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static String f22061a;
    private static String b;
    private List<BaseMaterialBusiness> c = new CopyOnWriteArrayList();

    public static /* synthetic */ void a(Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{th});
        }
    }

    public static /* synthetic */ void f() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        }
    }

    /* renamed from: lambda$6UGGzDgEJL-s84yb_YxXJoLAtKk */
    public static /* synthetic */ void m1398lambda$6UGGzDgEJLs84yb_YxXJoLAtKk(a aVar, b bVar, Throwable th) {
        aVar.a(bVar, th);
    }

    public static /* synthetic */ void lambda$AkE5WbWkOshHmARkSBmJPteba8M(qcd qcdVar, MusicItemBean musicItemBean) {
        a(qcdVar, musicItemBean);
    }

    public static /* synthetic */ void lambda$CFMiK_jfOTM1KRHtcAQrEGWKE6s(a aVar, com.taobao.taopai.material.request.materialdetail.a aVar2, Throwable th) {
        aVar.a(aVar2, th);
    }

    public static /* synthetic */ void lambda$IsVctceZxlgCu_6n6zCGYV2Z2Os(com.taobao.taopai.material.request.materiallist.a aVar, MaterialListResponse materialListResponse) {
        a(aVar, materialListResponse);
    }

    public static /* synthetic */ void lambda$S2wG9Pfgz7AO7daxGehHiH4PPM0(a aVar, com.taobao.taopai.material.request.musiclist.a aVar2, Throwable th) {
        aVar.b(aVar2, th);
    }

    /* renamed from: lambda$T_MrP69jSPb3lHY-sX69AVDSs7o */
    public static /* synthetic */ void m1399lambda$T_MrP69jSPb3lHYsX69AVDSs7o(b bVar, List list) {
        a(bVar, list);
    }

    public static /* synthetic */ void lambda$cORejs_egOLVww4Bn2kX2qyNKdU(a aVar, qby qbyVar, com.taobao.taopai.material.request.materialdetail.b bVar, Throwable th) {
        aVar.a(qbyVar, bVar, th);
    }

    public static /* synthetic */ void lambda$gy9eLJMrbSPftydvLRQmGPqcXTg(com.taobao.taopai.material.request.musiclove.a aVar, MusicListResponseModel musicListResponseModel) {
        a(aVar, musicListResponseModel);
    }

    public static /* synthetic */ void lambda$hb6fOCZcHv0xFtjSJWqrEfsiHbY(a aVar, com.taobao.taopai.material.request.musicetype.a aVar2, Throwable th) {
        aVar.a(aVar2, th);
    }

    public static /* synthetic */ void lambda$iDmzZLyEWfv_Dq5vxchVF7UMYDM(com.taobao.taopai.material.request.musiclist.a aVar, MusicListResponseModel musicListResponseModel) {
        a(aVar, musicListResponseModel);
    }

    /* renamed from: lambda$lXZkLf0h7Ytd6o5u9n2eT-tSJtQ */
    public static /* synthetic */ void m1400lambda$lXZkLf0h7Ytd6o5u9n2eTtSJtQ(com.taobao.taopai.material.request.musiclist.a aVar, MusicListResponseModel musicListResponseModel) {
        b(aVar, musicListResponseModel);
    }

    /* renamed from: lambda$lnMMIlor-bFo0wzh9eAIU3mSbp0 */
    public static /* synthetic */ void m1401lambda$lnMMIlorbFo0wzh9eAIU3mSbp0(com.taobao.taopai.material.request.musicetype.a aVar, List list) {
        a(aVar, list);
    }

    /* renamed from: lambda$nKhTUt6OF0P3YWc-vAAICVUD174 */
    public static /* synthetic */ void m1402lambda$nKhTUt6OF0P3YWcvAAICVUD174(a aVar, com.taobao.taopai.material.request.musiclist.a aVar2, Throwable th) {
        aVar.a(aVar2, th);
    }

    /* renamed from: lambda$pn7-qShwilJuEzDBaVZpzTbwFMQ */
    public static /* synthetic */ void m1403lambda$pn7qShwilJuEzDBaVZpzTbwFMQ(com.taobao.taopai.material.request.musicunlove.a aVar) {
        a(aVar);
    }

    /* renamed from: lambda$prWMn0UEu--Y3vhIxuqkvuLxeVs */
    public static /* synthetic */ void m1404lambda$prWMn0UEuY3vhIxuqkvuLxeVs(a aVar, com.taobao.taopai.material.request.musicunlove.a aVar2, Throwable th) {
        aVar.a(aVar2, th);
    }

    /* renamed from: lambda$qiBUSygvjRSJZY-ZS41bJZN86Jo */
    public static /* synthetic */ void m1405lambda$qiBUSygvjRSJZYZS41bJZN86Jo(a aVar, com.taobao.taopai.material.request.musiclove.a aVar2, Throwable th) {
        aVar.a(aVar2, th);
    }

    /* renamed from: lambda$sumf3gOurhjxPJGirOHK-W6IYQY */
    public static /* synthetic */ void m1406lambda$sumf3gOurhjxPJGirOHKW6IYQY(com.taobao.taopai.material.request.musiclove.b bVar) {
        a(bVar);
    }

    public static /* synthetic */ void lambda$tQrnZAJ6WZipqj7puuFAVlxEpdg(a aVar, qcd qcdVar, Throwable th) {
        aVar.a(qcdVar, th);
    }

    public static /* synthetic */ void lambda$vOB0eRnhoQ8MTjROj4c9a0utIyU(a aVar, com.taobao.taopai.material.request.musiclove.b bVar, Throwable th) {
        aVar.a(bVar, th);
    }

    public static /* synthetic */ void lambda$yHQlA_wQxU7TCzuiR3wKjbWjdVI(com.taobao.taopai.material.request.materialdetail.a aVar, MaterialDetailBean materialDetailBean) {
        a(aVar, materialDetailBean);
    }

    /* renamed from: lambda$z7geSpuGFCSDLwHSdL3ViP6y-wQ */
    public static /* synthetic */ void m1407lambda$z7geSpuGFCSDLwHSdL3ViP6ywQ(a aVar, com.taobao.taopai.material.request.materiallist.a aVar2, Throwable th) {
        aVar.a(aVar2, th);
    }

    public static /* synthetic */ void lambda$zMz0NwABU2EZBvV5aAl7rhvNSv0(qby qbyVar, Pair pair) {
        a(qbyVar, pair);
    }

    static {
        kge.a(576053246);
        f22061a = "guangguang";
        b = "guangguang";
        e();
    }

    @Deprecated
    public a() {
    }

    private static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else if (rsy.b() != null || rsy.a()) {
        } else {
            rsy.a($$Lambda$a$MdqokEs7LMnjUnZO0VxgN2dSf4Y.INSTANCE);
        }
    }

    public static /* synthetic */ void b(Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd742bac", new Object[]{th});
        } else {
            th.printStackTrace();
        }
    }

    public a(Context context, String str, String str2) {
        a(context, str, str2);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else {
            a(context, str, "");
        }
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
            return;
        }
        qbs.a(context);
        if (!TextUtils.isEmpty(str)) {
            f22061a = str;
        } else if (!TextUtils.isEmpty(str2)) {
            f22061a = str2;
        }
        if (!TextUtils.isEmpty(str2)) {
            b = str2;
        } else if (TextUtils.isEmpty(str)) {
        } else {
            b = str;
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f22061a;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : b;
    }

    public void a(c cVar, final com.taobao.taopai.material.request.musiclove.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be31e0d5", new Object[]{this, cVar, bVar});
        } else if (pzb.c()) {
            MaterialDataServer.a(f22061a, b).c(cVar.h(), cVar.g(), cVar.i()).subscribe(new rse() { // from class: com.taobao.taopai.material.-$$Lambda$a$sumf3gOurhjxPJGirOHK-W6IYQY
                public final void run() {
                    a.m1406lambda$sumf3gOurhjxPJGirOHKW6IYQY(com.taobao.taopai.material.request.musiclove.b.this);
                }
            }, new rsk() { // from class: com.taobao.taopai.material.-$$Lambda$a$vOB0eRnhoQ8MTjROj4c9a0utIyU
                public final void accept(Object obj) {
                    a.lambda$vOB0eRnhoQ8MTjROj4c9a0utIyU(a.this, bVar, (Throwable) obj);
                }
            });
        } else {
            MusicLoveBusiness musicLoveBusiness = new MusicLoveBusiness(cVar, bVar);
            musicLoveBusiness.request();
            this.c.add(musicLoveBusiness);
        }
    }

    public static /* synthetic */ void a(com.taobao.taopai.material.request.musiclove.b bVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a573e6f", new Object[]{bVar});
        } else if (bVar == null) {
        } else {
            bVar.a();
        }
    }

    public /* synthetic */ void a(com.taobao.taopai.material.request.musiclove.b bVar, Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdaf60e6", new Object[]{this, bVar, th});
        } else {
            a((qbu) bVar, th);
        }
    }

    public void a(com.taobao.taopai.material.request.musicunlove.b bVar, final com.taobao.taopai.material.request.musicunlove.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ff4b1a5", new Object[]{this, bVar, aVar});
        } else if (pzb.c()) {
            MaterialDataServer.a(f22061a, b).d(bVar.g(), bVar.h(), bVar.i()).subscribe(new rse() { // from class: com.taobao.taopai.material.-$$Lambda$a$pn7-qShwilJuEzDBaVZpzTbwFMQ
                public final void run() {
                    a.m1403lambda$pn7qShwilJuEzDBaVZpzTbwFMQ(com.taobao.taopai.material.request.musicunlove.a.this);
                }
            }, new rsk() { // from class: com.taobao.taopai.material.-$$Lambda$a$prWMn0UEu--Y3vhIxuqkvuLxeVs
                public final void accept(Object obj) {
                    a.m1404lambda$prWMn0UEuY3vhIxuqkvuLxeVs(a.this, aVar, (Throwable) obj);
                }
            });
        } else {
            MusicUnLoveBusiness musicUnLoveBusiness = new MusicUnLoveBusiness(bVar, aVar);
            musicUnLoveBusiness.request();
            this.c.add(musicUnLoveBusiness);
        }
    }

    public static /* synthetic */ void a(com.taobao.taopai.material.request.musicunlove.a aVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dca9497", new Object[]{aVar});
        } else if (aVar == null) {
        } else {
            aVar.a();
        }
    }

    public /* synthetic */ void a(com.taobao.taopai.material.request.musicunlove.a aVar, Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1b2f3be", new Object[]{this, aVar, th});
        } else {
            a((qbu) aVar, th);
        }
    }

    public void a(com.taobao.taopai.material.request.musicetype.b bVar, final com.taobao.taopai.material.request.musicetype.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9e1049", new Object[]{this, bVar, aVar});
        } else if (pzb.c()) {
            MaterialDataServer.a(f22061a, b).a().subscribe(new rsk() { // from class: com.taobao.taopai.material.-$$Lambda$a$lnMMIlor-bFo0wzh9eAIU3mSbp0
                public final void accept(Object obj) {
                    a.m1401lambda$lnMMIlorbFo0wzh9eAIU3mSbp0(com.taobao.taopai.material.request.musicetype.a.this, (List) obj);
                }
            }, new rsk() { // from class: com.taobao.taopai.material.-$$Lambda$a$hb6fOCZcHv0xFtjSJWqrEfsiHbY
                public final void accept(Object obj) {
                    a.lambda$hb6fOCZcHv0xFtjSJWqrEfsiHbY(a.this, aVar, (Throwable) obj);
                }
            });
        } else {
            MusicTypeListBusiness musicTypeListBusiness = new MusicTypeListBusiness(bVar, aVar);
            musicTypeListBusiness.request();
            this.c.add(musicTypeListBusiness);
        }
    }

    public static /* synthetic */ void a(com.taobao.taopai.material.request.musicetype.a aVar, List list) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6cb935c", new Object[]{aVar, list});
        } else if (aVar == null) {
        } else {
            ArrayList arrayList = new ArrayList();
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    MusicTypeInfo musicTypeInfo = (MusicTypeInfo) it.next();
                    MusicCategoryBean musicCategoryBean = new MusicCategoryBean();
                    musicCategoryBean.id = musicTypeInfo.id;
                    musicCategoryBean.logoUrl = musicTypeInfo.logoUrl;
                    musicCategoryBean.name = musicTypeInfo.name;
                    musicCategoryBean.type = musicTypeInfo.type;
                    arrayList.add(musicCategoryBean);
                }
            }
            aVar.a(arrayList);
        }
    }

    public /* synthetic */ void a(com.taobao.taopai.material.request.musicetype.a aVar, Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce65386a", new Object[]{this, aVar, th});
        } else {
            a((qbu) aVar, th);
        }
    }

    public void a(com.taobao.taopai.material.request.musiclovelist.a aVar, final com.taobao.taopai.material.request.musiclove.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862cd0da", new Object[]{this, aVar, aVar2});
        } else if (pzb.c()) {
            MusicLoveListRequestParams musicLoveListRequestParams = new MusicLoveListRequestParams();
            musicLoveListRequestParams.pageSize = aVar.g();
            musicLoveListRequestParams.page = aVar.h();
            MaterialDataServer.a(f22061a, b).a(musicLoveListRequestParams).subscribe(new rsk() { // from class: com.taobao.taopai.material.-$$Lambda$a$gy9eLJMrbSPftydvLRQmGPqcXTg
                public final void accept(Object obj) {
                    a.lambda$gy9eLJMrbSPftydvLRQmGPqcXTg(com.taobao.taopai.material.request.musiclove.a.this, (MusicListResponseModel) obj);
                }
            }, new rsk() { // from class: com.taobao.taopai.material.-$$Lambda$a$qiBUSygvjRSJZY-ZS41bJZN86Jo
                public final void accept(Object obj) {
                    a.m1405lambda$qiBUSygvjRSJZYZS41bJZN86Jo(a.this, aVar2, (Throwable) obj);
                }
            });
        } else {
            MusicLoveListBusiness musicLoveListBusiness = new MusicLoveListBusiness(aVar, aVar2);
            musicLoveListBusiness.request();
            this.c.add(musicLoveListBusiness);
        }
    }

    public static /* synthetic */ void a(com.taobao.taopai.material.request.musiclove.a aVar, MusicListResponseModel musicListResponseModel) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b8deb53", new Object[]{aVar, musicListResponseModel});
        } else if (aVar == null) {
        } else {
            MusicListBean musicListBean = new MusicListBean();
            musicListBean.module = (ArrayList) musicListResponseModel.result;
            musicListBean.mPageInfo = new MusicListBean.PageInfo();
            musicListBean.mPageInfo.currentPage = musicListResponseModel.paging.page;
            musicListBean.mPageInfo.pageSize = musicListResponseModel.paging.pageSize;
            musicListBean.mPageInfo.totalCnt = musicListResponseModel.paging.totalCnt;
            musicListBean.mPageInfo.totalPage = musicListResponseModel.paging.totalPage;
            aVar.a(musicListBean);
        }
    }

    public /* synthetic */ void a(com.taobao.taopai.material.request.musiclove.a aVar, Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("797f13e5", new Object[]{this, aVar, th});
        } else {
            a((qbu) aVar, th);
        }
    }

    public void a(com.taobao.taopai.material.request.musiclist.b bVar, final com.taobao.taopai.material.request.musiclist.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0513ebf", new Object[]{this, bVar, aVar});
        } else if (pzb.c()) {
            MusicListRequestParams musicListRequestParams = new MusicListRequestParams();
            musicListRequestParams.category = bVar.i();
            musicListRequestParams.searchTerms = bVar.j();
            musicListRequestParams.pageSize = bVar.g();
            musicListRequestParams.page = bVar.h();
            MaterialDataServer.a(f22061a, b).a(musicListRequestParams).subscribe(new rsk() { // from class: com.taobao.taopai.material.-$$Lambda$a$lXZkLf0h7Ytd6o5u9n2eT-tSJtQ
                public final void accept(Object obj) {
                    a.m1400lambda$lXZkLf0h7Ytd6o5u9n2eTtSJtQ(com.taobao.taopai.material.request.musiclist.a.this, (MusicListResponseModel) obj);
                }
            }, new rsk() { // from class: com.taobao.taopai.material.-$$Lambda$a$S2wG9Pfgz7AO7daxGehHiH4PPM0
                public final void accept(Object obj) {
                    a.lambda$S2wG9Pfgz7AO7daxGehHiH4PPM0(a.this, aVar, (Throwable) obj);
                }
            });
        } else {
            MusicListBusiness musicListBusiness = new MusicListBusiness(bVar, aVar);
            musicListBusiness.request();
            this.c.add(musicListBusiness);
        }
    }

    public static /* synthetic */ void b(com.taobao.taopai.material.request.musiclist.a aVar, MusicListResponseModel musicListResponseModel) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde765de", new Object[]{aVar, musicListResponseModel});
        } else if (aVar == null) {
        } else {
            MusicListBean musicListBean = new MusicListBean();
            musicListBean.module = (ArrayList) musicListResponseModel.result;
            musicListBean.mPageInfo = new MusicListBean.PageInfo();
            musicListBean.mPageInfo.currentPage = musicListResponseModel.paging.page;
            musicListBean.mPageInfo.pageSize = musicListResponseModel.paging.pageSize;
            musicListBean.mPageInfo.totalCnt = musicListResponseModel.paging.totalCnt;
            musicListBean.mPageInfo.totalPage = musicListResponseModel.paging.totalPage;
            aVar.a(musicListBean);
        }
    }

    public /* synthetic */ void b(com.taobao.taopai.material.request.musiclist.a aVar, Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("255d9730", new Object[]{this, aVar, th});
        } else {
            a((qbu) aVar, th);
        }
    }

    public void b(com.taobao.taopai.material.request.musiclist.b bVar, final com.taobao.taopai.material.request.musiclist.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95c8a40", new Object[]{this, bVar, aVar});
        } else if (pzb.c()) {
            MusicListRequestParams musicListRequestParams = new MusicListRequestParams();
            musicListRequestParams.category = bVar.i();
            musicListRequestParams.searchTerms = bVar.j();
            musicListRequestParams.pageSize = bVar.g();
            musicListRequestParams.page = bVar.h();
            MaterialDataServer.a(f22061a, b).a(musicListRequestParams).subscribe(new rsk() { // from class: com.taobao.taopai.material.-$$Lambda$a$iDmzZLyEWfv_Dq5vxchVF7UMYDM
                public final void accept(Object obj) {
                    a.lambda$iDmzZLyEWfv_Dq5vxchVF7UMYDM(com.taobao.taopai.material.request.musiclist.a.this, (MusicListResponseModel) obj);
                }
            }, new rsk() { // from class: com.taobao.taopai.material.-$$Lambda$a$nKhTUt6OF0P3YWc-vAAICVUD174
                public final void accept(Object obj) {
                    a.m1402lambda$nKhTUt6OF0P3YWcvAAICVUD174(a.this, aVar, (Throwable) obj);
                }
            });
        } else {
            MusicSearchBusiness musicSearchBusiness = new MusicSearchBusiness(bVar, aVar);
            musicSearchBusiness.request();
            this.c.add(musicSearchBusiness);
        }
    }

    public static /* synthetic */ void a(com.taobao.taopai.material.request.musiclist.a aVar, MusicListResponseModel musicListResponseModel) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ae127f", new Object[]{aVar, musicListResponseModel});
        } else if (aVar == null) {
        } else {
            MusicListBean musicListBean = new MusicListBean();
            musicListBean.module = (ArrayList) musicListResponseModel.result;
            musicListBean.mPageInfo = new MusicListBean.PageInfo();
            musicListBean.mPageInfo.currentPage = musicListResponseModel.paging.page;
            musicListBean.mPageInfo.pageSize = musicListResponseModel.paging.pageSize;
            musicListBean.mPageInfo.totalCnt = musicListResponseModel.paging.totalCnt;
            musicListBean.mPageInfo.totalPage = musicListResponseModel.paging.totalPage;
            aVar.a(musicListBean);
        }
    }

    public /* synthetic */ void a(com.taobao.taopai.material.request.musiclist.a aVar, Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aec9e11", new Object[]{this, aVar, th});
        } else {
            a((qbu) aVar, th);
        }
    }

    public void a(qce qceVar, final qcd qcdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8829ed03", new Object[]{this, qceVar, qcdVar});
        } else {
            MaterialDataServer.a(f22061a, b).b(qceVar.h(), qceVar.g(), qceVar.i()).subscribe(new rsk() { // from class: com.taobao.taopai.material.-$$Lambda$a$AkE5WbWkOshHmARkSBmJPteba8M
                public final void accept(Object obj) {
                    a.lambda$AkE5WbWkOshHmARkSBmJPteba8M(qcd.this, (MusicItemBean) obj);
                }
            }, new rsk() { // from class: com.taobao.taopai.material.-$$Lambda$a$tQrnZAJ6WZipqj7puuFAVlxEpdg
                public final void accept(Object obj) {
                    a.lambda$tQrnZAJ6WZipqj7puuFAVlxEpdg(a.this, qcdVar, (Throwable) obj);
                }
            });
        }
    }

    public static /* synthetic */ void a(qcd qcdVar, MusicItemBean musicItemBean) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec938a93", new Object[]{qcdVar, musicItemBean});
        } else if (qcdVar == null) {
        } else {
            qcdVar.a(musicItemBean);
        }
    }

    public /* synthetic */ void a(qcd qcdVar, Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a09daaf", new Object[]{this, qcdVar, th});
        } else {
            a((qbu) qcdVar, th);
        }
    }

    public void a(qcc qccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb09a4a7", new Object[]{this, qccVar});
        } else {
            MaterialDataServer.a(f22061a, b).a(qccVar.h(), qccVar.g(), qccVar.i(), qccVar.j(), qccVar.k()).subscribe($$Lambda$a$Tnt2W6U9kaly2zB4CGTRvzMZmwk.INSTANCE, $$Lambda$a$OAOQUYgOiIL_QAAiVgfDs8AEx1Q.INSTANCE);
        }
    }

    public void a(Context context, com.taobao.taopai.material.request.materialcategory.a aVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c093dbbf", new Object[]{this, context, aVar, bVar});
        } else if (pzb.a()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                b(context, aVar, bVar);
            } catch (Exception e) {
                e.printStackTrace();
                qcf.a(aVar.b(), "category", aVar.toString(), "-1000", e.getMessage(), SystemClock.elapsedRealtime() - elapsedRealtime);
            }
        } else {
            MaterialCategoryBusiness materialCategoryBusiness = new MaterialCategoryBusiness(aVar, bVar);
            materialCategoryBusiness.request();
            this.c.add(materialCategoryBusiness);
        }
    }

    private void b(Context context, com.taobao.taopai.material.request.materialcategory.a aVar, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd0911e", new Object[]{this, context, aVar, bVar});
        } else {
            com.taobao.taopai2.material.a.a(context, f22061a, b).a(aVar.h(), aVar.g(), aVar.a() ? MaterialRequestPolicy.CACHE_NET : MaterialRequestPolicy.NET, aVar.c()).subscribeOn(rta.b()).subscribe(new rsk() { // from class: com.taobao.taopai.material.-$$Lambda$a$T_MrP69jSPb3lHY-sX69AVDSs7o
                public final void accept(Object obj) {
                    a.m1399lambda$T_MrP69jSPb3lHYsX69AVDSs7o(b.this, (List) obj);
                }
            }, new rsk() { // from class: com.taobao.taopai.material.-$$Lambda$a$6UGGzDgEJL-s84yb_YxXJoLAtKk
                public final void accept(Object obj) {
                    a.m1398lambda$6UGGzDgEJLs84yb_YxXJoLAtKk(a.this, bVar, (Throwable) obj);
                }
            });
        }
    }

    public static /* synthetic */ void a(b bVar, List list) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e706250", new Object[]{bVar, list});
        } else if (bVar == null) {
        } else {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    CategoryInfo categoryInfo = (CategoryInfo) it.next();
                    MaterialCategoryBean materialCategoryBean = new MaterialCategoryBean();
                    materialCategoryBean.setCategoryId(pza.a(categoryInfo.categoryId, 0));
                    materialCategoryBean.setName(categoryInfo.name);
                    materialCategoryBean.setOriginExtend(categoryInfo.extend);
                    materialCategoryBean.setExtend((MaterialCategoryBean.Extend) JSON.parseObject(categoryInfo.extend, MaterialCategoryBean.Extend.class));
                    arrayList.add(materialCategoryBean);
                }
            }
            bVar.a(arrayList);
        }
    }

    public /* synthetic */ void a(b bVar, Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83efa1f6", new Object[]{this, bVar, th});
        } else {
            a((qbu) bVar, th);
        }
    }

    public void a(Context context, com.taobao.taopai.material.request.materiallist.b bVar, final com.taobao.taopai.material.request.materiallist.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33d80ca1", new Object[]{this, context, bVar, aVar});
        } else if (pzb.a()) {
            com.taobao.taopai2.material.a.a(context, f22061a, b).a(bVar.k(), String.valueOf(bVar.l()), bVar.h(), bVar.i(), bVar.m(), bVar.g(), bVar.a() ? MaterialRequestPolicy.CACHE_NET : MaterialRequestPolicy.NET, bVar.c()).subscribeOn(rta.b()).subscribe(new rsk() { // from class: com.taobao.taopai.material.-$$Lambda$a$IsVctceZxlgCu_6n6zCGYV2Z2Os
                public final void accept(Object obj) {
                    a.lambda$IsVctceZxlgCu_6n6zCGYV2Z2Os(com.taobao.taopai.material.request.materiallist.a.this, (MaterialListResponse) obj);
                }
            }, new rsk() { // from class: com.taobao.taopai.material.-$$Lambda$a$z7geSpuGFCSDLwHSdL3ViP6y-wQ
                public final void accept(Object obj) {
                    a.m1407lambda$z7geSpuGFCSDLwHSdL3ViP6ywQ(a.this, aVar, (Throwable) obj);
                }
            });
        } else {
            MaterialListBusiness materialListBusiness = new MaterialListBusiness(bVar, aVar);
            materialListBusiness.request();
            this.c.add(materialListBusiness);
        }
    }

    public static /* synthetic */ void a(com.taobao.taopai.material.request.materiallist.a aVar, MaterialListResponse materialListResponse) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc776ccc", new Object[]{aVar, materialListResponse});
        } else if (materialListResponse == null || materialListResponse.materialList == null) {
            aVar.a("data empty", "");
        } else {
            MaterialListBean materialListBean = new MaterialListBean();
            ArrayList<MaterialDetail> arrayList = new ArrayList<>();
            for (MaterialDetailBean materialDetailBean : materialListResponse.materialList) {
                MaterialDetail materialDetail = new MaterialDetail();
                materialDetail.copyFrom(materialDetailBean);
                arrayList.add(materialDetail);
            }
            materialListBean.setModel(arrayList);
            materialListBean.setCurrentPage(materialListResponse.page);
            materialListBean.setTotalPage(materialListResponse.totalPage);
            materialListBean.setTotal(materialListResponse.total);
            aVar.a(materialListBean);
        }
    }

    public /* synthetic */ void a(com.taobao.taopai.material.request.materiallist.a aVar, Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e65c95", new Object[]{this, aVar, th});
        } else {
            a((qbu) aVar, th);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (BaseMaterialBusiness baseMaterialBusiness : this.c) {
            if (baseMaterialBusiness instanceof MaterialListBusiness) {
                baseMaterialBusiness.cancel();
                this.c.remove(baseMaterialBusiness);
            }
        }
    }

    public void a(com.taobao.taopai.material.request.materialdetail.b bVar, final com.taobao.taopai.material.request.materialdetail.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3826e289", new Object[]{this, bVar, aVar});
        } else if (pzb.b()) {
            MaterialDataServer.a(f22061a, b).a(bVar.g()).subscribe(new rsk() { // from class: com.taobao.taopai.material.-$$Lambda$a$yHQlA_wQxU7TCzuiR3wKjbWjdVI
                public final void accept(Object obj) {
                    a.lambda$yHQlA_wQxU7TCzuiR3wKjbWjdVI(com.taobao.taopai.material.request.materialdetail.a.this, (MaterialDetailBean) obj);
                }
            }, new rsk() { // from class: com.taobao.taopai.material.-$$Lambda$a$CFMiK_jfOTM1KRHtcAQrEGWKE6s
                public final void accept(Object obj) {
                    a.lambda$CFMiK_jfOTM1KRHtcAQrEGWKE6s(a.this, aVar, (Throwable) obj);
                }
            });
        } else {
            MaterialDetailBusiness materialDetailBusiness = new MaterialDetailBusiness(bVar, aVar);
            materialDetailBusiness.request();
            this.c.add(materialDetailBusiness);
        }
    }

    public static /* synthetic */ void a(com.taobao.taopai.material.request.materialdetail.a aVar, MaterialDetailBean materialDetailBean) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8fe78a", new Object[]{aVar, materialDetailBean});
        } else if (aVar == null) {
        } else {
            MaterialDetail materialDetail = new MaterialDetail();
            materialDetail.copyFrom(materialDetailBean);
            aVar.a(materialDetail);
        }
    }

    public /* synthetic */ void a(com.taobao.taopai.material.request.materialdetail.a aVar, Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b874cc88", new Object[]{this, aVar, th});
        } else {
            a((qbu) aVar, th);
        }
    }

    public void a(com.taobao.taopai.material.request.materialfile.b bVar, com.taobao.taopai.material.request.materialfile.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d6b769", new Object[]{this, bVar, aVar});
        } else {
            a((Context) null, bVar, aVar);
        }
    }

    public void a(Context context, com.taobao.taopai.material.request.materialfile.b bVar, com.taobao.taopai.material.request.materialfile.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc1a3561", new Object[]{this, context, bVar, aVar});
            return;
        }
        MaterialFileBusiness materialFileBusiness = new MaterialFileBusiness(context, bVar, aVar);
        materialFileBusiness.getMaterialFile();
        this.c.add(materialFileBusiness);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        for (BaseMaterialBusiness baseMaterialBusiness : this.c) {
            if (baseMaterialBusiness instanceof MaterialFileBusiness) {
                baseMaterialBusiness.cancel();
                this.c.remove(baseMaterialBusiness);
            }
        }
    }

    public void a(com.taobao.taopai.material.request.materialdetail.b bVar, qby qbyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bf962d4", new Object[]{this, bVar, qbyVar});
        } else {
            a((Context) null, bVar, qbyVar);
        }
    }

    public void a(Context context, final com.taobao.taopai.material.request.materialdetail.b bVar, final qby qbyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b77eddc", new Object[]{this, context, bVar, qbyVar});
        } else if (pzb.b()) {
            MaterialDataServer.a(f22061a, b).b(bVar.g()).subscribe(new rsk() { // from class: com.taobao.taopai.material.-$$Lambda$a$zMz0NwABU2EZBvV5aAl7rhvNSv0
                public final void accept(Object obj) {
                    a.lambda$zMz0NwABU2EZBvV5aAl7rhvNSv0(qby.this, (Pair) obj);
                }
            }, new rsk() { // from class: com.taobao.taopai.material.-$$Lambda$a$cORejs_egOLVww4Bn2kX2qyNKdU
                public final void accept(Object obj) {
                    a.lambda$cORejs_egOLVww4Bn2kX2qyNKdU(a.this, qbyVar, bVar, (Throwable) obj);
                }
            });
        } else {
            new qca(context).a(bVar, qbyVar);
        }
    }

    public static /* synthetic */ void a(qby qbyVar, Pair pair) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49c0018a", new Object[]{qbyVar, pair});
        } else if (qbyVar == null) {
        } else {
            if (pair.second == null) {
                qbyVar.a(((Integer) pair.first).intValue());
                return;
            }
            MaterialResource materialResource = new MaterialResource();
            materialResource.copyFrom((com.taobao.taopai2.material.business.res.MaterialResource) pair.second);
            qbyVar.a(materialResource);
            String str = "getMaterialRes Success, materialId = " + materialResource.getTid();
        }
    }

    public /* synthetic */ void a(qby qbyVar, com.taobao.taopai.material.request.materialdetail.b bVar, Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a2cf871", new Object[]{this, qbyVar, bVar, th});
            return;
        }
        a(qbyVar, th);
        Log.e("TPMaterial", "getMaterialRes Fail, materialId = " + bVar.g());
    }

    public void a(String str, String str2, int i, qbt<MusicResource> qbtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd2a6114", new Object[]{this, str, str2, new Integer(i), qbtVar});
        } else {
            MaterialDataServer.a(a(), b()).a(str, str2, "", i, qbtVar);
        }
    }

    public void a(String str, String str2, String str3, int i, qbt<MusicResource> qbtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b444a18a", new Object[]{this, str, str2, str3, new Integer(i), qbtVar});
        } else {
            MaterialDataServer.a(a(), b()).a(str, str2, str3, i, qbtVar);
        }
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        File b2 = com.taobao.taopai2.material.business.res.b.b(str, str2);
        return b2 != null && b2.exists();
    }

    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
        }
        File b2 = com.taobao.taopai2.material.business.res.b.b(str, str2);
        return b2 != null ? b2.getAbsolutePath() : "";
    }

    public void a(String str, String str2, int i, List<Long> list, com.taobao.taopai2.material.business.specified.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("206aa0d2", new Object[]{this, str, str2, new Integer(i), list, aVar});
        } else {
            new com.taobao.taopai2.material.business.specified.b().a(str, str2, i, list, aVar);
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(ResourceJniInteract.getResourceFromCacheWithIdOrTag(str));
    }

    public static void a(String str, qbt<String> qbtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aedbd3f", new Object[]{str, qbtVar});
        } else {
            ResourceJniInteract.getResourcePathForMaterialWithTag(str, qbtVar);
        }
    }

    private void a(qbu qbuVar, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f65a4a1", new Object[]{this, qbuVar, th});
        } else if (qbuVar == null) {
        } else {
            if (th instanceof MaterialException) {
                MaterialException materialException = (MaterialException) th;
                qbuVar.a(materialException.getErrorCode(), materialException.getErrorInfo());
                return;
            }
            qbuVar.a("exception is invalid", th != null ? th.getMessage() : "error is empty");
        }
    }
}
