package com.taobao.alimama;

import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes4.dex */
public class AlimamaMiniAppBridgeExtension implements BridgeExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-912269962);
        kge.a(1806634212);
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.security.Guard
    public Permission permit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Permission) ipChange.ipc$dispatch("edbd77f9", new Object[]{this});
        }
        return null;
    }

    @ThreadType(ExecutorType.SYNC)
    @ActionFilter
    public void commitIfsEvent(@BindingParam(name = {"ifs"}) String str, @BindingParam(name = {"namespace"}) String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5686b6", new Object[]{this, str, str2});
        } else {
            AlimamaAdvertising.instance().buildIfsExposure(Global.getApplication(), str).withArgNamespace(str2).commit();
        }
    }

    @ThreadType(ExecutorType.SYNC)
    @ActionFilter
    @AutoCallback
    public JSONObject genClickIdBy(@BindingParam(name = {"clickUrl"}) String str, @BindingParam(name = {"isOpenPage"}) boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bd5acb39", new Object[]{this, str, new Boolean(z)});
        }
        String handleAdUrlForClickid = AlimamaAdvertising.instance().handleAdUrlForClickid(str, z);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("clickid", (Object) handleAdUrlForClickid);
        return jSONObject;
    }

    @ThreadType(ExecutorType.SYNC)
    @ActionFilter
    public void commitTaokeInfo(@BindingParam(name = {"url"}) String str, @BindingParam(name = {"sellerId"}) String str2, @BindingParam(name = {"itemId"}) String str3, @BindingParam(name = {"isTmall"}) boolean z, @BindingParam(name = {"extMap"}) String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b94b66", new Object[]{this, str, str2, str3, new Boolean(z), str4});
            return;
        }
        JSONObject parseObject = JSONObject.parseObject(str4);
        HashMap hashMap = null;
        if (parseObject != null) {
            hashMap = new HashMap();
            for (String str5 : parseObject.keySet()) {
                hashMap.put(str5, parseObject.getString(str5));
            }
        }
        AlimamaAdvertising.instance().commitTaokeInfo(str, str2, str3, z, hashMap);
    }

    @ThreadType(ExecutorType.SYNC)
    @ActionFilter
    public void uploadUDTrack(@BindingParam(name = {"url"}) String str, @BindingParam(name = {"sellerId"}) String str2, @BindingParam(name = {"itemId"}) String str3, @BindingParam(name = {"isTmall"}) boolean z, @BindingParam(name = {"extMap"}) String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f25d2d5e", new Object[]{this, str, str2, str3, new Boolean(z), str4});
            return;
        }
        JSONObject parseObject = JSONObject.parseObject(str4);
        HashMap hashMap = null;
        if (parseObject != null) {
            hashMap = new HashMap();
            for (String str5 : parseObject.keySet()) {
                hashMap.put(str5, parseObject.getString(str5));
            }
        }
        AlimamaAdvertising.instance().uploadUDTrack(str, str2, str3, z, hashMap);
    }
}
