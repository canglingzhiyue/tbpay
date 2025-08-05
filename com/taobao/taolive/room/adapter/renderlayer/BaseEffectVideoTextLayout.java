package com.taobao.taolive.room.adapter.renderlayer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public abstract class BaseEffectVideoTextLayout extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1477387940);
    }

    public abstract void destroy();

    public abstract void setData(JSONObject jSONObject);

    public abstract void show();

    public BaseEffectVideoTextLayout(Context context) {
        super(context);
    }

    public BaseEffectVideoTextLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseEffectVideoTextLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BaseEffectVideoTextLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
