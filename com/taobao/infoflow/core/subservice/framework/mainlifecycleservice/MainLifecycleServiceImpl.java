package com.taobao.infoflow.core.subservice.framework.mainlifecycleservice;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.uc.webview.export.media.MessageID;
import tb.kge;
import tb.ldf;
import tb.lir;
import tb.lis;
import tb.lit;
import tb.ljs;
import tb.lkp;
import tb.llc;
import tb.lle;

/* loaded from: classes.dex */
public class MainLifecycleServiceImpl implements IMainLifecycleService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FramewrkServiceImpl";
    private lir mAppLifeCycleRegister;
    private ljs mInfoFlowContext;
    private lis mPageLifeCycleRegister;
    private lit mTabLifeCycleRegister;
    private boolean isSelect = true;
    private boolean isResume = true;

    static {
        kge.a(874146452);
        kge.a(-712808807);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mPageLifeCycleRegister = new lis();
        this.mTabLifeCycleRegister = new lit();
        this.mAppLifeCycleRegister = new lir();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService
    public llc getPageLifeCycleRegister() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (llc) ipChange.ipc$dispatch("fd8d5114", new Object[]{this}) : this.mPageLifeCycleRegister;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService
    public lle getTabLifeCycleRegister() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lle) ipChange.ipc$dispatch("4deecbac", new Object[]{this}) : this.mTabLifeCycleRegister;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService
    public lkp getAppLifeCycleRegister() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lkp) ipChange.ipc$dispatch("d2479cc", new Object[]{this}) : this.mAppLifeCycleRegister;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService
    public boolean isSelect() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1ea4d851", new Object[]{this})).booleanValue() : this.isSelect;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService
    public boolean isVisible() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue() : this.isSelect && this.isResume;
    }

    @Override // tb.llb
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        ldf.d(TAG, "onNewIntent");
        this.mPageLifeCycleRegister.a(intent);
    }

    @Override // tb.llb
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        ldf.d(TAG, "onStart");
        this.mPageLifeCycleRegister.a();
    }

    @Override // tb.llb
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            return;
        }
        ldf.d(TAG, "onRestart");
        this.mPageLifeCycleRegister.b();
    }

    @Override // tb.llb
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        ldf.d(TAG, "onResume");
        this.isResume = true;
        this.mPageLifeCycleRegister.c();
    }

    @Override // tb.llb
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        ldf.d(TAG, "onPause");
        this.isResume = false;
        this.mPageLifeCycleRegister.d();
    }

    @Override // tb.llb
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        ldf.d(TAG, MessageID.onStop);
        this.mPageLifeCycleRegister.e();
    }

    @Override // tb.llb
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        ldf.d(TAG, "onDestroyView");
        this.mPageLifeCycleRegister.f();
    }

    @Override // tb.llb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ldf.d(TAG, MessageID.onDestroy);
        this.mPageLifeCycleRegister.g();
    }

    @Override // tb.lld
    public void onPageScrolled(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3dde4", new Object[]{this, new Float(f), new Integer(i)});
            return;
        }
        ldf.d(TAG, "onPageScrolled v : " + f + ", positionOffsetPixels : " + i);
        this.mTabLifeCycleRegister.a(f, i);
    }

    @Override // tb.llb
    public void onColdStartResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e9b853", new Object[]{this});
            return;
        }
        ldf.d(TAG, "onColdStartResume");
        this.mPageLifeCycleRegister.i();
    }

    @Override // tb.lld
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        ldf.d(TAG, "onPageSelected");
        this.isSelect = true;
        this.mTabLifeCycleRegister.a();
    }

    @Override // tb.lld
    public void onPageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
            return;
        }
        ldf.d(TAG, "onPageUnSelected");
        this.isSelect = false;
        this.mTabLifeCycleRegister.b();
    }

    @Override // tb.llb
    public void onWillExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
            return;
        }
        ldf.d(TAG, "onWillExit");
        this.mPageLifeCycleRegister.h();
    }

    @Override // tb.lko
    public void onAppToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
            return;
        }
        ldf.d(TAG, "onAppToBackground");
        this.mAppLifeCycleRegister.a();
    }

    @Override // tb.lko
    public void onAppToFront() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c238d3", new Object[]{this});
            return;
        }
        ldf.d(TAG, "onAppToFront");
        this.mAppLifeCycleRegister.b();
    }

    @Override // tb.llb
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        ldf.d(TAG, "onActivityResult");
        this.mPageLifeCycleRegister.a(i, i2, intent);
    }
}
