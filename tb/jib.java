package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.f;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tao.log.statistics.d;
import com.uploader.export.e;
import com.uploader.export.g;
import com.uploader.export.i;
import com.uploader.export.j;
import com.uploader.export.l;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class jib implements oli {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f29569a;
    private i b;
    private g c;

    @Override // tb.oli
    public void a(olm olmVar, String str, olf olfVar) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc923019", new Object[]{this, olmVar, str, olfVar});
            return;
        }
        File file2 = new File(str);
        HashMap hashMap = new HashMap();
        hashMap.put("fileName", file2.getName());
        hashMap.put("fileSize", String.valueOf(file2.length()));
        hashMap.put(d.PARAM_UPLOAD_ID, olmVar.g);
        hashMap.put(d.PARAM_TASK_ID, olmVar.g);
        TLogEventHelper.a(d.UT_TLOG_ARUP_REQUEST, hashMap);
        if (olmVar.r == null) {
            String value = ErrorCode.DATA_EMPTY.getValue();
            f.a().h().b(oko.h, olmVar.g, "[ARUP Uploader] UploaderParam is null");
            TLogEventHelper.a(d.UT_TLOG_ARUP_ERR, value, "[ARUP Uploader] UploaderParam is null", hashMap);
            if (olfVar == null) {
                return;
            }
            olfVar.a(str, value, "[ARUP Uploader] UploaderParam is null");
            return;
        }
        Context context = olmVar.n;
        final String str2 = olmVar.o;
        final String str3 = olmVar.f29553a;
        String str4 = olmVar.r.get("arupBizType");
        String str5 = olmVar.r.get("ossObjectKey");
        if (str4 == null || str5 == null) {
            String value2 = ErrorCode.DATA_EMPTY.getValue();
            f.a().h().b(oko.h, olmVar.g, "[ARUP Uploader] BizType os ObjectKey is null");
            TLogEventHelper.a(d.UT_TLOG_ARUP_ERR, value2, "[ARUP Uploader] BizType os ObjectKey is null", hashMap);
            if (olfVar == null) {
                return;
            }
            olfVar.a(str, value2, "[ARUP Uploader] BizType os ObjectKey is null");
            return;
        }
        this.c = l.a();
        if (!this.c.isInitialized()) {
            this.c.initialize(context, new rpb(context, new rpc(context) { // from class: tb.jib.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.rpc, com.uploader.export.IUploaderEnvironment
                public int getEnvironment() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("487b46d7", new Object[]{this})).intValue();
                    }
                    return 0;
                }

                @Override // tb.rpc, com.uploader.export.IUploaderEnvironment
                public String getAppVersion() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("65f009ac", new Object[]{this}) : str2;
                }

                @Override // tb.rpc, com.uploader.export.IUploaderEnvironment
                public String getAppKey() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("49079005", new Object[]{this}) : str3;
                }
            }));
        }
        b bVar = new b();
        bVar.f = olmVar.g;
        bVar.f29572a = str4;
        bVar.d = ".log";
        if (bVar.g == null) {
            bVar.g = new HashMap();
        }
        if (this.f29569a != null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("action", JSON.toJSON(this.f29569a).toString());
            bVar.g.putAll(hashMap2);
        }
        bVar.g.put("arupBizType", str4);
        bVar.g.put("ossObjectKey", str5);
        try {
            if (!StringUtils.isEmpty(olmVar.p)) {
                File file3 = new File(olmVar.p);
                if (!file3.exists()) {
                    file3.mkdirs();
                }
                file = jia.a(file2, new File(file3, file2.getName()));
            } else {
                file = null;
            }
            if (file != null && file.exists()) {
                String.format("Copy to %s, length=%d", file.getAbsolutePath(), Long.valueOf(file.length()));
                bVar.b = file.getAbsolutePath();
                bVar.e = String.valueOf(file.length());
            } else {
                bVar.b = str;
                bVar.e = String.valueOf(file2.length());
            }
            bVar.c = str;
            bVar.h = System.currentTimeMillis();
            this.b = bVar;
            hashMap.put("fileSize", bVar.e);
            TLogEventHelper.a(d.UT_TLOG_ARUP_START, hashMap);
            f.a().h().a(oko.h, olmVar.g, String.format("[ARUP Uploader] Upload file：%s, Size: %s", bVar.b, bVar.e));
            if (this.c.uploadAsync(this.b, new a(olfVar), null)) {
                return;
            }
            String value3 = ErrorCode.NET_ERROR.getValue();
            TLogEventHelper.a(d.UT_TLOG_ARUP_ERR, value3, "[ARUP Uploader] Invoke uploadAsync failed!", hashMap);
            f.a().h().a(oko.h, olmVar.g, "[ARUP Uploader] Invoke uploadAsync failed!");
            if (olfVar == null) {
                return;
            }
            olfVar.a(str, value3, "[ARUP Uploader] Invoke uploadAsync failed!");
        } catch (Exception e) {
            String value4 = ErrorCode.CODE_EXC.getValue();
            String str6 = "[ARUP Uploader] Exception: " + e.toString();
            f.a().h().a(oko.h, olmVar.g, e);
            TLogEventHelper.a(d.UT_TLOG_ARUP_ERR, value4, str6, hashMap);
            if (olfVar == null) {
                return;
            }
            olfVar.a(str, value4, str6);
        }
    }

    @Override // tb.oli
    public oll a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oll) ipChange.ipc$dispatch("f08bccf", new Object[]{this});
        }
        oll ollVar = new oll();
        ollVar.f32157a = "arup";
        return ollVar;
    }

    /* loaded from: classes6.dex */
    public static class a implements com.uploader.export.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public olf f29571a;

        @Override // com.uploader.export.d
        public void onPause(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88a48f02", new Object[]{this, iVar});
            }
        }

        @Override // com.uploader.export.d
        public void onProgress(i iVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43b04c96", new Object[]{this, iVar, new Integer(i)});
            }
        }

        @Override // com.uploader.export.d
        public void onResume(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc5b564d", new Object[]{this, iVar});
            }
        }

        @Override // com.uploader.export.d
        public void onStart(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93ee4d16", new Object[]{this, iVar});
            }
        }

        @Override // com.uploader.export.d
        public void onWait(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1be90445", new Object[]{this, iVar});
            }
        }

        public a(olf olfVar) {
            this.f29571a = olfVar;
        }

        @Override // com.uploader.export.d
        public void onSuccess(i iVar, e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0ea4aef", new Object[]{this, iVar, eVar});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("fileName", new File(iVar.getFilePath()).getName());
            if (!(iVar instanceof b)) {
                return;
            }
            b bVar = (b) iVar;
            hashMap.put(d.PARAM_UPLOAD_ID, bVar.f);
            hashMap.put(d.PARAM_TASK_ID, bVar.f);
            hashMap.put("fileSize", bVar.e);
            hashMap.put("costTime", String.valueOf(System.currentTimeMillis() - bVar.h));
            TLogEventHelper.a(d.UT_TLOG_ARUP_SUCCESS, hashMap);
            olf olfVar = this.f29571a;
            if (olfVar == null) {
                return;
            }
            olfVar.a(bVar.c, eVar.b());
        }

        @Override // com.uploader.export.d
        public void onFailure(i iVar, j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b751f291", new Object[]{this, iVar, jVar});
                return;
            }
            File file = new File(iVar.getFilePath());
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", String.format("%s,%s", jVar.f24058a, jVar.b));
            hashMap.put("errMsg", jVar.c);
            hashMap.put("fileName", file.getAbsolutePath());
            if (!(iVar instanceof b)) {
                return;
            }
            b bVar = (b) iVar;
            hashMap.put(d.PARAM_UPLOAD_ID, bVar.f);
            hashMap.put(d.PARAM_TASK_ID, bVar.f);
            if (file.exists()) {
                hashMap.put("fileSize", bVar.e);
            } else {
                hashMap.put("fileSize", "-1");
            }
            TLogEventHelper.a(d.UT_TLOG_ARUP_ERR, hashMap);
            String str = jVar.f24058a + ":" + jVar.b;
            f.a().h().b(oko.h, bVar.f, str);
            olf olfVar = this.f29571a;
            if (olfVar == null) {
                return;
            }
            olfVar.a(bVar.c, str, jVar.c);
        }

        @Override // com.uploader.export.d
        public void onCancel(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("227e67e0", new Object[]{this, iVar});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("fileName", iVar.getFilePath());
            if (!(iVar instanceof b)) {
                return;
            }
            b bVar = (b) iVar;
            hashMap.put(d.PARAM_UPLOAD_ID, bVar.f);
            hashMap.put(d.PARAM_TASK_ID, bVar.f);
            hashMap.put("fileSize", bVar.e);
            TLogEventHelper.a(d.UT_TLOG_ARUP_CANCEL, hashMap);
            f.a().h().b(oko.h, bVar.f, "The upload task is canceled!");
            olf olfVar = this.f29571a;
            if (olfVar == null) {
                return;
            }
            olfVar.a(bVar.c, "Cancel", "The upload task is canceled!");
        }
    }

    /* loaded from: classes6.dex */
    public static class b implements i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f29572a;
        public String b;
        public String c;
        public String d;
        public String e = "";
        public String f = "";
        public Map<String, String> g;
        public long h;

        @Override // com.uploader.export.i
        public String getBizType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this}) : this.f29572a;
        }

        @Override // com.uploader.export.i
        public String getFilePath() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this}) : this.b;
        }

        @Override // com.uploader.export.i
        public String getFileType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("105a7e2d", new Object[]{this}) : this.d;
        }

        @Override // com.uploader.export.i
        public Map<String, String> getMetaInfo() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8d01c005", new Object[]{this}) : this.g;
        }
    }
}
