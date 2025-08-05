package com.taobao.themis.widget.group;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexMethod;
import com.taobao.android.weex.WeexModule;
import com.taobao.android.weex.i;
import com.taobao.themis.kernel.basic.TMSLogger;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001c\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/taobao/themis/widget/group/WidgetBridgeModule;", "Lcom/taobao/android/weex/WeexModule;", "()V", "mEmbedManager", "Lcom/taobao/themis/widget/kernal/TMSWidgetEngine;", "appear", "", "params", "Lcom/alibaba/fastjson/JSONObject;", "disappear", "onInit", AliFestivalWVPlugin.PARAMS_MODULE_NAME, "", "api", "Lcom/taobao/android/weex/WeexModuleInterface;", "onJSThreadDestroy", "onMainThreadDestroy", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class WidgetBridgeModule implements WeexModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.taobao.themis.widget.kernal.b mEmbedManager;

    static {
        kge.a(-1217823490);
        kge.a(396540296);
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onJSThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d6488f", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onInit(String str, i iVar) {
        WeexInstance a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6799e073", new Object[]{this, str, iVar});
            return;
        }
        com.taobao.themis.widget.kernal.b bVar = null;
        Object tag = (iVar == null || (a2 = iVar.a()) == null) ? null : a2.getTag("tmsEmbedManager");
        if (tag instanceof com.taobao.themis.widget.kernal.b) {
            bVar = tag;
        }
        this.mEmbedManager = bVar;
    }

    @WeexMethod
    public final void appear(JSONObject jSONObject) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1361ed4", new Object[]{this, jSONObject});
        } else if (jSONObject == null || (string = jSONObject.getString("viewId")) == null) {
        } else {
            TMSLogger.a("TMSWidget", "appear viewId:" + string);
            com.taobao.themis.widget.kernal.b bVar = this.mEmbedManager;
            if (bVar == null) {
                return;
            }
            bVar.a(string);
        }
    }

    @WeexMethod
    public final void disappear(JSONObject jSONObject) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("100c8d86", new Object[]{this, jSONObject});
        } else if (jSONObject == null || (string = jSONObject.getString("viewId")) == null) {
        } else {
            TMSLogger.a("TMSWidget", "disappear viewId:" + string);
            com.taobao.themis.widget.kernal.b bVar = this.mEmbedManager;
            if (bVar == null) {
                return;
            }
            bVar.b(string);
        }
    }
}
