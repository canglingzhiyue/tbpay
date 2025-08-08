package com.taobao.search.musie.web;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class MusWeb extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTR_DISABLE_TOUCH = "disableTouch";
    public static final String ATTR_SRC = "src";
    public static final a Companion;

    static {
        kge.a(-20903520);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(MusWeb musWeb, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -939675523) {
            super.refreshAttribute((Map) objArr[0]);
            return null;
        } else if (hashCode == -285278287) {
            super.onMount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else if (hashCode != -136526582) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onUnmount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        }
    }

    public MusWeb(int i) {
        super(i);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-666276632);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @MUSNodeProp(name = "src")
    public final void setSrc(String src) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, src});
            return;
        }
        q.c(src, "src");
        setAttribute("src", src);
    }

    @MUSNodeProp(name = ATTR_DISABLE_TOUCH)
    public final void setDisableTouch(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b669ec8d", new Object[]{this, bool});
        } else {
            setAttribute(ATTR_DISABLE_TOUCH, bool);
        }
    }

    @MUSNodeProp(name = ATTR_DISABLE_TOUCH, refresh = true)
    public final void refreshDisableTouch(Boolean bool) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bafb74", new Object[]{this, bool});
            return;
        }
        MusWebViewHost musWebViewHost = (MusWebViewHost) getMountContent();
        if (bool != null) {
            z = bool.booleanValue();
        }
        musWebViewHost.setDisableTouch(z);
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
        return new MusWebViewHost(context);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void refreshAttribute(Map<String, Object> attributes) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7fdb07d", new Object[]{this, attributes});
            return;
        }
        q.c(attributes, "attributes");
        super.refreshAttribute(attributes);
        mountContent(getMountContent());
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onMount(mUSDKInstance, obj);
        mountContent(obj);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onUnmount(mUSDKInstance, obj);
        if (!(obj instanceof MusWebViewHost)) {
            obj = null;
        }
        MusWebViewHost musWebViewHost = (MusWebViewHost) obj;
        if (musWebViewHost == null) {
            return;
        }
        musWebViewHost.unMount();
    }

    private final void mountContent(Object obj) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c91ac3", new Object[]{this, obj});
            return;
        }
        String str = (String) getAttribute("src");
        if (StringUtils.isEmpty(str)) {
            return;
        }
        if (!(obj instanceof MusWebViewHost)) {
            obj = null;
        }
        MusWebViewHost musWebViewHost = (MusWebViewHost) obj;
        if (musWebViewHost == null) {
            return;
        }
        if (str == null) {
            q.a();
        }
        musWebViewHost.mount(str);
        Boolean bool = (Boolean) getAttribute(ATTR_DISABLE_TOUCH);
        if (bool != null) {
            z = bool.booleanValue();
        }
        musWebViewHost.setDisableTouch(z);
    }
}
