package com.taobao.message.chatv2.viewcenter;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.message.chatv2.viewcenter.config.LayoutInfo;
import com.taobao.message.lab.comfrm.render.WidgetInterface;
import com.taobao.message.lab.comfrm.support.IInstancePreLoad;
import com.taobao.message.lab.comfrm.support.dinamic.DXAsyncCacheManager;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class MessageFlowPreLoad implements IInstancePreLoad {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MessageFlowPreLoad";
    private boolean isLoad;

    static {
        kge.a(1821028713);
        kge.a(952206109);
    }

    @Override // com.taobao.message.lab.comfrm.support.IInstancePreLoad
    public void preload(Context context, final Object obj, DinamicXEngine dinamicXEngine, String str, Map<String, Object> map) {
        final JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300c4856", new Object[]{this, context, obj, dinamicXEngine, str, map});
        } else if (!ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "msgDxInstancePreRender") || !StringUtils.equals(str, "messageFlow") || map == null || !(obj instanceof IViewCenterService) || (jSONArray = (JSONArray) map.get("messageViewObjects")) == null || jSONArray.size() == 0) {
        } else {
            if (this.isLoad) {
                TLog.loge(TAG, "preloading");
                return;
            }
            TraceUtil.asyncTraceBegin("MessageFlowPreLoad-instance", 110078);
            this.isLoad = true;
            DXAsyncCacheManager.post(new Runnable() { // from class: com.taobao.message.chatv2.viewcenter.MessageFlowPreLoad.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    WidgetInterface<?> createView;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TemplateInfoServiceImpl templateInfoServiceImpl = new TemplateInfoServiceImpl();
                    for (int size = jSONArray.size() - 1; size >= 0; size--) {
                        JSONObject jSONObject = jSONArray.getJSONObject(size).getJSONObject("data");
                        String string = jSONObject.getString("reuseId");
                        String string2 = jSONObject.getString("VC_UNI_ID");
                        int parseInt = Integer.parseInt(string);
                        LayoutInfo layoutInfo = templateInfoServiceImpl.getLayoutInfo(parseInt, null);
                        if (layoutInfo == null) {
                            parseInt = jSONObject.getJSONObject("message").getInteger("msgType").intValue();
                            layoutInfo = templateInfoServiceImpl.getLayoutInfo(parseInt, null);
                        }
                        if (layoutInfo != null && (createView = ((IViewCenterService) obj).createView(parseInt)) != null) {
                            TLog.loge(MessageFlowPreLoad.TAG, "preload addItemCache  uuid " + string + " " + string2 + " ");
                            ViewCenterPreloadCache.addItemCache(string2, createView);
                            ((IViewCenterService) obj).renderView(createView, jSONObject);
                        }
                    }
                    TraceUtil.asyncTraceEnd("MessageFlowPreLoad-instance", 110078);
                }
            });
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        ViewCenterPreloadCache.clear();
        this.isLoad = false;
    }
}
