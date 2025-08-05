package tb;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ab;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class cqj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Activity f26430a;
    private AlertDialog b;

    static {
        kge.a(-198019557);
    }

    public cqj(Activity activity) {
        this.f26430a = activity;
    }

    public void a(String str, DialogInterface.OnClickListener onClickListener, String str2, DialogInterface.OnClickListener onClickListener2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ae6c352", new Object[]{this, str, onClickListener, str2, onClickListener2, str3});
        } else if (this.f26430a.isFinishing()) {
        } else {
            AlertDialog alertDialog = this.b;
            if (alertDialog != null && alertDialog.isShowing()) {
                this.b.dismiss();
            }
            if (onClickListener == null) {
                str2 = null;
            } else if (TextUtils.isEmpty(str2)) {
                str2 = b.a(R.string.irp_error_message_retry_text);
            }
            String str4 = str2;
            if (TextUtils.isEmpty(str3)) {
                str3 = b.a(R.string.irp_error_message_cancel_text);
            }
            this.b = ab.a(this.f26430a, "", str, str4, onClickListener, str3, onClickListener2);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        AlertDialog alertDialog = this.b;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        this.b.dismiss();
        this.b = null;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        AlertDialog alertDialog = this.b;
        return alertDialog != null && alertDialog.isShowing();
    }
}
