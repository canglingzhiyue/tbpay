package com.taobao.avplayer.core.animation.data;

import mtopsdk.common.util.StringUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2116321107);
    }

    public static Interpolator a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("1042ff47", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1102672091) {
            if (hashCode != -787702915) {
                if (hashCode == 1438451334 && str.equals("ease_in_ease_out")) {
                    c = 2;
                }
            } else if (str.equals("ease_out")) {
                c = 1;
            }
        } else if (str.equals("linear")) {
            c = 0;
        }
        if (c == 0) {
            return new LinearInterpolator();
        }
        if (c == 1) {
            new DecelerateInterpolator();
        } else if (c != 2) {
            return null;
        }
        return new AccelerateDecelerateInterpolator();
    }
}
