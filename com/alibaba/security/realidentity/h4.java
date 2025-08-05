package com.alibaba.security.realidentity;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.biz.dynamic.model.OssConfig;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.alibaba.security.realidentity.service.upload.UploadFileModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class h4 extends j4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String e = "h4";
    public static final String f = "x-arup-biz-ret";
    public static final String g = "ossBucketName";
    public static final String h = "ossObjectKey";
    public final com.uploader.export.g d;

    /* loaded from: classes3.dex */
    public class a implements com.uploader.export.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UploadFileModel f3437a;
        public final /* synthetic */ Map b;

        public a(UploadFileModel uploadFileModel, Map map) {
            this.f3437a = uploadFileModel;
            this.b = map;
        }

        @Override // com.uploader.export.i
        public String getBizType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this}) : "rp_asset";
        }

        @Override // com.uploader.export.i
        public String getFilePath() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this}) : this.f3437a.mLocalFilePath;
        }

        @Override // com.uploader.export.i
        public String getFileType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("105a7e2d", new Object[]{this}) : this.f3437a.mFileType;
        }

        @Override // com.uploader.export.i
        public Map<String, String> getMetaInfo() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8d01c005", new Object[]{this}) : this.b;
        }
    }

    /* loaded from: classes3.dex */
    public class b implements com.uploader.export.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.uploader.export.i f3438a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;
        public final /* synthetic */ l4 d;

        public b(com.uploader.export.i iVar, long j, long j2, l4 l4Var) {
            this.f3438a = iVar;
            this.b = j;
            this.c = j2;
            this.d = l4Var;
        }

        @Override // com.uploader.export.d
        public void onCancel(com.uploader.export.i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("227e67e0", new Object[]{this, iVar});
            } else {
                this.d.onCancel();
            }
        }

        @Override // com.uploader.export.d
        public void onFailure(com.uploader.export.i iVar, com.uploader.export.j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b751f291", new Object[]{this, iVar, jVar});
                return;
            }
            String a2 = h4.a();
            com.alibaba.security.realidentity.a.a(a2, ">>>>>>>>>>>>>>>> " + jVar.f24058a + " : " + jVar.b + " : " + jVar.c);
            this.d.onError(jVar.toString());
            h4.this.a("oss upload failed", jVar.toString(), this.f3438a.getFilePath());
            h4.this.a(this.f3438a.getFilePath(), this.f3438a.getFileType(), null, jVar.f24058a, jVar.toString(), System.currentTimeMillis() - this.b, this.c);
        }

        @Override // com.uploader.export.d
        public void onPause(com.uploader.export.i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88a48f02", new Object[]{this, iVar});
            }
        }

        @Override // com.uploader.export.d
        public void onProgress(com.uploader.export.i iVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43b04c96", new Object[]{this, iVar, new Integer(i)});
                return;
            }
            long j = this.c;
            this.d.onProgress((i / 100.0f) * j, j);
        }

        @Override // com.uploader.export.d
        public void onResume(com.uploader.export.i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc5b564d", new Object[]{this, iVar});
            }
        }

        @Override // com.uploader.export.d
        public void onStart(com.uploader.export.i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93ee4d16", new Object[]{this, iVar});
            }
        }

        @Override // com.uploader.export.d
        public void onSuccess(com.uploader.export.i iVar, com.uploader.export.e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0ea4aef", new Object[]{this, iVar, eVar});
                return;
            }
            Map<String, String> c = eVar.c();
            String str = null;
            if (c != null && c.containsKey(h4.f)) {
                JSONObject parseObject = JSON.parseObject(c.get(h4.f));
                String string = (parseObject == null || !parseObject.containsKey("ossBucketName")) ? null : parseObject.getString("ossBucketName");
                String string2 = (parseObject == null || !parseObject.containsKey("ossObjectKey")) ? null : parseObject.getString("ossObjectKey");
                if (string != null && string2 != null) {
                    str = "oss://" + string + ":" + string2;
                }
            }
            if (str == null) {
                h4.this.a(this.f3438a.getFilePath(), this.f3438a.getFileType(), str, "-1", "remote url is null", System.currentTimeMillis() - this.b, this.c);
                h4.this.a("oss upload failed", "remote url is null", this.f3438a.getFilePath());
                this.d.onError("remote url is null");
                return;
            }
            h4.this.a(this.f3438a.getFilePath(), this.f3438a.getFileType(), str, "0", null, System.currentTimeMillis() - this.b, this.c);
            this.d.onSuccess(str);
        }

        @Override // com.uploader.export.d
        public void onWait(com.uploader.export.i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1be90445", new Object[]{this, iVar});
            }
        }
    }

    public h4(Context context, String str, u4 u4Var) {
        super(context, str, u4Var);
        this.d = com.uploader.export.l.a();
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : e;
    }

    @Override // com.alibaba.security.realidentity.k4
    public Object a(String str, OssConfig ossConfig, UploadFileModel uploadFileModel, l4 l4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ae97a409", new Object[]{this, str, ossConfig, uploadFileModel, l4Var});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("arup-directory", uploadFileModel.mDestDir);
        hashMap.put("arup-file-name", uploadFileModel.mRemoteFileName);
        a aVar = new a(uploadFileModel, hashMap);
        long c = f.c(uploadFileModel.mLocalFilePath);
        long currentTimeMillis = System.currentTimeMillis();
        a(aVar.getFilePath(), aVar.getFileType(), c);
        this.d.uploadAsync(aVar, new b(aVar, currentTimeMillis, c, l4Var), null);
        return aVar;
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else {
            a(TrackLog.createSdkExceptionLog(str, str2, str3));
        }
    }

    @Override // com.alibaba.security.realidentity.k4
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (!(obj instanceof com.uploader.export.i)) {
        } else {
            this.d.cancelAsync((com.uploader.export.i) obj);
        }
    }
}
