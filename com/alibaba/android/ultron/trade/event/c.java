package com.alibaba.android.ultron.trade.event;

import com.alibaba.android.ultron.trade.event.model.AutoJumpOpenUrlEventModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class c extends o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_STATUS_AUTO_JUMP = "AutoJumpRequest";
    public static final String KEY_STATUS_H5_ASYNC_REQUEST = "H5AsyncRequest";
    public static final String KEY_STATUS_H5_BACK = "H5Back";

    static {
        kge.a(745019510);
    }

    public c() {
        this.j = 100;
        a();
    }

    @Override // com.alibaba.android.ultron.trade.event.o, com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        AutoJumpOpenUrlEventModel autoJumpOpenUrlEventModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        com.taobao.android.ultron.common.model.b b = b();
        if (b == null || b.getFields() == null) {
            return;
        }
        try {
            autoJumpOpenUrlEventModel = (AutoJumpOpenUrlEventModel) JSON.parseObject(b.getFields().toJSONString(), AutoJumpOpenUrlEventModel.class);
        } catch (Exception unused) {
            UnifyLog.a(this.f.s(), "AutoJumpOpenUrlSubscriber", "onHandleEvent JSON.parseObject failed", new String[0]);
            autoJumpOpenUrlEventModel = null;
        }
        if (autoJumpOpenUrlEventModel == null) {
            return;
        }
        String pageType = autoJumpOpenUrlEventModel.getPageType();
        String url = autoJumpOpenUrlEventModel.getUrl();
        JSONObject params = autoJumpOpenUrlEventModel.getParams();
        if (pageType == null || url == null) {
            UnifyLog.a(this.f.s(), "AutoJumpOpenUrlSubscriber", "type is null or url is null", new String[0]);
        } else if (Boolean.TRUE.toString().equals((String) bmzVar.b("autoJump"))) {
            this.f2670a++;
            bmzVar.a("activityRequestCode", Integer.valueOf(this.f2670a));
            char c = 65535;
            int hashCode = pageType.hashCode();
            if (hashCode != -1968751561) {
                if (hashCode != 2285) {
                    if (hashCode == 2692129 && pageType.equals("Weex")) {
                        c = 2;
                    }
                } else if (pageType.equals("H5")) {
                    c = 1;
                }
            } else if (pageType.equals("Native")) {
                c = 0;
            }
            if (c == 0) {
                UnifyLog.a(this.f.s(), "AutoJumpOpenUrlSubscriber", "跳转到native页面", url);
                a(url, params);
            } else if (c == 1) {
                UnifyLog.a(this.f.s(), "AutoJumpOpenUrlSubscriber", "跳转到h5页面", url);
                a(url, params, autoJumpOpenUrlEventModel.getMethod());
            } else if (c == 2) {
                UnifyLog.a(this.f.s(), "AutoJumpOpenUrlSubscriber", "跳转到weex页面", url);
            }
            this.f.F().b(bmzVar);
        } else {
            autoJumpOpenUrlEventModel.setStatus("AutoJumpRequest");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) "AutoJumpRequest");
            a(b(), jSONObject);
            this.f.F().a(this.h, this.d.f());
            this.f.w().b(this.h);
        }
    }
}
