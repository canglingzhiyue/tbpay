package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavir.e;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.util.d;
import com.taobao.android.behavir.util.g;
import com.taobao.android.behavir.util.l;
import com.taobao.android.behavix.utils.Debuggable;
import com.taobao.android.testutils.log.LogUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class dqu extends dqz implements dqw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1224173437);
        kge.a(488156255);
    }

    public abstract void a(JSONObject jSONObject);

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        }
    }

    public abstract void b(JSONObject jSONObject);

    public dqu(BHRTaskConfigBase bHRTaskConfigBase, BHREvent bHREvent) {
        super(bHRTaskConfigBase, bHREvent);
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
            LogUtils.c(LogUtils.BR_BIZ_NAME, "PythonTask", "createEventBySuccess result is null.");
        } else {
            HashMap hashMap = null;
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                    hashMap = new HashMap(jSONObject2);
                }
            } catch (Exception e) {
                d.a("PythonTask", "createEventBySuccess", e.getMessage());
            }
            c(hashMap);
        }
    }

    public void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
            LogUtils.c(LogUtils.BR_BIZ_NAME, "PythonTask", "createEventByError result is null.");
        } else {
            JSONObject a2 = g.a("success", false, "errorCode", "BRPythonTask_" + l.b(jSONObject), "errorMsg", "BRPythonTask_" + l.c(jSONObject));
            a2.putAll(jSONObject);
            c((Map<String, Object>) a2);
        }
    }

    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        JSONObject taskInfo = this.c.getTaskInfo();
        if (taskInfo == null) {
            return;
        }
        String string = taskInfo.getString(noa.KEY_MODEL_NAME);
        if (TextUtils.isEmpty(string)) {
            string = taskInfo.getString("pythonName");
        }
        boolean booleanValue = taskInfo.getBooleanValue("isAlias");
        if (map != null) {
            Object obj = map.get("bizCustomPythonName");
            Object obj2 = map.get("bizCustomIsAlias");
            if (obj instanceof String) {
                string = (String) obj;
            }
            if (obj2 instanceof Boolean) {
                booleanValue = ((Boolean) obj2).booleanValue();
            }
        }
        a(string);
        e.a(string, map, booleanValue, new com.taobao.android.behavix.task.d() { // from class: tb.dqu.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.behavix.task.d
            public void a(String str, JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
                    return;
                }
                dqu.this.a(jSONObject);
                dqu.this.c(jSONObject);
            }

            @Override // com.taobao.android.behavix.task.d
            public void a(String str, String str2, String str3, JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9d5d0b6a", new Object[]{this, str, str2, str3, jSONObject});
                    return;
                }
                dqu.this.b(jSONObject);
                dqu.this.d(jSONObject);
                d.a("PythonTask", jSONObject);
            }
        }, taskInfo.getIntValue("algTimeout"));
        LogUtils.c(LogUtils.BR_BIZ_NAME, "PythonTask", "sync task is running.", string);
    }

    @Override // tb.dqz
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a(C_());
        }
    }

    @Override // tb.dqz
    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (Debuggable.isDebug()) {
            throw new UnsupportedOperationException();
        } else {
            a((Map<String, Object>) null);
        }
    }
}
