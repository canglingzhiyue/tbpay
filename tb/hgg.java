package tb;

import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes5.dex */
public class hgg extends hfy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TextView f28613a;

    static {
        kge.a(-808859212);
    }

    public static /* synthetic */ Object ipc$super(hgg hggVar, String str, Object... objArr) {
        if (str.hashCode() == -1523321416) {
            super.a((ChatMessage) objArr[0], (TBLiveDataModel) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public hgg(View view, a aVar) {
        super(view, aVar);
        this.f28613a = (TextView) view.findViewById(R.id.taolive_chat_item_content);
    }

    @Override // tb.hfy
    public void a(ChatMessage chatMessage, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a533f5b8", new Object[]{this, chatMessage, tBLiveDataModel});
            return;
        }
        super.a(chatMessage, tBLiveDataModel);
        a(chatMessage, this.itemView);
        String str = "";
        this.f28613a.setText((CharSequence) null);
        this.f28613a.setVisibility(0);
        if (chatMessage.mTextColor != 0) {
            this.f28613a.setTextColor(chatMessage.mTextColor);
        } else {
            this.f28613a.setTextColor(cgl.g().a().getResources().getColor(R.color.taolive_chat_follow_text_white));
        }
        if (chatMessage.mCommentIcons != null && !chatMessage.mCommentIcons.isEmpty()) {
            for (SpannableString spannableString : chatMessage.mCommentIcons) {
                this.f28613a.append(spannableString);
                this.f28613a.append(" ");
            }
        }
        String str2 = (chatMessage.renders != null && StringUtils.equals(chatMessage.renders.get(aw.PARAM_CHAT_RENDERS_ENHANCE), "rewardAutoComment")) ? chatMessage.mUserNick + " " : chatMessage.mUserNick + ResponseProtocolType.COMMENT;
        SpannableString spannableString2 = new SpannableString(str2);
        chatMessage.mNickColor = R.color.taolive_room_chat_color6;
        spannableString2.setSpan(new ForegroundColorSpan(cgl.g().a().getResources().getColor(chatMessage.mNickColor)), 0, str2.length(), 33);
        this.f28613a.append(spannableString2);
        if (!StringUtils.isEmpty(str2)) {
            str = str + str2;
        }
        if (chatMessage.mSpannableContent != null) {
            for (SpannableString spannableString3 : chatMessage.mSpannableContent) {
                this.f28613a.append(spannableString3);
            }
        } else {
            this.f28613a.append(chatMessage.mContent);
        }
        if (!StringUtils.isEmpty(chatMessage.mContent)) {
            str = str + chatMessage.mContent;
        }
        this.f28613a.setContentDescription(str);
        if (chatMessage.renders == null || !chatMessage.renders.containsKey("repliedEncryptUserId")) {
            return;
        }
        String str3 = chatMessage.renders.get("repliedEncryptUserId");
        if (StringUtils.isEmpty(str3) || tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null || !StringUtils.equals(str3, tBLiveDataModel.mVideoInfo.secretUserId)) {
            return;
        }
        this.itemView.setBackground(this.itemView.getResources().getDrawable(R.drawable.taolive_comment_bg_audience_answer_flexalocal));
    }
}
