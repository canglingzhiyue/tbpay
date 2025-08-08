package tb;

import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.instance.d;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.b;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.order.core.OrderConfigs;
import java.lang.ref.WeakReference;
import tb.bxb;

/* loaded from: classes2.dex */
public class boi extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HANDLEDINAMICXPAGEEVENT = -5008555633947216625L;

    /* renamed from: a  reason: collision with root package name */
    private static WeakReference<d> f26020a;
    private static WeakReference<OrderConfigs> b;
    private boolean c;

    static {
        kge.a(1179594703);
    }

    public static /* synthetic */ Object ipc$super(boi boiVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(boi boiVar, DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0ace544", new Object[]{boiVar, dXEvent, objArr, dXRuntimeContext});
        } else {
            boiVar.a(dXEvent, objArr, dXRuntimeContext);
        }
    }

    public static /* synthetic */ void a(boi boiVar, DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f07610", new Object[]{boiVar, dXEvent, objArr, dXRuntimeContext, new Boolean(z)});
        } else {
            boiVar.a(dXEvent, objArr, dXRuntimeContext, z);
        }
    }

    public static /* synthetic */ boolean a(boi boiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e21cc7a0", new Object[]{boiVar})).booleanValue() : boiVar.c;
    }

    public static /* synthetic */ RecyclerView b(boi boiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("b8067407", new Object[]{boiVar}) : boiVar.a();
    }

    public boi(d dVar, OrderConfigs orderConfigs) {
        f26020a = new WeakReference<>(dVar);
        b = new WeakReference<>(orderConfigs);
        this.c = ibl.r();
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(final DXEvent dXEvent, final Object[] objArr, final DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        try {
            if (spk.a(iro.ORANGE_KEY_MY_TAOBAO, "enableHandleEventReport", true) && objArr.length > 0 && dXRuntimeContext.e() != null && dXRuntimeContext.e().get("tag") != null) {
                String obj = dXRuntimeContext.e().get("tag").toString();
                String obj2 = objArr[0].toString();
                if (!bki.a().contains(obj2)) {
                    bxb.a(bxb.a.b(OrderBizCode.orderList, obj + "_" + obj2).a(spk.a(iro.ORANGE_KEY_MY_TAOBAO, "handleEventReportSampling", 0.001f)).a(dXRuntimeContext.e().toString()));
                }
            }
        } catch (Exception unused) {
        }
        bkd.a("DinamicXPageEventDispatcherV3", "handleEvent", String.valueOf(objArr));
        final boolean z = objArr != null && objArr.length > 0 && (objArr[0] instanceof String);
        if (z && b.a(dXRuntimeContext, (String) objArr[0]) != null) {
            if (objArr.length > 1 && "runModePost".equals(objArr[objArr.length - 1])) {
                objArr[objArr.length - 1] = null;
                fxe.a(new Runnable() { // from class: tb.boi.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (!boi.a(boi.this)) {
                            boi.a(boi.this, dXEvent, objArr, dXRuntimeContext);
                        } else {
                            RecyclerView b2 = boi.b(boi.this);
                            if (b2 == null || b2.getScrollState() == 0) {
                                boi.a(boi.this, dXEvent, objArr, dXRuntimeContext);
                            } else {
                                fxe.a(this);
                            }
                        }
                    }
                });
                return;
            }
            a(dXEvent, objArr, dXRuntimeContext);
            return;
        }
        if ("runModePost".equals((objArr == null || objArr.length <= 2) ? "normal" : (String) objArr[objArr.length - 1])) {
            objArr[objArr.length - 1] = null;
            fxe.a(new Runnable() { // from class: tb.boi.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!boi.a(boi.this)) {
                        boi.a(boi.this, dXEvent, objArr, dXRuntimeContext, z);
                    } else {
                        RecyclerView b2 = boi.b(boi.this);
                        if (b2 == null || b2.getScrollState() == 0) {
                            boi.a(boi.this, dXEvent, objArr, dXRuntimeContext, z);
                        } else {
                            fxe.a(this);
                        }
                    }
                }
            });
            return;
        }
        a(dXEvent, objArr, dXRuntimeContext, z);
    }

    private void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dd72af8", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        new b().handleEvent(dXEvent, objArr, dXRuntimeContext);
        bkd.a("DinamicXPageEventDispatcherV3", "handleEvent", "handle event by EventChainHandler");
        if (objArr == null || objArr.length == 0 || StringUtils.isEmpty(objArr[0].toString())) {
            return;
        }
        fkg.a(objArr[0].toString(), dXRuntimeContext);
    }

    private RecyclerView a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("f629a75c", new Object[]{this});
        }
        OrderConfigs orderConfigs = b.get();
        if (orderConfigs == null) {
            return null;
        }
        ViewGroup viewGroup = orderConfigs.c().get(OrderConfigs.RECYCLERVIEW);
        if (!(viewGroup instanceof RecyclerView)) {
            return null;
        }
        return (RecyclerView) viewGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.taobao.android.dinamicx.expression.event.DXEvent r13, java.lang.Object[] r14, com.taobao.android.dinamicx.DXRuntimeContext r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.boi.a(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext, boolean):void");
    }
}
