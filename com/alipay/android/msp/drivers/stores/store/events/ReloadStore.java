package com.alipay.android.msp.drivers.stores.store.events;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class ReloadStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ReloadStore(int i) {
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
        currentPresenter.mo545getIView().addMaskView();
        String actionData = eventAction.getActionData();
        LogUtil.record(4, "phonecashiermsp#flybird", "ReloadEvent:onDialogAction", "reload:".concat(String.valueOf(actionData)));
        JSONObject parseObject = JSON.parseObject(actionData);
        if (!parseObject.containsKey("param")) {
            return "";
        }
        JSONObject jSONObject = parseObject.getJSONObject("param");
        Iterator<String> it = jSONObject.keySet().iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            String next = it.next();
            String string = jSONObject.getString(next);
            sb.append("'");
            sb.append(next);
            sb.append("=");
            sb.append(string);
            sb.append("'");
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        if (StringUtils.isEmpty(sb.toString())) {
            return "";
        }
        PluginManager.getRender().callRenderReload(sb.toString());
        return "";
    }
}
