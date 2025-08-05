package com.taobao.android.order.bundle.helper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.BroadcastAddListenerEventResult;
import com.taobao.android.abilityidl.ability.BroadcastEventResult;
import com.taobao.android.abilityidl.ability.o;
import com.taobao.android.order.core.OrderConfigs;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import tb.ffw;
import tb.ffx;
import tb.hyn;
import tb.ibl;
import tb.iro;
import tb.jqg;
import tb.jzb;
import tb.kge;
import tb.spk;

/* loaded from: classes6.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BROADCAST_ACTION_ORDER_LIST_NEED_REFRESH = "orderListNeedRefreshAction";
    public static final String IMMEDIATELY_REFRESH = "immediatelyRefresh";
    public static final String MEGA_REFRESH_ORDERLIST = "mega_refreshOrderList";
    public static final String MY_TAOBAO_ACTION = "MyTaobao_Order_Refresh";
    public static final String ORDER_ACTION = "orderRefresh";

    static {
        kge.a(-51022649);
    }

    public static void a(String str, Context context, Intent intent, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b659d7", new Object[]{str, context, intent, str2, new Boolean(z)});
        } else if (context == null || TextUtils.isEmpty(str2)) {
        } else {
            if (intent == null) {
                intent = new Intent();
            }
            intent.setAction(str);
            intent.putExtra(str2, true);
            intent.putExtra(IMMEDIATELY_REFRESH, z);
            String packageName = context.getPackageName();
            if (TextUtils.isEmpty(packageName)) {
                packageName = "com.taobao.taobao";
            }
            intent.setPackage(packageName);
            context.sendBroadcast(intent);
        }
    }

    public static void a(String str, Context context, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e121ab4", new Object[]{str, context, str2, new Boolean(z)});
        } else {
            a(str, context, null, str2, z);
        }
    }

    public static void a(Context context, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3a954e7", new Object[]{context, broadcastReceiver});
        } else if (context == null || broadcastReceiver == null) {
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(ORDER_ACTION);
            intentFilter.addAction("orderListNeedRefreshAction");
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public static void b(Context context, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3168cce8", new Object[]{context, broadcastReceiver});
            return;
        }
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (Exception e) {
            hyn.a("unregisterReceiver exception", e.toString(), new String[0]);
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        ffx a2 = ffx.a();
        if (a2 == null) {
            return;
        }
        a2.a(MEGA_REFRESH_ORDERLIST, new a(context));
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        ffx a2 = ffx.a();
        if (a2 == null) {
            return;
        }
        a2.a(MEGA_REFRESH_ORDERLIST, new jzb() { // from class: com.taobao.android.order.bundle.helper.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jzb, tb.gml
            public void a(ErrorResult errorResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a5ed5e", new Object[]{this, errorResult});
                }
            }
        });
    }

    /* loaded from: classes6.dex */
    public static class a implements ffw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<Context> f14540a;

        static {
            kge.a(-218948754);
            kge.a(-1495763774);
        }

        @Override // tb.ffw, tb.gml
        public void a(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, errorResult});
            }
        }

        @Override // tb.ffw, com.taobao.android.abilityidl.ability.bg
        public void a(BroadcastAddListenerEventResult broadcastAddListenerEventResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("afb25af0", new Object[]{this, broadcastAddListenerEventResult});
            }
        }

        public a(Context context) {
            this.f14540a = new WeakReference<>(context);
        }

        @Override // tb.ffw, com.taobao.android.abilityidl.ability.bg
        public void onEvent(BroadcastEventResult broadcastEventResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("560ff2e1", new Object[]{this, broadcastEventResult});
                return;
            }
            Context context = this.f14540a.get();
            if (context == null) {
                return;
            }
            com.taobao.android.order.bundle.helper.a.b(context, true);
        }
    }

    public static void a(OrderConfigs orderConfigs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4366e18", new Object[]{orderConfigs});
        } else if (!ibl.y()) {
            jqg.a("BroadcastHelper", "registerTradeHybridMegaEventBroadcast:", "switcher is off");
        } else {
            ffx a2 = ffx.a();
            if (a2 == null) {
                return;
            }
            if (spk.a(iro.ORANGE_KEY_ORDER_DETAIL, "enableListenRemovePrefetchData", true)) {
                HashMap hashMap = new HashMap();
                hashMap.put("bizId", "TradeHybrid");
                hashMap.put("eventName", "removePrefetchData");
                a2.a(new o(hashMap), new C0557b(orderConfigs));
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("bizId", "TradeHybrid");
            hashMap2.put("eventName", "startTransition");
            a2.a(new o(hashMap2), new c(orderConfigs));
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (!ibl.y()) {
            jqg.a("BroadcastHelper", "unregisterTradeHybridMegaEventBroadcast:", "switcher is off");
        } else {
            ffx a2 = ffx.a();
            if (a2 == null) {
                return;
            }
            if (spk.a(iro.ORANGE_KEY_ORDER_DETAIL, "enableListenRemovePrefetchData", true)) {
                a2.a("removePrefetchData", new jzb() { // from class: com.taobao.android.order.bundle.helper.b.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.jzb, tb.gml
                    public void a(ErrorResult errorResult) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("57a5ed5e", new Object[]{this, errorResult});
                            return;
                        }
                        jqg.a("BroadcastHelper", "removeEventListener:", "removePrefetchData - " + errorResult.toString());
                    }
                });
            }
            a2.a("startTransition", new jzb() { // from class: com.taobao.android.order.bundle.helper.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.jzb, tb.gml
                public void a(ErrorResult errorResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a5ed5e", new Object[]{this, errorResult});
                        return;
                    }
                    jqg.a("BroadcastHelper", "removeEventListener:", "startTransition - " + errorResult.toString());
                }
            });
        }
    }

    /* renamed from: com.taobao.android.order.bundle.helper.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0557b implements ffw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<OrderConfigs> f14541a;

        static {
            kge.a(-817887950);
            kge.a(-1495763774);
        }

        @Override // tb.ffw, tb.gml
        public void a(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, errorResult});
            }
        }

        @Override // tb.ffw, com.taobao.android.abilityidl.ability.bg
        public void a(BroadcastAddListenerEventResult broadcastAddListenerEventResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("afb25af0", new Object[]{this, broadcastAddListenerEventResult});
            }
        }

        public C0557b(OrderConfigs orderConfigs) {
            this.f14541a = new WeakReference<>(orderConfigs);
        }

        @Override // tb.ffw, com.taobao.android.abilityidl.ability.bg
        public void onEvent(BroadcastEventResult broadcastEventResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("560ff2e1", new Object[]{this, broadcastEventResult});
                return;
            }
            OrderConfigs orderConfigs = this.f14541a.get();
            if (orderConfigs != null) {
                orderConfigs.f(true);
            }
            jqg.a("BroadcastHelper", "TradeHybridRemovePrefetchDataEvent:", "onEvent - " + broadcastEventResult.toString());
        }
    }

    /* loaded from: classes6.dex */
    public static class c implements ffw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<OrderConfigs> f14542a;

        static {
            kge.a(-213931482);
            kge.a(-1495763774);
        }

        @Override // tb.ffw, tb.gml
        public void a(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, errorResult});
            }
        }

        @Override // tb.ffw, com.taobao.android.abilityidl.ability.bg
        public void a(BroadcastAddListenerEventResult broadcastAddListenerEventResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("afb25af0", new Object[]{this, broadcastAddListenerEventResult});
            }
        }

        public c(OrderConfigs orderConfigs) {
            this.f14542a = new WeakReference<>(orderConfigs);
        }

        @Override // tb.ffw, com.taobao.android.abilityidl.ability.bg
        public void onEvent(BroadcastEventResult broadcastEventResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("560ff2e1", new Object[]{this, broadcastEventResult});
                return;
            }
            OrderConfigs orderConfigs = this.f14542a.get();
            if (orderConfigs != null) {
                orderConfigs.g(true);
            }
            jqg.a("BroadcastHelper", "TradeHybridStartTransitionEvent:", "onEvent - " + broadcastEventResult.toString());
        }
    }
}
