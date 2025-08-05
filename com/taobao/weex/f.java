package com.taobao.weex;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.adapter.ClassLoaderAdapter;
import com.taobao.weex.adapter.IDrawableLoader;
import com.taobao.weex.adapter.IWXFoldDeviceAdapter;
import com.taobao.weex.adapter.IWXHttpAdapter;
import com.taobao.weex.adapter.IWXImgLoaderAdapter;
import com.taobao.weex.adapter.IWXJSExceptionAdapter;
import com.taobao.weex.adapter.IWXJsFileLoaderAdapter;
import com.taobao.weex.adapter.IWXJscProcessManager;
import com.taobao.weex.adapter.IWXSoLoaderAdapter;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import com.taobao.weex.adapter.URIAdapter;
import com.taobao.weex.appfram.storage.b;
import java.util.LinkedList;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IWXHttpAdapter f23503a;
    private IDrawableLoader b;
    private IWXImgLoaderAdapter c;
    private IWXUserTrackAdapter d;
    private b e;
    private IWXSoLoaderAdapter f;
    private URIAdapter g;
    private com.taobao.weex.appfram.websocket.b h;
    private IWXJSExceptionAdapter i;
    private String j;
    private ClassLoaderAdapter k;
    private com.taobao.weex.performance.a l;
    private IWXJsFileLoaderAdapter m;
    private IWXJscProcessManager n;
    private IWXFoldDeviceAdapter o;
    private com.taobao.weex.performance.d p;
    private List<String> q;

    static {
        kge.a(243834061);
    }

    public static /* synthetic */ ClassLoaderAdapter a(f fVar, ClassLoaderAdapter classLoaderAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClassLoaderAdapter) ipChange.ipc$dispatch("63056068", new Object[]{fVar, classLoaderAdapter});
        }
        fVar.k = classLoaderAdapter;
        return classLoaderAdapter;
    }

    public static /* synthetic */ IDrawableLoader a(f fVar, IDrawableLoader iDrawableLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDrawableLoader) ipChange.ipc$dispatch("68a32406", new Object[]{fVar, iDrawableLoader});
        }
        fVar.b = iDrawableLoader;
        return iDrawableLoader;
    }

    public static /* synthetic */ IWXFoldDeviceAdapter a(f fVar, IWXFoldDeviceAdapter iWXFoldDeviceAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXFoldDeviceAdapter) ipChange.ipc$dispatch("ba5e83e8", new Object[]{fVar, iWXFoldDeviceAdapter});
        }
        fVar.o = iWXFoldDeviceAdapter;
        return iWXFoldDeviceAdapter;
    }

    public static /* synthetic */ IWXHttpAdapter a(f fVar, IWXHttpAdapter iWXHttpAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXHttpAdapter) ipChange.ipc$dispatch("5bbe87c8", new Object[]{fVar, iWXHttpAdapter});
        }
        fVar.f23503a = iWXHttpAdapter;
        return iWXHttpAdapter;
    }

    public static /* synthetic */ IWXImgLoaderAdapter a(f fVar, IWXImgLoaderAdapter iWXImgLoaderAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXImgLoaderAdapter) ipChange.ipc$dispatch("288212f4", new Object[]{fVar, iWXImgLoaderAdapter});
        }
        fVar.c = iWXImgLoaderAdapter;
        return iWXImgLoaderAdapter;
    }

    public static /* synthetic */ IWXJSExceptionAdapter a(f fVar, IWXJSExceptionAdapter iWXJSExceptionAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXJSExceptionAdapter) ipChange.ipc$dispatch("34890e54", new Object[]{fVar, iWXJSExceptionAdapter});
        }
        fVar.i = iWXJSExceptionAdapter;
        return iWXJSExceptionAdapter;
    }

    public static /* synthetic */ IWXJsFileLoaderAdapter a(f fVar, IWXJsFileLoaderAdapter iWXJsFileLoaderAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXJsFileLoaderAdapter) ipChange.ipc$dispatch("d745e1c8", new Object[]{fVar, iWXJsFileLoaderAdapter});
        }
        fVar.m = iWXJsFileLoaderAdapter;
        return iWXJsFileLoaderAdapter;
    }

    public static /* synthetic */ IWXJscProcessManager a(f fVar, IWXJscProcessManager iWXJscProcessManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXJscProcessManager) ipChange.ipc$dispatch("4484f3e8", new Object[]{fVar, iWXJscProcessManager});
        }
        fVar.n = iWXJscProcessManager;
        return iWXJscProcessManager;
    }

    public static /* synthetic */ IWXSoLoaderAdapter a(f fVar, IWXSoLoaderAdapter iWXSoLoaderAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXSoLoaderAdapter) ipChange.ipc$dispatch("3f4ff28", new Object[]{fVar, iWXSoLoaderAdapter});
        }
        fVar.f = iWXSoLoaderAdapter;
        return iWXSoLoaderAdapter;
    }

    public static /* synthetic */ IWXUserTrackAdapter a(f fVar, IWXUserTrackAdapter iWXUserTrackAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXUserTrackAdapter) ipChange.ipc$dispatch("ae3aa88", new Object[]{fVar, iWXUserTrackAdapter});
        }
        fVar.d = iWXUserTrackAdapter;
        return iWXUserTrackAdapter;
    }

    public static /* synthetic */ URIAdapter a(f fVar, URIAdapter uRIAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URIAdapter) ipChange.ipc$dispatch("88539c08", new Object[]{fVar, uRIAdapter});
        }
        fVar.g = uRIAdapter;
        return uRIAdapter;
    }

    public static /* synthetic */ b a(f fVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("aa06d98a", new Object[]{fVar, bVar});
        }
        fVar.e = bVar;
        return bVar;
    }

    public static /* synthetic */ com.taobao.weex.appfram.websocket.b a(f fVar, com.taobao.weex.appfram.websocket.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.weex.appfram.websocket.b) ipChange.ipc$dispatch("2a2756b2", new Object[]{fVar, bVar});
        }
        fVar.h = bVar;
        return bVar;
    }

    public static /* synthetic */ com.taobao.weex.performance.a a(f fVar, com.taobao.weex.performance.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.weex.performance.a) ipChange.ipc$dispatch("8e58b3b6", new Object[]{fVar, aVar});
        }
        fVar.l = aVar;
        return aVar;
    }

    public static /* synthetic */ com.taobao.weex.performance.d a(f fVar, com.taobao.weex.performance.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.weex.performance.d) ipChange.ipc$dispatch("45b80070", new Object[]{fVar, dVar});
        }
        fVar.p = dVar;
        return dVar;
    }

    public static /* synthetic */ String a(f fVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("436318e8", new Object[]{fVar, str});
        }
        fVar.j = str;
        return str;
    }

    public static /* synthetic */ List a(f fVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dc8f9f08", new Object[]{fVar, list});
        }
        fVar.q = list;
        return list;
    }

    public IWXHttpAdapter a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXHttpAdapter) ipChange.ipc$dispatch("228a7445", new Object[]{this}) : this.f23503a;
    }

    public IWXFoldDeviceAdapter b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXFoldDeviceAdapter) ipChange.ipc$dispatch("e78823d3", new Object[]{this}) : this.o;
    }

    public IWXImgLoaderAdapter c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXImgLoaderAdapter) ipChange.ipc$dispatch("bf727073", new Object[]{this}) : this.c;
    }

    public IDrawableLoader d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDrawableLoader) ipChange.ipc$dispatch("3282d21d", new Object[]{this}) : this.b;
    }

    public IWXUserTrackAdapter e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXUserTrackAdapter) ipChange.ipc$dispatch("48f6a0ff", new Object[]{this}) : this.d;
    }

    public IWXSoLoaderAdapter f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXSoLoaderAdapter) ipChange.ipc$dispatch("fb02c327", new Object[]{this}) : this.f;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.j;
    }

    public b h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("e180f943", new Object[]{this}) : this.e;
    }

    public URIAdapter i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (URIAdapter) ipChange.ipc$dispatch("34c15177", new Object[]{this}) : this.g;
    }

    public com.taobao.weex.appfram.websocket.b j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.weex.appfram.websocket.b) ipChange.ipc$dispatch("184774f9", new Object[]{this}) : this.h;
    }

    public ClassLoaderAdapter k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ClassLoaderAdapter) ipChange.ipc$dispatch("d9936174", new Object[]{this}) : this.k;
    }

    public com.taobao.weex.performance.a l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.weex.performance.a) ipChange.ipc$dispatch("b24b121d", new Object[]{this}) : this.l;
    }

    public IWXJsFileLoaderAdapter m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXJsFileLoaderAdapter) ipChange.ipc$dispatch("5bbb9e09", new Object[]{this}) : this.m;
    }

    public f a(ClassLoaderAdapter classLoaderAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("8403ce3e", new Object[]{this, classLoaderAdapter});
        }
        this.k = classLoaderAdapter;
        return this;
    }

    public IWXJSExceptionAdapter n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXJSExceptionAdapter) ipChange.ipc$dispatch("48be22ee", new Object[]{this}) : this.i;
    }

    public IWXJscProcessManager o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXJscProcessManager) ipChange.ipc$dispatch("458c27e6", new Object[]{this}) : this.n;
    }

    public Iterable<String> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterable) ipChange.ipc$dispatch("e62f6888", new Object[]{this});
        }
        if (this.q == null) {
            this.q = new LinkedList();
        }
        return this.q;
    }

    public com.taobao.weex.performance.d q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.weex.performance.d) ipChange.ipc$dispatch("b486d13f", new Object[]{this}) : this.p;
    }

    private f() {
    }

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public IWXHttpAdapter f23504a;
        public IWXImgLoaderAdapter b;
        public IDrawableLoader c;
        public IWXUserTrackAdapter d;
        public b e;
        public IWXSoLoaderAdapter f;
        public URIAdapter g;
        public IWXJSExceptionAdapter h;
        public String i;
        public com.taobao.weex.appfram.websocket.b j;
        public ClassLoaderAdapter k;
        public com.taobao.weex.performance.a l;
        public com.taobao.weex.performance.d m;
        public IWXJscProcessManager n;
        private IWXJsFileLoaderAdapter o;
        private IWXFoldDeviceAdapter p;
        private List<String> q = new LinkedList();

        static {
            kge.a(-2120198492);
        }

        public a a(IWXJscProcessManager iWXJscProcessManager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a5d6cc17", new Object[]{this, iWXJscProcessManager});
            }
            this.n = iWXJscProcessManager;
            return this;
        }

        public a a(IWXHttpAdapter iWXHttpAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("eed3e128", new Object[]{this, iWXHttpAdapter});
            }
            this.f23504a = iWXHttpAdapter;
            return this;
        }

        public a a(IWXImgLoaderAdapter iWXImgLoaderAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3eafcd9a", new Object[]{this, iWXImgLoaderAdapter});
            }
            this.b = iWXImgLoaderAdapter;
            return this;
        }

        public a a(IDrawableLoader iDrawableLoader) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("33787883", new Object[]{this, iDrawableLoader});
            }
            this.c = iDrawableLoader;
            return this;
        }

        public a a(IWXUserTrackAdapter iWXUserTrackAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("26b866a4", new Object[]{this, iWXUserTrackAdapter});
            }
            this.d = iWXUserTrackAdapter;
            return this;
        }

        public a a(IWXFoldDeviceAdapter iWXFoldDeviceAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b88a9797", new Object[]{this, iWXFoldDeviceAdapter});
            }
            this.p = iWXFoldDeviceAdapter;
            return this;
        }

        public a a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a7fa9125", new Object[]{this, bVar});
            }
            this.e = bVar;
            return this;
        }

        public a a(URIAdapter uRIAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4ae22e62", new Object[]{this, uRIAdapter});
            }
            this.g = uRIAdapter;
            return this;
        }

        public a a(IWXJSExceptionAdapter iWXJSExceptionAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("11c0ec8a", new Object[]{this, iWXJSExceptionAdapter});
            }
            this.h = iWXJSExceptionAdapter;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("afbc199b", new Object[]{this, str});
            }
            this.i = str;
            return this;
        }

        public a a(com.taobao.weex.appfram.websocket.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("37992cd9", new Object[]{this, bVar});
            }
            this.j = bVar;
            return this;
        }

        public a a(com.taobao.weex.performance.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("30ce5c7b", new Object[]{this, aVar});
            }
            this.l = aVar;
            return this;
        }

        public a a(IWXJsFileLoaderAdapter iWXJsFileLoaderAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c8ca3578", new Object[]{this, iWXJsFileLoaderAdapter});
            }
            this.o = iWXJsFileLoaderAdapter;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("94fd885c", new Object[]{this, str});
            }
            this.q.add(str);
            return this;
        }

        public f a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("3363c0ae", new Object[]{this});
            }
            f fVar = new f();
            f.a(fVar, this.f23504a);
            f.a(fVar, this.b);
            f.a(fVar, this.c);
            f.a(fVar, this.d);
            f.a(fVar, this.e);
            f.a(fVar, this.f);
            f.a(fVar, this.i);
            f.a(fVar, this.g);
            f.a(fVar, this.j);
            f.a(fVar, this.h);
            f.a(fVar, this.k);
            f.a(fVar, this.l);
            f.a(fVar, this.o);
            f.a(fVar, this.n);
            f.a(fVar, this.q);
            f.a(fVar, this.p);
            f.a(fVar, this.m);
            return fVar;
        }
    }
}
