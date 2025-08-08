package com.taobao.taolive.room.ui.chat.view;

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
import android.widget.TextView;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.ChatTopMessage;
import com.taobao.taobao.R;
import com.taobao.taolive.room.ui.view.TRoundLinearLayout;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.f;
import java.util.List;
import tb.kge;
import tb.pmd;
import tb.pqj;

/* loaded from: classes8.dex */
public class TopMessageView extends TRoundLinearLayout implements com.taobao.taolive.sdk.model.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int BELOVED_FANS_ALPHA_HIDE_DURATION = 700;
    private static final float BELOVED_FANS_BG_TRANS_ENTER_DST_DP = 13.5f;
    private static final float BELOVED_FANS_BG_TRANS_SHOW_DST_DP = 5.5f;
    private static final String BELOVED_FANS_IMAGE_URL = "https://img.alicdn.com/tfs/TB1NlhHlxvbeK8jSZPfXXariXXa-460-48.png";
    private static final float BELOVED_FANS_TEXT_TRANS_ENTER_DST_DP = 5.5f;
    private static final float BELOVED_FANS_TEXT_TRANS_SHOW_DST_DP = -3.5f;
    private static final int BELOVED_FANS_TRANS_ENTER_DURATION = 720;
    private static final int BELOVED_FANS_TRANS_HIDE_DURATION = 750;
    private static final int BELOVED_FANS_TRANS_SHOW_DURATION = 1880;
    private static final int DEFAULT_TOPMESSAGE_SHOW_SEC = 8000;
    private static final int MSG_HIDE_TOPVIEW_FORCE = 20001;
    private static final int MSG_LOWERING_LEVEL = 20000;
    private static final int[] RES_IDS;
    private static final String TAG;
    public static final String TAOLIVE_BELOVED_FANS_ENTER = "https://img.alicdn.com/imgextra/i2/O1CN01vExi6I25CTOl0cay4_!!6000000007490-2-tps-460-48.png";
    public float alpha;
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
    private AliUrlImageView mFanLevelIcon;
    private f mHandler;
    private b mStatusLisener;
    private ChatTopMessage mTopMessage;
    private TextView mTopMessageContent;
    private ImageView mTopMessageIcon;
    private AliUrlImageView[] mUserIcons;
    public float x;
    public float y;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes8.dex */
    public interface b {
    }

    public static /* synthetic */ Object ipc$super(TopMessageView topMessageView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ b access$000(TopMessageView topMessageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("73f18353", new Object[]{topMessageView}) : topMessageView.mStatusLisener;
    }

    public static /* synthetic */ TranslateAnimation access$100(TopMessageView topMessageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TranslateAnimation) ipChange.ipc$dispatch("eb6116ca", new Object[]{topMessageView}) : topMessageView.belovedFansForegroundShowTransAnim;
    }

    public static /* synthetic */ TranslateAnimation access$102(TopMessageView topMessageView, TranslateAnimation translateAnimation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TranslateAnimation) ipChange.ipc$dispatch("a31f02ba", new Object[]{topMessageView, translateAnimation});
        }
        topMessageView.belovedFansForegroundShowTransAnim = translateAnimation;
        return translateAnimation;
    }

    public static /* synthetic */ Context access$200(TopMessageView topMessageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("ef129cfb", new Object[]{topMessageView}) : topMessageView.mContext;
    }

    public static /* synthetic */ AliUrlImageView access$300(TopMessageView topMessageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliUrlImageView) ipChange.ipc$dispatch("7183acc4", new Object[]{topMessageView}) : topMessageView.belovedFansBGView;
    }

    public static /* synthetic */ TranslateAnimation access$400(TopMessageView topMessageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TranslateAnimation) ipChange.ipc$dispatch("447b84a7", new Object[]{topMessageView}) : topMessageView.belovedFansBackgroundShowTransAnim;
    }

    public static /* synthetic */ TranslateAnimation access$402(TopMessageView topMessageView, TranslateAnimation translateAnimation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TranslateAnimation) ipChange.ipc$dispatch("4cb96cbd", new Object[]{topMessageView, translateAnimation});
        }
        topMessageView.belovedFansBackgroundShowTransAnim = translateAnimation;
        return translateAnimation;
    }

    static {
        kge.a(1391731653);
        kge.a(-1905361424);
        TAG = TopMessageView.class.getSimpleName();
        RES_IDS = new int[]{R.id.taolive_chat_icon_1, R.id.taolive_chat_icon_2, R.id.taolive_chat_icon_3};
    }

    public TopMessageView(Context context) {
        this(context, null);
    }

    public TopMessageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHandler = new f(this);
        this.mContext = context;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mContentView = LayoutInflater.from(getContext()).inflate(R.layout.taolive_top_msg_layer_new, (ViewGroup) this, false);
        this.mTopMessageContent = (TextView) this.mContentView.findViewById(R.id.taolive_chat_item_content);
        this.mTopMessageContent.setMaxLines(2);
        this.mTopMessageIcon = (ImageView) this.mContentView.findViewById(R.id.taolive_chat_item_icon);
        this.mFanLevelIcon = (AliUrlImageView) this.mContentView.findViewById(R.id.taolive_room_chat_fans_level);
        this.mUserIcons = new AliUrlImageView[RES_IDS.length];
        while (true) {
            int[] iArr = RES_IDS;
            if (i < iArr.length) {
                this.mUserIcons[i] = (AliUrlImageView) this.mContentView.findViewById(iArr[i]);
                i++;
            } else {
                addView(this.mContentView);
                return;
            }
        }
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
        if (imageView != null) {
            imageView.setImageResource(i);
            this.mTopMessageIcon.setVisibility(0);
        }
        AliUrlImageView aliUrlImageView = this.mFanLevelIcon;
        if (aliUrlImageView == null) {
            return;
        }
        aliUrlImageView.setVisibility(8);
    }

    private void setVipIconByUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f45d0b", new Object[]{this});
            return;
        }
        List b2 = pqj.b(this.mTopMessage.renders.get("comment_icons"), VideoInfo.CommentIcon.class);
        for (int i = 0; i < RES_IDS.length; i++) {
            if (b2 == null || i >= b2.size()) {
                this.mUserIcons[i].setVisibility(8);
            } else {
                this.mUserIcons[i].setVisibility(0);
                this.mUserIcons[i].setImageUrl(((VideoInfo.CommentIcon) b2.get(i)).icon);
            }
        }
    }

    private void setFanLevelIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846e9053", new Object[]{this});
            return;
        }
        String fansIcon = getFansIcon();
        if (!StringUtils.isEmpty(fansIcon)) {
            this.mFanLevelIcon.setVisibility(0);
            this.mFanLevelIcon.setImageUrl(fansIcon);
            return;
        }
        this.mFanLevelIcon.setVisibility(8);
    }

    private void setIcon4FansLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b03b12", new Object[]{this});
            return;
        }
        setVipIconByUrl();
        setFanLevelIcon();
    }

    public void setBg(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fff5172", new Object[]{this, drawable});
            return;
        }
        try {
            this.mContentView.setBackgroundDrawable(drawable);
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
        if (chatTopMessage != null) {
            chatTopMessage.setShowRank();
        }
        this.mHandler.removeMessages(20000);
        int type = this.mTopMessage.getType();
        if (isBelovedFans() && (type == 1005 || type == 1040)) {
            this.mHandler.sendEmptyMessageDelayed(20000, 2600L);
        } else {
            this.mHandler.sendEmptyMessageDelayed(20000, 1600L);
        }
        this.mHandler.removeMessages(20001);
        this.mHandler.sendEmptyMessageDelayed(20001, 8000L);
    }

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
        ChatTopMessage chatTopMessage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        int i = message.what;
        if (i == 20000) {
            hideWithAnimation(new a() { // from class: com.taobao.taolive.room.ui.chat.view.TopMessageView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.room.ui.chat.view.TopMessageView.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    TopMessageView.this.setHideRank();
                    if (TopMessageView.access$000(TopMessageView.this) == null) {
                        return;
                    }
                    TopMessageView.access$000(TopMessageView.this);
                }
            });
        } else if (i != 20001 || (chatTopMessage = this.mTopMessage) == null) {
        } else {
            chatTopMessage.setHideRank();
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

    public void setShowStatusLisener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd57b97c", new Object[]{this, bVar});
        } else {
            this.mStatusLisener = bVar;
        }
    }

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

    public void setTopMessageView4Follow(ChatTopMessage chatTopMessage, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e2e393", new Object[]{this, chatTopMessage, new Integer(i)});
        } else if (chatTopMessage == null) {
        } else {
            setBg(getResources().getDrawable(R.drawable.taolive_chat_msg_follow_bg_flexalocal));
            setIcon(R.drawable.taolive_we_light);
            setTextColor(pmd.a().u().c().getResources().getColor(R.color.taolive_chat_follow_text));
            setText(pmd.a().u().c().getResources().getString(R.string.taolive_follow_hint, getQueueString4Follow(chatTopMessage, i)));
        }
    }

    public void setTopMessageView4Trade(ChatTopMessage chatTopMessage, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c170916", new Object[]{this, chatTopMessage, new Integer(i)});
        } else if (chatTopMessage == null) {
        } else {
            setBg(getResources().getDrawable(R.drawable.taolive_chat_msg_trade_bg_flexalocal));
            setIcon(R.drawable.taolive_cart_icon_white_new_flexalocal);
            setTextColor(pmd.a().u().c().getResources().getColor(17170443));
            setText(pmd.a().u().c().getResources().getString(R.string.taolive_trade_hint, getQueueString(chatTopMessage, i)));
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
            setText(pmd.a().u().c().getResources().getString(R.string.taolive_group_hint, getQueueString(chatTopMessage, i)));
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

    private String getQueueString4Follow(ChatTopMessage chatTopMessage, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("830edffa", new Object[]{this, chatTopMessage, new Integer(i)});
        }
        if (chatTopMessage == null) {
            return null;
        }
        String a2 = v.a(chatTopMessage.mUserNick);
        if (i <= 1) {
            return a2;
        }
        return a2 + "等" + String.valueOf(i) + "人";
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
        String str = this.mTopMessage.renders.get(com.taobao.taolive.room.ui.fanslevel.a.FANS_LEVEL_RENDER);
        if (!this.mTopMessage.showFansIcon()) {
            str = "0";
        }
        String c = com.taobao.taolive.room.ui.fanslevel.a.a().c(str);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(d.a(this.mContext, 12.0f));
        gradientDrawable.setColor(Color.parseColor("#000000"));
        if (!StringUtils.isEmpty(c)) {
            int parseColor = Color.parseColor(c);
            if (parseColor != 0) {
                Drawable wrap = DrawableCompat.wrap(gradientDrawable);
                DrawableCompat.setTintList(wrap, ColorStateList.valueOf(parseColor));
                return wrap;
            }
        } else {
            gradientDrawable.setAlpha(51);
        }
        return gradientDrawable;
    }

    private String getFansIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30a3508a", new Object[]{this});
        }
        String str = this.mTopMessage.renders.get(com.taobao.taolive.room.ui.fanslevel.a.FANS_LEVEL_RENDER);
        if (!this.mTopMessage.showFansIcon()) {
            str = "0";
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.equals(str, "0")) {
            return com.taobao.taolive.room.ui.fanslevel.a.a().a(str);
        }
        return null;
    }

    private void setTopMessageView(ChatTopMessage chatTopMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d827dcbd", new Object[]{this, chatTopMessage});
        } else if (chatTopMessage == null) {
        } else {
            setBg(getFansBg());
            setIcon4FansLevel();
            setTextColor(pmd.a().u().c().getResources().getColor(R.color.taolive_chat_follow_text));
            setText(chatTopMessage.mContent);
        }
    }

    public void setTopMessageView4Enter(ChatTopMessage chatTopMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3eb5c01", new Object[]{this, chatTopMessage});
            return;
        }
        setTopMessageView(chatTopMessage);
        if (!isBelovedFans()) {
            return;
        }
        this.mContentView.setBackgroundColor(Color.parseColor("#00000000"));
    }

    public void setTopMessageView4FansUpgrade(ChatTopMessage chatTopMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf606a5", new Object[]{this, chatTopMessage});
        } else {
            setTopMessageView(chatTopMessage);
        }
    }

    public void setTopMessageView4Biz(ChatTopMessage chatTopMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e8b6bc", new Object[]{this, chatTopMessage});
        } else {
            setTopMessageView(chatTopMessage);
        }
    }

    public void setTopViewStyle(ChatTopMessage chatTopMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f08d12bd", new Object[]{this, chatTopMessage});
        } else if (chatTopMessage == null) {
        } else {
            this.mTopMessage = chatTopMessage;
            ImageView imageView = this.mTopMessageIcon;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            AliUrlImageView aliUrlImageView = this.mFanLevelIcon;
            if (aliUrlImageView != null) {
                aliUrlImageView.setVisibility(8);
            }
            int type = this.mTopMessage.getType();
            if (type == 1011) {
                setTopMessageView4Trade(chatTopMessage, chatTopMessage.getMsgCnt());
            } else if (type == 1005 || type == 1040) {
                setTopMessageView4Enter(chatTopMessage);
            } else if (type == 1051) {
                setTopMessageView4FansUpgrade(chatTopMessage);
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

    public boolean isBelovedFans() {
        ChatTopMessage chatTopMessage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c89f5fb0", new Object[]{this})).booleanValue();
        }
        if (!aa.Q() || (chatTopMessage = this.mTopMessage) == null || chatTopMessage.renders == null) {
            return false;
        }
        try {
            String str = this.mTopMessage.renders.get(com.taobao.taolive.room.ui.fanslevel.a.FANS_LEVEL_RENDER);
            if (StringUtils.isEmpty(str)) {
                return false;
            }
            return Integer.valueOf(str).intValue() >= aa.R();
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public void setBelovedFansBGView(AliUrlImageView aliUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5657e74", new Object[]{this, aliUrlImageView});
        } else if (aliUrlImageView == null) {
        } else {
            aliUrlImageView.setImageUrl(TAOLIVE_BELOVED_FANS_ENTER);
            aliUrlImageView.asyncSetImageUrl(BELOVED_FANS_IMAGE_URL);
            aliUrlImageView.setSkipAutoSize(true);
            aliUrlImageView.setVisibility(4);
            this.belovedFansBGView = aliUrlImageView;
        }
    }

    public void showWithAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd8cd68", new Object[]{this});
            return;
        }
        setShowRank();
        if (getVisibility() == 0) {
            return;
        }
        float measuredWidth = getMeasuredWidth();
        if (measuredWidth <= 0.0f) {
            return;
        }
        if (isBelovedFans()) {
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
        this.belovedFansForegroundEnterTransAnim = new TranslateAnimation(0.0f - f, d.a(this.mContext, 5.5f), 0.0f, 0.0f);
        this.belovedFansForegroundEnterTransAnim.setDuration(720L);
        this.belovedFansForegroundEnterTransAnim.setInterpolator(new AccelerateDecelerateInterpolator());
        this.belovedFansForegroundEnterTransAnim.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.taolive.room.ui.chat.view.TopMessageView.2
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
                TopMessageView topMessageView;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    return;
                }
                TopMessageView.access$102(TopMessageView.this, new TranslateAnimation(d.a(TopMessageView.access$200(topMessageView), 5.5f), d.a(TopMessageView.access$200(TopMessageView.this), (float) TopMessageView.BELOVED_FANS_TEXT_TRANS_SHOW_DST_DP), 0.0f, 0.0f));
                TopMessageView.access$100(TopMessageView.this).setDuration(1880L);
                TopMessageView.access$100(TopMessageView.this).setInterpolator(new AccelerateDecelerateInterpolator());
                TopMessageView topMessageView2 = TopMessageView.this;
                topMessageView2.startAnimation(TopMessageView.access$100(topMessageView2));
                float measuredWidth = TopMessageView.access$300(TopMessageView.this).getMeasuredWidth();
                TopMessageView.access$402(TopMessageView.this, new TranslateAnimation((measuredWidth - d.e()) + d.a(TopMessageView.access$200(TopMessageView.this), (float) TopMessageView.BELOVED_FANS_BG_TRANS_ENTER_DST_DP), (measuredWidth - d.e()) + d.a(TopMessageView.access$200(TopMessageView.this), 5.5f), 0.0f, 0.0f));
                TopMessageView.access$400(TopMessageView.this).setDuration(1880L);
                TopMessageView.access$400(TopMessageView.this).setFillAfter(true);
                TopMessageView.access$300(TopMessageView.this).startAnimation(TopMessageView.access$400(TopMessageView.this));
            }
        });
        setVisibility(0);
        startAnimation(this.belovedFansForegroundEnterTransAnim);
        this.belovedFansBackgroundEnterTransAnim = new TranslateAnimation(d.e(), (this.belovedFansBGView.getMeasuredWidth() - d.e()) + d.a(this.mContext, (float) BELOVED_FANS_BG_TRANS_ENTER_DST_DP), 0.0f, 0.0f);
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

    public void hideWithAnimation(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("130e9f5c", new Object[]{this, aVar});
        } else if (getVisibility() == 4) {
        } else {
            if (isBelovedFans()) {
                startBelovedFansHideAnimation(aVar);
            } else {
                startCommonHideAnimation(aVar);
            }
        }
    }

    private void startBelovedFansHideAnimation(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7248903", new Object[]{this, aVar});
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(d.a(this.mContext, (float) BELOVED_FANS_TEXT_TRANS_SHOW_DST_DP), d.e(), 0.0f, 0.0f);
        translateAnimation.setDuration(750L);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.taolive.room.ui.chat.view.TopMessageView.3
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
                TopMessageView.this.setVisibility(4);
                TopMessageView.access$300(TopMessageView.this).setVisibility(4);
                a aVar2 = aVar;
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
        TranslateAnimation translateAnimation2 = new TranslateAnimation((this.belovedFansBGView.getMeasuredWidth() - d.e()) + d.a(this.mContext, 5.5f), 0 - d.e(), 0.0f, 0.0f);
        translateAnimation2.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation2.setDuration(750L);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(700L);
        this.belovedFansBackgroundHideAnimSet = new AnimationSet(true);
        this.belovedFansBackgroundHideAnimSet.addAnimation(alphaAnimation2);
        this.belovedFansBackgroundHideAnimSet.addAnimation(translateAnimation2);
        this.belovedFansBGView.startAnimation(this.belovedFansBackgroundHideAnimSet);
    }

    private void startCommonHideAnimation(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f14683", new Object[]{this, aVar});
            return;
        }
        this.commonHideAlphaAnim = new AlphaAnimation(1.0f, 0.0f);
        this.commonHideAlphaAnim.setDuration(200L);
        this.commonHideAlphaAnim.setInterpolator(new AccelerateDecelerateInterpolator());
        this.commonHideAlphaAnim.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.taolive.room.ui.chat.view.TopMessageView.4
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
                TopMessageView.this.setVisibility(4);
                a aVar2 = aVar;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a();
            }
        });
        startAnimation(this.commonHideAlphaAnim);
    }
}
