package com.taobao.message.lab.comfrm.inner2.resource;

import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\rH\u0002J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010\u001c\u001a\u00020\tH\u0016J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0007H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/taobao/message/lab/comfrm/inner2/resource/ResourceManager;", "Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceManager;", "()V", "comparator", "Ljava/util/Comparator;", "Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceProvider;", "resourceChangeObserver", "Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceChangeObserver;", "resourceChanged", "", "resourceFileNameMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "resourceProviderList", "", "addResourceProvider", "", "resourceProvider", "cacheFileName", "filePartyName", "providerPriority", "considerNotifyResourceChanged", "data", "Lcom/taobao/message/lab/comfrm/inner2/resource/ResourceChangeSchema;", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "fetchResource", "filePartName", "isResourceChanged", "subscribeResourceChange", "observer", "Companion", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class ResourceManager implements IResourceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Companion Companion;
    private static final List<Class<? extends IResourceProvider>> injectedResourceProviderList;
    private volatile IResourceChangeObserver resourceChangeObserver;
    private volatile boolean resourceChanged;
    private final ConcurrentHashMap<String, Integer> resourceFileNameMap = new ConcurrentHashMap<>();
    private final List<IResourceProvider> resourceProviderList = new ArrayList();
    private final Comparator<IResourceProvider> comparator = ResourceManager$comparator$1.INSTANCE;

    /* JADX WARN: Multi-variable type inference failed */
    public ResourceManager() {
        synchronized (t.b(ResourceManager.class)) {
            Iterator<T> it = injectedResourceProviderList.iterator();
            while (it.hasNext()) {
                this.resourceProviderList.add(((Class) it.next()).newInstance());
            }
            kotlin.t tVar = kotlin.t.INSTANCE;
        }
        this.resourceProviderList.add(new PatchResourceProvider());
        this.resourceProviderList.add(new ReleaseResourceProvider());
        p.a((List) this.resourceProviderList, (Comparator) this.comparator);
        for (IResourceProvider iResourceProvider : this.resourceProviderList) {
            iResourceProvider.subscribeResourceChange(new IResourceChangeObserver() { // from class: com.taobao.message.lab.comfrm.inner2.resource.ResourceManager$$special$$inlined$forEach$lambda$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceChangeObserver
                public void notifyResourceChanged(ResourceChangeSchema data) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("c82e0b94", new Object[]{this, data});
                        return;
                    }
                    q.d(data, "data");
                    ResourceManager.access$considerNotifyResourceChanged(ResourceManager.this, data);
                }
            });
        }
    }

    public static final /* synthetic */ void access$considerNotifyResourceChanged(ResourceManager resourceManager, ResourceChangeSchema resourceChangeSchema) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2883afe7", new Object[]{resourceManager, resourceChangeSchema});
        } else {
            resourceManager.considerNotifyResourceChanged(resourceChangeSchema);
        }
    }

    public static final /* synthetic */ List access$getInjectedResourceProviderList$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9dc09212", new Object[0]) : injectedResourceProviderList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/taobao/message/lab/comfrm/inner2/resource/ResourceManager$Companion;", "", "()V", "injectedResourceProviderList", "", "Ljava/lang/Class;", "Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceProvider;", "injectResourceProvider", "", "resourceProvider", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1779093145);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final void injectResourceProvider(Class<? extends IResourceProvider> resourceProvider) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db8d27c6", new Object[]{this, resourceProvider});
                return;
            }
            q.d(resourceProvider, "resourceProvider");
            synchronized (t.b(ResourceManager.class)) {
                ResourceManager.access$getInjectedResourceProviderList$cp().add(resourceProvider);
            }
        }
    }

    static {
        kge.a(-438202145);
        kge.a(-624952586);
        Companion = new Companion(null);
        injectedResourceProviderList = new ArrayList();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceManager
    public synchronized String fetchResource(String filePartName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59f10447", new Object[]{this, filePartName});
        }
        q.d(filePartName, "filePartName");
        TraceUtil.beginSection("LOAD:" + filePartName);
        Iterator<T> it = this.resourceProviderList.iterator();
        while (true) {
            String str = null;
            if (it.hasNext()) {
                IResourceProvider iResourceProvider = (IResourceProvider) it.next();
                String fetchResource = iResourceProvider.fetchResource(filePartName);
                if (fetchResource != null) {
                    if (fetchResource.length() > 0) {
                        str = fetchResource;
                    }
                    if (str != null) {
                        cacheFileName(filePartName, iResourceProvider.getPriority());
                        TraceUtil.endTrace();
                        return str;
                    }
                }
            } else {
                TraceUtil.endTrace();
                return null;
            }
        }
    }

    private final void cacheFileName(String str, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcf5a0a9", new Object[]{this, str, new Integer(i)});
            return;
        }
        String name = new File(str).getName();
        if (name == null) {
            return;
        }
        if (name.length() <= 0) {
            z = false;
        }
        if (!z) {
            name = null;
        }
        if (name == null) {
            return;
        }
        this.resourceFileNameMap.put(name, Integer.valueOf(i));
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceChangePublisher
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        synchronized (this) {
            for (IResourceProvider iResourceProvider : this.resourceProviderList) {
                iResourceProvider.dispose();
            }
            kotlin.t tVar = kotlin.t.INSTANCE;
        }
        this.resourceChanged = false;
        this.resourceChangeObserver = null;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceManager
    public boolean isResourceChanged() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9ddea2c7", new Object[]{this})).booleanValue() : this.resourceChanged;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceManager
    public void addResourceProvider(IResourceProvider resourceProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe0c9072", new Object[]{this, resourceProvider});
            return;
        }
        q.d(resourceProvider, "resourceProvider");
        synchronized (this) {
            this.resourceProviderList.add(resourceProvider);
            p.a((List) this.resourceProviderList, (Comparator) this.comparator);
            kotlin.t tVar = kotlin.t.INSTANCE;
        }
        resourceProvider.subscribeResourceChange(new IResourceChangeObserver() { // from class: com.taobao.message.lab.comfrm.inner2.resource.ResourceManager$addResourceProvider$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceChangeObserver
            public void notifyResourceChanged(ResourceChangeSchema data) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c82e0b94", new Object[]{this, data});
                    return;
                }
                q.d(data, "data");
                ResourceManager.access$considerNotifyResourceChanged(ResourceManager.this, data);
            }
        });
    }

    private final synchronized void considerNotifyResourceChanged(ResourceChangeSchema resourceChangeSchema) {
        Integer currentFileProviderPriority;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e18ffc5b", new Object[]{this, resourceChangeSchema});
            return;
        }
        int mode = resourceChangeSchema.getMode();
        if (mode == 0) {
            this.resourceChanged = true;
            IResourceChangeObserver iResourceChangeObserver = this.resourceChangeObserver;
            if (iResourceChangeObserver == null) {
                return;
            }
            iResourceChangeObserver.notifyResourceChanged(resourceChangeSchema);
            return;
        }
        if (mode == 1) {
            int providerPriority = resourceChangeSchema.getProviderPriority();
            List<String> changedFileNameList = resourceChangeSchema.getChangedFileNameList();
            if (changedFileNameList != null) {
                boolean z2 = false;
                for (String str : changedFileNameList) {
                    ConcurrentHashMap<String, Integer> concurrentHashMap = this.resourceFileNameMap;
                    if (!concurrentHashMap.containsKey(str)) {
                        concurrentHashMap = null;
                    }
                    if (concurrentHashMap != null && (currentFileProviderPriority = concurrentHashMap.get(str)) != null) {
                        q.b(currentFileProviderPriority, "currentFileProviderPriority");
                        if (!(q.a(providerPriority, currentFileProviderPriority.intValue()) >= 0)) {
                            currentFileProviderPriority = null;
                        }
                        if (currentFileProviderPriority != null) {
                            z2 = true;
                        }
                    }
                }
                z = z2;
            }
            if (z) {
                this.resourceChanged = true;
                IResourceChangeObserver iResourceChangeObserver2 = this.resourceChangeObserver;
                if (iResourceChangeObserver2 != null) {
                    iResourceChangeObserver2.notifyResourceChanged(resourceChangeSchema);
                }
            }
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceChangePublisher
    public void subscribeResourceChange(IResourceChangeObserver observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f0d3f5", new Object[]{this, observer});
            return;
        }
        q.d(observer, "observer");
        this.resourceChangeObserver = observer;
    }
}
