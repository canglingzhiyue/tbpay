package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavix.feature.a;
import com.taobao.android.behavix.feature.d;

/* loaded from: classes4.dex */
public class dqt extends dqz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-796891558);
    }

    public dqt(BHRTaskConfigBase bHRTaskConfigBase, BHREvent bHREvent) {
        super(bHRTaskConfigBase, bHREvent);
    }

    @Override // tb.dqz
    public void a() {
        a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.c == null || this.b == null) {
        } else {
            JSONObject jsonObject = this.b.toJsonObject();
            JSONObject taskInfo = this.c.getTaskInfo();
            if (taskInfo == null || (a2 = d.a(taskInfo.getString(a.FEATURE_NAME), taskInfo)) == null) {
                return;
            }
            a2.a(jsonObject, new a.InterfaceC0355a() { // from class: tb.dqt.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.behavix.feature.a.InterfaceC0355a
                public void a(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                    } else {
                        dqt.this.c(jSONObject.getInnerMap());
                    }
                }
            });
        }
    }
}
