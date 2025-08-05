package com.taobao.android.weex_uikit.ui.cache;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.MUSNodeHost;
import com.taobao.android.weex_uikit.ui.UINode;
import tb.kge;

/* loaded from: classes6.dex */
public class AccessibilityView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final ViewGroup.LayoutParams DUMMY;
    private UINode mNode;

    public static /* synthetic */ Object ipc$super(AccessibilityView accessibilityView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(AccessibilityView accessibilityView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad85fca3", new Object[]{accessibilityView});
        } else {
            accessibilityView.onAccessibilityClick();
        }
    }

    static {
        kge.a(1201776931);
        DUMMY = new ViewGroup.LayoutParams(0, 0);
    }

    public static void addToParent(MUSNodeHost mUSNodeHost, AccessibilityView accessibilityView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c273996", new Object[]{mUSNodeHost, accessibilityView});
        } else if (accessibilityView == null || accessibilityView.getParent() != null) {
        } else {
            mUSNodeHost.addAccessibilityView(accessibilityView);
        }
    }

    public static void removeFromParent(MUSNodeHost mUSNodeHost, AccessibilityView accessibilityView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("408f3468", new Object[]{mUSNodeHost, accessibilityView});
        } else if (accessibilityView == null || accessibilityView.getParent() == null) {
        } else {
            mUSNodeHost.removeAccessibilityView(accessibilityView);
        }
    }

    public AccessibilityView(Context context) {
        super(context);
        setWillNotDraw(true);
        setLayoutParams(DUMMY);
    }

    public void setNode(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd3c18dd", new Object[]{this, uINode});
        } else {
            this.mNode = uINode;
        }
    }

    public void attach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad9c84c", new Object[]{this});
            return;
        }
        UINode uINode = this.mNode;
        if (uINode != null) {
            if (uINode.hasEvent("click")) {
                setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.weex_uikit.ui.cache.AccessibilityView.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            AccessibilityView.access$000(AccessibilityView.this);
                        }
                    }
                });
                return;
            }
            setOnClickListener(null);
            setClickable(false);
            return;
        }
        setOnClickListener(null);
        setClickable(false);
    }

    private void onAccessibilityClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b542b520", new Object[]{this});
            return;
        }
        UINode uINode = this.mNode;
        if (uINode == null) {
            return;
        }
        uINode.fireEvent("click", null);
    }
}
