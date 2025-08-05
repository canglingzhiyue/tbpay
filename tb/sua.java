package tb;

import android.content.Context;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.k;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.g;
import com.taobao.taolive.sdk.utils.o;
import tb.stz;

/* loaded from: classes8.dex */
public class sua implements IMediaPlayer.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f33901a;
    private stz.a c;
    private Handler d;
    private a f;
    private Runnable e = new Runnable() { // from class: tb.sua.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            sua.a(sua.this).b(sua.this);
            if (sua.a(sua.this) != null) {
                g.a().b(sua.a(sua.this));
            }
            if (sua.b(sua.this) != null) {
                sua.b(sua.this).b(sua.c(sua.this));
            }
            if (sua.d(sua.this) != null) {
                sua.d(sua.this).a(sua.this);
            }
            prs.a("TBLVObjectSharedTask", "onRelease playContextKey = " + sua.c(sua.this));
        }
    };
    private com.taobao.taolive.adapterimpl.media.a b = new com.taobao.taolive.adapterimpl.media.a();

    /* loaded from: classes8.dex */
    public interface a {
        void a(sua suaVar);
    }

    static {
        kge.a(-2036008490);
        kge.a(-449281332);
    }

    public static /* synthetic */ com.taobao.taolive.adapterimpl.media.a a(sua suaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.adapterimpl.media.a) ipChange.ipc$dispatch("88b48eaa", new Object[]{suaVar}) : suaVar.b;
    }

    public static /* synthetic */ stz.a b(sua suaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (stz.a) ipChange.ipc$dispatch("efba4456", new Object[]{suaVar}) : suaVar.c;
    }

    public static /* synthetic */ String c(sua suaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("434910c5", new Object[]{suaVar}) : suaVar.f33901a;
    }

    public static /* synthetic */ a d(sua suaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("fcc873ce", new Object[]{suaVar}) : suaVar.f;
    }

    public sua(Context context, String str, k kVar, Handler handler, stz.a aVar, a aVar2) {
        this.b.a(kVar, context);
        this.b.a(true);
        this.b.a(this);
        this.f33901a = str;
        this.c = aVar;
        this.d = handler;
        this.f = aVar2;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (!c()) {
            return null;
        }
        prs.a("TBLVObjectSharedTask", "start playContextKey = " + this.f33901a);
        this.d.postDelayed(this.e, o.k());
        return g.a().e(this.b);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f33901a;
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : (this.b == null || this.f33901a == null || this.c == null || this.d == null) ? false : true;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.g
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        if (c() && (obj instanceof String) && obj.equals(g.MOCK_MEDIA_INFO_WHAT_RECYCLED)) {
            this.c.a(this.f33901a);
            this.b.b(this);
            if (this.b != null) {
                g.a().b(this.b);
            }
            this.d.removeCallbacks(this.e);
            a aVar = this.f;
            if (aVar != null) {
                aVar.a(this);
            }
            prs.a("TBLVObjectSharedTask", "onReuse playContextKey = " + this.f33901a);
        }
        return false;
    }
}
