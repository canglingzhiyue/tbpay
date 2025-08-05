package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* loaded from: classes2.dex */
public class bma implements bmb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IS_CHECKED = "isChecked";

    static {
        kge.a(414068844);
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
                if (!iDMComponent2.getFields().containsKey("isChecked") || !Boolean.TRUE.toString().equals(iDMComponent2.getFields().getString("isChecked"))) {
                    return;
                }
                a(iDMComponent);
            } catch (Throwable th) {
                UnifyLog.d("MutexListenerParser", th.toString());
            }
        }
    }

    private void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
            return;
        }
        JSONObject fields = iDMComponent.getFields();
        if (fields == null) {
            fields = new JSONObject();
        }
        fields.put("isChecked", (Object) Boolean.FALSE.toString());
        iDMComponent.writeBackFields(fields, true);
    }
}
