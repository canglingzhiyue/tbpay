package com.taobao.tbliveinteractive.jsbridge;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.JoinNotifyMessage;
import com.taobao.taolive.sdk.model.message.LiveInteractiveMessage;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.TBTVProgramMessage;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.pmd;
import tb.pnj;

/* loaded from: classes8.dex */
public class d implements com.taobao.taolive.sdk.core.d, d.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f22133a;
    private final String b;
    private com.taobao.alilive.aliliveframework.frame.a c;
    private com.taobao.tbliveinteractive.e d;
    private ArrayList<Integer> e = new ArrayList<>();

    static {
        kge.a(868877788);
        kge.a(-2101054629);
        kge.a(-393823935);
        f22133a = d.class.getSimpleName();
    }

    public d(String str, com.taobao.alilive.aliliveframework.frame.a aVar, com.taobao.tbliveinteractive.e eVar) {
        this.b = str;
        this.c = aVar;
        this.d = eVar;
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.c;
        if (aVar == null || aVar.f() == null) {
            return;
        }
        this.c.f().registerMessageListener(this, new MessageTypeFilter() { // from class: com.taobao.tbliveinteractive.jsbridge.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1036 || i == 102 || i == 1039 || i == 1055 || i == 18790;
            }
        });
        this.c.f().addPowerMessageInterceptor(this);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.e.contains(Integer.valueOf(i))) {
        } else {
            this.e.add(Integer.valueOf(i));
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (!this.e.contains(Integer.valueOf(i))) {
        } else {
            this.e.remove(i);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            c();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.c;
        if (aVar != null && aVar.f() != null) {
            this.c.f().unRegisterMessageListener(this);
            this.c.f().addPowerMessageInterceptor(null);
        }
        this.d = null;
    }

    @Override // com.taobao.taolive.sdk.core.c
    public void onMessageReceived(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
            return;
        }
        pmd.a().m().b(f22133a, "tblivedataservice onMessageReceived ----");
        if (i == 1036 && obj != null) {
            JSONObject jSONObject = null;
            String str = (String) obj;
            if (StringUtils.isEmpty(str)) {
                return;
            }
            try {
                jSONObject = new JSONObject((String) obj);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (jSONObject != null) {
                str = jSONObject.toString();
            }
            a("TBLiveWVPlugin.Event.message", str);
        } else if (i == 102) {
            if (!(obj instanceof JoinNotifyMessage)) {
                return;
            }
            JoinNotifyMessage joinNotifyMessage = (JoinNotifyMessage) obj;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("type", "joinMsg");
                jSONObject2.put("data", JSON.toJSONString(joinNotifyMessage));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            a("TBLiveWVPlugin.Event.message", jSONObject2.toString());
        } else if (i == 1039) {
            if (!(obj instanceof TBTVProgramMessage)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("type", "changeTBTVProgram");
                jSONObject3.put("data", JSON.toJSONString(obj));
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
            a("TBLiveWVPlugin.Event.message", jSONObject3.toString());
        } else if ((i != 18790 && i != 1055) || obj == null) {
        } else {
            LiveInteractiveMessage liveInteractiveMessage = (LiveInteractiveMessage) obj;
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("type", "taskInteractive");
                jSONObject4.put("data", liveInteractiveMessage.data);
            } catch (Exception unused) {
            }
            a("TBLiveWVPlugin.Event.message", jSONObject4.toString());
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        com.taobao.tbliveinteractive.e eVar = this.d;
        if (eVar == null) {
            return;
        }
        eVar.a(str, str2);
    }

    @Override // com.taobao.taolive.sdk.core.d
    public boolean onInterceptPowerMessage(TLiveMsg tLiveMsg) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ca817c1", new Object[]{this, tLiveMsg})).booleanValue();
        }
        ArrayList<Integer> arrayList = this.e;
        if (arrayList != null && arrayList.contains(Integer.valueOf(tLiveMsg.type))) {
            pnj m = pmd.a().m();
            String str2 = f22133a;
            m.b(str2, "onInterceptPowerMessage = " + JSON.toJSONString(tLiveMsg));
            switch (tLiveMsg.type) {
                case 10101:
                case 10103:
                case 10104:
                case 10105:
                    try {
                        str = JSON.toJSONString(tLiveMsg.data);
                        break;
                    } catch (Exception e) {
                        e.printStackTrace();
                        str = "";
                        break;
                    }
                case 10102:
                default:
                    str = new String(tLiveMsg.data);
                    break;
            }
            com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
            try {
                jSONObject.put("msgType", (Object) Integer.valueOf(tLiveMsg.type));
                jSONObject.put("data", (Object) str);
            } catch (Exception unused) {
            }
            com.taobao.tbliveinteractive.e eVar = this.d;
            if (eVar != null) {
                eVar.a("TBLiveWVPlugin.Event.powermessage", jSONObject.toString());
            }
        }
        return false;
    }
}
