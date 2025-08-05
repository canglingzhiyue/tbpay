package com.alipay.android.app.safepaybase.alikeyboard;

import android.graphics.Point;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class AbstractKeyboard {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f4384a;
    public OnKeyboardListener b;

    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        try {
            if (Build.VERSION.SDK_INT >= 29 && this.f4384a != null) {
                this.f4384a.setForceDarkAllowed(false);
            }
        } catch (Throwable unused) {
        }
        return this.f4384a;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        OnKeyboardListener onKeyboardListener = this.b;
        if (onKeyboardListener == null) {
            return;
        }
        onKeyboardListener.onDel();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        OnKeyboardListener onKeyboardListener = this.b;
        if (onKeyboardListener == null) {
            return;
        }
        onKeyboardListener.onOK();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        OnKeyboardListener onKeyboardListener = this.b;
        if (onKeyboardListener == null) {
            return;
        }
        onKeyboardListener.onInput(str);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        OnKeyboardListener onKeyboardListener = this.b;
        if (onKeyboardListener == null) {
            return;
        }
        onKeyboardListener.onClose();
    }

    public Point a(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("b6ca574e", new Object[]{this, viewGroup, view});
        }
        if (viewGroup == null || view == null) {
            return new Point();
        }
        if (view.getParent() == viewGroup) {
            return new Point(view.getLeft(), view.getTop());
        }
        Point a2 = a(viewGroup, (View) view.getParent());
        return new Point(a2.x + view.getLeft(), a2.y + view.getTop());
    }
}
