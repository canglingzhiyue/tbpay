package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ScanCardStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ScanCardStore(int i) {
        super(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        char c = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.c == null || this.c.getCurrentPresenter() == null) {
            return null;
        }
        MspBasePresenter currentPresenter = this.c.getCurrentPresenter();
        if (currentPresenter.mo545getIView() == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject actionParamsJson = mspEvent.getActionParamsJson();
            if (!actionParamsJson.containsKey("type")) {
                return "";
            }
            String string = actionParamsJson.getString("type");
            switch (string.hashCode()) {
                case -699752582:
                    if (string.equals("isOCRSupported")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -191501435:
                    if (string.equals("feedback")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3291998:
                    if (string.equals("kill")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3529469:
                    if (string.equals("show")) {
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                String string2 = actionParamsJson.getString("ocrImageFormat");
                if (TextUtils.isEmpty(string2)) {
                    string2 = BlobManager.UPLOAD_IMAGE_TYPE_JPEG;
                }
                int intValue = actionParamsJson.getIntValue("ocrImageQuality");
                if (intValue <= 0 || intValue > 100) {
                    intValue = 100;
                }
                return currentPresenter.getActivity() != null ? PhoneCashierMspEngine.getMspOcr().startOCR(currentPresenter.getActivity(), string2, intValue) : "";
            } else if (c == 1) {
                PhoneCashierMspEngine.getMspOcr().finishOCRView();
                PhoneCashierMspEngine.getMspOcr().stopOCR(null);
                return "";
            } else if (c == 2) {
                jSONObject.put("isOCRSupported", (Object) Boolean.valueOf(PhoneCashierMspEngine.getMspOcr().supportOCR()));
                return jSONObject.toJSONString();
            } else if (c != 3) {
                return "";
            } else {
                PhoneCashierMspEngine.getMspOcr().stopOCR(actionParamsJson.getString("cardNo"));
                return "";
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return "";
        }
    }
}
