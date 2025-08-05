package com.taobao.tbpoplayer.adapter;

import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.norm.IModuleSwitchAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class c implements IModuleSwitchAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final AtomicBoolean c = new AtomicBoolean(false);
    private boolean d = false;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private boolean f = false;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final c f22204a;

        static {
            kge.a(-723270188);
            f22204a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("3e84a1a4", new Object[0]) : f22204a;
        }
    }

    static {
        kge.a(-67092735);
        kge.a(618864907);
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean isOpenImmersiveByDefault() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f371762e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("3e84a1a4", new Object[0]) : a.a();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean isPreDealTriggerEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("72ea49c1", new Object[]{this})).booleanValue() : com.taobao.tbpoplayer.info.a.a().j();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean isRequestingFilterEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("843b7003", new Object[]{this})).booleanValue() : com.taobao.tbpoplayer.info.a.a().o();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean isFatigueFilterEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f303f683", new Object[]{this})).booleanValue() : com.taobao.tbpoplayer.info.a.a().k();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean isRecordBucketId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fcd8c6b", new Object[]{this})).booleanValue() : com.taobao.tbpoplayer.info.a.a().l();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean isNewNativeEventNotificationEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("19677b06", new Object[]{this})).booleanValue() : com.taobao.tbpoplayer.info.a.a().p();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean isInterceptHover() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47bc9bef", new Object[]{this})).booleanValue() : com.taobao.tbpoplayer.info.a.a().t();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean isCleanKeepDirectlyEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5129cae8", new Object[]{this})).booleanValue() : com.taobao.tbpoplayer.info.a.a().D();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean isConfigFetchOptEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("796b2533", new Object[]{this})).booleanValue();
        }
        if (this.c.compareAndSet(false, true)) {
            this.d = com.taobao.tbpoplayer.info.a.a().n();
        }
        return this.d;
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean isConfigFetchLocalEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45aeb36b", new Object[]{this})).booleanValue();
        }
        if (this.e.compareAndSet(false, true)) {
            this.f = com.taobao.tbpoplayer.info.a.a().v();
        }
        return this.f;
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public int getFetchOnPageSwitchTimes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("268cc65a", new Object[]{this})).intValue() : (int) com.taobao.tbpoplayer.info.a.a().H();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean removeConfigUpdateNotify() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d7806a03", new Object[]{this})).booleanValue() : com.taobao.tbpoplayer.info.a.a().E();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean interruptDownAction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("945fa746", new Object[]{this})).booleanValue() : com.taobao.tbpoplayer.info.a.a().L();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean isUseNewActionLine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("16d9e618", new Object[]{this})).booleanValue() : com.taobao.tbpoplayer.info.a.a().u();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean usePopReadyApi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b25faec", new Object[]{this})).booleanValue() : ABGlobal.isFeatureOpened(PopLayer.getReference().getApp(), "android_poplayer_page_ready_api");
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public float getBigScreenAspectRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e805bd4", new Object[]{this})).floatValue();
        }
        try {
            return Float.parseFloat(com.taobao.tbpoplayer.info.a.a().S());
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("getBigScreenAspectRatio.error", th);
            return 0.0f;
        }
    }
}
