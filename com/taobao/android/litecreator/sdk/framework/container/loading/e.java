package com.taobao.android.litecreator.sdk.framework.container.loading;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.f;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes5.dex */
public class e extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f13455a;
    private TextView b;
    private a c;
    private ImageView d;
    private ImageView e;
    private ObjectAnimator f;

    static {
        kge.a(1073379632);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1373052399:
                super.dismiss();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -340027132:
                super.show();
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 1887430145:
                super.cancel();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ a a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("a3ddd452", new Object[]{eVar}) : eVar.c;
    }

    public e(Context context, a aVar) {
        super(context);
        this.f13455a = context;
        this.c = aVar;
        requestWindowFeature(1);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.dimAmount = 0.8f;
        getWindow().setAttributes(attributes);
        getWindow().addFlags(2);
        ColorDrawable colorDrawable = new ColorDrawable();
        colorDrawable.setColor(0);
        getWindow().setBackgroundDrawable(colorDrawable);
        getWindow().setGravity(17);
        b();
        setCanceledOnTouchOutside(false);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b.setText(str);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            super.onCreate(bundle);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = new LinearLayout(this.f13455a);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundDrawable(this.f13455a.getDrawable(R.drawable.drawable_update_loading_bg));
        linearLayout.setPadding(0, 0, 0, f.a(12.0f));
        this.e = new ImageView(this.f13455a);
        this.e.setImageDrawable(this.f13455a.getDrawable(R.drawable.icon_common_panel_close));
        int a2 = f.a(10.0f);
        this.e.setPadding(a2, a2, a2, a2 / 2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(f.a(32.0f), f.a(32.0f));
        layoutParams.gravity = 5;
        this.e.setLayoutParams(layoutParams);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.litecreator.sdk.framework.container.loading.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (e.a(e.this) == null) {
                } else {
                    e.a(e.this).c();
                }
            }
        });
        linearLayout.addView(this.e);
        this.d = new ImageView(this.f13455a);
        this.d.setImageResource(R.drawable.lc_icon_loading);
        this.d.setLayoutParams(new FrameLayout.LayoutParams(f.a(33.0f), f.a(33.0f)));
        linearLayout.addView(this.d);
        this.b = new TextView(this.f13455a);
        this.b.setText(com.alibaba.ability.localization.b.a(R.string.gg_pub_processing));
        this.b.setTextColor(-1);
        this.b.setTextSize(1, 14.0f);
        this.b.setLineSpacing(f.a(5.0f), 1.0f);
        this.b.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.b.setPadding(0, f.a(16.0f), 0, 0);
        this.b.setGravity(17);
        linearLayout.addView(this.b);
        setContentView(linearLayout, a());
    }

    public LinearLayout.LayoutParams a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout.LayoutParams) ipChange.ipc$dispatch("7262c023", new Object[]{this}) : new LinearLayout.LayoutParams(f.a(186.0f), f.a(120.0f));
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f = ObjectAnimator.ofFloat(this.d, "rotation", 0.0f, 360.0f);
        this.f.setDuration(1000L);
        this.f.setInterpolator(new LinearInterpolator());
        this.f.setRepeatCount(-1);
        this.f.start();
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (d()) {
        } else {
            super.show();
            a aVar = this.c;
            if (aVar != null) {
                aVar.a();
            }
            c();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else if (d()) {
        } else {
            super.dismiss();
            a aVar = this.c;
            if (aVar != null) {
                aVar.b();
            }
            ObjectAnimator objectAnimator = this.f;
            if (objectAnimator == null) {
                return;
            }
            objectAnimator.cancel();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else if (d()) {
        } else {
            super.cancel();
            a aVar = this.c;
            if (aVar == null) {
                return;
            }
            aVar.c();
        }
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        Context context = this.f13455a;
        if (context == null) {
            return true;
        }
        return (context instanceof Activity) && (((Activity) context).isFinishing() || ((Activity) this.f13455a).isDestroyed());
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            super.onBackPressed();
        }
    }
}
