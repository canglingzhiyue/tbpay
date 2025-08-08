package tb;

import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.f;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.order.core.OrderConfigs;
import kotlin.Metadata;
import kotlin.collections.g;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J5\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/taobao/android/megautils/perform/dx/DXMultiRunModeEventChainHandler;", "Lcom/taobao/android/dinamicx/eventchain/DXEventChainEventHandler;", "()V", OrderConfigs.RECYCLERVIEW, "Landroid/support/v7/widget/RecyclerView;", "getRecyclerView", "()Landroid/support/v7/widget/RecyclerView;", "setRecyclerView", "(Landroid/support/v7/widget/RecyclerView;)V", "handleEvent", "", "event", "Lcom/taobao/android/dinamicx/expression/event/DXEvent;", "args", "", "", "runtimeContext", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "(Lcom/taobao/android/dinamicx/expression/event/DXEvent;[Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)V", "megaUtils_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public class hta extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RecyclerView b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ DXEvent b;
        public final /* synthetic */ Object[] c;
        public final /* synthetic */ DXRuntimeContext d;

        public a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            this.b = dXEvent;
            this.c = objArr;
            this.d = dXRuntimeContext;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                hta.a(hta.this, this.b, this.c, this.d);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/android/megautils/perform/dx/DXMultiRunModeEventChainHandler$handleEvent$2", "Ljava/lang/Runnable;", "run", "", "megaUtils_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ DXEvent b;
        public final /* synthetic */ Object[] c;
        public final /* synthetic */ DXRuntimeContext d;

        public b(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            this.b = dXEvent;
            this.c = objArr;
            this.d = dXRuntimeContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (hta.this.a() == null || ((a2 = hta.this.a()) != null && a2.getScrollState() == 0)) {
                hta.a(hta.this, this.b, this.c, this.d);
            } else {
                fxe.a(this);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(hta htaVar, String str, Object... objArr) {
        if (str.hashCode() == -103056537) {
            super.handleEvent((DXEvent) objArr[0], (Object[]) objArr[1], (DXRuntimeContext) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ void a(hta htaVar, DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f7f31d", new Object[]{htaVar, dXEvent, objArr, dXRuntimeContext});
        } else {
            super.handleEvent(dXEvent, objArr, dXRuntimeContext);
        }
    }

    public final RecyclerView a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("f629a75c", new Object[]{this}) : this.b;
    }

    public final void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
        } else {
            this.b = recyclerView;
        }
    }

    @Override // com.taobao.android.dinamicx.eventchain.f, com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null) {
        } else {
            if ((objArr.length == 0) || objArr[0] == null || StringUtils.isEmpty(String.valueOf(objArr[0]))) {
                return;
            }
            if (objArr.length == 1 || objArr[objArr.length - 1] == null) {
                super.handleEvent(dXEvent, objArr, dXRuntimeContext);
                return;
            }
            String valueOf = String.valueOf(objArr[objArr.length - 1]);
            int hashCode = valueOf.hashCode();
            if (hashCode == -2017976178) {
                if (valueOf.equals("runModePost")) {
                    Object[] array = g.b(objArr, 1).toArray(new Object[0]);
                    if (array != null) {
                        fxe.a(new a(dXEvent, array, dXRuntimeContext));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else if (hashCode == 2112570534 && valueOf.equals("runModeRvIdle")) {
                Object[] array2 = g.b(objArr, 1).toArray(new Object[0]);
                if (array2 != null) {
                    fxe.a(new b(dXEvent, array2, dXRuntimeContext));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            super.handleEvent(dXEvent, objArr, dXRuntimeContext);
        }
    }
}
