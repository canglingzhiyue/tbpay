package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.exception.a;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.monitor.b;
import com.taobao.android.dinamicx.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import tb.fzg;

/* loaded from: classes5.dex */
public class fxu implements fzg.b<Integer, WeakReference<View>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ORIENTATION_IDLE = 0;
    public static final int ORIENTATION_SCROLL_TO_BOTTOM = 1;
    public static final int ORIENTATION_SCROLL_TO_TOP = -1;

    /* renamed from: a  reason: collision with root package name */
    private final fxy<fxw, fym> f28197a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private int f;
    private int g;
    private final String h;

    static {
        kge.a(944633845);
        kge.a(786118440);
    }

    public fxu(fxy<fxw, fym> fxyVar, String str) {
        this(fxyVar, false, false, false, false, str);
    }

    public fxu(fxy<fxw, fym> fxyVar, boolean z, boolean z2, boolean z3, boolean z4, String str) {
        this.f = 0;
        this.g = 0;
        this.f28197a = fxyVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.h = str;
    }

    @Override // tb.fzg.b
    public void a(fyr<Integer, WeakReference<View>> fyrVar, String str, RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3444a451", new Object[]{this, fyrVar, str, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        this.f = i;
        this.g = i2;
    }

    @Override // tb.fzg.b
    public void a(fyr<Integer, WeakReference<View>> fyrVar, String str, RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8e96cf2", new Object[]{this, fyrVar, str, recyclerView, new Integer(i)});
        } else if (this.b || i != 0) {
        } else {
            if (this.d) {
                if (this.e) {
                    a(fyrVar, str);
                    return;
                } else {
                    fyrVar.b(str);
                    return;
                }
            }
            fyrVar.c();
        }
    }

    @Override // tb.fzg.b
    public void a(fyr<Integer, WeakReference<View>> fyrVar, String str, RecyclerView recyclerView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23ccb501", new Object[]{this, fyrVar, str, recyclerView, view});
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        WeakReference<View> weakReference = new WeakReference<>(view);
        fyrVar.a((fyr<Integer, WeakReference<View>>) Integer.valueOf(childAdapterPosition), (Integer) weakReference);
        if (this.c) {
            return;
        }
        fyrVar.a((fyr<Integer, WeakReference<View>>) Integer.valueOf(childAdapterPosition), (Integer) weakReference, str);
    }

    @Override // tb.fzg.b
    public void b(fyr<Integer, WeakReference<View>> fyrVar, String str, RecyclerView recyclerView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bbd9020", new Object[]{this, fyrVar, str, recyclerView, view});
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            if (this.f28197a == null) {
                return;
            }
            for (Integer num : fyrVar.a().keySet()) {
                View view2 = null;
                if (fqi.ah()) {
                    try {
                        view2 = recyclerView.getLayoutManager().findViewByPosition(num.intValue());
                    } catch (Throwable th) {
                        a.b(th);
                        s sVar = new s(this.h);
                        sVar.c = new ArrayList();
                        sVar.c.add(new s.a(DXMonitorConstant.DX_VIDEO_CONTROL, DXMonitorConstant.DX_VIDEO_CONTROL_FIND_VIEW_POSITION_CRASH, s.DX_ERROR_VIDEOC_FIND_VIEW_POSITION));
                        b.a(sVar);
                    }
                } else {
                    view2 = recyclerView.getLayoutManager().findViewByPosition(num.intValue());
                }
                if (view2 == null || recyclerView.getChildAdapterPosition(view2) != num.intValue()) {
                    fyrVar.a((fyr<Integer, WeakReference<View>>) num, str, false);
                } else {
                    fyrVar.a((fyr<Integer, WeakReference<View>>) num, (Integer) new WeakReference<>(view2));
                }
            }
            this.f28197a.a(str);
            if (this.e) {
                a(fyrVar, str);
                return;
            } else {
                fyrVar.a(str);
                return;
            }
        }
        fyrVar.c(Integer.valueOf(childAdapterPosition), str);
        if (this.c) {
            fyrVar.a((fyr<Integer, WeakReference<View>>) Integer.valueOf(childAdapterPosition), str, false);
            fxy<fxw, fym> fxyVar = this.f28197a;
            if (fxyVar == null) {
                return;
            }
            fxyVar.a(new fxw(childAdapterPosition, -1L, new WeakReference(view)), str, false);
            return;
        }
        fyrVar.a((fyr<Integer, WeakReference<View>>) Integer.valueOf(childAdapterPosition), str);
    }

    public int a() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        if (this.f == 0 && (i2 = this.g) != 0) {
            return i2 > 0 ? 1 : -1;
        } else if (this.g != 0 || (i = this.f) == 0) {
            return 0;
        } else {
            return i > 0 ? 1 : -1;
        }
    }

    public void a(fyr<Integer, WeakReference<View>> fyrVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5b8a03", new Object[]{this, fyrVar, str});
            return;
        }
        ArrayList arrayList = new ArrayList(fyrVar.b().keySet());
        if (arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList);
        if (a() == -1) {
            Collections.reverse(arrayList);
        }
        fyrVar.a(str, arrayList);
    }
}
