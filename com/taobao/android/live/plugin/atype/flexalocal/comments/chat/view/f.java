package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.i;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.message.TopAtmosphereMessage;
import com.taobao.taolive.sdk.utils.q;
import tb.kge;

/* loaded from: classes5.dex */
public class f extends i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f13661a;
    private Runnable b;

    static {
        kge.a(-1801218029);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public f(Context context, View view, i.b bVar, i.c cVar, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, view, bVar, cVar, aVar);
        this.b = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.f.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(f.this.c, R.anim.taolive_certification_out_flexalocal);
                    loadAnimation.setDuration(500L);
                    loadAnimation.setAnimationListener(new i.a(2));
                    f.this.d.startAnimation(loadAnimation);
                } catch (Throwable th) {
                    q.b("TopAtmosphereAnchorCertView", "mAnchorCertificateRunnable e: " + th.getMessage());
                }
            }
        };
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.i
    public void a(TopAtmosphereMessage topAtmosphereMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5985932", new Object[]{this, topAtmosphereMessage});
        } else if (topAtmosphereMessage == null || topAtmosphereMessage.data == null) {
        } else {
            this.f13661a = true;
            b(topAtmosphereMessage);
            c(topAtmosphereMessage);
            b(0);
        }
    }

    private void c(TopAtmosphereMessage topAtmosphereMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d25a60f0", new Object[]{this, topAtmosphereMessage});
            return;
        }
        this.j.setText(topAtmosphereMessage.data.backgroundTitle);
        this.j.setTextSize(1, 10.0f);
        this.j.setTypeface(Typeface.DEFAULT, 0);
        this.i.setText(topAtmosphereMessage.data.content);
        this.i.setTextSize(1, 14.0f);
        try {
            this.i.setTypeface(Typeface.DEFAULT, 1);
        } catch (Exception unused) {
        }
        this.f.setVisibility(0);
        this.f.setImageUrl(topAtmosphereMessage.data.iconImg);
        this.e.setImageUrl(topAtmosphereMessage.data.backgroundImg);
        this.k.setText("");
        this.k.setVisibility(8);
        this.h.setVisibility(8);
        c();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.i
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f13661a;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.i
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.d.removeCallbacks(this.b);
        if (i != 0) {
            if (i == 1) {
                this.d.postDelayed(this.b, 3000L);
                return;
            } else if (i != 2) {
                return;
            } else {
                this.d.setVisibility(4);
                this.f13661a = false;
                if (this.n == null) {
                    return;
                }
                this.d.postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.f.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (f.this.n == null) {
                        } else {
                            f.this.n.a(TopAtmosphereMessage.TopAtmosphereMessageType.ANCHOR_CERTIFICATE);
                        }
                    }
                }, 2000L);
                return;
            }
        }
        try {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.c, R.anim.taolive_certification_in2_flexalocal);
            loadAnimation.setAnimationListener(new i.a(1));
            loadAnimation.setDuration(500L);
            this.d.startAnimation(loadAnimation);
        } catch (Throwable th) {
            q.b("TopAtmosphereAnchorCertView", "onEnterAnimationEnd exception: " + th.getMessage());
        }
    }
}
