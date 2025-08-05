package com.taobao.update.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.update.framework.UpdateRuntime;
import tb.kge;

/* loaded from: classes9.dex */
public class c extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f23391a;
    private final Context b;
    private View c;
    private View d;
    private String e;
    private TextView f;
    private String g;
    private TextView h;
    private ImageView i;
    private android.widget.Button j;
    private android.widget.Button k;
    private ImageView l;
    private String m;
    private String n;
    private View.OnClickListener o;
    private View.OnClickListener p;
    private boolean q;
    private int r;

    static {
        kge.a(-279521151);
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
            case 1683598447:
                super.setContentView((View) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ View a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d399612a", new Object[]{cVar}) : cVar.c;
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c1c5cf0", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.q = z;
        return z;
    }

    public static /* synthetic */ boolean b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("69126eed", new Object[]{cVar})).booleanValue() : cVar.q;
    }

    public static /* synthetic */ View.OnClickListener c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("8d41a3d3", new Object[]{cVar}) : cVar.p;
    }

    public static /* synthetic */ android.widget.Button d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (android.widget.Button) ipChange.ipc$dispatch("e323421f", new Object[]{cVar}) : cVar.k;
    }

    public static /* synthetic */ String e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("53550734", new Object[]{cVar}) : cVar.n;
    }

    public static /* synthetic */ View.OnClickListener f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("20861716", new Object[]{cVar}) : cVar.o;
    }

    public static /* synthetic */ boolean g(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("de491af2", new Object[]{cVar})).booleanValue() : cVar.a();
    }

    public static /* synthetic */ void h(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c20d6ef", new Object[]{cVar});
        } else {
            super.dismiss();
        }
    }

    public c(Context context, String str, String str2, boolean z) {
        super(context, 16973839);
        this.f23391a = true;
        this.q = true;
        this.r = R.drawable.update_notify;
        this.b = context;
        this.e = str2;
        this.g = str;
        this.f23391a = z;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        requestWindowFeature(1);
        super.onCreate(bundle);
        super.setContentView(LayoutInflater.from(UpdateRuntime.getContext()).inflate(R.layout.update_dialog_v2, (ViewGroup) null));
        this.c = findViewById(R.id.update_contentDialog_v2);
        this.d = findViewById(R.id.update_dialog_rootView_v2);
        this.d.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.update.dialog.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                if ((motionEvent.getX() < c.a(c.this).getLeft() || motionEvent.getX() > c.a(c.this).getRight() || motionEvent.getY() > c.a(c.this).getBottom() || motionEvent.getY() < c.a(c.this).getTop()) && c.b(c.this) && c.this.f23391a) {
                    if (c.c(c.this) != null) {
                        c.c(c.this).onClick(c.d(c.this));
                    }
                    c.this.dismiss();
                }
                return false;
            }
        });
        this.i = (ImageView) findViewById(R.id.update_header_img_v2);
        this.i.setImageResource(this.r);
        this.h = (TextView) findViewById(R.id.update_title_v2);
        setTitle(this.g);
        this.f = (TextView) findViewById(R.id.update_message_v2);
        setMessage(this.e);
        if (this.m != null) {
            this.k = (android.widget.Button) findViewById(R.id.update_button_cancel_v2);
            this.k.setVisibility(0);
            this.k.setText(this.m);
            this.k.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.update.dialog.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!c.b(c.this)) {
                    } else {
                        c.this.dismiss();
                        if (c.c(c.this) == null) {
                            return;
                        }
                        c.c(c.this).onClick(view);
                    }
                }
            });
        }
        this.l = (ImageView) findViewById(R.id.update_imageview_cancel_v2);
        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.update.dialog.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (!c.b(c.this)) {
                } else {
                    c.this.dismiss();
                    if (c.c(c.this) == null) {
                        return;
                    }
                    c.c(c.this).onClick(view);
                }
            }
        });
        if (this.n == null) {
            return;
        }
        this.j = (android.widget.Button) findViewById(R.id.update_button_accept_v2);
        this.j.setVisibility(0);
        this.j.setText(this.n);
        if (this.k != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.j.getLayoutParams();
            layoutParams.setMargins(5, 0, 0, 0);
            this.j.setLayoutParams(layoutParams);
        }
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.update.dialog.c.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (!c.b(c.this)) {
                } else {
                    if (!c.e(c.this).equals("立即安装")) {
                        c.this.dismiss();
                    }
                    if (c.f(c.this) == null) {
                        return;
                    }
                    c.f(c.this).onClick(view);
                }
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        try {
            Log.e("UIConfirmImpl", "dialog show");
            super.show();
            this.c.startAnimation(AnimationUtils.loadAnimation(this.b.getApplicationContext(), R.anim.dialog_main_show_amination));
            this.d.startAnimation(AnimationUtils.loadAnimation(this.b.getApplicationContext(), R.anim.dialog_root_show_amin));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        try {
            this.q = false;
            Animation loadAnimation = AnimationUtils.loadAnimation(this.b.getApplicationContext(), R.anim.dialog_main_hide_amination);
            loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.update.dialog.c.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    } else {
                        c.a(c.this).post(new Runnable() { // from class: com.taobao.update.dialog.c.5.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                if (c.this.isShowing() && !c.g(c.this)) {
                                    c.h(c.this);
                                }
                                c.a(c.this, true);
                            }
                        });
                    }
                }
            });
            Animation loadAnimation2 = AnimationUtils.loadAnimation(this.b.getApplicationContext(), R.anim.dialog_root_hide_amin);
            this.c.startAnimation(loadAnimation);
            this.d.startAnimation(loadAnimation2);
        } catch (Throwable th) {
            this.q = true;
            th.printStackTrace();
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return ((Activity) this.b).isFinishing();
        }
        return ((Activity) this.b).isDestroyed() || ((Activity) this.b).isFinishing();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        View.OnClickListener onClickListener = this.p;
        if (onClickListener == null) {
            return;
        }
        onClickListener.onClick(null);
    }

    public void addCancelButton(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ca2f1b", new Object[]{this, str, onClickListener});
            return;
        }
        this.m = str;
        this.p = onClickListener;
    }

    public void addAcceptButton(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d540ecd", new Object[]{this, str, onClickListener});
            return;
        }
        this.n = str;
        this.o = onClickListener;
    }

    public void setMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a65216", new Object[]{this, str});
            return;
        }
        this.e = str;
        this.f.setText(str);
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            return;
        }
        this.g = str;
        if (str == null) {
            this.h.setVisibility(8);
            return;
        }
        this.h.setVisibility(0);
        this.h.setText(str);
    }

    public void setHeaderImg(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e50de828", new Object[]{this, new Integer(i)});
            return;
        }
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
        this.r = i;
    }
}
