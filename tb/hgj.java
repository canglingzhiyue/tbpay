package tb;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.c;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.sdk.model.a;
import com.taobao.taolive.sdk.model.f;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.utils.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class hgj implements a, hgk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f28617a;
    private TextView b;
    private boolean c;
    private List<ChatMessage> d;
    private Handler e;
    private long f;
    private long g;
    private ChatMessage h;
    private hgl i;
    private int j;
    private boolean k = ply.aI();
    private final c l;

    static {
        kge.a(1593084240);
        kge.a(1269605901);
        kge.a(-1905361424);
    }

    public static /* synthetic */ List a(hgj hgjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("1776cefa", new Object[]{hgjVar}) : hgjVar.d;
    }

    public static /* synthetic */ void b(hgj hgjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6c9a2e", new Object[]{hgjVar});
        } else {
            hgjVar.c();
        }
    }

    public static /* synthetic */ Handler c(hgj hgjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("dd2199b7", new Object[]{hgjVar}) : hgjVar.e;
    }

    public hgj(hgl hglVar, com.taobao.alilive.aliliveframework.frame.a aVar, Context context, c cVar) {
        this.f = 10000L;
        this.g = 10000L;
        this.j = Result.ALIPAY_BASE64_ENCODE_ERROR;
        this.i = hglVar;
        this.f = ply.aF() * 1000;
        this.g = ply.aG() * 1000;
        this.j = d.b(context, plz.b(context));
        this.l = cVar;
    }

    @Override // tb.hgk
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.f28617a;
    }

    @Override // tb.hgk
    public void a(ViewGroup viewGroup, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2973f7d", new Object[]{this, viewGroup, textView});
            return;
        }
        this.f28617a = viewGroup;
        this.b = textView;
        this.e = new f(this);
        this.d = new ArrayList();
    }

    @Override // tb.hgk
    public void a(final ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d487357f", new Object[]{this, chatMessage});
        } else {
            this.e.post(new Runnable() { // from class: tb.hgj.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    hgj.a(hgj.this).add(chatMessage);
                    hgj.b(hgj.this);
                }
            });
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.c || this.d.size() <= 0) {
        } else {
            this.c = true;
            this.h = this.d.remove(0);
            if (this.k) {
                d();
            } else {
                f();
            }
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.b.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("你有主播新回复 查看");
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#222222")), 0, 8, 33);
        this.b.setText(spannableStringBuilder);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: tb.hgj.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                hgj.c(hgj.this).removeMessages(103);
                hgj.c(hgj.this).sendEmptyMessage(102);
            }
        });
        this.e.sendEmptyMessageDelayed(103, this.f);
    }

    @Override // tb.hgk
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        List<ChatMessage> list = this.d;
        if (list != null) {
            list.clear();
        }
        Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ViewGroup viewGroup = this.f28617a;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        int i = message.what;
        if (i == 102) {
            this.b.setVisibility(8);
            f();
        } else if (i != 103) {
        } else {
            this.b.setVisibility(8);
            e();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.f28617a.setVisibility(8);
        this.l.a(com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_ANCHOR_RESPONSE_VIEW, Boolean.FALSE);
        hgl hglVar = this.i;
        if (hglVar != null) {
            hglVar.a(this.h);
        }
        this.c = false;
        c();
    }

    private void f() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ChatMessage chatMessage = this.h;
        if (chatMessage == null) {
            this.c = false;
            return;
        }
        ChatMessage.ChatItemCommonData chatItemCommonData = chatMessage.chatItemCommonData;
        if (chatItemCommonData == null) {
            this.c = false;
            return;
        }
        this.f28617a.setVisibility(0);
        c cVar = this.l;
        if (cVar != null) {
            cVar.a(com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_ANCHOR_RESPONSE_VIEW, Boolean.TRUE);
        }
        String str = chatItemCommonData.templateName;
        String str2 = chatItemCommonData.bizType;
        String str3 = chatItemCommonData.showType;
        q.b("AnchorResponseChatController", "showPermanentBottomView bizType:" + str2 + " templateName:" + str + " showType:" + str3);
        if (chatItemCommonData.data != null) {
            chatItemCommonData.data.put("maxWidth", (Object) Integer.valueOf(gbg.c(this.f28617a.getContext(), d.a(this.f28617a.getContext(), this.j))));
        }
        DXRootView createDX = com.taobao.android.live.plugin.proxy.f.m().createDX(this.f28617a.getContext(), str);
        if (createDX != null) {
            this.f28617a.removeAllViews();
            this.f28617a.addView(createDX);
            com.taobao.android.live.plugin.proxy.f.m().renderDX(createDX, chatItemCommonData.data);
        }
        if (TextUtils.equals(str2, com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.BIZ_TYPE_AI_COPILOT_RESPONSE)) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject2 = chatItemCommonData.data;
            if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("extMap")) != null) {
                hashMap.put("reply_id", jSONObject.getString("replyId"));
                hashMap.put("bereplied_id", jSONObject.getString("beReplyId"));
                hashMap.put("btn_name", jSONObject.getString("btnName"));
                hashMap.put("trackInfoAssistant", jSONObject.getString("trackInfoAssistant"));
            }
            pmd.a().e().b("Page_TaobaoLiveWatch", "Comment_AICard", hashMap);
        }
        this.e.sendEmptyMessageDelayed(103, this.g);
    }
}
