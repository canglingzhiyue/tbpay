package zoloz.ap.com.toolkit.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.mobile.security.faceauth.model.DetectTimerTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes.dex */
public class b extends AlertDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f34472a;
    private String b;
    private String c;
    private String d;
    private String e;
    private DialogInterface.OnClickListener f;
    private DialogInterface.OnClickListener g;
    private boolean h;
    private boolean i;
    private b j;
    private boolean k;
    private DetectTimerTask l;
    private Handler m;

    static {
        kge.a(1501805635);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
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

    public static /* synthetic */ b a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("359c6458", new Object[]{bVar}) : bVar.j;
    }

    public static /* synthetic */ DialogInterface.OnClickListener b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DialogInterface.OnClickListener) ipChange.ipc$dispatch("2cfd609c", new Object[]{bVar}) : bVar.f;
    }

    public static /* synthetic */ DialogInterface.OnClickListener c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DialogInterface.OnClickListener) ipChange.ipc$dispatch("af0c67b", new Object[]{bVar}) : bVar.g;
    }

    public b(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, boolean z, boolean z2, boolean z3) {
        super(context, R.style.dialog_style);
        this.f34472a = context;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.h = z;
        this.i = z2;
        this.g = onClickListener2;
        this.f = onClickListener;
        this.k = z3;
        this.j = this;
        this.m = new Handler();
    }

    @Override // android.app.AlertDialog, android.app.Dialog
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
        ImageButton imageButton;
        LinearLayout linearLayout;
        TextView textView;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        setContentView(!this.k ? LayoutInflater.from(this.f34472a).inflate(R.layout.general_dialog, (ViewGroup) null) : null);
        if (this.f34472a == null) {
            return;
        }
        TextView textView2 = (TextView) findViewById(R.id.dialog_content_title);
        textView2.setTextColor(this.f34472a.getResources().getColor(R.color.dialog_title));
        textView2.setText(this.b);
        TextView textView3 = (TextView) findViewById(R.id.dialog_content_sub_title);
        textView3.setTextColor(this.f34472a.getResources().getColor(R.color.dialog_message));
        textView3.setText(this.c);
        Button button = (Button) findViewById(R.id.dialog_btn_confirm);
        button.setTextColor(this.f34472a.getResources().getColor(R.color.dialog_ok));
        button.setText(this.d);
        Button button2 = (Button) findViewById(R.id.dialog_btn_cancel);
        button2.setTextColor(this.f34472a.getResources().getColor(R.color.dialog_cancel));
        button2.setText(this.e);
        if (!this.k) {
            imageButton = (ImageButton) findViewById(R.id.btn_x);
            linearLayout = (LinearLayout) findViewById(R.id.dialog_protocol);
            textView = (TextView) findViewById(R.id.protocol);
            view = findViewById(R.id.dialog_btn_cancel_center);
        } else {
            imageButton = null;
            linearLayout = null;
            textView = null;
            view = null;
        }
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: zoloz.ap.com.toolkit.ui.b.1
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
        if (TextUtils.isEmpty(this.d)) {
            button.setVisibility(8);
            a(view);
            a((View) null);
        } else {
            button.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.e)) {
            button2.setVisibility(8);
            a(view);
            a((View) null);
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
        attributes.width = (int) (this.f34472a.getResources().getDisplayMetrics().widthPixels * 0.9d);
        window.setAttributes(attributes);
        button.setOnClickListener(new View.OnClickListener() { // from class: zoloz.ap.com.toolkit.ui.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                b.a(b.this).dismiss();
                if (b.b(b.this) == null) {
                    return;
                }
                b.b(b.this).onClick(b.a(b.this), -1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: zoloz.ap.com.toolkit.ui.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                b.a(b.this).dismiss();
                if (b.c(b.this) == null) {
                    return;
                }
                b.c(b.this).onClick(b.a(b.this), -2);
            }
        });
        if (imageButton == null) {
            return;
        }
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: zoloz.ap.com.toolkit.ui.b.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                b.a(b.this).dismiss();
                if (b.c(b.this) == null) {
                    return;
                }
                b.c(b.this).onClick(b.a(b.this), -2);
            }
        });
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
            return;
        }
        DetectTimerTask detectTimerTask = this.l;
        if (detectTimerTask == null) {
            return;
        }
        detectTimerTask.setTimerTaskListener(null);
        this.l.stop();
        this.l = null;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        b();
    }

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public DialogInterface.OnClickListener f34477a;
        public DialogInterface.OnClickListener b;
        private Context c;
        private String d;
        private String e;
        private String f;
        private String g;
        private boolean h;
        private boolean i;
        private boolean j;

        static {
            kge.a(1117233178);
        }

        public a(Context context) {
            this.c = context;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a45435ad", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e7df536e", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public a a(String str, DialogInterface.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5ffc1dd6", new Object[]{this, str, onClickListener});
            }
            this.f = str;
            this.f34477a = onClickListener;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9fe901e7", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dd08c606", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public a b(String str, DialogInterface.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1888de35", new Object[]{this, str, onClickListener});
            }
            this.g = str;
            this.b = onClickListener;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1a288a25", new Object[]{this, new Boolean(z)});
            }
            this.j = z;
            return this;
        }

        public b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("aa20a340", new Object[]{this});
            }
            b bVar = new b(this.c, this.d, this.e, this.f, this.f34477a, this.g, this.b, this.h, this.i, this.j);
            try {
                bVar.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return bVar;
        }
    }
}
