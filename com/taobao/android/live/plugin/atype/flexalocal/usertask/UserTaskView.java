package com.taobao.android.live.plugin.atype.flexalocal.usertask;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.text.Layout;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.business.MtopIliadUsertaskTasksDotaskResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.business.MtopIliadUsertaskTasksEntryResponseData;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.s;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Random;
import tb.bip;
import tb.kge;
import tb.nog;

/* loaded from: classes6.dex */
public class UserTaskView extends FrameLayout implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TUrlImageView mAliUrlImageView;
    private JSONObject mAtmosphere;
    private LinearLayout mAtmosphereBanner;
    private ValueAnimator mAtmosphereCountdown;
    private ValueAnimator mAtmosphereHideAnimator;
    private boolean mAtmosphereHideAnimator4Cancel;
    private AnimatorSet mAtmosphereHideAnimatorSet;
    private ValueAnimator mAtmosphereShowAnimator;
    private LinearLayout mCashLayout;
    private TextView mCashText;
    private TextView mContent;
    private TextSwitcher mContentSwitch;
    private TextView mContentUnit;
    private ViewGroup mEntry;
    private ViewGroup mEntryLayout;
    private TextView mEntryText;
    private ViewGroup mGoldLayout;
    private TextView mGoldText;
    private TUrlImageView mGuideView;
    private TUrlImageView mIcon;
    private TextSwitcher mInnerGoldTextSwitcher;
    private boolean mShowCashFirst;
    private TextView mTitle;
    private UserTaskProgress mUserTaskProgress;

    /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.usertask.UserTaskView$8  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass8 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MtopIliadUsertaskTasksDotaskResponseData f14072a;

        public AnonymousClass8(MtopIliadUsertaskTasksDotaskResponseData mtopIliadUsertaskTasksDotaskResponseData) {
            this.f14072a = mtopIliadUsertaskTasksDotaskResponseData;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (UserTaskView.access$500(UserTaskView.this) == null) {
            } else {
                final float y = UserTaskView.access$500(UserTaskView.this).getY();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(UserTaskView.access$500(UserTaskView.this), "translationY", y, com.taobao.taolive.sdk.utils.b.a(UserTaskView.this.getContext(), 20.0f));
                ofFloat.setDuration(400L);
                ofFloat.start();
                ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.UserTaskView.8.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        } else if (UserTaskView.access$500(UserTaskView.this) == null) {
                        } else {
                            UserTaskView.access$500(UserTaskView.this).post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.UserTaskView.8.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    UserTaskView.access$500(UserTaskView.this).setVisibility(8);
                                    UserTaskView.access$500(UserTaskView.this).setY(y);
                                }
                            });
                        }
                    }
                });
                UserTaskView.access$600(UserTaskView.this, this.f14072a.rewards, false);
            }
        }
    }

    /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.usertask.UserTaskView$9  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass9 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass9() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (UserTaskView.access$700(UserTaskView.this) == null || UserTaskView.access$800(UserTaskView.this) == null) {
            } else {
                final float y = UserTaskView.access$700(UserTaskView.this).getY();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(UserTaskView.access$700(UserTaskView.this), "translationY", y, com.taobao.taolive.sdk.utils.b.a(UserTaskView.this.getContext(), 50.0f));
                ofFloat.start();
                ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.UserTaskView.9.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        } else if (UserTaskView.access$800(UserTaskView.this) == null || UserTaskView.access$700(UserTaskView.this) == null) {
                        } else {
                            UserTaskView.access$800(UserTaskView.this).post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.UserTaskView.9.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    UserTaskView.access$800(UserTaskView.this).setVisibility(8);
                                    UserTaskView.access$700(UserTaskView.this).setY(y);
                                }
                            });
                        }
                    }
                });
                String string = UserTaskView.access$200(UserTaskView.this).getString("durationType");
                UserTaskView userTaskView = UserTaskView.this;
                UserTaskView.access$400(userTaskView, true, UserTaskView.access$200(userTaskView).getString("content"), UserTaskView.access$200(UserTaskView.this).getString(nog.PRICE_UNIT), UserTaskView.access$200(UserTaskView.this).getString("duration"), "countdown_jump".equals(string), true);
            }
        }
    }

    static {
        kge.a(-1032876664);
        kge.a(931499872);
    }

    public static /* synthetic */ Object ipc$super(UserTaskView userTaskView, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.usertask.f
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.usertask.f
    public void hideEntryInnerText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bd1e53a", new Object[]{this});
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.usertask.f
    public boolean isNew() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b5aa5a1", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ LinearLayout access$000(UserTaskView userTaskView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("cbbdd179", new Object[]{userTaskView}) : userTaskView.mAtmosphereBanner;
    }

    public static /* synthetic */ boolean access$100(UserTaskView userTaskView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d02758c5", new Object[]{userTaskView})).booleanValue() : userTaskView.mAtmosphereHideAnimator4Cancel;
    }

    public static /* synthetic */ boolean access$102(UserTaskView userTaskView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36616f39", new Object[]{userTaskView, new Boolean(z)})).booleanValue();
        }
        userTaskView.mAtmosphereHideAnimator4Cancel = z;
        return z;
    }

    public static /* synthetic */ JSONObject access$200(UserTaskView userTaskView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b525d580", new Object[]{userTaskView}) : userTaskView.mAtmosphere;
    }

    public static /* synthetic */ TUrlImageView access$300(UserTaskView userTaskView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("c6f4ad9d", new Object[]{userTaskView}) : userTaskView.mGuideView;
    }

    public static /* synthetic */ void access$400(UserTaskView userTaskView, boolean z, String str, String str2, String str3, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c39dbd4", new Object[]{userTaskView, new Boolean(z), str, str2, str3, new Boolean(z2), new Boolean(z3)});
        } else {
            userTaskView.setContent(z, str, str2, str3, z2, z3);
        }
    }

    public static /* synthetic */ ViewGroup access$500(UserTaskView userTaskView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("c0e4a638", new Object[]{userTaskView}) : userTaskView.mGoldLayout;
    }

    public static /* synthetic */ void access$600(UserTaskView userTaskView, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf108fc0", new Object[]{userTaskView, jSONObject, new Boolean(z)});
        } else {
            userTaskView.showInnerGold(jSONObject, z);
        }
    }

    public static /* synthetic */ TextView access$700(UserTaskView userTaskView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("b946e9ef", new Object[]{userTaskView}) : userTaskView.mCashText;
    }

    public static /* synthetic */ LinearLayout access$800(UserTaskView userTaskView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("3723ba71", new Object[]{userTaskView}) : userTaskView.mCashLayout;
    }

    public UserTaskView(Context context) {
        super(context, null);
        this.mShowCashFirst = true;
        this.mAtmosphereHideAnimator4Cancel = false;
        LayoutInflater.from(context).inflate(R.layout.taolive_room_bottom_usertask_btn1_flexalocal, (ViewGroup) this, true);
        this.mAliUrlImageView = (TUrlImageView) findViewById(R.id.taolive_room_bottom_usertask_img);
        this.mGuideView = (TUrlImageView) findViewById(R.id.taolive_room_bottom_usertask_click_guide);
        this.mUserTaskProgress = (UserTaskProgress) findViewById(R.id.taolive_room_bottom_usertask_progress);
        this.mEntryText = (TextView) findViewById(R.id.taolive_room_bottom_usertask_tv);
        this.mEntryText.setVisibility(8);
        this.mTitle = (TextView) findViewById(R.id.title);
        this.mIcon = (TUrlImageView) findViewById(R.id.icon);
        this.mIcon.setVisibility(8);
        this.mContent = (TextView) findViewById(R.id.content);
        this.mContentSwitch = (TextSwitcher) findViewById(R.id.content_switcher);
        this.mContentUnit = (TextView) findViewById(R.id.content_unit);
        this.mAtmosphereBanner = (LinearLayout) findViewById(R.id.taolive_room_usertask_atmosphere_banner);
        this.mEntryLayout = (ViewGroup) findViewById(R.id.taolive_room_usertask_entry_layout);
        this.mEntry = (ViewGroup) findViewById(R.id.taolive_room_usertask_entry);
        this.mGoldLayout = (ViewGroup) findViewById(R.id.taolive_room_user_task_gold);
        this.mGoldText = (TextView) findViewById(R.id.taolive_room_user_task_gold_text);
        this.mInnerGoldTextSwitcher = (TextSwitcher) findViewById(R.id.taolive_usertask_inner_gold_textswitcher);
        this.mCashLayout = (LinearLayout) findViewById(R.id.taolive_room_user_task_cash);
        this.mCashText = (TextView) findViewById(R.id.taolive_room_user_task_cash_text);
        this.mContentSwitch.setFactory(new ViewSwitcher.ViewFactory() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.UserTaskView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.ViewSwitcher.ViewFactory
            public View makeView() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (View) ipChange.ipc$dispatch("f2361e7c", new Object[]{this});
                }
                TextView textView = new TextView(UserTaskView.this.getContext());
                textView.setTextColor(Color.parseColor("#ffffff"));
                textView.setTextSize(0, com.taobao.taolive.sdk.utils.b.a(UserTaskView.this.getContext(), 21.0f));
                return textView;
            }
        });
        this.mInnerGoldTextSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.UserTaskView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.ViewSwitcher.ViewFactory
            public View makeView() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (View) ipChange.ipc$dispatch("f2361e7c", new Object[]{this});
                }
                TextView textView = new TextView(UserTaskView.this.getContext());
                textView.setTextColor(Color.parseColor("#ffffff"));
                textView.setTextSize(0, com.taobao.taolive.sdk.utils.b.a(UserTaskView.this.getContext(), 13.0f));
                textView.setTypeface(Typeface.DEFAULT_BOLD);
                return textView;
            }
        });
        this.mAliUrlImageView.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.UserTaskView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
            }

            public boolean a(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                if (drawable instanceof com.taobao.phenix.animate.b) {
                    ((com.taobao.phenix.animate.b) drawable).a(1);
                }
                return false;
            }
        });
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.usertask.f
    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
            return;
        }
        UserTaskProgress userTaskProgress = this.mUserTaskProgress;
        if (userTaskProgress == null) {
            return;
        }
        userTaskProgress.setProgress(f);
        this.mUserTaskProgress.postInvalidate();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.usertask.f
    public void reset(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("847be2a0", new Object[]{this, str});
            return;
        }
        setEntryText(str);
        resetAtmosphere();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.usertask.f
    public void setEntryText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2335f94e", new Object[]{this, str});
        } else if (!StringUtils.isEmpty(str)) {
            this.mEntryText.setVisibility(0);
            this.mEntryText.setText(str);
        } else {
            this.mEntryText.setVisibility(8);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.usertask.f
    public void setAtmosphere(JSONObject jSONObject) {
        int i;
        int i2;
        boolean z;
        int i3;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c2226a5", new Object[]{this, jSONObject});
        } else if (jSONObject == null || StringUtils.isEmpty(jSONObject.getString("durationType"))) {
        } else {
            if (bip.REQUEST_ONCE.equals(jSONObject.getString("durationType")) || "countdown_jump".equals(jSONObject.getString("durationType"))) {
                resetAtmosphere();
            }
            this.mAtmosphere = jSONObject;
            if (jSONObject == null) {
                return;
            }
            boolean cash = setCash(jSONObject.getJSONObject("notice"));
            boolean equals = "countdown_jump".equals(this.mAtmosphere.getString("durationType"));
            if (equals) {
                int nextInt = new Random().nextInt(5);
                i = nextInt == 0 ? 1 : nextInt;
            } else {
                i = 0;
            }
            setTitle(jSONObject.getString("title"), jSONObject.getString("icon"));
            if (!cash) {
                String string2 = this.mAtmosphere.getString("content");
                String string3 = this.mAtmosphere.getString(nog.PRICE_UNIT);
                if (equals) {
                    string = this.mAtmosphere.getString("duration") + i;
                } else {
                    string = this.mAtmosphere.getString("duration");
                }
                i2 = i;
                z = equals;
                setContent(false, string2, string3, string, equals, true);
            } else {
                i2 = i;
                z = equals;
            }
            int[] iArr = new int[2];
            this.mEntryLayout.getLocationInWindow(iArr);
            boolean z2 = iArr[0] < com.taobao.taolive.sdk.utils.b.a() / 2 && iArr[1] > 0;
            if (!StringUtils.isEmpty(jSONObject.getString("finishHintImageUrl"))) {
                this.mGuideView.setVisibility(0);
                this.mGuideView.setSkipAutoSize(true);
                this.mGuideView.setImageUrl(jSONObject.getString("finishHintImageUrl"));
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mEntryLayout.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.mCashLayout.getLayoutParams();
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.mEntry.getLayoutParams();
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.mAtmosphereBanner.getLayoutParams();
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.mGoldLayout.getLayoutParams();
            if (z2) {
                layoutParams.gravity = 3;
                this.mEntryLayout.setLayoutParams(layoutParams);
                layoutParams2.gravity = 5;
                this.mCashLayout.setLayoutParams(layoutParams2);
                layoutParams3.gravity = 3;
                this.mEntry.setLayoutParams(layoutParams3);
                layoutParams5.gravity = 3;
                this.mGoldLayout.setLayoutParams(layoutParams5);
                layoutParams4.gravity = 5;
                this.mAtmosphereBanner.setLayoutParams(layoutParams4);
                i3 = 0;
                this.mAtmosphereBanner.setPadding(com.taobao.taolive.sdk.utils.b.a(getContext(), 66.0f), com.taobao.taolive.sdk.utils.b.a(getContext(), 11.0f), com.taobao.taolive.sdk.utils.b.a(getContext(), 18.0f), 0);
            } else {
                layoutParams.gravity = 5;
                this.mEntryLayout.setLayoutParams(layoutParams);
                layoutParams2.gravity = 3;
                this.mCashLayout.setLayoutParams(layoutParams2);
                layoutParams3.gravity = 5;
                this.mEntry.setLayoutParams(layoutParams3);
                layoutParams5.gravity = 5;
                this.mGoldLayout.setLayoutParams(layoutParams5);
                layoutParams4.gravity = 3;
                this.mAtmosphereBanner.setLayoutParams(layoutParams4);
                i3 = 0;
                this.mAtmosphereBanner.setPadding(com.taobao.taolive.sdk.utils.b.a(getContext(), 18.0f), com.taobao.taolive.sdk.utils.b.a(getContext(), 11.0f), com.taobao.taolive.sdk.utils.b.a(getContext(), 66.0f), 0);
            }
            this.mAtmosphereBanner.setVisibility(i3);
            int tipLength = getTipLength(cash);
            if (StringUtils.isEmpty(this.mAtmosphere.getString("durationType")) || "countdown_jump".equals(this.mAtmosphere.getString("durationType")) || bip.REQUEST_ONCE.equals(this.mAtmosphere.getString("durationType")) || (RVStartParams.TRANSPARENT_TITLE_ALWAYS.equals(this.mAtmosphere.getString("durationType")) && this.mAtmosphereShowAnimator != null)) {
                atmosphereBannerShowAnimator(z2, tipLength);
            }
            if (!StringUtils.isEmpty(this.mAtmosphere.getString("durationType")) && !"countdown_jump".equals(this.mAtmosphere.getString("durationType")) && !"close".equals(this.mAtmosphere.getString("durationType")) && !bip.REQUEST_ONCE.equals(this.mAtmosphere.getString("durationType"))) {
                return;
            }
            atmosphereBannerHideAnimator(z2, tipLength, z, i2);
        }
    }

    private void atmosphereBannerShowAnimator(final boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce1e708", new Object[]{this, new Boolean(z), new Integer(i)});
        } else if (this.mAtmosphere == null) {
        } else {
            this.mAtmosphereShowAnimator = ValueAnimator.ofInt(0, i).setDuration(500L);
            this.mAtmosphereShowAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.UserTaskView.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    } else if (UserTaskView.access$000(UserTaskView.this) == null) {
                    } else {
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ViewGroup.LayoutParams layoutParams = UserTaskView.access$000(UserTaskView.this).getLayoutParams();
                        layoutParams.width = intValue;
                        UserTaskView.access$000(UserTaskView.this).setLayoutParams(layoutParams);
                        if (!z) {
                            return;
                        }
                        ((View) UserTaskView.this.getParent()).setX(0.0f);
                    }
                }
            });
            this.mAtmosphereShowAnimator.start();
        }
    }

    private void atmosphereBannerHideAnimator(final boolean z, int i, final boolean z2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779a37fc", new Object[]{this, new Boolean(z), new Integer(i), new Boolean(z2), new Integer(i2)});
        } else if (this.mAtmosphere == null) {
        } else {
            this.mAtmosphereHideAnimator = ValueAnimator.ofInt(i, 0).setDuration(500L);
            this.mAtmosphereHideAnimator4Cancel = false;
            this.mAtmosphereHideAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.UserTaskView.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    } else if (UserTaskView.access$000(UserTaskView.this) == null) {
                    } else {
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ViewGroup.LayoutParams layoutParams = UserTaskView.access$000(UserTaskView.this).getLayoutParams();
                        layoutParams.width = intValue;
                        UserTaskView.access$000(UserTaskView.this).setLayoutParams(layoutParams);
                        if (!z) {
                            return;
                        }
                        ((View) UserTaskView.this.getParent()).setX(0.0f);
                    }
                }
            });
            this.mAtmosphereHideAnimator.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.UserTaskView.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else if (UserTaskView.access$000(UserTaskView.this) == null) {
                    } else {
                        UserTaskView.access$000(UserTaskView.this).post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.UserTaskView.6.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                if (!UserTaskView.access$100(UserTaskView.this) && z2 && UserTaskView.access$200(UserTaskView.this).getString("jumpUrl") != null) {
                                    s.a(UserTaskView.this.getContext(), UserTaskView.access$200(UserTaskView.this).getString("jumpUrl"));
                                }
                                if (UserTaskView.access$000(UserTaskView.this) != null) {
                                    UserTaskView.access$000(UserTaskView.this).setVisibility(8);
                                }
                                if (UserTaskView.access$300(UserTaskView.this) == null || UserTaskView.access$200(UserTaskView.this) == null || StringUtils.isEmpty(UserTaskView.access$200(UserTaskView.this).getString("finishHintImageUrl"))) {
                                    return;
                                }
                                UserTaskView.access$300(UserTaskView.this).setVisibility(4);
                            }
                        });
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    } else {
                        UserTaskView.access$102(UserTaskView.this, true);
                    }
                }
            });
            int intValue = (this.mAtmosphere.getIntValue("duration") * 1000) - 500;
            if (z2) {
                int intValue2 = this.mAtmosphere.getIntValue("duration") + i2;
                int i3 = intValue2 * 1000;
                this.mAtmosphereCountdown = ValueAnimator.ofInt(intValue2, 0).setDuration(i3);
                this.mAtmosphereCountdown.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.UserTaskView.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                            return;
                        }
                        int intValue3 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        UserTaskView userTaskView = UserTaskView.this;
                        String string = UserTaskView.access$200(userTaskView).getString("content");
                        String string2 = UserTaskView.access$200(UserTaskView.this).getString(nog.PRICE_UNIT);
                        UserTaskView.access$400(userTaskView, false, string, string2, intValue3 + "", true, false);
                    }
                });
                intValue = i3 - 500;
            }
            if (intValue < 0) {
                intValue = 0;
            }
            this.mAtmosphereHideAnimator.setStartDelay(intValue);
            this.mAtmosphereHideAnimatorSet = new AnimatorSet();
            if (z2) {
                this.mAtmosphereHideAnimatorSet.playTogether(this.mAtmosphereHideAnimator, this.mAtmosphereCountdown);
            } else {
                this.mAtmosphereHideAnimatorSet.playTogether(this.mAtmosphereHideAnimator);
            }
            this.mAtmosphereHideAnimatorSet.start();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.usertask.f
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        AnimatorSet animatorSet = this.mAtmosphereHideAnimatorSet;
        if (animatorSet == null || !animatorSet.isStarted()) {
            return;
        }
        this.mAtmosphereHideAnimatorSet.resume();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.usertask.f
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        AnimatorSet animatorSet = this.mAtmosphereHideAnimatorSet;
        if (animatorSet == null || !animatorSet.isStarted()) {
            return;
        }
        this.mAtmosphereHideAnimatorSet.pause();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.usertask.f
    public void changeGoldUI(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57e94467", new Object[]{this, obj});
        } else if (obj instanceof MtopIliadUsertaskTasksEntryResponseData) {
            MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData = (MtopIliadUsertaskTasksEntryResponseData) obj;
            if (mtopIliadUsertaskTasksEntryResponseData.rewards == null) {
                return;
            }
            showInnerGold(mtopIliadUsertaskTasksEntryResponseData.rewards, true);
        } else if (!(obj instanceof MtopIliadUsertaskTasksDotaskResponseData)) {
        } else {
            showGold((MtopIliadUsertaskTasksDotaskResponseData) obj);
        }
    }

    private void showInnerGold(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b972744", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject == null || StringUtils.isEmpty(jSONObject.getString("amount"))) {
            this.mInnerGoldTextSwitcher.setVisibility(8);
        } else {
            this.mInnerGoldTextSwitcher.setVisibility(0);
            if (z) {
                this.mInnerGoldTextSwitcher.setCurrentText(jSONObject.getString("amount"));
            } else {
                this.mInnerGoldTextSwitcher.setText(jSONObject.getString("amount"));
            }
        }
    }

    private void showGold(MtopIliadUsertaskTasksDotaskResponseData mtopIliadUsertaskTasksDotaskResponseData) {
        JSONObject jSONObject;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a49f091f", new Object[]{this, mtopIliadUsertaskTasksDotaskResponseData});
        } else if (mtopIliadUsertaskTasksDotaskResponseData == null || (jSONObject = mtopIliadUsertaskTasksDotaskResponseData.asset) == null || jSONObject.getIntValue("duration") <= 0) {
        } else {
            String string = jSONObject.getString("actionText") == null ? "" : jSONObject.getString("actionText");
            String string2 = jSONObject.getString("content") == null ? "" : jSONObject.getString("content");
            String string3 = jSONObject.getString(nog.PRICE_UNIT) == null ? "" : jSONObject.getString(nog.PRICE_UNIT);
            String str = string + string2 + string3;
            if (StringUtils.isEmpty(str)) {
                return;
            }
            Integer integer = jSONObject.getInteger("duration");
            int intValue = integer != null ? integer.intValue() : 0;
            this.mGoldLayout.setVisibility(0);
            SpannableString spannableString = new SpannableString(str);
            if (!StringUtils.isEmpty(string)) {
                i = string.length();
                spannableString.setSpan(new AbsoluteSizeSpan(13, true), 0, i, 17);
            } else {
                i = 0;
            }
            if (!StringUtils.isEmpty(string2)) {
                int length = string2.length() + i;
                spannableString.setSpan(new AbsoluteSizeSpan(19, true), i, length, 17);
                i = length;
            }
            if (!StringUtils.isEmpty(string3)) {
                spannableString.setSpan(new AbsoluteSizeSpan(10, true), i, string3.length() + i, 17);
            }
            this.mGoldText.setText(spannableString);
            TextSwitcher textSwitcher = this.mInnerGoldTextSwitcher;
            if (textSwitcher != null) {
                textSwitcher.setCurrentText("");
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mGoldLayout, "translationY", com.taobao.taolive.sdk.utils.b.a(getContext(), 20.0f), this.mGoldLayout.getY());
            ofFloat.setDuration(400L);
            ofFloat.start();
            if (intValue < 0) {
                return;
            }
            this.mGoldLayout.postDelayed(new AnonymousClass8(mtopIliadUsertaskTasksDotaskResponseData), intValue);
        }
    }

    private void resetAtmosphere() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9c73d8", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.mAtmosphereShowAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        AnimatorSet animatorSet = this.mAtmosphereHideAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        LinearLayout linearLayout = this.mAtmosphereBanner;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        if (this.mGuideView == null || (jSONObject = this.mAtmosphere) == null || StringUtils.isEmpty(jSONObject.getString("finishHintImageUrl"))) {
            return;
        }
        this.mGuideView.setVisibility(4);
    }

    private int getTipLength(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ad33955", new Object[]{this, new Boolean(z)})).intValue();
        }
        TextView textView = z ? (TextView) this.mContentSwitch.getCurrentView() : this.mContent;
        return ((int) (com.taobao.taolive.sdk.utils.b.a(getContext(), 72.0f) + com.taobao.taolive.sdk.utils.b.a(getContext(), 12.0f) + Math.max(Layout.getDesiredWidth(textView.getText().toString(), 0, textView.getText().length(), textView.getPaint()), Layout.getDesiredWidth(this.mTitle.getText().toString(), 0, this.mTitle.getText().length(), this.mTitle.getPaint())))) + com.taobao.taolive.sdk.utils.b.a(getContext(), 15.0f);
    }

    private boolean setCash(JSONObject jSONObject) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("243bf5b8", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        String str = "";
        String string = jSONObject.getString("actionText") == null ? str : jSONObject.getString("actionText");
        String string2 = jSONObject.getString("content") == null ? str : jSONObject.getString("content");
        if (jSONObject.getString(nog.PRICE_UNIT) != null) {
            str = jSONObject.getString(nog.PRICE_UNIT);
        }
        String str2 = string + string2 + str;
        if (StringUtils.isEmpty(str2)) {
            return false;
        }
        Integer integer = jSONObject.getInteger("duration");
        int intValue = integer != null ? integer.intValue() : 0;
        this.mCashLayout.setVisibility(0);
        SpannableString spannableString = new SpannableString(str2);
        if (!StringUtils.isEmpty(string)) {
            i = string.length();
            spannableString.setSpan(new AbsoluteSizeSpan(13, true), 0, i, 17);
        } else {
            i = 0;
        }
        if (!StringUtils.isEmpty(string2)) {
            int length = string2.length() + i;
            spannableString.setSpan(new AbsoluteSizeSpan(19, true), i, length, 17);
            i = length;
        }
        if (!StringUtils.isEmpty(str)) {
            spannableString.setSpan(new AbsoluteSizeSpan(10, true), i, str.length() + i, 17);
        }
        this.mCashText.setText(spannableString);
        ObjectAnimator.ofFloat(this.mCashText, "translationY", com.taobao.taolive.sdk.utils.b.a(getContext(), 50.0f), this.mCashText.getY()).start();
        if (intValue >= 0) {
            this.mCashLayout.postDelayed(new AnonymousClass9(), intValue * 1000);
        }
        return true;
    }

    private void setContent(boolean z, String str, String str2, String str3, boolean z2, boolean z3) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6f9eb4", new Object[]{this, new Boolean(z), str, str2, str3, new Boolean(z2), new Boolean(z3)});
            return;
        }
        String str4 = "";
        if (z2) {
            if (str != null) {
                str4 = str4 + str;
            }
            if (str3 != null) {
                str4 = str4 + str3;
            }
            if (str2 != null) {
                str4 = str4 + str2;
            }
            if (z3) {
                this.mAtmosphereBanner.setVisibility(4);
            }
            this.mContent.setVisibility(0);
            this.mContent.setText(str4);
            return;
        }
        if (str != null) {
            str4 = str4 + str;
        }
        if (str2 != null) {
            str4 = str4 + str2;
        }
        if (StringUtils.isEmpty(str4)) {
            return;
        }
        if (!z) {
            if (z3) {
                this.mAtmosphereBanner.setVisibility(4);
            }
            this.mContent.setVisibility(0);
            this.mContentSwitch.setVisibility(8);
            this.mContentUnit.setVisibility(8);
            SpannableString spannableString = new SpannableString(str4);
            if (!StringUtils.isEmpty(str)) {
                i = str.length();
                spannableString.setSpan(new AbsoluteSizeSpan(21, true), 0, i, 17);
            } else {
                i = 0;
            }
            if (!StringUtils.isEmpty(str2)) {
                spannableString.setSpan(new AbsoluteSizeSpan(14, true), i, str2.length() + i, 17);
            }
            this.mContent.setText(spannableString);
            return;
        }
        this.mContent.setVisibility(8);
        if (!StringUtils.isEmpty(str)) {
            this.mContentSwitch.setVisibility(0);
            if (this.mShowCashFirst) {
                this.mContentSwitch.setCurrentText(str);
            } else {
                this.mContentSwitch.setText(str);
            }
            this.mShowCashFirst = false;
        }
        if (StringUtils.isEmpty(str2)) {
            return;
        }
        this.mContentUnit.setVisibility(0);
        this.mContentUnit.setText(str2);
    }

    private void setTitle(String str, String str2) {
        TUrlImageView tUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152bd731", new Object[]{this, str, str2});
            return;
        }
        if (!StringUtils.isEmpty(str2) && (tUrlImageView = this.mIcon) != null) {
            tUrlImageView.setVisibility(0);
            this.mIcon.setImageUrl(str2);
        } else {
            TUrlImageView tUrlImageView2 = this.mIcon;
            if (tUrlImageView2 != null) {
                tUrlImageView2.setVisibility(8);
            }
        }
        if (StringUtils.isEmpty(str)) {
            return;
        }
        this.mTitle.setText(str);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.usertask.f
    public void setEntryImage(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f1f8e6e", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        TUrlImageView tUrlImageView = this.mAliUrlImageView;
        if (tUrlImageView != null) {
            tUrlImageView.setSkipAutoSize(true);
            this.mAliUrlImageView.setWhenNullClearImg(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mAliUrlImageView.getLayoutParams();
            if (!StringUtils.isEmpty(str2)) {
                if (!str2.equals(this.mAliUrlImageView.getImageUrl())) {
                    this.mAliUrlImageView.setImageUrl(str2);
                }
            } else if (!StringUtils.isEmpty(str) && !str.equals(this.mAliUrlImageView.getImageUrl())) {
                this.mAliUrlImageView.setImageUrl(str);
            }
            this.mAliUrlImageView.setLayoutParams(layoutParams);
        }
        UserTaskProgress userTaskProgress = this.mUserTaskProgress;
        if (userTaskProgress == null) {
            return;
        }
        if (!z) {
            i = 8;
        }
        userTaskProgress.setVisibility(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        resetAtmosphere();
    }
}
