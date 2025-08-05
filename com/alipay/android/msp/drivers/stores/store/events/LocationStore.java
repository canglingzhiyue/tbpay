package com.alipay.android.msp.drivers.stores.store.events;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.UserLocation;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;

/* loaded from: classes3.dex */
public class LocationStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public LocationStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
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
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        int i = 60;
        if (actionParamsJson != null) {
            try {
                int intValue = actionParamsJson.getIntValue("timeout");
                if (intValue != 0) {
                    i = intValue;
                }
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
        LogUtil.record(1, "LocationStore:queryLocation", "Max timeout=".concat(String.valueOf(i)));
        String str = "{}";
        UserLocation.locationInit(currentPresenter.mo545getIView() != null ? currentPresenter.getActivity() : GlobalHelper.getInstance().getContext(), Utils.shouldGetLocationInfo(GlobalHelper.getInstance().getContext()));
        boolean isLocationSuccess = UserLocation.isLocationSuccess();
        long locationMilliSinceNow = UserLocation.locationMilliSinceNow();
        if (!isLocationSuccess || locationMilliSinceNow > i) {
            LogUtil.record(1, "LocationStore:queryLocation", "Failed, locationSucc=" + isLocationSuccess + ", locationTimeout=" + locationMilliSinceNow);
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("longitude", (Object) String.format(Locale.CHINA, "%.6f", Double.valueOf(UserLocation.getLongitude())));
            jSONObject.put("latitude", (Object) String.format(Locale.CHINA, "%.6f", Double.valueOf(UserLocation.getLatitude())));
            jSONObject.put(UserLocation.KEY_DOUBLE_ACCURACY, (Object) String.format(Locale.CHINA, "%.6f", Double.valueOf(UserLocation.getAccuracy())));
            str = jSONObject.toJSONString();
            LogUtil.record(1, "LocationStore:queryLocation", "Success, res=".concat(String.valueOf(str)));
            return str;
        } catch (Exception e2) {
            LogUtil.printExceptionStackTrace(e2);
            return str;
        }
    }
}
