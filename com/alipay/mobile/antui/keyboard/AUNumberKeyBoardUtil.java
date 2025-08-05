package com.alipay.mobile.antui.keyboard;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ScrollView;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.mobile.antui.keyboard.AUNumberKeyboardView;
import com.alipay.mobile.antui.service.AntuiServiceAdapter;
import com.alipay.mobile.antui.service.IAntuiLogger;
import com.alipay.mobile.antui.utils.SdkUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class AUNumberKeyBoardUtil implements View.OnKeyListener, AUNumberKeyboardView.OnActionClickListener, WindowStateChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5337a = "AUNumberKeyBoardUtil";
    private Context c;
    private AUNumberKeyboardView d;
    private EditText e;
    private ScrollView f;
    private boolean h;
    private AUNumberKeyboardView.OnConfirmClickListener i;
    private Handler b = new Handler(Looper.getMainLooper());
    private boolean g = false;

    public static /* synthetic */ EditText a(AUNumberKeyBoardUtil aUNumberKeyBoardUtil) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditText) ipChange.ipc$dispatch("4f7604e4", new Object[]{aUNumberKeyBoardUtil}) : aUNumberKeyBoardUtil.e;
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f5337a;
    }

    public static /* synthetic */ boolean b(AUNumberKeyBoardUtil aUNumberKeyBoardUtil) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ccba9718", new Object[]{aUNumberKeyBoardUtil})).booleanValue() : aUNumberKeyBoardUtil.g;
    }

    public static /* synthetic */ AUNumberKeyboardView c(AUNumberKeyBoardUtil aUNumberKeyBoardUtil) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AUNumberKeyboardView) ipChange.ipc$dispatch("34bea49d", new Object[]{aUNumberKeyBoardUtil}) : aUNumberKeyBoardUtil.d;
    }

    public static /* synthetic */ Handler d(AUNumberKeyBoardUtil aUNumberKeyBoardUtil) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("16423bb4", new Object[]{aUNumberKeyBoardUtil}) : aUNumberKeyBoardUtil.b;
    }

    public static /* synthetic */ ScrollView e(AUNumberKeyBoardUtil aUNumberKeyBoardUtil) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScrollView) ipChange.ipc$dispatch("bf6bca05", new Object[]{aUNumberKeyBoardUtil}) : aUNumberKeyBoardUtil.f;
    }

    public AUNumberKeyBoardUtil(Context context, EditText editText, AUNumberKeyboardView aUNumberKeyboardView, int i) {
        this.h = true;
        this.c = context;
        this.e = editText;
        this.d = aUNumberKeyboardView;
        b();
        c();
        Context context2 = this.c;
        if (context2 instanceof Activity) {
            ((Activity) context2).getWindow().setSoftInputMode(i | 3);
        }
        this.e.setOnTouchListener(new View.OnTouchListener() { // from class: com.alipay.mobile.antui.keyboard.AUNumberKeyBoardUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                if (AUNumberKeyBoardUtil.a(AUNumberKeyBoardUtil.this).isFocused()) {
                    AUNumberKeyBoardUtil.this.showKeyboard();
                }
                return false;
            }
        });
        this.e.setOnKeyListener(this);
        if ("true".equals(AntuiServiceAdapter.getAntuiSwitch().getConfig("NUMKEYBOARD_TALKBACK_INPUTFIX_DISABLE"))) {
            this.h = false;
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.d.setActionClickListener(this);
        this.d.setWindowStateChangeListener(this);
        if (!rollbackSkipTransition()) {
            return;
        }
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(100L);
        ((ViewGroup) this.d.getParent()).setLayoutTransition(layoutTransition);
    }

    public void setScrollView(ScrollView scrollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f3aca9", new Object[]{this, scrollView});
        } else {
            this.f = scrollView;
        }
    }

    private void c() {
        try {
            Method method = EditText.class.getMethod("setShowSoftInputOnFocus", Boolean.TYPE);
            method.setAccessible(true);
            method.invoke(this.e, false);
        } catch (Exception e) {
            IAntuiLogger antuiLogger = AntuiServiceAdapter.getAntuiLogger();
            String str = f5337a;
            antuiLogger.error(str, "disableShowSoftInput Exception" + e);
        }
    }

    @Override // com.alipay.mobile.antui.keyboard.AUNumberKeyboardView.OnActionClickListener
    public void onNumClick(View view, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2f91ce", new Object[]{this, view, charSequence});
            return;
        }
        Editable text = this.e.getText();
        int selectionStart = this.e.getSelectionStart();
        if (selectionStart != -1) {
            text.insert(selectionStart, charSequence);
        } else if (!this.h || !isTouchExplorationEnabled(this.c)) {
        } else {
            text.insert(text.length(), charSequence);
        }
    }

    @Override // com.alipay.mobile.antui.keyboard.AUNumberKeyboardView.OnActionClickListener
    public void onDeleteClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd84fed", new Object[]{this, view});
            return;
        }
        Editable text = this.e.getText();
        int selectionStart = this.e.getSelectionStart();
        if (selectionStart > 0) {
            text.delete(selectionStart - 1, selectionStart);
            return;
        }
        int length = text.length();
        if (length <= 0 || !this.h || !isTouchExplorationEnabled(this.c)) {
            return;
        }
        text.delete(length - 1, length);
    }

    @Override // com.alipay.mobile.antui.keyboard.AUNumberKeyboardView.OnActionClickListener
    public void onConfirmClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("348892e4", new Object[]{this, view});
            return;
        }
        AUNumberKeyboardView.OnConfirmClickListener onConfirmClickListener = this.i;
        if (onConfirmClickListener == null) {
            return;
        }
        onConfirmClickListener.onConfirmClick(view);
    }

    @Override // com.alipay.mobile.antui.keyboard.AUNumberKeyboardView.OnActionClickListener
    public void onCloseClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d41fa5c", new Object[]{this, view});
        } else {
            hideKeyboard();
        }
    }

    public boolean hideSysKeyboard() {
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccf562bd", new Object[]{this})).booleanValue();
        }
        InputMethodManager inputMethodManager = (InputMethodManager) this.e.getContext().getSystemService("input_method");
        if (!inputMethodManager.isActive() || (editText = this.e) == null || editText.getWindowToken() == null) {
            return false;
        }
        boolean hideSoftInputFromWindow = inputMethodManager.hideSoftInputFromWindow(this.e.getWindowToken(), 2, new ResultReceiver(null) { // from class: com.alipay.mobile.antui.keyboard.AUNumberKeyBoardUtil.2
            @Override // android.os.ResultReceiver
            protected void onReceiveResult(final int i, Bundle bundle) {
                AntuiServiceAdapter.getAntuiLogger().debug(AUNumberKeyBoardUtil.a(), "onReceiveResult");
                AUNumberKeyBoardUtil.d(AUNumberKeyBoardUtil.this).postDelayed(new Runnable() { // from class: com.alipay.mobile.antui.keyboard.AUNumberKeyBoardUtil.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        IAntuiLogger antuiLogger = AntuiServiceAdapter.getAntuiLogger();
                        String a2 = AUNumberKeyBoardUtil.a();
                        antuiLogger.debug(a2, "onReceiveResult show,resultCode=" + i + ",hideKeyboardAction=" + AUNumberKeyBoardUtil.b(AUNumberKeyBoardUtil.this));
                        if (AUNumberKeyBoardUtil.b(AUNumberKeyBoardUtil.this)) {
                            return;
                        }
                        AUNumberKeyBoardUtil.c(AUNumberKeyBoardUtil.this).show();
                    }
                }, 200L);
            }
        });
        IAntuiLogger antuiLogger = AntuiServiceAdapter.getAntuiLogger();
        String str = f5337a;
        antuiLogger.debug(str, "hideSoftInputFromWindow hide = " + hideSoftInputFromWindow);
        return hideSoftInputFromWindow;
    }

    public void showKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e9488b", new Object[]{this});
            return;
        }
        this.g = false;
        AntuiServiceAdapter.getAntuiLogger().debug(f5337a, "will showKeyboard");
        AUNumberKeyboardView aUNumberKeyboardView = this.d;
        if (aUNumberKeyboardView == null || aUNumberKeyboardView.isShow()) {
            return;
        }
        AntuiServiceAdapter.getAntuiLogger().debug(f5337a, "showKeyboard");
        if (hideSysKeyboard()) {
            return;
        }
        this.d.show();
    }

    public void hideKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c20b50", new Object[]{this});
            return;
        }
        IAntuiLogger antuiLogger = AntuiServiceAdapter.getAntuiLogger();
        String str = f5337a;
        StringBuilder sb = new StringBuilder();
        sb.append("will hideKeyboard,mKeyboardView=");
        sb.append(this.d);
        sb.append(",isShow()=");
        AUNumberKeyboardView aUNumberKeyboardView = this.d;
        sb.append(aUNumberKeyboardView != null ? Boolean.valueOf(aUNumberKeyboardView.isShow()) : "null");
        antuiLogger.debug(str, sb.toString());
        this.g = true;
        AUNumberKeyboardView aUNumberKeyboardView2 = this.d;
        if (aUNumberKeyboardView2 == null || !aUNumberKeyboardView2.isShow()) {
            return;
        }
        AntuiServiceAdapter.getAntuiLogger().debug(f5337a, MspEventTypes.ACTION_STRING_HIDE_KEYBOARD);
        this.d.hide();
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdbaa648", new Object[]{this, view, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4 || !this.d.isShow()) {
            return false;
        }
        hideKeyboard();
        return true;
    }

    @Override // com.alipay.mobile.antui.keyboard.WindowStateChangeListener
    public void stateChange(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a8f057", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        if (z && this.g) {
            hideKeyboard();
        }
        if (this.f == null) {
            return;
        }
        IAntuiLogger antuiLogger = AntuiServiceAdapter.getAntuiLogger();
        String str = f5337a;
        antuiLogger.debug(str, "isShow = " + z);
        if (!z) {
            return;
        }
        int[] iArr = new int[2];
        this.e.getLocationOnScreen(iArr);
        int height = this.e.getHeight() + iArr[1];
        int i2 = SdkUtils.getScreenWidth_Height(this.c)[1];
        if (height <= i2 - i) {
            return;
        }
        IAntuiLogger antuiLogger2 = AntuiServiceAdapter.getAntuiLogger();
        String str2 = f5337a;
        antuiLogger2.debug(str2, "currentLocY = " + height + ", height=" + i);
        final int i3 = (height + i) - i2;
        this.b.postDelayed(new Runnable() { // from class: com.alipay.mobile.antui.keyboard.AUNumberKeyBoardUtil.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                IAntuiLogger antuiLogger3 = AntuiServiceAdapter.getAntuiLogger();
                String a2 = AUNumberKeyBoardUtil.a();
                antuiLogger3.debug(a2, "mScrollView to  = " + i3);
                AUNumberKeyBoardUtil.e(AUNumberKeyBoardUtil.this).smoothScrollTo(0, i3);
            }
        }, 200L);
    }

    public static boolean rollbackSkipTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("242630c3", new Object[0])).booleanValue();
        }
        try {
            return "true".equals(AntuiServiceAdapter.getAntuiSwitch().getConfig("AUNumberKeyBoardUtil_rollback_skip_transition"));
        } catch (Exception e) {
            IAntuiLogger antuiLogger = AntuiServiceAdapter.getAntuiLogger();
            String str = f5337a;
            antuiLogger.error(str, "ConfigService 配置错误: " + e);
            return false;
        }
    }

    public static boolean isTouchExplorationEnabled(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("714a4152", new Object[]{context})).booleanValue();
        }
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (accessibilityManager != null) {
                return accessibilityManager.isTouchExplorationEnabled();
            }
        } catch (Throwable th) {
            IAntuiLogger antuiLogger = AntuiServiceAdapter.getAntuiLogger();
            String str = f5337a;
            antuiLogger.error(str, "isTouchExplorationEnabled出错：" + th);
        }
        return false;
    }

    public void setConfirmClickListener(AUNumberKeyboardView.OnConfirmClickListener onConfirmClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36a4ffc", new Object[]{this, onConfirmClickListener});
        } else {
            this.i = onConfirmClickListener;
        }
    }
}
