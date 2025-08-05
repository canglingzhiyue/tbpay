package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.h;
import com.taobao.android.preload.i;
import com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model.NewDetailBucketModel;
import com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model.PreLoadModel;

/* loaded from: classes7.dex */
public class sgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1139619458);
    }

    public static /* synthetic */ h a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("114f0684", new Object[]{str}) : b(str);
    }

    public static void a(final PreLoadModel preLoadModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49052cc", new Object[]{preLoadModel});
        } else {
            ljd.a().a(new Runnable() { // from class: tb.sgd.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        h a2 = sgd.a(PreLoadModel.this.getBizName());
                        if (a2 == null) {
                            ldf.d("NewDetailPreLoadNotification", "doPreLoadOnScreen preloadTaskLoader is null");
                            return;
                        }
                        ldf.d("NewDetailPreLoadNotification", "doPreLoadOnScreen");
                        a2.a(JSON.toJSONString(PreLoadModel.this));
                        sge.a(sge.UMBRELLA_ON_SCREEN_TAG_ID, PreLoadModel.this);
                    } catch (Throwable th) {
                        ldf.d("NewDetailPreLoadNotification", "doPreLoadOnScreen error." + th.getMessage());
                        sge.a(sge.UMBRELLA_ON_SCREEN_TAG_ID, PreLoadModel.this, th);
                    }
                }
            });
        }
    }

    public static void b(final PreLoadModel preLoadModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2df7cbab", new Object[]{preLoadModel});
        } else {
            ljd.a().a(new Runnable() { // from class: tb.sgd.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        h a2 = sgd.a(PreLoadModel.this.getBizName());
                        if (a2 == null) {
                            ldf.d("NewDetailPreLoadNotification", "doPreLoadOnLayPage preloadTaskLoader is null");
                            return;
                        }
                        ldf.d("NewDetailPreLoadNotification", "doPreLoadOnLayPage");
                        a2.b(JSON.toJSONString(PreLoadModel.this));
                        sge.a(sge.UMBRELLA_LAY_PAGE_TAG_ID, PreLoadModel.this);
                    } catch (Throwable th) {
                        ldf.d("NewDetailPreLoadNotification", "doPreLoadOnLayPage error." + th.getMessage());
                        sge.a(sge.UMBRELLA_LAY_PAGE_TAG_ID, PreLoadModel.this, th);
                    }
                }
            });
        }
    }

    public static void c(final PreLoadModel preLoadModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("575f448a", new Object[]{preLoadModel});
        } else {
            ljd.a().a(new Runnable() { // from class: tb.sgd.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        h a2 = sgd.a(PreLoadModel.this.getBizName());
                        if (a2 == null) {
                            ldf.d("NewDetailPreLoadNotification", "doClearDataSource preloadTaskLoader is null");
                            return;
                        }
                        ldf.d("NewDetailPreLoadNotification", "doClearDataSource");
                        a2.c(JSON.toJSONString(PreLoadModel.this));
                    } catch (Throwable th) {
                        ldf.d("NewDetailPreLoadNotification", "doClearDataSource error." + th.getMessage());
                    }
                }
            });
        }
    }

    public static void a(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else {
            ljd.a().a(new Runnable() { // from class: tb.sgd.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        h a2 = sgd.a((String) null);
                        if (a2 == null) {
                            ldf.d("NewDetailPreLoadNotification", "syncPreLoadSignal preloadTaskLoader is null");
                            return;
                        }
                        NewDetailBucketModel newDetailBucketModel = new NewDetailBucketModel();
                        newDetailBucketModel.setBucketId(JSON.toJSONString(JSONObject.this));
                        String jSONString = JSON.toJSONString(newDetailBucketModel);
                        ldf.d("NewDetailPreLoadNotification", "updateBucket ： " + jSONString);
                        a2.d(jSONString);
                    } catch (Throwable th) {
                        ldf.d("NewDetailPreLoadNotification", "syncPreLoadSignal error." + th.getMessage());
                    }
                }
            });
        }
    }

    private static h b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("3f27a0e3", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            str = "new_detail";
        }
        return i.a(str);
    }
}
