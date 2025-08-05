package com.taobao.android.sku.pad;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.detail.industry.tool.DIConstants;
import com.taobao.android.sku.presenter.c;
import com.taobao.android.sku.presenter.e;
import com.taobao.android.sku.widget.b;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.scq;
import tb.scs;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 (2\u00020\u0001:\u0001(B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J8\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010!\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010#\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0013H\u0016J\b\u0010'\u001a\u00020\u0010H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/taobao/android/sku/pad/PadSkuDialog;", "Lcom/taobao/android/sku/widget/SkuDialogWrapper$ISkuDialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "backPressedListener", "Lcom/taobao/android/sku/presenter/AliXSkuPresenterEngine$OnBackPressedListener;", "getContext", "()Landroid/content/Context;", "dismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "fragmentId", "", "padSkuFragment", "Lcom/taobao/android/sku/pad/PadSkuFragment;", "dismiss", "", "initWindow", "widthDimens", "", "heightDimens", "gravity", "xOff", "yOff", "animRes", "isShowing", "", "registerPresenterLifecycleCallback", DIConstants.EVENT_NAME_LIFE_CYCLE, "Lcom/taobao/android/sku/presenter/IAliXSkuPresenterLifecycle;", "setContentView", "view", "Landroid/view/View;", "setOnBackPressedListener", "onBackPressedListener", "setOnDismissListener", DataReceiveMonitor.CB_LISTENER, "setThemeResId", "themeResId", "show", "Companion", "detail-sku_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public class a implements b.InterfaceC0583b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0582a Companion;
    private static final AtomicInteger f;

    /* renamed from: a  reason: collision with root package name */
    private final PadSkuFragment f15186a;
    private final String b;
    private DialogInterface.OnDismissListener c;
    private c.a d;
    private final Context e;

    public a(Context context) {
        q.d(context, "context");
        this.e = context;
        this.f15186a = new PadSkuFragment();
        this.b = "pad-" + f.incrementAndGet();
        Bundle bundle = new Bundle();
        bundle.putString("stdPopPopId", this.b);
        boolean z = false;
        bundle.putBoolean("stdPopPanEnable", false);
        bundle.putBoolean("stdPopBlockHandleBack", true);
        bundle.putBoolean("stdPopHandleBack", true);
        if (!com.taobao.android.sku.pad.b.INSTANCE.b(this.e)) {
            bundle.putBoolean("useDrawerMode", (!com.taobao.android.sku.pad.b.INSTANCE.b() || com.taobao.android.sku.pad.b.INSTANCE.e(this.e)) ? true : z);
        }
        this.f15186a.setArguments(bundle);
    }

    public static final /* synthetic */ c.a a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c.a) ipChange.ipc$dispatch("1804c47a", new Object[]{aVar}) : aVar.d;
    }

    public static final /* synthetic */ DialogInterface.OnDismissListener b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DialogInterface.OnDismissListener) ipChange.ipc$dispatch("89169093", new Object[]{aVar}) : aVar.c;
    }

    public static final /* synthetic */ PadSkuFragment c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PadSkuFragment) ipChange.ipc$dispatch("e50c1c4f", new Object[]{aVar}) : aVar.f15186a;
    }

    @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f15186a.isVisible();
    }

    @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f15186a.setStyle(0, i);
        }
    }

    @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.f15186a.setContentView(view);
        }
    }

    @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
    public void a(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b020d788", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        } else {
            this.f15186a.initWindow(i, i2, i3, i4, i5, i6);
        }
    }

    @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f15186a.isVisible()) {
        } else {
            scs.a(this.e, this.f15186a, new b());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/taobao/android/sku/pad/PadSkuDialog$show$1", "Lcom/taobao/android/stdpop/api/Callback;", "onBlockBackDismissed", "", "data", "Lcom/alibaba/fastjson/JSONObject;", "onClose", "detail-sku_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    public static final class b implements scq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.scq
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                return;
            }
            c.a a2 = a.a(a.this);
            if (a2 != null && a2.a()) {
                return;
            }
            a.this.c();
        }

        @Override // tb.scq
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
                return;
            }
            DialogInterface.OnDismissListener b = a.b(a.this);
            if (b == null) {
                return;
            }
            b.onDismiss(a.c(a.this).getDialog());
        }
    }

    @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            scs.a(this.e, this.b);
        }
    }

    @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
    public void a(DialogInterface.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564309e3", new Object[]{this, onDismissListener});
        } else {
            this.c = onDismissListener;
        }
    }

    @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
    public void a(c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6adbbec3", new Object[]{this, aVar});
        } else {
            this.d = aVar;
        }
    }

    @Override // com.taobao.android.sku.widget.b.InterfaceC0583b
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de48d75e", new Object[]{this, eVar});
        } else {
            this.f15186a.setPresenterLifecycleCallback(eVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/android/sku/pad/PadSkuDialog$Companion;", "", "()V", "atomicIncreaseId", "Ljava/util/concurrent/atomic/AtomicInteger;", "getAtomicIncreaseId", "()Ljava/util/concurrent/atomic/AtomicInteger;", "detail-sku_release"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.taobao.android.sku.pad.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0582a {
        static {
            kge.a(-1831497957);
        }

        private C0582a() {
        }

        public /* synthetic */ C0582a(o oVar) {
            this();
        }
    }

    static {
        kge.a(-1160396909);
        kge.a(-811237844);
        Companion = new C0582a(null);
        f = new AtomicInteger(0);
    }
}
