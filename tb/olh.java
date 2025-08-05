package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.wrapper.weex.AddressKinshipBridge;
import com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo;
import com.taobao.tao.log.TLog;
import com.taobao.tao.log.TLogNative;
import com.taobao.tao.log.f;
import com.taobao.tao.log.g;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tao.log.statistics.UploadStage;
import com.taobao.tao.log.utils.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class olh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALL_DONE = "ALL_DONE";

    /* renamed from: a */
    public jhg f32154a;
    public String b;
    public String c;
    public UploadTokenInfo[] d;
    public TLogEventHelper.UploadEventInfo e;
    private final Context f;
    private File i;
    private oli j;
    private int h = 0;
    private int k = 0;
    private int l = 0;
    private List<String> g = new ArrayList();

    static {
        kge.a(-2145217265);
    }

    public static /* synthetic */ void lambda$XGhjO44vjTvjj8WVegnLvEeo9mk(olh olhVar) {
        olhVar.c();
    }

    public static /* synthetic */ int a(olh olhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8210cc0", new Object[]{olhVar})).intValue();
        }
        int i = olhVar.h + 1;
        olhVar.h = i;
        return i;
    }

    public static /* synthetic */ int a(olh olhVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c00ffc9", new Object[]{olhVar, new Integer(i)})).intValue();
        }
        olhVar.h = i;
        return i;
    }

    public static /* synthetic */ void a(olh olhVar, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65a977f5", new Object[]{olhVar, str, str2, str3, str4});
        } else {
            olhVar.a(str, str2, str3, str4);
        }
    }

    public static /* synthetic */ void a(olh olhVar, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37ae6e7f", new Object[]{olhVar, str, str2, str3, str4, str5});
        } else {
            olhVar.a(str, str2, str3, str4, str5);
        }
    }

    public static /* synthetic */ int b(olh olhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e6a41341", new Object[]{olhVar})).intValue() : olhVar.h;
    }

    public static /* synthetic */ List c(olh olhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("3c1c0098", new Object[]{olhVar}) : olhVar.g;
    }

    public static /* synthetic */ void d(olh olhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3aa2050", new Object[]{olhVar});
        } else {
            olhVar.b();
        }
    }

    public static /* synthetic */ int e(olh olhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b22d26c4", new Object[]{olhVar})).intValue();
        }
        int i = olhVar.l;
        olhVar.l = i + 1;
        return i;
    }

    public olh(Context context) {
        this.f = context.getApplicationContext();
        oli f = f.a().f();
        if (f == null) {
            TLog.loge("LogFileUploadManager", "Tlog have not init or do not have uploader!");
            return;
        }
        try {
            this.j = (oli) f.getClass().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            this.j = f;
        }
    }

    private Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d2e5f268", new Object[]{this, str});
        }
        UploadTokenInfo[] uploadTokenInfoArr = this.d;
        if (uploadTokenInfoArr != null) {
            for (UploadTokenInfo uploadTokenInfo : uploadTokenInfoArr) {
                if (uploadTokenInfo.fileInfo != null && str.equals(uploadTokenInfo.fileInfo.absolutePath)) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, String> entry : uploadTokenInfo.entrySet()) {
                        hashMap.put(entry.getKey(), entry.getValue());
                    }
                    return hashMap;
                }
            }
        }
        a(str, null, ErrorCode.TOKEN_EMPTY.getValue(), "tokenNotFound");
        return null;
    }

    private String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        UploadTokenInfo[] uploadTokenInfoArr = this.d;
        if (uploadTokenInfoArr == null) {
            return null;
        }
        for (UploadTokenInfo uploadTokenInfo : uploadTokenInfoArr) {
            if (uploadTokenInfo.fileInfo != null && str.equals(uploadTokenInfo.fileInfo.absolutePath)) {
                return uploadTokenInfo.fileInfo.contentType;
            }
        }
        return null;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.g.size() > 0) {
            this.k = this.g.size();
            okn h = f.a().h();
            String str = oko.h;
            String str2 = this.f32154a.g;
            h.a(str, str2, "[UploadFile] Start to upload file. Count: " + this.k);
            if (TextUtils.isEmpty(this.f32154a.g)) {
                this.i = new File(com.taobao.tao.log.utils.a.c(), jhz.a());
            } else {
                this.i = new File(com.taobao.tao.log.utils.a.c(), this.f32154a.g);
            }
            TLogNative.appenderFlushData(true);
            this.h = 0;
            Collections.sort(this.g, new Comparator<String>() { // from class: tb.olh.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    olh.this = this;
                }

                @Override // java.util.Comparator
                public /* synthetic */ int compare(String str3, String str4) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, str3, str4})).intValue() : a(str3, str4);
                }

                public int a(String str3, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("d9378d6f", new Object[]{this, str3, str4})).intValue();
                    }
                    String str5 = f.a().e() + "_";
                    boolean contains = str3.contains(str5);
                    boolean contains2 = str4.contains(str5);
                    if (contains && !contains2) {
                        return -1;
                    }
                    if (!contains && contains2) {
                        return 1;
                    }
                    return (int) (new File(str4).lastModified() - new File(str3).lastModified());
                }
            });
            b();
        } else {
            String value = ErrorCode.UPLOAD_NO_FILE.getValue();
            TLogEventHelper.a(this.e, UploadStage.STAGE_UPLOAD, value, "errInfo", this.f32154a.g);
            f.a().h().b(oko.c, this.f32154a.g, "[LogFileUploadManager] Upload file list is null.");
            if (this.f32154a.j.equals("RDWP_APPLY_UPLOAD_TOKEN_REPLY")) {
                oky.a(this.f32154a, this.b, null, value, "[LogFileUploadManager] Upload file list is null.", null);
            } else {
                okr.a(this.f32154a, this.b, null, value, "[LogFileUploadManager] Upload file list is null.", null);
            }
            if (this.e.listener == null) {
                return;
            }
            this.e.listener.a("", value, "[LogFileUploadManager] Upload file list is null.");
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            d.a().a(new Runnable() { // from class: tb.-$$Lambda$olh$XGhjO44vjTvjj8WVegnLvEeo9mk
                @Override // java.lang.Runnable
                public final void run() {
                    olh.lambda$XGhjO44vjTvjj8WVegnLvEeo9mk(olh.this);
                }
            });
        }
    }

    public void c() {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.g.size() == 0) {
            f.a().h().a(oko.c, this.f32154a.g, String.format("[LogFileUploadManager] All files upload done! Total: %d, Success: %d", Integer.valueOf(this.k), Integer.valueOf(this.l)));
            TLogEventHelper.a(this.e, this.k, this.l);
            olf olfVar = this.e.listener;
            int i = this.k;
            if (i != this.l) {
                if (olfVar == null) {
                    return;
                }
                olfVar.a(ALL_DONE, String.valueOf(i), String.valueOf(this.l));
                return;
            }
            olg.b(this.f32154a.g);
            if (olfVar == null) {
                return;
            }
            olfVar.a(ALL_DONE, String.valueOf(this.k));
        } else {
            TLogEventHelper.a(this.e, this.f32154a.g);
            String str4 = this.g.get(0);
            if (!new File(str4).exists()) {
                this.k--;
                this.g.remove(0);
            } else if (this.j != null) {
                olm olmVar = new olm();
                olmVar.a(this.f32154a);
                olmVar.n = this.f;
                olmVar.o = f.a().n();
                if ((this.e.flag & 4) != 4) {
                    z = false;
                }
                String str5 = null;
                if (z) {
                    olmVar.p = null;
                } else {
                    olmVar.p = this.i.getAbsolutePath();
                }
                olmVar.r = b(str4);
                olmVar.q = c(str4);
                if (this.j.a().f32157a.equals("oss")) {
                    if (olmVar.r != null) {
                        str5 = olmVar.r.get("ossObjectKey");
                        str3 = olmVar.r.get(AddressKinshipBridge.InnerReceiver.KEY_AUS_OSSENDPOINT);
                    } else {
                        str3 = null;
                    }
                    if (olmVar.r != null && !olmVar.r.containsKey("ossBucketName")) {
                        olmVar.r.put("ossBucketName", f.a().f20688a);
                    }
                } else if (this.j.a().f32157a.equals("arup")) {
                    if (olmVar.r != null) {
                        str5 = olmVar.r.get("ossObjectKey");
                        str3 = olmVar.r.get(AddressKinshipBridge.InnerReceiver.KEY_AUS_OSSENDPOINT);
                    } else {
                        str3 = null;
                    }
                    if (olmVar.r != null && !olmVar.r.containsKey("ossBucketName")) {
                        olmVar.r.put("ossBucketName", f.a().f20688a);
                    }
                } else {
                    if (!this.j.a().f32157a.equals("ceph") || olmVar.r == null) {
                        str = null;
                        str2 = null;
                    } else {
                        str = olmVar.r.get("objectKey");
                        str2 = olmVar.r.get(AURASubmitEvent.RPC_ENDPOINT);
                    }
                    f.a().h().a(oko.h, this.f32154a.g, "[LogFileUploadManager] Call uploader to update...");
                    this.j.a(olmVar, str4, new a(str4, olmVar.q, str, str2));
                }
                str2 = str3;
                str = str5;
                f.a().h().a(oko.h, this.f32154a.g, "[LogFileUploadManager] Call uploader to update...");
                this.j.a(olmVar, str4, new a(str4, olmVar.q, str, str2));
            } else {
                String value = ErrorCode.NOT_IMPLEMENTED.getValue();
                f.a().h().b(oko.h, this.f32154a.g, "[LogFileUploadManager] Need file uploader");
                TLogEventHelper.a(this.e, this.f32154a.g, value, "[LogFileUploadManager] Need file uploader");
                if (this.e.listener != null) {
                    this.e.listener.a(str4, value, "[LogFileUploadManager] Need file uploader");
                }
                this.g.remove(0);
            }
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (this.g == null) {
            this.g = new ArrayList();
        }
        if (TextUtils.isEmpty(str) || this.g.contains(str)) {
            return;
        }
        this.g.add(str);
    }

    private void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[LogFileUploadManager] File upload failed: file=");
        String str5 = "-";
        sb.append(str == null ? str5 : str);
        sb.append(" error info=");
        sb.append(str4 == null ? str5 : str4);
        sb.append(" errCode=");
        if (str3 != null) {
            str5 = str3;
        }
        sb.append(str5);
        sb.append(" retryCount = ");
        sb.append(this.h);
        f.a().h().b(oko.h, this.f32154a.g, sb.toString());
        if (this.f32154a.j.equals("RDWP_APPLY_UPLOAD_TOKEN_REPLY")) {
            oky.a(this.f32154a, this.b, str, str3, str4, str2);
        } else {
            okr.a(this.f32154a, this.b, str, str3, str4, str2);
        }
        if (this.e.listener != null) {
            this.e.listener.a(str, str3, str4);
        }
        g.b(this.i);
    }

    private void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        okn h = f.a().h();
        String str6 = oko.h;
        String str7 = this.f32154a.g;
        h.a(str6, str7, "[LogFileUploadManager] File upload successfully: " + str);
        if (this.f32154a.j.equals("RDWP_APPLY_UPLOAD_TOKEN_REPLY")) {
            oky.a(this.f32154a, this.b, str, str3, str2, str4, str5);
        } else {
            okr.a(this.f32154a, this.b, str, str3, str2, str4, str5);
        }
        olf olfVar = this.e.listener;
        if (olfVar != null) {
            olfVar.a(str, str3);
        }
        g.b(this.i);
    }

    /* loaded from: classes8.dex */
    public class a extends olj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(90184186);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
            olh.this = r1;
        }

        @Override // tb.olf
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                return;
            }
            TLogEventHelper.a(olh.this.e, olh.this.f32154a.g, str2, str3);
            if (olh.a(olh.this) <= 3) {
                TLogEventHelper.b(olh.this.e, olh.this.f32154a.g);
                StringBuilder sb = new StringBuilder();
                sb.append("[LogFileUploadManager] File Upload failed on retry: file=");
                sb.append(this.b == null ? "-" : this.b);
                sb.append(" error info=");
                if (str3 == null) {
                    str3 = "-";
                }
                sb.append(str3);
                sb.append(" errCode=");
                if (str2 == null) {
                    str2 = "-";
                }
                sb.append(str2);
                sb.append(" retryCount = ");
                sb.append(olh.b(olh.this));
                f.a().h().b(oko.h, olh.this.f32154a.g, sb.toString());
            } else {
                olh.c(olh.this).remove(0);
                olh.a(olh.this, 0);
                olh.a(olh.this, this.b, this.c, str2, str3);
            }
            olh.d(olh.this);
        }

        @Override // tb.olf
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            olh.c(olh.this).remove(0);
            olh.a(olh.this, 0);
            olh.e(olh.this);
            TLogEventHelper.c(olh.this.e, olh.this.f32154a.g);
            olh.a(olh.this, this.b, this.c, str2, this.d, this.e);
            olh.d(olh.this);
        }
    }
}
