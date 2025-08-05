package tb;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import tb.hdx;

/* loaded from: classes5.dex */
public class hfb implements ComponentCallbacks2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private hdx.b f28582a;
    private String b;

    static {
        kge.a(-1707699755);
        kge.a(-418195541);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            return;
        }
        hdx.b bVar = this.f28582a;
        if (bVar == null) {
            return;
        }
        bVar.a(i, this.b);
    }

    public void a(hdx.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd9efde", new Object[]{this, bVar});
        } else {
            this.f28582a = bVar;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }
}
