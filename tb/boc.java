package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;

/* loaded from: classes2.dex */
public class boc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f26018a;
    private final String b;
    private final int c;
    private final boolean d;
    private final b e;
    private final DXEngineConfig.a f;
    private final a g;

    /* loaded from: classes2.dex */
    public static abstract class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1396801255);
        }

        public abstract void a(Context context, bd bdVar);

        public boolean a(DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3a042615", new Object[]{this, dXTemplateItem})).booleanValue();
            }
            return false;
        }
    }

    static {
        kge.a(599637360);
    }

    private boc(a aVar) {
        this.g = aVar;
        this.f26018a = a.a(aVar);
        this.c = a.b(aVar);
        this.b = a.c(aVar);
        this.d = a.d(aVar);
        this.f = a.e(aVar);
        this.e = a.f(aVar);
        DXEngineConfig.a aVar2 = this.f;
        if (aVar2 != null) {
            aVar2.a(a.a(aVar));
            this.f.d(a.b(aVar));
            this.f.g(a.d(aVar));
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f26018a;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.d;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.c;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : a.g(this.g);
    }

    public DXEngineConfig.a f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXEngineConfig.a) ipChange.ipc$dispatch("af6cc4d0", new Object[]{this}) : this.f;
    }

    public bd h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bd) ipChange.ipc$dispatch("97f19601", new Object[]{this}) : a.h(this.g);
    }

    public b g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a4f663a4", new Object[]{this}) : this.e;
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f26019a;
        private boolean d;
        private b f;
        private DXEngineConfig.a g;
        private bd h;
        private int e = 0;
        private int c = -1;
        private String b = "";

        static {
            kge.a(-2025315257);
        }

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c2a13509", new Object[]{aVar})).booleanValue() : aVar.f26019a;
        }

        public static /* synthetic */ int b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1c7c9f39", new Object[]{aVar})).intValue() : aVar.c;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("17c349f9", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ boolean d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d03373cc", new Object[]{aVar})).booleanValue() : aVar.d;
        }

        public static /* synthetic */ DXEngineConfig.a e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXEngineConfig.a) ipChange.ipc$dispatch("5b6dc634", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ b f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("54820c48", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ int g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ddc5b27e", new Object[]{aVar})).intValue() : aVar.e;
        }

        public static /* synthetic */ bd h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bd) ipChange.ipc$dispatch("50454e84", new Object[]{aVar}) : aVar.h;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5057e747", new Object[]{this, new Boolean(z)});
            }
            this.f26019a = z;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cd8bebf8", new Object[]{this, new Integer(i)});
            }
            this.c = i;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1727ed41", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("27675639", new Object[]{this, new Integer(i)});
            }
            this.e = i;
            return this;
        }

        public a a(DXEngineConfig.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6cada1a4", new Object[]{this, aVar});
            }
            this.g = aVar;
            return this;
        }

        public a a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("56fd484f", new Object[]{this, bVar});
            }
            this.f = bVar;
            return this;
        }

        public a a(bd bdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a17d63d1", new Object[]{this, bdVar});
            }
            this.h = bdVar;
            return this;
        }

        public boc a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (boc) ipChange.ipc$dispatch("f02de28", new Object[]{this}) : new boc(this);
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("aa335188", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }
    }
}
