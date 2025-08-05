package tb;

import android.app.Activity;
import android.view.KeyEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.a;
import com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher;
import com.taobao.monitor.impl.trace.PageLeaveDispatcher;
import com.taobao.monitor.impl.trace.e;
import com.taobao.monitor.impl.trace.f;
import com.taobao.monitor.impl.trace.m;
import com.taobao.monitor.impl.trace.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class moa implements ApplicationBackgroundChangedDispatcher.a, e.a, r.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<mou> f31154a = new ArrayList();
    private PageLeaveDispatcher b;

    @Override // com.taobao.monitor.impl.trace.r.a
    public void a(Activity activity, int i, float f, float f2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb07419b", new Object[]{this, activity, new Integer(i), new Float(f), new Float(f2), new Long(j)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.e.a
    public void a(mou mouVar, Map<String, Object> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2712cc4", new Object[]{this, mouVar, map, new Long(j)});
        }
    }

    public moa() {
        m a2 = f.a(a.APPLICATION_BACKGROUND_CHANGED_DISPATCHER);
        if (a2 instanceof ApplicationBackgroundChangedDispatcher) {
            ((ApplicationBackgroundChangedDispatcher) a2).a((ApplicationBackgroundChangedDispatcher) this);
        }
        m a3 = f.a(a.WINDOW_EVENT_DISPATCHER);
        if (a3 instanceof r) {
            ((r) a3).a((r) this);
        }
        m a4 = f.a(a.PAGE_LEAVE_DISPATCHER);
        if (a4 instanceof PageLeaveDispatcher) {
            this.b = (PageLeaveDispatcher) a4;
        }
    }

    @Override // com.taobao.monitor.impl.trace.e.a
    public void a(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80a487f", new Object[]{this, mouVar, new Long(j)});
        } else if (this.f31154a.contains(mouVar)) {
        } else {
            this.f31154a.add(mouVar);
        }
    }

    @Override // com.taobao.monitor.impl.trace.e.a
    public void b(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89e8121e", new Object[]{this, mouVar, new Long(j)});
        } else if (mouVar.o()) {
        } else {
            a(mouVar, -5, j);
        }
    }

    @Override // com.taobao.monitor.impl.trace.e.a
    public void c(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bc5dbbd", new Object[]{this, mouVar, new Long(j)});
            return;
        }
        this.f31154a.remove(mouVar);
        a(mouVar, -4, j);
    }

    @Override // com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher.a
    public void a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
        } else if (i == 1) {
            for (mou mouVar : this.f31154a) {
                a(mouVar, -3, j);
            }
        }
    }

    @Override // com.taobao.monitor.impl.trace.r.a
    public void a(Activity activity, KeyEvent keyEvent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c497142", new Object[]{this, activity, keyEvent, new Long(j)});
            return;
        }
        for (mou mouVar : this.f31154a) {
            if (!mnh.a(activity, mouVar.a())) {
                return;
            }
            int action = keyEvent.getAction();
            int keyCode = keyEvent.getKeyCode();
            if (action == 0 && keyCode == 4) {
                a(mouVar, -4, j);
            }
        }
    }

    private void a(mou mouVar, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("593ec9c6", new Object[]{this, mouVar, new Integer(i), new Long(j)});
        } else if (f.a(this.b)) {
        } else {
            this.b.a(mouVar, i, j);
        }
    }
}
