package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* loaded from: classes2.dex */
public class blz implements bmb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IS_CHECKED = "isChecked";

    static {
        kge.a(249371269);
        kge.a(-410892932);
    }

    @Override // tb.bmb
    public void a(IDMComponent iDMComponent, IDMComponent iDMComponent2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca22108", new Object[]{this, iDMComponent, iDMComponent2, jSONObject});
        } else if (iDMComponent2 == null || iDMComponent == null) {
        } else {
            try {
                if (!iDMComponent2.getFields().containsKey("isChecked")) {
                    return;
                }
                boolean equals = Boolean.TRUE.toString().equals(iDMComponent2.getFields().getString("isChecked"));
                JSONObject data = iDMComponent.getData();
                if (data == null) {
                    data = new JSONObject();
                }
                if (equals) {
                    data.remove("status");
                } else {
                    data.put("status", "hidden");
                }
                iDMComponent.writeBackData(data, true);
            } catch (Throwable th) {
                UnifyLog.d("CheckHiddenListener", th.toString());
            }
        }
    }
}
