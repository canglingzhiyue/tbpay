package tb;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.preload.PreloadTaskBroadcastReceiver;
import java.util.List;

/* loaded from: classes5.dex */
public final class tbo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Runnable f34011a;

    static {
        kge.a(-343336383);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        Runnable runnable = f34011a;
        if (runnable == null) {
            return;
        }
        jqh.c(runnable);
        f34011a = null;
    }

    public static void a(final bbz bbzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16d505e", new Object[]{bbzVar});
        } else if (!jqi.a("iCart", "enableDetailItemPreloader", true) || bbzVar == null || bbzVar.u() == null) {
        } else {
            a();
            Runnable runnable = new Runnable() { // from class: tb.tbo.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        jqh.a(new Runnable() { // from class: tb.tbo.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                try {
                                    List<List<JSONObject>> a2 = bdn.a(bbz.this, 2);
                                    JSONArray jSONArray = new JSONArray();
                                    int a3 = jqi.a("iCart", "maxPreloadCountForDetail", 3);
                                    for (List<JSONObject> list : a2) {
                                        for (JSONObject jSONObject : list) {
                                            if (jSONObject != null) {
                                                String string = jSONObject.getString("outerUrl");
                                                if (!TextUtils.isEmpty(string)) {
                                                    JSONObject jSONObject2 = new JSONObject();
                                                    jSONObject2.put("url", (Object) string);
                                                    jSONArray.add(jSONObject2);
                                                    if (jSONArray.size() < a3) {
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                    if (jSONArray.isEmpty()) {
                                        return;
                                    }
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("bizName", (Object) "page_detail");
                                    jSONObject3.put("sourceFrom", (Object) "cart");
                                    jSONObject3.put("items", (Object) jSONArray);
                                    Intent intent = new Intent("com.taobao.android.detail.StartPreloadTasks");
                                    intent.setPackage("com.taobao.taobao");
                                    intent.putExtra(PreloadTaskBroadcastReceiver.START_PRELOAD_TASKS, jSONObject3.toJSONString());
                                    FragmentActivity activity = bbz.this.u().getActivity();
                                    if (activity == null) {
                                        return;
                                    }
                                    activity.sendBroadcast(intent);
                                    jqg.b("iCart", "给详情发送预加载广播#商品数量=" + jSONArray.size());
                                } catch (Exception e) {
                                    bed.a("详情预加载报错", e.getMessage());
                                }
                            }
                        });
                    }
                }
            };
            f34011a = runnable;
            jqh.a(runnable, jqi.a("iCart", "preloadVisibleItemForDetailDelayMills", 1000));
        }
    }
}
