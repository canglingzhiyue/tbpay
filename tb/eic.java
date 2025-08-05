package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.open.l;
import com.taobao.android.detail.core.open.m;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class eic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashSet<l> f27317a;

    static {
        kge.a(-558745035);
    }

    public eic() {
        emu.a("com.taobao.android.detail.core.open.linkage.LinkageManger");
    }

    public void a(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8441ca6d", new Object[]{this, lVar});
            return;
        }
        synchronized (eic.class) {
            if (this.f27317a == null) {
                this.f27317a = new HashSet<>();
            }
            this.f27317a.add(lVar);
        }
    }

    public void b(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472e33cc", new Object[]{this, lVar});
            return;
        }
        synchronized (eic.class) {
            if (this.f27317a != null) {
                this.f27317a.remove(lVar);
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        synchronized (eic.class) {
            if (this.f27317a != null) {
                this.f27317a.clear();
            }
        }
    }

    public m a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("abcc9656", new Object[]{this, str});
        }
        if (this.f27317a == null) {
            return null;
        }
        synchronized (eic.class) {
            Iterator<l> it = this.f27317a.iterator();
            while (it.hasNext()) {
                l next = it.next();
                eoz messageChannel = next.getMessageChannel(str);
                if (messageChannel != null) {
                    return new m(next, messageChannel);
                }
            }
            return null;
        }
    }

    public boolean a(String str, Object obj) {
        m a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bb65392", new Object[]{this, str, obj})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || obj == null || (a2 = a(str)) == null || a2.b == null) {
            return false;
        }
        a2.b.onMessage(obj);
        if (a2.f9778a != null) {
            a2.f9778a.notifyDataSetChanged();
        }
        return true;
    }
}
