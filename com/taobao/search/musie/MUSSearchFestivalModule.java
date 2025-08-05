package com.taobao.search.musie;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.search.sf.BaseResultActivity;
import kotlin.TypeCastException;
import tb.kge;

/* loaded from: classes7.dex */
public final class MUSSearchFestivalModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean miniSearch;

    static {
        kge.a(1239336123);
    }

    public MUSSearchFestivalModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
        if ((mUSDKInstance != null ? mUSDKInstance.getUIContext() : null) instanceof BaseResultActivity) {
            Context uIContext = mUSDKInstance.getUIContext();
            if (uIContext == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.BaseResultActivity");
            }
            this.miniSearch = ((BaseResultActivity) uIContext).s() && com.taobao.search.common.util.r.bQ();
        }
    }

    @MUSMethod(uiThread = false)
    public int getActionBarBackgroundColor(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("55a6ef6e", new Object[]{this, jSONObject})).intValue() : FestivalMgr.a().a("actionBarBackgroundColor", 0);
    }

    @MUSMethod(uiThread = false)
    public final boolean isFestival() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36a9b44d", new Object[]{this})).booleanValue();
        }
        if (!this.miniSearch) {
            return FestivalMgr.a().a("global");
        }
        return false;
    }

    @MUSMethod(uiThread = false)
    public final JSONObject getModuleConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1635edf5", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || this.miniSearch) {
            return new JSONObject();
        }
        Object json = JSON.toJSON(FestivalMgr.a().b(str));
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        JSONObject jSONObject = (JSONObject) json;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }
}
