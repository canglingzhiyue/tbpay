package com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HImageView;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.fpr;
import tb.kge;
import tb.lfx;
import tb.luv;
import tb.onq;

/* loaded from: classes7.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f17432a;
    private final ViewGroup b;
    private final TaoLiveVideoView c;
    private HImageView d;
    private ImageView e;
    private ImageView f;
    private TextView g;
    private TUrlImageView h;
    private final j i = new j();

    static {
        kge.a(110384151);
    }

    public static /* synthetic */ TUrlImageView a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("c95373f7", new Object[]{hVar}) : hVar.h;
    }

    public static /* synthetic */ ImageView b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("1b1afecc", new Object[]{hVar}) : hVar.f;
    }

    public static /* synthetic */ ImageView c(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("74264a4d", new Object[]{hVar}) : hVar.e;
    }

    public static /* synthetic */ HImageView d(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HImageView) ipChange.ipc$dispatch("3b4387a3", new Object[]{hVar}) : hVar.d;
    }

    public h(Context context, ViewGroup viewGroup, TaoLiveVideoView taoLiveVideoView) {
        this.f17432a = context;
        this.b = viewGroup;
        this.c = taoLiveVideoView;
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.d = new HImageView(this.f17432a);
        this.f = new ImageView(this.f17432a);
        this.e = new ImageView(this.f17432a);
        this.d.setWhenNullClearImg(true);
        View view = null;
        if (this.c != null) {
            view = LayoutInflater.from(this.f17432a).inflate(R.layout.h_video_view_extend, (ViewGroup) this.c, false);
        }
        this.d.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f.setImageResource(R.color.video_view_white_overlay);
        this.e.setImageResource(17170443);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.b.addView(this.c, 0, layoutParams);
        this.b.addView(this.e, 1, layoutParams);
        this.b.addView(this.f, 2, layoutParams);
        this.b.addView(this.d, 3, layoutParams);
        this.b.addView(view, 4, layoutParams);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.h = (TUrlImageView) this.b.findViewById(R.id.iv_play_btn);
        TUrlImageView tUrlImageView = this.h;
        if (tUrlImageView == null) {
            return;
        }
        onq.a(tUrlImageView, str, null, lfx.GUESS_IMAGE_STRATEGY_CONFIG);
        this.h.setImageUrl(str);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        if (this.h == null) {
            this.h = (TUrlImageView) this.b.findViewById(R.id.iv_play_btn);
        }
        if (!TextUtils.isEmpty(str)) {
            i = fpr.a(this.f17432a, str, 0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.topMargin = i;
        this.h.setLayoutParams(layoutParams);
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        if (this.h == null) {
            this.h = (TUrlImageView) this.b.findViewById(R.id.iv_play_btn);
        }
        if (this.h == null || TextUtils.isEmpty(str)) {
            return;
        }
        int a2 = fpr.a(this.f17432a, str, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.width = a2;
        layoutParams.height = a2;
        this.h.setLayoutParams(layoutParams);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.i.a(new Runnable() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    luv.a(h.a(h.this), 0);
                    luv.a(h.b(h.this), 0);
                    luv.a(h.c(h.this), 0);
                    luv.a(h.d(h.this), 0);
                }
            }, this.f17432a);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.i.a();
        luv.a(this.h, 8);
        luv.a(this.f, 8);
        luv.a(this.e, 8);
        luv.a(this.d, 8);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.c.setAspectRatio(i);
        }
    }

    public void a(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91bcf1c2", new Object[]{this, scaleType});
        } else {
            this.d.setScaleType(scaleType);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.d.setBackgroundColor(i);
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.f.setImageResource(i);
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.e.setImageResource(i);
        }
    }

    public void a(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
        } else {
            this.d.setImageDrawable(drawable);
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            a();
        }
        onq.a(this.d, str, null, lfx.GUESS_IMAGE_STRATEGY_CONFIG);
        this.d.setImageUrl(str);
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        if (this.g == null) {
            this.g = (TextView) this.b.findViewById(R.id.tv_duration);
        }
        TextView textView = this.g;
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        HImageView hImageView = this.d;
        return hImageView != null && hImageView.getVisibility() == 0;
    }
}
