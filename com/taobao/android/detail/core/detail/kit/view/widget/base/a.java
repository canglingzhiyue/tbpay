package com.taobao.android.detail.core.detail.kit.view.widget.base;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.taobao.R;
import tb.emu;
import tb.epj;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f9598a;
    private b b;
    private Dialog c;
    private Button d;
    private Button e;
    private Button f;
    private ImageView h;
    private View g = null;
    private boolean i = false;
    private TextView j = null;

    static {
        kge.a(2081221745);
    }

    public static /* synthetic */ Dialog a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("78d8e8ae", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ b b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("c1bb374c", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aca4bc3", new Object[]{aVar});
        } else {
            aVar.f();
        }
    }

    public static /* synthetic */ void d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("168bc784", new Object[]{aVar});
        } else {
            aVar.g();
        }
    }

    public a(Context context, b bVar) {
        this.f9598a = context;
        this.b = bVar;
        e();
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.base.ConnectErrorDialog");
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.g = ((LayoutInflater) epj.a().getApplication().getSystemService("layout_inflater")).inflate(R.layout.x_taodetail_core_dialog_connecterror_layout, (ViewGroup) null, true);
        this.j = (TextView) this.g.findViewById(R.id.taodetail_errortext);
        this.h = (ImageView) this.g.findViewById(R.id.taodetail_imageView);
        this.h.setVisibility(8);
        this.d = (Button) this.g.findViewById(R.id.taodetail_refresh);
        this.e = (Button) this.g.findViewById(R.id.taodetail_cancel);
        this.f = (Button) this.g.findViewById(R.id.taodetail_set);
        this.c = new Dialog(this.f9598a, R.style.Theme_TBDialog);
        this.c.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.base.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue();
                }
                if (keyEvent == null || keyEvent.getRepeatCount() > 0) {
                    return true;
                }
                if (i != 4 || keyEvent.getRepeatCount() != 0) {
                    return false;
                }
                if (a.a(a.this) != null) {
                    try {
                        a.a(a.this).dismiss();
                    } catch (Exception unused) {
                    }
                }
                i.d("ConnectErrorDialog", "init");
                a.b(a.this).X();
                return true;
            }
        });
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.base.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                a.this.b();
                a.b(a.this).X();
            }
        });
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.base.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                a.this.b();
                a.b(a.this).x();
            }
        });
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.base.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    a.c(a.this);
                }
            }
        });
        this.c.setContentView(this.g);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        TextView textView = this.j;
        if (textView == null) {
            return;
        }
        if (str == null) {
            textView.setText(com.alibaba.ability.localization.b.a(R.string.x_detail_app_network_request_timeout));
        } else {
            textView.setText(str);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        Dialog dialog = this.c;
        if (dialog == null) {
            return;
        }
        dialog.setCancelable(z);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Dialog dialog = this.c;
        if (dialog == null || this.i) {
            return;
        }
        try {
            dialog.show();
            this.i = true;
            this.c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.base.a.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                        return;
                    }
                    a.d(a.this);
                    if (a.a(a.this) == null) {
                        return;
                    }
                    a.a(a.this).setOnDismissListener(null);
                    a.a(a.this).setOnCancelListener(null);
                }
            });
            this.c.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.base.a.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        return;
                    }
                    i.d("connectErrorDialog", "connectErrorDialog onCancelListener");
                    if (a.a(a.this) == null) {
                        return;
                    }
                    a.a(a.this).setOnDismissListener(null);
                    a.a(a.this).setOnCancelListener(null);
                }
            });
        } catch (Exception unused) {
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 14) {
                this.f9598a.startActivity(new Intent("android.settings.SETTINGS"));
            } else {
                this.f9598a.startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
            }
        } catch (ActivityNotFoundException unused) {
            epo.a("对不起，您的设备找不到设置网络程序");
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.c == null) {
        } else {
            this.i = false;
            i.d("ConnectorErrorDialog", "ConnectorErrorDialog stop");
            this.c.dismiss();
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.c == null) {
        } else {
            this.i = false;
            i.d("ConnectorErrorDialog", "free");
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.i;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        b();
        this.g = null;
        if (this.c != null) {
            this.c = null;
        }
        this.f9598a = null;
        this.b = null;
    }
}
