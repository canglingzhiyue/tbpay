package com.taobao.tbpoplayer.nativerender.render.component;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.tbpoplayer.nativerender.dsl.PopCloseBtnModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import com.taobao.tbpoplayer.nativerender.p;
import tb.kge;

/* loaded from: classes8.dex */
public class b extends c<PopCloseBtnModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(411400063);
    }

    public static /* synthetic */ boolean lambda$bncktJ0MC0Q5k3EVIW9kK5qjBA8(b bVar, ImageView imageView, String str, SuccPhenixEvent succPhenixEvent) {
        return bVar.a(imageView, str, succPhenixEvent);
    }

    public static /* synthetic */ boolean lambda$nk32mZ0f473tjyNeeBVm9x8xXDM(b bVar, String str, FailPhenixEvent failPhenixEvent) {
        return bVar.a(str, failPhenixEvent);
    }

    public b(com.taobao.tbpoplayer.nativerender.e eVar, PopCloseBtnModel popCloseBtnModel) {
        super(eVar, popCloseBtnModel, false);
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
        return ((PopCloseBtnModel) this.b).style;
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        final ImageView imageView = new ImageView(context);
        imageView.setContentDescription(!TextUtils.isEmpty(((PopCloseBtnModel) this.b).alt) ? ((PopCloseBtnModel) this.b).alt : "关闭按钮");
        if (((PopCloseBtnModel) this.b).url.contains("gw.alicdn.com/imgextra/i1/O1CN01pu2yug24D6I5h7JbZ_!!6000000007356-2-tps-72-72.png")) {
            imageView.setImageResource(R.drawable.native_close_btn_light);
            this.f22246a.i();
        } else {
            final String a2 = p.a(this.f22246a, ((PopCloseBtnModel) this.b).url);
            if (TextUtils.isEmpty(a2)) {
                this.f22246a.a("RenderError", "imageUrlIsEmpty");
                return null;
            }
            com.taobao.phenix.intf.b.h().a(a2).succListener(new com.taobao.phenix.intf.event.a() { // from class: com.taobao.tbpoplayer.nativerender.render.component.-$$Lambda$b$bncktJ0MC0Q5k3EVIW9kK5qjBA8
                @Override // com.taobao.phenix.intf.event.a
                public final boolean onHappen(com.taobao.phenix.intf.event.d dVar) {
                    return b.lambda$bncktJ0MC0Q5k3EVIW9kK5qjBA8(b.this, imageView, a2, (SuccPhenixEvent) dVar);
                }
            }).failListener(new com.taobao.phenix.intf.event.a() { // from class: com.taobao.tbpoplayer.nativerender.render.component.-$$Lambda$b$nk32mZ0f473tjyNeeBVm9x8xXDM
                @Override // com.taobao.phenix.intf.event.a
                public final boolean onHappen(com.taobao.phenix.intf.event.d dVar) {
                    return b.lambda$nk32mZ0f473tjyNeeBVm9x8xXDM(b.this, a2, (FailPhenixEvent) dVar);
                }
            }).fetch();
        }
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return imageView;
    }

    public /* synthetic */ boolean a(ImageView imageView, String str, SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbdc2b78", new Object[]{this, imageView, str, succPhenixEvent})).booleanValue();
        }
        if (succPhenixEvent != null && succPhenixEvent.getDrawable() != null) {
            imageView.setImageDrawable(succPhenixEvent.getDrawable());
            this.f22246a.i();
        } else {
            this.f22246a.a("CLOSEBTN_LOAD_DRAWABLE_ERROR", str);
            com.alibaba.poplayer.utils.c.a("Phenix.loadBgImageNoDrawable.imageUrl=" + str);
        }
        return false;
    }

    public /* synthetic */ boolean a(String str, FailPhenixEvent failPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70efbd9a", new Object[]{this, str, failPhenixEvent})).booleanValue();
        }
        this.f22246a.a("CLOSEBTN_LOAD_ERROR", str);
        com.alibaba.poplayer.utils.c.a("Phenix.loadBgImageError.imageUrl=" + str);
        return false;
    }
}
