package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import tb.cgl;
import tb.kge;
import tb.plz;

/* loaded from: classes5.dex */
public class d implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View b;
    private Context c;
    private com.taobao.alilive.aliliveframework.frame.a d;
    private TextView e;
    private SaysClusterLeftContentView f;
    private SpannableString g;
    private ViewStub h;

    /* renamed from: a */
    private int f13625a = Result.ALIPAY_BASE64_ENCODE_ERROR;
    private boolean i = false;

    static {
        kge.a(395212850);
        kge.a(1534315251);
    }

    /* renamed from: lambda$IbBD9NtNPvyurPBqHM-JrznBcgM */
    public static /* synthetic */ void m946lambda$IbBD9NtNPvyurPBqHMJrznBcgM(d dVar, int i, ChatMessage chatMessage) {
        dVar.b(i, chatMessage);
    }

    public static /* synthetic */ void lambda$NzFTGLfgkuvEz513Yedd6ys_u80(d dVar, Context context, com.taobao.alilive.aliliveframework.frame.a aVar, ViewGroup viewGroup) {
        dVar.b(context, aVar, viewGroup);
    }

    /* renamed from: lambda$nPe-WxDB6DF5R_wefYoQuHsGHKA */
    public static /* synthetic */ void m947lambda$nPeWxDB6DF5R_wefYoQuHsGHKA(d dVar) {
        dVar.e();
    }

    private void b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3684528", new Object[]{this, viewGroup});
            return;
        }
        ViewStub viewStub = new ViewStub(this.c);
        viewStub.setLayoutResource(R.layout.taolive_bottom_syas_cluster_flexalocal);
        this.h = viewStub;
        viewGroup.addView(this.h);
    }

    private void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            return;
        }
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            b(viewGroup);
            this.b = viewGroup;
        }
        if (this.g != null) {
            return;
        }
        this.g = d();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster.c
    public void a(final Context context, final com.taobao.alilive.aliliveframework.frame.a aVar, final ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("264e1da4", new Object[]{this, context, aVar, viewGroup});
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.a(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster.-$$Lambda$d$NzFTGLfgkuvEz513Yedd6ys_u80
                @Override // java.lang.Runnable
                public final void run() {
                    d.lambda$NzFTGLfgkuvEz513Yedd6ys_u80(d.this, context, aVar, viewGroup);
                }
            });
        }
    }

    public /* synthetic */ void b(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45085565", new Object[]{this, context, aVar, viewGroup});
            return;
        }
        this.c = context;
        this.d = aVar;
        Context context2 = this.c;
        this.f13625a = com.taobao.taolive.room.utils.d.b(context2, plz.b(context2));
        a(viewGroup);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster.c
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster.c
    public void a(final int i, final ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a63b89f2", new Object[]{this, new Integer(i), chatMessage});
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.a(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster.-$$Lambda$d$IbBD9NtNPvyurPBqHM-JrznBcgM
                @Override // java.lang.Runnable
                public final void run() {
                    d.m946lambda$IbBD9NtNPvyurPBqHMJrznBcgM(d.this, i, chatMessage);
                }
            });
        }
    }

    public /* synthetic */ void b(int i, ChatMessage chatMessage) {
        RecyclerView D;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a771dcd1", new Object[]{this, new Integer(i), chatMessage});
        } else if (this.b == null) {
        } else {
            ViewStub viewStub = this.h;
            if (viewStub != null && viewStub.getParent() != null) {
                if (this.d.z() != null && (D = this.d.z().D()) != null && (D.getTag(R.id.taolive_room_sayscluster_recycle) instanceof View)) {
                    View view = (View) D.getTag(R.id.taolive_room_sayscluster_recycle);
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    int indexOfChild = ((ViewGroup) this.b).indexOfChild(this.h);
                    ((ViewGroup) this.b).removeView(this.h);
                    ((ViewGroup) this.b).addView(view, indexOfChild);
                } else {
                    View inflate = this.h.inflate();
                    if (this.d.z() != null && this.d.z().D() != null) {
                        this.d.z().D().setTag(R.id.taolive_room_sayscluster_recycle, inflate);
                    }
                }
                this.e = (TextView) this.b.findViewById(R.id.taolive_chat_says_cluster_count);
                this.f = (SaysClusterLeftContentView) this.b.findViewById(R.id.taolive_chat_says_cluster_left_content);
                this.f.setDisableAddOneComment(this.i);
                this.f.setFrameContext(this.d);
            }
            TextView textView = this.e;
            textView.setText(String.valueOf("×" + i + " "));
            this.f.updateLeftContent(chatMessage, c(), this.g);
            this.b.setVisibility(0);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster.c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.a(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster.-$$Lambda$d$nPe-WxDB6DF5R_wefYoQuHsGHKA
                {
                    d.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    d.m947lambda$nPeWxDB6DF5R_wefYoQuHsGHKA(d.this);
                }
            });
        }
    }

    public /* synthetic */ void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        View view = this.b;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    private int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        Paint paint = new Paint();
        paint.setTextSize(this.e.getTextSize());
        return (com.taobao.taolive.room.utils.d.a(this.c, this.f13625a) - com.taobao.taolive.room.utils.d.a(this.c, 50.0f)) - ((int) paint.measureText(this.e.getText().toString()));
    }

    private SpannableString d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("a21b248d", new Object[]{this});
        }
        int a2 = com.taobao.taolive.room.utils.d.a(this.c, 15.0f);
        Drawable drawable = cgl.g().a().getResources().getDrawable(R.drawable.taolive_chat_says_cluster_icon);
        SpannableString spannableString = new SpannableString("SaysIcon");
        drawable.setBounds(0, 0, (drawable.getIntrinsicWidth() * a2) / drawable.getIntrinsicHeight(), a2);
        spannableString.setSpan(new com.taobao.taolive.room.ui.chat.view.c(drawable), 0, 8, 33);
        return spannableString;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster.c
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        SaysClusterLeftContentView saysClusterLeftContentView = this.f;
        if (saysClusterLeftContentView != null) {
            saysClusterLeftContentView.setDisableAddOneComment(z);
        }
        this.i = z;
    }
}
