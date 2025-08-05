package com.taobao.android.order.core.subscriber.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.vessel.VesselView;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CLOSE_FULL_SCREEN_VESSEL = "closeFullWebView";
    public static final String ACTION_HIDE_CLOSE_ICON = "hideCloseIcon";

    /* renamed from: a */
    private Context f14643a;
    private PopupWindow b;
    private String c;
    private VesselView d;
    private View e;
    private PopupWindow.OnDismissListener f;
    private View g;
    private BroadcastReceiver h = new BroadcastReceiver() { // from class: com.taobao.android.order.core.subscriber.widget.OrderVesselPopWindow$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!"closeFullWebView".equals(intent.getAction())) {
            } else {
                f.this.a();
                LocalBroadcastManager.getInstance(context).unregisterReceiver(f.a(f.this));
            }
        }
    };
    private BroadcastReceiver i = new BroadcastReceiver() { // from class: com.taobao.android.order.core.subscriber.widget.OrderVesselPopWindow$2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!"hideCloseIcon".equals(intent.getAction()) || f.b(f.this) == null) {
            } else {
                f.b(f.this).setVisibility(8);
                LocalBroadcastManager.getInstance(context).unregisterReceiver(f.c(f.this));
            }
        }
    };

    static {
        kge.a(-301223555);
    }

    public static /* synthetic */ BroadcastReceiver a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BroadcastReceiver) ipChange.ipc$dispatch("5918c9aa", new Object[]{fVar}) : fVar.h;
    }

    public static /* synthetic */ View b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("4422d14", new Object[]{fVar}) : fVar.e;
    }

    public static /* synthetic */ BroadcastReceiver c(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BroadcastReceiver) ipChange.ipc$dispatch("c8fa7fe8", new Object[]{fVar}) : fVar.i;
    }

    public static /* synthetic */ PopupWindow.OnDismissListener d(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow.OnDismissListener) ipChange.ipc$dispatch("9ddf1109", new Object[]{fVar}) : fVar.f;
    }

    public static /* synthetic */ VesselView e(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VesselView) ipChange.ipc$dispatch("94bf72d5", new Object[]{fVar}) : fVar.d;
    }

    public static /* synthetic */ PopupWindow f(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("3cf4c326", new Object[]{fVar}) : fVar.b;
    }

    public f(final Context context) {
        this.f14643a = context;
        if (context != null) {
            this.g = View.inflate(context, R.layout.order_vessel_dialog, null);
            this.b = new PopupWindow();
            this.b.setHeight(-1);
            this.b.setWidth(-1);
            this.b.setOutsideTouchable(true);
            this.b.setTouchable(true);
            this.b.setFocusable(true);
            this.b.setSoftInputMode(16);
            this.b.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.taobao.android.order.core.subscriber.widget.OrderVesselPopWindow$3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
                        return;
                    }
                    LocalBroadcastManager.getInstance(context).unregisterReceiver(f.a(f.this));
                    LocalBroadcastManager.getInstance(context).unregisterReceiver(f.c(f.this));
                    if (f.d(f.this) != null) {
                        f.d(f.this).onDismiss();
                    }
                    if (f.e(f.this) == null) {
                        return;
                    }
                    try {
                        f.e(f.this).onDestroy();
                    } catch (Throwable unused) {
                    }
                }
            });
            this.d = new VesselView(this.f14643a);
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

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        PopupWindow popupWindow = this.b;
        if (popupWindow == null || popupWindow.isShowing()) {
            return;
        }
        b(str);
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
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.b == null) {
        } else {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            this.b.setContentView(this.g);
            ViewGroup viewGroup = (ViewGroup) this.b.getContentView().findViewById(R.id.order_vessel_container);
            viewGroup.addView(this.d, layoutParams);
            View inflate = LayoutInflater.from(this.f14643a).inflate(R.layout.order_vessel_close, viewGroup, false);
            viewGroup.addView(inflate);
            this.e = inflate;
            viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.order.core.subscriber.widget.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    f.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        f.f(f.this).dismiss();
                    }
                }
            });
            inflate.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.order.core.subscriber.widget.f.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    f.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        f.f(f.this).dismiss();
                    }
                }
            });
            this.b.showAtLocation(this.g, 80, 0, 0);
        }
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
        vesselView.loadUrl(this.c);
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d75cf5eb", new Object[]{this, onDismissListener});
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
        PopupWindow popupWindow = this.b;
        if (popupWindow == null) {
            return;
        }
        popupWindow.dismiss();
    }
}
