package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.taobao.windvane.export.adapter.ILocalizationService;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.ohd;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private Context f20536a;
    private View b;
    private PopupWindow c;
    private FrameLayout d;
    private LinearLayout e;
    private Animation f;
    private Animation g;
    private int i;
    private View.OnClickListener j;
    private View.OnClickListener k;
    private boolean h = true;
    private View.OnClickListener l = new View.OnClickListener() { // from class: com.taobao.tao.flexbox.layoutmanager.view.e.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            e.this = this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (e.e(e.this) == null) {
            } else {
                e.e(e.this).onClick(view);
                e.this.b();
            }
        }
    };
    private View.OnClickListener m = new View.OnClickListener() { // from class: com.taobao.tao.flexbox.layoutmanager.view.e.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            e.this = this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (e.f(e.this) != null) {
                e.f(e.this).onClick(view);
            }
            e.this.b();
        }
    };

    static {
        kge.a(-1025186589);
    }

    public static /* synthetic */ PopupWindow a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("1d2b453f", new Object[]{eVar}) : eVar.c;
    }

    public static /* synthetic */ boolean a(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82de6b23", new Object[]{eVar, new Boolean(z)})).booleanValue();
        }
        eVar.h = z;
        return z;
    }

    public static /* synthetic */ boolean b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e55e3878", new Object[]{eVar})).booleanValue() : eVar.h;
    }

    public static /* synthetic */ int c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d707de86", new Object[]{eVar})).intValue() : eVar.i;
    }

    public static /* synthetic */ LinearLayout d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("ae4c5709", new Object[]{eVar}) : eVar.e;
    }

    public static /* synthetic */ View.OnClickListener e(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("3947e9fa", new Object[]{eVar}) : eVar.j;
    }

    public static /* synthetic */ View.OnClickListener f(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("81474859", new Object[]{eVar}) : eVar.k;
    }

    public static /* synthetic */ View.OnClickListener g(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("c946a6b8", new Object[]{eVar}) : eVar.m;
    }

    public e(Context context, View view, String str, String[] strArr, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        this.i = 4;
        this.f20536a = context;
        this.b = view;
        this.j = onClickListener;
        this.k = onClickListener2;
        this.i = strArr.length;
        a(str, strArr, onClickListener, onClickListener2);
        c();
        this.f = new TranslateAnimation(2, 0.0f, 2, 0.0f, 1, 1.0f, 1, 0.0f);
        this.f.setDuration(250L);
        this.g = new TranslateAnimation(2, 0.0f, 2, 0.0f, 1, 0.0f, 1, 1.0f);
        this.g.setDuration(250L);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            this.c.showAtLocation(this.b, 81, 0, 0);
            this.e.startAnimation(this.f);
            this.c.update();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.h = false;
        this.e.startAnimation(this.g);
        this.g.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.tao.flexbox.layoutmanager.view.e.1
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

            {
                e.this = this;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                } else {
                    e.a(e.this).dismiss();
                }
            }
        });
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.c = new PopupWindow(this.f20536a);
        this.c.setContentView(this.d);
        this.c.setWidth(-1);
        this.c.setHeight(-1);
        this.c.setFocusable(true);
        this.c.setOutsideTouchable(true);
        this.c.setBackgroundDrawable(new ColorDrawable(2130706432));
        this.c.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.taobao.tao.flexbox.layoutmanager.view.TNodePopupWindowController$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                } else if (!e.b(e.this)) {
                    e.a(e.this, true);
                } else {
                    View childAt = e.d(e.this).getChildAt(e.c(e.this));
                    if (childAt == null) {
                        return;
                    }
                    childAt.performClick();
                }
            }
        });
    }

    private void a(String str, String[] strArr, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2697c74d", new Object[]{this, str, strArr, onClickListener, onClickListener2});
            return;
        }
        this.d = new FrameLayout(this.f20536a);
        this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        final MaxHeightScrollView maxHeightScrollView = new MaxHeightScrollView(this.f20536a);
        maxHeightScrollView.setMaxHeight(ohd.a() - ohd.i(this.f20536a));
        this.e = new LinearLayout(this.f20536a);
        this.e.setOrientation(1);
        this.e.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.e.setBackgroundColor(-7829368);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            Button button = new Button(this.f20536a);
            button.setText(str);
            button.setBackgroundColor(-1);
            button.setTextColor(Color.parseColor("#999999"));
            button.setLayoutParams(layoutParams);
            this.e.addView(button);
            TextView textView = new TextView(this.f20536a);
            textView.setBackgroundColor(Color.parseColor("#f4f4f4"));
            textView.setHeight(2);
            this.e.addView(textView);
        }
        if (strArr != null) {
            for (String str2 : strArr) {
                Button button2 = new Button(this.f20536a);
                button2.setText(str2);
                button2.setTag(str2);
                button2.setBackgroundColor(-1);
                button2.setTextColor(Color.parseColor("#666666"));
                button2.setLayoutParams(layoutParams);
                button2.setOnClickListener(this.l);
                this.e.addView(button2);
                TextView textView2 = new TextView(this.f20536a);
                textView2.setBackgroundColor(Color.parseColor("#f4f4f4"));
                textView2.setHeight(2);
                this.e.addView(textView2);
            }
        }
        Button button3 = new Button(this.f20536a);
        button3.setText(ILocalizationService.CANCEL);
        button3.setBackgroundColor(-1);
        button3.setTextColor(Color.parseColor("#999999"));
        button3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.e.addView(button3);
        maxHeightScrollView.addView(this.e);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        this.d.addView(maxHeightScrollView, layoutParams2);
        button3.setOnClickListener(this.m);
        this.d.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.tao.flexbox.layoutmanager.view.e.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                e.this = this;
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                int top = maxHeightScrollView.getTop();
                int y = (int) motionEvent.getY();
                if (motionEvent.getAction() == 1 && y < top) {
                    e.g(e.this).onClick(view);
                }
                return true;
            }
        });
    }
}
