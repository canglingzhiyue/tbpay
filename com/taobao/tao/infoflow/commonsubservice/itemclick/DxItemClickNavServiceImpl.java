package com.taobao.tao.infoflow.commonsubservice.itemclick;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.biz.DxItemClickNavService;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import tb.kge;
import tb.ljs;
import tb.oql;

/* loaded from: classes8.dex */
public class DxItemClickNavServiceImpl implements DxItemClickNavService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IDxItemClickService mDxClickService;
    private final IDxItemClickService.OnDxClickNavListener mOnDxClickNavListener = new IDxItemClickService.OnDxClickNavListener() { // from class: com.taobao.tao.infoflow.commonsubservice.itemclick.DxItemClickNavServiceImpl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.OnDxClickNavListener
        public void a(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, Bundle bundle, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71ccf1d8", new Object[]{this, baseSectionModel, baseSubItemModel, bundle, str});
            } else {
                oql.a().a(str);
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.OnDxClickNavListener
        public void onNavFinished(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad70e197", new Object[]{this, new Boolean(z)});
            } else {
                oql.a().a(z);
            }
        }
    };

    static {
        kge.a(1847439933);
        kge.a(-906446124);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mDxClickService = (IDxItemClickService) ljsVar.a(IDxItemClickService.class);
        IDxItemClickService iDxItemClickService = this.mDxClickService;
        if (iDxItemClickService == null) {
            return;
        }
        iDxItemClickService.addDxClickNavListener(this.mOnDxClickNavListener);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IDxItemClickService iDxItemClickService = this.mDxClickService;
        if (iDxItemClickService == null) {
            return;
        }
        iDxItemClickService.removeDxClickNavListener(this.mOnDxClickNavListener);
    }
}
