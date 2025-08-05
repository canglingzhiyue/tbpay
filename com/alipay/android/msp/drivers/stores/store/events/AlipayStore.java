package com.alipay.android.msp.drivers.stores.store.events;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.certpay.CertPayManager;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.net.URLEncoder;

/* loaded from: classes3.dex */
public class AlipayStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public AlipayStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspBasePresenter currentPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.d == null || this.c == null || this.b == null || (currentPresenter = this.c.getCurrentPresenter()) == null || currentPresenter.mo545getIView() == null) {
            return null;
        }
        try {
            JSONObject actionParamsJson = mspEvent.getActionParamsJson();
            if (actionParamsJson == null) {
                return "";
            }
            String orderInfo = this.b.getOrderInfo();
            StringBuilder sb = new StringBuilder();
            sb.append(orderInfo);
            for (String str : actionParamsJson.keySet()) {
                String string = actionParamsJson.getString(str);
                if (orderInfo.contains("=\"")) {
                    sb.append("&");
                    sb.append(str);
                    sb.append("=\"");
                    sb.append(string);
                    sb.append("\"");
                } else {
                    sb.append("&");
                    sb.append(str);
                    sb.append("=");
                    sb.append(string);
                }
            }
            CertPayManager certPayManager = CertPayManager.getInstance(this.d);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.b.getBizId());
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb.toString().hashCode());
            certPayManager.updateCertPaySession(sb3, sb4.toString());
            try {
                currentPresenter.mo545getIView().showLoadingView(LanguageHelper.localizedStringForKey("mini_loading_certpay", this.d.getString(R.string.mini_loading_certpay), new Object[0]));
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("alipays://platformapi/startApp?appId=20000125&orderSuffix=");
            sb5.append(URLEncoder.encode(sb.toString(), "utf8"));
            sb5.append("&certPaySession=");
            sb5.append(sb.toString().hashCode());
            CertPayManager certPayManager2 = CertPayManager.getInstance(this.d);
            StringBuilder sb6 = new StringBuilder();
            sb6.append(orderInfo.hashCode());
            String callBackUrl = certPayManager2.getCallBackUrl(sb6.toString());
            if (callBackUrl != null) {
                sb5.append("&certPayCallBackUrl=");
                sb5.append(URLEncoder.encode(callBackUrl, "utf8"));
            }
            sb5.append("&certPaypid=");
            sb5.append(Process.myPid());
            sb5.append("&packageName=");
            sb5.append(currentPresenter.getActivity().getPackageName());
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(sb5.toString()));
            intent.addCategory("android.intent.category.BROWSABLE");
            currentPresenter.mo545getIView().openActivity(intent, null);
            return "";
        } catch (Exception e2) {
            LogUtil.printExceptionStackTrace(e2);
            return "";
        }
    }
}
