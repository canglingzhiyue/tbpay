package com.taobao.oversea.mytaobao;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.mytaobao.ultron.model.SecScreenBean;
import com.taobao.oversea.mytaobao.b;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.nde;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static b f18666a;
    private String b;
    private String c;
    private Map<String, String> d;

    /* renamed from: com.taobao.oversea.mytaobao.b$1 */
    /* loaded from: classes7.dex */
    public class AnonymousClass1 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ a f18667a;

        public AnonymousClass1(a aVar) {
            b.this = r1;
            this.f18667a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(b.a(b.this));
            mtopRequest.setVersion(b.b(b.this));
            mtopRequest.setData(JSON.toJSONString(b.c(b.this)));
            MtopBusiness mo1341setErrorNotifyAfterCache = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, Globals.getApplication(), TaoHelper.getTTID()), mtopRequest, TaoHelper.getTTID()).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.oversea.mytaobao.SecScreenLoadMoreManager$1$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else if (b.AnonymousClass1.this.f18667a == null) {
                    } else {
                        b.AnonymousClass1.this.f18667a.a(mtopResponse);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    JSONObject jSONObject;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    JSONObject jSONObject2 = ((JSONObject) JSON.parseObject(mtopResponse.getBytedata(), JSONObject.class, new Feature[0])).getJSONObject("data").getJSONObject("global");
                    if (jSONObject2 != null && jSONObject2.size() > 0 && jSONObject2.containsKey(nde.ECHO) && (jSONObject = jSONObject2.getJSONObject(nde.ECHO)) != null) {
                        b.c(b.this).put(nde.ECHO, jSONObject.toJSONString());
                    }
                    if (b.AnonymousClass1.this.f18667a == null) {
                        return;
                    }
                    b.AnonymousClass1.this.f18667a.a(mtopResponse, baseOutDo);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else if (b.AnonymousClass1.this.f18667a == null) {
                    } else {
                        b.AnonymousClass1.this.f18667a.a(mtopResponse);
                    }
                }
            }).mo1341setErrorNotifyAfterCache(false);
            mo1341setErrorNotifyAfterCache.mo1305reqMethod(MethodEnum.POST);
            mo1341setErrorNotifyAfterCache.startRequest();
        }
    }

    /* loaded from: classes7.dex */
    public interface a {
        void a(MtopResponse mtopResponse);

        void a(MtopResponse mtopResponse, BaseOutDo baseOutDo);
    }

    public static /* synthetic */ String a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("762de79b", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ String b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("368991c", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ Map c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b997c558", new Object[]{bVar}) : bVar.d;
    }

    private b() {
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c1424a25", new Object[0]);
        }
        if (f18666a == null) {
            synchronized (b.class) {
                if (f18666a == null) {
                    f18666a = new b();
                }
            }
        }
        return f18666a;
    }

    public void a(SecScreenBean secScreenBean, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0cc353", new Object[]{this, secScreenBean, str});
            return;
        }
        this.b = secScreenBean.apiName;
        this.c = secScreenBean.apiVersion;
        this.d = secScreenBean.data;
        this.d.put(nde.ECHO, str);
        if (!"true".equals(secScreenBean.data.get("canLoadMore"))) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("canLoadMore", (Object) "true");
        this.d.put("bizParams", jSONObject.toJSONString());
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc6ce88", new Object[]{this, aVar});
        } else if (TextUtils.isEmpty(this.b) || aVar == null) {
        } else {
            Coordinator.execute(new AnonymousClass1(aVar));
        }
    }
}
