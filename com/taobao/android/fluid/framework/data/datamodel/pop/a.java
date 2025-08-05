package com.taobao.android.fluid.framework.data.datamodel.pop;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.b;
import com.taobao.android.fluid.framework.data.datamodel.pop.PopPositionData;
import tb.kge;
import tb.ogv;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f12533a;
    public float b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public int h;

    static {
        kge.a(1057562544);
    }

    public a(PopPositionData popPositionData) {
        JSONArray jSONArray;
        if (popPositionData == null) {
            return;
        }
        Context context = FluidSDK.getContext();
        PopPositionData.PositionData positionData = popPositionData.data;
        if (positionData == null) {
            return;
        }
        this.c = b.a(context, positionData.x);
        this.d = b.a(context, positionData.y);
        this.e = b.a(context, positionData.h);
        this.f = b.a(context, positionData.w);
        if (positionData.animations == null || ogv.a(positionData.animations) || (jSONArray = positionData.animations.getJSONArray("translationY")) == null) {
            return;
        }
        this.f12533a = b.a(context, jSONArray.getFloatValue(0));
        this.b = b.a(context, jSONArray.getFloatValue(1));
    }

    public a(float f, float f2, int i, int i2, int i3, int i4) {
        this.f12533a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PopPosition{startY=" + this.f12533a + ", endY=" + this.b + ", x=" + this.c + ", y=" + this.d + ", height=" + this.e + ", width=" + this.f + '}';
    }
}
