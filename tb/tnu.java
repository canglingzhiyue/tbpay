package tb;

import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.canvas.extension.page.c;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.open.extension.IJSRuntimeFactoryExtension;
import com.taobao.themis.open.extension.b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/taobao/themis/canvas/extension/instance/JSRuntimeFactoryExtension;", "Lcom/taobao/themis/open/extension/IJSRuntimeFactoryExtension;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Lcom/taobao/themis/kernel/TMSInstance;)V", "getInstance", "()Lcom/taobao/themis/kernel/TMSInstance;", "runtimeType", "Lcom/taobao/themis/open/extension/IJSRuntimeFactoryExtension$Type;", "createJSRuntime", "Lcom/taobao/themis/open/extension/IGameJSRuntimeExtension;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "getRuntimeType", "setRuntimeType", "", "type", "Companion", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class tnu implements IJSRuntimeFactoryExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private IJSRuntimeFactoryExtension.Type f34234a;
    private final f b;

    static {
        kge.a(813549083);
        kge.a(-1936268102);
        Companion = new a(null);
    }

    public tnu(f instance) {
        q.d(instance, "instance");
        this.b = instance;
        this.f34234a = IJSRuntimeFactoryExtension.Type.Qking;
    }

    @Override // tb.sud
    public void a(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb8a2d", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        IJSRuntimeFactoryExtension.a.a(this, instance);
    }

    @Override // tb.sud
    public void bQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfab7697", new Object[]{this});
        } else {
            IJSRuntimeFactoryExtension.a.b(this);
        }
    }

    @Override // com.taobao.themis.open.extension.IJSRuntimeFactoryExtension
    public IJSRuntimeFactoryExtension.Type a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IJSRuntimeFactoryExtension.Type) ipChange.ipc$dispatch("155edf19", new Object[]{this}) : this.f34234a;
    }

    @Override // com.taobao.themis.open.extension.IJSRuntimeFactoryExtension
    public void a(IJSRuntimeFactoryExtension.Type type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("807a63d3", new Object[]{this, type});
            return;
        }
        q.d(type, "type");
        TMSLogger.d("JSRuntimeFactoryExtension", "设置JS引擎类型: " + type);
        this.f34234a = type;
    }

    @Override // com.taobao.themis.open.extension.IJSRuntimeFactoryExtension
    public b a(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("9c4bac8f", new Object[]{this, page});
        }
        q.d(page, "page");
        int i = tnv.$EnumSwitchMapping$0[this.f34234a.ordinal()];
        if (i == 1) {
            return new com.taobao.themis.canvas.extension.page.b(page);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return new c(page);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/canvas/extension/instance/JSRuntimeFactoryExtension$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-1943204957);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
