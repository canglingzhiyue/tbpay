package com.taobao.weex.ui.action;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.v4.view.animation.PathInterpolatorCompat;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.remote.a;
import com.taobao.weex.remote.d;
import com.taobao.weex.ui.animation.BackgroundColorProperty;
import com.taobao.weex.ui.animation.HeightProperty;
import com.taobao.weex.ui.animation.WXAnimationBean;
import com.taobao.weex.ui.animation.WXAnimationModule;
import com.taobao.weex.ui.animation.WidthProperty;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.view.border.BorderDrawable;
import com.taobao.weex.utils.SingleFunctionParser;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXResourceUtils;
import com.taobao.weex.utils.WXUtils;
import com.taobao.weex.utils.WXViewInnerUtils;
import java.util.HashMap;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class GraphicActionAnimation extends BasicGraphicAction implements a<d> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GraphicActionAnimation";
    private static d templateDomImpl;
    private String callback;
    private WXAnimationBean mAnimationBean;
    private boolean styleNeedInit;

    static {
        kge.a(1705248191);
        kge.a(-498835886);
    }

    public static /* synthetic */ Object ipc$super(GraphicActionAnimation graphicActionAnimation, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public GraphicActionAnimation(WXSDKInstance wXSDKInstance, String str, WXAnimationBean wXAnimationBean) {
        super(wXSDKInstance, str);
        this.styleNeedInit = false;
        this.styleNeedInit = false;
        this.callback = null;
        this.mAnimationBean = wXAnimationBean;
    }

    public GraphicActionAnimation(WXSDKInstance wXSDKInstance, String str, String str2, String str3) {
        super(wXSDKInstance, str);
        this.styleNeedInit = false;
        this.styleNeedInit = true;
        this.callback = str3;
        if (!StringUtils.isEmpty(str2)) {
            this.mAnimationBean = (WXAnimationBean) JSONObject.parseObject(str2, WXAnimationBean.class);
        }
    }

    public GraphicActionAnimation(WXSDKInstance wXSDKInstance, String str, WXAnimationBean wXAnimationBean, String str2) {
        super(wXSDKInstance, str);
        this.styleNeedInit = false;
        this.styleNeedInit = false;
        this.mAnimationBean = wXAnimationBean;
        this.callback = str2;
    }

    public GraphicActionAnimation() {
        super(null, null);
        this.styleNeedInit = false;
    }

    @Override // com.taobao.weex.ui.action.IExecutable
    public void executeAction() {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d76bd12", new Object[]{this});
        } else if (this.mAnimationBean == null) {
        } else {
            WXComponent wXComponent = WXSDKManager.getInstance().getWXRenderManager().getWXComponent(getPageId(), getRef());
            if (wXComponent == null && (dVar = templateDomImpl) != null) {
                if (!dVar.isVirtualDomRef(getRef())) {
                    return;
                }
                wXComponent = templateDomImpl.findVirtualComponentByVRef(getPageId(), getRef());
            }
            if (wXComponent == null) {
                return;
            }
            wXComponent.setUseAnimation();
            WXSDKInstance wXSDKInstance = WXSDKManager.getInstance().getWXRenderManager().getWXSDKInstance(getPageId());
            if (wXSDKInstance == null || this.mAnimationBean.styles == null) {
                return;
            }
            if (this.styleNeedInit) {
                String str = (String) wXComponent.getStyles().get("transformOrigin");
                if (StringUtils.isEmpty(this.mAnimationBean.styles.transformOrigin)) {
                    this.mAnimationBean.styles.transformOrigin = str;
                }
                this.mAnimationBean.styles.init(this.mAnimationBean.styles.transformOrigin, this.mAnimationBean.styles.transform, (int) wXComponent.getLayoutWidth(), (int) wXComponent.getLayoutHeight(), wXSDKInstance.y(), wXSDKInstance);
            }
            startAnimation(wXSDKInstance, wXComponent);
        }
    }

    private void startAnimation(WXSDKInstance wXSDKInstance, WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("842346aa", new Object[]{this, wXSDKInstance, wXComponent});
        } else if (wXComponent == null) {
        } else {
            WXAnimationBean wXAnimationBean = this.mAnimationBean;
            if (wXAnimationBean != null) {
                wXComponent.setNeedLayoutOnAnimation(wXAnimationBean.needLayout);
            }
            if (wXComponent.mo1286getHostView() == null) {
                wXComponent.postAnimation(new WXAnimationModule.AnimationHolder(this.mAnimationBean, this.callback));
                return;
            }
            try {
                ObjectAnimator createAnimator = createAnimator(getWXSDKIntance(), wXComponent.mo1286getHostView(), wXSDKInstance.y());
                if (createAnimator == null) {
                    return;
                }
                Animator.AnimatorListener createAnimatorListener = createAnimatorListener(wXSDKInstance, this.callback);
                if (Build.VERSION.SDK_INT < 18 && wXComponent.isLayerTypeEnabled()) {
                    wXComponent.mo1286getHostView().setLayerType(2, null);
                }
                Interpolator createTimeInterpolator = createTimeInterpolator();
                if (createAnimatorListener != null) {
                    createAnimator.addListener(createAnimatorListener);
                }
                if (createTimeInterpolator != null) {
                    createAnimator.setInterpolator(createTimeInterpolator);
                }
                wXComponent.mo1286getHostView().setCameraDistance(this.mAnimationBean.styles.getCameraDistance());
                createAnimator.setDuration(this.mAnimationBean.duration);
                createAnimator.start();
            } catch (RuntimeException e) {
                WXLogUtils.e(TAG, WXLogUtils.getStackTrace(e));
            }
        }
    }

    private ObjectAnimator createAnimator(WXSDKInstance wXSDKInstance, View view, int i) {
        WXAnimationBean.Style style;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectAnimator) ipChange.ipc$dispatch("eef792bf", new Object[]{this, wXSDKInstance, view, new Integer(i)});
        }
        if (view == null || (style = this.mAnimationBean.styles) == null) {
            return null;
        }
        List<PropertyValuesHolder> holders = style.getHolders();
        if (!StringUtils.isEmpty(style.backgroundColor)) {
            BorderDrawable borderDrawable = WXViewInnerUtils.getBorderDrawable(view);
            if (borderDrawable != null) {
                holders.add(PropertyValuesHolder.ofObject(new BackgroundColorProperty(), new ArgbEvaluator(), Integer.valueOf(borderDrawable.getColor()), Integer.valueOf(WXResourceUtils.getColor(style.backgroundColor))));
            } else if (view.getBackground() instanceof ColorDrawable) {
                holders.add(PropertyValuesHolder.ofObject(new BackgroundColorProperty(), new ArgbEvaluator(), Integer.valueOf(((ColorDrawable) view.getBackground()).getColor()), Integer.valueOf(WXResourceUtils.getColor(style.backgroundColor))));
            }
        }
        if (view.getLayoutParams() != null && (!StringUtils.isEmpty(style.width) || !StringUtils.isEmpty(style.height))) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!StringUtils.isEmpty(style.width)) {
                holders.add(PropertyValuesHolder.ofInt(String.valueOf(new WidthProperty()), layoutParams.width, (int) WXViewInnerUtils.getRealPxByWidth(wXSDKInstance, WXUtils.getFloat(style.width), i)));
            }
            if (!StringUtils.isEmpty(style.height)) {
                holders.add(PropertyValuesHolder.ofInt(String.valueOf(new HeightProperty()), layoutParams.height, (int) WXViewInnerUtils.getRealPxByWidth(wXSDKInstance, WXUtils.getFloat(style.height), i)));
            }
        }
        if (style.getPivot() != null) {
            Pair<Float, Float> pivot = style.getPivot();
            view.setPivotX(((Float) pivot.first).floatValue());
            view.setPivotY(((Float) pivot.second).floatValue());
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, (PropertyValuesHolder[]) holders.toArray(new PropertyValuesHolder[holders.size()]));
        ofPropertyValuesHolder.setStartDelay(this.mAnimationBean.delay);
        return ofPropertyValuesHolder;
    }

    private Animator.AnimatorListener createAnimatorListener(final WXSDKInstance wXSDKInstance, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator.AnimatorListener) ipChange.ipc$dispatch("e9bb707e", new Object[]{this, wXSDKInstance, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        return new AnimatorListenerAdapter() { // from class: com.taobao.weex.ui.action.GraphicActionAnimation.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                WXSDKInstance wXSDKInstance2 = wXSDKInstance;
                if (wXSDKInstance2 == null || wXSDKInstance2.P_()) {
                    WXLogUtils.e("RenderContextImpl-onAnimationEnd WXSDKInstance == null NPE or instance is destroyed");
                } else {
                    WXSDKManager.getInstance().callback(wXSDKInstance.N(), str, new HashMap());
                }
            }
        };
    }

    private Interpolator createTimeInterpolator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("c1ad726c", new Object[]{this});
        }
        String str = this.mAnimationBean.timingFunction;
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1965120668:
                if (str.equals("ease-in")) {
                    c = 0;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c = 3;
                    break;
                }
                break;
            case -789192465:
                if (str.equals("ease-out")) {
                    c = 1;
                    break;
                }
                break;
            case -361990811:
                if (str.equals("ease-in-out")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            return new AccelerateInterpolator();
        }
        if (c == 1) {
            return new DecelerateInterpolator();
        }
        if (c == 2) {
            return new AccelerateDecelerateInterpolator();
        }
        if (c == 3) {
            return new LinearInterpolator();
        }
        try {
            List parse = new SingleFunctionParser(this.mAnimationBean.timingFunction, new SingleFunctionParser.FlatMapper<Float>() { // from class: com.taobao.weex.ui.action.GraphicActionAnimation.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.taobao.weex.utils.SingleFunctionParser.FlatMapper
                /* renamed from: map */
                public Float mo1597map(String str2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Float) ipChange2.ipc$dispatch("6e6ed36", new Object[]{this, str2}) : Float.valueOf(Float.parseFloat(str2));
                }
            }).parse("cubic-bezier");
            if (parse != null && parse.size() == 4) {
                return PathInterpolatorCompat.create(((Float) parse.get(0)).floatValue(), ((Float) parse.get(1)).floatValue(), ((Float) parse.get(2)).floatValue(), ((Float) parse.get(3)).floatValue());
            }
        } catch (RuntimeException unused) {
        }
        return null;
    }

    @Override // com.taobao.weex.remote.a
    public void setImpl(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21214042", new Object[]{this, dVar});
        } else {
            templateDomImpl = dVar;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.weex.remote.a
    /* renamed from: getImpl */
    public d mo1589getImpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("a3c4c272", new Object[]{this}) : templateDomImpl;
    }
}
