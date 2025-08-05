package com.alipay.mobile.verifyidentity.module.dynamic.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alipay.android.app.safepaybase.alikeyboard.AliKeyboardType;
import com.alipay.android.app.safepaybase.alikeyboard.AlipayKeyboard;
import com.alipay.android.app.safepaybase.alikeyboard.KeyboardManager;
import com.alipay.android.app.template.KeyboardType;
import com.alipay.android.app.template.TemplateKeyboardService;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class FlybirdTemplateKeyboardService implements TemplateKeyboardService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f5891a;

    public FlybirdTemplateKeyboardService(View view) {
        this.f5891a = view;
    }

    @Override // com.alipay.android.app.template.TemplateKeyboardService
    public boolean hideKeyboard(View view) {
        AlipayKeyboard keyboard;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc85cb86", new Object[]{this, view})).booleanValue();
        }
        if (view == null || (keyboard = KeyboardManager.getKeyboard(view.hashCode())) == null) {
            return false;
        }
        boolean isShowKeyboard = keyboard.isShowKeyboard();
        keyboard.hideKeyboard();
        return isShowKeyboard;
    }

    @Override // com.alipay.android.app.template.TemplateKeyboardService
    public void destroyKeyboard(View view) {
        AlipayKeyboard keyboard;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb8b1ca", new Object[]{this, view});
        } else if (view == null || (keyboard = KeyboardManager.getKeyboard(view.hashCode())) == null) {
        } else {
            keyboard.hideKeyboard();
            KeyboardManager.unBindKeyboard(view.hashCode());
        }
    }

    @Override // com.alipay.android.app.template.TemplateKeyboardService
    public boolean showKeyboard(EditText editText, KeyboardType keyboardType, View view, View view2, boolean z, int i) {
        AlipayKeyboard alipayKeyboard;
        AliKeyboardType aliKeyboardType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9bce61c5", new Object[]{this, editText, keyboardType, view, view2, new Boolean(z), new Integer(i)})).booleanValue();
        }
        editText.getContext();
        if (view2 == null) {
            view2 = this.f5891a;
        }
        FrameLayout frameLayout = null;
        if (view2 != null) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof AlipayKeyboard) {
                    alipayKeyboard = (AlipayKeyboard) childAt;
                    break;
                }
            }
        }
        alipayKeyboard = null;
        if (alipayKeyboard == null) {
            AlipayKeyboard alipayKeyboard2 = new AlipayKeyboard(view.getContext());
            if (view instanceof FrameLayout) {
                frameLayout = (FrameLayout) view;
            }
            alipayKeyboard2.initializeKeyboard(frameLayout);
            if (view2 instanceof LinearLayout) {
                view2.setVisibility(0);
                alipayKeyboard2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                ((LinearLayout) view2).addView(alipayKeyboard2);
            } else if (view2 instanceof FrameLayout) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                alipayKeyboard2.setLayoutParams(layoutParams);
                ((FrameLayout) view2).addView(alipayKeyboard2);
            }
            alipayKeyboard = alipayKeyboard2;
        }
        KeyboardManager.bindKeyboard(view.hashCode(), alipayKeyboard);
        if (keyboardType == KeyboardType.money) {
            aliKeyboardType = AliKeyboardType.money;
        } else if (keyboardType == KeyboardType.num) {
            aliKeyboardType = AliKeyboardType.num;
        } else {
            if (keyboardType != KeyboardType.text) {
                if (keyboardType == KeyboardType.idcard) {
                    aliKeyboardType = AliKeyboardType.idcard;
                } else if (keyboardType == KeyboardType.phone) {
                    aliKeyboardType = AliKeyboardType.phone;
                }
            }
            aliKeyboardType = AliKeyboardType.abc;
        }
        alipayKeyboard.showKeyboard(aliKeyboardType, editText, i);
        return true;
    }
}
