package com.taobao.themis.kernel.utils;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import tb.kge;
import tb.qqc;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J \u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0013"}, d2 = {"Lcom/taobao/themis/kernel/utils/TMSCommonInjectJS;", "", "()V", "generateFireEventJs", "", "event", "params", "Lcom/alibaba/fastjson/JSON;", "generateFireEventJsOld", "generateFireTargetEventJs", "target", "getOpenWindowPolyJS", "getSafeAreaHeightJS", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "getSafeAreaTop", "", "getTitleBarHeight", "getTitleBarPosInjectJS", "themis_kernel_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final j INSTANCE;

    @JvmStatic
    public static final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : ";window.__openWindowHook__=function(){var n=window.__windvane__.call,i=void 0;return function(o,_){_?i=o:i&&(o=i),window.__windvane__.call=function(i){for(var _=arguments.length,a=Array(_>1?_-1:0),d=1;d<_;d++)a[d-1]=arguments[d];[\"WVNative.openWindow\",\"Base.openWindow\"].indexOf(i)>-1&&o&&\"jump\"!==o.apply(void 0,a)||n.apply(this,arguments)}}}();\nwindow.__openWindowHook__(function(_,n,o){__windvane__.call('Triver.push',{url:_.url,type:'h5'},n,o)},1);";
    }

    static {
        kge.a(313654309);
        INSTANCE = new j();
    }

    private j() {
    }

    @JvmStatic
    public static final String a(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa2f6aed", new Object[]{page});
        }
        kotlin.jvm.internal.q.d(page, "page");
        int c = INSTANCE.c(page);
        return "document.documentElement.style.setProperty('--safe-area-inset-top', '" + c + "px');";
    }

    private final int c(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30961708", new Object[]{this, iTMSPage})).intValue();
        }
        Activity o = iTMSPage.b().o();
        if (!n.aq()) {
            Activity activity = o;
            return com.taobao.themis.utils.k.a((Context) activity, com.taobao.themis.utils.k.b(activity));
        } else if (!iTMSPage.c().g()) {
            return 0;
        } else {
            Activity activity2 = o;
            return com.taobao.themis.utils.k.a((Context) activity2, com.taobao.themis.utils.k.b(activity2));
        }
    }

    @JvmStatic
    public static final String b(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e6dda8c", new Object[]{page});
        }
        kotlin.jvm.internal.q.d(page, "page");
        int c = INSTANCE.c(page);
        boolean b = qqc.b(page);
        return "\n!(function(sbh,ims){var t=class{constructor(){this.height=0,this.width=0,this.left=0,this.top=0,this.items=[]}};var e=class extends EventTarget{constructor(){super(),this._titleBarHeight=44,this._safeAreaInsets=[sbh,0,0,0],this._immersive=ims,this._leftPanel=new t,this._centerPanel=new t,this._rightPanel=new t,this.addEventListener(\"updateNavbarPosition\",this._updateValues)}get titleBarHeight(){return this._titleBarHeight}get safeAreaInsetTop(){return this._safeAreaInsets[0]}get immersive(){return this._immersive}get leftPanel(){return this._leftPanel}get centerPanel(){return this._centerPanel}get rightPanel(){return this._rightPanel}_updateValues(_){let{titleBarHeight:i,safeAreaInsets:s,immersive:n,leftPanel:h,centerPanel:r,rightPanel:a}=_.detail;i&&(this._titleBarHeight=i),s&&(this._safeAreaInsets=s),n&&(this._immersive=n),h&&(this._leftPanel=h),r&&(this._centerPanel=r),a&&(this._rightPanel=a)}};navigator.navBarPosition=new e;})(" + c + ',' + b + ");\n    ";
    }

    @Deprecated(message = "仅存量轻应用事件使用", replaceWith = @ReplaceWith(expression = "generateFireEventJs(event, params)", imports = {}))
    @JvmStatic
    public static final String a(String event, JSON params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9bfe05c3", new Object[]{event, params});
        }
        kotlin.jvm.internal.q.d(event, "event");
        kotlin.jvm.internal.q.d(params, "params");
        return "\n                (function() {\n                   var customEvent = new CustomEvent('message', { detail: " + params.toJSONString() + " });\n                   customEvent.origin = 'Triver';\n                   customEvent.data = {\"event\": \"" + event + "\"};\n                   dispatchEvent(customEvent);\n                })()\n            ";
    }

    @JvmStatic
    public static final String a(String target, String event, JSON params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("afea000d", new Object[]{target, event, params});
        }
        kotlin.jvm.internal.q.d(target, "target");
        kotlin.jvm.internal.q.d(event, "event");
        kotlin.jvm.internal.q.d(params, "params");
        return "\n            (function() {\n                if (typeof " + target + " === 'undefined') {\n                    return;\n                }\n                " + target + ".dispatchEvent(new CustomEvent('" + event + "', { detail: " + params.toJSONString() + " }));\n            })()\n        ";
    }
}
