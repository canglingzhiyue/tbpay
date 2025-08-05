package com.taobao.taolive.adapterimpl.nav;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.kge;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f21397a;

    static {
        kge.a(-1056222965);
    }

    public d(b bVar) {
        this.f21397a = bVar;
    }

    public String a(VideoInfo videoInfo, LiveItem liveItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13704a70", new Object[]{this, videoInfo, liveItem, jSONObject});
        }
        String str = null;
        if (jSONObject != null) {
            if (com.taobao.taolive.sdk.goodlist.d.a() && f.m().isMultiStateSecKill(liveItem)) {
                str = jSONObject.getString("itemJumpUrl2");
            }
            if (TextUtils.isEmpty(str)) {
                str = jSONObject.getString("itemJumpUrl");
            }
            String string = jSONObject.getString("itemJumpUrlForPcg");
            if (!TextUtils.isEmpty(string) && videoInfo != null && com.taobao.taolive.sdk.goodlist.d.a(videoInfo.itemTransferInfo)) {
                str = string;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return "http://a.m.taobao.com/sku" + liveItem.itemId + ".htm";
    }
}
