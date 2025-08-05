package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.avplayer.av;
import com.taobao.taobao.R;
import tb.kge;
import tb.syq;
import tb.syr;
import tb.szj;
import tb.szm;

/* loaded from: classes5.dex */
public class m extends e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.l> implements syq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RelativeLayout g;
    private ImageView h;
    private com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.l i;
    private syr j;
    private com.taobao.android.detail.ttdetail.skeleton.desc.natives.c k;
    private int l;
    private View m;
    private boolean n;
    private szm.a o;
    private av p;
    private com.taobao.avplayer.common.x q;

    static {
        kge.a(1190255447);
        kge.a(541013925);
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1862301655) {
            super.b(((Boolean) objArr[0]).booleanValue(), ((Boolean) objArr[1]).booleanValue());
            return null;
        } else if (hashCode == -209634398) {
            super.cG_();
            return null;
        } else if (hashCode != 91915241) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.b();
            return null;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* bridge */ /* synthetic */ void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.l lVar) {
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public boolean b2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19ebe7d", new Object[]{this, lVar})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ int a(m mVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("372d6e89", new Object[]{mVar, new Integer(i)})).intValue();
        }
        mVar.l = i;
        return i;
    }

    public static /* synthetic */ syr a(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (syr) ipChange.ipc$dispatch("d607328d", new Object[]{mVar}) : mVar.j;
    }

    public static /* synthetic */ boolean a(m mVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("372dae6b", new Object[]{mVar, new Boolean(z)})).booleanValue();
        }
        mVar.n = z;
        return z;
    }

    public static /* synthetic */ boolean b(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("94967af0", new Object[]{mVar})).booleanValue() : mVar.f();
    }

    public static /* synthetic */ int c(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("16e12fbe", new Object[]{mVar})).intValue() : mVar.l;
    }

    public static /* synthetic */ com.taobao.android.detail.ttdetail.skeleton.desc.natives.c d(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.ttdetail.skeleton.desc.natives.c) ipChange.ipc$dispatch("3cbf96da", new Object[]{mVar}) : mVar.k;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, lVar})).booleanValue() : b2(lVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, lVar}) : a2(lVar);
    }

    public m(Context context) {
        super(context);
        this.l = -1;
        this.n = false;
        this.p = new av() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.m.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.av
            public void onVideoFullScreen() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoInfo(Object obj, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoNormalScreen() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPause(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPlay() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("931007b7", new Object[]{this});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoProgressChanged(int i, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoSeekTo(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoStart() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPrepared(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
                } else if (!m.b(m.this) || m.c(m.this) <= 0) {
                } else {
                    m.d(m.this).a(m.c(m.this));
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoError(Object obj, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                    return;
                }
                m.a(m.this, 0);
                m.a(m.this, false);
            }

            @Override // com.taobao.avplayer.av
            public void onVideoComplete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                    return;
                }
                if (m.a(m.this) != null) {
                    m.a(m.this).b(m.this.e());
                }
                m.a(m.this, 0);
                m.a(m.this, false);
            }

            @Override // com.taobao.avplayer.av
            public void onVideoClose() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("24db3403", new Object[]{this});
                } else {
                    m.a(m.this, false);
                }
            }
        };
        this.q = new com.taobao.avplayer.common.x() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.m.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.common.x
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                }
            }

            @Override // com.taobao.avplayer.common.x
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                }
            }
        };
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(final com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8306adfa", new Object[]{this, lVar});
        }
        if (lVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(lVar.b)) {
            float f = lVar.c / ((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.l) this.f).d;
            int a2 = com.taobao.android.detail.ttdetail.utils.f.a(this.f10821a);
            int i = (int) (f * a2);
            this.g = new RelativeLayout(this.f10821a);
            this.g.setLayoutParams(new AbsListView.LayoutParams(-1, i));
            DetailImageView detailImageView = new DetailImageView(this.f10821a);
            detailImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.g.addView(detailImageView, new RelativeLayout.LayoutParams(-1, -1));
            if (!TextUtils.isEmpty(lVar.f10880a)) {
                a(detailImageView, lVar.f10880a, new com.taobao.android.detail.ttdetail.widget.desc.image.g(a2, i), null, null);
            } else {
                detailImageView.setBackgroundColor(com.taobao.android.detail.ttdetail.utils.w.a("#000000"));
            }
            c2(lVar);
            this.h = new ImageView(this.f10821a);
            this.h.setImageResource(R.drawable.tt_detail_tbavsdk_video_play);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.g.addView(this.h, layoutParams);
            this.h.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.m.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    com.taobao.android.detail.ttdetail.utils.i.a("desc video", "btnPlay onClick" + lVar.i + "|" + m.this);
                    if (m.a(m.this) == null) {
                        return;
                    }
                    com.taobao.android.detail.ttdetail.communication.c.a(m.this.f10821a, new szj());
                    m.this.a(-1);
                }
            });
            this.g.setContentDescription("视频");
            this.i = lVar;
        }
        return this.g;
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    private void c2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("354ce93a", new Object[]{this, lVar});
            return;
        }
        this.m = LayoutInflater.from(this.f10821a).inflate(R.layout.tt_detail_desc_video_text_info, (ViewGroup) null);
        TextView textView = (TextView) this.m.findViewById(R.id.desc_video_text_info_title);
        TextView textView2 = (TextView) this.m.findViewById(R.id.desc_video_text_info_desc);
        if (!TextUtils.isEmpty(lVar.f) && !TextUtils.isEmpty(lVar.g)) {
            textView.setText(lVar.f);
            textView2.setText(lVar.g);
        }
        if (this.m.getParent() != null) {
            ((ViewGroup) this.m.getParent()).removeView(this.m);
        }
        this.g.addView(this.m, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void cG_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3813ba2", new Object[]{this});
        } else if (this.f == 0 || TextUtils.isEmpty(((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.l) this.f).b)) {
        } else {
            if (this.k == null) {
                szm szmVar = new szm(this.i.i, this.i.b, this.i.f10880a, this.g, this.i.d, this.i.c);
                szmVar.b(this.i.q);
                szmVar.a(((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.l) this.f).p);
                szmVar.a(false);
                szmVar.c(this.i.e);
                this.o = szmVar.b();
                com.taobao.android.detail.ttdetail.communication.c.a(this.f10821a, szmVar);
                this.k = new com.taobao.android.detail.ttdetail.skeleton.desc.natives.c();
            }
            super.cG_();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void b(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ff8829", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        super.b(z, z2);
        com.taobao.android.detail.ttdetail.skeleton.desc.natives.c cVar = this.k;
        if (cVar == null) {
            return;
        }
        cVar.d();
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.j = null;
        com.taobao.android.detail.ttdetail.skeleton.desc.natives.c cVar = this.k;
        if (cVar != null) {
            cVar.a((av) null);
            this.k.a((com.taobao.avplayer.common.x) null);
            this.k.c();
            this.k = null;
        }
        super.b();
    }

    @Override // tb.syq
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.k == null || this.n) {
        } else {
            syr syrVar = this.j;
            if (syrVar != null) {
                syrVar.a(e(), this.l);
            }
            this.k.a(this.f10821a, this.o, true);
            this.k.a(this.p);
            this.k.a(this.q);
            this.k.b();
            this.n = true;
            this.k.a();
        }
    }

    @Override // tb.syq
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.android.detail.ttdetail.skeleton.desc.natives.c cVar = this.k;
        if (cVar == null) {
            return;
        }
        this.l = cVar.f();
        this.k.c();
        syr syrVar = this.j;
        if (syrVar != null) {
            syrVar.a(e());
        }
        this.n = false;
    }

    @Override // tb.syq
    public void cH_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5361441", new Object[]{this});
            return;
        }
        com.taobao.android.detail.ttdetail.skeleton.desc.natives.c cVar = this.k;
        if (cVar == null) {
            return;
        }
        cVar.b();
    }

    @Override // tb.syq
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.android.detail.ttdetail.skeleton.desc.natives.c cVar = this.k;
        if (cVar == null) {
            return;
        }
        cVar.d();
    }

    @Override // tb.syq
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        com.taobao.android.detail.ttdetail.skeleton.desc.natives.c cVar = this.k;
        if (cVar == null) {
            return;
        }
        cVar.a(z, z2);
    }

    @Override // tb.syq
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.l < 0;
    }

    @Override // tb.syq
    public void a(syr syrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffb02c8c", new Object[]{this, syrVar});
        } else {
            this.j = syrVar;
        }
    }
}
