package com.taobao.android.abilitykit.ability.pop.presenter;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.c;
import com.taobao.android.abilitykit.ability.pop.presenter.d;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.dlr;
import tb.kge;

/* loaded from: classes4.dex */
public final class c<PARAMS extends com.taobao.android.abilitykit.ability.pop.model.c, CONTEXT extends dlr> extends com.taobao.android.abilitykit.ability.pop.presenter.a<PARAMS, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private PopupWindow f8921a;

    /* loaded from: classes4.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            PopupWindow a2 = c.a(c.this);
            if (a2 == null) {
                return;
            }
            a2.dismiss();
        }
    }

    static {
        kge.a(1319815915);
        Companion = new a(null);
    }

    public static final /* synthetic */ PopupWindow a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("6728b544", new Object[]{cVar}) : cVar.f8921a;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.presenter.a
    public boolean a(final PARAMS params, final View container, final View view, final View view2, d.a listener) {
        final Context context;
        View view3;
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34da319b", new Object[]{this, params, container, view, view2, listener})).booleanValue();
        }
        q.d(params, "params");
        q.d(container, "container");
        q.d(listener, "listener");
        WeakReference<Context> a2 = a();
        if (a2 != null && (context = a2.get()) != null) {
            PopupWindow popupWindow = new PopupWindow(context);
            popupWindow.setFocusable(true);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setBackgroundDrawable(null);
            if (params.f8913a.p()) {
                popupWindow.setSoftInputMode(16);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            popupWindow.setWidth(-1);
            popupWindow.setHeight(-1);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.addView(container, layoutParams);
            t tVar = t.INSTANCE;
            popupWindow.setContentView(frameLayout);
            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.taobao.android.abilitykit.ability.pop.presenter.AKPopWindowPresenter$doShow$$inlined$apply$lambda$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                    } else {
                        c.this.c();
                    }
                }
            });
            try {
                if (view2 != null) {
                    popupWindow.showAsDropDown(view2);
                } else {
                    if (!(context instanceof Activity)) {
                        context = null;
                    }
                    Activity activity = (Activity) context;
                    if (activity == null || (window = activity.getWindow()) == null || (view3 = window.getDecorView()) == null) {
                        view3 = view;
                    }
                    popupWindow.showAtLocation(view3, 0, 0, 0);
                }
                t tVar2 = t.INSTANCE;
                this.f8921a = popupWindow;
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.presenter.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        PopupWindow popupWindow = this.f8921a;
        if (popupWindow == null) {
            return;
        }
        q.a(popupWindow);
        if (popupWindow.isShowing()) {
            PopupWindow popupWindow2 = this.f8921a;
            q.a(popupWindow2);
            popupWindow2.dismiss();
            return;
        }
        new Handler(Looper.getMainLooper()).post(new b());
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(582372467);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
