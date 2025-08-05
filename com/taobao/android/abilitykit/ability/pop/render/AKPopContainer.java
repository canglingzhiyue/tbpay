package com.taobao.android.abilitykit.ability.pop.render;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityGroup;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.analysis.v3.r;
import com.taobao.android.abilitykit.ability.pop.model.c;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.abilitykit.ability.pop.render.c;
import com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler;
import com.taobao.android.abilitykit.ability.pop.render.util.GestureRoundCornerFrameLayout;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.h;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import tb.dkv;
import tb.dle;
import tb.dlh;
import tb.dly;
import tb.dlz;
import tb.dma;
import tb.dmm;
import tb.dmn;
import tb.dmr;
import tb.dms;
import tb.gnv;
import tb.hid;
import tb.kge;
import tb.shc;
import tb.tgx;

/* loaded from: classes4.dex */
public class AKPopContainer<PARAMS extends com.taobao.android.abilitykit.ability.pop.model.c, CONTEXT extends dle> extends FrameLayout implements c<PARAMS, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONTAINER_TAG = "std_pop_ak_container";
    private static final String SIZE_ANIM_KEY_H = "h";
    private static final String SIZE_ANIM_KEY_W = "w";
    private static final int TITLE_LAYOUT_HEIGHT = 40;
    public final int DEFAULT_BACKGROUND_COLOR;
    private String currentState;
    private shc falcoSpan;
    public boolean hasAnimatedIn;
    private boolean isActivityGroup;
    public ValueAnimator mBackgroundAnimator;
    public View mContentView;
    public GestureRoundCornerFrameLayout mContentWrapper;
    private GestureHandler mGestureUtil;
    private LayoutInflater mInflater;
    private boolean mIsAxisX;
    private boolean mIsDismissing;
    private boolean mIsGravityCenter;
    private boolean mIsNegative;
    public View mLoadingView;
    public com.taobao.android.abilitykit.ability.pop.model.c mParams;
    private dlz mPopAnimation;
    public com.taobao.android.abilitykit.ability.pop.model.b mPopConfig;
    public IAKPopRender mPopRender;
    public c.a mStateCallback;
    private ViewGroup mTitleBar;
    public int mWindowHeight;
    public int mWindowWidth;
    private OnScreenChangedListener screenListener;
    private Boolean shouldNotifySizeChanged;

    static {
        kge.a(-1870062432);
        kge.a(275765661);
    }

    public static /* synthetic */ Object ipc$super(AKPopContainer aKPopContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        }
    }

    public static /* synthetic */ void access$000(AKPopContainer aKPopContainer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad7fadd4", new Object[]{aKPopContainer, str});
        } else {
            aKPopContainer.notifyBlockCloseType(str);
        }
    }

    public static /* synthetic */ dlz access$100(AKPopContainer aKPopContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dlz) ipChange.ipc$dispatch("481ff04b", new Object[]{aKPopContainer}) : aKPopContainer.mPopAnimation;
    }

    public static /* synthetic */ shc access$200(AKPopContainer aKPopContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (shc) ipChange.ipc$dispatch("4f4f9250", new Object[]{aKPopContainer}) : aKPopContainer.falcoSpan;
    }

    public static /* synthetic */ shc access$202(AKPopContainer aKPopContainer, shc shcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (shc) ipChange.ipc$dispatch("50de6810", new Object[]{aKPopContainer, shcVar});
        }
        aKPopContainer.falcoSpan = shcVar;
        return shcVar;
    }

    public static /* synthetic */ void access$300(AKPopContainer aKPopContainer, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68d4504b", new Object[]{aKPopContainer, view});
        } else {
            aKPopContainer.setupContentView(view);
        }
    }

    public static /* synthetic */ void access$400(AKPopContainer aKPopContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633d2606", new Object[]{aKPopContainer});
        } else {
            aKPopContainer.setupTitle();
        }
    }

    public static /* synthetic */ void access$500(AKPopContainer aKPopContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e587dae5", new Object[]{aKPopContainer});
        } else {
            aKPopContainer.requestDismiss();
        }
    }

    public static /* synthetic */ void access$600(AKPopContainer aKPopContainer, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d023422", new Object[]{aKPopContainer, str, jSONObject});
        } else {
            aKPopContainer.callbackLifeCycle(str, jSONObject);
        }
    }

    public static /* synthetic */ JSONObject access$700(AKPopContainer aKPopContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("9ca8a3c3", new Object[]{aKPopContainer}) : aKPopContainer.getPopCurrentPosition();
    }

    public static /* synthetic */ JSONObject access$800(AKPopContainer aKPopContainer, dly dlyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("a8863281", new Object[]{aKPopContainer, dlyVar}) : aKPopContainer.getAnimStartParams(dlyVar);
    }

    public AKPopContainer(Context context) {
        super(context);
        this.DEFAULT_BACKGROUND_COLOR = Integer.MIN_VALUE;
        this.mIsAxisX = false;
        this.mIsNegative = false;
        this.mIsGravityCenter = false;
        this.mIsDismissing = false;
        this.hasAnimatedIn = false;
        this.mTitleBar = null;
        this.mInflater = null;
        this.currentState = "HALF_SCREEN";
        setTag(CONTAINER_TAG);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.c
    public void onLevelChanged(boolean z, boolean z2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd84f5ad", new Object[]{this, new Boolean(z), new Boolean(z2), new Integer(i)});
        } else if (!dms.b(getContext()) || !z2) {
        } else {
            setupBackgroundColor(z, !z);
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.c
    public boolean isBgTransparent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8b7cdce", new Object[]{this})).booleanValue();
        }
        com.taobao.android.abilitykit.ability.pop.model.b bVar = this.mPopConfig;
        return bVar == null || getBackgroundColor(bVar.h(), this.mPopConfig.i()) == 0;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.c
    public boolean shouldIgnoreNotifyLevelChange() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63460bf1", new Object[]{this})).booleanValue() : !dms.b(getContext()) || !this.mParams.d();
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.c
    public ViewGroup onCreateView(final CONTEXT context, final PARAMS params, View view, c.a aVar, final IAKPopRender<PARAMS, CONTEXT> iAKPopRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("d3523058", new Object[]{this, context, params, view, aVar, iAKPopRender});
        }
        this.mParams = params;
        this.mPopConfig = params.f8913a;
        this.mPopRender = iAKPopRender;
        this.mStateCallback = aVar;
        this.isActivityGroup = getContext() instanceof ActivityGroup;
        initSpan();
        setupWrapperByGravity();
        initGestureUtil();
        setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.abilitykit.ability.pop.render.AKPopContainer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else if (!AKPopContainer.this.mPopConfig.a()) {
                } else {
                    if (AKPopContainer.this.mPopConfig.k()) {
                        AKPopContainer.access$000(AKPopContainer.this, IAKPopRender.CloseType.CLICK_OUT);
                    } else if (dmr.b()) {
                        AKPopContainer.this.doDismissAnimation();
                    } else if (AKPopContainer.access$100(AKPopContainer.this) == null) {
                        AKPopContainer.this.doDismissAnimation();
                    } else if (AKPopContainer.access$100(AKPopContainer.this).a()) {
                    } else {
                        AKPopContainer.this.doDismissAnimation();
                    }
                }
            }
        });
        setupBackgroundColor(true, this.mPopConfig.G());
        this.mPopRender.a(context, params, view, new d() { // from class: com.taobao.android.abilitykit.ability.pop.render.AKPopContainer.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.abilitykit.ability.pop.render.d
            public void a(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view2});
                    return;
                }
                if (AKPopContainer.access$200(AKPopContainer.this) != null) {
                    AKPopContainer.access$200(AKPopContainer.this).d(Long.valueOf(System.currentTimeMillis()));
                }
                AKPopContainer.this.mContentWrapper.setBackgroundColor(AKPopContainer.this.mPopConfig.m());
                AKPopContainer.access$300(AKPopContainer.this, view2);
                AKPopContainer.access$400(AKPopContainer.this);
                String str = "onStdPopRenderSuccess: " + SystemClock.uptimeMillis();
                com.alibaba.ability.utils.c.INSTANCE.a("stdPopTag", "onStdPopRenderSuccess: " + view2.getClass().getName());
            }

            @Override // com.taobao.android.abilitykit.ability.pop.render.d
            public void a(dkv dkvVar, View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b445a89", new Object[]{this, dkvVar, view2});
                    return;
                }
                if (view2 != null) {
                    AKPopContainer.this.mPopConfig.a(false);
                    AKPopContainer.access$300(AKPopContainer.this, view2);
                } else {
                    AKPopContainer.access$500(AKPopContainer.this);
                }
                com.alibaba.ability.utils.c cVar = com.alibaba.ability.utils.c.INSTANCE;
                cVar.a("stdPopTag", "onStdPopRenderFailed error msg = " + dkvVar.b() + " errorCode = " + dkvVar.a());
                dmn.a(context, new dlh(iAKPopRender.getClass().getSimpleName(), params.c()), dkvVar);
            }
        });
        if (this.mContentView == null && this.mPopConfig.l()) {
            this.mLoadingView = getInflater().inflate(R.layout.ability_kit_loading, (ViewGroup) null);
            this.mContentWrapper.addView(this.mLoadingView);
        }
        if (this.mPopConfig.C() && !this.mParams.d()) {
            this.screenListener = new OnScreenChangedListener() { // from class: com.taobao.android.abilitykit.ability.pop.render.AKPopContainer.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.autosize.OnScreenChangedListener
                public void onActivityChanged(Activity activity, int i, Configuration configuration) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("994f466c", new Object[]{this, activity, new Integer(i), configuration});
                    }
                }

                @Override // com.taobao.android.autosize.OnScreenChangedListener
                public void onScreenChanged(int i, Configuration configuration) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                        return;
                    }
                    com.taobao.android.abilitykit.ability.pop.model.c cVar = AKPopContainer.this.mParams;
                    if (i != 1) {
                        z = false;
                    }
                    cVar.a(z, AKPopContainer.this.getContext());
                    AKPopContainer.this.changeGravity(null);
                    if (AKPopContainer.this.mParams.f8913a.j()) {
                        AKPopContainer.this.changeSize(-2.0f, -2.0f, false);
                    } else {
                        AKPopContainer.this.changeSize(-1.0f, -1.0f, false);
                    }
                }
            };
            h.a().c(this.screenListener);
        }
        return this;
    }

    private final LayoutInflater getInflater() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LayoutInflater) ipChange.ipc$dispatch("7c055a1a", new Object[]{this});
        }
        if (this.mInflater == null) {
            Context context = getContext();
            if (context instanceof Activity) {
                this.mInflater = ((Activity) context).getLayoutInflater();
            } else {
                this.mInflater = LayoutInflater.from(context);
            }
        }
        return this.mInflater;
    }

    private final void setupWrapperByGravity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa28af48", new Object[]{this});
            return;
        }
        this.mContentWrapper = new GestureRoundCornerFrameLayout(getContext());
        com.taobao.android.abilitykit.ability.pop.model.c cVar = this.mParams;
        if (cVar != null && cVar.f8913a.C()) {
            this.mParams.a(h.a().b(getContext()), getContext());
            this.mPopConfig = this.mParams.f8913a;
        }
        changeGravity(null);
    }

    private void initSpan() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a88001", new Object[]{this});
            return;
        }
        final r rVar = FalcoGlobalTracer.get();
        if (rVar == null) {
            return;
        }
        try {
            rVar.a(new tgx.a() { // from class: com.taobao.android.abilitykit.ability.pop.render.AKPopContainer.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.tgx.a
                public void a(tgx tgxVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6a1853", new Object[]{this, tgxVar});
                    } else if (tgxVar == null) {
                    } else {
                        try {
                            AKPopContainer.access$202(AKPopContainer.this, rVar.a(shc.MODULE, shc.SCENE_TAP).a(tgxVar.dY_()).av_());
                            if (AKPopContainer.access$200(AKPopContainer.this) == null) {
                                return;
                            }
                            AKPopContainer.access$200(AKPopContainer.this).l("StdPopPage");
                            shc access$200 = AKPopContainer.access$200(AKPopContainer.this);
                            access$200.j_("StdPop-" + AKPopContainer.this.mParams.d);
                            AKPopContainer.access$200(AKPopContainer.this).m(AKPopContainer.this.mParams.c);
                        } catch (Throwable th) {
                            com.alibaba.ability.utils.c cVar = com.alibaba.ability.utils.c.INSTANCE;
                            cVar.a("stdPopTag", "[span]parse url error: " + dmm.a(th));
                        }
                    }
                }
            });
        } catch (Throwable th) {
            com.alibaba.ability.utils.c cVar = com.alibaba.ability.utils.c.INSTANCE;
            cVar.a("stdPopTag", "getTouchActionSpanAsync error: " + dmm.a(th));
        }
    }

    private final void setupTitle() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f18c1ce2", new Object[]{this});
        } else if (!this.mPopConfig.v() && TextUtils.isEmpty(this.mPopConfig.N())) {
        } else {
            if (this.mContentView.getLayoutParams() == null) {
                marginLayoutParams = new FrameLayout.LayoutParams(-1, -1);
            } else {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mContentView.getLayoutParams();
            }
            marginLayoutParams.topMargin = gnv.a(getContext().getApplicationContext(), 40.0f);
            this.mContentView.setLayoutParams(marginLayoutParams);
            if (this.mTitleBar == null) {
                this.mTitleBar = (ViewGroup) getInflater().inflate(R.layout.ability_kit_title_bar, (ViewGroup) null);
                this.mTitleBar.findViewById(R.id.title_bar_close).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.abilitykit.ability.pop.render.AKPopContainer.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (AKPopContainer.this.mPopConfig.k()) {
                            AKPopContainer.access$000(AKPopContainer.this, IAKPopRender.CloseType.NATIVE_CLOSE);
                        } else {
                            AKPopContainer.this.doDismissAnimation();
                        }
                    }
                });
                if (!TextUtils.isEmpty(this.mPopConfig.N())) {
                    TextView textView = (TextView) this.mTitleBar.findViewById(R.id.title_bar_pop_title);
                    textView.setVisibility(0);
                    textView.setText(this.mPopConfig.N());
                    this.mTitleBar.setBackgroundColor(-1);
                }
            }
            if (this.mTitleBar.getParent() != null) {
                return;
            }
            this.mContentWrapper.addView(this.mTitleBar, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void setupContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d198e3ca", new Object[]{this, view});
            return;
        }
        this.mContentView = view;
        this.mContentWrapper.removeAllViews();
        this.mContentWrapper.addView(this.mContentView);
        this.mContentView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.abilitykit.ability.pop.render.AKPopContainer.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                }
            }
        });
        adjustWrapperHeight(true);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.c
    public void changeSize(float f, float f2, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d485c7fc", new Object[]{this, new Float(f), new Float(f2), new Boolean(z)});
            return;
        }
        com.taobao.android.abilitykit.ability.pop.model.c cVar = this.mParams;
        if (cVar != null) {
            this.mPopConfig = cVar.f8913a;
        }
        com.taobao.android.abilitykit.ability.pop.model.b bVar = this.mPopConfig;
        if (bVar == null || this.mContentWrapper == null || this.mPopRender == null) {
            return;
        }
        boolean j = bVar.j();
        int i2 = 10000;
        if (f2 == -2.0f || f == -2.0f) {
            this.mPopConfig.a(true);
            i = 10000;
            j = true;
        } else {
            i = (f2 <= 0.0f || f2 > 1.0f) ? this.mPopConfig.e() : (int) (f2 * 10000.0f);
            i2 = (f <= 0.0f || f > 1.0f) ? this.mPopConfig.g() : (int) (f * 10000.0f);
            this.mPopConfig.a(false);
        }
        if (z && !j) {
            callbackLifeCycle(IAKPopRender.LifecycleType.CHANGE_SIZE_START, null);
            ValueAnimator valueAnimator = new ValueAnimator();
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
            int[] iArr = new int[2];
            iArr[0] = this.mContentWrapper.getTranslationY() != 0.0f ? this.mPopConfig.d() : this.mPopConfig.e();
            iArr[1] = i;
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofInt("h", iArr);
            int[] iArr2 = new int[2];
            iArr2[0] = this.mContentWrapper.getTranslationX() != 0.0f ? this.mPopConfig.f() : this.mPopConfig.g();
            iArr2[1] = i2;
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofInt("w", iArr2);
            valueAnimator.setValues(propertyValuesHolderArr);
            valueAnimator.setDuration(250L);
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.abilitykit.ability.pop.render.AKPopContainer.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                        return;
                    }
                    int intValue = ((Integer) valueAnimator2.getAnimatedValue("h")).intValue();
                    int intValue2 = ((Integer) valueAnimator2.getAnimatedValue("w")).intValue();
                    AKPopContainer.this.mPopConfig.a(intValue);
                    AKPopContainer.this.mPopConfig.b(intValue);
                    AKPopContainer.this.mPopConfig.c(intValue2);
                    AKPopContainer.this.mPopConfig.d(intValue2);
                    AKPopContainer.this.adjustWrapperHeight(true);
                }
            });
            valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.abilitykit.ability.pop.render.AKPopContainer.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    AKPopContainer.this.adjustWrapperHeight(true);
                    AKPopContainer.access$600(AKPopContainer.this, IAKPopRender.LifecycleType.CHANGE_SIZE_END, null);
                }
            });
            valueAnimator.start();
            return;
        }
        callbackLifeCycle(IAKPopRender.LifecycleType.CHANGE_SIZE_START, null);
        this.mPopConfig.a(i);
        this.mPopConfig.b(i);
        adjustWrapperHeight(true);
        callbackLifeCycle(IAKPopRender.LifecycleType.CHANGE_SIZE_END, null);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.c
    public void enableCorner(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c007c75", new Object[]{this, new Boolean(z)});
        } else if (this.mContentWrapper == null) {
        } else {
            com.taobao.android.abilitykit.ability.pop.model.b bVar = this.mPopConfig;
            String s = bVar != null ? bVar.s() : null;
            if (!z) {
                this.mContentWrapper.setRadius(-1.0f);
                return;
            }
            int a2 = gnv.a(getContext().getApplicationContext(), this.mPopConfig.o());
            if ("center".equals(s)) {
                this.mContentWrapper.setRadius(a2);
            } else if ("left".equals(s)) {
                float f = a2;
                this.mContentWrapper.setRadius(0.0f, f, 0.0f, f);
            } else if ("right".equals(s)) {
                float f2 = a2;
                this.mContentWrapper.setRadius(f2, 0.0f, f2, 0.0f);
            } else if ("top".equals(s)) {
                float f3 = a2;
                this.mContentWrapper.setRadius(0.0f, 0.0f, f3, f3);
            } else if ("right|bottom".equals(s)) {
                float f4 = a2;
                this.mContentWrapper.setRadius(f4, 0.0f, f4, 0.0f);
            } else {
                float f5 = a2;
                this.mContentWrapper.setRadius(f5, f5, 0.0f, 0.0f);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
        if (r4 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
        r4 = com.taobao.android.abilitykit.ability.pop.model.d.KEY_RIGHT_IN_OUT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e1, code lost:
        if (r4 == null) goto L41;
     */
    @Override // com.taobao.android.abilitykit.ability.pop.render.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void changeGravity(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.abilitykit.ability.pop.render.AKPopContainer.changeGravity(java.lang.String):void");
    }

    private void initGestureUtil() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a909cc2", new Object[]{this});
        } else if (this.mGestureUtil != null || this.mIsGravityCenter || !this.mPopConfig.b()) {
        } else {
            this.mGestureUtil = new GestureHandler(new GestureHandler.a() { // from class: com.taobao.android.abilitykit.ability.pop.render.AKPopContainer.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler.a
                public void a(View view, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
                    } else if (i == 3) {
                        AKPopContainer.access$500(AKPopContainer.this);
                    } else if (i != 1) {
                    } else {
                        AKPopContainer.access$600(AKPopContainer.this, IAKPopRender.LifecycleType.OFFSET_DISABLE, null);
                    }
                }

                @Override // com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    AKPopContainer aKPopContainer = AKPopContainer.this;
                    AKPopContainer.access$600(aKPopContainer, IAKPopRender.LifecycleType.PAN_ANIMATION_RECOVER_END, AKPopContainer.access$700(aKPopContainer));
                }

                @Override // com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler.a
                public void a(dly dlyVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e5637847", new Object[]{this, dlyVar});
                        return;
                    }
                    AKPopContainer aKPopContainer = AKPopContainer.this;
                    AKPopContainer.access$600(aKPopContainer, IAKPopRender.LifecycleType.PAN_ANIMATION_RECOVER_START, AKPopContainer.access$800(aKPopContainer, dlyVar));
                }

                @Override // com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler.a
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else {
                        AKPopContainer.access$000(AKPopContainer.this, IAKPopRender.CloseType.PAN_CLOSE);
                    }
                }

                @Override // com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler.a
                public boolean a(boolean z, float f, int i, View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("b12ab8c7", new Object[]{this, new Boolean(z), new Float(f), new Integer(i), view})).booleanValue();
                    }
                    if (z && com.taobao.android.abilitykit.ability.pop.model.c.DEFAULT_LANDSCAPE_DRAWER.equals(AKPopContainer.this.mParams.f8913a.A()) && f * 10.0f > view.getWidth()) {
                        return true;
                    }
                    if (AKPopContainer.this.mContentView != null && !z) {
                        if (AKPopContainer.access$100(AKPopContainer.this) != null && AKPopContainer.access$100(AKPopContainer.this).a()) {
                            return true;
                        }
                        if (AKPopContainer.this.mPopRender != null && AKPopContainer.this.mPopRender.a(AKPopContainer.this.mContentView, i)) {
                            return true;
                        }
                    }
                    return false;
                }

                @Override // com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler.a
                public void a(float f, float f2, int i, int i2, boolean z, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("885679d6", new Object[]{this, new Float(f), new Float(f2), new Integer(i), new Integer(i2), new Boolean(z), str});
                    } else if (AKPopContainer.this.mContentWrapper == null) {
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", (Object) Integer.valueOf(gnv.b(AKPopContainer.this.getContext(), f)));
                        jSONObject.put("y", (Object) Integer.valueOf(gnv.b(AKPopContainer.this.getContext(), f2)));
                        jSONObject.put("w", (Object) Integer.valueOf(gnv.b(AKPopContainer.this.getContext(), i2)));
                        jSONObject.put("h", (Object) Integer.valueOf(gnv.b(AKPopContainer.this.getContext(), i)));
                        jSONObject.put("animated", (Object) Boolean.valueOf(z));
                        if ("onPositionChanged".equals(str) || "onPositionChanged".equals(str)) {
                            AKPopContainer.access$600(AKPopContainer.this, IAKPopRender.LifecycleType.CHANGE_POSITION, jSONObject);
                        } else if (com.taobao.android.abilitykit.ability.pop.render.util.a.ON_ANIMATION.equals(str)) {
                            AKPopContainer.access$600(AKPopContainer.this, IAKPopRender.LifecycleType.ANIMATION_POSITION_CHANGE, jSONObject);
                        } else {
                            AKPopContainer.access$600(AKPopContainer.this, str, jSONObject);
                        }
                    }
                }
            }, new com.taobao.android.abilitykit.ability.pop.render.util.a(), this.mPopConfig.k(), this.mIsAxisX, this.mIsNegative);
            this.mContentWrapper.setGestureHandler(this.mGestureUtil);
        }
    }

    private void notifyBlockCloseType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc8f2ff", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject(1);
        jSONObject.put("type", (Object) str);
        callbackLifeCycle(IAKPopRender.LifecycleType.BLOCK_CLOSE, jSONObject);
    }

    private void callbackLifeCycle(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4369705a", new Object[]{this, str, jSONObject});
        } else if (this.mPopRender == null || this.mParams == null) {
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("popId", (Object) this.mParams.b);
            if (jSONObject != null) {
                jSONObject2.put("data", (Object) jSONObject);
            }
            this.mPopRender.a(str, jSONObject2);
        }
    }

    private int getBackgroundColor(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6db3bfad", new Object[]{this, str, str2})).intValue();
        }
        if ("color".equals(str) && !TextUtils.isEmpty(str2)) {
            try {
                return Color.parseColor(str2);
            } catch (IllegalArgumentException unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    private void setupBackgroundColor(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("954511df", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        com.taobao.android.abilitykit.ability.pop.model.b bVar = this.mPopConfig;
        if (bVar == null) {
            return;
        }
        int backgroundColor = getBackgroundColor(bVar.h(), this.mPopConfig.i());
        ValueAnimator valueAnimator = this.mBackgroundAnimator;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.mBackgroundAnimator.cancel();
        }
        this.mBackgroundAnimator = null;
        final int red = Color.red(backgroundColor);
        final int green = Color.green(backgroundColor);
        final int blue = Color.blue(backgroundColor);
        if (!z2) {
            if (z) {
                setBackgroundColor(backgroundColor);
                return;
            } else {
                setBackgroundColor(Color.argb(0, red, green, blue));
                return;
            }
        }
        if (z) {
            this.mBackgroundAnimator = ValueAnimator.ofInt(0, Color.alpha(backgroundColor));
        } else {
            this.mBackgroundAnimator = ValueAnimator.ofInt(Color.alpha(backgroundColor), 0);
        }
        this.mBackgroundAnimator.setDuration(150L);
        this.mBackgroundAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.abilitykit.ability.pop.render.AKPopContainer.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    return;
                }
                Object animatedValue = valueAnimator2.getAnimatedValue();
                if (!(animatedValue instanceof Integer) || (AKPopContainer.this.getBackground() instanceof BitmapDrawable)) {
                    return;
                }
                AKPopContainer.this.setBackgroundColor(Color.argb(((Integer) animatedValue).intValue(), red, green, blue));
            }
        });
        this.mBackgroundAnimator.start();
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.c
    public void doDismissAnimation() {
        com.taobao.android.abilitykit.ability.pop.model.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bef38cc", new Object[]{this});
        } else if (this.mIsDismissing) {
        } else {
            this.mIsDismissing = true;
            if (this.mPopConfig != null) {
                setupBackgroundColor(false, true);
            }
            if (this.mContentView == null || (bVar = this.mPopConfig) == null) {
                requestDismiss();
            } else {
                doAnimation(false, this.mContentWrapper, bVar, new dma() { // from class: com.taobao.android.abilitykit.ability.pop.render.AKPopContainer.11
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.dma
                    public void a(dly dlyVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e5637847", new Object[]{this, dlyVar});
                            return;
                        }
                        AKPopContainer aKPopContainer = AKPopContainer.this;
                        AKPopContainer.access$600(aKPopContainer, IAKPopRender.LifecycleType.OUT_ANIMATION_START, AKPopContainer.access$800(aKPopContainer, dlyVar));
                    }

                    @Override // tb.dma
                    public void b(dly dlyVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3e67ec8", new Object[]{this, dlyVar});
                            return;
                        }
                        AKPopContainer aKPopContainer = AKPopContainer.this;
                        AKPopContainer.access$600(aKPopContainer, IAKPopRender.LifecycleType.OUT_ANIMATION_END, AKPopContainer.access$700(aKPopContainer));
                        AKPopContainer.access$500(AKPopContainer.this);
                    }

                    @Override // tb.dma
                    public void a(dlz dlzVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e563eca6", new Object[]{this, dlzVar});
                            return;
                        }
                        AKPopContainer aKPopContainer = AKPopContainer.this;
                        AKPopContainer.access$600(aKPopContainer, IAKPopRender.LifecycleType.OUT_ANIMATION_END, AKPopContainer.access$700(aKPopContainer));
                        AKPopContainer.access$500(AKPopContainer.this);
                    }

                    @Override // tb.dma
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else if (AKPopContainer.this.mContentWrapper == null) {
                        } else {
                            JSONObject jSONObject = new JSONObject();
                            int[] iArr = new int[2];
                            AKPopContainer.this.mContentWrapper.getLocationInWindow(iArr);
                            jSONObject.put("x", (Object) Integer.valueOf(gnv.b(AKPopContainer.this.getContext(), iArr[0])));
                            jSONObject.put("y", (Object) Integer.valueOf(gnv.b(AKPopContainer.this.getContext(), iArr[1])));
                            jSONObject.put("w", (Object) Integer.valueOf(gnv.b(AKPopContainer.this.getContext(), AKPopContainer.this.mContentWrapper.getWidth())));
                            jSONObject.put("h", (Object) Integer.valueOf(gnv.b(AKPopContainer.this.getContext(), AKPopContainer.this.mContentWrapper.getHeight())));
                            AKPopContainer.access$600(AKPopContainer.this, IAKPopRender.LifecycleType.ANIMATION_POSITION_CHANGE, jSONObject);
                        }
                    }
                });
            }
        }
    }

    private void requestDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce13b802", new Object[]{this});
            return;
        }
        callbackLifeCycle(IAKPopRender.LifecycleType.BEFORE_CLOSE, getPopCurrentPosition());
        c.a aVar = this.mStateCallback;
        if (aVar == null) {
            return;
        }
        aVar.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void adjustWrapperHeight(boolean r12) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.abilitykit.ability.pop.render.AKPopContainer.adjustWrapperHeight(boolean):void");
    }

    private void doAnimation(boolean z, View view, com.taobao.android.abilitykit.ability.pop.model.b bVar, dma dmaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a53f92", new Object[]{this, new Boolean(z), view, bVar, dmaVar});
            return;
        }
        dlz dlzVar = this.mPopAnimation;
        if (dlzVar == null) {
            if (dmaVar == null) {
                return;
            }
            dmaVar.a((dly) null);
            dmaVar.b(null);
        } else if (dlzVar.a()) {
            if (dmaVar == null) {
                return;
            }
            dmaVar.a(dlzVar);
        } else if (z) {
            dlzVar.a(view, null, dmaVar, bVar == null ? -1 : bVar.P());
        } else {
            dlzVar.a(view, dmaVar);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.mWindowWidth == measuredWidth && this.mWindowHeight == measuredHeight) {
            return;
        }
        com.alibaba.ability.utils.c.INSTANCE.a("stdPopTag", "onLayout width = " + measuredWidth + " height = " + measuredHeight);
        if (this.isActivityGroup) {
            try {
                Activity currentActivity = ((ActivityGroup) getContext()).getLocalActivityManager().getCurrentActivity();
                if (currentActivity != null) {
                    this.shouldNotifySizeChanged = Boolean.valueOf(currentActivity instanceof hid);
                }
                if (this.shouldNotifySizeChanged != null && this.shouldNotifySizeChanged.booleanValue()) {
                    ((hid) currentActivity).a(measuredWidth, measuredHeight);
                }
            } catch (Throwable th) {
                TLog.loge("stdPopTag", "stdPopTag", "notify size changed error = " + th);
            }
        }
        com.taobao.android.abilitykit.ability.pop.model.b bVar = this.mPopConfig;
        if (bVar != null && bVar.B() && com.taobao.android.abilitykit.ability.pop.model.c.DEFAULT_LANDSCAPE_DRAWER.equals(this.mPopConfig.A()) && dmr.x() && (getContext() instanceof ActivityGroup) && measuredWidth > 0 && measuredHeight > 0) {
            ActivityGroup activityGroup = (ActivityGroup) getContext();
            Window window = activityGroup.getWindow();
            if ("HALF_SCREEN".equals(this.currentState)) {
                f = measuredWidth;
                f2 = measuredHeight;
            } else {
                f = measuredWidth;
                f2 = measuredHeight * 2.0f;
            }
            float f3 = f / f2;
            TLog.loge("stdPopTag", "stdPopTag", "onLayout ratio = " + f3 + " currentState = " + this.currentState);
            if (f3 < dmr.u() && window != null) {
                if ("HALF_SCREEN".equals(this.currentState)) {
                    this.currentState = "FULL_SCREEN";
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.width = -1;
                    window.setAttributes(attributes);
                    Activity currentActivity2 = activityGroup.getLocalActivityManager().getCurrentActivity();
                    if (currentActivity2 != null && currentActivity2.getWindow() != null) {
                        currentActivity2.getWindow().getAttributes().width = dms.d(getContext()).x;
                    }
                    TLog.loge("stdPopTag", "stdPopTag", "onLayout change width to match parent");
                    return;
                }
            } else if ("FULL_SCREEN".equals(this.currentState) && window != null) {
                this.currentState = "HALF_SCREEN";
                int i5 = dms.d(getContext()).x;
                WindowManager.LayoutParams attributes2 = window.getAttributes();
                attributes2.width = i5 / 2;
                TLog.loge("stdPopTag", "stdPopTag", "onLayout Half Screen width = " + i5);
                window.setAttributes(attributes2);
                return;
            }
        }
        this.mWindowHeight = measuredHeight;
        this.mWindowWidth = measuredWidth;
        adjustWrapperHeight(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.mBackgroundAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.mBackgroundAnimator = null;
        }
        this.mPopRender.a(this.mContentView);
        if (this.screenListener != null) {
            h.a().d(this.screenListener);
        }
        shc shcVar = this.falcoSpan;
        if (shcVar == null) {
            return;
        }
        shcVar.c();
        this.falcoSpan = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (this.screenListener != null) {
            h.a().c(this.screenListener);
        }
        IAKPopRender iAKPopRender = this.mPopRender;
        if (iAKPopRender == null) {
            return;
        }
        iAKPopRender.b(this.mContentView);
    }

    private JSONObject getAnimStartParams(dly dlyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7421e287", new Object[]{this, dlyVar});
        }
        JSONObject popCurrentPosition = getPopCurrentPosition();
        if (dlyVar != null && dlyVar.b() != null && dlyVar.b().getClass().isArray()) {
            popCurrentPosition.put("duration", (Object) dlyVar.c());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(dlyVar.a(), dlyVar.b());
            popCurrentPosition.put("animations", (Object) jSONObject);
        }
        return popCurrentPosition;
    }

    private JSONObject getPopCurrentPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6935994e", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        GestureRoundCornerFrameLayout gestureRoundCornerFrameLayout = this.mContentWrapper;
        if (gestureRoundCornerFrameLayout != null) {
            int[] iArr = new int[2];
            gestureRoundCornerFrameLayout.getLocationInWindow(iArr);
            jSONObject.put("x", (Object) Integer.valueOf(gnv.b(getContext(), iArr[0])));
            jSONObject.put("y", (Object) Integer.valueOf(gnv.b(getContext(), iArr[1])));
            jSONObject.put("w", (Object) Integer.valueOf(gnv.b(getContext(), this.mContentWrapper.getWidth())));
            jSONObject.put("h", (Object) Integer.valueOf(gnv.b(getContext(), this.mContentWrapper.getHeight())));
        }
        return jSONObject;
    }
}
