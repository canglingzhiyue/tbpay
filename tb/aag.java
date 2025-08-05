package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.boc;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/alibaba/android/icart/core/performance/preloader/task/impl/CartDXPreloader;", "Lcom/alibaba/android/icart/core/performance/preloader/task/AbsCartPreloader;", "Lcom/taobao/android/dinamicx/DinamicXEngineRouter;", "()V", "mDXEngineRouter", "destroy", "", "getAndRemove", "remove", "", "preload", "context", "Landroid/content/Context;", "Companion", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class aag extends idl<bd> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private bd f25175a;

    static {
        kge.a(2031805948);
        Companion = new a(null);
    }

    @JvmStatic
    public static final boc a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (boc) ipChange.ipc$dispatch("b155ca9c", new Object[]{context, new Boolean(z)}) : Companion.a(context, z);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, com.taobao.android.dinamicx.bd] */
    @Override // tb.idl
    public /* synthetic */ bd a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ff610946", new Object[]{this, new Boolean(z)}) : b(z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, d2 = {"Lcom/alibaba/android/icart/core/performance/preloader/task/impl/CartDXPreloader$Companion;", "", "()V", "createDXBuilder", "Lcom/taobao/android/dinamicx/DXEngineConfig$Builder;", "enableSmoothButter", "", "enableButter", "template", "Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "getDXEngineConfig", "Lcom/alibaba/android/ultron/vfw/dinamicx/UltronDxEngineConfig;", "context", "Landroid/content/Context;", "isTaobaoCart", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(53511748);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public static final /* synthetic */ DXEngineConfig.a a(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXEngineConfig.a) ipChange.ipc$dispatch("d672295d", new Object[]{aVar, new Boolean(z)}) : aVar.a(z);
        }

        @JvmStatic
        public final boc a(Context context, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (boc) ipChange.ipc$dispatch("b155ca9c", new Object[]{this, context, new Boolean(z)});
            }
            q.d(context, "context");
            boc a2 = new boc.a().a(32).a("iCart").a(true).a((bd) hoo.a((Class<? extends idl<Object>>) aag.class, true)).b((int) bet.c(context)).a(new C1085a()).a(a(z)).a();
            q.b(a2, "builder.dxConfigBuilder(…er(isTaobaoCart)).build()");
            return a2;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/alibaba/android/icart/core/performance/preloader/task/impl/CartDXPreloader$Companion$getDXEngineConfig$builder$1", "Lcom/alibaba/android/ultron/vfw/dinamicx/UltronDxEngineConfig$Callback;", "enableButter", "", "template", "Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "onDXEngineCreated", "", "context", "Landroid/content/Context;", "dxEngineRouter", "Lcom/taobao/android/dinamicx/DinamicXEngineRouter;", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
        /* renamed from: tb.aag$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C1085a extends boc.b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.boc.b
            public void a(Context context, bd dxEngineRouter) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fd794b9a", new Object[]{this, context, dxEngineRouter});
                    return;
                }
                q.d(dxEngineRouter, "dxEngineRouter");
                aaf.a(context, dxEngineRouter);
            }

            @Override // tb.boc.b
            public boolean a(DXTemplateItem template) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("3a042615", new Object[]{this, template})).booleanValue();
                }
                q.d(template, "template");
                return aag.Companion.a(template);
            }
        }

        public final boolean a(DXTemplateItem template) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3a042615", new Object[]{this, template})).booleanValue();
            }
            q.d(template, "template");
            String f = template.f();
            if (f == null) {
                return false;
            }
            return aad.b(f);
        }

        private final DXEngineConfig.a a(boolean z) {
            IpChange ipChange = $ipChange;
            boolean z2 = false;
            if (ipChange instanceof IpChange) {
                return (DXEngineConfig.a) ipChange.ipc$dispatch("b660b5b1", new Object[]{this, new Boolean(z)});
            }
            DXEngineConfig.a aVar = new DXEngineConfig.a("iCart");
            if (z && aad.INSTANCE.a()) {
                z2 = true;
            }
            aVar.j(z2);
            if (1 == bbx.f.f25741a && jqi.a("iCart", "enableDowngradeQualityOnLowLevelDevice", true)) {
                aVar.a(DXEngineConfig.ImageQuality.q50);
            }
            return aVar;
        }
    }

    @Override // tb.idl
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (this.f25175a != null) {
        } else {
            this.f25175a = new bd(a.a(Companion, true).b(2).d(32).a("iCart").a(true).a());
            jqg.b("iCart", "CartDXPreloader预加载成功");
        }
    }

    public bd b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bd) ipChange.ipc$dispatch("4efd9765", new Object[]{this, new Boolean(z)});
        }
        bd bdVar = this.f25175a;
        if (z) {
            this.f25175a = null;
        }
        return bdVar;
    }

    @Override // tb.idl
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f25175a = null;
        }
    }
}
