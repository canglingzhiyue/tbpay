package com.taobao.themis.pub_kit.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.o;
import com.taobao.themis.utils.k;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qqb;
import tb.qqc;

@Deprecated(message = "use TMSCommonInjectJS")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0003J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\f"}, d2 = {"Lcom/taobao/themis/pub_kit/utils/PubInjectJs;", "", "()V", "getOpenWindowPolyJS", "", "getSafeAreaHeightJS", "context", "Landroid/content/Context;", "getSafeAreaHeightJSWithSystem", "getSafeAreaTop", "", "getTitleBarPosInjectJS", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a INSTANCE;

    static {
        kge.a(-499412152);
        INSTANCE = new a();
    }

    private a() {
    }

    @JvmStatic
    public static final String a(Context context) {
        Boolean valueOf;
        qqb b;
        ITMSPage c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        q.d(context, "context");
        int c2 = c(context);
        if (context instanceof com.taobao.themis.kernel.g) {
            com.taobao.themis.kernel.f b2 = ((com.taobao.themis.kernel.g) context).b();
            valueOf = (b2 == null || (b = b2.b()) == null || (c = b.c()) == null) ? null : Boolean.valueOf(qqc.b(c));
        } else {
            valueOf = context instanceof j ? Boolean.valueOf(((j) context).c()) : false;
        }
        return "\n!(function(sbh,ims){var t=class{constructor(){this.height=0,this.width=0,this.left=0,this.top=0,this.items=[]}};var e=class extends EventTarget{constructor(){super(),this._titleBarHeight=44,this._safeAreaInsets=[sbh,0,0,0],this._immersive=ims,this._leftPanel=new t,this._centerPanel=new t,this._rightPanel=new t,this.addEventListener(\"updateNavbarPosition\",this._updateValues)}get titleBarHeight(){return this._titleBarHeight}get safeAreaInsetTop(){return this._safeAreaInsets[0]}get immersive(){return this._immersive}get leftPanel(){return this._leftPanel}get centerPanel(){return this._centerPanel}get rightPanel(){return this._rightPanel}_updateValues(_){let{titleBarHeight:i,safeAreaInsets:s,immersive:n,leftPanel:h,centerPanel:r,rightPanel:a}=_.detail;i&&(this._titleBarHeight=i),s&&(this._safeAreaInsets=s),n&&(this._immersive=n),h&&(this._leftPanel=h),r&&(this._centerPanel=r),a&&(this._rightPanel=a)}};navigator.navBarPosition=new e;})(" + c2 + ',' + valueOf + ");\n    ";
    }

    @JvmStatic
    public static final String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        q.d(context, "context");
        int c = c(context);
        return "\n            document.documentElement.style.setProperty('--safe-area-inset-top', '" + c + "px');\n        ";
    }

    @JvmStatic
    private static final int c(Context context) {
        com.taobao.themis.kernel.entity.a c;
        qqb b;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{context})).intValue();
        }
        if (!n.aq()) {
            return k.a(context, k.b(context));
        }
        com.taobao.themis.kernel.f a2 = o.a(context);
        ITMSPage c2 = (a2 == null || (b = a2.b()) == null) ? null : b.c();
        if (c2 != null && (c = c2.c()) != null) {
            z = c.g();
        }
        if (!z) {
            return 0;
        }
        return k.a(context, k.b(context));
    }
}
