package com.taobao.search.m3.more;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class MoreButton extends TUrlImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int h;
    private final String url;
    private int w;

    static {
        kge.a(-1173386164);
    }

    public final int getH() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("746cb72c", new Object[]{this})).intValue() : this.h;
    }

    public final int getW() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("754017bb", new Object[]{this})).intValue() : this.w;
    }

    public final void setH(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5fd6f6", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public final void setW(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25f88847", new Object[]{this, new Integer(i)});
        } else {
            this.w = i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreButton(Context context, int i, int i2, int i3, String url) {
        super(context);
        q.c(context, "context");
        q.c(url, "url");
        this.w = i;
        this.h = i2;
        this.url = url;
        setScaleType(ImageView.ScaleType.FIT_XY);
        setImageUrl(this.url);
        setPadding(0, i3, 0, i3);
    }

    public final void updateUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30541df7", new Object[]{this, str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = this.url;
        }
        setImageUrl(str);
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            setMeasuredDimension(this.w, this.h);
        }
    }
}
