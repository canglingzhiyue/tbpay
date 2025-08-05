package com.taobao.umipublish.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;

/* loaded from: classes9.dex */
public class b extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TextView f23365a;
    private TextView b;
    private TextView c;
    private TUrlImageView d;
    private FrameLayout e;
    private String f;
    private String g;
    private String h;
    private String i;
    private InterfaceC1004b j;
    private a k;

    /* loaded from: classes9.dex */
    public interface a {
        void a();
    }

    /* renamed from: com.taobao.umipublish.widget.b$b  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public interface InterfaceC1004b {
        void a();
    }

    static {
        kge.a(154439645);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ InterfaceC1004b a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InterfaceC1004b) ipChange.ipc$dispatch("bd70b730", new Object[]{bVar}) : bVar.j;
    }

    public static /* synthetic */ a b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f65117b0", new Object[]{bVar}) : bVar.k;
    }

    public b(Context context) {
        super(context);
    }

    public b(Context context, int i) {
        super(context, i);
    }

    public void a(String str, InterfaceC1004b interfaceC1004b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a8422e", new Object[]{this, str, interfaceC1004b});
            return;
        }
        this.g = str;
        this.j = interfaceC1004b;
    }

    public void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a7cdcf", new Object[]{this, str, aVar});
            return;
        }
        this.h = str;
        this.k = aVar;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.lay_lc_custom_dialog);
        setCanceledOnTouchOutside(false);
        a();
        b();
        c();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f23365a = (TextView) findViewById(R.id.umi_custom_dialog_content);
        this.b = (TextView) findViewById(R.id.umi_custom_dialog_negative_btn);
        this.c = (TextView) findViewById(R.id.umi_custom_dialog_positive_btn);
        this.d = (TUrlImageView) findViewById(R.id.umi_custom_dialog_cover);
        this.e = (FrameLayout) findViewById(R.id.umi_custom_dialog_close_btn);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (!TextUtils.isEmpty(this.f)) {
            this.f23365a.setText(this.f);
        }
        if (!TextUtils.isEmpty(this.g)) {
            this.c.setText(this.g);
        }
        if (!TextUtils.isEmpty(this.h)) {
            this.b.setText(this.h);
        }
        if (TextUtils.isEmpty(this.i)) {
            this.d.setVisibility(8);
            return;
        }
        this.d.setVisibility(0);
        this.d.setImageUrl(this.i);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.umipublish.widget.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (b.a(b.this) == null) {
                } else {
                    b.a(b.this).a();
                }
            }
        });
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.umipublish.widget.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (b.b(b.this) == null) {
                } else {
                    b.b(b.this).a();
                }
            }
        });
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.umipublish.widget.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (b.b(b.this) == null) {
                } else {
                    b.b(b.this).a();
                }
            }
        });
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }
}
