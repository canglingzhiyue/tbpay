package com.taobao.search.musie.weex;

import android.content.Context;
import android.graphics.Point;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.rwf;

/* loaded from: classes7.dex */
public final class MusWeex extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTR_DATA = "data";
    public static final String ATTR_SCRIPT_URL = "scriptUrl";
    public static final a Companion;
    private final Point measureResult;

    static {
        kge.a(194418202);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(MusWeex musWeex, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -940796597) {
            super.unmount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else if (hashCode != -285278287) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onMount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        }
    }

    public MusWeex(int i) {
        super(i);
        this.measureResult = new Point();
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-1516427038);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @MUSNodeProp(name = ATTR_SCRIPT_URL)
    public final void setScriptUrl(String scriptUrl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31425b73", new Object[]{this, scriptUrl});
            return;
        }
        q.c(scriptUrl, "scriptUrl");
        setAttribute(ATTR_SCRIPT_URL, scriptUrl);
    }

    @MUSNodeProp(name = "data")
    public final void setData(JSONObject data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, data});
            return;
        }
        q.c(data, "data");
        setAttribute("data", data);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this}) : UINodeType.VIEW;
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    /* renamed from: onCreateMountContent */
    public Object mo1225onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
        }
        if (context == null) {
            q.a();
        }
        return new MusWeexHost(context);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMeasure(int i, int i2, int i3, int i4, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dab21ed4", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr});
        } else if (iArr == null) {
        } else {
            if (i3 == 1073741824) {
                iArr[0] = i;
            } else {
                iArr[0] = rwf.c(i, this.measureResult.x);
            }
            if (i4 == 1073741824) {
                iArr[1] = i2;
            } else {
                iArr[1] = this.measureResult.y;
            }
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onMount(mUSDKInstance, obj);
        if (!(obj instanceof MusWeexHost)) {
            obj = null;
        }
        MusWeexHost musWeexHost = (MusWeexHost) obj;
        if (musWeexHost == null) {
            return;
        }
        musWeexHost.mount(this, (String) getAttribute(ATTR_SCRIPT_URL), (JSONObject) getAttribute("data"), this.measureResult);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode, com.taobao.android.weex_uikit.ui.aa
    public void unmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ec954b", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.unmount(mUSDKInstance, obj);
        if (!(obj instanceof MusWeexHost)) {
            obj = null;
        }
        MusWeexHost musWeexHost = (MusWeexHost) obj;
        if (musWeexHost == null) {
            return;
        }
        musWeexHost.unMount();
    }
}
