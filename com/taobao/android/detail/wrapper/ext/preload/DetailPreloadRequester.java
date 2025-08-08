package com.taobao.android.detail.wrapper.ext.preload;

import android.content.res.Resources;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.accs.common.Constants;
import com.taobao.android.detail.core.performance.preload.core.task.PreloadTaskEntity;
import com.taobao.android.detail.core.performance.preload.core.task.c;
import com.taobao.android.detail.core.performance.preload.core.task.f;
import com.taobao.android.detail.core.performance.preload.j;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.trade.boost.annotations.MtopParams;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bax;
import tb.bgc;
import tb.eaz;
import tb.ecg;
import tb.ecu;
import tb.eip;
import tb.eiu;
import tb.emu;
import tb.epo;
import tb.epv;
import tb.fgq;
import tb.iyx;
import tb.jqm;
import tb.kge;
import tb.nfc;

/* loaded from: classes5.dex */
public class DetailPreloadRequester implements eiu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_DETAIL = "page_detail";

    static {
        kge.a(-742931585);
        kge.a(608619289);
    }

    public DetailPreloadRequester() {
        emu.a("com.taobao.android.detail.wrapper.ext.preload.DetailPreloadRequester");
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        j a2 = j.a();
        if (a2.e("page_detail") != null) {
            return;
        }
        a2.a("page_detail", new DetailPreloadRequester());
    }

    @Override // tb.eiu
    public void a(PreloadTaskEntity preloadTaskEntity, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba731ab7", new Object[]{this, preloadTaskEntity, fVar});
            return;
        }
        ArrayList<PreloadTaskEntity.a> arrayList = preloadTaskEntity.items;
        if (arrayList == null || arrayList.isEmpty()) {
            fVar.a(preloadTaskEntity, (Exception) null);
            return;
        }
        HashMap hashMap = new HashMap();
        Iterator<PreloadTaskEntity.a> it = arrayList.iterator();
        while (it.hasNext()) {
            PreloadTaskEntity.a next = it.next();
            Map map = next.c;
            if (map == null) {
                map = new HashMap();
            }
            if (StringUtils.isEmpty((CharSequence) map.get("from"))) {
                map.put("from", StringUtils.isEmpty(preloadTaskEntity.sourceFrom) ? com.taobao.android.detail.ttdetail.constant.a.UN_KNOW : preloadTaskEntity.sourceFrom);
            }
            if (!StringUtils.isEmpty(preloadTaskEntity.preloadType)) {
                map.put(nfc.PHA_MONITOR_DIMENSION_PRELOAD_TYPE, preloadTaskEntity.preloadType);
            }
            if (!StringUtils.isEmpty(preloadTaskEntity.bizName)) {
                map.put("bizName", preloadTaskEntity.bizName);
            }
            hashMap.put(next.e, JSONObject.toJSONString(map));
        }
        a(fVar, preloadTaskEntity, new DetailPreloadRequestParams(hashMap, b()), epo.f()).startRequest();
        String a2 = c.a(preloadTaskEntity);
        String b = c.b(preloadTaskEntity);
        String c = c.c(preloadTaskEntity);
        ecg.a(c, b, a2, com.taobao.android.detail.core.performance.preload.b.a(a2));
        if (preloadTaskEntity == null || !preloadTaskEntity.isNavPreload()) {
            return;
        }
        ecg.a(c, a2);
    }

    private Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("container_type", eaz.DINAMIC_MODULE_NAME);
        if (ecu.p && ecu.q) {
            hashMap.put("ultron2", "true");
            if (ecu.r) {
                hashMap.put("dinamic_v3", "true");
            }
        }
        if (jqm.a()) {
            hashMap.put(Constants.SP_KEY_DEBUG_MODE, "true");
        }
        if (epv.g) {
            hashMap.put("supportV7", "true");
        }
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Build.MODEL);
        hashMap.put("osVersion", Build.VERSION.SDK_INT + "");
        hashMap.put("soVersion", "2.0");
        hashMap.put("appReqFrom", "detail");
        hashMap.put("spm-cnt", "a2141.7631564");
        hashMap.put("finalUltron", "true");
        hashMap.put("deviceLevel", c());
        try {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            hashMap.put(d.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, displayMetrics.widthPixels + "");
            hashMap.put("screenHeight", displayMetrics.heightPixels + "");
        } catch (Exception e) {
            i.a("DetailPreloadRequester", "获取宽高参数失败", e);
        }
        iyx.a(hashMap);
        hashMap.put("supportIndustryMainPic", String.valueOf(com.taobao.android.detail.core.aura.utils.f.i()));
        return hashMap;
    }

    private String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        bax.a a2 = bax.a();
        return a2.f25741a == 3 ? "high" : a2.f25741a == 2 ? "medium" : "low";
    }

    private RemoteBusiness a(f fVar, PreloadTaskEntity preloadTaskEntity, DetailPreloadRequestParams detailPreloadRequestParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteBusiness) ipChange.ipc$dispatch("e9d8bb3e", new Object[]{this, fVar, preloadTaskEntity, detailPreloadRequestParams, str});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setData(JSONObject.toJSONString(detailPreloadRequestParams.toMap()));
        mtopRequest.setApiName("mtop.taobao.detail.batchgetdetail");
        mtopRequest.setVersion("1.0");
        RemoteBusiness build = RemoteBusiness.build(mtopRequest, str);
        build.registeListener((IRemoteListener) new MtopCallback(preloadTaskEntity, fVar));
        build.mo1328setUnitStrategy(MtopParams.UnitStrategy.UNIT_TRADE.toString());
        build.mo1305reqMethod(MethodEnum.POST);
        if (eip.K) {
            build.mo1330supportStreamJson(true);
            i.c(com.taobao.android.detail.core.performance.d.a("DetailPreloadRequester"), "预加载接口使用流式解析");
        }
        fgq.a().b();
        build.mo1296handler(fgq.a().c());
        return build;
    }

    /* loaded from: classes5.dex */
    public class MtopCallback implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private PreloadTaskEntity preloadTaskEntity;
        private f taskCallback;

        static {
            kge.a(1092610898);
            kge.a(-525336021);
        }

        public MtopCallback(PreloadTaskEntity preloadTaskEntity, f fVar) {
            this.preloadTaskEntity = preloadTaskEntity;
            this.taskCallback = fVar;
        }

        private boolean callSuccessListener(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f7c3cf69", new Object[]{this, mtopResponse})).booleanValue();
            }
            if (this.taskCallback == null) {
                return false;
            }
            if (mtopResponse == null || mtopResponse.getBytedata() == null) {
                this.taskCallback.a(this.preloadTaskEntity, (Exception) null);
            } else {
                this.taskCallback.a(this.preloadTaskEntity, (PreloadTaskEntity) mtopResponse);
            }
            return true;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else {
                callSuccessListener(mtopResponse);
            }
        }

        private boolean callFailureListener() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("197c1aab", new Object[]{this})).booleanValue();
            }
            f fVar = this.taskCallback;
            if (fVar == null) {
                return false;
            }
            fVar.a(this.preloadTaskEntity, (Exception) null);
            return true;
        }

        private void reportMtopError(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d775bd8", new Object[]{this, mtopResponse});
            } else {
                bgc.a("detail", mtopResponse);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            callFailureListener();
            reportMtopError(mtopResponse);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            callFailureListener();
            reportMtopError(mtopResponse);
        }
    }
}
