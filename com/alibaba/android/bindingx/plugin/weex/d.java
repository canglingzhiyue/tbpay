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
import com.taobao.weex.utils.WXUtils;
import java.util.Map;
import tb.riy;

/* loaded from: classes2.dex */
public class d extends com.alibaba.android.bindingx.core.internal.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean n;
    private WXGesture o;

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -650670720) {
            if (hashCode == 1514279453) {
                super.a((Map) objArr[0]);
                return null;
            } else if (hashCode != 1708636289) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return new Boolean(super.b((String) objArr[0], (String) objArr[1]));
            }
        }
        return new Boolean(super.a((String) objArr[0], (String) objArr[1]));
    }

    public d(Context context, com.alibaba.android.bindingx.core.i iVar, Object... objArr) {
        super(context, iVar, objArr);
        this.n = false;
        this.o = null;
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler, com.alibaba.android.bindingx.core.e
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        super.a(map);
        if (map == null) {
            return;
        }
        this.n = WXUtils.getBoolean(map.get("experimentalGestureFeatures"), false).booleanValue();
    }

    @Override // com.alibaba.android.bindingx.core.internal.h, com.alibaba.android.bindingx.core.e
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (!this.n) {
            return super.a(str, str2);
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
            this.o = ((WXGestureObservable) mo1286getHostView).getGestureListener();
            if (this.o != null) {
                this.o.addOnTouchListener(this);
                com.alibaba.android.bindingx.core.h.b("[BindingXPanHandlerCompat] onCreate success. {source:" + str + ",type:" + str2 + riy.BLOCK_END_STR);
                return true;
            }
            return super.a(str, str2);
        } catch (Throwable th) {
            com.alibaba.android.bindingx.core.h.d("experimental gesture features open failed." + th.getMessage());
            return super.a(str, str2);
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.h, com.alibaba.android.bindingx.core.e
    public boolean b(String str, String str2) {
        WXGesture wXGesture;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        boolean b = super.b(str, str2);
        if (!this.n || (wXGesture = this.o) == null) {
            return b;
        }
        try {
            return b | wXGesture.removeTouchListener(this);
        } catch (Throwable th) {
            com.alibaba.android.bindingx.core.h.d("[BindingXPanHandlerCompat]  disabled failed." + th.getMessage());
            return b;
        }
    }
}
