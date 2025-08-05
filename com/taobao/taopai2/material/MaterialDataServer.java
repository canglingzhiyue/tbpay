package com.taobao.taopai2.material;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.base.MaterialBaseRequestParams;
import com.taobao.taopai2.material.business.maires.MaiResDetailParams;
import com.taobao.taopai2.material.business.maires.MaiResResponseModel;
import com.taobao.taopai2.material.business.materialdetail.DetailRequestParams;
import com.taobao.taopai2.material.business.materialdetail.DetailResponseModel;
import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import com.taobao.taopai2.material.business.musicdetail.MusicDetailRequestParams;
import com.taobao.taopai2.material.business.musicdetail.MusicItemBean;
import com.taobao.taopai2.material.business.musiclist.MusicListRequestParams;
import com.taobao.taopai2.material.business.musiclist.MusicListResponseModel;
import com.taobao.taopai2.material.business.musiclove.MusicLoveListRequestParams;
import com.taobao.taopai2.material.business.musiclove.MusicLoveRequestParams;
import com.taobao.taopai2.material.business.musiclove.MusicUnLoveRequestParams;
import com.taobao.taopai2.material.business.musicreport.MusicReportRequestParams;
import com.taobao.taopai2.material.business.musictype.MusicTypeInfo;
import com.taobao.taopai2.material.business.musictype.MusicTypeListParams;
import com.taobao.taopai2.material.business.musictype.MusicTypeListResponseModel;
import com.taobao.taopai2.material.business.res.MaterialResource;
import com.taobao.taopai2.material.business.res.MusicResource;
import com.taobao.taopai2.material.business.res.c;
import com.taobao.taopai2.material.request.CompletbleRequestBuilder;
import com.taobao.taopai2.material.request.RequestBuilder;
import com.taobao.taopai2.material.request.Response;
import io.reactivex.ad;
import io.reactivex.v;
import java.util.HashMap;
import java.util.List;
import tb.kge;
import tb.qbt;

/* loaded from: classes8.dex */
public class MaterialDataServer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f22080a;
    private String b;
    private int c = MaterialBaseRequestParams.DEFUALT_CLIENTVER;

    /* loaded from: classes8.dex */
    public static final class MusicDetailResponse extends Response<MusicItemBean> {
        static {
            kge.a(-1171718103);
        }
    }

    static {
        kge.a(2067285174);
    }

    public static MaterialDataServer a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaterialDataServer) ipChange.ipc$dispatch("111d3a93", new Object[]{str, str2});
        }
        MaterialDataServer materialDataServer = new MaterialDataServer();
        materialDataServer.f22080a = str;
        materialDataServer.b = str2;
        return materialDataServer;
    }

    public static MaterialDataServer a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaterialDataServer) ipChange.ipc$dispatch("ddad37a8", new Object[]{str, str2, new Integer(i)});
        }
        MaterialDataServer materialDataServer = new MaterialDataServer();
        materialDataServer.f22080a = str;
        materialDataServer.b = str2;
        materialDataServer.c = i;
        return materialDataServer;
    }

    public final void a(MaterialBaseRequestParams materialBaseRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db543416", new Object[]{this, materialBaseRequestParams});
            return;
        }
        materialBaseRequestParams.bizLine = this.f22080a;
        materialBaseRequestParams.bizScene = this.b;
        materialBaseRequestParams.clientVer = this.c;
    }

    public final void a(com.taobao.taopai.material.request.base.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("130c0d54", new Object[]{this, aVar});
            return;
        }
        aVar.a(this.f22080a);
        aVar.b(this.b);
        aVar.a(this.c);
    }

    public ad<MaterialDetailBean> a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ad) ipChange.ipc$dispatch("4331bd31", new Object[]{this, new Long(j)});
        }
        DetailRequestParams detailRequestParams = new DetailRequestParams(j);
        a(detailRequestParams);
        return new RequestBuilder(detailRequestParams, DetailResponseModel.MaterialDetailResponse.class).setTarget(detailRequestParams.getAPI(), "1.0").withoutECode().withoutSession().toSingle().map($$Lambda$MaterialDataServer$oX2rP85dxVc1wgiPo56suJdzTG4.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ MaterialDetailBean f(Response response) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MaterialDetailBean) ipChange.ipc$dispatch("94a6b25a", new Object[]{response}) : (MaterialDetailBean) response.data;
    }

    public v<Pair<Integer, MaterialResource>> b(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (v) ipChange.ipc$dispatch("8260c42d", new Object[]{this, new Long(j)}) : new com.taobao.taopai2.material.business.res.a(j, this).a();
    }

    public ad<List<MusicTypeInfo>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ad) ipChange.ipc$dispatch("ea28fa3d", new Object[]{this});
        }
        MusicTypeListParams musicTypeListParams = new MusicTypeListParams();
        a(musicTypeListParams);
        return new RequestBuilder(musicTypeListParams, MusicTypeListResponseModel.MusicTypeListResponse.class).setTarget(musicTypeListParams.getAPI(), "1.0").withoutECode().withoutSession().toSingle().map($$Lambda$MaterialDataServer$SWsNENjuIX7JmwPbqEqep6KqiE.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List e(Response response) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("72628f2f", new Object[]{response}) : ((MusicTypeListResponseModel) response.data).result;
    }

    public ad<MusicListResponseModel> a(MusicListRequestParams musicListRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ad) ipChange.ipc$dispatch("216cb723", new Object[]{this, musicListRequestParams});
        }
        a((MaterialBaseRequestParams) musicListRequestParams);
        if (!TextUtils.isEmpty(musicListRequestParams.searchKey)) {
            HashMap hashMap = new HashMap();
            hashMap.put("KEYWORD", musicListRequestParams.searchKey);
            musicListRequestParams.searchTerms = JSON.toJSONString(hashMap);
        }
        return new RequestBuilder(musicListRequestParams, MusicListResponseModel.MusicListResponse.class).setTarget(musicListRequestParams.getAPI(), "1.0").withoutECode().withoutSession().toSingle().map($$Lambda$MaterialDataServer$YER4hGClI8avhkap_shBHo44oE.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ MusicListResponseModel d(Response response) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MusicListResponseModel) ipChange.ipc$dispatch("d8ef7faa", new Object[]{response}) : (MusicListResponseModel) response.data;
    }

    public ad<MusicListResponseModel> a(MusicLoveListRequestParams musicLoveListRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ad) ipChange.ipc$dispatch("d530af09", new Object[]{this, musicLoveListRequestParams});
        }
        a((MaterialBaseRequestParams) musicLoveListRequestParams);
        return new RequestBuilder(musicLoveListRequestParams, MusicListResponseModel.MusicListResponse.class).setTarget(musicLoveListRequestParams.getAPI(), "1.0").withoutECode().withoutSession().toSingle().map($$Lambda$MaterialDataServer$RdQ_6PUI7DF4PIdPgujnX86saIc.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ MusicListResponseModel c(Response response) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MusicListResponseModel) ipChange.ipc$dispatch("4a63fea9", new Object[]{response}) : (MusicListResponseModel) response.data;
    }

    public ad<MusicItemBean> b(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ad) ipChange.ipc$dispatch("7951bfb", new Object[]{this, str, str2, new Integer(i)}) : a(str, str2, "", i);
    }

    public ad<MusicItemBean> a(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ad) ipChange.ipc$dispatch("b0d6f52", new Object[]{this, str, str2, str3, new Integer(i)});
        }
        MusicDetailRequestParams musicDetailRequestParams = new MusicDetailRequestParams();
        musicDetailRequestParams.id = str;
        musicDetailRequestParams.audioId = str2;
        musicDetailRequestParams.soundId = str3;
        musicDetailRequestParams.vendorType = i;
        a(musicDetailRequestParams);
        return new RequestBuilder(musicDetailRequestParams, MusicDetailResponse.class).setTarget(musicDetailRequestParams.getAPI(), "1.0").withoutECode().withoutSession().toSingle().map($$Lambda$MaterialDataServer$c7t5djC2i963DEEFyjGu1qHVPck.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ MusicItemBean b(Response response) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MusicItemBean) ipChange.ipc$dispatch("69242e6e", new Object[]{response}) : (MusicItemBean) response.data;
    }

    public void a(String str, String str2, String str3, int i, qbt<MusicResource> qbtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b444a18a", new Object[]{this, str, str2, str3, new Integer(i), qbtVar});
        } else {
            new c(str, str2, i, str3, this, qbtVar).a();
        }
    }

    public io.reactivex.a c(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (io.reactivex.a) ipChange.ipc$dispatch("d0c7518", new Object[]{this, str, str2, new Integer(i)});
        }
        MusicLoveRequestParams musicLoveRequestParams = new MusicLoveRequestParams();
        musicLoveRequestParams.id = str;
        musicLoveRequestParams.audioId = str2;
        musicLoveRequestParams.vendorType = i;
        a(musicLoveRequestParams);
        return new CompletbleRequestBuilder(musicLoveRequestParams).setTarget(musicLoveRequestParams.getAPI(), "1.0").withoutECode().withoutSession().toCompletable();
    }

    public io.reactivex.a d(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (io.reactivex.a) ipChange.ipc$dispatch("32a07e19", new Object[]{this, str, str2, new Integer(i)});
        }
        MusicUnLoveRequestParams musicUnLoveRequestParams = new MusicUnLoveRequestParams();
        musicUnLoveRequestParams.id = str;
        musicUnLoveRequestParams.audioId = str2;
        musicUnLoveRequestParams.vendorType = i;
        a(musicUnLoveRequestParams);
        return new CompletbleRequestBuilder(musicUnLoveRequestParams).setTarget(musicUnLoveRequestParams.getAPI(), "1.0").withoutECode().withoutSession().toCompletable();
    }

    public io.reactivex.a a(String str, String str2, int i, int i2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (io.reactivex.a) ipChange.ipc$dispatch("11371c97", new Object[]{this, str, str2, new Integer(i), new Integer(i2), str3});
        }
        MusicReportRequestParams musicReportRequestParams = new MusicReportRequestParams();
        musicReportRequestParams.id = str;
        musicReportRequestParams.audioId = str2;
        musicReportRequestParams.vendorType = i2;
        musicReportRequestParams.events = str3;
        musicReportRequestParams.fromType = i;
        a(musicReportRequestParams);
        return new CompletbleRequestBuilder(musicReportRequestParams).setTarget(musicReportRequestParams.getAPI(), "1.0").withoutECode().withoutSession().toCompletable();
    }

    public ad<MaiResResponseModel> a(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ad) ipChange.ipc$dispatch("e0015467", new Object[]{this, new Integer(i), new Integer(i2), str});
        }
        MaiResDetailParams maiResDetailParams = new MaiResDetailParams(i, i2, str);
        a(maiResDetailParams);
        return new RequestBuilder(maiResDetailParams, MaiResResponseModel.MaiResResponse.class).setTarget(maiResDetailParams.getAPI(), "1.0").withoutECode().withoutSession().toSingle().map($$Lambda$MaterialDataServer$AA4xX8GqklEpvU7ojFKpW0NCMlM.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ MaiResResponseModel a(Response response) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MaiResResponseModel) ipChange.ipc$dispatch("a148297f", new Object[]{response}) : (MaiResResponseModel) response.data;
    }
}
