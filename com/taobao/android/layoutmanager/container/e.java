package com.taobao.android.layoutmanager.container;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import mtopsdk.common.util.StringUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.container.m;
import java.util.List;
import tb.kge;
import tb.ohd;

/* loaded from: classes5.dex */
public class e extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ImageView e;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f13211a;
        public int b;
        public int c;
        public int d;
        public String e;

        static {
            kge.a(-1586827471);
        }
    }

    static {
        kge.a(-1010107622);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        if (str.hashCode() == 109716922) {
            super.a((Activity) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Point a(e eVar, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Point) ipChange.ipc$dispatch("b5e51005", new Object[]{eVar, bitmapDrawable}) : eVar.a(bitmapDrawable);
    }

    public static /* synthetic */ ImageView a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("ebd22eb1", new Object[]{eVar}) : eVar.e;
    }

    public e(Context context, BaseContainerFragment baseContainerFragment, m.b bVar) {
        super(context, baseContainerFragment, bVar);
    }

    private Point a(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("f683367c", new Object[]{this, bitmapDrawable});
        }
        Point point = new Point();
        int intrinsicWidth = bitmapDrawable.getIntrinsicWidth();
        int intrinsicHeight = bitmapDrawable.getIntrinsicHeight();
        int i = this.f13180a.getResources().getDisplayMetrics().widthPixels;
        point.x = i;
        point.y = (int) ((i / intrinsicWidth) * intrinsicHeight);
        return point;
    }

    @Override // com.taobao.android.layoutmanager.container.b
    public void a(Activity activity) {
        List parseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        super.a(activity);
        if (activity != null) {
            activity.overridePendingTransition(17432576, 0);
        }
        this.c.getTNodeContainer().setBackgroundColor(-1);
        this.e = new ImageView(this.f13180a);
        this.e.setScaleType(ImageView.ScaleType.FIT_XY);
        String queryParameter = this.b.b.getQueryParameter("extraData");
        if (StringUtils.isEmpty(queryParameter) || (parseArray = JSON.parseArray(queryParameter, a.class)) == null || parseArray.isEmpty()) {
            return;
        }
        final a aVar = (a) parseArray.get(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(aVar.c, aVar.d);
        layoutParams.leftMargin = aVar.f13211a;
        layoutParams.topMargin = aVar.b - ohd.h(this.f13180a);
        this.c.getContentView().addView(this.e, 0, layoutParams);
        com.taobao.tao.flexbox.layoutmanager.adapter.a.a().i().a(this.f13180a, aVar.e, -1, -1, new ImageLoader.c() { // from class: com.taobao.android.layoutmanager.container.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
            public void onImageLoadFailed() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3feabda6", new Object[]{this});
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
            public void onImageLoaded(BitmapDrawable bitmapDrawable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
                    return;
                }
                e.a(e.this).setImageDrawable(bitmapDrawable);
                Point a2 = e.a(e.this, bitmapDrawable);
                e.a(e.this).animate().translationXBy(((a2.x - aVar.c) / 2) - aVar.f13211a).translationYBy((((a2.y - aVar.d) / 2) - aVar.b) + ohd.h(e.this.f13180a)).scaleX(a2.x / aVar.c).scaleY(a2.y / aVar.d).setDuration(300L).start();
            }
        });
    }
}
