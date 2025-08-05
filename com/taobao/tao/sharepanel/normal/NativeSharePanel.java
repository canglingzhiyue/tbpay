package com.taobao.tao.sharepanel.normal;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.globalmodel.f;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.structure.BubbleTipsBean;
import com.taobao.statistic.TBS;
import com.taobao.tao.channel.a;
import com.taobao.tao.channel.b;
import com.taobao.tao.log.TLog;
import com.taobao.tao.sharepanel.normal.view.b;
import com.taobao.tao.util.AnalyticsUtil;
import java.util.List;
import tb.kge;
import tb.nyl;
import tb.nzi;
import tb.oub;
import tb.oui;

/* loaded from: classes8.dex */
public class NativeSharePanel extends oub implements nzi.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG = "TBShareMain";
    private b nativePanel;

    static {
        kge.a(-1007530982);
        kge.a(1048998858);
    }

    public static /* synthetic */ Object ipc$super(NativeSharePanel nativeSharePanel, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ b access$000(NativeSharePanel nativeSharePanel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("62c4a92b", new Object[]{nativeSharePanel}) : nativeSharePanel.nativePanel;
    }

    @Override // tb.oub
    public void initSharePanel(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d4f16ee", new Object[]{this, activity});
            return;
        }
        this.nativePanel = new b(activity, this.mShareActionDispatcher);
        this.mSharePanel = new com.taobao.share.ui.engine.render.b(activity);
        this.mSharePanel.a(this.nativePanel);
        this.mSharePanel.a(new PopupWindow.OnDismissListener() { // from class: com.taobao.tao.sharepanel.normal.NativeSharePanel.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                    return;
                }
                try {
                    NativeSharePanel.access$000(NativeSharePanel.this).g();
                    if (!NativeSharePanel.access$000(NativeSharePanel.this).b() || activity == null) {
                        return;
                    }
                    LocalBroadcastManager.getInstance(activity.getApplication()).sendBroadcast(new Intent("action.share_dialog_close"));
                } catch (Exception unused) {
                }
            }
        });
        this.mShareActionDispatcher.a(this.mSharePanel);
        com.taobao.tao.channel.b.a().a(this.mShareContext.a(), (b.a) this, true);
    }

    @Override // tb.oub
    public void initPanelData(TBShareContent tBShareContent, a aVar, String str, int i, boolean z, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3deb0dfb", new Object[]{this, tBShareContent, aVar, str, new Integer(i), new Boolean(z), str2, str3, str4});
            return;
        }
        tBShareContent.templateId = "common";
        if (!com.alibaba.ability.localization.b.b()) {
            prepareShareView(tBShareContent, false);
            prepareChannelData(aVar);
            return;
        }
        prepareShareView(tBShareContent, z);
        prepareFriendsData(z);
        prepareChannelData(aVar);
        prepareWeexData(tBShareContent, str4);
    }

    private void prepareWeexData(TBShareContent tBShareContent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("785fdede", new Object[]{this, tBShareContent, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            f fVar = new f();
            fVar.b = str;
            this.nativePanel.a(tBShareContent, fVar);
        }
    }

    private void prepareChannelData(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f13cf207", new Object[]{this, aVar});
        } else {
            this.nativePanel.e().a(com.taobao.tao.channel.b.a().a(aVar.a(), this.mShareContext));
        }
    }

    private void prepareFriendsData(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8cf3ad5", new Object[]{this, new Boolean(z)});
            return;
        }
        if (TextUtils.equals("false", nyl.b())) {
            z = false;
        }
        if (ShareBizAdapter.getInstance().getFriendsProvider() == null) {
            z = false;
        }
        if (TextUtils.isEmpty(ShareBizAdapter.getInstance().getLogin().a())) {
            this.nativePanel.e().a((List<com.taobao.share.globalmodel.b>) null, new BubbleTipsBean());
        } else if (z) {
            try {
                if (ShareBizAdapter.getInstance().getFriendsProvider() == null) {
                    this.nativePanel.c();
                } else {
                    ShareBizAdapter.getInstance().getFriendsProvider().a(1, this);
                }
            } catch (Exception e) {
                TLog.loge("TBShareMain", "onFriendsProvider setDataAndSendPoint err:" + e.getMessage());
                e.printStackTrace();
                this.nativePanel.c();
            }
        } else {
            this.nativePanel.c();
        }
    }

    private void prepareShareView(TBShareContent tBShareContent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d2feeb", new Object[]{this, tBShareContent, new Boolean(z)});
            return;
        }
        this.nativePanel.a(tBShareContent.templateId, z);
        oui ouiVar = new oui();
        ouiVar.a(this.mShareContext);
        ouiVar.a(tBShareContent);
        this.nativePanel.a(ouiVar);
    }

    @Override // tb.nzi.a
    public void onFriendsProvider(Object obj, Object obj2, int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba85066", new Object[]{this, obj, obj2, new Integer(i), new Integer(i2)});
            return;
        }
        List<com.taobao.share.globalmodel.b> list = (List) obj;
        BubbleTipsBean bubbleTipsBean = (BubbleTipsBean) obj2;
        TBShareContent j = e.b().j();
        String str = null;
        if (j != null) {
            str = j.businessId + "," + j.templateId + "," + ShareBizAdapter.getInstance().getLogin().a();
        }
        String str2 = "";
        if (list == null || list.size() <= 0) {
            this.nativePanel.c();
            if (j != null) {
                str2 = j.businessId;
            }
            TBS.Ext.commitEvent("Page_Share", 19999, "Page_Share_Contact_NoData", str2, null, str);
            return;
        }
        for (com.taobao.share.globalmodel.b bVar : list) {
            bVar.a(this.mShareContext);
        }
        this.nativePanel.e().a(list, bubbleTipsBean);
        if (i2 == 0 && i > 0) {
            if (j != null) {
                str2 = j.businessId;
            }
            TBS.Ext.commitEvent("Page_Share", 19999, "Page_Share_Contact_AllRecommend-Show", str2, null, str);
        }
        if (i > 0 && list.size() - 1 > i) {
            z = true;
        }
        if (z && j != null) {
            this.nativePanel.a(j.templateId);
        }
        AnalyticsUtil.contactShowEvent(list, j, e.b().k(), str);
    }
}
