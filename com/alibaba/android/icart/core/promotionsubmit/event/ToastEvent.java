package com.alibaba.android.icart.core.promotionsubmit.event;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.List;
import tb.bdy;
import tb.jqg;
import tb.kge;

/* loaded from: classes2.dex */
public class ToastEvent extends BaseEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String toastTexts;

    static {
        kge.a(-1998493691);
    }

    @Override // com.alibaba.android.icart.core.promotionsubmit.event.BaseEvent
    public BaseEvent initEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseEvent) ipChange.ipc$dispatch("9a19a69d", new Object[]{this});
        }
        if (this.eventParams != null) {
            this.toastTexts = this.eventParams.getString("toastTexts");
        }
        return this;
    }

    @Override // com.alibaba.android.icart.core.promotionsubmit.event.BaseEvent
    public void runEvent(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1adc7e", new Object[]{this, context, jSONObject});
            return;
        }
        setContext(context);
        if (context == null) {
            return;
        }
        if (this.isModalBuy && jSONObject != null && jSONObject.containsKey("successNum") && !jSONObject.containsKey("failedNum")) {
            jqg.b("iCart", "极简浮层下单，领券成功不弹出toast");
            return;
        }
        List<String> catchPlaceHolder = catchPlaceHolder(this.toastTexts);
        if (catchPlaceHolder != null && catchPlaceHolder.size() > 0 && jSONObject != null) {
            for (String str : catchPlaceHolder) {
                Object obj = jSONObject.get(str);
                if (obj != null) {
                    String str2 = this.toastTexts;
                    this.toastTexts = str2.replaceAll("\\$\\{" + str + "\\}", obj.toString());
                }
            }
        }
        if (bdy.a()) {
            Toast.makeText(context, this.toastTexts, 1).show();
        } else {
            View inflate = LayoutInflater.from(context).inflate(R.layout.icart_promotion_submit, (ViewGroup) null);
            ((TextView) inflate.findViewById(R.id.tv_content)).setText(this.toastTexts);
            Toast toast = new Toast(context);
            toast.setGravity(17, 0, 0);
            toast.setDuration(1);
            toast.setView(inflate);
            toast.show();
        }
        if (this.finishedListener == null) {
            return;
        }
        this.finishedListener.a(null);
    }
}
