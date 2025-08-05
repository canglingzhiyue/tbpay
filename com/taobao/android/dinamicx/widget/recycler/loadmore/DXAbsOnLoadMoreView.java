package com.taobao.android.dinamicx.widget.recycler.loadmore;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class DXAbsOnLoadMoreView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1601821247);
        kge.a(627657374);
    }

    public abstract void onLoadMoreStatusUpdate(int i, JSONObject jSONObject);

    public DXAbsOnLoadMoreView(Context context) {
        super(context);
    }

    public DXAbsOnLoadMoreView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DXAbsOnLoadMoreView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
