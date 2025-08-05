package tb;

import android.view.View;
import android.widget.FrameLayout;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.utils.q;

/* loaded from: classes5.dex */
public class hga extends hfy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f28606a;
    private int f;

    static {
        kge.a(-780454005);
    }

    public static /* synthetic */ Object ipc$super(hga hgaVar, String str, Object... objArr) {
        if (str.hashCode() == -1523321416) {
            super.a((ChatMessage) objArr[0], (TBLiveDataModel) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public hga(View view, a aVar) {
        super(view, aVar);
        this.f = Result.ALIPAY_BASE64_ENCODE_ERROR;
        this.f28606a = (FrameLayout) view.findViewById(R.id.taolive_chat_root_view);
        this.f = d.b(this.d, plz.b(this.d));
    }

    @Override // tb.hfy
    public void a(ChatMessage chatMessage, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a533f5b8", new Object[]{this, chatMessage, tBLiveDataModel});
            return;
        }
        super.a(chatMessage, tBLiveDataModel);
        ChatMessage.ChatItemCommonData chatItemCommonData = chatMessage.chatItemCommonData;
        String str = chatItemCommonData.templateName;
        String str2 = chatItemCommonData.bizType;
        String str3 = chatItemCommonData.showType;
        q.b("DynamicXCommonViewHolder", "showPermanentBottomView bizType:" + str2 + " templateName:" + str + " showType:" + str3);
        if (chatItemCommonData.data != null) {
            chatItemCommonData.data.put("maxWidth", (Object) Integer.valueOf(gbg.c(this.d, d.a(this.d, this.f))));
        }
        if (this.f28606a.getChildCount() > 0 && (this.f28606a.getChildAt(0) instanceof DXRootView)) {
            DXRootView dXRootView = (DXRootView) this.f28606a.getChildAt(0);
            if (str.equals(dXRootView.getDxTemplateItem().f11925a)) {
                f.m().renderDX(dXRootView, chatItemCommonData.data);
                return;
            }
        }
        DXRootView createDX = f.m().createDX(this.f28606a.getContext(), str);
        if (createDX == null) {
            return;
        }
        this.f28606a.removeAllViews();
        this.f28606a.addView(createDX);
        f.m().renderDX(createDX, chatItemCommonData.data);
    }
}
