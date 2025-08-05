package com.taobao.android.live.plugin.atype.flexalocal.usertask;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
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
public class UserTaskView2 extends FrameLayout implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TUrlImageView mAliUrlImageView;
    private JSONObject mAtmosphere;
    private LinearLayout mAtmosphereBanner;
    private ValueAnimator mAtmosphereCountdown;
    private ValueAnimator mAtmosphereHideAnimator;
    private boolean mAtmosphereHideAnimator4Cancel;
    private AnimatorSet mAtmosphereHideAnimatorSet;
    private ValueAnimator mAtmosphereShowAnimator;
    private TextView mContent;
    private TextSwitcher mContentSwitch;
    private TextView mContentUnit;
    private ViewGroup mEntry;
    private ViewGroup mEntryLayout;
    private TextView mEntryText;
    private TUrlImageView mIcon;
    private TextView mInnerGoldText;
    private boolean mShowCashFirst;
    private TextView mTitle;
    private UserTaskProgress mUserTaskProgress;

    static {
        kge.a(-1954405462);
        kge.a(931499872);
    }

    public static /* synthetic */ Object ipc$super(UserTaskView2 userTaskView2, String str, Object... objArr) {
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
    public boolean isNew() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b5aa5a1", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ JSONObject access$000(UserTaskView2 userTaskView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e755bf5c", new Object[]{userTaskView2}) : userTaskView2.mAtmosphere;
    }

    public static /* synthetic */ LinearLayout access$100(UserTaskView2 userTaskView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("a1496a54", new Object[]{userTaskView2}) : userTaskView2.mAtmosphereBanner;
    }

    public static /* synthetic */ boolean access$200(UserTaskView2 userTaskView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3be8c8c2", new Object[]{userTaskView2})).booleanValue() : userTaskView2.mAtmosphereHideAnimator4Cancel;
    }

    public static /* synthetic */ boolean access$202(UserTaskView2 userTaskView2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7333a518", new Object[]{userTaskView2, new Boolean(z)})).booleanValue();
        }
        userTaskView2.mAtmosphereHideAnimator4Cancel = z;
        return z;
    }

    public static /* synthetic */ void access$300(UserTaskView2 userTaskView2, boolean z, String str, String str2, String str3, String str4, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9963421d", new Object[]{userTaskView2, new Boolean(z), str, str2, str3, str4, new Boolean(z2), new Boolean(z3)});
        } else {
            userTaskView2.setContent(z, str, str2, str3, str4, z2, z3);
        }
    }

    public UserTaskView2(Context context) {
        super(context, null);
        this.mShowCashFirst = true;
        this.mAtmosphereHideAnimator4Cancel = false;
        LayoutInflater.from(context).inflate(R.layout.taolive_room_bottom_usertask_view_flexalocal, (ViewGroup) this, true);
        this.mAliUrlImageView = (TUrlImageView) findViewById(R.id.taolive_room_bottom_usertask_img);
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
        this.mInnerGoldText = (TextView) findViewById(R.id.taolive_usertask_inner_gold_text);
        this.mContentSwitch.setFactory(new ViewSwitcher.ViewFactory() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.UserTaskView2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.ViewSwitcher.ViewFactory
            public View makeView() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (View) ipChange.ipc$dispatch("f2361e7c", new Object[]{this});
                }
                TextView textView = new TextView(UserTaskView2.this.getContext());
                try {
                    textView.setTextColor(Color.parseColor((UserTaskView2.access$000(UserTaskView2.this) == null || TextUtils.isEmpty(UserTaskView2.access$000(UserTaskView2.this).getString("contentColor"))) ? "#ffffff" : UserTaskView2.access$000(UserTaskView2.this).getString("contentColor")));
                } catch (Exception unused) {
                }
                textView.setTextSize(0, com.taobao.taolive.sdk.utils.b.a(UserTaskView2.this.getContext(), 10.0f));
                return textView;
            }
        });
        this.mAliUrlImageView.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.UserTaskView2.2
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
        } else if (!TextUtils.isEmpty(str)) {
            this.mEntryText.setVisibility(0);
            this.mEntryText.setText(str);
        } else {
            this.mEntryText.setVisibility(8);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.usertask.f
    public void setAtmosphere(JSONObject jSONObject) {
        int i;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c2226a5", new Object[]{this, jSONObject});
        } else if (jSONObject == null || TextUtils.isEmpty(jSONObject.getString("durationType"))) {
        } else {
            if (bip.REQUEST_ONCE.equals(jSONObject.getString("durationType")) || "countdown_jump".equals(jSONObject.getString("durationType"))) {
                resetAtmosphere();
            }
            this.mAtmosphere = jSONObject;
            if (jSONObject == null) {
                return;
            }
            boolean equals = "countdown_jump".equals(this.mAtmosphere.getString("durationType"));
            if (equals) {
                int nextInt = new Random().nextInt(5);
                i = nextInt == 0 ? 1 : nextInt;
            } else {
                i = 0;
            }
            setTitle(jSONObject.getString("title"), jSONObject.getString("icon"), jSONObject.getString("titleColor"));
            String string2 = this.mAtmosphere.getString("content");
            String string3 = this.mAtmosphere.getString(nog.PRICE_UNIT);
            if (equals) {
                string = this.mAtmosphere.getString("duration") + i;
            } else {
                string = this.mAtmosphere.getString("duration");
            }
            int i2 = i;
            setContent(true, string2, string3, string, this.mAtmosphere.getString("contentColor"), equals, true);
            int[] iArr = new int[2];
            this.mEntryLayout.getLocationInWindow(iArr);
            boolean z = iArr[0] < com.taobao.taolive.sdk.utils.b.a() / 2 && iArr[1] > 0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mEntryLayout.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.mEntry.getLayoutParams();
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.mAtmosphereBanner.getLayoutParams();
            if (z) {
                layoutParams.gravity = 3;
                this.mEntryLayout.setLayoutParams(layoutParams);
                layoutParams2.gravity = 3;
                this.mEntry.setLayoutParams(layoutParams2);
                layoutParams3.gravity = 5;
                this.mAtmosphereBanner.setLayoutParams(layoutParams3);
                this.mAtmosphereBanner.setPadding(com.taobao.taolive.sdk.utils.b.a(getContext(), 47.0f), com.taobao.taolive.sdk.utils.b.a(getContext(), 5.0f), com.taobao.taolive.sdk.utils.b.a(getContext(), 9.0f), 0);
            } else {
                layoutParams.gravity = 5;
                this.mEntryLayout.setLayoutParams(layoutParams);
                layoutParams2.gravity = 5;
                this.mEntry.setLayoutParams(layoutParams2);
                layoutParams3.gravity = 3;
                this.mAtmosphereBanner.setLayoutParams(layoutParams3);
                this.mAtmosphereBanner.setPadding(com.taobao.taolive.sdk.utils.b.a(getContext(), 9.0f), com.taobao.taolive.sdk.utils.b.a(getContext(), 5.0f), com.taobao.taolive.sdk.utils.b.a(getContext(), 47.0f), 0);
            }
            this.mAtmosphereBanner.setVisibility(0);
            int tipLength = getTipLength(true);
            if (TextUtils.isEmpty(this.mAtmosphere.getString("durationType")) || "countdown_jump".equals(this.mAtmosphere.getString("durationType")) || bip.REQUEST_ONCE.equals(this.mAtmosphere.getString("durationType")) || (RVStartParams.TRANSPARENT_TITLE_ALWAYS.equals(this.mAtmosphere.getString("durationType")) && this.mAtmosphereShowAnimator != null)) {
                atmosphereBannerShowAnimator(z, tipLength);
            }
            if (!TextUtils.isEmpty(this.mAtmosphere.getString("durationType")) && !"countdown_jump".equals(this.mAtmosphere.getString("durationType")) && !"close".equals(this.mAtmosphere.getString("durationType")) && !bip.REQUEST_ONCE.equals(this.mAtmosphere.getString("durationType"))) {
                return;
            }
            atmosphereBannerHideAnimator(z, tipLength, equals, i2);
        }
    }

    private void atmosphereBannerShowAnimator(final boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce1e708", new Object[]{this, new Boolean(z), new Integer(i)});
        } else if (this.mAtmosphere == null) {
        } else {
            this.mAtmosphereShowAnimator = ValueAnimator.ofInt(0, i).setDuration(500L);
            this.mAtmosphereShowAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.UserTaskView2.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    } else if (UserTaskView2.access$100(UserTaskView2.this) == null) {
                    } else {
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ViewGroup.LayoutParams layoutParams = UserTaskView2.access$100(UserTaskView2.this).getLayoutParams();
                        layoutParams.width = intValue;
                        UserTaskView2.access$100(UserTaskView2.this).setLayoutParams(layoutParams);
                        if (!z) {
                            return;
                        }
                        ((View) UserTaskView2.this.getParent()).setX(0.0f);
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
            this.mAtmosphereHideAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.UserTaskView2.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    } else if (UserTaskView2.access$100(UserTaskView2.this) == null) {
                    } else {
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ViewGroup.LayoutParams layoutParams = UserTaskView2.access$100(UserTaskView2.this).getLayoutParams();
                        layoutParams.width = intValue;
                        UserTaskView2.access$100(UserTaskView2.this).setLayoutParams(layoutParams);
                        if (!z) {
                            return;
                        }
                        ((View) UserTaskView2.this.getParent()).setX(0.0f);
                    }
                }
            });
            this.mAtmosphereHideAnimator.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.UserTaskView2.5
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
                    } else if (UserTaskView2.access$100(UserTaskView2.this) == null) {
                    } else {
                        UserTaskView2.access$100(UserTaskView2.this).post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.UserTaskView2.5.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                if (!UserTaskView2.access$200(UserTaskView2.this) && z2 && UserTaskView2.access$000(UserTaskView2.this).getString("jumpUrl") != null) {
                                    s.a(UserTaskView2.this.getContext(), UserTaskView2.access$000(UserTaskView2.this).getString("jumpUrl"));
                                }
                                if (UserTaskView2.access$100(UserTaskView2.this) == null) {
                                    return;
                                }
                                UserTaskView2.access$100(UserTaskView2.this).setVisibility(8);
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
                        UserTaskView2.access$202(UserTaskView2.this, true);
                    }
                }
            });
            int intValue = (this.mAtmosphere.getIntValue("duration") * 1000) - 500;
            if (z2) {
                int intValue2 = this.mAtmosphere.getIntValue("duration") + i2;
                int i3 = intValue2 * 1000;
                this.mAtmosphereCountdown = ValueAnimator.ofInt(intValue2, 0).setDuration(i3);
                this.mAtmosphereCountdown.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.UserTaskView2.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                            return;
                        }
                        int intValue3 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        UserTaskView2 userTaskView2 = UserTaskView2.this;
                        String string = UserTaskView2.access$000(userTaskView2).getString("content");
                        String string2 = UserTaskView2.access$000(UserTaskView2.this).getString(nog.PRICE_UNIT);
                        UserTaskView2.access$300(userTaskView2, false, string, string2, intValue3 + "", UserTaskView2.access$000(UserTaskView2.this).getString("contentColor"), true, false);
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
            if (mtopIliadUsertaskTasksEntryResponseData.asset == null) {
                return;
            }
            showInnerGold(mtopIliadUsertaskTasksEntryResponseData.asset);
        } else if (!(obj instanceof MtopIliadUsertaskTasksDotaskResponseData)) {
        } else {
            showInnerGold(((MtopIliadUsertaskTasksDotaskResponseData) obj).asset);
        }
    }

    private void showInnerGold(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96913d90", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            this.mInnerGoldText.setVisibility(8);
        } else {
            String str = "";
            String string = jSONObject.getString("actionText") == null ? str : jSONObject.getString("actionText");
            if (jSONObject.getString("content") != null) {
                str = jSONObject.getString("content");
            }
            this.mInnerGoldText.setVisibility(0);
            this.mInnerGoldText.setText(string + str);
        }
    }

    private void resetAtmosphere() {
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
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    private int getTipLength(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ad33955", new Object[]{this, new Boolean(z)})).intValue();
        }
        TextView textView = z ? (TextView) this.mContentSwitch.getCurrentView() : this.mContent;
        return ((int) (com.taobao.taolive.sdk.utils.b.a(getContext(), 47.0f) + com.taobao.taolive.sdk.utils.b.a(getContext(), 9.0f) + Math.max(Layout.getDesiredWidth(textView.getText().toString(), 0, textView.getText().length(), textView.getPaint()), Layout.getDesiredWidth(this.mTitle.getText().toString(), 0, this.mTitle.getText().length(), this.mTitle.getPaint())))) + com.taobao.taolive.sdk.utils.b.a(getContext(), 15.0f);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01bc -> B:66:0x01bd). Please submit an issue!!! */
    private void setContent(boolean z, String str, String str2, String str3, String str4, boolean z2, boolean z3) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6e458fe", new Object[]{this, new Boolean(z), str, str2, str3, str4, new Boolean(z2), new Boolean(z3)});
            return;
        }
        String str5 = "";
        if (z2) {
            if (str != null) {
                str5 = str5 + str;
            }
            if (str3 != null) {
                str5 = str5 + str3;
            }
            if (str2 != null) {
                str5 = str5 + str2;
            }
            if (z3) {
                this.mAtmosphereBanner.setVisibility(4);
            }
            this.mContent.setVisibility(0);
            this.mContent.setText(str5);
        } else {
            if (str != null) {
                str5 = str5 + str;
            }
            if (str2 != null) {
                str5 = str5 + str2;
            }
            if (!TextUtils.isEmpty(str5)) {
                if (!z) {
                    if (z3) {
                        this.mAtmosphereBanner.setVisibility(4);
                    }
                    this.mContent.setVisibility(0);
                    this.mContentSwitch.setVisibility(8);
                    this.mContentUnit.setVisibility(8);
                    SpannableString spannableString = new SpannableString(str5);
                    if (!TextUtils.isEmpty(str)) {
                        i = str.length();
                        spannableString.setSpan(new AbsoluteSizeSpan(10, true), 0, i, 17);
                    } else {
                        i = 0;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        spannableString.setSpan(new AbsoluteSizeSpan(10, true), i, str2.length() + i, 17);
                    }
                    this.mContent.setText(spannableString);
                } else {
                    this.mContent.setVisibility(8);
                    if (!TextUtils.isEmpty(str)) {
                        this.mContentSwitch.setVisibility(0);
                        if (this.mShowCashFirst) {
                            this.mContentSwitch.setCurrentText(str);
                        } else {
                            this.mContentSwitch.setText(str);
                        }
                        this.mShowCashFirst = false;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        this.mContentUnit.setVisibility(0);
                        this.mContentUnit.setText(str2);
                    } else {
                        this.mContentUnit.setVisibility(8);
                    }
                    try {
                        if (!TextUtils.isEmpty(str4) && (this.mContentSwitch.getCurrentView() instanceof TextView) && (this.mContentSwitch.getNextView() instanceof TextView)) {
                            ((TextView) this.mContentSwitch.getCurrentView()).setTextColor(Color.parseColor(str4));
                            ((TextView) this.mContentSwitch.getNextView()).setTextColor(Color.parseColor(str4));
                            this.mContentUnit.setTextColor(Color.parseColor(str4));
                            if (!str4.equalsIgnoreCase("#ffffff")) {
                                ((TextView) this.mContentSwitch.getCurrentView()).setTypeface(Typeface.DEFAULT_BOLD);
                                ((TextView) this.mContentSwitch.getNextView()).setTypeface(Typeface.DEFAULT_BOLD);
                                this.mContentUnit.setTypeface(Typeface.DEFAULT_BOLD);
                            } else {
                                ((TextView) this.mContentSwitch.getCurrentView()).setTypeface(Typeface.DEFAULT);
                                ((TextView) this.mContentSwitch.getNextView()).setTypeface(Typeface.DEFAULT);
                                this.mContentUnit.setTypeface(Typeface.DEFAULT);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        try {
            if (!str4.equalsIgnoreCase("#ffffff")) {
                this.mContent.setTypeface(Typeface.DEFAULT_BOLD);
            } else {
                this.mContent.setTypeface(Typeface.DEFAULT);
            }
            this.mContent.setTextColor(Color.parseColor(str4));
        } catch (Exception unused2) {
        }
    }

    private void setTitle(String str, String str2, String str3) {
        TUrlImageView tUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e5f6bb", new Object[]{this, str, str2, str3});
            return;
        }
        if (!TextUtils.isEmpty(str2) && (tUrlImageView = this.mIcon) != null) {
            tUrlImageView.setVisibility(0);
            this.mIcon.setImageUrl(str2);
        } else {
            TUrlImageView tUrlImageView2 = this.mIcon;
            if (tUrlImageView2 != null) {
                tUrlImageView2.setVisibility(8);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            this.mTitle.setText(str);
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        try {
            if (!str3.equalsIgnoreCase("#ffffff")) {
                this.mTitle.setTypeface(Typeface.DEFAULT_BOLD);
            } else {
                this.mTitle.setTypeface(Typeface.DEFAULT);
            }
            this.mTitle.setTextColor(Color.parseColor(str3));
        } catch (Exception unused) {
        }
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
            if (!TextUtils.isEmpty(str2)) {
                if (!str2.equals(this.mAliUrlImageView.getImageUrl())) {
                    this.mAliUrlImageView.setImageUrl(str2);
                }
            } else if (!TextUtils.isEmpty(str) && !str.equals(this.mAliUrlImageView.getImageUrl())) {
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

    @Override // com.taobao.android.live.plugin.atype.flexalocal.usertask.f
    public void hideEntryInnerText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bd1e53a", new Object[]{this});
            return;
        }
        TextView textView = this.mInnerGoldText;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
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
