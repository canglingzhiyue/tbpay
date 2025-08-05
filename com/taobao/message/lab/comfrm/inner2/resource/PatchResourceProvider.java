package com.taobao.message.lab.comfrm.inner2.resource;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.FileUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.inner2.config.PatchInfo;
import com.taobao.message.lab.comfrm.util.Observer;
import java.io.File;
import tb.kge;

/* loaded from: classes7.dex */
public class PatchResourceProvider implements IResourceProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final PatchInfo mPatchInfo;
    private IResourceChangeObserver resourceChangeObserver;
    private volatile boolean mChangedFlag = false;
    private final Observer<PatchInfo> mCallback = new Observer<PatchInfo>() { // from class: com.taobao.message.lab.comfrm.inner2.resource.PatchResourceProvider.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.message.lab.comfrm.util.Observer
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            }
        }

        @Override // com.taobao.message.lab.comfrm.util.Observer
        public void onError(String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b263e360", new Object[]{this, str, str2, obj});
            }
        }

        @Override // com.taobao.message.lab.comfrm.util.Observer
        public void onData(PatchInfo patchInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab3da5e7", new Object[]{this, patchInfo});
                return;
            }
            PatchResourceProvider patchResourceProvider = PatchResourceProvider.this;
            PatchResourceProvider.access$002(patchResourceProvider, PatchUtil.equals(PatchResourceProvider.access$100(patchResourceProvider), patchInfo));
            if (!PatchResourceProvider.access$200(PatchResourceProvider.this)) {
                return;
            }
            PatchResourceProvider.access$300(PatchResourceProvider.this);
        }
    };

    static {
        kge.a(178222503);
        kge.a(990544840);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceProvider
    public int getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        return 10;
    }

    public static /* synthetic */ boolean access$002(PatchResourceProvider patchResourceProvider, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("639c6597", new Object[]{patchResourceProvider, new Boolean(z)})).booleanValue();
        }
        patchResourceProvider.mChangedFlag = z;
        return z;
    }

    public static /* synthetic */ PatchInfo access$100(PatchResourceProvider patchResourceProvider) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PatchInfo) ipChange.ipc$dispatch("15ef3f49", new Object[]{patchResourceProvider}) : patchResourceProvider.mPatchInfo;
    }

    public static /* synthetic */ boolean access$200(PatchResourceProvider patchResourceProvider) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c61fe1e5", new Object[]{patchResourceProvider})).booleanValue() : patchResourceProvider.isResourceChanged();
    }

    public static /* synthetic */ void access$300(PatchResourceProvider patchResourceProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8370f40", new Object[]{patchResourceProvider});
        } else {
            patchResourceProvider.notifyResourceChange();
        }
    }

    public PatchResourceProvider() {
        ResourcePatchCenter.getInstance().addCallback(this.mCallback);
        this.mPatchInfo = ResourcePatchCenter.getInstance().getUsePatch();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceChangePublisher
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        ResourcePatchCenter.getInstance().removeCallback(this.mCallback);
        this.resourceChangeObserver = null;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceProvider
    public String fetchResource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59f10447", new Object[]{this, str});
        }
        if (!ResourcePatchCenter.sEnable) {
            PatchUtil.commitMonitor(null, "1-masterSwitchClosed", str, false, "-1101");
            return null;
        } else if (this.mPatchInfo == null) {
            return null;
        } else {
            File file = new File(PatchUtil.getDir(this.mPatchInfo) + File.separator + str);
            if (!this.mPatchInfo.fileList.contains(str)) {
                return null;
            }
            if (!file.exists()) {
                PatchUtil.commitMonitor(this.mPatchInfo.patchVersion, "4-localPatchUnAvailable", str, false, "-1104");
                return null;
            }
            PatchUtil.commitMonitor(this.mPatchInfo.patchVersion, "5-usingLocalPatchSucc", str, true, null);
            return FileUtil.readTextFile(file.getAbsolutePath());
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceChangePublisher
    public void subscribeResourceChange(IResourceChangeObserver iResourceChangeObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f0d3f5", new Object[]{this, iResourceChangeObserver});
            return;
        }
        this.resourceChangeObserver = iResourceChangeObserver;
        if (!isResourceChanged()) {
            return;
        }
        notifyResourceChange();
    }

    private synchronized void notifyResourceChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("483f1a0e", new Object[]{this});
        } else if (this.resourceChangeObserver == null) {
        } else {
            this.resourceChangeObserver.notifyResourceChanged(new ResourceChangeSchema(0, null, getPriority()));
        }
    }

    private boolean isResourceChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ddea2c7", new Object[]{this})).booleanValue();
        }
        if (!"0".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "dojo_resources_refresh", "1"))) {
            return this.mChangedFlag;
        }
        return false;
    }
}
