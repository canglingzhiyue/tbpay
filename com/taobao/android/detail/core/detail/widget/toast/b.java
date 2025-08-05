package com.taobao.android.detail.core.detail.widget.toast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_ERROR = 2;
    public static final int TYPE_INFO = 1;

    /* renamed from: a  reason: collision with root package name */
    private Context f9692a;
    private ToastView b;
    private Toast c;

    static {
        kge.a(1488541967);
    }

    public b(Context context) {
        this.f9692a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.x_detail_dialog_toast, (ViewGroup) null);
        this.b = (ToastView) inflate.findViewById(R.id.view_detail_toast);
        this.c = new Toast(this.f9692a);
        this.c.setDuration(0);
        this.c.setGravity(17, 0, 0);
        this.c.setView(inflate);
        emu.a("com.taobao.android.detail.core.detail.widget.toast.ToastUtil");
    }

    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        if (i == 1) {
            this.b.showTip(str);
        } else if (i == 2) {
            this.b.showError(str);
        }
        this.c.show();
    }
}
