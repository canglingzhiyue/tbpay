package tb;

import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.extension.page.f;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.preload.c;
import com.taobao.themis.uniapp.solution.d;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\nH\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J?\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001dH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/taobao/themis/uniapp/solution/extension/page/MainDocumentExtension;", "Lcom/taobao/themis/kernel/extension/page/IMainDocumentExtension;", "()V", "mHasRequested", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mHasResponded", "mListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/taobao/themis/kernel/extension/page/IMainDocumentExtension$MainDocumentListener;", "mLoadInfo", "Lcom/taobao/themis/kernel/preload/UniAppDocumentLoadInfo;", "mRequestClient", "Lcom/taobao/themis/uniapp/solution/UniAppDocumentClient;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "getDocumentLoadInfo", "getDocumentLoadInfoAsync", "", DataReceiveMonitor.CB_LISTENER, "handleResponse", "loadInfo", "hasRequested", "", "hasResponded", FactoryType.TYPE_INVALID, "onRegister", "onUnRegister", "request", "url", "", "version", "renderer", "isPreset", "callback", "Lcom/taobao/themis/kernel/extension/page/IMainDocumentExtension$RequestCallback;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/taobao/themis/kernel/extension/page/IMainDocumentExtension$RequestCallback;)V", "setDocumentLoadInfo", "setRenderer", "Companion", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class iwm implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private c c;
    private ITMSPage f;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f29376a = new AtomicBoolean(false);
    private final d b = new d();
    private AtomicBoolean d = new AtomicBoolean(false);
    private final CopyOnWriteArrayList<f.b> e = new CopyOnWriteArrayList<>();

    static {
        kge.a(-904918679);
        kge.a(618043222);
        Companion = new a(null);
    }

    public static final /* synthetic */ void a(iwm iwmVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d64f12e7", new Object[]{iwmVar, cVar});
        } else {
            iwmVar.c = cVar;
        }
    }

    public static final /* synthetic */ void b(iwm iwmVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5d8ace8", new Object[]{iwmVar, cVar});
        } else {
            iwmVar.b(cVar);
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            f.a.a(this);
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.f
    public void a(String str, String str2, String str3, Boolean bool, f.c cVar) {
        String str4;
        String str5;
        String str6;
        com.taobao.themis.kernel.f b2;
        TMSMetaInfoWrapper v;
        AppManifest v2;
        com.taobao.themis.kernel.entity.a c;
        com.taobao.themis.kernel.container.b e;
        com.taobao.themis.kernel.entity.a c2;
        com.taobao.themis.kernel.container.b e2;
        com.taobao.themis.kernel.entity.a c3;
        com.taobao.themis.kernel.container.b e3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5acae09", new Object[]{this, str, str2, str3, bool, cVar});
        } else if (this.f29376a.get()) {
        } else {
            Boolean bool2 = null;
            if (str == null) {
                ITMSPage iTMSPage = this.f;
                str4 = (iTMSPage == null || (c3 = iTMSPage.c()) == null || (e3 = c3.e()) == null) ? null : e3.b();
            } else {
                str4 = str;
            }
            if (str4 == null) {
                return;
            }
            if (str2 == null) {
                ITMSPage iTMSPage2 = this.f;
                str5 = (iTMSPage2 == null || (c2 = iTMSPage2.c()) == null || (e2 = c2.e()) == null) ? null : e2.d();
            } else {
                str5 = str2;
            }
            if (str3 == null) {
                ITMSPage iTMSPage3 = this.f;
                str6 = (iTMSPage3 == null || (c = iTMSPage3.c()) == null || (e = c.e()) == null) ? null : e.e();
            } else {
                str6 = str3;
            }
            this.f29376a.set(true);
            d dVar = this.b;
            if (bool == null) {
                ITMSPage iTMSPage4 = this.f;
                if (iTMSPage4 != null && (b2 = iTMSPage4.b()) != null && (v = b2.v()) != null && (v2 = v.v()) != null) {
                    bool2 = Boolean.valueOf(v2.getPreset());
                }
            } else {
                bool2 = bool;
            }
            d.a(dVar, str4, str5, null, str6, false, bool2 != null ? bool2.booleanValue() : false, new b(cVar), 20, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010!\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J,\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e\u0018\u00010\rH\u0016¨\u0006\u000f"}, d2 = {"com/taobao/themis/uniapp/solution/extension/page/MainDocumentExtension$request$1", "Lcom/taobao/themis/uniapp/solution/UniAppDocumentClient$Callback;", "onError", "", "code", "", "msg", "", "onFinish", "loadInfo", "Lcom/taobao/themis/kernel/preload/UniAppDocumentLoadInfo;", "onNetWorkResponse", "header", "", "", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ f.c b;

        public b(f.c cVar) {
            this.b = cVar;
        }

        @Override // com.taobao.themis.uniapp.solution.d.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                d.a.C0978a.a(this);
            }
        }

        @Override // com.taobao.themis.uniapp.solution.d.a
        public void a(int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map});
            } else {
                d.a.C0978a.a(this, i, map);
            }
        }

        @Override // com.taobao.themis.uniapp.solution.d.a
        public void b(int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c62340b", new Object[]{this, new Integer(i), map});
                return;
            }
            if (200 > i || 299 < i) {
                iwm.a(iwm.this, new c());
            }
            f.c cVar = this.b;
            if (cVar == null) {
                return;
            }
            cVar.b(i, map);
        }

        @Override // com.taobao.themis.uniapp.solution.d.a
        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                return;
            }
            iwm.b(iwm.this, new c());
            f.c cVar = this.b;
            if (cVar == null) {
                return;
            }
            cVar.a(i, str);
        }

        @Override // com.taobao.themis.uniapp.solution.d.a
        public void a(c loadInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f61bb256", new Object[]{this, loadInfo});
                return;
            }
            q.d(loadInfo, "loadInfo");
            iwm.b(iwm.this, loadInfo);
            f.c cVar = this.b;
            if (cVar == null) {
                return;
            }
            cVar.a(loadInfo);
        }
    }

    public void a(c loadInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f61bb256", new Object[]{this, loadInfo});
            return;
        }
        q.d(loadInfo, "loadInfo");
        this.f29376a.set(true);
        b(loadInfo);
    }

    @Override // com.taobao.themis.kernel.extension.page.f
    public void a(f.b listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e10c29", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        if (this.d.get()) {
            c cVar = this.c;
            q.a(cVar);
            listener.a(cVar);
            return;
        }
        this.e.add(listener);
    }

    @Override // com.taobao.themis.kernel.extension.page.f
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f29376a.get();
    }

    @Override // com.taobao.themis.kernel.extension.page.f
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!d()) {
        } else {
            this.b.a();
        }
    }

    public void a(String renderer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, renderer});
            return;
        }
        q.d(renderer, "renderer");
        this.b.a(renderer);
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c_(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4ed18e", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        this.f = page;
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.b.a();
        this.e.clear();
    }

    private final void b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82bbdd57", new Object[]{this, cVar});
            return;
        }
        this.c = cVar;
        this.d.set(true);
        for (f.b bVar : this.e) {
            bVar.a(cVar);
        }
        this.e.clear();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/uniapp/solution/extension/page/MainDocumentExtension$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(263587185);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
