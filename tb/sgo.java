package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.h;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public class sgo implements OnScreenChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile sgo f33560a;
    private AtomicBoolean b;
    private List<sgr> c = new CopyOnWriteArrayList();

    static {
        kge.a(-21186021);
        kge.a(825059505);
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
        OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
    }

    private sgo() {
    }

    public static sgo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sgo) ipChange.ipc$dispatch("f0a7be3", new Object[0]);
        }
        if (f33560a == null) {
            synchronized (sgo.class) {
                if (f33560a == null) {
                    f33560a = new sgo();
                }
            }
        }
        return f33560a;
    }

    public void a(sgr sgrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb2857a", new Object[]{this, sgrVar});
        } else if (sgrVar == null) {
        } else {
            if (this.c.isEmpty()) {
                h.a().c(this);
            }
            this.c.add(sgrVar);
        }
    }

    public void b(sgr sgrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed358bfb", new Object[]{this, sgrVar});
        } else if (sgrVar == null) {
        } else {
            this.c.remove(sgrVar);
            if (!this.c.isEmpty()) {
                return;
            }
            this.b = null;
            h.a().d(this);
        }
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public void onScreenChanged(int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            return;
        }
        if (this.b == null) {
            this.b = new AtomicBoolean();
        }
        if (2 == i) {
            this.b.set(true);
        } else {
            this.b.set(false);
        }
        if (this.c.isEmpty()) {
            return;
        }
        for (sgr sgrVar : this.c) {
            sgrVar.onScreenOrientationChange(this.b.get());
        }
    }

    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        if (this.b == null) {
            this.b = new AtomicBoolean(!h.a().b(context));
        }
        return this.b.get();
    }
}
