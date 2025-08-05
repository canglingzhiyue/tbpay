package com.taobao.android.fluid.framework.deprecated.message.module.proxy;

import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.common.view.DWPenetrateFrameLayout;
import com.taobao.android.fluid.framework.card.cards.web.a;
import com.taobao.android.fluid.framework.data.datamodel.RectData;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;
import tb.kge;
import tb.slv;
import tb.sma;
import tb.snf;
import tb.spy;
import tb.spz;

/* loaded from: classes5.dex */
public class ShortVideoJsBridgeProxy implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ShortVideoJsBridgeProxy";
    private static final Type mRectDataType;

    static {
        kge.a(2104682676);
        kge.a(1028243835);
        mRectDataType = new TypeReference<List<RectData>>() { // from class: com.taobao.android.fluid.framework.deprecated.message.module.proxy.ShortVideoJsBridgeProxy.1
        }.getType();
    }

    public ShortVideoJsBridgeProxy() {
        spz.c(TAG, "新架构初始化 ShortVideoJsBridgeProxy");
    }

    public boolean sendMessage(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46fe07f1", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (wVCallBackContext != null) {
            IWVWebView webview = wVCallBackContext.getWebview();
            if (webview instanceof WVUCWebView) {
                Object tag = ((WVUCWebView) webview).getTag();
                if (tag instanceof sma) {
                    spy spyVar = new spy(JSON.parseObject(str), new slv(wVCallBackContext));
                    ((sma) tag).sendMessage(spyVar);
                    spz.c(TAG, "新架构 Web 页面发送消息：" + spyVar);
                }
            }
        }
        return true;
    }

    public boolean postMessage(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fb451d9", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        IWVWebView webview = wVCallBackContext.getWebview();
        if (webview instanceof WVUCWebView) {
            Object tag = ((WVUCWebView) webview).getTag();
            if (tag instanceof a) {
                JSONObject parseObject = JSON.parseObject(str);
                slv slvVar = null;
                if (wVCallBackContext != null) {
                    slvVar = new slv(wVCallBackContext);
                }
                spy spyVar = new spy(parseObject, slvVar);
                ((a) tag).a(spyVar);
                spz.c(TAG, "新架构游戏卡 Web 页面发送消息：" + spyVar);
            }
        }
        return true;
    }

    public boolean parseTrusteeshipTouchRectData(String str, WVCallBackContext wVCallBackContext) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dba5935e", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        IWVWebView webview = wVCallBackContext.getWebview();
        if (webview instanceof WVUCWebView) {
            WVUCWebView wVUCWebView = (WVUCWebView) webview;
            if ((wVUCWebView.getParent() instanceof DWPenetrateFrameLayout) && !TextUtils.isEmpty(str) && snf.c()) {
                DWPenetrateFrameLayout dWPenetrateFrameLayout = (DWPenetrateFrameLayout) wVUCWebView.getParent();
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject != null && (jSONArray = parseObject.getJSONArray("rects")) != null) {
                    List<RectData> list = (List) JSON.parseObject(jSONArray.toJSONString(), mRectDataType, new Feature[0]);
                    StringBuilder sb = new StringBuilder();
                    sb.append("parse rect data, rectListData: ");
                    sb.append(list != null ? list.toString() : null);
                    spz.a(TAG, sb.toString());
                    dWPenetrateFrameLayout.setChildTrusteeshipTouchRect(list);
                    z = true;
                }
                spz.c(TAG, "新架构 Web 页面解析托管区域数据：" + str);
            }
        }
        return z;
    }
}
