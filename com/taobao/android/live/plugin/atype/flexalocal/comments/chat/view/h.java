package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.context.atmo.bean.EffectResConfig;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerConfig;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.i;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.model.message.TopAtmosphereMessage;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.cgl;
import tb.ffg;
import tb.kge;
import tb.plx;
import tb.ply;
import tb.pmd;
import tb.pnf;

/* loaded from: classes5.dex */
public class h extends i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<SpannableString> f13666a;
    public Runnable b;
    private long p;
    private long q;
    private String r;
    private boolean s;
    private boolean t;
    private b u;
    private HashMap<String, StickerConfig> v;
    private boolean w;
    private int x;
    private List<b.a> y;

    static {
        kge.a(1839416265);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c437ace4", new Object[]{hVar})).intValue() : hVar.x;
    }

    public static /* synthetic */ void a(h hVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e4fdc7b", new Object[]{hVar, str});
        } else {
            hVar.c(str);
        }
    }

    public static /* synthetic */ void a(h hVar, String str, List list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acdecd17", new Object[]{hVar, str, list, new Integer(i)});
        } else {
            hVar.a(str, list, i);
        }
    }

    public static /* synthetic */ String b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa4c372e", new Object[]{hVar}) : hVar.r;
    }

    public static /* synthetic */ long c(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2b940267", new Object[]{hVar})).longValue() : hVar.p;
    }

    public h(Context context, View view, i.b bVar, i.c cVar, b bVar2, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, view, bVar, cVar, aVar);
        this.p = 2000L;
        this.q = 0L;
        this.r = "";
        this.s = false;
        this.t = false;
        this.b = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.h.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(h.this.c, R.anim.taolive_certification_out_flexalocal);
                    loadAnimation.setDuration(500L);
                    loadAnimation.setAnimationListener(new i.a(5));
                    h.this.d.startAnimation(loadAnimation);
                } catch (Throwable th) {
                    q.b("TopAtmosphereCommentComboView", "mCommentComboRunnable e: " + th.getMessage());
                }
            }
        };
        this.u = bVar2;
        b bVar3 = this.u;
        if (bVar3 != null) {
            bVar3.a();
        }
        if (aVar != null && (aVar.I() instanceof ffg)) {
            this.v = ((ffg) aVar.I()).c();
        }
        this.w = ply.aw();
        this.x = com.taobao.taolive.room.utils.d.a(this.c, 15.0f);
    }

    private void c(final TopAtmosphereMessage topAtmosphereMessage) {
        List<EffectResConfig> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d25a60f0", new Object[]{this, topAtmosphereMessage});
            return;
        }
        this.p = ply.o();
        this.j.setText(topAtmosphereMessage.data.backgroundTitle);
        this.j.setTextSize(1, 10.0f);
        this.j.setTypeface(Typeface.DEFAULT, 0);
        int a3 = com.taobao.taolive.room.utils.d.a(this.c, 16.0f);
        if (this.u != null && u.G()) {
            this.u.a(topAtmosphereMessage.data.content, a3, new b.c() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b.c
                public void a(List<ChatMessage> list, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("19a0788b", new Object[]{this, list, new Long(j)});
                        return;
                    }
                    if (list == null || list.isEmpty() || list.get(0) == null) {
                        h.a(h.this, topAtmosphereMessage.data.content);
                    } else {
                        h.a(h.this, list.get(0).mContent);
                    }
                    h.this.b(3);
                }
            });
        } else {
            c(topAtmosphereMessage.data.content);
        }
        this.i.setTextSize(1, 14.0f);
        this.i.setTypeface(Typeface.DEFAULT, 1);
        this.f.setVisibility(8);
        this.e.setImageUrl(topAtmosphereMessage.data.backgroundImg);
        this.k.setVisibility(0);
        this.k.setText(b(topAtmosphereMessage.data.getCountShow()));
        this.h.setVisibility(8);
        if (!StringUtils.isEmpty(topAtmosphereMessage.data.atmosphere) && ply.n() && this.o != null && (this.o.I() instanceof ffg) && (a2 = ((ffg) this.o.I()).a(topAtmosphereMessage.data.atmosphere)) != null && !a2.isEmpty() && !StringUtils.isEmpty(a2.get(0).effectRes)) {
            this.h.setVisibility(0);
            this.h.setImageUrl(cgl.b().a(a2.get(0).effectRes));
        }
        c();
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (this.w) {
            d(str);
        } else {
            this.i.setText(str);
        }
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        this.y = new ArrayList();
        int i = 0;
        int i2 = -1;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if ('[' == charAt) {
                i2 = i3;
            } else if (']' == charAt && i2 >= 0) {
                int i4 = i3 + 1;
                String substring = str.substring(i2, i4);
                if (this.v.containsKey(substring)) {
                    i++;
                    b.a aVar = new b.a();
                    aVar.f13635a = i2;
                    aVar.b = i4;
                    aVar.c = substring;
                    aVar.d = this.v.get(substring).thumbnail;
                    this.y.add(aVar);
                }
                i2 = -1;
            }
        }
        if (i > 0) {
            this.f13666a = new ArrayList();
            a(str, this.f13666a, 0);
            this.i.setText("");
            if (this.f13666a.size() > 0) {
                for (SpannableString spannableString : this.f13666a) {
                    this.i.append(spannableString);
                }
            }
            this.i.append(" ");
            return;
        }
        this.i.setText(str);
    }

    private void a(final String str, final List<SpannableString> list, final int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("739ce240", new Object[]{this, str, list, new Integer(i)});
        } else if (i >= this.y.size()) {
            int i3 = i - 1;
            if (this.y.get(i3).b >= str.length()) {
                return;
            }
            list.add(new SpannableString(str.substring(this.y.get(i3).b)));
        } else {
            final b.a aVar = this.y.get(i);
            if (aVar.f13635a > 0) {
                if (i != 0) {
                    i2 = this.y.get(i - 1).b;
                }
                list.add(new SpannableString(str.substring(i2, aVar.f13635a)));
            }
            com.alilive.adapter.uikit.d b = cgl.b();
            if (b != null) {
                pmd.a().l().a(b.a(aVar.d)).a(new pnf() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.h.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.pnf
                    public void a(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                            return;
                        }
                        plx.a("TopAtmosphereCommentComboView", "generateStickerByIndex url:" + aVar.d);
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                        bitmapDrawable.setBounds(0, 0, (h.a(h.this) * bitmapDrawable.getIntrinsicWidth()) / bitmapDrawable.getIntrinsicHeight(), h.a(h.this));
                        SpannableString spannableString = new SpannableString(aVar.c);
                        spannableString.setSpan(new com.taobao.taolive.room.ui.chat.view.c(bitmapDrawable), 0, aVar.c.length(), 17);
                        list.add(spannableString);
                        h.a(h.this, str, list, i + 1);
                    }

                    @Override // tb.pnf
                    public void b(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                            return;
                        }
                        list.add(new SpannableString(aVar.c));
                        h.a(h.this, str, list, i + 1);
                    }
                }).a();
                return;
            }
            list.add(new SpannableString(aVar.c));
            a(str, list, i + 1);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.i
    public void a(TopAtmosphereMessage topAtmosphereMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5985932", new Object[]{this, topAtmosphereMessage});
        } else if (topAtmosphereMessage == null || topAtmosphereMessage.data == null || topAtmosphereMessage.data.pushTime < this.q) {
        } else {
            String str = this.r;
            if (str != null && str.equals(topAtmosphereMessage.data.contentHash) && this.s) {
                a(topAtmosphereMessage.data.getCountShow());
                this.d.removeCallbacks(this.b);
                this.d.postDelayed(this.b, this.p);
            } else {
                c(topAtmosphereMessage);
                if (!u.G()) {
                    b(3);
                }
                this.t = true;
            }
            b(topAtmosphereMessage);
            this.q = topAtmosphereMessage.data.pushTime;
            this.r = topAtmosphereMessage.data.contentHash;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.i
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.t || this.s;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.i
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.d.removeCallbacks(this.b);
        if (i == 3) {
            try {
                Animation loadAnimation = AnimationUtils.loadAnimation(this.c, R.anim.taolive_certification_in2_flexalocal);
                loadAnimation.setDuration(500L);
                loadAnimation.setAnimationListener(new i.a(4));
                this.d.startAnimation(loadAnimation);
            } catch (Exception e) {
                q.b("TopAtmosphereCommentComboView", "onEnterAnimationEnd exception: " + e.getMessage());
            }
        } else if (i == 4) {
            this.t = false;
            this.s = true;
            this.d.postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.h.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (h.this.m == null) {
                    } else {
                        TopAtmosphereMessage a2 = h.this.m.a(TopAtmosphereMessage.TopAtmosphereMessageType.COMMENT_COMBO);
                        if (a2 == null || h.b(h.this) == null || !h.b(h.this).equals(a2.data.contentHash)) {
                            h.this.d.postDelayed(h.this.b, 0L);
                            return;
                        }
                        h.this.a(a2.data.getCountShow());
                        h.this.d.postDelayed(h.this.b, h.c(h.this));
                        h.this.m.b(TopAtmosphereMessage.TopAtmosphereMessageType.COMMENT_COMBO);
                    }
                }
            }, this.p);
        } else if (i != 5) {
        } else {
            this.d.setVisibility(4);
            this.t = false;
            this.s = false;
            if (this.n == null) {
                return;
            }
            this.n.a(TopAtmosphereMessage.TopAtmosphereMessageType.COMMENT_COMBO);
        }
    }
}
