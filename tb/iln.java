package tb;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.resourceguardian.data.model.RGCategoryInfo;
import com.taobao.android.resourceguardian.data.model.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ilj;

/* loaded from: classes6.dex */
public class iln implements Handler.Callback, ilj.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<ilj> f29139a = new ArrayList();
    private final Map<String, List<ilj.a>> b = new HashMap();
    private Handler c;
    private Context d;

    static {
        kge.a(1464270940);
        kge.a(-1043440182);
        kge.a(1853984502);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.f29139a.add(new ilp());
        this.f29139a.add(new ilm());
        this.f29139a.add(new ill());
        this.f29139a.add(new ilk());
        this.f29139a.add(new ilq());
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        for (ilj iljVar : this.f29139a) {
            iljVar.a(this);
            iljVar.a(this.d);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        HandlerThread handlerThread = new HandlerThread("TBResourceGuardianController");
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper(), this);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        ilt.a("DataSourceManager", "start init ", "DataSourceManager");
        this.d = context;
        f();
        d();
        e();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.c.removeMessages(4);
        this.c.sendEmptyMessage(3);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.c.removeMessages(3);
        this.c.sendEmptyMessage(4);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ilt.a("DataSourceManager", "start");
        i();
        g();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ilt.a("DataSourceManager", "stop");
        h();
        j();
    }

    public void a(int i, ilj.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c48ad27", new Object[]{this, new Integer(i), aVar});
            return;
        }
        String a2 = RGCategoryInfo.a(i);
        List<ilj.a> list = this.b.get(a2);
        if (list == null) {
            list = new ArrayList<>(1);
            this.b.put(a2, list);
        }
        list.add(aVar);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.d == null) {
            ilt.a("DataSourceManager", "failed updateDataSource", "context is null");
        } else {
            for (ilj iljVar : this.f29139a) {
                iljVar.d(this.d);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 1) {
            i();
            c();
        } else if (i == 2) {
            Object obj = message.obj;
            if (obj instanceof a) {
                b((a) obj);
            }
        } else if (i == 3) {
            ilt.a("DataSourceManager", "start data source");
            for (ilj iljVar : this.f29139a) {
                iljVar.b(this.d);
            }
        } else if (i == 4) {
            ilt.a("DataSourceManager", "stop data source");
            for (ilj iljVar2 : this.f29139a) {
                iljVar2.a();
            }
        }
        return false;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        Handler handler = this.c;
        if (handler == null) {
            ilt.a("DataSourceManager", "failed start", "handler is null");
            return;
        }
        handler.removeMessages(1);
        this.c.sendEmptyMessageDelayed(1, 10000L);
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        Handler handler = this.c;
        if (handler == null) {
            ilt.a("DataSourceManager", "failed stop", "handler is null");
        } else {
            handler.removeMessages(1);
        }
    }

    private void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c93d1a5", new Object[]{this, aVar});
            return;
        }
        List<ilj.a> list = this.b.get(RGCategoryInfo.a(aVar.f14877a));
        if (list == null) {
            return;
        }
        for (ilj.a aVar2 : list) {
            aVar2.a(aVar);
        }
    }

    @Override // tb.ilj.a
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733f7c64", new Object[]{this, aVar});
            return;
        }
        int i = aVar.b;
        if (i == 0) {
            a();
            ilt.a("DataSourceManager", "EVENT_BG_2_FG");
        } else if (i == 1) {
            b();
            ilt.a("DataSourceManager", "EVENT_FG_2_BG");
        } else if (i == 8) {
            b();
            this.f29139a.clear();
            ilt.a("DataSourceManager", "EVENT_MODULE_SWITCH_OFF");
        } else if (this.c == null) {
            ilt.a("DataSourceManager", "handler is null, cancel send to handler thread");
        } else {
            Message obtain = Message.obtain();
            obtain.obj = aVar;
            obtain.what = 2;
            this.c.sendMessage(obtain);
        }
    }
}
