package com.taobao.android.order.core.subscriber.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.vessel.VesselView;
import java.util.Map;
import tb.kge;
import tb.rgu;
import tb.rgy;

@Deprecated
/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CLOSE_FULL_SCREEN_VESSEL = "closeFullWebView";
    public static final String ACTION_HIDE_CLOSE_ICON = "hideCloseIcon";

    /* renamed from: a */
    private Context f14638a;
    private a b;
    private String c;
    private VesselView d;
    private View e;
    private DialogInterface.OnDismissListener f;
    private DialogInterface.OnDismissListener g = new DialogInterface.OnDismissListener() { // from class: com.taobao.android.order.core.subscriber.widget.e.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            e.this = this;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                return;
            }
            a aVar = (a) dialogInterface;
            LocalBroadcastManager.getInstance(aVar.getContext()).unregisterReceiver(e.a(e.this));
            LocalBroadcastManager.getInstance(aVar.getContext()).unregisterReceiver(e.b(e.this));
            if (e.c(e.this) != null) {
                e.c(e.this).onDismiss(dialogInterface);
            }
            if (e.d(e.this) == null) {
                return;
            }
            try {
                e.d(e.this).onDestroy();
            } catch (Throwable unused) {
            }
        }
    };
    private BroadcastReceiver h = new BroadcastReceiver() { // from class: com.taobao.android.order.core.subscriber.widget.OrderVesselDialog$2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!"closeFullWebView".equals(intent.getAction())) {
            } else {
                e.this.a();
                LocalBroadcastManager.getInstance(context).unregisterReceiver(e.a(e.this));
            }
        }
    };
    private BroadcastReceiver i = new BroadcastReceiver() { // from class: com.taobao.android.order.core.subscriber.widget.OrderVesselDialog$3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!"hideCloseIcon".equals(intent.getAction()) || e.e(e.this) == null) {
            } else {
                e.e(e.this).setVisibility(8);
                LocalBroadcastManager.getInstance(context).unregisterReceiver(e.b(e.this));
            }
        }
    };

    static {
        kge.a(1883665132);
    }

    public static /* synthetic */ BroadcastReceiver a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BroadcastReceiver) ipChange.ipc$dispatch("f7c62d0b", new Object[]{eVar}) : eVar.h;
    }

    public static /* synthetic */ BroadcastReceiver b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BroadcastReceiver) ipChange.ipc$dispatch("2fb7082a", new Object[]{eVar}) : eVar.i;
    }

    public static /* synthetic */ DialogInterface.OnDismissListener c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DialogInterface.OnDismissListener) ipChange.ipc$dispatch("c279404d", new Object[]{eVar}) : eVar.f;
    }

    public static /* synthetic */ VesselView d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VesselView) ipChange.ipc$dispatch("5efb4953", new Object[]{eVar}) : eVar.d;
    }

    public static /* synthetic */ View e(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("cd0f5dd2", new Object[]{eVar}) : eVar.e;
    }

    public static /* synthetic */ a f(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("d8fe839f", new Object[]{eVar}) : eVar.b;
    }

    private e() {
    }

    public e(Context context) {
        this.f14638a = context;
        if (context != null) {
            this.b = new a(context);
            this.d = new VesselView(this.f14638a);
            this.b.setOnDismissListener(this.g);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("closeFullWebView");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            LocalBroadcastManager.getInstance(context).registerReceiver(this.h, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("hideCloseIcon");
            intentFilter2.addCategory("android.intent.category.DEFAULT");
            LocalBroadcastManager.getInstance(context).registerReceiver(this.i, intentFilter2);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        this.c = str;
        b();
        c();
        d();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a(R.layout.order_vessel_dialog, -1, -1, 17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        ViewGroup viewGroup = (ViewGroup) this.b.findViewById(R.id.order_vessel_container);
        viewGroup.addView(this.d, layoutParams);
        View inflate = LayoutInflater.from(this.f14638a).inflate(R.layout.order_vessel_close, viewGroup, false);
        viewGroup.addView(inflate);
        this.e = inflate;
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.order.core.subscriber.widget.e.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                e.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    e.f(e.this).dismiss();
                }
            }
        });
        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.order.core.subscriber.widget.e.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                e.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    e.f(e.this).dismiss();
                }
            }
        });
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        VesselView vesselView = this.d;
        if (vesselView == null) {
            return;
        }
        vesselView.setOnLoadListener(new rgu() { // from class: com.taobao.android.order.core.subscriber.widget.e.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rgu
            public void onDowngrade(rgy rgyVar, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("775d4b7c", new Object[]{this, rgyVar, map});
                }
            }

            @Override // tb.rgu
            public void onLoadError(rgy rgyVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d36981b6", new Object[]{this, rgyVar});
                }
            }

            @Override // tb.rgu
            public void onLoadFinish(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c38c0593", new Object[]{this, view});
                }
            }

            @Override // tb.rgu
            public void onLoadStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f829aa04", new Object[]{this});
                }
            }

            {
                e.this = this;
            }
        });
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        VesselView vesselView = this.d;
        if (vesselView == null) {
            return;
        }
        vesselView.loadUrl(this.c);
    }

    public void a(DialogInterface.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564309e3", new Object[]{this, onDismissListener});
        } else {
            this.f = onDismissListener;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.dismiss();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        a aVar = this.b;
        if (aVar == null || aVar.isShowing()) {
            return;
        }
        b(str);
    }
}
