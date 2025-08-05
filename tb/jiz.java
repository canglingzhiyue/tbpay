package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tracker.util.e;
import com.taobao.android.tracker.util.f;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes6.dex */
public class jiz implements jix {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private jiy b;

    /* renamed from: a  reason: collision with root package name */
    private boolean f29576a = false;
    private boolean c = false;

    static {
        kge.a(-1976469076);
        kge.a(-740007245);
    }

    @Override // tb.jix
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        a(e.f15586a);
        f();
    }

    @Override // tb.jix
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f29576a;
    }

    @Override // tb.jix
    public void a(jiy jiyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef76457e", new Object[]{this, jiyVar});
        } else {
            this.b = jiyVar;
        }
    }

    @Override // tb.jix
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f29576a && this.c;
    }

    @Override // tb.jix
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : a(e.f15586a, e.c, false);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.f29576a = a(e.f15586a, e.d, false);
        this.c = a(e.f15586a, e.f, false);
    }

    public void e() {
        jiy jiyVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        h();
        if (!g() || (jiyVar = this.b) == null) {
            return;
        }
        jiyVar.a();
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        boolean a2 = a(e.f15586a, e.d, false);
        if (a2 == this.f29576a) {
            return false;
        }
        this.f29576a = a2;
        return true;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.c = a(e.f15586a, e.f, false);
        }
    }

    public String a(String str, String str2, String str3) {
        OrangeConfig orangeConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3});
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (orangeConfig = OrangeConfig.getInstance()) != null) {
            return orangeConfig.getConfig(str, str2, null);
        }
        return null;
    }

    public boolean a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dbad4dc", new Object[]{this, str, str2, new Boolean(z)})).booleanValue();
        }
        String a2 = a(str, str2, (String) null);
        return !TextUtils.isEmpty(a2) ? Boolean.valueOf(a2).booleanValue() : z;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        a aVar = new a(this);
        OrangeConfig orangeConfig = OrangeConfig.getInstance();
        if (orangeConfig == null) {
            return;
        }
        orangeConfig.registerListener(new String[]{str}, aVar, false);
    }

    /* loaded from: classes6.dex */
    public class a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<jiz> b;

        static {
            kge.a(-1150585062);
            kge.a(-1209827241);
        }

        public a(jiz jizVar) {
            this.b = new WeakReference<>(jizVar);
        }

        @Override // com.taobao.orange.d
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            f.a("DynamicTracker::DynamicTrackerListener::onConfigUpdate");
            jiz a2 = a();
            if (a2 == null) {
                return;
            }
            a2.e();
        }

        private jiz a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jiz) ipChange.ipc$dispatch("f066d63", new Object[]{this});
            }
            WeakReference<jiz> weakReference = this.b;
            if (weakReference != null && weakReference.get() != null) {
                return this.b.get();
            }
            return null;
        }
    }
}
