package com.taobao.themis.external.embed;

import com.alibaba.ariver.kernel.RVConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.model.d;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.kge;
import tb.ljl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0002\u0010\u0003B\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0016\u001a\u00020\u0000J\u0006\u0010\u0017\u001a\u00020\u0005J\u0006\u0010\u0018\u001a\u00020\u0005R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/taobao/themis/external/embed/WidgetViewConfig;", "", "viewConfig", "(Lcom/taobao/themis/external/embed/WidgetViewConfig;)V", "width", "", "height", "(II)V", RVConstants.EXTRA_START_PARAMS, "Lcom/taobao/themis/external/embed/WidgetStartParams;", "(Lcom/taobao/themis/external/embed/WidgetStartParams;)V", "originHeight", "getOriginHeight", "()I", "setOriginHeight", "(I)V", "originWidth", "getOriginWidth", "setOriginWidth", d.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, "getScreenWidth", "setScreenWidth", "clone", "getHeight", "getWidth", "themis_interface_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f22415a;
    private int b;
    private int c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0017J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/taobao/themis/external/embed/TMSEmbed$IRenderListener;", "", "()V", "onDowngrade", "", "canAutoDowngrade", "errorCode", "", "errorMsg", "onJSException", "", ljl.LAUNCHER_FINISH_TIME, ljl.LAUNCHER_START_TIME, "onPop", "onRenderFailed", ljl.RENDER_START_TIME, ljl.RENDER_SUCCESS_TIME, "themis_interface_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.external.embed.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C0936a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1891887570);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        public void a(String errorCode, String errorMsg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, errorCode, errorMsg});
                return;
            }
            q.d(errorCode, "errorCode");
            q.d(errorMsg, "errorMsg");
        }

        public boolean a(boolean z, String errorCode, String errorMsg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("da24c284", new Object[]{this, new Boolean(z), errorCode, errorMsg})).booleanValue();
            }
            q.d(errorCode, "errorCode");
            q.d(errorMsg, "errorMsg");
            return false;
        }

        @Deprecated(message = "onPop is deprecated, use IContainerExtension#setOnCloseHandler instead")
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            }
        }

        public void b(String errorCode, String errorMsg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, errorCode, errorMsg});
                return;
            }
            q.d(errorCode, "errorCode");
            q.d(errorMsg, "errorMsg");
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            }
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            }
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            }
        }
    }

    static {
        kge.a(103437615);
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.c;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public a(a viewConfig) {
        q.d(viewConfig, "viewConfig");
        this.c = -1;
        this.f22415a = viewConfig.f22415a;
        this.b = viewConfig.b;
        this.c = viewConfig.c;
    }

    public a(int i, int i2) {
        this.c = -1;
        this.b = i;
        this.f22415a = i2;
    }

    public a(WidgetStartParams startParams) {
        Integer d;
        Integer d2;
        q.d(startParams, "startParams");
        int i = -1;
        this.c = -1;
        String width = startParams.getWidth();
        this.b = (width == null || (d2 = n.d(width)) == null) ? -1 : d2.intValue();
        String height = startParams.getHeight();
        if (height != null && (d = n.d(height)) != null) {
            i = d.intValue();
        }
        this.f22415a = i;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        int i = this.b;
        return i == -1 ? i : com.taobao.themis.kernel.utils.a.a(this.c, i, -1);
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        int i = this.f22415a;
        return i == -1 ? i : com.taobao.themis.kernel.utils.a.a(this.c, i, -1);
    }

    public final a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("8797a9dd", new Object[]{this}) : new a(this);
    }
}
