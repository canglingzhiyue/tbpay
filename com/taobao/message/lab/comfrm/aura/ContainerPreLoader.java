package com.taobao.message.lab.comfrm.aura;

import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class ContainerPreLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, Container> mContainerKey2Container;

    static {
        kge.a(1808372367);
    }

    /* loaded from: classes7.dex */
    public static class SingletonHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final ContainerPreLoader instance;

        private SingletonHolder() {
        }

        public static /* synthetic */ ContainerPreLoader access$100() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ContainerPreLoader) ipChange.ipc$dispatch("af7173ba", new Object[0]) : instance;
        }

        static {
            kge.a(1675640162);
            instance = new ContainerPreLoader();
        }
    }

    public static /* synthetic */ Map access$200(ContainerPreLoader containerPreLoader) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("70571e6e", new Object[]{containerPreLoader}) : containerPreLoader.mContainerKey2Container;
    }

    public static ContainerPreLoader getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ContainerPreLoader) ipChange.ipc$dispatch("20970294", new Object[0]) : SingletonHolder.access$100();
    }

    private ContainerPreLoader() {
        this.mContainerKey2Container = new HashMap();
    }

    public String preload(Intent intent, String str, String str2, boolean z, Map<String, Object> map, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d596b84e", new Object[]{this, intent, str, str2, new Boolean(z), map, new Boolean(z2), new Boolean(z3)});
        }
        if (ApplicationUtil.isDebug() && VExecutors.currentThread() != Looper.getMainLooper().getThread()) {
            throw new RuntimeException("非主线程调用ContainerPreLoader");
        }
        TraceUtil.beginSection("ContainerPreLoad");
        final Container container = new Container(intent, str, (String) null, str2, map, (String) null);
        container.setUseRemote(z);
        TraceUtil.beginSection("PreLoad-StartLoadStateAndViewObject");
        container.initSource();
        container.sendFirstAction();
        TraceUtil.endTrace();
        final String containerKey = container.getContainerKey();
        this.mContainerKey2Container.put(containerKey, container);
        TraceUtil.endTrace();
        if (z3) {
            container.enableSnapshot();
        }
        if (z2) {
            UIHandler.postDelayed(new Runnable() { // from class: com.taobao.message.lab.comfrm.aura.ContainerPreLoader.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Container container2 = (Container) ContainerPreLoader.access$200(ContainerPreLoader.this).remove(containerKey);
                    Container container3 = container;
                    if (container2 != container3) {
                        return;
                    }
                    container3.dispose();
                }
            }, 30000L);
        }
        return containerKey;
    }

    public Container find(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Container) ipChange.ipc$dispatch("740c4a42", new Object[]{this, activity, str});
        }
        if (ApplicationUtil.isDebug() && VExecutors.currentThread() != Looper.getMainLooper().getThread()) {
            throw new RuntimeException("非主线程调用ContainerPreLoader");
        }
        Container remove = this.mContainerKey2Container.remove(str);
        if (remove != null) {
            remove.attachPage(activity);
        }
        return remove;
    }
}
