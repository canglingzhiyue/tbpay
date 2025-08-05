package com.taobao.android.home.component.view.video;

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
import com.taobao.android.home.component.utils.l;
import com.taobao.android.home.component.view.HImageView;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.fpr;
import tb.kge;

/* loaded from: classes5.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f12764a;
    private final ViewGroup b;
    private final TaoLiveVideoView c;
    private HImageView d;
    private ImageView e;
    private ImageView f;
    private TextView g;
    private TUrlImageView h;

    static {
        kge.a(-1374954084);
    }

    public e(Context context, ViewGroup viewGroup, TaoLiveVideoView taoLiveVideoView) {
        this.f12764a = context;
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
        this.d = new HImageView(this.f12764a);
        this.f = new ImageView(this.f12764a);
        this.e = new ImageView(this.f12764a);
        this.d.setWhenNullClearImg(true);
        View view = null;
        if (this.c != null) {
            view = LayoutInflater.from(this.f12764a).inflate(R.layout.homepage_video_view_extend, (ViewGroup) this.c, false);
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
        tUrlImageView.setImageUrl(str);
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
            i = fpr.a(this.f12764a, str, 0);
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
        int a2 = fpr.a(this.f12764a, str, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.width = a2;
        layoutParams.height = a2;
        this.h.setLayoutParams(layoutParams);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        l.a(this.h, 0);
        l.a(this.f, 0);
        l.a(this.e, 0);
        l.a(this.d, 0);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        l.a(this.h, 8);
        l.a(this.f, 8);
        l.a(this.e, 8);
        l.a(this.d, 8);
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
}
