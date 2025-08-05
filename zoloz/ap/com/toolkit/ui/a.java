package zoloz.ap.com.toolkit.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.verifyidentity.ui.helper.DialogHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;
import zoloz.ap.com.toolkit.ui.b;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f34464a;
    private AlertDialog b;

    static {
        kge.a(1605645375);
    }

    public static /* synthetic */ Activity a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("c6f86227", new Object[]{aVar}) : aVar.f34464a;
    }

    public static /* synthetic */ AlertDialog a(a aVar, AlertDialog alertDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlertDialog) ipChange.ipc$dispatch("d9c9c5c5", new Object[]{aVar, alertDialog});
        }
        aVar.b = alertDialog;
        return alertDialog;
    }

    public static /* synthetic */ AlertDialog b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlertDialog) ipChange.ipc$dispatch("fcf880db", new Object[]{aVar}) : aVar.b;
    }

    public a(Activity activity) {
        this.f34464a = activity;
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else {
            this.f34464a = activity;
        }
    }

    public void a(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23382d9c", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2});
        } else {
            a(str, str2, str3, onClickListener, str4, onClickListener2, false);
        }
    }

    public void a(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a352431", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2, bool});
        } else {
            a(str, str2, str3, onClickListener, str4, onClickListener2, false, false);
        }
    }

    public void a(final String str, final String str2, final String str3, final DialogInterface.OnClickListener onClickListener, final String str4, final DialogInterface.OnClickListener onClickListener2, Boolean bool, Boolean bool2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beea337c", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2, bool, bool2});
            return;
        }
        a();
        AlertDialog alertDialog = this.b;
        if (alertDialog != null && alertDialog.isShowing()) {
            return;
        }
        this.f34464a.runOnUiThread(new Runnable() { // from class: zoloz.ap.com.toolkit.ui.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (a.a(a.this) == null || a.a(a.this).isFinishing()) {
                } else {
                    b.a aVar = new b.a(a.a(a.this));
                    String str5 = str;
                    if (str5 != null) {
                        aVar.a(str5);
                    }
                    String str6 = str2;
                    if (str6 != null) {
                        aVar.b(str6);
                    }
                    String str7 = str3;
                    if (str7 != null) {
                        aVar.a(str7, onClickListener);
                    }
                    String str8 = str4;
                    if (str8 != null) {
                        aVar.b(str8, onClickListener2);
                    }
                    aVar.c(false);
                    aVar.b(false);
                    aVar.a(false);
                    zoloz.ap.com.toolkit.ui.b a2 = aVar.a();
                    a.a(a.this, a2);
                    a2.setCancelable(false);
                    a2.setCanceledOnTouchOutside(false);
                    a2.getWindow().setGravity(17);
                }
            }
        });
    }

    public void a(final String str, final boolean z, final DialogInterface.OnCancelListener onCancelListener, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c260ddd9", new Object[]{this, str, new Boolean(z), onCancelListener, new Boolean(z2)});
            return;
        }
        a();
        this.f34464a.runOnUiThread(new Runnable() { // from class: zoloz.ap.com.toolkit.ui.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (a.a(a.this) == null || a.a(a.this).isFinishing()) {
                } else {
                    a aVar = a.this;
                    a.a(aVar, new AlertDialogC1192a(a.a(aVar)));
                    a.b(a.this).setMessage(str);
                    ((AlertDialogC1192a) a.b(a.this)).a(z2);
                    a.b(a.this).setCancelable(z);
                    a.b(a.this).setOnCancelListener(onCancelListener);
                    a.b(a.this).setCanceledOnTouchOutside(false);
                    a.b(a.this).getWindow().setGravity(17);
                    a.b(a.this).show();
                }
            }
        });
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f34464a.runOnUiThread(new Runnable() { // from class: zoloz.ap.com.toolkit.ui.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (a.b(a.this) == null || !a.b(a.this).isShowing() || a.a(a.this).isFinishing()) {
                    } else {
                        try {
                            a.b(a.this).dismiss();
                        } catch (Throwable th) {
                            try {
                                BioLog.w(DialogHelper.TAG, "DialogHelper.dismissDialog(): exception=" + th);
                            } finally {
                                a.a(a.this, (AlertDialog) null);
                            }
                        }
                    }
                }
            });
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f34464a.runOnUiThread(new Runnable() { // from class: zoloz.ap.com.toolkit.ui.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (a.b(a.this) == null || !a.b(a.this).isShowing()) {
                    } else {
                        try {
                            a.b(a.this).dismiss();
                        } catch (Throwable th) {
                            try {
                                BioLog.w(DialogHelper.TAG, "DialogHelper.dismissDialog(): exception=" + th);
                            } finally {
                                a.a(a.this, (AlertDialog) null);
                            }
                        }
                    }
                }
            });
        }
    }

    public void a(final boolean z, final DialogInterface.OnCancelListener onCancelListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4925065", new Object[]{this, new Boolean(z), onCancelListener});
            return;
        }
        a();
        this.f34464a.runOnUiThread(new Runnable() { // from class: zoloz.ap.com.toolkit.ui.a.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (a.a(a.this) == null || a.a(a.this).isFinishing()) {
                } else {
                    a aVar = a.this;
                    a.a(aVar, new b(a.a(aVar)));
                    a.b(a.this).setCancelable(z);
                    a.b(a.this).setOnCancelListener(onCancelListener);
                    a.b(a.this).setCanceledOnTouchOutside(false);
                    a.b(a.this).getWindow().setGravity(17);
                    a.b(a.this).show();
                }
            }
        });
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f34464a = null;
        this.b = null;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        AlertDialog alertDialog = this.b;
        return alertDialog != null && alertDialog.isShowing();
    }

    /* renamed from: zoloz.ap.com.toolkit.ui.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public class AlertDialogC1192a extends AlertDialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ProgressBar b;
        private TextView c;
        private CharSequence d;
        private boolean e;
        private boolean f;

        static {
            kge.a(-1500311950);
        }

        public static /* synthetic */ Object ipc$super(AlertDialogC1192a alertDialogC1192a, String str, Object... objArr) {
            if (str.hashCode() == -641568046) {
                super.onCreate((Bundle) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public AlertDialogC1192a(Context context) {
            super(context, R.style.process_style);
        }

        @Override // android.app.AlertDialog, android.app.Dialog
        public void onCreate(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
                return;
            }
            super.onCreate(bundle);
            setContentView(R.layout.layout_progress_dialog);
            this.b = (ProgressBar) findViewById(16908301);
            this.c = (TextView) findViewById(R.id.message);
            a();
            b(this.e);
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.c.setText(this.d);
            CharSequence charSequence = this.d;
            int i = 8;
            if (charSequence == null || "".equals(charSequence)) {
                this.c.setVisibility(8);
            }
            ProgressBar progressBar = this.b;
            if (this.f) {
                i = 0;
            }
            progressBar.setVisibility(i);
        }

        @Override // android.app.AlertDialog
        public void setMessage(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22c4a3f0", new Object[]{this, charSequence});
            } else {
                this.d = charSequence;
            }
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.f = z;
            }
        }

        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
                return;
            }
            ProgressBar progressBar = this.b;
            if (progressBar != null) {
                progressBar.setIndeterminate(z);
            } else {
                this.e = z;
            }
        }
    }

    /* loaded from: classes9.dex */
    public class b extends AlertDialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-326739218);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -641568046) {
                super.onCreate((Bundle) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public b(Context context) {
            super(context);
        }

        @Override // android.app.AlertDialog, android.app.Dialog
        public void onCreate(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
                return;
            }
            super.onCreate(bundle);
            setContentView(R.layout.layout_upload_success);
        }
    }
}
