package com.taobao.search.common.util;

import android.content.Context;
import android.support.v4.view.GravityCompat;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.util.Constants;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import tb.kge;

/* loaded from: classes7.dex */
public class w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f19047a;

    static {
        kge.a(-907683580);
        f19047a = w.class.getSimpleName();
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            a(str, null, 0);
        }
    }

    public static void a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba9507", new Object[]{str, str2, new Integer(i)});
            return;
        }
        TBToast makeText = TBToast.makeText(Globals.getApplication(), str);
        if (i != 0) {
            try {
                makeText.setToastIcon(i);
                makeText.setToastIconColor(Globals.getApplication().getResources().getColor(R.color.tbsearch_toast_icon));
            } catch (Exception unused) {
                Log.e(f19047a, "set icon error");
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            makeText.setText2(str2);
        }
        makeText.setGravity(GravityCompat.START, 0, -500);
        makeText.show();
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        Toast makeText = Toast.makeText(context, com.alibaba.ability.localization.b.a(R.string.app_network_crash), 0);
        makeText.setGravity(48, 0, Constants.screen_height / 4);
        makeText.show();
    }
}
