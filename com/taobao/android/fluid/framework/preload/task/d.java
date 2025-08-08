package com.taobao.android.fluid.framework.preload.task;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.preload.cache.DetailCacheData;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.oec;
import tb.pil;
import tb.soo;
import tb.sor;
import tb.sov;
import tb.spz;

/* loaded from: classes5.dex */
public class d extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;

    static {
        kge.a(296534170);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2128160755:
                return super.toString();
            case -1959610954:
                super.a((sor) objArr[0], (com.taobao.android.fluid.core.a) objArr[1]);
                return null;
            case -1950985330:
                super.a((String) objArr[0], objArr[1]);
                return null;
            case 40303500:
                return new Boolean(super.a((JSONObject) objArr[0]));
            case 152292832:
                return super.d();
            case 381435815:
                return super.b();
            case 1972638560:
                return super.a();
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.task.a, com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.taobao.android.fluid.framework.preload.task.a
    public /* bridge */ /* synthetic */ void a(String str, Object obj) {
        super.a(str, obj);
    }

    @Override // com.taobao.android.fluid.framework.preload.task.a, com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public /* bridge */ /* synthetic */ void a(sor sorVar, com.taobao.android.fluid.core.a aVar) {
        super.a(sorVar, aVar);
    }

    @Override // com.taobao.android.fluid.framework.preload.task.a, com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public /* bridge */ /* synthetic */ boolean a(JSONObject jSONObject) {
        return super.a(jSONObject);
    }

    @Override // com.taobao.android.fluid.framework.preload.task.a, com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public /* bridge */ /* synthetic */ sor b() {
        return super.b();
    }

    @Override // com.taobao.android.fluid.framework.preload.task.a, com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public /* bridge */ /* synthetic */ Map d() {
        return super.d();
    }

    @Override // com.taobao.android.fluid.framework.preload.task.a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public d(FluidContext fluidContext, Context context, JSONObject jSONObject, soo sooVar) {
        super(fluidContext, context, jSONObject, sooVar);
        this.f = true;
        this.g = true;
        this.h = false;
        JSONObject jSONObject2 = jSONObject.getJSONObject("info");
        this.i = jSONObject.getIntValue("duration");
        if (jSONObject2 != null) {
            this.e = oec.a(jSONObject2.get("videoId"), (String) null);
            this.f = oec.a(jSONObject2.get("requestPlayControl"), true);
            this.g = oec.a(jSONObject2.get("createPlayer"), true);
            this.h = oec.a(jSONObject2.get("preDownload"), false);
        }
        spz.c("PickPreloadController_IconStreamPreloadTask_PreloadVideoModule", "IconStreamPreloadTask PickPreloadControllerNew, info=" + jSONObject2);
    }

    @Override // com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public void b(final com.taobao.android.fluid.core.a<sor> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4139c2f", new Object[]{this, aVar});
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(e()));
        hashMap.put("videoId", this.e);
        if (this.f12642a != null) {
            hashMap.put("extraParams", Uri.encode(this.f12642a.toJSONString()));
        }
        spz.c("PickPreloadController_IconStreamPreloadTask_PreloadVideoModule", "[preloadvideo]IconStreamPreloadTask execute. videoId=" + this.e + " requestPlayControl=" + this.f);
        if (!StringUtils.isEmpty(this.e) && this.f) {
            spz.c("PickPreloadController_IconStreamPreloadTask_PreloadVideoModule", "request PlayControl");
            pil.a(this.b, null, "gg_pickpreload_request_videoinfo");
            com.taobao.android.fluid.framework.data.remote.d.a(this.e, "videoFullScreen", "ggpick_preload", false, new IRemoteBaseListener() { // from class: com.taobao.android.fluid.framework.preload.task.IconStreamPreloadTask$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    spz.c("PickPreloadController_IconStreamPreloadTask_PreloadVideoModule", "requestCloudVideoInfo onSystemError");
                    d.this.a(aVar);
                    FluidException.throwException(d.this.c, com.taobao.android.fluid.core.b.ICON_STREAM_REQUEST_VIDEO_INFO_ERROR, mtopResponse.getRetCode());
                    pil.a(d.this.b, null, "gg_pickpreload_request_videoinfo", mtopResponse.getRetCode(), hashMap);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    spz.c("PickPreloadController_IconStreamPreloadTask_PreloadVideoModule", "[preloadvideo]PickPreloadControllerNew,requestCloudVideoInfo success");
                    pil.a(d.this.b, null, "gg_pickpreload_request_videoinfo", hashMap);
                    d.this.a((DetailCacheData) null, (JSONObject) null, d.$ipChange, sov.a(mtopResponse, (Pair<String, String>) null, true), d.this.f12642a, hashMap, aVar);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    spz.c("PickPreloadController_IconStreamPreloadTask_PreloadVideoModule", "requestCloudVideoInfo onError,code:" + mtopResponse.getRetCode());
                    d.this.a(aVar);
                    FluidException.throwException(d.this.c, com.taobao.android.fluid.core.b.ICON_STREAM_REQUEST_VIDEO_INFO_ERROR, mtopResponse.getRetCode());
                    pil.a(d.this.b, null, "gg_pickpreload_request_videoinfo", mtopResponse.getRetCode(), hashMap);
                }
            });
            return;
        }
        a(this.f12642a, this.i, hashMap, this.h, this.g, aVar);
    }
}
