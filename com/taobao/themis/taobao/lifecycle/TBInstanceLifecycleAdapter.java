package com.taobao.themis.taobao.lifecycle;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.i;
import com.taobao.themis.inside.Initializer.a;
import com.taobao.themis.kernel.adapter.IInstanceLifecycleAdapter;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.utils.t;
import com.uc.webview.export.media.MessageID;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/taobao/themis/taobao/lifecycle/TBInstanceLifecycleAdapter;", "Lcom/taobao/themis/kernel/adapter/IInstanceLifecycleAdapter;", "()V", i.b.MEASURE_ONCREATE, "", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", MessageID.onDestroy, "onPause", "onResume", "onStart", MessageID.onStop, "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TBInstanceLifecycleAdapter implements IInstanceLifecycleAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1131534584);
        kge.a(1325749671);
    }

    @Override // com.taobao.themis.kernel.adapter.IInstanceLifecycleAdapter
    public void onCreate(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd621987", new Object[]{this, instance});
        } else {
            q.d(instance, "instance");
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IInstanceLifecycleAdapter
    public void onPause(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87d02d23", new Object[]{this, instance});
        } else {
            q.d(instance, "instance");
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IInstanceLifecycleAdapter
    public void onResume(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a393cb8", new Object[]{this, instance});
        } else {
            q.d(instance, "instance");
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IInstanceLifecycleAdapter
    public void onStart(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d0e1b8f", new Object[]{this, instance});
        } else {
            q.d(instance, "instance");
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IInstanceLifecycleAdapter
    public void onStop(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0da8c4d", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        if (!t.b(instance.o(), "pauseAndRestartInitTask").b()) {
            return;
        }
        a.e();
        a.f();
        a.g();
        a.h();
    }

    @Override // com.taobao.themis.kernel.adapter.IInstanceLifecycleAdapter
    public void onDestroy(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd83c2e7", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        com.taobao.themis.kernel.preload.a.a();
    }
}
