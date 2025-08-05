package com.taobao.android.detail2.core.framework.view.navbar;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUrlImageView;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import tb.fjt;
import tb.fmd;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class f extends g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TIconFontTextView d;
    private AliUrlImageView e;

    static {
        kge.a(-773757339);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract a a();

    public f(View view, fmd fmdVar, com.taobao.android.detail2.core.framework.b bVar) {
        super(view, fmdVar, bVar);
        this.d = (TIconFontTextView) view.findViewById(R.id.nav_icon);
        this.d.setVisibility(0);
        this.e = (AliUrlImageView) view.findViewById(R.id.nav_icon_image);
        this.e.setVisibility(8);
        a a2 = a();
        this.d.setOnClickListener(a2);
        this.e.setOnClickListener(a2);
    }

    @Override // com.taobao.android.detail2.core.framework.view.navbar.g
    public void a(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2441c2", new Object[]{this, lVar});
        } else if (TextUtils.isEmpty(lVar.f())) {
            b(lVar);
        } else {
            e(lVar);
        }
    }

    public void b(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e362b161", new Object[]{this, lVar});
            return;
        }
        fjt.a(fjt.TAG_RENDER, "显示iconfont类型的通用按钮，按钮类型" + lVar.a() + "，按钮iconfont" + lVar.e());
        this.d.setText(lVar.e());
        this.d.setTextColor(lVar.b());
        this.d.setVisibility(0);
        this.e.setVisibility(8);
    }

    private void e(final l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a01e003e", new Object[]{this, lVar});
            return;
        }
        fjt.a(fjt.TAG_RENDER, "显示url类型的通用按钮，按钮类型" + lVar.a() + "，按钮url" + lVar.f());
        PhenixOptions phenixOptions = new PhenixOptions();
        phenixOptions.bitmapProcessors(new com.taobao.phenix.compat.effects.c());
        this.e.setImageUrl(lVar.f(), phenixOptions);
        this.e.failListener(new com.taobao.android.i<com.taobao.android.g>() { // from class: com.taobao.android.detail2.core.framework.view.navbar.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.i
            public boolean a(com.taobao.android.g gVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("f5565567", new Object[]{this, gVar})).booleanValue();
                }
                f.this.b(lVar);
                return false;
            }
        });
        this.e.setVisibility(0);
        this.d.setVisibility(8);
    }

    public static View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{context, viewGroup});
        }
        if (context != null && viewGroup != null) {
            return b(context, viewGroup);
        }
        return null;
    }

    /* loaded from: classes5.dex */
    public abstract class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-633639669);
            kge.a(-1201612728);
        }

        public abstract void a(View view);

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            a(view);
            if (f.this.c == null) {
                return;
            }
            f fVar = f.this;
            fVar.d(fVar.c);
        }
    }
}
