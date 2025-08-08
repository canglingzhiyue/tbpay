package com.alipay.zoloz.toyger.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.DeviceMaintenanceService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.faceauth.model.DetectTimerTask;
import com.alipay.zoloz.toyger.interfaces.DialogCallback;
import com.alipay.zoloz.toyger.util.DialogTypeIndex;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class GenenalDialog extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f6306a;
    private String b;
    private String c;
    private String d;
    private String e;
    private DialogInterface.OnClickListener f;
    private DialogInterface.OnClickListener g;
    private boolean h;
    private boolean i;
    private GenenalDialog j;
    private Object k;
    private boolean l;
    private ImageView m;
    private TextView n;
    private DetectTimerTask o;
    private DialogCallback p;
    private Handler q;

    public static /* synthetic */ Object ipc$super(GenenalDialog genenalDialog, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 949399698) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDetachedFromWindow();
            return null;
        }
    }

    public static /* synthetic */ GenenalDialog a(GenenalDialog genenalDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GenenalDialog) ipChange.ipc$dispatch("1572974e", new Object[]{genenalDialog}) : genenalDialog.j;
    }

    public static /* synthetic */ DialogInterface.OnClickListener b(GenenalDialog genenalDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DialogInterface.OnClickListener) ipChange.ipc$dispatch("ad7c597f", new Object[]{genenalDialog}) : genenalDialog.f;
    }

    public static /* synthetic */ DialogInterface.OnClickListener c(GenenalDialog genenalDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DialogInterface.OnClickListener) ipChange.ipc$dispatch("cc369140", new Object[]{genenalDialog}) : genenalDialog.g;
    }

    public static /* synthetic */ ImageView d(GenenalDialog genenalDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("2a20024c", new Object[]{genenalDialog}) : genenalDialog.m;
    }

    public static /* synthetic */ DetectTimerTask e(GenenalDialog genenalDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetectTimerTask) ipChange.ipc$dispatch("59a74e66", new Object[]{genenalDialog}) : genenalDialog.o;
    }

    public static /* synthetic */ DialogCallback f(GenenalDialog genenalDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DialogCallback) ipChange.ipc$dispatch("667059ca", new Object[]{genenalDialog}) : genenalDialog.p;
    }

    public static /* synthetic */ TextView g(GenenalDialog genenalDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("1ec45e7b", new Object[]{genenalDialog}) : genenalDialog.n;
    }

    public static /* synthetic */ Context h(GenenalDialog genenalDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f9763fc0", new Object[]{genenalDialog}) : genenalDialog.f6306a;
    }

    public static /* synthetic */ Handler i(GenenalDialog genenalDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("48c2d19d", new Object[]{genenalDialog}) : genenalDialog.q;
    }

    public GenenalDialog(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, boolean z, boolean z2, boolean z3) {
        super(context, R.style.toyger_general_dialog_style);
        this.f6306a = context;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.h = z;
        this.i = z2;
        this.g = onClickListener2;
        this.f = onClickListener;
        this.l = z3;
        this.j = this;
        this.q = new Handler();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        a();
    }

    private void a() {
        View inflate;
        ImageView imageView;
        LinearLayout linearLayout;
        ImageButton imageButton;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        LayoutInflater from = LayoutInflater.from(this.f6306a);
        TextView textView = null;
        if (!this.l) {
            inflate = from.inflate(R.layout.toyger_general_dialog, (ViewGroup) null);
        } else {
            inflate = from.inflate(R.layout.toyger_garfield_dialog, (ViewGroup) null);
        }
        setContentView(inflate);
        DeviceMaintenanceService deviceMaintenanceService = (DeviceMaintenanceService) BioServiceManager.getCurrentInstance().getBioService(DeviceMaintenanceService.class);
        if (deviceMaintenanceService != null) {
            deviceMaintenanceService.registerQREvent(this.f6306a, inflate);
        }
        ((TextView) findViewById(R.id.toyger_general_dialog_content_title)).setText(this.b);
        ((TextView) findViewById(R.id.toyger_general_dialog_content_sub_title)).setText(this.c);
        Button button = (Button) findViewById(R.id.toyger_general_dialog_btn_confirm);
        button.setText(this.d);
        Button button2 = (Button) findViewById(R.id.toyger_general_dialog_btn_cancel);
        button2.setText(this.e);
        if (!this.l) {
            ImageButton imageButton2 = (ImageButton) findViewById(R.id.btn_x);
            linearLayout = (LinearLayout) findViewById(R.id.toyger_general_dialog_protocol);
            view = findViewById(R.id.toyger_general_dialog_btn_cancel_center);
            imageView = null;
            textView = (TextView) findViewById(R.id.protocol);
            imageButton = imageButton2;
        } else {
            imageView = (ImageView) findViewById(R.id.toyger_garfield_dialog_btn_divide);
            this.m = (ImageView) findViewById(R.id.garfield_dialog_icon);
            linearLayout = null;
            imageButton = null;
            view = null;
        }
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.zoloz.toyger.widget.GenenalDialog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    }
                }
            });
        }
        if (StringUtils.isEmpty(this.d)) {
            button.setVisibility(8);
            a(view);
            a(imageView);
        } else {
            button.setVisibility(0);
        }
        if (StringUtils.isEmpty(this.e)) {
            button2.setVisibility(8);
            a(view);
            a(imageView);
        } else {
            button2.setVisibility(0);
        }
        if (!this.i && linearLayout != null) {
            linearLayout.setVisibility(4);
        }
        if (!this.h) {
            a(imageButton);
        }
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = (int) (this.f6306a.getResources().getDisplayMetrics().widthPixels * 0.9d);
        window.setAttributes(attributes);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.zoloz.toyger.widget.GenenalDialog.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                GenenalDialog.a(GenenalDialog.this).dismiss();
                if (GenenalDialog.b(GenenalDialog.this) == null) {
                    return;
                }
                GenenalDialog.b(GenenalDialog.this).onClick(GenenalDialog.a(GenenalDialog.this), -1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.zoloz.toyger.widget.GenenalDialog.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                GenenalDialog.a(GenenalDialog.this).dismiss();
                if (GenenalDialog.c(GenenalDialog.this) == null) {
                    return;
                }
                GenenalDialog.c(GenenalDialog.this).onClick(GenenalDialog.a(GenenalDialog.this), -2);
            }
        });
        if (imageButton != null) {
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.zoloz.toyger.widget.GenenalDialog.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        return;
                    }
                    GenenalDialog.a(GenenalDialog.this).dismiss();
                    if (GenenalDialog.c(GenenalDialog.this) == null) {
                        return;
                    }
                    GenenalDialog.c(GenenalDialog.this).onClick(GenenalDialog.a(GenenalDialog.this), -2);
                }
            });
        }
        b();
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            view.setVisibility(8);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.l) {
        } else {
            try {
                final Activity activity = this.f6306a instanceof Activity ? (Activity) this.f6306a : null;
                if (activity == null) {
                    return;
                }
                activity.runOnUiThread(new Runnable() { // from class: com.alipay.zoloz.toyger.widget.GenenalDialog.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            GenenalDialog.d(GenenalDialog.this).startAnimation(AnimationUtils.loadAnimation(activity, R.anim.anim_garfield_shake));
                        }
                    }
                });
            } catch (Throwable th) {
                BioLog.e("shakeGarfieldIcon", th);
            }
        }
    }

    public void setTag(DialogTypeIndex dialogTypeIndex) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b666b76", new Object[]{this, dialogTypeIndex});
        } else {
            this.k = dialogTypeIndex;
        }
    }

    public void setCallback(DialogCallback dialogCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c223786", new Object[]{this, dialogCallback});
        } else {
            this.p = dialogCallback;
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.o != null) {
            d();
        }
        this.o = new DetectTimerTask(20000);
        this.o.setTimerTaskListener(new DetectTimerTask.TimerListener() { // from class: com.alipay.zoloz.toyger.widget.GenenalDialog.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.security.faceauth.model.DetectTimerTask.TimerListener
            public void countdown(final int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3e055fcb", new Object[]{this, new Integer(i)});
                } else {
                    GenenalDialog.i(GenenalDialog.this).post(new Runnable() { // from class: com.alipay.zoloz.toyger.widget.GenenalDialog.6.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (GenenalDialog.e(GenenalDialog.this) != null && GenenalDialog.e(GenenalDialog.this).isTimeOut()) {
                                if (GenenalDialog.f(GenenalDialog.this) == null) {
                                    return;
                                }
                                GenenalDialog.f(GenenalDialog.this).onTimeOut();
                            } else if (GenenalDialog.g(GenenalDialog.this) == null) {
                            } else {
                                TextView g = GenenalDialog.g(GenenalDialog.this);
                                g.setText((i / 1000) + GenenalDialog.h(GenenalDialog.this).getString(R.string.second));
                            }
                        }
                    });
                }
            }
        });
        this.o.start();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        DetectTimerTask detectTimerTask = this.o;
        if (detectTimerTask == null) {
            return;
        }
        detectTimerTask.setTimerTaskListener(null);
        this.o.stop();
        this.o = null;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        d();
    }

    /* loaded from: classes3.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public DialogInterface.OnClickListener f6314a;
        public DialogInterface.OnClickListener b;
        private Context c;
        private String d;
        private String e;
        private String f;
        private String g;
        private boolean h;
        private boolean i;
        private boolean j;

        public Builder(Context context) {
            this.c = context;
        }

        public Builder setTitle(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("2621d371", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public Builder setMessage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("95c5c1e2", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public Builder setMessage2(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("1292ae9a", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public Builder setPositiveButton(String str, DialogInterface.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("c585c269", new Object[]{this, str, onClickListener});
            }
            this.f = str;
            this.f6314a = onClickListener;
            return this;
        }

        public Builder showProtocol(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("98ff19a0", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }

        public Builder showCloseButton(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("77c1cef8", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public Builder setNegativeButton(String str, DialogInterface.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("4d16d5a5", new Object[]{this, str, onClickListener});
            }
            this.g = str;
            this.b = onClickListener;
            return this;
        }

        public Builder setToGarfieldFaceless(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ff6a2e40", new Object[]{this, new Boolean(z)});
            }
            this.j = z;
            return this;
        }

        public GenenalDialog show() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GenenalDialog) ipChange.ipc$dispatch("ccaa5fab", new Object[]{this});
            }
            GenenalDialog genenalDialog = new GenenalDialog(this.c, this.d, this.e, this.f, this.f6314a, this.g, this.b, this.h, this.i, this.j);
            try {
                genenalDialog.show();
            } catch (Exception unused) {
            }
            return genenalDialog;
        }
    }
}
