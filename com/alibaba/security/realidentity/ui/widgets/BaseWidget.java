package com.alibaba.security.realidentity.ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.alibaba.security.realidentity.d5;
import com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class BaseWidget extends RelativeLayout implements d5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ALBiometricsActivityParentView.d f3574a;

    public BaseWidget(Context context) {
        super(context);
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public static /* synthetic */ Object ipc$super(BaseWidget baseWidget, String str, Object... objArr) {
        if (str.hashCode() == -436676516) {
            super.onFinishInflate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract void a();

    @Override // com.alibaba.security.realidentity.d5
    public void a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
            return;
        }
        a();
        setVisibility(0);
    }

    public abstract void b();

    @Override // com.alibaba.security.realidentity.d5
    public void b(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffb3fe96", new Object[]{this, strArr});
            return;
        }
        b();
        setVisibility(8);
    }

    @Override // com.alibaba.security.realidentity.d5
    public boolean c(String... strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fbb58d79", new Object[]{this, strArr})).booleanValue() : getVisibility() == 0;
    }

    public abstract void d();

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f8d85c", new Object[]{this});
            return;
        }
        super.onFinishInflate();
        d();
        a();
    }

    public void setOnBioMainHandlerListener(ALBiometricsActivityParentView.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d333f5dc", new Object[]{this, dVar});
        } else {
            this.f3574a = dVar;
        }
    }

    public BaseWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public BaseWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }
}
