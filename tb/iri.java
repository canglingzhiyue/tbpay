package tb;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IApmEventListener;
import com.taobao.application.common.c;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class iri {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Uri f29249a;
    private final Set<String> b;
    private final b c;
    private final IApmEventListener d;
    private boolean e;
    private ruk<t> f;
    private final ContentResolver g;

    /* loaded from: classes2.dex */
    public static final class a implements IApmEventListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.application.common.IApmEventListener
        public final void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (i == 1) {
                iri.c(iri.this);
            } else if (i != 2) {
            } else {
                iri.d(iri.this);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends ContentObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Regex b;

        public b(Handler handler) {
            super(handler);
            this.b = new Regex(iri.b(iri.this) + "/[0-9]+");
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            String uriStr;
            ruk<t> a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c2652e9", new Object[]{this, new Boolean(z), uri});
            } else if (uri == null || (uriStr = uri.toString()) == null) {
            } else {
                q.b(uriStr, "uriStr");
                if (!this.b.matches(uriStr) || !iri.a(iri.this).add(uriStr) || (a2 = iri.this.a()) == null) {
                    return;
                }
                a2.mo2427invoke();
            }
        }
    }

    static {
        kge.a(167249531);
    }

    public iri(ContentResolver contentResolver) {
        q.d(contentResolver, "contentResolver");
        this.g = contentResolver;
        this.f29249a = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        this.b = new LinkedHashSet();
        this.c = new b(null);
        this.d = new a();
    }

    public static final /* synthetic */ Set a(iri iriVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("868a2467", new Object[]{iriVar}) : iriVar.b;
    }

    public static final /* synthetic */ Uri b(iri iriVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("1036b830", new Object[]{iriVar}) : iriVar.f29249a;
    }

    public static final /* synthetic */ void c(iri iriVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3f077a", new Object[]{iriVar});
        } else {
            iriVar.e();
        }
    }

    public static final /* synthetic */ void d(iri iriVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9c20dfb", new Object[]{iriVar});
        } else {
            iriVar.d();
        }
    }

    public final ruk<t> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("f0a3b96", new Object[]{this}) : this.f;
    }

    public final void a(ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbfc750", new Object[]{this, rukVar});
        } else {
            this.f = rukVar;
        }
    }

    public final synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.e) {
        } else {
            d();
            c.a(this.d);
            this.e = true;
        }
    }

    public final synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.e) {
        } else {
            c.b(this.d);
            e();
            this.b.clear();
            this.e = false;
        }
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.g.registerContentObserver(this.f29249a, true, this.c);
        }
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.g.unregisterContentObserver(this.c);
        }
    }
}
