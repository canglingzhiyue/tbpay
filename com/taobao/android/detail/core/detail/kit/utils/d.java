package com.taobao.android.detail.core.detail.kit.utils;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.tstudio.TStudioHelper;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.trade.event.Event;
import java.lang.ref.WeakReference;
import java.util.List;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-804563737);
        emu.a("com.taobao.android.detail.core.detail.kit.utils.EventUtils");
    }

    public static void a(Context context, com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar, View view, List<Event> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1def057b", new Object[]{context, bVar, view, list});
        } else if (view == null || list == null || list.isEmpty()) {
        } else {
            view.setOnClickListener(new a(context, bVar, list));
        }
    }

    /* loaded from: classes4.dex */
    public static class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f9546a;
        public List<Event> b;
        public com.taobao.android.detail.datasdk.model.viewmodel.main.b c;
        public WeakReference<Object> d;

        static {
            kge.a(-2016507238);
            kge.a(-1201612728);
        }

        public a(Context context, com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar, List<Event> list) {
            this.f9546a = context;
            this.b = list;
            this.c = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List<Event> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TStudioHelper a2 = TStudioHelper.a();
            com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar = this.c;
            if (a2.a(DXRootView.class, view, bVar != null ? bVar.dmComponent : null, true) || (list = this.b) == null || list.isEmpty()) {
                return;
            }
            for (Event event : this.b) {
                com.taobao.android.trade.event.f.a(this.f9546a).a(event);
            }
            WeakReference<Object> weakReference = this.d;
            if (weakReference == null) {
                return;
            }
            weakReference.get();
        }
    }
}
