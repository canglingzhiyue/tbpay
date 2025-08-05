package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.stdpop.api.PopGravity;
import com.taobao.android.stdpop.api.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.t;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007J|\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001623\b\u0002\u0010\u001a\u001a-\u0012!\u0012\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J!\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0002\u0010%J\u0016\u0010&\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007J(\u0010'\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010)\u001a\u00020\u001eH\u0007J&\u0010*\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010(2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010)\u001a\u00020\u001eH\u0007J\u0018\u0010+\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010,\u001a\u00020\u001eH\u0002J\u0014\u0010-\u001a\u00020\u001e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010.\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010/\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\tH\u0002J5\u00100\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\t2#\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0016H\u0002Jt\u00101\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001623\b\u0002\u0010\u001a\u001a-\u0012!\u0012\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0016H\u0007J\b\u00102\u001a\u00020\u001eH\u0002J(\u00103\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"2\u0006\u00104\u001a\u00020 2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J>\u00109\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010:\u001a\u00020\u00042\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001b2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J'\u0010<\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010=\u001a\u00020$H\u0002¢\u0006\u0002\u0010>J\u0018\u0010?\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\n\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000bj\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b`\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/alibaba/android/icart/core/widget/pop/CartPop;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "lastShowTimeMills", "", "showingPops", "Ljava/util/Stack;", "Lcom/alibaba/android/icart/core/widget/pop/CartPopContext;", "showingPopsOfInstance", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", com.taobao.android.weex_framework.util.a.ATOM_EXT_clear, "", "engineInstanceId", "doShow", "presenter", "Lcom/alibaba/android/icart/core/ICartPresenter;", "config", "Lcom/alibaba/android/icart/core/widget/pop/CartPopConfig;", "onShowAction", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "popContext", "onHideAction", "", "data", "fromRecursion", "", "findContainerView", "Landroid/view/View;", "context", "Landroid/app/Activity;", "popContainerId", "", "(Landroid/app/Activity;Ljava/lang/Integer;)Landroid/view/View;", "getTopShowingPop", "hide", "Landroid/content/Context;", "withAnimation", "hideAll", mxf.initView, "isPopAnimating", "isPopShowing", "onHide", "onShowEnd", "onShowStart", "show", "showTooFrequent", "showWithCustomView", "contentView", "stdPopPanel", "Lcom/taobao/android/stdpop/api/StdPopPanel;", "callback", "Lcom/taobao/android/stdpop/api/StdPopCallBack;", "showWithUrl", "url", "customContent", "toggleShowPopPlaceholder", "visibility", "(Landroid/app/Activity;Ljava/lang/Integer;I)V", "updateStripePadding", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class jdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final jdc INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final String f29466a;
    private static final HashMap<String, Stack<pwr>> b;
    private static final Stack<pwr> c;
    private static long d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JR\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"com/alibaba/android/icart/core/widget/pop/CartPop$doShow$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", "v", "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bbz f29467a;
        public final /* synthetic */ jet b;
        public final /* synthetic */ rul c;
        public final /* synthetic */ rul d;

        public a(bbz bbzVar, jet jetVar, rul rulVar, rul rulVar2) {
            this.f29467a = bbzVar;
            this.b = jetVar;
            this.c = rulVar;
            this.d = rulVar2;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            ViewGroup r;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            bez x = this.f29467a.x();
            if (x != null && (r = x.r()) != null) {
                r.removeOnLayoutChangeListener(this);
            }
            jdc.a(jdc.INSTANCE, this.f29467a, this.b, this.c, this.d, true);
            jqg.b(jdc.a(jdc.INSTANCE), "recursion call show");
        }
    }

    static {
        kge.a(852855089);
        INSTANCE = new jdc();
        f29466a = "CartPop";
        b = new HashMap<>();
        c = new Stack<>();
    }

    private jdc() {
    }

    public static final /* synthetic */ String a(jdc jdcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d081dcb1", new Object[]{jdcVar}) : f29466a;
    }

    public static final /* synthetic */ void a(jdc jdcVar, bbz bbzVar, jet jetVar, rul rulVar, rul rulVar2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f59f8a", new Object[]{jdcVar, bbzVar, jetVar, rulVar, rulVar2, new Boolean(z)});
        } else {
            jdcVar.a(bbzVar, jetVar, rulVar, rulVar2, z);
        }
    }

    public static final /* synthetic */ void a(jdc jdcVar, pwr pwrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39a48014", new Object[]{jdcVar, pwrVar});
        } else {
            jdcVar.a(pwrVar);
        }
    }

    public static final /* synthetic */ void a(jdc jdcVar, pwr pwrVar, jet jetVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dab494b", new Object[]{jdcVar, pwrVar, jetVar});
        } else {
            jdcVar.a(pwrVar, jetVar);
        }
    }

    @JvmStatic
    public static final pwr a(String str) {
        pwr pwrVar;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pwr) ipChange.ipc$dispatch("7c740429", new Object[]{str}) : (str == null || (pwrVar = (pwr) ipm.a(b.get(str))) == null) ? (pwr) ipm.a(c) : pwrVar;
    }

    @JvmStatic
    public static final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            return a(str) != null;
        }
        Stack<pwr> stack = b.get(str);
        return !(stack == null || stack.isEmpty());
    }

    @JvmStatic
    public static final void a(bbz presenter, jet config, rul<? super pwr, t> rulVar, rul<? super Map<String, ? extends Object>, t> rulVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c59d23", new Object[]{presenter, config, rulVar, rulVar2});
            return;
        }
        q.d(presenter, "presenter");
        q.d(config, "config");
        INSTANCE.a(presenter, config, rulVar, rulVar2, false);
    }

    private final void a(bbz bbzVar, jet jetVar, rul<? super pwr, t> rulVar, rul<? super Map<String, ? extends Object>, t> rulVar2, boolean z) {
        int i;
        ViewGroup r;
        bby d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eeeba11", new Object[]{this, bbzVar, jetVar, rulVar, rulVar2, new Boolean(z)});
        } else if (!z && a()) {
            jqg.b(f29466a, "调用太频繁了");
        } else {
            Activity m = bbzVar.m();
            q.b(m, "presenter.context");
            adz S = bbzVar.S();
            q.b(S, "presenter.ivOperate");
            String U = S.U();
            if (U == null) {
                U = "";
            }
            if (jetVar.m()) {
                bez x = bbzVar.x();
                if (x != null && (d2 = x.d()) != null) {
                    d2.a(false);
                }
                a((Context) m, U, false);
            }
            if (jetVar.i()) {
                int c2 = bei.c(bbzVar);
                String str = f29466a;
                jqg.b(str, "submitHeight=" + c2);
                if (c2 <= 0) {
                    if (z) {
                        c2 = gbg.b((Context) m, 64.0f);
                    } else {
                        bez x2 = bbzVar.x();
                        if (x2 != null && (r = x2.r()) != null) {
                            r.addOnLayoutChangeListener(new a(bbzVar, jetVar, rulVar, rulVar2));
                        }
                        jqg.b(f29466a, "addOnLayoutChangeListener to footer");
                        return;
                    }
                }
                i = 0 + c2;
                String str2 = f29466a;
                jqg.b(str2, "final submitHeight=" + c2);
            } else {
                i = 0;
            }
            c cVar = new c();
            cVar.a(jetVar.b());
            cVar.c(jetVar.f());
            cVar.a(PopGravity.BOTTOM);
            com.taobao.android.stdpop.api.b bVar = new com.taobao.android.stdpop.api.b();
            bVar.a(jetVar.c() + (gbg.a((Context) m, i) - 1.0f));
            t tVar = t.INSTANCE;
            cVar.a(bVar);
            cVar.a(jetVar.l());
            cVar.a(jetVar.g());
            pwr pwrVar = new pwr();
            pwrVar.a(m);
            String a2 = cVar.a();
            q.b(a2, "stdPopPanel.popId");
            pwrVar.a(a2);
            pwrVar.a(cVar);
            pwrVar.b(U);
            pwrVar.a(jetVar.e());
            a(pwrVar, rulVar);
            b bVar2 = new b(pwrVar, jetVar, rulVar2);
            a(m, jetVar.g(), 0);
            b(bbzVar, jetVar);
            String a3 = jetVar.a();
            if (a3 != null) {
                Uri.Builder buildUpon = Uri.parse(a3).buildUpon();
                buildUpon.appendQueryParameter("cartInstanceId", bbzVar.P());
                buildUpon.appendQueryParameter("popId", cVar.a());
                jdc jdcVar = INSTANCE;
                String builder = buildUpon.toString();
                q.b(builder, "uri.toString()");
                jdcVar.a(m, builder, jetVar.d(), cVar, bVar2);
                return;
            }
            jdc jdcVar2 = this;
            View k = jetVar.k();
            if (k == null) {
                return;
            }
            jdcVar2.a(m, k, cVar, bVar2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/alibaba/android/icart/core/widget/pop/CartPop$doShow$callback$1", "Lcom/taobao/android/stdpop/api/StdPopCallBack;", "onAppear", "", "data", "Lcom/alibaba/fastjson/JSONObject;", "onClose", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class b extends com.taobao.android.stdpop.api.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pwr f29468a;
        public final /* synthetic */ jet b;
        public final /* synthetic */ rul c;

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -989055802) {
                super.c((JSONObject) objArr[0]);
                return null;
            } else if (hashCode != 1673107495) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.b((JSONObject) objArr[0]);
                return null;
            }
        }

        public b(pwr pwrVar, jet jetVar, rul rulVar) {
            this.f29468a = pwrVar;
            this.b = jetVar;
            this.c = rulVar;
        }

        @Override // com.taobao.android.stdpop.api.a
        public void c(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
                return;
            }
            super.c(jSONObject);
            jdc.a(jdc.INSTANCE, this.f29468a);
        }

        @Override // com.taobao.android.stdpop.api.a, tb.scq
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
                return;
            }
            super.b(jSONObject);
            String a2 = jdc.a(jdc.INSTANCE);
            try {
                jdc.a(jdc.INSTANCE, this.f29468a, this.b);
                rul rulVar = this.c;
                if (rulVar == null) {
                    return;
                }
                rulVar.mo2421invoke(jSONObject);
            } catch (Throwable th) {
                jpu c = jpu.a("Ultron").c(a2);
                String message = th.getMessage();
                if (message == null) {
                    message = "出错了";
                }
                jpr.a(c.b(message));
            }
        }
    }

    private final void b(bbz bbzVar, jet jetVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52516", new Object[]{this, bbzVar, jetVar});
            return;
        }
        Activity m = bbzVar.m();
        q.b(m, "presenter.context");
        View a2 = a(m, jetVar.g());
        if (a2 != null) {
            Float n = jetVar.n();
            if (Build.VERSION.SDK_INT >= 21) {
                if (n != null) {
                    a2.setZ(n.floatValue());
                } else {
                    a2.setZ(0.0f);
                }
            }
        }
        a(bbzVar, jetVar);
    }

    @JvmStatic
    public static final void a(bbz presenter, jet config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36c2f95", new Object[]{presenter, config});
            return;
        }
        q.d(presenter, "presenter");
        q.d(config, "config");
        View k = config.k();
        if (k == null) {
            return;
        }
        if (config.j()) {
            k.setPadding(0, 0, 0, bei.b(presenter));
        } else {
            k.setPadding(0, 0, 0, 0);
        }
    }

    private final void a(Activity activity, View view, c cVar, com.taobao.android.stdpop.api.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ff23a", new Object[]{this, activity, view, cVar, aVar});
            return;
        }
        String str = f29466a + "#showWithCustomView";
        try {
            view.setClickable(true);
            cVar.a(activity, view, aVar);
        } catch (Throwable th) {
            jpu c2 = jpu.a("Ultron").c(str);
            String message = th.getMessage();
            if (message == null) {
                message = "出错了";
            }
            jpr.a(c2.b(message));
        }
    }

    private final void a(Activity activity, String str, Map<String, ? extends Object> map, c cVar, com.taobao.android.stdpop.api.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c079ed23", new Object[]{this, activity, str, map, cVar, aVar});
            return;
        }
        String str2 = f29466a;
        try {
            JSONObject jSONObject = null;
            if (map != null) {
                jSONObject = new JSONObject();
                jSONObject.putAll(map);
            }
            cVar.a(activity, str, aVar, jSONObject);
        } catch (Throwable th) {
            jpu c2 = jpu.a("Ultron").c(str2);
            String message = th.getMessage();
            if (message == null) {
                message = "出错了";
            }
            jpr.a(c2.b(message));
        }
    }

    @JvmStatic
    public static final void a(Context context, pwr pwrVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d433cf", new Object[]{context, pwrVar, new Boolean(z)});
        } else if (context == null) {
        } else {
            if (pwrVar == null) {
                pwrVar = (pwr) ipm.a(c);
            }
            if (pwrVar == null) {
                return;
            }
            String str = f29466a;
            try {
                if (!pwrVar.f()) {
                    return;
                }
                pwrVar.c(true);
                pwrVar.e().a(context, z);
            } catch (Throwable th) {
                jpu c2 = jpu.a("Ultron").c(str);
                String message = th.getMessage();
                if (message == null) {
                    message = "出错了";
                }
                jpr.a(c2.b(message));
            }
        }
    }

    @JvmStatic
    public static final void a(Context context, String str, boolean z) {
        Stack<pwr> remove;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{context, str, new Boolean(z)});
        } else if (context == null) {
        } else {
            String str2 = str;
            if (str2 != null && str2.length() != 0) {
                z2 = false;
            }
            if (z2) {
                remove = c;
            } else {
                remove = b.remove(str);
                if (remove == null) {
                    return;
                }
                q.b(remove, "showingPopsOfInstance.re…gineInstanceId) ?: return");
            }
            Iterator<pwr> it = remove.iterator();
            while (it.hasNext()) {
                a(context, it.next(), z);
            }
        }
    }

    @JvmStatic
    public static final void c(String str) {
        Stack<pwr> remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else if (str == null || (remove = b.remove(str)) == null) {
        } else {
            q.b(remove, "showingPopsOfInstance.re…gineInstanceId) ?: return");
            Iterator<pwr> it = remove.iterator();
            while (it.hasNext()) {
                c.remove(it.next());
            }
        }
    }

    private final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        long j = d;
        d = System.currentTimeMillis();
        return System.currentTimeMillis() - j <= ((long) 200);
    }

    private final void a(pwr pwrVar, rul<? super pwr, t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af442df4", new Object[]{this, pwrVar, rulVar});
            return;
        }
        pwrVar.b(false);
        pwrVar.c(true);
        c.push(pwrVar);
        Stack<pwr> stack = b.get(pwrVar.b());
        if (stack == null) {
            stack = new Stack<>();
        }
        b.put(pwrVar.b(), stack);
        stack.push(pwrVar);
        if (rulVar != null) {
            rulVar.mo2421invoke(pwrVar);
        }
        jqg.a(f29466a, "onShowStart:", pwrVar.a(), ":", pwrVar.b());
    }

    private final void a(pwr pwrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa7573ad", new Object[]{this, pwrVar});
            return;
        }
        pwrVar.b(true);
        pwrVar.c(false);
        jqg.a(f29466a, "onShowEnd:", pwrVar.a(), ":", pwrVar.b());
    }

    private final void a(pwr pwrVar, jet jetVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0bf93e4", new Object[]{this, pwrVar, jetVar});
            return;
        }
        pwrVar.b(false);
        pwrVar.c(false);
        c.remove(pwrVar);
        Stack<pwr> stack = b.get(pwrVar.b());
        if (stack == null) {
            return;
        }
        q.b(stack, "showingPopsOfInstance[po…gineInstanceId] ?: return");
        stack.remove(pwrVar);
        if (jetVar.h()) {
            a(pwrVar.d(), pwrVar.e().b(), 8);
        }
        jqg.a(f29466a, "onHide:", pwrVar.a(), ":", pwrVar.b());
    }

    private final View a(Activity activity, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("40b9e97f", new Object[]{this, activity, num});
        }
        if (num != null && -1 != num.intValue()) {
            return activity.findViewById(num.intValue());
        }
        return null;
    }

    private final void a(Activity activity, Integer num, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12002c26", new Object[]{this, activity, num, new Integer(i)});
            return;
        }
        Boolean.valueOf(false);
        try {
            View a2 = INSTANCE.a(activity, num);
            if (a2 == null) {
                return;
            }
            a2.setVisibility(i);
            t tVar = t.INSTANCE;
        } catch (Throwable th) {
            jqg.a("UltronCatchException", th.getMessage());
        }
    }
}
