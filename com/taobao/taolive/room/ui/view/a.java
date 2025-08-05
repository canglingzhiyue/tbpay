package com.taobao.taolive.room.ui.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cgl;
import tb.kge;

/* loaded from: classes8.dex */
public abstract class a extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f21750a;
    public boolean b;

    static {
        kge.a(-321347684);
    }

    public abstract View a();

    public a(Context context) {
        this(context, cgl.h().a(), false);
    }

    public a(Context context, int i) {
        this(context, i, false);
    }

    public a(Context context, int i, boolean z) {
        super(context, i);
        this.b = false;
        this.f21750a = context;
        this.b = z;
        setContentView(a());
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (context instanceof Activity) {
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            displayMetrics = context.getResources().getDisplayMetrics();
        }
        getWindow().setAttributes(a(displayMetrics));
        setCanceledOnTouchOutside(true);
    }

    public WindowManager.LayoutParams a(DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager.LayoutParams) ipChange.ipc$dispatch("9ad0565b", new Object[]{this, displayMetrics});
        }
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (this.b) {
            attributes.gravity = 53;
            attributes.width = displayMetrics.heightPixels;
            attributes.height = displayMetrics.heightPixels;
        } else {
            attributes.gravity = 83;
            attributes.width = displayMetrics.widthPixels;
        }
        return attributes;
    }
}
