package tb;

import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes5.dex */
public class hgd extends hfy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TextView f28610a;
    private TUrlImageView f;

    static {
        kge.a(-1375139501);
    }

    public static /* synthetic */ Object ipc$super(hgd hgdVar, String str, Object... objArr) {
        if (str.hashCode() == -1523321416) {
            super.a((ChatMessage) objArr[0], (TBLiveDataModel) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public hgd(View view, a aVar) {
        super(view, aVar);
        this.f28610a = (TextView) view.findViewById(R.id.taolive_chat_item_content);
        this.f = (TUrlImageView) view.findViewById(R.id.taolive_chat_item_icon);
    }

    @Override // tb.hfy
    public void a(ChatMessage chatMessage, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a533f5b8", new Object[]{this, chatMessage, tBLiveDataModel});
            return;
        }
        super.a(chatMessage, tBLiveDataModel);
        this.itemView.setBackgroundDrawable(cgl.g().a().getResources().getDrawable(R.drawable.taolive_chat_msg_follow_bg_flexalocal));
        this.f.setVisibility(0);
        this.f.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01kibZ3i28x8bDtL26m_!!6000000007998-2-tps-64-50.png");
        this.f28610a.setVisibility(0);
        this.f28610a.setTextColor(cgl.g().a().getResources().getColor(R.color.taolive_commments_chat_follow_text));
        this.f28610a.setText(cgl.g().a().getResources().getString(R.string.taolive_follow_hint_flexalocal, v.a(chatMessage.mUserNick)));
    }
}
