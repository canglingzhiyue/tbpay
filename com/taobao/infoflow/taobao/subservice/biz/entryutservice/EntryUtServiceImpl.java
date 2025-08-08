package com.taobao.infoflow.taobao.subservice.biz.entryutservice;

import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.biz.IEntryUtService;
import com.taobao.taolive.room.utils.aw;
import tb.kge;
import tb.ldf;
import tb.ljs;
import tb.pqq;

/* loaded from: classes7.dex */
public class EntryUtServiceImpl implements IEntryUtService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "EntryUtServiceImpl";
    private IDxItemClickService mDxItemClickService;
    private IDxItemClickService.OnDxClickNavListener mOnDxClickNavListener;

    static {
        kge.a(-500286790);
        kge.a(-1928253394);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mDxItemClickService = (IDxItemClickService) ljsVar.a(IDxItemClickService.class);
        if (this.mDxItemClickService == null) {
            return;
        }
        if (this.mOnDxClickNavListener == null) {
            this.mOnDxClickNavListener = genNavListener();
        }
        this.mDxItemClickService.addDxClickNavListener(this.mOnDxClickNavListener);
    }

    private IDxItemClickService.OnDxClickNavListener genNavListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDxItemClickService.OnDxClickNavListener) ipChange.ipc$dispatch("a833facf", new Object[]{this}) : new IDxItemClickService.OnDxClickNavListener() { // from class: com.taobao.infoflow.taobao.subservice.biz.entryutservice.EntryUtServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.OnDxClickNavListener
            public void a(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, Bundle bundle, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("71ccf1d8", new Object[]{this, baseSectionModel, baseSubItemModel, bundle, str});
                    return;
                }
                try {
                    Uri parse = Uri.parse(str);
                    if (!StringUtils.equals("true", parse.getQueryParameter("useEntryUtparam"))) {
                        return;
                    }
                    bundle.putString("entryUtParam", parse.getQueryParameter(aw.PARAM_UT_PARAMS));
                    bundle.putString("entrySpm", parse.getQueryParameter("spm"));
                    bundle.putString(pqq.KEY_ENTRY_SCM, parse.getQueryParameter("scm"));
                } catch (Exception e) {
                    ldf.d(EntryUtServiceImpl.TAG, Log.getStackTraceString(e));
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.OnDxClickNavListener
            public /* synthetic */ void onNavFinished(boolean z) {
                IDxItemClickService.OnDxClickNavListener.CC.$default$onNavFinished(this, z);
            }
        };
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IDxItemClickService.OnDxClickNavListener onDxClickNavListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IDxItemClickService iDxItemClickService = this.mDxItemClickService;
        if (iDxItemClickService == null || (onDxClickNavListener = this.mOnDxClickNavListener) == null) {
            return;
        }
        iDxItemClickService.removeDxClickNavListener(onDxClickNavListener);
    }
}
