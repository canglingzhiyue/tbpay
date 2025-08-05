package com.taobao.themis.container.app.page.swiper;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.tbz;
import tb.tcb;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/taobao/themis/container/app/page/swiper/SwiperListenerExtension;", "Lcom/taobao/themis/kernel/extension/instance/ISwiperListenerExtension;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Lcom/taobao/themis/kernel/TMSInstance;)V", "getInstance", "()Lcom/taobao/themis/kernel/TMSInstance;", "instanceSwiperListeners", "", "Lcom/taobao/themis/kernel/extension/page/swiper/ISwiperSwitchListener;", "getSwiperListeners", "onUnRegister", "", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b implements tbz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<tcb> f22376a;
    private final f b;

    static {
        kge.a(319587914);
        kge.a(561863416);
    }

    public b(f instance) {
        q.d(instance, "instance");
        this.b = instance;
        this.f22376a = new CopyOnWriteArrayList();
    }

    @Override // tb.sud
    public void a(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb8a2d", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        tbz.a.a(this, instance);
    }

    @Override // tb.tbz
    public List<tcb> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f22376a;
    }

    @Override // tb.sud
    public void bQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfab7697", new Object[]{this});
        } else {
            this.f22376a.clear();
        }
    }
}
