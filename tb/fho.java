package tb;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.android.AliUrlImageView;
import com.taobao.android.detail2.core.framework.base.weex.ContainerError;
import com.taobao.android.detail2.core.framework.base.weex.c;
import com.taobao.android.detail2.core.framework.base.widget.RoundRectCardRoot;
import com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager;
import com.taobao.android.detail2.core.mainpic.GestureRoundRectCardRoot;
import com.taobao.android.detail2.core.optimize.prerender.b;
import com.taobao.monitor.procedure.v;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.flexbox.layoutmanager.container.n;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.weex.common.WXPerformance;
import com.taobao.weex.g;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import tb.fit;
import tb.fmd;
import tb.jyx;

/* loaded from: classes5.dex */
public class fho extends com.taobao.android.detail2.core.framework.view.feeds.d<fhi, fhb> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CONTAINER_DIMENSION = "containerDimension";
    public static final String KEY_FEATURE_ENABLE_INSIDE_DETAIL = "enableInsideDetail";
    public static final String KEY_FULL_SCREEN_STYLE = "fullScreenStyle";
    public static final String KEY_NEXT_CARD_DIMENSION = "nextCardContainerDimension";
    public static final String VIEWHOLDER_KEY = "item";
    public static fma c;
    private com.taobao.android.detail2.core.mainpic.b A;
    private jvq B;

    /* renamed from: a  reason: collision with root package name */
    public RelativeLayout f27946a;
    public AliUrlImageView b;
    private FrameLayout d;
    private fit e;
    private com.taobao.android.detail2.core.framework.base.weex.c f;
    private FrameLayout g;
    private ImageView o;
    private RoundRectCardRoot p;
    private ImageView q;
    private FrameLayout r;
    private boolean s;
    private Runnable t;
    private fit.a u;
    private final com.taobao.android.detail2.core.framework.base.weex.b v;
    private c y;
    public boolean z;

    /* renamed from: tb.fho$7  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass7 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27953a = new int[ContainerError.values().length];

        static {
            try {
                f27953a[ContainerError.WEEX_URL_INCONSISTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27953a[ContainerError.WEEX_URL_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static /* synthetic */ Object ipc$super(fho fhoVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d A(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("6d3aeae1", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d B(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("9a8e740", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d C(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("a616e39f", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b D(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("5c642f5d", new Object[]{fhoVar}) : fhoVar.j;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d E(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("def2dc5d", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d F(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("7b60d8bc", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b G(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("cd204a60", new Object[]{fhoVar}) : fhoVar.j;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d H(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("b43cd17a", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b I(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("18485c62", new Object[]{fhoVar}) : fhoVar.j;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d J(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("ed18ca38", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d K(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("8986c697", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.mainpic.b L(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.mainpic.b) ipChange.ipc$dispatch("48debe12", new Object[]{fhoVar}) : fhoVar.A;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b M(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("ae988066", new Object[]{fhoVar}) : fhoVar.j;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d N(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("5ed0bbb4", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b O(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("f9c09268", new Object[]{fhoVar}) : fhoVar.j;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d P(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("97acb472", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b Q(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("44e8a46a", new Object[]{fhoVar}) : fhoVar.j;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d R(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("d088ad30", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d S(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("6cf6a98f", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b T(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("b5a4bf6d", new Object[]{fhoVar}) : fhoVar.j;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d U(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("a5d2a24d", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d V(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("42409eac", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b W(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("2660da70", new Object[]{fhoVar}) : fhoVar.j;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d X(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("7b1c976a", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d Y(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("178a93c9", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d Z(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("b3f89028", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ void a(fho fhoVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21926085", new Object[]{fhoVar, jSONObject});
        } else {
            fhoVar.a(jSONObject);
        }
    }

    public static /* synthetic */ void a(fho fhoVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32bcbb", new Object[]{fhoVar, str, jSONObject});
        } else {
            fhoVar.d(str, jSONObject);
        }
    }

    public static /* synthetic */ void a(fho fhoVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29786c69", new Object[]{fhoVar, new Boolean(z)});
        } else {
            fhoVar.b(z);
        }
    }

    public static /* synthetic */ boolean a(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e8903fcf", new Object[]{fhoVar})).booleanValue() : fhoVar.U();
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d aa(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("6ae1d6a2", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b ab(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("2993003a", new Object[]{fhoVar}) : fhoVar.j;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d ac(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("a3bdcf60", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b ad(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("74bb123c", new Object[]{fhoVar}) : fhoVar.j;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d ae(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("dc99c81e", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d af(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("7907c47d", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d ag(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("1575c0dc", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d ah(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("b1e3bd3b", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d ai(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("4e51b99a", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d aj(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("eabfb5f9", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d ak(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("872db258", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b al(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("a15b5a44", new Object[]{fhoVar}) : fhoVar.j;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b b(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("c3bd3d7b", new Object[]{fhoVar}) : fhoVar.j;
    }

    public static /* synthetic */ boolean b(fho fhoVar, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b56360c", new Object[]{fhoVar, new Boolean(z)})).booleanValue() : fhoVar.a(z);
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b c(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("e951467c", new Object[]{fhoVar}) : fhoVar.j;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b d(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("ee54f7d", new Object[]{fhoVar}) : fhoVar.j;
    }

    public static /* synthetic */ RoundRectCardRoot e(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RoundRectCardRoot) ipChange.ipc$dispatch("da9224e9", new Object[]{fhoVar}) : fhoVar.p;
    }

    public static /* synthetic */ ImageView f(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("d1811940", new Object[]{fhoVar}) : fhoVar.q;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d g(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("a58e60fb", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d h(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("41fc5d5a", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d i(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("de6a59b9", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d j(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("7ad85618", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d k(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("17465277", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b l(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("3b859785", new Object[]{fhoVar}) : fhoVar.j;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d m(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("50224b35", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d n(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("ec904794", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b o(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("ac41b288", new Object[]{fhoVar}) : fhoVar.j;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b p(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("d1d5bb89", new Object[]{fhoVar}) : fhoVar.j;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d q(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("c1da3cb1", new Object[]{fhoVar}) : fhoVar.i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b r(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("1cfdcd8b", new Object[]{fhoVar}) : fhoVar.j;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b s(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("4291d68c", new Object[]{fhoVar}) : fhoVar.j;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b t(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("6825df8d", new Object[]{fhoVar}) : fhoVar.j;
    }

    public static /* synthetic */ fkr u(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkr) ipChange.ipc$dispatch("cb36891a", new Object[]{fhoVar}) : fhoVar.N();
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b v(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("b34df18f", new Object[]{fhoVar}) : fhoVar.j;
    }

    public static /* synthetic */ fmd w(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fmd) ipChange.ipc$dispatch("9a7a3ba8", new Object[]{fhoVar}) : fhoVar.k;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b x(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("fe760391", new Object[]{fhoVar}) : fhoVar.j;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b y(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("240a0c92", new Object[]{fhoVar}) : fhoVar.j;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.model.d z(fho fhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("41b81c08", new Object[]{fhoVar}) : fhoVar.i;
    }

    private boolean U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c35260", new Object[]{this})).booleanValue() : this.i != 0 && ((fhi) this.i).f == 0;
    }

    public fho(View view, ViewGroup viewGroup, fmd fmdVar, com.taobao.android.detail2.core.framework.b bVar, b.C0469b c0469b) {
        super(viewGroup, fmdVar, bVar);
        this.y = new c();
        this.t = new Runnable() { // from class: tb.fho.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!fho.a(fho.this) || fho.c(fho.this) == null || fho.d(fho.this).k() == null || !fho.b(fho.this).k().a()) {
                    if (fho.e(fho.this) != null) {
                        fho.e(fho.this).setVisibility(8);
                    }
                    if (fho.f(fho.this) == null) {
                        return;
                    }
                    fho.f(fho.this).setVisibility(8);
                } else if (fho.this.K()) {
                } else {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setInterpolator(new LinearInterpolator());
                    alphaAnimation.setDuration(fkt.aC());
                    alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: tb.fho.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                            }
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                            }
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                            } else if (fho.this.K() || fho.e(fho.this) == null) {
                            } else {
                                fho.e(fho.this).setVisibility(8);
                            }
                        }
                    });
                    if (fho.e(fho.this) == null) {
                        return;
                    }
                    fho.e(fho.this).startAnimation(alphaAnimation);
                }
            }
        };
        this.u = new fit.a() { // from class: tb.fho.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fit.a
            public void a(String str, JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
                } else {
                    fho.a(fho.this, str, jSONObject);
                }
            }

            @Override // tb.fit.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (fho.h(fho.this) == null) {
                } else {
                    ctu.a("onVideoFirstFrame");
                    if (((fhi) fho.i(fho.this)).f == 0 && !((fhi) fho.g(fho.this)).z) {
                        if (((fhi) fho.j(fho.this)).ai) {
                            fjt.a(fjt.TAG_TIP, "NdVideoSettingHelper: VH-视频未自动播放场景，不上报 FcpVideoReady 。");
                        } else {
                            com.taobao.android.detail2.core.framework.a f = fho.l(fho.this).f();
                            fjp.b(f, fjp.SECTION_FIRST_VIDEO_READY, "nid=" + ((fhi) fho.m(fho.this)).k);
                            if (((fhi) fho.k(fho.this)).d) {
                                ((fhi) fho.n(fho.this)).d = false;
                                com.taobao.android.detail2.core.framework.a f2 = fho.o(fho.this).f();
                                fjp.b(f2, fjp.SECTION_FIRST_OPEN_IMMEDIATELY_VIDEO_READY, "nid=" + ((fhi) fho.q(fho.this)).k);
                            }
                        }
                        if (fho.r(fho.this) != null && fho.p(fho.this).k() != null && fho.s(fho.this).k().a() && fho.a(fho.this) && fho.t(fho.this).k().b() && !NavBarViewManager.c(fho.u(fho.this).G())) {
                            fho.v(fho.this).k().d();
                        }
                    }
                    ctu.a();
                }
            }

            @Override // tb.fit.a
            public HashMap<String, String> b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (HashMap) ipChange.ipc$dispatch("8adf10c", new Object[]{this});
                }
                HashMap<String, String> hashMap = (HashMap) fho.this.k();
                if (fho.w(fho.this) != null) {
                    hashMap = (HashMap) fjg.a(fho.x(fho.this).f(), fho.y(fho.this).h(), hashMap, fho.z(fho.this));
                }
                if (fho.A(fho.this) != null) {
                    hashMap.put("cardUTArgs", ((fhi) fho.B(fho.this)).K().toJSONString());
                }
                return hashMap;
            }

            @Override // tb.fit.a
            public void a(SuccPhenixEvent succPhenixEvent, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2e6d4d64", new Object[]{this, succPhenixEvent, new Boolean(z)});
                } else if (z || fho.C(fho.this) == null || ((fhi) fho.F(fho.this)).z) {
                } else {
                    if (((fhi) fho.E(fho.this)).f == 0) {
                        com.taobao.android.detail2.core.framework.a f = fho.D(fho.this).f();
                        fjp.b(f, fjp.SECTION_FIRST_NATIVE_PIC_VISIBLE, "是否内存返回: " + succPhenixEvent.isImmediate() + ", url: " + succPhenixEvent.getUrl());
                        if (fho.u(fho.this).S()) {
                            com.taobao.android.detail2.core.framework.a f2 = fho.G(fho.this).f();
                            fjp.b(f2, fjp.SECTION_FIRST_OPEN_IMMEDIATELY_NATIVE_PIC_VISIBLE, "是否内存返回: " + succPhenixEvent.isImmediate() + ", url: " + succPhenixEvent.getUrl());
                        }
                    } else if (((fhi) fho.H(fho.this)).f == 1 && fho.u(fho.this).an() && fho.this.l.g()) {
                        com.taobao.android.detail2.core.framework.a f3 = fho.I(fho.this).f();
                        fjp.b(f3, fjp.SECTION_SECOND_NATIVE_PIC_VISIBLE, "是否内存返回: " + succPhenixEvent.isImmediate() + ", url: " + succPhenixEvent.getUrl());
                    }
                    fjt.a(fjt.TAG_MEDIA_CONTROLLER, "封面图加载成功 index=" + ((fhi) fho.K(fho.this)).f + "，是否内存返回: " + succPhenixEvent.isImmediate() + ", url: " + succPhenixEvent.getUrl(), (Throwable) null);
                }
            }
        };
        this.B = new jvq() { // from class: tb.fho.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jvq
            public void a(Map<String, Object> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                } else if (map == null || map.size() == 0) {
                    fjt.a(fjt.TAG_RENDER, "weex onGestureEvent gestureinfo为空");
                } else {
                    boolean booleanValue = ((Boolean) map.get("state")).booleanValue();
                    fjt.a(fjt.TAG_RENDER, "acceptGestureType: " + ((String) map.get("acceptGestureType")));
                    fho.a(fho.this, booleanValue);
                }
            }
        };
        this.v = new com.taobao.android.detail2.core.framework.base.weex.b() { // from class: tb.fho.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail2.core.framework.base.weex.b, com.taobao.android.detail2.core.framework.base.weex.f
            public void a(com.taobao.android.detail2.core.framework.base.weex.a aVar, View view2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("350b2c8a", new Object[]{this, aVar, view2});
                } else if (fho.this.F() == 0) {
                    com.taobao.android.detail2.core.framework.a f = fho.M(fho.this).f();
                    fjp.b(f, fjp.SECTION_FIRST_MAIN_WEEXV2_INSTANCE_CREATE, "itemId=" + ((fhi) fho.N(fho.this)).k + ", url=" + aVar.j());
                    com.taobao.android.detail2.core.framework.a f2 = fho.O(fho.this).f();
                    fjp.a(f2, fjp.SECTION_FIRST_MAIN_WEEXV2_RENDER, "itemId=" + ((fhi) fho.S(fho.this)).k + ", url=" + aVar.j());
                } else {
                    fjt.a(fjt.TAG_RENDER, "weexInstance创建完成：, index: " + fho.this.F() + ", itemId=" + ((fhi) fho.P(fho.this)).k + ", url=" + aVar.j());
                }
            }

            @Override // com.taobao.android.detail2.core.framework.base.weex.b, com.taobao.android.detail2.core.framework.base.weex.f
            public void a(com.taobao.android.detail2.core.framework.base.weex.a aVar, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("266c25a8", new Object[]{this, aVar, new Integer(i), new Integer(i2)});
                } else if (fho.this.F() == 0) {
                    com.taobao.android.detail2.core.framework.a f = fho.Q(fho.this).f();
                    fjp.b(f, fjp.SECTION_FIRST_MAIN_WEEXV2_RENDER, "itemId=" + ((fhi) fho.R(fho.this)).k + ", url=" + aVar.j());
                    com.taobao.android.detail2.core.framework.a f2 = fho.T(fho.this).f();
                    fjp.a(f2, fjp.SECTION_FIRST_MAIN_WEEX_GET_DETAIL_RENDER, "itemId=" + ((fhi) fho.U(fho.this)).k + ", url=" + aVar.j());
                } else {
                    fjt.a(fjt.TAG_RENDER, "weex渲染成功：, index: " + fho.this.F() + "itemId=" + ((fhi) fho.J(fho.this)).k + ", url=" + aVar.j());
                }
            }

            @Override // com.taobao.android.detail2.core.framework.base.weex.b, com.taobao.android.detail2.core.framework.base.weex.f
            public void a(com.taobao.android.detail2.core.framework.base.weex.a aVar, String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5805a85c", new Object[]{this, aVar, str, str2});
                    return;
                }
                com.taobao.android.detail2.core.framework.data.model.d V = fho.V(fho.this);
                fjp.a(V, "20002", "[fixWeexContainer]weex渲染异常, errorCode: " + str + "errorMsg: " + str2, true);
            }

            @Override // com.taobao.android.detail2.core.framework.base.weex.b
            public void a(com.taobao.android.detail2.core.framework.base.weex.a aVar, String str, JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e1d2861e", new Object[]{this, aVar, str, jSONObject});
                } else if (fho.this.F() != 0) {
                } else {
                    com.taobao.android.detail2.core.framework.a f = fho.W(fho.this).f();
                    fjp.a(f, fjp.SECTION_FIRST_MAIN_WEEXV2_INSTANCE_CREATE, "itemId=" + ((fhi) fho.X(fho.this)).k);
                }
            }

            @Override // com.taobao.android.detail2.core.framework.base.weex.b
            public void a(com.taobao.android.detail2.core.framework.base.weex.a aVar, JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2b69cca8", new Object[]{this, aVar, jSONObject});
                } else if (fho.this.F() != 0) {
                } else {
                    if (!((fhi) fho.Y(fho.this)).z) {
                        ((fhi) fho.Z(fho.this)).a(System.currentTimeMillis(), false);
                    }
                    if (((fhi) fho.aa(fho.this)).C) {
                        com.taobao.android.detail2.core.framework.a f = fho.ab(fho.this).f();
                        fjp.a(f, fjp.SECTION_FIRST_MAIN_WEEX_REFRESH_PRE, "itemId=" + ((fhi) fho.ac(fho.this)).k);
                        return;
                    }
                    com.taobao.android.detail2.core.framework.a f2 = fho.ad(fho.this).f();
                    fjp.a(f2, fjp.SECTION_FIRST_MAIN_WEEX_REFRESH, "itemId=" + ((fhi) fho.ae(fho.this)).k);
                }
            }

            @Override // com.taobao.android.detail2.core.framework.base.weex.b
            public void a(com.taobao.android.detail2.core.framework.base.weex.a aVar, ContainerError containerError, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2a3c650a", new Object[]{this, aVar, containerError, str});
                    return;
                }
                int i = AnonymousClass7.f27953a[containerError.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    com.taobao.android.detail2.core.framework.data.model.d ai = fho.ai(fho.this);
                    fjp.a(ai, fjp.ERROR_CODE_WEEX_URL_EMPTY, "[fixWeexContainer]" + str, true);
                    return;
                }
                com.taobao.android.detail2.core.framework.data.model.d af = fho.af(fho.this);
                fjp.a(af, fjp.ERROR_CODE_WEEX_URL_CHANGE, "[fixWeexContainer]" + str, true);
                if (fho.this.F() != 0 || ((fhi) fho.ag(fho.this)).z) {
                    return;
                }
                ((fhi) fho.ah(fho.this)).a(System.currentTimeMillis(), true);
            }

            @Override // com.taobao.android.detail2.core.framework.base.weex.b
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (fho.this.F() != 0) {
                } else {
                    if (!((fhi) fho.aj(fho.this)).z) {
                        ((fhi) fho.ak(fho.this)).a(System.currentTimeMillis(), false);
                    }
                    if (fig.f27971a != 1 || g.f23505a == -1 || System.currentTimeMillis() - g.f23505a < 0) {
                        return;
                    }
                    fjp.a(fho.al(fho.this).f(), "fontPrefetchHit", (Object) "true");
                }
            }
        };
        ctu.a("ItemCardViewHolder_initView");
        a(view, c0469b);
        ctu.a();
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.d
    public boolean a(fhi fhiVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e88d8595", new Object[]{this, fhiVar})).booleanValue();
        }
        if (fhiVar == null) {
            return false;
        }
        R();
        M();
        if (a(false)) {
            z = true;
        } else {
            T();
            z = false;
        }
        if (P()) {
            S();
            this.b.setVisibility(8);
            this.d.setVisibility(0);
            z = true;
        } else {
            this.d.setVisibility(8);
        }
        ctu.a("bindMainPicContainer");
        com.taobao.android.detail2.core.mainpic.b bVar = this.A;
        if (bVar != null) {
            if (bVar.a(fhiVar)) {
                this.A.a(0);
                this.b.setVisibility(8);
            } else {
                this.A.a(8);
            }
        }
        ctu.a();
        ctu.a("bindFixWeexContainer");
        if (O()) {
            z = true;
        }
        ctu.a();
        if (this.i != 0 && ((fhi) this.i).C && ((fhi) this.i).q() && !((fhi) this.i).z && N().S()) {
            ((fhi) this.i).d = true;
            ((fhi) this.i).ac = true;
            ((fhi) this.i).ad = true;
        }
        return z;
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        fjt.a(fjt.TAG_RENDER, "processWeexGesture: " + z);
        if (z) {
            View findViewById = ((ViewGroup) this.itemView).findViewById(R.id.half_screen_round_root);
            if (!(findViewById instanceof GestureRoundRectCardRoot)) {
                return;
            }
            GestureRoundRectCardRoot gestureRoundRectCardRoot = (GestureRoundRectCardRoot) findViewById;
            gestureRoundRectCardRoot.setWeexConsume(GestureRoundRectCardRoot.WEEX_STATE_CONSUME);
            gestureRoundRectCardRoot.clearPendingEvent();
            return;
        }
        View findViewById2 = ((ViewGroup) this.itemView).findViewById(R.id.half_screen_round_root);
        if (!(findViewById2 instanceof GestureRoundRectCardRoot)) {
            return;
        }
        GestureRoundRectCardRoot gestureRoundRectCardRoot2 = (GestureRoundRectCardRoot) findViewById2;
        gestureRoundRectCardRoot2.setWeexConsume(GestureRoundRectCardRoot.WEEX_STATE_NOT_CONSUME);
        gestureRoundRectCardRoot2.doPendingEvent();
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        fit fitVar = this.e;
        if (fitVar != null) {
            fitVar.a();
        }
        com.taobao.android.detail2.core.mainpic.b bVar = this.A;
        if (bVar == null) {
            return;
        }
        bVar.c();
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        fit fitVar = this.e;
        if (fitVar != null) {
            fitVar.b((fhi) this.i);
        }
        com.taobao.android.detail2.core.mainpic.b bVar = this.A;
        if (bVar == null) {
            return;
        }
        bVar.d();
    }

    private void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
            return;
        }
        ctu.a("bindNoOpenImmedPlaceHolderStart");
        ctu.a();
        if (this.i == 0 || this.j.g() == null) {
            fjt.a(fjt.TAG_RENDER, "mCurrentNode或mNewDetailContext.getContext为空，bindNoOpenImmedPlaceHolder return");
        } else if (((fhi) this.i).ag) {
            fjt.a(fjt.TAG_RENDER, this.i + "mCurrentNode.mHasHandleNoOPenImmedPlaceHolder == true return");
        } else if (((fhi) this.i).V == null) {
            fjt.a(fjt.TAG_RENDER, ((fhi) this.i).f + "mNoOpenImmedPlaceHolderComponent为空，bindNoOpenImmedPlaceHolder return");
            if (((fhi) this.i).f != 0) {
                return;
            }
            fjp.a(this.j.f(), "deliverPicFail", (Object) "componentNull");
        } else if (StringUtils.isEmpty(((fhi) this.i).V.f27945a)) {
            fjt.a(fjt.TAG_RENDER, ((fhi) this.i).f + "mNoOpenImmedPlaceHolderComponent.url为空，bindNoOpenImmedPlaceHolder return");
            if (((fhi) this.i).f != 0) {
                return;
            }
            fjp.a(this.j.f(), "deliverPicFail", (Object) "componentUrlNull");
        } else if (StringUtils.isEmpty(((fhi) this.i).V.c)) {
            fjt.a(fjt.TAG_RENDER, ((fhi) this.i).f + "mNoOpenImmedPlaceHolderComponent.dimension为空，bindNoOpenImmedPlaceHolder return");
            if (((fhi) this.i).f != 0) {
                return;
            }
            fjp.a(this.j.f(), "deliverPicFail", (Object) "componentDimensionNull");
        } else {
            com.taobao.phenix.intf.b.h().a(fln.a(this.j.g(), ((fhi) this.i).V.f27945a)).addLoaderExtra(esr.BUNDLE_BIZ_CODE, fln.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new b(this.j, this.o, ((fhi) this.i).f, false, false, true)).failListener(new a(this.j, this.i, false, true)).fetch();
            com.taobao.android.detail2.core.framework.base.media.frame.a a2 = oyn.a(this.j, (fhi) this.i, ((fhi) this.i).V.c, this.l.b(), this.l.c());
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.p.getLayoutParams();
            layoutParams.topMargin = a2.g;
            layoutParams.width = a2.b;
            layoutParams.height = a2.f11471a;
            this.o.setScaleType(a2.h);
            this.p.setLayoutParams(layoutParams);
            this.p.setCornerRadius(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
            if (((fhi) this.i).V.e) {
                com.taobao.phenix.intf.b.h().a(fln.a(this.j.g(), ((fhi) this.i).V.f27945a)).bitmapProcessors(true, new com.taobao.phenix.compat.effects.b(this.q.getContext(), ab().p(), 2)).addLoaderExtra(esr.BUNDLE_BIZ_CODE, fln.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new b(this.j, this.q, ((fhi) this.i).f, true, false, true)).failListener(new a(this.j, this.i, true, true)).fetch();
            }
            fjt.a(fjt.TAG_RENDER, ((fhi) this.i).f + "bindNoOpenImmedPlaceHolder成功：" + ((fhi) this.i).V.f27945a);
            ((fhi) this.i).Y();
            ctu.a("bindNoOpenImmedPlaceHolderEnd");
            ctu.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(boolean r28) {
        /*
            Method dump skipped, instructions count: 1286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fho.a(boolean):boolean");
    }

    private TaobaoImageUrlStrategy.ImageBlur L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy.ImageBlur) ipChange.ipc$dispatch("60545cb2", new Object[]{this});
        }
        if (F() != 0) {
            return null;
        }
        String string = ((fhi) this.i).H().getString("openImmediatelyBlur");
        if (StringUtils.isEmpty(string)) {
            return null;
        }
        try {
            return (TaobaoImageUrlStrategy.ImageBlur) Enum.valueOf(TaobaoImageUrlStrategy.ImageBlur.class, string);
        } catch (Exception unused) {
            fjp.a(fjp.SCENE_OPEN_IMMEDIATELY, fjp.ERROR_CODE_OPEN_IMMEDIATELY_BLUR_PARSE_ERROR, "解析高斯模糊参数出错", N().T());
            return null;
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements com.taobao.phenix.intf.event.a<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public com.taobao.android.detail2.core.framework.data.model.d f27954a;
        public boolean b;
        public com.taobao.android.detail2.core.framework.b c;
        public boolean d;

        static {
            kge.a(-154938867);
            kge.a(-1292221460);
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
        }

        public a(com.taobao.android.detail2.core.framework.b bVar, com.taobao.android.detail2.core.framework.data.model.d dVar, boolean z, boolean z2) {
            this.c = bVar;
            this.f27954a = dVar;
            this.b = z;
            this.d = z2;
        }

        public boolean a(FailPhenixEvent failPhenixEvent) {
            com.taobao.android.detail2.core.framework.b bVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            if (failPhenixEvent == null) {
                return false;
            }
            if (this.b) {
                com.taobao.android.detail2.core.framework.data.model.d dVar = this.f27954a;
                fjp.a(dVar, fjp.SCENE_OPEN_IMMEDIATELY, fjp.ERROR_CODE_OPEN_IMMEDIATELY_GAUSSIAN_PIC_LOAD_FAIL, "瞬开高斯模糊图片加载失败，url：" + failPhenixEvent.getUrl(), false);
            } else {
                com.taobao.android.detail2.core.framework.data.model.d dVar2 = this.f27954a;
                fjp.a(dVar2, fjp.SCENE_OPEN_IMMEDIATELY, fjp.ERROR_CODE_OPEN_IMMEDIATELY_PIC_LOAD_FAIL, "瞬开图片加载失败，url：" + failPhenixEvent.getUrl(), false);
                com.taobao.android.detail2.core.framework.data.model.d dVar3 = this.f27954a;
                if (dVar3 != null && dVar3.f == 0 && (bVar = this.c) != null) {
                    if (this.d) {
                        fjp.a(bVar.f(), "deliverPicFail", (Object) "phenix");
                    } else {
                        fjp.a(bVar.f(), "NPicFail", (Object) "phenix");
                    }
                }
            }
            return false;
        }
    }

    /* loaded from: classes5.dex */
    public class b implements com.taobao.phenix.intf.event.a<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public com.taobao.android.detail2.core.framework.b f27955a;
        public ImageView b;
        public int c;
        public boolean d;
        public boolean e;
        public boolean f;

        static {
            kge.a(1576348636);
            kge.a(-1292221460);
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
        }

        public b(com.taobao.android.detail2.core.framework.b bVar, ImageView imageView, int i, boolean z, boolean z2, boolean z3) {
            this.f27955a = bVar;
            this.b = imageView;
            this.c = i;
            this.d = z;
            this.e = z2;
            this.f = z3;
        }

        public boolean a(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent == null) {
                return false;
            }
            this.b.setImageDrawable(succPhenixEvent.getDrawable());
            if (this.d) {
                b(succPhenixEvent);
            } else {
                c(succPhenixEvent);
            }
            return false;
        }

        private void b(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ed8f131", new Object[]{this, succPhenixEvent});
                return;
            }
            com.taobao.android.detail2.core.framework.a f = this.f27955a.f();
            fjp.b(f, fjp.SECTION_FIRST_OPEN_IMMEDIATELY_NATIVE_GAUSSIAN_PIC_VISIBLE, "是否内存返回: " + succPhenixEvent.isImmediate() + ", url: " + succPhenixEvent.getUrl());
            HashMap hashMap = new HashMap();
            hashMap.put("isImmediate", String.valueOf(succPhenixEvent.isImmediate()));
            fjp.a("eventProcess", fjp.UMBRELLA_TAG_PLACEHOLDER_GAUSSIAN_IMAGE_CALLBACK_SUCCESS + this.c, hashMap);
            com.taobao.android.detail2.core.framework.a f2 = this.f27955a.f();
            fjp.a(f2, "NativeGaussianPicCacheHit" + this.c, (Object) String.valueOf(succPhenixEvent.isImmediate()));
        }

        private void c(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2640ef2", new Object[]{this, succPhenixEvent});
                return;
            }
            int i = this.c;
            if (i != 0 && i != 1) {
                return;
            }
            com.taobao.android.detail2.core.framework.b bVar = this.f27955a;
            if (bVar != null && bVar.n().aO()) {
                fjt.a(fjt.TAG_TIP, "NdApmToken: NativeMainPic ，检测到 Apm 降级，不打标。 ");
            } else {
                com.taobao.android.detail2.core.framework.b bVar2 = this.f27955a;
                if (bVar2 != null && bVar2.n().ba()) {
                    fjt.a(fjt.TAG_TIP, "NdApmToken: NativeMainPic ，检测到 ApmNative 主图降级，不打标。 ");
                } else {
                    if (this.f27955a == null) {
                        fjt.a(fjt.TAG_TIP, "NdApmToken: NativeMainPic mNewDetailContext 为空。");
                    }
                    this.b.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
                    fjt.a(fjt.TAG_TIP, "NdApmToken: NativeMainPic , ndTagSuccess ");
                }
            }
            if (this.c == 0) {
                ctu.a("placeHolderSuccess" + succPhenixEvent.isImmediate());
                ctu.a();
                if (this.e) {
                    com.taobao.android.detail2.core.framework.a f = this.f27955a.f();
                    fjp.b(f, fjp.SECTION_FIRST_OPEN_IMMEDIATELY_NATIVE_PIC_VISIBLE, "是否内存返回: " + succPhenixEvent.isImmediate() + ", url: " + succPhenixEvent.getUrl());
                }
                if (this.f) {
                    fjp.a(this.f27955a.f(), "navShowDeliverPic", (Object) "true");
                    ctu.a("bindNoOpenImmedPlaceHolderLoadSuccess");
                    ctu.a();
                }
                com.taobao.android.detail2.core.framework.a f2 = this.f27955a.f();
                fjp.b(f2, fjp.SECTION_FIRST_NATIVE_PIC_VISIBLE, "是否内存返回: " + succPhenixEvent.isImmediate() + ", url: " + succPhenixEvent.getUrl());
            } else if (this.f27955a.h().an() && fho.this.l.g()) {
                com.taobao.android.detail2.core.framework.a f3 = this.f27955a.f();
                fjp.b(f3, fjp.SECTION_SECOND_NATIVE_PIC_VISIBLE, "是否内存返回: " + succPhenixEvent.isImmediate() + ", url: " + succPhenixEvent.getUrl());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("isImmediate", String.valueOf(succPhenixEvent.isImmediate()));
            fjp.a("eventProcess", fjp.UMBRELLA_TAG_PLACEHOLDER_IMAGE_CALLBACK_SUCCESS + this.c, hashMap);
            com.taobao.android.detail2.core.framework.a f4 = this.f27955a.f();
            fjp.a(f4, "NativePicCacheHit" + this.c, (Object) String.valueOf(succPhenixEvent.isImmediate()));
        }
    }

    private void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        if ("contain".equals(str)) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        } else if ("cover".equals(str)) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        this.o.setScaleType(scaleType);
    }

    private fkt ab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkt) ipChange.ipc$dispatch("765bbeef", new Object[]{this}) : this.j.h().b();
    }

    private fkr N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkr) ipChange.ipc$dispatch("7cd55c64", new Object[]{this}) : this.j.h();
    }

    private boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[]{this})).booleanValue();
        }
        if (this.i != 0 && ((fhi) this.i).f27944a != null) {
            if (F() == 0) {
                if (!((fhi) this.i).q()) {
                    com.taobao.android.detail2.core.framework.a f = this.j.f();
                    fjp.b(f, fjp.SECTION_FIRST_OTHER_BIND_PRE, "itemId=" + ((fhi) this.i).k);
                } else {
                    com.taobao.android.detail2.core.framework.a f2 = this.j.f();
                    fjp.b(f2, fjp.SECTION_FIRST_OTHER_BIND, "itemId=" + ((fhi) this.i).k);
                }
            }
            c.C0456c c0456c = new c.C0456c();
            c0456c.f11499a = ((fhi) this.i).k;
            c0456c.b = ((fhi) this.i).f;
            c0456c.c = ((fhi) this.i).f27944a.containerName;
            c0456c.d = ((fhi) this.i).z;
            this.f.a(c0456c);
            a(((fhi) this.i).f27944a.dataContext, ((fhi) this.i).f);
            if (this.j.g() != null) {
                this.k.j().a(this.f, this.j, ((fhi) this.i).f27944a.containerInfo, ((fhi) this.i).f27944a.dataContext, Q(), ((fhi) this.i).f != 0);
            }
            if (((fhi) this.i).f27944a.containerInfo != null) {
                try {
                    ((fhi) this.i).M().put("nd_weexUrl", (Object) URLEncoder.encode(((fhi) this.i).f27944a.containerInfo.a(), "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                ((fhi) this.i).M().put("nd_jsVersion", (Object) ((fhi) this.i).f27944a.containerInfo.b());
            }
            if (((fhi) this.i).f27944a.dataContext != null) {
                return true;
            }
        }
        return false;
    }

    private boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[]{this})).booleanValue();
        }
        if (this.e != null && this.i != 0) {
            return this.e.a((fhi) this.i, ((fhi) this.i).b);
        }
        return false;
    }

    private boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[]{this})).booleanValue();
        }
        if (((fhi) this.i).f != 0 || !N().q()) {
            return false;
        }
        return N().M() || N().J();
    }

    private void a(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a78e87b", new Object[]{this, jSONObject, new Integer(i)});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("cardnum", (Object) String.valueOf(i));
        if (jSONObject == null) {
            return;
        }
        jSONObject.put(com.taobao.android.detail2.core.framework.view.feeds.d.KEY_CARD_EXTRA_DATA, (Object) jSONObject2);
    }

    private void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4990bd9", new Object[]{this});
        } else if (this.i == 0 || F() != 0) {
        } else {
            if (((fhi) this.i).C) {
                com.taobao.android.detail2.core.framework.a f = this.j.f();
                fjp.b(f, fjp.SECTION_FIRST_RECYCLERVIEW_PRE, "itemId=" + ((fhi) this.i).k);
                com.taobao.android.detail2.core.framework.a f2 = this.j.f();
                fjp.a(f2, fjp.SECTION_FIRST_OTHER_BIND_PRE, "itemId=" + ((fhi) this.i).k);
                return;
            }
            com.taobao.android.detail2.core.framework.a f3 = this.j.f();
            fjp.b(f3, fjp.SECTION_FIRST_RECYCLERVIEW, "itemId=" + ((fhi) this.i).k);
            com.taobao.android.detail2.core.framework.a f4 = this.j.f();
            fjp.a(f4, fjp.SECTION_FIRST_OTHER_BIND, "itemId=" + ((fhi) this.i).k);
        }
    }

    private void aa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf280a7", new Object[]{this});
            return;
        }
        com.taobao.android.detail2.core.framework.base.weex.c cVar = this.f;
        if (cVar == null || cVar.j() == null) {
            fjt.a(fjt.TAG_TIP, "NdApmToken: checkAndSetWeexViewValid mFixWeexContainer/view 为空。");
            return;
        }
        if (this.j == null) {
            fjt.a(fjt.TAG_TIP, "NdApmToken: checkAndSetWeexViewValid mNewDetailContext 为空。");
        }
        this.f.j().setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
        fjt.a(fjt.TAG_TIP, "NdApmToken: checkAndSetWeexViewValid , ndTagSuccess ");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
        if (r0.equals(tb.fhb.OPERATE_OPEN_IMMEDIATELY_RENDER_SUCCESS) != false) goto L16;
     */
    @Override // com.taobao.android.detail2.core.framework.view.feeds.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.trade.event.i a(tb.fhb r7) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fho.a(tb.fhb):com.taobao.android.trade.event.i");
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        fit fitVar = this.e;
        if (fitVar != null) {
            fitVar.a(jSONObject);
        }
        com.taobao.android.detail2.core.mainpic.b bVar = this.A;
        if (bVar == null) {
            return;
        }
        bVar.a(jSONObject);
    }

    private void d(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d8b59b", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", (Object) str);
        jSONObject2.put("info", (Object) jSONObject);
        if (this.j != null && fkt.a(this.j).aW() && ipa.a(this.j.g())) {
            fjt.a(fjt.TAG_TIP, "ND 页面已经销毁，但还在发送 mediaChannelToWeex 。此处主动放弃消息发送。");
            qxo.a();
            if (!fkt.a(this.j).aX()) {
                return;
            }
            this.f.g();
            return;
        }
        this.f.a("mediaChannelToWeex", jSONObject2);
    }

    private void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
            return;
        }
        Animation a2 = a(str2, str3, str4);
        if (a2 == null) {
            return;
        }
        char c2 = 65535;
        if (str.hashCode() == -1052597264 && str.equals("navBar")) {
            c2 = 0;
        }
        if (c2 != 0 || this.k == null) {
            return;
        }
        this.k.a(a2);
    }

    private Animation a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("d16c1190", new Object[]{this, str, str2, str3});
        }
        char c2 = 65535;
        int hashCode = str2.hashCode();
        if (hashCode != 3135100) {
            if (hashCode != 747804969) {
                if (hashCode == 1373376394 && str2.equals("positionAndFade")) {
                    c2 = 1;
                }
            } else if (str2.equals("position")) {
                c2 = 0;
            }
        } else if (str2.equals(n.TRANSITION_TYPE_FADE)) {
            c2 = 2;
        }
        if (c2 == 0) {
            return a(str, str3);
        }
        if (c2 == 1) {
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(a(str, str3));
            animationSet.addAnimation(b(str, str3));
            animationSet.setDuration(g(str3));
            animationSet.setFillAfter(true);
            return animationSet;
        }
        return b(str, str3);
    }

    private TranslateAnimation a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TranslateAnimation) ipChange.ipc$dispatch("e7b64aa2", new Object[]{this, str, str2});
        }
        int g = g(str2);
        TranslateAnimation translateAnimation = null;
        if ("in".equals(str)) {
            translateAnimation = new TranslateAnimation(0.0f, 0.0f, -this.k.w(), 0.0f);
        } else if ("out".equals(str)) {
            translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -this.k.w());
        }
        if (translateAnimation != null) {
            translateAnimation.setDuration(g);
            translateAnimation.setFillAfter(true);
        }
        return translateAnimation;
    }

    private AlphaAnimation b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlphaAnimation) ipChange.ipc$dispatch("39095f73", new Object[]{this, str, str2});
        }
        int g = g(str2);
        AlphaAnimation alphaAnimation = null;
        if ("in".equals(str)) {
            alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        } else if ("out".equals(str)) {
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        }
        if (alphaAnimation != null) {
            alphaAnimation.setDuration(g);
            alphaAnimation.setFillAfter(true);
        }
        return alphaAnimation;
    }

    private int g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0cfe3ab", new Object[]{this, str})).intValue();
        }
        try {
            return ((int) Double.parseDouble(str)) * 1000;
        } catch (Exception unused) {
            fjt.a("NavBar动画创建", "时间解析失败，duration=" + str);
            return 0;
        }
    }

    private void c(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        HashMap hashMap = new HashMap();
        String str2 = "";
        if (jSONObject != null) {
            String string = jSONObject.getString("imageFromCache");
            str = jSONObject.getString("blurImageFromCache");
            hashMap.put("imageFromCache", string);
            hashMap.put("blurImageFromCache", str);
            str2 = string;
        } else {
            str = str2;
        }
        fjp.a("eventProcess", fjp.UMBRELLA_TAG_WEEX_OPEN_IMMEDIATELY_RENDER_SUCCESS, hashMap);
        fjp.a(this.j.f(), "weexImageFromCache", (Object) str2);
        fjp.a(this.j.f(), "weexBlurImageFromCache", (Object) str);
        HashMap<String, String> b2 = this.f.d().b();
        if (b2 == null) {
            return;
        }
        fjp.a(this.j.f(), "downloadBinaryTime", (Object) b2.get(jyx.c.POINT_NAME));
        fjp.a(this.j.f(), "binaryCacheType", (Object) b2.get(WXPerformance.CACHE_TYPE));
        fjp.a(this.j.f(), "font_init_time", (Object) b2.get("font_init_time"));
    }

    private void S() {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
        } else if (U() && this.j != null && this.j.k() != null && this.j.k().a() && (imageView = this.o) != null) {
            imageView.postDelayed(this.t, 1000L);
        } else if (this.f.k()) {
            this.o.postDelayed(this.t, 2000L);
        } else {
            this.p.setVisibility(8);
            this.q.setVisibility(8);
        }
    }

    private void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            fky.a(this.j.g(), jSONObject.getString("type"), jSONObject.getJSONObject("sceneMap"));
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.d
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.f == null) {
        } else {
            ctu.a("onAppear_" + str);
            fit fitVar = this.e;
            if (fitVar != null) {
                fitVar.a(str);
            }
            if (this.i != 0 && ((fhi) this.i).ae != null && ((fhi) this.i).ae.d) {
                ADaemon.pauseFrameLock(4);
            } else {
                ADaemon.resumeFrameLock(4);
            }
            com.taobao.android.detail2.core.mainpic.b bVar = this.A;
            if (bVar != null) {
                bVar.b(str);
            }
            this.f.b(str);
            if (this.i != 0) {
                fjt.a(fjt.TAG_RENDER, getAdapterPosition() + "appear: " + this.f.b() + ", nid: " + ((fhi) this.i).k);
            }
            if (this.l != null) {
                this.l.h();
            }
            ctu.a();
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.d
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.f == null) {
        } else {
            if (c()) {
                fjt.b(fjt.TAG_INSIDE_DETAIL, "ItemCardViewHolder onDisAppear. enableInsideDetailPageForNode True");
            } else {
                fit fitVar = this.e;
                if (fitVar != null) {
                    fitVar.b(str);
                }
                com.taobao.android.detail2.core.mainpic.b bVar = this.A;
                if (bVar != null) {
                    bVar.a(str);
                }
            }
            this.f.c(str);
            if (this.i == 0) {
                return;
            }
            fjt.a(fjt.TAG_RENDER, getAdapterPosition() + "disappear: " + this.f.b() + ", nid: " + ((fhi) this.i).f);
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (this.j != null && this.j.h().b().af()) {
            if (this.i != 0) {
                boolean a2 = fjs.a((Map<String, Object>) ((fhi) this.i).H(), KEY_FEATURE_ENABLE_INSIDE_DETAIL);
                fjt.b(fjt.TAG_INSIDE_DETAIL, "enableInsideDetailPageForNode: enableInsideDetail = " + a2);
                if (!a2) {
                    return a2;
                }
                boolean e = this.j.e();
                fjt.b(fjt.TAG_INSIDE_DETAIL, "enableInsideDetailPageForNode: currentIsInsideDetailForTagOrLife = " + e);
                return e;
            }
            fjt.b(fjt.TAG_INSIDE_DETAIL, "enableInsideDetailPageForNode: mCurrentNode is Null , enableInsideDetail = false");
        }
        return false;
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.d
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (!c()) {
        } else {
            fit fitVar = this.e;
            if (fitVar != null) {
                fitVar.b(str);
            }
            com.taobao.android.detail2.core.mainpic.b bVar = this.A;
            if (bVar == null) {
                return;
            }
            bVar.a(str);
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!c()) {
        } else {
            fit fitVar = this.e;
            if (fitVar != null) {
                fitVar.b();
            }
            com.taobao.android.detail2.core.mainpic.b bVar = this.A;
            if (bVar == null) {
                return;
            }
            bVar.a();
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.d
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        fit fitVar = this.e;
        if (fitVar != null) {
            fitVar.b();
        }
        com.taobao.android.detail2.core.mainpic.b bVar = this.A;
        if (bVar == null) {
            return;
        }
        bVar.a();
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.d
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (c()) {
        } else {
            fit fitVar = this.e;
            if (fitVar != null) {
                fitVar.c();
            }
            com.taobao.android.detail2.core.mainpic.b bVar = this.A;
            if (bVar == null) {
                return;
            }
            bVar.b();
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.d
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.z = true;
        com.taobao.android.detail2.core.framework.base.weex.c cVar = this.f;
        if (cVar != null) {
            cVar.g();
        }
        fit fitVar = this.e;
        if (fitVar != null) {
            fitVar.d();
        }
        com.taobao.android.detail2.core.mainpic.b bVar = this.A;
        if (bVar != null) {
            bVar.g();
        }
        this.o.removeCallbacks(this.t);
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4366756", new Object[]{this})).booleanValue() : this.z;
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.d
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        com.taobao.android.detail2.core.framework.base.weex.c cVar = this.f;
        if (cVar == null) {
            return;
        }
        cVar.h();
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.d
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        com.taobao.android.detail2.core.framework.base.weex.c cVar = this.f;
        if (cVar == null) {
            return;
        }
        cVar.i();
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.d
    public int j() {
        ova ovaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        Activity g = this.j.g();
        if (g == null || this.i == 0) {
            return 0;
        }
        if (fme.EXP_ITEM_ARTICLE.equals(N().k().F)) {
            if (((fhi) this.i).ae != null) {
                if (((fhi) this.i).ae.f32210a.size() > 0 && (ovaVar = ((fhi) this.i).ae.f32210a.get(0)) != null && this.l != null) {
                    com.taobao.android.detail2.core.framework.base.media.frame.a a2 = oyn.a(this.j, (fhi) this.i, ovaVar.b, this.l.b(), this.l.c());
                    if (a2.e < fjl.a(this.j.g(), 100.0f)) {
                        return fjl.a(this.j.g(), 100.0f);
                    }
                    return a2.e;
                }
            } else if (((fhi) this.i).b != null && this.l != null) {
                com.taobao.android.detail2.core.framework.base.media.frame.a a3 = com.taobao.android.detail2.core.framework.base.media.frame.b.a(this.j, (fhi) this.i, ((fhi) this.i).b, this.l.b(), this.l.c());
                if (a3.e >= 0) {
                    if (a3.e < fjl.a(this.j.g(), 100.0f)) {
                        return fjl.a(this.j.g(), 100.0f);
                    }
                    return a3.e;
                }
            }
        }
        int i = -1;
        if (((fhi) this.i).Y == null) {
            i = fjm.a(g, ((fhi) this.i).m(), ((fhi) this.i).n(), -1);
        } else {
            com.taobao.android.detail2.core.framework.data.model.b a4 = N().L().a(((fhi) this.i).G());
            if (a4.a()) {
                i = a4.f11521a;
            }
        }
        if (i < 0) {
            return fjl.a(g, g.getResources().getDimension(R.dimen.new_detail_half_screen_item_offset));
        }
        int a5 = fjl.a(this.j.g(), 100.0f);
        return i < a5 ? a5 : i;
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.d
    public Map<String, String> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a8bc7a27", new Object[]{this});
        }
        ctu.a("handleExposuresStatusBizArgs");
        Map<String, String> a2 = this.k.y().a("item", null, this.i);
        ctu.a();
        return a2;
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.d
    public void a(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82180d6", new Object[]{this, new Double(d2)});
        } else {
            this.r.setTranslationY(-((int) (j() * d2)));
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.d
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.r.setTranslationY(i);
        fjt.a(fjt.TAG_HALF_SCREEN, "设置卡片" + ((fhi) this.i).f + "的topmargin: " + i);
    }

    static {
        kge.a(163735407);
        c = new fma() { // from class: tb.fho.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fma
            public /* synthetic */ RecyclerView.ViewHolder b(ViewGroup viewGroup, fmd fmdVar, com.taobao.android.detail2.core.framework.b bVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("64003461", new Object[]{this, viewGroup, fmdVar, bVar}) : a(viewGroup, fmdVar, bVar);
            }

            public com.taobao.android.detail2.core.framework.view.feeds.d a(ViewGroup viewGroup, fmd fmdVar, com.taobao.android.detail2.core.framework.b bVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.view.feeds.d) ipChange.ipc$dispatch("36c29940", new Object[]{this, viewGroup, fmdVar, bVar}) : new fho(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detail_card_layout, (ViewGroup) ((RoundRectCardRoot) LayoutInflater.from(bVar.g()).inflate(R.layout.detail_half_screen_layout, viewGroup, false).findViewById(R.id.half_screen_round_root)), true), viewGroup, fmdVar, bVar, null);
            }
        };
    }

    public void a(View view, b.C0469b c0469b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdfa4432", new Object[]{this, view, c0469b});
            return;
        }
        this.r = (FrameLayout) view.findViewById(R.id.main_render_fl);
        this.o = (ImageView) view.findViewById(R.id.main_pic_open_immediately);
        if (this.j != null && this.j.n().ba()) {
            fjt.a(fjt.TAG_TIP, "NdApmToken: NativeMainPic ，检测到 ApmNative 主图降级，已忽略。 ndTagIgnoreView 。 ");
            this.o.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_IGNORE);
        }
        this.p = (RoundRectCardRoot) view.findViewById(R.id.main_pic_open_immediately_rr);
        this.q = (ImageView) view.findViewById(R.id.main_pic_open_immediately_gaussian_blur);
        if (this.j == null) {
            fjt.a(fjt.TAG_TIP, "NdApmToken: initView for PlaceHolderBlur , mNewDetailContext 为空。");
        } else if (this.j.n().aO()) {
            fjt.a(fjt.TAG_TIP, "NdApmToken: initView for PlaceHolderBlur，检测到 Apm 降级，不打 Ignore 标。 ");
        } else if (this.j.n().ba()) {
            fjt.a(fjt.TAG_TIP, "NdApmToken: NativeMainPic For PlaceHolderBlur，检测到 ApmNative 主图降级，已忽略。 ndTagIgnoreView 。 ");
            this.q.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_IGNORE);
        }
        this.f27946a = (RelativeLayout) view.findViewById(R.id.default_layout);
        this.b = (AliUrlImageView) view.findViewById(R.id.center_default_img);
        this.b.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_IGNORE);
        b(view, c0469b);
        ctu.a("init_DetailWeexContainer");
        this.f = new com.taobao.android.detail2.core.framework.base.weex.c(this.j, this.m, "item", "detailDataRefresh");
        this.f.a((ViewStub) view.findViewById(R.id.weex_layout));
        if (this.j != null && this.j.n().aO()) {
            this.f.j().setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_INVALID);
            fjt.a(fjt.TAG_TIP, "NdApmToken: initView for weex , 检测到 Apm 降级，打标 INVALID 。 ");
        } else {
            if (this.j == null) {
                fjt.a(fjt.TAG_TIP, "NdApmToken: initView for weex ,mNewDetailContext 为空。");
            }
            this.f.j().setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_IGNORE);
            fjt.a(fjt.TAG_TIP, "NdApmToken: initView for weex , ndTagIgnoreView ");
        }
        this.f.a(this.B);
        ctu.a();
        ctu.a("init_initNativeMainPic");
        c(view);
        ctu.a();
        a(this.f);
        this.f.a(this.v);
        this.g = (FrameLayout) view.findViewById(R.id.nav_bg);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.g.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        }
        layoutParams.topMargin = this.k.n();
        this.g.setLayoutParams(layoutParams);
        this.k.a(this.y);
        this.k.a(new d());
    }

    /* loaded from: classes5.dex */
    public class d implements fmd.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1207887267);
            kge.a(1009312491);
        }

        private d() {
        }

        @Override // tb.fmd.f
        public void a(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
            } else if (fho.L(fho.this) == null) {
            } else {
                fho.L(fho.this).a(motionEvent);
            }
        }
    }

    /* loaded from: classes5.dex */
    public class c implements fmd.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2083250213);
            kge.a(-37335218);
        }

        private c() {
        }

        @Override // tb.fmd.d
        public void a(int i, int i2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2619b90c", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            } else if (!z) {
            } else {
                fho.b(fho.this, true);
            }
        }
    }

    private void b(View view, b.C0469b c0469b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbedaa11", new Object[]{this, view, c0469b});
            return;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.media_layout);
        if (viewStub == null) {
            return;
        }
        if (c0469b != null && c0469b.c() != null) {
            ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
            int indexOfChild = viewGroup.indexOfChild(viewStub);
            viewGroup.removeViewAt(indexOfChild);
            viewGroup.addView(c0469b.c(), indexOfChild, viewStub.getLayoutParams());
            this.d = c0469b.c();
        } else {
            viewStub.setLayoutResource(R.layout.newdetail_media_container_layout);
            this.d = (FrameLayout) viewStub.inflate();
        }
        this.e = new fit(this.j, (ViewGroup) this.itemView, this.k, this.l);
        this.e.a(this.u);
    }

    private void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d050128", new Object[]{this, view});
        } else {
            this.A = new com.taobao.android.detail2.core.mainpic.b(view, this.j, this.f, this.l, this.k, this);
        }
    }

    public void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509c7e1", new Object[]{this});
            return;
        }
        AliUrlImageView aliUrlImageView = this.b;
        if (aliUrlImageView == null) {
            return;
        }
        aliUrlImageView.setVisibility(4);
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.d
    public TBErrorView l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("4672730c", new Object[]{this});
        }
        TBErrorView tBErrorView = new TBErrorView(this.j.g());
        tBErrorView.setBackgroundColor(-1);
        tBErrorView.setVisibility(8);
        tBErrorView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, "刷新", new View.OnClickListener() { // from class: tb.fho.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    fho.a(fho.this, (JSONObject) null);
                }
            }
        });
        return tBErrorView;
    }

    private void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b53adb", new Object[]{this});
        } else if (this.s) {
        } else {
            this.b.setVisibility(0);
            m();
            this.s = true;
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        Activity g = this.j.g();
        if (g == null) {
            return;
        }
        this.b.setImageDrawable(g.getResources().getDrawable(R.drawable.preload_bottom_item));
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.d
    public HashMap<String, String> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("83012018", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("spm-cnt", "a2141.22412911");
        return hashMap;
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.d
    public HashMap<String, String> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("cd32b959", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (this.i != 0) {
            hashMap.put("spm", fjh.a(this.i, "a2141.22412911") + ".newdetail");
        }
        return hashMap;
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.d
    public JSONObject p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9774dc17", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("weexStart", (Object) Long.valueOf(((fhi) this.i).l()));
        return jSONObject;
    }
}
