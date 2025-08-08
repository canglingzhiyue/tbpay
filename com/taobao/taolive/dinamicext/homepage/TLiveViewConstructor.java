package com.taobao.taolive.dinamicext.homepage;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.DinamicAttr;
import com.taobao.android.dinamic.dinamic.h;
import com.taobao.taolive.uikit.homepage.TLiveView;
import tb.kge;
import tb.pbh;
import tb.pro;

/* loaded from: classes.dex */
public class TLiveViewConstructor extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CUSTOM_ATTR_COVER_URL = "tCoverUrl";
    private static final String CUSTOM_ATTR_DURATION = "tDuration";
    private static final String CUSTOM_ATTR_IMAGE_SCALE = "tScaleType";
    private static final String CUSTOM_ATTR_LIVE_ID = "tLiveID";
    private static final String CUSTOM_ATTR_LIVE_URL = "tLiveUrl";
    private static final String CUSTOM_ATTR_PLAYER_DATA = "tPlayerData";

    static {
        kge.a(-1678104115);
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet}) : new TLiveView(context, attributeSet);
    }

    @DinamicAttr(attrSet = {CUSTOM_ATTR_LIVE_URL})
    public void setLiveUrl(TLiveView tLiveView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf53917e", new Object[]{this, tLiveView, str});
        } else if (tLiveView == null) {
        } else {
            tLiveView.setLiveUrl(str);
        }
    }

    @DinamicAttr(attrSet = {CUSTOM_ATTR_COVER_URL})
    public void setCoverUrl(TLiveView tLiveView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85f4ac45", new Object[]{this, tLiveView, str});
        } else if (tLiveView == null) {
        } else {
            tLiveView.setImageUrl(str);
        }
    }

    @DinamicAttr(attrSet = {CUSTOM_ATTR_DURATION})
    public void setDuration(TLiveView tLiveView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfb47b69", new Object[]{this, tLiveView, str});
        } else if (tLiveView == null) {
        } else {
            tLiveView.setDuration(pro.a(str));
        }
    }

    @DinamicAttr(attrSet = {CUSTOM_ATTR_LIVE_ID})
    public void setLiveID(TLiveView tLiveView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd0d096", new Object[]{this, tLiveView, str});
        } else if (tLiveView == null) {
        } else {
            tLiveView.setLiveId(str);
        }
    }

    @DinamicAttr(attrSet = {CUSTOM_ATTR_IMAGE_SCALE})
    public void setImageScaleType(TLiveView tLiveView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("168445d4", new Object[]{this, tLiveView, str});
        } else if (StringUtils.isEmpty(str) || tLiveView == null) {
        } else {
            tLiveView.setScaleType(pbh.c(str));
        }
    }

    @DinamicAttr(attrSet = {CUSTOM_ATTR_PLAYER_DATA})
    public void setPlayerData(TLiveView tLiveView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470ee7c8", new Object[]{this, tLiveView, jSONObject});
        } else if (tLiveView == null || jSONObject == null) {
        } else {
            tLiveView.setPlayerData(jSONObject);
        }
    }
}
