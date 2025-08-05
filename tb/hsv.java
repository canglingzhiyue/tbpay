package tb;

import android.view.KeyEvent;
import android.view.Window;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.reflect.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0004\f\r\u000e\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/taobao/android/megautils/KeyHooker;", "", com.taobao.android.weex_framework.util.a.ATOM_EXT_window, "Landroid/view/Window;", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/android/megautils/KeyHooker$IKeyListener;", "(Landroid/view/Window;Lcom/taobao/android/megautils/KeyHooker$IKeyListener;)V", "isListening", "", "startListening", "", "stop", "CallbackType", "Companion", "DispatchInvoker", "IKeyListener", "megaUtils_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public final class hsv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);
    private static final Map<Integer, WeakReference<c>> d = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    private boolean f28764a;
    private final Window b;
    private final d c;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bb\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/android/megautils/KeyHooker$CallbackType;", "Landroid/view/Window$Callback;", "megaUtils_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public interface a extends Window.Callback {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/taobao/android/megautils/KeyHooker$Companion;", "", "()V", "hookerMap", "", "", "Ljava/lang/ref/WeakReference;", "Lcom/taobao/android/megautils/KeyHooker$DispatchInvoker;", "megaUtils_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/taobao/android/megautils/KeyHooker$IKeyListener;", "", "dispatchKeyEvent", "", "e", "Landroid/view/KeyEvent;", "megaUtils_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public interface d {
        boolean a(KeyEvent keyEvent);
    }

    public hsv(Window window, d listener) {
        q.d(window, "window");
        q.d(listener, "listener");
        this.b = window;
        this.c = listener;
    }

    public static final /* synthetic */ Map c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[0]) : d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\"\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/taobao/android/megautils/KeyHooker$DispatchInvoker;", "Ljava/lang/reflect/InvocationHandler;", "()V", "listeners", "Ljava/util/ArrayList;", "Lcom/taobao/android/megautils/KeyHooker$IKeyListener;", "getListeners", "()Ljava/util/ArrayList;", "<set-?>", "", "windowHash", "getWindowHash", "()I", "setWindowHash", "(I)V", "windowHash$delegate", "Lkotlin/properties/ReadWriteProperty;", "megaUtils_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static abstract class c implements InvocationHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ k[] f28765a = {t.a(new MutablePropertyReference1Impl(c.class, "windowHash", "getWindowHash()I", 0))};
        private final rvs b = rvp.INSTANCE.a();
        private final ArrayList<d> c = new ArrayList<>(1);

        public final int a() {
            IpChange ipChange = $ipChange;
            return ((Number) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("56c6c5b", new Object[]{this}) : this.b.a(this, f28765a[0]))).intValue();
        }

        public final void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.b.a(this, f28765a[0], Integer.valueOf(i));
            }
        }

        public final ArrayList<d> b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("2f3d5943", new Object[]{this}) : this.c;
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f28764a) {
        } else {
            Window.Callback callback = this.b.getCallback();
            WeakReference<c> weakReference = d.get(Integer.valueOf(this.b.hashCode()));
            e eVar = weakReference != null ? weakReference.get() : null;
            if (eVar == null) {
                eVar = new e(callback);
                eVar.a(this.b.hashCode());
            }
            eVar.b().add(this.c);
            if (!(callback instanceof a)) {
                Object newProxyInstance = Proxy.newProxyInstance(hsv.class.getClassLoader(), new Class[]{a.class}, eVar);
                Window window = this.b;
                if (newProxyInstance == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.Window.Callback");
                }
                window.setCallback((Window.Callback) newProxyInstance);
                d.put(Integer.valueOf(eVar.a()), new WeakReference<>(eVar));
            }
            this.f28764a = true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J0\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"com/taobao/android/megautils/KeyHooker$startListening$1", "Lcom/taobao/android/megautils/KeyHooker$DispatchInvoker;", eau.PARSER_TAG, "", "other", "", "invoke", com.taobao.android.weex_framework.util.a.ATOM_proxy, "method", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "megaUtils_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class e extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Window.Callback b;

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public e(Window.Callback callback) {
            this.b = callback;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) throws Throwable {
            q.d(proxy, "proxy");
            q.d(method, "method");
            if (q.a((Object) method.getName(), (Object) "dispatchKeyEvent")) {
                KeyEvent keyEvent = null;
                KeyEvent keyEvent2 = objArr != null ? objArr[0] : null;
                if (keyEvent2 instanceof KeyEvent) {
                    keyEvent = keyEvent2;
                }
                KeyEvent keyEvent3 = keyEvent;
                if (keyEvent3 != null) {
                    for (d dVar : p.e((Iterable) b())) {
                        if (dVar.a(keyEvent3)) {
                            return true;
                        }
                    }
                }
            } else if (q.a((Object) method.getName(), (Object) "onDetachedFromWindow")) {
                hsv.c().remove(Integer.valueOf(a()));
            }
            if (objArr != null) {
                return method.invoke(this.b, Arrays.copyOf(objArr, objArr.length));
            }
            return method.invoke(this.b, new Object[0]);
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue() : super.equals(obj);
        }
    }

    public final void b() {
        WeakReference<c> weakReference;
        c cVar;
        ArrayList<d> b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.f28764a || (weakReference = d.get(Integer.valueOf(this.b.hashCode()))) == null || (cVar = weakReference.get()) == null || (b2 = cVar.b()) == null) {
        } else {
            b2.remove(this.c);
        }
    }
}
