package com.etao.feimagesearch.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes4.dex */
public class ab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f7005a;

    static {
        kge.a(38633582);
        f7005a = R.layout.loading_mask_layout;
    }

    public static AlertDialog a(Activity activity, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlertDialog) ipChange.ipc$dispatch("8d387049", new Object[]{activity, str, str2, str3, onClickListener, str4, onClickListener2});
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        if (!StringUtils.isEmpty(str)) {
            builder.setTitle(str);
        }
        builder.setMessage(str2);
        if (!StringUtils.isEmpty(str3) && onClickListener != null) {
            builder.setPositiveButton(str3, onClickListener);
        }
        if (!StringUtils.isEmpty(str4)) {
            builder.setNegativeButton(str4, onClickListener2);
        }
        builder.setCancelable(false);
        return activity.isFinishing() ? builder.create() : builder.show();
    }
}
