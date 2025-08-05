package com.taobao.android.detail.core.detail.widget.toast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_ERROR = 2;
    public static final int TYPE_INFO = 1;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f9691a;
    private ToastView b;
    private PopupWindow c;

    static {
        kge.a(1717976917);
    }

    public a(Context context) {
        this.f9691a = new WeakReference<>(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.x_detail_dialog_toast, (ViewGroup) null);
        this.b = (ToastView) inflate.findViewById(R.id.view_detail_toast);
        this.c = new PopupWindow(inflate, -2, -2, true);
        this.c.setTouchable(false);
        emu.a("com.taobao.android.detail.core.detail.widget.toast.PopupToast");
    }

    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else if (!(this.f9691a.get() instanceof DetailCoreActivity)) {
        } else {
            this.c.showAtLocation(((DetailCoreActivity) this.f9691a.get()).V(), 17, 0, 0);
            if (i == 1) {
                this.b.showTip(str);
            } else if (i != 2) {
            } else {
                this.b.showError(str);
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (this.c == null || !this.c.isShowing()) {
                return;
            }
            this.c.dismiss();
        } catch (Throwable unused) {
        }
    }
}
