package com.alibaba.android.umf.taobao.adapter.widget.floatview;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import com.alibaba.android.umf.taobao.adapter.widget.floatview.container.impl.dialogfragment.NUTFragmentFloatContainer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.h;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import tb.ami;
import tb.arc;
import tb.bay;
import tb.brz;
import tb.bsb;
import tb.bsc;
import tb.bsd;
import tb.bse;
import tb.bsm;
import tb.bso;
import tb.bsp;
import tb.bsq;
import tb.bsr;
import tb.dkp;
import tb.kge;

/* loaded from: classes2.dex */
public class NUTFloatViewManager implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "NUTFloatViewManager";

    /* renamed from: a  reason: collision with root package name */
    private Builder f2866a;
    private final Map<String, brz> b;
    private final Map<String, bsm> c;
    private bse d;
    private boolean e;
    private bsq f;
    private OnScreenChangedListener g;

    static {
        kge.a(-1637492065);
        kge.a(-947914429);
    }

    public static /* synthetic */ Builder a(NUTFloatViewManager nUTFloatViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("ed12f455", new Object[]{nUTFloatViewManager}) : nUTFloatViewManager.f2866a;
    }

    public static /* synthetic */ bsq a(NUTFloatViewManager nUTFloatViewManager, bsq bsqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bsq) ipChange.ipc$dispatch("3bcf86fc", new Object[]{nUTFloatViewManager, bsqVar});
        }
        nUTFloatViewManager.f = bsqVar;
        return bsqVar;
    }

    public static /* synthetic */ void a(NUTFloatViewManager nUTFloatViewManager, Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315eb71", new Object[]{nUTFloatViewManager, builder});
        } else {
            nUTFloatViewManager.b(builder);
        }
    }

    public static /* synthetic */ bsq b(NUTFloatViewManager nUTFloatViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bsq) ipChange.ipc$dispatch("35c8ec2d", new Object[]{nUTFloatViewManager}) : nUTFloatViewManager.f;
    }

    public static /* synthetic */ void b(NUTFloatViewManager nUTFloatViewManager, bsq bsqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94527529", new Object[]{nUTFloatViewManager, bsqVar});
        } else {
            nUTFloatViewManager.a(bsqVar);
        }
    }

    public static /* synthetic */ void c(NUTFloatViewManager nUTFloatViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2171a418", new Object[]{nUTFloatViewManager});
        } else {
            nUTFloatViewManager.f();
        }
    }

    public static /* synthetic */ bse d(NUTFloatViewManager nUTFloatViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bse) ipChange.ipc$dispatch("7d874bb", new Object[]{nUTFloatViewManager}) : nUTFloatViewManager.d;
    }

    private NUTFloatViewManager() {
        this.b = new HashMap();
        this.c = new HashMap();
        this.e = false;
    }

    private NUTFloatViewManager(Builder builder) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.e = false;
        this.f2866a = builder;
        this.f = builder.getFloatStyle();
        a(builder);
        e();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.f.j()) {
        } else {
            this.g = new OnScreenChangedListener() { // from class: com.alibaba.android.umf.taobao.adapter.widget.floatview.NUTFloatViewManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.autosize.OnScreenChangedListener
                public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
                    OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
                }

                @Override // com.taobao.android.autosize.OnScreenChangedListener
                public void onScreenChanged(int i, Configuration configuration) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                        return;
                    }
                    try {
                        NUTFloatViewManager.a(NUTFloatViewManager.this, NUTFloatViewManager.a(NUTFloatViewManager.this).getFloatStyle().k());
                        if (i == 2) {
                            NUTFloatViewManager.b(NUTFloatViewManager.this, NUTFloatViewManager.b(NUTFloatViewManager.this));
                        }
                        NUTFloatViewManager.c(NUTFloatViewManager.this);
                        NUTFloatViewManager.d(NUTFloatViewManager.this).onScreenChanged(i, configuration);
                    } catch (Throwable th) {
                        arc.a().b(th.getMessage());
                    }
                }
            };
            h.a().c(this.g);
        }
    }

    private void a(bsq bsqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e258c898", new Object[]{this, bsqVar});
            return;
        }
        int c = bay.c();
        bsqVar.a(false);
        bsqVar.b("slideRight");
        bsqVar.c(0.0f);
        bsr bsrVar = new bsr();
        bsrVar.b(c / 2);
        bsqVar.a(bsrVar);
        a("slideDown", new bsd());
    }

    private void a(Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e4c3a3", new Object[]{this, builder});
        } else if (this.e) {
        } else {
            this.e = true;
            Boolean g = this.f.g();
            if (g != null && g.booleanValue()) {
                a("slideDown", new bsc());
            } else {
                a("slideDown", new bsd());
            }
            a("slideRight", new dkp());
            a("nutFloatViewBackgroundAlphaIn", new bsb());
            a("umf", new bsp());
            a("aura", new bso());
        }
    }

    private void b(Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1d59ec2", new Object[]{this, builder});
            return;
        }
        this.f2866a = builder;
        this.f = builder.getFloatStyle();
        this.d.setConfigBuilder(this.f2866a, this.f);
        bsm b = b(Builder.access$500(this.f2866a));
        b.a(this);
        this.d.setContentRender(b);
        this.d.setContentViewAnimation(a(this.f.e()));
    }

    public static Builder b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("76d712e4", new Object[0]) : new Builder();
    }

    public void a(String str, brz brzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22393e38", new Object[]{this, str, brzVar});
        } else {
            this.b.put(str, brzVar);
        }
    }

    public void a(String str, bsm bsmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22416ce6", new Object[]{this, str, bsmVar});
        } else {
            this.c.put(str, bsmVar);
        }
    }

    private brz a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (brz) ipChange.ipc$dispatch("7c6d952a", new Object[]{this, str}) : this.b.get(str);
    }

    private bsm b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bsm) ipChange.ipc$dispatch("7d1a42f7", new Object[]{this, str});
        }
        bsm bsmVar = this.c.get(str);
        return bsmVar == null ? new bso() : bsmVar;
    }

    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        bse d = d();
        b(context);
        f();
        return d.showFloat(context);
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else if (ami.c(context)) {
        } else {
            try {
                this.f = this.f2866a.getFloatStyle().k();
                a(this.f);
            } catch (Throwable th) {
                arc.a().b(th.getMessage());
            }
        }
    }

    @Override // com.alibaba.android.umf.taobao.adapter.widget.floatview.a
    public void a(bse.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a3d347", new Object[]{this, aVar});
        } else {
            d().addOnCloseListener(aVar);
        }
    }

    @Override // com.alibaba.android.umf.taobao.adapter.widget.floatview.a
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        bse bseVar = this.d;
        if (bseVar == null) {
            Builder builder = this.f2866a;
            if (builder != null && Builder.access$700(builder) != null) {
                Builder.access$700(this.f2866a).a(false);
            }
            return false;
        }
        return bseVar.dismissFloat();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        bse bseVar = this.d;
        if (bseVar != null) {
            bseVar.destroy();
            this.d = null;
        }
        if (this.g == null) {
            return;
        }
        h.a().d(this.g);
    }

    private bse d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bse) ipChange.ipc$dispatch("2617dd87", new Object[]{this});
        }
        if (this.f2866a == null) {
            throw new NullPointerException("make sure you have set Builder");
        }
        if (this.d == null) {
            this.d = new NUTFragmentFloatContainer();
            bsm b = b(Builder.access$500(this.f2866a));
            b.a(this);
            this.d.setContentRender(b);
            f();
        }
        return this.d;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.d.setConfigBuilder(this.f2866a, this.f);
        this.d.setOnDismissListener(new bse.b() { // from class: com.alibaba.android.umf.taobao.adapter.widget.floatview.NUTFloatViewManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bse.b
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    return;
                }
                bse.b onDismissListener = NUTFloatViewManager.a(NUTFloatViewManager.this).getOnDismissListener();
                if (onDismissListener == null) {
                    return;
                }
                onDismissListener.a(false);
            }
        });
        this.d.setOnShowListener(this.f2866a.getOnShowListener());
        this.d.setBackgroundAnimation(a("nutFloatViewBackgroundAlphaIn"));
        this.d.setContentViewAnimation(a(this.f.e()));
    }

    /* loaded from: classes2.dex */
    public static class Builder implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Map<String, Object> mFloatParams;
        private bsq mFloatStyle;
        private String mFloatType;
        private boolean mInternalRecycleOnDismiss;
        private boolean mNeedLogin;
        private bse.b mOnDismissListener;
        private bse.d mOnShowListener;
        private bse.c mRenderListener;
        private NUTFloatViewManager mReuseFloatViewManager;

        static {
            kge.a(-753687946);
            kge.a(1028243835);
        }

        public static /* synthetic */ String access$500(Builder builder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("12398fb1", new Object[]{builder}) : builder.mFloatType;
        }

        public static /* synthetic */ bse.b access$700(Builder builder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bse.b) ipChange.ipc$dispatch("d4e0bb27", new Object[]{builder}) : builder.mOnDismissListener;
        }

        private Builder() {
            this.mFloatType = "umf";
            this.mFloatParams = Collections.emptyMap();
            this.mInternalRecycleOnDismiss = false;
        }

        public String getFloatType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2865c5f9", new Object[]{this}) : this.mFloatType;
        }

        public Map<String, Object> getFloatParams() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("f1a95d48", new Object[]{this}) : this.mFloatParams;
        }

        public bsq getFloatStyle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bsq) ipChange.ipc$dispatch("669f6054", new Object[]{this});
            }
            if (this.mFloatStyle == null) {
                floatStyle(new bsq());
            }
            return this.mFloatStyle;
        }

        public bse.b getOnDismissListener() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bse.b) ipChange.ipc$dispatch("434b5144", new Object[]{this}) : this.mOnDismissListener;
        }

        public bse.d getOnShowListener() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bse.d) ipChange.ipc$dispatch("dd79fe25", new Object[]{this}) : this.mOnShowListener;
        }

        public bse.c getRenderListener() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bse.c) ipChange.ipc$dispatch("f34e862c", new Object[]{this}) : this.mRenderListener;
        }

        public boolean isNeedLogin() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4272ce74", new Object[]{this})).booleanValue() : this.mNeedLogin;
        }

        public boolean isInternalRecycleOnDismiss() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3877878a", new Object[]{this})).booleanValue() : this.mInternalRecycleOnDismiss;
        }

        public Builder floatType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b73b89c2", new Object[]{this, str});
            }
            this.mFloatType = str;
            return this;
        }

        public Builder floatParams(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("1b40d157", new Object[]{this, map});
            }
            if (map != null) {
                this.mFloatParams = map;
            }
            return this;
        }

        public Builder floatStyle(bsq bsqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("fa926667", new Object[]{this, bsqVar});
            }
            this.mFloatStyle = bsqVar;
            return this;
        }

        public Builder needLogin(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("5d916f15", new Object[]{this, new Boolean(z)});
            }
            this.mNeedLogin = z;
            return this;
        }

        public Builder internalRecycleOnDismiss(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("5e8f9a93", new Object[]{this, new Boolean(z)});
            }
            this.mInternalRecycleOnDismiss = z;
            return this;
        }

        public Builder onDismissListener(bse.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("4e3477bf", new Object[]{this, bVar});
            }
            this.mOnDismissListener = bVar;
            return this;
        }

        public Builder renderListener(bse.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f4caaec9", new Object[]{this, cVar});
            }
            this.mRenderListener = cVar;
            return this;
        }

        public Builder onShowListener(bse.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("1f256a0e", new Object[]{this, dVar});
            }
            this.mOnShowListener = dVar;
            return this;
        }

        public Builder reuseFloatViewManager(NUTFloatViewManager nUTFloatViewManager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("67af2836", new Object[]{this, nUTFloatViewManager});
            }
            this.mReuseFloatViewManager = nUTFloatViewManager;
            return this;
        }

        public NUTFloatViewManager build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NUTFloatViewManager) ipChange.ipc$dispatch("d13b7ce7", new Object[]{this});
            }
            NUTFloatViewManager nUTFloatViewManager = this.mReuseFloatViewManager;
            if (nUTFloatViewManager == null) {
                return new NUTFloatViewManager(this);
            }
            NUTFloatViewManager.a(nUTFloatViewManager, this);
            return this.mReuseFloatViewManager;
        }
    }
}
