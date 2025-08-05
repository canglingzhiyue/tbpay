package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeIndicatorView;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.odx;
import tb.oec;
import tb.ogl;
import tb.ohd;

/* loaded from: classes8.dex */
public class IndicatorComponent extends Component<TNodeIndicatorView, a> implements com.taobao.tao.flexbox.layoutmanager.core.s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context context;
    private boolean firstTime = true;
    private TNodeIndicatorView.a lastIndicatorStatus;
    private TNodeIndicatorView mIndicator;

    static {
        kge.a(-125318167);
        kge.a(-1420926486);
    }

    public static /* synthetic */ Object ipc$super(IndicatorComponent indicatorComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2141646649) {
            super.applyAttrForView((IndicatorComponent) ((View) objArr[0]), (View) ((ogl) objArr[1]), (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return null;
        } else if (hashCode != 1052797818) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.detach(((Boolean) objArr[0]).booleanValue());
            return null;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        if (!str.equals("onbrowserselected") && !str.equals("onBannerSelected")) {
            z = false;
        }
        if ((str.equals("onpageselected") | z) && odx.a(oec.a(map.get("group"), (String[]) null), ((a) this.viewParams).l)) {
            this.mIndicator.setIndex(((Integer) map.get("newIndex")).intValue());
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleMessage(aa.e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue() : onHandleTNodeMessage(eVar.f20300a, eVar.b, eVar.c, null, eVar.d, eVar.e);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void applyAttrForView(TNodeIndicatorView tNodeIndicatorView, a aVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa039f64", new Object[]{this, tNodeIndicatorView, aVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView((IndicatorComponent) tNodeIndicatorView, (TNodeIndicatorView) aVar, map, z);
        this.mIndicator.setTotal(aVar.f20007a);
        int a2 = ohd.a(getNode(), this.context, aVar.b);
        this.mIndicator.setBorderWidth(ohd.a(getNode(), this.context, aVar.h));
        this.mIndicator.setRadius(a2);
        if (aVar.c > 0) {
            this.mIndicator.setGapMargin(ohd.a(getNode(), this.context, aVar.c));
        }
        this.mIndicator.setUnfocusColor(aVar.d);
        this.mIndicator.setFocusColor(aVar.e);
        this.mIndicator.setBorderColor(aVar.g);
        this.mIndicator.setNewControlParams(aVar.k, aVar.i, aVar.j);
        if (!this.firstTime) {
            return;
        }
        this.firstTime = false;
        TNodeIndicatorView.a aVar2 = this.lastIndicatorStatus;
        if (aVar2 != null) {
            this.mIndicator.initWithIndicatorStatus(aVar2);
        } else {
            this.mIndicator.setIndex(aVar.f);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public TNodeIndicatorView onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeIndicatorView) ipChange.ipc$dispatch("c50ff2a5", new Object[]{this, context});
        }
        this.context = context;
        this.mIndicator = new TNodeIndicatorView(context);
        this.firstTime = true;
        return this.mIndicator;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onViewCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6b63ab", new Object[]{this});
            return;
        }
        ab.e S = this.node.S();
        if (S == null) {
            return;
        }
        S.a("onbrowserselected", this);
        S.a("onBannerSelected", this);
        S.a("onpageselected", this);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.view != 0) {
            this.lastIndicatorStatus = ((TNodeIndicatorView) this.view).getCurrentIndicatorStatus();
        }
        super.detach(z);
        ab.e S = this.node.S();
        if (S == null) {
            return;
        }
        S.b("onbrowserselected", this);
        S.b("onBannerSelected", this);
        S.b("onpageselected", this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public a mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("9661bc72", new Object[]{this}) : new a();
    }

    /* loaded from: classes8.dex */
    public static class a extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f20007a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int i;
        public String[] l;
        public int f = 0;
        public int g = -1;
        public int h = 0;
        public float j = 1.0f;
        public boolean k = false;

        static {
            kge.a(1528390042);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1185345197) {
                super.a((Context) objArr[0], (HashMap) objArr[1]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // tb.ogl
        public void a(Context context, HashMap hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9591153", new Object[]{this, context, hashMap});
                return;
            }
            super.a(context, hashMap);
            this.f20007a = oec.a(hashMap.get("numbers"), 4);
            this.b = oec.a(hashMap.get("radius"), 4);
            this.c = oec.a(hashMap.get("inner-space"), 4);
            Object obj = hashMap.get("normal-color");
            if (obj != null) {
                this.d = odx.a(context, 1, obj);
            }
            Object obj2 = hashMap.get("select-color");
            if (obj2 != null) {
                this.e = odx.a(context, 1, obj2);
            }
            String str = "current-index";
            if (!hashMap.containsKey(str)) {
                str = "currentIndex";
            }
            this.f = oec.a(hashMap.get(str), 0);
            Object obj3 = hashMap.get("border-item-color");
            if (obj3 != null) {
                this.g = odx.a(context, 1, obj3);
            }
            this.h = oec.a(hashMap.get("border-item-width"), 0);
        }

        @Override // tb.ogl
        public void a(Context context, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("840caf86", new Object[]{this, context, str, obj});
                return;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1034268112:
                    if (str.equals("new-control")) {
                        c = 2;
                        break;
                    }
                    break;
                case -893829617:
                    if (str.equals("min-scale")) {
                        c = 1;
                        break;
                    }
                    break;
                case 98629247:
                    if (str.equals("group")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2050497489:
                    if (str.equals("indicator-count")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                this.i = oec.a(obj, 0);
            } else if (c == 1) {
                this.j = oec.b(obj, 1);
            } else if (c == 2) {
                this.k = oec.a(obj, false);
            } else if (c != 3) {
            } else {
                this.l = odx.b(obj);
            }
        }
    }
}
