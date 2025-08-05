package com.taobao.tao.flexbox.layoutmanager.adapter.interfaces;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;
import tb.oeb;
import tb.ogj;
import tb.ogw;

/* loaded from: classes8.dex */
public abstract class ImageLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_CODE_MEM_MISS = -100;
    public static final int LOAD_FAIL = 1;
    public static final int LOAD_SUCCESS = 0;
    public static final int LOAD_UNKNOWN = -1;
    public static final String TAG = "image";
    public String b;

    /* renamed from: a  reason: collision with root package name */
    public int f19968a = -1;
    public boolean c = false;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes8.dex */
    public @interface Priority {
        public static final int HIGH = 3;
        public static final int LOW = 1;
        public static final int MEDIUM = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes8.dex */
    public @interface Scene {
        public static final String BACKGROUND = "background";
        public static final String FIRST_FRAME = "firstframe";
        public static final String NORMAL = "normal";
        public static final String PRE_LOADE = "preload";
        public static final String RED_POINT = "redpoint";
        public static final String THEME = "theme";
        public static final String VIDEO_COVER = "videocover";
    }

    /* loaded from: classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public ab f19971a;
        public Context b;
        public String c;
        public String d;
        public int e;
        public int f;
        public a g;
        public boolean h;

        static {
            kge.a(-598327897);
        }

        public b(ab abVar, Context context, String str, String str2, int i, int i2, a aVar, boolean z) {
            this.f19971a = abVar;
            this.b = context;
            this.c = str;
            this.d = str2;
            this.e = i;
            this.f = i2;
            this.g = aVar;
            this.h = z && (oeb.d("tnode_tracker_image_measure") || oeb.W());
        }
    }

    /* loaded from: classes8.dex */
    public interface c {
        void onImageLoadFailed();

        void onImageLoaded(BitmapDrawable bitmapDrawable);
    }

    /* loaded from: classes8.dex */
    public interface d extends c {
        void onImageLoadFailed(int i);

        void onImageLoaded(String str, BitmapDrawable bitmapDrawable);
    }

    static {
        kge.a(-1174502590);
    }

    public abstract e a(b bVar, c cVar);

    public abstract e a(b bVar, boolean z, c cVar);

    public abstract ImageLoader a();

    public String a(String str, int i, int i2, a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84810dd0", new Object[]{this, str, new Integer(i), new Integer(i2), aVar}) : str;
    }

    @Deprecated
    public abstract void a(Context context, String str, int i, int i2, c cVar);

    public abstract void b();

    /* loaded from: classes8.dex */
    public abstract class e {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int STATUS_CANCEL = 2;
        public static final int STATUS_INIT = 0;
        public static final int STATUS_RUNNING = 1;
        public int b = 0;
        public ImageLoader c;

        static {
            kge.a(-765579833);
        }

        public abstract void a();

        public e(ImageLoader imageLoader) {
            this.c = imageLoader;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f19969a;
        public String b;
        public String c;
        public String d;
        public String e;
        public int f;
        public boolean g;
        public boolean h;
        public String i;
        public String j;
        public int k;

        static {
            kge.a(412968265);
        }

        private a(C0835a c0835a) {
            this.k = 2;
            this.f19969a = C0835a.a(c0835a);
            this.b = C0835a.b(c0835a);
            this.c = C0835a.c(c0835a);
            this.d = C0835a.d(c0835a);
            this.e = C0835a.e(c0835a);
            this.f = C0835a.f(c0835a);
            this.g = C0835a.g(c0835a);
            this.h = C0835a.h(c0835a);
            this.i = C0835a.i(c0835a);
            this.j = C0835a.j(c0835a);
            this.k = C0835a.k(c0835a);
        }

        public static a a(int i, String str, String str2, String str3, String str4, int i2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f36562b2", new Object[]{new Integer(i), str, str2, str3, str4, new Integer(i2)}) : new C0835a().a(i).a(str).b(str2).c(str3).d(str4).b(i2).a();
        }

        public static a a(int i, String str, String str2, String str3, String str4, int i2, String str5) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("a6efd4fc", new Object[]{new Integer(i), str, str2, str3, str4, new Integer(i2), str5}) : new C0835a().a(i).a(str).b(str2).c(str3).d(str4).b(i2).f(str5).a();
        }

        public static a a(int i, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("fde28c8b", new Object[]{new Integer(i), str, str2, str3}) : new C0835a().a(i).a(str).b(str2).f(str3).a();
        }

        public static a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("17046e7a", new Object[0]) : new C0835a().a();
        }

        public static a a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c01e7ec4", new Object[]{str}) : new C0835a().f(str).a();
        }

        public static a a(String str, aa aaVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("326832c", new Object[]{str, aaVar}) : a(str, aaVar, 2);
        }

        public static a a(String str, aa aaVar, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("781d8cfb", new Object[]{str, aaVar, new Integer(i)}) : new C0835a().e(ogw.a(aaVar)).f(str).c(i).a();
        }

        public static a a(ogj ogjVar, aa aaVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("d15a9500", new Object[]{ogjVar, aaVar}) : new C0835a().a(ogjVar.o).a(ogjVar.p).b(ogjVar.q).c(ogjVar.m).b(ogjVar.r).a(ogjVar.s).c(ogjVar.t).e(ogw.a(aaVar)).a();
        }

        /* renamed from: com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader$a$a  reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public static class C0835a {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private boolean h;
            private String i;

            /* renamed from: a  reason: collision with root package name */
            private int f19970a = 0;
            private String b = "";
            private String c = "";
            private String d = "";
            private String e = "guangguang";
            private int f = 87;
            private boolean g = true;
            private int k = 2;
            private String j = "normal";

            static {
                kge.a(1936531385);
            }

            public static /* synthetic */ int a(C0835a c0835a) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1042d150", new Object[]{c0835a})).intValue() : c0835a.f19970a;
            }

            public static /* synthetic */ String b(C0835a c0835a) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3018a924", new Object[]{c0835a}) : c0835a.b;
            }

            public static /* synthetic */ String c(C0835a c0835a) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("585ee965", new Object[]{c0835a}) : c0835a.c;
            }

            public static /* synthetic */ String d(C0835a c0835a) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("80a529a6", new Object[]{c0835a}) : c0835a.d;
            }

            public static /* synthetic */ String e(C0835a c0835a) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a8eb69e7", new Object[]{c0835a}) : c0835a.e;
            }

            public static /* synthetic */ int f(C0835a c0835a) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8d49696b", new Object[]{c0835a})).intValue() : c0835a.f;
            }

            public static /* synthetic */ boolean g(C0835a c0835a) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a64abb1b", new Object[]{c0835a})).booleanValue() : c0835a.g;
            }

            public static /* synthetic */ boolean h(C0835a c0835a) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bf4c0cba", new Object[]{c0835a})).booleanValue() : c0835a.h;
            }

            public static /* synthetic */ String i(C0835a c0835a) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4a046aeb", new Object[]{c0835a}) : c0835a.i;
            }

            public static /* synthetic */ String j(C0835a c0835a) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("724aab2c", new Object[]{c0835a}) : c0835a.j;
            }

            public static /* synthetic */ int k(C0835a c0835a) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a500186", new Object[]{c0835a})).intValue() : c0835a.k;
            }

            public C0835a a(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0835a) ipChange.ipc$dispatch("d4e799d0", new Object[]{this, new Integer(i)});
                }
                this.f19970a = i;
                return this;
            }

            public C0835a a(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0835a) ipChange.ipc$dispatch("32799367", new Object[]{this, str});
                }
                this.b = str;
                return this;
            }

            public C0835a b(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0835a) ipChange.ipc$dispatch("5abfd3a8", new Object[]{this, str});
                }
                this.c = str;
                return this;
            }

            public C0835a c(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0835a) ipChange.ipc$dispatch("830613e9", new Object[]{this, str});
                }
                this.d = str;
                return this;
            }

            public C0835a d(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0835a) ipChange.ipc$dispatch("ab4c542a", new Object[]{this, str});
                }
                this.e = str;
                return this;
            }

            public C0835a b(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0835a) ipChange.ipc$dispatch("ede8eb6f", new Object[]{this, new Integer(i)});
                }
                this.f = i;
                return this;
            }

            public C0835a a(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0835a) ipChange.ipc$dispatch("437870a1", new Object[]{this, new Boolean(z)});
                }
                this.h = z;
                return this;
            }

            public C0835a b(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0835a) ipChange.ipc$dispatch("5c79c240", new Object[]{this, new Boolean(z)});
                }
                this.g = z;
                return this;
            }

            public C0835a e(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0835a) ipChange.ipc$dispatch("d392946b", new Object[]{this, str});
                }
                this.i = str;
                return this;
            }

            public C0835a f(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0835a) ipChange.ipc$dispatch("fbd8d4ac", new Object[]{this, str});
                }
                this.j = str;
                return this;
            }

            public C0835a c(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0835a) ipChange.ipc$dispatch("6ea3d0e", new Object[]{this, new Integer(i)});
                }
                this.k = i;
                return this;
            }

            public a a() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("17046e7a", new Object[]{this}) : new a(this);
            }
        }
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f19968a;
    }
}
