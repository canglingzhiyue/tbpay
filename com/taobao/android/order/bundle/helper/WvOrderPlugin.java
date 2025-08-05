package com.taobao.android.order.bundle.helper;

import android.app.Activity;
import android.content.Intent;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.base.TBOrderBaseActivity;
import com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.hxc;
import tb.hyl;
import tb.ibm;
import tb.kge;

/* loaded from: classes6.dex */
public class WvOrderPlugin extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_OPEN_NOTIFICATION_SETTING = "openNotificationSetting";
    private static final String ACTION_POST_MESSAGE = "postMessage";
    private static com.taobao.android.order.core.g mOrderCoreEngine;
    private final HashMap<String, Class<? extends hxc>> mPluginActionClazz = new HashMap<>();
    private final HashMap<String, hxc> mPluginAction = new HashMap<>();

    static {
        kge.a(776690362);
    }

    public static /* synthetic */ Object ipc$super(WvOrderPlugin wvOrderPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public WvOrderPlugin() {
        this.mPluginActionClazz.put(com.taobao.android.order.bundle.helper.orderplugin.impl.a.KEY_ACTION, com.taobao.android.order.bundle.helper.orderplugin.impl.a.class);
    }

    private hxc getPluginAction(String str) {
        hxc hxcVar;
        if (str == null) {
            return null;
        }
        hxc hxcVar2 = this.mPluginAction.get(str);
        if (hxcVar2 != null) {
            return hxcVar2;
        }
        Class<? extends hxc> cls = this.mPluginActionClazz.get(str);
        if (cls == null) {
            return null;
        }
        try {
            hxcVar = cls.newInstance();
            try {
                this.mPluginAction.put(str, hxcVar);
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
                return hxcVar;
            }
        } catch (Exception e2) {
            e = e2;
            hxcVar = hxcVar2;
        }
        return hxcVar;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        hxc pluginAction = getPluginAction(str);
        if (pluginAction != null && pluginAction.a(this.mContext, this.mWebView, str2, wVCallBackContext)) {
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
            return true;
        } else if (ACTION_OPEN_NOTIFICATION_SETTING.equals(str)) {
            JSONObject jSONObject = null;
            try {
                jSONObject = JSONObject.parseObject(str2);
                if ("true".equals(jSONObject.get("isSycnMtb"))) {
                    sendSyncMtbMtop();
                }
            } catch (Exception unused) {
            }
            Intent d = ibm.d(this.mContext);
            if (this.mContext instanceof TBOrderBaseActivity) {
                ((Activity) this.mContext).startActivityForResult(d, 1001);
                ParallelBizValueHelper.PageType w = ((TBOrderBaseActivity) this.mContext).w();
                com.taobao.android.order.bundle.base.parallelbiz.a.a(w, w + "_Click_Open_Notification_Setting", jSONObject);
            } else {
                this.mContext.startActivity(d);
            }
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
            return true;
        } else if (!ACTION_POST_MESSAGE.equals(str)) {
            return false;
        } else {
            if (mOrderCoreEngine != null) {
                JSONObject a2 = hyl.a(str2);
                if (a2 == null) {
                    return false;
                }
                mOrderCoreEngine.a(a2.getString("action"), a2.getJSONObject("params"));
            }
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
            return true;
        }
    }

    private void sendSyncMtbMtop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("480244c7", new Object[]{this});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("virtualCategory", (Object) "market");
        jSONObject.put("openReject", (Object) "true");
        jSONObject.put("recallScene", (Object) "logistics_recall");
        JSONArray jSONArray = new JSONArray();
        jSONArray.add("logistics");
        jSONObject.put("openPushSceneCodes", (Object) jSONArray.toJSONString());
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.add("notLogistics");
        jSONObject.put("closePushSceneCodes", (Object) jSONArray2.toJSONString());
        mtopRequest.setData(jSONObject.toJSONString());
        mtopRequest.setApiName("mtop.taobao.alimp.bentley.pushrecall.set");
        mtopRequest.setVersion("1.0");
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.mo1305reqMethod(MethodEnum.GET);
        mtopRequest.setNeedEcode(true);
        build.mo1337addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.android.order.bundle.helper.WvOrderPlugin.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                }
            }
        });
        build.startRequest();
    }

    public static void setOrderEngine(com.taobao.android.order.core.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d1161", new Object[]{gVar});
        } else {
            mOrderCoreEngine = gVar;
        }
    }

    public static void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[0]);
        } else {
            mOrderCoreEngine = null;
        }
    }
}
