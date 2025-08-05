package android.taobao.windvane.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.taobao.windvane.export.adapter.ILocalizationService;
import android.taobao.windvane.util.e;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    public AtomicBoolean f1714a;
    public boolean b;
    private Context c;
    private View d;
    private PopupWindow e;
    private FrameLayout f;
    private LinearLayout g;
    private Animation h;
    private int i;

    static {
        kge.a(-833709262);
    }

    public static /* synthetic */ int a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("246d38ef", new Object[]{aVar})).intValue() : aVar.i;
    }

    public static /* synthetic */ LinearLayout b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("df099054", new Object[]{aVar}) : aVar.g;
    }

    public static /* synthetic */ PopupWindow c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("d958b5f6", new Object[]{aVar}) : aVar.e;
    }

    public a(Context context, View view, String[] strArr, View.OnClickListener onClickListener) {
        this(context, view, null, strArr, onClickListener);
    }

    public a(Context context, View view, String str, String[] strArr, View.OnClickListener onClickListener) {
        this.f1714a = new AtomicBoolean(false);
        this.i = 4;
        this.c = context;
        this.d = view;
        a(str, strArr, onClickListener);
        d();
        this.h = new TranslateAnimation(2, 0.0f, 2, 0.0f, 1, 1.0f, 1, 0.0f);
        this.h.setDuration(250L);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.f1714a.compareAndSet(false, true)) {
        } else {
            try {
                this.e.showAtLocation(this.d, 81, 0, 0);
                this.g.startAnimation(this.h);
                this.e.update();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.f1714a.get()) {
        } else {
            if (!this.e.isShowing()) {
                this.f1714a.compareAndSet(true, false);
            }
            this.e.dismiss();
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.b = z;
        b();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.e = new PopupWindow(this.c);
        this.e.setContentView(this.f);
        this.e.setWidth(-1);
        this.e.setHeight(-1);
        this.e.setFocusable(true);
        this.e.setOutsideTouchable(true);
        this.e.setBackgroundDrawable(new ColorDrawable(2130706432));
        a(this.e);
        this.e.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: android.taobao.windvane.view.PopupWindowController$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                } else if (!a.this.f1714a.compareAndSet(true, false)) {
                } else {
                    if (a.this.b) {
                        a.this.b = false;
                        return;
                    }
                    View childAt = a.b(a.this).getChildAt(a.a(a.this));
                    if (childAt != null) {
                        childAt.performClick();
                    }
                    a.c(a.this).dismiss();
                }
            }
        });
    }

    private void a(String str, String[] strArr, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9f216c", new Object[]{this, str, strArr, onClickListener});
            return;
        }
        this.f = new FrameLayout(this.c);
        this.f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.g = new LinearLayout(this.c);
        this.g.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        this.g.setLayoutParams(layoutParams);
        this.g.setBackgroundColor(-7829368);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            Button button = new Button(this.c);
            button.setText(str);
            button.setBackgroundColor(-657931);
            button.setTextColor(-7829368);
            button.setLayoutParams(layoutParams2);
            this.g.addView(button);
            TextView textView = new TextView(this.c);
            textView.setHeight(4);
            this.g.addView(textView);
        }
        if (strArr != null) {
            for (String str2 : strArr) {
                Button button2 = new Button(this.c);
                button2.setText(str2);
                button2.setTag(str2);
                button2.setBackgroundColor(-657931);
                button2.setTextColor(-16777216);
                button2.setLayoutParams(layoutParams2);
                button2.setOnClickListener(onClickListener);
                this.g.addView(button2);
                TextView textView2 = new TextView(this.c);
                textView2.setHeight(2);
                this.g.addView(textView2);
            }
        }
        final Button button3 = new Button(this.c);
        button3.setText(e.c() ? ILocalizationService.CANCEL : "Cancel");
        button3.setBackgroundColor(-657931);
        button3.setTextColor(-7829368);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = 4;
        button3.setLayoutParams(layoutParams3);
        this.g.addView(button3);
        this.f.addView(this.g);
        button3.setOnClickListener(onClickListener);
        this.f.setOnTouchListener(new View.OnTouchListener() { // from class: android.taobao.windvane.view.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                int top = a.b(a.this).getTop();
                int y = (int) motionEvent.getY();
                if (motionEvent.getAction() == 1 && y < top) {
                    button3.performClick();
                }
                return true;
            }
        });
    }

    private void a(final PopupWindow popupWindow) {
        if (Build.VERSION.SDK_INT < 14) {
            try {
                final Field declaredField = PopupWindow.class.getDeclaredField("mAnchor");
                declaredField.setAccessible(true);
                Field declaredField2 = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                declaredField2.setAccessible(true);
                final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) declaredField2.get(popupWindow);
                declaredField2.set(popupWindow, new ViewTreeObserver.OnScrollChangedListener() { // from class: android.taobao.windvane.view.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        a.this = this;
                    }

                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public void onScrollChanged() {
                        try {
                            WeakReference weakReference = (WeakReference) declaredField.get(popupWindow);
                            if (weakReference != null && weakReference.get() != null) {
                                onScrollChangedListener.onScrollChanged();
                            }
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        PopupWindow popupWindow = this.e;
        if (popupWindow == null) {
            return;
        }
        popupWindow.dismiss();
        this.e = null;
    }
}
