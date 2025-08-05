package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IEditionService;
import com.taobao.infoflow.protocol.subservice.biz.ILoginService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import tb.llb;

/* loaded from: classes7.dex */
public class ndd implements llb, lld {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f31367a;

    @Override // tb.llb
    public /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
        llb.CC.$default$onActivityResult(this, i, i2, intent);
    }

    @Override // tb.llb
    public /* synthetic */ void onColdStartResume() {
        llb.CC.$default$onColdStartResume(this);
    }

    @Override // tb.llb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.llb
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
        }
    }

    @Override // tb.llb
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        }
    }

    @Override // tb.lld
    public void onPageScrolled(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3dde4", new Object[]{this, new Float(f), new Integer(i)});
        }
    }

    @Override // tb.lld
    public void onPageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
        }
    }

    @Override // tb.llb
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    @Override // tb.llb
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
        }
    }

    @Override // tb.llb
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.llb
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    @Override // tb.llb
    public void onWillExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
        }
    }

    public ndd(ljs ljsVar) {
        this.f31367a = ljsVar;
    }

    @Override // tb.llb
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            a(this.f31367a);
        }
    }

    @Override // tb.lld
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
        } else {
            a(this.f31367a);
        }
    }

    private boolean a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2eb5407", new Object[]{this, ljsVar})).booleanValue();
        }
        boolean b = b(ljsVar);
        boolean z = a(ljsVar, b) || b;
        return b(ljsVar, z) || z;
    }

    private boolean b(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e16e5a88", new Object[]{this, ljsVar})).booleanValue();
        }
        IContainerDataService iContainerDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return false;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData != null && !lhd.a(containerData)) {
            return false;
        }
        return iContainerDataService.triggerEvent("PageEnter", null);
    }

    private boolean a(ljs ljsVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a7fdf35", new Object[]{this, ljsVar, new Boolean(z)})).booleanValue();
        }
        ILoginService iLoginService = (ILoginService) ljsVar.a(ILoginService.class);
        if (iLoginService != null) {
            return iLoginService.loginStatusTrigger(z);
        }
        return false;
    }

    private boolean b(ljs ljsVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c5da8d4", new Object[]{this, ljsVar, new Boolean(z)})).booleanValue();
        }
        IEditionService iEditionService = (IEditionService) ljsVar.a(IEditionService.class);
        if (iEditionService != null) {
            return iEditionService.editionStatusTrigger(z);
        }
        return false;
    }
}
