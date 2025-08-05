package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.u;
import com.taobao.tao.Globals;

/* loaded from: classes5.dex */
public class hdx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_LINE = "guangguang";
    public static final String BIZ_SCENE = "guangguang";
    public static final int LE_VERSION;
    public static final String PAGE_IMAGE_EDIT = "image_edit";
    public static final String PAGE_PUBLISH = "publish";
    public static final String PAGE_RECORD = "record";
    public static final String PAGE_VIDEO_EDIT = "video_edit";
    public static final String TAG = "LcSdk";

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f28571a;
    private volatile boolean b;
    private volatile boolean c;
    private volatile boolean d;
    private c e;
    private hfb f;
    private String g;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final hdx f28572a;

        static {
            kge.a(-167397210);
            f28572a = new hdx();
        }
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a(int i, String str);
    }

    /* loaded from: classes5.dex */
    public interface c extends b {
        void a();

        void b();
    }

    static {
        kge.a(-1573505270);
        LE_VERSION = kra.c();
    }

    public static hdx a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hdx) ipChange.ipc$dispatch("f0571a2", new Object[0]) : a.f28572a;
    }

    private hdx() {
        this.f = new hfb();
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda643d", new Object[]{this, cVar});
            return;
        }
        this.f28571a = true;
        this.e = cVar;
        this.f.a(this.e);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.g = str;
        hfb hfbVar = this.f;
        if (hfbVar == null) {
            return;
        }
        hfbVar.a(str);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        u.d(TAG, " sdk create: ");
        this.b = true;
        if (this.f != null) {
            Globals.getApplication().unregisterComponentCallbacks(this.f);
        } else {
            this.f = new hfb();
        }
        Globals.getApplication().registerComponentCallbacks(this.f);
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.a();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.b) {
        } else {
            u.d(TAG, " sdk destroy: ");
            this.b = false;
            Globals.getApplication().unregisterComponentCallbacks(this.f);
            c cVar = this.e;
            if (cVar == null) {
                return;
            }
            cVar.b();
            this.e = null;
            this.f = null;
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.b;
    }
}
