package com.taobao.themis.widget.group;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.svr;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/taobao/themis/widget/group/ClusterWidgetSizeExtension;", "Lcom/taobao/themis/kernel/extension/instance/IClusterWidgetSizeExtension;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Lcom/taobao/themis/kernel/TMSInstance;)V", "getInstance", "()Lcom/taobao/themis/kernel/TMSInstance;", "getRealHeight", "", "()Ljava/lang/Float;", "getRealWidth", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a implements svr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final f f22927a;

    static {
        kge.a(-2018953915);
        kge.a(651386939);
    }

    public a(f instance) {
        q.d(instance, "instance");
        this.f22927a = instance;
    }

    @Override // tb.sud
    public void a(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb8a2d", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        svr.a.a(this, instance);
    }

    @Override // tb.sud
    public void bQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfab7697", new Object[]{this});
        } else {
            svr.a.b(this);
        }
    }

    @Override // tb.svr
    public Float a() {
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("62a8d0b1", new Object[]{this});
        }
        com.taobao.themis.external.embed.a aVar = (com.taobao.themis.external.embed.a) this.f22927a.a(com.taobao.themis.external.embed.a.class);
        if (aVar != null && (b = aVar.b()) >= 0) {
            return Float.valueOf(b);
        }
        return null;
    }

    @Override // tb.svr
    public Float b() {
        int c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("6f41c632", new Object[]{this});
        }
        com.taobao.themis.external.embed.a aVar = (com.taobao.themis.external.embed.a) this.f22927a.a(com.taobao.themis.external.embed.a.class);
        if (aVar != null && (c = aVar.c()) >= 0) {
            return Float.valueOf(c);
        }
        return null;
    }
}
