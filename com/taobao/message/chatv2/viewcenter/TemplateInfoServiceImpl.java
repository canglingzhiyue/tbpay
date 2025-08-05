package com.taobao.message.chatv2.viewcenter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.chatv2.viewcenter.ITemplateService;
import com.taobao.message.kit.core.DelayInitContainer;
import com.taobao.unit.center.templatesync.ITemplateSyncService;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class TemplateInfoServiceImpl implements ITemplateService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MONITOR_POINT = "getLayoutInfo";
    private static final String TAG = "TemplateInfoService";
    private Map<ITemplateService.ISyncListener, ITemplateSyncService.ISyncListener> cacheListener = new HashMap();

    static {
        kge.a(1255010136);
        kge.a(-903087801);
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0336  */
    @Override // com.taobao.message.chatv2.viewcenter.ITemplateService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.message.chatv2.viewcenter.config.LayoutInfo getLayoutInfo(int r20, com.alibaba.fastjson.JSONObject r21) {
        /*
            Method dump skipped, instructions count: 893
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.chatv2.viewcenter.TemplateInfoServiceImpl.getLayoutInfo(int, com.alibaba.fastjson.JSONObject):com.taobao.message.chatv2.viewcenter.config.LayoutInfo");
    }

    @Override // com.taobao.message.chatv2.viewcenter.ITemplateService
    public void addSyncListener(final ITemplateService.ISyncListener iSyncListener) {
        ITemplateSyncService iTemplateSyncService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a738cf", new Object[]{this, iSyncListener});
        } else if (iSyncListener == null || (iTemplateSyncService = (ITemplateSyncService) DelayInitContainer.getInstance().get(ITemplateSyncService.class)) == null) {
        } else {
            ITemplateSyncService.ISyncListener iSyncListener2 = new ITemplateSyncService.ISyncListener() { // from class: com.taobao.message.chatv2.viewcenter.TemplateInfoServiceImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.unit.center.templatesync.ITemplateSyncService.ISyncListener
                public void onSync() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1150fca1", new Object[]{this});
                    } else {
                        iSyncListener.onSync();
                    }
                }
            };
            iTemplateSyncService.addSyncListener(iSyncListener2);
            this.cacheListener.put(iSyncListener, iSyncListener2);
        }
    }

    @Override // com.taobao.message.chatv2.viewcenter.ITemplateService
    public void removeSyncListener(ITemplateService.ISyncListener iSyncListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86092ccc", new Object[]{this, iSyncListener});
        } else if (iSyncListener == null) {
        } else {
            ITemplateSyncService iTemplateSyncService = (ITemplateSyncService) DelayInitContainer.getInstance().get(ITemplateSyncService.class);
            if (!this.cacheListener.containsKey(iSyncListener)) {
                return;
            }
            iTemplateSyncService.removeSyncListener(this.cacheListener.get(iSyncListener));
        }
    }
}
