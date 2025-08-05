package com.taobao.search.common.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import kotlin.jvm.JvmStatic;
import tb.kge;

/* loaded from: classes7.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final d INSTANCE;

    /* loaded from: classes7.dex */
    public static final class a implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f19031a;

        public a(Activity activity) {
            this.f19031a = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            Application application = Globals.getApplication();
            kotlin.jvm.internal.q.a((Object) application, "Globals.getApplication()");
            intent.setData(Uri.fromParts("package", application.getPackageName(), null));
            Activity activity = this.f19031a;
            if (activity != null) {
                activity.startActivity(intent);
            }
            dialogInterface.cancel();
        }
    }

    @JvmStatic
    public static final void a(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1102f94", new Object[]{context, str, str2, str3, onClickListener, str4, onClickListener2});
        } else {
            a(context, str, str2, str3, onClickListener, str4, onClickListener2, false, 128, null);
        }
    }

    static {
        kge.a(763933831);
        INSTANCE = new d();
    }

    private d() {
    }

    public static /* synthetic */ void a(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7d0fa5f", new Object[]{context, str, str2, str3, onClickListener, str4, onClickListener2, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        if ((i & 16) != 0) {
            onClickListener = null;
        }
        if ((i & 32) != 0) {
            str4 = "";
        }
        if ((i & 64) != 0) {
            onClickListener2 = null;
        }
        if ((i & 128) != 0) {
            z = true;
        }
        a(context, str, str2, str3, onClickListener, str4, onClickListener2, z);
    }

    @JvmStatic
    public static final void a(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f675c0", new Object[]{context, str, str2, str3, onClickListener, str4, onClickListener2, new Boolean(z)});
        } else if (context == null) {
        } else {
            if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
                return;
            }
            String str5 = str;
            if (TextUtils.isEmpty(str5) && TextUtils.isEmpty(str2)) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            if (!TextUtils.isEmpty(str5)) {
                builder.setTitle(str5);
            }
            String str6 = str2;
            if (!TextUtils.isEmpty(str6)) {
                builder.setMessage(str6);
            }
            if (onClickListener != null) {
                if (TextUtils.isEmpty(str3)) {
                    str3 = com.alibaba.ability.localization.b.a(R.string.app_confirm);
                }
                builder.setPositiveButton(str3, onClickListener);
            }
            if (onClickListener2 != null) {
                if (TextUtils.isEmpty(str4)) {
                    str4 = com.alibaba.ability.localization.b.a(R.string.app_cancel);
                }
                builder.setNegativeButton(str4, onClickListener2);
            }
            builder.setCancelable(z);
            builder.create().show();
        }
    }

    @JvmStatic
    public static final void a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bb1504", new Object[]{activity, str});
        } else if (activity == null || activity.isFinishing()) {
        } else {
            a(activity, "", str, com.alibaba.ability.localization.b.a(R.string.app_sure), new a(activity), com.alibaba.ability.localization.b.a(R.string.app_cancel), b.INSTANCE, false, 128, null);
        }
    }

    /* loaded from: classes7.dex */
    public static final class b implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                dialogInterface.cancel();
            }
        }
    }
}
