package com.taobao.android.tbabilitykit.weex.pop.render;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexEventTarget;
import com.taobao.android.weex.WeexExternalEventType;
import com.taobao.android.weex.WeexExternalType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.h;
import com.taobao.android.weex.n;
import com.taobao.android.weex_ability.page.WeexContainerFragment;
import com.taobao.android.weex_ability.page.WeexFragment;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import com.taobao.tao.log.TLog;
import java.util.Map;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.gnv;
import tb.jvq;
import tb.jvs;
import tb.kge;
import tb.rul;
import tb.ruw;

/* loaded from: classes6.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Fragment f15371a;

    /* loaded from: classes6.dex */
    public static final class a implements com.taobao.android.weex_framework.ui.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rul f15372a;

        public a(rul rulVar) {
            this.f15372a = rulVar;
        }

        @Override // com.taobao.android.weex_framework.ui.c
        public final void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.f15372a.mo2421invoke(Boolean.valueOf(z));
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class b implements jvq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rul f15373a;

        public b(rul rulVar) {
            this.f15373a = rulVar;
        }

        @Override // tb.jvq
        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            } else {
                this.f15373a.mo2421invoke(Boolean.valueOf(q.a(map != null ? map.get("state") : null, (Object) true)));
            }
        }
    }

    static {
        kge.a(-857013362);
    }

    public e(Fragment weexFragment) {
        q.d(weexFragment, "weexFragment");
        this.f15371a = weexFragment;
    }

    public final Fragment b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("274f294b", new Object[]{this}) : this.f15371a;
    }

    /* loaded from: classes6.dex */
    public static final class c implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ruw f15374a;

        @Override // com.taobao.android.weex_framework.g
        public void onDestroyed(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onForeground(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onJSException(p pVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onPrepareSuccess(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRefreshFailed(p pVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRefreshSuccess(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRenderSuccess(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            }
        }

        public c(ruw ruwVar) {
            this.f15374a = ruwVar;
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRenderFailed(p pVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            } else {
                this.f15374a.mo2423invoke(Integer.valueOf(i), str);
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onFatalException(p pVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
            } else {
                this.f15374a.mo2423invoke(Integer.valueOf(i), str);
            }
        }
    }

    public final void a(ruw<? super Integer, ? super String, t> callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc53bc4", new Object[]{this, callback});
            return;
        }
        q.d(callback, "callback");
        Fragment fragment = this.f15371a;
        if (fragment instanceof WeexFragment) {
            if (fragment == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexFragment");
            }
            ((WeexFragment) fragment).setRenderListener(new c(callback));
        } else if (!(fragment instanceof WeexContainerFragment)) {
        } else {
            if (fragment == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexContainerFragment");
            }
            ((WeexContainerFragment) fragment).setWeexInstanceListener(new d(callback));
        }
    }

    /* loaded from: classes6.dex */
    public static final class d implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ruw f15375a;

        @Override // com.taobao.android.weex.h
        public void onDestroyed(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
            }
        }

        @Override // com.taobao.android.weex.h
        public void onEngineException(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        @Override // com.taobao.android.weex.h
        public void onExecuteFailed(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        @Override // com.taobao.android.weex.h
        public void onExecuteSuccess(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
            }
        }

        @Override // com.taobao.android.weex.h
        public void onInitSuccess(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
            }
        }

        @Override // com.taobao.android.weex.h
        public void onRenderSuccess(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
            }
        }

        @Override // com.taobao.android.weex.h
        public void onScriptException(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        public d(ruw ruwVar) {
            this.f15375a = ruwVar;
        }

        @Override // com.taobao.android.weex.h
        public void onInitFailed(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
            } else {
                this.f15375a.mo2423invoke(weexErrorType != null ? Integer.valueOf(weexErrorType.ordinal()) : null, str);
            }
        }

        @Override // com.taobao.android.weex.h
        public void onRenderFailed(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
            } else {
                this.f15375a.mo2423invoke(weexErrorType != null ? Integer.valueOf(weexErrorType.ordinal()) : null, str);
            }
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Fragment fragment = this.f15371a;
        if (fragment instanceof WeexFragment) {
            if (fragment == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexFragment");
            }
            ((WeexFragment) fragment).updateViewPort();
        } else if (!(fragment instanceof WeexContainerFragment)) {
        } else {
            if (fragment == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexContainerFragment");
            }
            ((WeexContainerFragment) fragment).updateViewPort();
        }
    }

    public final void a(jvs overScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f02abcd1", new Object[]{this, overScrollListener});
            return;
        }
        q.d(overScrollListener, "overScrollListener");
        Fragment fragment = this.f15371a;
        if (fragment instanceof WeexFragment) {
            if (fragment == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexFragment");
            }
            ((WeexFragment) fragment).setOverScrollListener(overScrollListener);
        } else if (!(fragment instanceof WeexContainerFragment)) {
        } else {
            if (fragment == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexContainerFragment");
            }
            ((WeexContainerFragment) fragment).setOverScrollListener(overScrollListener);
        }
    }

    public final void a(rul<? super Boolean, t> callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc03baf", new Object[]{this, callback});
            return;
        }
        q.d(callback, "callback");
        Fragment fragment = this.f15371a;
        if (fragment instanceof WeexFragment) {
            if (fragment == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexFragment");
            }
            ((WeexFragment) fragment).setGestureStateListener(new a(callback));
        } else if (!(fragment instanceof WeexContainerFragment)) {
        } else {
            if (fragment == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexContainerFragment");
            }
            ((WeexContainerFragment) fragment).setGestureEventListener(new b(callback));
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        Fragment fragment = this.f15371a;
        if (fragment instanceof WeexFragment) {
            if (fragment == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexFragment");
            }
            p weexFragment = ((WeexFragment) fragment).getInstance();
            if (weexFragment == null) {
                return;
            }
            weexFragment.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, str, jSONObject);
        } else if (!(fragment instanceof WeexContainerFragment)) {
        } else {
            if (fragment == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexContainerFragment");
            }
            WeexInstance weexContainerFragment = ((WeexContainerFragment) fragment).getInstance();
            if (weexContainerFragment == null) {
                return;
            }
            weexContainerFragment.dispatchEvent(WeexEventTarget.DOCUMENT_TARGET, str, com.taobao.android.weex.e.b().a((Object) jSONObject));
        }
    }

    public final void a(com.taobao.android.weex.config.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ea4a1c8", new Object[]{this, aVar});
            return;
        }
        Fragment fragment = this.f15371a;
        if (fragment instanceof WeexFragment) {
            if (fragment == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexFragment");
            }
            ((WeexFragment) fragment).setComputeScreenAdapter(aVar);
        } else if (!(fragment instanceof WeexContainerFragment)) {
        } else {
            if (fragment == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexContainerFragment");
            }
            ((WeexContainerFragment) fragment).setComputeScreenAdapter(aVar);
        }
    }

    public final void a(JSONObject params, Context context, WeexExternalEventType type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc29f2d4", new Object[]{this, params, context, type});
            return;
        }
        q.d(params, "params");
        q.d(type, "type");
        if (context == null) {
            return;
        }
        r0 = "event = " + type.name() + " x = " + params.getIntValue("x") + " y = " + params.getIntValue("y");
        Fragment fragment = this.f15371a;
        if (fragment instanceof WeexFragment) {
            try {
                if (fragment == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexFragment");
                }
                p weexFragment = ((WeexFragment) fragment).getInstance();
                if (weexFragment == null) {
                    return;
                }
                weexFragment.dispatchExternalEvent(new n(WeexExternalType.PAN, gnv.a(context, params.getFloatValue("x")), gnv.a(context, params.getFloatValue("y")), params.getIntValue("w"), params.getIntValue("h"), type, System.currentTimeMillis()));
            } catch (Throwable th) {
                TLog.loge("stdPopTag", "stdPopTag", "handleWindowDrag err = " + th);
            }
        } else if (!(fragment instanceof WeexContainerFragment)) {
        } else {
            try {
                if (fragment == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_ability.page.WeexContainerFragment");
                }
                WeexInstance weexContainerFragment = ((WeexContainerFragment) fragment).getInstance();
                if (weexContainerFragment == null) {
                    return;
                }
                weexContainerFragment.dispatchExternalEvent(new n(WeexExternalType.PAN, gnv.a(context, params.getFloatValue("x")), gnv.a(context, params.getFloatValue("y")), params.getIntValue("w"), params.getIntValue("h"), type, System.currentTimeMillis()));
            } catch (Throwable th2) {
                TLog.loge("stdPopTag", "stdPopTag", "handleWindowDrag err = " + th2);
            }
        }
    }
}
