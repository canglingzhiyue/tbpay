package com.taobao.android.detail.ttdetail.request.callback;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.detail.ttdetail.request.params.PreloadRequestParams;
import com.taobao.android.detail.ttdetail.request.preload.a;
import com.taobao.android.detail.ttdetail.request.preload.b;
import com.taobao.android.detail.ttdetail.request.preload.c;
import com.taobao.android.detail.ttdetail.request.preload.h;
import com.taobao.android.detail.ttdetail.utils.ae;
import com.taobao.android.detail.ttdetail.utils.av;
import com.taobao.android.detail.ttdetail.utils.aw;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.soa;

/* loaded from: classes5.dex */
public class PreloadRequestCallback implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SERVER_RT = "s-rt";
    private static final String TAG = "PreloadRequestCallback";
    private PreloadRequestParams mParams;
    private a mTaskCallback;

    static {
        kge.a(672927970);
        kge.a(-525336021);
    }

    public PreloadRequestCallback(PreloadRequestParams preloadRequestParams) {
        this.mParams = preloadRequestParams;
    }

    public void setTaskCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5586107a", new Object[]{this, aVar});
        } else {
            this.mTaskCallback = aVar;
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean isNavPreload = this.mParams.isNavPreload();
        i.a(TAG, "预加载请求成功回调，isNavPreload=" + isNavPreload + ", currentThread=" + Thread.currentThread().getName());
        h.a().a(mtopResponse, this.mParams.getItemList());
        String detailToken = this.mParams.getDetailToken();
        if (isNavPreload) {
            av.c(detailToken, "preResponse", currentTimeMillis);
            av.c(detailToken, "preParse", currentTimeMillis);
            av.c(detailToken, "preParseEnd", System.currentTimeMillis());
            Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
            if (headerFields != null && headerFields.containsKey("s-rt")) {
                String str = headerFields.get("s-rt").get(0);
                if (!TextUtils.isEmpty(str)) {
                    av.a(detailToken, "preSRT", Long.valueOf(str).longValue());
                }
            }
        }
        a aVar = this.mTaskCallback;
        if (aVar != null) {
            aVar.onFinish();
        }
        com.taobao.android.detail.ttdetail.request.a aVar2 = new com.taobao.android.detail.ttdetail.request.a(detailToken);
        if (!aVar2.d() || !isNavPreload) {
            return;
        }
        c cVar = this.mParams.getItemList().get(0);
        String str2 = cVar != null ? cVar.b : "";
        b b = h.a().b(str2);
        if (b == null || (a2 = b.a()) == null) {
            return;
        }
        mtopResponse.setOriginFastJsonObject(a2);
        MtopInfo mtopInfo = new MtopInfo();
        mtopInfo.a(mtopResponse);
        mtopInfo.a(2);
        soa a3 = aVar2.a();
        if (a3 == null) {
            return;
        }
        i.a(TAG, "预加载数据直接回调");
        a3.a(mtopInfo, i, baseOutDo, obj);
        aw.a(str2, b.b(), b.c());
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        a aVar = this.mTaskCallback;
        if (aVar != null) {
            aVar.onFinish();
        }
        monitorError();
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        a aVar = this.mTaskCallback;
        if (aVar != null) {
            aVar.onFinish();
        }
        monitorError();
    }

    private void monitorError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a9da55", new Object[]{this});
        } else if (!this.mParams.isNavPreload()) {
        } else {
            HashMap hashMap = new HashMap();
            c cVar = this.mParams.getItemList().get(0);
            hashMap.put("itemId", cVar != null ? cVar.b : "");
            ae.a(hashMap, -200002, "预加载请求回调失败");
        }
    }
}
