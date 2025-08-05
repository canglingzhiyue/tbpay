package tb;

import com.alibaba.ariver.kernel.RVConstants;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.metaInfo.appinfo.a;
import com.taobao.themis.kernel.utils.n;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.sud;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/taobao/themis/canvas/extension/instance/TMSGameForceUpdateExtension;", "Lcom/taobao/themis/kernel/extension/instance/IExtension;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Lcom/taobao/themis/kernel/TMSInstance;)V", "getInstance", "()Lcom/taobao/themis/kernel/TMSInstance;", "mAppInfoUpdateListener", "Lcom/taobao/themis/kernel/metaInfo/appinfo/AppInfoManager$AppInfoUpdateListener;", "mUpdateGuide", "Lcom/taobao/themis/canvas/ui/GameForceUpdateGuide;", "onUnRegister", "", "Companion", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class xph implements sud {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "TMSGameForceUpdateExtension";

    /* renamed from: a  reason: collision with root package name */
    private a.InterfaceC0946a f34458a;
    private com.taobao.themis.canvas.ui.a b;
    private final f c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/canvas/extension/instance/TMSGameForceUpdateExtension$1", "Lcom/taobao/themis/kernel/metaInfo/appinfo/AppInfoManager$AppInfoUpdateListener;", "onUpdate", "", RVConstants.EXTRA_APPINFO, "Lcom/alibaba/ariver/resource/api/models/AppModel;", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: tb.xph$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static final class AnonymousClass1 implements a.InterfaceC0946a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass1() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00f7, code lost:
            if (r2 == null) goto L49;
         */
        @Override // com.taobao.themis.kernel.metaInfo.appinfo.a.InterfaceC0946a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(com.alibaba.ariver.resource.api.models.AppModel r9) {
            /*
                Method dump skipped, instructions count: 353
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.xph.AnonymousClass1.a(com.alibaba.ariver.resource.api.models.AppModel):void");
        }
    }

    static {
        kge.a(-770899250);
        kge.a(-1612991580);
        Companion = new a(null);
    }

    public xph(f instance) {
        q.d(instance, "instance");
        this.c = instance;
        this.f34458a = new AnonymousClass1();
        if (n.INSTANCE.ca()) {
            com.taobao.themis.kernel.metaInfo.appinfo.a.a().a(this.f34458a);
        }
    }

    public static final /* synthetic */ com.taobao.themis.canvas.ui.a a(xph xphVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.canvas.ui.a) ipChange.ipc$dispatch("4a70cfd2", new Object[]{xphVar}) : xphVar.b;
    }

    public static final /* synthetic */ void a(xph xphVar, com.taobao.themis.canvas.ui.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("163d4212", new Object[]{xphVar, aVar});
        } else {
            xphVar.b = aVar;
        }
    }

    public final f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("52d36a33", new Object[]{this}) : this.c;
    }

    @Override // tb.sud
    public void a(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb8a2d", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        sud.a.a(this, instance);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/canvas/extension/instance/TMSGameForceUpdateExtension$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(2093630614);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // tb.sud
    public void bQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfab7697", new Object[]{this});
            return;
        }
        a.InterfaceC0946a interfaceC0946a = this.f34458a;
        if (interfaceC0946a == null) {
            return;
        }
        com.taobao.themis.kernel.metaInfo.appinfo.a.a().b(interfaceC0946a);
    }
}
