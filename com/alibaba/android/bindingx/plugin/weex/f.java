package com.alibaba.android.bindingx.plugin.weex;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.view.gesture.WXGesture;
import com.taobao.weex.ui.view.gesture.WXGestureObservable;
import tb.riy;

/* loaded from: classes2.dex */
public class f extends com.alibaba.android.bindingx.core.internal.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WXGesture n;

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -650670720) {
            if (hashCode != 1708636289) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.b((String) objArr[0], (String) objArr[1]));
        }
        return new Boolean(super.a((String) objArr[0], (String) objArr[1]));
    }

    public f(Context context, com.alibaba.android.bindingx.core.i iVar, Object... objArr) {
        super(context, iVar, objArr);
        this.n = null;
    }

    @Override // com.alibaba.android.bindingx.core.internal.e, com.alibaba.android.bindingx.core.e
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        WXComponent b = i.b(TextUtils.isEmpty(this.f) ? this.e : this.f, str);
        if (b == null) {
            return super.a(str, str2);
        }
        View mo1286getHostView = b.mo1286getHostView();
        if (!(mo1286getHostView instanceof ViewGroup) || !(mo1286getHostView instanceof WXGestureObservable)) {
            return super.a(str, str2);
        }
        try {
            this.n = ((WXGestureObservable) mo1286getHostView).getGestureListener();
            if (this.n != null) {
                this.n.addOnTouchListener(this);
                com.alibaba.android.bindingx.core.h.b("[BindingXRotationHandlerCompat] onCreate success. {source:" + str + ",type:" + str2 + riy.BLOCK_END_STR);
                return true;
            }
            return super.a(str, str2);
        } catch (Throwable th) {
            com.alibaba.android.bindingx.core.h.d("experimental gesture features open failed." + th.getMessage());
            return super.a(str, str2);
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.e, com.alibaba.android.bindingx.core.e
    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        boolean b = super.b(str, str2);
        WXGesture wXGesture = this.n;
        if (wXGesture == null) {
            return b;
        }
        try {
            return b | wXGesture.removeTouchListener(this);
        } catch (Throwable th) {
            com.alibaba.android.bindingx.core.h.d("[BindingXRotationHandlerCompat]  disabled failed." + th.getMessage());
            return b;
        }
    }
}
