package com.taobao.share.ui.engine.render;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.jsbridge.TBWeexShare;
import com.taobao.statistic.TBS;
import com.ut.share.business.interf.IShareContainer;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes8.dex */
public class PanelWindow extends PopupWindow {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public FrameLayout container;
    private BroadcastReceiver dismissReceiver = new BroadcastReceiver() { // from class: com.taobao.share.ui.engine.render.PanelWindow.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z;
            TBShareContent j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            try {
                z = new JSONObject(intent.getStringExtra("data")).getBoolean("isClickCancel");
            } catch (Throwable th) {
                th.printStackTrace();
                z = false;
            }
            if (z && (j = e.b().j()) != null) {
                String str = j != null ? j.businessId : "";
                TBS.Ext.commitEvent("Page_Share", 19999, "Cancel", str, null, j.businessId + "," + j.templateId + ",0," + ShareBizAdapter.getInstance().getLogin().a());
            }
            PanelWindow.this.dismiss();
        }
    };

    /* loaded from: classes8.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(1116232400);
    }

    public static /* synthetic */ Object ipc$super(PanelWindow panelWindow, String str, Object... objArr) {
        if (str.hashCode() == -1373052399) {
            super.dismiss();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public PanelWindow(Activity activity) {
        this.container = createContainer(activity);
        FrameLayout frameLayout = this.container;
        if (frameLayout == null) {
            throw new RuntimeException("PanelWindow createContainer is null");
        }
        setContentView(frameLayout);
        setWidth(-1);
        setHeight(-1);
        setSoftInputMode(16);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(TBWeexShare.ACTION_CLOSE_SHARE_PANEL);
        intentFilter.addAction("share_receiver_close_share_menu");
        LocalBroadcastManager.getInstance(ShareBizAdapter.getInstance().getAppEnv().b()).registerReceiver(this.dismissReceiver, intentFilter);
    }

    public FrameLayout createContainer(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("e98a02db", new Object[]{this, activity});
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(Color.parseColor("#7F000000"));
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.share.ui.engine.render.PanelWindow.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    PanelWindow.this.dismiss();
                }
            }
        });
        return frameLayout;
    }

    public void show(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7429b556", new Object[]{this, activity});
        } else if (activity == null) {
        } else {
            setFocusable(false);
            update();
            View view = null;
            try {
                if (activity instanceof IShareContainer) {
                    view = ((IShareContainer) activity).getShareContainer();
                }
                if (view == null) {
                    view = activity.getWindow().getDecorView();
                }
                showAtLocation(view, 0, 0, 0);
            } catch (WindowManager.BadTokenException unused) {
            }
            setFocusable(true);
            update();
        }
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        com.taobao.share.ui.engine.jsbridge.a.a().a((WVCallBackContext) null);
        e.b().b(false);
        LocalBroadcastManager.getInstance(ShareBizAdapter.getInstance().getAppEnv().b()).unregisterReceiver(this.dismissReceiver);
        LocalBroadcastManager.getInstance(ShareBizAdapter.getInstance().getAppEnv().b()).sendBroadcast(new Intent("action.share_dialog_close"));
        try {
            super.dismiss();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        com.taobao.share.ui.engine.jsbridge.a.a().a((WVCallBackContext) null);
        e.b().b(false);
        LocalBroadcastManager.getInstance(ShareBizAdapter.getInstance().getAppEnv().b()).unregisterReceiver(this.dismissReceiver);
        try {
            super.dismiss();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
