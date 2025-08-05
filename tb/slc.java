package tb;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.RenderTrackUtils;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.IHttpNetAdapter;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.adapter.mtop.b;
import com.taobao.android.fluid.framework.adapter.mtop.c;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.data.remote.MediaMixContentDetailResponse;
import com.taobao.android.fluid.framework.data.remote.a;
import com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.layoutmanager.module.MtopModule;
import java.util.concurrent.Future;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.util.MtopStatistics;
import tb.lzc;
import tb.skv;
import tb.sla;

/* loaded from: classes5.dex */
public class slc implements sla {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DETAIL_CDN_PRE_URL = "https://fullscreen-detail.alicdn.com/";
    public static final String POINT_CDN_ERROR = "ggvideo_cdn_url_error";
    public static final String POINT_CDN_REQ = "ggvideo_cdn_url_req";
    public static final String POINT_CDN_RESP = "ggvideo_cdn_url_resp";

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33677a;
    private final skv b;
    private lzc.a c;

    static {
        kge.a(1383216721);
        kge.a(747573128);
    }

    public static /* synthetic */ lzc.a a(slc slcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lzc.a) ipChange.ipc$dispatch("49c6ac46", new Object[]{slcVar}) : slcVar.c;
    }

    public static /* synthetic */ void a(slc slcVar, String str, skv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82419ed", new Object[]{slcVar, str, aVar});
        } else {
            slcVar.a(str, aVar);
        }
    }

    public static /* synthetic */ boolean a(slc slcVar, JSONObject jSONObject, MediaMixContentDetailResponse mediaMixContentDetailResponse, skv.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("43155e44", new Object[]{slcVar, jSONObject, mediaMixContentDetailResponse, aVar})).booleanValue() : slcVar.a(jSONObject, mediaMixContentDetailResponse, aVar);
    }

    public static /* synthetic */ boolean a(slc slcVar, MtopResponse mtopResponse, long j, boolean z, skv.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f573c1fc", new Object[]{slcVar, mtopResponse, new Long(j), new Boolean(z), aVar})).booleanValue() : slcVar.a(mtopResponse, j, z, aVar);
    }

    public static /* synthetic */ boolean a(slc slcVar, MtopResponse mtopResponse, JSONObject jSONObject, MediaMixContentDetailResponse mediaMixContentDetailResponse, long j, boolean z, skv.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f85e80af", new Object[]{slcVar, mtopResponse, jSONObject, mediaMixContentDetailResponse, new Long(j), new Boolean(z), aVar})).booleanValue() : slcVar.a(mtopResponse, jSONObject, mediaMixContentDetailResponse, j, z, aVar);
    }

    public static /* synthetic */ skv b(slc slcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (skv) ipChange.ipc$dispatch("daef1259", new Object[]{slcVar}) : slcVar.b;
    }

    public static /* synthetic */ FluidContext c(slc slcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("ccec99d8", new Object[]{slcVar}) : slcVar.f33677a;
    }

    public slc(FluidContext fluidContext, skv skvVar) {
        this.f33677a = fluidContext;
        this.b = skvVar;
    }

    public static String a(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63b6da3c", new Object[]{fluidContext, str});
        }
        String a2 = a();
        return a2 + b(fluidContext, str);
    }

    private static String b(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abb6389b", new Object[]{fluidContext, str});
        }
        String str2 = str + "_" + FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("detailCdnToken", "");
        String b = slt.b(fluidContext);
        if (TextUtils.isEmpty(b)) {
            b = "";
        }
        return "fs_detail_" + b + oca.a(str2);
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("detailCDN", DETAIL_CDN_PRE_URL);
    }

    public void a(a.C0494a c0494a, final boolean z, final skv.a aVar) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2272223", new Object[]{this, c0494a, new Boolean(z), aVar});
        } else if (c0494a == null) {
        } else {
            JSONObject a2 = c0494a.a();
            if (ogv.a(a2)) {
                return;
            }
            sps sessionParams = ((ISceneConfigService) this.f33677a.getService(ISceneConfigService.class)).getSessionParams();
            final String d = c0494a.d();
            spz.c("MTopInterceptor", "fetchWithMtop, id:" + d + ",detailJson:" + a2.toJSONString() + " fallback2CDN:" + z);
            final long currentTimeMillis = System.currentTimeMillis();
            ((IDataService) this.f33677a.getService(IDataService.class)).setBeforeDetailMtopTime(currentTimeMillis);
            final boolean a3 = skk.a(this.f33677a);
            b<MediaMixContentDetailResponse> bVar = new b<MediaMixContentDetailResponse>() { // from class: tb.slc.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
                public void a(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                    } else if (!slc.a(slc.this, mtopResponse, currentTimeMillis, z, aVar)) {
                    } else {
                        String str = d;
                        if (skv.ERROR_CODE_I_008.equalsIgnoreCase(mtopResponse.getRetCode()) && !TextUtils.isEmpty(mtopResponse.getRetMsg())) {
                            str = mtopResponse.getRetMsg();
                        }
                        slc.a(slc.this, str, aVar);
                    }
                }

                @Override // com.taobao.android.fluid.framework.adapter.mtop.b
                public void a(MtopResponse mtopResponse, JSONObject jSONObject, MediaMixContentDetailResponse mediaMixContentDetailResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e08a2d2c", new Object[]{this, mtopResponse, jSONObject, mediaMixContentDetailResponse});
                    } else if (slc.a(slc.this, mtopResponse, jSONObject, mediaMixContentDetailResponse, currentTimeMillis, a3, aVar) || !z) {
                    } else {
                        slc.a(slc.this, d, aVar);
                    }
                }
            };
            com.taobao.android.fluid.framework.data.remote.base.a a4 = com.taobao.android.fluid.framework.data.remote.newmodel.a.a(this.f33677a, c0494a, sessionParams, false);
            IMTopAdapter.a<MediaMixContentDetailResponse> aVar2 = new IMTopAdapter.a<MediaMixContentDetailResponse>() { // from class: tb.slc.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v5, types: [mtopsdk.mtop.domain.BaseOutDo, com.taobao.android.fluid.framework.data.remote.MediaMixContentDetailResponse] */
                @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.a
                public /* synthetic */ MediaMixContentDetailResponse a(byte[] bArr, Class<MediaMixContentDetailResponse> cls) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (BaseOutDo) ipChange2.ipc$dispatch("954600f8", new Object[]{this, bArr, cls}) : b(bArr, cls);
                }

                public MediaMixContentDetailResponse b(byte[] bArr, Class<MediaMixContentDetailResponse> cls) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (MediaMixContentDetailResponse) ipChange2.ipc$dispatch("55fce272", new Object[]{this, bArr, cls});
                    }
                    if (!skk.f()) {
                        return slr.a(a3, bArr);
                    }
                    return null;
                }
            };
            IMTOPRequest b = a4.b();
            c.a a5 = c.a.a().a(b).a(a4.a()).a(bVar).a(aVar2);
            if (skk.a() == 2) {
                z2 = true;
            }
            c.a<MediaMixContentDetailResponse> a6 = a5.b(z2).a(MediaMixContentDetailResponse.class).a(new MtopModule.a() { // from class: tb.slc.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.layoutmanager.module.MtopModule.a
                public void a(MtopBuilder mtopBuilder) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("befc7114", new Object[]{this, mtopBuilder});
                    } else {
                        ljq.a(slc.a(slc.this), mtopBuilder);
                    }
                }
            }).a(new com.taobao.android.fluid.framework.data.remote.b());
            d.a(this.f33677a, "detail_mtop_start", b.getApi(), skk.a());
            RenderTrackUtils.a(this.f33677a, RenderTrackUtils.detailStart);
            a(a6);
        }
    }

    @Override // tb.sla
    public Future a(sla.a aVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("26a141e9", new Object[]{this, aVar});
        }
        this.c = ljq.c(this.f33677a);
        a.C0494a b = aVar.b();
        skv.a a2 = aVar.a();
        if (sjt.v()) {
            spz.c("MTopInterceptor", "竖版UI，不走cdn逻辑");
        } else {
            if (b.f() != null) {
                Object obj = b.f().get(a.KEY_NEED_REQUEST_CDN);
                if (obj instanceof Boolean) {
                    z = ((Boolean) obj).booleanValue();
                }
            }
            z = true;
        }
        a(b, z, a2);
        return null;
    }

    private Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail> a(JSONObject jSONObject, MediaMixContentDetailResponse mediaMixContentDetailResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("85db859b", new Object[]{this, jSONObject, mediaMixContentDetailResponse});
        }
        if (mediaMixContentDetailResponse == null || mediaMixContentDetailResponse.data == 0) {
            return null;
        }
        MediaMixContentDetail mediaMixContentDetail = (MediaMixContentDetail) mediaMixContentDetailResponse.data;
        MediaContentDetailData mediaContentDetailData = (MediaContentDetailData) slm.a(mediaMixContentDetail.list);
        JSONArray a2 = slm.a(jSONObject, "data", sku.a(this.f33677a));
        JSONObject jSONObject2 = (a2 == null || a2.isEmpty()) ? null : a2.getJSONObject(0);
        if (com.taobao.android.fluid.framework.data.datamodel.a.a(mediaContentDetailData) != -1 && jSONObject2 != null) {
            return new Pair<>(new com.taobao.android.fluid.framework.data.datamodel.a(mediaContentDetailData, jSONObject2), mediaMixContentDetail);
        }
        return null;
    }

    private void a(String str, final skv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48c81e7", new Object[]{this, str, aVar});
            return;
        }
        final String a2 = a(this.f33677a, str);
        spz.c("MTopInterceptor", "走CDN兜底，getDetailCdnData" + a2);
        final long currentTimeMillis = System.currentTimeMillis();
        d.b(this.f33677a, POINT_CDN_REQ, a2);
        final boolean a3 = skk.a(this.f33677a);
        FluidSDK.getHttpNetAdapter().send(new IHttpNetAdapter.c(a2), new IHttpNetAdapter.a<MediaMixContentDetailResponse>() { // from class: tb.slc.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.taobao.android.fluid.framework.data.remote.MediaMixContentDetailResponse] */
            @Override // com.taobao.android.fluid.framework.adapter.IHttpNetAdapter.a
            public /* synthetic */ MediaMixContentDetailResponse b(byte[] bArr, Class<MediaMixContentDetailResponse> cls) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e1e08805", new Object[]{this, bArr, cls}) : a(bArr, cls);
            }

            @Override // com.taobao.android.fluid.framework.adapter.IHttpNetAdapter.a
            public void a(int i, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str2});
                    return;
                }
                spz.c("MTopInterceptor", "getDetailCdnData onError httpCode=" + i);
                slc.b(slc.this).a(aVar, sls.a(String.valueOf(i), str2));
                com.taobao.android.fluid.business.usertrack.track.b.a(slc.c(slc.this), false, a2, "onError");
                d.a(slc.c(slc.this), slc.POINT_CDN_ERROR, a2, i, str2, System.currentTimeMillis() - currentTimeMillis);
            }

            @Override // com.taobao.android.fluid.framework.adapter.IHttpNetAdapter.a
            public void a(byte[] bArr, MediaMixContentDetailResponse mediaMixContentDetailResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8b6e38f8", new Object[]{this, bArr, mediaMixContentDetailResponse});
                    return;
                }
                JSONObject jSONObject = null;
                try {
                    jSONObject = JSON.parseObject(new String(bArr));
                } catch (Exception unused) {
                }
                if (jSONObject != null && mediaMixContentDetailResponse == null) {
                    mediaMixContentDetailResponse = slr.a(a3, jSONObject);
                }
                if (jSONObject == null || mediaMixContentDetailResponse.data == 0) {
                    a(-1, "data为空");
                    return;
                }
                boolean a4 = slc.a(slc.this, jSONObject, mediaMixContentDetailResponse, aVar);
                spz.c("MTopInterceptor", "getDetailCdnData成功");
                com.taobao.android.fluid.business.usertrack.track.b.a(slc.c(slc.this), a4, a2, "");
                d.a(slc.c(slc.this), slc.POINT_CDN_RESP, a2, System.currentTimeMillis() - currentTimeMillis);
            }

            public MediaMixContentDetailResponse a(byte[] bArr, Class<MediaMixContentDetailResponse> cls) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (MediaMixContentDetailResponse) ipChange2.ipc$dispatch("fcf196f1", new Object[]{this, bArr, cls});
                }
                if (!skk.f()) {
                    return slr.a(a3, bArr);
                }
                return null;
            }
        }, MediaMixContentDetailResponse.class);
    }

    private boolean a(JSONObject jSONObject, MediaMixContentDetailResponse mediaMixContentDetailResponse, skv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1624c08a", new Object[]{this, jSONObject, mediaMixContentDetailResponse, aVar})).booleanValue();
        }
        spz.a("MTopInterceptor", "handleContentDetail");
        Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail> a2 = a(jSONObject, mediaMixContentDetailResponse);
        if (a2 == null) {
            spz.a("MTopInterceptor", "handleContentDetail, mediaSetData为空");
            this.b.a(aVar, sls.a("media type not supported", (String) null));
            return false;
        }
        com.taobao.android.fluid.framework.data.datamodel.a aVar2 = (com.taobao.android.fluid.framework.data.datamodel.a) a2.first;
        MediaMixContentDetail mediaMixContentDetail = (MediaMixContentDetail) mediaMixContentDetailResponse.data;
        if (mediaMixContentDetail.transmission != null && !mediaMixContentDetail.transmission.isEmpty()) {
            ((IDataService) this.f33677a.getService(IDataService.class)).setTransmission(mediaMixContentDetail.transmission);
            ((IDataService) this.f33677a.getService(IDataService.class)).setTransmissionUp(mediaMixContentDetail.transmission);
        }
        String preCoverKey = this.f33677a.getInstanceConfig().getPreCoverKey();
        if (com.taobao.tao.flexbox.layoutmanager.player.b.a().m(preCoverKey)) {
            com.taobao.tao.flexbox.layoutmanager.player.c.a().a(mediaMixContentDetail.config);
        }
        a.c a3 = aVar2.a();
        if (a3 != null && a3.z() && a3.E() != null) {
            a.d E = a3.E();
            if (com.taobao.tao.flexbox.layoutmanager.player.b.a().i(preCoverKey) != null) {
                E.a(com.taobao.tao.flexbox.layoutmanager.player.b.a().i(preCoverKey));
            }
        }
        this.b.a(aVar, sls.a("", a2));
        spz.a("MTopInterceptor", "handleContentDetail， mediaSetData不为空");
        return true;
    }

    private void a(c.a<MediaMixContentDetailResponse> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9abbc617", new Object[]{this, aVar});
            return;
        }
        pil.a(this.b.a(), spj.j(this.f33677a), pio.GG_VIDEOTAB_MTOP_REQUEST);
        ((IDataService) this.f33677a.getService(IDataService.class)).setPreloadUseCacheValue("0");
        FluidSDK.getMTopAdapter().sendWithPrefetch(aVar.b());
    }

    private boolean a(MtopResponse mtopResponse, long j, boolean z, skv.a aVar) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed93df76", new Object[]{this, mtopResponse, new Long(j), new Boolean(z), aVar})).booleanValue();
        }
        spz.c("MTopInterceptor", "onDetailResponseFail，code=" + mtopResponse.getRetCode());
        String retCode = mtopResponse.getRetCode();
        if (skv.ERROR_CODE_I_007.equalsIgnoreCase(retCode) || sls.a(retCode)) {
            z2 = true;
        }
        pil.a(this.b.a(), spj.j(this.f33677a), pio.GG_VIDEOTAB_MTOP_REQUEST, mtopResponse.getRetCode(), d.e(this.f33677a, ""));
        boolean z3 = z & (!z2);
        if (!z3) {
            this.b.a(aVar, sls.a(retCode, mtopResponse.getRetMsg()));
        }
        d.b(this.f33677a, "detail_mtop_error", mtopResponse, System.currentTimeMillis() - j, skk.a());
        ljq.a(true, this.c, mtopResponse);
        return z3;
    }

    private boolean a(MtopResponse mtopResponse, JSONObject jSONObject, MediaMixContentDetailResponse mediaMixContentDetailResponse, long j, boolean z, skv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ec8b7f5", new Object[]{this, mtopResponse, jSONObject, mediaMixContentDetailResponse, new Long(j), new Boolean(z), aVar})).booleanValue();
        }
        boolean f = spj.f(this.f33677a);
        MediaMixContentDetailResponse a2 = (jSONObject == null || mediaMixContentDetailResponse != null) ? mediaMixContentDetailResponse : slr.a(z, jSONObject);
        MtopStatistics mtopStat = mtopResponse.getMtopStat();
        if (f) {
            d.a(this.f33677a, true, mtopStat.isPrefetch);
            ((IDataService) this.f33677a.getService(IDataService.class)).setTab3LauncherHitMtopPrefetch(mtopStat.isPrefetch);
        }
        spz.a("MTopInterceptor", "onDetailResponseSuccess, 使用预请求命中缓存，" + mtopStat.isPrefetch + ",isFromLauncher:" + f);
        pil.a(this.b.a(), spj.j(this.f33677a), pio.GG_VIDEOTAB_MTOP_REQUEST, d.e(this.f33677a, ""));
        long currentTimeMillis = System.currentTimeMillis() - j;
        d.a(this.f33677a, "detail_mtop_end", mtopResponse, currentTimeMillis, skk.a());
        ljq.a(false, this.c, mtopResponse);
        RenderTrackUtils.a(this.f33677a, RenderTrackUtils.detailEnd);
        ((IDataService) this.f33677a.getService(IDataService.class)).setDetailMtopSuccessTIme(System.currentTimeMillis());
        ((IDataService) this.f33677a.getService(IDataService.class)).setDetailMtopCost(currentTimeMillis);
        if (jSONObject == null || a2 == null || a2.data == 0) {
            spz.a("MTopInterceptor", "onDetailResponseSuccess, 数据为空");
            return false;
        }
        return a(jSONObject, a2, aVar);
    }
}
