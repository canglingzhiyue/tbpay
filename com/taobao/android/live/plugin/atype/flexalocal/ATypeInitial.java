package com.taobao.android.live.plugin.atype.flexalocal;

import android.app.Application;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.BottomProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.CommentsProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.FullScreenProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.GoodProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.InputProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.Jump302ProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.NoticeProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.OfficialLiveEntryProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.PanelProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.ProjectScreenProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.RankProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.RecommendPopProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.SmartLandingProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.TopBarProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.UserTaskProxyX;
import com.taobao.android.live.plugin.proxy.IProxy;
import com.taobao.android.live.plugin.proxy.bottom.IBottomProxy;
import com.taobao.android.live.plugin.proxy.c;
import com.taobao.android.live.plugin.proxy.comments.ICommentsProxy;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy;
import com.taobao.android.live.plugin.proxy.good.IGoodProxy;
import com.taobao.android.live.plugin.proxy.input.IInputProxy;
import com.taobao.android.live.plugin.proxy.jump302.IJump302Proxy;
import com.taobao.android.live.plugin.proxy.notice.INoticeProxy;
import com.taobao.android.live.plugin.proxy.officialLive.IOfficialLiveEntryProxy;
import com.taobao.android.live.plugin.proxy.panel.IPanelProxy;
import com.taobao.android.live.plugin.proxy.projectscreen.IProjectScreenProxy;
import com.taobao.android.live.plugin.proxy.rank.IRankProxy;
import com.taobao.android.live.plugin.proxy.recommendpop.IRecommendPopProxy;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.live.plugin.proxy.topbar.ITopBarProxy;
import com.taobao.android.live.plugin.proxy.usertask.IUserTaskProxy;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.cak;
import tb.kge;
import tb.riy;

/* loaded from: classes5.dex */
public class ATypeInitial implements Serializable, cak {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicBoolean ONCE;
    private static final String TAG;

    static {
        kge.a(-1131583915);
        kge.a(85589420);
        kge.a(1028243835);
        TAG = ATypeInitial.class.getName();
        ONCE = new AtomicBoolean(false);
    }

    @Override // tb.cak
    public void init(Application application, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3d5e6ac", new Object[]{this, application, bundle});
            return;
        }
        e.c(riy.ARRAY_START_STR + TAG + "] init");
        if (!ONCE.compareAndSet(false, true)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ITopBarProxy.KEY, new TopBarProxyX());
        hashMap.put(IRankProxy.KEY, new RankProxyX());
        hashMap.put(INoticeProxy.KEY, new NoticeProxyX());
        hashMap.put(ICommentsProxy.KEY, new CommentsProxyX());
        hashMap.put(IInputProxy.KEY, new InputProxyX());
        hashMap.put(IPanelProxy.KEY, new PanelProxyX());
        hashMap.put(IBottomProxy.KEY, new BottomProxyX());
        hashMap.put(IJump302Proxy.KEY, new Jump302ProxyX());
        hashMap.put(IRecommendPopProxy.KEY, new RecommendPopProxyX());
        hashMap.put(ISmartLandingProxy.KEY, new SmartLandingProxyX());
        hashMap.put(IGoodProxy.KEY, new GoodProxyX());
        hashMap.put(IFullScreenProxy.KEY, new FullScreenProxyX());
        hashMap.put(IProjectScreenProxy.KEY, new ProjectScreenProxyX());
        hashMap.put(IUserTaskProxy.KEY, new UserTaskProxyX());
        hashMap.put(IOfficialLiveEntryProxy.KEY, new OfficialLiveEntryProxyX());
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            e.c(riy.ARRAY_START_STR + TAG + "] init, class load success: " + ((IProxy) ((Map.Entry) it.next()).getValue()).getClass().getName());
        }
        c.a().a(hashMap);
        c.a().a(true);
    }
}
