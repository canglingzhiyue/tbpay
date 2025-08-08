package com.taobao.tao.common.ucp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.core.Constrant;
import com.taobao.android.upp.UppProtocolImpl;
import com.taobao.android.upp.e;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.util.HashSet;
import tb.kge;
import tb.ksk;
import tb.kss;
import tb.lbq;
import tb.oiy;
import tb.oqc;

/* loaded from: classes.dex */
public class UcpManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final JSONObject EMPTY;

    /* renamed from: a  reason: collision with root package name */
    private static HashSet<String> f19897a;
    private static UcpManager g;
    private a b = null;
    private long c = 0;
    private boolean d = false;
    private long e = 100;
    private JSONObject f = null;
    private Handler h = new Handler(Looper.getMainLooper()) { // from class: com.taobao.tao.common.ucp.UcpManager.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            UcpManager.a(UcpManager.this, FinishedType.valueOf(message.what), message.obj instanceof JSONObject ? (JSONObject) message.obj : UcpManager.a(UcpManager.this));
            UcpManager.a(UcpManager.this, (a) null);
        }
    };
    private e.a i = new e.a() { // from class: com.taobao.tao.common.ucp.UcpManager.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.upp.e.a
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            } else if (jSONObject == null || StringUtils.equals(e.UPP_DOWNGRADE, jSONObject.getString("code"))) {
                UcpManager.b(UcpManager.this).sendEmptyMessage(FinishedType.MODEL_FAILED.value());
            } else {
                Message obtain = Message.obtain();
                obtain.what = FinishedType.MODEL_SUCCESS.value();
                obtain.obj = jSONObject;
                UcpManager.b(UcpManager.this).sendMessage(obtain);
                UcpManager.a(UcpManager.this, jSONObject);
            }
        }
    };

    /* loaded from: classes8.dex */
    public enum FinishedType {
        UNKNOWN,
        NOT_OPEN,
        TIME_OUT,
        MODEL_FAILED,
        MODEL_SUCCESS,
        NOT_NEED;

        public static FinishedType valueOf(int i) {
            return i == NOT_OPEN.value() ? NOT_OPEN : i == TIME_OUT.value() ? TIME_OUT : i == MODEL_FAILED.value() ? MODEL_FAILED : i == MODEL_SUCCESS.value() ? MODEL_SUCCESS : i == NOT_NEED.value() ? NOT_NEED : UNKNOWN;
        }

        public int value() {
            return ordinal();
        }
    }

    /* loaded from: classes8.dex */
    public interface a {
        void a(FinishedType finishedType, JSONObject jSONObject);
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ JSONObject a(UcpManager ucpManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e2d0a3fb", new Object[]{ucpManager}) : ucpManager.f;
    }

    public static /* synthetic */ JSONObject a(UcpManager ucpManager, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("857ef495", new Object[]{ucpManager, jSONObject});
        }
        ucpManager.f = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ a a(UcpManager ucpManager, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f207e9b", new Object[]{ucpManager, aVar});
        }
        ucpManager.b = aVar;
        return aVar;
    }

    public static /* synthetic */ void a(UcpManager ucpManager, FinishedType finishedType, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("198883fe", new Object[]{ucpManager, finishedType, jSONObject});
        } else {
            ucpManager.a(finishedType, jSONObject);
        }
    }

    public static /* synthetic */ Handler b(UcpManager ucpManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b595ddaa", new Object[]{ucpManager}) : ucpManager.h;
    }

    public static /* synthetic */ void c(UcpManager ucpManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("717025d", new Object[]{ucpManager});
        } else {
            ucpManager.e();
        }
    }

    static {
        kge.a(-1198311044);
        EMPTY = new JSONObject();
        HashSet<String> hashSet = new HashSet<>();
        f19897a = hashSet;
        hashSet.add("editionSwitch");
        f19897a.add(LogContext.ENVENT_USERLOGIN);
        f19897a.add("scrollNextPage");
        g = new UcpManager();
    }

    public static UcpManager a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UcpManager) ipChange.ipc$dispatch("1e508ca1", new Object[0]) : g;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : f() && this.d;
    }

    public JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str});
        }
        if (b(str) && b()) {
            return this.f;
        }
        return null;
    }

    public boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66f35242", new Object[]{this, aVar})).booleanValue();
        }
        if (!b()) {
            this.h.sendEmptyMessage(FinishedType.NOT_OPEN.value());
            return false;
        }
        lbq b = oiy.a().b();
        if (b == null) {
            this.h.sendEmptyMessage(FinishedType.NOT_NEED.value());
            return false;
        }
        View rootView = b.getRootView();
        if (rootView == null) {
            this.h.sendEmptyMessage(FinishedType.NOT_NEED.value());
            return false;
        }
        rootView.post(new Runnable() { // from class: com.taobao.tao.common.ucp.UcpManager.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    UcpManager.c(UcpManager.this);
                }
            }
        });
        this.b = aVar;
        this.c = System.currentTimeMillis();
        return true;
    }

    public void c() {
        JSONObject h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (b() && (h = h()) != null) {
            lbq b = oiy.a().b();
            for (String str : h.keySet()) {
                JSONObject jSONObject = h.getJSONObject(str);
                if (jSONObject != null) {
                    UppProtocolImpl.getInstance().registerResourceSpace(kss.f30292a, b, str, jSONObject, (e.a) null);
                }
            }
            UppProtocolImpl.getInstance().registerUPPCallbackWithScene(kss.f30292a, b, this.i);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.d = g();
        this.e = j();
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : !f19897a.contains(str);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.h.sendEmptyMessage(FinishedType.NOT_NEED.value());
        }
    }

    private void a(FinishedType finishedType, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25f79b0b", new Object[]{this, finishedType, jSONObject});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(finishedType, jSONObject);
        }
        if (this.b == null && FinishedType.TIME_OUT == finishedType) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.c;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("status", (Object) (this.b == null ? "NotCallback" : "Callback"));
        jSONObject2.put(Constants.Monitor.EXECUTE_TIME, (Object) Long.valueOf(currentTimeMillis));
        jSONObject2.put(Constrant.KEY_TIME_OUT, (Object) Long.valueOf(this.e));
        kss.a("Page_Home", 19999, "ucp", "pageBackMonitor", finishedType.name(), jSONObject2);
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : i().getBooleanValue("enableUpp");
    }

    private JSONObject h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("fa36400f", new Object[]{this}) : i().getJSONObject("uppData");
    }

    private JSONObject i() {
        AwesomeGetContainerInnerData c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dde1390", new Object[]{this});
        }
        if (oqc.a().b() != null && (c = oqc.a().b().c(ksk.NEW_FACE_CHILD.f30287a)) != null && c.ext != null) {
            return c.ext;
        }
        return EMPTY;
    }

    private int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : i().getIntValue("pageBackWaitTime");
    }
}
