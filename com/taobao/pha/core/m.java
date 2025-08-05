package com.taobao.pha.core;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import tb.kge;

/* loaded from: classes7.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(734504005);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.addAll(Arrays.asList("devTools.open", "devTools.close", "devTools.getConfig", "devTools.setConfig", "tabBar.show", "tabBar.hide", "tabBar.switchTo", "tabBar.load", "message.post", "swiper.slideTo", "swiper.addItem", "swiper.removeItem", "swiper.addItems", "swiper.enable", "swiper.disable", "navigator.downgrade", "navigator.replace", "navigator.back", "navigator.push", "navigator.pop", "navigator.redirectTo", "navigator.getCurrentPages", "navigationBar.showMenu", "navigationBar.setMoreItems", "navigationBar.setTitle", "splashView.close", "pageHeader.show", "pageHeader.hide", "pageHeader.setHeight", "pullRefresh.enable", "pullRefresh.disable", "pullRefresh.start", "pullRefresh.stop", "pullRefresh.setBackgroundColor", "pullRefresh.setColorScheme", "live.getPageProperties", "shortVideo.getPageProperties", "manifest.get", "manifest.clearCache", "manifest.setRequestHeaders", "performance.report", "dataPrefetch.getData", "dataPrefetch.call", "statusBar.setStyle", "share.setShareAppMessage", "userTrack.click", "userTrack.pageEnter", "userTrack.expose", "userTrack.updateNextProp", "userTrack.updatePageUtParam", "userTrack.updatePageUtparam", "userTrack.other", "userTrack.custom", "userTrack.pageAppear", "userTrack.pageDisappear", "userTrack.skipPage", "userTrack.updateNextPageUtParam", "userTrack.updateNextPageUtparam", "storage.setItem", "storage.getItem", "storage.removeItem", "storage.clear", "screen.disableCapture", "popup.open", "popup.close"));
        return "__pha_APIList__=" + jSONArray.toJSONString() + ';';
    }
}
