package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.ChatTopMessage;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.bottom.BottomShowChatView;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.menu.ChatMenuItem;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.menu.ChatMenuPopupWindow;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.net.PersonalityIntroResp;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.MonitorSizeChangeLayout;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.TopMessageView2;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.android.live.plugin.proxy.universal.IUniversalProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.business.trivial.TrivialQueryResponseData;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.ui.model.BizInfoItem;
import com.taobao.taolive.room.utils.ad;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.mergeInfo.UnImportantLiveInfoResponseData;
import com.taobao.taolive.sdk.mergeInfo.b;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.ConventionItem;
import com.taobao.taolive.sdk.model.common.UserLevelAvatar;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.model.message.CommentCountMessage;
import com.taobao.taolive.sdk.model.message.LiveCommonTipsMsg;
import com.taobao.taolive.sdk.model.message.TopAtmosphereMessage;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.p;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.v;
import com.taobao.taolive.sdk.utils.y;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cgl;
import tb.ddu;
import tb.gbg;
import tb.hfr;
import tb.hfw;
import tb.hfy;
import tb.hgh;
import tb.hgi;
import tb.hgj;
import tb.hgk;
import tb.hgl;
import tb.hgm;
import tb.hkk;
import tb.kge;
import tb.phg;
import tb.phq;
import tb.plx;
import tb.ply;
import tb.plz;
import tb.pmd;
import tb.pnj;
import tb.pqj;
import tb.tkg;
import tb.tki;
import tb.xkw;

/* loaded from: classes5.dex */
public class d implements MonitorSizeChangeLayout.a, a.b, hgl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_TYPE_AI_COPILOT_RESPONSE = "liveCopilot";
    private static Boolean n;
    private RecyclerView.ItemDecoration A;
    private b B;
    private TextView C;
    private FrameLayout D;
    private FrameLayout E;
    private FrameLayout F;
    private com.taobao.taolive.room.business.trivial.a G;
    private hgk H;
    private com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster.b I;
    private com.taobao.android.live.plugin.atype.flexalocal.comments.chat.i J;
    private boolean P;
    private BottomShowChatView Q;
    private View R;
    private int S;
    private FrameLayout T;
    private com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sale.c U;

    /* renamed from: a */
    public a.InterfaceC0528a f13647a;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    public Context b;
    public j c;
    public View d;
    public TBLiveDataModel e;
    private RecyclerView h;
    private LinearLayout i;
    private LinearLayout j;
    private hfw k;
    private BaseTopMessageView o;
    private BaseTopMessageView p;
    private BaseTopMessageView q;
    private boolean s;
    private TextView t;
    private com.taobao.alilive.aliliveframework.frame.a u;
    private hgh v;
    private com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a y;
    private com.taobao.android.live.plugin.atype.flexalocal.comments.chat.bottom.c z;
    private int g = Result.ALIPAY_BASE64_ENCODE_ERROR;
    private boolean l = false;
    private int m = 0;
    private com.taobao.android.live.plugin.atype.flexalocal.comments.chat.d r = new com.taobao.android.live.plugin.atype.flexalocal.comments.chat.d();
    private boolean w = true;
    private final a x = new a();
    private boolean K = true;
    private int L = ply.ac();
    private long M = ply.ab();
    private boolean N = ply.ad();
    private int O = 0;
    private boolean V = false;
    private boolean W = false;
    private boolean X = false;
    private boolean Y = false;
    private boolean Z = false;
    private boolean aa = false;
    public TopMessageView2.b f = new TopMessageView2.b() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            d.this = this;
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.TopMessageView2.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            synchronized (this) {
                if (d.a(d.this) != null) {
                    com.taobao.android.live.plugin.atype.flexalocal.comments.chat.f a2 = d.a(d.this).a();
                    if (a2 instanceof ChatTopMessage) {
                        pnj m = pmd.a().m();
                        m.c("ChatView3", "onTopViewShowEnd: " + a2.getType() + "; msg cnt: " + a2.getMsgCnt());
                        d.b(d.this).setTopViewStyle((ChatTopMessage) a2);
                        d.a(d.this, true);
                    }
                }
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.TopMessageView2.b
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            pmd.a().m().c("ChatView3", "onTopViewHideForce");
            d.c(d.this);
        }
    };
    private int ae = 0;

    public static /* synthetic */ void lambda$EXpZXVQKzySraR0r4TzLtDPIhRc(d dVar) {
        dVar.F();
    }

    public static /* synthetic */ void lambda$Qk_Y0aNrS3QoFN5_UcAODlbUR18(d dVar, ChatMessage chatMessage, ChatMenuItem chatMenuItem) {
        dVar.a(chatMessage, chatMenuItem);
    }

    public static /* synthetic */ void lambda$YcnXrMevrvzAW3Dkann5EMQ6S_I(d dVar, View view) {
        dVar.b(view);
    }

    public static /* synthetic */ void lambda$Z7hKsqR_agNdgu5RquPpmu2J9IE(View view, Drawable drawable) {
        a(view, drawable);
    }

    /* renamed from: lambda$bIMSNj-a-Z0R_56dQY82OYu0BBI */
    public static /* synthetic */ void m948lambda$bIMSNjaZ0R_56dQY82OYu0BBI(d dVar, ChatMessage chatMessage) {
        dVar.h(chatMessage);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ int a(d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2860621", new Object[]{dVar, new Integer(i)})).intValue();
        }
        dVar.m = i;
        return i;
    }

    public static /* synthetic */ com.taobao.android.live.plugin.atype.flexalocal.comments.chat.d a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.live.plugin.atype.flexalocal.comments.chat.d) ipChange.ipc$dispatch("1c7b156a", new Object[]{dVar}) : dVar.r;
    }

    public static /* synthetic */ void a(d dVar, View view, ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32e80114", new Object[]{dVar, view, chatMessage});
        } else {
            dVar.a(view, chatMessage);
        }
    }

    public static /* synthetic */ void a(d dVar, JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a171e5af", new Object[]{dVar, jSONObject, str, str2});
        } else {
            dVar.a(jSONObject, str, str2);
        }
    }

    public static /* synthetic */ void a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28645ff", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.a(z);
        }
    }

    public static /* synthetic */ BaseTopMessageView b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseTopMessageView) ipChange.ipc$dispatch("70f0d79d", new Object[]{dVar}) : dVar.q;
    }

    public static /* synthetic */ boolean b(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49d7362", new Object[]{dVar, new Boolean(z)})).booleanValue();
        }
        dVar.w = z;
        return z;
    }

    public static /* synthetic */ void c(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9230f7", new Object[]{dVar});
        } else {
            dVar.t();
        }
    }

    public static /* synthetic */ boolean c(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46b4a0c1", new Object[]{dVar, new Boolean(z)})).booleanValue();
        }
        dVar.K = z;
        return z;
    }

    public static /* synthetic */ RecyclerView d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("32321e0c", new Object[]{dVar}) : dVar.h;
    }

    public static /* synthetic */ boolean d(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88cbce20", new Object[]{dVar, new Boolean(z)})).booleanValue();
        }
        dVar.P = z;
        return z;
    }

    public static /* synthetic */ hfw e(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hfw) ipChange.ipc$dispatch("6fc619d4", new Object[]{dVar}) : dVar.k;
    }

    public static /* synthetic */ void f(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69cb13a", new Object[]{dVar});
        } else {
            dVar.l();
        }
    }

    public static /* synthetic */ int g(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fa4adbee", new Object[]{dVar})).intValue() : dVar.m;
    }

    public static /* synthetic */ com.taobao.android.live.plugin.atype.flexalocal.comments.chat.i h(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.live.plugin.atype.flexalocal.comments.chat.i) ipChange.ipc$dispatch("a780894c", new Object[]{dVar}) : dVar.J;
    }

    public static /* synthetic */ void i(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61a7317d", new Object[]{dVar});
        } else {
            dVar.x();
        }
    }

    public static /* synthetic */ LinearLayout j(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("a908a495", new Object[]{dVar}) : dVar.j;
    }

    public static /* synthetic */ FrameLayout k(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("42a71a7a", new Object[]{dVar}) : dVar.E;
    }

    public static /* synthetic */ boolean l(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fcb1b1c4", new Object[]{dVar})).booleanValue() : dVar.W;
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a m(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("767465b6", new Object[]{dVar}) : dVar.u;
    }

    public static /* synthetic */ void n(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("640e0742", new Object[]{dVar});
        } else {
            dVar.y();
        }
    }

    public static /* synthetic */ boolean o(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("97bc3207", new Object[]{dVar})).booleanValue() : dVar.P;
    }

    public static /* synthetic */ boolean p(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cb6a5cc8", new Object[]{dVar})).booleanValue() : dVar.ad;
    }

    public static /* synthetic */ boolean q(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff188789", new Object[]{dVar})).booleanValue() : dVar.ac;
    }

    public static /* synthetic */ void r(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32c6b246", new Object[]{dVar});
        } else {
            dVar.E();
        }
    }

    static {
        kge.a(2047577172);
        kge.a(1027541269);
        kge.a(1109046077);
        kge.a(917465621);
        kge.a(-1312289062);
        n = null;
    }

    public d(Context context, boolean z, com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.b = context;
        this.s = z;
        this.u = aVar;
        C();
        this.B = new b(aVar, context);
        this.f13647a = new c(this.b, this, aVar, this.B);
        this.z = new com.taobao.android.live.plugin.atype.flexalocal.comments.chat.bottom.a();
        this.G = new hgm();
        com.taobao.alilive.aliliveframework.frame.a aVar2 = this.u;
        if (aVar2 instanceof phq) {
            ((phq) aVar2).a(this.G);
        }
    }

    private void C() {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        ATaoLiveOpenEntity o = this.u.o();
        if (o == null || o.abilityCompontent == null || !o.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_LRCommentFeatMap)) {
            return;
        }
        Object a2 = o.abilityCompontent.a(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_LRCommentFeatMap);
        if (!(a2 instanceof String) || (parseObject = JSON.parseObject((String) a2)) == null) {
            return;
        }
        if (parseObject.containsKey("disableShopAtmosphere")) {
            this.V = parseObject.getBoolean("disableShopAtmosphere").booleanValue();
        }
        if (parseObject.containsKey("disableFusionComment")) {
            this.W = parseObject.getBoolean("disableFusionComment").booleanValue();
        }
        if (parseObject.containsKey("disableAiResp")) {
            this.X = parseObject.getBoolean("disableAiResp").booleanValue();
        }
        if (parseObject.containsKey("disableCommentButton")) {
            this.Y = parseObject.getBoolean("disableCommentButton").booleanValue();
        }
        if (parseObject.containsKey("disableCommentInteraction")) {
            this.Z = parseObject.getBoolean("disableCommentInteraction").booleanValue();
        }
        if (!parseObject.containsKey("disableAtmosphere")) {
            return;
        }
        this.aa = parseObject.getBoolean("disableAtmosphere").booleanValue();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
        } else if (p.B()) {
            synchronized (this) {
                pnj m = pmd.a().m();
                m.c("ChatView3", "showTopMessage:" + i);
                ChatTopMessage b = b(i, obj);
                if (b != null && this.r != null && this.q != null) {
                    if (this.ab && (u() || a(b))) {
                        pnj m2 = pmd.a().m();
                        m2.c("ChatView3", "showTopMessage, switch:" + i);
                        this.q.setTopViewStyle(b);
                        a(false);
                    } else {
                        pnj m3 = pmd.a().m();
                        m3.c("ChatView3", "showTopMessage, queue:" + i);
                        this.r.a(b, b.isMerge());
                    }
                }
            }
        } else {
            synchronized (this) {
                pnj m4 = pmd.a().m();
                m4.c("ChatView3", "showTopMessage:" + i);
                ChatTopMessage b2 = b(i, obj);
                if (b2 != null && this.r != null && this.q != null) {
                    if (!u() && !a(b2)) {
                        pnj m5 = pmd.a().m();
                        m5.c("ChatView3", "showTopMessage, queue:" + i);
                        this.r.a(b2, b2.isMerge());
                    }
                    pnj m6 = pmd.a().m();
                    m6.c("ChatView3", "showTopMessage, switch:" + i);
                    this.q.setTopViewStyle(b2);
                    a(false);
                }
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void a(int i, ChatTopMessage chatTopMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92c90558", new Object[]{this, new Integer(i), chatTopMessage});
        } else if (p.B()) {
            synchronized (this) {
                pnj m = pmd.a().m();
                m.c("ChatView3", "showTopMessageDX:" + i);
                if (this.ab && u()) {
                    pnj m2 = pmd.a().m();
                    m2.c("ChatView3", "showTopMessageDX, switch:" + i);
                    this.q.setTopViewStyleDX(chatTopMessage);
                    a(false);
                } else {
                    pnj m3 = pmd.a().m();
                    m3.c("ChatView3", "showTopMessageDX, queue:" + i);
                    this.r.a(chatTopMessage, true);
                }
            }
        } else {
            synchronized (this) {
                pnj m4 = pmd.a().m();
                m4.c("ChatView3", "showTopMessageDX:" + i);
                if (u()) {
                    pnj m5 = pmd.a().m();
                    m5.c("ChatView3", "showTopMessageDX, switch:" + i);
                    this.q.setTopViewStyleDX(chatTopMessage);
                    a(false);
                } else {
                    pnj m6 = pmd.a().m();
                    m6.c("ChatView3", "showTopMessageDX, queue:" + i);
                    this.r.a(chatTopMessage, true);
                }
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void e(Object obj) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceeb7748", new Object[]{this, obj});
        } else if (!(obj instanceof String) || (b = pqj.b((String) obj)) == null) {
        } else {
            String string = b.getString("bizType");
            JSONObject jSONObject = b.getJSONObject("data");
            String string2 = jSONObject != null ? jSONObject.getString("replyToUserId") : "";
            boolean z2 = cgl.i() != null && !StringUtils.isEmpty(string2) && StringUtils.equals(cgl.i().a(), string2);
            ChatMessage a2 = a(b, z2);
            if (a2 == null) {
                return;
            }
            if (!StringUtils.equals(string, BIZ_TYPE_AI_COPILOT_RESPONSE) || !hkk.y()) {
                z = false;
            }
            if (!StringUtils.equals(string, "anchorResponse") && !StringUtils.equals(string, "rewardNotice") && !z) {
                return;
            }
            if (z2 || StringUtils.equals(string, "rewardNotice")) {
                hgk hgkVar = this.H;
                if (hgkVar == null) {
                    return;
                }
                hgkVar.a(a2);
                return;
            }
            hfw hfwVar = this.k;
            if (hfwVar == null) {
                return;
            }
            hfwVar.a(a2);
            i();
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.K) {
            j();
        } else {
            k();
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.w = true;
        if (this.m != 0 || !this.w) {
            return;
        }
        ((LinearLayoutManager) this.h.getLayoutManager()).scrollToPositionWithOffset(this.k.getItemCount() - 1, 0);
    }

    private ChatMessage a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatMessage) ipChange.ipc$dispatch("d2af4a61", new Object[]{this, jSONObject, new Boolean(z)});
        }
        ChatMessage chatMessage = new ChatMessage();
        ChatMessage.ChatItemCommonData chatItemCommonData = new ChatMessage.ChatItemCommonData();
        chatItemCommonData.bizType = jSONObject.getString("bizType");
        chatItemCommonData.data = jSONObject.getJSONObject("data");
        if (StringUtils.equals(chatItemCommonData.bizType, "rewardNotice") || StringUtils.equals(chatItemCommonData.bizType, BIZ_TYPE_AI_COPILOT_RESPONSE)) {
            chatItemCommonData.templateName = jSONObject.getString("templateName");
        } else if (z) {
            chatItemCommonData.templateName = "taolive_comment_response_mine";
        } else {
            chatItemCommonData.templateName = "taolive_comment_response_other";
        }
        chatItemCommonData.showType = jSONObject.getString("showType");
        chatMessage.chatItemCommonData = chatItemCommonData;
        return chatMessage;
    }

    private ChatTopMessage b(int i, Object obj) {
        UserLevelAvatar userLevelAvatar;
        String string;
        UserLevelAvatar userLevelAvatar2;
        String string2;
        ChatTopMessage chatTopMessage;
        BizInfoItem bizInfoItem;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (ChatTopMessage) ipChange.ipc$dispatch("3b7cf43d", new Object[]{this, new Integer(i), obj});
        }
        ChatTopMessage chatTopMessage2 = null;
        if (i == 1011) {
            String g = v.g((String) obj);
            if (StringUtils.isEmpty(g)) {
                return null;
            }
            chatTopMessage = new ChatTopMessage(i, g, null, null);
        } else if (i == 10035) {
            String g2 = v.g((String) obj);
            if (StringUtils.isEmpty(g2)) {
                return null;
            }
            chatTopMessage = new ChatTopMessage(i, g2, null, null);
        } else if (i == 1057) {
            LiveCommonTipsMsg liveCommonTipsMsg = (LiveCommonTipsMsg) obj;
            try {
                i2 = Color.parseColor(liveCommonTipsMsg.bgColor);
            } catch (Exception unused) {
            }
            chatTopMessage = new ChatTopMessage(i, liveCommonTipsMsg.userNick, liveCommonTipsMsg.text, null, liveCommonTipsMsg.identify, true);
            if (i2 != 0) {
                chatTopMessage.setBgColor(i2);
            }
        } else if (i == 1005) {
            return null;
        } else {
            if (i == 1040) {
                try {
                    if (phg.d().a() || !(obj instanceof String) || !this.f13647a.b() || (userLevelAvatar = (UserLevelAvatar) JSON.parseObject((String) obj, UserLevelAvatar.class)) == null || StringUtils.isEmpty(userLevelAvatar.userid) || StringUtils.equals(userLevelAvatar.userid, cgl.i().a())) {
                        return null;
                    }
                    ChatTopMessage chatTopMessage3 = new ChatTopMessage(i, userLevelAvatar.nick, v.a(userLevelAvatar.nick) + " 来了", null, userLevelAvatar.identify, this.f13647a.c());
                    try {
                        if (!StringUtils.isEmpty(userLevelAvatar.flowSourceText)) {
                            string = v.a(userLevelAvatar.nick) + userLevelAvatar.flowSourceText;
                        } else {
                            string = this.b.getString(R.string.taolive_user_update_hint_flexalocal, v.a(userLevelAvatar.nick));
                        }
                        chatTopMessage2 = new ChatTopMessage(i, userLevelAvatar.nick, string, null, userLevelAvatar.identify, this.f13647a.c());
                        chatTopMessage2.setMedalLevelList(userLevelAvatar.medalList);
                        chatTopMessage2.setTopMessageBgColor(userLevelAvatar.bgColor);
                        return chatTopMessage2;
                    } catch (Exception e) {
                        e = e;
                        chatTopMessage2 = chatTopMessage3;
                        plx.b("ChatView3", "MSG_TYPE_USER_LEVEL_ENTER exp : " + e.getMessage());
                        return chatTopMessage2;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } else if (i == 2037) {
                if (!(obj instanceof Map)) {
                    return null;
                }
                String str = (String) ((Map) obj).get("extParams");
                if (StringUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    bizInfoItem = (BizInfoItem) JSONObject.parseObject(str, BizInfoItem.class);
                } catch (Exception unused2) {
                    bizInfoItem = null;
                }
                if (bizInfoItem == null) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(com.taobao.taolive.room.ui.fanslevel.a.FANS_LEVEL_RENDER, bizInfoItem.fansLevel);
                chatTopMessage = new ChatTopMessage(i, bizInfoItem.userName, bizInfoItem.userName + " " + bizInfoItem.content, null, hashMap, true);
            } else if (i == 1062) {
                LiveCommonTipsMsg liveCommonTipsMsg2 = (LiveCommonTipsMsg) obj;
                try {
                    i2 = Color.parseColor(liveCommonTipsMsg2.bgColor);
                } catch (Exception unused3) {
                }
                chatTopMessage = new ChatTopMessage(i, liveCommonTipsMsg2.userNick, liveCommonTipsMsg2.text, null, liveCommonTipsMsg2.identify, true);
                if (i2 != 0) {
                    chatTopMessage.setBgColor(i2);
                }
            } else if (i != 3008) {
                return null;
            } else {
                try {
                    if (!phg.d().a() || !(obj instanceof String) || !this.f13647a.b() || (userLevelAvatar2 = (UserLevelAvatar) JSON.parseObject((String) obj, UserLevelAvatar.class)) == null || StringUtils.isEmpty(userLevelAvatar2.userid) || StringUtils.equals(userLevelAvatar2.userid, cgl.i().a())) {
                        return null;
                    }
                    if (!StringUtils.isEmpty(userLevelAvatar2.flowSourceText)) {
                        string2 = v.a(userLevelAvatar2.nick) + userLevelAvatar2.flowSourceText;
                    } else {
                        string2 = this.b.getString(R.string.taolive_user_update_hint_flexalocal, v.a(userLevelAvatar2.nick));
                    }
                    chatTopMessage = new ChatTopMessage(i, userLevelAvatar2.nick, string2, null, userLevelAvatar2.identify, true);
                    try {
                        chatTopMessage.setMedalLevelList(userLevelAvatar2.medalList);
                        chatTopMessage.setTopMessageBgColor(userLevelAvatar2.bgColor);
                        if (userLevelAvatar2.identify != null && userLevelAvatar2.identify.containsKey(com.taobao.taolive.room.ui.fanslevel.a.FANS_LEVEL_RENDER)) {
                            chatTopMessage.setFansLevel(userLevelAvatar2.identify.get(com.taobao.taolive.room.ui.fanslevel.a.FANS_LEVEL_RENDER));
                        }
                    } catch (Exception e3) {
                        e = e3;
                        chatTopMessage2 = chatTopMessage;
                        plx.b("ChatView3", "MSG_TYPE_USER_LEVEL_ENTER_FOR_DUKE exp : " + e.getMessage());
                        return chatTopMessage2;
                    }
                } catch (Exception e4) {
                    e = e4;
                }
            }
        }
        return chatTopMessage;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || map.size() <= 0) {
        } else {
            String next = map.keySet().iterator().next();
            c(ChatTopMessage.createConventionMessage(next, map.get(next), R.color.taolive_room_chat_color2));
        }
    }

    public void d() {
        TBLiveDataModel tBLiveDataModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.y = new com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a(this.u);
        this.H = new hgj(this, this.u, this.b, this.y);
        this.I = new com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster.a(this.b, this.u, this.y);
        this.U = new com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sale.b(this.b, this.u, this.y);
        if (hkk.a(this.e) && !this.W) {
            w();
        }
        View view = this.d;
        if (view != null) {
            this.Q = (BottomShowChatView) view.findViewById(R.id.bottom_show_chat_view);
            this.Q.getLayoutParams().width = com.taobao.taolive.room.utils.d.a(this.b, this.g);
            this.z.a(new com.taobao.android.live.plugin.atype.flexalocal.comments.chat.bottom.b(this.Q, new hfw(this.b, this.e, this.u), this.e, this.u, this.y, this));
            if (!p.B()) {
                this.z.a();
            }
            if (this.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) this.d.getLayoutParams()).setMargins(0, 0, 0, 0);
                this.d.requestLayout();
            }
            ((TUrlImageView) this.d.findViewById(R.id.taolive_chat_new_msg_arrow)).setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01vomWdC1WX4f1bX6j4_!!6000000002797-2-tps-24-24.png");
            this.h = (RecyclerView) this.d.findViewById(R.id.recyclerview);
            this.j = (LinearLayout) this.d.findViewById(R.id.taolive_chat_to_new_msg_container);
            this.i = (LinearLayout) this.d.findViewById(R.id.taolive_comment_bottom_container);
            this.C = (TextView) this.d.findViewById(R.id.taolive_ai_replay_textview_new);
            this.D = (FrameLayout) this.d.findViewById(R.id.taolive_bottom_dynamic_container);
            this.E = (FrameLayout) this.d.findViewById(R.id.taolive_bottom_anchor_response_container);
            this.F = (FrameLayout) this.d.findViewById(R.id.taolive_bottom_says_cluster_container);
            this.T = (FrameLayout) this.d.findViewById(R.id.taolive_bottom_hot_sale_container);
            this.G.a(this.D);
            this.H.a(this.E, this.C);
            this.I.a(this.F);
            if (this.X) {
                this.C.setVisibility(8);
            }
            RecyclerView recyclerView = this.h;
            if ((recyclerView instanceof ChatRecyclerView2) && this.Z) {
                ((ChatRecyclerView2) recyclerView).setPerformClearClick(true);
            }
            if (hkk.R() && !z() && !this.V) {
                this.U.a(this.T);
                if (!p.B() && (tBLiveDataModel = this.e) != null && tBLiveDataModel.mVideoInfo != null && this.e.mVideoInfo.broadCaster != null) {
                    this.U.a(this.e.mVideoInfo.liveId, this.e.mVideoInfo.broadCaster.accountId);
                }
            }
            TBLiveDataModel tBLiveDataModel2 = this.e;
            if (tBLiveDataModel2 != null && tBLiveDataModel2.mVideoInfo != null && com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.e()) {
                this.I.a(this.e.mVideoInfo.closeAddOneComment);
            }
            if (this.Y) {
                this.I.a(true);
            }
            this.t = (TextView) this.d.findViewById(R.id.taolive_show_timeshift_list_for_replay);
            if (v()) {
                this.o = (TopMessageViewSupportDx) this.d.findViewById(R.id.taolive_topmessage_view0_new);
                this.p = (TopMessageViewSupportDx) this.d.findViewById(R.id.taolive_topmessage_view1_new);
            } else {
                this.o = (TopMessageView2) this.d.findViewById(R.id.taolive_topmessage_view0);
                this.p = (TopMessageView2) this.d.findViewById(R.id.taolive_topmessage_view1);
            }
            this.o.setVisibility(0);
            this.p.setVisibility(0);
            this.o.setBelovedFansBGView((AliUrlImageView) this.d.findViewById(R.id.taolive_beloved_fans_view0));
            this.o.setVisibility(4);
            this.o.setShowStatusLisener(this.f);
            this.p.setBelovedFansBGView((AliUrlImageView) this.d.findViewById(R.id.taolive_beloved_fans_view1));
            this.p.setVisibility(4);
            this.p.setShowStatusLisener(this.f);
            this.q = this.o;
            if (this.aa) {
                this.q.setVisibility(8);
            }
            this.k = new hfw(this.b, this.e, this.u);
            this.k.a(new com.taobao.android.live.plugin.atype.flexalocal.comments.chat.e() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    d.this = this;
                }

                @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.e
                public void a(View view2, ChatMessage chatMessage) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("26c72801", new Object[]{this, view2, chatMessage});
                    } else {
                        d.a(d.this, view2, chatMessage);
                    }
                }
            });
            final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.b);
            linearLayoutManager.setOrientation(1);
            this.h.setLayoutManager(linearLayoutManager);
            this.h.swapAdapter(this.k, true);
            this.h.setItemAnimator(new DefaultItemAnimator());
            this.h.setRecycledViewPool(this.u.z().G());
            this.h.setItemViewCacheSize(0);
            RecyclerView recyclerView2 = this.h;
            com.taobao.android.live.plugin.atype.flexalocal.comments.chat.g gVar = new com.taobao.android.live.plugin.atype.flexalocal.comments.chat.g(com.taobao.taolive.room.utils.d.a(this.b, 3.0f), 1);
            this.A = gVar;
            recyclerView2.addItemDecoration(gVar);
            linearLayoutManager.setStackFromEnd(true);
            this.h.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    d.this = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:31:0x0029, code lost:
                    if (r7 != 3) goto L11;
                 */
                @Override // android.view.View.OnTouchListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
                    /*
                        r6 = this;
                        com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.AnonymousClass3.$ipChange
                        boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                        r2 = 3
                        r3 = 2
                        r4 = 0
                        r5 = 1
                        if (r1 == 0) goto L1f
                        java.lang.Object[] r1 = new java.lang.Object[r2]
                        r1[r4] = r6
                        r1[r5] = r7
                        r1[r3] = r8
                        java.lang.String r7 = "d4aa3aa4"
                        java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
                        java.lang.Boolean r7 = (java.lang.Boolean) r7
                        boolean r7 = r7.booleanValue()
                        return r7
                    L1f:
                        int r7 = r8.getAction()
                        if (r7 == 0) goto L69
                        if (r7 == r5) goto L2c
                        if (r7 == r3) goto L69
                        if (r7 == r2) goto L2c
                        goto L6e
                    L2c:
                        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d r7 = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.this
                        android.support.v7.widget.RecyclerView r7 = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.d(r7)
                        android.support.v7.widget.RecyclerView$LayoutManager r7 = r7.getLayoutManager()
                        boolean r7 = r7 instanceof android.support.v7.widget.LinearLayoutManager
                        if (r7 == 0) goto L63
                        android.support.v7.widget.LinearLayoutManager r7 = r2
                        int r7 = r7.findLastVisibleItemPosition()
                        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d r8 = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.this
                        tb.hfw r8 = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.e(r8)
                        int r8 = r8.getItemCount()
                        int r8 = r8 - r5
                        if (r7 != r8) goto L58
                        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d r7 = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.this
                        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.b(r7, r5)
                        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d r7 = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.this
                        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.f(r7)
                        goto L6e
                    L58:
                        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d r7 = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.this
                        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.b(r7, r4)
                        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d r7 = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.this
                        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.c(r7, r4)
                        goto L6e
                    L63:
                        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d r7 = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.this
                        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.b(r7, r5)
                        goto L6e
                    L69:
                        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d r7 = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.this
                        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.b(r7, r4)
                    L6e:
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.AnonymousClass3.onTouch(android.view.View, android.view.MotionEvent):boolean");
                }
            });
            this.h.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass4 anonymousClass4, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == 806944192) {
                        super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                        return null;
                    } else if (hashCode != 2142696127) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    } else {
                        super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                        return null;
                    }
                }

                {
                    d.this = this;
                }

                @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView3, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView3, new Integer(i)});
                        return;
                    }
                    super.onScrollStateChanged(recyclerView3, i);
                    d.a(d.this, i);
                    d.g(d.this);
                }

                @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView3, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    int i3 = 1;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView3, new Integer(i), new Integer(i2)});
                        return;
                    }
                    super.onScrolled(recyclerView3, i, i2);
                    if (!hkk.a(d.this.e) || d.h(d.this) == null) {
                        return;
                    }
                    View findViewByPosition = linearLayoutManager.findViewByPosition(d.h(d.this).b);
                    if (findViewByPosition != null) {
                        i3 = findViewByPosition.getTop();
                    }
                    if (d.h(d.this).c || i3 >= (-com.taobao.taolive.room.utils.d.a(d.this.b, 3.0f)) || !d.h(d.this).d) {
                        return;
                    }
                    d.i(d.this);
                }
            });
            this.l = true;
            if (this.f13647a.a()) {
                this.t.setVisibility(0);
                if (phg.d().a()) {
                    this.t.setText("切换到宝贝讲解");
                } else {
                    this.t.setText("切换商品讲解");
                }
                Drawable drawable = this.b.getResources().getDrawable(R.drawable.taolive_icon_right_black2_flexalocal);
                int a2 = com.taobao.taolive.sdk.utils.b.a(this.b, 15.0f);
                drawable.setBounds(0, 0, a2, a2);
                this.t.setCompoundDrawables(null, null, drawable, null);
                this.t.setTextColor(-16777216);
                this.t.setBackgroundResource(R.drawable.taolive_show_timeshift_list_new_shape_flexalocal);
                this.t.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        d.this = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        } else if (phg.c() == null) {
                        } else {
                            phg.c().a(d.this.e.mVideoInfo);
                        }
                    }
                });
                q();
                r();
                p();
                o();
                c(true);
            } else {
                this.t.setVisibility(8);
                RecyclerView recyclerView3 = this.h;
                if (recyclerView3 != null) {
                    ViewGroup.LayoutParams layoutParams = recyclerView3.getLayoutParams();
                    layoutParams.width = com.taobao.taolive.room.utils.d.a(this.b, this.g + ChatRecyclerView2.recycleViewItemCornerIconPaddingWidthDP);
                    this.h.setLayoutParams(layoutParams);
                }
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                    layoutParams2.height = com.taobao.taolive.room.utils.d.a(this.b, 180.0f);
                    this.i.setLayoutParams(layoutParams2);
                }
                r();
                p();
                o();
            }
        }
        this.u.e().a(xkw.EVENT_CHAT_INIT, null, this.u.G());
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.-$$Lambda$d$YcnXrMevrvzAW3Dkann5EMQ6S_I
            {
                d.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                d.lambda$YcnXrMevrvzAW3Dkann5EMQ6S_I(d.this, view2);
            }
        });
        View view2 = this.d;
        if (view2 != null && (view2.getParent() instanceof ViewGroup)) {
            View findViewById = ((View) this.d.getParent()).findViewById(R.id.taolive_room_auc_composition);
            this.R = findViewById;
            if (findViewById instanceof MonitorSizeChangeLayout) {
                ((MonitorSizeChangeLayout) this.R).setOnSizeChangeListener(this);
            }
        }
        LinearLayout linearLayout2 = this.j;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setVisibility(8);
    }

    public /* synthetic */ void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        l();
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            ((LinearLayoutManager) recyclerView.getLayoutManager()).scrollToPositionWithOffset(this.k.getItemCount() - 1, 0);
        }
        if (phg.a() == null) {
            return;
        }
        phg.a().a(this.u, "Comment_BackNew", (Map<String, String>) new HashMap());
    }

    private void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        this.J = new com.taobao.android.live.plugin.atype.flexalocal.comments.chat.i();
        this.J.f = new CountDownTimer(hkk.C(), hkk.C()) { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j)});
                }
            }

            {
                d.this = this;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("badeed9", new Object[]{this});
                } else if (d.e(d.this) == null || (d.e(d.this).getItemCount() - 1) - d.h(d.this).b > 3) {
                } else {
                    d.h(d.this).d = false;
                }
            }
        };
        this.J.f.start();
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.j == null) {
        } else {
            if (hkk.H() && this.E != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.j.getLayoutParams();
                pnj m = pmd.a().m();
                m.a("ChatView3", "showToNewMsgView# bottomMargin=" + marginLayoutParams.bottomMargin + ", visibility=" + this.E.getVisibility() + ", height=" + this.E.getMeasuredHeight());
                if (this.E.getVisibility() == 8 || this.E.getMeasuredHeight() == 0) {
                    marginLayoutParams.bottomMargin = 0;
                    this.j.setLayoutParams(marginLayoutParams);
                }
            }
            this.j.setVisibility(0);
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        if (this.j != null) {
            if (hkk.f()) {
                b(true);
            }
            this.j.setVisibility(8);
        }
        this.K = true;
    }

    private void a(View view, final ChatMessage chatMessage) {
        List<ChatMenuItem> n2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c72801", new Object[]{this, view, chatMessage});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.e;
        if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null && !StringUtils.equals(this.e.mVideoInfo.roomStatus, "1")) {
            q.b("ChatView3", "processNewOnItemLongClick not live not support");
        } else if (com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.e() && "0".equals(chatMessage.mCommentId)) {
        } else {
            if (chatMessage.mType == ChatMessage.MessageType.TXT && !StringUtils.isEmpty(chatMessage.mCommentId) && d(chatMessage)) {
                n2 = m();
            } else if (StringUtils.isEmpty(chatMessage.mCommentId)) {
                return;
            } else {
                n2 = n();
            }
            if (n2 == null || n2.size() == 0) {
                return;
            }
            final View a2 = hfy.a(view);
            final Drawable background = a2.getBackground();
            a2.setBackground(a2.getResources().getDrawable(R.drawable.taolive_comment_long_click_bg_flexalocal));
            ChatMenuPopupWindow chatMenuPopupWindow = new ChatMenuPopupWindow(this.b, n2);
            chatMenuPopupWindow.showAtTopCenter(view);
            chatMenuPopupWindow.setChatItemClickListener(new com.taobao.android.live.plugin.atype.flexalocal.comments.chat.menu.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.-$$Lambda$d$Qk_Y0aNrS3QoFN5_UcAODlbUR18
                @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.menu.a
                public final void onItemClick(ChatMenuItem chatMenuItem) {
                    d.lambda$Qk_Y0aNrS3QoFN5_UcAODlbUR18(d.this, chatMessage, chatMenuItem);
                }
            });
            chatMenuPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.-$$Lambda$d$Z7hKsqR_agNdgu5RquPpmu2J9IE
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    d.lambda$Z7hKsqR_agNdgu5RquPpmu2J9IE(a2, background);
                }
            });
            this.K = false;
            this.w = false;
            a(n2);
        }
    }

    public /* synthetic */ void a(ChatMessage chatMessage, ChatMenuItem chatMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24cdc830", new Object[]{this, chatMessage, chatMenuItem});
            return;
        }
        int i = chatMenuItem.position;
        if (i == 0) {
            g(chatMessage);
        } else if (i == 1) {
            f(chatMessage);
        } else if (i == 2) {
            e(chatMessage);
        }
        a(chatMenuItem);
    }

    public static /* synthetic */ void a(View view, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b9198e", new Object[]{view, drawable});
        } else {
            view.setBackground(drawable);
        }
    }

    private void a(ChatMenuItem chatMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce64e867", new Object[]{this, chatMenuItem});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("btn_name", chatMenuItem.text);
        if (phg.a() == null) {
            return;
        }
        phg.a().a(this.u, "CommentBubbles", (Map<String, String>) hashMap);
    }

    private void a(List<ChatMenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        if (list.size() > 1) {
            for (ChatMenuItem chatMenuItem : list) {
                sb.append(chatMenuItem.text);
                if (list.indexOf(chatMenuItem) != list.size() - 1) {
                    sb.append("_");
                }
            }
        } else {
            sb.append(list.get(0).text);
        }
        hashMap.put("btn_name", sb.toString());
        if (phg.a() == null) {
            return;
        }
        phg.a().a(this.u, "CommentBubbles", hashMap);
    }

    private boolean d(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50843546", new Object[]{this, chatMessage})).booleanValue();
        }
        if (chatMessage == null || chatMessage.renders == null || chatMessage.renders.isEmpty()) {
            return true;
        }
        String str = chatMessage.renders.get(aw.PARAM_CHAT_RENDERS_ENHANCE);
        if (StringUtils.isEmpty(str)) {
            return true;
        }
        return !StringUtils.equals(str, "follow") && !StringUtils.equals(str, "share") && !StringUtils.equals(str, "generalAction");
    }

    private void e(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79d88a83", new Object[]{this, chatMessage});
        } else if (!ply.p()) {
        } else {
            this.v.a(chatMessage.mCommentId);
        }
    }

    private void f(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a32cdfc4", new Object[]{this, chatMessage});
        } else if (this.b == null) {
        } else {
            ((ClipboardManager) this.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Label", chatMessage.mContent));
        }
    }

    private void g(final ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc813505", new Object[]{this, chatMessage});
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.-$$Lambda$d$bIMSNj-a-Z0R_56dQY82OYu0BBI
                @Override // java.lang.Runnable
                public final void run() {
                    d.m948lambda$bIMSNjaZ0R_56dQY82OYu0BBI(d.this, chatMessage);
                }
            }, 200L);
        }
    }

    public /* synthetic */ void h(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d58a46", new Object[]{this, chatMessage});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(InputFrame3.INPUT_TYPE, InputFrame3.TYPE_RESPONSE);
        hashMap.put(InputFrame3.REPLIED_COMMENT_ID, chatMessage.mCommentId);
        hashMap.put(InputFrame3.REPLIED_COMMENT_NICK, chatMessage.mUserNick);
        ddu e = this.u.e();
        com.taobao.alilive.aliliveframework.frame.a aVar = this.u;
        e.a(hfr.SHOW_INPUT_EVENT, hashMap, aVar == null ? null : aVar.G());
    }

    private List<ChatMenuItem> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3e0c1553", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        ChatMenuItem chatMenuItem = new ChatMenuItem();
        chatMenuItem.icon = "https://gw.alicdn.com/imgextra/i3/O1CN01bi9FQe26gX0RZhP88_!!6000000007691-2-tps-60-60.png";
        chatMenuItem.text = "回复";
        chatMenuItem.position = 0;
        ChatMenuItem chatMenuItem2 = new ChatMenuItem();
        chatMenuItem2.icon = "https://gw.alicdn.com/imgextra/i3/O1CN01O1DsmA1YLk5juO6Fg_!!6000000003043-2-tps-60-60.png";
        chatMenuItem2.text = "复制";
        chatMenuItem2.position = 1;
        arrayList.add(chatMenuItem);
        arrayList.add(chatMenuItem2);
        List<ChatMenuItem> n2 = n();
        if (n2 != null) {
            arrayList.addAll(n2);
        }
        return arrayList;
    }

    private List<ChatMenuItem> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("25adebb2", new Object[]{this});
        }
        if (!ply.p() || this.s) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ChatMenuItem chatMenuItem = new ChatMenuItem();
        chatMenuItem.icon = "https://gw.alicdn.com/imgextra/i1/O1CN01BZkqNb1xOMkrSzYMc_!!6000000006433-2-tps-60-60.png";
        chatMenuItem.text = "举报";
        chatMenuItem.position = 2;
        arrayList.add(chatMenuItem);
        return arrayList;
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        View a2 = this.I.a();
        if (a2 == null || a2.getLayoutParams() == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
        layoutParams.width = com.taobao.taolive.room.utils.d.a(this.b, this.g);
        a2.setLayoutParams(layoutParams);
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        View a2 = this.G.a();
        if (a2 != null && a2.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
            layoutParams.width = com.taobao.taolive.room.utils.d.a(this.b, this.g);
            a2.setLayoutParams(layoutParams);
        }
        View a3 = this.H.a();
        if (a3 == null || a3.getLayoutParams() == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = a3.getLayoutParams();
        layoutParams2.width = com.taobao.taolive.room.utils.d.a(this.b, this.g);
        a3.setLayoutParams(layoutParams2);
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.h;
        if (recyclerView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, com.taobao.taolive.room.utils.d.a(this.b, 180.0f));
        } else {
            layoutParams.height = com.taobao.taolive.room.utils.d.a(this.b, 180.0f);
        }
        layoutParams.width = com.taobao.taolive.room.utils.d.a(this.b, this.g);
        this.h.setLayoutParams(layoutParams);
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        View c = this.z.c();
        if (c == null || c.getLayoutParams() == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = c.getLayoutParams();
        layoutParams.width = com.taobao.taolive.room.utils.d.a(this.b, this.g);
        c.setLayoutParams(layoutParams);
    }

    public void a(View view) {
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        this.d = view;
        if (!y.a() || !this.s) {
            return;
        }
        if ((!y.b(this.b) && !y.c(this.b)) || (view2 = this.d) == null || view2.getLayoutParams() == null) {
            return;
        }
        this.d.getLayoutParams().width = com.taobao.taolive.room.utils.d.c();
        View view3 = this.d;
        view3.setLayoutParams(view3.getLayoutParams());
    }

    public void a(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd977ce1", new Object[]{this, tBLiveDataModel});
            return;
        }
        b("ChatView3 setData");
        this.B.a();
        this.e = tBLiveDataModel;
        Context context = this.b;
        this.g = com.taobao.taolive.room.utils.d.b(context, plz.b(context));
        this.f13647a.a(tBLiveDataModel);
        d();
        if (this.N && this.L != 0) {
            this.x.sendEmptyMessageDelayed(482, this.M);
        } else {
            a(tBLiveDataModel.mVideoInfo);
            this.P = true;
        }
        hgi hgiVar = new hgi();
        if (phg.d().a()) {
            hgiVar.f28616a = "diantao";
        } else {
            hgiVar.f28616a = "taobao";
        }
        this.v = new hgh(this.b, this.e, hgiVar, this.u);
        this.w = true;
        if (p.B()) {
            return;
        }
        if (tki.a()) {
            A();
        } else {
            B();
        }
    }

    private void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        b("ChatView3 showTrivialBottomViewNew");
        com.taobao.alilive.aliliveframework.frame.a aVar = this.u;
        if (!(aVar instanceof com.taobao.taolive.sdk.core.h) || ((com.taobao.taolive.sdk.core.h) aVar).O() == null) {
            return;
        }
        ((com.taobao.taolive.sdk.core.h) this.u).O().a(new b.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.mergeInfo.b.a
            public void onUnImportantLiveInfoError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8d54c3ef", new Object[]{this, new Integer(i), netResponse, obj});
                }
            }

            @Override // com.taobao.taolive.sdk.mergeInfo.b.a
            public void onUnImportantLiveInfoSystemError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("61b1993e", new Object[]{this, new Integer(i), netResponse, obj});
                }
            }

            {
                d.this = this;
            }

            @Override // com.taobao.taolive.sdk.mergeInfo.b.a
            public void onUnImportantLiveInfoSuccess(int i, NetResponse netResponse, UnImportantLiveInfoResponseData unImportantLiveInfoResponseData, Object obj) {
                TrivialQueryResponseData trivialQueryResponseData;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3bacf307", new Object[]{this, new Integer(i), netResponse, unImportantLiveInfoResponseData, obj});
                } else if (unImportantLiveInfoResponseData == null || unImportantLiveInfoResponseData.trivialData == null || (trivialQueryResponseData = (TrivialQueryResponseData) tkg.a(unImportantLiveInfoResponseData.trivialData, TrivialQueryResponseData.class)) == null) {
                } else {
                    d.this.a(trivialQueryResponseData);
                }
            }
        });
    }

    private void B() {
        IUniversalProxy.b liveBizRequestManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        b("ChatView3 showTrivialBottomViewOld");
        if (!com.taobao.android.live.plugin.proxy.c.a().d() || com.taobao.android.live.plugin.proxy.f.o() == null || (liveBizRequestManager = com.taobao.android.live.plugin.proxy.f.o().getLiveBizRequestManager()) == null) {
            return;
        }
        a(liveBizRequestManager.b());
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        b("ChatView3 destroy");
        b bVar = this.B;
        if (bVar != null) {
            bVar.b();
        }
        View view = this.R;
        if (view instanceof MonitorSizeChangeLayout) {
            ((MonitorSizeChangeLayout) view).setOnSizeChangeListener(null);
        }
        BaseTopMessageView baseTopMessageView = this.o;
        if (baseTopMessageView != null) {
            baseTopMessageView.setHideRank();
            this.o.releaseAnimation();
        }
        BaseTopMessageView baseTopMessageView2 = this.p;
        if (baseTopMessageView2 != null) {
            baseTopMessageView2.setHideRank();
            this.o.releaseAnimation();
        }
        a.InterfaceC0528a interfaceC0528a = this.f13647a;
        if (interfaceC0528a != null) {
            interfaceC0528a.g();
        }
        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.d dVar = this.r;
        if (dVar != null) {
            dVar.b();
        }
        hfw hfwVar = this.k;
        if (hfwVar != null) {
            hfwVar.b();
        }
        j jVar = this.c;
        if (jVar != null) {
            jVar.a();
        }
        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.bottom.c cVar = this.z;
        if (cVar != null) {
            cVar.b();
        }
        com.taobao.taolive.room.business.trivial.a aVar = this.G;
        if (aVar != null) {
            aVar.b();
        }
        hgk hgkVar = this.H;
        if (hgkVar != null) {
            hgkVar.b();
        }
        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sale.c cVar2 = this.U;
        if (cVar2 != null) {
            cVar2.a();
        }
        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster.b bVar2 = this.I;
        if (bVar2 != null) {
            bVar2.b();
        }
        this.x.removeCallbacksAndMessages(null);
        RecyclerView.ItemDecoration itemDecoration = this.A;
        if (itemDecoration != null) {
            this.h.removeItemDecoration(itemDecoration);
        }
        this.P = false;
        this.O = 0;
        this.ae = 0;
        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.i iVar = this.J;
        if (iVar != null) {
            iVar.a();
            y();
        }
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            recyclerView.swapAdapter(null, true);
        }
        this.ab = false;
        this.ad = false;
        this.ac = false;
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f13647a.a(z);
        this.h.setVisibility(0);
        hfw hfwVar = this.k;
        if (hfwVar != null) {
            hfwVar.a();
        }
        t();
        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.d dVar = this.r;
        if (dVar == null) {
            return;
        }
        dVar.b();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        g();
        View view = this.d;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        f();
        View view = this.d;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (!p.B()) {
        } else {
            b("ChatView3 onThirdTrigger");
            com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster.b bVar = this.I;
            if (bVar != null) {
                bVar.g();
            }
            if (tki.a()) {
                A();
            } else {
                B();
            }
            com.taobao.android.live.plugin.atype.flexalocal.comments.chat.bottom.c cVar = this.z;
            if (cVar != null) {
                cVar.a();
            }
            if (u() && this.r != null) {
                b("ChatView3 onThirdTrigger showFirstTopMsg");
                com.taobao.android.live.plugin.atype.flexalocal.comments.chat.f a2 = this.r.a();
                if (a2 instanceof ChatTopMessage) {
                    this.q.setTopViewStyle((ChatTopMessage) a2);
                    a(false);
                }
            }
            this.ab = true;
        }
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
        } else if (!p.B()) {
        } else {
            b("ChatView3 onFourthTrigger");
            E();
        }
    }

    private void E() {
        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sale.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        this.ac = true;
        TBLiveDataModel tBLiveDataModel = this.e;
        if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null || this.e.mVideoInfo.broadCaster == null || (cVar = this.U) == null) {
            return;
        }
        cVar.a(this.e.mVideoInfo.liveId, this.e.mVideoInfo.broadCaster.accountId);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void d(Object obj) {
        j jVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b9de07", new Object[]{this, obj});
        } else if (!(obj instanceof TopAtmosphereMessage) || (jVar = this.c) == null) {
        } else {
            jVar.a((TopAtmosphereMessage) obj);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void a(TrivialQueryResponseData trivialQueryResponseData) {
        List<TrivialQueryResponseData.ChatItemCommonData> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4755569a", new Object[]{this, trivialQueryResponseData});
        } else if (trivialQueryResponseData != null && trivialQueryResponseData.resultVO != null && trivialQueryResponseData.resultVO.commonPMVO != null && (list = trivialQueryResponseData.resultVO.commonPMVO.pmlist) != null && list.size() != 0) {
            for (TrivialQueryResponseData.ChatItemCommonData chatItemCommonData : list) {
                com.taobao.taolive.room.business.trivial.a aVar = this.G;
                if (aVar != null) {
                    aVar.a(chatItemCommonData);
                }
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void c(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("272fe001", new Object[]{this, chatMessage});
        } else if (!this.l || !chatMessage.isOnScreen || this.k == null) {
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.comments.chat.bottom.c cVar = this.z;
            if (cVar != null && cVar.a(chatMessage)) {
                return;
            }
            com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster.b bVar = this.I;
            if (bVar != null && bVar.a(chatMessage)) {
                return;
            }
            this.k.a(chatMessage, !p.B() || this.ae == 0);
            this.O++;
            if (!this.P && this.O >= this.L) {
                this.x.removeMessages(482);
                this.P = true;
                a(this.e.mVideoInfo);
            }
            if (chatMessage.scrollToMsg) {
                this.w = true;
            }
            if (this.m == 0 && this.w) {
                ((LinearLayoutManager) this.h.getLayoutManager()).scrollToPositionWithOffset(this.k.getItemCount() - 1, 0);
                l();
            } else if (this.K) {
            } else {
                k();
            }
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        if (this.l) {
            this.f13647a.e();
        }
        RecyclerView recyclerView = this.h;
        if (recyclerView == null) {
            return;
        }
        recyclerView.setLayoutFrozen(false);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        if (this.l) {
            this.f13647a.f();
        }
        RecyclerView recyclerView = this.h;
        if (recyclerView == null) {
            return;
        }
        recyclerView.setLayoutFrozen(true);
    }

    private void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        BaseTopMessageView baseTopMessageView = this.o;
        if (baseTopMessageView != null) {
            baseTopMessageView.hideWithAnimation(null);
        }
        BaseTopMessageView baseTopMessageView2 = this.p;
        if (baseTopMessageView2 == null) {
            return;
        }
        baseTopMessageView2.hideWithAnimation(null);
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.q.equals(this.o)) {
            if (!z) {
                this.p.hideWithAnimation(null);
            }
            this.o.showWithAnimation();
            this.q = this.p;
        } else {
            if (!z) {
                this.o.hideWithAnimation(null);
            }
            this.p.showWithAnimation();
            this.q = this.o;
        }
    }

    private boolean a(ChatTopMessage chatTopMessage) {
        BaseTopMessageView baseTopMessageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1370b69", new Object[]{this, chatTopMessage})).booleanValue();
        }
        BaseTopMessageView baseTopMessageView2 = this.o;
        return baseTopMessageView2 != null && baseTopMessageView2.isHighRank(chatTopMessage) && (baseTopMessageView = this.p) != null && baseTopMessageView.isHighRank(chatTopMessage);
    }

    private boolean z() {
        TBLiveDataModel tBLiveDataModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue();
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.u;
        return ((aVar == null || aVar.i() == null || this.u.i().b() == null || !this.u.i().b().equals(VideoStatus.VIDEO_TIMESHIFT_STATUS)) && ((tBLiveDataModel = this.e) == null || tBLiveDataModel.mVideoInfo == null || this.e.mVideoInfo.roomStatus == null || !"2".equals(this.e.mVideoInfo.roomStatus))) ? false : true;
    }

    private boolean u() {
        BaseTopMessageView baseTopMessageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue();
        }
        BaseTopMessageView baseTopMessageView2 = this.o;
        return baseTopMessageView2 != null && baseTopMessageView2.getVisibility() == 4 && (baseTopMessageView = this.p) != null && baseTopMessageView.getVisibility() == 4;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        hfw hfwVar = this.k;
        if (hfwVar == null) {
            return;
        }
        hfwVar.a();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.MonitorSizeChangeLayout.a
    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.h == null) {
        } else {
            this.S = com.taobao.taolive.room.utils.d.a(this.b, 180.0f);
            int i5 = this.S;
            if (i5 == 0) {
                return;
            }
            int i6 = i5 - i4;
            if (this.h.getLayoutParams() == null) {
                this.h.setLayoutParams(new ViewGroup.LayoutParams(-2, i6));
            } else {
                ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
                if (layoutParams.height != i6) {
                    layoutParams.height = i6;
                    this.h.setLayoutParams(layoutParams);
                }
            }
            if (hkk.f()) {
                return;
            }
            b(false);
        }
    }

    public void b(final boolean z) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (this.j == null || (frameLayout = this.E) == null) {
        } else {
            frameLayout.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    d.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    int i = 0;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d.j(d.this).getLayoutParams();
                    if (!z) {
                        i = d.k(d.this).getMeasuredHeight();
                    }
                    layoutParams.bottomMargin = i;
                    d.j(d.this).setLayoutParams(layoutParams);
                }
            });
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i != 5) {
        } else {
            b();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        ArrayList<ConventionItem> arrayList = null;
        if (obj instanceof VideoInfo) {
            VideoInfo videoInfo = (VideoInfo) obj;
            if (videoInfo.conventionList != null && videoInfo.conventionList.size() > 0) {
                arrayList = videoInfo.conventionList;
            }
        }
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                ConventionItem conventionItem = arrayList.get(i);
                if (!StringUtils.isEmpty(conventionItem.content) && !StringUtils.isEmpty(conventionItem.mockNick) && !this.W) {
                    ChatMessage createConventionMessage = ChatTopMessage.createConventionMessage(conventionItem.mockNick, conventionItem.content, R.color.taolive_room_chat_color2);
                    createConventionMessage.isAnchor = true;
                    createConventionMessage.mTextColor = this.b.getResources().getColor(R.color.taolive_room_chat_color6);
                    if (!StringUtils.isEmpty("")) {
                        createConventionMessage.mUserIcon = "";
                    }
                    c(createConventionMessage);
                }
            }
        }
        f(obj);
    }

    private void f(Object obj) {
        AccountInfo.BroadCasterTag broadCasterTag;
        AccountInfo.BroadCasterTag broadCasterTag2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("191d1089", new Object[]{this, obj});
            return;
        }
        this.ad = true;
        ATaoLiveOpenEntity o = this.u.o();
        if ((!((o == null || o.abilityCompontent == null || !o.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_AVATAR_COMMENT_MIX)) ? false : true) && !com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.g()) || !(obj instanceof VideoInfo)) {
            return;
        }
        VideoInfo videoInfo = (VideoInfo) obj;
        final ChatMessage chatMessage = new ChatMessage();
        final ChatMessage.ChatItemCommonData chatItemCommonData = new ChatMessage.ChatItemCommonData();
        chatItemCommonData.templateName = "taobao_live_avatar_comment_mix";
        chatItemCommonData.bizType = "avatar_comment_mix";
        chatItemCommonData.showType = "avatar_comment_mix";
        chatItemCommonData.data = new JSONObject();
        chatItemCommonData.data.put("liveDetail", obj);
        String str = "";
        String str2 = com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().b(videoInfo) ? videoInfo.officialLiveInfo.officialHeadImg : videoInfo.broadCaster == null ? str : videoInfo.broadCaster.headImg;
        String str3 = videoInfo.recommendReason;
        String str4 = null;
        if (com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().b(videoInfo)) {
            if (videoInfo.officialLiveInfo != null && videoInfo.officialLiveInfo.viconInfos != null && videoInfo.officialLiveInfo.viconInfos.size() > 0 && (broadCasterTag2 = videoInfo.officialLiveInfo.viconInfos.get(0)) != null) {
                str4 = broadCasterTag2.text;
            }
        } else if (videoInfo.broadCaster != null && videoInfo.broadCaster.viconInfos != null && videoInfo.broadCaster.viconInfos.size() > 0 && (broadCasterTag = videoInfo.broadCaster.viconInfos.get(0)) != null) {
            str4 = broadCasterTag.text;
        }
        String str5 = com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().b(videoInfo) ? str : videoInfo.location;
        String valueOf = com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().b(videoInfo) ? "false" : String.valueOf("1".equals(videoInfo.itemNoBeauty));
        if (com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().b(videoInfo)) {
            str = videoInfo.officialLiveInfo.accountName;
        } else if (videoInfo.broadCaster != null) {
            str = videoInfo.broadCaster.accountName;
        }
        String format = StringUtils.isEmpty(videoInfo.liveIntroduction) ? String.format(com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.k(), str) : videoInfo.liveIntroduction;
        if (StringUtils.isEmpty(format) && "false".equals(valueOf) && ((StringUtils.isEmpty(str5) || StringUtils.isEmpty(str5.trim())) && StringUtils.isEmpty(str4))) {
            return;
        }
        chatItemCommonData.data.put("avatarUrl", (Object) str2);
        chatItemCommonData.data.put("vIconText", (Object) str4);
        chatItemCommonData.data.put("location", (Object) str5);
        chatItemCommonData.data.put("noFilter", (Object) valueOf);
        chatItemCommonData.data.put("avatarMixComment", (Object) format);
        if (str3 != null && hkk.A()) {
            chatItemCommonData.data.put("recReason", (Object) str3);
            chatItemCommonData.data.put("noFilter", (Object) "false");
        }
        chatMessage.chatItemCommonData = chatItemCommonData;
        Runnable runnable = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                d.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (d.l(d.this)) {
                } else {
                    d.this.c(chatMessage);
                    if (!hkk.a(d.this.e) || d.h(d.this) == null) {
                        return;
                    }
                    d.a(d.this, chatItemCommonData.data, "taobao_live_avatar_comment_mix", "avatar_comment_mix");
                }
            }
        };
        if (com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.l() && a(format)) {
            a(runnable);
        } else {
            runnable.run();
        }
    }

    private void a(final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            new com.taobao.android.live.plugin.atype.flexalocal.comments.chat.net.a(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    d.this = this;
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    } else if (!(netBaseOutDo instanceof PersonalityIntroResp)) {
                    } else {
                        JSONObject jSONObject = ((PersonalityIntroResp) netBaseOutDo).data;
                        JSONObject jSONObject2 = jSONObject != null ? jSONObject.getJSONObject("data") : new JSONObject();
                        JSONObject jSONObject3 = jSONObject2 != null ? jSONObject2.getJSONObject("data") : new JSONObject();
                        ChatMessage chatMessage = new ChatMessage();
                        ChatMessage.ChatItemCommonData chatItemCommonData = new ChatMessage.ChatItemCommonData();
                        chatItemCommonData.templateName = "taolive_comment_personality_introduction";
                        chatItemCommonData.data = jSONObject3;
                        chatItemCommonData.bizType = "ai_personality_introduction";
                        chatItemCommonData.showType = "ai_personality_introduction";
                        chatMessage.chatItemCommonData = chatItemCommonData;
                        d.this.c(chatMessage);
                        if (hkk.a(d.this.e) && d.h(d.this) != null) {
                            d.a(d.this, chatItemCommonData.data, "taolive_comment_personality_introduction", "ai_personality_introduction");
                        }
                        if (phg.a() != null) {
                            JSONObject jSONObject4 = jSONObject3 != null ? jSONObject3.getJSONObject(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ACTIONS) : new JSONObject();
                            String string = jSONObject4 != null ? jSONObject4.getString("type") : "";
                            HashMap<String, String> hashMap = new HashMap<>();
                            hashMap.put("btn_name", string);
                            phg.a().a(d.m(d.this), "PersonalGreeting", hashMap);
                        }
                        try {
                            String str = d.this.e.mVideoInfo.broadCaster.accountId;
                            String a2 = ad.a("personlity_introduction_" + str);
                            String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
                            if (!StringUtils.isEmpty(a2)) {
                                String[] split = a2.split(",");
                                if (split.length != 2) {
                                    return;
                                }
                                String str2 = split[0];
                                int parseInt = Integer.parseInt(split[1]);
                                if (format.equals(str2)) {
                                    ad.a("personlity_introduction_" + str, format + "," + (parseInt + 1));
                                    return;
                                }
                                ad.a("personlity_introduction_" + str, format + ",1");
                                return;
                            }
                            ad.a("personlity_introduction_" + str, format + ",1");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                        return;
                    }
                    pnj m = pmd.a().m();
                    m.c("ChatView3", "onError:" + netResponse);
                    runnable.run();
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                        return;
                    }
                    pnj m = pmd.a().m();
                    m.c("ChatView3", "onSystemError:" + netResponse);
                    runnable.run();
                }
            }).a(this.e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "ChatView3"
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L1e
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r5] = r8
            r0[r4] = r9
            java.lang.String r9 = "f3a64c36"
            java.lang.Object r9 = r1.ipc$dispatch(r9, r0)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L1e:
            int r1 = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.m()     // Catch: java.lang.Exception -> L72
            com.taobao.taolive.sdk.model.TBLiveDataModel r2 = r8.e     // Catch: java.lang.Exception -> L72
            com.taobao.taolive.sdk.model.common.VideoInfo r2 = r2.mVideoInfo     // Catch: java.lang.Exception -> L72
            com.taobao.taolive.sdk.model.common.AccountInfo r2 = r2.broadCaster     // Catch: java.lang.Exception -> L72
            java.lang.String r2 = r2.accountId     // Catch: java.lang.Exception -> L72
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L72
            r6.<init>()     // Catch: java.lang.Exception -> L72
            java.lang.String r7 = "personlity_introduction_"
            r6.append(r7)     // Catch: java.lang.Exception -> L72
            r6.append(r2)     // Catch: java.lang.Exception -> L72
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Exception -> L72
            java.lang.String r2 = com.taobao.taolive.room.utils.ad.a(r2)     // Catch: java.lang.Exception -> L72
            boolean r6 = android.text.StringUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L72
            if (r6 != 0) goto L92
            java.lang.String r6 = ","
            java.lang.String[] r2 = r2.split(r6)     // Catch: java.lang.Exception -> L72
            int r6 = r2.length     // Catch: java.lang.Exception -> L72
            if (r6 != r3) goto L92
            r3 = r2[r5]     // Catch: java.lang.Exception -> L72
            r2 = r2[r4]     // Catch: java.lang.Exception -> L72
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> L72
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L72
            java.lang.String r7 = "yyyy-MM-dd"
            r6.<init>(r7)     // Catch: java.lang.Exception -> L72
            java.util.Date r7 = new java.util.Date     // Catch: java.lang.Exception -> L72
            r7.<init>()     // Catch: java.lang.Exception -> L72
            java.lang.String r6 = r6.format(r7)     // Catch: java.lang.Exception -> L72
            boolean r3 = r6.equals(r3)     // Catch: java.lang.Exception -> L72
            if (r3 == 0) goto L92
            int r2 = r2 + r4
            if (r2 <= r1) goto L92
            r1 = 1
            goto L93
        L72:
            r1 = move-exception
            tb.pmd r2 = tb.pmd.a()
            tb.pnj r2 = r2.m()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "reqPersonalityLiveIntroduction, e:"
            r3.append(r6)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r2.c(r0, r3)
            r1.printStackTrace()
        L92:
            r1 = 0
        L93:
            if (r1 == 0) goto Lb2
            tb.pmd r9 = tb.pmd.a()
            tb.pnj r9 = r9.m()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "reqPersonalityLiveIntroduction, reachMaxCnt:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r9.c(r0, r1)
            return r5
        Lb2:
            boolean r1 = android.text.StringUtils.isEmpty(r9)
            if (r1 == 0) goto Lc6
            tb.pmd r9 = tb.pmd.a()
            tb.pnj r9 = r9.m()
            java.lang.String r1 = "reqPersonalityLiveIntroduction, liveIntroduction empty"
            r9.c(r0, r1)
            return r4
        Lc6:
            java.lang.String r1 = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.n()
            boolean r2 = android.text.StringUtils.isEmpty(r1)
            if (r2 == 0) goto Lde
            tb.pmd r9 = tb.pmd.a()
            tb.pnj r9 = r9.m()
            java.lang.String r1 = "reqPersonalityLiveIntroduction, regStr empty"
            r9.c(r0, r1)
            return r5
        Lde:
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r1)     // Catch: java.lang.Exception -> Leb
            java.util.regex.Matcher r9 = r0.matcher(r9)     // Catch: java.lang.Exception -> Leb
            boolean r9 = r9.matches()     // Catch: java.lang.Exception -> Leb
            return r9
        Leb:
            r9 = move-exception
            r9.printStackTrace()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.a(java.lang.String):boolean");
    }

    private void a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95510c9c", new Object[]{this, jSONObject, str, str2});
            return;
        }
        this.J.f13620a = com.taobao.android.live.plugin.proxy.f.m().createDX(this.b, str);
        if (this.J.f13620a == null || this.i == null || this.k == null) {
            return;
        }
        int i = 0;
        while (true) {
            if (i < this.k.getItemCount()) {
                if (this.k.a(i).chatItemCommonData != null && str2.equals(this.k.a(i).chatItemCommonData.showType)) {
                    this.J.b = i;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        Context context = this.b;
        jSONObject.put("maxWidth", (Object) Integer.valueOf(gbg.c(context, com.taobao.taolive.room.utils.d.a(context, this.g))));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.J.f13620a.getWidth(), this.J.f13620a.getHeight());
        marginLayoutParams.setMargins(com.taobao.taolive.room.utils.d.a(this.b, 12.0f), 0, com.taobao.taolive.room.utils.d.a(this.b, 12.0f), 0);
        this.i.removeView(this.J.f13620a);
        this.i.addView(this.J.f13620a, 0, marginLayoutParams);
        com.taobao.android.live.plugin.proxy.f.m().renderDX(this.J.f13620a, jSONObject);
        this.J.f13620a.setVisibility(8);
    }

    private void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
        } else if (this.J.f13620a == null) {
        } else {
            this.J.f13620a.setVisibility(0);
            com.taobao.android.live.plugin.atype.flexalocal.comments.chat.i iVar = this.J;
            iVar.c = true;
            iVar.e = new AnonymousClass11(5000L, 1000L);
            this.J.e.start();
        }
    }

    /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d$11 */
    /* loaded from: classes5.dex */
    public class AnonymousClass11 extends CountDownTimer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ void lambda$XCupdLGGJyLD8A0n2RS0fEjD0OU(AnonymousClass11 anonymousClass11, ValueAnimator valueAnimator) {
            anonymousClass11.a(valueAnimator);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j)});
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(long j, long j2) {
            super(j, j2);
            d.this = r1;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
            } else if (d.h(d.this) == null || d.h(d.this).f13620a == null) {
            } else {
                d.h(d.this).g = ValueAnimator.ofInt(d.h(d.this).f13620a.getHeight(), 0);
                d.h(d.this).g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.-$$Lambda$d$11$XCupdLGGJyLD8A0n2RS0fEjD0OU
                    {
                        d.AnonymousClass11.this = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        d.AnonymousClass11.lambda$XCupdLGGJyLD8A0n2RS0fEjD0OU(d.AnonymousClass11.this, valueAnimator);
                    }
                });
                d.h(d.this).g.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d.11.1
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

                    {
                        AnonymousClass11.this = this;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        } else {
                            d.n(d.this);
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                        } else {
                            d.n(d.this);
                        }
                    }
                });
                d.h(d.this).g.setDuration(500L);
                d.h(d.this).g.start();
            }
        }

        public /* synthetic */ void a(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12ce38cc", new Object[]{this, valueAnimator});
            } else if (d.h(d.this) == null || d.h(d.this).f13620a == null) {
            } else {
                ViewGroup.LayoutParams layoutParams = d.h(d.this).f13620a.getLayoutParams();
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                d.h(d.this).f13620a.setLayoutParams(layoutParams);
            }
        }
    }

    private void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.-$$Lambda$d$EXpZXVQKzySraR0r4TzLtDPIhRc
                {
                    d.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    d.lambda$EXpZXVQKzySraR0r4TzLtDPIhRc(d.this);
                }
            });
        }
    }

    public /* synthetic */ void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.i iVar = this.J;
        if (iVar == null || iVar.f13620a == null || this.i == null) {
            return;
        }
        this.J.f13620a.setVisibility(8);
        this.i.removeView(this.J.f13620a);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void a(ArrayList<ChatMessage> arrayList) {
        hfw hfwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            return;
        }
        ArrayList<ChatMessage> arrayList2 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).mType != ChatMessage.MessageType.FOLLOW) {
                arrayList2.add(arrayList.get(i));
            }
        }
        if (arrayList2.size() <= 0 || (hfwVar = this.k) == null) {
            return;
        }
        hfwVar.a(arrayList2);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
        } else if (((Boolean) obj).booleanValue()) {
            c(false);
        } else {
            b();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8844c6", new Object[]{this, obj});
        } else if (!(obj instanceof CommentCountMessage)) {
        } else {
            CommentCountMessage commentCountMessage = (CommentCountMessage) obj;
            if (!"commentCount".equals(commentCountMessage.type) || this.c == null) {
                return;
            }
            this.c.a(TopAtmosphereMessage.buildFromCommentCountMessage(commentCountMessage));
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.ae = i;
        a.InterfaceC0528a interfaceC0528a = this.f13647a;
        if (interfaceC0528a == null) {
            return;
        }
        interfaceC0528a.a(i);
    }

    private static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue();
        }
        Boolean bool = n;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(v.b.a("tblive", "enableDXTopMessage", true));
        n = valueOf;
        return valueOf.booleanValue();
    }

    @Override // tb.hgl
    public void a(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d487357f", new Object[]{this, chatMessage});
            return;
        }
        hfw hfwVar = this.k;
        if (hfwVar == null) {
            return;
        }
        hfwVar.a(chatMessage);
        i();
    }

    @Override // tb.hgl
    public void b(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fddb8ac0", new Object[]{this, chatMessage});
            return;
        }
        hfw hfwVar = this.k;
        if (hfwVar == null) {
            return;
        }
        hfwVar.b(chatMessage);
        i();
    }

    /* loaded from: classes5.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static final long f13660a;
        private final WeakReference<d> b;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        static {
            kge.a(1895196011);
            f13660a = ply.E();
        }

        private a(d dVar) {
            this.b = new WeakReference<>(dVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 481) {
                if (this.b.get() == null) {
                    return;
                }
                d dVar = this.b.get();
                d.b(dVar, true);
                if (d.g(dVar) != 0 || d.d(dVar) == null || d.e(dVar) == null || d.e(dVar).getItemCount() <= 0) {
                    return;
                }
                d.d(dVar).smoothScrollToPosition(d.e(dVar).getItemCount() - 1);
            } else if (i != 482) {
            } else {
                d dVar2 = this.b.get();
                if (dVar2 != null && dVar2.e != null && !d.o(dVar2)) {
                    d.d(dVar2, true);
                    dVar2.a(dVar2.e.mVideoInfo);
                }
                if (!p.B() || dVar2 == null || d.p(dVar2) || d.q(dVar2)) {
                    return;
                }
                d.r(dVar2);
            }
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.u == null) {
        } else {
            q.b("ChatWarmOpt", this.u.j() + " " + str);
        }
    }
}
