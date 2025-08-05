package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.ResultCode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import tb.arc;
import tb.idr;
import tb.ijt;

/* loaded from: classes4.dex */
public class jtv implements idr.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final idr b;
    private final Context d;
    private ArrayList<Integer> c = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<Integer, View> f29769a = new ConcurrentHashMap<>();

    static {
        kge.a(-509344289);
        kge.a(-1415614479);
    }

    public jtv(Context context) {
        this.b = new idr(context);
        this.d = context;
    }

    public void a(ArrayList<Integer> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            return;
        }
        this.c = arrayList;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        Iterator<Integer> it = this.c.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (!this.f29769a.containsKey(next)) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        ard a2 = arc.a();
        a2.a("需要加载" + a((List<Integer>) arrayList2), arc.a.a().a("AURA/performance").b());
        this.b.a(arrayList2, true, this);
    }

    private String a(List<Integer> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c38867", new Object[]{this, list});
        }
        try {
            StringBuilder sb = new StringBuilder();
            for (Integer num : list) {
                sb.append(this.d.getResources().getResourceEntryName(num.intValue()));
                sb.append(";");
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            a(this.f29769a.values());
        }
    }

    private void a(Collection<View> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2847c19", new Object[]{this, collection});
            return;
        }
        for (View view : collection) {
            try {
                if (view.getContext() instanceof kxa) {
                    ((kxa) view.getContext()).a(this.d);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                ifz.a("asyncViewException", th.getMessage());
            }
        }
    }

    public View a(Context context, int i, ijt.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("21a68f65", new Object[]{this, context, new Integer(i), aVar});
        }
        View view = null;
        try {
            if (this.f29769a.containsKey(Integer.valueOf(i))) {
                view = this.f29769a.remove(Integer.valueOf(i));
            }
            if (aVar != null && !this.f29769a.containsKey(Integer.valueOf(i))) {
                this.c.contains(Integer.valueOf(i));
            }
            if (view != null && (view.getContext() instanceof kxa)) {
                ((kxa) view.getContext()).a(context);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            ifz.a("getAsyncCacheView", th.getMessage());
        }
        return view;
    }

    @Override // tb.idr.b
    public void a(View view, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c2ccb99", new Object[]{this, view, new Boolean(z), new Integer(i)});
        } else if (view == null) {
        } else {
            ard a2 = arc.a();
            a2.a("异步加载" + this.d.getResources().getResourceEntryName(i) + ResultCode.MSG_SUCCESS, arc.a.a().a("AURA/performance").b());
            this.f29769a.put(Integer.valueOf(i), view);
        }
    }
}
