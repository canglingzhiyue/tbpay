package tb;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.lks;

/* loaded from: classes.dex */
public class lnf implements lks.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Field c;
    private static Method d;

    /* renamed from: a  reason: collision with root package name */
    public boolean f30739a;
    public int b;
    private boolean e;
    private IMainFeedsViewService<?> f;

    static {
        kge.a(-1207892427);
        kge.a(439987723);
    }

    @Override // tb.lks.c
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    public lnf(ljs ljsVar) {
        this.f = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (d == null) {
            d = a("checkForGaps", StaggeredGridLayoutManager.class, new Class[0]);
        }
        if (c != null) {
            return;
        }
        c = a("mLaidOutInvalidFullSpan", StaggeredGridLayoutManager.class);
    }

    @Override // tb.lks.c
    public void a(ViewGroup viewGroup, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75913347", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
        } else {
            b(viewGroup, i2);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.f30739a = true;
        this.b = i;
        this.e = false;
    }

    @Override // tb.lks.c
    public void a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f4273c", new Object[]{this, viewGroup, new Integer(i)});
        } else if (!b(i)) {
        } else {
            c();
        }
    }

    private boolean b(int i) {
        int b;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue() : i == 0 && (b = b()) >= 0 && this.e && b == 0;
    }

    private int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        int[] visiblePositionRange = this.f.getVisiblePositionRange();
        if (visiblePositionRange != null && visiblePositionRange.length > 0) {
            return visiblePositionRange[0];
        }
        return -1;
    }

    private void b(ViewGroup viewGroup, int i) {
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9a0d2db", new Object[]{this, viewGroup, new Integer(i)});
        } else if (!c(viewGroup, i)) {
        } else {
            RecyclerView.LayoutManager layoutManager = ((RecyclerView) viewGroup).getLayoutManager();
            if (!(layoutManager instanceof StaggeredGridLayoutManager) || (b = b()) < 0 || b > this.b) {
                return;
            }
            a((StaggeredGridLayoutManager) layoutManager);
        }
    }

    private boolean c(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa4d7e7e", new Object[]{this, viewGroup, new Integer(i)})).booleanValue() : (viewGroup instanceof RecyclerView) && this.f30739a && i <= 0;
    }

    private void a(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        try {
            c.set(staggeredGridLayoutManager, true);
            d.invoke(staggeredGridLayoutManager, new Object[0]);
            this.e = true;
        } catch (Throwable th) {
            lap.a("clickBack", "checkForGaps", "调用错误：" + th.getMessage());
        }
    }

    private Method a(String str, Class cls, Class... clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("752adc0b", new Object[]{this, str, cls, clsArr});
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable th) {
            lap.a("clickBack", "getMethodReflect", "反射错误：" + th.getMessage());
            return null;
        }
    }

    private Field a(String str, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("a969cf48", new Object[]{this, str, cls});
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable th) {
            lap.a("clickBack", "getFieldReflect", "反射错误：" + th.getMessage());
            return null;
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f30739a = false;
        this.b = -1;
    }
}
