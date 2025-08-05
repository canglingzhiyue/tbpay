package com.alibaba.ability.utimpl;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.ability.result.g;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsUTAbility;
import com.taobao.android.abilityidl.ability.UTPageSpmPreResult;
import com.taobao.android.abilityidl.ability.UTPageSpmUrlResult;
import com.taobao.android.abilityidl.ability.UTResult;
import com.taobao.android.abilityidl.ability.UTResultWithData;
import com.taobao.android.abilityidl.ability.fh;
import com.taobao.android.abilityidl.ability.fi;
import com.taobao.android.abilityidl.ability.fj;
import com.taobao.android.abilityidl.ability.fk;
import com.taobao.android.abilityidl.ability.fl;
import com.taobao.android.abilityidl.ability.fm;
import com.taobao.android.abilityidl.ability.fn;
import com.taobao.android.abilityidl.ability.fo;
import com.taobao.android.abilityidl.ability.fp;
import com.taobao.android.abilityidl.ability.fq;
import com.taobao.android.abilityidl.ability.fr;
import com.taobao.android.abilityidl.ability.fs;
import com.taobao.android.abilityidl.ability.ft;
import com.taobao.android.abilityidl.ability.fu;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.UTPageStatus;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.als;
import tb.bip;
import tb.kge;
import tb.qqb;

/* loaded from: classes2.dex */
public final class UTAbility extends AbsUTAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* loaded from: classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ fj b;
        public final /* synthetic */ fh c;

        public b(fj fjVar, fh fhVar) {
            this.b = fjVar;
            this.c = fhVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            UTTracker defaultTracker;
            Map<String, String> build;
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String str = this.b.f8864a;
            if (str == null) {
                str = "";
            }
            String str2 = this.b.b;
            String str3 = str2 == null ? "" : str2;
            String str4 = this.b.c;
            String str5 = this.b.d;
            String str6 = this.b.e;
            Map<String, ? extends Object> map = this.b.f;
            Map<String, ? extends Object> map2 = !(map instanceof Map) ? null : map;
            switch (str.hashCode()) {
                case -1349088399:
                    if (str.equals("custom")) {
                        Integer num = this.b.g;
                        int intValue = num != null ? num.intValue() : 19999;
                        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(str3, intValue <= 0 ? 19999 : intValue, str4, str5, str6, map2);
                        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
                        q.b(uTAnalytics, "UTAnalytics.getInstance()");
                        uTAnalytics.getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
                        UTAbility.a(UTAbility.this, this.c, null, 2, null);
                        return;
                    }
                    break;
                case 94750088:
                    if (str.equals("click")) {
                        if (str4 == null) {
                            com.alibaba.ability.e.a(new Runnable() { // from class: com.alibaba.ability.utimpl.UTAbility.b.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    fh fhVar = b.this.c;
                                    ErrorResult b = a$a.b("arg1 参数必传");
                                    q.b(b, "ErrorResult.StandardErro…aramsInvalid(\"arg1 参数必传\")");
                                    fhVar.a(b);
                                }
                            }, -1L);
                            return;
                        }
                        if (this.b.h) {
                            UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder2 = new UTOriginalCustomHitBuilder(str3, 2101, str4, str5, str6, map2);
                            UTAnalytics uTAnalytics2 = UTAnalytics.getInstance();
                            q.b(uTAnalytics2, "UTAnalytics.getInstance()");
                            defaultTracker = uTAnalytics2.getDefaultTracker();
                            build = uTOriginalCustomHitBuilder2.build();
                        } else {
                            if (str3.length() == 0) {
                                z = true;
                            }
                            UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = z ? new UTHitBuilders.UTControlHitBuilder(str4) : new UTHitBuilders.UTControlHitBuilder(str3, str4);
                            uTControlHitBuilder.setProperties(map2);
                            UTAnalytics uTAnalytics3 = UTAnalytics.getInstance();
                            q.b(uTAnalytics3, "UTAnalytics.getInstance()");
                            defaultTracker = uTAnalytics3.getDefaultTracker();
                            build = uTControlHitBuilder.build();
                        }
                        defaultTracker.send(build);
                        UTAbility.a(UTAbility.this, this.c, null, 2, null);
                        return;
                    }
                    break;
                case 570049718:
                    if (str.equals("pageExposure")) {
                        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder3 = new UTOriginalCustomHitBuilder(str3, 2001, str4, str5, str6, map2);
                        UTAnalytics uTAnalytics4 = UTAnalytics.getInstance();
                        q.b(uTAnalytics4, "UTAnalytics.getInstance()");
                        uTAnalytics4.getDefaultTracker().send(uTOriginalCustomHitBuilder3.build());
                        UTAbility.a(UTAbility.this, this.c, null, 2, null);
                        return;
                    }
                    break;
                case 1113764132:
                    if (str.equals("componentExposure")) {
                        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder4 = new UTOriginalCustomHitBuilder(str3, 2201, str4, str5, str6, map2);
                        UTAnalytics uTAnalytics5 = UTAnalytics.getInstance();
                        q.b(uTAnalytics5, "UTAnalytics.getInstance()");
                        uTAnalytics5.getDefaultTracker().send(uTOriginalCustomHitBuilder4.build());
                        UTAbility.a(UTAbility.this, this.c, null, 2, null);
                        return;
                    }
                    break;
            }
            com.alibaba.ability.e.a(new Runnable() { // from class: com.alibaba.ability.utimpl.UTAbility.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    fh fhVar = b.this.c;
                    ErrorResult b = a$a.b("参数错误");
                    q.b(b, "ErrorResult.StandardErro…ESULT_MSG_PARAMS_INVALID)");
                    fhVar.a(b);
                }
            }, -1L);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fh f1993a;

        public c(fh fhVar) {
            this.f1993a = fhVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            UTResult uTResult = new UTResult();
            uTResult.success = true;
            this.f1993a.a(uTResult);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f1994a;
        public final /* synthetic */ fi b;

        public d(Map map, fi fiVar) {
            this.f1994a = map;
            this.b = fiVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            UTResultWithData uTResultWithData = new UTResultWithData();
            if (this.f1994a != null) {
                uTResultWithData.success = true;
                uTResultWithData.utData = this.f1994a;
            } else {
                uTResultWithData.success = false;
            }
            this.b.a(uTResultWithData);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ fq b;
        public final /* synthetic */ fh c;

        public e(fq fqVar, fh fhVar) {
            this.b = fqVar;
            this.c = fhVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            fh fhVar = this.c;
            ErrorResult b = a$a.b("参数错误");
            q.b(b, "ErrorResult.StandardErro…ESULT_MSG_PARAMS_INVALID)");
            fhVar.a(b);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ft b;
        public final /* synthetic */ fh c;

        public f(ft ftVar, fh fhVar) {
            this.b = ftVar;
            this.c = fhVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Map<String, ? extends Object> map = this.b.f8874a;
            if (!(map instanceof Map)) {
                map = null;
            }
            if (map == null) {
                fh fhVar = this.c;
                ErrorResult b = a$a.b("参数错误");
                q.b(b, "ErrorResult.StandardErro…ESULT_MSG_PARAMS_INVALID)");
                fhVar.a(b);
            }
            if (map == null) {
                return;
            }
            UTAnalytics.getInstance().updateSessionProperties(map);
            UTAbility.a(UTAbility.this, this.c, null, 2, null);
        }
    }

    static {
        kge.a(442666273);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(UTAbility uTAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes2.dex */
    public static final class a {
        static {
            kge.a(-1386134743);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void commitEvent(als context, fj params, fh callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de44ca96", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        com.alibaba.ability.e.c((Runnable) new b(params, callback));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void requestPageAllProperties(als context, fu params, fi callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d2c5bd", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Activity a2 = a(this, context, params.f8875a, null, 4, null);
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        a(callback, uTAnalytics.getDefaultTracker().getPageAllProperties(a2));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public g<UTPageSpmPreResult, ErrorResult> getPageSpmPre(als context, fu params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("eacc51bd", new Object[]{this, context, params});
        }
        q.d(context, "context");
        q.d(params, "params");
        UTPageSpmPreResult uTPageSpmPreResult = new UTPageSpmPreResult();
        Activity a2 = a(this, context, params.f8875a, null, 4, null);
        if (a2 == null) {
            return new g<>(uTPageSpmPreResult, a$a.b("没有获取到 activity"));
        }
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        Map<String, String> pageAllProperties = uTAnalytics.getDefaultTracker().getPageAllProperties(a2);
        if (!(pageAllProperties instanceof Map)) {
            pageAllProperties = null;
        }
        if (pageAllProperties != null) {
            uTPageSpmPreResult.spmPre = pageAllProperties.get(bip.KEY_UMBRELLA_SPM_PRE);
        } else {
            uTPageSpmPreResult.spmPre = "";
        }
        return new g<>(uTPageSpmPreResult);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public g<UTPageSpmUrlResult, ErrorResult> getPageSpmUrl(als context, fu params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("3eee3371", new Object[]{this, context, params});
        }
        q.d(context, "context");
        q.d(params, "params");
        UTPageSpmUrlResult uTPageSpmUrlResult = new UTPageSpmUrlResult();
        Activity a2 = a(this, context, params.f8875a, null, 4, null);
        if (a2 == null) {
            return new g<>(uTPageSpmUrlResult, a$a.b("没有获取到 activity"));
        }
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        Map<String, String> pageAllProperties = uTAnalytics.getDefaultTracker().getPageAllProperties(a2);
        if (!(pageAllProperties instanceof Map)) {
            pageAllProperties = null;
        }
        if (pageAllProperties != null) {
            uTPageSpmUrlResult.spmUrl = pageAllProperties.get("spm-url");
        } else {
            uTPageSpmUrlResult.spmUrl = "";
        }
        return new g<>(uTPageSpmUrlResult);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void pageAppear(als context, fk params, fh callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e323d96", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Activity a2 = a(context, params.f8865a, callback);
        if (a2 == null) {
            return;
        }
        String str = params.b;
        if (str == null) {
            str = "";
        }
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().pageAppear(a2, str);
        a(this, callback, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void pageAppearDonotSkip(als context, fk params, fh callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf29d7f5", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Activity a2 = a(context, params.f8865a, callback);
        if (a2 == null) {
            return;
        }
        String str = params.b;
        if (str == null) {
            str = "";
        }
        try {
            com.taobao.themis.kernel.f b2 = com.taobao.themis.kernel.utils.a.b(context);
            if (b2 != null) {
                qqb b3 = b2.b();
                int intValue = (b3 != null ? Integer.valueOf(b3.d()) : null).intValue();
                UTAnalytics uTAnalytics = UTAnalytics.getInstance();
                q.b(uTAnalytics, "UTAnalytics.getInstance()");
                uTAnalytics.getDefaultTracker().pageAppearWithRouter(a2, str, intValue);
            } else {
                UTAnalytics uTAnalytics2 = UTAnalytics.getInstance();
                q.b(uTAnalytics2, "UTAnalytics.getInstance()");
                uTAnalytics2.getDefaultTracker().pageAppearDonotSkip(a2, str);
            }
        } catch (Throwable unused) {
            UTAnalytics uTAnalytics3 = UTAnalytics.getInstance();
            q.b(uTAnalytics3, "UTAnalytics.getInstance()");
            uTAnalytics3.getDefaultTracker().pageAppearDonotSkip(a2, str);
        }
        a(this, callback, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void pageDisAppear(als context, fu params, fh callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63c61abc", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Activity a2 = a(context, params.f8875a, callback);
        if (a2 == null) {
            return;
        }
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().pageDisAppear(a2);
        a(this, callback, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void skipPage(als context, fu params, fh callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd297d76", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Activity a2 = a(context, params.f8875a, callback);
        if (a2 == null) {
            return;
        }
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().skipPage(a2);
        a(this, callback, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void updateNextPageProperties(als context, fl params, fh callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d843e9cf", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Map<String, ? extends Object> map = params.f8866a;
        if (!(map instanceof Map)) {
            map = null;
        }
        if (map == null) {
            ErrorResult b2 = a$a.b("参数错误");
            q.b(b2, "ErrorResult.StandardErro…ESULT_MSG_PARAMS_INVALID)");
            callback.a(b2);
        }
        if (map == null) {
            return;
        }
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().updateNextPageProperties(map);
        a(this, callback, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void updateNextPageUtparam(als context, fn params, fh callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc30e432", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        String str = params.f8868a;
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().updateNextPageUtparam(str);
        a(this, callback, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void updateNextPageUtparamCnt(als context, fm params, fh callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca3c9376", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        String str = params.f8867a;
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().updateNextPageUtparamCnt(str);
        a(this, callback, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void updatePageName(als context, fo params, fh callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e2740b1", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Activity a2 = a(context, params.f8869a, callback);
        if (a2 == null) {
            return;
        }
        String str = params.b;
        if (str == null) {
            str = "";
        }
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().updatePageName(a2, str);
        a(this, callback, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void updatePageProperties(als context, fp params, fh callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6104ef8", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Activity a2 = a(context, params.f8870a, callback);
        if (a2 == null) {
            return;
        }
        Map<String, ? extends Object> map = params.b;
        if (!(map instanceof Map)) {
            map = null;
        }
        if (map == null) {
            ErrorResult b2 = a$a.b("参数错误");
            q.b(b2, "ErrorResult.StandardErro…ESULT_MSG_PARAMS_INVALID)");
            callback.a(b2);
        }
        if (map == null) {
            return;
        }
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().updatePageProperties(a2, map);
        a(this, callback, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void updatePageStatus(als context, fq params, fh callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32703756", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Activity a2 = a(context, params.f8871a, callback);
        if (a2 == null) {
            return;
        }
        String str = params.b;
        if (str == null) {
            str = "";
        }
        if (str.hashCode() == 783991761 && str.equals("UT_H5_IN_WebView")) {
            UTAnalytics uTAnalytics = UTAnalytics.getInstance();
            q.b(uTAnalytics, "UTAnalytics.getInstance()");
            uTAnalytics.getDefaultTracker().updatePageStatus(a2, UTPageStatus.UT_H5_IN_WebView);
            a(this, callback, null, 2, null);
            return;
        }
        com.alibaba.ability.e.a(new e(params, callback), -1L);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void updatePageUrl(als context, fr params, fh callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adad8b42", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Activity a2 = a(context, params.f8872a, callback);
        if (a2 == null) {
            return;
        }
        String str = params.b;
        if (str == null) {
            str = "";
        }
        Uri parse = Uri.parse(str);
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().updatePageUrl(a2, parse);
        a(this, callback, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void updatePageUtparam(als context, fs params, fh callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2855c0c0", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Activity a2 = a(context, params.f8873a, callback);
        if (a2 == null) {
            return;
        }
        String str = params.b;
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().updatePageUtparam(a2, str);
        a(this, callback, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUTAbility
    public void updateSessionProperties(als context, ft params, fh callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc1edc9", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        com.alibaba.ability.e.c((Runnable) new f(params, callback));
    }

    public static /* synthetic */ void a(UTAbility uTAbility, fh fhVar, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cdbc9a3", new Object[]{uTAbility, fhVar, map, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            map = null;
        }
        uTAbility.a(fhVar, map);
    }

    private final void a(fh fhVar, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba8793ea", new Object[]{this, fhVar, map});
        } else {
            com.alibaba.ability.e.a(new c(fhVar), -1L);
        }
    }

    private final void a(fi fiVar, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8831f5ab", new Object[]{this, fiVar, map});
        } else {
            com.alibaba.ability.e.a(new d(map, fiVar), -1L);
        }
    }

    public static /* synthetic */ Activity a(UTAbility uTAbility, als alsVar, Boolean bool, fh fhVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("146280ab", new Object[]{uTAbility, alsVar, bool, fhVar, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            fhVar = null;
        }
        return uTAbility.a(alsVar, bool, fhVar);
    }

    private final Activity a(als alsVar, Boolean bool, fh fhVar) {
        Activity activity;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("2987cff8", new Object[]{this, alsVar, bool, fhVar});
        }
        Object c2 = alsVar.c("ut_page_object");
        if (c2 instanceof Activity) {
            return (Activity) c2;
        }
        if (bool != null) {
            z = bool.booleanValue();
        }
        if (z) {
            activity = com.taobao.application.common.c.b();
        } else {
            Context f2 = alsVar.f().f();
            if (!(f2 instanceof Activity)) {
                f2 = null;
            }
            activity = (Activity) f2;
        }
        if (activity == null && fhVar != null) {
            ErrorResult b2 = a$a.b("没有获取到 activity");
            q.b(b2, "ErrorResult.StandardErro…SULT_MSG_CONTAINER_ERROR)");
            fhVar.a(b2);
        }
        return activity;
    }
}
