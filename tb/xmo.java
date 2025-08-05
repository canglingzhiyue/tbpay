package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.c;
import com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.abilitykit.ability.pop.render.PopErrorView;
import com.taobao.android.weex.e;
import com.taobao.themis.external.embed.StartParams;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import com.taobao.themis.external.embed.WebStartParams;
import com.taobao.themis.external.embed.Weex2StartParams;
import com.taobao.themis.external.embed.a;
import com.taobao.weex.common.Constants;
import java.util.Map;
import kotlin.jvm.internal.q;
import org.json.JSONObject;
import tb.dlr;
import tb.tmj;

/* loaded from: classes6.dex */
public final class xmo<P extends com.taobao.android.abilitykit.ability.pop.model.c, CTX extends dlr> extends ActivityLifeCycleCbRender<P, CTX> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean b = true;
    private TMSEmbed c;
    private boolean d;

    /* loaded from: classes6.dex */
    public static final class b implements xpi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f34373a;
        public final /* synthetic */ xmo b;
        public final /* synthetic */ StartParams c;
        public final /* synthetic */ com.taobao.android.abilitykit.ability.pop.render.d d;
        public final /* synthetic */ dlr e;

        public b(View view, xmo xmoVar, StartParams startParams, com.taobao.android.abilitykit.ability.pop.render.d dVar, dlr dlrVar) {
            this.f34373a = view;
            this.b = xmoVar;
            this.c = startParams;
            this.d = dVar;
            this.e = dlrVar;
        }

        @Override // tb.xpi
        public void a(Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                return;
            }
            xmo.a(this.b, q.a(map != null ? map.get("state") : null, (Object) true));
            View view = this.f34373a;
            if (!(view instanceof ViewGroup)) {
                view = null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup == null) {
                return;
            }
            viewGroup.requestDisallowInterceptTouchEvent(xmo.b(this.b));
        }
    }

    /* loaded from: classes6.dex */
    public static final class c implements xpj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f34374a;
        public final /* synthetic */ xmo b;
        public final /* synthetic */ StartParams c;
        public final /* synthetic */ com.taobao.android.abilitykit.ability.pop.render.d d;
        public final /* synthetic */ dlr e;

        public c(View view, xmo xmoVar, StartParams startParams, com.taobao.android.abilitykit.ability.pop.render.d dVar, dlr dlrVar) {
            this.f34374a = view;
            this.b = xmoVar;
            this.c = startParams;
            this.d = dVar;
            this.e = dlrVar;
        }

        @Override // tb.xpj
        public void a(Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                return;
            }
            Object obj = map != null ? map.get(Constants.Name.CONTENT_OFFSET) : null;
            if (!(obj instanceof JSONObject)) {
                return;
            }
            xmo xmoVar = this.b;
            if (((JSONObject) obj).getDouble("y") >= 0) {
                z = false;
            }
            xmo.a(xmoVar, z);
            View view = this.f34374a;
            if (!(view instanceof ViewGroup)) {
                view = null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup == null) {
                return;
            }
            viewGroup.requestDisallowInterceptTouchEvent(xmo.b(this.b));
        }
    }

    static {
        kge.a(-1724946520);
    }

    public static /* synthetic */ Object ipc$super(xmo xmoVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1862045111:
                super.b((View) objArr[0]);
                return null;
            case -1795038358:
                super.a((View) objArr[0]);
                return null;
            case 1135935699:
                super.dW_();
                return null;
            case 1714797822:
                super.a((String) objArr[0], (com.alibaba.fastjson.JSONObject) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    public static final /* synthetic */ com.taobao.android.abilitykit.ability.pop.model.c a(xmo xmoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.abilitykit.ability.pop.model.c) ipChange.ipc$dispatch("703046a5", new Object[]{xmoVar}) : xmoVar.f8938a;
    }

    public static final /* synthetic */ void a(xmo xmoVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea30d216", new Object[]{xmoVar, new Boolean(z)});
        } else {
            xmoVar.b = z;
        }
    }

    public static final /* synthetic */ boolean b(xmo xmoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f610f703", new Object[]{xmoVar})).booleanValue() : xmoVar.b;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        super.a(view);
        TMSEmbed tMSEmbed = this.c;
        if (tMSEmbed == null) {
            return;
        }
        tMSEmbed.i();
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.b, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        super.b(view);
        TMSEmbed tMSEmbed = this.c;
        if (tMSEmbed == null) {
            return;
        }
        tMSEmbed.h();
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender
    public void a(String eventType, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17fd7762", new Object[]{this, eventType, bundle});
            return;
        }
        q.d(eventType, "eventType");
        if (!q.a((Object) eventType, (Object) "onDestroyed")) {
            return;
        }
        b();
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public boolean a(View contentView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3afcdd", new Object[]{this, contentView, new Integer(i)})).booleanValue();
        }
        q.d(contentView, "contentView");
        if (i >= 0) {
            return this.b;
        }
        return false;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender
    public void b(CTX abilityRtCtx, P params, View view, com.taobao.android.abilitykit.ability.pop.render.d callback) {
        Weex2StartParams weex2StartParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e62ce5b", new Object[]{this, abilityRtCtx, params, view, callback});
            return;
        }
        q.d(abilityRtCtx, "abilityRtCtx");
        q.d(params, "params");
        q.d(callback, "callback");
        this.d = e.a().b(params.c);
        Context a2 = abilityRtCtx.a();
        if (!(a2 instanceof Activity)) {
            a2 = null;
        }
        Activity activity = (Activity) a2;
        if (TextUtils.isEmpty(params.c) || activity == null) {
            callback.a(new dkv(10015, "url can't be empty"), new PopErrorView(abilityRtCtx.a(), this.f8938a));
            return;
        }
        this.c = new TMSEmbed(activity, this.d ? TMSEmbedSolutionType.WEEX : TMSEmbedSolutionType.WEB_SINGLE_PAGE);
        if (this.d) {
            try {
                Uri parse = Uri.parse(params.c);
                if (TextUtils.isEmpty(parse.getQueryParameter("renderMode"))) {
                    params.c = parse.buildUpon().appendQueryParameter("renderMode", UltronTradeHybridInstanceRenderMode.TEXTURE).toString();
                }
            } catch (Throwable th) {
                com.alibaba.ability.utils.c cVar = com.alibaba.ability.utils.c.INSTANCE;
                cVar.a("stdPopTag", "parse url error: " + dmm.a(th));
            }
            Weex2StartParams weex2StartParams2 = new Weex2StartParams();
            weex2StartParams2.setInitData(params.e);
            weex2StartParams = weex2StartParams2;
        } else {
            weex2StartParams = new WebStartParams();
        }
        weex2StartParams.setUrl(params.c);
        TMSEmbed tMSEmbed = this.c;
        if (tMSEmbed == null) {
            return;
        }
        tMSEmbed.a(weex2StartParams);
        View b2 = tMSEmbed.b();
        tMSEmbed.a(new a(weex2StartParams, callback, abilityRtCtx));
        iva ivaVar = (iva) tMSEmbed.a(iva.class);
        if (ivaVar != null) {
            ivaVar.a(new b(b2, this, weex2StartParams, callback, abilityRtCtx));
        }
        iva ivaVar2 = (iva) tMSEmbed.a(iva.class);
        if (ivaVar2 != null) {
            ivaVar2.a(new c(b2, this, weex2StartParams, callback, abilityRtCtx));
        }
        iuz iuzVar = (iuz) tMSEmbed.a(iuz.class);
        if (iuzVar != null) {
            iuzVar.a(new d(b2, this, weex2StartParams, callback, abilityRtCtx));
        }
        tMSEmbed.a();
        callback.a(b2);
    }

    /* loaded from: classes6.dex */
    public static final class a extends a.C0936a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ StartParams b;
        public final /* synthetic */ com.taobao.android.abilitykit.ability.pop.render.d c;
        public final /* synthetic */ dlr d;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 90991720) {
                super.a();
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(StartParams startParams, com.taobao.android.abilitykit.ability.pop.render.d dVar, dlr dlrVar) {
            this.b = startParams;
            this.c = dVar;
            this.d = dlrVar;
        }

        @Override // com.taobao.themis.external.embed.a.C0936a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                super.a();
            }
        }

        @Override // com.taobao.themis.external.embed.a.C0936a
        public void a(String errorCode, String errorMsg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, errorCode, errorMsg});
                return;
            }
            q.d(errorCode, "errorCode");
            q.d(errorMsg, "errorMsg");
            com.taobao.android.abilitykit.ability.pop.render.d dVar = this.c;
            dVar.a(new dkv(10000, "weex 2.0 error code:" + errorCode + ", msg:" + errorMsg), new PopErrorView(this.d.a(), xmo.a(xmo.this)));
        }
    }

    /* loaded from: classes6.dex */
    public static final class d implements tmj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f34375a;
        public final /* synthetic */ xmo b;
        public final /* synthetic */ StartParams c;
        public final /* synthetic */ com.taobao.android.abilitykit.ability.pop.render.d d;
        public final /* synthetic */ dlr e;

        public d(View view, xmo xmoVar, StartParams startParams, com.taobao.android.abilitykit.ability.pop.render.d dVar, dlr dlrVar) {
            this.f34375a = view;
            this.b = xmoVar;
            this.c = startParams;
            this.d = dVar;
            this.e = dlrVar;
        }

        @Override // tb.tmj
        public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            IpChange ipChange = $ipChange;
            boolean z2 = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f97f9ec", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)});
                return;
            }
            xmo xmoVar = this.b;
            if (i4 <= 0 || i6 <= 0) {
                z2 = false;
            }
            xmo.a(xmoVar, z2);
            View view = this.f34375a;
            if (!(view instanceof ViewGroup)) {
                view = null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup != null) {
                viewGroup.requestDisallowInterceptTouchEvent(xmo.b(this.b));
            }
            tmj.a.a(this, i, i2, i3, i4, i5, i6, i7, i8, z);
        }

        @Override // tb.tmj
        public void a(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
                return;
            }
            q.a(motionEvent);
            if (motionEvent.getActionMasked() == 0 || motionEvent.getPointerCount() > 1) {
                xmo.a(this.b, true);
            }
            tmj.a.a(this, motionEvent);
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.b, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(String type, com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, type, jSONObject});
            return;
        }
        q.d(type, "type");
        super.a(type, jSONObject);
        if (q.a((Object) IAKPopRender.LifecycleType.ANIMATION_POSITION_CHANGE, (Object) type)) {
            return;
        }
        if (this.d) {
            TMSEmbed tMSEmbed = this.c;
            if (tMSEmbed == null) {
                return;
            }
            tMSEmbed.a(type, jSONObject, "document");
            return;
        }
        TMSEmbed tMSEmbed2 = this.c;
        if (tMSEmbed2 == null) {
            return;
        }
        TMSEmbed.a(tMSEmbed2, type, jSONObject, null, 4, null);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender, com.taobao.android.abilitykit.ability.pop.render.b, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void dW_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43b500d3", new Object[]{this});
            return;
        }
        super.dW_();
        b();
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            TMSEmbed tMSEmbed = this.c;
            if (tMSEmbed == null) {
                return;
            }
            tMSEmbed.c();
        } catch (Throwable th) {
            com.alibaba.ability.utils.c cVar = com.alibaba.ability.utils.c.INSTANCE;
            cVar.a("stdPopTag", "themis destroy error: " + dmm.a(th));
        }
    }
}
