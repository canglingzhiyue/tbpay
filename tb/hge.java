package tb;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.utils.b;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes5.dex */
public class hge extends hfy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TextView f28611a;
    private LinearLayout f;

    static {
        kge.a(-1649968245);
    }

    public static /* synthetic */ Object ipc$super(hge hgeVar, String str, Object... objArr) {
        if (str.hashCode() == -1523321416) {
            super.a((ChatMessage) objArr[0], (TBLiveDataModel) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public hge(ViewGroup viewGroup, View view, a aVar) {
        super(view, aVar);
        this.f = (LinearLayout) view.findViewById(R.id.taolive_chat_root_view);
        this.f28611a = (TextView) view.findViewById(R.id.taolive_chat_item_content);
    }

    @Override // tb.hfy
    public void a(ChatMessage chatMessage, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a533f5b8", new Object[]{this, chatMessage, tBLiveDataModel});
            return;
        }
        super.a(chatMessage, tBLiveDataModel);
        a(chatMessage);
        this.f28611a.setText((CharSequence) null);
        this.f28611a.setVisibility(0);
        if (chatMessage.mTextColor != 0) {
            this.f28611a.setTextColor(chatMessage.mTextColor);
        } else {
            this.f28611a.setTextColor(cgl.g().a().getResources().getColor(R.color.taolive_commments_chat_follow_text));
        }
        if (chatMessage.mCommentIcons != null && !chatMessage.mCommentIcons.isEmpty()) {
            for (SpannableString spannableString : chatMessage.mCommentIcons) {
                this.f28611a.append(spannableString);
                this.f28611a.append(" ");
            }
        }
        String str = chatMessage.mUserNick + ResponseProtocolType.COMMENT;
        SpannableString spannableString2 = new SpannableString(str);
        chatMessage.mNickColor = R.color.taolive_room_chat_color6;
        spannableString2.setSpan(new ForegroundColorSpan(cgl.g().a().getResources().getColor(chatMessage.mNickColor)), 0, str.length(), 33);
        this.f28611a.append(spannableString2);
        if (chatMessage.mSpannableContent != null) {
            for (SpannableString spannableString3 : chatMessage.mSpannableContent) {
                this.f28611a.append(spannableString3);
            }
            return;
        }
        this.f28611a.append(chatMessage.mContent);
    }

    private void a(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d487357f", new Object[]{this, chatMessage});
        } else if (chatMessage == null) {
        } else {
            try {
                if (chatMessage.renders == null || !chatMessage.renders.containsKey("backgroundStyle")) {
                    return;
                }
                JSONObject jSONObject = (JSONObject) JSONObject.parse(chatMessage.renders.get("backgroundStyle"));
                String string = jSONObject.getString("startColor");
                String string2 = jSONObject.getString("endColor");
                Drawable drawable = this.f28611a.getResources().getDrawable(R.drawable.taolive_comment_bg_qustion_answer_flexalocal);
                if (!(drawable instanceof GradientDrawable)) {
                    return;
                }
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                int[] iArr = {Color.parseColor(string), Color.parseColor(string2)};
                if (Build.VERSION.SDK_INT >= 16) {
                    gradientDrawable.setColors(iArr);
                }
                gradientDrawable.setCornerRadius(b.a(this.d, 12.0f));
                if (Build.VERSION.SDK_INT < 16) {
                    return;
                }
                this.f.setBackground(gradientDrawable);
            } catch (Exception unused) {
            }
        }
    }
}
