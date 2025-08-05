package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.d;
import com.uploader.export.e;
import com.uploader.export.g;
import com.uploader.export.i;
import com.uploader.export.j;
import com.uploader.export.l;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.upload.domain.UploadConstants;

/* loaded from: classes7.dex */
public class kfz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(kfy kfyVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c08a6b", new Object[]{kfyVar, dVar});
            return;
        }
        String str = "start upload, " + kfyVar.toString();
        g a2 = l.a();
        if (a2 == null) {
            Log.e("CodeTrack_Data_Uploader", "UploaderCreator.get() == null,  make sure \"arup\" dependency added");
        } else {
            a2.uploadAsync(new a(kfyVar), new b(dVar), null);
        }
    }

    /* loaded from: classes7.dex */
    public static class a implements i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final kfy f30047a;

        @Override // com.uploader.export.i
        public String getFileType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("105a7e2d", new Object[]{this}) : "log";
        }

        public a(kfy kfyVar) {
            this.f30047a = kfyVar;
        }

        @Override // com.uploader.export.i
        public String getBizType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this}) : this.f30047a.a();
        }

        @Override // com.uploader.export.i
        public String getFilePath() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this}) : this.f30047a.b();
        }

        @Override // com.uploader.export.i
        public Map<String, String> getMetaInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("8d01c005", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put(UploadConstants.FILE_NAME, this.f30047a.d());
            hashMap.put("path", this.f30047a.c());
            return hashMap;
        }
    }

    /* loaded from: classes7.dex */
    public static class b implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final d f30048a;

        public b(d dVar) {
            this.f30048a = dVar;
        }

        @Override // com.uploader.export.d
        public void onWait(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1be90445", new Object[]{this, iVar});
            } else {
                this.f30048a.onWait(iVar);
            }
        }

        @Override // com.uploader.export.d
        public void onStart(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93ee4d16", new Object[]{this, iVar});
            } else {
                this.f30048a.onStart(iVar);
            }
        }

        @Override // com.uploader.export.d
        public void onResume(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc5b564d", new Object[]{this, iVar});
            } else {
                this.f30048a.onResume(iVar);
            }
        }

        @Override // com.uploader.export.d
        public void onPause(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88a48f02", new Object[]{this, iVar});
            } else {
                this.f30048a.onPause(iVar);
            }
        }

        @Override // com.uploader.export.d
        public void onSuccess(i iVar, e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0ea4aef", new Object[]{this, iVar, eVar});
                return;
            }
            Log.e("CodeTrack_Data_Uploader", "onSuccess");
            this.f30048a.onSuccess(iVar, eVar);
        }

        @Override // com.uploader.export.d
        public void onFailure(i iVar, j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b751f291", new Object[]{this, iVar, jVar});
                return;
            }
            Log.e("CodeTrack_Data_Uploader", "onFailure, errorCode: " + jVar.f24058a + ", errorInfo:" + jVar.c);
            this.f30048a.onFailure(iVar, jVar);
        }

        @Override // com.uploader.export.d
        public void onCancel(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("227e67e0", new Object[]{this, iVar});
            } else {
                this.f30048a.onCancel(iVar);
            }
        }

        @Override // com.uploader.export.d
        public void onProgress(i iVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43b04c96", new Object[]{this, iVar, new Integer(i)});
                return;
            }
            String str = "onProgress " + String.valueOf(i);
            this.f30048a.onProgress(iVar, i);
        }
    }
}
