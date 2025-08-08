package com.taobao.android.layoutmanager.container;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.BaseContainerFragment;
import com.taobao.tao.flexbox.layoutmanager.container.m;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import java.io.Serializable;
import tb.kge;
import tb.ohd;

/* loaded from: classes5.dex */
public class PoplayerContainerLifecycle extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AnimationParams e;

    /* loaded from: classes5.dex */
    public static class AnimationCollection implements Serializable {
        public String pop = "bottom";
        public float scale = -1.0f;
        public float opacity = -1.0f;

        static {
            kge.a(-1640502028);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-514046602);
    }

    public static /* synthetic */ Object ipc$super(PoplayerContainerLifecycle poplayerContainerLifecycle, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -110946631) {
            super.a((Activity) objArr[0], (BaseContainerFragment.a) objArr[1]);
            return null;
        } else if (hashCode == 109716922) {
            super.a((Activity) objArr[0]);
            return null;
        } else if (hashCode != 1763520592) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((aa) objArr[0]);
            return null;
        }
    }

    public static /* synthetic */ AnimationParams a(PoplayerContainerLifecycle poplayerContainerLifecycle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnimationParams) ipChange.ipc$dispatch("bb278a78", new Object[]{poplayerContainerLifecycle}) : poplayerContainerLifecycle.e;
    }

    public static /* synthetic */ void a(PoplayerContainerLifecycle poplayerContainerLifecycle, Activity activity, BaseContainerFragment.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e1e00f4", new Object[]{poplayerContainerLifecycle, activity, aVar});
        } else {
            super.a(activity, aVar);
        }
    }

    public PoplayerContainerLifecycle(Context context, BaseContainerFragment baseContainerFragment, m.b bVar) {
        super(context, baseContainerFragment, bVar);
        this.e = new AnimationParams();
    }

    @Override // com.taobao.android.layoutmanager.container.b
    public void a(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        super.a(activity);
        if (activity != null) {
            activity.overridePendingTransition(17432576, 0);
        }
        String queryParameter = this.b.b.getQueryParameter("extraData");
        if (!StringUtils.isEmpty(queryParameter)) {
            this.e = (AnimationParams) JSON.parseObject(queryParameter, AnimationParams.class);
        } else {
            this.e.defaultValue();
        }
        this.e.transform();
        this.c.getContentView().setBackgroundColor(0);
        this.c.getContentView().setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.layoutmanager.container.PoplayerContainerLifecycle.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (!PoplayerContainerLifecycle.a(PoplayerContainerLifecycle.this).backgroundClicked) {
                } else {
                    activity.finish();
                }
            }
        });
    }

    @Override // com.taobao.android.layoutmanager.container.b
    public void a(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691d3050", new Object[]{this, aaVar});
            return;
        }
        super.a(aaVar);
        this.c.getTNodeContainer().setLayoutParams(a(this.e));
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new LinearInterpolator());
        animationSet.setDuration(300L);
        Animation e = e(this.e);
        if (e != null) {
            animationSet.addAnimation(e);
        }
        Animation g = g(this.e);
        if (g != null) {
            animationSet.addAnimation(g);
        }
        Animation c = c(this.e);
        if (c != null) {
            animationSet.addAnimation(c);
        }
        this.c.getTNodeContainer().clearAnimation();
        this.c.getTNodeContainer().setAnimation(animationSet);
        animationSet.start();
    }

    @Override // com.taobao.android.layoutmanager.container.b
    public void a(final Activity activity, final BaseContainerFragment.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96316b9", new Object[]{this, activity, aVar});
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new LinearInterpolator());
        animationSet.setDuration(300L);
        animationSet.setFillAfter(true);
        Animation f = f(this.e);
        if (f != null) {
            animationSet.addAnimation(f);
        }
        Animation h = h(this.e);
        if (h != null) {
            animationSet.addAnimation(h);
        }
        Animation d = d(this.e);
        if (d != null) {
            animationSet.addAnimation(d);
        }
        this.c.getTNodeContainer().clearAnimation();
        this.c.getTNodeContainer().setAnimation(animationSet);
        animationSet.start();
        animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.layoutmanager.container.PoplayerContainerLifecycle.2
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
                    return;
                }
                PoplayerContainerLifecycle.a(PoplayerContainerLifecycle.this, activity, aVar);
                activity.overridePendingTransition(0, 17432577);
            }
        });
    }

    private FrameLayout.LayoutParams a(AnimationParams animationParams) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("ea567386", new Object[]{this, animationParams});
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (b(animationParams)) {
            layoutParams.gravity = 17;
            layoutParams.width = animationParams.width;
            layoutParams.height = animationParams.height;
        } else {
            ActionBar supportActionBar = ((AppCompatActivity) this.c.getActivity()).getSupportActionBar();
            int h = animationParams.top - ohd.h(this.f13180a);
            if (supportActionBar.f()) {
                h -= supportActionBar.c();
            }
            if (h >= 0) {
                i = h;
            }
            if (AnimationParams.isValid(animationParams.left)) {
                layoutParams.leftMargin = animationParams.left;
                a(layoutParams, 3);
            }
            if (AnimationParams.isValid(animationParams.top)) {
                layoutParams.topMargin = i;
                a(layoutParams, 48);
            }
            if (AnimationParams.isValid(animationParams.right)) {
                layoutParams.rightMargin = animationParams.right;
                a(layoutParams, 5);
            }
            if (AnimationParams.isValid(animationParams.bottom)) {
                layoutParams.bottomMargin = animationParams.bottom;
                a(layoutParams, 80);
            }
            if (AnimationParams.isValid(animationParams.width)) {
                layoutParams.width = animationParams.width;
            }
            if (AnimationParams.isValid(animationParams.height)) {
                layoutParams.height = animationParams.height;
            }
        }
        return layoutParams;
    }

    private void a(FrameLayout.LayoutParams layoutParams, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b5eb2", new Object[]{this, layoutParams, new Integer(i)});
        } else if (layoutParams.gravity == -1) {
            layoutParams.gravity = i;
        } else {
            layoutParams.gravity = i | layoutParams.gravity;
        }
    }

    private boolean b(AnimationParams animationParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a90e00a0", new Object[]{this, animationParams})).booleanValue() : AnimationParams.isValid(animationParams.width) && AnimationParams.isValid(animationParams.height) && !AnimationParams.isValid(animationParams.left) && !AnimationParams.isValid(animationParams.top) && !AnimationParams.isValid(animationParams.right) && !AnimationParams.isValid(animationParams.bottom);
    }

    private Animation c(AnimationParams animationParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("7dbbdc7b", new Object[]{this, animationParams});
        }
        if (animationParams.animation == null) {
            return null;
        }
        String str = animationParams.animation.pop;
        if ("bottom".equalsIgnoreCase(str)) {
            return new TranslateAnimation(0.0f, 0.0f, ohd.a(), animationParams.top);
        }
        if ("left".equalsIgnoreCase(str)) {
            return new TranslateAnimation(-animationParams.getWidth(), animationParams.left, 0.0f, 0.0f);
        }
        if ("right".equalsIgnoreCase(str)) {
            return new TranslateAnimation(ohd.b(ab.a()), animationParams.right, 0.0f, 0.0f);
        }
        if (!"top".equalsIgnoreCase(str)) {
            return null;
        }
        return new TranslateAnimation(0.0f, 0.0f, -animationParams.getHeight(), animationParams.top);
    }

    private Animation d(AnimationParams animationParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("e8acf4fc", new Object[]{this, animationParams});
        }
        if (animationParams.animation == null) {
            return null;
        }
        String str = animationParams.animation.pop;
        if ("bottom".equalsIgnoreCase(str)) {
            return new TranslateAnimation(0.0f, 0.0f, animationParams.top, ohd.a());
        }
        if ("left".equalsIgnoreCase(str)) {
            return new TranslateAnimation(animationParams.left, -animationParams.getWidth(), 0.0f, 0.0f);
        }
        if ("right".equalsIgnoreCase(str)) {
            return new TranslateAnimation(animationParams.right, ohd.b(ab.a()), 0.0f, 0.0f);
        }
        if (!"top".equalsIgnoreCase(str)) {
            return null;
        }
        return new TranslateAnimation(0.0f, 0.0f, animationParams.top, -animationParams.getHeight());
    }

    private Animation e(AnimationParams animationParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("539e0d7d", new Object[]{this, animationParams});
        }
        if (animationParams.animation == null) {
            return null;
        }
        float f = animationParams.animation.scale;
        if (f == -1.0f) {
            return null;
        }
        return new ScaleAnimation(f, 1.0f, f, 1.0f, 1, 0.5f, 1, 0.5f);
    }

    private Animation f(AnimationParams animationParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("be8f25fe", new Object[]{this, animationParams});
        }
        if (animationParams.animation == null) {
            return null;
        }
        float f = animationParams.animation.scale;
        if (f == -1.0f) {
            return null;
        }
        return new ScaleAnimation(1.0f, f, 1.0f, f, 1, 0.5f, 1, 0.5f);
    }

    private Animation g(AnimationParams animationParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("29803e7f", new Object[]{this, animationParams});
        }
        if (animationParams.animation == null) {
            return null;
        }
        float f = animationParams.animation.opacity;
        if (f == -1.0f) {
            return null;
        }
        return new AlphaAnimation(f, 1.0f);
    }

    private Animation h(AnimationParams animationParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("94715700", new Object[]{this, animationParams});
        }
        if (animationParams.animation == null) {
            return null;
        }
        float f = animationParams.animation.opacity;
        if (f == -1.0f) {
            return null;
        }
        return new AlphaAnimation(1.0f, f);
    }

    /* loaded from: classes5.dex */
    public static class AnimationParams implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int INVALID_VALUE = -1;
        public AnimationCollection animation = new AnimationCollection();
        public int top = -1;
        public int left = -1;
        public int right = -1;
        public int bottom = -1;
        public int width = -1;
        public int height = -1;
        public boolean backgroundClicked = true;

        static {
            kge.a(-1861889316);
            kge.a(1028243835);
        }

        public static boolean isValid(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7be089ae", new Object[]{new Integer(i)})).booleanValue() : i != -1;
        }

        public void transform() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("999859f3", new Object[]{this});
                return;
            }
            this.top = transferToDevicePixel(this.top);
            this.left = transferToDevicePixel(this.left);
            this.right = transferToDevicePixel(this.right);
            this.bottom = transferToDevicePixel(this.bottom);
            this.width = transferToDevicePixel(this.width);
            this.height = transferToDevicePixel(this.height);
        }

        private int transferToDevicePixel(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6faa4365", new Object[]{this, new Integer(i)})).intValue() : i != -1 ? ohd.a(ab.a(), i) : i;
        }

        public void defaultValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e3eb837", new Object[]{this});
                return;
            }
            this.top = 0;
            this.animation.pop = "bottom";
        }

        public int getWidth() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
            }
            int i = this.width;
            return i != -1 ? i : (ohd.b(ab.a()) - this.left) - this.right;
        }

        public int getHeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
            }
            int i = this.height;
            return i != -1 ? i : (ohd.a() - this.top) - this.bottom;
        }
    }
}
