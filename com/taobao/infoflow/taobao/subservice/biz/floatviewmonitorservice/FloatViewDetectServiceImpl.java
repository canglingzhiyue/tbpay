package com.taobao.infoflow.taobao.subservice.biz.floatviewmonitorservice;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.interact.pop.d;
import com.taobao.infoflow.protocol.subservice.biz.IFloatViewDetectService;
import com.ut.share.business.ShareBusiness;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.ldf;
import tb.ljs;
import tb.lsk;

/* loaded from: classes7.dex */
public class FloatViewDetectServiceImpl implements IFloatViewDetectService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FloatViewMonitorService";
    private final List<IFloatViewDetectService.a> listeners = new CopyOnWriteArrayList();

    static {
        kge.a(-680977383);
        kge.a(1386484827);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFloatViewDetectService
    public String triggerDetect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74d55b5e", new Object[]{this});
        }
        boolean hasTaoPassword = ShareBusiness.getInstance().hasTaoPassword();
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("hasTaoPwd-> ");
        sb.append(hasTaoPassword ? "有" : "没有");
        sb.append("淘口令");
        strArr[0] = sb.toString();
        ldf.d(TAG, strArr);
        boolean isEmpty = StringUtils.isEmpty(d.d());
        ldf.d(TAG, "isHasPop->：" + isEmpty);
        String str = hasTaoPassword ? "TaoPwd" : isEmpty ? "PopLayer" : "None";
        Iterator<IFloatViewDetectService.a> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return str;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFloatViewDetectService
    public void addFloatViewShowListener(IFloatViewDetectService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40fed231", new Object[]{this, aVar});
        } else {
            this.listeners.add(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFloatViewDetectService
    public void removeFloatViewShowListener(IFloatViewDetectService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f876e14", new Object[]{this, aVar});
        } else {
            this.listeners.remove(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        boolean hasTaoPassword = ShareBusiness.getInstance().hasTaoPassword();
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("hasTaoPwd-> ");
        sb.append(hasTaoPassword ? "有" : "没有");
        sb.append("淘口令");
        strArr[0] = sb.toString();
        ldf.d(lsk.SPLASH_BUSINESS_TAG, strArr);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            this.listeners.clear();
        }
    }
}
