package com.taobao.android.weex_uikit.bridge;

import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.bridge.e;
import com.taobao.android.weex_framework.monitor.b;
import com.taobao.android.weex_framework.ui.l;
import com.taobao.android.weex_framework.ui.m;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.o;
import com.taobao.android.weex_framework.util.s;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.i;
import com.taobao.android.weex_uikit.widget.div.Div;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class MUSUINodeBridge implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Runnable OOM_DETECTOR;
    public static final String TAG;

    public static /* synthetic */ Runnable access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("fae3e4bd", new Object[0]) : OOM_DETECTOR;
    }

    static {
        kge.a(846875260);
        kge.a(1028243835);
        TAG = MUSDKInstance.class.getSimpleName();
        OOM_DETECTOR = new Runnable() { // from class: com.taobao.android.weex_uikit.bridge.MUSUINodeBridge.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                System.gc();
                Log.e(g.TAG, "Weex OOM WTF detector alloc: " + new Object());
                synchronized (MUSUINodeBridge.access$000()) {
                    MUSUINodeBridge.access$000().notify();
                }
                Log.e(g.TAG, "Weex OOM WTF detector finished");
            }
        };
    }

    public static UINode createNode2(WeexInstanceImpl weexInstanceImpl, int i, MUSValue mUSValue, MUSProps mUSProps, MUSProps mUSProps2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINode) ipChange.ipc$dispatch("83129dab", new Object[]{weexInstanceImpl, new Integer(i), mUSValue, mUSProps, mUSProps2}) : createNode(weexInstanceImpl.getAdapterMUSInstance(), i, mUSValue, mUSProps, mUSProps2);
    }

    public static UINode createNode(MUSDKInstance mUSDKInstance, int i, MUSValue mUSValue, MUSProps mUSProps, MUSProps mUSProps2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("500b033", new Object[]{mUSDKInstance, new Integer(i), mUSValue, mUSProps, mUSProps2});
        }
        try {
            try {
                try {
                    String stringValue = mUSValue.getStringValue();
                    l a2 = m.a(stringValue);
                    mUSDKInstance.setJustCreateTagName(stringValue);
                    if (a2 != null) {
                        UINode uINode = (UINode) a2.a(mUSDKInstance, i, mUSProps, mUSProps2);
                        if (uINode != null) {
                            return uINode;
                        }
                        g.f("[createNode]", "createNode in normal Exception to return null,3: " + stringValue);
                        throw new IllegalStateException("default exception3:" + stringValue);
                    }
                    g.f("[Render]", "Node type of <" + mUSValue.printToString() + "> dose not exist");
                    UINode createDefaultNode = createDefaultNode(mUSDKInstance, i, mUSValue, mUSProps, mUSProps2);
                    if (createDefaultNode != null) {
                        return createDefaultNode;
                    }
                    g.f("[createNode]", "createNode in default Exception to return null,4: " + stringValue);
                    throw new IllegalStateException("default exception4:" + stringValue);
                } catch (OutOfMemoryError unused) {
                    AsyncTask.THREAD_POOL_EXECUTOR.execute(OOM_DETECTOR);
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (OOM_DETECTOR) {
                        OOM_DETECTOR.wait(10000L);
                        return null;
                    }
                }
            } catch (Exception e2) {
                b.a();
                g.c("[Render]", "Client native error occur", e2);
                UINode createDefaultNode2 = createDefaultNode(mUSDKInstance, i, mUSValue, mUSProps, mUSProps2);
                if (createDefaultNode2 != null) {
                    return createDefaultNode2;
                }
                g.f("[createNode]", "createNode in default Exception to return null,2");
                throw new IllegalStateException("default exception2:");
            }
        } catch (Throwable th) {
            th.printStackTrace();
            g.c("[createNode]", "createNode Exception to return null,1", th);
            return null;
        }
    }

    private static UINode createDefaultNode(MUSDKInstance mUSDKInstance, int i, MUSValue mUSValue, MUSProps mUSProps, MUSProps mUSProps2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("3febea1c", new Object[]{mUSDKInstance, new Integer(i), mUSValue, mUSProps, mUSProps2});
        }
        l a2 = m.a("div");
        if (a2 == null) {
            m.a("div", new Div.a());
            throw new IllegalStateException("Div not registered, Engine Not Init!!!!!");
        }
        mUSDKInstance.setJustCreateTagName("div");
        return (UINode) a2.a(mUSDKInstance, i, mUSProps, mUSProps2);
    }

    public static void addChildNode2(WeexInstanceImpl weexInstanceImpl, UINode uINode, UINode uINode2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df7f99a", new Object[]{weexInstanceImpl, uINode, uINode2});
        } else {
            addChildNode(weexInstanceImpl.getAdapterMUSInstance(), uINode, uINode2);
        }
    }

    public static void addChildNode(MUSDKInstance mUSDKInstance, UINode uINode, UINode uINode2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a29d0f52", new Object[]{mUSDKInstance, uINode, uINode2});
        } else if (mUSDKInstance.isDestroyed()) {
        } else {
            uINode.addChild(uINode2);
        }
    }

    public static void setRootNode2(WeexInstanceImpl weexInstanceImpl, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b6f8a97", new Object[]{weexInstanceImpl, uINode});
        } else {
            setRootNode(weexInstanceImpl.getAdapterMUSInstance(), uINode);
        }
    }

    public static void setRootNode(MUSDKInstance mUSDKInstance, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96e731f", new Object[]{mUSDKInstance, uINode});
            return;
        }
        try {
            mUSDKInstance.setRootNode(uINode);
        } catch (Exception e) {
            b.a();
            g.a(e);
        }
    }

    public static void insertNode2(WeexInstanceImpl weexInstanceImpl, UINode uINode, int i, UINode uINode2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("927aa951", new Object[]{weexInstanceImpl, uINode, new Integer(i), uINode2});
        } else {
            insertNode(weexInstanceImpl.getAdapterMUSInstance(), uINode, i, uINode2);
        }
    }

    public static void insertNode(MUSDKInstance mUSDKInstance, UINode uINode, int i, UINode uINode2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b06419", new Object[]{mUSDKInstance, uINode, new Integer(i), uINode2});
        } else if (mUSDKInstance.isDestroyed()) {
        } else {
            uINode.addChild(i, uINode2);
        }
    }

    public static void removeNode2(WeexInstanceImpl weexInstanceImpl, UINode uINode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f2672c", new Object[]{weexInstanceImpl, uINode, new Integer(i)});
        } else {
            removeNode(weexInstanceImpl.getAdapterMUSInstance(), uINode, i);
        }
    }

    public static void removeNode(MUSDKInstance mUSDKInstance, UINode uINode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("783827a4", new Object[]{mUSDKInstance, uINode, new Integer(i)});
        } else if (mUSDKInstance.isDestroyed()) {
        } else {
            uINode.removeChildAt(i);
        }
    }

    public static void moveNode2(WeexInstanceImpl weexInstanceImpl, UINode uINode, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b3547e4", new Object[]{weexInstanceImpl, uINode, new Integer(i), new Integer(i2)});
        } else {
            moveNode(weexInstanceImpl.getAdapterMUSInstance(), uINode, i, i2);
        }
    }

    public static void moveNode(MUSDKInstance mUSDKInstance, UINode uINode, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fddb8ac", new Object[]{mUSDKInstance, uINode, new Integer(i), new Integer(i2)});
        } else if (mUSDKInstance.isDestroyed()) {
        } else {
            uINode.moveNode(i, i2);
        }
    }

    public static void updateNodeAttr2(WeexInstanceImpl weexInstanceImpl, UINode uINode, MUSProps mUSProps) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d7555db", new Object[]{weexInstanceImpl, uINode, mUSProps});
        } else {
            updateNodeAttr(weexInstanceImpl.getAdapterMUSInstance(), uINode, mUSProps);
        }
    }

    public static void updateNodeAttr(MUSDKInstance mUSDKInstance, UINode uINode, MUSProps mUSProps) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a8a1e3", new Object[]{mUSDKInstance, uINode, mUSProps});
            return;
        }
        try {
            uINode.updateAttrs(mUSProps);
        } catch (Exception e) {
            b.a();
            g.c("[Render]", "Client native error occur", e);
        }
    }

    public static void updateNodeStyle2(WeexInstanceImpl weexInstanceImpl, UINode uINode, MUSProps mUSProps) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f1dbe5", new Object[]{weexInstanceImpl, uINode, mUSProps});
        } else {
            updateNodeStyle(weexInstanceImpl.getAdapterMUSInstance(), uINode, mUSProps);
        }
    }

    public static void updateNodeStyle(MUSDKInstance mUSDKInstance, UINode uINode, MUSProps mUSProps) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e26f86d", new Object[]{mUSDKInstance, uINode, mUSProps});
            return;
        }
        try {
            uINode.updateStyles(mUSProps);
        } catch (Exception e) {
            b.a();
            g.c("[Render]", "Client native error occur", e);
        }
    }

    public static void updateNodeLayout2(WeexInstanceImpl weexInstanceImpl, UINode uINode, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("572be446", new Object[]{weexInstanceImpl, uINode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            updateNodeLayout(weexInstanceImpl.getAdapterMUSInstance(), uINode, i, i2, i3, i4);
        }
    }

    public static void updateNodeLayout(MUSDKInstance mUSDKInstance, UINode uINode, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f7f98e", new Object[]{mUSDKInstance, uINode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        try {
            uINode.updateLayout(i, i2, i3, i4);
        } catch (Exception e) {
            b.a();
            g.c("[Render]", "Client native error occur", e);
        }
    }

    public static void addNodeEvent2(WeexInstanceImpl weexInstanceImpl, UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286a6fd5", new Object[]{weexInstanceImpl, uINode, mUSValue});
        } else {
            addNodeEvent(weexInstanceImpl.getAdapterMUSInstance(), uINode, mUSValue);
        }
    }

    public static void addNodeEvent(MUSDKInstance mUSDKInstance, final UINode uINode, final MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2bddb9d", new Object[]{mUSDKInstance, uINode, mUSValue});
        } else if (mUSValue == null) {
        } else {
            try {
                if (StringUtils.isEmpty(mUSValue.getStringValue())) {
                    return;
                }
                mUSDKInstance.enqueueTask(new o() { // from class: com.taobao.android.weex_uikit.bridge.MUSUINodeBridge.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            UINode.this.addEvent(mUSValue.getStringValue());
                        }
                    }
                });
            } catch (Exception e) {
                b.a();
                g.c("[Render]", "Client native error occur", e);
            }
        }
    }

    public static void removeNodeEvent2(WeexInstanceImpl weexInstanceImpl, UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea448d2", new Object[]{weexInstanceImpl, uINode, mUSValue});
        } else {
            removeNodeEvent(weexInstanceImpl.getAdapterMUSInstance(), uINode, mUSValue);
        }
    }

    public static void removeNodeEvent(MUSDKInstance mUSDKInstance, final UINode uINode, final MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23be42da", new Object[]{mUSDKInstance, uINode, mUSValue});
        } else if (mUSValue == null) {
        } else {
            try {
                if (StringUtils.isEmpty(mUSValue.getStringValue())) {
                    return;
                }
                mUSDKInstance.enqueueTask(new o() { // from class: com.taobao.android.weex_uikit.bridge.MUSUINodeBridge.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            UINode.this.removeEvent(mUSValue.getStringValue());
                        }
                    }
                });
            } catch (Exception e) {
                b.a();
                g.c("[Render]", "Client native error occur", e);
            }
        }
    }

    public static void measureNode2(WeexInstanceImpl weexInstanceImpl, UINode uINode, int i, int i2, int i3, int i4, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa7deb9f", new Object[]{weexInstanceImpl, uINode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr});
        } else {
            measureNode(weexInstanceImpl.getAdapterMUSInstance(), uINode, i, i2, i3, i4, iArr);
        }
    }

    public static void measureNode(MUSDKInstance mUSDKInstance, UINode uINode, int i, int i2, int i3, int i4, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3120aa7", new Object[]{mUSDKInstance, uINode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr});
            return;
        }
        try {
            uINode.measure(i2, i4, com.taobao.android.weex_framework.util.l.a(i), com.taobao.android.weex_framework.util.l.a(i3), iArr);
        } catch (Exception e) {
            b.a();
            g.c("[Render]", "Client native error occur", e);
        }
    }

    public static void onInit2(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f205ee8", new Object[]{weexInstanceImpl});
        } else {
            onInit(weexInstanceImpl.getAdapterMUSInstance());
        }
    }

    public static void onInit(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39032020", new Object[]{mUSDKInstance});
        } else if (mUSDKInstance == null) {
        } else {
            try {
                mUSDKInstance.setRenderManager(new i());
            } catch (Exception e) {
                b.a();
                g.a(e);
            }
        }
    }

    public static void beginUpdate2(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73618145", new Object[]{weexInstanceImpl});
        } else {
            beginUpdate(weexInstanceImpl.getAdapterMUSInstance());
        }
    }

    public static void beginUpdate(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f40648bd", new Object[]{mUSDKInstance});
            return;
        }
        try {
            if (mUSDKInstance.getRenderManager() == null) {
                return;
            }
            mUSDKInstance.getRenderManager();
        } catch (Exception e) {
            b.a();
            g.a(e);
        }
    }

    public static void endUpdate2(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("745d2c53", new Object[]{weexInstanceImpl});
        } else {
            endUpdate(weexInstanceImpl.getAdapterMUSInstance());
        }
    }

    public static void endUpdate(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baecf14b", new Object[]{mUSDKInstance});
            return;
        }
        try {
            if (!mUSDKInstance.isDestroyed() && mUSDKInstance.getRenderManager() != null) {
                s.a("MusRenderManagerUpdate");
                mUSDKInstance.getRenderManager().b(mUSDKInstance);
                s.b("MusRenderManagerUpdate");
            }
        } catch (Exception e) {
            b.a();
            g.a(e);
        }
    }

    public static void callUINodeMethod2(WeexInstanceImpl weexInstanceImpl, UINode uINode, String str, WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14da45c7", new Object[]{weexInstanceImpl, uINode, str, weexValueArr});
            return;
        }
        MUSValue[] mUSValueArr = null;
        if (weexValueArr != null) {
            MUSValue[] mUSValueArr2 = new MUSValue[weexValueArr.length];
            for (int i = 0; i < weexValueArr.length; i++) {
                if (weexValueArr[i] == null) {
                    mUSValueArr2[i] = null;
                } else {
                    mUSValueArr2[i] = ((WeexValueImpl) weexValueArr[i]).convertMUSValue();
                }
            }
            mUSValueArr = mUSValueArr2;
        }
        callUINodeMethod(weexInstanceImpl.getAdapterMUSInstance(), uINode, MUSValue.ofString(str), mUSValueArr);
    }

    public static void callUINodeMethod(MUSDKInstance mUSDKInstance, UINode uINode, MUSValue mUSValue, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e5fa507", new Object[]{mUSDKInstance, uINode, mUSValue, mUSValueArr});
            return;
        }
        try {
            if (mUSDKInstance == null) {
                g.f(TAG, "callUINodeMethod instance is null");
            } else if (uINode.isGenerated()) {
                try {
                    uINode.dispatchMethod(mUSValue.getStringValue(), mUSValueArr);
                } catch (Exception e) {
                    b.a();
                    g.a(e);
                }
            } else {
                new e(mUSDKInstance).a(uINode, mUSValue, mUSValueArr);
            }
        } catch (Exception e2) {
            b.a();
            g.a(e2);
        }
    }
}
