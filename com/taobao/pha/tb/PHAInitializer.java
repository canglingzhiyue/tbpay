package com.taobao.pha.tb;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.taobao.windvane.extra.jsi.WVJsi;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.jsi.standard.JSEngine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.model.PageModel;
import com.taobao.pha.core.p;
import com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout;
import com.taobao.pha.core.tabcontainer.a;
import com.taobao.pha.tb.devtools.WVDevTools;
import com.taobao.pha.tb.jsbridge.TBPHAJSBridge;
import com.taobao.pha.webview.PHAWVUCWebView;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.mth;
import tb.nel;
import tb.nfc;
import tb.nfi;
import tb.nfz;
import tb.nga;
import tb.ngb;
import tb.ngf;
import tb.ngo;
import tb.ngq;
import tb.ngy;
import tb.nhp;
import tb.nhr;

/* loaded from: classes.dex */
public class PHAInitializer extends ngy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PHAInitializer";

    static {
        kge.a(-2048273375);
    }

    @Override // tb.ngy
    public a getDowngradeHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7c7c437e", new Object[]{this}) : new l();
    }

    @Override // tb.ngy
    public nga getPageViewFactory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nga) ipChange.ipc$dispatch("77c0dcf7", new Object[]{this}) : new nga() { // from class: com.taobao.pha.tb.PHAInitializer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nga
            public nfz a(AppController appController, PageModel pageModel, String str, Map<String, Object> map) {
                nfc s;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (nfz) ipChange2.ipc$dispatch("975c4c97", new Object[]{this, appController, pageModel, str, map});
                }
                if (str == null || (s = p.b().s()) == null) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", (Object) str);
                jSONObject.put("url", (Object) pageModel.getUrl());
                s.a(nfc.PHA_MONITOR_MODULE, nfc.PHA_MONITOR_MODULE_POINT_CREATE_RENDER, jSONObject);
                return null;
            }
        };
    }

    @Override // tb.ngy
    public com.taobao.pha.core.jsbridge.a getBridgeApiHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.pha.core.jsbridge.a) ipChange.ipc$dispatch("961dd714", new Object[]{this}) : new com.taobao.pha.tb.jsbridge.a();
    }

    @Override // tb.ngy
    public IPullRefreshLayout.a getPullRefreshLayoutFactory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPullRefreshLayout.a) ipChange.ipc$dispatch("cbe3652b", new Object[]{this}) : new IPullRefreshLayout.a() { // from class: com.taobao.pha.tb.PHAInitializer.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout.a
            public IPullRefreshLayout a(Context context, PageModel pageModel) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IPullRefreshLayout) ipChange2.ipc$dispatch("75d7c205", new Object[]{this, context, pageModel}) : new com.taobao.pha.tb.pullrefresh.a(context);
            }
        };
    }

    @Override // tb.ngy
    public nfi getSsrFilterHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nfi) ipChange.ipc$dispatch("9236f798", new Object[]{this}) : new nfi() { // from class: com.taobao.pha.tb.PHAInitializer.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nfi
            public boolean a(String str) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : mth.a(str);
            }
        };
    }

    @Override // tb.ngy
    public com.taobao.pha.core.j getLocaleHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.pha.core.j) ipChange.ipc$dispatch("8227cadf", new Object[]{this}) : new nhp();
    }

    @Override // tb.ngy
    public ngq getDataSourceProviderFactory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ngq) ipChange.ipc$dispatch("3c8a5e89", new Object[]{this}) : new ngq() { // from class: com.taobao.pha.tb.PHAInitializer.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ngq
            public ngo a(Uri uri, JSONObject jSONObject, JSONArray jSONArray) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (ngo) ipChange2.ipc$dispatch("fa210737", new Object[]{this, uri, jSONObject, jSONArray}) : new nhr(uri, jSONObject, jSONArray);
            }
        };
    }

    @Override // tb.ngy
    public ngb getPreRenderViewHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ngb) ipChange.ipc$dispatch("e86254b4", new Object[]{this}) : new ngb() { // from class: com.taobao.pha.tb.PHAInitializer.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ngb
            public ngf a(AppController appController, PageModel pageModel, String str, Map<String, String> map) {
                PHAWVUCWebView pHAWVUCWebView;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (ngf) ipChange2.ipc$dispatch("975c4dec", new Object[]{this, appController, pageModel, str, map});
                }
                String url = pageModel.getUrl();
                if (!StringUtils.isEmpty(url)) {
                    pHAWVUCWebView = n.a().a(appController.C(), url);
                    if (pHAWVUCWebView == null) {
                        pHAWVUCWebView = i.a().getPreRender(url, appController.C(), map);
                    }
                } else {
                    pHAWVUCWebView = null;
                }
                if (pHAWVUCWebView == null) {
                    return null;
                }
                appController.P().a(pHAWVUCWebView.mPageStart, pHAWVUCWebView.mPreloadStartLoad, pHAWVUCWebView.mPreloadPageFinishedLoad, url);
                return new com.taobao.pha.webview.c(pHAWVUCWebView);
            }
        };
    }

    @Override // tb.ngy
    public com.taobao.pha.core.h getConfigProvider() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.pha.core.h) ipChange.ipc$dispatch("aa70c250", new Object[]{this}) : new k();
    }

    @Override // tb.ngy
    public nel getJsiHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nel) ipChange.ipc$dispatch("8075364a", new Object[]{this}) : new nel() { // from class: com.taobao.pha.tb.PHAInitializer.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nel
            public JSEngine a(Context context, String str, String str2, String str3, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (JSEngine) ipChange2.ipc$dispatch("5a82956c", new Object[]{this, context, str, str2, str3, str4});
                }
                WVJsi.InstanceResult build = WVJsi.instanceBuilder(context).name(str).version(str2).flags(str3).dataDir(str4).build();
                if (build != null && build.isSuccess()) {
                    return build.getJsEngine();
                }
                return null;
            }
        };
    }

    @Override // tb.ngy
    public void afterSetup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ec2a08", new Object[]{this});
            return;
        }
        q.a("PHAJSBridge", (Class<? extends android.taobao.windvane.jsbridge.e>) TBPHAJSBridge.class);
        q.a("PHABridge", (Class<? extends android.taobao.windvane.jsbridge.e>) TBPHAJSBridge.class);
        q.a("WVDevTools", (Class<? extends android.taobao.windvane.jsbridge.e>) WVDevTools.class);
        Nav.registerPreprocessor(new g());
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else {
            new PHAInitializer().start(application, hashMap);
        }
    }
}
