package com.taobao.taolive.room.ui.lottie;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.megadesign.anim.lottie.MALottieView;
import com.taobao.android.megadesign.anim.lottie.a;
import tb.kge;

/* loaded from: classes8.dex */
public class DynamicLottieView extends MALottieView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mLottieConfig;

    static {
        kge.a(1392563054);
    }

    public DynamicLottieView(Context context) {
        super(context);
    }

    public DynamicLottieView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DynamicLottieView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void playAnimation(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb12141", new Object[]{this, str});
        } else {
            playAnimation(str, null, null, null, null);
        }
    }

    public void playAnimation(String str, JSONArray jSONArray, JSONArray jSONArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf53ab91", new Object[]{this, str, jSONArray, jSONArray2});
        } else {
            playAnimation(str, jSONArray, jSONArray2, null, null);
        }
    }

    public void playAnimation(String str, JSONArray jSONArray, MALottieView.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("667c9642", new Object[]{this, str, jSONArray, dVar});
        } else {
            playAnimation(str, null, null, jSONArray, null);
        }
    }

    public void playAnimation(String str, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, MALottieView.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da15c92", new Object[]{this, str, jSONArray, jSONArray2, jSONArray3, dVar});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            a a2 = a.Builder.c(str).a();
            if (jSONArray != null) {
                a2.b(jSONArray);
            }
            if (jSONArray2 != null) {
                a2.c(jSONArray2);
            }
            if (jSONArray3 != null) {
                a2.g(jSONArray3);
            }
            if (dVar != null) {
                setOnAreaClickEventListener(dVar);
            }
            setUpWithConfig(a2);
            playAnimation();
        }
    }
}
