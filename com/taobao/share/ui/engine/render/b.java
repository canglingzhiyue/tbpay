package com.taobao.share.ui.engine.render;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.render.PanelWindow;
import com.taobao.share.ui.engine.weex.WeexBizView;
import com.taobao.vessel.VesselView;
import com.taobao.vessel.base.VesselBaseView;
import com.ut.share.business.ShareBusiness;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_SHARE_DIALOG_CLOSE = "action.share_dialog_close";

    /* renamed from: a  reason: collision with root package name */
    public a f19682a;
    public VesselView b;
    public com.taobao.share.ui.engine.weex.a c;
    public boolean e;
    public com.taobao.share.globalmodel.b f;
    private PanelWindow g;
    public WeexBizView i;
    public Handler d = new Handler(Looper.getMainLooper());
    private PanelWindow.a h = new PanelWindow.a() { // from class: com.taobao.share.ui.engine.render.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.share.ui.engine.render.PanelWindow.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (b.a(b.this) == null) {
            } else {
                com.taobao.android.share.resource.a.a().a(b.this.i, com.taobao.android.share.resource.a.SHARE_PANEL_DESTROY);
                b.a(b.this).dismiss();
            }
        }
    };

    static {
        kge.a(-840213975);
    }

    public static /* synthetic */ PanelWindow a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PanelWindow) ipChange.ipc$dispatch("d511397c", new Object[]{bVar}) : bVar.g;
    }

    public b(Activity activity) {
        this.g = new PanelWindow(activity);
    }

    public void a(com.taobao.share.ui.engine.weex.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8512fef1", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    public void a(a aVar) {
        PanelWindow panelWindow;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aacb7c", new Object[]{this, aVar});
        } else if (aVar == null || (panelWindow = this.g) == null) {
        } else {
            this.f19682a = aVar;
            if (!panelWindow.isShowing()) {
                this.g.show((Activity) aVar.a().getContext());
            }
            this.g.container.removeAllViews();
            this.g.container.addView(aVar.a());
            aVar.a(this.h);
        }
    }

    public void a(VesselView vesselView) {
        PanelWindow panelWindow;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db3d4d76", new Object[]{this, vesselView});
        } else if (vesselView == null || (panelWindow = this.g) == null) {
        } else {
            this.b = vesselView;
            if (!panelWindow.isShowing()) {
                this.g.show((Activity) vesselView.getContext());
            }
            this.g.container.removeAllViews();
            this.g.container.addView(vesselView);
        }
    }

    public void a(WeexBizView weexBizView) {
        PanelWindow panelWindow;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98ac8c1b", new Object[]{this, weexBizView});
        } else if (weexBizView == null || (panelWindow = this.g) == null) {
        } else {
            this.i = weexBizView;
            if (!panelWindow.isShowing()) {
                com.taobao.android.share.resource.a.a().a(this.i, com.taobao.android.share.resource.a.SHARE_PANEL_CREATE, com.taobao.android.share.resource.a.SHARE_PANEL_PAGENAME, "https://web.m.taobao.com/app/message-social-front/share-panel/N4?wh_weex=true&weex_mode=dom", null);
                this.g.show((Activity) weexBizView.getContext());
            }
            this.g.container.removeAllViews();
            this.g.container.addView(weexBizView);
        }
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d75cf5eb", new Object[]{this, onDismissListener});
            return;
        }
        PanelWindow panelWindow = this.g;
        if (panelWindow == null) {
            return;
        }
        panelWindow.setOnDismissListener(onDismissListener);
        com.taobao.android.share.resource.a.a().a(this.i, com.taobao.android.share.resource.a.SHARE_PANEL_DESTROY);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.g == null) {
        } else {
            com.taobao.android.share.resource.a.a().a(this.i, com.taobao.android.share.resource.a.SHARE_PANEL_DESTROY);
            this.g.dismiss();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (ShareBizAdapter.getInstance().getFriendsProvider() != null) {
            ShareBizAdapter.getInstance().getFriendsProvider().b();
        }
        com.taobao.share.taopassword.constants.a.a();
        com.taobao.share.ui.engine.weex.a aVar = this.c;
        if (aVar != null) {
            aVar.c();
        }
        this.c = null;
        VesselView vesselView = this.b;
        if (vesselView != null && (vesselView.getChildProxyView() instanceof VesselBaseView)) {
            try {
                ((VesselBaseView) this.b.getChildProxyView()).releaseMemory();
            } catch (Throwable unused) {
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, "close");
        ShareBusiness.getInstance().onSharePanelClosed(hashMap);
        this.g = null;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.g == null) {
        } else {
            com.taobao.android.share.resource.a.a().a(this.i, com.taobao.android.share.resource.a.SHARE_PANEL_DESTROY);
            this.g.close();
        }
    }
}
