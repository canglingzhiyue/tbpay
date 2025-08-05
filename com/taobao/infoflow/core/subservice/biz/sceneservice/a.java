package com.taobao.infoflow.core.subservice.biz.sceneservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.base.cacheservice.CacheServiceImpl;
import com.taobao.infoflow.core.subservice.base.item.dxservice.DxItemRenderServiceImpl;
import com.taobao.infoflow.core.subservice.base.item.itemrenderservice.ItemRenderServiceImpl;
import com.taobao.infoflow.core.subservice.biz.cardcache.CardUtCacheServiceImpl;
import com.taobao.infoflow.core.subservice.biz.dynamiclayoutservice.DynamicLayoutService;
import com.taobao.infoflow.core.subservice.biz.loopstartstopservice.MainFeedsLoopStartStopServiceImpl;
import com.taobao.infoflow.core.subservice.biz.staytime.StayTimeServiceImpl;
import com.taobao.infoflow.core.subservice.framework.container.containerservice.ContainerServiceImpl;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.MainFeedsViewServiceImpl;
import com.taobao.infoflow.core.subservice.framework.container.stickyservice.StickyContainerServiceImpl;
import com.taobao.infoflow.core.subservice.framework.hostservice.HostServiceImpl;
import com.taobao.infoflow.core.subservice.framework.mainlifecycleservice.MainLifecycleServiceImpl;
import com.taobao.infoflow.core.subservice.framework.themeservice.ThemeServiceDefaultImpl;
import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.infoflow.protocol.subservice.base.ICacheService;
import com.taobao.infoflow.protocol.subservice.base.IConfigService;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.base.IItemRenderService;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.infoflow.protocol.subservice.biz.ISceneService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.infoflow.protocol.subservice.framework.IThemeService;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class a implements com.taobao.infoflow.protocol.subservice.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-174026317);
        kge.a(1887150488);
    }

    @Override // com.taobao.infoflow.protocol.subservice.a
    public List<ISubService> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        a(arrayList);
        b(arrayList);
        c(arrayList);
        return arrayList;
    }

    public ArrayList<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("2f3d5943", new Object[]{this});
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(IConfigService.SERVICE_NAME);
        arrayList.add(ICacheService.SERVICE_NAME);
        arrayList.add(IContainerDataService.SERVICE_NAME);
        arrayList.add(IContainerService.SERVICE_NAME);
        arrayList.add(IMainLifecycleService.SERVICE_NAME);
        arrayList.add(IThemeService.SERVICE_NAME);
        arrayList.add(IMainFeedsLoopStartStopService.SERVICE_NAME);
        arrayList.add(ISceneService.SERVICE_NAME);
        arrayList.add(IMainFeedsViewService.SERVICE_NAME);
        arrayList.add(IItemRenderService.SERVICE_NAME);
        arrayList.add(IDxItemRenderService.SERVICE_NAME);
        return arrayList;
    }

    private void a(List<ISubService> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        list.add(new CacheServiceImpl());
        list.add(new ItemRenderServiceImpl());
        list.add(new DxItemRenderServiceImpl());
        list.add(new CardUtCacheServiceImpl());
        list.add(new DynamicLayoutService());
    }

    private void b(List<ISubService> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        list.add(new HostServiceImpl());
        list.add(new ThemeServiceDefaultImpl());
        list.add(new SceneServiceImpl());
        list.add(new MainLifecycleServiceImpl());
        list.add(new ContainerServiceImpl());
        list.add(new MainFeedsViewServiceImpl());
        list.add(new StickyContainerServiceImpl());
        list.add(new StayTimeServiceImpl());
    }

    private void c(List<ISubService> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
        } else {
            list.add(new MainFeedsLoopStartStopServiceImpl());
        }
    }
}
