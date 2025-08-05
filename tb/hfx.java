package tb;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class hfx extends hgg implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f28603a;
    private View f;

    public static /* synthetic */ Object ipc$super(hfx hfxVar, String str, Object... objArr) {
        if (str.hashCode() == -1523321416) {
            super.a((ChatMessage) objArr[0], (TBLiveDataModel) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-862533991);
        kge.a(-1201612728);
        f28603a = false;
    }

    public hfx(View view, a aVar) {
        super(view, aVar);
        this.f = view;
        ((TUrlImageView) this.f.findViewById(R.id.taolive_chat_add_one)).setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01Hvds3e1bnd3dgrluW_!!6000000003510-2-tps-90-45.png");
    }

    @Override // tb.hgg, tb.hfy
    public void a(ChatMessage chatMessage, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a533f5b8", new Object[]{this, chatMessage, tBLiveDataModel});
            return;
        }
        super.a(chatMessage, tBLiveDataModel);
        a(chatMessage, this.f);
        ((TextView) this.f.findViewById(R.id.taolive_chat_item_content)).setMaxWidth(plz.b(this.d) - d.a(this.d, 46.0f));
        this.f.findViewById(R.id.taolive_chat_item_action_addone).setOnClickListener(this);
        if (f28603a) {
            return;
        }
        f28603a = true;
        phg.a().a((a) this.e, "Show-Commentplus", new HashMap<>());
    }

    private void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("content", (Object) str);
            jSONObject.put("extendVal", (Object) map);
            this.e.e().a(xkw.EVENT_SEND_COMMENT, jSONObject, this.e == null ? null : this.e.G());
        }
    }

    @Override // tb.hfy, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        HashMap hashMap = new HashMap();
        if ("anchor_custom_sticker".equals(this.b.renders.get("commentType")) && this.b.renders.containsKey("stickerId")) {
            hashMap.put("stickerId", this.b.renders.get("stickerId"));
            hashMap.put("commentType", "anchor_custom_sticker");
        } else {
            hashMap.put("commentType", hfv.KEY_ADD_ONE);
        }
        hashMap.put("comment_location", "commentplus");
        a(this.b.mContent, hashMap);
    }
}
