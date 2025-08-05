package com.taobao.weex;

import android.content.Context;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.o;
import com.taobao.weex.render.WXAbstractRenderContainer;
import tb.kge;

/* loaded from: classes9.dex */
public class RenderContainer extends WXAbstractRenderContainer implements o.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private o mFrameRateControl;

    static {
        kge.a(1149779984);
        kge.a(-1272002899);
    }

    public static /* synthetic */ Object ipc$super(RenderContainer renderContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 327977732) {
            super.dispatchWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    public RenderContainer(Context context) {
        super(context);
        this.mFrameRateControl = new o(this);
    }

    public RenderContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mFrameRateControl = new o(this);
    }

    public RenderContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mFrameRateControl = new o(this);
    }

    public RenderContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mFrameRateControl = new o(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        o oVar = this.mFrameRateControl;
        if (oVar == null) {
            return;
        }
        oVar.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        o oVar = this.mFrameRateControl;
        if (oVar == null) {
            return;
        }
        oVar.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchWindowVisibilityChanged(int i) {
        o oVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("138c8b04", new Object[]{this, new Integer(i)});
            return;
        }
        super.dispatchWindowVisibilityChanged(i);
        if (i == 8) {
            o oVar2 = this.mFrameRateControl;
            if (oVar2 == null) {
                return;
            }
            oVar2.b();
        } else if (i != 0 || (oVar = this.mFrameRateControl) == null) {
        } else {
            oVar.a();
        }
    }

    @Override // com.taobao.weex.o.a
    public void OnVSync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29304cf9", new Object[]{this});
        } else if (this.mSDKInstance == null || this.mSDKInstance.get() == null) {
        } else {
            this.mSDKInstance.get().ay();
        }
    }
}
