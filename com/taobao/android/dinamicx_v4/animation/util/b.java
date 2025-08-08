package com.taobao.android.dinamicx_v4.animation.util;

import android.animation.TimeInterpolator;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fxr;
import tb.gbq;
import tb.gbt;
import tb.gbu;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ANIMATION = "animation";
    public static final String DAMPING_RATIO = "dampingRatio";
    public static final float DEFAULT_DAMPING_RATIO = 0.5f;
    public static final float DEFAULT_STIFFNESS = 1500.0f;
    public static final int DEFAULT_TWEEN_SPEC_DELAY_MILLIS = 0;
    public static final int DEFAULT_TWEEN_SPEC_DURATION_MILLIS = 300;
    public static final int DEFAULT_TWEEN_SPEC_ITERATIONS = 0;
    public static final int DEFAULT_TWEEN_SPEC_REPEAT_MODE = 1;
    public static final String DELAY_MILLIS = "delayMillis";
    public static final String DURATION_MILLIS = "durationMillis";
    public static final String EASING = "easing";
    public static final String ITERATIONS = "iterations";
    public static final String PARAMS = "params";
    public static final String REPEAT_MODE = "repeatMode";
    public static final int REPEAT_MODE_RESTART = 1;
    public static final int REPEAT_MODE_REVERSE = 2;
    public static final String SPRING_SPEC = "spring";
    public static final String STIFFNESS = "stiffness";
    public static final String TWEEN_SPEC = "tween";
    public static final String TYPE = "type";

    static {
        kge.a(665416755);
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue() : (i == 1 || i != 2) ? 1 : 2;
    }

    public static TimeInterpolator a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TimeInterpolator) ipChange.ipc$dispatch("8e4353de", new Object[0]) : d.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r1.equals(com.taobao.android.dinamicx_v4.animation.util.b.TWEEN_SPEC) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.gbq a(com.alibaba.fastjson.JSONObject r7, java.lang.Class<?> r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.dinamicx_v4.animation.util.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r7
            r1[r3] = r8
            java.lang.String r7 = "d72203fb"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            tb.gbq r7 = (tb.gbq) r7
            return r7
        L18:
            r0 = 0
            java.lang.String r1 = "type"
            java.lang.String r1 = tb.fxr.a(r1, r7, r0)
            boolean r4 = android.text.StringUtils.isEmpty(r1)
            if (r4 == 0) goto L2b
            tb.gbq r7 = a(r8)
            return r7
        L2b:
            r4 = -1
            int r5 = r1.hashCode()
            r6 = -895679987(0xffffffffca9d020d, float:-5144838.5)
            if (r5 == r6) goto L45
            r6 = 110773867(0x69a466b, float:5.803183E-35)
            if (r5 == r6) goto L3b
            goto L50
        L3b:
            java.lang.String r5 = "tween"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L50
            goto L51
        L45:
            java.lang.String r2 = "spring"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L50
            r2 = 1
            goto L51
        L50:
            r2 = -1
        L51:
            java.lang.String r1 = "params"
            if (r2 == 0) goto L65
            if (r2 == r3) goto L5c
            tb.gbq r7 = a(r8)
            return r7
        L5c:
            com.alibaba.fastjson.JSONObject r7 = tb.fxr.a(r1, r7, r0)
            tb.gbq r7 = a(r7)
            return r7
        L65:
            com.alibaba.fastjson.JSONObject r7 = tb.fxr.a(r1, r7, r0)
            tb.gbq r7 = b(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx_v4.animation.util.b.a(com.alibaba.fastjson.JSONObject, java.lang.Class):tb.gbq");
    }

    public static gbq a(Class<?> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gbq) ipChange.ipc$dispatch("271ad4db", new Object[]{cls}) : gbu.a(cls, 300, 0, 0, 1, a());
    }

    public static gbq b(JSONObject jSONObject, Class<?> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gbq) ipChange.ipc$dispatch("6b60739a", new Object[]{jSONObject, cls}) : gbu.a(cls, fxr.a(DURATION_MILLIS, jSONObject, 300), fxr.a(DELAY_MILLIS, jSONObject, 0), fxr.a(ITERATIONS, jSONObject, 0), a(fxr.a(REPEAT_MODE, jSONObject, 1)), d.a(fxr.a(EASING, jSONObject, (Object) null)));
    }

    public static gbq a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gbq) ipChange.ipc$dispatch("290121c8", new Object[]{jSONObject}) : gbt.a(fxr.a(DAMPING_RATIO, jSONObject, 0.5f), fxr.a(STIFFNESS, jSONObject, 1500.0f));
    }
}
