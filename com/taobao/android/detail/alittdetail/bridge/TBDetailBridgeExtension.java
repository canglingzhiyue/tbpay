package com.taobao.android.detail.alittdetail.bridge;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.constant.a;
import tb.fgl;
import tb.kge;
import tb.odg;

/* loaded from: classes4.dex */
public class TBDetailBridgeExtension implements BridgeExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_ITEM_ID = "itemId";

    static {
        kge.a(705482108);
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

    @ActionFilter
    public void detailUpdateItem(@BindingParam(name = {"itemId"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d77afdfe", new Object[]{this, str, bridgeCallback});
        } else if (TextUtils.isEmpty(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else {
            Intent intent = new Intent();
            intent.putExtra(fgl.ORIGINALITEMID, str);
            intent.putExtra(fgl.TARGETITEMID, str);
            intent.putExtra("from", "appletBridge");
            intent.setAction(a.SKU_ACTION_UPDATE_DATA);
            intent.addCategory("android.intent.category.DEFAULT");
            LocalBroadcastManager.getInstance(odg.b().a()).sendBroadcast(intent);
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }
}
