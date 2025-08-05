package com.taobao.android.tucaoba;

import android.app.Application;
import android.content.SharedPreferences;
import android.taobao.windvane.util.b;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.uploader.export.i;
import com.uploader.export.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.sfg;
import tb.sfh;
import tb.sfi;
import tb.sfj;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final Application f15690a;
    private Long d;
    private CountDownLatch e;
    private String f;
    private final long b = System.currentTimeMillis();
    private long g = 0;
    private final ArrayList<String> c = new ArrayList<>();

    static {
        kge.a(832403943);
    }

    public static /* synthetic */ void lambda$BZX7hQ7b4I6L_ifjJwmtM_OVC44(e eVar, String str, String str2) {
        eVar.c(str, str2);
    }

    public static /* synthetic */ void a(e eVar, String str, Double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("249e2599", new Object[]{eVar, str, d});
        } else {
            eVar.a(str, d);
        }
    }

    public static /* synthetic */ void a(e eVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4962d959", new Object[]{eVar, str, str2});
        } else {
            eVar.b(str, str2);
        }
    }

    public static /* synthetic */ void c(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d46247", new Object[]{eVar});
        } else {
            eVar.c();
        }
    }

    public static /* synthetic */ ArrayList d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("587ab1e2", new Object[]{eVar}) : eVar.c;
    }

    public static /* synthetic */ CountDownLatch e(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CountDownLatch) ipChange.ipc$dispatch("6963442f", new Object[]{eVar}) : eVar.e;
    }

    public static /* synthetic */ void f(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b5ea18a", new Object[]{eVar});
        } else {
            eVar.b();
        }
    }

    public e(Application application) {
        this.f15690a = application;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (sfj.INSTANCE.a(this.f15690a.getApplicationContext())) {
            SharedPreferences sharedPreferences = this.f15690a.getApplicationContext().getSharedPreferences("tucaoba", 0);
            this.f = sharedPreferences.getString("feedbackContent", null);
            String str = this.f;
            if (str == null) {
                return;
            }
            JSONObject parseObject = JSON.parseObject(str);
            if (!parseObject.containsKey(OConstant.DIMEN_COMMIT_TIME)) {
                c();
                return;
            }
            this.d = Long.valueOf(parseObject.getLongValue(OConstant.DIMEN_COMMIT_TIME));
            AppMonitor.Counter.commit("TuCaoBaNativeUploadFeedbackData", "tucaoba_data_upload_offline_counter", 1.0d);
            String string = sharedPreferences.getString("feedbackImages", null);
            if (string != null) {
                ArrayList<String> a2 = a(string);
                this.e = new CountDownLatch(a2.size());
                for (int i = 0; i < a2.size(); i++) {
                    String str2 = a2.get(i);
                    if (!str2.startsWith("http")) {
                        b(str2);
                    } else {
                        this.e.countDown();
                        this.c.add(str2);
                    }
                }
                if (this.e.getCount() != 0) {
                    return;
                }
                b();
                return;
            }
            b();
        }
    }

    private void a(String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        IRemoteBaseListener iRemoteBaseListener = new IRemoteBaseListener() { // from class: com.taobao.android.tucaoba.TuCaoBaDataUpload$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                AppMonitor.Counter.commit("TuCaoBaNativeUploadFeedbackData", "tucaoba_data_upload_offline_success_counter", 1.0d);
                e eVar = e.this;
                long currentTimeMillis = System.currentTimeMillis();
                e eVar2 = e.this;
                e.a(eVar, "tucaoba_data_upload_offline_success_time", Double.valueOf(currentTimeMillis - e.$ipChange));
                e eVar3 = e.this;
                long currentTimeMillis2 = System.currentTimeMillis();
                e eVar4 = e.this;
                e.a(eVar3, "feedback_offline_upload_gap", Double.valueOf(currentTimeMillis2 - e.$ipChange.longValue()));
                JSONObject parseObject = JSON.parseObject(mtopResponse.getDataJsonObject().toString());
                if (parseObject.containsKey("isSuccess")) {
                    String str3 = (String) parseObject.get("isSuccess");
                    if (str3 != null && str3.equals("false")) {
                        String b = sfj.INSTANCE.b();
                        TLog.logd(b, "TuCaoBaUpload", "Mtop onError: " + ((String) parseObject.get("msg")));
                        return;
                    }
                    e.c(e.this);
                    String str4 = parseObject.containsKey("feedbackId") ? (String) parseObject.get("feedbackId") : "";
                    if (str4 == null || str4.equals("")) {
                        return;
                    }
                    e.a(e.this, str2, str4);
                    return;
                }
                String b2 = sfj.INSTANCE.b();
                TLog.logd(b2, "TuCaoBaUpload", "Mtop onError: " + mtopResponse);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                AppMonitor.Counter.commit("TuCaoBaNativeUploadFeedbackData", "tucaoba_data_upload_offline_failed_counter", 1.0d);
                e eVar = e.this;
                long currentTimeMillis = System.currentTimeMillis();
                e eVar2 = e.this;
                e.a(eVar, "tucaoba_data_upload_offline_error_time", Double.valueOf(currentTimeMillis - e.$ipChange));
                String b = sfj.INSTANCE.b();
                TLog.logd(b, "TuCaoBaUpload", "Mtop onError: " + mtopResponse);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                AppMonitor.Counter.commit("TuCaoBaNativeUploadFeedbackData", "tucaoba_data_upload_offline_failed_counter", 1.0d);
                e eVar = e.this;
                long currentTimeMillis = System.currentTimeMillis();
                e eVar2 = e.this;
                e.a(eVar, "tucaoba_data_upload_offline_system_error_time", Double.valueOf(currentTimeMillis - e.$ipChange));
                String b = sfj.INSTANCE.b();
                TLog.logd(b, "TuCaoBaUpload", "Mtop onSystemError: " + mtopResponse);
            }
        };
        this.g = System.currentTimeMillis();
        sfh.a(str, iRemoteBaseListener);
    }

    private void b(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            new Thread(new Runnable() { // from class: com.taobao.android.tucaoba.-$$Lambda$e$BZX7hQ7b4I6L_ifjJwmtM_OVC44
                {
                    e.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    e.lambda$BZX7hQ7b4I6L_ifjJwmtM_OVC44(e.this, str2, str);
                }
            }, "TuCaoBaTLogUploadThread").start();
        }
    }

    public /* synthetic */ void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        new sfg().a(this.f15690a.getApplicationContext(), this.d.longValue() - b.DEFAULT_SMALL_MAX_AGE, this.d.longValue(), str, str2, str2);
        a("tucaoba_tlog_upload_offline_time", Double.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        final String a2 = sfi.a(this.f15690a.getApplicationContext(), str);
        sfi.a(str, a2, new com.uploader.export.d() { // from class: com.taobao.android.tucaoba.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.uploader.export.d
            public void onCancel(i iVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("227e67e0", new Object[]{this, iVar});
                }
            }

            @Override // com.uploader.export.d
            public void onFailure(i iVar, j jVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b751f291", new Object[]{this, iVar, jVar});
                }
            }

            @Override // com.uploader.export.d
            public void onPause(i iVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88a48f02", new Object[]{this, iVar});
                }
            }

            @Override // com.uploader.export.d
            public void onProgress(i iVar, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("43b04c96", new Object[]{this, iVar, new Integer(i)});
                }
            }

            @Override // com.uploader.export.d
            public void onResume(i iVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cc5b564d", new Object[]{this, iVar});
                }
            }

            @Override // com.uploader.export.d
            public void onStart(i iVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93ee4d16", new Object[]{this, iVar});
                }
            }

            @Override // com.uploader.export.d
            public void onWait(i iVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1be90445", new Object[]{this, iVar});
                }
            }

            {
                e.this = this;
            }

            @Override // com.uploader.export.d
            public void onSuccess(i iVar, com.uploader.export.e eVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e0ea4aef", new Object[]{this, iVar, eVar});
                    return;
                }
                e.d(e.this).add(eVar.b());
                e.e(e.this).countDown();
                if (e.e(e.this).getCount() == 0) {
                    e.f(e.this);
                }
                sfi.a(a2);
            }
        });
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            JSONObject b = sfj.INSTANCE.b(this.f);
            if (b == null) {
                return;
            }
            if (this.c.size() > 0) {
                b.put("imageAddrs", (Object) JSON.toJSONString(this.c));
            }
            String string = b.getString("content");
            this.f = JSON.toJSONString(b);
            a(this.f, string);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.f15690a.getApplicationContext().getSharedPreferences("tucaoba", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove("feedbackContent");
        String string = sharedPreferences.getString("feedbackImages", null);
        if (string != null) {
            ArrayList<String> a2 = a(string);
            this.e = new CountDownLatch(a2.size());
            for (int i = 0; i < a2.size(); i++) {
                c(a2.get(i));
            }
        }
        edit.remove("feedbackImages");
        edit.apply();
        a("tucaoba_data_upload_offline_time", Double.valueOf(System.currentTimeMillis() - this.b));
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        File file = new File(str);
        if (!file.exists()) {
            return;
        }
        file.delete();
    }

    public ArrayList<String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("7153230c", new Object[]{this, str});
        }
        String[] split = str.substring(1, str.length() - 1).split(", ");
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, split);
        return arrayList;
    }

    private void a(String str, Double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b472d9bc", new Object[]{this, str, d});
            return;
        }
        AppMonitor.register("TuCaoBaNativeUploadFeedbackData", str, MeasureSet.create().addMeasure("totalTime"));
        AppMonitor.Stat.commit("TuCaoBaNativeUploadFeedbackData", str, (DimensionValueSet) null, MeasureValueSet.create().setValue("totalTime", d.doubleValue()));
    }
}
