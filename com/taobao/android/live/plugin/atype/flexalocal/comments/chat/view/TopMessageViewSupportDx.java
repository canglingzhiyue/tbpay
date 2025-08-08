package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Message;
import android.support.v4.graphics.drawable.DrawableCompat;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.ChatTopMessage;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.TopMessageView2;
import com.taobao.taobao.R;
import com.taobao.taolive.room.ui.chat.view.TopMessageView;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.model.interact.MedalLevelEntity;
import java.util.List;
import tb.hkk;
import tb.kge;
import tb.ply;
import tb.pmd;

/* loaded from: classes5.dex */
public class TopMessageViewSupportDx extends BaseTopMessageView implements com.taobao.taolive.sdk.model.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int BELOVED_FANS_ALPHA_HIDE_DURATION = 700;
    private static final float BELOVED_FANS_BG_TRANS_ENTER_DST_DP = 13.5f;
    private static final float BELOVED_FANS_BG_TRANS_SHOW_DST_DP = 5.5f;
    private static final float BELOVED_FANS_TEXT_TRANS_ENTER_DST_DP = 5.5f;
    private static final float BELOVED_FANS_TEXT_TRANS_SHOW_DST_DP = -3.5f;
    private static final int BELOVED_FANS_TRANS_ENTER_DURATION = 720;
    private static final int BELOVED_FANS_TRANS_HIDE_DURATION = 750;
    private static final int BELOVED_FANS_TRANS_SHOW_DURATION = 1880;
    private static final int DEFAULT_TOPMESSAGE_SHOW_SEC = 8000;
    private static final int MSG_HIDE_TOPVIEW_FORCE = 20001;
    private static final int MSG_LOWERING_LEVEL = 20000;
    private static final String TAG;
    private AliUrlImageView belovedFansBGView;
    private TranslateAnimation belovedFansBackgroundEnterTransAnim;
    private AnimationSet belovedFansBackgroundHideAnimSet;
    private TranslateAnimation belovedFansBackgroundShowTransAnim;
    private TranslateAnimation belovedFansForegroundEnterTransAnim;
    private AnimationSet belovedFansForegroundHideAnimSet;
    private TranslateAnimation belovedFansForegroundShowTransAnim;
    private AlphaAnimation commonHideAlphaAnim;
    private TranslateAnimation commonShowTransAnim;
    private View mContentView;
    private Context mContext;
    private ViewGroup mDXContainer;
    private e mDXRender;
    private com.taobao.taolive.sdk.model.f mHandler;
    private LinearLayout mMediaContainer;
    private ViewGroup mNativeContainer;
    private TopMessageView2.b mStatusLisener;
    private ChatTopMessage mTopMessage;
    private TextView mTopMessageContent;
    private ImageView mTopMessageIcon;

    public static /* synthetic */ Object ipc$super(TopMessageViewSupportDx topMessageViewSupportDx, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ TopMessageView2.b access$000(TopMessageViewSupportDx topMessageViewSupportDx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TopMessageView2.b) ipChange.ipc$dispatch("4fcee472", new Object[]{topMessageViewSupportDx}) : topMessageViewSupportDx.mStatusLisener;
    }

    public static /* synthetic */ TranslateAnimation access$100(TopMessageViewSupportDx topMessageViewSupportDx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TranslateAnimation) ipChange.ipc$dispatch("b7663aa3", new Object[]{topMessageViewSupportDx}) : topMessageViewSupportDx.belovedFansForegroundShowTransAnim;
    }

    public static /* synthetic */ TranslateAnimation access$102(TopMessageViewSupportDx topMessageViewSupportDx, TranslateAnimation translateAnimation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TranslateAnimation) ipChange.ipc$dispatch("88ffb9fd", new Object[]{topMessageViewSupportDx, translateAnimation});
        }
        topMessageViewSupportDx.belovedFansForegroundShowTransAnim = translateAnimation;
        return translateAnimation;
    }

    public static /* synthetic */ Context access$200(TopMessageViewSupportDx topMessageViewSupportDx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("84da1b76", new Object[]{topMessageViewSupportDx}) : topMessageViewSupportDx.mContext;
    }

    public static /* synthetic */ AliUrlImageView access$300(TopMessageViewSupportDx topMessageViewSupportDx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliUrlImageView) ipChange.ipc$dispatch("a3807461", new Object[]{topMessageViewSupportDx}) : topMessageViewSupportDx.belovedFansBGView;
    }

    public static /* synthetic */ TranslateAnimation access$400(TopMessageViewSupportDx topMessageViewSupportDx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TranslateAnimation) ipChange.ipc$dispatch("a9741e26", new Object[]{topMessageViewSupportDx}) : topMessageViewSupportDx.belovedFansBackgroundShowTransAnim;
    }

    public static /* synthetic */ TranslateAnimation access$402(TopMessageViewSupportDx topMessageViewSupportDx, TranslateAnimation translateAnimation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TranslateAnimation) ipChange.ipc$dispatch("113be29a", new Object[]{topMessageViewSupportDx, translateAnimation});
        }
        topMessageViewSupportDx.belovedFansBackgroundShowTransAnim = translateAnimation;
        return translateAnimation;
    }

    static {
        kge.a(1009532394);
        kge.a(-1905361424);
        TAG = TopMessageView2.class.getSimpleName();
    }

    public TopMessageViewSupportDx(Context context) {
        this(context, null);
    }

    public TopMessageViewSupportDx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopMessageViewSupportDx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHandler = new com.taobao.taolive.sdk.model.f(this);
        this.mContext = context;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mContentView = LayoutInflater.from(getContext()).inflate(R.layout.taolive_top_msg_layer_new_2_flexalocal, (ViewGroup) this, false);
        this.mDXContainer = (ViewGroup) this.mContentView.findViewById(R.id.taolive_top_msg_dx);
        this.mNativeContainer = (ViewGroup) this.mContentView.findViewById(R.id.taolive_top_msg_native);
        this.mTopMessageContent = (TextView) this.mContentView.findViewById(R.id.taolive_chat_item_content);
        this.mTopMessageContent.setMaxLines(2);
        this.mTopMessageIcon = (ImageView) this.mContentView.findViewById(R.id.taolive_chat_item_icon);
        this.mMediaContainer = (LinearLayout) this.mContentView.findViewById(R.id.taolive_media_list_container);
        addView(this.mContentView);
        this.mDXRender = new e();
    }

    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
            return;
        }
        TextView textView = this.mTopMessageContent;
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.mTopMessageContent;
        if (textView == null) {
            return;
        }
        textView.setTextColor(i);
    }

    public void setIcon(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b5841", new Object[]{this, new Integer(i)});
            return;
        }
        ImageView imageView = this.mTopMessageIcon;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(i);
        this.mTopMessageIcon.setVisibility(0);
    }

    private void setIcon4FansLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b03b12", new Object[]{this});
        } else {
            setMediaList();
        }
    }

    private void setMediaList() {
        List<MedalLevelEntity> medalLevelList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47688e7", new Object[]{this});
            return;
        }
        ChatTopMessage chatTopMessage = this.mTopMessage;
        if (chatTopMessage == null || (medalLevelList = chatTopMessage.getMedalLevelList()) == null || medalLevelList.isEmpty()) {
            return;
        }
        for (MedalLevelEntity medalLevelEntity : medalLevelList) {
            AliUrlImageView aliUrlImageView = new AliUrlImageView(this.mContext);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(com.taobao.taolive.room.utils.d.a(this.mContext, medalLevelEntity.width / 2), com.taobao.taolive.room.utils.d.a(this.mContext, medalLevelEntity.height / 2));
            layoutParams.rightMargin = com.taobao.taolive.room.utils.d.a(this.mContext, 4.0f);
            this.mMediaContainer.addView(aliUrlImageView, layoutParams);
            aliUrlImageView.setImageUrl(medalLevelEntity.medalIcon);
        }
    }

    public void setBg(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fff5172", new Object[]{this, drawable});
            return;
        }
        try {
            this.mNativeContainer.setBackgroundDrawable(drawable);
        } catch (Exception unused) {
        }
    }

    public void setShowRank() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73a45a52", new Object[]{this});
            return;
        }
        ChatTopMessage chatTopMessage = this.mTopMessage;
        if (chatTopMessage == null) {
            return;
        }
        chatTopMessage.setShowRank();
        this.mHandler.removeMessages(20000);
        int i = 1600;
        if (this.mTopMessage.mShowTime > 0) {
            i = this.mTopMessage.mShowTime;
        }
        int type = this.mTopMessage.getType();
        if (isSpecialEnterEffect() && (type == 1005 || type == 1040)) {
            i = 2600;
        }
        this.mHandler.sendEmptyMessageDelayed(20000, i);
        this.mHandler.removeMessages(20001);
        this.mHandler.sendEmptyMessageDelayed(20001, 8000L);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.BaseTopMessageView
    public void setHideRank() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ef4797", new Object[]{this});
            return;
        }
        this.mHandler.removeCallbacksAndMessages(null);
        ChatTopMessage chatTopMessage = this.mTopMessage;
        if (chatTopMessage == null) {
            return;
        }
        chatTopMessage.setHideRank();
    }

    public String getText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("97297536", new Object[]{this}) : String.valueOf(this.mTopMessageContent.getText());
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        int i = message.what;
        if (i == 20000) {
            hideWithAnimation(new TopMessageView2.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.TopMessageViewSupportDx.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.TopMessageView2.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    TopMessageViewSupportDx.this.setHideRank();
                    if (TopMessageViewSupportDx.access$000(TopMessageViewSupportDx.this) == null) {
                        return;
                    }
                    TopMessageViewSupportDx.access$000(TopMessageViewSupportDx.this).a();
                }
            });
        } else if (i != 20001) {
        } else {
            ChatTopMessage chatTopMessage = this.mTopMessage;
            if (chatTopMessage != null) {
                chatTopMessage.setHideRank();
            }
            TopMessageView2.b bVar = this.mStatusLisener;
            if (bVar == null) {
                return;
            }
            bVar.b();
        }
    }

    public void setMessage(ChatTopMessage chatTopMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111c8349", new Object[]{this, chatTopMessage});
        } else {
            this.mTopMessage = chatTopMessage;
        }
    }

    public ChatTopMessage getMessage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ChatTopMessage) ipChange.ipc$dispatch("74ced13b", new Object[]{this}) : this.mTopMessage;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.BaseTopMessageView
    public void setShowStatusLisener(TopMessageView2.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349db4ba", new Object[]{this, bVar});
        } else {
            this.mStatusLisener = bVar;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.BaseTopMessageView
    public void releaseAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5cec944", new Object[]{this});
            return;
        }
        TranslateAnimation translateAnimation = this.commonShowTransAnim;
        if (translateAnimation != null) {
            translateAnimation.cancel();
            this.commonShowTransAnim = null;
        }
        AlphaAnimation alphaAnimation = this.commonHideAlphaAnim;
        if (alphaAnimation != null) {
            alphaAnimation.cancel();
            this.commonHideAlphaAnim = null;
        }
        TranslateAnimation translateAnimation2 = this.belovedFansForegroundEnterTransAnim;
        if (translateAnimation2 != null) {
            translateAnimation2.cancel();
            this.belovedFansForegroundEnterTransAnim = null;
        }
        TranslateAnimation translateAnimation3 = this.belovedFansBackgroundEnterTransAnim;
        if (translateAnimation3 != null) {
            translateAnimation3.cancel();
            this.belovedFansBackgroundEnterTransAnim = null;
        }
        TranslateAnimation translateAnimation4 = this.belovedFansForegroundShowTransAnim;
        if (translateAnimation4 != null) {
            translateAnimation4.cancel();
            this.belovedFansForegroundShowTransAnim = null;
        }
        TranslateAnimation translateAnimation5 = this.belovedFansBackgroundShowTransAnim;
        if (translateAnimation5 != null) {
            translateAnimation5.cancel();
            this.belovedFansBackgroundShowTransAnim = null;
        }
        AnimationSet animationSet = this.belovedFansForegroundHideAnimSet;
        if (animationSet != null) {
            animationSet.cancel();
            this.belovedFansForegroundHideAnimSet = null;
        }
        AnimationSet animationSet2 = this.belovedFansBackgroundHideAnimSet;
        if (animationSet2 == null) {
            return;
        }
        animationSet2.cancel();
        this.belovedFansBackgroundHideAnimSet = null;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.BaseTopMessageView
    public boolean isHighRank(ChatTopMessage chatTopMessage) {
        ChatTopMessage chatTopMessage2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf63cf80", new Object[]{this, chatTopMessage})).booleanValue();
        }
        if (chatTopMessage != null && (chatTopMessage2 = this.mTopMessage) != null) {
            return chatTopMessage2.isHighRank(chatTopMessage.getRank());
        }
        return false;
    }

    public void setTopMessageView4Trade(ChatTopMessage chatTopMessage, int i) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c170916", new Object[]{this, chatTopMessage, new Integer(i)});
        } else if (hkk.az() && hkk.R() && (viewGroup = this.mNativeContainer) != null) {
            viewGroup.setVisibility(8);
        } else if (chatTopMessage == null) {
        } else {
            setBg(getResources().getDrawable(R.drawable.taolive_chat_msg_trade_bg_flexalocal));
            setIcon(R.drawable.taolive_cart_icon_white_new_flexalocal);
            setTextColor(pmd.a().u().c().getResources().getColor(17170443));
            setText(pmd.a().u().c().getResources().getString(R.string.taolive_trade_hint_flexalocal, getQueueString(chatTopMessage, i)));
        }
    }

    public void setTopMessageView4GroupMsg(ChatTopMessage chatTopMessage, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7c261e2", new Object[]{this, chatTopMessage, new Integer(i)});
        } else if (chatTopMessage == null) {
        } else {
            setBg(getResources().getDrawable(R.drawable.taolive_chat_msg_group_bg_flexalocal));
            setIcon4FansLevel();
            setTextColor(pmd.a().u().c().getResources().getColor(17170443));
            setText(pmd.a().u().c().getResources().getString(R.string.taolive_group_hint_flexalocal, getQueueString(chatTopMessage, i)));
        }
    }

    public void setTopMessageView4CommonTips(ChatTopMessage chatTopMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903b7f82", new Object[]{this, chatTopMessage});
            return;
        }
        Drawable drawable = getResources().getDrawable(R.drawable.taolive_chat_msg_trade_bg_flexalocal);
        int bgColor = chatTopMessage.getBgColor();
        if (bgColor != 0) {
            Drawable wrap = DrawableCompat.wrap(drawable);
            DrawableCompat.setTintList(wrap, ColorStateList.valueOf(bgColor));
            setBackgroundDrawable(wrap);
        } else {
            setBackgroundDrawable(drawable);
        }
        setIcon4FansLevel();
        setTextColor(pmd.a().u().c().getResources().getColor(17170443));
        String g = v.g(chatTopMessage.mUserNick);
        setText(g + " " + chatTopMessage.mContent);
    }

    public void setTopMessageView4StageGroupTips(ChatTopMessage chatTopMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("720c55b8", new Object[]{this, chatTopMessage});
        } else if (chatTopMessage == null) {
        } else {
            setBg(getResources().getDrawable(R.drawable.taolive_chat_msg_stage_group_bg_flexalocal));
            setTextColor(pmd.a().u().c().getResources().getColor(17170443));
            String g = v.g(chatTopMessage.mUserNick);
            setText(g + " " + chatTopMessage.mContent);
        }
    }

    private String getQueueString(ChatTopMessage chatTopMessage, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56628d8d", new Object[]{this, chatTopMessage, new Integer(i)});
        }
        if (chatTopMessage == null) {
            return null;
        }
        if (i > 1) {
            return chatTopMessage.mUserNick + "等" + String.valueOf(i) + "人";
        }
        return chatTopMessage.mUserNick;
    }

    private Drawable getFansBg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("679d458", new Object[]{this});
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(com.taobao.taolive.room.utils.d.a(this.mContext, 12.0f));
        gradientDrawable.setColor(Color.parseColor("#000000"));
        try {
            String enterBgColor = getEnterBgColor();
            if (!StringUtils.isEmpty(enterBgColor)) {
                int parseColor = Color.parseColor(enterBgColor);
                if (parseColor != 0) {
                    Drawable wrap = DrawableCompat.wrap(gradientDrawable);
                    DrawableCompat.setTintList(wrap, ColorStateList.valueOf(parseColor));
                    wrap.setAlpha(76);
                    return wrap;
                }
            } else {
                gradientDrawable.setAlpha(51);
            }
            return gradientDrawable;
        } catch (Exception unused) {
            gradientDrawable.setAlpha(51);
            return gradientDrawable;
        }
    }

    private String getEnterBgColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abbd51dd", new Object[]{this});
        }
        ChatTopMessage chatTopMessage = this.mTopMessage;
        if (chatTopMessage == null || StringUtils.isEmpty(chatTopMessage.getTopMessageBgColor())) {
            return null;
        }
        return this.mTopMessage.getTopMessageBgColor();
    }

    private void setTopMessageView(ChatTopMessage chatTopMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d827dcbd", new Object[]{this, chatTopMessage});
        } else if (chatTopMessage == null) {
        } else {
            setBg(getFansBg());
            setIcon4FansLevel();
            setTextColor(pmd.a().u().c().getResources().getColor(R.color.taolive_commments_chat_follow_text));
            setText(chatTopMessage.mContent);
        }
    }

    public void setTopMessageView4Enter(ChatTopMessage chatTopMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3eb5c01", new Object[]{this, chatTopMessage});
            return;
        }
        setBg(getFansBg());
        setIcon4FansLevel();
        setTextColor(pmd.a().u().c().getResources().getColor(R.color.taolive_commments_chat_follow_text));
        setText(chatTopMessage.mContent);
        if (!isSpecialEnterEffect()) {
            return;
        }
        this.mNativeContainer.setBackgroundColor(Color.parseColor("#00000000"));
    }

    public void setTopMessageView4Biz(ChatTopMessage chatTopMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e8b6bc", new Object[]{this, chatTopMessage});
        } else {
            setTopMessageView(chatTopMessage);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.BaseTopMessageView
    public void setTopViewStyle(ChatTopMessage chatTopMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f08d12bd", new Object[]{this, chatTopMessage});
        } else if (chatTopMessage == null) {
        } else {
            this.mNativeContainer.setVisibility(0);
            this.mDXContainer.setVisibility(8);
            this.mTopMessage = chatTopMessage;
            ImageView imageView = this.mTopMessageIcon;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            this.mMediaContainer.removeAllViews();
            int type = this.mTopMessage.getType();
            if (type == 1011) {
                setTopMessageView4Trade(chatTopMessage, chatTopMessage.getMsgCnt());
            } else if (type == 1005 || type == 1040 || type == 3008) {
                setTopMessageView4Enter(chatTopMessage);
            } else if (type == 2037) {
                setTopMessageView4Biz(chatTopMessage);
            } else if (type == 1057) {
                setTopMessageView4CommonTips(chatTopMessage);
            } else if (type == 1062) {
                setTopMessageView4StageGroupTips(chatTopMessage);
            } else if (type != 10035) {
            } else {
                setTopMessageView4GroupMsg(chatTopMessage, chatTopMessage.getMsgCnt());
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.BaseTopMessageView
    public void setTopViewStyleDX(ChatTopMessage chatTopMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60388411", new Object[]{this, chatTopMessage});
        } else if (chatTopMessage == null) {
        } else {
            this.mTopMessage = chatTopMessage;
            this.mNativeContainer.setVisibility(8);
            this.mDXContainer.setVisibility(0);
            this.mDXRender.a(this.mDXContainer, chatTopMessage);
        }
    }

    public boolean isSpecialEnterEffect() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a36e2e65", new Object[]{this})).booleanValue() : !com.taobao.taolive.room.utils.d.i(getContext()) && (isBelovedFans() || isSuperFans());
    }

    private boolean isBelovedFans() {
        ChatTopMessage chatTopMessage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c89f5fb0", new Object[]{this})).booleanValue();
        }
        if (!ply.f() || (chatTopMessage = this.mTopMessage) == null || chatTopMessage.renders == null) {
            return false;
        }
        try {
            String str = this.mTopMessage.renders.get(com.taobao.taolive.room.ui.fanslevel.a.FANS_LEVEL_RENDER);
            if (StringUtils.isEmpty(str)) {
                return false;
            }
            return Integer.valueOf(str).intValue() >= ply.g();
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private boolean isSuperFans() {
        ChatTopMessage chatTopMessage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eabafbdc", new Object[]{this})).booleanValue();
        }
        if (!ply.i() || (chatTopMessage = this.mTopMessage) == null || chatTopMessage.renders == null) {
            return false;
        }
        try {
            String str = this.mTopMessage.renders.get(com.taobao.taolive.room.ui.fanslevel.a.FANS_LEVEL_RENDER);
            if (StringUtils.isEmpty(str)) {
                return false;
            }
            return Integer.valueOf(str).intValue() >= ply.j();
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.BaseTopMessageView
    public void setBelovedFansBGView(AliUrlImageView aliUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5657e74", new Object[]{this, aliUrlImageView});
        } else if (aliUrlImageView == null) {
        } else {
            aliUrlImageView.setSkipAutoSize(true);
            aliUrlImageView.setVisibility(4);
            this.belovedFansBGView = aliUrlImageView;
        }
    }

    public void updateSpecialEnterEffectRes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8512a2e", new Object[]{this});
        } else if (this.belovedFansBGView == null) {
        } else {
            if (isSuperFans()) {
                this.belovedFansBGView.asyncSetImageUrl(ply.k());
            } else if (!isBelovedFans()) {
            } else {
                this.belovedFansBGView.setImageUrl(TopMessageView.TAOLIVE_BELOVED_FANS_ENTER);
                this.belovedFansBGView.asyncSetImageUrl(ply.h());
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.BaseTopMessageView
    public void showWithAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd8cd68", new Object[]{this});
            return;
        }
        updateSpecialEnterEffectRes();
        setShowRank();
        if (getVisibility() == 0) {
            return;
        }
        float measuredWidth = getMeasuredWidth();
        if (measuredWidth <= 0.0f) {
            return;
        }
        if (isSpecialEnterEffect()) {
            startBelovedFansShowAnimation(measuredWidth);
        } else {
            startCommonShowAnimation(measuredWidth);
        }
    }

    private void startBelovedFansShowAnimation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a64af9bf", new Object[]{this, new Float(f)});
            return;
        }
        this.belovedFansForegroundEnterTransAnim = new TranslateAnimation(0.0f - f, com.taobao.taolive.room.utils.d.a(this.mContext, 5.5f), 0.0f, 0.0f);
        this.belovedFansForegroundEnterTransAnim.setDuration(720L);
        this.belovedFansForegroundEnterTransAnim.setInterpolator(new AccelerateDecelerateInterpolator());
        this.belovedFansForegroundEnterTransAnim.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.TopMessageViewSupportDx.2
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
                TopMessageViewSupportDx topMessageViewSupportDx;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    return;
                }
                TopMessageViewSupportDx.access$102(TopMessageViewSupportDx.this, new TranslateAnimation(com.taobao.taolive.room.utils.d.a(TopMessageViewSupportDx.access$200(topMessageViewSupportDx), 5.5f), com.taobao.taolive.room.utils.d.a(TopMessageViewSupportDx.access$200(TopMessageViewSupportDx.this), (float) TopMessageViewSupportDx.BELOVED_FANS_TEXT_TRANS_SHOW_DST_DP), 0.0f, 0.0f));
                TopMessageViewSupportDx.access$100(TopMessageViewSupportDx.this).setDuration(1880L);
                TopMessageViewSupportDx.access$100(TopMessageViewSupportDx.this).setInterpolator(new AccelerateDecelerateInterpolator());
                TopMessageViewSupportDx topMessageViewSupportDx2 = TopMessageViewSupportDx.this;
                topMessageViewSupportDx2.startAnimation(TopMessageViewSupportDx.access$100(topMessageViewSupportDx2));
                float measuredWidth = TopMessageViewSupportDx.access$300(TopMessageViewSupportDx.this).getMeasuredWidth();
                TopMessageViewSupportDx.access$402(TopMessageViewSupportDx.this, new TranslateAnimation((measuredWidth - com.taobao.taolive.room.utils.d.e()) + com.taobao.taolive.room.utils.d.a(TopMessageViewSupportDx.access$200(TopMessageViewSupportDx.this), (float) TopMessageViewSupportDx.BELOVED_FANS_BG_TRANS_ENTER_DST_DP), (measuredWidth - com.taobao.taolive.room.utils.d.e()) + com.taobao.taolive.room.utils.d.a(TopMessageViewSupportDx.access$200(TopMessageViewSupportDx.this), 5.5f), 0.0f, 0.0f));
                TopMessageViewSupportDx.access$400(TopMessageViewSupportDx.this).setDuration(1880L);
                TopMessageViewSupportDx.access$400(TopMessageViewSupportDx.this).setFillAfter(true);
                TopMessageViewSupportDx.access$300(TopMessageViewSupportDx.this).startAnimation(TopMessageViewSupportDx.access$400(TopMessageViewSupportDx.this));
            }
        });
        setVisibility(0);
        startAnimation(this.belovedFansForegroundEnterTransAnim);
        this.belovedFansBackgroundEnterTransAnim = new TranslateAnimation(com.taobao.taolive.room.utils.d.e(), (this.belovedFansBGView.getMeasuredWidth() - com.taobao.taolive.room.utils.d.e()) + com.taobao.taolive.room.utils.d.a(this.mContext, (float) BELOVED_FANS_BG_TRANS_ENTER_DST_DP), 0.0f, 0.0f);
        this.belovedFansBackgroundEnterTransAnim.setDuration(720L);
        this.belovedFansBackgroundEnterTransAnim.setFillAfter(true);
        this.belovedFansBackgroundEnterTransAnim.setInterpolator(new AccelerateDecelerateInterpolator());
        this.belovedFansBGView.setVisibility(0);
        this.belovedFansBGView.startAnimation(this.belovedFansBackgroundEnterTransAnim);
    }

    private void startCommonShowAnimation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f14d73f", new Object[]{this, new Float(f)});
            return;
        }
        this.commonShowTransAnim = new TranslateAnimation(0.0f - f, 0.0f, 0.0f, 0.0f);
        this.commonShowTransAnim.setDuration(400L);
        this.commonShowTransAnim.setInterpolator(new AccelerateDecelerateInterpolator());
        setVisibility(0);
        startAnimation(this.commonShowTransAnim);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.BaseTopMessageView
    public void hideWithAnimation(TopMessageView2.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a25a5e3c", new Object[]{this, aVar});
        } else if (getVisibility() == 4) {
        } else {
            if (isSpecialEnterEffect()) {
                startBelovedFansHideAnimation(aVar);
            } else {
                startCommonHideAnimation(aVar);
            }
        }
    }

    private void startBelovedFansHideAnimation(final TopMessageView2.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d40ffb5", new Object[]{this, aVar});
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(com.taobao.taolive.room.utils.d.a(this.mContext, (float) BELOVED_FANS_TEXT_TRANS_SHOW_DST_DP), com.taobao.taolive.room.utils.d.e(), 0.0f, 0.0f);
        translateAnimation.setDuration(750L);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.TopMessageViewSupportDx.3
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
                TopMessageViewSupportDx.this.setVisibility(4);
                TopMessageViewSupportDx.access$300(TopMessageViewSupportDx.this).setVisibility(4);
                TopMessageView2.a aVar2 = aVar;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a();
            }
        });
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(700L);
        this.belovedFansForegroundHideAnimSet = new AnimationSet(true);
        this.belovedFansForegroundHideAnimSet.addAnimation(alphaAnimation);
        this.belovedFansForegroundHideAnimSet.addAnimation(translateAnimation);
        startAnimation(this.belovedFansForegroundHideAnimSet);
        TranslateAnimation translateAnimation2 = new TranslateAnimation((this.belovedFansBGView.getMeasuredWidth() - com.taobao.taolive.room.utils.d.e()) + com.taobao.taolive.room.utils.d.a(this.mContext, 5.5f), 0 - com.taobao.taolive.room.utils.d.e(), 0.0f, 0.0f);
        translateAnimation2.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation2.setDuration(750L);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(700L);
        this.belovedFansBackgroundHideAnimSet = new AnimationSet(true);
        this.belovedFansBackgroundHideAnimSet.addAnimation(alphaAnimation2);
        this.belovedFansBackgroundHideAnimSet.addAnimation(translateAnimation2);
        this.belovedFansBGView.startAnimation(this.belovedFansBackgroundHideAnimSet);
    }

    private void startCommonHideAnimation(final TopMessageView2.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b3c9235", new Object[]{this, aVar});
            return;
        }
        this.commonHideAlphaAnim = new AlphaAnimation(1.0f, 0.0f);
        this.commonHideAlphaAnim.setDuration(200L);
        this.commonHideAlphaAnim.setInterpolator(new AccelerateDecelerateInterpolator());
        this.commonHideAlphaAnim.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.TopMessageViewSupportDx.4
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
                TopMessageViewSupportDx.this.setVisibility(4);
                TopMessageView2.a aVar2 = aVar;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a();
            }
        });
        startAnimation(this.commonHideAlphaAnim);
    }
}
