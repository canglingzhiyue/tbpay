package com.taobao.family.globalbubble;

import android.taobao.util.k;
import android.view.View;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class DegradeWindow extends PopupWindow implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isInit;
    private int mGravity;
    private int mX;
    private int mY;

    public static /* synthetic */ Object ipc$super(DegradeWindow degradeWindow, String str, Object... objArr) {
        if (str.hashCode() == -1373052399) {
            super.dismiss();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.family.globalbubble.d
    public void setSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6e006a", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.isInit) {
        } else {
            setWidth(i);
            setHeight(i2);
        }
    }

    @Override // com.taobao.family.globalbubble.d
    public void setView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205edae4", new Object[]{this, view});
            return;
        }
        setAnimationStyle(16973824);
        setFocusable(false);
        setClippingEnabled(false);
        setContentView(view);
    }

    @Override // com.taobao.family.globalbubble.d
    public void setGravity(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d34a7b0", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.mGravity = i;
        this.mX = i2;
        this.mY = i3;
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : getContentView();
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        throw new RuntimeException("ParentView is necessary!");
    }

    @Override // com.taobao.family.globalbubble.d
    public void init(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce90a9db", new Object[]{this, view});
            return;
        }
        this.isInit = true;
        if (isShowing()) {
            dismiss();
        }
        try {
            showAtLocation(view, this.mGravity, this.mX, this.mY);
        } catch (Exception e) {
            k.a(DegradeWindow.class.getSimpleName(), e.toString());
        }
    }

    @Override // android.widget.PopupWindow, com.taobao.family.globalbubble.d
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else {
            super.dismiss();
        }
    }

    public void updateXY(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a4a4531", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mX = i;
        this.mY = i2;
        updateLocation();
    }

    public void updateX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc80b40d", new Object[]{this, new Integer(i)});
            return;
        }
        this.mX = i;
        updateLocation();
    }

    public void updateY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce358cac", new Object[]{this, new Integer(i)});
            return;
        }
        this.mY = i;
        updateLocation();
    }

    private void updateLocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28be925", new Object[]{this});
        } else {
            update(this.mX, this.mY, -1, -1);
        }
    }

    public int getX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("754e2f3c", new Object[]{this})).intValue();
        }
        int[] iArr = new int[2];
        getContentView().getLocationOnScreen(iArr);
        return iArr[0];
    }

    public int getY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("755c46bd", new Object[]{this})).intValue();
        }
        int[] iArr = new int[2];
        getContentView().getLocationOnScreen(iArr);
        return iArr[1];
    }
}
