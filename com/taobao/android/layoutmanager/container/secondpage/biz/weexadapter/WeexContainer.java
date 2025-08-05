package com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.WeexFrameLayout;
import tb.kge;
import tb.ogg;

/* loaded from: classes5.dex */
public class WeexContainer extends FrameLayout implements com.taobao.tao.flexbox.layoutmanager.view.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WeexContainer";
    private String mWeexConsumeState;

    static {
        kge.a(-54765532);
        kge.a(625737775);
    }

    public static /* synthetic */ Object ipc$super(WeexContainer weexContainer, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public WeexContainer(Context context) {
        super(context);
        this.mWeexConsumeState = WeexFrameLayout.WEEX_STATE_NOT_EXIST;
    }

    public WeexContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mWeexConsumeState = WeexFrameLayout.WEEX_STATE_NOT_EXIST;
    }

    public WeexContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mWeexConsumeState = WeexFrameLayout.WEEX_STATE_NOT_EXIST;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mWeexConsumeState = WeexFrameLayout.WEEX_STATE_CONSUME;
        } else if (action == 1 || action == 3) {
            this.mWeexConsumeState = WeexFrameLayout.WEEX_STATE_NOT_EXIST;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setWeexConsume(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119aa4ca", new Object[]{this, str});
            return;
        }
        this.mWeexConsumeState = str;
        ogg.a(TAG, "setWeexConsume:" + str);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.b
    public boolean canPullIntercept(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bcc734e2", new Object[]{this, str})).booleanValue() : WeexFrameLayout.WEEX_STATE_CONSUME.equals(this.mWeexConsumeState);
    }
}
