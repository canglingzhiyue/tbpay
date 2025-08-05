package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.h;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class sdu implements OnScreenChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile sdu f33497a;
    private AtomicBoolean b;
    private a c;

    /* loaded from: classes7.dex */
    public interface a {
        void b(boolean z);
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
        OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
    }

    private sdu() {
    }

    public static sdu a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sdu) ipChange.ipc$dispatch("f0a715a", new Object[0]);
        }
        if (f33497a == null) {
            synchronized (sdu.class) {
                if (f33497a == null) {
                    f33497a = new sdu();
                }
            }
        }
        return f33497a;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8167df37", new Object[]{this, aVar});
            return;
        }
        this.c = aVar;
        h.a().c(this);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b = null;
        h.a().d(this);
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
            a aVar = this.c;
            if (aVar == null) {
                return;
            }
            aVar.b(true);
            return;
        }
        this.b.set(false);
        a aVar2 = this.c;
        if (aVar2 == null) {
            return;
        }
        aVar2.b(false);
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
