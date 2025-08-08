package com.taobao.android.miniLive.weex;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.c;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.miniLive.a;
import com.taobao.android.miniLive.sdk.d;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;
import java.util.HashMap;
import java.util.Map;
import tb.huc;
import tb.hud;
import tb.hue;
import tb.kge;

/* loaded from: classes6.dex */
public class TBMiniLiveModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBMiniLiveModule";
    private Map<String, Map<String, String>> cachedMap;

    public static /* synthetic */ Object ipc$super(TBMiniLiveModule tBMiniLiveModule, String str, Object... objArr) {
        if (str.hashCode() == -17468269) {
            super.onActivityDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(626746610);
        c.a("com.taobao.taolive", null);
    }

    @JSMethod(uiThread = true)
    public void startMiniLive(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a6ff99", new Object[]{this, map});
        } else if (!hud.j()) {
            hue.a(TAG, "startMiniLive openShopMiniLive = false");
        } else if (map == null) {
        } else {
            hue.a(TAG, "startMiniLive");
            a.a().a(this.mWXSDKInstance.O(), map.get(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID), map);
        }
    }

    @JSMethod(uiThread = true)
    public void setMiniLive(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc950799", new Object[]{this, map});
            return;
        }
        hue.a(TAG, "setMiniLive");
        if (map == null) {
            return;
        }
        String str = map.get("shopId");
        if (StringUtils.isEmpty(str)) {
            return;
        }
        hue.a(TAG, "setMiniLive shopId " + str);
        if (this.cachedMap == null) {
            this.cachedMap = new HashMap();
        }
        this.cachedMap.put(str, map);
    }

    @JSMethod(uiThread = true)
    public void showMiniLive(Map<String, String> map) {
        Map<String, String> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a94da01e", new Object[]{this, map});
        } else if (!hud.j()) {
            hue.a(TAG, "showMiniLive openShopMiniLive = false");
        } else if (map == null) {
        } else {
            hue.a(TAG, "showMiniLive ");
            String str = map.get("shopId");
            if (this.cachedMap == null || StringUtils.isEmpty(str) || (map2 = this.cachedMap.get(str)) == null) {
                return;
            }
            String str2 = map2.get(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
            hue.a(TAG, "showMiniLive liveId = " + str2);
            a.a().a(this.mWXSDKInstance.O(), str2, map2);
        }
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
            return;
        }
        super.onActivityDestroy();
        Map<String, Map<String, String>> map = this.cachedMap;
        if (map != null) {
            map.clear();
        }
        this.cachedMap = null;
    }

    @JSMethod(uiThread = true)
    public void updateLivePosition(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b19ddc0", new Object[]{this, map});
        } else if (!hud.j()) {
            hue.a(TAG, "updateLivePosition openShopMiniLive = false");
        } else {
            a.a().a(huc.a(map, "x"), huc.a(map, "y"));
        }
    }

    @JSMethod(uiThread = true)
    public void hideMiniLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b97f4c", new Object[]{this});
        } else if (!hud.j()) {
            hue.a(TAG, "hideMiniLive openShopMiniLive = false");
        } else {
            a.a().i();
        }
    }

    @JSMethod(uiThread = true)
    public void closeMiniLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63d51f02", new Object[]{this});
        } else if (!hud.j()) {
            hue.a(TAG, "hideMiniLive openShopMiniLive = false");
        } else {
            a.a().i();
        }
    }

    @JSMethod(uiThread = true)
    public void sendBroadcast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8680220", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(d.PAGE_RESUME_ACTION);
        LocalBroadcastManager.getInstance(this.mWXSDKInstance.O().getApplicationContext()).sendBroadcast(intent);
    }
}
