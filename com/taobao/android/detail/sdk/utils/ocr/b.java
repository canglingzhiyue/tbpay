package com.taobao.android.detail.sdk.utils.ocr;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.request.MtopRequestListener;
import com.taobao.android.detail.sdk.utils.ocr.request.OCRMtopRequestClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKConfig;
import org.json.JSONObject;
import tb.ewt;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f10350a;
    private ArrayList<String> b;
    private HashMap<String, String> c;
    private com.taobao.android.detail.sdk.utils.ocr.request.a d;
    private MtopRequestListener<MtopResponse> e;
    private HashSet<ewt> f;

    static {
        kge.a(1381647292);
    }

    public static /* synthetic */ com.taobao.android.detail.sdk.utils.ocr.request.a a(b bVar, com.taobao.android.detail.sdk.utils.ocr.request.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.sdk.utils.ocr.request.a) ipChange.ipc$dispatch("bedfe4a8", new Object[]{bVar, aVar});
        }
        bVar.d = aVar;
        return aVar;
    }

    public static /* synthetic */ com.taobao.android.detail.sdk.utils.ocr.request.a a(b bVar, JSONObject jSONObject) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.sdk.utils.ocr.request.a) ipChange.ipc$dispatch("b59116b7", new Object[]{bVar, jSONObject}) : bVar.a(jSONObject);
    }

    public static /* synthetic */ HashSet a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashSet) ipChange.ipc$dispatch("5f4c7883", new Object[]{bVar}) : bVar.f;
    }

    public static /* synthetic */ HashMap b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("c97936e8", new Object[]{bVar}) : bVar.c;
    }

    public b(Context context) {
        a(context);
        tpc.a("com.taobao.android.detail.sdk.utils.ocr.OCRMananger");
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.f10350a = context;
        this.c = new HashMap<>();
        this.f = new HashSet<>();
        this.b = new ArrayList<>();
        this.e = new MtopRequestListener<MtopResponse>() { // from class: com.taobao.android.detail.sdk.utils.ocr.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.sdk.request.e
            public void a(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                } else if (mtopResponse == null) {
                } else {
                    new a().execute(mtopResponse);
                }
            }

            @Override // com.taobao.android.detail.sdk.request.e
            public void b(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("743cc56e", new Object[]{this, mtopResponse});
                } else if (b.a(b.this) == null) {
                } else {
                    Iterator it = b.a(b.this).iterator();
                    while (it.hasNext()) {
                        ((ewt) it.next()).a(mtopResponse);
                    }
                }
            }
        };
    }

    public void a(ewt ewtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7b10d96", new Object[]{this, ewtVar});
            return;
        }
        HashSet<ewt> hashSet = this.f;
        if (hashSet == null) {
            return;
        }
        hashSet.add(ewtVar);
    }

    public void a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
            return;
        }
        com.taobao.android.detail.sdk.utils.ocr.request.b bVar = new com.taobao.android.detail.sdk.utils.ocr.request.b();
        bVar.a(strArr);
        new OCRMtopRequestClient(bVar, SDKConfig.getInstance().getGlobalTtid(), this.e).execute();
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return "无文字或无法识别";
        }
        String str3 = this.c.get(str);
        return TextUtils.isEmpty(str3) ? !TextUtils.isEmpty(str2) ? str2 : "无文字或无法识别" : str3;
    }

    /* loaded from: classes4.dex */
    public class a extends AsyncTask<MtopResponse, Void, com.taobao.android.detail.sdk.utils.ocr.request.a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1988449196);
        }

        private a() {
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.android.detail.sdk.utils.ocr.request.a, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ com.taobao.android.detail.sdk.utils.ocr.request.a doInBackground(MtopResponse[] mtopResponseArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, mtopResponseArr}) : a(mtopResponseArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(com.taobao.android.detail.sdk.utils.ocr.request.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, aVar});
            } else {
                a(aVar);
            }
        }

        public com.taobao.android.detail.sdk.utils.ocr.request.a a(MtopResponse... mtopResponseArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.detail.sdk.utils.ocr.request.a) ipChange.ipc$dispatch("f679ad51", new Object[]{this, mtopResponseArr});
            }
            if (mtopResponseArr == null || mtopResponseArr[0] == null || mtopResponseArr[0].getDataJsonObject() == null) {
                return null;
            }
            try {
                return b.a(b.this, mtopResponseArr[0].getDataJsonObject());
            } catch (Exception e) {
                e.printStackTrace();
                Log.e("MyLog", "解析OCR结果失败");
                return null;
            }
        }

        public void a(com.taobao.android.detail.sdk.utils.ocr.request.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35979207", new Object[]{this, aVar});
                return;
            }
            b.a(b.this, aVar);
            if (aVar == null) {
                Log.e("OCRMananger", "解析失败 OCRBean == null");
                return;
            }
            if (aVar.a() != null) {
                b.b(b.this).putAll(aVar.a());
            }
            if (b.a(b.this) == null) {
                return;
            }
            Iterator it = b.a(b.this).iterator();
            while (it.hasNext()) {
                ((ewt) it.next()).a(b.b(b.this));
            }
        }
    }

    private com.taobao.android.detail.sdk.utils.ocr.request.a a(JSONObject jSONObject) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.sdk.utils.ocr.request.a) ipChange.ipc$dispatch("cc6d0af5", new Object[]{this, jSONObject}) : new com.taobao.android.detail.sdk.utils.ocr.request.a(jSONObject);
    }
}
