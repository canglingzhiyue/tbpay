package com.taobao.android.litecreator.sdk.framework.container.loading;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.WindowManager;
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
public class c extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f13452a;
    private TextView b;
    private TextView c;
    private a d;
    private RoundProgressView e;
    private ImageView f;
    private ObjectAnimator g;
    private boolean h;

    static {
        kge.a(-306892532);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
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

    public static /* synthetic */ a a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c13ab550", new Object[]{cVar}) : cVar.d;
    }

    public c(Context context, a aVar) {
        super(context);
        this.f13452a = context;
        this.d = aVar;
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

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e669201", new Object[]{this, aVar});
        } else {
            this.d = aVar;
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
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = new LinearLayout(this.f13452a);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundDrawable(this.f13452a.getDrawable(R.drawable.drawable_progress_dialog_bg));
        linearLayout.setPadding(0, 0, 0, f.a(16.0f));
        this.f = new ImageView(this.f13452a);
        this.f.setImageDrawable(this.f13452a.getDrawable(R.drawable.icon_common_panel_close));
        int a2 = f.a(10.0f);
        this.f.setPadding(a2, a2, a2, a2 / 2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(f.a(32.0f), f.a(32.0f));
        layoutParams.gravity = 5;
        this.f.setLayoutParams(layoutParams);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.litecreator.sdk.framework.container.loading.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (c.a(c.this) == null) {
                } else {
                    c.a(c.this).c();
                }
            }
        });
        linearLayout.addView(this.f);
        this.e = new RoundProgressView(this.f13452a);
        this.e.setMax(100);
        this.e.setLoadingRoundColor(-1);
        this.e.setInnerBgColor(Color.parseColor("#26FFFFFF"));
        this.e.setProgress(0);
        this.e.setLayoutParams(new FrameLayout.LayoutParams(f.a(50.0f), f.a(50.0f)));
        linearLayout.addView(this.e);
        this.b = new TextView(this.f13452a);
        this.b.setText(com.alibaba.ability.localization.b.a(R.string.gg_pub_downloading_file));
        this.b.setTextColor(-1);
        this.b.setTextSize(1, 15.0f);
        this.b.setLineSpacing(f.a(5.0f), 1.0f);
        this.b.setTypeface(Typeface.DEFAULT_BOLD);
        this.b.setPadding(0, f.a(16.0f), 0, 0);
        this.b.setGravity(17);
        linearLayout.addView(this.b);
        this.c = new TextView(this.f13452a);
        this.c.setText(com.alibaba.ability.localization.b.a(R.string.gg_pub_video_preparing_do_not_exit_taobao));
        this.c.setTextColor(-1);
        this.c.setTextSize(1, 14.0f);
        this.c.setLineSpacing(f.a(5.0f), 1.0f);
        this.c.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.c.setPadding(0, f.a(16.0f), 0, 0);
        this.c.setGravity(17);
        TextView textView = this.b;
        if (!this.h) {
            i = 8;
        }
        textView.setVisibility(i);
        linearLayout.addView(this.c);
        setContentView(linearLayout, a());
    }

    public LinearLayout.LayoutParams a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout.LayoutParams) ipChange.ipc$dispatch("7262c023", new Object[]{this}) : new LinearLayout.LayoutParams(f.a(250.0f), -2);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        ImageView imageView = this.f;
        if (!z) {
            i = 4;
        }
        imageView.setVisibility(i);
        this.f.setEnabled(z);
        setCancelable(z);
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (c()) {
        } else {
            super.show();
            a aVar = this.d;
            if (aVar == null) {
                return;
            }
            aVar.a();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else if (c()) {
        } else {
            super.dismiss();
            a aVar = this.d;
            if (aVar == null) {
                return;
            }
            aVar.b();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else if (c()) {
        } else {
            super.cancel();
            a aVar = this.d;
            if (aVar == null) {
                return;
            }
            aVar.c();
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        Context context = this.f13452a;
        if (context == null) {
            return true;
        }
        return (context instanceof Activity) && (((Activity) context).isFinishing() || ((Activity) this.f13452a).isDestroyed());
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

    public c a(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("55382a7b", new Object[]{this, str});
        }
        TextView textView = this.c;
        if (TextUtils.isEmpty(str)) {
            i = 8;
        }
        textView.setVisibility(i);
        this.c.setText(str);
        return this;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public c b(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("b793415a", new Object[]{this, str});
        }
        TextView textView = this.b;
        if (TextUtils.isEmpty(str)) {
            i = 8;
        }
        textView.setVisibility(i);
        this.b.setText(str);
        return this;
    }

    public c a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("445c9832", new Object[]{this, new Integer(i)});
        }
        ObjectAnimator objectAnimator = this.g;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.e.setRotation(0.0f);
        }
        this.e.setInnerBgColor(Color.parseColor("#26FFFFFF"));
        this.e.setIsNeedTextShow(true);
        this.e.setProgress(i);
        return this;
    }
}
