package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.cgl;
import tb.ddu;
import tb.hfv;
import tb.kge;
import tb.xkw;

/* loaded from: classes5.dex */
public class SaysClusterLeftContentView extends FrameLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ADD_ONE_ICON = "https://img.alicdn.com/imgextra/i3/O1CN01BZMatI1TPL8KqWu9V_!!6000000002374-2-tps-100-56.png";
    private static final String TAG = "SaysClusterLeftContentView";
    private boolean disableAddOneComment;
    private View downView;
    private boolean isAnimating;
    private final Context mContext;
    private com.taobao.alilive.aliliveframework.frame.a mFrameContext;
    private ChatMessage mUpdateMsg;
    private View upView;

    static {
        kge.a(-1276700214);
        kge.a(-1518052375);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(SaysClusterLeftContentView saysClusterLeftContentView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(SaysClusterLeftContentView saysClusterLeftContentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d2da19c", new Object[]{saysClusterLeftContentView});
        } else {
            saysClusterLeftContentView.swapView();
        }
    }

    public static /* synthetic */ boolean access$102(SaysClusterLeftContentView saysClusterLeftContentView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13663d19", new Object[]{saysClusterLeftContentView, new Boolean(z)})).booleanValue();
        }
        saysClusterLeftContentView.isAnimating = z;
        return z;
    }

    public SaysClusterLeftContentView(Context context) {
        this(context, null);
    }

    public SaysClusterLeftContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SaysClusterLeftContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isAnimating = false;
        this.disableAddOneComment = false;
        this.mContext = context;
        initView(context);
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        this.upView = LayoutInflater.from(context).inflate(R.layout.taolive_bottom_syas_cluster_left_content_flexalocal, (ViewGroup) null);
        this.downView = LayoutInflater.from(context).inflate(R.layout.taolive_bottom_syas_cluster_left_content_flexalocal, (ViewGroup) null);
        addView(this.upView);
        addView(this.downView);
    }

    public void setFrameContext(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17230f1a", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.mFrameContext = aVar;
        }
    }

    public void updateLeftContent(ChatMessage chatMessage, int i, SpannableString spannableString) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586ebd1e", new Object[]{this, chatMessage, new Integer(i), spannableString});
        } else if (this.isAnimating || (view = this.downView) == null || this.upView == null) {
        } else {
            this.isAnimating = true;
            this.mUpdateMsg = chatMessage;
            setNickAndContent(chatMessage, spannableString, i, view);
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.upView, "alpha", 1.0f, 0.0f).setDuration(200L);
            View view2 = this.downView;
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(view2, "translationY", view2.getMeasuredHeight(), 0.0f).setDuration(200L);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster.SaysClusterLeftContentView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == -2145066406) {
                        super.onAnimationEnd((Animator) objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    super.onAnimationEnd(animator);
                    SaysClusterLeftContentView.access$000(SaysClusterLeftContentView.this);
                    SaysClusterLeftContentView.access$102(SaysClusterLeftContentView.this, false);
                }
            });
            animatorSet.playTogether(duration, duration2);
            animatorSet.start();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() != R.id.taolive_chat_says_cluster_add_one_wrapper) {
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.a(TAG, "[add one click]");
            ChatMessage chatMessage = this.mUpdateMsg;
            if (chatMessage == null || StringUtils.isEmpty(chatMessage.mContent)) {
                return;
            }
            HashMap hashMap = new HashMap();
            if (this.mUpdateMsg.renders != null && "anchor_custom_sticker".equals(this.mUpdateMsg.renders.get("commentType")) && this.mUpdateMsg.renders.containsKey("stickerId")) {
                hashMap.put("stickerId", this.mUpdateMsg.renders.get("stickerId"));
                hashMap.put("commentType", "anchor_custom_sticker");
            } else {
                hashMap.put("commentType", hfv.KEY_ADD_ONE);
            }
            hashMap.put("comment_location", "commentplus");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("content", (Object) this.mUpdateMsg.mContent);
            jSONObject.put("extendVal", (Object) hashMap);
            ddu e = this.mFrameContext.e();
            com.taobao.alilive.aliliveframework.frame.a aVar = this.mFrameContext;
            e.a(xkw.EVENT_SEND_COMMENT, jSONObject, aVar == null ? null : aVar.G());
        }
    }

    private void setNickAndContent(ChatMessage chatMessage, SpannableString spannableString, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc90a7f6", new Object[]{this, chatMessage, spannableString, new Integer(i), view});
        } else if (view != null) {
            TextView targetNickAndContentView = getTargetNickAndContentView(view);
            TUrlImageView targetAddOneView = getTargetAddOneView(view);
            if (targetNickAndContentView == null || targetAddOneView == null || chatMessage == null) {
                return;
            }
            view.setAlpha(1.0f);
            view.bringToFront();
            if (com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.e() && !this.disableAddOneComment) {
                targetAddOneView.setVisibility(0);
                targetAddOneView.setImageUrl(ADD_ONE_ICON);
            } else {
                targetAddOneView.setVisibility(8);
                i += com.taobao.taolive.room.utils.d.a(this.mContext, 25.0f);
            }
            targetNickAndContentView.setText((CharSequence) null);
            targetNickAndContentView.setVisibility(0);
            targetNickAndContentView.setTextColor(cgl.g().a().getResources().getColor(R.color.taolive_chat_follow_text_white));
            if (spannableString == null) {
                spannableString = genSaysClusterIconSpan();
            }
            targetNickAndContentView.append(spannableString);
            targetNickAndContentView.append(" ");
            String str = chatMessage.mUserNick + ResponseProtocolType.COMMENT;
            SpannableString spannableString2 = new SpannableString(str);
            spannableString2.setSpan(new ForegroundColorSpan(cgl.g().a().getResources().getColor(R.color.taolive_room_chat_color6)), 0, str.length(), 33);
            targetNickAndContentView.append(spannableString2);
            if (chatMessage.mSpannableContent != null) {
                for (SpannableString spannableString3 : chatMessage.mSpannableContent) {
                    targetNickAndContentView.append(spannableString3);
                }
            } else {
                targetNickAndContentView.append(chatMessage.mContent);
            }
            targetNickAndContentView.setMaxWidth(i);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            view.setLayoutParams(layoutParams);
        }
    }

    private void swapView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f0175f", new Object[]{this});
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.upView.getLayoutParams();
        layoutParams.width = this.downView.getWidth();
        layoutParams.height = this.downView.getHeight();
        this.upView.setLayoutParams(layoutParams);
        View view = this.downView;
        this.downView = this.upView;
        this.upView = view;
        this.upView.findViewById(R.id.taolive_chat_says_cluster_add_one_wrapper).setOnClickListener(this);
    }

    private TextView getTargetNickAndContentView(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("176360ae", new Object[]{this, view}) : (TextView) view.findViewById(R.id.taolive_chat_says_cluster_nick_content);
    }

    private TUrlImageView getTargetAddOneView(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("78912e22", new Object[]{this, view}) : (TUrlImageView) view.findViewById(R.id.taolive_chat_says_cluster_add_one);
    }

    private SpannableString genSaysClusterIconSpan() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("c13de0c", new Object[]{this});
        }
        int a2 = com.taobao.taolive.room.utils.d.a(this.mContext, 15.0f);
        Drawable drawable = cgl.g().a().getResources().getDrawable(R.drawable.taolive_chat_says_cluster_icon);
        SpannableString spannableString = new SpannableString("SaysIcon");
        drawable.setBounds(0, 0, (drawable.getIntrinsicWidth() * a2) / drawable.getIntrinsicHeight(), a2);
        spannableString.setSpan(new com.taobao.taolive.room.ui.chat.view.c(drawable), 0, 8, 33);
        return spannableString;
    }

    public void setDisableAddOneComment(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74a4199", new Object[]{this, new Boolean(z)});
        } else {
            this.disableAddOneComment = z;
        }
    }
}
