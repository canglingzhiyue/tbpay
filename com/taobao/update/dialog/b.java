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
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.update.framework.UpdateRuntime;
import tb.kge;

/* loaded from: classes9.dex */
public class b extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f23385a;
    public View b;
    public View c;
    public String d;
    public TextView e;
    public String f;
    public TextView g;
    public ButtonFlat h;
    public ButtonFlat i;
    public String j;
    public String k;
    public View.OnClickListener l;
    public View.OnClickListener m;
    public boolean n;
    private View o;

    static {
        kge.a(-919130116);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
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

    public static /* synthetic */ boolean a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eb3a3e8d", new Object[]{bVar})).booleanValue() : bVar.a();
    }

    public static /* synthetic */ void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6911fa8a", new Object[]{bVar});
        } else {
            super.dismiss();
        }
    }

    public b(Context context) {
        super(context);
        this.n = true;
    }

    public b(Context context, String str, String str2) {
        super(context, 16973839);
        this.n = true;
        this.f23385a = context;
        this.d = str2;
        this.f = str;
    }

    public b(Context context, String str, String str2, boolean z) {
        super(context, 16973839);
        this.n = true;
        this.f23385a = context;
        this.d = str2;
        this.f = str;
        this.n = z;
    }

    public void addCancelButton(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bcc45e", new Object[]{this, str});
            return;
        }
        this.j = str;
        ButtonFlat buttonFlat = this.i;
        if (buttonFlat == null) {
            return;
        }
        buttonFlat.setText(str);
    }

    public void addCancelButton(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ca2f1b", new Object[]{this, str, onClickListener});
            return;
        }
        this.j = str;
        this.m = onClickListener;
    }

    public void addAcceptButton(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26d609ec", new Object[]{this, str});
            return;
        }
        this.k = str;
        ButtonFlat buttonFlat = this.h;
        if (buttonFlat == null) {
            return;
        }
        buttonFlat.setText(str);
    }

    public void addAcceptButton(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d540ecd", new Object[]{this, str, onClickListener});
            return;
        }
        this.k = str;
        this.l = onClickListener;
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
        } else {
            this.o = view;
        }
    }

    public View getContentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ce219891", new Object[]{this}) : this.o;
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
        super.setContentView(LayoutInflater.from(UpdateRuntime.getContext()).inflate(R.layout.update_dialog, (ViewGroup) null));
        this.b = (RelativeLayout) findViewById(R.id.update_contentDialog);
        this.c = (FrameLayout) findViewById(R.id.update_dialog_rootView);
        this.c.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.update.dialog.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                if ((motionEvent.getX() < b.this.b.getLeft() || motionEvent.getX() > b.this.b.getRight() || motionEvent.getY() > b.this.b.getBottom() || motionEvent.getY() < b.this.b.getTop()) && b.this.n) {
                    if (b.this.m != null) {
                        b.this.m.onClick(b.this.i);
                    }
                    b.this.dismiss();
                }
                return false;
            }
        });
        this.g = (TextView) findViewById(R.id.update_title);
        setTitle(this.f);
        if (this.o != null) {
            ((FrameLayout) findViewById(R.id.update_dialog_content)).addView(this.o);
            findViewById(R.id.message_scrollView).setVisibility(8);
        } else {
            this.e = (TextView) findViewById(R.id.update_message);
            setMessage(this.d);
        }
        if (this.j != null) {
            this.i = (ButtonFlat) findViewById(R.id.update_button_cancel);
            this.i.setVisibility(0);
            this.i.setText(this.j);
            this.i.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.update.dialog.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    b.this.dismiss();
                    if (b.this.m == null) {
                        return;
                    }
                    b.this.m.onClick(view);
                }
            });
        }
        if (this.k == null) {
            return;
        }
        this.h = (ButtonFlat) findViewById(R.id.update_button_accept);
        this.h.setVisibility(0);
        this.h.setText(this.k);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.update.dialog.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (!b.this.k.equals("立即安装")) {
                    b.this.dismiss();
                }
                if (b.this.l == null) {
                    return;
                }
                b.this.l.onClick(view);
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
        Log.e("UIConfirmImpl", "dialog show");
        super.show();
        this.b.startAnimation(AnimationUtils.loadAnimation(this.f23385a.getApplicationContext(), R.anim.dialog_main_show_amination));
        this.c.startAnimation(AnimationUtils.loadAnimation(this.f23385a.getApplicationContext(), R.anim.dialog_root_show_amin));
    }

    public String getMessage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this}) : this.d;
    }

    public void setMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a65216", new Object[]{this, str});
            return;
        }
        this.d = str;
        this.e.setText(str);
    }

    public TextView getMessageTextView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("8c9ef9de", new Object[]{this}) : this.e;
    }

    public void setMessageTextView(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eac0d26", new Object[]{this, textView});
        } else {
            this.e = textView;
        }
    }

    public String getTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this}) : this.f;
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            return;
        }
        this.f = str;
        if (str == null) {
            this.g.setVisibility(8);
            return;
        }
        this.g.setVisibility(0);
        this.g.setText(str);
    }

    public TextView getTitleTextView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("5646322f", new Object[]{this}) : this.g;
    }

    public void setTitleTextView(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57bb31f5", new Object[]{this, textView});
        } else {
            this.g = textView;
        }
    }

    public ButtonFlat getButtonAccept() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ButtonFlat) ipChange.ipc$dispatch("7649cce9", new Object[]{this}) : this.h;
    }

    public void setButtonAccept(ButtonFlat buttonFlat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc27275f", new Object[]{this, buttonFlat});
        } else {
            this.h = buttonFlat;
        }
    }

    public ButtonFlat getButtonCancel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ButtonFlat) ipChange.ipc$dispatch("93426c5b", new Object[]{this}) : this.i;
    }

    public void setButtonCancel(ButtonFlat buttonFlat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e42762d", new Object[]{this, buttonFlat});
        } else {
            this.i = buttonFlat;
        }
    }

    public void setOnAcceptButtonClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b94d8ff1", new Object[]{this, onClickListener});
            return;
        }
        this.l = onClickListener;
        ButtonFlat buttonFlat = this.h;
        if (buttonFlat == null) {
            return;
        }
        buttonFlat.setOnClickListener(onClickListener);
    }

    public void setOnCancelButtonClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0dbf6e3", new Object[]{this, onClickListener});
            return;
        }
        this.m = onClickListener;
        ButtonFlat buttonFlat = this.i;
        if (buttonFlat == null) {
            return;
        }
        buttonFlat.setOnClickListener(onClickListener);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f23385a.getApplicationContext(), R.anim.dialog_main_hide_amination);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.update.dialog.b.4
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
                    b.this.b.post(new Runnable() { // from class: com.taobao.update.dialog.b.4.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (!b.this.isShowing() || b.a(b.this)) {
                            } else {
                                b.b(b.this);
                            }
                        }
                    });
                }
            }
        });
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f23385a.getApplicationContext(), R.anim.dialog_root_hide_amin);
        this.b.startAnimation(loadAnimation);
        this.c.startAnimation(loadAnimation2);
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return ((Activity) this.f23385a).isFinishing();
        }
        return ((Activity) this.f23385a).isDestroyed() || ((Activity) this.f23385a).isFinishing();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        View.OnClickListener onClickListener = this.m;
        if (onClickListener == null) {
            return;
        }
        onClickListener.onClick(null);
    }
}
