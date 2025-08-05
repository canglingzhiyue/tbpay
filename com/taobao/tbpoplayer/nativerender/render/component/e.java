package com.taobao.tbpoplayer.nativerender.render.component;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.HotSpotModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import tb.kge;

/* loaded from: classes8.dex */
public class e extends c<HotSpotModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-597184856);
    }

    /* renamed from: lambda$YAPSv7wyIowKQY1l6KRjk8mz-CM */
    public static /* synthetic */ boolean m1460lambda$YAPSv7wyIowKQY1l6KRjk8mzCM(e eVar, View view) {
        return eVar.a(view);
    }

    public static /* synthetic */ void lambda$pKbd8B6tJWccQ1qh5rcQ0BbZ_x4(e eVar, View view) {
        eVar.b(view);
    }

    public e(com.taobao.tbpoplayer.nativerender.e eVar, HotSpotModel hotSpotModel) {
        super(eVar, hotSpotModel, false);
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
        return ((HotSpotModel) this.b).style;
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        View view = new View(context);
        a(view, ((HotSpotModel) this.b).style);
        view.setBackgroundColor(0);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tbpoplayer.nativerender.render.component.-$$Lambda$e$pKbd8B6tJWccQ1qh5rcQ0BbZ_x4
            {
                e.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                e.lambda$pKbd8B6tJWccQ1qh5rcQ0BbZ_x4(e.this, view2);
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.tbpoplayer.nativerender.render.component.-$$Lambda$e$YAPSv7wyIowKQY1l6KRjk8mz-CM
            {
                e.this = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return e.m1460lambda$YAPSv7wyIowKQY1l6KRjk8mzCM(e.this, view2);
            }
        });
        return view;
    }

    public /* synthetic */ void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else {
            this.f22246a.a(this.b, "click", ((HotSpotModel) this.b).action, ((HotSpotModel) this.b).actions);
        }
    }

    public /* synthetic */ boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        this.f22246a.a(this.b, "longClick", ((HotSpotModel) this.b).action, ((HotSpotModel) this.b).actions);
        return true;
    }
}
