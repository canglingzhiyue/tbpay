package com.taobao.taolive.uikit.component;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class ViewFlipperExt extends ViewAnimatorExt implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_INTERVAL = 3000;
    private static final boolean LOGD = false;
    private static final String TAG = "ViewFlipper";
    private final int FLIP_MSG;
    private boolean mAutoStart;
    private int mFlipInterval;
    private Handler mHandler;
    private final BroadcastReceiver mReceiver;
    private boolean mRunning;
    private boolean mStarted;
    private boolean mUserPresent;
    private boolean mVisible;

    static {
        kge.a(-1996165463);
        kge.a(-1043440182);
    }

    public static /* synthetic */ Object ipc$super(ViewFlipperExt viewFlipperExt, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case -376150200:
                super.onInitializeAccessibilityEvent((AccessibilityEvent) objArr[0]);
                return null;
            case 362356466:
                super.onInitializeAccessibilityNodeInfo((AccessibilityNodeInfo) objArr[0]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void pageChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2cc9f9d", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ boolean access$002(ViewFlipperExt viewFlipperExt, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54736599", new Object[]{viewFlipperExt, new Boolean(z)})).booleanValue();
        }
        viewFlipperExt.mUserPresent = z;
        return z;
    }

    public static /* synthetic */ void access$100(ViewFlipperExt viewFlipperExt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("957be280", new Object[]{viewFlipperExt});
        } else {
            viewFlipperExt.updateRunning();
        }
    }

    public static /* synthetic */ void access$200(ViewFlipperExt viewFlipperExt, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ab6ed15", new Object[]{viewFlipperExt, new Boolean(z)});
        } else {
            viewFlipperExt.updateRunning(z);
        }
    }

    public ViewFlipperExt(Context context) {
        super(context);
        this.mFlipInterval = 3000;
        this.mAutoStart = false;
        this.mRunning = false;
        this.mStarted = false;
        this.mVisible = false;
        this.mUserPresent = true;
        this.mReceiver = new BroadcastReceiver() { // from class: com.taobao.taolive.uikit.component.ViewFlipperExt.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    ViewFlipperExt.access$002(ViewFlipperExt.this, false);
                    ViewFlipperExt.access$100(ViewFlipperExt.this);
                } else if (!"android.intent.action.USER_PRESENT".equals(action)) {
                } else {
                    ViewFlipperExt.access$002(ViewFlipperExt.this, true);
                    ViewFlipperExt.access$200(ViewFlipperExt.this, false);
                }
            }
        };
        this.FLIP_MSG = 1;
        initHandler();
    }

    public ViewFlipperExt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mFlipInterval = 3000;
        this.mAutoStart = false;
        this.mRunning = false;
        this.mStarted = false;
        this.mVisible = false;
        this.mUserPresent = true;
        this.mReceiver = new BroadcastReceiver() { // from class: com.taobao.taolive.uikit.component.ViewFlipperExt.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    ViewFlipperExt.access$002(ViewFlipperExt.this, false);
                    ViewFlipperExt.access$100(ViewFlipperExt.this);
                } else if (!"android.intent.action.USER_PRESENT".equals(action)) {
                } else {
                    ViewFlipperExt.access$002(ViewFlipperExt.this, true);
                    ViewFlipperExt.access$200(ViewFlipperExt.this, false);
                }
            }
        };
        this.FLIP_MSG = 1;
        initHandler();
    }

    private void initHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e19fa1", new Object[]{this});
        } else if (this.mHandler != null) {
        } else {
            this.mHandler = new Handler(Looper.getMainLooper(), this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.mUserPresent = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        getContext().registerReceiver(this.mReceiver, intentFilter, null, this.mHandler);
        if (!this.mAutoStart) {
            return;
        }
        startFlipping();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.mVisible = false;
        getContext().unregisterReceiver(this.mReceiver);
        updateRunning();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            z = false;
        }
        this.mVisible = z;
        updateRunning(false);
    }

    public void setFlipInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd6a08", new Object[]{this, new Integer(i)});
        } else {
            this.mFlipInterval = i;
        }
    }

    public void startFlipping() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("833d5e8", new Object[]{this});
            return;
        }
        this.mStarted = true;
        updateRunning();
    }

    public void stopFlipping() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f6a988", new Object[]{this});
            return;
        }
        this.mStarted = false;
        updateRunning();
    }

    @Override // com.taobao.taolive.uikit.component.ViewAnimatorExt, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9946748", new Object[]{this, accessibilityEvent});
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ViewFlipperExt.class.getName());
    }

    @Override // com.taobao.taolive.uikit.component.ViewAnimatorExt, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15991ef2", new Object[]{this, accessibilityNodeInfo});
            return;
        }
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ViewFlipperExt.class.getName());
    }

    private void updateRunning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b86ea3d", new Object[]{this});
        } else {
            updateRunning(true);
        }
    }

    private void updateRunning(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5571037", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.mVisible && this.mStarted && this.mUserPresent) {
            z2 = true;
        }
        if (z2 == this.mRunning) {
            return;
        }
        if (z2) {
            showOnly(this.mWhichChild, z);
            this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(1), this.mFlipInterval);
        } else {
            this.mHandler.removeMessages(1);
        }
        this.mRunning = z2;
    }

    public boolean isFlipping() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa5a32b4", new Object[]{this})).booleanValue() : this.mStarted;
    }

    public void setAutoStart(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5a481c", new Object[]{this, new Boolean(z)});
        } else {
            this.mAutoStart = z;
        }
    }

    public boolean isAutoStart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c103d5f4", new Object[]{this})).booleanValue() : this.mAutoStart;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 1 && this.mRunning) {
            pageChange(this.mWhichChild);
            showNext();
            this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(1), this.mFlipInterval);
        }
        return true;
    }
}
