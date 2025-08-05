package com.taobao.android.fluid.framework.preload.task;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.adapter.image.ImageAdapter;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.preload.cache.DetailCacheData;
import com.taobao.avplayer.bb;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.oec;
import tb.pil;
import tb.sjt;
import tb.sku;
import tb.skw;
import tb.slm;
import tb.snv;
import tb.soo;
import tb.soq;
import tb.sor;
import tb.sos;
import tb.sou;
import tb.sov;
import tb.spz;

/* loaded from: classes5.dex */
public abstract class a implements IPreloadTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f12642a;
    public Context b;
    public FluidContext c;
    public boolean d = false;
    private sor e;
    private JSONObject f;
    private boolean g;
    private int h;
    private final soo i;
    private Map<String, Object> j;

    static {
        kge.a(202683682);
        kge.a(1483474144);
    }

    public static /* synthetic */ void a(a aVar, DetailCacheData detailCacheData, JSONObject jSONObject, boolean z, boolean z2, Map map, Map map2, com.taobao.android.fluid.core.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95d502cb", new Object[]{aVar, detailCacheData, jSONObject, new Boolean(z), new Boolean(z2), map, map2, aVar2});
        } else {
            aVar.a(detailCacheData, jSONObject, z, z2, map, map2, aVar2);
        }
    }

    public a(FluidContext fluidContext, Context context, JSONObject jSONObject, soo sooVar) {
        this.h = 1;
        this.c = fluidContext;
        this.b = context;
        this.f = jSONObject;
        this.i = sooVar;
        if (jSONObject != null) {
            this.f12642a = jSONObject.getJSONObject("extraParams");
            this.h = oec.a(jSONObject.get("type"), 1);
        }
        spz.c("PickPreloadController_BasePreloadTask_PreloadVideoModule", "[preloadvideo] init PreloadTask, this=" + this + ",mPreloadABConfig=" + this.i);
    }

    @Override // com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public Map d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : this.j;
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        if (this.j == null) {
            this.j = new HashMap();
        }
        this.j.put(str, obj);
    }

    @Override // com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public final int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.h;
    }

    @Override // com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public void a(sor sorVar, com.taobao.android.fluid.core.a<sor> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b32b5b6", new Object[]{this, sorVar, aVar});
            return;
        }
        this.g = true;
        sor sorVar2 = this.e;
        if (sorVar == sorVar2) {
            if (sorVar2 != null) {
                sorVar2.c();
            }
            this.e = null;
        }
        spz.c("PickPreloadController_BasePreloadTask_PreloadVideoModule", "cancel preload Task:" + this);
        if (aVar == null) {
            return;
        }
        aVar.a(this.e);
    }

    @Override // com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        JSONObject jSONObject2 = this.f;
        if (jSONObject == jSONObject2) {
            return true;
        }
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.equals(jSONObject2);
    }

    @Override // com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public sor b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sor) ipChange.ipc$dispatch("16bc3fa7", new Object[]{this}) : this.e;
    }

    public void a(com.taobao.android.fluid.core.a<sor> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52c0ff90", new Object[]{this, aVar});
            return;
        }
        spz.c("PickPreloadController_BasePreloadTask_PreloadVideoModule", "preloadTask onFailed " + this);
        aVar.a(null);
    }

    public void a(final sor sorVar, Map map, String str, DetailCacheData detailCacheData, com.taobao.android.fluid.core.a<sor> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd9b9dbb", new Object[]{this, sorVar, map, str, detailCacheData, aVar});
            return;
        }
        spz.c("PickPreloadController_BasePreloadTask_PreloadVideoModule", "[preloadvideo]preloadTask onCompleted.  preloadedVideo: " + sorVar);
        if (this.g || sorVar == null) {
            return;
        }
        sorVar.i = this.f12642a;
        sorVar.j = str;
        String str2 = null;
        if (map != null) {
            try {
                JSONArray a2 = slm.a((JSONObject) map, "data", sku.a());
                sorVar.e = (a2 == null || a2.isEmpty()) ? null : a2.getJSONObject(0);
                sorVar.f = map;
                sorVar.h = (JSONObject) ((JSONObject) map).getJSONObject("data").get("config");
            } catch (Throwable th) {
                FluidException.throwException(this.c, com.taobao.android.fluid.core.b.COMPLETE_PARSE_VIDEO_RES_ERROR, th);
                spz.a("PickPreloadController_BasePreloadTask_PreloadVideoModule", th.getMessage(), th);
            }
        }
        if (this instanceof d) {
            sorVar.q = true;
        }
        if (this instanceof c) {
            sorVar.t = true;
            sorVar.r = true;
        }
        if (this.i.m) {
            if (map != null) {
                str2 = sku.d((JSONObject) map);
            }
            if (TextUtils.isEmpty(str2) && str != null) {
                str2 = sov.b(str);
            }
        }
        if (str2 != null) {
            a(this.b, str2, new ImageLoader.c() { // from class: com.taobao.android.fluid.framework.preload.task.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
                public void onImageLoadFailed() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3feabda6", new Object[]{this});
                    }
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
                public void onImageLoaded(BitmapDrawable bitmapDrawable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
                        return;
                    }
                    spz.c("PickPreloadController_BasePreloadTask_PreloadVideoModule", "onComplete下载首帧");
                    sorVar.n = bitmapDrawable;
                }
            });
        }
        sorVar.m = str2;
        try {
            if (sjt.y() && detailCacheData != null && detailCacheData.getMediaContentDetailData() != null) {
                sorVar.u = new com.taobao.android.fluid.framework.data.datamodel.a((MediaContentDetailData) JSON.toJavaObject(detailCacheData.getMediaContentDetailData(), MediaContentDetailData.class), detailCacheData.getMediaContentDetailJson());
            }
        } catch (Exception e) {
            spz.a("PickPreloadController_BasePreloadTask_PreloadVideoModule", "onComplete构建mediaSetData失败" + e.getMessage(), e);
        }
        if (sorVar.f33778a != null) {
            spz.c("PickPreloadController_BasePreloadTask_PreloadVideoModule", "watchDWInstanceRecycled: " + sorVar);
            sorVar.f33778a.a(new bb() { // from class: com.taobao.android.fluid.framework.preload.task.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.avplayer.bb
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    spz.c("PickPreloadController_BasePreloadTask_PreloadVideoModule", "onVideoRecycled: " + a.this);
                }
            });
        }
        this.e = sorVar;
        if (aVar == null) {
            return;
        }
        spz.c("PickPreloadController_BasePreloadTask_PreloadVideoModule", "[preloadvideo]execute back,preloadVideoData=" + this.e + " , this=" + this);
        aVar.a(this.e);
    }

    public void a(snv snvVar, String str, Map map, String str2, DetailCacheData detailCacheData, com.taobao.android.fluid.core.a<sor> aVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("458b61c0", new Object[]{this, snvVar, str, map, str2, detailCacheData, aVar});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[preloadvideo]onCompleteWithDWInstance. idwInstance != null ");
        if (snvVar == null) {
            z = false;
        }
        sb.append(z);
        sb.append("  videoId:");
        sb.append(str);
        sb.append(" mCanceled=");
        sb.append(this.g);
        spz.c("PickPreloadController_BasePreloadTask_PreloadVideoModule", sb.toString());
        if (!this.g) {
            a(new sor(snvVar, str), map, str2, detailCacheData, aVar);
            return;
        }
        spz.c("PickPreloadController_BasePreloadTask_PreloadVideoModule", "Task canceld:" + this);
    }

    private void a(final DetailCacheData detailCacheData, final JSONObject jSONObject, boolean z, final boolean z2, final Map map, final Map map2, final com.taobao.android.fluid.core.a<sor> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2a955e0", new Object[]{this, detailCacheData, jSONObject, new Boolean(z), new Boolean(z2), map, map2, aVar});
            return;
        }
        String b = sku.b(jSONObject);
        if (TextUtils.isEmpty(b) && detailCacheData != null) {
            b = detailCacheData.getVideoResourceStr();
        }
        final String str = b;
        spz.c("PickPreloadController_BasePreloadTask_PreloadVideoModule", "[preloadvideo]dealCacheOrDetailData,  preDownload=" + z + " ; cacheData=" + detailCacheData + " videoResourceStr=" + str);
        if (!TextUtils.isEmpty(str)) {
            if (z && soq.a(this.i.g)) {
                spz.c("PickPreloadController_BasePreloadTask_PreloadVideoModule", "[preloadvideo]PickPreloadControllerNew,start preDownload");
                pil.a(this.b, null, "gg_pickpreload_preDownload");
                sos.a(this.b, "guangguang_pick", this.i.c, str, new com.taobao.mediaplay.d() { // from class: com.taobao.android.fluid.framework.preload.task.BasePreloadTaskImpl$3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.mediaplay.d
                    public void a(String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                        }
                    }

                    @Override // com.taobao.mediaplay.d
                    public void b(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
                        }
                    }

                    @Override // com.taobao.mediaplay.d
                    public void a(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                            return;
                        }
                        spz.c("PickPreloadController_BasePreloadTask_PreloadVideoModule", "[preloadvideo]PickPreloadControllerNew,preDownload finish. downloadSize=" + i);
                        Map map3 = map;
                        if (map3 != null) {
                            map3.put("downloadSize", String.valueOf(i));
                        }
                        if (i > 0) {
                            pil.a(a.this.b, null, "gg_pickpreload_preDownload", map);
                        } else {
                            FluidException.throwException(a.this.c, com.taobao.android.fluid.core.b.PRELOAD_SERVICE_DOWNLOAD_VIDEO_ERROR);
                            pil.a(a.this.b, null, "gg_pickpreload_preDownload", "length<=0", map);
                        }
                        a.this.a(detailCacheData, jSONObject, z2, str, map2, map, aVar);
                    }
                });
                return;
            }
            a(detailCacheData, jSONObject, z2, str, map2, map, aVar);
            return;
        }
        a((snv) null, (String) null, jSONObject, str, detailCacheData, aVar);
    }

    public void a(DetailCacheData detailCacheData, JSONObject jSONObject, boolean z, String str, Map map, Map map2, com.taobao.android.fluid.core.a<sor> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd8e2872", new Object[]{this, detailCacheData, jSONObject, new Boolean(z), str, map, map2, aVar});
            return;
        }
        String c = sov.c(str);
        spz.c("PickPreloadController_BasePreloadTask_PreloadVideoModule", "[preloadvideo]useCreateDWInstance videoId=" + c + " createPlayer=" + z);
        Pair<snv, String> pair = new Pair<>(null, c);
        if (z) {
            pair = com.taobao.android.fluid.framework.preload.dwinstance.a.a(this.c, this.b, true, c, null, str, null, map, detailCacheData);
            if (pair.first == null) {
                FluidException.throwException(this.c, com.taobao.android.fluid.core.b.CREATE_DWINSTANCE_ERROR);
            }
        }
        a((snv) pair.first, (String) pair.second, jSONObject, str, detailCacheData, aVar);
    }

    public void a(final JSONObject jSONObject, int i, final Map map, final boolean z, final boolean z2, final com.taobao.android.fluid.core.a<sor> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afedf68e", new Object[]{this, jSONObject, new Integer(i), map, new Boolean(z), new Boolean(z2), aVar});
            return;
        }
        spz.c("PickPreloadController_BasePreloadTask_PreloadVideoModule", "[preloadvideo]fetchContentDetail requestRecommendDetail preloadWithDetail");
        pil.a(this.b, null, "gg_pickpreload_request_detail");
        a("status_request_detail", (Object) true);
        com.taobao.android.fluid.framework.data.remote.d.a(jSONObject, skw.FAKE_CONTENT_ID, false, true, i > 0 ? i : 15000, null, true, new IRemoteBaseListener() { // from class: com.taobao.android.fluid.framework.preload.task.BasePreloadTaskImpl$4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    return;
                }
                spz.c("PickPreloadController_BasePreloadTask_PreloadVideoModule", "[preloadvideo]fetchContentDetail requestRecommendDetail onSystemError");
                a.this.a(aVar);
                FluidException.throwException(a.this.c, com.taobao.android.fluid.core.b.PRELOAD_WITH_DETAIL_ERROR, mtopResponse.getRetCode());
                pil.a(a.this.b, null, "gg_pickpreload_request_detail", mtopResponse.getRetCode(), map);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                    return;
                }
                pil.a(a.this.b, null, "gg_pickpreload_request_detail", map);
                a.a(a.this, null, JSON.parseObject(new String(mtopResponse.getBytedata())), z, z2, map, jSONObject, aVar);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    return;
                }
                spz.c("PickPreloadController_BasePreloadTask_PreloadVideoModule", "[preloadvideo]requestRecommendDetail onError,code:" + mtopResponse.getRetCode());
                a.this.a(aVar);
                FluidException.throwException(a.this.c, com.taobao.android.fluid.core.b.PRELOAD_WITH_DETAIL_ERROR, mtopResponse.getRetCode());
                pil.a(a.this.b, null, "gg_pickpreload_request_detail", mtopResponse.getRetCode(), map);
            }
        });
    }

    public void a(DetailCacheData detailCacheData, Map map, boolean z, boolean z2, com.taobao.android.fluid.core.a<sor> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95c7ea8b", new Object[]{this, detailCacheData, map, new Boolean(z), new Boolean(z2), aVar});
            return;
        }
        boolean a2 = com.taobao.android.fluid.framework.preload.cache.b.a(detailCacheData);
        spz.c("PickPreloadController_BasePreloadTask_PreloadVideoModule", "[preloadvideo] detail cache valid ? " + a2);
        if (a2) {
            this.d = true;
            a(detailCacheData, detailCacheData.getDetailResponseData(), z, z2, map, (Map) null, aVar);
        } else if (!this.i.p) {
        } else {
            a((JSONObject) null, 15000, map, z, z2, aVar);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PreloadTask: {type=" + this.h + ", preloadArgs=" + this.f + '}';
    }

    private void a(Context context, String str, final ImageLoader.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bdef076", new Object[]{this, context, str, cVar});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            ImageLoader.a a2 = ImageLoader.a.a(0, ImageAdapter.IMAGE_QUALITY_Q90, "", "", com.taobao.tao.flexbox.layoutmanager.player.c.image_test_biz_name, 9103, ImageLoader.Scene.FIRST_FRAME);
            String a3 = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().i().a(str, 1200, 1200, a2);
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().i().a(new ImageLoader.b(null, context, a3, a3, 1200, 1200, a2, false), new ImageLoader.c() { // from class: com.taobao.android.fluid.framework.preload.task.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
                public void onImageLoaded(BitmapDrawable bitmapDrawable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
                    } else {
                        cVar.onImageLoaded(bitmapDrawable);
                    }
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
                public void onImageLoadFailed() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3feabda6", new Object[]{this});
                    } else {
                        cVar.onImageLoadFailed();
                    }
                }
            });
        }
    }

    public boolean a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue();
        }
        try {
            JSONObject jSONObject = ((JSONObject) map).getJSONObject("data").getJSONArray("sectionList").getJSONObject(0);
            return sou.a(new com.taobao.android.fluid.framework.data.datamodel.a(sku.g(jSONObject), jSONObject).a(), true);
        } catch (Throwable th) {
            spz.c("PickPreloadController_BasePreloadTask_PreloadVideoModule", "filerAD failed:" + th.getMessage());
            return false;
        }
    }
}
