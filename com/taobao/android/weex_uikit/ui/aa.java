package com.taobao.android.weex_uikit.ui;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.jws;
import tb.jwt;
import tb.jwv;
import tb.kge;

/* loaded from: classes6.dex */
public class aa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_POOL_SIZE = 3;
    private static final AtomicInteger sNodeTypeId;
    private static final Map<Object, Integer> sTypeIdByNodeType;
    private Object mountContent;
    public boolean mounted;
    private final int typeId;

    public boolean canPreallocate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ad6217b", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void dispatchPreallocate(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("559580db", new Object[]{this, context});
        }
    }

    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        }
    }

    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        }
    }

    public void onBoundsChange(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb13740b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    public void onMeasure(int i, int i2, int i3, int i4, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dab21ed4", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr});
        }
    }

    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
        }
    }

    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
        }
    }

    public int poolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bdc9c37", new Object[]{this})).intValue();
        }
        return 3;
    }

    static {
        kge.a(1709766609);
        sTypeIdByNodeType = new HashMap();
        sNodeTypeId = new AtomicInteger();
    }

    public aa(Object obj) {
        obj = obj == null ? getClass() : obj;
        synchronized (sTypeIdByNodeType) {
            if (!sTypeIdByNodeType.containsKey(obj)) {
                sTypeIdByNodeType.put(obj, Integer.valueOf(sNodeTypeId.incrementAndGet()));
            }
            this.typeId = sTypeIdByNodeType.get(obj).intValue();
        }
    }

    public Object createMountContent(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2275846d", new Object[]{this, context}) : mo1225onCreateMountContent(context);
    }

    /* renamed from: onCreateMountContent */
    public Object mo1225onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
        }
        throw new RuntimeException("Trying to mount a view or drawable node that doesn't implement //@OnCreateMountContent");
    }

    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this}) : UINodeType.NONE;
    }

    public jwv onCreateMountContentPool() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jwv) ipChange.ipc$dispatch("ab41abdf", new Object[]{this}) : new jwt(getClass().getSimpleName(), poolSize(), true);
    }

    public int getTypeId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8761ebe5", new Object[]{this})).intValue() : this.typeId;
    }

    public void measure(int i, int i2, int i3, int i4, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c5e52f3", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr});
        } else if (iArr == null || iArr.length < 2) {
            throw new IllegalArgumentException("output's length must >= 2");
        } else {
            iArr[0] = -1;
            iArr[1] = -1;
            onMeasure(i, i2, i3, i4, iArr);
            if (iArr[0] != -1 && iArr[1] != -1) {
                return;
            }
            throw new IllegalStateException("onMeasure must apply width and height to output");
        }
    }

    public final <T> T getMountContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("1c1e26b5", new Object[]{this}) : (T) this.mountContent;
    }

    public void mount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("197ec32", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        this.mounted = true;
        try {
            this.mountContent = obj;
            onMount(mUSDKInstance, obj);
        } catch (Exception e) {
            com.taobao.android.weex_framework.monitor.b.a();
            com.taobao.android.weex_framework.util.g.a(e);
        }
    }

    public void unmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ec954b", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        this.mounted = false;
        try {
            this.mountContent = null;
            onUnmount(mUSDKInstance, obj);
        } catch (Exception e) {
            com.taobao.android.weex_framework.monitor.b.a();
            com.taobao.android.weex_framework.util.g.a(e);
        }
    }

    public boolean isMounted() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d77cb79", new Object[]{this})).booleanValue() : this.mounted;
    }

    public void activityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e029f6a3", new Object[]{this});
        } else {
            onActivityResume();
        }
    }

    public void activityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d692ed2e", new Object[]{this});
        } else {
            onActivityPause();
        }
    }

    public void preallocate(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c599da41", new Object[]{this, context});
            return;
        }
        if (canPreallocate() && com.taobao.android.weex_uikit.util.e.b(this)) {
            jws.b(context, this);
        }
        dispatchPreallocate(context);
    }
}
