package com.taobao.android.detail.core.detail.widget.actionsheet;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.widget.actionsheet.MaskView;
import com.taobao.android.detail.core.utils.c;
import com.taobao.taobao.R;
import tb.emu;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class ActionSheet extends RelativeLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LinearLayout actionSheetView;
    private String[] buttonsText;
    private long durationMillis;
    private MaskView maskView;
    private b onActionClickListener;
    private WindowManager windowManager;

    /* loaded from: classes4.dex */
    public interface b {
        void a(ViewGroup viewGroup, int i);
    }

    static {
        kge.a(-2046884143);
        kge.a(-1201612728);
    }

    public static /* synthetic */ LinearLayout access$000(ActionSheet actionSheet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("37007b0c", new Object[]{actionSheet}) : actionSheet.actionSheetView;
    }

    public static /* synthetic */ WindowManager access$100(ActionSheet actionSheet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WindowManager) ipChange.ipc$dispatch("76ad2a3c", new Object[]{actionSheet}) : actionSheet.windowManager;
    }

    public ActionSheet(Context context) {
        this(context, null);
    }

    public ActionSheet(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionSheet(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.durationMillis = 200L;
        init();
        emu.a("com.taobao.android.detail.core.detail.widget.actionsheet.ActionSheet");
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.maskView = new MaskView(getContext(), this);
        this.maskView.setCanCancel(true);
        this.maskView.setDurationMillis(this.durationMillis);
        this.maskView.setOnMaskListener(new MaskView.a() { // from class: com.taobao.android.detail.core.detail.widget.actionsheet.ActionSheet.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.detail.widget.actionsheet.MaskView.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    ActionSheet.this.dismiss();
                }
            }
        });
        this.actionSheetView = new LinearLayout(getContext());
        this.actionSheetView.setOrientation(1);
        this.actionSheetView.setBackgroundColor(getResources().getColor(R.color.detail_page_background));
        this.actionSheetView.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        addView(this.actionSheetView, layoutParams);
        this.windowManager = (WindowManager) getContext().getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
        setOnKeyListener(new View.OnKeyListener() { // from class: com.taobao.android.detail.core.detail.widget.actionsheet.ActionSheet.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("bdbaa648", new Object[]{this, view, new Integer(i), keyEvent})).booleanValue();
                }
                if (4 != i || keyEvent.getAction() != 0) {
                    return false;
                }
                ActionSheet.this.dismiss();
                return true;
            }
        });
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public void create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518a4783", new Object[]{this});
            return;
        }
        this.actionSheetView.setVisibility(0);
        this.actionSheetView.removeAllViews();
        String[] strArr = this.buttonsText;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        int i = epo.i;
        int i2 = epo.h;
        int i3 = (int) (epo.f27511a * 46.0f);
        for (int i4 = 0; i4 < this.buttonsText.length; i4++) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (i4 != 0) {
                layoutParams.topMargin = i2;
            }
            TextView textView = new TextView(getContext());
            textView.setLayoutParams(layoutParams);
            textView.setBackgroundColor(c.a("#fefefe"));
            textView.setTextColor(getResources().getColor(R.color.detail_tabwidget));
            textView.setGravity(17);
            textView.setMinHeight(i3);
            textView.setPadding(0, i, 0, i);
            textView.setTextSize(1, 14.0f);
            textView.setTag(Integer.valueOf(i4));
            textView.setOnClickListener(this);
            textView.setText(Html.fromHtml(this.buttonsText[i4]));
            this.actionSheetView.addView(textView, layoutParams);
        }
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        if (getParent() == null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.type = 2;
            layoutParams.format = -2;
            layoutParams.gravity = 51;
            layoutParams.width = -1;
            layoutParams.height = -1;
            this.windowManager.addView(this, layoutParams);
        }
        this.maskView.show();
        this.actionSheetView.clearAnimation();
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(this.durationMillis);
        this.actionSheetView.startAnimation(translateAnimation);
    }

    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        this.maskView.dismiss();
        this.actionSheetView.clearAnimation();
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setDuration(this.durationMillis);
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.detail.core.detail.widget.actionsheet.ActionSheet.3
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
                    return;
                }
                ActionSheet.access$000(ActionSheet.this).setVisibility(8);
                if (ActionSheet.this.getParent() == null) {
                    return;
                }
                ActionSheet.access$100(ActionSheet.this).removeView(ActionSheet.this);
            }
        });
        this.actionSheetView.startAnimation(translateAnimation);
    }

    public void setDurationMillis(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("202fd2e0", new Object[]{this, new Integer(i)});
        } else {
            this.durationMillis = i;
        }
    }

    public void setOnActionClickListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c992202c", new Object[]{this, bVar});
        } else {
            this.onActionClickListener = bVar;
        }
    }

    public void setButtonsText(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3191a52c", new Object[]{this, strArr});
        } else {
            this.buttonsText = strArr;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (!(view instanceof TextView)) {
        } else {
            int intValue = ((Integer) ((TextView) view).getTag()).intValue();
            b bVar = this.onActionClickListener;
            if (bVar == null) {
                return;
            }
            bVar.a(this, intValue);
        }
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f9652a;
        private b b;
        private String[] c;
        private int d = 200;
        private ActionSheet e;

        static {
            kge.a(-903971672);
        }

        public a(Context context) {
            this.f9652a = context;
        }

        public a a(String[] strArr, b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2ca7f360", new Object[]{this, strArr, bVar});
            }
            this.c = strArr;
            this.b = bVar;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a3a64dfc", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4d8b4c8f", new Object[]{this});
            }
            this.e = new ActionSheet(this.f9652a);
            String[] strArr = this.c;
            if (strArr != null && strArr.length > 0) {
                this.e.setButtonsText(strArr);
            }
            b bVar = this.b;
            if (bVar != null) {
                this.e.setOnActionClickListener(bVar);
            }
            this.e.setDurationMillis(this.d);
            this.e.create();
            return this;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            if (this.e == null) {
                a();
            }
            this.e.show();
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            ActionSheet actionSheet = this.e;
            if (actionSheet == null) {
                return;
            }
            actionSheet.dismiss();
        }
    }
}
