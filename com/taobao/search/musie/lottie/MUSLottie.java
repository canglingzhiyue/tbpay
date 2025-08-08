package com.taobao.search.musie.lottie;

import android.animation.Animator;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.g;
import com.airbnb.lottie.j;
import com.airbnb.lottie.l;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.search.musie.lottie.LottieWrapView;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class MUSLottie extends UINode implements Animator.AnimatorListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean start;

    /* loaded from: classes7.dex */
    public static final class a implements l {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public a(String str) {
            this.b = str;
        }

        @Override // com.airbnb.lottie.l
        public final void onCompositionLoaded(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90ed5f5e", new Object[]{this, gVar});
                return;
            }
            MUSLottie mUSLottie = MUSLottie.this;
            String str = this.b;
            if (str == null) {
                q.a();
            }
            MUSLottie.access$fireLoadResult(mUSLottie, true, str);
        }
    }

    /* loaded from: classes7.dex */
    public static final class c implements LottieWrapView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.search.musie.lottie.LottieWrapView.a
        public final void a(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                return;
            }
            String str = (String) MUSLottie.this.getAttribute("src");
            if (str != null) {
                TLogTracker.b("tbsearch_lottie", "draw_error", "url " + str);
            }
            String str2 = (String) MUSLottie.this.getAttribute("json");
            if (str2 == null) {
                return;
            }
            TLogTracker.b("tbsearch_lottie", "draw_error", "json " + str2);
        }
    }

    static {
        kge.a(429464214);
        kge.a(1420754541);
    }

    public static /* synthetic */ Object ipc$super(MUSLottie mUSLottie, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 474982114) {
            super.onActivityResume();
            return null;
        } else if (hashCode != 1692842255) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onActivityPause();
            return null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
        }
    }

    /* loaded from: classes7.dex */
    public static final class b<T> implements j<Throwable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public b(String str) {
            this.b = str;
        }

        @Override // com.airbnb.lottie.j
        public /* synthetic */ void onResult(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8251d27f", new Object[]{this, th});
            } else {
                a(th);
            }
        }

        public final void a(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                return;
            }
            MUSLottie mUSLottie = MUSLottie.this;
            String str = this.b;
            if (str == null) {
                q.a();
            }
            MUSLottie.access$fireLoadResult(mUSLottie, false, str);
        }
    }

    public MUSLottie(int i) {
        super(i);
    }

    public static final /* synthetic */ void access$fireLoadResult(MUSLottie mUSLottie, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a718a5", new Object[]{mUSLottie, new Boolean(z), str});
        } else {
            mUSLottie.fireLoadResult(z, str);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this}) : UINodeType.VIEW;
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    /* renamed from: onCreateMountContent */
    public Object mo1225onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context}) : new LottieWrapView(context);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        this.start = false;
        Object mountContent = getMountContent();
        q.a(mountContent, "getMountContent<LottieWrapView>()");
        LottieAnimationView lottieView = ((LottieWrapView) mountContent).getLottieView();
        q.a((Object) lottieView, "lottieView");
        applyOptions(lottieView, (JSONObject) getAttribute("options"));
        if (!applyContent(lottieView)) {
            return;
        }
        if (q.a((Object) ((Boolean) getAttribute("autoplay")), (Object) true)) {
            lottieView.playAnimation();
        } else {
            lottieView.pauseAnimation();
        }
        lottieView.addAnimatorListener(this);
        ((LottieWrapView) getMountContent()).setOnDrawErrorListener(new c());
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        LottieAnimationView lottieView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        boolean z = obj instanceof LottieWrapView;
        LottieWrapView lottieWrapView = (LottieWrapView) (!z ? null : obj);
        if (lottieWrapView != null && (lottieView = lottieWrapView.getLottieView()) != null) {
            lottieView.setAnimationFromJson("", null);
            lottieView.cancelAnimation();
            lottieView.removeAnimatorListener(this);
        }
        if (!z) {
            obj = null;
        }
        LottieWrapView lottieWrapView2 = (LottieWrapView) obj;
        if (lottieWrapView2 == null) {
            return;
        }
        lottieWrapView2.setOnDrawErrorListener(null);
    }

    @MUSNodeProp(name = "src")
    public final void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
        } else {
            setAttribute("src", str);
        }
    }

    @MUSNodeProp(name = "src", refresh = true)
    public final void refreshSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae43deda", new Object[]{this, str});
            return;
        }
        Object mountContent = getMountContent();
        q.a(mountContent, "getMountContent<LottieWrapView>()");
        LottieAnimationView lottieView = ((LottieWrapView) mountContent).getLottieView();
        q.a((Object) lottieView, "getMountContent<LottieWrapView>().lottieView");
        applyContent(lottieView);
    }

    @MUSNodeProp(name = "json")
    public final void setJsonContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe60c200", new Object[]{this, str});
        } else {
            setAttribute("json", str);
        }
    }

    @MUSNodeProp(name = "json", refresh = true)
    public final void refreshJsonContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a65ea7", new Object[]{this, str});
            return;
        }
        Object mountContent = getMountContent();
        q.a(mountContent, "getMountContent<LottieWrapView>()");
        LottieAnimationView lottieView = ((LottieWrapView) mountContent).getLottieView();
        q.a((Object) lottieView, "getMountContent<LottieWrapView>().lottieView");
        applyContent(lottieView);
    }

    private final void fireLoadResult(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4adcc41e", new Object[]{this, new Boolean(z), str});
        } else if (!hasEvent("load")) {
        } else {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "isFinished", String.valueOf(z));
            jSONObject2.put((JSONObject) "src", str);
            fireEvent("load", jSONObject);
        }
    }

    private final boolean applyContent(LottieAnimationView lottieAnimationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f3a2304", new Object[]{this, lottieAnimationView})).booleanValue();
        }
        String str = (String) getAttribute("json");
        String str2 = (String) getAttribute("src");
        lottieAnimationView.removeAllLottieOnCompositionLoadedListener();
        lottieAnimationView.setFailureListener(null);
        if (!StringUtils.isEmpty(str)) {
            lottieAnimationView.setAnimationFromJson(str, null);
        } else if (!StringUtils.isEmpty(str2)) {
            lottieAnimationView.setAnimationFromUrl(str2, str2);
            lottieAnimationView.addLottieOnCompositionLoadedListener(new a(str2));
            lottieAnimationView.setFailureListener(new b(str2));
        } else {
            lottieAnimationView.cancelAnimation();
            return false;
        }
        return true;
    }

    @MUSNodeProp(name = "autoplay")
    public final void setAutoPlay(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f415c1", new Object[]{this, bool});
        } else {
            setAttribute("autoplay", bool);
        }
    }

    @MUSNodeProp(name = "options")
    public final void setOptions(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ca08ced", new Object[]{this, jSONObject});
        } else {
            setAttribute("options", jSONObject);
        }
    }

    @MUSNodeProp(name = "options", refresh = true)
    public final void refreshOptions(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede451e6", new Object[]{this, jSONObject});
            return;
        }
        Object mountContent = getMountContent();
        q.a(mountContent, "getMountContent<LottieWrapView>()");
        LottieAnimationView lottieView = ((LottieWrapView) mountContent).getLottieView();
        q.a((Object) lottieView, "getMountContent<LottieWrapView>().lottieView");
        applyOptions(lottieView, jSONObject);
    }

    private final void applyOptions(LottieAnimationView lottieAnimationView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af311295", new Object[]{this, lottieAnimationView, jSONObject});
            return;
        }
        com.taobao.search.musie.lottie.a aVar = new com.taobao.search.musie.lottie.a(jSONObject);
        lottieAnimationView.setRepeatMode(aVar.b());
        lottieAnimationView.setRepeatCount(aVar.a());
        lottieAnimationView.setMinFrame(aVar.c());
        if (aVar.d() >= 0) {
            lottieAnimationView.setMaxFrame(aVar.d());
        }
        lottieAnimationView.setMinProgress(aVar.e());
        lottieAnimationView.setMaxProgress(aVar.f());
    }

    @MUSMethod(uiThread = true)
    public final void play() {
        LottieAnimationView lottieView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        LottieWrapView lottieWrapView = (LottieWrapView) getMountContent();
        if (lottieWrapView == null || (lottieView = lottieWrapView.getLottieView()) == null) {
            return;
        }
        if (this.start) {
            lottieView.resumeAnimation();
            fireStart();
            return;
        }
        lottieView.playAnimation();
    }

    @MUSMethod(uiThread = true)
    public final void pause() {
        LottieAnimationView lottieView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        LottieWrapView lottieWrapView = (LottieWrapView) getMountContent();
        if (lottieWrapView == null || (lottieView = lottieWrapView.getLottieView()) == null) {
            return;
        }
        lottieView.pauseAnimation();
    }

    @MUSMethod(uiThread = true)
    public final void stop() {
        LottieAnimationView lottieView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        LottieWrapView lottieWrapView = (LottieWrapView) getMountContent();
        if (lottieWrapView != null && (lottieView = lottieWrapView.getLottieView()) != null) {
            lottieView.setFrame(0);
            lottieView.pauseAnimation();
        }
        fireEnd();
    }

    private final void fireStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7580e53", new Object[]{this});
        } else if (!hasEvent("start")) {
        } else {
            fireEvent("start", null);
        }
    }

    private final void fireEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ae880cc", new Object[]{this});
        } else if (!hasEvent("end")) {
        } else {
            fireEvent("end", null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            return;
        }
        this.start = true;
        fireStart();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            return;
        }
        this.start = false;
        fireEnd();
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onActivityPause() {
        LottieAnimationView lottieView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        LottieWrapView lottieWrapView = (LottieWrapView) getMountContent();
        if (lottieWrapView == null || (lottieView = lottieWrapView.getLottieView()) == null) {
            return;
        }
        lottieView.pauseAnimation();
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onActivityResume() {
        LottieAnimationView lottieView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.onActivityResume();
        LottieWrapView lottieWrapView = (LottieWrapView) getMountContent();
        if (lottieWrapView == null || (lottieView = lottieWrapView.getLottieView()) == null || !lottieView.isAttachedToWindow()) {
            return;
        }
        lottieView.resumeAnimation();
    }
}
