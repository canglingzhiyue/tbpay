package com.taobao.tbpoplayer.nativerender.render.component;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tbpoplayer.nativerender.dsl.ImageModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import com.taobao.tbpoplayer.nativerender.l;
import com.taobao.tbpoplayer.nativerender.p;
import tb.kge;

/* loaded from: classes8.dex */
public class f extends c<ImageModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(873054268);
    }

    public static /* synthetic */ boolean lambda$1lHSLpZeGCeIDYOq_vjelxkHHfs(f fVar, String str, int i, int i2) {
        return fVar.a(str, i, i2);
    }

    public static /* synthetic */ void lambda$7n4Wv_aBM4rkJxFZLhjVAFhncTc(f fVar, View view) {
        fVar.b(view);
    }

    public static /* synthetic */ void lambda$K4nef1dz2Oh6m9IfkyaSvaQ0LtA(f fVar) {
        fVar.h();
    }

    public static /* synthetic */ boolean lambda$V2tW_mxvCJ0y_pqPZoH1Yqslk2w(f fVar, String str, ImageView imageView, SuccPhenixEvent succPhenixEvent) {
        return fVar.a(str, imageView, succPhenixEvent);
    }

    /* renamed from: lambda$nDXdA59B66_vwfCevu5-kRo1Cvc */
    public static /* synthetic */ boolean m1461lambda$nDXdA59B66_vwfCevu5kRo1Cvc(f fVar, String str, FailPhenixEvent failPhenixEvent) {
        return fVar.a(str, failPhenixEvent);
    }

    public static /* synthetic */ boolean lambda$nIG8yeCE9Vp5ehaiEgw6wTW8_q8(f fVar, View view) {
        return fVar.a(view);
    }

    public f(com.taobao.tbpoplayer.nativerender.e eVar, ImageModel imageModel, boolean z) {
        super(eVar, imageModel, z);
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public StyleModel a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StyleModel) ipChange.ipc$dispatch("815a627d", new Object[]{this});
        }
        if (this.b == 0) {
            return null;
        }
        return ((ImageModel) this.b).style;
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        final ImageView imageView = new ImageView(context);
        final String a2 = p.a(this.f22246a, ((ImageModel) this.b).url);
        if (TextUtils.isEmpty(a2)) {
            this.f22246a.a("ImageRenderError", "imageUrlIsEmpty");
            return null;
        }
        com.taobao.phenix.intf.b.h().a(a2).succListener(new com.taobao.phenix.intf.event.a() { // from class: com.taobao.tbpoplayer.nativerender.render.component.-$$Lambda$f$V2tW_mxvCJ0y_pqPZoH1Yqslk2w
            @Override // com.taobao.phenix.intf.event.a
            public final boolean onHappen(com.taobao.phenix.intf.event.d dVar) {
                return f.lambda$V2tW_mxvCJ0y_pqPZoH1Yqslk2w(f.this, a2, imageView, (SuccPhenixEvent) dVar);
            }
        }).failListener(new com.taobao.phenix.intf.event.a() { // from class: com.taobao.tbpoplayer.nativerender.render.component.-$$Lambda$f$nDXdA59B66_vwfCevu5-kRo1Cvc
            @Override // com.taobao.phenix.intf.event.a
            public final boolean onHappen(com.taobao.phenix.intf.event.d dVar) {
                return f.m1461lambda$nDXdA59B66_vwfCevu5kRo1Cvc(f.this, a2, (FailPhenixEvent) dVar);
            }
        }).fetch();
        a(imageView, ((ImageModel) this.b).style);
        if ("cover".equals(((ImageModel) this.b).style.objectFit)) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tbpoplayer.nativerender.render.component.-$$Lambda$f$7n4Wv_aBM4rkJxFZLhjVAFhncTc
            {
                f.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.lambda$7n4Wv_aBM4rkJxFZLhjVAFhncTc(f.this, view);
            }
        });
        imageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.tbpoplayer.nativerender.render.component.-$$Lambda$f$nIG8yeCE9Vp5ehaiEgw6wTW8_q8
            {
                f.this = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return f.lambda$nIG8yeCE9Vp5ehaiEgw6wTW8_q8(f.this, view);
            }
        });
        return imageView;
    }

    public /* synthetic */ boolean a(final String str, ImageView imageView, SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b7c5d78", new Object[]{this, str, imageView, succPhenixEvent})).booleanValue();
        }
        if (succPhenixEvent != null && succPhenixEvent.getDrawable() != null) {
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (drawable instanceof com.taobao.phenix.animate.b) {
                com.alibaba.poplayer.utils.c.a("onImageLoaded.isAnimatedImage.id=%s.url=%s", ((ImageModel) this.b).id, str);
                com.taobao.phenix.animate.b bVar = (com.taobao.phenix.animate.b) drawable;
                if (((ImageModel) this.b).loopTimes > 0) {
                    bVar.a(((ImageModel) this.b).loopTimes);
                    bVar.a(new com.taobao.phenix.animate.c() { // from class: com.taobao.tbpoplayer.nativerender.render.component.-$$Lambda$f$1lHSLpZeGCeIDYOq_vjelxkHHfs
                        @Override // com.taobao.phenix.animate.c
                        public final boolean onLoopCompleted(int i, int i2) {
                            return f.lambda$1lHSLpZeGCeIDYOq_vjelxkHHfs(f.this, str, i, i2);
                        }
                    });
                }
                bVar.b();
            }
            imageView.setImageDrawable(drawable);
            com.alibaba.poplayer.utils.c.a("onImageLoaded.id=%s.url=%s", ((ImageModel) this.b).id, str);
            this.f22246a.j();
        } else {
            this.f22246a.a("IMAGE_LOAD_DRAWABLE_ERROR", str);
            com.alibaba.poplayer.utils.c.a("Phenix.loadBgImageNoDrawable.imageUrl=" + str);
        }
        return false;
    }

    public /* synthetic */ boolean a(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3526816", new Object[]{this, str, new Integer(i), new Integer(i2)})).booleanValue();
        }
        try {
            com.alibaba.poplayer.utils.c.a("onAnimatedLoopListener.id=%s.completedLoop=%s.totalLoop=%s", ((ImageModel) this.b).id, Integer.valueOf(i), Integer.valueOf(i2));
            if (i2 > 0 && i == i2) {
                this.f22246a.a(this.b, "animImageFinish", ((ImageModel) this.b).loopEndAction, ((ImageModel) this.b).loopEndActions);
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("Phenix.setAnimatedLoopListener.error.imageUrl=" + str, th);
        }
        return i != i2;
    }

    public /* synthetic */ boolean a(String str, FailPhenixEvent failPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70efbd9a", new Object[]{this, str, failPhenixEvent})).booleanValue();
        }
        this.f22246a.a("IMAGE_LOAD_ERROR", str);
        com.alibaba.poplayer.utils.c.a("Phenix.loadBgImageError.imageUrl=" + str);
        return false;
    }

    public /* synthetic */ void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else {
            this.f22246a.e().a(this.f22246a, "click", ((ImageModel) this.b).animation, this.c, this.b, new l.b() { // from class: com.taobao.tbpoplayer.nativerender.render.component.-$$Lambda$f$K4nef1dz2Oh6m9IfkyaSvaQ0LtA
                @Override // com.taobao.tbpoplayer.nativerender.l.b
                public final void onAnimationEnd() {
                    f.lambda$K4nef1dz2Oh6m9IfkyaSvaQ0LtA(f.this);
                }
            });
        }
    }

    public /* synthetic */ void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.f22246a.a(this.b, "click", ((ImageModel) this.b).action, ((ImageModel) this.b).actions);
        }
    }

    public /* synthetic */ boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        this.f22246a.a(this.b, "longClick", ((ImageModel) this.b).action, ((ImageModel) this.b).actions);
        return true;
    }
}
