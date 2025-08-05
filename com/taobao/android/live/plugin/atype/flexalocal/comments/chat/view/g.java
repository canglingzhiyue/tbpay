package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.i;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.message.TopAtmosphereMessage;
import com.taobao.taolive.sdk.utils.q;
import tb.kge;
import tb.ply;

/* loaded from: classes5.dex */
public class g extends i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f13664a;
    private long b;
    private String p;
    private boolean q;
    private boolean r;
    private Runnable s;

    static {
        kge.a(1825975200);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public g(Context context, View view, i.b bVar, i.c cVar, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, view, bVar, cVar, aVar);
        this.f13664a = 2000L;
        this.b = 0L;
        this.p = "";
        this.q = false;
        this.r = false;
        this.s = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(g.this.c, R.anim.taolive_certification_out_flexalocal);
                    loadAnimation.setDuration(500L);
                    loadAnimation.setAnimationListener(new i.a(5));
                    g.this.d.startAnimation(loadAnimation);
                } catch (Throwable th) {
                    q.b("TopAtmosphereBrandHotView", "mCommentComboRunnable e: " + th.getMessage());
                }
            }
        };
    }

    private void c(TopAtmosphereMessage topAtmosphereMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d25a60f0", new Object[]{this, topAtmosphereMessage});
            return;
        }
        this.f13664a = ply.o();
        this.j.setText(topAtmosphereMessage.data.backgroundTitle);
        this.j.setTextSize(1, 14.0f);
        this.j.setTypeface(Typeface.DEFAULT, 1);
        this.i.setText(topAtmosphereMessage.data.content);
        this.i.setTextSize(1, 11.0f);
        this.i.setTypeface(Typeface.DEFAULT, 0);
        this.f.setVisibility(8);
        this.g.setVisibility(0);
        this.g.setImageUrl(topAtmosphereMessage.data.iconImg);
        this.g.setCircleView();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.l.getLayoutParams();
        layoutParams.setMargins(com.taobao.taolive.room.utils.d.a(this.c, 7.0f), layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
        this.l.setLayoutParams(layoutParams);
        this.e.setImageUrl(topAtmosphereMessage.data.backgroundImg);
        this.k.setVisibility(0);
        this.k.setText(b(topAtmosphereMessage.data.getCountShow()));
        this.h.setVisibility(8);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.i
    public void a(TopAtmosphereMessage topAtmosphereMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5985932", new Object[]{this, topAtmosphereMessage});
        } else if (topAtmosphereMessage == null || topAtmosphereMessage.data == null || topAtmosphereMessage.data.pushTime < this.b) {
        } else {
            String str = this.p;
            if (str != null && str.equals(topAtmosphereMessage.data.contentHash) && this.q) {
                a(topAtmosphereMessage.data.getCountShow());
                this.d.removeCallbacks(this.s);
                this.d.postDelayed(this.s, this.f13664a);
            } else {
                c(topAtmosphereMessage);
                b(3);
                this.r = true;
            }
            b(topAtmosphereMessage);
            this.b = topAtmosphereMessage.data.pushTime;
            this.p = topAtmosphereMessage.data.contentHash;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.i
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.r || this.q;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.i
    public void a(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.d.removeCallbacks(this.s);
        if (i == 3) {
            try {
                Animation loadAnimation = AnimationUtils.loadAnimation(this.c, R.anim.taolive_certification_in2_flexalocal);
                loadAnimation.setDuration(500L);
                loadAnimation.setAnimationListener(new i.a(4));
                this.d.startAnimation(loadAnimation);
            } catch (Throwable th) {
                q.b("TopAtmosphereBrandHotView", "onEnterAnimationEnd exception: " + th.getMessage());
            }
        } else if (i != 4) {
            if (i != 5) {
                return;
            }
            this.d.setVisibility(4);
            this.r = false;
            this.q = false;
            if (this.n == null) {
                return;
            }
            this.n.a(TopAtmosphereMessage.TopAtmosphereMessageType.BRAND_HOT);
        } else {
            this.r = false;
            this.q = true;
            if (this.m == null) {
                return;
            }
            TopAtmosphereMessage a2 = this.m.a(TopAtmosphereMessage.TopAtmosphereMessageType.BRAND_HOT);
            if (a2 != null && (str = this.p) != null && str.equals(a2.data.contentHash)) {
                a(a2.data.getCountShow());
                this.d.postDelayed(this.s, this.f13664a);
                this.m.b(TopAtmosphereMessage.TopAtmosphereMessageType.BRAND_HOT);
                return;
            }
            this.d.postDelayed(this.s, this.f13664a);
        }
    }
}
