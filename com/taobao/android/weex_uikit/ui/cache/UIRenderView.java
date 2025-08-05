package com.taobao.android.weex_uikit.ui.cache;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_uikit.ui.MUSNodeHost;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.border.BorderProp;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes6.dex */
public class UIRenderView extends View implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Method sAddTransientMethod;
    private static Field sAttachInfoField;
    private static Method sRemoveTransientMethod;
    private MUSNodeHost mHost;
    private UINode mNode;
    private a mSimpleProvider;

    public void detach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b39a9a", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.cache.b
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    static {
        kge.a(105268447);
        kge.a(342376116);
        sAttachInfoField = null;
        sAddTransientMethod = null;
        sRemoveTransientMethod = null;
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (sAttachInfoField != null) {
        } else {
            synchronized (UIRenderView.class) {
                if (sAttachInfoField == null) {
                    try {
                        Field declaredField = View.class.getDeclaredField("mAttachInfo");
                        sAttachInfoField = declaredField;
                        declaredField.setAccessible(true);
                    } catch (Exception unused) {
                    }
                    if (sAttachInfoField == null) {
                        try {
                            Method declaredMethod = ViewGroup.class.getDeclaredMethod("addTransientView", View.class, Integer.TYPE);
                            sAddTransientMethod = declaredMethod;
                            declaredMethod.setAccessible(true);
                            Method declaredMethod2 = ViewGroup.class.getDeclaredMethod("removeTransientView", View.class);
                            sRemoveTransientMethod = declaredMethod2;
                            declaredMethod2.setAccessible(true);
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
        }
    }

    public static void attachToParent(MUSNodeHost mUSNodeHost, View view) {
        try {
            if (sAttachInfoField == null) {
                if (sAddTransientMethod == null) {
                    return;
                }
                sAddTransientMethod.invoke(mUSNodeHost, view, 0);
                return;
            }
            sAttachInfoField.set(view, sAttachInfoField.get(mUSNodeHost));
        } catch (Exception e) {
            g.a(e);
        }
    }

    public static void removeFromParent(MUSNodeHost mUSNodeHost, View view) {
        try {
            if (sAttachInfoField == null) {
                if (sRemoveTransientMethod == null) {
                    return;
                }
                sRemoveTransientMethod.invoke(mUSNodeHost, view);
                return;
            }
            sAttachInfoField.set(view, null);
        } catch (Exception e) {
            g.a(e);
        }
    }

    public UIRenderView(Context context, UINode uINode) {
        super(context);
        this.mSimpleProvider = new c();
        setLayerType(0, null);
        this.mNode = uINode;
    }

    @Override // com.taobao.android.weex_uikit.ui.cache.b
    public void attach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad9c84c", new Object[]{this});
        } else {
            updateBorderRadius();
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.cache.b
    public void updateBorderRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2772c4e", new Object[]{this});
        } else if (this.mNode == null || Build.VERSION.SDK_INT < 21) {
        } else {
            BorderProp a2 = this.mNode.getNodeInfo().a(false);
            if (a2 == null || a2.c()) {
                this.mSimpleProvider.a(this, getWidth(), getHeight(), a2);
            } else {
                this.mSimpleProvider.a(this, getWidth(), getHeight(), null);
            }
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.cache.b
    public void setTarget(MUSNodeHost mUSNodeHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c14eb7", new Object[]{this, mUSNodeHost});
        } else {
            this.mHost = mUSNodeHost;
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        UINode uINode = this.mNode;
        if (uINode == null || this.mHost == null) {
            return;
        }
        BorderProp a2 = uINode.getNodeInfo().a(false);
        if (a2 == null || a2.b() == null) {
            this.mNode.drawWithRenderNode(this.mHost, canvas, false);
            return;
        }
        UINode uINode2 = this.mNode;
        MUSNodeHost mUSNodeHost = this.mHost;
        if (a2.c() && Build.VERSION.SDK_INT >= 21) {
            z = false;
        }
        uINode2.drawWithRenderNode(mUSNodeHost, canvas, z);
    }
}
