package com.taobao.taolive.launcherx;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.ImageStrategyDecider;
import tb.kge;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-652797391);
    }

    public void a(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
        } else {
            Coordinator.postTask(new Coordinator.TaggedRunnable("batchFetchImage") { // from class: com.taobao.taolive.launcherx.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    JSONArray parseArray;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    com.taobao.phenix.intf.b h = com.taobao.phenix.intf.b.h();
                    String string = application.getSharedPreferences("taobao_live_home", 0).getString("jingxuanFirstPageImageSp", "");
                    if (TextUtils.isEmpty(string) || (parseArray = JSON.parseArray(string)) == null || parseArray.size() <= 0) {
                        return;
                    }
                    for (int i = 0; i < parseArray.size(); i++) {
                        JSONObject jSONObject = parseArray.getJSONObject(i);
                        if (jSONObject != null) {
                            String string2 = jSONObject.getString("imageUrl");
                            int intValue = jSONObject.getInteger("width").intValue();
                            int intValue2 = jSONObject.getInteger("height").intValue();
                            if (!TextUtils.isEmpty(string2) && intValue > 0 && intValue2 > 0) {
                                h.a(ImageStrategyDecider.decideUrl(string2, Integer.valueOf(intValue), Integer.valueOf(intValue2), null)).limitSize(null, intValue, intValue2).fetch();
                            }
                        }
                    }
                    TLog.loge("TaoLiveNewHomePage", "TaoLiveImagePreLoad batchFetchImage");
                }
            });
        }
    }
}
