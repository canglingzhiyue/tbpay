package com.taobao.jacoco;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTUtdid;
import com.taobao.accs.common.Constants;
import com.taobao.android.launcher.common.c;
import com.taobao.jacoco.data.MtopTaobaoCoverageMetaInfoSaveRequest;
import com.taobao.jacoco.data.MtopTaobaoCoverageMetaInfoSaveResponse;
import com.taobao.jacoco.data.MtopTaobaoCoverageMetaInfoSaveResponseData;
import com.taobao.orange.OConstant;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.uploader.export.e;
import com.uploader.export.i;
import com.uploader.export.j;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import org.jacoco.agent.rt.RT;
import tb.kfx;
import tb.kfy;
import tb.kfz;
import tb.kgd;
import tb.rrv;

/* loaded from: classes7.dex */
public class a implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final SimpleDateFormat f17636a = new SimpleDateFormat("yyyy/MM/dd/HH/mm", Locale.ENGLISH);
    private static final AtomicBoolean b = new AtomicBoolean(false);
    private final Context c;
    private final String d;

    public static /* synthetic */ void a(a aVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1202863", new Object[]{aVar, str, str2, str3});
        } else {
            aVar.a(str, str2, str3);
        }
    }

    public a(Context context, String str) {
        this.c = context;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            if (this.c == null) {
                throw new IllegalArgumentException("context == null");
            }
            if (!b.compareAndSet(false, true)) {
                return;
            }
            File b2 = kgd.b(this.c);
            kgd.a(a(), b2);
            if (TextUtils.isEmpty(this.d)) {
                throw new IllegalArgumentException("buildId is empty");
            }
            final String str = this.d;
            final String format = String.format("%s_%s_%s.exec", str, Long.valueOf(System.nanoTime()), Double.valueOf(Math.random()));
            final String str2 = "coverage/meta_data/" + f17636a.format(new Date());
            a(b2, str2, format, new Runnable() { // from class: com.taobao.jacoco.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.a(a.this, str, str2, format);
                    }
                }
            });
        } catch (Throwable th) {
            try {
                Log.e("CodeTrack-DumpJacoco", "", th);
            } finally {
                b.set(false);
            }
        }
    }

    private byte[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a8212175", new Object[]{this});
        }
        byte[] executionData = RT.getAgent().getExecutionData(true);
        if (executionData == null || executionData.length == 0) {
            throw new IllegalStateException("executionData is empty");
        }
        String str = "executionData size = " + executionData.length;
        return executionData;
    }

    private void a(final File file, String str, String str2, final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b53b4471", new Object[]{this, file, str, str2, runnable});
            return;
        }
        kfy kfyVar = new kfy();
        kfyVar.a("tmallwireless-ycombinator");
        kfyVar.c(str);
        kfyVar.d(str2);
        kfyVar.b(file.getPath());
        kfz.a(kfyVar, new kfx() { // from class: com.taobao.jacoco.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str3, Object... objArr) {
                int hashCode = str3.hashCode();
                if (hashCode == -1219366255) {
                    super.onFailure((i) objArr[0], (j) objArr[1]);
                    return null;
                } else if (hashCode != -521516305) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str3));
                } else {
                    super.onSuccess((i) objArr[0], (e) objArr[1]);
                    return null;
                }
            }

            @Override // tb.kfx, com.uploader.export.d
            public void onSuccess(i iVar, e eVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e0ea4aef", new Object[]{this, iVar, eVar});
                    return;
                }
                super.onSuccess(iVar, eVar);
                String str3 = "upload result = " + JSON.toJSONString(eVar);
                runnable.run();
                String str4 = "upload success, delete temp file  == " + kgd.a(file);
            }

            @Override // tb.kfx, com.uploader.export.d
            public void onFailure(i iVar, j jVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b751f291", new Object[]{this, iVar, jVar});
                    return;
                }
                super.onFailure(iVar, jVar);
                String str3 = "upload failure, delete temp file  == " + kgd.a(file);
            }
        });
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        Mtop mtop = Mtop.getInstance(Mtop.Id.INNER);
        if (mtop == null) {
            Log.e("CodeTrack-DumpJacoco", "mtop == null,  wtf");
            return;
        }
        MtopTaobaoCoverageMetaInfoSaveRequest mtopTaobaoCoverageMetaInfoSaveRequest = new MtopTaobaoCoverageMetaInfoSaveRequest();
        mtopTaobaoCoverageMetaInfoSaveRequest.setMtlBuildId(str);
        mtopTaobaoCoverageMetaInfoSaveRequest.setOssObjectKey(str2 + "/" + str3);
        mtopTaobaoCoverageMetaInfoSaveRequest.setParam(b());
        String str4 = "request = " + JSON.toJSONString(mtopTaobaoCoverageMetaInfoSaveRequest);
        MtopBusiness.build(mtop, mtopTaobaoCoverageMetaInfoSaveRequest).mo1305reqMethod(MethodEnum.POST).mo1326setSocketTimeoutMilliSecond(5000).mo1312setConnectionTimeoutMilliSecond(5000).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.jacoco.DumpJacocoTask$3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                Log.e("CodeTrack-DumpJacoco", "system-error, i = " + i);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (!(baseOutDo instanceof MtopTaobaoCoverageMetaInfoSaveResponse)) {
                    Log.e("CodeTrack-DumpJacoco", "success, but baseOutDo is not MtopTaobaoQaCovMetaInfoSaveResponse, wtf ??? ");
                } else {
                    MtopTaobaoCoverageMetaInfoSaveResponseData mo2429getData = ((MtopTaobaoCoverageMetaInfoSaveResponse) baseOutDo).mo2429getData();
                    if (mo2429getData == null || !Boolean.parseBoolean(mo2429getData.getResult())) {
                        return;
                    }
                    Log.e("CodeTrack-DumpJacoco", "success, send record to server success");
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                Log.e("CodeTrack-DumpJacoco", "error, i = " + i);
            }
        }).startRequest(MtopTaobaoCoverageMetaInfoSaveResponse.class);
    }

    private String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        String str = (String) c.a(OConstant.LAUNCH_ONLINEAPPKEY, "");
        if (TextUtils.isEmpty(str)) {
            str = (String) c.a("constantAppkey", "");
        }
        String value = UTUtdid.instance(this.c).getValue();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appKey", (Object) str);
        jSONObject.put("appVersion", (Object) ((String) c.a("appVersion", "")));
        jSONObject.put(Constants.KEY_OS_TYPE, (Object) "ANDROID");
        jSONObject.put("osVersion", (Object) Build.VERSION.RELEASE);
        jSONObject.put("utdid", (Object) value);
        jSONObject.put(rrv.UPLOAD_TIME, (Object) Long.valueOf(System.currentTimeMillis()));
        return JSON.toJSONString(jSONObject);
    }
}
