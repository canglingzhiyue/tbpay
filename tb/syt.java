package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.h;
import com.taobao.android.detail.ttdetail.communication.c;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes5.dex */
public class syt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1462195026);
    }

    public static void a(Context context, e eVar, View view, List<com.taobao.android.detail.ttdetail.communication.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8dcf4c", new Object[]{context, eVar, view, list});
        } else if (view == null || list == null || list.isEmpty()) {
        } else {
            view.setOnClickListener(new a(context, eVar, list));
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f33964a;
        public List<com.taobao.android.detail.ttdetail.communication.a> b;
        public e c;
        public WeakReference<Object> d;

        static {
            kge.a(412613107);
            kge.a(-1201612728);
        }

        public a(Context context, e eVar, List<com.taobao.android.detail.ttdetail.communication.a> list) {
            this.f33964a = context;
            this.b = list;
            this.c = eVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            List<com.taobao.android.detail.ttdetail.communication.a> list = this.b;
            if (list == null || list.isEmpty()) {
                return;
            }
            for (com.taobao.android.detail.ttdetail.communication.a aVar : this.b) {
                if (aVar instanceof h) {
                    c.a(this.f33964a, aVar);
                }
            }
            WeakReference<Object> weakReference = this.d;
            if (weakReference == null) {
                return;
            }
            weakReference.get();
        }
    }
}
